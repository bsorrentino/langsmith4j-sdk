
## CONFIG OPTIONS
| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|additionalEnumTypeAnnotations|Additional annotations for enum type(class level annotations)| |null|
|additionalModelTypeAnnotations|Additional annotations for model type(class level annotations). List separated by semicolon(;) or new line (Linux or Windows)| |null|
|additionalOneOfTypeAnnotations|Additional annotations for oneOf interfaces(class level annotations). List separated by semicolon(;) or new line (Linux or Windows)| |null|
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|annotationLibrary|Select the complementary documentation annotation library.|<dl><dt>**none**</dt><dd>Do not annotate Model and Api with complementary annotations.</dd><dt>**swagger1**</dt><dd>Annotate Model and Api using the Swagger Annotations 1.x library.</dd><dt>**swagger2**</dt><dd>Annotate Model and Api using the Swagger Annotations 2.x library.</dd></dl>|none|
|apiPackage|package for generated api classes| |org.openapitools.client.api|
|artifactDescription|artifact description in generated pom.xml| |OpenAPI Java|
|artifactId|artifactId in generated pom.xml. This also becomes part of the generated library's filename| |openapi-java-client|
|artifactUrl|artifact URL in generated pom.xml| |https://github.com/openapitools/openapi-generator|
|artifactVersion|artifact version in generated pom.xml. This also becomes part of the generated library's filename. If not provided, uses the version from the OpenAPI specification file. If that's also not present, uses the default value of the artifactVersion option.| |1.0.0|
|asyncNative|If true, async handlers will be used, instead of the sync version| |false|
|bigDecimalAsString|Treat BigDecimal values as Strings to avoid precision loss.| |false|
|booleanGetterPrefix|Set booleanGetterPrefix| |get|
|camelCaseDollarSign|Fix camelCase when starting with $ sign. when true : $Value when false : $value| |false|
|caseInsensitiveResponseHeaders|Make API response's headers case-insensitive. Available on okhttp-gson, jersey2 libraries| |false|
|configKey|Config key in @RegisterRestClient. Default to none. Only `microprofile` supports this option.| |null|
|configKeyFromClassName|If true, set tag as key in @RegisterRestClient. Default to false. Only `microprofile` supports this option.| |null|
|containerDefaultToNull|Set containers (array, set, map) default to null| |false|
|dateLibrary|Option. Date library to use|<dl><dt>**joda**</dt><dd>Joda (for legacy app only)</dd><dt>**legacy**</dt><dd>Legacy java.util.Date</dd><dt>**java8-localdatetime**</dt><dd>Java 8 using LocalDateTime (for legacy app only)</dd><dt>**java8**</dt><dd>Java 8 native JSR310 (preferred for jdk 1.8+)</dd></dl>|java8|
|developerEmail|developer email in generated pom.xml| |team@openapitools.org|
|developerName|developer name in generated pom.xml| |OpenAPI-Generator Contributors|
|developerOrganization|developer organization in generated pom.xml| |OpenAPITools.org|
|developerOrganizationUrl|developer organization URL in generated pom.xml| |http://openapitools.org|
|disableHtmlEscaping|Disable HTML escaping of JSON strings when using gson (needed to avoid problems with byte[] fields)| |false|
|disallowAdditionalPropertiesIfNotPresent|If false, the 'additionalProperties' implementation (set to true by default) is compliant with the OAS and JSON schema specifications. If true (default), keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.|<dl><dt>**false**</dt><dd>The 'additionalProperties' implementation is compliant with the OAS and JSON schema specifications.</dd><dt>**true**</dt><dd>Keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.</dd></dl>|true|
|discriminatorCaseSensitive|Whether the discriminator value lookup should be case-sensitive or not. This option only works for Java API client| |true|
|documentationProvider|Select the OpenAPI documentation provider.|<dl><dt>**none**</dt><dd>Do not publish an OpenAPI specification.</dd><dt>**source**</dt><dd>Publish the original input OpenAPI specification.</dd></dl>|source|
|dynamicOperations|Generate operations dynamically at runtime from an OAS| |false|
|ensureUniqueParams|Whether to ensure parameter names are unique in an operation (rename parameters that are not).| |true|
|enumPropertyNaming|Naming convention for enum properties: 'MACRO_CASE', 'legacy' and 'original'| |MACRO_CASE|
|enumUnknownDefaultCase|If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case.|<dl><dt>**false**</dt><dd>No changes to the enum's are made, this is the default option.</dd><dt>**true**</dt><dd>With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the enum case sent by the server is not known by the client/spec, can safely be decoded to this case.</dd></dl>|false|
|errorObjectType|Error Object type. (This option is for okhttp-gson only)| |null|
|failOnUnknownProperties|Fail Jackson de-serialization on unknown properties| |false|
|generateBuilders|Whether to generate builders for models| |false|
|generateClientAsBean|For resttemplate, restclient and webclient, configure whether to create `ApiClient.java` and Apis clients as bean (with `@Component` annotation).| |false|
|generateConstructorWithAllArgs|whether to generate a constructor for all arguments| |false|
|gradleProperties|Append additional Gradle properties to the gradle.properties file| |null|
|groupId|groupId in generated pom.xml| |org.openapitools|
|hideGenerationTimestamp|Hides the generation timestamp when files are generated.| |false|
|ignoreAnyOfInEnum|Ignore anyOf keyword in enum| |false|
|implicitHeaders|Skip header parameters in the generated API methods using @ApiImplicitParams annotation.| |false|
|implicitHeadersRegex|Skip header parameters that matches given regex in the generated API methods using @ApiImplicitParams annotation. Note: this parameter is ignored when implicitHeaders=true| |null|
|invokerPackage|root package for generated code| |org.openapitools.client|
|legacyDiscriminatorBehavior|Set to false for generators with better support for discriminators. (Python, Java, Go, PowerShell, C# have this enabled by default).|<dl><dt>**true**</dt><dd>The mapping in the discriminator includes descendent schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.</dd><dt>**false**</dt><dd>The mapping in the discriminator includes any descendent schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.</dd></dl>|true|
|library|library template (sub-template) to use|<dl><dt>**jersey2**</dt><dd>HTTP client: Jersey client 2.25.1. JSON processing: Jackson 2.17.1</dd><dt>**jersey3**</dt><dd>HTTP client: Jersey client 3.1.1. JSON processing: Jackson 2.17.1</dd><dt>**feign**</dt><dd>HTTP client: OpenFeign 13.2.1. JSON processing: Jackson 2.17.1 or Gson 2.10.1</dd><dt>**feign-hc5**</dt><dd>HTTP client: OpenFeign 13.2.1/HttpClient5 5.4.2. JSON processing: Jackson 2.17.1 or Gson 2.10.1</dd><dt>**okhttp-gson**</dt><dd>[DEFAULT] HTTP client: OkHttp 4.11.0. JSON processing: Gson 2.10.1. Enable Parcelable models on Android using '-DparcelableModel=true'. Enable gzip request encoding using '-DuseGzipFeature=true'.</dd><dt>**retrofit2**</dt><dd>HTTP client: OkHttp 4.11.0. JSON processing: Gson 2.10.1 (Retrofit 2.5.0) or Jackson 2.17.1. Enable the RxJava adapter using '-DuseRxJava[2/3]=true'. (RxJava 1.x or 2.x or 3.x)</dd><dt>**resttemplate**</dt><dd>HTTP client: Spring RestTemplate 5.3.33 (6.1.5 if `useJakartaEe=true`). JSON processing: Jackson 2.17.1</dd><dt>**webclient**</dt><dd>HTTP client: Spring WebClient 5.1.18. JSON processing: Jackson 2.17.1</dd><dt>**restclient**</dt><dd>HTTP client: Spring RestClient 6.1.6. JSON processing: Jackson 2.17.1</dd><dt>**resteasy**</dt><dd>HTTP client: Resteasy client 4.7.6. JSON processing: Jackson 2.17.1</dd><dt>**vertx**</dt><dd>HTTP client: VertX client 3.5.2. JSON processing: Jackson 2.17.1</dd><dt>**google-api-client**</dt><dd>HTTP client: Google API client 2.2.0. JSON processing: Jackson 2.17.1</dd><dt>**rest-assured**</dt><dd>HTTP client: rest-assured 5.3.2. JSON processing: Gson 2.10.1 or Jackson 2.17.1. Only for Java 8</dd><dt>**native**</dt><dd>HTTP client: Java native HttpClient. JSON processing: Jackson 2.17.1. Only for Java11+</dd><dt>**microprofile**</dt><dd>HTTP client: Microprofile client 2.0 (default, set desired version via `microprofileRestClientVersion=x.x.x`). JSON processing: JSON-B 1.0.2 or Jackson 2.17.1</dd><dt>**apache-httpclient**</dt><dd>HTTP client: Apache httpclient 5.2.1. JSON processing: Jackson 2.17.1</dd></dl>|okhttp-gson|
|licenseName|The name of the license| |Unlicense|
|licenseUrl|The URL of the license| |http://unlicense.org|
|microprofileFramework|Framework for microprofile. Possible values &quot;kumuluzee&quot;| |null|
|microprofileMutiny|Whether to use async types for microprofile (currently only Smallrye Mutiny is supported).| |null|
|microprofileRestClientVersion|Version of MicroProfile Rest Client API.| |null|
|modelPackage|package for generated models| |org.openapitools.client.model|
|openApiNullable|Enable OpenAPI Jackson Nullable library. Not supported by `microprofile` library.| |true|
|parcelableModel|Whether to generate models for Android that implement Parcelable with the okhttp-gson library.| |false|
|parentArtifactId|parent artifactId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|parentGroupId|parent groupId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|parentVersion|parent version in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect| |null|
|performBeanValidation|Perform BeanValidation| |false|
|prependFormOrBodyParameters|Add form or body parameters to the beginning of the parameter list.| |false|
|scmConnection|SCM connection in generated pom.xml| |scm:git:git@github.com:openapitools/openapi-generator.git|
|scmDeveloperConnection|SCM developer connection in generated pom.xml| |scm:git:git@github.com:openapitools/openapi-generator.git|
|scmUrl|SCM URL in generated pom.xml| |https://github.com/openapitools/openapi-generator|
|serializableModel|boolean - toggle &quot;implements Serializable&quot; for generated models| |false|
|serializationLibrary|Serialization library, default depends on value of the option library|<dl><dt>**jsonb**</dt><dd>Use JSON-B as serialization library</dd><dt>**jackson**</dt><dd>Use Jackson as serialization library</dd><dt>**gson**</dt><dd>Use Gson as serialization library</dd></dl>|null|
|snapshotVersion|Uses a SNAPSHOT version.|<dl><dt>**true**</dt><dd>Use a SnapShot Version</dd><dt>**false**</dt><dd>Use a Release Version</dd></dl>|null|
|sortModelPropertiesByRequiredFlag|Sort model properties to place required parameters before optional parameters.| |true|
|sortParamsByRequiredFlag|Sort method arguments to place required parameters before optional parameters.| |true|
|sourceFolder|source folder for generated code| |src/main/java|
|supportStreaming|Support streaming endpoint (beta)| |false|
|supportUrlQuery|Generate toUrlQueryString in POJO (default to true). Available on `native`, `apache-httpclient` libraries.| |false|
|supportVertxFuture|Also generate api methods that return a vertx Future instead of taking a callback. Only `vertx` supports this option. Requires vertx 4 or greater.| |false|
|testOutput|Set output folder for models and APIs tests| |${project.build.directory}/generated-test-sources/openapi|
|useAbstractionForFiles|Use alternative types instead of java.io.File to allow passing bytes without a file on disk. Available on resttemplate, webclient, restclient, libraries| |false|
|useBeanValidation|Use BeanValidation API annotations| |false|
|useEnumCaseInsensitive|Use `equalsIgnoreCase` when String for enum comparison| |false|
|useGzipFeature|Send gzip-encoded requests| |false|
|useJakartaEe|whether to use Jakarta EE namespace instead of javax| |false|
|useOneOfDiscriminatorLookup|Use the discriminator's mapping in oneOf to speed up the model lookup. IMPORTANT: Validation (e.g. one and only one match in oneOf's schemas) will be skipped. Only jersey2, jersey3, native, okhttp-gson support this option.| |false|
|useOneOfInterfaces|whether to use a java interface to describe a set of oneOf options, where each option is a class that implements the interface| |false|
|usePlayWS|Use Play! Async HTTP client (Play WS API)| |false|
|useReflectionEqualsHashCode|Use org.apache.commons.lang3.builder for equals and hashCode in the models. WARNING: This will fail under a security manager, unless the appropriate permissions are set up correctly and also there's potential performance impact.| |false|
|useRuntimeException|Use RuntimeException instead of Exception. Only jersey2, jersey3, okhttp-gson, vertx, microprofile support this option.| |false|
|useRxJava2|Whether to use the RxJava2 adapter with the retrofit2 library. IMPORTANT: This option has been deprecated.| |false|
|useRxJava3|Whether to use the RxJava3 adapter with the retrofit2 library. IMPORTANT: This option has been deprecated.| |false|
|useSingleRequestParameter|Setting this property to &quot;true&quot; will generate functions with a single argument containing all API endpoint parameters instead of one argument per parameter. ONLY native, jersey2, jersey3, okhttp-gson, microprofile, Spring RestClient, Spring WebClient support this option. Setting this property to &quot;static&quot; does the same as &quot;true&quot;, but also makes the generated arguments class static with single parameter instantiation.| |false|
|webclientBlockingOperations|Making all WebClient operations blocking(sync). Note that if on operation 'x-webclient-blocking: false' then such operation won't be sync| |false|
|withAWSV4Signature|whether to include AWS v4 signature support (only available for okhttp-gson library)| |false|
|withXml|whether to include support for application/xml content type and include XML annotations in the model (works with libraries that provide support for JSON and XML)| |false|
