

# Examples

## anyOf schemas
* [List<ExampleWithRuns>](List<ExampleWithRuns>.md)
* [List<ExampleWithRunsCH>](List<ExampleWithRunsCH>.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Examples;
import org.bsc.langgraph4j.langsmith.gen.model.List<ExampleWithRuns>;
import org.bsc.langgraph4j.langsmith.gen.model.List<ExampleWithRunsCH>;

public class Example {
    public static void main(String[] args) {
        Examples exampleExamples = new Examples();

        // create a new List<ExampleWithRuns>
        List<ExampleWithRuns> exampleList<ExampleWithRuns> = new List<ExampleWithRuns>();
        // set Examples to List<ExampleWithRuns>
        exampleExamples.setActualInstance(exampleList<ExampleWithRuns>);
        // to get back the List<ExampleWithRuns> set earlier
        List<ExampleWithRuns> testList<ExampleWithRuns> = (List<ExampleWithRuns>) exampleExamples.getActualInstance();

        // create a new List<ExampleWithRunsCH>
        List<ExampleWithRunsCH> exampleList<ExampleWithRunsCH> = new List<ExampleWithRunsCH>();
        // set Examples to List<ExampleWithRunsCH>
        exampleExamples.setActualInstance(exampleList<ExampleWithRunsCH>);
        // to get back the List<ExampleWithRunsCH> set earlier
        List<ExampleWithRunsCH> testList<ExampleWithRunsCH> = (List<ExampleWithRunsCH>) exampleExamples.getActualInstance();
    }
}
```


