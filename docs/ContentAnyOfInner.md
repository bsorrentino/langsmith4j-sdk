

# ContentAnyOfInner

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.ContentAnyOfInner;
import org.bsc.langgraph4j.langsmith.gen.model.Object;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        ContentAnyOfInner exampleContentAnyOfInner = new ContentAnyOfInner();

        // create a new Object
        Object exampleObject = new Object();
        // set ContentAnyOfInner to Object
        exampleContentAnyOfInner.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleContentAnyOfInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ContentAnyOfInner to String
        exampleContentAnyOfInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleContentAnyOfInner.getActualInstance();
    }
}
```


