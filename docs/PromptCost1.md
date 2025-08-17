

# PromptCost1

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.PromptCost1;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        PromptCost1 examplePromptCost1 = new PromptCost1();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set PromptCost1 to BigDecimal
        examplePromptCost1.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) examplePromptCost1.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PromptCost1 to String
        examplePromptCost1.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePromptCost1.getActualInstance();
    }
}
```


