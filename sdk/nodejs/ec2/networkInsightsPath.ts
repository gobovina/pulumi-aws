// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Network Insights Path resource. Part of the "Reachability Analyzer" service in the AWS VPC console.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.ec2.NetworkInsightsPath("test", {
 *     source: source.id,
 *     destination: destination.id,
 *     protocol: "tcp",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Network Insights Paths using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/networkInsightsPath:NetworkInsightsPath test nip-00edfba169923aefd
 * ```
 */
export class NetworkInsightsPath extends pulumi.CustomResource {
    /**
     * Get an existing NetworkInsightsPath resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkInsightsPathState, opts?: pulumi.CustomResourceOptions): NetworkInsightsPath {
        return new NetworkInsightsPath(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/networkInsightsPath:NetworkInsightsPath';

    /**
     * Returns true if the given object is an instance of NetworkInsightsPath.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkInsightsPath {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkInsightsPath.__pulumiType;
    }

    /**
     * ARN of the Network Insights Path.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ID or ARN of the resource which is the destination of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    public readonly destination!: pulumi.Output<string>;
    /**
     * ARN of the destination.
     */
    public /*out*/ readonly destinationArn!: pulumi.Output<string>;
    /**
     * IP address of the destination resource.
     */
    public readonly destinationIp!: pulumi.Output<string | undefined>;
    /**
     * Destination port to analyze access to.
     */
    public readonly destinationPort!: pulumi.Output<number | undefined>;
    /**
     * Protocol to use for analysis. Valid options are `tcp` or `udp`.
     *
     * The following arguments are optional:
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * ID or ARN of the resource which is the source of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * ARN of the source.
     */
    public /*out*/ readonly sourceArn!: pulumi.Output<string>;
    /**
     * IP address of the source resource.
     */
    public readonly sourceIp!: pulumi.Output<string | undefined>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a NetworkInsightsPath resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkInsightsPathArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkInsightsPathArgs | NetworkInsightsPathState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkInsightsPathState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["destination"] = state ? state.destination : undefined;
            resourceInputs["destinationArn"] = state ? state.destinationArn : undefined;
            resourceInputs["destinationIp"] = state ? state.destinationIp : undefined;
            resourceInputs["destinationPort"] = state ? state.destinationPort : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["sourceArn"] = state ? state.sourceArn : undefined;
            resourceInputs["sourceIp"] = state ? state.sourceIp : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as NetworkInsightsPathArgs | undefined;
            if ((!args || args.destination === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destination'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            resourceInputs["destination"] = args ? args.destination : undefined;
            resourceInputs["destinationIp"] = args ? args.destinationIp : undefined;
            resourceInputs["destinationPort"] = args ? args.destinationPort : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["sourceIp"] = args ? args.sourceIp : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["destinationArn"] = undefined /*out*/;
            resourceInputs["sourceArn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkInsightsPath.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkInsightsPath resources.
 */
export interface NetworkInsightsPathState {
    /**
     * ARN of the Network Insights Path.
     */
    arn?: pulumi.Input<string>;
    /**
     * ID or ARN of the resource which is the destination of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    destination?: pulumi.Input<string>;
    /**
     * ARN of the destination.
     */
    destinationArn?: pulumi.Input<string>;
    /**
     * IP address of the destination resource.
     */
    destinationIp?: pulumi.Input<string>;
    /**
     * Destination port to analyze access to.
     */
    destinationPort?: pulumi.Input<number>;
    /**
     * Protocol to use for analysis. Valid options are `tcp` or `udp`.
     *
     * The following arguments are optional:
     */
    protocol?: pulumi.Input<string>;
    /**
     * ID or ARN of the resource which is the source of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    source?: pulumi.Input<string>;
    /**
     * ARN of the source.
     */
    sourceArn?: pulumi.Input<string>;
    /**
     * IP address of the source resource.
     */
    sourceIp?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a NetworkInsightsPath resource.
 */
export interface NetworkInsightsPathArgs {
    /**
     * ID or ARN of the resource which is the destination of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    destination: pulumi.Input<string>;
    /**
     * IP address of the destination resource.
     */
    destinationIp?: pulumi.Input<string>;
    /**
     * Destination port to analyze access to.
     */
    destinationPort?: pulumi.Input<number>;
    /**
     * Protocol to use for analysis. Valid options are `tcp` or `udp`.
     *
     * The following arguments are optional:
     */
    protocol: pulumi.Input<string>;
    /**
     * ID or ARN of the resource which is the source of the path. Can be an Instance, Internet Gateway, Network Interface, Transit Gateway, VPC Endpoint, VPC Peering Connection or VPN Gateway. If the resource is in another account, you must specify an ARN.
     */
    source: pulumi.Input<string>;
    /**
     * IP address of the source resource.
     */
    sourceIp?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
