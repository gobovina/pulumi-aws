// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs;
import com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorState;
import com.pulumi.aws.globalaccelerator.outputs.CustomRoutingAcceleratorAttributes;
import com.pulumi.aws.globalaccelerator.outputs.CustomRoutingAcceleratorIpSet;
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
 * Creates a Global Accelerator custom routing accelerator.
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
 * import com.pulumi.aws.globalaccelerator.CustomRoutingAccelerator;
 * import com.pulumi.aws.globalaccelerator.CustomRoutingAcceleratorArgs;
 * import com.pulumi.aws.globalaccelerator.inputs.CustomRoutingAcceleratorAttributesArgs;
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
 *         var example = new CustomRoutingAccelerator(&#34;example&#34;, CustomRoutingAcceleratorArgs.builder()        
 *             .name(&#34;Example&#34;)
 *             .ipAddressType(&#34;IPV4&#34;)
 *             .ipAddresses(&#34;1.2.3.4&#34;)
 *             .enabled(true)
 *             .attributes(CustomRoutingAcceleratorAttributesArgs.builder()
 *                 .flowLogsEnabled(true)
 *                 .flowLogsS3Bucket(&#34;example-bucket&#34;)
 *                 .flowLogsS3Prefix(&#34;flow-logs/&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Global Accelerator custom routing accelerators using the `arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator")
public class CustomRoutingAccelerator extends com.pulumi.resources.CustomResource {
    /**
     * The attributes of the accelerator. Fields documented below.
     * 
     */
    @Export(name="attributes", refs={CustomRoutingAcceleratorAttributes.class}, tree="[0]")
    private Output</* @Nullable */ CustomRoutingAcceleratorAttributes> attributes;

    /**
     * @return The attributes of the accelerator. Fields documented below.
     * 
     */
    public Output<Optional<CustomRoutingAcceleratorAttributes>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * -  The Global Accelerator Route 53 zone ID that can be used to
     *    route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
     *    is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
     * 
     */
    @Export(name="hostedZoneId", refs={String.class}, tree="[0]")
    private Output<String> hostedZoneId;

    /**
     * @return -  The Global Accelerator Route 53 zone ID that can be used to
     * route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
     * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The IP address type that an accelerator supports. For a custom routing accelerator, the value must be `&#34;IPV4&#34;`.
     * 
     */
    @Export(name="ipAddressType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipAddressType;

    /**
     * @return The IP address type that an accelerator supports. For a custom routing accelerator, the value must be `&#34;IPV4&#34;`.
     * 
     */
    public Output<Optional<String>> ipAddressType() {
        return Codegen.optional(this.ipAddressType);
    }
    /**
     * The IP addresses to use for BYOIP accelerators. If not specified, the service assigns IP addresses. Valid values: 1 or 2 IPv4 addresses.
     * 
     */
    @Export(name="ipAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipAddresses;

    /**
     * @return The IP addresses to use for BYOIP accelerators. If not specified, the service assigns IP addresses. Valid values: 1 or 2 IPv4 addresses.
     * 
     */
    public Output<Optional<List<String>>> ipAddresses() {
        return Codegen.optional(this.ipAddresses);
    }
    /**
     * IP address set associated with the accelerator.
     * 
     */
    @Export(name="ipSets", refs={List.class,CustomRoutingAcceleratorIpSet.class}, tree="[0,1]")
    private Output<List<CustomRoutingAcceleratorIpSet>> ipSets;

    /**
     * @return IP address set associated with the accelerator.
     * 
     */
    public Output<List<CustomRoutingAcceleratorIpSet>> ipSets() {
        return this.ipSets;
    }
    /**
     * The name of a custom routing accelerator.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of a custom routing accelerator.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public CustomRoutingAccelerator(String name) {
        this(name, CustomRoutingAcceleratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomRoutingAccelerator(String name, @Nullable CustomRoutingAcceleratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomRoutingAccelerator(String name, @Nullable CustomRoutingAcceleratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator", name, args == null ? CustomRoutingAcceleratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomRoutingAccelerator(String name, Output<String> id, @Nullable CustomRoutingAcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator", name, state, makeResourceOptions(options, id));
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
    public static CustomRoutingAccelerator get(String name, Output<String> id, @Nullable CustomRoutingAcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomRoutingAccelerator(name, id, state, options);
    }
}
