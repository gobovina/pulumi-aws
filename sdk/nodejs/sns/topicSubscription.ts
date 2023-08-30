// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

import {Topic} from "./index";

/**
 * Provides a resource for subscribing to SNS topics. Requires that an SNS topic exist for the subscription to attach to. This resource allows you to automatically place messages sent to SNS topics in SQS queues, send them as HTTP(S) POST requests to a given endpoint, send SMS messages, or notify devices / applications. The most likely use case for provider users will probably be SQS queues.
 *
 * > **NOTE:** If the SNS topic and SQS queue are in different AWS regions, the `aws.sns.TopicSubscription` must use an AWS provider that is in the same region as the SNS topic. If the `aws.sns.TopicSubscription` uses a provider with a different region than the SNS topic, this provider will fail to create the subscription.
 *
 * > **NOTE:** Setup of cross-account subscriptions from SNS topics to SQS queues requires the provider to have access to BOTH accounts.
 *
 * > **NOTE:** If an SNS topic and SQS queue are in different AWS accounts but the same region, the `aws.sns.TopicSubscription` must use the AWS provider for the account with the SQS queue. If `aws.sns.TopicSubscription` uses a Provider with a different account than the SQS queue, this provider creates the subscription but does not keep state and tries to re-create the subscription at every `apply`.
 *
 * > **NOTE:** If an SNS topic and SQS queue are in different AWS accounts and different AWS regions, the subscription needs to be initiated from the account with the SQS queue but in the region of the SNS topic.
 *
 * > **NOTE:** You cannot unsubscribe to a subscription that is pending confirmation. If you use `email`, `email-json`, or `http`/`https` (without auto-confirmation enabled), until the subscription is confirmed (e.g., outside of this provider), AWS does not allow this provider to delete / unsubscribe the subscription. If you `destroy` an unconfirmed subscription, this provider will remove the subscription from its state but the subscription will still exist in AWS. However, if you delete an SNS topic, SNS [deletes all the subscriptions](https://docs.aws.amazon.com/sns/latest/dg/sns-delete-subscription-topic.html) associated with the topic. Also, you can import a subscription after confirmation and then have the capability to delete it.
 *
 * ## Example Usage
 *
 * You can directly supply a topic and ARN by hand in the `topicArn` property along with the queue ARN:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const userUpdatesSqsTarget = new aws.sns.TopicSubscription("userUpdatesSqsTarget", {
 *     endpoint: "arn:aws:sqs:us-west-2:432981146916:queue-too",
 *     protocol: "sqs",
 *     topic: "arn:aws:sns:us-west-2:432981146916:user-updates-topic",
 * });
 * ```
 *
 * Alternatively you can use the ARN properties of a managed SNS topic and SQS queue:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const userUpdates = new aws.sns.Topic("userUpdates", {});
 * const userUpdatesQueue = new aws.sqs.Queue("userUpdatesQueue", {});
 * const userUpdatesSqsTarget = new aws.sns.TopicSubscription("userUpdatesSqsTarget", {
 *     topic: userUpdates.arn,
 *     protocol: "sqs",
 *     endpoint: userUpdatesQueue.arn,
 * });
 * ```
 *
 * You can subscribe SNS topics to SQS queues in different Amazon accounts and regions:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const sns = config.getObject<{account-id?: string, display_name?: string, name?: string, region?: string, role-name?: string}>("sns") || {
 *     "account-id": "111111111111",
 *     "role-name": "service/service",
 *     name: "example-sns-topic",
 *     display_name: "example",
 *     region: "us-west-1",
 * };
 * const sqs = config.getObject<{account-id?: string, name?: string, region?: string, role-name?: string}>("sqs") || {
 *     "account-id": "222222222222",
 *     "role-name": "service/service",
 *     name: "example-sqs-queue",
 *     region: "us-east-1",
 * };
 * const sns-topic-policy = aws.iam.getPolicyDocument({
 *     policyId: "__default_policy_ID",
 *     statements: [
 *         {
 *             actions: [
 *                 "SNS:Subscribe",
 *                 "SNS:SetTopicAttributes",
 *                 "SNS:RemovePermission",
 *                 "SNS:Publish",
 *                 "SNS:ListSubscriptionsByTopic",
 *                 "SNS:GetTopicAttributes",
 *                 "SNS:DeleteTopic",
 *                 "SNS:AddPermission",
 *             ],
 *             conditions: [{
 *                 test: "StringEquals",
 *                 variable: "AWS:SourceOwner",
 *                 values: [sns["account-id"]],
 *             }],
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: ["*"],
 *             }],
 *             resources: [`arn:aws:sns:${sns.region}:${sns["account-id"]}:${sns.name}`],
 *             sid: "__default_statement_ID",
 *         },
 *         {
 *             actions: [
 *                 "SNS:Subscribe",
 *                 "SNS:Receive",
 *             ],
 *             conditions: [{
 *                 test: "StringLike",
 *                 variable: "SNS:Endpoint",
 *                 values: [`arn:aws:sqs:${sqs.region}:${sqs["account-id"]}:${sqs.name}`],
 *             }],
 *             effect: "Allow",
 *             principals: [{
 *                 type: "AWS",
 *                 identifiers: ["*"],
 *             }],
 *             resources: [`arn:aws:sns:${sns.region}:${sns["account-id"]}:${sns.name}`],
 *             sid: "__console_sub_0",
 *         },
 *     ],
 * });
 * const sqs-queue-policy = aws.iam.getPolicyDocument({
 *     policyId: `arn:aws:sqs:${sqs.region}:${sqs["account-id"]}:${sqs.name}/SQSDefaultPolicy`,
 *     statements: [{
 *         sid: "example-sns-topic",
 *         effect: "Allow",
 *         principals: [{
 *             type: "AWS",
 *             identifiers: ["*"],
 *         }],
 *         actions: ["SQS:SendMessage"],
 *         resources: [`arn:aws:sqs:${sqs.region}:${sqs["account-id"]}:${sqs.name}`],
 *         conditions: [{
 *             test: "ArnEquals",
 *             variable: "aws:SourceArn",
 *             values: [`arn:aws:sns:${sns.region}:${sns["account-id"]}:${sns.name}`],
 *         }],
 *     }],
 * });
 * // provider to manage SNS topics
 * const awsSns = new aws.Provider("awsSns", {
 *     region: sns.region,
 *     assumeRole: {
 *         roleArn: `arn:aws:iam::${sns["account-id"]}:role/${sns["role-name"]}`,
 *         sessionName: `sns-${sns.region}`,
 *     },
 * });
 * // provider to manage SQS queues
 * const awsSqs = new aws.Provider("awsSqs", {
 *     region: sqs.region,
 *     assumeRole: {
 *         roleArn: `arn:aws:iam::${sqs["account-id"]}:role/${sqs["role-name"]}`,
 *         sessionName: `sqs-${sqs.region}`,
 *     },
 * });
 * // provider to subscribe SQS to SNS (using the SQS account but the SNS region)
 * const sns2sqs = new aws.Provider("sns2sqs", {
 *     region: sns.region,
 *     assumeRole: {
 *         roleArn: `arn:aws:iam::${sqs["account-id"]}:role/${sqs["role-name"]}`,
 *         sessionName: `sns2sqs-${sns.region}`,
 *     },
 * });
 * const sns_topicTopic = new aws.sns.Topic("sns-topicTopic", {
 *     displayName: sns.display_name,
 *     policy: sns_topic_policy.then(sns_topic_policy => sns_topic_policy.json),
 * }, {
 *     provider: aws.sns,
 * });
 * const sqs_queue = new aws.sqs.Queue("sqs-queue", {policy: sqs_queue_policy.then(sqs_queue_policy => sqs_queue_policy.json)}, {
 *     provider: aws.sqs,
 * });
 * const sns_topicTopicSubscription = new aws.sns.TopicSubscription("sns-topicTopicSubscription", {
 *     topic: sns_topicTopic.arn,
 *     protocol: "sqs",
 *     endpoint: sqs_queue.arn,
 * }, {
 *     provider: aws.sns2sqs,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SNS Topic Subscriptions using the subscription `arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:sns/topicSubscription:TopicSubscription user_updates_sqs_target arn:aws:sns:us-west-2:0123456789012:my-topic:8a21d249-4329-4871-acc6-7be709c6ea7f
 * ```
 */
