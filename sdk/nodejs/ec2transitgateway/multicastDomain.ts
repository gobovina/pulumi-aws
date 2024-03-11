// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway Multicast Domain.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const available = aws.getAvailabilityZones({
 *     state: "available",
 * });
 * const amazonLinux = aws.ec2.getAmi({
 *     mostRecent: true,
 *     owners: ["amazon"],
 *     filters: [
 *         {
 *             name: "name",
 *             values: ["amzn-ami-hvm-*-x86_64-gp2"],
 *         },
 *         {
 *             name: "owner-alias",
 *             values: ["amazon"],
 *         },
 *     ],
 * });
 * const vpc1 = new aws.ec2.Vpc("vpc1", {cidrBlock: "10.0.0.0/16"});
 * const vpc2 = new aws.ec2.Vpc("vpc2", {cidrBlock: "10.1.0.0/16"});
 * const subnet1 = new aws.ec2.Subnet("subnet1", {
 *     vpcId: vpc1.id,
 *     cidrBlock: "10.0.1.0/24",
 *     availabilityZone: available.then(available => available.names?.[0]),
 * });
 * const subnet2 = new aws.ec2.Subnet("subnet2", {
 *     vpcId: vpc1.id,
 *     cidrBlock: "10.0.2.0/24",
 *     availabilityZone: available.then(available => available.names?.[1]),
 * });
 * const subnet3 = new aws.ec2.Subnet("subnet3", {
 *     vpcId: vpc2.id,
 *     cidrBlock: "10.1.1.0/24",
 *     availabilityZone: available.then(available => available.names?.[0]),
 * });
 * const instance1 = new aws.ec2.Instance("instance1", {
 *     ami: amazonLinux.then(amazonLinux => amazonLinux.id),
 *     instanceType: "t2.micro",
 *     subnetId: subnet1.id,
 * });
 * const instance2 = new aws.ec2.Instance("instance2", {
 *     ami: amazonLinux.then(amazonLinux => amazonLinux.id),
 *     instanceType: "t2.micro",
 *     subnetId: subnet2.id,
 * });
 * const instance3 = new aws.ec2.Instance("instance3", {
 *     ami: amazonLinux.then(amazonLinux => amazonLinux.id),
 *     instanceType: "t2.micro",
 *     subnetId: subnet3.id,
 * });
 * const tgw = new aws.ec2transitgateway.TransitGateway("tgw", {multicastSupport: "enable"});
 * const attachment1 = new aws.ec2transitgateway.VpcAttachment("attachment1", {
 *     subnetIds: [
 *         subnet1.id,
 *         subnet2.id,
 *     ],
 *     transitGatewayId: tgw.id,
 *     vpcId: vpc1.id,
 * });
 * const attachment2 = new aws.ec2transitgateway.VpcAttachment("attachment2", {
 *     subnetIds: [subnet3.id],
 *     transitGatewayId: tgw.id,
 *     vpcId: vpc2.id,
 * });
 * const domain = new aws.ec2transitgateway.MulticastDomain("domain", {
 *     transitGatewayId: tgw.id,
 *     staticSourcesSupport: "enable",
 *     tags: {
 *         Name: "Transit_Gateway_Multicast_Domain_Example",
 *     },
 * });
 * const association3 = new aws.ec2transitgateway.MulticastDomainAssociation("association3", {
 *     subnetId: subnet3.id,
 *     transitGatewayAttachmentId: attachment2.id,
 *     transitGatewayMulticastDomainId: domain.id,
 * });
 * const source = new aws.ec2transitgateway.MulticastGroupSource("source", {
 *     groupIpAddress: "224.0.0.1",
 *     networkInterfaceId: instance3.primaryNetworkInterfaceId,
 *     transitGatewayMulticastDomainId: association3.transitGatewayMulticastDomainId,
 * });
 * const association1 = new aws.ec2transitgateway.MulticastDomainAssociation("association1", {
 *     subnetId: subnet1.id,
 *     transitGatewayAttachmentId: attachment1.id,
 *     transitGatewayMulticastDomainId: domain.id,
 * });
 * const association2 = new aws.ec2transitgateway.MulticastDomainAssociation("association2", {
 *     subnetId: subnet2.id,
 *     transitGatewayAttachmentId: attachment2.id,
 *     transitGatewayMulticastDomainId: domain.id,
 * });
 * const member1 = new aws.ec2transitgateway.MulticastGroupMember("member1", {
 *     groupIpAddress: "224.0.0.1",
 *     networkInterfaceId: instance1.primaryNetworkInterfaceId,
 *     transitGatewayMulticastDomainId: association1.transitGatewayMulticastDomainId,
 * });
 * const member2 = new aws.ec2transitgateway.MulticastGroupMember("member2", {
 *     groupIpAddress: "224.0.0.1",
 *     networkInterfaceId: instance2.primaryNetworkInterfaceId,
 *     transitGatewayMulticastDomainId: association1.transitGatewayMulticastDomainId,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_multicast_domain` using the EC2 Transit Gateway Multicast Domain identifier. For example:
 *
 * ```sh
 * $ pulumi import aws:ec2transitgateway/multicastDomain:MulticastDomain example tgw-mcast-domain-12345
 * ```
 */
export class MulticastDomain extends pulumi.CustomResource {
    /**
     * Get an existing MulticastDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MulticastDomainState, opts?: pulumi.CustomResourceOptions): MulticastDomain {
        return new MulticastDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/multicastDomain:MulticastDomain';

    /**
     * Returns true if the given object is an instance of MulticastDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MulticastDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MulticastDomain.__pulumiType;
    }

    /**
     * EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    public readonly autoAcceptSharedAssociations!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    public readonly igmpv2Support!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    public readonly staticSourcesSupport!: pulumi.Output<string | undefined>;
    /**
     * Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicastSupport` enabled.
     */
    public readonly transitGatewayId!: pulumi.Output<string>;

    /**
     * Create a MulticastDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MulticastDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MulticastDomainArgs | MulticastDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MulticastDomainState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoAcceptSharedAssociations"] = state ? state.autoAcceptSharedAssociations : undefined;
            resourceInputs["igmpv2Support"] = state ? state.igmpv2Support : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["staticSourcesSupport"] = state ? state.staticSourcesSupport : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transitGatewayId"] = state ? state.transitGatewayId : undefined;
        } else {
            const args = argsOrState as MulticastDomainArgs | undefined;
            if ((!args || args.transitGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayId'");
            }
            resourceInputs["autoAcceptSharedAssociations"] = args ? args.autoAcceptSharedAssociations : undefined;
            resourceInputs["igmpv2Support"] = args ? args.igmpv2Support : undefined;
            resourceInputs["staticSourcesSupport"] = args ? args.staticSourcesSupport : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitGatewayId"] = args ? args.transitGatewayId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MulticastDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MulticastDomain resources.
 */
export interface MulticastDomainState {
    /**
     * EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    autoAcceptSharedAssociations?: pulumi.Input<string>;
    /**
     * Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    igmpv2Support?: pulumi.Input<string>;
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    staticSourcesSupport?: pulumi.Input<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicastSupport` enabled.
     */
    transitGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MulticastDomain resource.
 */
export interface MulticastDomainArgs {
    /**
     * Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    autoAcceptSharedAssociations?: pulumi.Input<string>;
    /**
     * Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    igmpv2Support?: pulumi.Input<string>;
    /**
     * Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
     */
    staticSourcesSupport?: pulumi.Input<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicastSupport` enabled.
     */
    transitGatewayId: pulumi.Input<string>;
}
