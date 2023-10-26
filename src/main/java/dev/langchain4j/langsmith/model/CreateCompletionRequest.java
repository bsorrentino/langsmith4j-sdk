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

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateCompletionRequest
 */
@Value
@Builder
public class CreateCompletionRequest {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  String model;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  String prompt;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  String suffix;

  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  Integer maxTokens;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  BigDecimal temperature;

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  BigDecimal topP;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  Integer n;

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  Boolean stream;

  public static final String SERIALIZED_NAME_LOGPROBS = "logprobs";
  @SerializedName(SERIALIZED_NAME_LOGPROBS)
  Integer logprobs;

  public static final String SERIALIZED_NAME_ECHO = "echo";
  @SerializedName(SERIALIZED_NAME_ECHO)
  Boolean echo;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  List<String> stop;

  public static final String SERIALIZED_NAME_PRESENCE_PENALTY = "presence_penalty";
  @SerializedName(SERIALIZED_NAME_PRESENCE_PENALTY)
  BigDecimal presencePenalty;

  public static final String SERIALIZED_NAME_FREQUENCY_PENALTY = "frequency_penalty";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_PENALTY)
  BigDecimal frequencyPenalty;

  public static final String SERIALIZED_NAME_BEST_OF = "best_of";
  @SerializedName(SERIALIZED_NAME_BEST_OF)
  Integer bestOf;

  public static final String SERIALIZED_NAME_LOGIT_BIAS = "logit_bias";
  @SerializedName(SERIALIZED_NAME_LOGIT_BIAS)
  Map<String, Integer> logitBias = new HashMap<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  String user;

  
}

