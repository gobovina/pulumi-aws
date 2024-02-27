// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway Peering Attachment.
 * For examples of custom route table association and propagation, see the [EC2 Transit Gateway Networking Examples Guide](https://docs.aws.amazon.com/vpc/latest/tgw/TGW_Scenarios.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const local = new aws.Provider("local", {region: "us-east-1"});
 * const peer = new aws.Provider("peer", {region: "us-west-2"});
 * const peerRegion = aws.getRegion({});
 * const localTransitGateway = new aws.ec2transitgateway.TransitGateway("localTransitGateway", {tags: {
 *     Name: "Local TGW",
 * }}, {
 *     provider: aws.local,
 * });
 * const peerTransitGateway = new aws.ec2transitgateway.TransitGateway("peerTransitGateway", {tags: {
 *     Name: "Peer TGW",
 * }}, {
 *     provider: aws.peer,
 * });
 * const example = new aws.ec2transitgateway.PeeringAttachment("example", {
 *     peerAccountId: peerTransitGateway.ownerId,
 *     peerRegion: peerRegion.then(peerRegion => peerRegion.name),
 *     peerTransitGatewayId: peerTransitGateway.id,
 *     transitGatewayId: localTransitGateway.id,
 *     tags: {
 *         Name: "TGW Peering Requestor",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_peering_attachment` using the EC2 Transit Gateway Attachment identifier. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/peeringAttachment:PeeringAttachment example tgw-attach-12345678
 * ```
 */
export class PeeringAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PeeringAttachmentState, opts?: pulumi.CustomResourceOptions): PeeringAttachment {
        return new PeeringAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/peeringAttachment:PeeringAttachment';

    /**
     * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PeeringAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PeeringAttachment.__pulumiType;
    }

    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
     */
    public readonly peerAccountId!: pulumi.Output<string>;
    /**
     * Region of EC2 Transit Gateway to peer with.
     */
    public readonly peerRegion!: pulumi.Output<string>;
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     */
    public readonly peerTransitGatewayId!: pulumi.Output<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    public readonly transitGatewayId!: pulumi.Output<string>;

    /**
     * Create a PeeringAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PeeringAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PeeringAttachmentArgs | PeeringAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PeeringAttachmentState | undefined;
            resourceInputs["peerAccountId"] = state ? state.peerAccountId : undefined;
            resourceInputs["peerRegion"] = state ? state.peerRegion : undefined;
            resourceInputs["peerTransitGatewayId"] = state ? state.peerTransitGatewayId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transitGatewayId"] = state ? state.transitGatewayId : undefined;
        } else {
            const args = argsOrState as PeeringAttachmentArgs | undefined;
            if ((!args || args.peerRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerRegion'");
            }
            if ((!args || args.peerTransitGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerTransitGatewayId'");
            }
            if ((!args || args.transitGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayId'");
            }
            resourceInputs["peerAccountId"] = args ? args.peerAccountId : undefined;
            resourceInputs["peerRegion"] = args ? args.peerRegion : undefined;
            resourceInputs["peerTransitGatewayId"] = args ? args.peerTransitGatewayId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitGatewayId"] = args ? args.transitGatewayId : undefined;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PeeringAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PeeringAttachment resources.
 */
export interface PeeringAttachmentState {
    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
     */
    peerAccountId?: pulumi.Input<string>;
    /**
     * Region of EC2 Transit Gateway to peer with.
     */
    peerRegion?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     */
    peerTransitGatewayId?: pulumi.Input<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    transitGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PeeringAttachment resource.
 */
export interface PeeringAttachmentArgs {
    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
     */
    peerAccountId?: pulumi.Input<string>;
    /**
     * Region of EC2 Transit Gateway to peer with.
     */
    peerRegion: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     */
    peerTransitGatewayId: pulumi.Input<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Identifier of EC2 Transit Gateway.
     */
    transitGatewayId: pulumi.Input<string>;
}
