// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mskconnect.WorkerConfigurationArgs;
import com.pulumi.aws.mskconnect.inputs.WorkerConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon MSK Connect Worker Configuration Resource.
 * 
 * ## Example Usage
 * 
 * ### Basic configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.mskconnect.WorkerConfiguration;
 * import com.pulumi.aws.mskconnect.WorkerConfigurationArgs;
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
 *         var example = new WorkerConfiguration("example", WorkerConfigurationArgs.builder()
 *             .name("example")
 *             .propertiesFileContent("""
 * key.converter=org.apache.kafka.connect.storage.StringConverter
 * value.converter=org.apache.kafka.connect.storage.StringConverter
 *             """)
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
 * Using `pulumi import`, import MSK Connect Worker Configuration using the plugin&#39;s `arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:mskconnect/workerConfiguration:WorkerConfiguration example &#39;arn:aws:kafkaconnect:eu-central-1:123456789012:worker-configuration/example/8848493b-7fcc-478c-a646-4a52634e3378-4&#39;
 * ```
 * 
 */
@ResourceType(type="aws:mskconnect/workerConfiguration:WorkerConfiguration")
public class WorkerConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * the Amazon Resource Name (ARN) of the worker configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return the Amazon Resource Name (ARN) of the worker configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A summary description of the worker configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A summary description of the worker configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * an ID of the latest successfully created revision of the worker configuration.
     * 
     */
    @Export(name="latestRevision", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestRevision;

    /**
     * @return an ID of the latest successfully created revision of the worker configuration.
     * 
     */
    public Output<Integer> latestRevision() {
        return this.latestRevision;
    }
    /**
     * The name of the worker configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the worker configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Contents of connect-distributed.properties file. The value can be either base64 encoded or in raw format.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="propertiesFileContent", refs={String.class}, tree="[0]")
    private Output<String> propertiesFileContent;

    /**
     * @return Contents of connect-distributed.properties file. The value can be either base64 encoded or in raw format.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> propertiesFileContent() {
        return this.propertiesFileContent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerConfiguration(String name) {
        this(name, WorkerConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerConfiguration(String name, WorkerConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerConfiguration(String name, WorkerConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/workerConfiguration:WorkerConfiguration", name, args == null ? WorkerConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerConfiguration(String name, Output<String> id, @Nullable WorkerConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/workerConfiguration:WorkerConfiguration", name, state, makeResourceOptions(options, id));
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
    public static WorkerConfiguration get(String name, Output<String> id, @Nullable WorkerConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerConfiguration(name, id, state, options);
    }
}
