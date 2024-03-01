// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue
{
    /// <summary>
    /// Provides a Glue resource policy. Only one can exist per region.
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
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var currentGetPartition = Aws.GetPartition.Invoke();
    /// 
    ///     var currentGetRegion = Aws.GetRegion.Invoke();
    /// 
    ///     var glue_example_policy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "glue:CreateTable",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     $"arn:{currentGetPartition.Apply(getPartitionResult =&gt; getPartitionResult.Partition)}:glue:{currentGetRegion.Apply(getRegionResult =&gt; getRegionResult.Name)}:{current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId)}:*",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Identifiers = new[]
    ///                         {
    ///                             "*",
    ///                         },
    ///                         Type = "AWS",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = new Aws.Glue.ResourcePolicy("example", new()
    ///     {
    ///         Policy = glue_example_policy.Apply(glue_example_policy =&gt; glue_example_policy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json)),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Glue Resource Policy using the account ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:glue/resourcePolicy:ResourcePolicy Test 12356789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:glue/resourcePolicy:ResourcePolicy")]
    public partial class ResourcePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates that you are using both methods to grant cross-account. Valid values are `TRUE` and `FALSE`. Note the provider will not perform drift detetction on this field as its not return on read.
        /// </summary>
        [Output("enableHybrid")]
        public Output<string?> EnableHybrid { get; private set; } = null!;

        /// <summary>
        /// The policy to be applied to the aws glue data catalog.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;


        /// <summary>
        /// Create a ResourcePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourcePolicy(string name, ResourcePolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:glue/resourcePolicy:ResourcePolicy", name, args ?? new ResourcePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourcePolicy(string name, Input<string> id, ResourcePolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:glue/resourcePolicy:ResourcePolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourcePolicy Get(string name, Input<string> id, ResourcePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourcePolicy(name, id, state, options);
        }
    }

    public sealed class ResourcePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that you are using both methods to grant cross-account. Valid values are `TRUE` and `FALSE`. Note the provider will not perform drift detetction on this field as its not return on read.
        /// </summary>
        [Input("enableHybrid")]
        public Input<string>? EnableHybrid { get; set; }

        /// <summary>
        /// The policy to be applied to the aws glue data catalog.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        public ResourcePolicyArgs()
        {
        }
        public static new ResourcePolicyArgs Empty => new ResourcePolicyArgs();
    }

    public sealed class ResourcePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that you are using both methods to grant cross-account. Valid values are `TRUE` and `FALSE`. Note the provider will not perform drift detetction on this field as its not return on read.
        /// </summary>
        [Input("enableHybrid")]
        public Input<string>? EnableHybrid { get; set; }

        /// <summary>
        /// The policy to be applied to the aws glue data catalog.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public ResourcePolicyState()
        {
        }
        public static new ResourcePolicyState Empty => new ResourcePolicyState();
    }
}
