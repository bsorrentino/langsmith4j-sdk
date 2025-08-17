

# CommonFilters

## anyOf schemas
* [CustomChartSeriesFilters](CustomChartSeriesFilters.md)
* [Missing](Missing.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.CommonFilters;
import org.bsc.langgraph4j.langsmith.gen.model.CustomChartSeriesFilters;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        CommonFilters exampleCommonFilters = new CommonFilters();

        // create a new CustomChartSeriesFilters
        CustomChartSeriesFilters exampleCustomChartSeriesFilters = new CustomChartSeriesFilters();
        // set CommonFilters to CustomChartSeriesFilters
        exampleCommonFilters.setActualInstance(exampleCustomChartSeriesFilters);
        // to get back the CustomChartSeriesFilters set earlier
        CustomChartSeriesFilters testCustomChartSeriesFilters = (CustomChartSeriesFilters) exampleCommonFilters.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set CommonFilters to Missing
        exampleCommonFilters.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleCommonFilters.getActualInstance();
    }
}
```


