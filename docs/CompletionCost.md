

# CompletionCost

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.CompletionCost;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        CompletionCost exampleCompletionCost = new CompletionCost();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set CompletionCost to BigDecimal
        exampleCompletionCost.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleCompletionCost.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set CompletionCost to String
        exampleCompletionCost.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCompletionCost.getActualInstance();
    }
}
```


