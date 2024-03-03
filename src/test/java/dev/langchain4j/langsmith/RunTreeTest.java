package dev.langchain4j.langsmith;

import dev.langchain4j.langsmith.gen.model.Inputs;
import dev.langchain4j.langsmith.gen.model.Outputs;
import dev.langchain4j.langsmith.gen.model.RunTypeEnum;
import lombok.extern.java.Log;
import lombok.val;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import static java.util.Collections.singletonList;

@Log
public class RunTreeTest {

    public static void main(String[] args) throws Exception {

        val parentRunConfig = RunTree.getDefaultConfig()
                .name("My Chat Bot")
                .runType(RunTypeEnum.CHAIN)
                .inputs(Inputs.builder()
                        .data("text", "Summarize this morning's meetings.")
                        .build())
                .serialized(new Object())
                .build();

        val parentRun = new RunTree(parentRunConfig);


        parentRun.postRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        val childLlmRunConfig = RunTree.getDefaultConfig()
                .name("My Proprietary LLM")
                .runType(RunTypeEnum.LLM)
                .inputs(Inputs.builder()
                        .data("prompts", singletonList("You are an AI Assistant. The time is XYZ." +
                                " Summarize this morning's meetings."))
                        .build())
                .serialized(new Object())
                .build();
        val childLlmRun = parentRun.createChild(childLlmRunConfig);

        childLlmRun.postRun().exceptionally(e -> {
                    log.severe("Failed to post parent run: " + e.getMessage());
                    return null;
                })
                .get(2, TimeUnit.SECONDS);

        childLlmRun.end(
                Outputs.builder().data("generation", singletonList(
                                "I should use the transcript_loader tool" +
                                        " to fetch meeting_transcripts from XYZ"))
                        .build());


        childLlmRun.patchRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        val childToolRunConfig = RunTree.getDefaultConfig()
                .name("transcript_loader")
                .runType(RunTypeEnum.TOOL)
                .inputs(Inputs.builder()
                        .data("date", "XYZ")
                        .data("content_type", "meeting_transcripts")
                        .build())
                .build();

        val childToolRun = parentRun.createChild(childToolRunConfig);

        childToolRun.postRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        childToolRun.end(
                Outputs.builder()
                        .data("meetings", Collections.singletonList("Meeting1 notes.."))
                        .build());

        childToolRun.patchRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        val childChainRunConfig = RunTree.getDefaultConfig()
                .name("Unreliable Component")
                .runType(RunTypeEnum.TOOL)
                .inputs(Inputs.builder()
                        .data("input", "Summarize these notes...")
                        .build())
                .build();

        val childChainRun = parentRun.createChild(childChainRunConfig);

        childChainRun.postRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        childChainRun.end(
                Outputs.builder()
                        .data("error", "error executed tool!")
                        .build());

        childChainRun.patchRun().get(2, TimeUnit.SECONDS);

        parentRun.end(
                Outputs.builder()
                        .data("output", Collections.singletonList("The meeting notes are as follows:..."))
                        .build());


        parentRun.patchRun().exceptionally(e -> {
            log.severe("Failed to post parent run: " + e.getMessage());
            return null;
        }).get(2, TimeUnit.SECONDS);

        System.exit(0);
    }

}
