// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS Audit Manager Framework.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.auditmanager.getFramework({
 *     name: "Essential Eight",
 *     frameworkType: "Standard",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFramework(args: GetFrameworkArgs, opts?: pulumi.InvokeOptions): Promise<GetFrameworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:auditmanager/getFramework:getFramework", {
        "controlSets": args.controlSets,
        "frameworkType": args.frameworkType,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getFramework.
 */
export interface GetFrameworkArgs {
    controlSets?: inputs.auditmanager.GetFrameworkControlSet[];
    frameworkType: string;
    /**
     * Name of the framework.
     */
    name: string;
}

/**
 * A collection of values returned by getFramework.
 */
export interface GetFrameworkResult {
    readonly arn: string;
    readonly complianceType: string;
    readonly controlSets?: outputs.auditmanager.GetFrameworkControlSet[];
    readonly description: string;
    readonly frameworkType: string;
    readonly id: string;
    readonly name: string;
    readonly tags: {[key: string]: string};
}
/**
 * Data source for managing an AWS Audit Manager Framework.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.auditmanager.getFramework({
 *     name: "Essential Eight",
 *     frameworkType: "Standard",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFrameworkOutput(args: GetFrameworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFrameworkResult> {
    return pulumi.output(args).apply((a: any) => getFramework(a, opts))
}

/**
 * A collection of arguments for invoking getFramework.
 */
export interface GetFrameworkOutputArgs {
    controlSets?: pulumi.Input<pulumi.Input<inputs.auditmanager.GetFrameworkControlSetArgs>[]>;
    frameworkType: pulumi.Input<string>;
    /**
     * Name of the framework.
     */
    name: pulumi.Input<string>;
}
