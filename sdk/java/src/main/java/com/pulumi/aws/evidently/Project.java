// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.evidently.ProjectArgs;
import com.pulumi.aws.evidently.inputs.ProjectState;
import com.pulumi.aws.evidently.outputs.ProjectDataDelivery;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Evidently Project resource.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Project;
 * import com.pulumi.aws.evidently.ProjectArgs;
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
 *         var example = new Project(&#34;example&#34;, ProjectArgs.builder()        
 *             .description(&#34;Example Description&#34;)
 *             .tags(Map.of(&#34;Key1&#34;, &#34;example Project&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Store evaluation events in a CloudWatch Log Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Project;
 * import com.pulumi.aws.evidently.ProjectArgs;
 * import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs;
 * import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryCloudwatchLogsArgs;
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
 *         var example = new Project(&#34;example&#34;, ProjectArgs.builder()        
 *             .dataDelivery(ProjectDataDeliveryArgs.builder()
 *                 .cloudwatchLogs(ProjectDataDeliveryCloudwatchLogsArgs.builder()
 *                     .logGroup(&#34;example-log-group-name&#34;)
 *                     .build())
 *                 .build())
 *             .description(&#34;Example Description&#34;)
 *             .tags(Map.of(&#34;Key1&#34;, &#34;example Project&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Store evaluation events in an S3 bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Project;
 * import com.pulumi.aws.evidently.ProjectArgs;
 * import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryArgs;
 * import com.pulumi.aws.evidently.inputs.ProjectDataDeliveryS3DestinationArgs;
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
 *         var example = new Project(&#34;example&#34;, ProjectArgs.builder()        
 *             .dataDelivery(ProjectDataDeliveryArgs.builder()
 *                 .s3Destination(ProjectDataDeliveryS3DestinationArgs.builder()
 *                     .bucket(&#34;example-bucket-name&#34;)
 *                     .prefix(&#34;example&#34;)
 *                     .build())
 *                 .build())
 *             .description(&#34;Example Description&#34;)
 *             .tags(Map.of(&#34;Key1&#34;, &#34;example Project&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudWatch Evidently Project using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:evidently/project:Project example arn:aws:evidently:us-east-1:123456789012:segment/example
 * ```
 * 
 */
@ResourceType(type="aws:evidently/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * The number of ongoing experiments currently in the project.
     * 
     */
    @Export(name="activeExperimentCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> activeExperimentCount;

    /**
     * @return The number of ongoing experiments currently in the project.
     * 
     */
    public Output<Integer> activeExperimentCount() {
        return this.activeExperimentCount;
    }
    /**
     * The number of ongoing launches currently in the project.
     * 
     */
    @Export(name="activeLaunchCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> activeLaunchCount;

    /**
     * @return The number of ongoing launches currently in the project.
     * 
     */
    public Output<Integer> activeLaunchCount() {
        return this.activeLaunchCount;
    }
    /**
     * The ARN of the project.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the project.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time that the project is created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return The date and time that the project is created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
     * 
     */
    @Export(name="dataDelivery", refs={ProjectDataDelivery.class}, tree="[0]")
    private Output</* @Nullable */ ProjectDataDelivery> dataDelivery;

    /**
     * @return A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
     * 
     */
    public Output<Optional<ProjectDataDelivery>> dataDelivery() {
        return Codegen.optional(this.dataDelivery);
    }
    /**
     * Specifies the description of the project.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the project.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
     * 
     */
    @Export(name="experimentCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> experimentCount;

    /**
     * @return The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
     * 
     */
    public Output<Integer> experimentCount() {
        return this.experimentCount;
    }
    /**
     * The number of features currently in the project.
     * 
     */
    @Export(name="featureCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> featureCount;

    /**
     * @return The number of features currently in the project.
     * 
     */
    public Output<Integer> featureCount() {
        return this.featureCount;
    }
    /**
     * The date and time that the project was most recently updated.
     * 
     */
    @Export(name="lastUpdatedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedTime;

    /**
     * @return The date and time that the project was most recently updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
     * 
     */
    @Export(name="launchCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> launchCount;

    /**
     * @return The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
     * 
     */
    public Output<Integer> launchCount() {
        return this.launchCount;
    }
    /**
     * A name for the project.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Tags to apply to the project. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the project. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, @Nullable ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, @Nullable ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/project:Project", name, state, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
