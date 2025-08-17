

# Content

## anyOf schemas
* [List<ContentAnyOfInner>](List<ContentAnyOfInner>.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Content;
import org.bsc.langgraph4j.langsmith.gen.model.List<ContentAnyOfInner>;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        Content exampleContent = new Content();

        // create a new List<ContentAnyOfInner>
        List<ContentAnyOfInner> exampleList<ContentAnyOfInner> = new List<ContentAnyOfInner>();
        // set Content to List<ContentAnyOfInner>
        exampleContent.setActualInstance(exampleList<ContentAnyOfInner>);
        // to get back the List<ContentAnyOfInner> set earlier
        List<ContentAnyOfInner> testList<ContentAnyOfInner> = (List<ContentAnyOfInner>) exampleContent.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Content to String
        exampleContent.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleContent.getActualInstance();
    }
}
```


