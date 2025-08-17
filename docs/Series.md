

# Series

## anyOf schemas
* [List<CustomChartSeriesUpdate>](List<CustomChartSeriesUpdate>.md)
* [Missing](Missing.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Series;
import org.bsc.langgraph4j.langsmith.gen.model.List<CustomChartSeriesUpdate>;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        Series exampleSeries = new Series();

        // create a new List<CustomChartSeriesUpdate>
        List<CustomChartSeriesUpdate> exampleList<CustomChartSeriesUpdate> = new List<CustomChartSeriesUpdate>();
        // set Series to List<CustomChartSeriesUpdate>
        exampleSeries.setActualInstance(exampleList<CustomChartSeriesUpdate>);
        // to get back the List<CustomChartSeriesUpdate> set earlier
        List<CustomChartSeriesUpdate> testList<CustomChartSeriesUpdate> = (List<CustomChartSeriesUpdate>) exampleSeries.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Series to Missing
        exampleSeries.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleSeries.getActualInstance();
    }
}
```


