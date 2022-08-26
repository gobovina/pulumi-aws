// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * `aws.ec2.NetworkInsightsAnalysis` provides details about a specific Network Insights Analysis.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getNetworkInsightsAnalysis({
 *     networkInsightsAnalysisId: aws_ec2_network_insights_analysis.example.id,
 * });
 * ```
 */
export function getNetworkInsightsAnalysis(args?: GetNetworkInsightsAnalysisArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkInsightsAnalysisResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getNetworkInsightsAnalysis:getNetworkInsightsAnalysis", {
        "filters": args.filters,
        "networkInsightsAnalysisId": args.networkInsightsAnalysisId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkInsightsAnalysis.
 */
export interface GetNetworkInsightsAnalysisArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: inputs.ec2.GetNetworkInsightsAnalysisFilter[];
    /**
     * The ID of the Network Insights Analysis to select.
     */
    networkInsightsAnalysisId?: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getNetworkInsightsAnalysis.
 */
export interface GetNetworkInsightsAnalysisResult {
    /**
     * Potential intermediate components of a feasible path.
     */
    readonly alternatePathHints: outputs.ec2.GetNetworkInsightsAnalysisAlternatePathHint[];
    /**
     * The ARN of the selected Network Insights Analysis.
     */
    readonly arn: string;
    /**
     * Explanation codes for an unreachable path.
     */
    readonly explanations: outputs.ec2.GetNetworkInsightsAnalysisExplanation[];
    /**
     * The Amazon Resource Names (ARN) of the AWS resources that the path must traverse.
     */
    readonly filterInArns: string[];
    readonly filters?: outputs.ec2.GetNetworkInsightsAnalysisFilter[];
    /**
     * The components in the path from source to destination.
     */
    readonly forwardPathComponents: outputs.ec2.GetNetworkInsightsAnalysisForwardPathComponent[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly networkInsightsAnalysisId: string;
    /**
     * The ID of the path.
     */
    readonly networkInsightsPathId: string;
    /**
     * Set to `true` if the destination was reachable.
     */
    readonly pathFound: boolean;
    /**
     * The components in the path from destination to source.
     */
    readonly returnPathComponents: outputs.ec2.GetNetworkInsightsAnalysisReturnPathComponent[];
    /**
     * The date/time the analysis was started.
     */
    readonly startDate: string;
    /**
     * The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `pathFound`.
     */
    readonly status: string;
    /**
     * A message to provide more context when the `status` is `failed`.
     */
    readonly statusMessage: string;
    readonly tags: {[key: string]: string};
    /**
     * The warning message.
     */
    readonly warningMessage: string;
}

export function getNetworkInsightsAnalysisOutput(args?: GetNetworkInsightsAnalysisOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkInsightsAnalysisResult> {
    return pulumi.output(args).apply(a => getNetworkInsightsAnalysis(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkInsightsAnalysis.
 */
export interface GetNetworkInsightsAnalysisOutputArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetNetworkInsightsAnalysisFilterArgs>[]>;
    /**
     * The ID of the Network Insights Analysis to select.
     */
    networkInsightsAnalysisId?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
