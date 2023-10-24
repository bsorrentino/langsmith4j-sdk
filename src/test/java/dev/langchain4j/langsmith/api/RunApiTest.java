package dev.langchain4j.langsmith.api;

import dev.langchain4j.langsmith.ApiClient;
import dev.langchain4j.langsmith.model.HTTPValidationError;
import dev.langchain4j.langsmith.model.RunCreateSchemaExtended;
import dev.langchain4j.langsmith.model.RunUpdateSchemaExtended;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RunApi
 */
public class RunApiTest {

    private RunApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RunApi.class);
    }

    /**
     * Create Run
     *
     * Create a new run.
     */
    @Test
    public void createRunRunsPostTest() {
        RunCreateSchemaExtended runCreateSchemaExtended = null;
        // Object response = api.createRunRunsPost(runCreateSchemaExtended);

        // TODO: test validations
    }
    /**
     * Update Run
     *
     * Update a run.
     */
    @Test
    public void updateRunRunsRunIdPatchTest() {
        UUID runId = null;
        RunUpdateSchemaExtended runUpdateSchemaExtended = null;
        // Object response = api.updateRunRunsRunIdPatch(runId, runUpdateSchemaExtended);

        // TODO: test validations
    }
}
