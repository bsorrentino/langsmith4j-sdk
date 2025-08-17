

# HumanMessage

Message from a human.  HumanMessages are messages that are passed in from a human to the model.  Example:      .. code-block:: python          from langchain_core.messages import HumanMessage, SystemMessage          messages = [             SystemMessage(                 content=\"You are a helpful assistant! Your name is Bob.\"             ),             HumanMessage(                 content=\"What is your name?\"             )         ]          # Instantiate a chat model and invoke it with the messages         model = ...         print(model.invoke(messages))

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**Content**](Content.md) |  |  |
|**additionalKwargs** | **Object** |  |  [optional] |
|**responseMetadata** | **Object** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**id** | [**Id**](Id.md) |  |  [optional] |
|**example** | **Boolean** |  |  [optional] |



