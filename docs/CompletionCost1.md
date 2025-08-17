

# CompletionCost1

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.CompletionCost1;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        CompletionCost1 exampleCompletionCost1 = new CompletionCost1();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set CompletionCost1 to BigDecimal
        exampleCompletionCost1.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleCompletionCost1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set CompletionCost1 to String
        exampleCompletionCost1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCompletionCost1.getActualInstance();
    }
}
```


