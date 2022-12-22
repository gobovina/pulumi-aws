// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Nat Gateway.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getNatGateway({
 *     subnetId: aws_subnet["public"].id,
 * });
 * ```
 *
 * Usage with tags:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getNatGateway({
 *     subnetId: aws_subnet["public"].id,
 *     tags: {
 *         Name: "gw NAT",
 *     },
 * });
 * ```
 */
export function getNatGateway(args?: GetNatGatewayArgs, opts?: pulumi.InvokeOptions): Promise<GetNatGatewayResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getNatGateway:getNatGateway", {
        "filters": args.filters,
        "id": args.id,
        "state": args.state,
        "subnetId": args.subnetId,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNatGateway.
 */
export interface GetNatGatewayArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetNatGatewayFilter[];
    /**
     * ID of the specific Nat Gateway to retrieve.
     */
    id?: string;
    /**
     * State of the NAT gateway (pending | failed | available | deleting | deleted ).
     */
    state?: string;
    /**
     * ID of subnet that the Nat Gateway resides in.
     */
    subnetId?: string;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired Nat Gateway.
     */
    tags?: {[key: string]: string};
    /**
     * ID of the VPC that the Nat Gateway resides in.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getNatGateway.
 */
export interface GetNatGatewayResult {
    /**
     * ID of the EIP allocated to the selected Nat Gateway.
     */
    readonly allocationId: string;
    /**
     * Connectivity type of the NAT Gateway.
     */
    readonly connectivityType: string;
    readonly filters?: outputs.ec2.GetNatGatewayFilter[];
    readonly id: string;
    /**
     * The ID of the ENI allocated to the selected Nat Gateway.
     */
    readonly networkInterfaceId: string;
    /**
     * Private Ip address of the selected Nat Gateway.
     */
    readonly privateIp: string;
    /**
     * Public Ip (EIP) address of the selected Nat Gateway.
     */
    readonly publicIp: string;
    readonly state: string;
    readonly subnetId: string;
    readonly tags: {[key: string]: string};
    readonly vpcId: string;
}
/**
 * Provides details about a specific Nat Gateway.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getNatGateway({
 *     subnetId: aws_subnet["public"].id,
 * });
 * ```
 *
 * Usage with tags:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getNatGateway({
 *     subnetId: aws_subnet["public"].id,
 *     tags: {
 *         Name: "gw NAT",
 *     },
 * });
 * ```
 */
export function getNatGatewayOutput(args?: GetNatGatewayOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNatGatewayResult> {
    return pulumi.output(args).apply((a: any) => getNatGateway(a, opts))
}

/**
 * A collection of arguments for invoking getNatGateway.
 */
export interface GetNatGatewayOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetNatGatewayFilterArgs>[]>;
    /**
     * ID of the specific Nat Gateway to retrieve.
     */
    id?: pulumi.Input<string>;
    /**
     * State of the NAT gateway (pending | failed | available | deleting | deleted ).
     */
    state?: pulumi.Input<string>;
    /**
     * ID of subnet that the Nat Gateway resides in.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired Nat Gateway.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ID of the VPC that the Nat Gateway resides in.
     */
    vpcId?: pulumi.Input<string>;
}
