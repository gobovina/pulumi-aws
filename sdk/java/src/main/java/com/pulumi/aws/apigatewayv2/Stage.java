// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.StageArgs;
import com.pulumi.aws.apigatewayv2.inputs.StageState;
import com.pulumi.aws.apigatewayv2.outputs.StageAccessLogSettings;
import com.pulumi.aws.apigatewayv2.outputs.StageDefaultRouteSettings;
import com.pulumi.aws.apigatewayv2.outputs.StageRouteSetting;
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
 * Manages an Amazon API Gateway Version 2 stage.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.Stage;
 * import com.pulumi.aws.apigatewayv2.StageArgs;
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
 *         var example = new Stage(&#34;example&#34;, StageArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_apigatewayv2_stage` using the API identifier and stage name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/stage:Stage example aabbccddee/example-stage
 * ```
 *  -&gt; __Note:__ The API Gateway managed stage created as part of [_quick_create_](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html#apigateway-definition-quick-create) cannot be imported.
 * 
 */
@ResourceType(type="aws:apigatewayv2/stage:Stage")
public class Stage extends com.pulumi.resources.CustomResource {
    /**
     * Settings for logging access in this stage.
     * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * 
     */
    @Export(name="accessLogSettings", refs={StageAccessLogSettings.class}, tree="[0]")
    private Output</* @Nullable */ StageAccessLogSettings> accessLogSettings;

    /**
     * @return Settings for logging access in this stage.
     * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * 
     */
    public Output<Optional<StageAccessLogSettings>> accessLogSettings() {
        return Codegen.optional(this.accessLogSettings);
    }
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
     * ARN of the stage.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the stage.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether updates to an API automatically trigger a new deployment. Defaults to `false`. Applicable for HTTP APIs.
     * 
     */
    @Export(name="autoDeploy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoDeploy;

    /**
     * @return Whether updates to an API automatically trigger a new deployment. Defaults to `false`. Applicable for HTTP APIs.
     * 
     */
    public Output<Optional<Boolean>> autoDeploy() {
        return Codegen.optional(this.autoDeploy);
    }
    /**
     * Identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
     * Supported only for WebSocket APIs.
     * 
     */
    @Export(name="clientCertificateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientCertificateId;

    /**
     * @return Identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
     * Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<String>> clientCertificateId() {
        return Codegen.optional(this.clientCertificateId);
    }
    /**
     * Default route settings for the stage.
     * 
     */
    @Export(name="defaultRouteSettings", refs={StageDefaultRouteSettings.class}, tree="[0]")
    private Output</* @Nullable */ StageDefaultRouteSettings> defaultRouteSettings;

    /**
     * @return Default route settings for the stage.
     * 
     */
    public Output<Optional<StageDefaultRouteSettings>> defaultRouteSettings() {
        return Codegen.optional(this.defaultRouteSettings);
    }
    /**
     * Deployment identifier of the stage. Use the `aws.apigatewayv2.Deployment` resource to configure a deployment.
     * 
     */
    @Export(name="deploymentId", refs={String.class}, tree="[0]")
    private Output<String> deploymentId;

    /**
     * @return Deployment identifier of the stage. Use the `aws.apigatewayv2.Deployment` resource to configure a deployment.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * Description for the stage. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the stage. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * ARN prefix to be used in an `aws.lambda.Permission`&#39;s `source_arn` attribute.
     * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    @Export(name="executionArn", refs={String.class}, tree="[0]")
    private Output<String> executionArn;

    /**
     * @return ARN prefix to be used in an `aws.lambda.Permission`&#39;s `source_arn` attribute.
     * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
     * 
     */
    public Output<String> executionArn() {
        return this.executionArn;
    }
    /**
     * URL to invoke the API pointing to the stage,
     * e.g., `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
     * 
     */
    @Export(name="invokeUrl", refs={String.class}, tree="[0]")
    private Output<String> invokeUrl;

    /**
     * @return URL to invoke the API pointing to the stage,
     * e.g., `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
     * 
     */
    public Output<String> invokeUrl() {
        return this.invokeUrl;
    }
    /**
     * Name of the stage. Must be between 1 and 128 characters in length.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the stage. Must be between 1 and 128 characters in length.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Route settings for the stage.
     * 
     */
    @Export(name="routeSettings", refs={List.class,StageRouteSetting.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StageRouteSetting>> routeSettings;

    /**
     * @return Route settings for the stage.
     * 
     */
    public Output<Optional<List<StageRouteSetting>>> routeSettings() {
        return Codegen.optional(this.routeSettings);
    }
    /**
     * Map that defines the stage variables for the stage.
     * 
     */
    @Export(name="stageVariables", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> stageVariables;

    /**
     * @return Map that defines the stage variables for the stage.
     * 
     */
    public Output<Optional<Map<String,String>>> stageVariables() {
        return Codegen.optional(this.stageVariables);
    }
    /**
     * Map of tags to assign to the stage. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the stage. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stage(String name) {
        this(name, StageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stage(String name, StageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stage(String name, StageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/stage:Stage", name, args == null ? StageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stage(String name, Output<String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/stage:Stage", name, state, makeResourceOptions(options, id));
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
    public static Stage get(String name, Output<String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stage(name, id, state, options);
    }
}
