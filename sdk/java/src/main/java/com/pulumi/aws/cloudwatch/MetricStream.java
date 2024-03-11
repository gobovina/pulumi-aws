// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.MetricStreamArgs;
import com.pulumi.aws.cloudwatch.inputs.MetricStreamState;
import com.pulumi.aws.cloudwatch.outputs.MetricStreamExcludeFilter;
import com.pulumi.aws.cloudwatch.outputs.MetricStreamIncludeFilter;
import com.pulumi.aws.cloudwatch.outputs.MetricStreamStatisticsConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Metric Stream resource.
 * 
 * ## Example Usage
 * 
 * ### Filters
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
 * import com.pulumi.aws.cloudwatch.MetricStream;
 * import com.pulumi.aws.cloudwatch.MetricStreamArgs;
 * import com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
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
 *         final var streamsAssumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;streams.metrics.cloudwatch.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var metricStreamToFirehoseRole = new Role(&#34;metricStreamToFirehoseRole&#34;, RoleArgs.builder()        
 *             .name(&#34;metric_stream_to_firehose_role&#34;)
 *             .assumeRolePolicy(streamsAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var bucket = new BucketV2(&#34;bucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;metric-stream-test-bucket&#34;)
 *             .build());
 * 
 *         final var firehoseAssumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;firehose.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var firehoseToS3Role = new Role(&#34;firehoseToS3Role&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(firehoseAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var s3Stream = new FirehoseDeliveryStream(&#34;s3Stream&#34;, FirehoseDeliveryStreamArgs.builder()        
 *             .name(&#34;metric-stream-test-stream&#34;)
 *             .destination(&#34;extended_s3&#34;)
 *             .extendedS3Configuration(FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder()
 *                 .roleArn(firehoseToS3Role.arn())
 *                 .bucketArn(bucket.arn())
 *                 .build())
 *             .build());
 * 
 *         var main = new MetricStream(&#34;main&#34;, MetricStreamArgs.builder()        
 *             .name(&#34;my-metric-stream&#34;)
 *             .roleArn(metricStreamToFirehoseRole.arn())
 *             .firehoseArn(s3Stream.arn())
 *             .outputFormat(&#34;json&#34;)
 *             .includeFilters(            
 *                 MetricStreamIncludeFilterArgs.builder()
 *                     .namespace(&#34;AWS/EC2&#34;)
 *                     .metricNames(                    
 *                         &#34;CPUUtilization&#34;,
 *                         &#34;NetworkOut&#34;)
 *                     .build(),
 *                 MetricStreamIncludeFilterArgs.builder()
 *                     .namespace(&#34;AWS/EBS&#34;)
 *                     .metricNames()
 *                     .build())
 *             .build());
 * 
 *         final var metricStreamToFirehose = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(                
 *                     &#34;firehose:PutRecord&#34;,
 *                     &#34;firehose:PutRecordBatch&#34;)
 *                 .resources(s3Stream.arn())
 *                 .build())
 *             .build());
 * 
 *         var metricStreamToFirehoseRolePolicy = new RolePolicy(&#34;metricStreamToFirehoseRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .name(&#34;default&#34;)
 *             .role(metricStreamToFirehoseRole.id())
 *             .policy(metricStreamToFirehose.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(metricStreamToFirehose -&gt; metricStreamToFirehose.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         final var firehoseToS3 = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(                
 *                     &#34;s3:AbortMultipartUpload&#34;,
 *                     &#34;s3:GetBucketLocation&#34;,
 *                     &#34;s3:GetObject&#34;,
 *                     &#34;s3:ListBucket&#34;,
 *                     &#34;s3:ListBucketMultipartUploads&#34;,
 *                     &#34;s3:PutObject&#34;)
 *                 .resources(                
 *                     bucket.arn(),
 *                     bucket.arn().applyValue(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                 .build())
 *             .build());
 * 
 *         var firehoseToS3RolePolicy = new RolePolicy(&#34;firehoseToS3RolePolicy&#34;, RolePolicyArgs.builder()        
 *             .name(&#34;default&#34;)
 *             .role(firehoseToS3Role.id())
 *             .policy(firehoseToS3.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(firehoseToS3 -&gt; firehoseToS3.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Additional Statistics
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.MetricStream;
 * import com.pulumi.aws.cloudwatch.MetricStreamArgs;
 * import com.pulumi.aws.cloudwatch.inputs.MetricStreamStatisticsConfigurationArgs;
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
 *         var main = new MetricStream(&#34;main&#34;, MetricStreamArgs.builder()        
 *             .name(&#34;my-metric-stream&#34;)
 *             .roleArn(metricStreamToFirehose.arn())
 *             .firehoseArn(s3Stream.arn())
 *             .outputFormat(&#34;json&#34;)
 *             .statisticsConfigurations(            
 *                 MetricStreamStatisticsConfigurationArgs.builder()
 *                     .additionalStatistics(                    
 *                         &#34;p1&#34;,
 *                         &#34;tm99&#34;)
 *                     .includeMetrics(MetricStreamStatisticsConfigurationIncludeMetricArgs.builder()
 *                         .metricName(&#34;CPUUtilization&#34;)
 *                         .namespace(&#34;AWS/EC2&#34;)
 *                         .build())
 *                     .build(),
 *                 MetricStreamStatisticsConfigurationArgs.builder()
 *                     .additionalStatistics(&#34;TS(50.5:)&#34;)
 *                     .includeMetrics(MetricStreamStatisticsConfigurationIncludeMetricArgs.builder()
 *                         .metricName(&#34;CPUUtilization&#34;)
 *                         .namespace(&#34;AWS/EC2&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudWatch metric streams using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloudwatch/metricStream:MetricStream sample sample-stream-name
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/metricStream:MetricStream")
public class MetricStream extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the metric stream.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the metric stream.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
     * 
     */
    @Export(name="creationDate", refs={String.class}, tree="[0]")
    private Output<String> creationDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `include_filter`.
     * 
     */
    @Export(name="excludeFilters", refs={List.class,MetricStreamExcludeFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MetricStreamExcludeFilter>> excludeFilters;

    /**
     * @return List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces and the conditional metric names that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is excluded. Conflicts with `include_filter`.
     * 
     */
    public Output<Optional<List<MetricStreamExcludeFilter>>> excludeFilters() {
        return Codegen.optional(this.excludeFilters);
    }
    /**
     * ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    @Export(name="firehoseArn", refs={String.class}, tree="[0]")
    private Output<String> firehoseArn;

    /**
     * @return ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    public Output<String> firehoseArn() {
        return this.firehoseArn;
    }
    /**
     * List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `exclude_filter`.
     * 
     */
    @Export(name="includeFilters", refs={List.class,MetricStreamIncludeFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MetricStreamIncludeFilter>> includeFilters;

    /**
     * @return List of inclusive metric filters. If you specify this parameter, the stream sends only the conditional metric names from the metric namespaces that you specify here. If you don&#39;t specify metric names or provide empty metric names whole metric namespace is included. Conflicts with `exclude_filter`.
     * 
     */
    public Output<Optional<List<MetricStreamIncludeFilter>>> includeFilters() {
        return Codegen.optional(this.includeFilters);
    }
    /**
     * If you are creating a metric stream in a monitoring account, specify true to include metrics from source accounts that are linked to this monitoring account, in the metric stream. The default is false. For more information about linking accounts, see [CloudWatch cross-account observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html).
     * 
     */
    @Export(name="includeLinkedAccountsMetrics", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> includeLinkedAccountsMetrics;

    /**
     * @return If you are creating a metric stream in a monitoring account, specify true to include metrics from source accounts that are linked to this monitoring account, in the metric stream. The default is false. For more information about linking accounts, see [CloudWatch cross-account observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html).
     * 
     */
    public Output<Optional<Boolean>> includeLinkedAccountsMetrics() {
        return Codegen.optional(this.includeLinkedAccountsMetrics);
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
     * 
     */
    @Export(name="lastUpdateDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdateDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
     * 
     */
    public Output<String> lastUpdateDate() {
        return this.lastUpdateDate;
    }
    /**
     * Friendly name of the metric stream. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the metric stream. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Output format for the stream. Possible values are `json`, `opentelemetry0.7`, and `opentelemetry1.0`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="outputFormat", refs={String.class}, tree="[0]")
    private Output<String> outputFormat;

    /**
     * @return Output format for the stream. Possible values are `json`, `opentelemetry0.7`, and `opentelemetry1.0`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> outputFormat() {
        return this.outputFormat;
    }
    /**
     * ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * State of the metric stream. Possible values are `running` and `stopped`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the metric stream. Possible values are `running` and `stopped`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `output_format`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * 
     */
    @Export(name="statisticsConfigurations", refs={List.class,MetricStreamStatisticsConfiguration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MetricStreamStatisticsConfiguration>> statisticsConfigurations;

    /**
     * @return For each entry in this array, you specify one or more metrics and the list of additional statistics to stream for those metrics. The additional statistics that you can stream depend on the stream&#39;s `output_format`. If the OutputFormat is `json`, you can stream any additional statistic that is supported by CloudWatch, listed in [CloudWatch statistics definitions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html). If the OutputFormat is `opentelemetry0.7` or `opentelemetry1.0`, you can stream percentile statistics (p99 etc.). See details below.
     * 
     */
    public Output<Optional<List<MetricStreamStatisticsConfiguration>>> statisticsConfigurations() {
        return Codegen.optional(this.statisticsConfigurations);
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricStream(String name) {
        this(name, MetricStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricStream(String name, MetricStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricStream(String name, MetricStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/metricStream:MetricStream", name, args == null ? MetricStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetricStream(String name, Output<String> id, @Nullable MetricStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/metricStream:MetricStream", name, state, makeResourceOptions(options, id));
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
    public static MetricStream get(String name, Output<String> id, @Nullable MetricStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetricStream(name, id, state, options);
    }
}
