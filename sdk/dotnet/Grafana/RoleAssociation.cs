// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Grafana
{
    /// <summary>
    /// Provides an Amazon Managed Grafana workspace role association resource.
    /// 
    /// ## Example Usage
    /// ### Basic configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var assume = new Aws.Iam.Role("assume", new()
    ///     {
    ///         Name = "grafana-assume",
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["version"] = "2012-10-17",
    ///             ["statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["action"] = "sts:AssumeRole",
    ///                     ["effect"] = "Allow",
    ///                     ["sid"] = "",
    ///                     ["principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["service"] = "grafana.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var exampleWorkspace = new Aws.Grafana.Workspace("example", new()
    ///     {
    ///         AccountAccessType = "CURRENT_ACCOUNT",
    ///         AuthenticationProviders = new[]
    ///         {
    ///             "SAML",
    ///         },
    ///         PermissionType = "SERVICE_MANAGED",
    ///         RoleArn = assume.Arn,
    ///     });
    /// 
    ///     var example = new Aws.Grafana.RoleAssociation("example", new()
    ///     {
    ///         Role = "ADMIN",
    ///         UserIds = new[]
    ///         {
    ///             "USER_ID_1",
    ///             "USER_ID_2",
    ///         },
    ///         WorkspaceId = exampleWorkspace.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:grafana/roleAssociation:RoleAssociation")]
    public partial class RoleAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AWS SSO group ids to be assigned the role given in `role`.
        /// </summary>
        [Output("groupIds")]
        public Output<ImmutableArray<string>> GroupIds { get; private set; } = null!;

        /// <summary>
        /// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// The AWS SSO user ids to be assigned the role given in `role`.
        /// </summary>
        [Output("userIds")]
        public Output<ImmutableArray<string>> UserIds { get; private set; } = null!;

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a RoleAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleAssociation(string name, RoleAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:grafana/roleAssociation:RoleAssociation", name, args ?? new RoleAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleAssociation(string name, Input<string> id, RoleAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:grafana/roleAssociation:RoleAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleAssociation Get(string name, Input<string> id, RoleAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleAssociation(name, id, state, options);
        }
    }

    public sealed class RoleAssociationArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupIds")]
        private InputList<string>? _groupIds;

        /// <summary>
        /// The AWS SSO group ids to be assigned the role given in `role`.
        /// </summary>
        public InputList<string> GroupIds
        {
            get => _groupIds ?? (_groupIds = new InputList<string>());
            set => _groupIds = value;
        }

        /// <summary>
        /// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        [Input("userIds")]
        private InputList<string>? _userIds;

        /// <summary>
        /// The AWS SSO user ids to be assigned the role given in `role`.
        /// </summary>
        public InputList<string> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<string>());
            set => _userIds = value;
        }

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public RoleAssociationArgs()
        {
        }
        public static new RoleAssociationArgs Empty => new RoleAssociationArgs();
    }

    public sealed class RoleAssociationState : global::Pulumi.ResourceArgs
    {
        [Input("groupIds")]
        private InputList<string>? _groupIds;

        /// <summary>
        /// The AWS SSO group ids to be assigned the role given in `role`.
        /// </summary>
        public InputList<string> GroupIds
        {
            get => _groupIds ?? (_groupIds = new InputList<string>());
            set => _groupIds = value;
        }

        /// <summary>
        /// The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("userIds")]
        private InputList<string>? _userIds;

        /// <summary>
        /// The AWS SSO user ids to be assigned the role given in `role`.
        /// </summary>
        public InputList<string> UserIds
        {
            get => _userIds ?? (_userIds = new InputList<string>());
            set => _userIds = value;
        }

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public RoleAssociationState()
        {
        }
        public static new RoleAssociationState Empty => new RoleAssociationState();
    }
}
