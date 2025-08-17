

# Name2

## anyOf schemas
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Name2;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Name2 exampleName2 = new Name2();

        // create a new String
        String exampleString = new String();
        // set Name2 to String
        exampleName2.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleName2.getActualInstance();
    }
}
```


