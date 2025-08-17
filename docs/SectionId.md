

# SectionId

## anyOf schemas
* [Missing](Missing.md)
* [UUID](UUID.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.SectionId;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.UUID;

public class Example {
    public static void main(String[] args) {
        SectionId exampleSectionId = new SectionId();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set SectionId to Missing
        exampleSectionId.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleSectionId.getActualInstance();

        // create a new UUID
        UUID exampleUUID = new UUID();
        // set SectionId to UUID
        exampleSectionId.setActualInstance(exampleUUID);
        // to get back the UUID set earlier
        UUID testUUID = (UUID) exampleSectionId.getActualInstance();
    }
}
```


