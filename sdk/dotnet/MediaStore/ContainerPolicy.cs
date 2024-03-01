// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaStore
{
    /// <summary>
    /// Provides a MediaStore Container Policy.
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
    ///     var current = Aws.GetRegion.Invoke();
    /// 
    ///     var currentGetCallerIdentity = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var exampleContainer = new Aws.MediaStore.Container("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var example = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "MediaStoreFullAccess",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "AWS",
    ///                         Identifiers = new[]
    ///                         {
    ///                             $"arn:aws:iam::{currentGetCallerIdentity.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId)}:root",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "mediastore:*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     $"arn:aws:mediastore:{current.Apply(getRegionResult =&gt; getRegionResult.Name)}:{currentGetCallerIdentity.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId)}:container/{exampleContainer.Name}/*",
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "Bool",
    ///                         Variable = "aws:SecureTransport",
    ///                         Values = new[]
    ///                         {
    ///                             "true",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleContainerPolicy = new Aws.MediaStore.ContainerPolicy("example", new()
    ///     {
    ///         ContainerName = exampleContainer.Name,
    ///         Policy = example.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import MediaStore Container Policy using the MediaStore Container Name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:mediastore/containerPolicy:ContainerPolicy example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:mediastore/containerPolicy:ContainerPolicy")]
    public partial class ContainerPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the container.
        /// </summary>
        [Output("containerName")]
        public Output<string> ContainerName { get; private set; } = null!;

        /// <summary>
        /// The contents of the policy.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerPolicy(string name, ContainerPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:mediastore/containerPolicy:ContainerPolicy", name, args ?? new ContainerPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerPolicy(string name, Input<string> id, ContainerPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:mediastore/containerPolicy:ContainerPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerPolicy Get(string name, Input<string> id, ContainerPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerPolicy(name, id, state, options);
        }
    }

    public sealed class ContainerPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the container.
        /// </summary>
        [Input("containerName", required: true)]
        public Input<string> ContainerName { get; set; } = null!;

        /// <summary>
        /// The contents of the policy.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        public ContainerPolicyArgs()
        {
        }
        public static new ContainerPolicyArgs Empty => new ContainerPolicyArgs();
    }

    public sealed class ContainerPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the container.
        /// </summary>
        [Input("containerName")]
        public Input<string>? ContainerName { get; set; }

        /// <summary>
        /// The contents of the policy.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public ContainerPolicyState()
        {
        }
        public static new ContainerPolicyState Empty => new ContainerPolicyState();
    }
}
