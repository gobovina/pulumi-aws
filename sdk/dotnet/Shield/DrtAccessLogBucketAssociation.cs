// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Shield
{
    /// <summary>
    /// Resource for managing an AWS Shield DRT Access Log Bucket Association. Up to 10 log buckets can be associated for DRT Access sharing with the Shield Response Team (SRT).
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
    ///     var test = new Aws.Shield.DrtAccessRoleArnAssociation("test", new()
    ///     {
    ///         RoleArn = $"arn:aws:iam:{current.Name}:{currentAwsCallerIdentity.AccountId}:{shieldDrtAccessRoleName}",
    ///     });
    /// 
    ///     var testDrtAccessLogBucketAssociation = new Aws.Shield.DrtAccessLogBucketAssociation("test", new()
    ///     {
    ///         LogBucket = shieldDrtAccessLogBucket,
    ///         RoleArnAssociationId = test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation")]
    public partial class DrtAccessLogBucketAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon S3 bucket that contains the logs that you want to share.
        /// </summary>
        [Output("logBucket")]
        public Output<string> LogBucket { get; private set; } = null!;

        /// <summary>
        /// The ID of the Role Arn association used for allowing Shield DRT Access.
        /// </summary>
        [Output("roleArnAssociationId")]
        public Output<string> RoleArnAssociationId { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.DrtAccessLogBucketAssociationTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a DrtAccessLogBucketAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DrtAccessLogBucketAssociation(string name, DrtAccessLogBucketAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation", name, args ?? new DrtAccessLogBucketAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DrtAccessLogBucketAssociation(string name, Input<string> id, DrtAccessLogBucketAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DrtAccessLogBucketAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DrtAccessLogBucketAssociation Get(string name, Input<string> id, DrtAccessLogBucketAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new DrtAccessLogBucketAssociation(name, id, state, options);
        }
    }

    public sealed class DrtAccessLogBucketAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon S3 bucket that contains the logs that you want to share.
        /// </summary>
        [Input("logBucket", required: true)]
        public Input<string> LogBucket { get; set; } = null!;

        /// <summary>
        /// The ID of the Role Arn association used for allowing Shield DRT Access.
        /// </summary>
        [Input("roleArnAssociationId", required: true)]
        public Input<string> RoleArnAssociationId { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.DrtAccessLogBucketAssociationTimeoutsArgs>? Timeouts { get; set; }

        public DrtAccessLogBucketAssociationArgs()
        {
        }
        public static new DrtAccessLogBucketAssociationArgs Empty => new DrtAccessLogBucketAssociationArgs();
    }

    public sealed class DrtAccessLogBucketAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon S3 bucket that contains the logs that you want to share.
        /// </summary>
        [Input("logBucket")]
        public Input<string>? LogBucket { get; set; }

        /// <summary>
        /// The ID of the Role Arn association used for allowing Shield DRT Access.
        /// </summary>
        [Input("roleArnAssociationId")]
        public Input<string>? RoleArnAssociationId { get; set; }

        [Input("timeouts")]
        public Input<Inputs.DrtAccessLogBucketAssociationTimeoutsGetArgs>? Timeouts { get; set; }

        public DrtAccessLogBucketAssociationState()
        {
        }
        public static new DrtAccessLogBucketAssociationState Empty => new DrtAccessLogBucketAssociationState();
    }
}
