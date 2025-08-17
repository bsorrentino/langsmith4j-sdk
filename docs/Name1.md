

# Name1

## anyOf schemas
* [Missing](Missing.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Name1;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Name1 exampleName1 = new Name1();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Name1 to Missing
        exampleName1.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleName1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Name1 to String
        exampleName1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleName1.getActualInstance();
    }
}
```


