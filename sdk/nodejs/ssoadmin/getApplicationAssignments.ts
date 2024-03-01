// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for managing AWS SSO Admin Application Assignments.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssoadmin.getApplicationAssignments({
 *     applicationArn: exampleAwsSsoadminApplication.applicationArn,
 * });
 * ```
 */
export function getApplicationAssignments(args: GetApplicationAssignmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationAssignmentsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssoadmin/getApplicationAssignments:getApplicationAssignments", {
        "applicationArn": args.applicationArn,
        "applicationAssignments": args.applicationAssignments,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationAssignments.
 */
export interface GetApplicationAssignmentsArgs {
    /**
     * ARN of the application.
     */
    applicationArn: string;
    /**
     * List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     */
    applicationAssignments?: inputs.ssoadmin.GetApplicationAssignmentsApplicationAssignment[];
}

/**
 * A collection of values returned by getApplicationAssignments.
 */
export interface GetApplicationAssignmentsResult {
    /**
     * ARN of the application.
     */
    readonly applicationArn: string;
    /**
     * List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     */
    readonly applicationAssignments?: outputs.ssoadmin.GetApplicationAssignmentsApplicationAssignment[];
    readonly id: string;
}
/**
 * Data source for managing AWS SSO Admin Application Assignments.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ssoadmin.getApplicationAssignments({
 *     applicationArn: exampleAwsSsoadminApplication.applicationArn,
 * });
 * ```
 */
export function getApplicationAssignmentsOutput(args: GetApplicationAssignmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplicationAssignmentsResult> {
    return pulumi.output(args).apply((a: any) => getApplicationAssignments(a, opts))
}

/**
 * A collection of arguments for invoking getApplicationAssignments.
 */
export interface GetApplicationAssignmentsOutputArgs {
    /**
     * ARN of the application.
     */
    applicationArn: pulumi.Input<string>;
    /**
     * List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     */
    applicationAssignments?: pulumi.Input<pulumi.Input<inputs.ssoadmin.GetApplicationAssignmentsApplicationAssignmentArgs>[]>;
}
