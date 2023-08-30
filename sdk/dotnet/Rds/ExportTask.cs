// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    /// <summary>
    /// Resource for managing an AWS RDS (Relational Database) Export Task.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Rds.ExportTask("example", new()
    ///     {
    ///         ExportTaskIdentifier = "example",
    ///         SourceArn = aws_db_snapshot.Example.Db_snapshot_arn,
    ///         S3BucketName = aws_s3_bucket.Example.Id,
    ///         IamRoleArn = aws_iam_role.Example.Arn,
    ///         KmsKeyId = aws_kms_key.Example.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Complete Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2", new()
    ///     {
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var exampleBucketAclV2 = new Aws.S3.BucketAclV2("exampleBucketAclV2", new()
    ///     {
    ///         Bucket = exampleBucketV2.Id,
    ///         Acl = "private",
    ///     });
    /// 
    ///     var exampleRole = new Aws.Iam.Role("exampleRole", new()
    ///     {
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Version"] = "2012-10-17",
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Action"] = "sts:AssumeRole",
    ///                     ["Effect"] = "Allow",
    ///                     ["Sid"] = "",
    ///                     ["Principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Service"] = "export.rds.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var examplePolicyDocument = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:ListAllMyBuckets",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:GetBucketLocation",
    ///                     "s3:ListBucket",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     exampleBucketV2.Arn,
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:GetObject",
    ///                     "s3:PutObject",
    ///                     "s3:DeleteObject",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     $"{exampleBucketV2.Arn}/*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var examplePolicy = new Aws.Iam.Policy("examplePolicy", new()
    ///     {
    ///         PolicyDocument = examplePolicyDocument.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var exampleRolePolicyAttachment = new Aws.Iam.RolePolicyAttachment("exampleRolePolicyAttachment", new()
    ///     {
    ///         Role = exampleRole.Name,
    ///         PolicyArn = examplePolicy.Arn,
    ///     });
    /// 
    ///     var exampleKey = new Aws.Kms.Key("exampleKey", new()
    ///     {
    ///         DeletionWindowInDays = 10,
    ///     });
    /// 
    ///     var exampleInstance = new Aws.Rds.Instance("exampleInstance", new()
    ///     {
    ///         Identifier = "example",
    ///         AllocatedStorage = 10,
    ///         DbName = "test",
    ///         Engine = "mysql",
    ///         EngineVersion = "5.7",
    ///         InstanceClass = "db.t3.micro",
    ///         Username = "foo",
    ///         Password = "foobarbaz",
    ///         ParameterGroupName = "default.mysql5.7",
    ///         SkipFinalSnapshot = true,
    ///     });
    /// 
    ///     var exampleSnapshot = new Aws.Rds.Snapshot("exampleSnapshot", new()
    ///     {
    ///         DbInstanceIdentifier = exampleInstance.Identifier,
    ///         DbSnapshotIdentifier = "example",
    ///     });
    /// 
    ///     var exampleExportTask = new Aws.Rds.ExportTask("exampleExportTask", new()
    ///     {
    ///         ExportTaskIdentifier = "example",
    ///         SourceArn = exampleSnapshot.DbSnapshotArn,
    ///         S3BucketName = exampleBucketV2.Id,
    ///         IamRoleArn = exampleRole.Arn,
    ///         KmsKeyId = exampleKey.Arn,
    ///         ExportOnlies = new[]
    ///         {
    ///             "database",
    ///         },
    ///         S3Prefix = "my_prefix/example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import a RDS (Relational Database) Export Task using the `export_task_identifier`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:rds/exportTask:ExportTask example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:rds/exportTask:ExportTask")]
    public partial class ExportTask : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported. Valid values are documented in the [AWS StartExportTask API documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestParameters).
        /// </summary>
        [Output("exportOnlies")]
        public Output<ImmutableArray<string>> ExportOnlies { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the snapshot export task.
        /// </summary>
        [Output("exportTaskIdentifier")]
        public Output<string> ExportTaskIdentifier { get; private set; } = null!;

        /// <summary>
        /// Reason the export failed, if it failed.
        /// </summary>
        [Output("failureCause")]
        public Output<string> FailureCause { get; private set; } = null!;

        /// <summary>
        /// ARN of the IAM role to use for writing to the Amazon S3 bucket.
        /// </summary>
        [Output("iamRoleArn")]
        public Output<string> IamRoleArn { get; private set; } = null!;

        /// <summary>
        /// ID of the Amazon Web Services KMS key to use to encrypt the snapshot.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Progress of the snapshot export task as a percentage.
        /// </summary>
        [Output("percentProgress")]
        public Output<int> PercentProgress { get; private set; } = null!;

        /// <summary>
        /// Name of the Amazon S3 bucket to export the snapshot to.
        /// </summary>
        [Output("s3BucketName")]
        public Output<string> S3BucketName { get; private set; } = null!;

        /// <summary>
        /// Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
        /// </summary>
        [Output("s3Prefix")]
        public Output<string> S3Prefix { get; private set; } = null!;

        /// <summary>
        /// Time that the snapshot was created.
        /// </summary>
        [Output("snapshotTime")]
        public Output<string> SnapshotTime { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the snapshot to export.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("sourceArn")]
        public Output<string> SourceArn { get; private set; } = null!;

        /// <summary>
        /// Type of source for the export.
        /// </summary>
        [Output("sourceType")]
        public Output<string> SourceType { get; private set; } = null!;

        /// <summary>
        /// Status of the export task.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Time that the snapshot export task completed.
        /// </summary>
        [Output("taskEndTime")]
        public Output<string> TaskEndTime { get; private set; } = null!;

        /// <summary>
        /// Time that the snapshot export task started.
        /// </summary>
        [Output("taskStartTime")]
        public Output<string> TaskStartTime { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.ExportTaskTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Warning about the snapshot export task, if any.
        /// </summary>
        [Output("warningMessage")]
        public Output<string> WarningMessage { get; private set; } = null!;


        /// <summary>
        /// Create a ExportTask resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExportTask(string name, ExportTaskArgs args, CustomResourceOptions? options = null)
            : base("aws:rds/exportTask:ExportTask", name, args ?? new ExportTaskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExportTask(string name, Input<string> id, ExportTaskState? state = null, CustomResourceOptions? options = null)
            : base("aws:rds/exportTask:ExportTask", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExportTask resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExportTask Get(string name, Input<string> id, ExportTaskState? state = null, CustomResourceOptions? options = null)
        {
            return new ExportTask(name, id, state, options);
        }
    }

    public sealed class ExportTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("exportOnlies")]
        private InputList<string>? _exportOnlies;

        /// <summary>
        /// Data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported. Valid values are documented in the [AWS StartExportTask API documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestParameters).
        /// </summary>
        public InputList<string> ExportOnlies
        {
            get => _exportOnlies ?? (_exportOnlies = new InputList<string>());
            set => _exportOnlies = value;
        }

        /// <summary>
        /// Unique identifier for the snapshot export task.
        /// </summary>
        [Input("exportTaskIdentifier", required: true)]
        public Input<string> ExportTaskIdentifier { get; set; } = null!;

        /// <summary>
        /// ARN of the IAM role to use for writing to the Amazon S3 bucket.
        /// </summary>
        [Input("iamRoleArn", required: true)]
        public Input<string> IamRoleArn { get; set; } = null!;

        /// <summary>
        /// ID of the Amazon Web Services KMS key to use to encrypt the snapshot.
        /// </summary>
        [Input("kmsKeyId", required: true)]
        public Input<string> KmsKeyId { get; set; } = null!;

        /// <summary>
        /// Name of the Amazon S3 bucket to export the snapshot to.
        /// </summary>
        [Input("s3BucketName", required: true)]
        public Input<string> S3BucketName { get; set; } = null!;

        /// <summary>
        /// Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
        /// </summary>
        [Input("s3Prefix")]
        public Input<string>? S3Prefix { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the snapshot to export.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("sourceArn", required: true)]
        public Input<string> SourceArn { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.ExportTaskTimeoutsArgs>? Timeouts { get; set; }

        public ExportTaskArgs()
        {
        }
        public static new ExportTaskArgs Empty => new ExportTaskArgs();
    }

    public sealed class ExportTaskState : global::Pulumi.ResourceArgs
    {
        [Input("exportOnlies")]
        private InputList<string>? _exportOnlies;

        /// <summary>
        /// Data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported. Valid values are documented in the [AWS StartExportTask API documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartExportTask.html#API_StartExportTask_RequestParameters).
        /// </summary>
        public InputList<string> ExportOnlies
        {
            get => _exportOnlies ?? (_exportOnlies = new InputList<string>());
            set => _exportOnlies = value;
        }

        /// <summary>
        /// Unique identifier for the snapshot export task.
        /// </summary>
        [Input("exportTaskIdentifier")]
        public Input<string>? ExportTaskIdentifier { get; set; }

        /// <summary>
        /// Reason the export failed, if it failed.
        /// </summary>
        [Input("failureCause")]
        public Input<string>? FailureCause { get; set; }

        /// <summary>
        /// ARN of the IAM role to use for writing to the Amazon S3 bucket.
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// ID of the Amazon Web Services KMS key to use to encrypt the snapshot.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Progress of the snapshot export task as a percentage.
        /// </summary>
        [Input("percentProgress")]
        public Input<int>? PercentProgress { get; set; }

        /// <summary>
        /// Name of the Amazon S3 bucket to export the snapshot to.
        /// </summary>
        [Input("s3BucketName")]
        public Input<string>? S3BucketName { get; set; }

        /// <summary>
        /// Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
        /// </summary>
        [Input("s3Prefix")]
        public Input<string>? S3Prefix { get; set; }

        /// <summary>
        /// Time that the snapshot was created.
        /// </summary>
        [Input("snapshotTime")]
        public Input<string>? SnapshotTime { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the snapshot to export.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("sourceArn")]
        public Input<string>? SourceArn { get; set; }

        /// <summary>
        /// Type of source for the export.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// Status of the export task.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Time that the snapshot export task completed.
        /// </summary>
        [Input("taskEndTime")]
        public Input<string>? TaskEndTime { get; set; }

        /// <summary>
        /// Time that the snapshot export task started.
        /// </summary>
        [Input("taskStartTime")]
        public Input<string>? TaskStartTime { get; set; }

        [Input("timeouts")]
        public Input<Inputs.ExportTaskTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Warning about the snapshot export task, if any.
        /// </summary>
        [Input("warningMessage")]
        public Input<string>? WarningMessage { get; set; }

        public ExportTaskState()
        {
        }
        public static new ExportTaskState Empty => new ExportTaskState();
    }
}
