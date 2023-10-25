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
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Create class for a Run object.
 */
@Value
@NonFinal
@Builder
public class RunCreateSchema {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  String name;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  Inputs inputs;

  public static final String SERIALIZED_NAME_RUN_TYPE = "run_type";
  @SerializedName(SERIALIZED_NAME_RUN_TYPE)
  RunTypeEnum runType;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  Map<String,Object> extra;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  String error;

  public static final String SERIALIZED_NAME_EXECUTION_ORDER = "execution_order";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ORDER)
  Integer executionOrder = 1;

  public static final String SERIALIZED_NAME_SERIALIZED = "serialized";
  @SerializedName(SERIALIZED_NAME_SERIALIZED)
  Object serialized;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  Outputs outputs;

  public static final String SERIALIZED_NAME_PARENT_RUN_ID = "parent_run_id";
  @SerializedName(SERIALIZED_NAME_PARENT_RUN_ID)
  UUID parentRunId;

  public static final String SERIALIZED_NAME_MANIFEST_ID = "manifest_id";
  @SerializedName(SERIALIZED_NAME_MANIFEST_ID)
  UUID manifestId;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  List<Object> events;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  List<String> tags;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  UUID id;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  UUID sessionId;

  public static final String SERIALIZED_NAME_SESSION_NAME = "session_name";
  @SerializedName(SERIALIZED_NAME_SESSION_NAME)
  String sessionName;

  public static final String SERIALIZED_NAME_CHILD_RUNS = "child_runs";
  @SerializedName(SERIALIZED_NAME_CHILD_RUNS)
  List<? extends RunCreateSchema> childRuns;

  public static final String SERIALIZED_NAME_REFERENCE_EXAMPLE_ID = "reference_example_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_EXAMPLE_ID)
  UUID referenceExampleId;

}

