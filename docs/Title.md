

# Title

## anyOf schemas
* [Missing](Missing.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Title;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Title exampleTitle = new Title();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Title to Missing
        exampleTitle.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleTitle.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Title to String
        exampleTitle.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTitle.getActualInstance();
    }
}
```


