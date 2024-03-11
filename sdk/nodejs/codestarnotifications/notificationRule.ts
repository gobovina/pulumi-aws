// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a CodeStar Notifications Rule.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const code = new aws.codecommit.Repository("code", {repositoryName: "example-code-repo"});
 * const notif = new aws.sns.Topic("notif", {name: "notification"});
 * const notifAccess = notif.arn.apply(arn => aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         actions: ["sns:Publish"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["codestar-notifications.amazonaws.com"],
 *         }],
 *         resources: [arn],
 *     }],
 * }));
 * const _default = new aws.sns.TopicPolicy("default", {
 *     arn: notif.arn,
 *     policy: notifAccess.apply(notifAccess => notifAccess.json),
 * });
 * const commits = new aws.codestarnotifications.NotificationRule("commits", {
 *     detailType: "BASIC",
 *     eventTypeIds: ["codecommit-repository-comments-on-commits"],
 *     name: "example-code-repo-commits",
 *     resource: code.arn,
 *     targets: [{
 *         address: notif.arn,
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import CodeStar notification rule using the ARN. For example:
 *
 * ```sh
 * $ pulumi import aws:codestarnotifications/notificationRule:NotificationRule foo arn:aws:codestar-notifications:us-west-1:0123456789:notificationrule/2cdc68a3-8f7c-4893-b6a5-45b362bd4f2b
 * ```
 */
export class NotificationRule extends pulumi.CustomResource {
    /**
     * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationRuleState, opts?: pulumi.CustomResourceOptions): NotificationRule {
        return new NotificationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:codestarnotifications/notificationRule:NotificationRule';

    /**
     * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationRule.__pulumiType;
    }

    /**
     * The codestar notification rule ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     */
    public readonly detailType!: pulumi.Output<string>;
    /**
     * A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     */
    public readonly eventTypeIds!: pulumi.Output<string[]>;
    /**
     * The name of notification rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ARN of the resource to associate with the notification rule.
     */
    public readonly resource!: pulumi.Output<string>;
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     */
    public readonly status!: pulumi.Output<string | undefined>;
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
     * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     */
    public readonly targets!: pulumi.Output<outputs.codestarnotifications.NotificationRuleTarget[] | undefined>;

    /**
     * Create a NotificationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationRuleArgs | NotificationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationRuleState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["detailType"] = state ? state.detailType : undefined;
            resourceInputs["eventTypeIds"] = state ? state.eventTypeIds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resource"] = state ? state.resource : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targets"] = state ? state.targets : undefined;
        } else {
            const args = argsOrState as NotificationRuleArgs | undefined;
            if ((!args || args.detailType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'detailType'");
            }
            if ((!args || args.eventTypeIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventTypeIds'");
            }
            if ((!args || args.resource === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resource'");
            }
            resourceInputs["detailType"] = args ? args.detailType : undefined;
            resourceInputs["eventTypeIds"] = args ? args.eventTypeIds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resource"] = args ? args.resource : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targets"] = args ? args.targets : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationRule resources.
 */
export interface NotificationRuleState {
    /**
     * The codestar notification rule ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     */
    detailType?: pulumi.Input<string>;
    /**
     * A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     */
    eventTypeIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of notification rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN of the resource to associate with the notification rule.
     */
    resource?: pulumi.Input<string>;
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     */
    status?: pulumi.Input<string>;
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
    /**
     * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     */
    targets?: pulumi.Input<pulumi.Input<inputs.codestarnotifications.NotificationRuleTarget>[]>;
}

/**
 * The set of arguments for constructing a NotificationRule resource.
 */
export interface NotificationRuleArgs {
    /**
     * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
     */
    detailType: pulumi.Input<string>;
    /**
     * A list of event types associated with this notification rule.
     * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
     */
    eventTypeIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of notification rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN of the resource to associate with the notification rule.
     */
    resource: pulumi.Input<string>;
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     */
    targets?: pulumi.Input<pulumi.Input<inputs.codestarnotifications.NotificationRuleTarget>[]>;
}
