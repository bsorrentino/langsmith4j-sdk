

# Score

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [Integer](Integer.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Score;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.Boolean;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;

public class Example {
    public static void main(String[] args) {
        Score exampleScore = new Score();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set Score to BigDecimal
        exampleScore.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleScore.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set Score to Boolean
        exampleScore.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleScore.getActualInstance();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Score to Integer
        exampleScore.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleScore.getActualInstance();
    }
}
```


