

# SkipWebhooks

## anyOf schemas
* [Boolean](Boolean.md)
* [List<UUID>](List<UUID>.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.SkipWebhooks;
import org.bsc.langgraph4j.langsmith.gen.model.Boolean;
import org.bsc.langgraph4j.langsmith.gen.model.List<UUID>;

public class Example {
    public static void main(String[] args) {
        SkipWebhooks exampleSkipWebhooks = new SkipWebhooks();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set SkipWebhooks to Boolean
        exampleSkipWebhooks.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleSkipWebhooks.getActualInstance();

        // create a new List<UUID>
        List<UUID> exampleList<UUID> = new List<UUID>();
        // set SkipWebhooks to List<UUID>
        exampleSkipWebhooks.setActualInstance(exampleList<UUID>);
        // to get back the List<UUID> set earlier
        List<UUID> testList<UUID> = (List<UUID>) exampleSkipWebhooks.getActualInstance();
    }
}
```


