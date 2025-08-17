

# OutputsSchemaDefinition

## anyOf schemas
* [Missing](Missing.md)
* [Object](Object.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.OutputsSchemaDefinition;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.Object;

public class Example {
    public static void main(String[] args) {
        OutputsSchemaDefinition exampleOutputsSchemaDefinition = new OutputsSchemaDefinition();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set OutputsSchemaDefinition to Missing
        exampleOutputsSchemaDefinition.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleOutputsSchemaDefinition.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set OutputsSchemaDefinition to Object
        exampleOutputsSchemaDefinition.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleOutputsSchemaDefinition.getActualInstance();
    }
}
```