export class TopicSubscription extends pulumi.CustomResource {
    /**
     * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TopicSubscriptionState, opts?: pulumi.CustomResourceOptions): TopicSubscription {
        return new TopicSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sns/topicSubscription:TopicSubscription';

    /**
     * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TopicSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TopicSubscription.__pulumiType;
    }

    /**
     * ARN of the subscription.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     */
    public readonly confirmationTimeoutInMinutes!: pulumi.Output<number | undefined>;
    /**
     * Whether the subscription confirmation request was authenticated.
     */
    public /*out*/ readonly confirmationWasAuthenticated!: pulumi.Output<boolean>;
    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     */
    public readonly deliveryPolicy!: pulumi.Output<string | undefined>;
    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     */
    public readonly endpoint!: pulumi.Output<string>;
    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     */
    public readonly endpointAutoConfirms!: pulumi.Output<boolean | undefined>;
    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     */
    public readonly filterPolicy!: pulumi.Output<string | undefined>;
    /**
     * Whether the `filterPolicy` applies to `MessageAttributes` (default) or `MessageBody`.
     */
    public readonly filterPolicyScope!: pulumi.Output<string>;
    /**
     * AWS account ID of the subscription's owner.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Whether the subscription has not been confirmed.
     */
    public /*out*/ readonly pendingConfirmation!: pulumi.Output<boolean>;
    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     */
    public readonly rawMessageDelivery!: pulumi.Output<boolean | undefined>;
    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     */
    public readonly redrivePolicy!: pulumi.Output<string | undefined>;
    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     */
    public readonly subscriptionRoleArn!: pulumi.Output<string | undefined>;
    /**
     * ARN of the SNS topic to subscribe to.
     *
     * The following arguments are optional:
     */
    public readonly topic!: pulumi.Output<string>;

