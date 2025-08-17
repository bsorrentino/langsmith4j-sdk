

# Index

## anyOf schemas
* [Integer](Integer.md)
* [Missing](Missing.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Index;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        Index exampleIndex = new Index();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Index to Integer
        exampleIndex.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleIndex.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Index to Missing
        exampleIndex.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleIndex.getActualInstance();
    }
}
```


