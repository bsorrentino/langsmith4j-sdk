

# Id1

## anyOf schemas
* [String](String.md)
* [UUID](UUID.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Id1;
import org.bsc.langgraph4j.langsmith.gen.model.String;
import org.bsc.langgraph4j.langsmith.gen.model.UUID;

public class Example {
    public static void main(String[] args) {
        Id1 exampleId1 = new Id1();

        // create a new String
        String exampleString = new String();
        // set Id1 to String
        exampleId1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleId1.getActualInstance();

        // create a new UUID
        UUID exampleUUID = new UUID();
        // set Id1 to UUID
        exampleId1.setActualInstance(exampleUUID);
        // to get back the UUID set earlier
        UUID testUUID = (UUID) exampleId1.getActualInstance();
    }
}
```


