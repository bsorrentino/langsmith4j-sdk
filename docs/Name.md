

# Name

## anyOf schemas
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Name;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Name exampleName = new Name();

        // create a new String
        String exampleString = new String();
        // set Name to String
        exampleName.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleName.getActualInstance();
    }
}
```


