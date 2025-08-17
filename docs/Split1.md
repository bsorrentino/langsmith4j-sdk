

# Split1

## anyOf schemas
* [List<String>](List<String>.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Split1;
import org.bsc.langgraph4j.langsmith.gen.model.List<String>;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Split1 exampleSplit1 = new Split1();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set Split1 to List<String>
        exampleSplit1.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleSplit1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Split1 to String
        exampleSplit1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSplit1.getActualInstance();
    }
}
```


