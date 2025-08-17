

# ChartType

## anyOf schemas
* [CustomChartType](CustomChartType.md)
* [Missing](Missing.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.ChartType;
import org.bsc.langgraph4j.langsmith.gen.model.CustomChartType;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        ChartType exampleChartType = new ChartType();

        // create a new CustomChartType
        CustomChartType exampleCustomChartType = new CustomChartType();
        // set ChartType to CustomChartType
        exampleChartType.setActualInstance(exampleCustomChartType);
        // to get back the CustomChartType set earlier
        CustomChartType testCustomChartType = (CustomChartType) exampleChartType.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set ChartType to Missing
        exampleChartType.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleChartType.getActualInstance();
    }
}
```


