

# Value2

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [Integer](Integer.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Value2;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.Boolean;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Value2 exampleValue2 = new Value2();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Value2 to BigDecimal
        exampleValue2.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleValue2.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set Value2 to Boolean
        exampleValue2.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleValue2.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Value2 to Integer
        exampleValue2.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleValue2.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Value2 to String
        exampleValue2.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleValue2.getActualInstance();
    }
}
```


