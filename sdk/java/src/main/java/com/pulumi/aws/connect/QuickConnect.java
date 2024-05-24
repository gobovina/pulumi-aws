// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.QuickConnectArgs;
import com.pulumi.aws.connect.inputs.QuickConnectState;
import com.pulumi.aws.connect.outputs.QuickConnectQuickConnectConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Quick Connect resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.QuickConnect;
 * import com.pulumi.aws.connect.QuickConnectArgs;
 * import com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs;
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
 *         var test = new QuickConnect("test", QuickConnectArgs.builder()
 *             .instanceId("aaaaaaaa-bbbb-cccc-dddd-111111111111")
 *             .name("Example Name")
 *             .description("quick connect phone number")
 *             .quickConnectConfig(QuickConnectQuickConnectConfigArgs.builder()
 *                 .quickConnectType("PHONE_NUMBER")
 *                 .phoneConfigs(QuickConnectQuickConnectConfigPhoneConfigArgs.builder()
 *                     .phoneNumber("+12345678912")
 *                     .build())
 *                 .build())
 *             .tags(Map.of("Name", "Example Quick Connect"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amazon Connect Quick Connects using the `instance_id` and `quick_connect_id` separated by a colon (`:`). For example:
 * 
 * ```sh
 * $ pulumi import aws:connect/quickConnect:QuickConnect example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/quickConnect:QuickConnect")
public class QuickConnect extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Quick Connect.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Quick Connect.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Quick Connect.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    @Export(name="quickConnectConfig", refs={QuickConnectQuickConnectConfig.class}, tree="[0]")
    private Output<QuickConnectQuickConnectConfig> quickConnectConfig;

    /**
     * @return A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    public Output<QuickConnectQuickConnectConfig> quickConnectConfig() {
        return this.quickConnectConfig;
    }
    /**
     * The identifier for the Quick Connect.
     * 
     */
    @Export(name="quickConnectId", refs={String.class}, tree="[0]")
    private Output<String> quickConnectId;

    /**
     * @return The identifier for the Quick Connect.
     * 
     */
    public Output<String> quickConnectId() {
        return this.quickConnectId;
    }
    /**
     * Tags to apply to the Quick Connect. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Quick Connect. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QuickConnect(String name) {
        this(name, QuickConnectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QuickConnect(String name, QuickConnectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QuickConnect(String name, QuickConnectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/quickConnect:QuickConnect", name, args == null ? QuickConnectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QuickConnect(String name, Output<String> id, @Nullable QuickConnectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/quickConnect:QuickConnect", name, state, makeResourceOptions(options, id));
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
    public static QuickConnect get(String name, Output<String> id, @Nullable QuickConnectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new QuickConnect(name, id, state, options);
    }
}
