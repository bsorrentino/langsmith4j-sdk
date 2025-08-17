

# Description1

## anyOf schemas
* [Missing](Missing.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Description1;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Description1 exampleDescription1 = new Description1();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Description1 to Missing
        exampleDescription1.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleDescription1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Description1 to String
        exampleDescription1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleDescription1.getActualInstance();
    }
}
```


