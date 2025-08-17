

const { default: schema } = await import("./api/openapi.json", {
  assert: {
    type: "json",
  },
});

var newSchema =  { ...schema,
    paths: Object.fromEntries(Object.entries(schema.paths).filter(([name]) => {
       //console.log( "NAME", name )
        return (name === "/api/v1/runs/{run_id}" )
              
    })),
    components: {
        schemas: 
            Object.fromEntries(Object.entries(schema.components.schemas).filter(([name]) => {
                return (             
                    name === "RunSchema" ||
                    name.startsWith("RunTypeEnum") ||
                    name.startsWith("TraceTier") ||
                    name.startsWith("HTTPValidationError") ||
                    name.startsWith("ValidationError") 
                  )
            })),
        
    }
 }


Bun.write( "api/openapi.json", JSON.stringify(newSchema, null, 2) )



