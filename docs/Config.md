

# Config

## anyOf schemas
* [DemoConfig](DemoConfig.md)
* [PromptimConfig](PromptimConfig.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Config;
import org.bsc.langgraph4j.langsmith.gen.model.DemoConfig;
import org.bsc.langgraph4j.langsmith.gen.model.PromptimConfig;

public class Example {
    public static void main(String[] args) {
        Config exampleConfig = new Config();

        // create a new DemoConfig
        DemoConfig exampleDemoConfig = new DemoConfig();
        // set Config to DemoConfig
        exampleConfig.setActualInstance(exampleDemoConfig);
        // to get back the DemoConfig set earlier
        DemoConfig testDemoConfig = (DemoConfig) exampleConfig.getActualInstance();

        // create a new PromptimConfig
        PromptimConfig examplePromptimConfig = new PromptimConfig();
        // set Config to PromptimConfig
        exampleConfig.setActualInstance(examplePromptimConfig);
        // to get back the PromptimConfig set earlier
        PromptimConfig testPromptimConfig = (PromptimConfig) exampleConfig.getActualInstance();
    }
}
```


