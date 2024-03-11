// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Pinpoint Baidu Channel resource.
 *
 * > **Note:** All arguments including the Api Key and Secret Key will be stored in the raw state as plain-text.
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const app = new aws.pinpoint.App("app", {});
 * const channel = new aws.pinpoint.BaiduChannel("channel", {
 *     applicationId: app.applicationId,
 *     apiKey: "",
 *     secretKey: "",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Pinpoint Baidu Channel using the `application-id`. For example:
 *
 * ```sh
 * $ pulumi import aws:pinpoint/baiduChannel:BaiduChannel channel application-id
 * ```
 */
export class BaiduChannel extends pulumi.CustomResource {
    /**
     * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BaiduChannelState, opts?: pulumi.CustomResourceOptions): BaiduChannel {
        return new BaiduChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:pinpoint/baiduChannel:BaiduChannel';

    /**
     * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BaiduChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BaiduChannel.__pulumiType;
    }

    /**
     * Platform credential API key from Baidu.
     */
    public readonly apiKey!: pulumi.Output<string>;
    /**
     * The application ID.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Platform credential Secret key from Baidu.
     */
    public readonly secretKey!: pulumi.Output<string>;

    /**
     * Create a BaiduChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BaiduChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaiduChannelArgs | BaiduChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaiduChannelState | undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
        } else {
            const args = argsOrState as BaiduChannelArgs | undefined;
            if ((!args || args.apiKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiKey'");
            }
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.secretKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretKey'");
            }
            resourceInputs["apiKey"] = args?.apiKey ? pulumi.secret(args.apiKey) : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["secretKey"] = args?.secretKey ? pulumi.secret(args.secretKey) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey", "secretKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BaiduChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BaiduChannel resources.
 */
export interface BaiduChannelState {
    /**
     * Platform credential API key from Baidu.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * The application ID.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Platform credential Secret key from Baidu.
     */
    secretKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BaiduChannel resource.
 */
export interface BaiduChannelArgs {
    /**
     * Platform credential API key from Baidu.
     */
    apiKey: pulumi.Input<string>;
    /**
     * The application ID.
     */
    applicationId: pulumi.Input<string>;
    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Platform credential Secret key from Baidu.
     */
    secretKey: pulumi.Input<string>;
}
