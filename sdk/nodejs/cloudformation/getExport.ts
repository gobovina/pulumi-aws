// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The CloudFormation Export data source allows access to stack
 * exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the Cloudformation Template using the optional Export Property.
 *
 *  > Note: If you are trying to use a value from a Cloudformation Stack in the same deployment please use normal interpolation or Cloudformation Outputs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const subnetId = aws.cloudformation.getExport({
 *     name: "mySubnetIdExportName",
 * });
 * const web = new aws.ec2.Instance("web", {
 *     ami: "ami-abb07bcb",
 *     instanceType: "t2.micro",
 *     subnetId: subnetId.then(subnetId => subnetId.value),
 * });
 * ```
 */
export function getExport(args: GetExportArgs, opts?: pulumi.InvokeOptions): Promise<GetExportResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudformation/getExport:getExport", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getExport.
 */
export interface GetExportArgs {
    /**
     * Name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     */
    name: string;
}

/**
 * A collection of values returned by getExport.
 */
export interface GetExportResult {
    /**
     * ARN of stack that contains the exported output name and value.
     */
    readonly exportingStackId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     */
    readonly value: string;
}
/**
 * The CloudFormation Export data source allows access to stack
 * exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the Cloudformation Template using the optional Export Property.
 *
 *  > Note: If you are trying to use a value from a Cloudformation Stack in the same deployment please use normal interpolation or Cloudformation Outputs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const subnetId = aws.cloudformation.getExport({
 *     name: "mySubnetIdExportName",
 * });
 * const web = new aws.ec2.Instance("web", {
 *     ami: "ami-abb07bcb",
 *     instanceType: "t2.micro",
 *     subnetId: subnetId.then(subnetId => subnetId.value),
 * });
 * ```
 */
export function getExportOutput(args: GetExportOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetExportResult> {
    return pulumi.output(args).apply((a: any) => getExport(a, opts))
}

/**
 * A collection of arguments for invoking getExport.
 */
export interface GetExportOutputArgs {
    /**
     * Name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     */
    name: pulumi.Input<string>;
}
