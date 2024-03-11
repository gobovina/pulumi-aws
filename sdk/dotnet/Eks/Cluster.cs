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
    /// Manages an EKS Cluster.
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
    ///     var example = new Aws.Eks.Cluster("example", new()
    ///     {
    ///         Name = "example",
    ///         RoleArn = exampleAwsIamRole.Arn,
    ///         VpcConfig = new Aws.Eks.Inputs.ClusterVpcConfigArgs
    ///         {
    ///             SubnetIds = new[]
    ///             {
    ///                 example1.Id,
    ///                 example2.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["endpoint"] = example.Endpoint,
    ///         ["kubeconfig-certificate-authority-data"] = example.CertificateAuthority.Apply(certificateAuthority =&gt; certificateAuthority.Data),
    ///     };
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Example IAM Role for EKS Cluster
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
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "eks.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = new Aws.Iam.Role("example", new()
    ///     {
    ///         Name = "eks-cluster-example",
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var example_AmazonEKSClusterPolicy = new Aws.Iam.RolePolicyAttachment("example-AmazonEKSClusterPolicy", new()
    ///     {
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy",
    ///         Role = example.Name,
    ///     });
    /// 
    ///     // Optionally, enable Security Groups for Pods
    ///     // Reference: https://docs.aws.amazon.com/eks/latest/userguide/security-groups-for-pods.html
    ///     var example_AmazonEKSVPCResourceController = new Aws.Iam.RolePolicyAttachment("example-AmazonEKSVPCResourceController", new()
    ///     {
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonEKSVPCResourceController",
    ///         Role = example.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Enabling Control Plane Logging
    /// 
    /// [EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html) can be enabled via the `enabled_cluster_log_types` argument. To manage the CloudWatch Log Group retention period, the `aws.cloudwatch.LogGroup` resource can be used.
    /// 
    /// &gt; The below configuration uses [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) to prevent ordering issues with EKS automatically creating the log group first and a variable for naming consistency. Other ordering and naming methodologies may be more appropriate for your environment.
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
    ///     var config = new Config();
    ///     var clusterName = config.Get("clusterName") ?? "example";
    ///     var example = new Aws.Eks.Cluster("example", new()
    ///     {
    ///         EnabledClusterLogTypes = new[]
    ///         {
    ///             "api",
    ///             "audit",
    ///         },
    ///         Name = clusterName,
    ///     });
    /// 
    ///     var exampleLogGroup = new Aws.CloudWatch.LogGroup("example", new()
    ///     {
    ///         Name = $"/aws/eks/{clusterName}/cluster",
    ///         RetentionInDays = 7,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Enabling IAM Roles for Service Accounts
    /// 
    /// Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For more information about this feature, see the [EKS User Guide](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html).
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
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
    ///         Url = example.Apply(getCertificateResult =&gt; getCertificateResult.Url),
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
    ///         Name = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### EKS Cluster on AWS Outpost
    /// 
    /// [Creating a local Amazon EKS cluster on an AWS Outpost](https://docs.aws.amazon.com/eks/latest/userguide/create-cluster-outpost.html)
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
    ///     var example = new Aws.Iam.Role("example", new()
    ///     {
    ///         AssumeRolePolicy = exampleAssumeRolePolicy.Json,
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleCluster = new Aws.Eks.Cluster("example", new()
    ///     {
    ///         Name = "example-cluster",
    ///         RoleArn = example.Arn,
    ///         VpcConfig = new Aws.Eks.Inputs.ClusterVpcConfigArgs
    ///         {
    ///             EndpointPrivateAccess = true,
    ///             EndpointPublicAccess = false,
    ///         },
    ///         OutpostConfig = new Aws.Eks.Inputs.ClusterOutpostConfigArgs
    ///         {
    ///             ControlPlaneInstanceType = "m5d.large",
    ///             OutpostArns = new[]
    ///             {
    ///                 exampleAwsOutpostsOutpost.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### EKS Cluster with Access Config
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
    ///     var example = new Aws.Iam.Role("example", new()
    ///     {
    ///         AssumeRolePolicy = exampleAssumeRolePolicy.Json,
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleCluster = new Aws.Eks.Cluster("example", new()
    ///     {
    ///         Name = "example-cluster",
    ///         RoleArn = example.Arn,
    ///         VpcConfig = new Aws.Eks.Inputs.ClusterVpcConfigArgs
    ///         {
    ///             EndpointPrivateAccess = true,
    ///             EndpointPublicAccess = false,
    ///         },
    ///         AccessConfig = new Aws.Eks.Inputs.ClusterAccessConfigArgs
    ///         {
    ///             AuthenticationMode = "CONFIG_MAP",
    ///             BootstrapClusterCreatorAdminPermissions = true,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// After adding inline IAM Policies (e.g., `aws.iam.RolePolicy` resource) or attaching IAM Policies (e.g., `aws.iam.Policy` resource and `aws.iam.RolePolicyAttachment` resource) with the desired permissions to the IAM Role, annotate the Kubernetes service account (e.g., `kubernetes_service_account` resource) and recreate any pods.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import EKS Clusters using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:eks/cluster:Cluster my_cluster my_cluster
    /// ```
    /// </summary>
    [AwsResourceType("aws:eks/cluster:Cluster")]
    public partial class Cluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration block for the access config associated with your cluster, see [Amazon EKS Access Entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html).
        /// </summary>
        [Output("accessConfig")]
        public Output<Outputs.ClusterAccessConfig> AccessConfig { get; private set; } = null!;

        /// <summary>
        /// ARN of the cluster.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("certificateAuthorities")]
        public Output<ImmutableArray<Outputs.ClusterCertificateAuthority>> CertificateAuthorities { get; private set; } = null!;

        /// <summary>
        /// Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
        /// </summary>
        [Output("certificateAuthority")]
        public Output<Outputs.ClusterCertificateAuthority> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// The ID of your local Amazon EKS cluster on the AWS Outpost. This attribute isn't available for an AWS EKS cluster on AWS cloud.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Unix epoch timestamp in seconds for when the cluster was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        [Output("defaultAddonsToRemoves")]
        public Output<ImmutableArray<string>> DefaultAddonsToRemoves { get; private set; } = null!;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        [Output("enabledClusterLogTypes")]
        public Output<ImmutableArray<string>> EnabledClusterLogTypes { get; private set; } = null!;

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Output("encryptionConfig")]
        public Output<Outputs.ClusterEncryptionConfig?> EncryptionConfig { get; private set; } = null!;

        /// <summary>
        /// Endpoint for your Kubernetes API server.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
        /// * `kubernetes_network_config.service_ipv6_cidr` - The CIDR block that Kubernetes pod and service IP addresses are assigned from if you specified `ipv6` for ipFamily when you created the cluster. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can't specify a custom IPv6 CIDR block when you create the cluster.
        /// </summary>
        [Output("identities")]
        public Output<ImmutableArray<Outputs.ClusterIdentity>> Identities { get; private set; } = null!;

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Output("kubernetesNetworkConfig")]
        public Output<Outputs.ClusterKubernetesNetworkConfig> KubernetesNetworkConfig { get; private set; } = null!;

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]*$`).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration block representing the configuration of your local Amazon EKS cluster on an AWS Outpost. This block isn't available for creating Amazon EKS clusters on the AWS cloud.
        /// </summary>
        [Output("outpostConfig")]
        public Output<Outputs.ClusterOutpostConfig?> OutpostConfig { get; private set; } = null!;

        /// <summary>
        /// Platform version for the cluster.
        /// </summary>
        [Output("platformVersion")]
        public Output<string> PlatformVersion { get; private set; } = null!;

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding `depends_on` if using the `aws.iam.RolePolicy` resource or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.ClusterVpcConfig> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("aws:eks/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:eks/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for the access config associated with your cluster, see [Amazon EKS Access Entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html).
        /// </summary>
        [Input("accessConfig")]
        public Input<Inputs.ClusterAccessConfigArgs>? AccessConfig { get; set; }

        [Input("defaultAddonsToRemoves")]
        private InputList<string>? _defaultAddonsToRemoves;
        public InputList<string> DefaultAddonsToRemoves
        {
            get => _defaultAddonsToRemoves ?? (_defaultAddonsToRemoves = new InputList<string>());
            set => _defaultAddonsToRemoves = value;
        }

        [Input("enabledClusterLogTypes")]
        private InputList<string>? _enabledClusterLogTypes;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        public InputList<string> EnabledClusterLogTypes
        {
            get => _enabledClusterLogTypes ?? (_enabledClusterLogTypes = new InputList<string>());
            set => _enabledClusterLogTypes = value;
        }

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.ClusterEncryptionConfigArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Input("kubernetesNetworkConfig")]
        public Input<Inputs.ClusterKubernetesNetworkConfigArgs>? KubernetesNetworkConfig { get; set; }

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]*$`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration block representing the configuration of your local Amazon EKS cluster on an AWS Outpost. This block isn't available for creating Amazon EKS clusters on the AWS cloud.
        /// </summary>
        [Input("outpostConfig")]
        public Input<Inputs.ClusterOutpostConfigArgs>? OutpostConfig { get; set; }

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding `depends_on` if using the `aws.iam.RolePolicy` resource or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

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
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpcConfig", required: true)]
        public Input<Inputs.ClusterVpcConfigArgs> VpcConfig { get; set; } = null!;

        public ClusterArgs()
        {
        }
        public static new ClusterArgs Empty => new ClusterArgs();
    }

    public sealed class ClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for the access config associated with your cluster, see [Amazon EKS Access Entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html).
        /// </summary>
        [Input("accessConfig")]
        public Input<Inputs.ClusterAccessConfigGetArgs>? AccessConfig { get; set; }

        /// <summary>
        /// ARN of the cluster.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("certificateAuthorities")]
        private InputList<Inputs.ClusterCertificateAuthorityGetArgs>? _certificateAuthorities;
        public InputList<Inputs.ClusterCertificateAuthorityGetArgs> CertificateAuthorities
        {
            get => _certificateAuthorities ?? (_certificateAuthorities = new InputList<Inputs.ClusterCertificateAuthorityGetArgs>());
            set => _certificateAuthorities = value;
        }

        /// <summary>
        /// Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<Inputs.ClusterCertificateAuthorityGetArgs>? CertificateAuthority { get; set; }

        /// <summary>
        /// The ID of your local Amazon EKS cluster on the AWS Outpost. This attribute isn't available for an AWS EKS cluster on AWS cloud.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Unix epoch timestamp in seconds for when the cluster was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("defaultAddonsToRemoves")]
        private InputList<string>? _defaultAddonsToRemoves;
        public InputList<string> DefaultAddonsToRemoves
        {
            get => _defaultAddonsToRemoves ?? (_defaultAddonsToRemoves = new InputList<string>());
            set => _defaultAddonsToRemoves = value;
        }

        [Input("enabledClusterLogTypes")]
        private InputList<string>? _enabledClusterLogTypes;

        /// <summary>
        /// List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
        /// </summary>
        public InputList<string> EnabledClusterLogTypes
        {
            get => _enabledClusterLogTypes ?? (_enabledClusterLogTypes = new InputList<string>());
            set => _enabledClusterLogTypes = value;
        }

        /// <summary>
        /// Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
        /// </summary>
        [Input("encryptionConfig")]
        public Input<Inputs.ClusterEncryptionConfigGetArgs>? EncryptionConfig { get; set; }

        /// <summary>
        /// Endpoint for your Kubernetes API server.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("identities")]
        private InputList<Inputs.ClusterIdentityGetArgs>? _identities;

        /// <summary>
        /// Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
        /// * `kubernetes_network_config.service_ipv6_cidr` - The CIDR block that Kubernetes pod and service IP addresses are assigned from if you specified `ipv6` for ipFamily when you created the cluster. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can't specify a custom IPv6 CIDR block when you create the cluster.
        /// </summary>
        public InputList<Inputs.ClusterIdentityGetArgs> Identities
        {
            get => _identities ?? (_identities = new InputList<Inputs.ClusterIdentityGetArgs>());
            set => _identities = value;
        }

        /// <summary>
        /// Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
        /// </summary>
        [Input("kubernetesNetworkConfig")]
        public Input<Inputs.ClusterKubernetesNetworkConfigGetArgs>? KubernetesNetworkConfig { get; set; }

        /// <summary>
        /// Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]*$`).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Configuration block representing the configuration of your local Amazon EKS cluster on an AWS Outpost. This block isn't available for creating Amazon EKS clusters on the AWS cloud.
        /// </summary>
        [Input("outpostConfig")]
        public Input<Inputs.ClusterOutpostConfigGetArgs>? OutpostConfig { get; set; }

        /// <summary>
        /// Platform version for the cluster.
        /// </summary>
        [Input("platformVersion")]
        public Input<string>? PlatformVersion { get; set; }

        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding `depends_on` if using the `aws.iam.RolePolicy` resource or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

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
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ClusterVpcConfigGetArgs>? VpcConfig { get; set; }

        public ClusterState()
        {
        }
        public static new ClusterState Empty => new ClusterState();
    }
}
