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
    /// Manages an EKS Fargate Profile.
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
    ///     var example = new Aws.Eks.FargateProfile("example", new()
    ///     {
    ///         ClusterName = aws_eks_cluster.Example.Name,
    ///         PodExecutionRoleArn = aws_iam_role.Example.Arn,
    ///         SubnetIds = aws_subnet.Example.Select(__item =&gt; __item.Id).ToList(),
    ///         Selectors = new[]
    ///         {
    ///             new Aws.Eks.Inputs.FargateProfileSelectorArgs
    ///             {
    ///                 Namespace = "example",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example IAM Role for EKS Fargate Profile
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
    ///     var example = new Aws.Iam.Role("example", new()
    ///     {
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Action"] = "sts:AssumeRole",
    ///                     ["Effect"] = "Allow",
    ///                     ["Principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Service"] = "eks-fargate-pods.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///             ["Version"] = "2012-10-17",
    ///         }),
    ///     });
    /// 
    ///     var example_AmazonEKSFargatePodExecutionRolePolicy = new Aws.Iam.RolePolicyAttachment("example-AmazonEKSFargatePodExecutionRolePolicy", new()
    ///     {
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonEKSFargatePodExecutionRolePolicy",
    ///         Role = example.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import EKS Fargate Profiles using the `cluster_name` and `fargate_profile_name` separated by a colon (`:`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:eks/fargateProfile:FargateProfile my_fargate_profile my_cluster:my_fargate_profile
    /// ```
    /// </summary>
    [AwsResourceType("aws:eks/fargateProfile:FargateProfile")]
    public partial class FargateProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the EKS Fargate Profile.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// Name of the EKS Fargate Profile.
        /// </summary>
        [Output("fargateProfileName")]
        public Output<string> FargateProfileName { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        /// </summary>
        [Output("podExecutionRoleArn")]
        public Output<string> PodExecutionRoleArn { get; private set; } = null!;

        /// <summary>
        /// Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        /// </summary>
        [Output("selectors")]
        public Output<ImmutableArray<Outputs.FargateProfileSelector>> Selectors { get; private set; } = null!;

        /// <summary>
        /// Status of the EKS Fargate Profile.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a FargateProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FargateProfile(string name, FargateProfileArgs args, CustomResourceOptions? options = null)
            : base("aws:eks/fargateProfile:FargateProfile", name, args ?? new FargateProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FargateProfile(string name, Input<string> id, FargateProfileState? state = null, CustomResourceOptions? options = null)
            : base("aws:eks/fargateProfile:FargateProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FargateProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FargateProfile Get(string name, Input<string> id, FargateProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new FargateProfile(name, id, state, options);
        }
    }

    public sealed class FargateProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// Name of the EKS Fargate Profile.
        /// </summary>
        [Input("fargateProfileName")]
        public Input<string>? FargateProfileName { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        /// </summary>
        [Input("podExecutionRoleArn", required: true)]
        public Input<string> PodExecutionRoleArn { get; set; } = null!;

        [Input("selectors", required: true)]
        private InputList<Inputs.FargateProfileSelectorArgs>? _selectors;

        /// <summary>
        /// Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        /// </summary>
        public InputList<Inputs.FargateProfileSelectorArgs> Selectors
        {
            get => _selectors ?? (_selectors = new InputList<Inputs.FargateProfileSelectorArgs>());
            set => _selectors = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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

        public FargateProfileArgs()
        {
        }
        public static new FargateProfileArgs Empty => new FargateProfileArgs();
    }

    public sealed class FargateProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the EKS Fargate Profile.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// Name of the EKS Fargate Profile.
        /// </summary>
        [Input("fargateProfileName")]
        public Input<string>? FargateProfileName { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
        /// </summary>
        [Input("podExecutionRoleArn")]
        public Input<string>? PodExecutionRoleArn { get; set; }

        [Input("selectors")]
        private InputList<Inputs.FargateProfileSelectorGetArgs>? _selectors;

        /// <summary>
        /// Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
        /// </summary>
        public InputList<Inputs.FargateProfileSelectorGetArgs> Selectors
        {
            get => _selectors ?? (_selectors = new InputList<Inputs.FargateProfileSelectorGetArgs>());
            set => _selectors = value;
        }

        /// <summary>
        /// Status of the EKS Fargate Profile.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public FargateProfileState()
        {
        }
        public static new FargateProfileState Empty => new FargateProfileState();
    }
}
