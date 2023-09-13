// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source provides information on the IAM source role of an STS assumed role. For non-role ARNs, this data source simply passes the ARN through in `issuerArn`.
 *
 * For some AWS resources, multiple types of principals are allowed in the same argument (e.g., IAM users and IAM roles). However, these arguments often do not allow assumed-role (i.e., STS, temporary credential) principals. Given an STS ARN, this data source provides the ARN for the source IAM role.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.iam.getSessionContext({
 *     arn: "arn:aws:sts::123456789012:assumed-role/Audien-Heaven/MatyNoyes",
 * });
 * ```
 * ### Find the TODO Runner's Source Role
 *
 * Combined with `aws.getCallerIdentity`, you can get the current user's source IAM role ARN (`issuerArn`) if you're using an assumed role. If you're not using an assumed role, the caller's (e.g., an IAM user's) ARN will simply be passed through. In environments where both IAM users and individuals using assumed roles need to apply the same configurations, this data source enables seamless use.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = current.then(current => aws.iam.getSessionContext({
 *     arn: current.arn,
 * }));
 * ```
 */
export function getSessionContext(args: GetSessionContextArgs, opts?: pulumi.InvokeOptions): Promise<GetSessionContextResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:iam/getSessionContext:getSessionContext", {
        "arn": args.arn,
    }, opts);
}

/**
 * A collection of arguments for invoking getSessionContext.
 */
export interface GetSessionContextArgs {
    /**
     * ARN for an assumed role.
     *
     * > If `arn` is a non-role ARN, TODO gives no error and `issuerArn` will be equal to the `arn` value. For STS assumed-role ARNs, TODO gives an error if the identified IAM role does not exist.
     */
    arn: string;
}

/**
 * A collection of values returned by getSessionContext.
 */
export interface GetSessionContextResult {
    readonly arn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IAM source role ARN if `arn` corresponds to an STS assumed role. Otherwise, `issuerArn` is equal to `arn`.
     */
    readonly issuerArn: string;
    /**
     * Unique identifier of the IAM role that issues the STS assumed role.
     */
    readonly issuerId: string;
    /**
     * Name of the source role. Only available if `arn` corresponds to an STS assumed role.
     */
    readonly issuerName: string;
    /**
     * Name of the STS session. Only available if `arn` corresponds to an STS assumed role.
     */
    readonly sessionName: string;
}
/**
 * This data source provides information on the IAM source role of an STS assumed role. For non-role ARNs, this data source simply passes the ARN through in `issuerArn`.
 *
 * For some AWS resources, multiple types of principals are allowed in the same argument (e.g., IAM users and IAM roles). However, these arguments often do not allow assumed-role (i.e., STS, temporary credential) principals. Given an STS ARN, this data source provides the ARN for the source IAM role.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.iam.getSessionContext({
 *     arn: "arn:aws:sts::123456789012:assumed-role/Audien-Heaven/MatyNoyes",
 * });
 * ```
 * ### Find the TODO Runner's Source Role
 *
 * Combined with `aws.getCallerIdentity`, you can get the current user's source IAM role ARN (`issuerArn`) if you're using an assumed role. If you're not using an assumed role, the caller's (e.g., an IAM user's) ARN will simply be passed through. In environments where both IAM users and individuals using assumed roles need to apply the same configurations, this data source enables seamless use.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = current.then(current => aws.iam.getSessionContext({
 *     arn: current.arn,
 * }));
 * ```
 */
export function getSessionContextOutput(args: GetSessionContextOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSessionContextResult> {
    return pulumi.output(args).apply((a: any) => getSessionContext(a, opts))
}

/**
 * A collection of arguments for invoking getSessionContext.
 */
export interface GetSessionContextOutputArgs {
    /**
     * ARN for an assumed role.
     *
     * > If `arn` is a non-role ARN, TODO gives no error and `issuerArn` will be equal to the `arn` value. For STS assumed-role ARNs, TODO gives an error if the identified IAM role does not exist.
     */
    arn: pulumi.Input<string>;
}
