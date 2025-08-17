

# OrganizationBillingInfo

Information about an organization's billing configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**displayName** | **String** |  |  |
|**config** | [**OrganizationConfig**](OrganizationConfig.md) |  |  |
|**connectedToStripe** | **Boolean** |  |  |
|**connectedToMetronome** | **Boolean** |  |  |
|**isPersonal** | **Boolean** |  |  |
|**tier** | **PaymentPlanTier** |  |  [optional] |
|**paymentMethod** | [**StripePaymentMethodInfo**](StripePaymentMethodInfo.md) |  |  [optional] |
|**endOfBillingPeriod** | **OffsetDateTime** |  |  [optional] |
|**currentPlan** | [**CustomerVisiblePlanInfo**](CustomerVisiblePlanInfo.md) |  |  [optional] |
|**upcomingPlan** | [**CustomerVisiblePlanInfo**](CustomerVisiblePlanInfo.md) |  |  [optional] |
|**reachedMaxWorkspaces** | **Boolean** |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |



