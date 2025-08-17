

# PromptCost

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.PromptCost;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        PromptCost examplePromptCost = new PromptCost();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set PromptCost to BigDecimal
        examplePromptCost.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) examplePromptCost.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PromptCost to String
        examplePromptCost.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePromptCost.getActualInstance();
    }
}
```


