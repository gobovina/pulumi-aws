// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an GameLift Game Session Queue resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.gamelift.GameSessionQueue("test", {
 *     destinations: [
 *         aws_gamelift_fleet.us_west_2_fleet.arn,
 *         aws_gamelift_fleet.eu_central_1_fleet.arn,
 *     ],
 *     notificationTarget: aws_sns_topic.game_session_queue_notifications.arn,
 *     playerLatencyPolicies: [
 *         {
 *             maximumIndividualPlayerLatencyMilliseconds: 100,
 *             policyDurationSeconds: 5,
 *         },
 *         {
 *             maximumIndividualPlayerLatencyMilliseconds: 200,
 *         },
 *     ],
 *     timeoutInSeconds: 60,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import GameLift Game Session Queues using their `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:gamelift/gameSessionQueue:GameSessionQueue example example
 * ```
 */
export class GameSessionQueue extends pulumi.CustomResource {
    /**
     * Get an existing GameSessionQueue resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GameSessionQueueState, opts?: pulumi.CustomResourceOptions): GameSessionQueue {
        return new GameSessionQueue(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:gamelift/gameSessionQueue:GameSessionQueue';

    /**
     * Returns true if the given object is an instance of GameSessionQueue.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GameSessionQueue {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GameSessionQueue.__pulumiType;
    }

    /**
     * Game Session Queue ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Information to be added to all events that are related to this game session queue.
     */
    public readonly customEventData!: pulumi.Output<string | undefined>;
    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     */
    public readonly destinations!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the session queue.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     */
    public readonly notificationTarget!: pulumi.Output<string | undefined>;
    /**
     * One or more policies used to choose fleet based on player latency. See below.
     */
    public readonly playerLatencyPolicies!: pulumi.Output<outputs.gamelift.GameSessionQueuePlayerLatencyPolicy[] | undefined>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Maximum time a game session request can remain in the queue.
     */
    public readonly timeoutInSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a GameSessionQueue resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GameSessionQueueArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GameSessionQueueArgs | GameSessionQueueState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GameSessionQueueState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["customEventData"] = state ? state.customEventData : undefined;
            resourceInputs["destinations"] = state ? state.destinations : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationTarget"] = state ? state.notificationTarget : undefined;
            resourceInputs["playerLatencyPolicies"] = state ? state.playerLatencyPolicies : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["timeoutInSeconds"] = state ? state.timeoutInSeconds : undefined;
        } else {
            const args = argsOrState as GameSessionQueueArgs | undefined;
            resourceInputs["customEventData"] = args ? args.customEventData : undefined;
            resourceInputs["destinations"] = args ? args.destinations : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationTarget"] = args ? args.notificationTarget : undefined;
            resourceInputs["playerLatencyPolicies"] = args ? args.playerLatencyPolicies : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeoutInSeconds"] = args ? args.timeoutInSeconds : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GameSessionQueue.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GameSessionQueue resources.
 */
export interface GameSessionQueueState {
    /**
     * Game Session Queue ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * Information to be added to all events that are related to this game session queue.
     */
    customEventData?: pulumi.Input<string>;
    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     */
    destinations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the session queue.
     */
    name?: pulumi.Input<string>;
    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     */
    notificationTarget?: pulumi.Input<string>;
    /**
     * One or more policies used to choose fleet based on player latency. See below.
     */
    playerLatencyPolicies?: pulumi.Input<pulumi.Input<inputs.gamelift.GameSessionQueuePlayerLatencyPolicy>[]>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Maximum time a game session request can remain in the queue.
     */
    timeoutInSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a GameSessionQueue resource.
 */
export interface GameSessionQueueArgs {
    /**
     * Information to be added to all events that are related to this game session queue.
     */
    customEventData?: pulumi.Input<string>;
    /**
     * List of fleet/alias ARNs used by session queue for placing game sessions.
     */
    destinations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the session queue.
     */
    name?: pulumi.Input<string>;
    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     */
    notificationTarget?: pulumi.Input<string>;
    /**
     * One or more policies used to choose fleet based on player latency. See below.
     */
    playerLatencyPolicies?: pulumi.Input<pulumi.Input<inputs.gamelift.GameSessionQueuePlayerLatencyPolicy>[]>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Maximum time a game session request can remain in the queue.
     */
    timeoutInSeconds?: pulumi.Input<number>;
}
