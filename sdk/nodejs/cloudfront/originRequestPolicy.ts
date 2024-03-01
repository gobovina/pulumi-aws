// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * The following example below creates a CloudFront origin request policy.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudfront.OriginRequestPolicy("example", {
 *     name: "example-policy",
 *     comment: "example comment",
 *     cookiesConfig: {
 *         cookieBehavior: "whitelist",
 *         cookies: {
 *             items: ["example"],
 *         },
 *     },
 *     headersConfig: {
 *         headerBehavior: "whitelist",
 *         headers: {
 *             items: ["example"],
 *         },
 *     },
 *     queryStringsConfig: {
 *         queryStringBehavior: "whitelist",
 *         queryStrings: {
 *             items: ["example"],
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Cloudfront Origin Request Policies using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudfront/originRequestPolicy:OriginRequestPolicy policy ccca32ef-dce3-4df3-80df-1bd3000bc4d3
 * ```
 */
export class OriginRequestPolicy extends pulumi.CustomResource {
    /**
     * Get an existing OriginRequestPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OriginRequestPolicyState, opts?: pulumi.CustomResourceOptions): OriginRequestPolicy {
        return new OriginRequestPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudfront/originRequestPolicy:OriginRequestPolicy';

    /**
     * Returns true if the given object is an instance of OriginRequestPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OriginRequestPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OriginRequestPolicy.__pulumiType;
    }

    /**
     * Comment to describe the origin request policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     */
    public readonly cookiesConfig!: pulumi.Output<outputs.cloudfront.OriginRequestPolicyCookiesConfig>;
    /**
     * The current version of the origin request policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     */
    public readonly headersConfig!: pulumi.Output<outputs.cloudfront.OriginRequestPolicyHeadersConfig>;
    /**
     * Unique name to identify the origin request policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     */
    public readonly queryStringsConfig!: pulumi.Output<outputs.cloudfront.OriginRequestPolicyQueryStringsConfig>;

    /**
     * Create a OriginRequestPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OriginRequestPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OriginRequestPolicyArgs | OriginRequestPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OriginRequestPolicyState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["cookiesConfig"] = state ? state.cookiesConfig : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["headersConfig"] = state ? state.headersConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["queryStringsConfig"] = state ? state.queryStringsConfig : undefined;
        } else {
            const args = argsOrState as OriginRequestPolicyArgs | undefined;
            if ((!args || args.cookiesConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cookiesConfig'");
            }
            if ((!args || args.headersConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'headersConfig'");
            }
            if ((!args || args.queryStringsConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'queryStringsConfig'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["cookiesConfig"] = args ? args.cookiesConfig : undefined;
            resourceInputs["headersConfig"] = args ? args.headersConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["queryStringsConfig"] = args ? args.queryStringsConfig : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OriginRequestPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OriginRequestPolicy resources.
 */
export interface OriginRequestPolicyState {
    /**
     * Comment to describe the origin request policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     */
    cookiesConfig?: pulumi.Input<inputs.cloudfront.OriginRequestPolicyCookiesConfig>;
    /**
     * The current version of the origin request policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     */
    headersConfig?: pulumi.Input<inputs.cloudfront.OriginRequestPolicyHeadersConfig>;
    /**
     * Unique name to identify the origin request policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     */
    queryStringsConfig?: pulumi.Input<inputs.cloudfront.OriginRequestPolicyQueryStringsConfig>;
}

/**
 * The set of arguments for constructing a OriginRequestPolicy resource.
 */
export interface OriginRequestPolicyArgs {
    /**
     * Comment to describe the origin request policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     */
    cookiesConfig: pulumi.Input<inputs.cloudfront.OriginRequestPolicyCookiesConfig>;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     */
    headersConfig: pulumi.Input<inputs.cloudfront.OriginRequestPolicyHeadersConfig>;
    /**
     * Unique name to identify the origin request policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     */
    queryStringsConfig: pulumi.Input<inputs.cloudfront.OriginRequestPolicyQueryStringsConfig>;
}
