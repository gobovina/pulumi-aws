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
    /// ## Example Usage
    /// ### With ACL
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.S3.BucketV2("example", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var exampleBucketAcl = new Aws.S3.BucketAclV2("exampleBucketAcl", new Aws.S3.BucketAclV2Args
    ///         {
    ///             Bucket = example.Id,
    ///             Acl = "private",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### With Grants
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var current = Output.Create(Aws.S3.GetCanonicalUserId.InvokeAsync());
    ///         var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2", new Aws.S3.BucketV2Args
    ///         {
    ///         });
    ///         var exampleBucketAclV2 = new Aws.S3.BucketAclV2("exampleBucketAclV2", new Aws.S3.BucketAclV2Args
    ///         {
    ///             Bucket = exampleBucketV2.Id,
    ///             AccessControlPolicy = new Aws.S3.Inputs.BucketAclV2AccessControlPolicyArgs
    ///             {
    ///                 Grants = 
    ///                 {
    ///                     new Aws.S3.Inputs.BucketAclV2AccessControlPolicyGrantArgs
    ///                     {
    ///                         Grantee = new Aws.S3.Inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs
    ///                         {
    ///                             Id = current.Apply(current =&gt; current.Id),
    ///                             Type = "CanonicalUser",
    ///                         },
    ///                         Permission = "READ",
    ///                     },
    ///                     new Aws.S3.Inputs.BucketAclV2AccessControlPolicyGrantArgs
    ///                     {
    ///                         Grantee = new Aws.S3.Inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs
    ///                         {
    ///                             Type = "Group",
    ///                             Uri = "http://acs.amazonaws.com/groups/s3/LogDelivery",
    ///                         },
    ///                         Permission = "READ_ACP",
    ///                     },
    ///                 },
    ///                 Owner = new Aws.S3.Inputs.BucketAclV2AccessControlPolicyOwnerArgs
    ///                 {
    ///                     Id = current.Apply(current =&gt; current.Id),
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// S3 bucket ACL can be imported in one of four ways. If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
    /// ```
    /// 
    ///  If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `acl` separated by a comma (`,`), e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
    /// ```
    /// 
    ///  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
    /// ```
    /// 
    ///  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`), e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
    /// ```
    /// 
    ///  [1]https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl
    /// </summary>
    [AwsResourceType("aws:s3/bucketAclV2:BucketAclV2")]
    public partial class BucketAclV2 : Pulumi.CustomResource
    {
        /// <summary>
        /// A configuration block that sets the ACL permissions for an object per grantee documented below.
        /// </summary>
        [Output("accessControlPolicy")]
        public Output<Outputs.BucketAclV2AccessControlPolicy> AccessControlPolicy { get; private set; } = null!;

        /// <summary>
        /// The canned ACL to apply to the bucket.
        /// </summary>
        [Output("acl")]
        public Output<string?> Acl { get; private set; } = null!;

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
        /// Create a BucketAclV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketAclV2(string name, BucketAclV2Args args, CustomResourceOptions? options = null)
            : base("aws:s3/bucketAclV2:BucketAclV2", name, args ?? new BucketAclV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private BucketAclV2(string name, Input<string> id, BucketAclV2State? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketAclV2:BucketAclV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketAclV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketAclV2 Get(string name, Input<string> id, BucketAclV2State? state = null, CustomResourceOptions? options = null)
        {
            return new BucketAclV2(name, id, state, options);
        }
    }

    public sealed class BucketAclV2Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block that sets the ACL permissions for an object per grantee documented below.
        /// </summary>
        [Input("accessControlPolicy")]
        public Input<Inputs.BucketAclV2AccessControlPolicyArgs>? AccessControlPolicy { get; set; }

        /// <summary>
        /// The canned ACL to apply to the bucket.
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

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

        public BucketAclV2Args()
        {
        }
    }

    public sealed class BucketAclV2State : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block that sets the ACL permissions for an object per grantee documented below.
        /// </summary>
        [Input("accessControlPolicy")]
        public Input<Inputs.BucketAclV2AccessControlPolicyGetArgs>? AccessControlPolicy { get; set; }

        /// <summary>
        /// The canned ACL to apply to the bucket.
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

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

        public BucketAclV2State()
        {
        }
    }
}
