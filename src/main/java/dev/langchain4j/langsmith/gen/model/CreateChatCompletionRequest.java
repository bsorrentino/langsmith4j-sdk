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
import dev.langchain4j.langsmith.gen.model.ChatCompletionFunctions;
import dev.langchain4j.langsmith.gen.model.ChatCompletionRequestMessage;
import dev.langchain4j.langsmith.gen.model.Stop;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateChatCompletionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T20:48:56.174344+01:00[Europe/Rome]")
public class CreateChatCompletionRequest {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model = "";

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_FUNCTIONS = "functions";
  @SerializedName(SERIALIZED_NAME_FUNCTIONS)
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature;

  public static final String SERIALIZED_NAME_TOP_P = "top_p";
  @SerializedName(SERIALIZED_NAME_TOP_P)
  private BigDecimal topP;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private Integer n;

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private Boolean stream;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private Stop stop;

  public static final String SERIALIZED_NAME_MAX_TOKENS = "max_tokens";
  @SerializedName(SERIALIZED_NAME_MAX_TOKENS)
  private Integer maxTokens;

  public static final String SERIALIZED_NAME_PRESENCE_PENALTY = "presence_penalty";
  @SerializedName(SERIALIZED_NAME_PRESENCE_PENALTY)
  private BigDecimal presencePenalty;

  public static final String SERIALIZED_NAME_FREQUENCY_PENALTY = "frequency_penalty";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_PENALTY)
  private BigDecimal frequencyPenalty;

  public static final String SERIALIZED_NAME_LOGIT_BIAS = "logit_bias";
  @SerializedName(SERIALIZED_NAME_LOGIT_BIAS)
  private Map<String, Integer> logitBias = new HashMap<>();

  public CreateChatCompletionRequest() {
  }

  public CreateChatCompletionRequest model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
    
    this.messages = messages;
    return this;
  }

  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable

  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }


  public CreateChatCompletionRequest functions(List<ChatCompletionFunctions> functions) {
    
    this.functions = functions;
    return this;
  }

  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * Get functions
   * @return functions
  **/
  @javax.annotation.Nullable

  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }


  public void setFunctions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
  }


  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * Get temperature
   * @return temperature
  **/
  @javax.annotation.Nullable

  public BigDecimal getTemperature() {
    return temperature;
  }


  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public CreateChatCompletionRequest topP(BigDecimal topP) {
    
    this.topP = topP;
    return this;
  }

   /**
   * Get topP
   * @return topP
  **/
  @javax.annotation.Nullable

  public BigDecimal getTopP() {
    return topP;
  }


  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  public CreateChatCompletionRequest n(Integer n) {
    
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @javax.annotation.Nullable

  public Integer getN() {
    return n;
  }


  public void setN(Integer n) {
    this.n = n;
  }


  public CreateChatCompletionRequest stream(Boolean stream) {
    
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @javax.annotation.Nullable

  public Boolean getStream() {
    return stream;
  }


  public void setStream(Boolean stream) {
    this.stream = stream;
  }


  public CreateChatCompletionRequest stop(Stop stop) {
    
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  @javax.annotation.Nullable

  public Stop getStop() {
    return stop;
  }


  public void setStop(Stop stop) {
    this.stop = stop;
  }


  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * Get maxTokens
   * @return maxTokens
  **/
  @javax.annotation.Nullable

  public Integer getMaxTokens() {
    return maxTokens;
  }


  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    
    this.presencePenalty = presencePenalty;
    return this;
  }

   /**
   * Get presencePenalty
   * @return presencePenalty
  **/
  @javax.annotation.Nullable

  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }


  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }


  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

   /**
   * Get frequencyPenalty
   * @return frequencyPenalty
  **/
  @javax.annotation.Nullable

  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }


  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }


  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    
    this.logitBias = logitBias;
    return this;
  }

  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null) {
      this.logitBias = new HashMap<>();
    }
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

   /**
   * Get logitBias
   * @return logitBias
  **/
  @javax.annotation.Nullable

  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }


  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequest createChatCompletionRequest = (CreateChatCompletionRequest) o;
    return Objects.equals(this.model, createChatCompletionRequest.model) &&
        Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions) &&
        Objects.equals(this.temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.n, createChatCompletionRequest.n) &&
        Objects.equals(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createChatCompletionRequest.logitBias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, messages, functions, temperature, topP, n, stream, stop, maxTokens, presencePenalty, frequencyPenalty, logitBias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
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

