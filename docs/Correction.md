

# Correction

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Correction;
import org.bsc.langgraph4j.langsmith.gen.model.Object;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Correction exampleCorrection = new Correction();

        // create a new Object
        Object exampleObject = new Object();
        // set Correction to Object
        exampleCorrection.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleCorrection.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Correction to String
        exampleCorrection.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCorrection.getActualInstance();
    }
}
```


