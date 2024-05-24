// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrserverless;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emrserverless.ApplicationArgs;
import com.pulumi.aws.emrserverless.inputs.ApplicationState;
import com.pulumi.aws.emrserverless.outputs.ApplicationAutoStartConfiguration;
import com.pulumi.aws.emrserverless.outputs.ApplicationAutoStopConfiguration;
import com.pulumi.aws.emrserverless.outputs.ApplicationImageConfiguration;
import com.pulumi.aws.emrserverless.outputs.ApplicationInitialCapacity;
import com.pulumi.aws.emrserverless.outputs.ApplicationMaximumCapacity;
import com.pulumi.aws.emrserverless.outputs.ApplicationNetworkConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EMR Serverless Application.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.emrserverless.Application;
 * import com.pulumi.aws.emrserverless.ApplicationArgs;
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
 *         var example = new Application("example", ApplicationArgs.builder()
 *             .name("example")
 *             .releaseLabel("emr-6.6.0")
 *             .type("hive")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Initial Capacity Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.emrserverless.Application;
 * import com.pulumi.aws.emrserverless.ApplicationArgs;
 * import com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityArgs;
 * import com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigArgs;
 * import com.pulumi.aws.emrserverless.inputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfigurationArgs;
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
 *         var example = new Application("example", ApplicationArgs.builder()
 *             .name("example")
 *             .releaseLabel("emr-6.6.0")
 *             .type("hive")
 *             .initialCapacities(ApplicationInitialCapacityArgs.builder()
 *                 .initialCapacityType("HiveDriver")
 *                 .initialCapacityConfig(ApplicationInitialCapacityInitialCapacityConfigArgs.builder()
 *                     .workerCount(1)
 *                     .workerConfiguration(ApplicationInitialCapacityInitialCapacityConfigWorkerConfigurationArgs.builder()
 *                         .cpu("2 vCPU")
 *                         .memory("10 GB")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Maximum Capacity Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.emrserverless.Application;
 * import com.pulumi.aws.emrserverless.ApplicationArgs;
 * import com.pulumi.aws.emrserverless.inputs.ApplicationMaximumCapacityArgs;
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
 *         var example = new Application("example", ApplicationArgs.builder()
 *             .name("example")
 *             .releaseLabel("emr-6.6.0")
 *             .type("hive")
 *             .maximumCapacity(ApplicationMaximumCapacityArgs.builder()
 *                 .cpu("2 vCPU")
 *                 .memory("10 GB")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EMR Severless applications using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:emrserverless/application:Application example id
 * ```
 * 
 */
@ResourceType(type="aws:emrserverless/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * The CPU architecture of an application. Valid values are `ARM64` or `X86_64`. Default value is `X86_64`.
     * 
     */
    @Export(name="architecture", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> architecture;

    /**
     * @return The CPU architecture of an application. Valid values are `ARM64` or `X86_64`. Default value is `X86_64`.
     * 
     */
    public Output<Optional<String>> architecture() {
        return Codegen.optional(this.architecture);
    }
    /**
     * ARN of the cluster.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the cluster.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The configuration for an application to automatically start on job submission.
     * 
     */
    @Export(name="autoStartConfiguration", refs={ApplicationAutoStartConfiguration.class}, tree="[0]")
    private Output<ApplicationAutoStartConfiguration> autoStartConfiguration;

    /**
     * @return The configuration for an application to automatically start on job submission.
     * 
     */
    public Output<ApplicationAutoStartConfiguration> autoStartConfiguration() {
        return this.autoStartConfiguration;
    }
    /**
     * The configuration for an application to automatically stop after a certain amount of time being idle.
     * 
     */
    @Export(name="autoStopConfiguration", refs={ApplicationAutoStopConfiguration.class}, tree="[0]")
    private Output<ApplicationAutoStopConfiguration> autoStopConfiguration;

    /**
     * @return The configuration for an application to automatically stop after a certain amount of time being idle.
     * 
     */
    public Output<ApplicationAutoStopConfiguration> autoStopConfiguration() {
        return this.autoStopConfiguration;
    }
    /**
     * The image configuration applied to all worker types.
     * 
     */
    @Export(name="imageConfiguration", refs={ApplicationImageConfiguration.class}, tree="[0]")
    private Output<ApplicationImageConfiguration> imageConfiguration;

    /**
     * @return The image configuration applied to all worker types.
     * 
     */
    public Output<ApplicationImageConfiguration> imageConfiguration() {
        return this.imageConfiguration;
    }
    /**
     * The capacity to initialize when the application is created.
     * 
     */
    @Export(name="initialCapacities", refs={List.class,ApplicationInitialCapacity.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApplicationInitialCapacity>> initialCapacities;

    /**
     * @return The capacity to initialize when the application is created.
     * 
     */
    public Output<Optional<List<ApplicationInitialCapacity>>> initialCapacities() {
        return Codegen.optional(this.initialCapacities);
    }
    /**
     * The maximum capacity to allocate when the application is created. This is cumulative across all workers at any given point in time, not just when an application is created. No new resources will be created once any one of the defined limits is hit.
     * 
     */
    @Export(name="maximumCapacity", refs={ApplicationMaximumCapacity.class}, tree="[0]")
    private Output<ApplicationMaximumCapacity> maximumCapacity;

    /**
     * @return The maximum capacity to allocate when the application is created. This is cumulative across all workers at any given point in time, not just when an application is created. No new resources will be created once any one of the defined limits is hit.
     * 
     */
    public Output<ApplicationMaximumCapacity> maximumCapacity() {
        return this.maximumCapacity;
    }
    /**
     * The name of the application.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network configuration for customer VPC connectivity.
     * 
     */
    @Export(name="networkConfiguration", refs={ApplicationNetworkConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ ApplicationNetworkConfiguration> networkConfiguration;

    /**
     * @return The network configuration for customer VPC connectivity.
     * 
     */
    public Output<Optional<ApplicationNetworkConfiguration>> networkConfiguration() {
        return Codegen.optional(this.networkConfiguration);
    }
    /**
     * The EMR release version associated with the application.
     * 
     */
    @Export(name="releaseLabel", refs={String.class}, tree="[0]")
    private Output<String> releaseLabel;

    /**
     * @return The EMR release version associated with the application.
     * 
     */
    public Output<String> releaseLabel() {
        return this.releaseLabel;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of application you want to start, such as `spark` or `hive`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of application you want to start, such as `spark` or `hive`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emrserverless/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emrserverless/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
