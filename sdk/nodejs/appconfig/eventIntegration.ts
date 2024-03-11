// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amazon AppIntegrations Event Integration resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appconfig.EventIntegration("example", {
 *     name: "example-name",
 *     description: "Example Description",
 *     eventbridgeBus: "default",
 *     eventFilter: {
 *         source: "aws.partner/examplepartner.com",
 *     },
 *     tags: {
 *         Name: "Example Event Integration",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Amazon AppIntegrations Event Integrations using the `name`. For example:
 *
 * ```sh
 * $ pulumi import aws:appconfig/eventIntegration:EventIntegration example example-name
 * ```
 */
export class EventIntegration extends pulumi.CustomResource {
    /**
     * Get an existing EventIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventIntegrationState, opts?: pulumi.CustomResourceOptions): EventIntegration {
        return new EventIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appconfig/eventIntegration:EventIntegration';

    /**
     * Returns true if the given object is an instance of EventIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventIntegration.__pulumiType;
    }

    /**
     * ARN of the Event Integration.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of the Event Integration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     */
    public readonly eventFilter!: pulumi.Output<outputs.appconfig.EventIntegrationEventFilter>;
    /**
     * EventBridge bus.
     */
    public readonly eventbridgeBus!: pulumi.Output<string>;
    /**
     * Name of the Event Integration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Tags to apply to the Event Integration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a EventIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventIntegrationArgs | EventIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventIntegrationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["eventFilter"] = state ? state.eventFilter : undefined;
            resourceInputs["eventbridgeBus"] = state ? state.eventbridgeBus : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as EventIntegrationArgs | undefined;
            if ((!args || args.eventFilter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventFilter'");
            }
            if ((!args || args.eventbridgeBus === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventbridgeBus'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["eventFilter"] = args ? args.eventFilter : undefined;
            resourceInputs["eventbridgeBus"] = args ? args.eventbridgeBus : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventIntegration resources.
 */
export interface EventIntegrationState {
    /**
     * ARN of the Event Integration.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of the Event Integration.
     */
    description?: pulumi.Input<string>;
    /**
     * Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     */
    eventFilter?: pulumi.Input<inputs.appconfig.EventIntegrationEventFilter>;
    /**
     * EventBridge bus.
     */
    eventbridgeBus?: pulumi.Input<string>;
    /**
     * Name of the Event Integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Tags to apply to the Event Integration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a EventIntegration resource.
 */
export interface EventIntegrationArgs {
    /**
     * Description of the Event Integration.
     */
    description?: pulumi.Input<string>;
    /**
     * Block that defines the configuration information for the event filter. The Event Filter block is documented below.
     */
    eventFilter: pulumi.Input<inputs.appconfig.EventIntegrationEventFilter>;
    /**
     * EventBridge bus.
     */
    eventbridgeBus: pulumi.Input<string>;
    /**
     * Name of the Event Integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Tags to apply to the Event Integration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
