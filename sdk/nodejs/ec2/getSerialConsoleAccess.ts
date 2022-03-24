// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = pulumi.output(aws.ec2.getSerialConsoleAccess());
 * ```
 */
export function getSerialConsoleAccess(opts?: pulumi.InvokeOptions): Promise<GetSerialConsoleAccessResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getSerialConsoleAccess:getSerialConsoleAccess", {
    }, opts);
}

/**
 * A collection of values returned by getSerialConsoleAccess.
 */
export interface GetSerialConsoleAccessResult {
    /**
     * Whether or not serial console access is enabled. Returns as `true` or `false`.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
