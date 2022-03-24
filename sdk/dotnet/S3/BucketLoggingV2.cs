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
    /// Provides an S3 bucket (server access) logging resource. For more information, see [Logging requests using server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)
    /// in the AWS S3 User Guide.
    /// 
    /// &gt; **Note:** Amazon S3 supports server access logging, AWS CloudTrail, or a combination of both. Refer to the [Logging options for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/logging-with-S3.html)
    /// to decide which method meets your requirements.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var exampleBucketAclV2 = new Aws.S3.BucketAclV2("exampleBucketAclV2", new Aws.S3.BucketAclV2Args
    ///         {
    ///             Bucket = exampleBucketV2.Id,
    ///             Acl = "private",
    ///         });
    ///         var logBucket = new Aws.S3.BucketV2("logBucket", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var logBucketAcl = new Aws.S3.BucketAclV2("logBucketAcl", new Aws.S3.BucketAclV2Args
    ///         {
    ///             Bucket = logBucket.Id,
    ///             Acl = "log-delivery-write",
    ///         });
    ///         var exampleBucketLoggingV2 = new Aws.S3.BucketLoggingV2("exampleBucketLoggingV2", new Aws.S3.BucketLoggingV2Args
    ///         {
    ///             Bucket = exampleBucketV2.Id,
    ///             TargetBucket = logBucket.Id,
    ///             TargetPrefix = "log/",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// S3 bucket logging can be imported in one of two ways. If the owner (account ID) of the source bucket is the same account used to configure the Terraform AWS Provider, the S3 bucket logging resource should be imported using the `bucket` e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketLoggingV2:BucketLoggingV2 example bucket-name
    /// ```
    /// 
    ///  If the owner (account ID) of the source bucket differs from the account used to configure the Terraform AWS Provider, the S3 bucket logging resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketLoggingV2:BucketLoggingV2 example bucket-name,123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketLoggingV2:BucketLoggingV2")]
    public partial class BucketLoggingV2 : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The account ID of the expected bucket owner.
        /// </summary>
        [Output("expectedBucketOwner")]
        public Output<string?> ExpectedBucketOwner { get; private set; } = null!;

        /// <summary>
        /// The name of the bucket where you want Amazon S3 to store server access logs.
        /// </summary>
        [Output("targetBucket")]
        public Output<string> TargetBucket { get; private set; } = null!;

        /// <summary>
        /// Set of configuration blocks with information for granting permissions documented below.
        /// </summary>
        [Output("targetGrants")]
        public Output<ImmutableArray<Outputs.BucketLoggingV2TargetGrant>> TargetGrants { get; private set; } = null!;

        /// <summary>
        /// A prefix for all log object keys.
        /// </summary>
        [Output("targetPrefix")]
        public Output<string> TargetPrefix { get; private set; } = null!;


        /// <summary>
        /// Create a BucketLoggingV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketLoggingV2(string name, BucketLoggingV2Args args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketLoggingV2:BucketLoggingV2", name, args ?? new BucketLoggingV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private BucketLoggingV2(string name, Input<string> id, BucketLoggingV2State? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketLoggingV2:BucketLoggingV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketLoggingV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketLoggingV2 Get(string name, Input<string> id, BucketLoggingV2State? state = null, CustomResourceOptions? options = null)
        {
            return new BucketLoggingV2(name, id, state, options);
        }
    }

    public sealed class BucketLoggingV2Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        /// <summary>
        /// The name of the bucket where you want Amazon S3 to store server access logs.
        /// </summary>
        [Input("targetBucket", required: true)]
        public Input<string> TargetBucket { get; set; } = null!;

        [Input("targetGrants")]
        private InputList<Inputs.BucketLoggingV2TargetGrantArgs>? _targetGrants;

        /// <summary>
        /// Set of configuration blocks with information for granting permissions documented below.
        /// </summary>
        public InputList<Inputs.BucketLoggingV2TargetGrantArgs> TargetGrants
        {
            get => _targetGrants ?? (_targetGrants = new InputList<Inputs.BucketLoggingV2TargetGrantArgs>());
            set => _targetGrants = value;
        }

        /// <summary>
        /// A prefix for all log object keys.
        /// </summary>
        [Input("targetPrefix", required: true)]
        public Input<string> TargetPrefix { get; set; } = null!;

        public BucketLoggingV2Args()
        {
        }
    }

    public sealed class BucketLoggingV2State : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        /// <summary>
        /// The name of the bucket where you want Amazon S3 to store server access logs.
        /// </summary>
        [Input("targetBucket")]
        public Input<string>? TargetBucket { get; set; }

        [Input("targetGrants")]
        private InputList<Inputs.BucketLoggingV2TargetGrantGetArgs>? _targetGrants;

        /// <summary>
        /// Set of configuration blocks with information for granting permissions documented below.
        /// </summary>
        public InputList<Inputs.BucketLoggingV2TargetGrantGetArgs> TargetGrants
        {
            get => _targetGrants ?? (_targetGrants = new InputList<Inputs.BucketLoggingV2TargetGrantGetArgs>());
            set => _targetGrants = value;
        }

        /// <summary>
        /// A prefix for all log object keys.
        /// </summary>
        [Input("targetPrefix")]
        public Input<string>? TargetPrefix { get; set; }

        public BucketLoggingV2State()
        {
        }
    }
}
