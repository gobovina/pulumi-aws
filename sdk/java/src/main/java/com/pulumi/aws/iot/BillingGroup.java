// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.BillingGroupArgs;
import com.pulumi.aws.iot.inputs.BillingGroupState;
import com.pulumi.aws.iot.outputs.BillingGroupMetadata;
import com.pulumi.aws.iot.outputs.BillingGroupProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS IoT Billing Group.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iot.BillingGroup;
 * import com.pulumi.aws.iot.BillingGroupArgs;
 * import com.pulumi.aws.iot.inputs.BillingGroupPropertiesArgs;
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
 *         var example = new BillingGroup(&#34;example&#34;, BillingGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .properties(BillingGroupPropertiesArgs.builder()
 *                 .description(&#34;This is my billing group&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;terraform&#34;, &#34;true&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IoT Billing Groups using the name. For example:
 * 
 * ```sh
 * $ pulumi import aws:iot/billingGroup:BillingGroup example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/billingGroup:BillingGroup")
public class BillingGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Billing Group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Billing Group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="metadatas", refs={List.class,BillingGroupMetadata.class}, tree="[0,1]")
    private Output<List<BillingGroupMetadata>> metadatas;

    public Output<List<BillingGroupMetadata>> metadatas() {
        return this.metadatas;
    }
    /**
     * The name of the Billing Group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Billing Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Billing Group properties. Defined below.
     * 
     */
    @Export(name="properties", refs={BillingGroupProperties.class}, tree="[0]")
    private Output</* @Nullable */ BillingGroupProperties> properties;

    /**
     * @return The Billing Group properties. Defined below.
     * 
     */
    public Output<Optional<BillingGroupProperties>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Key-value mapping of resource tags
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The current version of the Billing Group record in the registry.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The current version of the Billing Group record in the registry.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingGroup(String name) {
        this(name, BillingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingGroup(String name, @Nullable BillingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingGroup(String name, @Nullable BillingGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/billingGroup:BillingGroup", name, args == null ? BillingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingGroup(String name, Output<String> id, @Nullable BillingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/billingGroup:BillingGroup", name, state, makeResourceOptions(options, id));
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
    public static BillingGroup get(String name, Output<String> id, @Nullable BillingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BillingGroup(name, id, state, options);
    }
}
