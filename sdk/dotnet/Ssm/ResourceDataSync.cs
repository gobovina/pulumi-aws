// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    /// <summary>
    /// Provides a SSM resource data sync.
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
    ///     var hogeBucketV2 = new Aws.S3.BucketV2("hoge", new()
    ///     {
    ///         Bucket = "tf-test-bucket-1234",
    ///     });
    /// 
    ///     var hoge = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "SSMBucketPermissionsCheck",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "ssm.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:GetBucketAcl",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:s3:::tf-test-bucket-1234",
    ///                 },
    ///             },
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "SSMBucketDelivery",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "ssm.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:PutObject",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "arn:aws:s3:::tf-test-bucket-1234/*",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "StringEquals",
    ///                         Variable = "s3:x-amz-acl",
    ///                         Values = new[]
    ///                         {
    ///                             "bucket-owner-full-control",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var hogeBucketPolicy = new Aws.S3.BucketPolicy("hoge", new()
    ///     {
    ///         Bucket = hogeBucketV2.Id,
    ///         Policy = hoge.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var foo = new Aws.Ssm.ResourceDataSync("foo", new()
    ///     {
    ///         Name = "foo",
    ///         S3Destination = new Aws.Ssm.Inputs.ResourceDataSyncS3DestinationArgs
    ///         {
    ///             BucketName = hogeBucketV2.Bucket,
    ///             Region = hogeBucketV2.Region,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SSM resource data sync using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssm/resourceDataSync:ResourceDataSync example example-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssm/resourceDataSync:ResourceDataSync")]
    public partial class ResourceDataSync : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name for the configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Amazon S3 configuration details for the sync.
        /// </summary>
        [Output("s3Destination")]
        public Output<Outputs.ResourceDataSyncS3Destination> S3Destination { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceDataSync resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceDataSync(string name, ResourceDataSyncArgs args, CustomResourceOptions? options = null)
            : base("aws:ssm/resourceDataSync:ResourceDataSync", name, args ?? new ResourceDataSyncArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceDataSync(string name, Input<string> id, ResourceDataSyncState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssm/resourceDataSync:ResourceDataSync", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceDataSync Get(string name, Input<string> id, ResourceDataSyncState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceDataSync(name, id, state, options);
        }
    }

    public sealed class ResourceDataSyncArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name for the configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Amazon S3 configuration details for the sync.
        /// </summary>
        [Input("s3Destination", required: true)]
        public Input<Inputs.ResourceDataSyncS3DestinationArgs> S3Destination { get; set; } = null!;

        public ResourceDataSyncArgs()
        {
        }
        public static new ResourceDataSyncArgs Empty => new ResourceDataSyncArgs();
    }

    public sealed class ResourceDataSyncState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name for the configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Amazon S3 configuration details for the sync.
        /// </summary>
        [Input("s3Destination")]
        public Input<Inputs.ResourceDataSyncS3DestinationGetArgs>? S3Destination { get; set; }

        public ResourceDataSyncState()
        {
        }
        public static new ResourceDataSyncState Empty => new ResourceDataSyncState();
    }
}
