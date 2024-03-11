// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3
{
    /// <summary>
    /// Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
    /// 
    /// &gt; **NOTE:** S3 Buckets only support a single notification configuration. Declaring multiple `aws.s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. See the example "Trigger multiple Lambda functions" for an option.
    /// 
    /// &gt; This resource cannot be used with S3 directory buckets.
    /// 
    /// ## Example Usage
    /// 
    /// ### Add notification configuration to SNS Topic
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
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var topic = Aws.Iam.GetPolicyDocument.Invoke(new()
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
    ///                             "s3.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "SNS:Publish",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:sns:*:*:s3-event-notification-topic",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "ArnLike",
    ///                         Variable = "aws:SourceArn",
    ///                         Values = new[]
    ///                         {
    ///                             bucket.Arn,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var topicTopic = new Aws.Sns.Topic("topic", new()
    ///     {
    ///         Name = "s3-event-notification-topic",
    ///         Policy = topic.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         Topics = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketNotificationTopicArgs
    ///             {
    ///                 TopicArn = topicTopic.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterSuffix = ".log",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Add notification configuration to SQS Queue
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
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var queue = Aws.Iam.GetPolicyDocument.Invoke(new()
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
    ///                         Type = "*",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "*",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sqs:SendMessage",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:sqs:*:*:s3-event-notification-queue",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "ArnEquals",
    ///                         Variable = "aws:SourceArn",
    ///                         Values = new[]
    ///                         {
    ///                             bucket.Arn,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var queueQueue = new Aws.Sqs.Queue("queue", new()
    ///     {
    ///         Name = "s3-event-notification-queue",
    ///         Policy = queue.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         Queues = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketNotificationQueueArgs
    ///             {
    ///                 QueueArn = queueQueue.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterSuffix = ".log",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Add notification configuration to Lambda Function
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
    ///                             "lambda.amazonaws.com",
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
    ///     var iamForLambda = new Aws.Iam.Role("iam_for_lambda", new()
    ///     {
    ///         Name = "iam_for_lambda",
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var func = new Aws.Lambda.Function("func", new()
    ///     {
    ///         Code = new FileArchive("your-function.zip"),
    ///         Name = "example_lambda_name",
    ///         Role = iamForLambda.Arn,
    ///         Handler = "exports.example",
    ///         Runtime = "go1.x",
    ///     });
    /// 
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var allowBucket = new Aws.Lambda.Permission("allow_bucket", new()
    ///     {
    ///         StatementId = "AllowExecutionFromS3Bucket",
    ///         Action = "lambda:InvokeFunction",
    ///         Function = func.Arn,
    ///         Principal = "s3.amazonaws.com",
    ///         SourceArn = bucket.Arn,
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         LambdaFunctions = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketNotificationLambdaFunctionArgs
    ///             {
    ///                 LambdaFunctionArn = func.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterPrefix = "AWSLogs/",
    ///                 FilterSuffix = ".log",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Trigger multiple Lambda functions
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
    ///                             "lambda.amazonaws.com",
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
    ///     var iamForLambda = new Aws.Iam.Role("iam_for_lambda", new()
    ///     {
    ///         Name = "iam_for_lambda",
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var func1 = new Aws.Lambda.Function("func1", new()
    ///     {
    ///         Code = new FileArchive("your-function1.zip"),
    ///         Name = "example_lambda_name1",
    ///         Role = iamForLambda.Arn,
    ///         Handler = "exports.example",
    ///         Runtime = "go1.x",
    ///     });
    /// 
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var allowBucket1 = new Aws.Lambda.Permission("allow_bucket1", new()
    ///     {
    ///         StatementId = "AllowExecutionFromS3Bucket1",
    ///         Action = "lambda:InvokeFunction",
    ///         Function = func1.Arn,
    ///         Principal = "s3.amazonaws.com",
    ///         SourceArn = bucket.Arn,
    ///     });
    /// 
    ///     var func2 = new Aws.Lambda.Function("func2", new()
    ///     {
    ///         Code = new FileArchive("your-function2.zip"),
    ///         Name = "example_lambda_name2",
    ///         Role = iamForLambda.Arn,
    ///         Handler = "exports.example",
    ///     });
    /// 
    ///     var allowBucket2 = new Aws.Lambda.Permission("allow_bucket2", new()
    ///     {
    ///         StatementId = "AllowExecutionFromS3Bucket2",
    ///         Action = "lambda:InvokeFunction",
    ///         Function = func2.Arn,
    ///         Principal = "s3.amazonaws.com",
    ///         SourceArn = bucket.Arn,
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         LambdaFunctions = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketNotificationLambdaFunctionArgs
    ///             {
    ///                 LambdaFunctionArn = func1.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterPrefix = "AWSLogs/",
    ///                 FilterSuffix = ".log",
    ///             },
    ///             new Aws.S3.Inputs.BucketNotificationLambdaFunctionArgs
    ///             {
    ///                 LambdaFunctionArn = func2.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterPrefix = "OtherLogs/",
    ///                 FilterSuffix = ".log",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Add multiple notification configurations to SQS Queue
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
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var queue = Aws.Iam.GetPolicyDocument.Invoke(new()
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
    ///                         Type = "*",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "*",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sqs:SendMessage",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:sqs:*:*:s3-event-notification-queue",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "ArnEquals",
    ///                         Variable = "aws:SourceArn",
    ///                         Values = new[]
    ///                         {
    ///                             bucket.Arn,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var queueQueue = new Aws.Sqs.Queue("queue", new()
    ///     {
    ///         Name = "s3-event-notification-queue",
    ///         Policy = queue.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         Queues = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketNotificationQueueArgs
    ///             {
    ///                 Id = "image-upload-event",
    ///                 QueueArn = queueQueue.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterPrefix = "images/",
    ///             },
    ///             new Aws.S3.Inputs.BucketNotificationQueueArgs
    ///             {
    ///                 Id = "video-upload-event",
    ///                 QueueArn = queueQueue.Arn,
    ///                 Events = new[]
    ///                 {
    ///                     "s3:ObjectCreated:*",
    ///                 },
    ///                 FilterPrefix = "videos/",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// For JSON syntax, use an array instead of defining the `queue` key twice.
    /// 
    /// ### Emit events to EventBridge
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
    ///     var bucket = new Aws.S3.BucketV2("bucket", new()
    ///     {
    ///         Bucket = "your-bucket-name",
    ///     });
    /// 
    ///     var bucketNotification = new Aws.S3.BucketNotification("bucket_notification", new()
    ///     {
    ///         Bucket = bucket.Id,
    ///         Eventbridge = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import S3 bucket notification using the `bucket`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:s3/bucketNotification:BucketNotification bucket_notification bucket-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketNotification:BucketNotification")]
    public partial class BucketNotification : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the bucket for notification configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        /// </summary>
        [Output("eventbridge")]
        public Output<bool?> Eventbridge { get; private set; } = null!;

        /// <summary>
        /// Used to configure notifications to a Lambda Function. See below.
        /// </summary>
        [Output("lambdaFunctions")]
        public Output<ImmutableArray<Outputs.BucketNotificationLambdaFunction>> LambdaFunctions { get; private set; } = null!;

        /// <summary>
        /// Notification configuration to SQS Queue. See below.
        /// </summary>
        [Output("queues")]
        public Output<ImmutableArray<Outputs.BucketNotificationQueue>> Queues { get; private set; } = null!;

        /// <summary>
        /// Notification configuration to SNS Topic. See below.
        /// </summary>
        [Output("topics")]
        public Output<ImmutableArray<Outputs.BucketNotificationTopic>> Topics { get; private set; } = null!;


        /// <summary>
        /// Create a BucketNotification resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketNotification(string name, BucketNotificationArgs args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketNotification:BucketNotification", name, args ?? new BucketNotificationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BucketNotification(string name, Input<string> id, BucketNotificationState? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketNotification:BucketNotification", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketNotification resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketNotification Get(string name, Input<string> id, BucketNotificationState? state = null, CustomResourceOptions? options = null)
        {
            return new BucketNotification(name, id, state, options);
        }
    }

    public sealed class BucketNotificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket for notification configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        /// </summary>
        [Input("eventbridge")]
        public Input<bool>? Eventbridge { get; set; }

        [Input("lambdaFunctions")]
        private InputList<Inputs.BucketNotificationLambdaFunctionArgs>? _lambdaFunctions;

        /// <summary>
        /// Used to configure notifications to a Lambda Function. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationLambdaFunctionArgs> LambdaFunctions
        {
            get => _lambdaFunctions ?? (_lambdaFunctions = new InputList<Inputs.BucketNotificationLambdaFunctionArgs>());
            set => _lambdaFunctions = value;
        }

        [Input("queues")]
        private InputList<Inputs.BucketNotificationQueueArgs>? _queues;

        /// <summary>
        /// Notification configuration to SQS Queue. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationQueueArgs> Queues
        {
            get => _queues ?? (_queues = new InputList<Inputs.BucketNotificationQueueArgs>());
            set => _queues = value;
        }

        [Input("topics")]
        private InputList<Inputs.BucketNotificationTopicArgs>? _topics;

        /// <summary>
        /// Notification configuration to SNS Topic. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationTopicArgs> Topics
        {
            get => _topics ?? (_topics = new InputList<Inputs.BucketNotificationTopicArgs>());
            set => _topics = value;
        }

        public BucketNotificationArgs()
        {
        }
        public static new BucketNotificationArgs Empty => new BucketNotificationArgs();
    }

    public sealed class BucketNotificationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket for notification configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Whether to enable Amazon EventBridge notifications. Defaults to `false`.
        /// </summary>
        [Input("eventbridge")]
        public Input<bool>? Eventbridge { get; set; }

        [Input("lambdaFunctions")]
        private InputList<Inputs.BucketNotificationLambdaFunctionGetArgs>? _lambdaFunctions;

        /// <summary>
        /// Used to configure notifications to a Lambda Function. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationLambdaFunctionGetArgs> LambdaFunctions
        {
            get => _lambdaFunctions ?? (_lambdaFunctions = new InputList<Inputs.BucketNotificationLambdaFunctionGetArgs>());
            set => _lambdaFunctions = value;
        }

        [Input("queues")]
        private InputList<Inputs.BucketNotificationQueueGetArgs>? _queues;

        /// <summary>
        /// Notification configuration to SQS Queue. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationQueueGetArgs> Queues
        {
            get => _queues ?? (_queues = new InputList<Inputs.BucketNotificationQueueGetArgs>());
            set => _queues = value;
        }

        [Input("topics")]
        private InputList<Inputs.BucketNotificationTopicGetArgs>? _topics;

        /// <summary>
        /// Notification configuration to SNS Topic. See below.
        /// </summary>
        public InputList<Inputs.BucketNotificationTopicGetArgs> Topics
        {
            get => _topics ?? (_topics = new InputList<Inputs.BucketNotificationTopicGetArgs>());
            set => _topics = value;
        }

        public BucketNotificationState()
        {
        }
        public static new BucketNotificationState Empty => new BucketNotificationState();
    }
}
