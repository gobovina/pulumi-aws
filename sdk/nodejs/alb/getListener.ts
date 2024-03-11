// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 *
 * Provides information about a Load Balancer Listener.
 *
 * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const listenerArn = config.require("listenerArn");
 * const listener = aws.lb.getListener({
 *     arn: listenerArn,
 * });
 * // get listener from load_balancer_arn and port
 * const selected = aws.lb.getLoadBalancer({
 *     name: "default-public",
 * });
 * const selected443 = selected.then(selected => aws.lb.getListener({
 *     loadBalancerArn: selected.arn,
 *     port: 443,
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getListener(args?: GetListenerArgs, opts?: pulumi.InvokeOptions): Promise<GetListenerResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:alb/getListener:getListener", {
        "arn": args.arn,
        "loadBalancerArn": args.loadBalancerArn,
        "port": args.port,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getListener.
 */
export interface GetListenerArgs {
    /**
     * ARN of the listener. Required if `loadBalancerArn` and `port` is not set.
     */
    arn?: string;
    /**
     * ARN of the load balancer. Required if `arn` is not set.
     */
    loadBalancerArn?: string;
    /**
     * Port of the listener. Required if `arn` is not set.
     */
    port?: number;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getListener.
 */
export interface GetListenerResult {
    readonly alpnPolicy: string;
    readonly arn: string;
    readonly certificateArn: string;
    readonly defaultActions: outputs.alb.GetListenerDefaultAction[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly loadBalancerArn: string;
    readonly mutualAuthentications: outputs.alb.GetListenerMutualAuthentication[];
    readonly port: number;
    readonly protocol: string;
    readonly sslPolicy: string;
    readonly tags: {[key: string]: string};
}
/**
 * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 *
 * Provides information about a Load Balancer Listener.
 *
 * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const listenerArn = config.require("listenerArn");
 * const listener = aws.lb.getListener({
 *     arn: listenerArn,
 * });
 * // get listener from load_balancer_arn and port
 * const selected = aws.lb.getLoadBalancer({
 *     name: "default-public",
 * });
 * const selected443 = selected.then(selected => aws.lb.getListener({
 *     loadBalancerArn: selected.arn,
 *     port: 443,
 * }));
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getListenerOutput(args?: GetListenerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetListenerResult> {
    return pulumi.output(args).apply((a: any) => getListener(a, opts))
}

/**
 * A collection of arguments for invoking getListener.
 */
export interface GetListenerOutputArgs {
    /**
     * ARN of the listener. Required if `loadBalancerArn` and `port` is not set.
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the load balancer. Required if `arn` is not set.
     */
    loadBalancerArn?: pulumi.Input<string>;
    /**
     * Port of the listener. Required if `arn` is not set.
     */
    port?: pulumi.Input<number>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
