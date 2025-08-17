

# AsOf

Only modifications made on or before this time are included. If None, the latest version of the dataset is used.

## anyOf schemas
* [OffsetDateTime](OffsetDateTime.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.AsOf;
import org.bsc.langgraph4j.langsmith.gen.model.OffsetDateTime;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        AsOf exampleAsOf = new AsOf();

        // create a new OffsetDateTime
        OffsetDateTime exampleOffsetDateTime = new OffsetDateTime();
        // set AsOf to OffsetDateTime
        exampleAsOf.setActualInstance(exampleOffsetDateTime);
        // to get back the OffsetDateTime set earlier
        OffsetDateTime testOffsetDateTime = (OffsetDateTime) exampleAsOf.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set AsOf to String
        exampleAsOf.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAsOf.getActualInstance();
    }
}
```


