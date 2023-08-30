// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs;
import com.pulumi.aws.ec2.inputs.VpcIpv6CidrBlockAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to associate additional IPv6 CIDR blocks with a VPC.
 * 
 * The `aws.ec2.VpcIpv6CidrBlockAssociation` resource allows IPv6 CIDR blocks to be added to the VPC.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociation;
 * import com.pulumi.aws.ec2.VpcIpv6CidrBlockAssociationArgs;
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
 *         var testVpc = new Vpc(&#34;testVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var testVpcIpv6CidrBlockAssociation = new VpcIpv6CidrBlockAssociation(&#34;testVpcIpv6CidrBlockAssociation&#34;, VpcIpv6CidrBlockAssociationArgs.builder()        
 *             .ipv6IpamPoolId(aws_vpc_ipam_pool.test().id())
 *             .vpcId(testVpc.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_vpc_ipv6_cidr_block_association` using the VPC CIDR Association ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation example vpc-cidr-assoc-xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation")
public class VpcIpv6CidrBlockAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    @Export(name="ipv6CidrBlock", refs={String.class}, tree="[0]")
    private Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    public Output<String> ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * The ID of an IPv6 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    @Export(name="ipv6IpamPoolId", refs={String.class}, tree="[0]")
    private Output<String> ipv6IpamPoolId;

    /**
     * @return The ID of an IPv6 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    public Output<String> ipv6IpamPoolId() {
        return this.ipv6IpamPoolId;
    }
    /**
     * The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    @Export(name="ipv6NetmaskLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipv6NetmaskLength;

    /**
     * @return The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    public Output<Optional<Integer>> ipv6NetmaskLength() {
        return Codegen.optional(this.ipv6NetmaskLength);
    }
    /**
     * The ID of the VPC to make the association with.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to make the association with.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpv6CidrBlockAssociation(String name) {
        this(name, VpcIpv6CidrBlockAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpv6CidrBlockAssociation(String name, VpcIpv6CidrBlockAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpv6CidrBlockAssociation(String name, VpcIpv6CidrBlockAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation", name, args == null ? VpcIpv6CidrBlockAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpv6CidrBlockAssociation(String name, Output<String> id, @Nullable VpcIpv6CidrBlockAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv6CidrBlockAssociation:VpcIpv6CidrBlockAssociation", name, state, makeResourceOptions(options, id));
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
    public static VpcIpv6CidrBlockAssociation get(String name, Output<String> id, @Nullable VpcIpv6CidrBlockAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpv6CidrBlockAssociation(name, id, state, options);
    }
}
