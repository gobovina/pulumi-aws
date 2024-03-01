// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks
{
    /// <summary>
    /// Manages an EKS add-on.
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
    ///     var example = new Aws.Eks.Addon("example", new()
    ///     {
    ///         ClusterName = exampleAwsEksCluster.Name,
    ///         AddonName = "vpc-cni",
    ///     });
    /// 
    /// });
    /// ```
    /// ## Example Update add-on usage with resolve_conflicts_on_update and PRESERVE
    /// 
    /// `resolve_conflicts_on_update` with `PRESERVE` can be used to retain the config changes applied to the add-on with kubectl while upgrading to a newer version of the add-on.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Eks.Addon("example", new()
    ///     {
    ///         ClusterName = exampleAwsEksCluster.Name,
    ///         AddonName = "coredns",
    ///         AddonVersion = "v1.10.1-eksbuild.1",
    ///         ResolveConflictsOnUpdate = "PRESERVE",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example add-on usage with custom configuration_values
    /// ### Example IAM Role for EKS Addon "vpc-cni" with AWS managed policy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// using Tls = Pulumi.Tls;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleCluster = new Aws.Eks.Cluster("example");
    /// 
    ///     var example = Tls.GetCertificate.Invoke(new()
    ///     {
    ///         Url = exampleCluster.Identities[0].Oidcs[0]?.Issuer,
    ///     });
    /// 
    ///     var exampleOpenIdConnectProvider = new Aws.Iam.OpenIdConnectProvider("example", new()
    ///     {
    ///         ClientIdLists = new[]
    ///         {
    ///             "sts.amazonaws.com",
    ///         },
    ///         ThumbprintLists = new[]
    ///         {
    ///             example.Apply(getCertificateResult =&gt; getCertificateResult.Certificates[0]?.Sha1Fingerprint),
    ///         },
    ///         Url = exampleCluster.Identities.Apply(identities =&gt; identities[0].Oidcs[0]?.Issuer),
    ///     });
    /// 
    ///     var exampleAssumeRolePolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRoleWithWebIdentity",
    ///                 },
    ///                 Effect = "Allow",
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "StringEquals",
    ///                         Variable = $"{Std.Replace.Invoke(new()
    ///                         {
    ///                             Text = exampleOpenIdConnectProvider.Url,
    ///                             Search = "https://",
    ///                             Replace = "",
    ///                         }).Result}:sub",
    ///                         Values = new[]
    ///                         {
    ///                             "system:serviceaccount:kube-system:aws-node",
    ///                         },
    ///                     },
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Identifiers = new[]
    ///                         {
    ///                             exampleOpenIdConnectProvider.Arn,
    ///                         },
    ///                         Type = "Federated",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRole = new Aws.Iam.Role("example", new()
    ///     {
    ///         AssumeRolePolicy = exampleAssumeRolePolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///         Name = "example-vpc-cni-role",
    ///     });
    /// 
    ///     var exampleRolePolicyAttachment = new Aws.Iam.RolePolicyAttachment("example", new()
    ///     {
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonEKS_CNI_Policy",
    ///         Role = exampleRole.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import EKS add-on using the `cluster_name` and `addon_name` separated by a colon (`:`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:eks/addon:Addon my_eks_addon my_cluster_name:my_addon_name
    /// ```
    /// </summary>
    [AwsResourceType("aws:eks/addon:Addon")]
    public partial class Addon : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the EKS add-on. The name must match one of
        /// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Output("addonName")]
        public Output<string> AddonName { get; private set; } = null!;

        /// <summary>
        /// The version of the EKS add-on. The version must
        /// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Output("addonVersion")]
        public Output<string> AddonVersion { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the EKS add-on.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name of the EKS Cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
        /// </summary>
        [Output("configurationValues")]
        public Output<string> ConfigurationValues { get; private set; } = null!;

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        /// </summary>
        [Output("modifiedAt")]
        public Output<string> ModifiedAt { get; private set; } = null!;

        /// <summary>
        /// Indicates if you want to preserve the created resources when deleting the EKS add-on.
        /// </summary>
        [Output("preserve")]
        public Output<bool?> Preserve { get; private set; } = null!;

        /// <summary>
        /// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolve_conflicts_on_create` and `resolve_conflicts_on_update` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Output("resolveConflicts")]
        public Output<string?> ResolveConflicts { get; private set; } = null!;

        /// <summary>
        /// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
        /// </summary>
        [Output("resolveConflictsOnCreate")]
        public Output<string?> ResolveConflictsOnCreate { get; private set; } = null!;

        /// <summary>
        /// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Output("resolveConflictsOnUpdate")]
        public Output<string?> ResolveConflictsOnUpdate { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of an
        /// existing IAM role to bind to the add-on's service account. The role must be
        /// assigned the IAM permissions required by the add-on. If you don't specify
        /// an existing IAM role, then the add-on uses the permissions assigned to the node
        /// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
        /// in the Amazon EKS User Guide.
        /// 
        /// &gt; **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
        /// provider created for your cluster. For more information, [see Enabling IAM roles
        /// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
        /// in the Amazon EKS User Guide.
        /// </summary>
        [Output("serviceAccountRoleArn")]
        public Output<string?> ServiceAccountRoleArn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Addon resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Addon(string name, AddonArgs args, CustomResourceOptions? options = null)
            : base("aws:eks/addon:Addon", name, args ?? new AddonArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Addon(string name, Input<string> id, AddonState? state = null, CustomResourceOptions? options = null)
            : base("aws:eks/addon:Addon", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Addon resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Addon Get(string name, Input<string> id, AddonState? state = null, CustomResourceOptions? options = null)
        {
            return new Addon(name, id, state, options);
        }
    }

    public sealed class AddonArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the EKS add-on. The name must match one of
        /// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Input("addonName", required: true)]
        public Input<string> AddonName { get; set; } = null!;

        /// <summary>
        /// The version of the EKS add-on. The version must
        /// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Input("addonVersion")]
        public Input<string>? AddonVersion { get; set; }

        /// <summary>
        /// Name of the EKS Cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
        /// </summary>
        [Input("configurationValues")]
        public Input<string>? ConfigurationValues { get; set; }

        /// <summary>
        /// Indicates if you want to preserve the created resources when deleting the EKS add-on.
        /// </summary>
        [Input("preserve")]
        public Input<bool>? Preserve { get; set; }

        /// <summary>
        /// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolve_conflicts_on_create` and `resolve_conflicts_on_update` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflicts")]
        public Input<string>? ResolveConflicts { get; set; }

        /// <summary>
        /// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflictsOnCreate")]
        public Input<string>? ResolveConflictsOnCreate { get; set; }

        /// <summary>
        /// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflictsOnUpdate")]
        public Input<string>? ResolveConflictsOnUpdate { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of an
        /// existing IAM role to bind to the add-on's service account. The role must be
        /// assigned the IAM permissions required by the add-on. If you don't specify
        /// an existing IAM role, then the add-on uses the permissions assigned to the node
        /// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
        /// in the Amazon EKS User Guide.
        /// 
        /// &gt; **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
        /// provider created for your cluster. For more information, [see Enabling IAM roles
        /// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
        /// in the Amazon EKS User Guide.
        /// </summary>
        [Input("serviceAccountRoleArn")]
        public Input<string>? ServiceAccountRoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AddonArgs()
        {
        }
        public static new AddonArgs Empty => new AddonArgs();
    }

    public sealed class AddonState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the EKS add-on. The name must match one of
        /// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Input("addonName")]
        public Input<string>? AddonName { get; set; }

        /// <summary>
        /// The version of the EKS add-on. The version must
        /// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
        /// </summary>
        [Input("addonVersion")]
        public Input<string>? AddonVersion { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the EKS add-on.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name of the EKS Cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
        /// </summary>
        [Input("configurationValues")]
        public Input<string>? ConfigurationValues { get; set; }

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        /// </summary>
        [Input("modifiedAt")]
        public Input<string>? ModifiedAt { get; set; }

        /// <summary>
        /// Indicates if you want to preserve the created resources when deleting the EKS add-on.
        /// </summary>
        [Input("preserve")]
        public Input<bool>? Preserve { get; set; }

        /// <summary>
        /// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolve_conflicts_on_create` and `resolve_conflicts_on_update` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflicts")]
        public Input<string>? ResolveConflicts { get; set; }

        /// <summary>
        /// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflictsOnCreate")]
        public Input<string>? ResolveConflictsOnCreate { get; set; }

        /// <summary>
        /// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
        /// </summary>
        [Input("resolveConflictsOnUpdate")]
        public Input<string>? ResolveConflictsOnUpdate { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of an
        /// existing IAM role to bind to the add-on's service account. The role must be
        /// assigned the IAM permissions required by the add-on. If you don't specify
        /// an existing IAM role, then the add-on uses the permissions assigned to the node
        /// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
        /// in the Amazon EKS User Guide.
        /// 
        /// &gt; **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
        /// provider created for your cluster. For more information, [see Enabling IAM roles
        /// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
        /// in the Amazon EKS User Guide.
        /// </summary>
        [Input("serviceAccountRoleArn")]
        public Input<string>? ServiceAccountRoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public AddonState()
        {
        }
        public static new AddonState Empty => new AddonState();
    }
}
