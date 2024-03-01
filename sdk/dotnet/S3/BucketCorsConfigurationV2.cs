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
    /// Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
    /// 
    /// &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfigurationV2` resources to the same S3 Bucket will cause a perpetual difference in configuration.
    /// 
    /// &gt; This resource cannot be used with S3 directory buckets.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "mybucket",
    ///     });
    /// 
    ///     var exampleBucketCorsConfigurationV2 = new Aws.S3.BucketCorsConfigurationV2("example", new()
    ///     {
    ///         Bucket = example.Id,
    ///         CorsRules = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketCorsConfigurationV2CorsRuleArgs
    ///             {
    ///                 AllowedHeaders = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///                 AllowedMethods = new[]
    ///                 {
    ///                     "PUT",
    ///                     "POST",
    ///                 },
    ///                 AllowedOrigins = new[]
    ///                 {
    ///                     "https://s3-website-test.domain.example",
    ///                 },
    ///                 ExposeHeaders = new[]
    ///                 {
    ///                     "ETag",
    ///                 },
    ///                 MaxAgeSeconds = 3000,
    ///             },
    ///             new Aws.S3.Inputs.BucketCorsConfigurationV2CorsRuleArgs
    ///             {
    ///                 AllowedMethods = new[]
    ///                 {
    ///                     "GET",
    ///                 },
    ///                 AllowedOrigins = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
    /// 
    /// __Using `pulumi import` to import__ S3 bucket CORS configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
    /// 
    /// If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name
    /// ```
    ///  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name,123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2")]
    public partial class BucketCorsConfigurationV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        [Output("corsRules")]
        public Output<ImmutableArray<Outputs.BucketCorsConfigurationV2CorsRule>> CorsRules { get; private set; } = null!;

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Output("expectedBucketOwner")]
        public Output<string?> ExpectedBucketOwner { get; private set; } = null!;


        /// <summary>
        /// Create a BucketCorsConfigurationV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketCorsConfigurationV2(string name, BucketCorsConfigurationV2Args args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, args ?? new BucketCorsConfigurationV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private BucketCorsConfigurationV2(string name, Input<string> id, BucketCorsConfigurationV2State? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketCorsConfigurationV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketCorsConfigurationV2 Get(string name, Input<string> id, BucketCorsConfigurationV2State? state = null, CustomResourceOptions? options = null)
        {
            return new BucketCorsConfigurationV2(name, id, state, options);
        }
    }

    public sealed class BucketCorsConfigurationV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("corsRules", required: true)]
        private InputList<Inputs.BucketCorsConfigurationV2CorsRuleArgs>? _corsRules;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        public InputList<Inputs.BucketCorsConfigurationV2CorsRuleArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.BucketCorsConfigurationV2CorsRuleArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        public BucketCorsConfigurationV2Args()
        {
        }
        public static new BucketCorsConfigurationV2Args Empty => new BucketCorsConfigurationV2Args();
    }

    public sealed class BucketCorsConfigurationV2State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        [Input("corsRules")]
        private InputList<Inputs.BucketCorsConfigurationV2CorsRuleGetArgs>? _corsRules;

        /// <summary>
        /// Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
        /// </summary>
        public InputList<Inputs.BucketCorsConfigurationV2CorsRuleGetArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.BucketCorsConfigurationV2CorsRuleGetArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        public BucketCorsConfigurationV2State()
        {
        }
        public static new BucketCorsConfigurationV2State Empty => new BucketCorsConfigurationV2State();
    }
}
