// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs;
import com.pulumi.aws.ec2transitgateway.inputs.VpcAttachmentState;
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
 * Manages an EC2 Transit Gateway VPC Attachment. For examples of custom route table association and propagation, see the EC2 Transit Gateway Networking Examples Guide.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachment;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs;
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
 *         var example = new VpcAttachment(&#34;example&#34;, VpcAttachmentArgs.builder()        
 *             .subnetIds(exampleAwsSubnet.id())
 *             .transitGatewayId(exampleAwsEc2TransitGateway.id())
 *             .vpcId(exampleAwsVpc.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_ec2_transit_gateway_vpc_attachment` using the EC2 Transit Gateway Attachment identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/vpcAttachment:VpcAttachment example tgw-attach-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/vpcAttachment:VpcAttachment")
public class VpcAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="applianceModeSupport", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applianceModeSupport;

    /**
     * @return Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> applianceModeSupport() {
        return Codegen.optional(this.applianceModeSupport);
    }
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Export(name="dnsSupport", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dnsSupport;

    /**
     * @return Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output<Optional<String>> dnsSupport() {
        return Codegen.optional(this.dnsSupport);
    }
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="ipv6Support", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv6Support;

    /**
     * @return Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> ipv6Support() {
        return Codegen.optional(this.ipv6Support);
    }
    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return Identifiers of EC2 Subnets.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @Export(name="transitGatewayDefaultRouteTableAssociation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> transitGatewayDefaultRouteTableAssociation;

    /**
     * @return Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    public Output<Boolean> transitGatewayDefaultRouteTableAssociation() {
        return this.transitGatewayDefaultRouteTableAssociation;
    }
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @Export(name="transitGatewayDefaultRouteTablePropagation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> transitGatewayDefaultRouteTablePropagation;

    /**
     * @return Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    public Output<Boolean> transitGatewayDefaultRouteTablePropagation() {
        return this.transitGatewayDefaultRouteTablePropagation;
    }
    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Export(name="transitGatewayId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * Identifier of EC2 VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Identifier of EC2 VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    @Export(name="vpcOwnerId", refs={String.class}, tree="[0]")
    private Output<String> vpcOwnerId;

    /**
     * @return Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    public Output<String> vpcOwnerId() {
        return this.vpcOwnerId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcAttachment(String name) {
        this(name, VpcAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcAttachment(String name, VpcAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcAttachment(String name, VpcAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, args == null ? VpcAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcAttachment(String name, Output<String> id, @Nullable VpcAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, state, makeResourceOptions(options, id));
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
    public static VpcAttachment get(String name, Output<String> id, @Nullable VpcAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcAttachment(name, id, state, options);
    }
}
