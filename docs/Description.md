

# Description

## anyOf schemas
* [Missing](Missing.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Description;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Description exampleDescription = new Description();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Description to Missing
        exampleDescription.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleDescription.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Description to String
        exampleDescription.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleDescription.getActualInstance();
    }
}
```


