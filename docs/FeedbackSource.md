

# FeedbackSource

## anyOf schemas
* [APIFeedbackSource](APIFeedbackSource.md)
* [AppFeedbackSource](AppFeedbackSource.md)
* [AutoEvalFeedbackSource](AutoEvalFeedbackSource.md)
* [ModelFeedbackSource](ModelFeedbackSource.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.FeedbackSource;
import org.bsc.langgraph4j.langsmith.gen.model.APIFeedbackSource;
import org.bsc.langgraph4j.langsmith.gen.model.AppFeedbackSource;
import org.bsc.langgraph4j.langsmith.gen.model.AutoEvalFeedbackSource;
import org.bsc.langgraph4j.langsmith.gen.model.ModelFeedbackSource;

public class Example {
    public static void main(String[] args) {
        FeedbackSource exampleFeedbackSource = new FeedbackSource();

        // create a new APIFeedbackSource
        APIFeedbackSource exampleAPIFeedbackSource = new APIFeedbackSource();
        // set FeedbackSource to APIFeedbackSource
        exampleFeedbackSource.setActualInstance(exampleAPIFeedbackSource);
        // to get back the APIFeedbackSource set earlier
        APIFeedbackSource testAPIFeedbackSource = (APIFeedbackSource) exampleFeedbackSource.getActualInstance();

        // create a new AppFeedbackSource
        AppFeedbackSource exampleAppFeedbackSource = new AppFeedbackSource();
        // set FeedbackSource to AppFeedbackSource
        exampleFeedbackSource.setActualInstance(exampleAppFeedbackSource);
        // to get back the AppFeedbackSource set earlier
        AppFeedbackSource testAppFeedbackSource = (AppFeedbackSource) exampleFeedbackSource.getActualInstance();

        // create a new AutoEvalFeedbackSource
        AutoEvalFeedbackSource exampleAutoEvalFeedbackSource = new AutoEvalFeedbackSource();
        // set FeedbackSource to AutoEvalFeedbackSource
        exampleFeedbackSource.setActualInstance(exampleAutoEvalFeedbackSource);
        // to get back the AutoEvalFeedbackSource set earlier
        AutoEvalFeedbackSource testAutoEvalFeedbackSource = (AutoEvalFeedbackSource) exampleFeedbackSource.getActualInstance();

        // create a new ModelFeedbackSource
        ModelFeedbackSource exampleModelFeedbackSource = new ModelFeedbackSource();
        // set FeedbackSource to ModelFeedbackSource
        exampleFeedbackSource.setActualInstance(exampleModelFeedbackSource);
        // to get back the ModelFeedbackSource set earlier
        ModelFeedbackSource testModelFeedbackSource = (ModelFeedbackSource) exampleFeedbackSource.getActualInstance();
    }
}
```


