// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage VPC peering connection options.
 *
 * > **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
 * both a standalone VPC Peering Connection Options and a VPC Peering Connection
 * resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
 * connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
 * Doing so will cause a conflict of options and will overwrite the options.
 * Using a VPC Peering Connection Options resource decouples management of the connection options from
 * management of the VPC Peering Connection and allows options to be set correctly in cross-region and
 * cross-account scenarios.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooVpc = new aws.ec2.Vpc("fooVpc", {cidrBlock: "10.0.0.0/16"});
 * const bar = new aws.ec2.Vpc("bar", {cidrBlock: "10.1.0.0/16"});
 * const fooVpcPeeringConnection = new aws.ec2.VpcPeeringConnection("fooVpcPeeringConnection", {
 *     vpcId: fooVpc.id,
 *     peerVpcId: bar.id,
 *     autoAccept: true,
 * });
 * const fooPeeringConnectionOptions = new aws.ec2.PeeringConnectionOptions("fooPeeringConnectionOptions", {
 *     vpcPeeringConnectionId: fooVpcPeeringConnection.id,
 *     accepter: {
 *         allowRemoteVpcDnsResolution: true,
 *     },
 *     requester: {
 *         allowVpcToRemoteClassicLink: true,
 *         allowClassicLinkToRemoteVpc: true,
 *     },
 * });
 * ```
 * ### Cross-Account Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const requester = new aws.Provider("requester", {});
 * // Requester's credentials.
 * const accepter = new aws.Provider("accepter", {});
 * // Accepter's credentials.
 * const main = new aws.ec2.Vpc("main", {
 *     cidrBlock: "10.0.0.0/16",
 *     enableDnsSupport: true,
 *     enableDnsHostnames: true,
 * }, {
 *     provider: aws.requester,
 * });
 * const peerVpc = new aws.ec2.Vpc("peerVpc", {
 *     cidrBlock: "10.1.0.0/16",
 *     enableDnsSupport: true,
 *     enableDnsHostnames: true,
 * }, {
 *     provider: aws.accepter,
 * });
 * const peerCallerIdentity = aws.getCallerIdentity({});
 * // Requester's side of the connection.
 * const peerVpcPeeringConnection = new aws.ec2.VpcPeeringConnection("peerVpcPeeringConnection", {
 *     vpcId: main.id,
 *     peerVpcId: peerVpc.id,
 *     peerOwnerId: peerCallerIdentity.then(peerCallerIdentity => peerCallerIdentity.accountId),
 *     autoAccept: false,
 *     tags: {
 *         Side: "Requester",
 *     },
 * }, {
 *     provider: aws.requester,
 * });
 * // Accepter's side of the connection.
 * const peerVpcPeeringConnectionAccepter = new aws.ec2.VpcPeeringConnectionAccepter("peerVpcPeeringConnectionAccepter", {
 *     vpcPeeringConnectionId: peerVpcPeeringConnection.id,
 *     autoAccept: true,
 *     tags: {
 *         Side: "Accepter",
 *     },
 * }, {
 *     provider: aws.accepter,
 * });
 * const requesterPeeringConnectionOptions = new aws.ec2.PeeringConnectionOptions("requesterPeeringConnectionOptions", {
 *     vpcPeeringConnectionId: peerVpcPeeringConnectionAccepter.id,
 *     requester: {
 *         allowRemoteVpcDnsResolution: true,
 *     },
 * }, {
 *     provider: aws.requester,
 * });
 * const accepterPeeringConnectionOptions = new aws.ec2.PeeringConnectionOptions("accepterPeeringConnectionOptions", {
 *     vpcPeeringConnectionId: peerVpcPeeringConnectionAccepter.id,
 *     accepter: {
 *         allowRemoteVpcDnsResolution: true,
 *     },
 * }, {
 *     provider: aws.accepter,
 * });
 * ```
 *
 * ## Import
 *
 * VPC Peering Connection Options can be imported using the `vpc peering id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2/peeringConnectionOptions:PeeringConnectionOptions foo pcx-111aaa111
 * ```
 */
export class PeeringConnectionOptions extends pulumi.CustomResource {
    /**
     * Get an existing PeeringConnectionOptions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PeeringConnectionOptionsState, opts?: pulumi.CustomResourceOptions): PeeringConnectionOptions {
        return new PeeringConnectionOptions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/peeringConnectionOptions:PeeringConnectionOptions';

    /**
     * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PeeringConnectionOptions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PeeringConnectionOptions.__pulumiType;
    }

    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     */
    public readonly accepter!: pulumi.Output<outputs.ec2.PeeringConnectionOptionsAccepter>;
    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     */
    public readonly requester!: pulumi.Output<outputs.ec2.PeeringConnectionOptionsRequester>;
    /**
     * The ID of the requester VPC peering connection.
     */
    public readonly vpcPeeringConnectionId!: pulumi.Output<string>;

    /**
     * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PeeringConnectionOptionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PeeringConnectionOptionsArgs | PeeringConnectionOptionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PeeringConnectionOptionsState | undefined;
            resourceInputs["accepter"] = state ? state.accepter : undefined;
            resourceInputs["requester"] = state ? state.requester : undefined;
            resourceInputs["vpcPeeringConnectionId"] = state ? state.vpcPeeringConnectionId : undefined;
        } else {
            const args = argsOrState as PeeringConnectionOptionsArgs | undefined;
            if ((!args || args.vpcPeeringConnectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcPeeringConnectionId'");
            }
            resourceInputs["accepter"] = args ? args.accepter : undefined;
            resourceInputs["requester"] = args ? args.requester : undefined;
            resourceInputs["vpcPeeringConnectionId"] = args ? args.vpcPeeringConnectionId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PeeringConnectionOptions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PeeringConnectionOptions resources.
 */
export interface PeeringConnectionOptionsState {
    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     */
    accepter?: pulumi.Input<inputs.ec2.PeeringConnectionOptionsAccepter>;
    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     */
    requester?: pulumi.Input<inputs.ec2.PeeringConnectionOptionsRequester>;
    /**
     * The ID of the requester VPC peering connection.
     */
    vpcPeeringConnectionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PeeringConnectionOptions resource.
 */
export interface PeeringConnectionOptionsArgs {
    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     */
    accepter?: pulumi.Input<inputs.ec2.PeeringConnectionOptionsAccepter>;
    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     */
    requester?: pulumi.Input<inputs.ec2.PeeringConnectionOptionsRequester>;
    /**
     * The ID of the requester VPC peering connection.
     */
    vpcPeeringConnectionId: pulumi.Input<string>;
}
