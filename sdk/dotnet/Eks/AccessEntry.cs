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
    /// Access Entry Configurations for an EKS Cluster.
    /// 
    /// ## Example Usage
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
    ///     var example = new Aws.Eks.AccessEntry("example", new()
    ///     {
    ///         ClusterName = exampleAwsEksCluster.Name,
    ///         PrincipalArn = exampleAwsIamRole.Arn,
    ///         KubernetesGroups = new[]
    ///         {
    ///             "group-1",
    ///             "group-2",
    ///         },
    ///         Type = "STANDARD",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import EKS access entry using the `cluster_name` and `principal_arn` separated by a colon (`:`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:eks/accessEntry:AccessEntry my_eks_access_entry my_cluster_name:my_principal_arn
    /// ```
    /// </summary>
    [AwsResourceType("aws:eks/accessEntry:AccessEntry")]
    public partial class AccessEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Access Entry.
        /// </summary>
        [Output("accessEntryArn")]
        public Output<string> AccessEntryArn { get; private set; } = null!;

        /// <summary>
        /// Name of the EKS Cluster.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
        /// </summary>
        [Output("kubernetesGroups")]
        public Output<ImmutableArray<string>> KubernetesGroups { get; private set; } = null!;

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        /// </summary>
        [Output("modifiedAt")]
        public Output<string> ModifiedAt { get; private set; } = null!;

        /// <summary>
        /// The IAM Principal ARN which requires Authentication access to the EKS cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("principalArn")]
        public Output<string> PrincipalArn { get; private set; } = null!;

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
        /// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a AccessEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessEntry(string name, AccessEntryArgs args, CustomResourceOptions? options = null)
            : base("aws:eks/accessEntry:AccessEntry", name, args ?? new AccessEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessEntry(string name, Input<string> id, AccessEntryState? state = null, CustomResourceOptions? options = null)
            : base("aws:eks/accessEntry:AccessEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessEntry Get(string name, Input<string> id, AccessEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessEntry(name, id, state, options);
        }
    }

    public sealed class AccessEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the EKS Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("kubernetesGroups")]
        private InputList<string>? _kubernetesGroups;

        /// <summary>
        /// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
        /// </summary>
        public InputList<string> KubernetesGroups
        {
            get => _kubernetesGroups ?? (_kubernetesGroups = new InputList<string>());
            set => _kubernetesGroups = value;
        }

        /// <summary>
        /// The IAM Principal ARN which requires Authentication access to the EKS cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("principalArn", required: true)]
        public Input<string> PrincipalArn { get; set; } = null!;

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

        /// <summary>
        /// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public AccessEntryArgs()
        {
        }
        public static new AccessEntryArgs Empty => new AccessEntryArgs();
    }

    public sealed class AccessEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Access Entry.
        /// </summary>
        [Input("accessEntryArn")]
        public Input<string>? AccessEntryArn { get; set; }

        /// <summary>
        /// Name of the EKS Cluster.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("kubernetesGroups")]
        private InputList<string>? _kubernetesGroups;

        /// <summary>
        /// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
        /// </summary>
        public InputList<string> KubernetesGroups
        {
            get => _kubernetesGroups ?? (_kubernetesGroups = new InputList<string>());
            set => _kubernetesGroups = value;
        }

        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        /// </summary>
        [Input("modifiedAt")]
        public Input<string>? ModifiedAt { get; set; }

        /// <summary>
        /// The IAM Principal ARN which requires Authentication access to the EKS cluster.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("principalArn")]
        public Input<string>? PrincipalArn { get; set; }

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

        /// <summary>
        /// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public AccessEntryState()
        {
        }
        public static new AccessEntryState Empty => new AccessEntryState();
    }
}
