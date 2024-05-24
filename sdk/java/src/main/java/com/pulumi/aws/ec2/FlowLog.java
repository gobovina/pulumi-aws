// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.FlowLogArgs;
import com.pulumi.aws.ec2.inputs.FlowLogState;
import com.pulumi.aws.ec2.outputs.FlowLogDestinationOptions;
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
 * Provides a VPC/Subnet/ENI/Transit Gateway/Transit Gateway Attachment Flow Log to capture IP traffic for a specific network
 * interface, subnet, or VPC. Logs are sent to a CloudWatch Log Group, a S3 Bucket, or Amazon Kinesis Data Firehose
 * 
 * ## Example Usage
 * 
 * ### CloudWatch Logging
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
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.ec2.FlowLog;
 * import com.pulumi.aws.ec2.FlowLogArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         var exampleLogGroup = new LogGroup("exampleLogGroup", LogGroupArgs.builder()
 *             .name("example")
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("Service")
 *                     .identifiers("vpc-flow-logs.amazonaws.com")
 *                     .build())
 *                 .actions("sts:AssumeRole")
 *                 .build())
 *             .build());
 * 
 *         var exampleRole = new Role("exampleRole", RoleArgs.builder()
 *             .name("example")
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleFlowLog = new FlowLog("exampleFlowLog", FlowLogArgs.builder()
 *             .iamRoleArn(exampleRole.arn())
 *             .logDestination(exampleLogGroup.arn())
 *             .trafficType("ALL")
 *             .vpcId(exampleAwsVpc.id())
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .actions(                
 *                     "logs:CreateLogGroup",
 *                     "logs:CreateLogStream",
 *                     "logs:PutLogEvents",
 *                     "logs:DescribeLogGroups",
 *                     "logs:DescribeLogStreams")
 *                 .resources("*")
 *                 .build())
 *             .build());
 * 
 *         var exampleRolePolicy = new RolePolicy("exampleRolePolicy", RolePolicyArgs.builder()
 *             .name("example")
 *             .role(exampleRole.id())
 *             .policy(example.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Amazon Kinesis Data Firehose logging
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStream;
 * import com.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
 * import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationArgs;
 * import com.pulumi.aws.ec2.FlowLog;
 * import com.pulumi.aws.ec2.FlowLogArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         var exampleBucketV2 = new BucketV2("exampleBucketV2", BucketV2Args.builder()
 *             .bucket("example")
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("Service")
 *                     .identifiers("firehose.amazonaws.com")
 *                     .build())
 *                 .actions("sts:AssumeRole")
 *                 .build())
 *             .build());
 * 
 *         var exampleRole = new Role("exampleRole", RoleArgs.builder()
 *             .name("firehose_test_role")
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleFirehoseDeliveryStream = new FirehoseDeliveryStream("exampleFirehoseDeliveryStream", FirehoseDeliveryStreamArgs.builder()
 *             .name("kinesis_firehose_test")
 *             .destination("extended_s3")
 *             .extendedS3Configuration(FirehoseDeliveryStreamExtendedS3ConfigurationArgs.builder()
 *                 .roleArn(exampleRole.arn())
 *                 .bucketArn(exampleBucketV2.arn())
 *                 .build())
 *             .tags(Map.of("LogDeliveryEnabled", "true"))
 *             .build());
 * 
 *         var exampleFlowLog = new FlowLog("exampleFlowLog", FlowLogArgs.builder()
 *             .logDestination(exampleFirehoseDeliveryStream.arn())
 *             .logDestinationType("kinesis-data-firehose")
 *             .trafficType("ALL")
 *             .vpcId(exampleAwsVpc.id())
 *             .build());
 * 
 *         var exampleBucketAclV2 = new BucketAclV2("exampleBucketAclV2", BucketAclV2Args.builder()
 *             .bucket(exampleBucketV2.id())
 *             .acl("private")
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .effect("Allow")
 *             .actions(            
 *                 "logs:CreateLogDelivery",
 *                 "logs:DeleteLogDelivery",
 *                 "logs:ListLogDeliveries",
 *                 "logs:GetLogDelivery",
 *                 "firehose:TagDeliveryStream")
 *             .resources("*")
 *             .build());
 * 
 *         var exampleRolePolicy = new RolePolicy("exampleRolePolicy", RolePolicyArgs.builder()
 *             .name("test")
 *             .role(exampleRole.id())
 *             .policy(example.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### S3 Logging
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.ec2.FlowLog;
 * import com.pulumi.aws.ec2.FlowLogArgs;
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
 *         var exampleBucketV2 = new BucketV2("exampleBucketV2", BucketV2Args.builder()
 *             .bucket("example")
 *             .build());
 * 
 *         var example = new FlowLog("example", FlowLogArgs.builder()
 *             .logDestination(exampleBucketV2.arn())
 *             .logDestinationType("s3")
 *             .trafficType("ALL")
 *             .vpcId(exampleAwsVpc.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### S3 Logging in Apache Parquet format with per-hour partitions
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.ec2.FlowLog;
 * import com.pulumi.aws.ec2.FlowLogArgs;
 * import com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs;
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
 *         var exampleBucketV2 = new BucketV2("exampleBucketV2", BucketV2Args.builder()
 *             .bucket("example")
 *             .build());
 * 
 *         var example = new FlowLog("example", FlowLogArgs.builder()
 *             .logDestination(exampleBucketV2.arn())
 *             .logDestinationType("s3")
 *             .trafficType("ALL")
 *             .vpcId(exampleAwsVpc.id())
 *             .destinationOptions(FlowLogDestinationOptionsArgs.builder()
 *                 .fileFormat("parquet")
 *                 .perHourPartition(true)
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
 * Using `pulumi import`, import Flow Logs using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/flowLog:FlowLog test_flow_log fl-1a2b3c4d
 * ```
 * 
 */
@ResourceType(type="aws:ec2/flowLog:FlowLog")
public class FlowLog extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Flow Log.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Flow Log.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * 
     */
    @Export(name="deliverCrossAccountRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deliverCrossAccountRole;

    /**
     * @return ARN of the IAM role that allows Amazon EC2 to publish flow logs across accounts.
     * 
     */
    public Output<Optional<String>> deliverCrossAccountRole() {
        return Codegen.optional(this.deliverCrossAccountRole);
    }
    /**
     * Describes the destination options for a flow log. More details below.
     * 
     */
    @Export(name="destinationOptions", refs={FlowLogDestinationOptions.class}, tree="[0]")
    private Output</* @Nullable */ FlowLogDestinationOptions> destinationOptions;

    /**
     * @return Describes the destination options for a flow log. More details below.
     * 
     */
    public Output<Optional<FlowLogDestinationOptions>> destinationOptions() {
        return Codegen.optional(this.destinationOptions);
    }
    /**
     * Elastic Network Interface ID to attach to
     * 
     */
    @Export(name="eniId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eniId;

    /**
     * @return Elastic Network Interface ID to attach to
     * 
     */
    public Output<Optional<String>> eniId() {
        return Codegen.optional(this.eniId);
    }
    /**
     * The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
     * 
     */
    @Export(name="iamRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamRoleArn;

    /**
     * @return The ARN for the IAM role that&#39;s used to post flow logs to a CloudWatch Logs log group
     * 
     */
    public Output<Optional<String>> iamRoleArn() {
        return Codegen.optional(this.iamRoleArn);
    }
    /**
     * The ARN of the logging destination. Either `log_destination` or `log_group_name` must be set.
     * 
     */
    @Export(name="logDestination", refs={String.class}, tree="[0]")
    private Output<String> logDestination;

    /**
     * @return The ARN of the logging destination. Either `log_destination` or `log_group_name` must be set.
     * 
     */
    public Output<String> logDestination() {
        return this.logDestination;
    }
    /**
     * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`, `kinesis-data-firehose`. Default: `cloud-watch-logs`.
     * 
     */
    @Export(name="logDestinationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logDestinationType;

    /**
     * @return The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`, `kinesis-data-firehose`. Default: `cloud-watch-logs`.
     * 
     */
    public Output<Optional<String>> logDestinationType() {
        return Codegen.optional(this.logDestinationType);
    }
    /**
     * The fields to include in the flow log record. Accepted format example: `&#34;$${interface-id} $${srcaddr} $${dstaddr} $${srcport} $${dstport}&#34;`.
     * 
     */
    @Export(name="logFormat", refs={String.class}, tree="[0]")
    private Output<String> logFormat;

    /**
     * @return The fields to include in the flow log record. Accepted format example: `&#34;$${interface-id} $${srcaddr} $${dstaddr} $${srcport} $${dstport}&#34;`.
     * 
     */
    public Output<String> logFormat() {
        return this.logFormat;
    }
    /**
     * **Deprecated:** Use `log_destination` instead. The name of the CloudWatch log group. Either `log_group_name` or `log_destination` must be set.
     * 
     * @deprecated
     * use &#39;log_destination&#39; argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    @Export(name="logGroupName", refs={String.class}, tree="[0]")
    private Output<String> logGroupName;

    /**
     * @return **Deprecated:** Use `log_destination` instead. The name of the CloudWatch log group. Either `log_group_name` or `log_destination` must be set.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }
    /**
     * The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`. When `transit_gateway_id` or `transit_gateway_attachment_id` is specified, `max_aggregation_interval` *must* be 60 seconds (1 minute).
     * 
     */
    @Export(name="maxAggregationInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxAggregationInterval;

    /**
     * @return The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`. When `transit_gateway_id` or `transit_gateway_attachment_id` is specified, `max_aggregation_interval` *must* be 60 seconds (1 minute).
     * 
     */
    public Output<Optional<Integer>> maxAggregationInterval() {
        return Codegen.optional(this.maxAggregationInterval);
    }
    /**
     * Subnet ID to attach to
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return Subnet ID to attach to
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    @Export(name="trafficType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trafficType;

    /**
     * @return The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    public Output<Optional<String>> trafficType() {
        return Codegen.optional(this.trafficType);
    }
    /**
     * Transit Gateway Attachment ID to attach to
     * 
     */
    @Export(name="transitGatewayAttachmentId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitGatewayAttachmentId;

    /**
     * @return Transit Gateway Attachment ID to attach to
     * 
     */
    public Output<Optional<String>> transitGatewayAttachmentId() {
        return Codegen.optional(this.transitGatewayAttachmentId);
    }
    /**
     * Transit Gateway ID to attach to
     * 
     */
    @Export(name="transitGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitGatewayId;

    /**
     * @return Transit Gateway ID to attach to
     * 
     */
    public Output<Optional<String>> transitGatewayId() {
        return Codegen.optional(this.transitGatewayId);
    }
    /**
     * VPC ID to attach to
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return VPC ID to attach to
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowLog(String name) {
        this(name, FlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowLog(String name, @Nullable FlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowLog(String name, @Nullable FlowLogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/flowLog:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlowLog(String name, Output<String> id, @Nullable FlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/flowLog:FlowLog", name, state, makeResourceOptions(options, id));
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
    public static FlowLog get(String name, Output<String> id, @Nullable FlowLogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, state, options);
    }
}
