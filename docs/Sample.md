

# Sample

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Integer](Integer.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Sample;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;

public class Example {
    public static void main(String[] args) {
        Sample exampleSample = new Sample();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Sample to BigDecimal
        exampleSample.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleSample.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Sample to Integer
        exampleSample.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleSample.getActualInstance();
    }
}
```


