// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.ResponseArgs;
import com.pulumi.aws.apigateway.inputs.ResponseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Gateway Response for a REST API Gateway.
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
 * import com.pulumi.aws.apigateway.Response;
 * import com.pulumi.aws.apigateway.ResponseArgs;
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
 *         var main = new RestApi(&#34;main&#34;, RestApiArgs.builder()        
 *             .name(&#34;MyDemoAPI&#34;)
 *             .build());
 * 
 *         var test = new Response(&#34;test&#34;, ResponseArgs.builder()        
 *             .restApiId(main.id())
 *             .statusCode(&#34;401&#34;)
 *             .responseType(&#34;UNAUTHORIZED&#34;)
 *             .responseTemplates(Map.of(&#34;application/json&#34;, &#34;{\&#34;message\&#34;:$context.error.messageString}&#34;))
 *             .responseParameters(Map.of(&#34;gatewayresponse.header.Authorization&#34;, &#34;&#39;Basic&#39;&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_api_gateway_gateway_response` using `REST-API-ID/RESPONSE-TYPE`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/response:Response example 12345abcde/UNAUTHORIZED
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/response:Response")
public class Response extends com.pulumi.resources.CustomResource {
    /**
     * Map of parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    @Export(name="responseParameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> responseParameters;

    /**
     * @return Map of parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    public Output<Optional<Map<String,String>>> responseParameters() {
        return Codegen.optional(this.responseParameters);
    }
    /**
     * Map of templates used to transform the response body.
     * 
     */
    @Export(name="responseTemplates", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> responseTemplates;

    /**
     * @return Map of templates used to transform the response body.
     * 
     */
    public Output<Optional<Map<String,String>>> responseTemplates() {
        return Codegen.optional(this.responseTemplates);
    }
    /**
     * Response type of the associated GatewayResponse.
     * 
     */
    @Export(name="responseType", refs={String.class}, tree="[0]")
    private Output<String> responseType;

    /**
     * @return Response type of the associated GatewayResponse.
     * 
     */
    public Output<String> responseType() {
        return this.responseType;
    }
    /**
     * String identifier of the associated REST API.
     * 
     */
    @Export(name="restApiId", refs={String.class}, tree="[0]")
    private Output<String> restApiId;

    /**
     * @return String identifier of the associated REST API.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }
    /**
     * HTTP status code of the Gateway Response.
     * 
     */
    @Export(name="statusCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> statusCode;

    /**
     * @return HTTP status code of the Gateway Response.
     * 
     */
    public Output<Optional<String>> statusCode() {
        return Codegen.optional(this.statusCode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Response(String name) {
        this(name, ResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Response(String name, ResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Response(String name, ResponseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/response:Response", name, args == null ? ResponseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Response(String name, Output<String> id, @Nullable ResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/response:Response", name, state, makeResourceOptions(options, id));
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
    public static Response get(String name, Output<String> id, @Nullable ResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Response(name, id, state, options);
    }
}
