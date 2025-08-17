

# InputsSchemaDefinition

## anyOf schemas
* [Missing](Missing.md)
* [Object](Object.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.InputsSchemaDefinition;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.Object;

public class Example {
    public static void main(String[] args) {
        InputsSchemaDefinition exampleInputsSchemaDefinition = new InputsSchemaDefinition();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set InputsSchemaDefinition to Missing
        exampleInputsSchemaDefinition.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleInputsSchemaDefinition.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set InputsSchemaDefinition to Object
        exampleInputsSchemaDefinition.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleInputsSchemaDefinition.getActualInstance();
    }
}
```


