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
    /// Provides an independent configuration resource for S3 bucket [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
    /// 
    /// &gt; **NOTE:** S3 Buckets only support a single replication configuration. Declaring multiple `aws.s3.BucketReplicationConfig` resources to the same S3 Bucket will cause a perpetual difference in configuration.
    /// 
    /// ## Example Usage
    /// ### Using replication configuration
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var central = new Aws.Provider("central", new Aws.ProviderArgs
    ///         {
    ///             Region = "eu-central-1",
    ///         });
    ///         var replicationRole = new Aws.Iam.Role("replicationRole", new Aws.Iam.RoleArgs
    ///         {
    ///             AssumeRolePolicy = @"{
    ///   ""Version"": ""2012-10-17"",
    ///   ""Statement"": [
    ///     {
    ///       ""Action"": ""sts:AssumeRole"",
    ///       ""Principal"": {
    ///         ""Service"": ""s3.amazonaws.com""
    ///       },
    ///       ""Effect"": ""Allow"",
    ///       ""Sid"": """"
    ///     }
    ///   ]
    /// }
    /// ",
    ///         });
    ///         var destinationBucketV2 = new Aws.S3.BucketV2("destinationBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var sourceBucketV2 = new Aws.S3.BucketV2("sourceBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.Central,
    ///         });
    ///         var replicationPolicy = new Aws.Iam.Policy("replicationPolicy", new Aws.Iam.PolicyArgs
    ///         {
    ///             Policy = Output.Tuple(sourceBucketV2.Arn, sourceBucketV2.Arn, destinationBucketV2.Arn).Apply(values =&gt;
    ///             {
    ///                 var sourceBucketV2Arn = values.Item1;
    ///                 var sourceBucketV2Arn1 = values.Item2;
    ///                 var destinationBucketV2Arn = values.Item3;
    ///                 return @$"{{
    ///   ""Version"": ""2012-10-17"",
    ///   ""Statement"": [
    ///     {{
    ///       ""Action"": [
    ///         ""s3:GetReplicationConfiguration"",
    ///         ""s3:ListBucket""
    ///       ],
    ///       ""Effect"": ""Allow"",
    ///       ""Resource"": [
    ///         ""{sourceBucketV2Arn}""
    ///       ]
    ///     }},
    ///     {{
    ///       ""Action"": [
    ///         ""s3:GetObjectVersionForReplication"",
    ///         ""s3:GetObjectVersionAcl"",
    ///          ""s3:GetObjectVersionTagging""
    ///       ],
    ///       ""Effect"": ""Allow"",
    ///       ""Resource"": [
    ///         ""{sourceBucketV2Arn1}/*""
    ///       ]
    ///     }},
    ///     {{
    ///       ""Action"": [
    ///         ""s3:ReplicateObject"",
    ///         ""s3:ReplicateDelete"",
    ///         ""s3:ReplicateTags""
    ///       ],
    ///       ""Effect"": ""Allow"",
    ///       ""Resource"": ""{destinationBucketV2Arn}/*""
    ///     }}
    ///   ]
    /// }}
    /// ";
    ///             }),
    ///         });
    ///         var replicationRolePolicyAttachment = new Aws.Iam.RolePolicyAttachment("replicationRolePolicyAttachment", new Aws.Iam.RolePolicyAttachmentArgs
    ///         {
    ///             Role = replicationRole.Name,
    ///             PolicyArn = replicationPolicy.Arn,
    ///         });
    ///         var destinationBucketVersioningV2 = new Aws.S3.BucketVersioningV2("destinationBucketVersioningV2", new Aws.S3.BucketVersioningV2Args
    ///         {
    ///             Bucket = destinationBucketV2.Id,
    ///             VersioningConfiguration = new Aws.S3.Inputs.BucketVersioningV2VersioningConfigurationArgs
    ///             {
    ///                 Status = "Enabled",
    ///             },
    ///         });
    ///         var sourceBucketAcl = new Aws.S3.BucketAclV2("sourceBucketAcl", new Aws.S3.BucketAclV2Args
    ///         {
    ///             Bucket = sourceBucketV2.Id,
    ///             Acl = "private",
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.Central,
    ///         });
    ///         var sourceBucketVersioningV2 = new Aws.S3.BucketVersioningV2("sourceBucketVersioningV2", new Aws.S3.BucketVersioningV2Args
    ///         {
    ///             Bucket = sourceBucketV2.Id,
    ///             VersioningConfiguration = new Aws.S3.Inputs.BucketVersioningV2VersioningConfigurationArgs
    ///             {
    ///                 Status = "Enabled",
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.Central,
    ///         });
    ///         var replicationBucketReplicationConfig = new Aws.S3.BucketReplicationConfig("replicationBucketReplicationConfig", new Aws.S3.BucketReplicationConfigArgs
    ///         {
    ///             Role = replicationRole.Arn,
    ///             Bucket = sourceBucketV2.Id,
    ///             Rules = 
    ///             {
    ///                 new Aws.S3.Inputs.BucketReplicationConfigRuleArgs
    ///                 {
    ///                     Id = "foobar",
    ///                     Filter = new Aws.S3.Inputs.BucketReplicationConfigRuleFilterArgs
    ///                     {
    ///                         Prefix = "foo",
    ///                     },
    ///                     Status = "Enabled",
    ///                     Destination = new Aws.S3.Inputs.BucketReplicationConfigRuleDestinationArgs
    ///                     {
    ///                         Bucket = destinationBucketV2.Arn,
    ///                         StorageClass = "STANDARD",
    ///                     },
    ///                 },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.Central,
    ///             DependsOn = 
    ///             {
    ///                 sourceBucketVersioningV2,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Bi-Directional Replication
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // ... other configuration ...
    ///         var eastBucketV2 = new Aws.S3.BucketV2("eastBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var eastBucketVersioningV2 = new Aws.S3.BucketVersioningV2("eastBucketVersioningV2", new Aws.S3.BucketVersioningV2Args
    ///         {
    ///             Bucket = eastBucketV2.Id,
    ///             VersioningConfiguration = new Aws.S3.Inputs.BucketVersioningV2VersioningConfigurationArgs
    ///             {
    ///                 Status = "Enabled",
    ///             },
    ///         });
    ///         var westBucketV2 = new Aws.S3.BucketV2("westBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.West,
    ///         });
    ///         var westBucketVersioningV2 = new Aws.S3.BucketVersioningV2("westBucketVersioningV2", new Aws.S3.BucketVersioningV2Args
    ///         {
    ///             Bucket = westBucketV2.Id,
    ///             VersioningConfiguration = new Aws.S3.Inputs.BucketVersioningV2VersioningConfigurationArgs
    ///             {
    ///                 Status = "Enabled",
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.West,
    ///         });
    ///         var eastToWest = new Aws.S3.BucketReplicationConfig("eastToWest", new Aws.S3.BucketReplicationConfigArgs
    ///         {
    ///             Role = aws_iam_role.East_replication.Arn,
    ///             Bucket = eastBucketV2.Id,
    ///             Rules = 
    ///             {
    ///                 new Aws.S3.Inputs.BucketReplicationConfigRuleArgs
    ///                 {
    ///                     Id = "foobar",
    ///                     Filter = new Aws.S3.Inputs.BucketReplicationConfigRuleFilterArgs
    ///                     {
    ///                         Prefix = "foo",
    ///                     },
    ///                     Status = "Enabled",
    ///                     Destination = new Aws.S3.Inputs.BucketReplicationConfigRuleDestinationArgs
    ///                     {
    ///                         Bucket = westBucketV2.Arn,
    ///                         StorageClass = "STANDARD",
    ///                     },
    ///                 },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 eastBucketVersioningV2,
    ///             },
    ///         });
    ///         var westToEast = new Aws.S3.BucketReplicationConfig("westToEast", new Aws.S3.BucketReplicationConfigArgs
    ///         {
    ///             Role = aws_iam_role.West_replication.Arn,
    ///             Bucket = westBucketV2.Id,
    ///             Rules = 
    ///             {
    ///                 new Aws.S3.Inputs.BucketReplicationConfigRuleArgs
    ///                 {
    ///                     Id = "foobar",
    ///                     Filter = new Aws.S3.Inputs.BucketReplicationConfigRuleFilterArgs
    ///                     {
    ///                         Prefix = "foo",
    ///                     },
    ///                     Status = "Enabled",
    ///                     Destination = new Aws.S3.Inputs.BucketReplicationConfigRuleDestinationArgs
    ///                     {
    ///                         Bucket = eastBucketV2.Arn,
    ///                         StorageClass = "STANDARD",
    ///                     },
    ///                 },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = aws.West,
    ///             DependsOn = 
    ///             {
    ///                 westBucketVersioningV2,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// S3 bucket replication configuration can be imported using the `bucket`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketReplicationConfig:BucketReplicationConfig replication bucket-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketReplicationConfig:BucketReplicationConfig")]
    public partial class BucketReplicationConfig : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the source S3 bucket you want Amazon S3 to monitor.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// List of configuration blocks describing the rules managing the replication documented below.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.BucketReplicationConfigRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// A token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
        /// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a BucketReplicationConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketReplicationConfig(string name, BucketReplicationConfigArgs args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, args ?? new BucketReplicationConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BucketReplicationConfig(string name, Input<string> id, BucketReplicationConfigState? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketReplicationConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketReplicationConfig Get(string name, Input<string> id, BucketReplicationConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new BucketReplicationConfig(name, id, state, options);
        }
    }

    public sealed class BucketReplicationConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the source S3 bucket you want Amazon S3 to monitor.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        [Input("rules", required: true)]
        private InputList<Inputs.BucketReplicationConfigRuleArgs>? _rules;

        /// <summary>
        /// List of configuration blocks describing the rules managing the replication documented below.
        /// </summary>
        public InputList<Inputs.BucketReplicationConfigRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.BucketReplicationConfigRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// A token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
        /// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public BucketReplicationConfigArgs()
        {
        }
    }

    public sealed class BucketReplicationConfigState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the source S3 bucket you want Amazon S3 to monitor.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("rules")]
        private InputList<Inputs.BucketReplicationConfigRuleGetArgs>? _rules;

        /// <summary>
        /// List of configuration blocks describing the rules managing the replication documented below.
        /// </summary>
        public InputList<Inputs.BucketReplicationConfigRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.BucketReplicationConfigRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// A token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket's "Object Lock token".
        /// For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public BucketReplicationConfigState()
        {
        }
    }
}
