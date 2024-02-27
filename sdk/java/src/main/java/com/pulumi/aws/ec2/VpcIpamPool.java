// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcIpamPoolArgs;
import com.pulumi.aws.ec2.inputs.VpcIpamPoolState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IP address pool resource for IPAM.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.ec2.VpcIpam;
 * import com.pulumi.aws.ec2.VpcIpamArgs;
 * import com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs;
 * import com.pulumi.aws.ec2.VpcIpamPool;
 * import com.pulumi.aws.ec2.VpcIpamPoolArgs;
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
 *         final var current = AwsFunctions.getRegion();
 * 
 *         var exampleVpcIpam = new VpcIpam(&#34;exampleVpcIpam&#34;, VpcIpamArgs.builder()        
 *             .operatingRegions(VpcIpamOperatingRegionArgs.builder()
 *                 .regionName(current.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *                 .build())
 *             .build());
 * 
 *         var exampleVpcIpamPool = new VpcIpamPool(&#34;exampleVpcIpamPool&#34;, VpcIpamPoolArgs.builder()        
 *             .addressFamily(&#34;ipv4&#34;)
 *             .ipamScopeId(exampleVpcIpam.privateDefaultScopeId())
 *             .locale(current.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Nested Pools:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.ec2.VpcIpam;
 * import com.pulumi.aws.ec2.VpcIpamArgs;
 * import com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionArgs;
 * import com.pulumi.aws.ec2.VpcIpamPool;
 * import com.pulumi.aws.ec2.VpcIpamPoolArgs;
 * import com.pulumi.aws.ec2.VpcIpamPoolCidr;
 * import com.pulumi.aws.ec2.VpcIpamPoolCidrArgs;
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
 *         final var current = AwsFunctions.getRegion();
 * 
 *         var example = new VpcIpam(&#34;example&#34;, VpcIpamArgs.builder()        
 *             .operatingRegions(VpcIpamOperatingRegionArgs.builder()
 *                 .regionName(current.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *                 .build())
 *             .build());
 * 
 *         var parent = new VpcIpamPool(&#34;parent&#34;, VpcIpamPoolArgs.builder()        
 *             .addressFamily(&#34;ipv4&#34;)
 *             .ipamScopeId(example.privateDefaultScopeId())
 *             .build());
 * 
 *         var parentTest = new VpcIpamPoolCidr(&#34;parentTest&#34;, VpcIpamPoolCidrArgs.builder()        
 *             .ipamPoolId(parent.id())
 *             .cidr(&#34;172.20.0.0/16&#34;)
 *             .build());
 * 
 *         var child = new VpcIpamPool(&#34;child&#34;, VpcIpamPoolArgs.builder()        
 *             .addressFamily(&#34;ipv4&#34;)
 *             .ipamScopeId(example.privateDefaultScopeId())
 *             .locale(current.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *             .sourceIpamPoolId(parent.id())
 *             .build());
 * 
 *         var childTest = new VpcIpamPoolCidr(&#34;childTest&#34;, VpcIpamPoolCidrArgs.builder()        
 *             .ipamPoolId(child.id())
 *             .cidr(&#34;172.20.0.0/24&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IPAMs using the IPAM pool `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamPool:VpcIpamPool example ipam-pool-0958f95207d978e1e
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamPool:VpcIpamPool")
public class VpcIpamPool extends com.pulumi.resources.CustomResource {
    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * 
     */
    @Export(name="addressFamily", refs={String.class}, tree="[0]")
    private Output<String> addressFamily;

    /**
     * @return The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     * 
     */
    @Export(name="allocationDefaultNetmaskLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> allocationDefaultNetmaskLength;

    /**
     * @return A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     * 
     */
    public Output<Optional<Integer>> allocationDefaultNetmaskLength() {
        return Codegen.optional(this.allocationDefaultNetmaskLength);
    }
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @Export(name="allocationMaxNetmaskLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> allocationMaxNetmaskLength;

    /**
     * @return The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    public Output<Optional<Integer>> allocationMaxNetmaskLength() {
        return Codegen.optional(this.allocationMaxNetmaskLength);
    }
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @Export(name="allocationMinNetmaskLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> allocationMinNetmaskLength;

    /**
     * @return The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    public Output<Optional<Integer>> allocationMinNetmaskLength() {
        return Codegen.optional(this.allocationMinNetmaskLength);
    }
    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     * 
     */
    @Export(name="allocationResourceTags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> allocationResourceTags;

    /**
     * @return Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     * 
     */
    public Output<Optional<Map<String,String>>> allocationResourceTags() {
        return Codegen.optional(this.allocationResourceTags);
    }
    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of IPAM
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     * 
     */
    @Export(name="autoImport", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoImport;

    /**
     * @return If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     * 
     */
    public Output<Optional<Boolean>> autoImport() {
        return Codegen.optional(this.autoImport);
    }
    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     * 
     */
    @Export(name="awsService", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsService;

    /**
     * @return Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     * 
     */
    public Output<Optional<String>> awsService() {
        return Codegen.optional(this.awsService);
    }
    /**
     * A description for the IPAM pool.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the IPAM pool.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     * 
     */
    @Export(name="ipamScopeId", refs={String.class}, tree="[0]")
    private Output<String> ipamScopeId;

    /**
     * @return The ID of the scope in which you would like to create the IPAM pool.
     * 
     */
    public Output<String> ipamScopeId() {
        return this.ipamScopeId;
    }
    @Export(name="ipamScopeType", refs={String.class}, tree="[0]")
    private Output<String> ipamScopeType;

    public Output<String> ipamScopeType() {
        return this.ipamScopeType;
    }
    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. Possible values: Any AWS region, such as `us-east-1`.
     * 
     */
    @Export(name="locale", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> locale;

    /**
     * @return The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. Possible values: Any AWS region, such as `us-east-1`.
     * 
     */
    public Output<Optional<String>> locale() {
        return Codegen.optional(this.locale);
    }
    @Export(name="poolDepth", refs={Integer.class}, tree="[0]")
    private Output<Integer> poolDepth;

    public Output<Integer> poolDepth() {
        return this.poolDepth;
    }
    /**
     * The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
     * 
     */
    @Export(name="publicIpSource", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicIpSource;

    /**
     * @return The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
     * 
     */
    public Output<Optional<String>> publicIpSource() {
        return Codegen.optional(this.publicIpSource);
    }
    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `address_family = &#34;ipv6&#34;` and `public_ip_source = &#34;byoip&#34;`, default is `false`. This option is not available for IPv4 pool space or if `public_ip_source = &#34;amazon&#34;`.
     * 
     */
    @Export(name="publiclyAdvertisable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publiclyAdvertisable;

    /**
     * @return Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `address_family = &#34;ipv6&#34;` and `public_ip_source = &#34;byoip&#34;`, default is `false`. This option is not available for IPv4 pool space or if `public_ip_source = &#34;amazon&#34;`.
     * 
     */
    public Output<Optional<Boolean>> publiclyAdvertisable() {
        return Codegen.optional(this.publiclyAdvertisable);
    }
    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     * 
     */
    @Export(name="sourceIpamPoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceIpamPoolId;

    /**
     * @return The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     * 
     */
    public Output<Optional<String>> sourceIpamPoolId() {
        return Codegen.optional(this.sourceIpamPoolId);
    }
    /**
     * The ID of the IPAM
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The ID of the IPAM
     * 
     */
    public Output<String> state() {
        return this.state;
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
    public VpcIpamPool(String name) {
        this(name, VpcIpamPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamPool(String name, VpcIpamPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamPool(String name, VpcIpamPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPool:VpcIpamPool", name, args == null ? VpcIpamPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpamPool(String name, Output<String> id, @Nullable VpcIpamPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPool:VpcIpamPool", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamPool get(String name, Output<String> id, @Nullable VpcIpamPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamPool(name, id, state, options);
    }
}
