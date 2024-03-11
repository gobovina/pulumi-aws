// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Returns a list of Amazon Bedrock custom models.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.bedrock.getCustomModels({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCustomModels(opts?: pulumi.InvokeOptions): Promise<GetCustomModelsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:bedrock/getCustomModels:getCustomModels", {
    }, opts);
}

/**
 * A collection of values returned by getCustomModels.
 */
export interface GetCustomModelsResult {
    readonly id: string;
    /**
     * Model summaries.
     */
    readonly modelSummaries: outputs.bedrock.GetCustomModelsModelSummary[];
}
/**
 * Returns a list of Amazon Bedrock custom models.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.bedrock.getCustomModels({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getCustomModelsOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetCustomModelsResult> {
    return pulumi.output(getCustomModels(opts))
}
