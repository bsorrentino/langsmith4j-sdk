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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Logprobs
 */
@Value
@Builder
public class Logprobs {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  List<String> tokens = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_LOGPROBS = "token_logprobs";
  @SerializedName(SERIALIZED_NAME_TOKEN_LOGPROBS)
  List<BigDecimal> tokenLogprobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_LOGPROBS = "top_logprobs";
  @SerializedName(SERIALIZED_NAME_TOP_LOGPROBS)
  List<Map<String, Integer>> topLogprobs = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT_OFFSET = "text_offset";
  @SerializedName(SERIALIZED_NAME_TEXT_OFFSET)
  List<Integer> textOffset = new ArrayList<>();


}

