// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.ebs.getEbsVolumes` provides identifying information for EBS volumes matching given criteria.
 *
 * This data source can be useful for getting a list of volume IDs with (for example) matching tags.
 *
 * ## Example Usage
 *
 * The following demonstrates obtaining a map of availability zone to EBS volume ID for volumes with a given tag value.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ebs.getEbsVolumes({
 *     tags: {
 *         VolumeSet: "TestVolumeSet",
 *     },
 * });
 * const exampleGetVolume = example.then(example => .reduce((__obj, [, ]) => ({ ...__obj, [__key]: aws.ebs.getVolume({
 *     filters: [{
 *         name: "volume-id",
 *         values: [__value],
 *     }],
 * }) })));
 * export const availabilityZoneToVolumeId = exampleGetVolume.apply(exampleGetVolume => Object.values(exampleGetVolume).reduce((__obj, s) => ({ ...__obj, [s.id]: s.availabilityZone })));
 * ```
 */
export function getEbsVolumes(args?: GetEbsVolumesArgs, opts?: pulumi.InvokeOptions): Promise<GetEbsVolumesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ebs/getEbsVolumes:getEbsVolumes", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEbsVolumes.
 */
export interface GetEbsVolumesArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ebs.GetEbsVolumesFilter[];
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired volumes.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getEbsVolumes.
 */
export interface GetEbsVolumesResult {
    readonly filters?: outputs.ebs.GetEbsVolumesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of all the EBS Volume IDs found. This data source will fail if
     * no volumes match the provided criteria.
     */
    readonly ids: string[];
    readonly tags?: {[key: string]: string};
}
/**
 * `aws.ebs.getEbsVolumes` provides identifying information for EBS volumes matching given criteria.
 *
 * This data source can be useful for getting a list of volume IDs with (for example) matching tags.
 *
 * ## Example Usage
 *
 * The following demonstrates obtaining a map of availability zone to EBS volume ID for volumes with a given tag value.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ebs.getEbsVolumes({
 *     tags: {
 *         VolumeSet: "TestVolumeSet",
 *     },
 * });
 * const exampleGetVolume = example.then(example => .reduce((__obj, [, ]) => ({ ...__obj, [__key]: aws.ebs.getVolume({
 *     filters: [{
 *         name: "volume-id",
 *         values: [__value],
 *     }],
 * }) })));
 * export const availabilityZoneToVolumeId = exampleGetVolume.apply(exampleGetVolume => Object.values(exampleGetVolume).reduce((__obj, s) => ({ ...__obj, [s.id]: s.availabilityZone })));
 * ```
 */
export function getEbsVolumesOutput(args?: GetEbsVolumesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEbsVolumesResult> {
    return pulumi.output(args).apply((a: any) => getEbsVolumes(a, opts))
}

/**
 * A collection of arguments for invoking getEbsVolumes.
 */
export interface GetEbsVolumesOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ebs.GetEbsVolumesFilterArgs>[]>;
    /**
     * Map of tags, each pair of which must exactly match
     * a pair on the desired volumes.
     *
     * More complex filters can be expressed using one or more `filter` sub-blocks,
     * which take the following arguments:
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
