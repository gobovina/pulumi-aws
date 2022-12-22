// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides details about a specific redshift subnet group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshift.getSubnetGroup({
 *     name: aws_redshift_subnet_group.example.name,
 * });
 * ```
 */
export function getSubnetGroup(args: GetSubnetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetSubnetGroupResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:redshift/getSubnetGroup:getSubnetGroup", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubnetGroup.
 */
export interface GetSubnetGroupArgs {
    /**
     * Name of the cluster subnet group for which information is requested.
     */
    name: string;
    /**
     * Tags associated to the Subnet Group
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getSubnetGroup.
 */
export interface GetSubnetGroupResult {
    /**
     * ARN of the Redshift Subnet Group name.
     */
    readonly arn: string;
    /**
     * Description of the Redshift Subnet group.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * An array of VPC subnet IDs.
     */
    readonly subnetIds: string[];
    /**
     * Tags associated to the Subnet Group
     */
    readonly tags: {[key: string]: string};
}
/**
 * Provides details about a specific redshift subnet group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshift.getSubnetGroup({
 *     name: aws_redshift_subnet_group.example.name,
 * });
 * ```
 */
export function getSubnetGroupOutput(args: GetSubnetGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubnetGroupResult> {
    return pulumi.output(args).apply((a: any) => getSubnetGroup(a, opts))
}

/**
 * A collection of arguments for invoking getSubnetGroup.
 */
export interface GetSubnetGroupOutputArgs {
    /**
     * Name of the cluster subnet group for which information is requested.
     */
    name: pulumi.Input<string>;
    /**
     * Tags associated to the Subnet Group
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
