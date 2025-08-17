

# ModelPriceMapCreateSchemaCompletionCostDetailsValue

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.ModelPriceMapCreateSchemaCompletionCostDetailsValue;
import org.bsc.langgraph4j.langsmith.gen.model.BigDecimal;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        ModelPriceMapCreateSchemaCompletionCostDetailsValue exampleModelPriceMapCreateSchemaCompletionCostDetailsValue = new ModelPriceMapCreateSchemaCompletionCostDetailsValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set ModelPriceMapCreateSchemaCompletionCostDetailsValue to BigDecimal
        exampleModelPriceMapCreateSchemaCompletionCostDetailsValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleModelPriceMapCreateSchemaCompletionCostDetailsValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ModelPriceMapCreateSchemaCompletionCostDetailsValue to String
        exampleModelPriceMapCreateSchemaCompletionCostDetailsValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleModelPriceMapCreateSchemaCompletionCostDetailsValue.getActualInstance();
    }
}
```


