// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve the active SES email identity
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ses.getEmailIdentity({
 *     email: "awesome@example.com",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getEmailIdentity(args: GetEmailIdentityArgs, opts?: pulumi.InvokeOptions): Promise<GetEmailIdentityResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ses/getEmailIdentity:getEmailIdentity", {
        "email": args.email,
    }, opts);
}

/**
 * A collection of arguments for invoking getEmailIdentity.
 */
export interface GetEmailIdentityArgs {
    /**
     * Email identity.
     */
    email: string;
}

/**
 * A collection of values returned by getEmailIdentity.
 */
export interface GetEmailIdentityResult {
    /**
     * The ARN of the email identity.
     */
    readonly arn: string;
    /**
     * Email identity.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Retrieve the active SES email identity
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ses.getEmailIdentity({
 *     email: "awesome@example.com",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getEmailIdentityOutput(args: GetEmailIdentityOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEmailIdentityResult> {
    return pulumi.output(args).apply((a: any) => getEmailIdentity(a, opts))
}

/**
 * A collection of arguments for invoking getEmailIdentity.
 */
export interface GetEmailIdentityOutputArgs {
    /**
     * Email identity.
     */
    email: pulumi.Input<string>;
}
