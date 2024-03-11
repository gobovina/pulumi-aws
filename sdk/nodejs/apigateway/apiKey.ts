// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an API Gateway API Key.
 *
 * > **NOTE:** Since the API Gateway usage plans feature was launched on August 11, 2016, usage plans are now **required** to associate an API key with an API stage.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.apigateway.ApiKey("example", {name: "example"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import API Gateway Keys using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:apigateway/apiKey:ApiKey example 8bklk8bl1k3sB38D9B3l0enyWT8c09B30lkq0blk
 * ```
 */
export class ApiKey extends pulumi.CustomResource {
    /**
     * Get an existing ApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiKeyState, opts?: pulumi.CustomResourceOptions): ApiKey {
        return new ApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigateway/apiKey:ApiKey';

    /**
     * Returns true if the given object is an instance of ApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiKey.__pulumiType;
    }

    /**
     * ARN
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Creation date of the API key
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
     */
    public readonly customerId!: pulumi.Output<string | undefined>;
    /**
     * API key description. Defaults to "Managed by Pulumi".
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Whether the API key can be used by callers. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Last update date of the API key
     */
    public /*out*/ readonly lastUpdatedDate!: pulumi.Output<string>;
    /**
     * Name of the API key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a ApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiKeyArgs | ApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiKeyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["customerId"] = state ? state.customerId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["lastUpdatedDate"] = state ? state.lastUpdatedDate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as ApiKeyArgs | undefined;
            resourceInputs["customerId"] = args ? args.customerId : undefined;
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["value"] = args?.value ? pulumi.secret(args.value) : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["lastUpdatedDate"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiKey resources.
 */
export interface ApiKeyState {
    /**
     * ARN
     */
    arn?: pulumi.Input<string>;
    /**
     * Creation date of the API key
     */
    createdDate?: pulumi.Input<string>;
    /**
     * An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
     */
    customerId?: pulumi.Input<string>;
    /**
     * API key description. Defaults to "Managed by Pulumi".
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the API key can be used by callers. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Last update date of the API key
     */
    lastUpdatedDate?: pulumi.Input<string>;
    /**
     * Name of the API key.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiKey resource.
 */
export interface ApiKeyArgs {
    /**
     * An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
     */
    customerId?: pulumi.Input<string>;
    /**
     * API key description. Defaults to "Managed by Pulumi".
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the API key can be used by callers. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the API key.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
     */
    value?: pulumi.Input<string>;
}
