// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.TopicRuleArgs;
import com.pulumi.aws.iot.inputs.TopicRuleState;
import com.pulumi.aws.iot.outputs.TopicRuleCloudwatchAlarm;
import com.pulumi.aws.iot.outputs.TopicRuleCloudwatchLog;
import com.pulumi.aws.iot.outputs.TopicRuleCloudwatchMetric;
import com.pulumi.aws.iot.outputs.TopicRuleDynamodb;
import com.pulumi.aws.iot.outputs.TopicRuleDynamodbv2;
import com.pulumi.aws.iot.outputs.TopicRuleElasticsearch;
import com.pulumi.aws.iot.outputs.TopicRuleErrorAction;
import com.pulumi.aws.iot.outputs.TopicRuleFirehose;
import com.pulumi.aws.iot.outputs.TopicRuleHttp;
import com.pulumi.aws.iot.outputs.TopicRuleIotAnalytic;
import com.pulumi.aws.iot.outputs.TopicRuleIotEvent;
import com.pulumi.aws.iot.outputs.TopicRuleKafka;
import com.pulumi.aws.iot.outputs.TopicRuleKinesis;
import com.pulumi.aws.iot.outputs.TopicRuleLambda;
import com.pulumi.aws.iot.outputs.TopicRuleRepublish;
import com.pulumi.aws.iot.outputs.TopicRuleS3;
import com.pulumi.aws.iot.outputs.TopicRuleSns;
import com.pulumi.aws.iot.outputs.TopicRuleSqs;
import com.pulumi.aws.iot.outputs.TopicRuleStepFunction;
import com.pulumi.aws.iot.outputs.TopicRuleTimestream;
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
 * Creates and manages an AWS IoT topic rule.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.iot.TopicRule;
 * import com.pulumi.aws.iot.TopicRuleArgs;
 * import com.pulumi.aws.iot.inputs.TopicRuleSnsArgs;
 * import com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs;
 * import com.pulumi.aws.iot.inputs.TopicRuleErrorActionSnsArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
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
 *         var mytopic = new Topic(&#34;mytopic&#34;);
 * 
 *         var myerrortopic = new Topic(&#34;myerrortopic&#34;);
 * 
 *         var rule = new TopicRule(&#34;rule&#34;, TopicRuleArgs.builder()        
 *             .description(&#34;Example rule&#34;)
 *             .enabled(true)
 *             .sql(&#34;SELECT * FROM &#39;topic/test&#39;&#34;)
 *             .sqlVersion(&#34;2016-03-23&#34;)
 *             .sns(TopicRuleSnsArgs.builder()
 *                 .messageFormat(&#34;RAW&#34;)
 *                 .roleArn(aws_iam_role.role().arn())
 *                 .targetArn(mytopic.arn())
 *                 .build())
 *             .errorAction(TopicRuleErrorActionArgs.builder()
 *                 .sns(TopicRuleErrorActionSnsArgs.builder()
 *                     .messageFormat(&#34;RAW&#34;)
 *                     .roleArn(aws_iam_role.role().arn())
 *                     .targetArn(myerrortopic.arn())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;iot.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myrole = new Role(&#34;myrole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var mypolicyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;sns:Publish&#34;)
 *                 .resources(mytopic.arn())
 *                 .build())
 *             .build());
 * 
 *         var mypolicyRolePolicy = new RolePolicy(&#34;mypolicyRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(myrole.id())
 *             .policy(mypolicyPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(mypolicyPolicyDocument -&gt; mypolicyPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IoT Topic Rules using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:iot/topicRule:TopicRule rule &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="aws:iot/topicRule:TopicRule")
public class TopicRule extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the topic rule
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the topic rule
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="cloudwatchAlarms", refs={List.class,TopicRuleCloudwatchAlarm.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleCloudwatchAlarm>> cloudwatchAlarms;

    public Output<Optional<List<TopicRuleCloudwatchAlarm>>> cloudwatchAlarms() {
        return Codegen.optional(this.cloudwatchAlarms);
    }
    @Export(name="cloudwatchLogs", refs={List.class,TopicRuleCloudwatchLog.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleCloudwatchLog>> cloudwatchLogs;

    public Output<Optional<List<TopicRuleCloudwatchLog>>> cloudwatchLogs() {
        return Codegen.optional(this.cloudwatchLogs);
    }
    @Export(name="cloudwatchMetrics", refs={List.class,TopicRuleCloudwatchMetric.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleCloudwatchMetric>> cloudwatchMetrics;

    public Output<Optional<List<TopicRuleCloudwatchMetric>>> cloudwatchMetrics() {
        return Codegen.optional(this.cloudwatchMetrics);
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
    @Export(name="dynamodbs", refs={List.class,TopicRuleDynamodb.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleDynamodb>> dynamodbs;

    public Output<Optional<List<TopicRuleDynamodb>>> dynamodbs() {
        return Codegen.optional(this.dynamodbs);
    }
    @Export(name="dynamodbv2s", refs={List.class,TopicRuleDynamodbv2.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleDynamodbv2>> dynamodbv2s;

    public Output<Optional<List<TopicRuleDynamodbv2>>> dynamodbv2s() {
        return Codegen.optional(this.dynamodbv2s);
    }
    @Export(name="elasticsearch", refs={List.class,TopicRuleElasticsearch.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleElasticsearch>> elasticsearch;

    public Output<Optional<List<TopicRuleElasticsearch>>> elasticsearch() {
        return Codegen.optional(this.elasticsearch);
    }
    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the rule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_logs`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iot_analytics`, `iot_events`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `step_functions`, `timestream` configuration blocks for further configuration details.
     * 
     */
    @Export(name="errorAction", refs={TopicRuleErrorAction.class}, tree="[0]")
    private Output</* @Nullable */ TopicRuleErrorAction> errorAction;

    /**
     * @return Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_logs`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iot_analytics`, `iot_events`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `step_functions`, `timestream` configuration blocks for further configuration details.
     * 
     */
    public Output<Optional<TopicRuleErrorAction>> errorAction() {
        return Codegen.optional(this.errorAction);
    }
    @Export(name="firehoses", refs={List.class,TopicRuleFirehose.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleFirehose>> firehoses;

    public Output<Optional<List<TopicRuleFirehose>>> firehoses() {
        return Codegen.optional(this.firehoses);
    }
    @Export(name="https", refs={List.class,TopicRuleHttp.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleHttp>> https;

    public Output<Optional<List<TopicRuleHttp>>> https() {
        return Codegen.optional(this.https);
    }
    @Export(name="iotAnalytics", refs={List.class,TopicRuleIotAnalytic.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleIotAnalytic>> iotAnalytics;

    public Output<Optional<List<TopicRuleIotAnalytic>>> iotAnalytics() {
        return Codegen.optional(this.iotAnalytics);
    }
    @Export(name="iotEvents", refs={List.class,TopicRuleIotEvent.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleIotEvent>> iotEvents;

    public Output<Optional<List<TopicRuleIotEvent>>> iotEvents() {
        return Codegen.optional(this.iotEvents);
    }
    @Export(name="kafkas", refs={List.class,TopicRuleKafka.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleKafka>> kafkas;

    public Output<Optional<List<TopicRuleKafka>>> kafkas() {
        return Codegen.optional(this.kafkas);
    }
    @Export(name="kineses", refs={List.class,TopicRuleKinesis.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleKinesis>> kineses;

    public Output<Optional<List<TopicRuleKinesis>>> kineses() {
        return Codegen.optional(this.kineses);
    }
    @Export(name="lambdas", refs={List.class,TopicRuleLambda.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleLambda>> lambdas;

    public Output<Optional<List<TopicRuleLambda>>> lambdas() {
        return Codegen.optional(this.lambdas);
    }
    /**
     * The name of the rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="republishes", refs={List.class,TopicRuleRepublish.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleRepublish>> republishes;

    public Output<Optional<List<TopicRuleRepublish>>> republishes() {
        return Codegen.optional(this.republishes);
    }
    @Export(name="s3", refs={List.class,TopicRuleS3.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleS3>> s3;

    public Output<Optional<List<TopicRuleS3>>> s3() {
        return Codegen.optional(this.s3);
    }
    @Export(name="sns", refs={List.class,TopicRuleSns.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleSns>> sns;

    public Output<Optional<List<TopicRuleSns>>> sns() {
        return Codegen.optional(this.sns);
    }
    /**
     * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
     * 
     */
    @Export(name="sql", refs={String.class}, tree="[0]")
    private Output<String> sql;

    /**
     * @return The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
     * 
     */
    public Output<String> sql() {
        return this.sql;
    }
    /**
     * The version of the SQL rules engine to use when evaluating the rule.
     * 
     */
    @Export(name="sqlVersion", refs={String.class}, tree="[0]")
    private Output<String> sqlVersion;

    /**
     * @return The version of the SQL rules engine to use when evaluating the rule.
     * 
     */
    public Output<String> sqlVersion() {
        return this.sqlVersion;
    }
    @Export(name="sqs", refs={List.class,TopicRuleSqs.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleSqs>> sqs;

    public Output<Optional<List<TopicRuleSqs>>> sqs() {
        return Codegen.optional(this.sqs);
    }
    @Export(name="stepFunctions", refs={List.class,TopicRuleStepFunction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleStepFunction>> stepFunctions;

    public Output<Optional<List<TopicRuleStepFunction>>> stepFunctions() {
        return Codegen.optional(this.stepFunctions);
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
    @Export(name="timestreams", refs={List.class,TopicRuleTimestream.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TopicRuleTimestream>> timestreams;

    public Output<Optional<List<TopicRuleTimestream>>> timestreams() {
        return Codegen.optional(this.timestreams);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TopicRule(String name) {
        this(name, TopicRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TopicRule(String name, TopicRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TopicRule(String name, TopicRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/topicRule:TopicRule", name, args == null ? TopicRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TopicRule(String name, Output<String> id, @Nullable TopicRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/topicRule:TopicRule", name, state, makeResourceOptions(options, id));
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
    public static TopicRule get(String name, Output<String> id, @Nullable TopicRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TopicRule(name, id, state, options);
    }
}
