// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source can be used to fetch information about a specific
 * QuickSight user. By using this data source, you can reference QuickSight user
 * properties without having to hard code ARNs or unique IDs as input.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.quicksight.getQuicksightUser({
 *     userName: "example",
 * });
 * ```
 */
export function getQuicksightUser(args: GetQuicksightUserArgs, opts?: pulumi.InvokeOptions): Promise<GetQuicksightUserResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:quicksight/getQuicksightUser:getQuicksightUser", {
        "awsAccountId": args.awsAccountId,
        "namespace": args.namespace,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuicksightUser.
 */
export interface GetQuicksightUserArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: string;
    /**
     * QuickSight namespace. Defaults to `default`.
     */
    namespace?: string;
    /**
     * The name of the user that you want to match.
     *
     * The following arguments are optional:
     */
    userName: string;
}

/**
 * A collection of values returned by getQuicksightUser.
 */
export interface GetQuicksightUserResult {
    /**
     * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
     */
    readonly active: boolean;
    /**
     * The Amazon Resource Name (ARN) for the user.
     */
    readonly arn: string;
    readonly awsAccountId: string;
    /**
     * The user's email address.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The type of identity authentication used by the user.
     */
    readonly identityType: string;
    readonly namespace?: string;
    /**
     * The principal ID of the user.
     */
    readonly principalId: string;
    readonly userName: string;
    /**
     * The Amazon QuickSight role for the user. The user role can be one of the following:.
     * - `READER`: A user who has read-only access to dashboards.
     * - `AUTHOR`: A user who can create data sources, datasets, analyses, and dashboards.
     * - `ADMIN`: A user who is an author, who can also manage Amazon QuickSight settings.
     */
    readonly userRole: string;
}
/**
 * This data source can be used to fetch information about a specific
 * QuickSight user. By using this data source, you can reference QuickSight user
 * properties without having to hard code ARNs or unique IDs as input.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.quicksight.getQuicksightUser({
 *     userName: "example",
 * });
 * ```
 */
export function getQuicksightUserOutput(args: GetQuicksightUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetQuicksightUserResult> {
    return pulumi.output(args).apply((a: any) => getQuicksightUser(a, opts))
}

/**
 * A collection of arguments for invoking getQuicksightUser.
 */
export interface GetQuicksightUserOutputArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * QuickSight namespace. Defaults to `default`.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The name of the user that you want to match.
     *
     * The following arguments are optional:
     */
    userName: pulumi.Input<string>;
}
