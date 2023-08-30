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
    /// Resource for managing an Amazon Inspector Delegated Admin Account.
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
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var example = new Aws.Inspector2.DelegatedAdminAccount("example", new()
    ///     {
    ///         AccountId = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Inspector Delegated Admin Account using the `account_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount example 012345678901
    /// ```
    /// </summary>
    [AwsResourceType("aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount")]
    public partial class DelegatedAdminAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account to enable as delegated admin account.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Status of this delegated admin account.
        /// </summary>
        [Output("relationshipStatus")]
        public Output<string> RelationshipStatus { get; private set; } = null!;


        /// <summary>
        /// Create a DelegatedAdminAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DelegatedAdminAccount(string name, DelegatedAdminAccountArgs args, CustomResourceOptions? options = null)
            : base("aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount", name, args ?? new DelegatedAdminAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DelegatedAdminAccount(string name, Input<string> id, DelegatedAdminAccountState? state = null, CustomResourceOptions? options = null)
            : base("aws:inspector2/delegatedAdminAccount:DelegatedAdminAccount", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DelegatedAdminAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DelegatedAdminAccount Get(string name, Input<string> id, DelegatedAdminAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new DelegatedAdminAccount(name, id, state, options);
        }
    }

    public sealed class DelegatedAdminAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account to enable as delegated admin account.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        public DelegatedAdminAccountArgs()
        {
        }
        public static new DelegatedAdminAccountArgs Empty => new DelegatedAdminAccountArgs();
    }

    public sealed class DelegatedAdminAccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account to enable as delegated admin account.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Status of this delegated admin account.
        /// </summary>
        [Input("relationshipStatus")]
        public Input<string>? RelationshipStatus { get; set; }

        public DelegatedAdminAccountState()
        {
        }
        public static new DelegatedAdminAccountState Empty => new DelegatedAdminAccountState();
    }
}
