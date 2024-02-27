// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge event bus resource.
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const messenger = new aws.cloudwatch.EventBus("messenger", {});
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplepartnerEventSource = aws.cloudwatch.getEventSource({
 *     namePrefix: "aws.partner/examplepartner.com",
 * });
 * const examplepartnerEventBus = new aws.cloudwatch.EventBus("examplepartnerEventBus", {eventSourceName: examplepartnerEventSource.then(examplepartnerEventSource => examplepartnerEventSource.name)});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EventBridge event buses using the `name` (which can also be a partner event source name). For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventBus:EventBus messenger chat-messages
 * ```
 */
export class EventBus extends pulumi.CustomResource {
    /**
     * Get an existing EventBus resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventBusState, opts?: pulumi.CustomResourceOptions): EventBus {
        return new EventBus(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudwatch/eventBus:EventBus';

    /**
     * Returns true if the given object is an instance of EventBus.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventBus {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventBus.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the event bus.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The partner event source that the new event bus will be matched with. Must match `name`.
     */
    public readonly eventSourceName!: pulumi.Output<string | undefined>;
    /**
     * The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a EventBus resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EventBusArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventBusArgs | EventBusState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventBusState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["eventSourceName"] = state ? state.eventSourceName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as EventBusArgs | undefined;
            resourceInputs["eventSourceName"] = args ? args.eventSourceName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventBus.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventBus resources.
 */
export interface EventBusState {
    /**
     * The Amazon Resource Name (ARN) of the event bus.
     */
    arn?: pulumi.Input<string>;
    /**
     * The partner event source that the new event bus will be matched with. Must match `name`.
     */
    eventSourceName?: pulumi.Input<string>;
    /**
     * The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a EventBus resource.
 */
export interface EventBusArgs {
    /**
     * The partner event source that the new event bus will be matched with. Must match `name`.
     */
    eventSourceName?: pulumi.Input<string>;
    /**
     * The name of the new event bus. The names of custom event buses can't contain the / character. To create a partner event bus, ensure the `name` matches the `eventSourceName`.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
