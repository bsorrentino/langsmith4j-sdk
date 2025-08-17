

# BodyCloneDatasetApiV1DatasetsClonePostAsOf

Only modifications made on or before this time are included. If None, the latest version of the dataset is used.

## anyOf schemas
* [OffsetDateTime](OffsetDateTime.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.bsc.langgraph4j.langsmith.gen.model.BodyCloneDatasetApiV1DatasetsClonePostAsOf;
import org.bsc.langgraph4j.langsmith.gen.model.OffsetDateTime;
import org.bsc.langgraph4j.langsmith.gen.model.String;

public class Example {
    public static void main(String[] args) {
        BodyCloneDatasetApiV1DatasetsClonePostAsOf exampleBodyCloneDatasetApiV1DatasetsClonePostAsOf = new BodyCloneDatasetApiV1DatasetsClonePostAsOf();

        // create a new OffsetDateTime
        OffsetDateTime exampleOffsetDateTime = new OffsetDateTime();
        // set BodyCloneDatasetApiV1DatasetsClonePostAsOf to OffsetDateTime
        exampleBodyCloneDatasetApiV1DatasetsClonePostAsOf.setActualInstance(exampleOffsetDateTime);
        // to get back the OffsetDateTime set earlier
        OffsetDateTime testOffsetDateTime = (OffsetDateTime) exampleBodyCloneDatasetApiV1DatasetsClonePostAsOf.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set BodyCloneDatasetApiV1DatasetsClonePostAsOf to String
        exampleBodyCloneDatasetApiV1DatasetsClonePostAsOf.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleBodyCloneDatasetApiV1DatasetsClonePostAsOf.getActualInstance();
    }
}
```


