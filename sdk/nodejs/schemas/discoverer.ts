// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge Schema Discoverer resource.
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
 * const test = new aws.schemas.Discoverer("test", {
 *     sourceArn: messenger.arn,
 *     description: "Auto discover event schemas",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EventBridge discoverers using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:schemas/discoverer:Discoverer test 123
 * ```
 */
export class Discoverer extends pulumi.CustomResource {
    /**
     * Get an existing Discoverer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiscovererState, opts?: pulumi.CustomResourceOptions): Discoverer {
        return new Discoverer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:schemas/discoverer:Discoverer';

    /**
     * Returns true if the given object is an instance of Discoverer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Discoverer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Discoverer.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the discoverer.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The description of the discoverer. Maximum of 256 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the event bus to discover event schemas on.
     */
    public readonly sourceArn!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Discoverer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiscovererArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DiscovererArgs | DiscovererState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DiscovererState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["sourceArn"] = state ? state.sourceArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DiscovererArgs | undefined;
            if ((!args || args.sourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceArn'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["sourceArn"] = args ? args.sourceArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Discoverer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Discoverer resources.
 */
export interface DiscovererState {
    /**
     * The Amazon Resource Name (ARN) of the discoverer.
     */
    arn?: pulumi.Input<string>;
    /**
     * The description of the discoverer. Maximum of 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The ARN of the event bus to discover event schemas on.
     */
    sourceArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Discoverer resource.
 */
export interface DiscovererArgs {
    /**
     * The description of the discoverer. Maximum of 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The ARN of the event bus to discover event schemas on.
     */
    sourceArn: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
