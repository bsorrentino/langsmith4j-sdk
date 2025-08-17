

# CursorsValue

## anyOf schemas
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.CursorsValue;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        CursorsValue exampleCursorsValue = new CursorsValue();

        // create a new String
        String exampleString = new String();
        // set CursorsValue to String
        exampleCursorsValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCursorsValue.getActualInstance();
    }
}
```


