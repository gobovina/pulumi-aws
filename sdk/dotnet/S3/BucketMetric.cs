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
    /// Provides a S3 bucket [metrics configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html) resource.
    /// 
    /// &gt; This resource cannot be used with S3 directory buckets.
    /// 
    /// ## Example Usage
    /// 
    /// ### Add metrics configuration for entire S3 bucket
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
    ///     var example = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "example",
    ///     });
    /// 
    ///     var example_entire_bucket = new Aws.S3.BucketMetric("example-entire-bucket", new()
    ///     {
    ///         Bucket = example.Id,
    ///         Name = "EntireBucket",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Add metrics configuration with S3 object filter
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
    ///     var example = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "example",
    ///     });
    /// 
    ///     var example_filtered = new Aws.S3.BucketMetric("example-filtered", new()
    ///     {
    ///         Bucket = example.Id,
    ///         Name = "ImportantBlueDocuments",
    ///         Filter = new Aws.S3.Inputs.BucketMetricFilterArgs
    ///         {
    ///             Prefix = "documents/",
    ///             Tags = 
    ///             {
    ///                 { "priority", "high" },
    ///                 { "class", "blue" },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Add metrics configuration with S3 object filter for S3 Access Point
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
    ///     var example = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "example",
    ///     });
    /// 
    ///     var example_access_point = new Aws.S3.AccessPoint("example-access-point", new()
    ///     {
    ///         Bucket = example.Id,
    ///         Name = "example-access-point",
    ///     });
    /// 
    ///     var example_filtered = new Aws.S3.BucketMetric("example-filtered", new()
    ///     {
    ///         Bucket = example.Id,
    ///         Name = "ImportantBlueDocuments",
    ///         Filter = new Aws.S3.Inputs.BucketMetricFilterArgs
    ///         {
    ///             AccessPoint = example_access_point.Arn,
    ///             Tags = 
    ///             {
    ///                 { "priority", "high" },
    ///                 { "class", "blue" },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import S3 bucket metric configurations using `bucket:metric`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:s3/bucketMetric:BucketMetric my-bucket-entire-bucket my-bucket:EntireBucket
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketMetric:BucketMetric")]
    public partial class BucketMetric : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the bucket to put metric configuration.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
        /// </summary>
        [Output("filter")]
        public Output<Outputs.BucketMetricFilter?> Filter { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a BucketMetric resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketMetric(string name, BucketMetricArgs args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketMetric:BucketMetric", name, args ?? new BucketMetricArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BucketMetric(string name, Input<string> id, BucketMetricState? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketMetric:BucketMetric", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketMetric resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketMetric Get(string name, Input<string> id, BucketMetricState? state = null, CustomResourceOptions? options = null)
        {
            return new BucketMetric(name, id, state, options);
        }
    }

    public sealed class BucketMetricArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket to put metric configuration.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
        /// </summary>
        [Input("filter")]
        public Input<Inputs.BucketMetricFilterArgs>? Filter { get; set; }

        /// <summary>
        /// Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public BucketMetricArgs()
        {
        }
        public static new BucketMetricArgs Empty => new BucketMetricArgs();
    }

    public sealed class BucketMetricState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket to put metric configuration.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
        /// </summary>
        [Input("filter")]
        public Input<Inputs.BucketMetricFilterGetArgs>? Filter { get; set; }

        /// <summary>
        /// Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public BucketMetricState()
        {
        }
        public static new BucketMetricState Empty => new BucketMetricState();
    }
}
