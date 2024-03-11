// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot
{
    /// <summary>
    /// Creates and manages an AWS IoT topic rule.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mytopic = new Aws.Sns.Topic("mytopic", new()
    ///     {
    ///         Name = "mytopic",
    ///     });
    /// 
    ///     var myerrortopic = new Aws.Sns.Topic("myerrortopic", new()
    ///     {
    ///         Name = "myerrortopic",
    ///     });
    /// 
    ///     var rule = new Aws.Iot.TopicRule("rule", new()
    ///     {
    ///         Name = "MyRule",
    ///         Description = "Example rule",
    ///         Enabled = true,
    ///         Sql = "SELECT * FROM 'topic/test'",
    ///         SqlVersion = "2016-03-23",
    ///         Sns = new[]
    ///         {
    ///             new Aws.Iot.Inputs.TopicRuleSnsArgs
    ///             {
    ///                 MessageFormat = "RAW",
    ///                 RoleArn = role.Arn,
    ///                 TargetArn = mytopic.Arn,
    ///             },
    ///         },
    ///         ErrorAction = new Aws.Iot.Inputs.TopicRuleErrorActionArgs
    ///         {
    ///             Sns = new Aws.Iot.Inputs.TopicRuleErrorActionSnsArgs
    ///             {
    ///                 MessageFormat = "RAW",
    ///                 RoleArn = role.Arn,
    ///                 TargetArn = myerrortopic.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "iot.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var myrole = new Aws.Iam.Role("myrole", new()
    ///     {
    ///         Name = "myrole",
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var mypolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Actions = new[]
    ///                 {
    ///                     "sns:Publish",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     mytopic.Arn,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var mypolicyRolePolicy = new Aws.Iam.RolePolicy("mypolicy", new()
    ///     {
    ///         Name = "mypolicy",
    ///         Role = myrole.Id,
    ///         Policy = mypolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IoT Topic Rules using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:iot/topicRule:TopicRule rule &lt;name&gt;
    /// ```
    /// </summary>
    [AwsResourceType("aws:iot/topicRule:TopicRule")]
    public partial class TopicRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the topic rule
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("cloudwatchAlarms")]
        public Output<ImmutableArray<Outputs.TopicRuleCloudwatchAlarm>> CloudwatchAlarms { get; private set; } = null!;

        [Output("cloudwatchLogs")]
        public Output<ImmutableArray<Outputs.TopicRuleCloudwatchLog>> CloudwatchLogs { get; private set; } = null!;

        [Output("cloudwatchMetrics")]
        public Output<ImmutableArray<Outputs.TopicRuleCloudwatchMetric>> CloudwatchMetrics { get; private set; } = null!;

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("dynamodbs")]
        public Output<ImmutableArray<Outputs.TopicRuleDynamodb>> Dynamodbs { get; private set; } = null!;

        [Output("dynamodbv2s")]
        public Output<ImmutableArray<Outputs.TopicRuleDynamodbv2>> Dynamodbv2s { get; private set; } = null!;

        [Output("elasticsearch")]
        public Output<ImmutableArray<Outputs.TopicRuleElasticsearch>> Elasticsearch { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the rule is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_logs`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iot_analytics`, `iot_events`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `step_functions`, `timestream` configuration blocks for further configuration details.
        /// </summary>
        [Output("errorAction")]
        public Output<Outputs.TopicRuleErrorAction?> ErrorAction { get; private set; } = null!;

        [Output("firehoses")]
        public Output<ImmutableArray<Outputs.TopicRuleFirehose>> Firehoses { get; private set; } = null!;

        [Output("https")]
        public Output<ImmutableArray<Outputs.TopicRuleHttp>> Https { get; private set; } = null!;

        [Output("iotAnalytics")]
        public Output<ImmutableArray<Outputs.TopicRuleIotAnalytic>> IotAnalytics { get; private set; } = null!;

        [Output("iotEvents")]
        public Output<ImmutableArray<Outputs.TopicRuleIotEvent>> IotEvents { get; private set; } = null!;

        [Output("kafkas")]
        public Output<ImmutableArray<Outputs.TopicRuleKafka>> Kafkas { get; private set; } = null!;

        [Output("kineses")]
        public Output<ImmutableArray<Outputs.TopicRuleKinesis>> Kineses { get; private set; } = null!;

        [Output("lambdas")]
        public Output<ImmutableArray<Outputs.TopicRuleLambda>> Lambdas { get; private set; } = null!;

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("republishes")]
        public Output<ImmutableArray<Outputs.TopicRuleRepublish>> Republishes { get; private set; } = null!;

        [Output("s3")]
        public Output<ImmutableArray<Outputs.TopicRuleS3>> S3 { get; private set; } = null!;

        [Output("sns")]
        public Output<ImmutableArray<Outputs.TopicRuleSns>> Sns { get; private set; } = null!;

        /// <summary>
        /// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
        /// </summary>
        [Output("sql")]
        public Output<string> Sql { get; private set; } = null!;

        /// <summary>
        /// The version of the SQL rules engine to use when evaluating the rule.
        /// </summary>
        [Output("sqlVersion")]
        public Output<string> SqlVersion { get; private set; } = null!;

        [Output("sqs")]
        public Output<ImmutableArray<Outputs.TopicRuleSqs>> Sqs { get; private set; } = null!;

        [Output("stepFunctions")]
        public Output<ImmutableArray<Outputs.TopicRuleStepFunction>> StepFunctions { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timestreams")]
        public Output<ImmutableArray<Outputs.TopicRuleTimestream>> Timestreams { get; private set; } = null!;


        /// <summary>
        /// Create a TopicRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TopicRule(string name, TopicRuleArgs args, CustomResourceOptions? options = null)
            : base("aws:iot/topicRule:TopicRule", name, args ?? new TopicRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TopicRule(string name, Input<string> id, TopicRuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:iot/topicRule:TopicRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TopicRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TopicRule Get(string name, Input<string> id, TopicRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new TopicRule(name, id, state, options);
        }
    }

    public sealed class TopicRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudwatchAlarms")]
        private InputList<Inputs.TopicRuleCloudwatchAlarmArgs>? _cloudwatchAlarms;
        public InputList<Inputs.TopicRuleCloudwatchAlarmArgs> CloudwatchAlarms
        {
            get => _cloudwatchAlarms ?? (_cloudwatchAlarms = new InputList<Inputs.TopicRuleCloudwatchAlarmArgs>());
            set => _cloudwatchAlarms = value;
        }

        [Input("cloudwatchLogs")]
        private InputList<Inputs.TopicRuleCloudwatchLogArgs>? _cloudwatchLogs;
        public InputList<Inputs.TopicRuleCloudwatchLogArgs> CloudwatchLogs
        {
            get => _cloudwatchLogs ?? (_cloudwatchLogs = new InputList<Inputs.TopicRuleCloudwatchLogArgs>());
            set => _cloudwatchLogs = value;
        }

        [Input("cloudwatchMetrics")]
        private InputList<Inputs.TopicRuleCloudwatchMetricArgs>? _cloudwatchMetrics;
        public InputList<Inputs.TopicRuleCloudwatchMetricArgs> CloudwatchMetrics
        {
            get => _cloudwatchMetrics ?? (_cloudwatchMetrics = new InputList<Inputs.TopicRuleCloudwatchMetricArgs>());
            set => _cloudwatchMetrics = value;
        }

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dynamodbs")]
        private InputList<Inputs.TopicRuleDynamodbArgs>? _dynamodbs;
        public InputList<Inputs.TopicRuleDynamodbArgs> Dynamodbs
        {
            get => _dynamodbs ?? (_dynamodbs = new InputList<Inputs.TopicRuleDynamodbArgs>());
            set => _dynamodbs = value;
        }

        [Input("dynamodbv2s")]
        private InputList<Inputs.TopicRuleDynamodbv2Args>? _dynamodbv2s;
        public InputList<Inputs.TopicRuleDynamodbv2Args> Dynamodbv2s
        {
            get => _dynamodbv2s ?? (_dynamodbv2s = new InputList<Inputs.TopicRuleDynamodbv2Args>());
            set => _dynamodbv2s = value;
        }

        [Input("elasticsearch")]
        private InputList<Inputs.TopicRuleElasticsearchArgs>? _elasticsearch;
        public InputList<Inputs.TopicRuleElasticsearchArgs> Elasticsearch
        {
            get => _elasticsearch ?? (_elasticsearch = new InputList<Inputs.TopicRuleElasticsearchArgs>());
            set => _elasticsearch = value;
        }

        /// <summary>
        /// Specifies whether the rule is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_logs`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iot_analytics`, `iot_events`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `step_functions`, `timestream` configuration blocks for further configuration details.
        /// </summary>
        [Input("errorAction")]
        public Input<Inputs.TopicRuleErrorActionArgs>? ErrorAction { get; set; }

        [Input("firehoses")]
        private InputList<Inputs.TopicRuleFirehoseArgs>? _firehoses;
        public InputList<Inputs.TopicRuleFirehoseArgs> Firehoses
        {
            get => _firehoses ?? (_firehoses = new InputList<Inputs.TopicRuleFirehoseArgs>());
            set => _firehoses = value;
        }

        [Input("https")]
        private InputList<Inputs.TopicRuleHttpArgs>? _https;
        public InputList<Inputs.TopicRuleHttpArgs> Https
        {
            get => _https ?? (_https = new InputList<Inputs.TopicRuleHttpArgs>());
            set => _https = value;
        }

        [Input("iotAnalytics")]
        private InputList<Inputs.TopicRuleIotAnalyticArgs>? _iotAnalytics;
        public InputList<Inputs.TopicRuleIotAnalyticArgs> IotAnalytics
        {
            get => _iotAnalytics ?? (_iotAnalytics = new InputList<Inputs.TopicRuleIotAnalyticArgs>());
            set => _iotAnalytics = value;
        }

        [Input("iotEvents")]
        private InputList<Inputs.TopicRuleIotEventArgs>? _iotEvents;
        public InputList<Inputs.TopicRuleIotEventArgs> IotEvents
        {
            get => _iotEvents ?? (_iotEvents = new InputList<Inputs.TopicRuleIotEventArgs>());
            set => _iotEvents = value;
        }

        [Input("kafkas")]
        private InputList<Inputs.TopicRuleKafkaArgs>? _kafkas;
        public InputList<Inputs.TopicRuleKafkaArgs> Kafkas
        {
            get => _kafkas ?? (_kafkas = new InputList<Inputs.TopicRuleKafkaArgs>());
            set => _kafkas = value;
        }

        [Input("kineses")]
        private InputList<Inputs.TopicRuleKinesisArgs>? _kineses;
        public InputList<Inputs.TopicRuleKinesisArgs> Kineses
        {
            get => _kineses ?? (_kineses = new InputList<Inputs.TopicRuleKinesisArgs>());
            set => _kineses = value;
        }

        [Input("lambdas")]
        private InputList<Inputs.TopicRuleLambdaArgs>? _lambdas;
        public InputList<Inputs.TopicRuleLambdaArgs> Lambdas
        {
            get => _lambdas ?? (_lambdas = new InputList<Inputs.TopicRuleLambdaArgs>());
            set => _lambdas = value;
        }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("republishes")]
        private InputList<Inputs.TopicRuleRepublishArgs>? _republishes;
        public InputList<Inputs.TopicRuleRepublishArgs> Republishes
        {
            get => _republishes ?? (_republishes = new InputList<Inputs.TopicRuleRepublishArgs>());
            set => _republishes = value;
        }

        [Input("s3")]
        private InputList<Inputs.TopicRuleS3Args>? _s3;
        public InputList<Inputs.TopicRuleS3Args> S3
        {
            get => _s3 ?? (_s3 = new InputList<Inputs.TopicRuleS3Args>());
            set => _s3 = value;
        }

        [Input("sns")]
        private InputList<Inputs.TopicRuleSnsArgs>? _sns;
        public InputList<Inputs.TopicRuleSnsArgs> Sns
        {
            get => _sns ?? (_sns = new InputList<Inputs.TopicRuleSnsArgs>());
            set => _sns = value;
        }

        /// <summary>
        /// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
        /// </summary>
        [Input("sql", required: true)]
        public Input<string> Sql { get; set; } = null!;

        /// <summary>
        /// The version of the SQL rules engine to use when evaluating the rule.
        /// </summary>
        [Input("sqlVersion", required: true)]
        public Input<string> SqlVersion { get; set; } = null!;

        [Input("sqs")]
        private InputList<Inputs.TopicRuleSqsArgs>? _sqs;
        public InputList<Inputs.TopicRuleSqsArgs> Sqs
        {
            get => _sqs ?? (_sqs = new InputList<Inputs.TopicRuleSqsArgs>());
            set => _sqs = value;
        }

        [Input("stepFunctions")]
        private InputList<Inputs.TopicRuleStepFunctionArgs>? _stepFunctions;
        public InputList<Inputs.TopicRuleStepFunctionArgs> StepFunctions
        {
            get => _stepFunctions ?? (_stepFunctions = new InputList<Inputs.TopicRuleStepFunctionArgs>());
            set => _stepFunctions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timestreams")]
        private InputList<Inputs.TopicRuleTimestreamArgs>? _timestreams;
        public InputList<Inputs.TopicRuleTimestreamArgs> Timestreams
        {
            get => _timestreams ?? (_timestreams = new InputList<Inputs.TopicRuleTimestreamArgs>());
            set => _timestreams = value;
        }

        public TopicRuleArgs()
        {
        }
        public static new TopicRuleArgs Empty => new TopicRuleArgs();
    }

    public sealed class TopicRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the topic rule
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("cloudwatchAlarms")]
        private InputList<Inputs.TopicRuleCloudwatchAlarmGetArgs>? _cloudwatchAlarms;
        public InputList<Inputs.TopicRuleCloudwatchAlarmGetArgs> CloudwatchAlarms
        {
            get => _cloudwatchAlarms ?? (_cloudwatchAlarms = new InputList<Inputs.TopicRuleCloudwatchAlarmGetArgs>());
            set => _cloudwatchAlarms = value;
        }

        [Input("cloudwatchLogs")]
        private InputList<Inputs.TopicRuleCloudwatchLogGetArgs>? _cloudwatchLogs;
        public InputList<Inputs.TopicRuleCloudwatchLogGetArgs> CloudwatchLogs
        {
            get => _cloudwatchLogs ?? (_cloudwatchLogs = new InputList<Inputs.TopicRuleCloudwatchLogGetArgs>());
            set => _cloudwatchLogs = value;
        }

        [Input("cloudwatchMetrics")]
        private InputList<Inputs.TopicRuleCloudwatchMetricGetArgs>? _cloudwatchMetrics;
        public InputList<Inputs.TopicRuleCloudwatchMetricGetArgs> CloudwatchMetrics
        {
            get => _cloudwatchMetrics ?? (_cloudwatchMetrics = new InputList<Inputs.TopicRuleCloudwatchMetricGetArgs>());
            set => _cloudwatchMetrics = value;
        }

        /// <summary>
        /// The description of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dynamodbs")]
        private InputList<Inputs.TopicRuleDynamodbGetArgs>? _dynamodbs;
        public InputList<Inputs.TopicRuleDynamodbGetArgs> Dynamodbs
        {
            get => _dynamodbs ?? (_dynamodbs = new InputList<Inputs.TopicRuleDynamodbGetArgs>());
            set => _dynamodbs = value;
        }

        [Input("dynamodbv2s")]
        private InputList<Inputs.TopicRuleDynamodbv2GetArgs>? _dynamodbv2s;
        public InputList<Inputs.TopicRuleDynamodbv2GetArgs> Dynamodbv2s
        {
            get => _dynamodbv2s ?? (_dynamodbv2s = new InputList<Inputs.TopicRuleDynamodbv2GetArgs>());
            set => _dynamodbv2s = value;
        }

        [Input("elasticsearch")]
        private InputList<Inputs.TopicRuleElasticsearchGetArgs>? _elasticsearch;
        public InputList<Inputs.TopicRuleElasticsearchGetArgs> Elasticsearch
        {
            get => _elasticsearch ?? (_elasticsearch = new InputList<Inputs.TopicRuleElasticsearchGetArgs>());
            set => _elasticsearch = value;
        }

        /// <summary>
        /// Specifies whether the rule is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_logs`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iot_analytics`, `iot_events`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `step_functions`, `timestream` configuration blocks for further configuration details.
        /// </summary>
        [Input("errorAction")]
        public Input<Inputs.TopicRuleErrorActionGetArgs>? ErrorAction { get; set; }

        [Input("firehoses")]
        private InputList<Inputs.TopicRuleFirehoseGetArgs>? _firehoses;
        public InputList<Inputs.TopicRuleFirehoseGetArgs> Firehoses
        {
            get => _firehoses ?? (_firehoses = new InputList<Inputs.TopicRuleFirehoseGetArgs>());
            set => _firehoses = value;
        }

        [Input("https")]
        private InputList<Inputs.TopicRuleHttpGetArgs>? _https;
        public InputList<Inputs.TopicRuleHttpGetArgs> Https
        {
            get => _https ?? (_https = new InputList<Inputs.TopicRuleHttpGetArgs>());
            set => _https = value;
        }

        [Input("iotAnalytics")]
        private InputList<Inputs.TopicRuleIotAnalyticGetArgs>? _iotAnalytics;
        public InputList<Inputs.TopicRuleIotAnalyticGetArgs> IotAnalytics
        {
            get => _iotAnalytics ?? (_iotAnalytics = new InputList<Inputs.TopicRuleIotAnalyticGetArgs>());
            set => _iotAnalytics = value;
        }

        [Input("iotEvents")]
        private InputList<Inputs.TopicRuleIotEventGetArgs>? _iotEvents;
        public InputList<Inputs.TopicRuleIotEventGetArgs> IotEvents
        {
            get => _iotEvents ?? (_iotEvents = new InputList<Inputs.TopicRuleIotEventGetArgs>());
            set => _iotEvents = value;
        }

        [Input("kafkas")]
        private InputList<Inputs.TopicRuleKafkaGetArgs>? _kafkas;
        public InputList<Inputs.TopicRuleKafkaGetArgs> Kafkas
        {
            get => _kafkas ?? (_kafkas = new InputList<Inputs.TopicRuleKafkaGetArgs>());
            set => _kafkas = value;
        }

        [Input("kineses")]
        private InputList<Inputs.TopicRuleKinesisGetArgs>? _kineses;
        public InputList<Inputs.TopicRuleKinesisGetArgs> Kineses
        {
            get => _kineses ?? (_kineses = new InputList<Inputs.TopicRuleKinesisGetArgs>());
            set => _kineses = value;
        }

        [Input("lambdas")]
        private InputList<Inputs.TopicRuleLambdaGetArgs>? _lambdas;
        public InputList<Inputs.TopicRuleLambdaGetArgs> Lambdas
        {
            get => _lambdas ?? (_lambdas = new InputList<Inputs.TopicRuleLambdaGetArgs>());
            set => _lambdas = value;
        }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("republishes")]
        private InputList<Inputs.TopicRuleRepublishGetArgs>? _republishes;
        public InputList<Inputs.TopicRuleRepublishGetArgs> Republishes
        {
            get => _republishes ?? (_republishes = new InputList<Inputs.TopicRuleRepublishGetArgs>());
            set => _republishes = value;
        }

        [Input("s3")]
        private InputList<Inputs.TopicRuleS3GetArgs>? _s3;
        public InputList<Inputs.TopicRuleS3GetArgs> S3
        {
            get => _s3 ?? (_s3 = new InputList<Inputs.TopicRuleS3GetArgs>());
            set => _s3 = value;
        }

        [Input("sns")]
        private InputList<Inputs.TopicRuleSnsGetArgs>? _sns;
        public InputList<Inputs.TopicRuleSnsGetArgs> Sns
        {
            get => _sns ?? (_sns = new InputList<Inputs.TopicRuleSnsGetArgs>());
            set => _sns = value;
        }

        /// <summary>
        /// The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
        /// </summary>
        [Input("sql")]
        public Input<string>? Sql { get; set; }

        /// <summary>
        /// The version of the SQL rules engine to use when evaluating the rule.
        /// </summary>
        [Input("sqlVersion")]
        public Input<string>? SqlVersion { get; set; }

        [Input("sqs")]
        private InputList<Inputs.TopicRuleSqsGetArgs>? _sqs;
        public InputList<Inputs.TopicRuleSqsGetArgs> Sqs
        {
            get => _sqs ?? (_sqs = new InputList<Inputs.TopicRuleSqsGetArgs>());
            set => _sqs = value;
        }

        [Input("stepFunctions")]
        private InputList<Inputs.TopicRuleStepFunctionGetArgs>? _stepFunctions;
        public InputList<Inputs.TopicRuleStepFunctionGetArgs> StepFunctions
        {
            get => _stepFunctions ?? (_stepFunctions = new InputList<Inputs.TopicRuleStepFunctionGetArgs>());
            set => _stepFunctions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("timestreams")]
        private InputList<Inputs.TopicRuleTimestreamGetArgs>? _timestreams;
        public InputList<Inputs.TopicRuleTimestreamGetArgs> Timestreams
        {
            get => _timestreams ?? (_timestreams = new InputList<Inputs.TopicRuleTimestreamGetArgs>());
            set => _timestreams = value;
        }

        public TopicRuleState()
        {
        }
        public static new TopicRuleState Empty => new TopicRuleState();
    }
}