    /**
     * Create a TopicSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TopicSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TopicSubscriptionArgs | TopicSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TopicSubscriptionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["confirmationTimeoutInMinutes"] = state ? state.confirmationTimeoutInMinutes : undefined;
            resourceInputs["confirmationWasAuthenticated"] = state ? state.confirmationWasAuthenticated : undefined;
            resourceInputs["deliveryPolicy"] = state ? state.deliveryPolicy : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["endpointAutoConfirms"] = state ? state.endpointAutoConfirms : undefined;
            resourceInputs["filterPolicy"] = state ? state.filterPolicy : undefined;
            resourceInputs["filterPolicyScope"] = state ? state.filterPolicyScope : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["pendingConfirmation"] = state ? state.pendingConfirmation : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["rawMessageDelivery"] = state ? state.rawMessageDelivery : undefined;
            resourceInputs["redrivePolicy"] = state ? state.redrivePolicy : undefined;
            resourceInputs["subscriptionRoleArn"] = state ? state.subscriptionRoleArn : undefined;
            resourceInputs["topic"] = state ? state.topic : undefined;
        } else {
            const args = argsOrState as TopicSubscriptionArgs | undefined;
            if ((!args || args.endpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpoint'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            if ((!args || args.topic === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topic'");
            }
            resourceInputs["confirmationTimeoutInMinutes"] = args ? args.confirmationTimeoutInMinutes : undefined;
            resourceInputs["deliveryPolicy"] = args ? args.deliveryPolicy : undefined;
            resourceInputs["endpoint"] = args ? args.endpoint : undefined;
            resourceInputs["endpointAutoConfirms"] = args ? args.endpointAutoConfirms : undefined;
            resourceInputs["filterPolicy"] = args ? args.filterPolicy : undefined;
            resourceInputs["filterPolicyScope"] = args ? args.filterPolicyScope : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["rawMessageDelivery"] = args ? args.rawMessageDelivery : undefined;
            resourceInputs["redrivePolicy"] = args ? args.redrivePolicy : undefined;
            resourceInputs["subscriptionRoleArn"] = args ? args.subscriptionRoleArn : undefined;
            resourceInputs["topic"] = args ? args.topic : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["confirmationWasAuthenticated"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["pendingConfirmation"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TopicSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TopicSubscription resources.
 */
export interface TopicSubscriptionState {
    /**
     * ARN of the subscription.
     */
    arn?: pulumi.Input<string>;
    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     */
    confirmationTimeoutInMinutes?: pulumi.Input<number>;
    /**
     * Whether the subscription confirmation request was authenticated.
     */
    confirmationWasAuthenticated?: pulumi.Input<boolean>;
    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     */
    deliveryPolicy?: pulumi.Input<string>;
    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     */
    endpointAutoConfirms?: pulumi.Input<boolean>;
    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     */
    filterPolicy?: pulumi.Input<string>;
    /**
     * Whether the `filterPolicy` applies to `MessageAttributes` (default) or `MessageBody`.
     */
    filterPolicyScope?: pulumi.Input<string>;
    /**
     * AWS account ID of the subscription's owner.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Whether the subscription has not been confirmed.
     */
    pendingConfirmation?: pulumi.Input<boolean>;
    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     */
    rawMessageDelivery?: pulumi.Input<boolean>;
    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     */
    redrivePolicy?: pulumi.Input<string>;
    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     */
    subscriptionRoleArn?: pulumi.Input<string>;
    /**
     * ARN of the SNS topic to subscribe to.
     *
     * The following arguments are optional:
     */
    topic?: pulumi.Input<string | Topic>;
}

/**
 * The set of arguments for constructing a TopicSubscription resource.
 */
export interface TopicSubscriptionArgs {
    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     */
    confirmationTimeoutInMinutes?: pulumi.Input<number>;
    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     */
    deliveryPolicy?: pulumi.Input<string>;
    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     */
    endpoint: pulumi.Input<string>;
    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     */
    endpointAutoConfirms?: pulumi.Input<boolean>;
    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     */
    filterPolicy?: pulumi.Input<string>;
    /**
     * Whether the `filterPolicy` applies to `MessageAttributes` (default) or `MessageBody`.
     */
    filterPolicyScope?: pulumi.Input<string>;
    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     */
    protocol: pulumi.Input<string>;
    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     */
    rawMessageDelivery?: pulumi.Input<boolean>;
    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     */
    redrivePolicy?: pulumi.Input<string>;
    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     */
    subscriptionRoleArn?: pulumi.Input<string>;
    /**
     * ARN of the SNS topic to subscribe to.
     *
     * The following arguments are optional:
     */
    topic: pulumi.Input<string | Topic>;
}
