# langsmith4j-sdk

Java version of [langsmith] API designed for [langchain4j] integration.

## Log traces using a RunTree.

The example below is a replica of the official [langchain-sdk javascript sample][langsmith-trace-sample]
```java
val parentRunConfig = RunTree.getDefaultConfig()
    .name("My Chat Bot")
    .runType( RunTypeEnum.CHAIN )
    .inputs( Inputs.builder()
    .data("text", "Summarize this morning's meetings.")
    .build() )
    .serialized( new Object() )
    .build()
    ;

val parentRun = new RunTree(parentRunConfig);

parentRun.postRun().get( 2, TimeUnit.SECONDS);

val childLlmRunConfig = RunTree.getDefaultConfig()
        .name("My Proprietary LLM")
        .runType( RunTypeEnum.LLM )
        .inputs( Inputs.builder()
                .data( "prompts", singletonList("You are an AI Assistant. The time is XYZ." +
                        " Summarize this morning's meetings.") )
                .build() )
        .serialized( new Object() )
        .build()
        ;
val childLlmRun = parentRun.createChild( childLlmRunConfig );

childLlmRun.postRun()
                .get( 2, TimeUnit.SECONDS);

childLlmRun.end(
        Outputs.builder().data( "generation", singletonList(
                        "I should use the transcript_loader tool" +
                                " to fetch meeting_transcripts from XYZ" ))
                .build());


childLlmRun.patchRun().get( 2, TimeUnit.SECONDS);

val childToolRunConfig = RunTree.getDefaultConfig()
        .name("transcript_loader")
        .runType( RunTypeEnum.TOOL )
        .inputs( Inputs.builder()
                .data( "date", "XYZ")
                .data( "content_type", "meeting_transcripts")
                .build() )
        .build()
        ;

val childToolRun = parentRun.createChild(childToolRunConfig);

childToolRun.postRun().get( 2, TimeUnit.SECONDS);

childToolRun.end(
        Outputs.builder()
                .data( "meetings", Collections.singletonList("Meeting1 notes.."))
                .build() );

childToolRun.patchRun().get( 2, TimeUnit.SECONDS);

val childChainRunConfig = RunTree.getDefaultConfig()
        .name("Unreliable Component")
        .runType( RunTypeEnum.TOOL )
        .inputs( Inputs.builder()
                .data( "input", "Summarize these notes...")
                .build())
        .build();

val childChainRun = parentRun.createChild(childChainRunConfig);

childChainRun.postRun().get( 2, TimeUnit.SECONDS);

childChainRun.end(
        Outputs.builder()
                .data( "error", "error executed tool!" )
                .build());

childChainRun.patchRun().get( 2, TimeUnit.SECONDS);

parentRun.end(
        Outputs.builder()
                .data( "output", Collections.singletonList("The meeting notes are as follows:...") )
                .build());


parentRun.patchRun().get( 2, TimeUnit.SECONDS);
```

[langchain4j]: https://github.com/langchain/langchain4j
[langsmith]: https://docs.smith.langchain.com
[langsmith-trace-sample]: https://github.com/langchain-ai/langsmith-sdk/blob/main/js/README.md#logging-traces-outside-langchain