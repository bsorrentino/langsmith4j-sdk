

# TenantShareTokensResponseEntitiesInner

## oneOf schemas
* [TenantShareDatasetToken](TenantShareDatasetToken.md)
* [TenantShareRunToken](TenantShareRunToken.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.TenantShareTokensResponseEntitiesInner;
import org.bsc.langgraph4j.langsmith.gen.model.TenantShareDatasetToken;
import org.bsc.langgraph4j.langsmith.gen.model.TenantShareRunToken;

public class Example {
    public static void main(String[] args) {
        TenantShareTokensResponseEntitiesInner exampleTenantShareTokensResponseEntitiesInner = new TenantShareTokensResponseEntitiesInner();

        // create a new TenantShareDatasetToken
        TenantShareDatasetToken exampleTenantShareDatasetToken = new TenantShareDatasetToken();
        // set TenantShareTokensResponseEntitiesInner to TenantShareDatasetToken
        exampleTenantShareTokensResponseEntitiesInner.setActualInstance(exampleTenantShareDatasetToken);
        // to get back the TenantShareDatasetToken set earlier
        TenantShareDatasetToken testTenantShareDatasetToken = (TenantShareDatasetToken) exampleTenantShareTokensResponseEntitiesInner.getActualInstance();

        // create a new TenantShareRunToken
        TenantShareRunToken exampleTenantShareRunToken = new TenantShareRunToken();
        // set TenantShareTokensResponseEntitiesInner to TenantShareRunToken
        exampleTenantShareTokensResponseEntitiesInner.setActualInstance(exampleTenantShareRunToken);
        // to get back the TenantShareRunToken set earlier
        TenantShareRunToken testTenantShareRunToken = (TenantShareRunToken) exampleTenantShareTokensResponseEntitiesInner.getActualInstance();
    }
}
```


