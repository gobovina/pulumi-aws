// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This data source can be used to fetch information about a specific
 * IAM OpenID Connect provider. By using this data source, you can retrieve the
 * the resource information by either its `arn` or `url`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.iam.getOpenidConnectProvider({
 *     arn: "arn:aws:iam::123456789012:oidc-provider/accounts.google.com",
 * }));
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.iam.getOpenidConnectProvider({
 *     url: "https://accounts.google.com",
 * }));
 * ```
 */
export function getOpenidConnectProvider(args?: GetOpenidConnectProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetOpenidConnectProviderResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:iam/getOpenidConnectProvider:getOpenidConnectProvider", {
        "arn": args.arn,
        "tags": args.tags,
        "url": args.url,
    }, opts);
}

/**
 * A collection of arguments for invoking getOpenidConnectProvider.
 */
export interface GetOpenidConnectProviderArgs {
    /**
     * The Amazon Resource Name (ARN) specifying the OpenID Connect provider.
     */
    arn?: string;
    /**
     * Map of resource tags for the IAM OIDC provider.
     */
    tags?: {[key: string]: string};
    /**
     * The URL of the OpenID Connect provider.
     */
    url?: string;
}

/**
 * A collection of values returned by getOpenidConnectProvider.
 */
export interface GetOpenidConnectProviderResult {
    readonly arn: string;
    /**
     * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
     */
    readonly clientIdLists: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Map of resource tags for the IAM OIDC provider.
     */
    readonly tags: {[key: string]: string};
    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
     */
    readonly thumbprintLists: string[];
    readonly url: string;
}

export function getOpenidConnectProviderOutput(args?: GetOpenidConnectProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOpenidConnectProviderResult> {
    return pulumi.output(args).apply(a => getOpenidConnectProvider(a, opts))
}

/**
 * A collection of arguments for invoking getOpenidConnectProvider.
 */
export interface GetOpenidConnectProviderOutputArgs {
    /**
     * The Amazon Resource Name (ARN) specifying the OpenID Connect provider.
     */
    arn?: pulumi.Input<string>;
    /**
     * Map of resource tags for the IAM OIDC provider.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The URL of the OpenID Connect provider.
     */
    url?: pulumi.Input<string>;
}
