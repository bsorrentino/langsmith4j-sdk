

# Transformations

## anyOf schemas
* [List<DatasetTransformation>](List<DatasetTransformation>.md)
* [Missing](Missing.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Transformations;
import org.bsc.langgraph4j.langsmith.gen.model.List<DatasetTransformation>;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        Transformations exampleTransformations = new Transformations();

        // create a new List<DatasetTransformation>
        List<DatasetTransformation> exampleList<DatasetTransformation> = new List<DatasetTransformation>();
        // set Transformations to List<DatasetTransformation>
        exampleTransformations.setActualInstance(exampleList<DatasetTransformation>);
        // to get back the List<DatasetTransformation> set earlier
        List<DatasetTransformation> testList<DatasetTransformation> = (List<DatasetTransformation>) exampleTransformations.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Transformations to Missing
        exampleTransformations.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleTransformations.getActualInstance();
    }
}
```


