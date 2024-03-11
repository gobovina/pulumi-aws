// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.ec2.Vpc` provides details about a specific VPC.
 *
 * This resource can prove useful when a module accepts a vpc id as
 * an input variable and needs to, for example, determine the CIDR block of that
 * VPC.
 *
 * ## Example Usage
 *
 * The following example shows how one might accept a VPC id as a variable
 * and use this data source to obtain the data necessary to create a subnet
 * within it.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const config = new pulumi.Config();
 * const vpcId = config.requireObject("vpcId");
 * const selected = aws.ec2.getVpc({
 *     id: vpcId,
 * });
 * const example = new aws.ec2.Subnet("example", {
 *     vpcId: selected.then(selected => selected.id),
 *     availabilityZone: "us-west-2a",
 *     cidrBlock: selected.then(selected => std.cidrsubnet({
 *         input: selected.cidrBlock,
 *         newbits: 4,
 *         netnum: 1,
 *     })).then(invoke => invoke.result),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVpc(args?: GetVpcArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getVpc:getVpc", {
        "cidrBlock": args.cidrBlock,
        "default": args.default,
        "dhcpOptionsId": args.dhcpOptionsId,
        "filters": args.filters,
        "id": args.id,
        "state": args.state,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpc.
 */
export interface GetVpcArgs {
    /**
     * Cidr block of the desired VPC.
     */
    cidrBlock?: string;
    /**
     * Boolean constraint on whether the desired VPC is
     * the default VPC for the region.
     */
    default?: boolean;
    /**
     * DHCP options id of the desired VPC.
     */
    dhcpOptionsId?: string;
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetVpcFilter[];
    /**
     * ID of the specific VPC to retrieve.
     */
    id?: string;
    /**
     * Current state of the desired VPC.
     * Can be either `"pending"` or `"available"`.
     */
    state?: string;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired VPC.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVpc.
 */
export interface GetVpcResult {
    /**
     * ARN of VPC
     */
    readonly arn: string;
    /**
     * CIDR block for the association.
     */
    readonly cidrBlock: string;
    readonly cidrBlockAssociations: outputs.ec2.GetVpcCidrBlockAssociation[];
    readonly default: boolean;
    readonly dhcpOptionsId: string;
    /**
     * Whether or not the VPC has DNS hostname support
     */
    readonly enableDnsHostnames: boolean;
    /**
     * Whether or not the VPC has DNS support
     */
    readonly enableDnsSupport: boolean;
    /**
     * Whether Network Address Usage metrics are enabled for your VPC
     */
    readonly enableNetworkAddressUsageMetrics: boolean;
    readonly filters?: outputs.ec2.GetVpcFilter[];
    readonly id: string;
    /**
     * Allowed tenancy of instances launched into the
     * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
     */
    readonly instanceTenancy: string;
    /**
     * Association ID for the IPv6 CIDR block.
     */
    readonly ipv6AssociationId: string;
    /**
     * IPv6 CIDR block.
     */
    readonly ipv6CidrBlock: string;
    /**
     * ID of the main route table associated with this VPC.
     */
    readonly mainRouteTableId: string;
    /**
     * ID of the AWS account that owns the VPC.
     */
    readonly ownerId: string;
    /**
     * State of the association.
     */
    readonly state: string;
    readonly tags: {[key: string]: string};
}
/**
 * `aws.ec2.Vpc` provides details about a specific VPC.
 *
 * This resource can prove useful when a module accepts a vpc id as
 * an input variable and needs to, for example, determine the CIDR block of that
 * VPC.
 *
 * ## Example Usage
 *
 * The following example shows how one might accept a VPC id as a variable
 * and use this data source to obtain the data necessary to create a subnet
 * within it.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const config = new pulumi.Config();
 * const vpcId = config.requireObject("vpcId");
 * const selected = aws.ec2.getVpc({
 *     id: vpcId,
 * });
 * const example = new aws.ec2.Subnet("example", {
 *     vpcId: selected.then(selected => selected.id),
 *     availabilityZone: "us-west-2a",
 *     cidrBlock: selected.then(selected => std.cidrsubnet({
 *         input: selected.cidrBlock,
 *         newbits: 4,
 *         netnum: 1,
 *     })).then(invoke => invoke.result),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVpcOutput(args?: GetVpcOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcResult> {
    return pulumi.output(args).apply((a: any) => getVpc(a, opts))
}

/**
 * A collection of arguments for invoking getVpc.
 */
export interface GetVpcOutputArgs {
    /**
     * Cidr block of the desired VPC.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * Boolean constraint on whether the desired VPC is
     * the default VPC for the region.
     */
    default?: pulumi.Input<boolean>;
    /**
     * DHCP options id of the desired VPC.
     */
    dhcpOptionsId?: pulumi.Input<string>;
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetVpcFilterArgs>[]>;
    /**
     * ID of the specific VPC to retrieve.
     */
    id?: pulumi.Input<string>;
    /**
     * Current state of the desired VPC.
     * Can be either `"pending"` or `"available"`.
     */
    state?: pulumi.Input<string>;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired VPC.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
