

# ModelPriceMapCreateSchemaPromptCostDetailsValue

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.ModelPriceMapCreateSchemaPromptCostDetailsValue;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        ModelPriceMapCreateSchemaPromptCostDetailsValue exampleModelPriceMapCreateSchemaPromptCostDetailsValue = new ModelPriceMapCreateSchemaPromptCostDetailsValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set ModelPriceMapCreateSchemaPromptCostDetailsValue to BigDecimal
        exampleModelPriceMapCreateSchemaPromptCostDetailsValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleModelPriceMapCreateSchemaPromptCostDetailsValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ModelPriceMapCreateSchemaPromptCostDetailsValue to String
        exampleModelPriceMapCreateSchemaPromptCostDetailsValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleModelPriceMapCreateSchemaPromptCostDetailsValue.getActualInstance();
    }
}
```


