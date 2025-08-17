

# SystemMessage

Message for priming AI behavior.  The system message is usually passed in as the first of a sequence of input messages.  Example:      .. code-block:: python          from langchain_core.messages import HumanMessage, SystemMessage          messages = [             SystemMessage(                 content=\"You are a helpful assistant! Your name is Bob.\"             ),             HumanMessage(                 content=\"What is your name?\"             )         ]          # Define a chat model and invoke it with the messages         print(model.invoke(messages))

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**Content**](Content.md) |  |  |
|**additionalKwargs** | **Object** |  |  [optional] |
|**responseMetadata** | **Object** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | [**Name2**](Name2.md) |  |  [optional] |
|**id** | [**Id**](Id.md) |  |  [optional] |



