// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the accepter's side of an EC2 Transit Gateway VPC Attachment.
 *
 * When a cross-account (requester's AWS account differs from the accepter's AWS account) EC2 Transit Gateway VPC Attachment
 * is created, an EC2 Transit Gateway VPC Attachment resource is automatically created in the accepter's account.
 * The requester can use the `aws.ec2transitgateway.VpcAttachment` resource to manage its side of the connection
 * and the accepter can use the `aws.ec2transitgateway.VpcAttachmentAccepter` resource to "adopt" its side of the
 * connection into management.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.VpcAttachmentAccepter("example", {
 *     transitGatewayAttachmentId: exampleAwsEc2TransitGatewayVpcAttachment.id,
 *     tags: {
 *         Name: "Example cross-account attachment",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_vpc_attachment_accepter` using the EC2 Transit Gateway Attachment identifier. For example:
 *
 * ```sh
 * $ pulumi import aws:ec2transitgateway/vpcAttachmentAccepter:VpcAttachmentAccepter example tgw-attach-12345678
 * ```
 */
export class VpcAttachmentAccepter extends pulumi.CustomResource {
    /**
     * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcAttachmentAccepterState, opts?: pulumi.CustomResourceOptions): VpcAttachmentAccepter {
        return new VpcAttachmentAccepter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/vpcAttachmentAccepter:VpcAttachmentAccepter';

    /**
     * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcAttachmentAccepter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcAttachmentAccepter.__pulumiType;
    }

    /**
     * Whether Appliance Mode support is enabled. Valid values: `disable`, `enable`.
     */
    public /*out*/ readonly applianceModeSupport!: pulumi.Output<string>;
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`.
     */
    public /*out*/ readonly dnsSupport!: pulumi.Output<string>;
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
     */
    public /*out*/ readonly ipv6Support!: pulumi.Output<string>;
    /**
     * Identifiers of EC2 Subnets.
     */
    public /*out*/ readonly subnetIds!: pulumi.Output<string[]>;
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
     * The ID of the EC2 Transit Gateway Attachment to manage.
     */
    public readonly transitGatewayAttachmentId!: pulumi.Output<string>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
     */
    public readonly transitGatewayDefaultRouteTableAssociation!: pulumi.Output<boolean | undefined>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
     */
    public readonly transitGatewayDefaultRouteTablePropagation!: pulumi.Output<boolean | undefined>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    public /*out*/ readonly transitGatewayId!: pulumi.Output<string>;
    /**
     * Identifier of EC2 VPC.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     */
    public /*out*/ readonly vpcOwnerId!: pulumi.Output<string>;

    /**
     * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcAttachmentAccepterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcAttachmentAccepterArgs | VpcAttachmentAccepterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcAttachmentAccepterState | undefined;
            resourceInputs["applianceModeSupport"] = state ? state.applianceModeSupport : undefined;
            resourceInputs["dnsSupport"] = state ? state.dnsSupport : undefined;
            resourceInputs["ipv6Support"] = state ? state.ipv6Support : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transitGatewayAttachmentId"] = state ? state.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayDefaultRouteTableAssociation"] = state ? state.transitGatewayDefaultRouteTableAssociation : undefined;
            resourceInputs["transitGatewayDefaultRouteTablePropagation"] = state ? state.transitGatewayDefaultRouteTablePropagation : undefined;
            resourceInputs["transitGatewayId"] = state ? state.transitGatewayId : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcOwnerId"] = state ? state.vpcOwnerId : undefined;
        } else {
            const args = argsOrState as VpcAttachmentAccepterArgs | undefined;
            if ((!args || args.transitGatewayAttachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayAttachmentId'");
            }
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitGatewayAttachmentId"] = args ? args.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayDefaultRouteTableAssociation"] = args ? args.transitGatewayDefaultRouteTableAssociation : undefined;
            resourceInputs["transitGatewayDefaultRouteTablePropagation"] = args ? args.transitGatewayDefaultRouteTablePropagation : undefined;
            resourceInputs["applianceModeSupport"] = undefined /*out*/;
            resourceInputs["dnsSupport"] = undefined /*out*/;
            resourceInputs["ipv6Support"] = undefined /*out*/;
            resourceInputs["subnetIds"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["transitGatewayId"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
            resourceInputs["vpcOwnerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcAttachmentAccepter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcAttachmentAccepter resources.
 */
export interface VpcAttachmentAccepterState {
    /**
     * Whether Appliance Mode support is enabled. Valid values: `disable`, `enable`.
     */
    applianceModeSupport?: pulumi.Input<string>;
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`.
     */
    dnsSupport?: pulumi.Input<string>;
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
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
     * The ID of the EC2 Transit Gateway Attachment to manage.
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
     */
    transitGatewayDefaultRouteTableAssociation?: pulumi.Input<boolean>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
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
 * The set of arguments for constructing a VpcAttachmentAccepter resource.
 */
export interface VpcAttachmentAccepterArgs {
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the EC2 Transit Gateway Attachment to manage.
     */
    transitGatewayAttachmentId: pulumi.Input<string>;
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
     */
    transitGatewayDefaultRouteTableAssociation?: pulumi.Input<boolean>;
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
     */
    transitGatewayDefaultRouteTablePropagation?: pulumi.Input<boolean>;
}
