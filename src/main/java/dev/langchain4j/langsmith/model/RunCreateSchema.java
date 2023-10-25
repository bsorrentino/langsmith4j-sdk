/*
 * LangSmith
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.langchain4j.langsmith.model;

import java.util.*;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import dev.langchain4j.langsmith.model.RunTypeEnum;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Create class for a Run object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-24T16:07:41.765433+02:00[Europe/Rome]")
public class RunCreateSchema {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Inputs inputs;

  public static final String SERIALIZED_NAME_RUN_TYPE = "run_type";
  @SerializedName(SERIALIZED_NAME_RUN_TYPE)
  private RunTypeEnum runType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String,Object> extra;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_EXECUTION_ORDER = "execution_order";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ORDER)
  private Integer executionOrder = 1;

  public static final String SERIALIZED_NAME_SERIALIZED = "serialized";
  @SerializedName(SERIALIZED_NAME_SERIALIZED)
  private Object serialized;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Object outputs;

  public static final String SERIALIZED_NAME_PARENT_RUN_ID = "parent_run_id";
  @SerializedName(SERIALIZED_NAME_PARENT_RUN_ID)
  private UUID parentRunId;

  public static final String SERIALIZED_NAME_MANIFEST_ID = "manifest_id";
  @SerializedName(SERIALIZED_NAME_MANIFEST_ID)
  private UUID manifestId;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<Object> events;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private UUID sessionId;

  public static final String SERIALIZED_NAME_SESSION_NAME = "session_name";
  @SerializedName(SERIALIZED_NAME_SESSION_NAME)
  private String sessionName;

  public static final String SERIALIZED_NAME_CHILD_RUNS = "child_runs";
  @SerializedName(SERIALIZED_NAME_CHILD_RUNS)
  private List<RunCreateSchema> childRuns;

  public static final String SERIALIZED_NAME_REFERENCE_EXAMPLE_ID = "reference_example_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_EXAMPLE_ID)
  private UUID referenceExampleId;

  public RunCreateSchema() {
  }

  public RunCreateSchema name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunCreateSchema inputs(Inputs inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable

  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }

  public RunCreateSchema runType(RunTypeEnum runType) {
    this.runType = runType;
    return this;
  }

   /**
   * Get runType
   * @return runType
  **/
  @javax.annotation.Nonnull
  public RunTypeEnum getRunType() {
    return runType;
  }

  public void setRunType(RunTypeEnum runType) {
    this.runType = runType;
  }

  public RunCreateSchema startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public RunCreateSchema endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public RunCreateSchema extra(Map<String,Object> extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  public Object getExtra() {
    return extra;
  }

  public void setExtra(Map<String,Object> extra) {
    this.extra = extra;
  }

  public RunCreateSchema error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RunCreateSchema executionOrder(Integer executionOrder) {
    
    this.executionOrder = executionOrder;
    return this;
  }

   /**
   * Get executionOrder
   * minimum: 1
   * @return executionOrder
  **/
  @javax.annotation.Nullable
  public Integer getExecutionOrder() {
    return executionOrder;
  }


  public void setExecutionOrder(Integer executionOrder) {
    this.executionOrder = executionOrder;
  }


  public RunCreateSchema serialized(Object serialized) {
    
    this.serialized = serialized;
    return this;
  }

   /**
   * Get serialized
   * @return serialized
  **/
  @javax.annotation.Nullable
  public Object getSerialized() {
    return serialized;
  }


  public void setSerialized(Object serialized) {
    this.serialized = serialized;
  }


  public RunCreateSchema outputs(Object outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  public Object getOutputs() {
    return outputs;
  }


  public void setOutputs(Object outputs) {
    this.outputs = outputs;
  }


  public RunCreateSchema parentRunId(UUID parentRunId) {
    
    this.parentRunId = parentRunId;
    return this;
  }

   /**
   * Get parentRunId
   * @return parentRunId
  **/
  @javax.annotation.Nullable
  public UUID getParentRunId() {
    return parentRunId;
  }


  public void setParentRunId(UUID parentRunId) {
    this.parentRunId = parentRunId;
  }


  public RunCreateSchema manifestId(UUID manifestId) {
    
    this.manifestId = manifestId;
    return this;
  }

   /**
   * Get manifestId
   * @return manifestId
  **/
  @javax.annotation.Nullable
  public UUID getManifestId() {
    return manifestId;
  }


  public void setManifestId(UUID manifestId) {
    this.manifestId = manifestId;
  }


  public RunCreateSchema events(List<Object> events) {
    
    this.events = events;
    return this;
  }

  public RunCreateSchema addEventsItem(Object eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<Object> getEvents() {
    return events;
  }


  public void setEvents(List<Object> events) {
    this.events = events;
  }


  public RunCreateSchema tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RunCreateSchema addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public RunCreateSchema id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public RunCreateSchema sessionId(UUID sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  public UUID getSessionId() {
    return sessionId;
  }


  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public RunCreateSchema sessionName(String sessionName) {
    
    this.sessionName = sessionName;
    return this;
  }

   /**
   * Get sessionName
   * @return sessionName
  **/
  @javax.annotation.Nullable
  public String getSessionName() {
    return sessionName;
  }


  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }


  public RunCreateSchema childRuns(List<RunCreateSchema> childRuns) {
    
    this.childRuns = childRuns;
    return this;
  }

  public RunCreateSchema addChildRunsItem(RunCreateSchema childRunsItem) {
    if (this.childRuns == null) {
      this.childRuns = new ArrayList<>();
    }
    this.childRuns.add(childRunsItem);
    return this;
  }

   /**
   * Get childRuns
   * @return childRuns
  **/
  @javax.annotation.Nullable
  public List<RunCreateSchema> getChildRuns() {
    return childRuns;
  }


  public void setChildRuns(List<RunCreateSchema> childRuns) {
    this.childRuns = childRuns;
  }


  public RunCreateSchema referenceExampleId(UUID referenceExampleId) {
    
    this.referenceExampleId = referenceExampleId;
    return this;
  }

   /**
   * Get referenceExampleId
   * @return referenceExampleId
  **/
  @javax.annotation.Nullable
  public UUID getReferenceExampleId() {
    return referenceExampleId;
  }


  public void setReferenceExampleId(UUID referenceExampleId) {
    this.referenceExampleId = referenceExampleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunCreateSchema runCreateSchema = (RunCreateSchema) o;
    return Objects.equals(this.name, runCreateSchema.name) &&
        Objects.equals(this.inputs, runCreateSchema.inputs) &&
        Objects.equals(this.runType, runCreateSchema.runType) &&
        Objects.equals(this.startTime, runCreateSchema.startTime) &&
        Objects.equals(this.endTime, runCreateSchema.endTime) &&
        Objects.equals(this.extra, runCreateSchema.extra) &&
        Objects.equals(this.error, runCreateSchema.error) &&
        Objects.equals(this.executionOrder, runCreateSchema.executionOrder) &&
        Objects.equals(this.serialized, runCreateSchema.serialized) &&
        Objects.equals(this.outputs, runCreateSchema.outputs) &&
        Objects.equals(this.parentRunId, runCreateSchema.parentRunId) &&
        Objects.equals(this.manifestId, runCreateSchema.manifestId) &&
        Objects.equals(this.events, runCreateSchema.events) &&
        Objects.equals(this.tags, runCreateSchema.tags) &&
        Objects.equals(this.id, runCreateSchema.id) &&
        Objects.equals(this.sessionId, runCreateSchema.sessionId) &&
        Objects.equals(this.sessionName, runCreateSchema.sessionName) &&
        Objects.equals(this.childRuns, runCreateSchema.childRuns) &&
        Objects.equals(this.referenceExampleId, runCreateSchema.referenceExampleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inputs, runType, startTime, endTime, extra, error, executionOrder, serialized, outputs, parentRunId, manifestId, events, tags, id, sessionId, sessionName, childRuns, referenceExampleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunCreateSchema {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
    sb.append("    serialized: ").append(toIndentedString(serialized)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    parentRunId: ").append(toIndentedString(parentRunId)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    childRuns: ").append(toIndentedString(childRuns)).append("\n");
    sb.append("    referenceExampleId: ").append(toIndentedString(referenceExampleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

