// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.TaskArgs;
import com.pulumi.aws.datasync.inputs.TaskState;
import com.pulumi.aws.datasync.outputs.TaskExcludes;
import com.pulumi.aws.datasync.outputs.TaskIncludes;
import com.pulumi.aws.datasync.outputs.TaskOptions;
import com.pulumi.aws.datasync.outputs.TaskSchedule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS DataSync Task, which represents a configuration for synchronization. Starting an execution of these DataSync Tasks (actually synchronizing files) is performed outside of this resource.
 * 
 * ## Example Usage
 * ### With Scheduling
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.datasync.Task;
 * import com.pulumi.aws.datasync.TaskArgs;
 * import com.pulumi.aws.datasync.inputs.TaskScheduleArgs;
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
 *         var example = new Task(&#34;example&#34;, TaskArgs.builder()        
 *             .destinationLocationArn(aws_datasync_location_s3.destination().arn())
 *             .sourceLocationArn(aws_datasync_location_nfs.source().arn())
 *             .schedule(TaskScheduleArgs.builder()
 *                 .scheduleExpression(&#34;cron(0 12 ? * SUN,WED *)&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Filtering
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.datasync.Task;
 * import com.pulumi.aws.datasync.TaskArgs;
 * import com.pulumi.aws.datasync.inputs.TaskExcludesArgs;
 * import com.pulumi.aws.datasync.inputs.TaskIncludesArgs;
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
 *         var example = new Task(&#34;example&#34;, TaskArgs.builder()        
 *             .destinationLocationArn(aws_datasync_location_s3.destination().arn())
 *             .sourceLocationArn(aws_datasync_location_nfs.source().arn())
 *             .excludes(TaskExcludesArgs.builder()
 *                 .filterType(&#34;SIMPLE_PATTERN&#34;)
 *                 .value(&#34;/folder1|/folder2&#34;)
 *                 .build())
 *             .includes(TaskIncludesArgs.builder()
 *                 .filterType(&#34;SIMPLE_PATTERN&#34;)
 *                 .value(&#34;/folder1|/folder2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_datasync_task` using the DataSync Task Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:datasync/task:Task example arn:aws:datasync:us-east-1:123456789012:task/task-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/task:Task")
public class Task extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DataSync Task.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Task.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     * 
     */
    @Export(name="cloudwatchLogGroupArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudwatchLogGroupArn;

    /**
     * @return Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     * 
     */
    public Output<Optional<String>> cloudwatchLogGroupArn() {
        return Codegen.optional(this.cloudwatchLogGroupArn);
    }
    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     * 
     */
    @Export(name="destinationLocationArn", refs={String.class}, tree="[0]")
    private Output<String> destinationLocationArn;

    /**
     * @return Amazon Resource Name (ARN) of destination DataSync Location.
     * 
     */
    public Output<String> destinationLocationArn() {
        return this.destinationLocationArn;
    }
    /**
     * Filter rules that determines which files to exclude from a task.
     * 
     */
    @Export(name="excludes", refs={TaskExcludes.class}, tree="[0]")
    private Output</* @Nullable */ TaskExcludes> excludes;

    /**
     * @return Filter rules that determines which files to exclude from a task.
     * 
     */
    public Output<Optional<TaskExcludes>> excludes() {
        return Codegen.optional(this.excludes);
    }
    /**
     * Filter rules that determines which files to include in a task.
     * 
     */
    @Export(name="includes", refs={TaskIncludes.class}, tree="[0]")
    private Output</* @Nullable */ TaskIncludes> includes;

    /**
     * @return Filter rules that determines which files to include in a task.
     * 
     */
    public Output<Optional<TaskIncludes>> includes() {
        return Codegen.optional(this.includes);
    }
    /**
     * Name of the DataSync Task.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the DataSync Task.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * 
     */
    @Export(name="options", refs={TaskOptions.class}, tree="[0]")
    private Output</* @Nullable */ TaskOptions> options;

    /**
     * @return Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * 
     */
    public Output<Optional<TaskOptions>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     * 
     */
    @Export(name="schedule", refs={TaskSchedule.class}, tree="[0]")
    private Output</* @Nullable */ TaskSchedule> schedule;

    /**
     * @return Specifies a schedule used to periodically transfer files from a source to a destination location.
     * 
     */
    public Output<Optional<TaskSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     * 
     */
    @Export(name="sourceLocationArn", refs={String.class}, tree="[0]")
    private Output<String> sourceLocationArn;

    /**
     * @return Amazon Resource Name (ARN) of source DataSync Location.
     * 
     */
    public Output<String> sourceLocationArn() {
        return this.sourceLocationArn;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Task. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/task:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Task(String name, Output<String> id, @Nullable TaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/task:Task", name, state, makeResourceOptions(options, id));
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
    public static Task get(String name, Output<String> id, @Nullable TaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, state, options);
    }
}
