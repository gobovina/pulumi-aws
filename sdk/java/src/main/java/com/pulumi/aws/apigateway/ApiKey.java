// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.ApiKeyArgs;
import com.pulumi.aws.apigateway.inputs.ApiKeyState;
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
 * Provides an API Gateway API Key.
 * 
 * &gt; **NOTE:** Since the API Gateway usage plans feature was launched on August 11, 2016, usage plans are now **required** to associate an API key with an API stage.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.ApiKey;
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
 *         var myDemoApiKey = new ApiKey(&#34;myDemoApiKey&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import API Gateway Keys using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/apiKey:ApiKey my_demo_key 8bklk8bl1k3sB38D9B3l0enyWT8c09B30lkq0blk
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * ARN
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Creation date of the API key
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the API key
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return API key description. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Whether the API key can be used by callers. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the API key can be used by callers. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Last update date of the API key
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Last update date of the API key
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the API key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the API key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, @Nullable ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
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
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
