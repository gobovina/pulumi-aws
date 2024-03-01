// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IdentityStore
{
    /// <summary>
    /// Resource for managing an AWS IdentityStore Group.
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
    /// 	
    /// object NotImplemented(string errorMessage) 
    /// {
    ///     throw new System.NotImplementedException(errorMessage);
    /// }
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Aws.IdentityStore.Group("this", new()
    ///     {
    ///         DisplayName = "Example group",
    ///         Description = "Example description",
    ///         IdentityStoreId = NotImplemented("tolist(data.aws_ssoadmin_instances.example.identity_store_ids)")[0],
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import an Identity Store Group using the combination `identity_store_id/group_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:identitystore/group:Group example d-9c6705e95c/b8a1c340-8031-7071-a2fb-7dc540320c30
    /// ```
    /// </summary>
    [AwsResourceType("aws:identitystore/group:Group")]
    public partial class Group : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A string containing the description of the group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A string containing the name of the group. This value is commonly displayed when the group is referenced.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// A list of external IDs that contains the identifiers issued to this resource by an external identity provider. See External IDs below.
        /// </summary>
        [Output("externalIds")]
        public Output<ImmutableArray<Outputs.GroupExternalId>> ExternalIds { get; private set; } = null!;

        /// <summary>
        /// The identifier of the newly created group in the identity store.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The globally unique identifier for the identity store.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("identityStoreId")]
        public Output<string> IdentityStoreId { get; private set; } = null!;


        /// <summary>
        /// Create a Group resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Group(string name, GroupArgs args, CustomResourceOptions? options = null)
            : base("aws:identitystore/group:Group", name, args ?? new GroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Group(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:identitystore/group:Group", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Group resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Group Get(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Group(name, id, state, options);
        }
    }

    public sealed class GroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A string containing the description of the group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A string containing the name of the group. This value is commonly displayed when the group is referenced.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The globally unique identifier for the identity store.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("identityStoreId", required: true)]
        public Input<string> IdentityStoreId { get; set; } = null!;

        public GroupArgs()
        {
        }
        public static new GroupArgs Empty => new GroupArgs();
    }

    public sealed class GroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A string containing the description of the group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A string containing the name of the group. This value is commonly displayed when the group is referenced.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("externalIds")]
        private InputList<Inputs.GroupExternalIdGetArgs>? _externalIds;

        /// <summary>
        /// A list of external IDs that contains the identifiers issued to this resource by an external identity provider. See External IDs below.
        /// </summary>
        public InputList<Inputs.GroupExternalIdGetArgs> ExternalIds
        {
            get => _externalIds ?? (_externalIds = new InputList<Inputs.GroupExternalIdGetArgs>());
            set => _externalIds = value;
        }

        /// <summary>
        /// The identifier of the newly created group in the identity store.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The globally unique identifier for the identity store.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("identityStoreId")]
        public Input<string>? IdentityStoreId { get; set; }

        public GroupState()
        {
        }
        public static new GroupState Empty => new GroupState();
    }
}
