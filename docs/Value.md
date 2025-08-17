

# Value

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Integer](Integer.md)
* [Object](Object.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Value;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;
import org.bsc.langgraph4j.langsmith.gen.model.Object;

public class Example {
    public static void main(String[] args) {
        Value exampleValue = new Value();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Value to BigDecimal
        exampleValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleValue.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Value to Integer
        exampleValue.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleValue.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set Value to Object
        exampleValue.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleValue.getActualInstance();
    }
}
```


