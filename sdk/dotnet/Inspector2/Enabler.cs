// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Inspector2
{
    /// <summary>
    /// Resource for enabling Amazon Inspector resource scans.
    /// 
    /// This resource must be created in the Organization's Administrator Account.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var example = new Aws.Inspector2.Enabler("example", new()
    ///     {
    ///         AccountIds = new[]
    ///         {
    ///             "123456789012",
    ///         },
    ///         ResourceTypes = new[]
    ///         {
    ///             "EC2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### For the Calling Account
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
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var test = new Aws.Inspector2.Enabler("test", new()
    ///     {
    ///         AccountIds = new[]
    ///         {
    ///             current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///         },
    ///         ResourceTypes = new[]
    ///         {
    ///             "ECR",
    ///             "EC2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:inspector2/enabler:Enabler")]
    public partial class Enabler : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set of account IDs.
        /// Can contain one of: the Organization's Administrator Account, or one or more Member Accounts.
        /// </summary>
        [Output("accountIds")]
        public Output<ImmutableArray<string>> AccountIds { get; private set; } = null!;

        /// <summary>
        /// Type of resources to scan.
        /// Valid values are `EC2`, `ECR`, `LAMBDA` and `LAMBDA_CODE`.
        /// At least one item is required.
        /// </summary>
        [Output("resourceTypes")]
        public Output<ImmutableArray<string>> ResourceTypes { get; private set; } = null!;


        /// <summary>
        /// Create a Enabler resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Enabler(string name, EnablerArgs args, CustomResourceOptions? options = null)
            : base("aws:inspector2/enabler:Enabler", name, args ?? new EnablerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Enabler(string name, Input<string> id, EnablerState? state = null, CustomResourceOptions? options = null)
            : base("aws:inspector2/enabler:Enabler", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Enabler resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Enabler Get(string name, Input<string> id, EnablerState? state = null, CustomResourceOptions? options = null)
        {
            return new Enabler(name, id, state, options);
        }
    }

    public sealed class EnablerArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountIds", required: true)]
        private InputList<string>? _accountIds;

        /// <summary>
        /// Set of account IDs.
        /// Can contain one of: the Organization's Administrator Account, or one or more Member Accounts.
        /// </summary>
        public InputList<string> AccountIds
        {
            get => _accountIds ?? (_accountIds = new InputList<string>());
            set => _accountIds = value;
        }

        [Input("resourceTypes", required: true)]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// Type of resources to scan.
        /// Valid values are `EC2`, `ECR`, `LAMBDA` and `LAMBDA_CODE`.
        /// At least one item is required.
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        public EnablerArgs()
        {
        }
        public static new EnablerArgs Empty => new EnablerArgs();
    }

    public sealed class EnablerState : global::Pulumi.ResourceArgs
    {
        [Input("accountIds")]
        private InputList<string>? _accountIds;

        /// <summary>
        /// Set of account IDs.
        /// Can contain one of: the Organization's Administrator Account, or one or more Member Accounts.
        /// </summary>
        public InputList<string> AccountIds
        {
            get => _accountIds ?? (_accountIds = new InputList<string>());
            set => _accountIds = value;
        }

        [Input("resourceTypes")]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// Type of resources to scan.
        /// Valid values are `EC2`, `ECR`, `LAMBDA` and `LAMBDA_CODE`.
        /// At least one item is required.
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        public EnablerState()
        {
        }
        public static new EnablerState Empty => new EnablerState();
    }
}
