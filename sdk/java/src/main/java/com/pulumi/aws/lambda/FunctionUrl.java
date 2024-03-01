// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.FunctionUrlArgs;
import com.pulumi.aws.lambda.inputs.FunctionUrlState;
import com.pulumi.aws.lambda.outputs.FunctionUrlCors;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Lambda function URL resource. A function URL is a dedicated HTTP(S) endpoint for a Lambda function.
 * 
 * See the [AWS Lambda documentation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-urls.html) for more information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lambda.FunctionUrl;
 * import com.pulumi.aws.lambda.FunctionUrlArgs;
 * import com.pulumi.aws.lambda.inputs.FunctionUrlCorsArgs;
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
 *         var testLatest = new FunctionUrl(&#34;testLatest&#34;, FunctionUrlArgs.builder()        
 *             .functionName(test.functionName())
 *             .authorizationType(&#34;NONE&#34;)
 *             .build());
 * 
 *         var testLive = new FunctionUrl(&#34;testLive&#34;, FunctionUrlArgs.builder()        
 *             .functionName(test.functionName())
 *             .qualifier(&#34;my_alias&#34;)
 *             .authorizationType(&#34;AWS_IAM&#34;)
 *             .cors(FunctionUrlCorsArgs.builder()
 *                 .allowCredentials(true)
 *                 .allowOrigins(&#34;*&#34;)
 *                 .allowMethods(&#34;*&#34;)
 *                 .allowHeaders(                
 *                     &#34;date&#34;,
 *                     &#34;keep-alive&#34;)
 *                 .exposeHeaders(                
 *                     &#34;keep-alive&#34;,
 *                     &#34;date&#34;)
 *                 .maxAge(86400)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lambda function URLs using the `function_name` or `function_name/qualifier`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lambda/functionUrl:FunctionUrl test_lambda_url my_test_lambda_function
 * ```
 * 
 */
@ResourceType(type="aws:lambda/functionUrl:FunctionUrl")
public class FunctionUrl extends com.pulumi.resources.CustomResource {
    /**
     * The type of authentication that the function URL uses. Set to `&#34;AWS_IAM&#34;` to restrict access to authenticated IAM users only. Set to `&#34;NONE&#34;` to bypass IAM authentication and create a public endpoint. See the [AWS documentation](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) for more details.
     * 
     */
    @Export(name="authorizationType", refs={String.class}, tree="[0]")
    private Output<String> authorizationType;

    /**
     * @return The type of authentication that the function URL uses. Set to `&#34;AWS_IAM&#34;` to restrict access to authenticated IAM users only. Set to `&#34;NONE&#34;` to bypass IAM authentication and create a public endpoint. See the [AWS documentation](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) for more details.
     * 
     */
    public Output<String> authorizationType() {
        return this.authorizationType;
    }
    /**
     * The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. Documented below.
     * 
     */
    @Export(name="cors", refs={FunctionUrlCors.class}, tree="[0]")
    private Output</* @Nullable */ FunctionUrlCors> cors;

    /**
     * @return The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. Documented below.
     * 
     */
    public Output<Optional<FunctionUrlCors>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * The Amazon Resource Name (ARN) of the function.
     * 
     */
    @Export(name="functionArn", refs={String.class}, tree="[0]")
    private Output<String> functionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the function.
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }
    /**
     * The name (or ARN) of the Lambda function.
     * 
     */
    @Export(name="functionName", refs={String.class}, tree="[0]")
    private Output<String> functionName;

    /**
     * @return The name (or ARN) of the Lambda function.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }
    /**
     * The HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws/`.
     * 
     */
    @Export(name="functionUrl", refs={String.class}, tree="[0]")
    private Output<String> functionUrl;

    /**
     * @return The HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws/`.
     * 
     */
    public Output<String> functionUrl() {
        return this.functionUrl;
    }
    /**
     * Determines how the Lambda function responds to an invocation. Valid values are `BUFFERED` (default) and `RESPONSE_STREAM`. See more in [Configuring a Lambda function to stream responses](https://docs.aws.amazon.com/lambda/latest/dg/configuration-response-streaming.html).
     * 
     */
    @Export(name="invokeMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> invokeMode;

    /**
     * @return Determines how the Lambda function responds to an invocation. Valid values are `BUFFERED` (default) and `RESPONSE_STREAM`. See more in [Configuring a Lambda function to stream responses](https://docs.aws.amazon.com/lambda/latest/dg/configuration-response-streaming.html).
     * 
     */
    public Output<Optional<String>> invokeMode() {
        return Codegen.optional(this.invokeMode);
    }
    /**
     * The alias name or `&#34;$LATEST&#34;`.
     * 
     */
    @Export(name="qualifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> qualifier;

    /**
     * @return The alias name or `&#34;$LATEST&#34;`.
     * 
     */
    public Output<Optional<String>> qualifier() {
        return Codegen.optional(this.qualifier);
    }
    /**
     * A generated ID for the endpoint.
     * 
     */
    @Export(name="urlId", refs={String.class}, tree="[0]")
    private Output<String> urlId;

    /**
     * @return A generated ID for the endpoint.
     * 
     */
    public Output<String> urlId() {
        return this.urlId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionUrl(String name) {
        this(name, FunctionUrlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionUrl(String name, FunctionUrlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionUrl(String name, FunctionUrlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionUrl:FunctionUrl", name, args == null ? FunctionUrlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FunctionUrl(String name, Output<String> id, @Nullable FunctionUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/functionUrl:FunctionUrl", name, state, makeResourceOptions(options, id));
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
    public static FunctionUrl get(String name, Output<String> id, @Nullable FunctionUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FunctionUrl(name, id, state, options);
    }
}
