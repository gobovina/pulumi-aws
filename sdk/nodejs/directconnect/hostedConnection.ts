// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects. Intended for use by AWS Direct Connect Partners only.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const hosted = new aws.directconnect.HostedConnection("hosted", {
 *     connectionId: "dxcon-ffabc123",
 *     bandwidth: "100Mbps",
 *     name: "tf-dx-hosted-connection",
 *     ownerAccountId: "123456789012",
 *     vlan: 1,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class HostedConnection extends pulumi.CustomResource {
    /**
     * Get an existing HostedConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostedConnectionState, opts?: pulumi.CustomResourceOptions): HostedConnection {
        return new HostedConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:directconnect/hostedConnection:HostedConnection';

    /**
     * Returns true if the given object is an instance of HostedConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HostedConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HostedConnection.__pulumiType;
    }

    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     */
    public /*out*/ readonly awsDevice!: pulumi.Output<string>;
    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     */
    public readonly bandwidth!: pulumi.Output<string>;
    /**
     * The ID of the interconnect or LAG.
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     */
    public /*out*/ readonly hasLogicalRedundancy!: pulumi.Output<string>;
    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     */
    public /*out*/ readonly jumboFrameCapable!: pulumi.Output<boolean>;
    /**
     * The ID of the LAG.
     */
    public /*out*/ readonly lagId!: pulumi.Output<string>;
    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     */
    public /*out*/ readonly loaIssueTime!: pulumi.Output<string>;
    /**
     * The location of the connection.
     */
    public /*out*/ readonly location!: pulumi.Output<string>;
    /**
     * The name of the connection.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the AWS account of the customer for the connection.
     */
    public readonly ownerAccountId!: pulumi.Output<string>;
    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     */
    public /*out*/ readonly partnerName!: pulumi.Output<string>;
    /**
     * The name of the service provider associated with the connection.
     */
    public /*out*/ readonly providerName!: pulumi.Output<string>;
    /**
     * The AWS Region where the connection is located.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The dedicated VLAN provisioned to the hosted connection.
     */
    public readonly vlan!: pulumi.Output<number>;

    /**
     * Create a HostedConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostedConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostedConnectionArgs | HostedConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostedConnectionState | undefined;
            resourceInputs["awsDevice"] = state ? state.awsDevice : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["hasLogicalRedundancy"] = state ? state.hasLogicalRedundancy : undefined;
            resourceInputs["jumboFrameCapable"] = state ? state.jumboFrameCapable : undefined;
            resourceInputs["lagId"] = state ? state.lagId : undefined;
            resourceInputs["loaIssueTime"] = state ? state.loaIssueTime : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerAccountId"] = state ? state.ownerAccountId : undefined;
            resourceInputs["partnerName"] = state ? state.partnerName : undefined;
            resourceInputs["providerName"] = state ? state.providerName : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["vlan"] = state ? state.vlan : undefined;
        } else {
            const args = argsOrState as HostedConnectionArgs | undefined;
            if ((!args || args.bandwidth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.ownerAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ownerAccountId'");
            }
            if ((!args || args.vlan === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vlan'");
            }
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerAccountId"] = args ? args.ownerAccountId : undefined;
            resourceInputs["vlan"] = args ? args.vlan : undefined;
            resourceInputs["awsDevice"] = undefined /*out*/;
            resourceInputs["hasLogicalRedundancy"] = undefined /*out*/;
            resourceInputs["jumboFrameCapable"] = undefined /*out*/;
            resourceInputs["lagId"] = undefined /*out*/;
            resourceInputs["loaIssueTime"] = undefined /*out*/;
            resourceInputs["location"] = undefined /*out*/;
            resourceInputs["partnerName"] = undefined /*out*/;
            resourceInputs["providerName"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HostedConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HostedConnection resources.
 */
export interface HostedConnectionState {
    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     */
    awsDevice?: pulumi.Input<string>;
    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     */
    bandwidth?: pulumi.Input<string>;
    /**
     * The ID of the interconnect or LAG.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     */
    hasLogicalRedundancy?: pulumi.Input<string>;
    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     */
    jumboFrameCapable?: pulumi.Input<boolean>;
    /**
     * The ID of the LAG.
     */
    lagId?: pulumi.Input<string>;
    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     */
    loaIssueTime?: pulumi.Input<string>;
    /**
     * The location of the connection.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the AWS account of the customer for the connection.
     */
    ownerAccountId?: pulumi.Input<string>;
    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     */
    partnerName?: pulumi.Input<string>;
    /**
     * The name of the service provider associated with the connection.
     */
    providerName?: pulumi.Input<string>;
    /**
     * The AWS Region where the connection is located.
     */
    region?: pulumi.Input<string>;
    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     */
    state?: pulumi.Input<string>;
    /**
     * The dedicated VLAN provisioned to the hosted connection.
     */
    vlan?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a HostedConnection resource.
 */
export interface HostedConnectionArgs {
    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     */
    bandwidth: pulumi.Input<string>;
    /**
     * The ID of the interconnect or LAG.
     */
    connectionId: pulumi.Input<string>;
    /**
     * The name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the AWS account of the customer for the connection.
     */
    ownerAccountId: pulumi.Input<string>;
    /**
     * The dedicated VLAN provisioned to the hosted connection.
     */
    vlan: pulumi.Input<number>;
}
