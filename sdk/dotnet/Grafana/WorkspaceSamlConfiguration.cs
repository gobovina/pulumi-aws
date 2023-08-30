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
    /// Provides an Amazon Managed Grafana workspace SAML configuration resource.
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
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Version"] = "2012-10-17",
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Action"] = "sts:AssumeRole",
    ///                     ["Effect"] = "Allow",
    ///                     ["Sid"] = "",
    ///                     ["Principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Service"] = "grafana.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var exampleWorkspace = new Aws.Grafana.Workspace("exampleWorkspace", new()
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
    ///     var exampleWorkspaceSamlConfiguration = new Aws.Grafana.WorkspaceSamlConfiguration("exampleWorkspaceSamlConfiguration", new()
    ///     {
    ///         EditorRoleValues = new[]
    ///         {
    ///             "editor",
    ///         },
    ///         IdpMetadataUrl = "https://my_idp_metadata.url",
    ///         WorkspaceId = exampleWorkspace.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Grafana Workspace SAML configuration using the workspace's `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration example g-2054c75a02
    /// ```
    /// </summary>
    [AwsResourceType("aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration")]
    public partial class WorkspaceSamlConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The admin role values.
        /// </summary>
        [Output("adminRoleValues")]
        public Output<ImmutableArray<string>> AdminRoleValues { get; private set; } = null!;

        /// <summary>
        /// The allowed organizations.
        /// </summary>
        [Output("allowedOrganizations")]
        public Output<ImmutableArray<string>> AllowedOrganizations { get; private set; } = null!;

        /// <summary>
        /// The editor role values.
        /// </summary>
        [Output("editorRoleValues")]
        public Output<ImmutableArray<string>> EditorRoleValues { get; private set; } = null!;

        /// <summary>
        /// The email assertion.
        /// </summary>
        [Output("emailAssertion")]
        public Output<string> EmailAssertion { get; private set; } = null!;

        /// <summary>
        /// The groups assertion.
        /// </summary>
        [Output("groupsAssertion")]
        public Output<string?> GroupsAssertion { get; private set; } = null!;

        /// <summary>
        /// The IDP Metadata URL. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Output("idpMetadataUrl")]
        public Output<string?> IdpMetadataUrl { get; private set; } = null!;

        /// <summary>
        /// The IDP Metadata XML. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Output("idpMetadataXml")]
        public Output<string?> IdpMetadataXml { get; private set; } = null!;

        /// <summary>
        /// The login assertion.
        /// </summary>
        [Output("loginAssertion")]
        public Output<string> LoginAssertion { get; private set; } = null!;

        /// <summary>
        /// The login validity duration.
        /// </summary>
        [Output("loginValidityDuration")]
        public Output<int> LoginValidityDuration { get; private set; } = null!;

        /// <summary>
        /// The name assertion.
        /// </summary>
        [Output("nameAssertion")]
        public Output<string> NameAssertion { get; private set; } = null!;

        /// <summary>
        /// The org assertion.
        /// </summary>
        [Output("orgAssertion")]
        public Output<string?> OrgAssertion { get; private set; } = null!;

        /// <summary>
        /// The role assertion.
        /// </summary>
        [Output("roleAssertion")]
        public Output<string?> RoleAssertion { get; private set; } = null!;

        /// <summary>
        /// The status of the SAML configuration.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceSamlConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceSamlConfiguration(string name, WorkspaceSamlConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration", name, args ?? new WorkspaceSamlConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceSamlConfiguration(string name, Input<string> id, WorkspaceSamlConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkspaceSamlConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceSamlConfiguration Get(string name, Input<string> id, WorkspaceSamlConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceSamlConfiguration(name, id, state, options);
        }
    }

    public sealed class WorkspaceSamlConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminRoleValues")]
        private InputList<string>? _adminRoleValues;

        /// <summary>
        /// The admin role values.
        /// </summary>
        public InputList<string> AdminRoleValues
        {
            get => _adminRoleValues ?? (_adminRoleValues = new InputList<string>());
            set => _adminRoleValues = value;
        }

        [Input("allowedOrganizations")]
        private InputList<string>? _allowedOrganizations;

        /// <summary>
        /// The allowed organizations.
        /// </summary>
        public InputList<string> AllowedOrganizations
        {
            get => _allowedOrganizations ?? (_allowedOrganizations = new InputList<string>());
            set => _allowedOrganizations = value;
        }

        [Input("editorRoleValues", required: true)]
        private InputList<string>? _editorRoleValues;

        /// <summary>
        /// The editor role values.
        /// </summary>
        public InputList<string> EditorRoleValues
        {
            get => _editorRoleValues ?? (_editorRoleValues = new InputList<string>());
            set => _editorRoleValues = value;
        }

        /// <summary>
        /// The email assertion.
        /// </summary>
        [Input("emailAssertion")]
        public Input<string>? EmailAssertion { get; set; }

        /// <summary>
        /// The groups assertion.
        /// </summary>
        [Input("groupsAssertion")]
        public Input<string>? GroupsAssertion { get; set; }

        /// <summary>
        /// The IDP Metadata URL. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Input("idpMetadataUrl")]
        public Input<string>? IdpMetadataUrl { get; set; }

        /// <summary>
        /// The IDP Metadata XML. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Input("idpMetadataXml")]
        public Input<string>? IdpMetadataXml { get; set; }

        /// <summary>
        /// The login assertion.
        /// </summary>
        [Input("loginAssertion")]
        public Input<string>? LoginAssertion { get; set; }

        /// <summary>
        /// The login validity duration.
        /// </summary>
        [Input("loginValidityDuration")]
        public Input<int>? LoginValidityDuration { get; set; }

        /// <summary>
        /// The name assertion.
        /// </summary>
        [Input("nameAssertion")]
        public Input<string>? NameAssertion { get; set; }

        /// <summary>
        /// The org assertion.
        /// </summary>
        [Input("orgAssertion")]
        public Input<string>? OrgAssertion { get; set; }

        /// <summary>
        /// The role assertion.
        /// </summary>
        [Input("roleAssertion")]
        public Input<string>? RoleAssertion { get; set; }

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public WorkspaceSamlConfigurationArgs()
        {
        }
        public static new WorkspaceSamlConfigurationArgs Empty => new WorkspaceSamlConfigurationArgs();
    }

    public sealed class WorkspaceSamlConfigurationState : global::Pulumi.ResourceArgs
    {
        [Input("adminRoleValues")]
        private InputList<string>? _adminRoleValues;

        /// <summary>
        /// The admin role values.
        /// </summary>
        public InputList<string> AdminRoleValues
        {
            get => _adminRoleValues ?? (_adminRoleValues = new InputList<string>());
            set => _adminRoleValues = value;
        }

        [Input("allowedOrganizations")]
        private InputList<string>? _allowedOrganizations;

        /// <summary>
        /// The allowed organizations.
        /// </summary>
        public InputList<string> AllowedOrganizations
        {
            get => _allowedOrganizations ?? (_allowedOrganizations = new InputList<string>());
            set => _allowedOrganizations = value;
        }

        [Input("editorRoleValues")]
        private InputList<string>? _editorRoleValues;

        /// <summary>
        /// The editor role values.
        /// </summary>
        public InputList<string> EditorRoleValues
        {
            get => _editorRoleValues ?? (_editorRoleValues = new InputList<string>());
            set => _editorRoleValues = value;
        }

        /// <summary>
        /// The email assertion.
        /// </summary>
        [Input("emailAssertion")]
        public Input<string>? EmailAssertion { get; set; }

        /// <summary>
        /// The groups assertion.
        /// </summary>
        [Input("groupsAssertion")]
        public Input<string>? GroupsAssertion { get; set; }

        /// <summary>
        /// The IDP Metadata URL. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Input("idpMetadataUrl")]
        public Input<string>? IdpMetadataUrl { get; set; }

        /// <summary>
        /// The IDP Metadata XML. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
        /// </summary>
        [Input("idpMetadataXml")]
        public Input<string>? IdpMetadataXml { get; set; }

        /// <summary>
        /// The login assertion.
        /// </summary>
        [Input("loginAssertion")]
        public Input<string>? LoginAssertion { get; set; }

        /// <summary>
        /// The login validity duration.
        /// </summary>
        [Input("loginValidityDuration")]
        public Input<int>? LoginValidityDuration { get; set; }

        /// <summary>
        /// The name assertion.
        /// </summary>
        [Input("nameAssertion")]
        public Input<string>? NameAssertion { get; set; }

        /// <summary>
        /// The org assertion.
        /// </summary>
        [Input("orgAssertion")]
        public Input<string>? OrgAssertion { get; set; }

        /// <summary>
        /// The role assertion.
        /// </summary>
        [Input("roleAssertion")]
        public Input<string>? RoleAssertion { get; set; }

        /// <summary>
        /// The status of the SAML configuration.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The workspace id.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public WorkspaceSamlConfigurationState()
        {
        }
        public static new WorkspaceSamlConfigurationState Empty => new WorkspaceSamlConfigurationState();
    }
}
