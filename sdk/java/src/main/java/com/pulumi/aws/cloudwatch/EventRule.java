// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventRuleArgs;
import com.pulumi.aws.cloudwatch.inputs.EventRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge Rule resource.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventRule;
 * import com.pulumi.aws.cloudwatch.EventRuleArgs;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.cloudwatch.EventTarget;
 * import com.pulumi.aws.cloudwatch.EventTargetArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.sns.TopicPolicy;
 * import com.pulumi.aws.sns.TopicPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var console = new EventRule(&#34;console&#34;, EventRuleArgs.builder()        
 *             .description(&#34;Capture each AWS Console Sign In&#34;)
 *             .eventPattern(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;detail-type&#34;, jsonArray(&#34;AWS Console Sign In via CloudTrail&#34;))
 *                 )))
 *             .build());
 * 
 *         var awsLogins = new Topic(&#34;awsLogins&#34;);
 * 
 *         var sns = new EventTarget(&#34;sns&#34;, EventTargetArgs.builder()        
 *             .rule(console.name())
 *             .arn(awsLogins.arn())
 *             .build());
 * 
 *         final var snsTopicPolicy = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;SNS:Publish&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;events.amazonaws.com&#34;)
 *                     .build())
 *                 .resources(awsLogins.arn())
 *                 .build())
 *             .build());
 * 
 *         var default_ = new TopicPolicy(&#34;default&#34;, TopicPolicyArgs.builder()        
 *             .arn(awsLogins.arn())
 *             .policy(snsTopicPolicy.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(snsTopicPolicy -&gt; snsTopicPolicy.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EventBridge Rules using the `event_bus_name/rule_name` (if you omit `event_bus_name`, the `default` event bus will be used). For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventRule:EventRule console example-event-bus/capture-console-sign-in
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventRule:EventRule")
public class EventRule extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the rule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name or ARN of the event bus to associate with this rule.
     * If you omit this, the `default` event bus is used.
     * 
     */
    @Export(name="eventBusName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The name or ARN of the event bus to associate with this rule.
     * If you omit this, the `default` event bus is used.
     * 
     */
    public Output<Optional<String>> eventBusName() {
        return Codegen.optional(this.eventBusName);
    }
    /**
     * The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    @Export(name="eventPattern", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventPattern;

    /**
     * @return The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    public Output<Optional<String>> eventPattern() {
        return Codegen.optional(this.eventPattern);
    }
    /**
     * Whether the rule should be enabled (defaults to `true`).
     * 
     */
    @Export(name="isEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Whether the rule should be enabled (defaults to `true`).
     * 
     */
    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    @Export(name="scheduleExpression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheduleExpression;

    /**
     * @return The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    public Output<Optional<String>> scheduleExpression() {
        return Codegen.optional(this.scheduleExpression);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventRule(String name) {
        this(name, EventRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventRule(String name, @Nullable EventRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventRule(String name, @Nullable EventRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventRule:EventRule", name, args == null ? EventRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventRule(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventRule:EventRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventRule get(String name, Output<String> id, @Nullable EventRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventRule(name, id, state, options);
    }
}
