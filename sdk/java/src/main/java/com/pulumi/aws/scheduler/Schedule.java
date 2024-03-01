// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.scheduler;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.scheduler.ScheduleArgs;
import com.pulumi.aws.scheduler.inputs.ScheduleState;
import com.pulumi.aws.scheduler.outputs.ScheduleFlexibleTimeWindow;
import com.pulumi.aws.scheduler.outputs.ScheduleTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge Scheduler Schedule resource.
 * 
 * You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.scheduler.Schedule;
 * import com.pulumi.aws.scheduler.ScheduleArgs;
 * import com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs;
 * import com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs;
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
 *         var example = new Schedule(&#34;example&#34;, ScheduleArgs.builder()        
 *             .name(&#34;my-schedule&#34;)
 *             .groupName(&#34;default&#34;)
 *             .flexibleTimeWindow(ScheduleFlexibleTimeWindowArgs.builder()
 *                 .mode(&#34;OFF&#34;)
 *                 .build())
 *             .scheduleExpression(&#34;rate(1 hours)&#34;)
 *             .target(ScheduleTargetArgs.builder()
 *                 .arn(exampleAwsSqsQueue.arn())
 *                 .roleArn(exampleAwsIamRole.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Universal Target
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.scheduler.Schedule;
 * import com.pulumi.aws.scheduler.ScheduleArgs;
 * import com.pulumi.aws.scheduler.inputs.ScheduleFlexibleTimeWindowArgs;
 * import com.pulumi.aws.scheduler.inputs.ScheduleTargetArgs;
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
 *         var example = new Queue(&#34;example&#34;);
 * 
 *         var exampleSchedule = new Schedule(&#34;exampleSchedule&#34;, ScheduleArgs.builder()        
 *             .name(&#34;my-schedule&#34;)
 *             .flexibleTimeWindow(ScheduleFlexibleTimeWindowArgs.builder()
 *                 .mode(&#34;OFF&#34;)
 *                 .build())
 *             .scheduleExpression(&#34;rate(1 hours)&#34;)
 *             .target(ScheduleTargetArgs.builder()
 *                 .arn(&#34;arn:aws:scheduler:::aws-sdk:sqs:sendMessage&#34;)
 *                 .roleArn(exampleAwsIamRole.arn())
 *                 .input(example.url().applyValue(url -&gt; serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;messageBody&#34;, &#34;Greetings, programs!&#34;),
 *                         jsonProperty(&#34;queueUrl&#34;, url)
 *                     ))))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import schedules using the combination `group_name/name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:scheduler/schedule:Schedule example my-schedule-group/my-schedule
 * ```
 * 
 */
@ResourceType(type="aws:scheduler/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the SQS queue specified as the destination for the dead-letter queue.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the SQS queue specified as the destination for the dead-letter queue.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Brief description of the schedule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief description of the schedule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    @Export(name="endDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endDate;

    /**
     * @return The date, in UTC, before which the schedule can invoke its target. Depending on the schedule&#39;s recurrence expression, invocations might stop on, or before, the end date you specify. EventBridge Scheduler ignores the end date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    public Output<Optional<String>> endDate() {
        return Codegen.optional(this.endDate);
    }
    /**
     * Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * 
     */
    @Export(name="flexibleTimeWindow", refs={ScheduleFlexibleTimeWindow.class}, tree="[0]")
    private Output<ScheduleFlexibleTimeWindow> flexibleTimeWindow;

    /**
     * @return Configures a time window during which EventBridge Scheduler invokes the schedule. Detailed below.
     * 
     */
    public Output<ScheduleFlexibleTimeWindow> flexibleTimeWindow() {
        return this.flexibleTimeWindow;
    }
    /**
     * Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output<String> groupName;

    /**
     * @return Name of the schedule group to associate with this schedule. When omitted, the `default` schedule group is used.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyArn;

    /**
     * @return ARN for the customer managed KMS key that EventBridge Scheduler will use to encrypt and decrypt your data.
     * 
     */
    public Output<Optional<String>> kmsKeyArn() {
        return Codegen.optional(this.kmsKeyArn);
    }
    /**
     * Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the schedule. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
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
     * Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
     * 
     */
    @Export(name="scheduleExpression", refs={String.class}, tree="[0]")
    private Output<String> scheduleExpression;

    /**
     * @return Defines when the schedule runs. Read more in [Schedule types on EventBridge Scheduler](https://docs.aws.amazon.com/scheduler/latest/UserGuide/schedule-types.html).
     * 
     */
    public Output<String> scheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
     * 
     */
    @Export(name="scheduleExpressionTimezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheduleExpressionTimezone;

    /**
     * @return Timezone in which the scheduling expression is evaluated. Defaults to `UTC`. Example: `Australia/Sydney`.
     * 
     */
    public Output<Optional<String>> scheduleExpressionTimezone() {
        return Codegen.optional(this.scheduleExpressionTimezone);
    }
    /**
     * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    @Export(name="startDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> startDate;

    /**
     * @return The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule&#39;s recurrence expression, invocations might occur on, or after, the start date you specify. EventBridge Scheduler ignores the start date for one-time schedules. Example: `2030-01-01T01:00:00Z`.
     * 
     */
    public Output<Optional<String>> startDate() {
        return Codegen.optional(this.startDate);
    }
    /**
     * Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> state;

    /**
     * @return Specifies whether the schedule is enabled or disabled. One of: `ENABLED` (default), `DISABLED`.
     * 
     */
    public Output<Optional<String>> state() {
        return Codegen.optional(this.state);
    }
    /**
     * Configures the target of the schedule. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="target", refs={ScheduleTarget.class}, tree="[0]")
    private Output<ScheduleTarget> target;

    /**
     * @return Configures the target of the schedule. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<ScheduleTarget> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:scheduler/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:scheduler/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
