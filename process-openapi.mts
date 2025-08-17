

const { default: schema } = await import("./api/openapi.json", {
  assert: {
    type: "json",
  },
});

var newSchema =  { ...schema,
    paths: Object.fromEntries(Object.entries(schema.paths).filter(([name]) => {
       //console.log( "NAME", name )
        return (
          name.startsWith("/api/v1/runs") ||
          name.startsWith("/runs")
        )

    })),
    /*
    components: {
        schemas: 
            Object.fromEntries(Object.entries(schema.components.schemas).filter(([name]) => {
                return (             
                    name === "RunStats" ||
                    name === "RunSchema" ||
                    name === "TraceTier" ||
                    name === "RunTypeEnum" ||
                    name === "RunGroupStats" ||
                    name === "RuleLogSchema" ||
                    name === "RunGroupStats" ||
                    name === "RunRulesSchema" ||
                    name === "RunShareSchema" ||
                    name === "RunGroupRequest" ||                    
                    name === "RunStatsQueryParams" ||
                    name === "RunRulesCreateSchema" ||
                    name === "RunGroupRequest" ||
                    name === "RunRulesSchema" ||
                    name === "ListRunsResponse" ||
                    name === "TriggerRulesRequest" ||
                    name === "BodyParamsForRunSchema" ||
                    name === "Body_delete_runs_api_v1_runs_delete_post" ||
                    name === "ResponseBodyForRunsGenerateQuery" ||
                    name === "RequestBodyForRunsGenerateQuery" ||
                    name === "BodyParamsForRunSchema" ||
                    name === "HTTPValidationError" ||
                    name === "RunRulesPagerdutyAlertSchem" ||
                    name === "RunRulesWebhookSchema" ||
                    name === "RunsFilterDataSourceTypeEnum" ||
                    name === "RunStatsGroupBy" ||
                    name === "RunStatsSelect" ||
                    name === "RunDateOrder" || 
                    name === "RunSelect" || 
                    name === "RunsGenerateQueryFeedbackKeys" || name === "RuleLogActionResponse" || name === "RunGroupBy" ||
                    name === "EvaluatorTopLevel" || name === "CodeEvaluatorTopLevel" || name === "RunRulesPagerdutyAlertSchema" ||
                    name === "EvaluatorStructuredOutput" || name === "RuleLogActionOutcome" || name === "RunRulesAlertType" ||
                    name === "PagerdutySeverity" ||
                    name === "ValidationError" 
                  )
            })),
        
    }
    */        
 }


Bun.write( "api/openapi.json", JSON.stringify(newSchema, null, 2) )



