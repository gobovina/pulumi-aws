// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a Target Group resource for use with Load Balancer resources.
 *
 * > **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
 *
 * ## Example Usage
 * ### Instance Target Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = new aws.ec2.Vpc("main", {
 *     cidrBlock: "10.0.0.0/16",
 * });
 * const test = new aws.lb.TargetGroup("test", {
 *     port: 80,
 *     protocol: "HTTP",
 *     vpcId: main.id,
 * });
 * ```
 * ### IP Target Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = new aws.ec2.Vpc("main", {
 *     cidrBlock: "10.0.0.0/16",
 * });
 * const ip_example = new aws.lb.TargetGroup("ip-example", {
 *     port: 80,
 *     protocol: "HTTP",
 *     targetType: "ip",
 *     vpcId: main.id,
 * });
 * ```
 * ### Lambda Target Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const lambda_example = new aws.lb.TargetGroup("lambda-example", {
 *     targetType: "lambda",
 * });
 * ```
 */
export class TargetGroup extends pulumi.CustomResource {
    /**
     * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetGroupState, opts?: pulumi.CustomResourceOptions): TargetGroup {
        return new TargetGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:alb/targetGroup:TargetGroup';

    /**
     * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TargetGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TargetGroup.__pulumiType;
    }

    /**
     * The ARN of the Target Group (matches `id`)
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ARN suffix for use with CloudWatch Metrics.
     */
    public /*out*/ readonly arnSuffix!: pulumi.Output<string>;
    /**
     * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     */
    public readonly deregistrationDelay!: pulumi.Output<number | undefined>;
    /**
     * A Health Check block. Health Check blocks are documented below.
     */
    public readonly healthCheck!: pulumi.Output<outputs.alb.TargetGroupHealthCheck>;
    /**
     * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
     */
    public readonly lambdaMultiValueHeadersEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
     */
    public readonly loadBalancingAlgorithmType!: pulumi.Output<string>;
    /**
     * The name of the target group. If omitted, this provider will assign a random, unique name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     */
    public readonly namePrefix!: pulumi.Output<string | undefined>;
    /**
     * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
     */
    public readonly proxyProtocolV2!: pulumi.Output<boolean | undefined>;
    /**
     * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     */
    public readonly slowStart!: pulumi.Output<number | undefined>;
    /**
     * A Stickiness block. Stickiness blocks are documented below. `stickiness` is only valid if used with Load Balancers of type `Application`
     */
    public readonly stickiness!: pulumi.Output<outputs.alb.TargetGroupStickiness>;
    /**
     * A map of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The type of target that you must specify when registering targets with this target group.
     * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
     * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
     * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
     * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
     * You can't specify publicly routable IP addresses.
     */
    public readonly targetType!: pulumi.Output<string | undefined>;
    /**
     * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;

    /**
     * Create a TargetGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TargetGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TargetGroupArgs | TargetGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TargetGroupState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["arnSuffix"] = state ? state.arnSuffix : undefined;
            inputs["deregistrationDelay"] = state ? state.deregistrationDelay : undefined;
            inputs["healthCheck"] = state ? state.healthCheck : undefined;
            inputs["lambdaMultiValueHeadersEnabled"] = state ? state.lambdaMultiValueHeadersEnabled : undefined;
            inputs["loadBalancingAlgorithmType"] = state ? state.loadBalancingAlgorithmType : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namePrefix"] = state ? state.namePrefix : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["proxyProtocolV2"] = state ? state.proxyProtocolV2 : undefined;
            inputs["slowStart"] = state ? state.slowStart : undefined;
            inputs["stickiness"] = state ? state.stickiness : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["targetType"] = state ? state.targetType : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as TargetGroupArgs | undefined;
            inputs["deregistrationDelay"] = args ? args.deregistrationDelay : undefined;
            inputs["healthCheck"] = args ? args.healthCheck : undefined;
            inputs["lambdaMultiValueHeadersEnabled"] = args ? args.lambdaMultiValueHeadersEnabled : undefined;
            inputs["loadBalancingAlgorithmType"] = args ? args.loadBalancingAlgorithmType : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namePrefix"] = args ? args.namePrefix : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["proxyProtocolV2"] = args ? args.proxyProtocolV2 : undefined;
            inputs["slowStart"] = args ? args.slowStart : undefined;
            inputs["stickiness"] = args ? args.stickiness : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["targetType"] = args ? args.targetType : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["arnSuffix"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        const aliasOpts = { aliases: [{ type: "aws:applicationloadbalancing/targetGroup:TargetGroup" }] };
        opts = opts ? pulumi.mergeOptions(opts, aliasOpts) : aliasOpts;
        super(TargetGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TargetGroup resources.
 */
export interface TargetGroupState {
    /**
     * The ARN of the Target Group (matches `id`)
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * The ARN suffix for use with CloudWatch Metrics.
     */
    readonly arnSuffix?: pulumi.Input<string>;
    /**
     * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     */
    readonly deregistrationDelay?: pulumi.Input<number>;
    /**
     * A Health Check block. Health Check blocks are documented below.
     */
    readonly healthCheck?: pulumi.Input<inputs.alb.TargetGroupHealthCheck>;
    /**
     * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
     */
    readonly lambdaMultiValueHeadersEnabled?: pulumi.Input<boolean>;
    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
     */
    readonly loadBalancingAlgorithmType?: pulumi.Input<string>;
    /**
     * The name of the target group. If omitted, this provider will assign a random, unique name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
     */
    readonly proxyProtocolV2?: pulumi.Input<boolean>;
    /**
     * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     */
    readonly slowStart?: pulumi.Input<number>;
    /**
     * A Stickiness block. Stickiness blocks are documented below. `stickiness` is only valid if used with Load Balancers of type `Application`
     */
    readonly stickiness?: pulumi.Input<inputs.alb.TargetGroupStickiness>;
    /**
     * A map of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of target that you must specify when registering targets with this target group.
     * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
     * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
     * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
     * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
     * You can't specify publicly routable IP addresses.
     */
    readonly targetType?: pulumi.Input<string>;
    /**
     * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TargetGroup resource.
 */
export interface TargetGroupArgs {
    /**
     * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     */
    readonly deregistrationDelay?: pulumi.Input<number>;
    /**
     * A Health Check block. Health Check blocks are documented below.
     */
    readonly healthCheck?: pulumi.Input<inputs.alb.TargetGroupHealthCheck>;
    /**
     * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
     */
    readonly lambdaMultiValueHeadersEnabled?: pulumi.Input<boolean>;
    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
     */
    readonly loadBalancingAlgorithmType?: pulumi.Input<string>;
    /**
     * The name of the target group. If omitted, this provider will assign a random, unique name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
     */
    readonly proxyProtocolV2?: pulumi.Input<boolean>;
    /**
     * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     */
    readonly slowStart?: pulumi.Input<number>;
    /**
     * A Stickiness block. Stickiness blocks are documented below. `stickiness` is only valid if used with Load Balancers of type `Application`
     */
    readonly stickiness?: pulumi.Input<inputs.alb.TargetGroupStickiness>;
    /**
     * A map of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of target that you must specify when registering targets with this target group.
     * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
     * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
     * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
     * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
     * You can't specify publicly routable IP addresses.
     */
    readonly targetType?: pulumi.Input<string>;
    /**
     * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
     */
    readonly vpcId?: pulumi.Input<string>;
}
