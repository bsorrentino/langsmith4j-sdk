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


package dev.langchain4j.langsmith.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import dev.langchain4j.langsmith.gen.model.ChatCompletionFunctionCall;
import java.io.IOException;

/**
 * ChatCompletionResponseMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T20:48:56.174344+01:00[Europe/Rome]")
public class ChatCompletionResponseMessage {
  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role = "";

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_FUNCTION_CALL = "function_call";
  @SerializedName(SERIALIZED_NAME_FUNCTION_CALL)
  private ChatCompletionFunctionCall functionCall;

  public ChatCompletionResponseMessage() {
  }

  public ChatCompletionResponseMessage role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public ChatCompletionResponseMessage content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ChatCompletionResponseMessage functionCall(ChatCompletionFunctionCall functionCall) {
    
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  @javax.annotation.Nullable

  public ChatCompletionFunctionCall getFunctionCall() {
    return functionCall;
  }


  public void setFunctionCall(ChatCompletionFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionResponseMessage chatCompletionResponseMessage = (ChatCompletionResponseMessage) o;
    return Objects.equals(this.role, chatCompletionResponseMessage.role) &&
        Objects.equals(this.content, chatCompletionResponseMessage.content) &&
        Objects.equals(this.functionCall, chatCompletionResponseMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionResponseMessage {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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

