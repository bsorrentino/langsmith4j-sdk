

# Value1

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [Integer](Integer.md)
* [Object](Object.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Value1;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.Boolean;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;
import org.bsc.langgraph4j.langsmith.gen.model.Object;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Value1 exampleValue1 = new Value1();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Value1 to BigDecimal
        exampleValue1.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleValue1.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set Value1 to Boolean
        exampleValue1.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleValue1.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Value1 to Integer
        exampleValue1.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleValue1.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set Value1 to Object
        exampleValue1.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleValue1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Value1 to String
        exampleValue1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleValue1.getActualInstance();
    }
}
```


