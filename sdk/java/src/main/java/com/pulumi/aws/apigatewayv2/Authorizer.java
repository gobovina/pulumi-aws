// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.AuthorizerArgs;
import com.pulumi.aws.apigatewayv2.inputs.AuthorizerState;
import com.pulumi.aws.apigatewayv2.outputs.AuthorizerJwtConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 authorizer.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * ### Basic WebSocket API
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.Authorizer;
 * import com.pulumi.aws.apigatewayv2.AuthorizerArgs;
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
 *         var example = new Authorizer(&#34;example&#34;, AuthorizerArgs.builder()        
 *             .apiId(exampleAwsApigatewayv2Api.id())
 *             .authorizerType(&#34;REQUEST&#34;)
 *             .authorizerUri(exampleAwsLambdaFunction.invokeArn())
 *             .identitySources(&#34;route.request.header.Auth&#34;)
 *             .name(&#34;example-authorizer&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Basic HTTP API
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.Authorizer;
 * import com.pulumi.aws.apigatewayv2.AuthorizerArgs;
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
 *         var example = new Authorizer(&#34;example&#34;, AuthorizerArgs.builder()        
 *             .apiId(exampleAwsApigatewayv2Api.id())
 *             .authorizerType(&#34;REQUEST&#34;)
 *             .authorizerUri(exampleAwsLambdaFunction.invokeArn())
 *             .identitySources(&#34;$request.header.Authorization&#34;)
 *             .name(&#34;example-authorizer&#34;)
 *             .authorizerPayloadFormatVersion(&#34;2.0&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_apigatewayv2_authorizer` using the API identifier and authorizer identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/authorizer:Authorizer example aabbccddee/1122334
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/authorizer:Authorizer")
public class Authorizer extends com.pulumi.resources.CustomResource {
    /**
     * API identifier.
     * 
     */
    @Export(name="apiId", refs={String.class}, tree="[0]")
    private Output<String> apiId;

    /**
     * @return API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * Required credentials as an IAM role for API Gateway to invoke the authorizer.
     * Supported only for `REQUEST` authorizers.
     * 
     */
    @Export(name="authorizerCredentialsArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerCredentialsArn;

    /**
     * @return Required credentials as an IAM role for API Gateway to invoke the authorizer.
     * Supported only for `REQUEST` authorizers.
     * 
     */
    public Output<Optional<String>> authorizerCredentialsArn() {
        return Codegen.optional(this.authorizerCredentialsArn);
    }
    /**
     * Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
     * Valid values: `1.0`, `2.0`.
     * 
     */
    @Export(name="authorizerPayloadFormatVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerPayloadFormatVersion;

    /**
     * @return Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
     * Valid values: `1.0`, `2.0`.
     * 
     */
    public Output<Optional<String>> authorizerPayloadFormatVersion() {
        return Codegen.optional(this.authorizerPayloadFormatVersion);
    }
    /**
     * Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
     * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
     * Supported only for HTTP API Lambda authorizers.
     * 
     */
    @Export(name="authorizerResultTtlInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> authorizerResultTtlInSeconds;

    /**
     * @return Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
     * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
     * Supported only for HTTP API Lambda authorizers.
     * 
     */
    public Output<Integer> authorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }
    /**
     * Authorizer type. Valid values: `JWT`, `REQUEST`.
     * Specify `REQUEST` for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
     * 
     */
    @Export(name="authorizerType", refs={String.class}, tree="[0]")
    private Output<String> authorizerType;

    /**
     * @return Authorizer type. Valid values: `JWT`, `REQUEST`.
     * Specify `REQUEST` for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
     * 
     */
    public Output<String> authorizerType() {
        return this.authorizerType;
    }
    /**
     * Authorizer&#39;s Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
     * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
     * 
     */
    @Export(name="authorizerUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizerUri;

    /**
     * @return Authorizer&#39;s Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
     * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
     * 
     */
    public Output<Optional<String>> authorizerUri() {
        return Codegen.optional(this.authorizerUri);
    }
    /**
     * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     * Supported only for HTTP APIs.
     * 
     */
    @Export(name="enableSimpleResponses", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableSimpleResponses;

    /**
     * @return Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     * Supported only for HTTP APIs.
     * 
     */
    public Output<Optional<Boolean>> enableSimpleResponses() {
        return Codegen.optional(this.enableSimpleResponses);
    }
    /**
     * Identity sources for which authorization is requested.
     * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
     * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
     * 
     */
    @Export(name="identitySources", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> identitySources;

    /**
     * @return Identity sources for which authorization is requested.
     * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
     * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
     * 
     */
    public Output<Optional<List<String>>> identitySources() {
        return Codegen.optional(this.identitySources);
    }
    /**
     * Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     * Supported only for HTTP APIs.
     * 
     */
    @Export(name="jwtConfiguration", refs={AuthorizerJwtConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AuthorizerJwtConfiguration> jwtConfiguration;

    /**
     * @return Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     * Supported only for HTTP APIs.
     * 
     */
    public Output<Optional<AuthorizerJwtConfiguration>> jwtConfiguration() {
        return Codegen.optional(this.jwtConfiguration);
    }
    /**
     * Name of the authorizer. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the authorizer. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/authorizer:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/authorizer:Authorizer", name, state, makeResourceOptions(options, id));
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
    public static Authorizer get(String name, Output<String> id, @Nullable AuthorizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, state, options);
    }
}
