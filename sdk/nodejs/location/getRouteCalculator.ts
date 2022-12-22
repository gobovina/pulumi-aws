// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about a Location Service Route Calculator.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.location.getRouteCalculator({
 *     calculatorName: "example",
 * });
 * ```
 */
export function getRouteCalculator(args: GetRouteCalculatorArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteCalculatorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:location/getRouteCalculator:getRouteCalculator", {
        "calculatorName": args.calculatorName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteCalculator.
 */
export interface GetRouteCalculatorArgs {
    /**
     * Name of the route calculator resource.
     */
    calculatorName: string;
    /**
     * Key-value map of resource tags for the route calculator.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getRouteCalculator.
 */
export interface GetRouteCalculatorResult {
    /**
     * ARN for the Route calculator resource. Use the ARN when you specify a resource across AWS.
     */
    readonly calculatorArn: string;
    readonly calculatorName: string;
    /**
     * Timestamp for when the route calculator resource was created in ISO 8601 format.
     */
    readonly createTime: string;
    /**
     * Data provider of traffic and road network data.
     */
    readonly dataSource: string;
    /**
     * Optional description of the route calculator resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Key-value map of resource tags for the route calculator.
     */
    readonly tags: {[key: string]: string};
    /**
     * Timestamp for when the route calculator resource was last updated in ISO 8601 format.
     */
    readonly updateTime: string;
}
/**
 * Retrieve information about a Location Service Route Calculator.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.location.getRouteCalculator({
 *     calculatorName: "example",
 * });
 * ```
 */
export function getRouteCalculatorOutput(args: GetRouteCalculatorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteCalculatorResult> {
    return pulumi.output(args).apply((a: any) => getRouteCalculator(a, opts))
}

/**
 * A collection of arguments for invoking getRouteCalculator.
 */
export interface GetRouteCalculatorOutputArgs {
    /**
     * Name of the route calculator resource.
     */
    calculatorName: pulumi.Input<string>;
    /**
     * Key-value map of resource tags for the route calculator.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
