// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs;
import com.pulumi.aws.ec2.inputs.VpcIpv4CidrBlockAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to associate additional IPv4 CIDR blocks with a VPC.
 * 
 * When a VPC is created, a primary IPv4 CIDR block for the VPC must be specified.
 * The `aws.ec2.VpcIpv4CidrBlockAssociation` resource allows further IPv4 CIDR blocks to be added to the VPC.
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
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociation;
 * import com.pulumi.aws.ec2.VpcIpv4CidrBlockAssociationArgs;
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
 *         var main = new Vpc("main", VpcArgs.builder()
 *             .cidrBlock("10.0.0.0/16")
 *             .build());
 * 
 *         var secondaryCidr = new VpcIpv4CidrBlockAssociation("secondaryCidr", VpcIpv4CidrBlockAssociationArgs.builder()
 *             .vpcId(main.id())
 *             .cidrBlock("172.20.0.0/16")
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
 * Using `pulumi import`, import `aws_vpc_ipv4_cidr_block_association` using the VPC CIDR Association ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/vpcIpv4CidrBlockAssociation:VpcIpv4CidrBlockAssociation example vpc-cidr-assoc-xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpv4CidrBlockAssociation:VpcIpv4CidrBlockAssociation")
public class VpcIpv4CidrBlockAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    @Export(name="cidrBlock", refs={String.class}, tree="[0]")
    private Output<String> cidrBlock;

    /**
     * @return The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    @Export(name="ipv4IpamPoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4IpamPoolId;

    /**
     * @return The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    public Output<Optional<String>> ipv4IpamPoolId() {
        return Codegen.optional(this.ipv4IpamPoolId);
    }
    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    @Export(name="ipv4NetmaskLength", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipv4NetmaskLength;

    /**
     * @return The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    public Output<Optional<Integer>> ipv4NetmaskLength() {
        return Codegen.optional(this.ipv4NetmaskLength);
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
    public VpcIpv4CidrBlockAssociation(String name) {
        this(name, VpcIpv4CidrBlockAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpv4CidrBlockAssociation(String name, VpcIpv4CidrBlockAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpv4CidrBlockAssociation(String name, VpcIpv4CidrBlockAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv4CidrBlockAssociation:VpcIpv4CidrBlockAssociation", name, args == null ? VpcIpv4CidrBlockAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpv4CidrBlockAssociation(String name, Output<String> id, @Nullable VpcIpv4CidrBlockAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpv4CidrBlockAssociation:VpcIpv4CidrBlockAssociation", name, state, makeResourceOptions(options, id));
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
    public static VpcIpv4CidrBlockAssociation get(String name, Output<String> id, @Nullable VpcIpv4CidrBlockAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpv4CidrBlockAssociation(name, id, state, options);
    }
}
