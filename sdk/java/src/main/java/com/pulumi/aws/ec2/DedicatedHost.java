// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.DedicatedHostArgs;
import com.pulumi.aws.ec2.inputs.DedicatedHostState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EC2 Host resource. This allows Dedicated Hosts to be allocated, modified, and released.
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
 * import com.pulumi.aws.ec2.DedicatedHost;
 * import com.pulumi.aws.ec2.DedicatedHostArgs;
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
 *         var test = new DedicatedHost(&#34;test&#34;, DedicatedHostArgs.builder()        
 *             .instanceType(&#34;c5.18xlarge&#34;)
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .hostRecovery(&#34;on&#34;)
 *             .autoPlacement(&#34;on&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import hosts using the host `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/dedicatedHost:DedicatedHost example h-0385a99d0e4b20cbb
 * ```
 * 
 */
@ResourceType(type="aws:ec2/dedicatedHost:DedicatedHost")
public class DedicatedHost extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Dedicated Host.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Dedicated Host.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the Outpost hardware asset on which to allocate the Dedicated Hosts. This parameter is supported only if you specify OutpostArn. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * 
     */
    @Export(name="assetId", refs={String.class}, tree="[0]")
    private Output<String> assetId;

    /**
     * @return The ID of the Outpost hardware asset on which to allocate the Dedicated Hosts. This parameter is supported only if you specify OutpostArn. If you are allocating the Dedicated Hosts in a Region, omit this parameter.
     * 
     */
    public Output<String> assetId() {
        return this.assetId;
    }
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    @Export(name="autoPlacement", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoPlacement;

    /**
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    public Output<Optional<String>> autoPlacement() {
        return Codegen.optional(this.autoPlacement);
    }
    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    @Export(name="hostRecovery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostRecovery;

    /**
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    public Output<Optional<String>> hostRecovery() {
        return Codegen.optional(this.hostRecovery);
    }
    /**
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Export(name="instanceFamily", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceFamily;

    /**
     * @return Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Output<Optional<String>> instanceFamily() {
        return Codegen.optional(this.instanceFamily);
    }
    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS Outpost on which to allocate the Dedicated Host.
     * 
     */
    @Export(name="outpostArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS Outpost on which to allocate the Dedicated Host.
     * 
     */
    public Output<Optional<String>> outpostArn() {
        return Codegen.optional(this.outpostArn);
    }
    /**
     * The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the Dedicated Host.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public DedicatedHost(String name) {
        this(name, DedicatedHostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHost(String name, DedicatedHostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHost(String name, DedicatedHostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/dedicatedHost:DedicatedHost", name, args == null ? DedicatedHostArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedHost(String name, Output<String> id, @Nullable DedicatedHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/dedicatedHost:DedicatedHost", name, state, makeResourceOptions(options, id));
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
    public static DedicatedHost get(String name, Output<String> id, @Nullable DedicatedHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHost(name, id, state, options);
    }
}
