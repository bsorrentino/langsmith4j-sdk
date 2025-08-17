

# Id

## anyOf schemas
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Id;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Id exampleId = new Id();

        // create a new String
        String exampleString = new String();
        // set Id to String
        exampleId.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleId.getActualInstance();
    }
}
```


