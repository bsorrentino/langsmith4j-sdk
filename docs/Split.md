

# Split

## anyOf schemas
* [List<String>](List<String>.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Split;
import org.bsc.langgraph4j.langsmith.gen.model.List<String>;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Split exampleSplit = new Split();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set Split to List<String>
        exampleSplit.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleSplit.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Split to String
        exampleSplit.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSplit.getActualInstance();
    }
}
```


