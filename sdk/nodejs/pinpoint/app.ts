// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Pinpoint App resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.pinpoint.App("example", {
 *     name: "test-app",
 *     limits: {
 *         maximumDuration: 600,
 *     },
 *     quietTime: {
 *         start: "00:00",
 *         end: "06:00",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Pinpoint App using the `application-id`. For example:
 *
 * ```sh
 * $ pulumi import aws:pinpoint/app:App name application-id
 * ```
 */
export class App extends pulumi.CustomResource {
    /**
     * Get an existing App resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppState, opts?: pulumi.CustomResourceOptions): App {
        return new App(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:pinpoint/app:App';

    /**
     * Returns true if the given object is an instance of App.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is App {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === App.__pulumiType;
    }

    /**
     * The Application ID of the Pinpoint App.
     */
    public /*out*/ readonly applicationId!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the PinPoint Application
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     */
    public readonly campaignHook!: pulumi.Output<outputs.pinpoint.AppCampaignHook | undefined>;
    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     */
    public readonly limits!: pulumi.Output<outputs.pinpoint.AppLimits | undefined>;
    /**
     * The application name. By default generated by Pulumi
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Pinpoint application. Conflicts with `name`
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     */
    public readonly quietTime!: pulumi.Output<outputs.pinpoint.AppQuietTime | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a App resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppArgs | AppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["campaignHook"] = state ? state.campaignHook : undefined;
            resourceInputs["limits"] = state ? state.limits : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["quietTime"] = state ? state.quietTime : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AppArgs | undefined;
            resourceInputs["campaignHook"] = args ? args.campaignHook : undefined;
            resourceInputs["limits"] = args ? args.limits : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["quietTime"] = args ? args.quietTime : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["applicationId"] = undefined /*out*/;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(App.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering App resources.
 */
export interface AppState {
    /**
     * The Application ID of the Pinpoint App.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the PinPoint Application
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     */
    campaignHook?: pulumi.Input<inputs.pinpoint.AppCampaignHook>;
    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     */
    limits?: pulumi.Input<inputs.pinpoint.AppLimits>;
    /**
     * The application name. By default generated by Pulumi
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Pinpoint application. Conflicts with `name`
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     */
    quietTime?: pulumi.Input<inputs.pinpoint.AppQuietTime>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a App resource.
 */
export interface AppArgs {
    /**
     * Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     */
    campaignHook?: pulumi.Input<inputs.pinpoint.AppCampaignHook>;
    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     */
    limits?: pulumi.Input<inputs.pinpoint.AppLimits>;
    /**
     * The application name. By default generated by Pulumi
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Pinpoint application. Conflicts with `name`
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     */
    quietTime?: pulumi.Input<inputs.pinpoint.AppQuietTime>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
