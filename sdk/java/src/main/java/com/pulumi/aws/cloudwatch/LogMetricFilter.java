// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogMetricFilterArgs;
import com.pulumi.aws.cloudwatch.inputs.LogMetricFilterState;
import com.pulumi.aws.cloudwatch.outputs.LogMetricFilterMetricTransformation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Log Metric Filter resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.cloudwatch.LogGroupArgs;
 * import com.pulumi.aws.cloudwatch.LogMetricFilter;
 * import com.pulumi.aws.cloudwatch.LogMetricFilterArgs;
 * import com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs;
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
 *         var dada = new LogGroup("dada", LogGroupArgs.builder()
 *             .name("MyApp/access.log")
 *             .build());
 * 
 *         var yada = new LogMetricFilter("yada", LogMetricFilterArgs.builder()
 *             .name("MyAppAccessCount")
 *             .pattern("")
 *             .logGroupName(dada.name())
 *             .metricTransformation(LogMetricFilterMetricTransformationArgs.builder()
 *                 .name("EventCount")
 *                 .namespace("YourNamespace")
 *                 .value("1")
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
 * Using `pulumi import`, import CloudWatch Log Metric Filter using the `log_group_name:name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloudwatch/logMetricFilter:LogMetricFilter test /aws/lambda/function:test
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logMetricFilter:LogMetricFilter")
public class LogMetricFilter extends com.pulumi.resources.CustomResource {
    /**
     * The name of the log group to associate the metric filter with.
     * 
     */
    @Export(name="logGroupName", refs={String.class}, tree="[0]")
    private Output<String> logGroupName;

    /**
     * @return The name of the log group to associate the metric filter with.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }
    /**
     * A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    @Export(name="metricTransformation", refs={LogMetricFilterMetricTransformation.class}, tree="[0]")
    private Output<LogMetricFilterMetricTransformation> metricTransformation;

    /**
     * @return A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    public Output<LogMetricFilterMetricTransformation> metricTransformation() {
        return this.metricTransformation;
    }
    /**
     * A name for the metric filter.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the metric filter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output<String> pattern;

    /**
     * @return A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogMetricFilter(String name) {
        this(name, LogMetricFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogMetricFilter(String name, LogMetricFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogMetricFilter(String name, LogMetricFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logMetricFilter:LogMetricFilter", name, args == null ? LogMetricFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogMetricFilter(String name, Output<String> id, @Nullable LogMetricFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logMetricFilter:LogMetricFilter", name, state, makeResourceOptions(options, id));
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
    public static LogMetricFilter get(String name, Output<String> id, @Nullable LogMetricFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogMetricFilter(name, id, state, options);
    }
}
