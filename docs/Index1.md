

# Index1

## anyOf schemas
* [Integer](Integer.md)
* [Missing](Missing.md)

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.Index1;
import org.bsc.langgraph4j.langsmith.gen.model.Integer;
import org.bsc.langgraph4j.langsmith.gen.model.Missing;

public class Example {
    public static void main(String[] args) {
        Index1 exampleIndex1 = new Index1();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Index1 to Integer
        exampleIndex1.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleIndex1.getActualInstance();

        // create a new Missing
        Missing exampleMissing = new Missing();
        // set Index1 to Missing
        exampleIndex1.setActualInstance(exampleMissing);
        // to get back the Missing set earlier
        Missing testMissing = (Missing) exampleIndex1.getActualInstance();
    }
}
```


