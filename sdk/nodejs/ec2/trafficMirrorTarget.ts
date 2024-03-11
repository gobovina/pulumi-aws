// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Traffic mirror target.\
 * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
 *
 * ## Example Usage
 *
 * To create a basic traffic mirror session
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const nlb = new aws.ec2.TrafficMirrorTarget("nlb", {
 *     description: "NLB target",
 *     networkLoadBalancerArn: lb.arn,
 * });
 * const eni = new aws.ec2.TrafficMirrorTarget("eni", {
 *     description: "ENI target",
 *     networkInterfaceId: test.primaryNetworkInterfaceId,
 * });
 * const gwlb = new aws.ec2.TrafficMirrorTarget("gwlb", {
 *     description: "GWLB target",
 *     gatewayLoadBalancerEndpointId: example.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import traffic mirror targets using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:ec2/trafficMirrorTarget:TrafficMirrorTarget target tmt-0c13a005422b86606
 * ```
 */
export class TrafficMirrorTarget extends pulumi.CustomResource {
    /**
     * Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrafficMirrorTargetState, opts?: pulumi.CustomResourceOptions): TrafficMirrorTarget {
        return new TrafficMirrorTarget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/trafficMirrorTarget:TrafficMirrorTarget';

    /**
     * Returns true if the given object is an instance of TrafficMirrorTarget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TrafficMirrorTarget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TrafficMirrorTarget.__pulumiType;
    }

    /**
     * The ARN of the traffic mirror target.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A description of the traffic mirror session.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The VPC Endpoint Id of the Gateway Load Balancer that is associated with the target.
     */
    public readonly gatewayLoadBalancerEndpointId!: pulumi.Output<string | undefined>;
    /**
     * The network interface ID that is associated with the target.
     */
    public readonly networkInterfaceId!: pulumi.Output<string | undefined>;
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */
    public readonly networkLoadBalancerArn!: pulumi.Output<string | undefined>;
    /**
     * The ID of the AWS account that owns the traffic mirror target.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * **NOTE:** Either `networkInterfaceId` or `networkLoadBalancerArn` should be specified and both should not be specified together
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TrafficMirrorTargetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrafficMirrorTargetArgs | TrafficMirrorTargetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TrafficMirrorTargetState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["gatewayLoadBalancerEndpointId"] = state ? state.gatewayLoadBalancerEndpointId : undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["networkLoadBalancerArn"] = state ? state.networkLoadBalancerArn : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as TrafficMirrorTargetArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["gatewayLoadBalancerEndpointId"] = args ? args.gatewayLoadBalancerEndpointId : undefined;
            resourceInputs["networkInterfaceId"] = args ? args.networkInterfaceId : undefined;
            resourceInputs["networkLoadBalancerArn"] = args ? args.networkLoadBalancerArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TrafficMirrorTarget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TrafficMirrorTarget resources.
 */
export interface TrafficMirrorTargetState {
    /**
     * The ARN of the traffic mirror target.
     */
    arn?: pulumi.Input<string>;
    /**
     * A description of the traffic mirror session.
     */
    description?: pulumi.Input<string>;
    /**
     * The VPC Endpoint Id of the Gateway Load Balancer that is associated with the target.
     */
    gatewayLoadBalancerEndpointId?: pulumi.Input<string>;
    /**
     * The network interface ID that is associated with the target.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */
    networkLoadBalancerArn?: pulumi.Input<string>;
    /**
     * The ID of the AWS account that owns the traffic mirror target.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * **NOTE:** Either `networkInterfaceId` or `networkLoadBalancerArn` should be specified and both should not be specified together
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a TrafficMirrorTarget resource.
 */
export interface TrafficMirrorTargetArgs {
    /**
     * A description of the traffic mirror session.
     */
    description?: pulumi.Input<string>;
    /**
     * The VPC Endpoint Id of the Gateway Load Balancer that is associated with the target.
     */
    gatewayLoadBalancerEndpointId?: pulumi.Input<string>;
    /**
     * The network interface ID that is associated with the target.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */
    networkLoadBalancerArn?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * **NOTE:** Either `networkInterfaceId` or `networkLoadBalancerArn` should be specified and both should not be specified together
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
