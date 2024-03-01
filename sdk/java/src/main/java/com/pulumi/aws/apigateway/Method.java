// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.MethodArgs;
import com.pulumi.aws.apigateway.inputs.MethodState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a HTTP Method for an API Gateway Resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.apigateway.RestApiArgs;
 * import com.pulumi.aws.apigateway.Resource;
 * import com.pulumi.aws.apigateway.ResourceArgs;
 * import com.pulumi.aws.apigateway.Method;
 * import com.pulumi.aws.apigateway.MethodArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myDemoAPI = new RestApi(&#34;myDemoAPI&#34;, RestApiArgs.builder()        
 *             .name(&#34;MyDemoAPI&#34;)
 *             .description(&#34;This is my API for demonstration purposes&#34;)
 *             .build());
 * 
 *         var myDemoResource = new Resource(&#34;myDemoResource&#34;, ResourceArgs.builder()        
 *             .restApi(myDemoAPI.id())
 *             .parentId(myDemoAPI.rootResourceId())
 *             .pathPart(&#34;mydemoresource&#34;)
 *             .build());
 * 
 *         var myDemoMethod = new Method(&#34;myDemoMethod&#34;, MethodArgs.builder()        
 *             .restApi(myDemoAPI.id())
 *             .resourceId(myDemoResource.id())
 *             .httpMethod(&#34;GET&#34;)
 *             .authorization(&#34;NONE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Usage with Cognito User Pool Authorizer
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cognito.CognitoFunctions;
 * import com.pulumi.aws.cognito.inputs.GetUserPoolsArgs;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.apigateway.RestApiArgs;
 * import com.pulumi.aws.apigateway.Resource;
 * import com.pulumi.aws.apigateway.ResourceArgs;
 * import com.pulumi.aws.apigateway.Authorizer;
 * import com.pulumi.aws.apigateway.AuthorizerArgs;
 * import com.pulumi.aws.apigateway.Method;
 * import com.pulumi.aws.apigateway.MethodArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var cognitoUserPoolName = config.get(&#34;cognitoUserPoolName&#34;);
 *         final var this = CognitoFunctions.getUserPools(GetUserPoolsArgs.builder()
 *             .name(cognitoUserPoolName)
 *             .build());
 * 
 *         var thisRestApi = new RestApi(&#34;thisRestApi&#34;, RestApiArgs.builder()        
 *             .name(&#34;with-authorizer&#34;)
 *             .build());
 * 
 *         var thisResource = new Resource(&#34;thisResource&#34;, ResourceArgs.builder()        
 *             .restApi(thisRestApi.id())
 *             .parentId(thisRestApi.rootResourceId())
 *             .pathPart(&#34;{proxy+}&#34;)
 *             .build());
 * 
 *         var thisAuthorizer = new Authorizer(&#34;thisAuthorizer&#34;, AuthorizerArgs.builder()        
 *             .name(&#34;CognitoUserPoolAuthorizer&#34;)
 *             .type(&#34;COGNITO_USER_POOLS&#34;)
 *             .restApi(thisRestApi.id())
 *             .providerArns(this_.arns())
 *             .build());
 * 
 *         var any = new Method(&#34;any&#34;, MethodArgs.builder()        
 *             .restApi(thisRestApi.id())
 *             .resourceId(thisResource.id())
 *             .httpMethod(&#34;ANY&#34;)
 *             .authorization(&#34;COGNITO_USER_POOLS&#34;)
 *             .authorizerId(thisAuthorizer.id())
 *             .requestParameters(Map.of(&#34;method.request.path.proxy&#34;, true))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_api_gateway_method` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/method:Method example 12345abcde/67890fghij/GET
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/method:Method")
public class Method extends com.pulumi.resources.CustomResource {
    /**
     * Specify if the method requires an API key
     * 
     */
    @Export(name="apiKeyRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    /**
     * @return Specify if the method requires an API key
     * 
     */
    public Output<Optional<Boolean>> apiKeyRequired() {
        return Codegen.optional(this.apiKeyRequired);
    }
    /**
     * Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    @Export(name="authorization", refs={String.class}, tree="[0]")
    private Output<String> authorization;

    /**
     * @return Type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    public Output<String> authorization() {
        return this.authorization;
    }
    /**
     * Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    @Export(name="authorizationScopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizationScopes;

    /**
     * @return Authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    public Output<Optional<List<String>>> authorizationScopes() {
        return Codegen.optional(this.authorizationScopes);
    }
    /**
     * Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    @Export(name="authorizerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerId;

    /**
     * @return Authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    public Output<Optional<String>> authorizerId() {
        return Codegen.optional(this.authorizerId);
    }
    /**
     * HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Export(name="httpMethod", refs={String.class}, tree="[0]")
    private Output<String> httpMethod;

    /**
     * @return HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }
    /**
     * Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    @Export(name="operationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> operationName;

    /**
     * @return Function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    public Output<Optional<String>> operationName() {
        return Codegen.optional(this.operationName);
    }
    /**
     * Map of the API models used for the request&#39;s content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`&#39;s `name`.
     * 
     */
    @Export(name="requestModels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> requestModels;

    /**
     * @return Map of the API models used for the request&#39;s content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`&#39;s `name`.
     * 
     */
    public Output<Optional<Map<String,String>>> requestModels() {
        return Codegen.optional(this.requestModels);
    }
    /**
     * Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {&#34;method.request.header.X-Some-Header&#34; = true &#34;method.request.querystring.some-query-param&#34; = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    @Export(name="requestParameters", refs={Map.class,String.class,Boolean.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Boolean>> requestParameters;

    /**
     * @return Map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {&#34;method.request.header.X-Some-Header&#34; = true &#34;method.request.querystring.some-query-param&#34; = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    public Output<Optional<Map<String,Boolean>>> requestParameters() {
        return Codegen.optional(this.requestParameters);
    }
    /**
     * ID of a `aws.apigateway.RequestValidator`
     * 
     */
    @Export(name="requestValidatorId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> requestValidatorId;

    /**
     * @return ID of a `aws.apigateway.RequestValidator`
     * 
     */
    public Output<Optional<String>> requestValidatorId() {
        return Codegen.optional(this.requestValidatorId);
    }
    /**
     * API resource ID
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return API resource ID
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * ID of the associated REST API
     * 
     */
    @Export(name="restApi", refs={String.class}, tree="[0]")
    private Output<String> restApi;

    /**
     * @return ID of the associated REST API
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Method(String name) {
        this(name, MethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Method(String name, MethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Method(String name, MethodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/method:Method", name, args == null ? MethodArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Method(String name, Output<String> id, @Nullable MethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/method:Method", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Method get(String name, Output<String> id, @Nullable MethodState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Method(name, id, state, options);
    }
}
