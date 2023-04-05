// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * > **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
 *
 * Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssmincidents.getReplicationSet({});
 * ```
 */
export function getReplicationSet(args?: GetReplicationSetArgs, opts?: pulumi.InvokeOptions): Promise<GetReplicationSetResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssmincidents/getReplicationSet:getReplicationSet", {
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getReplicationSet.
 */
export interface GetReplicationSetArgs {
    /**
     * All tags applied to the replication set.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getReplicationSet.
 */
export interface GetReplicationSetResult {
    /**
     * The Amazon Resouce Name (ARN) of the replication set.
     */
    readonly arn: string;
    /**
     * The ARN of the user who created the replication set.
     */
    readonly createdBy: string;
    /**
     * If `true`, the last remaining Region in a replication set can’t be deleted.
     */
    readonly deletionProtected: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ARN of the user who last modified the replication set.
     */
    readonly lastModifiedBy: string;
    readonly regions: outputs.ssmincidents.GetReplicationSetRegion[];
    /**
     * The current status of the Region.
     * * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
     */
    readonly status: string;
    /**
     * All tags applied to the replication set.
     */
    readonly tags: {[key: string]: string};
}
/**
 * > **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
 *
 * Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssmincidents.getReplicationSet({});
 * ```
 */
export function getReplicationSetOutput(args?: GetReplicationSetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetReplicationSetResult> {
    return pulumi.output(args).apply((a: any) => getReplicationSet(a, opts))
}

/**
 * A collection of arguments for invoking getReplicationSet.
 */
export interface GetReplicationSetOutputArgs {
    /**
     * All tags applied to the replication set.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
