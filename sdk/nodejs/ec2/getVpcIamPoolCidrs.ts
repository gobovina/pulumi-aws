// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.ec2.getVpcIamPoolCidrs` provides details about an IPAM pool.
 *
 * This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
 */
export function getVpcIamPoolCidrs(args: GetVpcIamPoolCidrsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcIamPoolCidrsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getVpcIamPoolCidrs:getVpcIamPoolCidrs", {
        "filters": args.filters,
        "ipamPoolId": args.ipamPoolId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcIamPoolCidrs.
 */
export interface GetVpcIamPoolCidrsArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetVpcIamPoolCidrsFilter[];
    /**
     * ID of the IPAM pool you would like the list of provisioned CIDRs.
     */
    ipamPoolId: string;
}

/**
 * A collection of values returned by getVpcIamPoolCidrs.
 */
export interface GetVpcIamPoolCidrsResult {
    readonly filters?: outputs.ec2.GetVpcIamPoolCidrsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The CIDRs provisioned into the IPAM pool, described below.
     */
    readonly ipamPoolCidrs: outputs.ec2.GetVpcIamPoolCidrsIpamPoolCidr[];
    readonly ipamPoolId: string;
}
/**
 * `aws.ec2.getVpcIamPoolCidrs` provides details about an IPAM pool.
 *
 * This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
 */
export function getVpcIamPoolCidrsOutput(args: GetVpcIamPoolCidrsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcIamPoolCidrsResult> {
    return pulumi.output(args).apply((a: any) => getVpcIamPoolCidrs(a, opts))
}

/**
 * A collection of arguments for invoking getVpcIamPoolCidrs.
 */
export interface GetVpcIamPoolCidrsOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetVpcIamPoolCidrsFilterArgs>[]>;
    /**
     * ID of the IPAM pool you would like the list of provisioned CIDRs.
     */
    ipamPoolId: pulumi.Input<string>;
}
