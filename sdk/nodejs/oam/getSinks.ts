// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS CloudWatch Observability Access Manager Sinks.
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
 * const example = aws.oam.getSinks({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSinks(opts?: pulumi.InvokeOptions): Promise<GetSinksResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:oam/getSinks:getSinks", {
    }, opts);
}

/**
 * A collection of values returned by getSinks.
 */
export interface GetSinksResult {
    /**
     * Set of ARN of the Sinks.
     */
    readonly arns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Data source for managing an AWS CloudWatch Observability Access Manager Sinks.
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
 * const example = aws.oam.getSinks({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSinksOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetSinksResult> {
    return pulumi.output(getSinks(opts))
}
