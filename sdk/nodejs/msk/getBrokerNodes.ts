// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Get information on an Amazon MSK Broker Nodes.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.msk.getBrokerNodes({
 *     clusterArn: exampleAwsMskCluster.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getBrokerNodes(args: GetBrokerNodesArgs, opts?: pulumi.InvokeOptions): Promise<GetBrokerNodesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:msk/getBrokerNodes:getBrokerNodes", {
        "clusterArn": args.clusterArn,
    }, opts);
}

/**
 * A collection of arguments for invoking getBrokerNodes.
 */
export interface GetBrokerNodesArgs {
    /**
     * ARN of the cluster the nodes belong to.
     */
    clusterArn: string;
}

/**
 * A collection of values returned by getBrokerNodes.
 */
export interface GetBrokerNodesResult {
    readonly clusterArn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nodeInfoLists: outputs.msk.GetBrokerNodesNodeInfoList[];
}
/**
 * Get information on an Amazon MSK Broker Nodes.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.msk.getBrokerNodes({
 *     clusterArn: exampleAwsMskCluster.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getBrokerNodesOutput(args: GetBrokerNodesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBrokerNodesResult> {
    return pulumi.output(args).apply((a: any) => getBrokerNodes(a, opts))
}

/**
 * A collection of arguments for invoking getBrokerNodes.
 */
export interface GetBrokerNodesOutputArgs {
    /**
     * ARN of the cluster the nodes belong to.
     */
    clusterArn: pulumi.Input<string>;
}
