// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesis.AnalyticsApplicationArgs;
import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationState;
import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationCloudwatchLoggingOptions;
import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputs;
import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutput;
import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSources;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Analytics Application resource. Kinesis Analytics is a managed service that
 * allows processing and analyzing streaming data using standard SQL.
 * 
 * For more details, see the [Amazon Kinesis Analytics Documentation](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/what-is.html).
 * 
 * &gt; **Note:** To manage Amazon Kinesis Data Analytics for Apache Flink applications, use the `aws.kinesisanalyticsv2.Application` resource.
 * 
 * ## Example Usage
 * 
 * ### Kinesis Stream Input
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kinesis.Stream;
 * import com.pulumi.aws.kinesis.StreamArgs;
 * import com.pulumi.aws.kinesis.AnalyticsApplication;
 * import com.pulumi.aws.kinesis.AnalyticsApplicationArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsParallelismArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonArgs;
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
 *         var testStream = new Stream("testStream", StreamArgs.builder()
 *             .name("kinesis-test")
 *             .shardCount(1)
 *             .build());
 * 
 *         var testApplication = new AnalyticsApplication("testApplication", AnalyticsApplicationArgs.builder()
 *             .name("kinesis-analytics-application-test")
 *             .inputs(AnalyticsApplicationInputsArgs.builder()
 *                 .namePrefix("test_prefix")
 *                 .kinesisStream(AnalyticsApplicationInputsKinesisStreamArgs.builder()
 *                     .resourceArn(testStream.arn())
 *                     .roleArn(test.arn())
 *                     .build())
 *                 .parallelism(AnalyticsApplicationInputsParallelismArgs.builder()
 *                     .count(1)
 *                     .build())
 *                 .schema(AnalyticsApplicationInputsSchemaArgs.builder()
 *                     .recordColumns(AnalyticsApplicationInputsSchemaRecordColumnArgs.builder()
 *                         .mapping("$.test")
 *                         .name("test")
 *                         .sqlType("VARCHAR(8)")
 *                         .build())
 *                     .recordEncoding("UTF-8")
 *                     .recordFormat(AnalyticsApplicationInputsSchemaRecordFormatArgs.builder()
 *                         .mappingParameters(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.builder()
 *                             .json(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJsonArgs.builder()
 *                                 .recordRowPath("$")
 *                                 .build())
 *                             .build())
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
 * ### Starting An Application
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
 * import com.pulumi.aws.cloudwatch.LogStream;
 * import com.pulumi.aws.cloudwatch.LogStreamArgs;
 * import com.pulumi.aws.kinesis.Stream;
 * import com.pulumi.aws.kinesis.StreamArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
 * import com.pulumi.aws.kinesis.AnalyticsApplication;
 * import com.pulumi.aws.kinesis.AnalyticsApplicationArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaArgs;
 * import com.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseArgs;
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
 *         var example = new LogGroup("example", LogGroupArgs.builder()
 *             .name("analytics")
 *             .build());
 * 
 *         var exampleLogStream = new LogStream("exampleLogStream", LogStreamArgs.builder()
 *             .name("example-kinesis-application")
 *             .logGroupName(example.name())
 *             .build());
 * 
 *         var exampleStream = new Stream("exampleStream", StreamArgs.builder()
 *             .name("example-kinesis-stream")
 *             .shardCount(1)
 *             .build());
 * 
 *         var exampleFirehoseDeliveryStream = new FirehoseDeliveryStream("exampleFirehoseDeliveryStream", FirehoseDeliveryStreamArgs.builder()
 *             .name("example-kinesis-delivery-stream")
 *             .destination("extended_s3")
 *             .extendedS3Configuration(FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder()
 *                 .bucketArn(exampleAwsS3Bucket.arn())
 *                 .roleArn(exampleAwsIamRole.arn())
 *                 .build())
 *             .build());
 * 
 *         var test = new AnalyticsApplication("test", AnalyticsApplicationArgs.builder()
 *             .name("example-application")
 *             .cloudwatchLoggingOptions(AnalyticsApplicationCloudwatchLoggingOptionsArgs.builder()
 *                 .logStreamArn(exampleLogStream.arn())
 *                 .roleArn(exampleAwsIamRole.arn())
 *                 .build())
 *             .inputs(AnalyticsApplicationInputsArgs.builder()
 *                 .namePrefix("example_prefix")
 *                 .schema(AnalyticsApplicationInputsSchemaArgs.builder()
 *                     .recordColumns(AnalyticsApplicationInputsSchemaRecordColumnArgs.builder()
 *                         .name("COLUMN_1")
 *                         .sqlType("INTEGER")
 *                         .build())
 *                     .recordFormat(AnalyticsApplicationInputsSchemaRecordFormatArgs.builder()
 *                         .mappingParameters(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersArgs.builder()
 *                             .csv(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvArgs.builder()
 *                                 .recordColumnDelimiter(",")
 *                                 .recordRowDelimiter("|")
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .kinesisStream(AnalyticsApplicationInputsKinesisStreamArgs.builder()
 *                     .resourceArn(exampleStream.arn())
 *                     .roleArn(exampleAwsIamRole.arn())
 *                     .build())
 *                 .startingPositionConfigurations(AnalyticsApplicationInputsStartingPositionConfigurationArgs.builder()
 *                     .startingPosition("NOW")
 *                     .build())
 *                 .build())
 *             .outputs(AnalyticsApplicationOutputArgs.builder()
 *                 .name("OUTPUT_1")
 *                 .schema(AnalyticsApplicationOutputSchemaArgs.builder()
 *                     .recordFormatType("CSV")
 *                     .build())
 *                 .kinesisFirehose(AnalyticsApplicationOutputKinesisFirehoseArgs.builder()
 *                     .resourceArn(exampleFirehoseDeliveryStream.arn())
 *                     .roleArn(exampleAwsIamRole.arn())
 *                     .build())
 *                 .build())
 *             .startApplication(true)
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
 * Using `pulumi import`, import Kinesis Analytics Application using ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:kinesis/analyticsApplication:AnalyticsApplication example arn:aws:kinesisanalytics:us-west-2:1234567890:application/example
 * ```
 * 
 */
@ResourceType(type="aws:kinesis/analyticsApplication:AnalyticsApplication")
public class AnalyticsApplication extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Kinesis Analytics Appliation.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Kinesis Analytics Appliation.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    @Export(name="cloudwatchLoggingOptions", refs={AnalyticsApplicationCloudwatchLoggingOptions.class}, tree="[0]")
    private Output</* @Nullable */ AnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions;

    /**
     * @return The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    public Output<Optional<AnalyticsApplicationCloudwatchLoggingOptions>> cloudwatchLoggingOptions() {
        return Codegen.optional(this.cloudwatchLoggingOptions);
    }
    /**
     * SQL Code to transform input data, and generate output.
     * 
     */
    @Export(name="code", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> code;

    /**
     * @return SQL Code to transform input data, and generate output.
     * 
     */
    public Output<Optional<String>> code() {
        return Codegen.optional(this.code);
    }
    /**
     * The Timestamp when the application version was created.
     * 
     */
    @Export(name="createTimestamp", refs={String.class}, tree="[0]")
    private Output<String> createTimestamp;

    /**
     * @return The Timestamp when the application version was created.
     * 
     */
    public Output<String> createTimestamp() {
        return this.createTimestamp;
    }
    /**
     * Description of the application.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the application.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Input configuration of the application. See Inputs below for more details.
     * 
     */
    @Export(name="inputs", refs={AnalyticsApplicationInputs.class}, tree="[0]")
    private Output</* @Nullable */ AnalyticsApplicationInputs> inputs;

    /**
     * @return Input configuration of the application. See Inputs below for more details.
     * 
     */
    public Output<Optional<AnalyticsApplicationInputs>> inputs() {
        return Codegen.optional(this.inputs);
    }
    /**
     * The Timestamp when the application was last updated.
     * 
     */
    @Export(name="lastUpdateTimestamp", refs={String.class}, tree="[0]")
    private Output<String> lastUpdateTimestamp;

    /**
     * @return The Timestamp when the application was last updated.
     * 
     */
    public Output<String> lastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }
    /**
     * Name of the Kinesis Analytics Application.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Kinesis Analytics Application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    @Export(name="outputs", refs={List.class,AnalyticsApplicationOutput.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AnalyticsApplicationOutput>> outputs;

    /**
     * @return Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    public Output<Optional<List<AnalyticsApplicationOutput>>> outputs() {
        return Codegen.optional(this.outputs);
    }
    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    @Export(name="referenceDataSources", refs={AnalyticsApplicationReferenceDataSources.class}, tree="[0]")
    private Output</* @Nullable */ AnalyticsApplicationReferenceDataSources> referenceDataSources;

    /**
     * @return An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    public Output<Optional<AnalyticsApplicationReferenceDataSources>> referenceDataSources() {
        return Codegen.optional(this.referenceDataSources);
    }
    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    @Export(name="startApplication", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startApplication;

    /**
     * @return Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application&#39;s starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    public Output<Optional<Boolean>> startApplication() {
        return Codegen.optional(this.startApplication);
    }
    /**
     * The Status of the application.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The Status of the application.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     * The Version of the application.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The Version of the application.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnalyticsApplication(String name) {
        this(name, AnalyticsApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnalyticsApplication(String name, @Nullable AnalyticsApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnalyticsApplication(String name, @Nullable AnalyticsApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/analyticsApplication:AnalyticsApplication", name, args == null ? AnalyticsApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AnalyticsApplication(String name, Output<String> id, @Nullable AnalyticsApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/analyticsApplication:AnalyticsApplication", name, state, makeResourceOptions(options, id));
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
    public static AnalyticsApplication get(String name, Output<String> id, @Nullable AnalyticsApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AnalyticsApplication(name, id, state, options);
    }
}
