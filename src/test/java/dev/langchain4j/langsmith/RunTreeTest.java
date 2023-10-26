package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.model.Inputs;
import dev.langchain4j.langsmith.model.Outputs;
import dev.langchain4j.langsmith.model.RunTypeEnum;
import lombok.extern.java.Log;
import lombok.val;

import java.util.concurrent.TimeUnit;

import static java.util.Collections.singletonList;

@Log
public class RunTreeTest {

    public static void main( String [] args ) throws Exception {

        val parentRunConfig = RunTree.getDefaultConfig()
                .name("My Chat Bot")
                .runType( RunTypeEnum.CHAIN )
                .inputs( Inputs.builder()
                        .text("Summarize this morning's meetings.")
                        .build() )
                .serialized( new Object() )
                ;

        val parentRun = new RunTree(parentRunConfig);


        parentRun.postRun(true).get( 2, TimeUnit.SECONDS);

        val childLlmRunConfig = RunTree.getDefaultConfig()
                .name("My Proprietary LLM")
                .runType( RunTypeEnum.LLM )
                .inputs( Inputs.builder()
                        .prompts(singletonList("You are an AI Assistant. The time is XYZ." +
                                " Summarize this morning's meetings."))
                        .build() )
                .serialized( new Object() )
                .build()
                ;
        val childLlmRun = parentRun.createChild( childLlmRunConfig );

        childLlmRun.postRun(true)
                        .get( 2, TimeUnit.SECONDS);

        childLlmRun.end(
                Outputs.builder().generation( singletonList(
                                "I should use the transcript_loader tool" +
                                        " to fetch meeting_transcripts from XYZ" ))
                        .build());


        childLlmRun.patchRun().get( 2, TimeUnit.SECONDS);

        val childToolRunConfig = RunTree.getDefaultConfig()
                .name("transcript_loader")
                .runType( RunTypeEnum.TOOL )
                .inputs( Inputs.builder()
                        .prompts(singletonList("You are an AI Assistant. The time is XYZ." +
                                " Summarize this morning's meetings."))
                        .build() )
                .serialized( new Object() )
                .build()
                ;

        val childToolRun = parentRun.createChild(childToolRunConfig);

        // childToolRun.postRun(true).get( 2, TimeUnit.SECONDS);
        /*
        var childToolRun = parentRun.createChild({
                name: "transcript_loader",
                run_type: "tool",
                inputs: {
            date: "XYZ",
                    content_type: "meeting_transcripts",
        },
});

         */

        System.exit(0);
    }

}
