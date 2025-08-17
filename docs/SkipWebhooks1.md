

# SkipWebhooks1

## anyOf schemas
* [Boolean](Boolean.md)
* [List<UUID>](List<UUID>.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.SkipWebhooks1;
import org.bsc.langgraph4j.langsmith.gen.model.Boolean;
import org.bsc.langgraph4j.langsmith.gen.model.List<UUID>;

public class Example {
    public static void main(String[] args) {
        SkipWebhooks1 exampleSkipWebhooks1 = new SkipWebhooks1();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set SkipWebhooks1 to Boolean
        exampleSkipWebhooks1.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleSkipWebhooks1.getActualInstance();

        // create a new List<UUID>
        List<UUID> exampleList<UUID> = new List<UUID>();
        // set SkipWebhooks1 to List<UUID>
        exampleSkipWebhooks1.setActualInstance(exampleList<UUID>);
        // to get back the List<UUID> set earlier
        List<UUID> testList<UUID> = (List<UUID>) exampleSkipWebhooks1.getActualInstance();
    }
}
```


