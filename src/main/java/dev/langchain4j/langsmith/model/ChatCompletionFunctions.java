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

/**
 * ChatCompletionFunctions
 */
@Value
@Builder
public class ChatCompletionFunctions {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  String name = "";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  String description = "";

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  ChatCompletionFunctionParameters parameters;

}

