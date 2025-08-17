

# Metadata

## anyOf schemas
* [Missing](Missing.md)
* [Object](Object.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Metadata;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.Object;

public class Example {
    public static void main(String[] args) {
        Metadata exampleMetadata = new Metadata();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Metadata to Missing
        exampleMetadata.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleMetadata.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set Metadata to Object
        exampleMetadata.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleMetadata.getActualInstance();
    }
}
```


