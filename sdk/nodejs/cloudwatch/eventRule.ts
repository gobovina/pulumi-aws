// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge Rule resource.
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const console = new aws.cloudwatch.EventRule("console", {
 *     description: "Capture each AWS Console Sign In",
 *     eventPattern: JSON.stringify({
 *         "detail-type": ["AWS Console Sign In via CloudTrail"],
 *     }),
 * });
 * const awsLogins = new aws.sns.Topic("awsLogins", {});
 * const sns = new aws.cloudwatch.EventTarget("sns", {
 *     rule: console.name,
 *     arn: awsLogins.arn,
 * });
 * const snsTopicPolicy = awsLogins.arn.apply(arn => aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["SNS:Publish"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["events.amazonaws.com"],
 *         }],
 *         resources: [arn],
 *     }],
 * }));
 * const _default = new aws.sns.TopicPolicy("default", {
 *     arn: awsLogins.arn,
 *     policy: snsTopicPolicy.apply(snsTopicPolicy => snsTopicPolicy.json),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EventBridge Rules using the `event_bus_name/rule_name` (if you omit `event_bus_name`, the `default` event bus will be used). For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventRule:EventRule console example-event-bus/capture-console-sign-in
 * ```
 */
export class EventRule extends pulumi.CustomResource {
    /**
     * Get an existing EventRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventRuleState, opts?: pulumi.CustomResourceOptions): EventRule {
        return new EventRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudwatch/eventRule:EventRule';

    /**
     * Returns true if the given object is an instance of EventRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventRule.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the rule.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The description of the rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name or ARN of the event bus to associate with this rule.
     * If you omit this, the `default` event bus is used.
     */
    public readonly eventBusName!: pulumi.Output<string | undefined>;
    /**
     * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details. **Note**: The event pattern size is 2048 by default but it is adjustable up to 4096 characters by submitting a service quota increase request. See [Amazon EventBridge quotas](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-quota.html) for details.
     */
    public readonly eventPattern!: pulumi.Output<string | undefined>;
    /**
     * Whether the rule should be enabled.
     * Defaults to `true`.
     * Conflicts with `state`.
     *
     * @deprecated Use "state" instead
     */
    public readonly isEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. **Note**: Due to the length of the generated suffix, must be 38 characters or less.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     */
    public readonly roleArn!: pulumi.Output<string | undefined>;
    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     */
    public readonly scheduleExpression!: pulumi.Output<string | undefined>;
    /**
     * State of the rule.
     * Valid values are `DISABLED`, `ENABLED`, and `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * When state is `ENABLED`, the rule is enabled for all events except those delivered by CloudTrail.
     * To also enable the rule for events delivered by CloudTrail, set `state` to `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * Defaults to `ENABLED`.
     * Conflicts with `isEnabled`.
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a EventRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EventRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventRuleArgs | EventRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventRuleState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["eventBusName"] = state ? state.eventBusName : undefined;
            resourceInputs["eventPattern"] = state ? state.eventPattern : undefined;
            resourceInputs["isEnabled"] = state ? state.isEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["scheduleExpression"] = state ? state.scheduleExpression : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as EventRuleArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["eventBusName"] = args ? args.eventBusName : undefined;
            resourceInputs["eventPattern"] = args ? args.eventPattern : undefined;
            resourceInputs["isEnabled"] = args ? args.isEnabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["scheduleExpression"] = args ? args.scheduleExpression : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventRule resources.
 */
export interface EventRuleState {
    /**
     * The Amazon Resource Name (ARN) of the rule.
     */
    arn?: pulumi.Input<string>;
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The name or ARN of the event bus to associate with this rule.
     * If you omit this, the `default` event bus is used.
     */
    eventBusName?: pulumi.Input<string>;
    /**
     * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details. **Note**: The event pattern size is 2048 by default but it is adjustable up to 4096 characters by submitting a service quota increase request. See [Amazon EventBridge quotas](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-quota.html) for details.
     */
    eventPattern?: pulumi.Input<string>;
    /**
     * Whether the rule should be enabled.
     * Defaults to `true`.
     * Conflicts with `state`.
     *
     * @deprecated Use "state" instead
     */
    isEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. **Note**: Due to the length of the generated suffix, must be 38 characters or less.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     */
    scheduleExpression?: pulumi.Input<string>;
    /**
     * State of the rule.
     * Valid values are `DISABLED`, `ENABLED`, and `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * When state is `ENABLED`, the rule is enabled for all events except those delivered by CloudTrail.
     * To also enable the rule for events delivered by CloudTrail, set `state` to `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * Defaults to `ENABLED`.
     * Conflicts with `isEnabled`.
     */
    state?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a EventRule resource.
 */
export interface EventRuleArgs {
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The name or ARN of the event bus to associate with this rule.
     * If you omit this, the `default` event bus is used.
     */
    eventBusName?: pulumi.Input<string>;
    /**
     * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details. **Note**: The event pattern size is 2048 by default but it is adjustable up to 4096 characters by submitting a service quota increase request. See [Amazon EventBridge quotas](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-quota.html) for details.
     */
    eventPattern?: pulumi.Input<string>;
    /**
     * Whether the rule should be enabled.
     * Defaults to `true`.
     * Conflicts with `state`.
     *
     * @deprecated Use "state" instead
     */
    isEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. **Note**: Due to the length of the generated suffix, must be 38 characters or less.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     */
    scheduleExpression?: pulumi.Input<string>;
    /**
     * State of the rule.
     * Valid values are `DISABLED`, `ENABLED`, and `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * When state is `ENABLED`, the rule is enabled for all events except those delivered by CloudTrail.
     * To also enable the rule for events delivered by CloudTrail, set `state` to `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS`.
     * Defaults to `ENABLED`.
     * Conflicts with `isEnabled`.
     */
    state?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
