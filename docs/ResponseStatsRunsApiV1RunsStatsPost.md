

# ResponseStatsRunsApiV1RunsStatsPost

## anyOf schemas
* [Map<String, RunStats>](Map<String, RunStats>.md)
* [RunStats](RunStats.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.ResponseStatsRunsApiV1RunsStatsPost;
import org.bsc.langgraph4j.langsmith.gen.model.Map<String, RunStats>;
import org.bsc.langgraph4j.langsmith.gen.model.RunStats;

public class Example {
    public static void main(String[] args) {
        ResponseStatsRunsApiV1RunsStatsPost exampleResponseStatsRunsApiV1RunsStatsPost = new ResponseStatsRunsApiV1RunsStatsPost();

        // create a new Map<String, RunStats>
        Map<String, RunStats> exampleMap<String, RunStats> = new Map<String, RunStats>();
        // set ResponseStatsRunsApiV1RunsStatsPost to Map<String, RunStats>
        exampleResponseStatsRunsApiV1RunsStatsPost.setActualInstance(exampleMap<String, RunStats>);
        // to get back the Map<String, RunStats> set earlier
        Map<String, RunStats> testMap<String, RunStats> = (Map<String, RunStats>) exampleResponseStatsRunsApiV1RunsStatsPost.getActualInstance();

        // create a new RunStats
        RunStats exampleRunStats = new RunStats();
        // set ResponseStatsRunsApiV1RunsStatsPost to RunStats
        exampleResponseStatsRunsApiV1RunsStatsPost.setActualInstance(exampleRunStats);
        // to get back the RunStats set earlier
        RunStats testRunStats = (RunStats) exampleResponseStatsRunsApiV1RunsStatsPost.getActualInstance();
    }
}
```


