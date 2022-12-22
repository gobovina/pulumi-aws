// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * > **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
 *
 * Provides information about a Load Balancer.
 *
 * This data source can prove useful when a module accepts an LB as an input
 * variable and needs to, for example, determine the security groups associated
 * with it, etc.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const lbArn = config.get("lbArn") || "";
 * const lbName = config.get("lbName") || "";
 * const test = aws.lb.getLoadBalancer({
 *     arn: lbArn,
 *     name: lbName,
 * });
 * ```
 */
/** @deprecated aws.applicationloadbalancing.getLoadBalancer has been deprecated in favor of aws.alb.getLoadBalancer */
export function getLoadBalancer(args?: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    pulumi.log.warn("getLoadBalancer is deprecated: aws.applicationloadbalancing.getLoadBalancer has been deprecated in favor of aws.alb.getLoadBalancer")
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:applicationloadbalancing/getLoadBalancer:getLoadBalancer", {
        "arn": args.arn,
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerArgs {
    /**
     * Full ARN of the load balancer.
     */
    arn?: string;
    /**
     * Unique name of the load balancer.
     */
    name?: string;
    /**
     * Mapping of tags, each pair of which must exactly match a pair on the desired load balancer.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getLoadBalancer.
 */
export interface GetLoadBalancerResult {
    readonly accessLogs: outputs.applicationloadbalancing.GetLoadBalancerAccessLogs;
    readonly arn: string;
    readonly arnSuffix: string;
    readonly customerOwnedIpv4Pool: string;
    readonly desyncMitigationMode: string;
    readonly dnsName: string;
    readonly dropInvalidHeaderFields: boolean;
    readonly enableDeletionProtection: boolean;
    readonly enableHttp2: boolean;
    readonly enableWafFailOpen: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly idleTimeout: number;
    readonly internal: boolean;
    readonly ipAddressType: string;
    readonly loadBalancerType: string;
    readonly name: string;
    readonly preserveHostHeader: boolean;
    readonly securityGroups: string[];
    readonly subnetMappings: outputs.applicationloadbalancing.GetLoadBalancerSubnetMapping[];
    readonly subnets: string[];
    readonly tags: {[key: string]: string};
    readonly vpcId: string;
    readonly zoneId: string;
}
/**
 * > **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
 *
 * Provides information about a Load Balancer.
 *
 * This data source can prove useful when a module accepts an LB as an input
 * variable and needs to, for example, determine the security groups associated
 * with it, etc.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const lbArn = config.get("lbArn") || "";
 * const lbName = config.get("lbName") || "";
 * const test = aws.lb.getLoadBalancer({
 *     arn: lbArn,
 *     name: lbName,
 * });
 * ```
 */
/** @deprecated aws.applicationloadbalancing.getLoadBalancer has been deprecated in favor of aws.alb.getLoadBalancer */
export function getLoadBalancerOutput(args?: GetLoadBalancerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadBalancerResult> {
    return pulumi.output(args).apply((a: any) => getLoadBalancer(a, opts))
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerOutputArgs {
    /**
     * Full ARN of the load balancer.
     */
    arn?: pulumi.Input<string>;
    /**
     * Unique name of the load balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * Mapping of tags, each pair of which must exactly match a pair on the desired load balancer.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
