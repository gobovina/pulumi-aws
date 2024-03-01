// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get the default tags configured on the provider.
 *
 * With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.getDefaultTags({});
 * ```
 * ### Dynamically Apply Default Tags to Auto Scaling Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.getDefaultTags({});
 * const exampleGroup = new aws.autoscaling.Group("example", {tags: .map(entry => ({
 *     key: entry.key,
 *     value: entry.value,
 *     propagateAtLaunch: true,
 * }))});
 * ```
 */
export function getDefaultTags(args?: GetDefaultTagsArgs, opts?: pulumi.InvokeOptions): Promise<GetDefaultTagsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:index/getDefaultTags:getDefaultTags", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDefaultTags.
 */
export interface GetDefaultTagsArgs {
    id?: string;
}

/**
 * A collection of values returned by getDefaultTags.
 */
export interface GetDefaultTagsResult {
    readonly id: string;
    /**
     * Blocks of default tags set on the provider. See details below.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to get the default tags configured on the provider.
 *
 * With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.getDefaultTags({});
 * ```
 * ### Dynamically Apply Default Tags to Auto Scaling Group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.getDefaultTags({});
 * const exampleGroup = new aws.autoscaling.Group("example", {tags: .map(entry => ({
 *     key: entry.key,
 *     value: entry.value,
 *     propagateAtLaunch: true,
 * }))});
 * ```
 */
export function getDefaultTagsOutput(args?: GetDefaultTagsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDefaultTagsResult> {
    return pulumi.output(args).apply((a: any) => getDefaultTags(a, opts))
}

/**
 * A collection of arguments for invoking getDefaultTags.
 */
export interface GetDefaultTagsOutputArgs {
    id?: pulumi.Input<string>;
}
