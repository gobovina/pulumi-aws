// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway VPC Attachment. For examples of custom route table association and propagation, see the EC2 Transit Gateway Networking Examples Guide.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.VpcAttachment("example", {
 *     subnetIds: [aws_subnet.example.id],
 *     transitGatewayId: aws_ec2_transit_gateway.example.id,
 *     vpcId: aws_vpc.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_vpc_attachment` using the EC2 Transit Gateway Attachment identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/vpcAttachment:VpcAttachment example tgw-attach-12345678
 * ```
 */
export class VpcAttachment extends pulumi.CustomResource {
    /**
     * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcAttachmentState, opts?: pulumi.CustomResourceOptions): VpcAttachment {
        return new VpcAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/vpcAttachment:VpcAttachment';

    /**
     * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcAttachment.__pulumiType;
    }

    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    public readonly applianceModeSupport!: pulumi.Output<string | undefined>;
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     */
    public readonly dnsSupport!: pulumi.Output<string | undefined>;
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    public readonly ipv6Support!: pulumi.Output<string | undefined>;
    /**
     * Identifiers of EC2 Subnets.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    public readonly transitGatewayDefaultRouteTableAssociation!: pulumi.Output<boolean>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    public readonly transitGatewayDefaultRouteTablePropagation!: pulumi.Output<boolean>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    public readonly transitGatewayId!: pulumi.Output<string>;
    /**
     * Identifier of EC2 VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     */
    public /*out*/ readonly vpcOwnerId!: pulumi.Output<string>;

    /**
     * Create a VpcAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcAttachmentArgs | VpcAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcAttachmentState | undefined;
            resourceInputs["applianceModeSupport"] = state ? state.applianceModeSupport : undefined;
            resourceInputs["dnsSupport"] = state ? state.dnsSupport : undefined;
            resourceInputs["ipv6Support"] = state ? state.ipv6Support : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transitGatewayDefaultRouteTableAssociation"] = state ? state.transitGatewayDefaultRouteTableAssociation : undefined;
            resourceInputs["transitGatewayDefaultRouteTablePropagation"] = state ? state.transitGatewayDefaultRouteTablePropagation : undefined;
            resourceInputs["transitGatewayId"] = state ? state.transitGatewayId : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcOwnerId"] = state ? state.vpcOwnerId : undefined;
        } else {
            const args = argsOrState as VpcAttachmentArgs | undefined;
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.transitGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayId'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["applianceModeSupport"] = args ? args.applianceModeSupport : undefined;
            resourceInputs["dnsSupport"] = args ? args.dnsSupport : undefined;
            resourceInputs["ipv6Support"] = args ? args.ipv6Support : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitGatewayDefaultRouteTableAssociation"] = args ? args.transitGatewayDefaultRouteTableAssociation : undefined;
            resourceInputs["transitGatewayDefaultRouteTablePropagation"] = args ? args.transitGatewayDefaultRouteTablePropagation : undefined;
            resourceInputs["transitGatewayId"] = args ? args.transitGatewayId : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["vpcOwnerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcAttachment resources.
 */
export interface VpcAttachmentState {
    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    applianceModeSupport?: pulumi.Input<string>;
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     */
    dnsSupport?: pulumi.Input<string>;
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    ipv6Support?: pulumi.Input<string>;
    /**
     * Identifiers of EC2 Subnets.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    transitGatewayDefaultRouteTableAssociation?: pulumi.Input<boolean>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    transitGatewayDefaultRouteTablePropagation?: pulumi.Input<boolean>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    transitGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     */
    vpcOwnerId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VpcAttachment resource.
 */
export interface VpcAttachmentArgs {
    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    applianceModeSupport?: pulumi.Input<string>;
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     */
    dnsSupport?: pulumi.Input<string>;
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    ipv6Support?: pulumi.Input<string>;
    /**
     * Identifiers of EC2 Subnets.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    transitGatewayDefaultRouteTableAssociation?: pulumi.Input<boolean>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     */
    transitGatewayDefaultRouteTablePropagation?: pulumi.Input<boolean>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    transitGatewayId: pulumi.Input<string>;
    /**
     * Identifier of EC2 VPC.
     */
    vpcId: pulumi.Input<string>;
}
