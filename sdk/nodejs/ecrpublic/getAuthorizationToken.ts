// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The Public ECR Authorization Token data source allows the authorization token, token expiration date, user name and password to be retrieved for a Public ECR repository.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const token = pulumi.output(aws.ecrpublic.getAuthorizationToken());
 * ```
 */
export function getAuthorizationToken(opts?: pulumi.InvokeOptions): Promise<GetAuthorizationTokenResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ecrpublic/getAuthorizationToken:getAuthorizationToken", {
    }, opts);
}

/**
 * A collection of values returned by getAuthorizationToken.
 */
export interface GetAuthorizationTokenResult {
    /**
     * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
     */
    readonly authorizationToken: string;
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     */
    readonly expiresAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Password decoded from the authorization token.
     */
    readonly password: string;
    /**
     * User name decoded from the authorization token.
     */
    readonly userName: string;
}
