// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides details about an Outposts Site.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.outposts.getSite({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSite(args?: GetSiteArgs, opts?: pulumi.InvokeOptions): Promise<GetSiteResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:outposts/getSite:getSite", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSite.
 */
export interface GetSiteArgs {
    /**
     * Identifier of the Site.
     */
    id?: string;
    /**
     * Name of the Site.
     */
    name?: string;
}

/**
 * A collection of values returned by getSite.
 */
export interface GetSiteResult {
    /**
     * AWS Account identifier.
     */
    readonly accountId: string;
    /**
     * Description.
     */
    readonly description: string;
    readonly id: string;
    readonly name: string;
}
/**
 * Provides details about an Outposts Site.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.outposts.getSite({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSiteOutput(args?: GetSiteOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSiteResult> {
    return pulumi.output(args).apply((a: any) => getSite(a, opts))
}

/**
 * A collection of arguments for invoking getSite.
 */
export interface GetSiteOutputArgs {
    /**
     * Identifier of the Site.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the Site.
     */
    name?: pulumi.Input<string>;
}
