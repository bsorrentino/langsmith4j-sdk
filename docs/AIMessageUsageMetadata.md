

# AIMessageUsageMetadata

## anyOf schemas
* [UsageMetadata](UsageMetadata.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.AIMessageUsageMetadata;
import org.bsc.langgraph4j.langsmith.gen.model.UsageMetadata;

public class Example {
    public static void main(String[] args) {
        AIMessageUsageMetadata exampleAIMessageUsageMetadata = new AIMessageUsageMetadata();

        // create a new UsageMetadata
        UsageMetadata exampleUsageMetadata = new UsageMetadata();
        // set AIMessageUsageMetadata to UsageMetadata
        exampleAIMessageUsageMetadata.setActualInstance(exampleUsageMetadata);
        // to get back the UsageMetadata set earlier
        UsageMetadata testUsageMetadata = (UsageMetadata) exampleAIMessageUsageMetadata.getActualInstance();
    }
}
```


