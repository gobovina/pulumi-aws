// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge Scheduler Schedule Group resource.
 *
 * You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.scheduler.ScheduleGroup("example", {});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import schedule groups using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:scheduler/scheduleGroup:ScheduleGroup example my-schedule-group
 * ```
 */
export class ScheduleGroup extends pulumi.CustomResource {
    /**
     * Get an existing ScheduleGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleGroupState, opts?: pulumi.CustomResourceOptions): ScheduleGroup {
        return new ScheduleGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:scheduler/scheduleGroup:ScheduleGroup';

    /**
     * Returns true if the given object is an instance of ScheduleGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScheduleGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScheduleGroup.__pulumiType;
    }

    /**
     * ARN of the schedule group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Time at which the schedule group was created.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * Time at which the schedule group was last modified.
     */
    public /*out*/ readonly lastModificationDate!: pulumi.Output<string>;
    /**
     * Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * State of the schedule group. Can be `ACTIVE` or `DELETING`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ScheduleGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ScheduleGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleGroupArgs | ScheduleGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduleGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["lastModificationDate"] = state ? state.lastModificationDate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ScheduleGroupArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["lastModificationDate"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ScheduleGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScheduleGroup resources.
 */
export interface ScheduleGroupState {
    /**
     * ARN of the schedule group.
     */
    arn?: pulumi.Input<string>;
    /**
     * Time at which the schedule group was created.
     */
    creationDate?: pulumi.Input<string>;
    /**
     * Time at which the schedule group was last modified.
     */
    lastModificationDate?: pulumi.Input<string>;
    /**
     * Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * State of the schedule group. Can be `ACTIVE` or `DELETING`.
     */
    state?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ScheduleGroup resource.
 */
export interface ScheduleGroupArgs {
    /**
     * Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
