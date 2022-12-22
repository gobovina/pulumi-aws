// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Connect Lambda Function Association.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.connect.getLambdaFunctionAssociation({
 *     functionArn: "arn:aws:lambda:us-west-2:123456789123:function:abcdefg",
 *     instanceId: "aaaaaaaa-bbbb-cccc-dddd-111111111111",
 * });
 * ```
 */
export function getLambdaFunctionAssociation(args: GetLambdaFunctionAssociationArgs, opts?: pulumi.InvokeOptions): Promise<GetLambdaFunctionAssociationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:connect/getLambdaFunctionAssociation:getLambdaFunctionAssociation", {
        "functionArn": args.functionArn,
        "instanceId": args.instanceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLambdaFunctionAssociation.
 */
export interface GetLambdaFunctionAssociationArgs {
    /**
     * ARN of the Lambda Function, omitting any version or alias qualifier.
     */
    functionArn: string;
    /**
     * Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */
    instanceId: string;
}

/**
 * A collection of values returned by getLambdaFunctionAssociation.
 */
export interface GetLambdaFunctionAssociationResult {
    readonly functionArn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId: string;
}
/**
 * Provides details about a specific Connect Lambda Function Association.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.connect.getLambdaFunctionAssociation({
 *     functionArn: "arn:aws:lambda:us-west-2:123456789123:function:abcdefg",
 *     instanceId: "aaaaaaaa-bbbb-cccc-dddd-111111111111",
 * });
 * ```
 */
export function getLambdaFunctionAssociationOutput(args: GetLambdaFunctionAssociationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLambdaFunctionAssociationResult> {
    return pulumi.output(args).apply((a: any) => getLambdaFunctionAssociation(a, opts))
}

/**
 * A collection of arguments for invoking getLambdaFunctionAssociation.
 */
export interface GetLambdaFunctionAssociationOutputArgs {
    /**
     * ARN of the Lambda Function, omitting any version or alias qualifier.
     */
    functionArn: pulumi.Input<string>;
    /**
     * Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */
    instanceId: pulumi.Input<string>;
}
