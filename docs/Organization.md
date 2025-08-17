

# Organization

Information about an organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**config** | [**OrganizationConfig**](OrganizationConfig.md) |  |  |
|**connectedToStripe** | **Boolean** |  |  |
|**connectedToMetronome** | **Boolean** |  |  |
|**isPersonal** | **Boolean** |  |  |
|**tier** | **PaymentPlanTier** |  |  [optional] |
|**paymentMethod** | [**StripePaymentMethodInfo**](StripePaymentMethodInfo.md) |  |  [optional] |
|**hasCancelled** | **Boolean** |  |  |
|**endOfBillingPeriod** | **OffsetDateTime** |  |  [optional] |
|**currentPlan** | [**CustomerVisiblePlanInfo**](CustomerVisiblePlanInfo.md) |  |  [optional] |
|**upcomingPlan** | [**CustomerVisiblePlanInfo**](CustomerVisiblePlanInfo.md) |  |  [optional] |
|**reachedMaxWorkspaces** | **Boolean** |  |  [optional] |
|**permissions** | **List&lt;String&gt;** |  |  [optional] |
|**marketplacePayoutsEnabled** | **Boolean** |  |  [optional] |
|**wallet** | [**Wallet**](Wallet.md) |  |  [optional] |



