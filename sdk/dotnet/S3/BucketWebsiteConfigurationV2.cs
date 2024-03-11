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
    /// Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
    /// 
    /// &gt; This resource cannot be used with S3 directory buckets.
    /// 
    /// ## Example Usage
    /// 
    /// ### With `routing_rule` configured
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
    ///     var example = new Aws.S3.BucketWebsiteConfigurationV2("example", new()
    ///     {
    ///         Bucket = exampleAwsS3Bucket.Id,
    ///         IndexDocument = new Aws.S3.Inputs.BucketWebsiteConfigurationV2IndexDocumentArgs
    ///         {
    ///             Suffix = "index.html",
    ///         },
    ///         ErrorDocument = new Aws.S3.Inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs
    ///         {
    ///             Key = "error.html",
    ///         },
    ///         RoutingRules = new[]
    ///         {
    ///             new Aws.S3.Inputs.BucketWebsiteConfigurationV2RoutingRuleArgs
    ///             {
    ///                 Condition = new Aws.S3.Inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs
    ///                 {
    ///                     KeyPrefixEquals = "docs/",
    ///                 },
    ///                 Redirect = new Aws.S3.Inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs
    ///                 {
    ///                     ReplaceKeyPrefixWith = "documents/",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### With `routing_rules` configured
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
    ///     var example = new Aws.S3.BucketWebsiteConfigurationV2("example", new()
    ///     {
    ///         Bucket = exampleAwsS3Bucket.Id,
    ///         IndexDocument = new Aws.S3.Inputs.BucketWebsiteConfigurationV2IndexDocumentArgs
    ///         {
    ///             Suffix = "index.html",
    ///         },
    ///         ErrorDocument = new Aws.S3.Inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs
    ///         {
    ///             Key = "error.html",
    ///         },
    ///         RoutingRuleDetails = @"[{
    ///     ""Condition"": {
    ///         ""KeyPrefixEquals"": ""docs/""
    ///     },
    ///     ""Redirect"": {
    ///         ""ReplaceKeyPrefixWith"": """"
    ///     }
    /// }]
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
    /// 
    /// __Using `pulumi import` to import__ S3 bucket website configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
    /// 
    /// If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
    /// 
    /// ```sh
    /// $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name
    /// ```
    /// If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
    /// 
    /// ```sh
    /// $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name,123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2")]
    public partial class BucketWebsiteConfigurationV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Name of the error document for the website. See below.
        /// </summary>
        [Output("errorDocument")]
        public Output<Outputs.BucketWebsiteConfigurationV2ErrorDocument?> ErrorDocument { get; private set; } = null!;

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Output("expectedBucketOwner")]
        public Output<string?> ExpectedBucketOwner { get; private set; } = null!;

        /// <summary>
        /// Name of the index document for the website. See below.
        /// </summary>
        [Output("indexDocument")]
        public Output<Outputs.BucketWebsiteConfigurationV2IndexDocument?> IndexDocument { get; private set; } = null!;

        /// <summary>
        /// Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `error_document`, `index_document`, and `routing_rule`.
        /// </summary>
        [Output("redirectAllRequestsTo")]
        public Output<Outputs.BucketWebsiteConfigurationV2RedirectAllRequestsTo?> RedirectAllRequestsTo { get; private set; } = null!;

        /// <summary>
        /// JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
        /// describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
        /// </summary>
        [Output("routingRuleDetails")]
        public Output<string> RoutingRuleDetails { get; private set; } = null!;

        /// <summary>
        /// List of rules that define when a redirect is applied and the redirect behavior. See below.
        /// </summary>
        [Output("routingRules")]
        public Output<ImmutableArray<Outputs.BucketWebsiteConfigurationV2RoutingRule>> RoutingRules { get; private set; } = null!;

        /// <summary>
        /// Domain of the website endpoint. This is used to create Route 53 alias records.
        /// </summary>
        [Output("websiteDomain")]
        public Output<string> WebsiteDomain { get; private set; } = null!;

        /// <summary>
        /// Website endpoint.
        /// </summary>
        [Output("websiteEndpoint")]
        public Output<string> WebsiteEndpoint { get; private set; } = null!;


        /// <summary>
        /// Create a BucketWebsiteConfigurationV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketWebsiteConfigurationV2(string name, BucketWebsiteConfigurationV2Args args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2", name, args ?? new BucketWebsiteConfigurationV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private BucketWebsiteConfigurationV2(string name, Input<string> id, BucketWebsiteConfigurationV2State? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketWebsiteConfigurationV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketWebsiteConfigurationV2 Get(string name, Input<string> id, BucketWebsiteConfigurationV2State? state = null, CustomResourceOptions? options = null)
        {
            return new BucketWebsiteConfigurationV2(name, id, state, options);
        }
    }

    public sealed class BucketWebsiteConfigurationV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Name of the error document for the website. See below.
        /// </summary>
        [Input("errorDocument")]
        public Input<Inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs>? ErrorDocument { get; set; }

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        /// <summary>
        /// Name of the index document for the website. See below.
        /// </summary>
        [Input("indexDocument")]
        public Input<Inputs.BucketWebsiteConfigurationV2IndexDocumentArgs>? IndexDocument { get; set; }

        /// <summary>
        /// Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `error_document`, `index_document`, and `routing_rule`.
        /// </summary>
        [Input("redirectAllRequestsTo")]
        public Input<Inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs>? RedirectAllRequestsTo { get; set; }

        /// <summary>
        /// JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
        /// describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
        /// </summary>
        [Input("routingRuleDetails")]
        public Input<string>? RoutingRuleDetails { get; set; }

        [Input("routingRules")]
        private InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleArgs>? _routingRules;

        /// <summary>
        /// List of rules that define when a redirect is applied and the redirect behavior. See below.
        /// </summary>
        public InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleArgs> RoutingRules
        {
            get => _routingRules ?? (_routingRules = new InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleArgs>());
            set => _routingRules = value;
        }

        public BucketWebsiteConfigurationV2Args()
        {
        }
        public static new BucketWebsiteConfigurationV2Args Empty => new BucketWebsiteConfigurationV2Args();
    }

    public sealed class BucketWebsiteConfigurationV2State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Name of the error document for the website. See below.
        /// </summary>
        [Input("errorDocument")]
        public Input<Inputs.BucketWebsiteConfigurationV2ErrorDocumentGetArgs>? ErrorDocument { get; set; }

        /// <summary>
        /// Account ID of the expected bucket owner.
        /// </summary>
        [Input("expectedBucketOwner")]
        public Input<string>? ExpectedBucketOwner { get; set; }

        /// <summary>
        /// Name of the index document for the website. See below.
        /// </summary>
        [Input("indexDocument")]
        public Input<Inputs.BucketWebsiteConfigurationV2IndexDocumentGetArgs>? IndexDocument { get; set; }

        /// <summary>
        /// Redirect behavior for every request to this bucket's website endpoint. See below. Conflicts with `error_document`, `index_document`, and `routing_rule`.
        /// </summary>
        [Input("redirectAllRequestsTo")]
        public Input<Inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToGetArgs>? RedirectAllRequestsTo { get; set; }

        /// <summary>
        /// JSON array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
        /// describing redirect behavior and when redirects are applied. Use this parameter when your routing rules contain empty String values (`""`) as seen in the example above.
        /// </summary>
        [Input("routingRuleDetails")]
        public Input<string>? RoutingRuleDetails { get; set; }

        [Input("routingRules")]
        private InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleGetArgs>? _routingRules;

        /// <summary>
        /// List of rules that define when a redirect is applied and the redirect behavior. See below.
        /// </summary>
        public InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleGetArgs> RoutingRules
        {
            get => _routingRules ?? (_routingRules = new InputList<Inputs.BucketWebsiteConfigurationV2RoutingRuleGetArgs>());
            set => _routingRules = value;
        }

        /// <summary>
        /// Domain of the website endpoint. This is used to create Route 53 alias records.
        /// </summary>
        [Input("websiteDomain")]
        public Input<string>? WebsiteDomain { get; set; }

        /// <summary>
        /// Website endpoint.
        /// </summary>
        [Input("websiteEndpoint")]
        public Input<string>? WebsiteEndpoint { get; set; }

        public BucketWebsiteConfigurationV2State()
        {
        }
        public static new BucketWebsiteConfigurationV2State Empty => new BucketWebsiteConfigurationV2State();
    }
}
