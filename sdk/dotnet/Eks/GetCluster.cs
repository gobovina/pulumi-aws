// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks
{
    public static class GetCluster
    {
        /// <summary>
        /// Retrieve information about an EKS Cluster.
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
        ///     var example = Aws.Eks.GetCluster.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = example.Apply(getClusterResult =&gt; getClusterResult.Endpoint),
        ///         ["kubeconfig-certificate-authority-data"] = example.Apply(getClusterResult =&gt; getClusterResult.CertificateAuthorities[0]?.Data),
        ///         ["identity-oidc-issuer"] = example.Apply(getClusterResult =&gt; getClusterResult.Identities[0]?.Oidcs[0]?.Issuer),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetClusterResult> InvokeAsync(GetClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterResult>("aws:eks/getCluster:getCluster", args ?? new GetClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about an EKS Cluster.
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
        ///     var example = Aws.Eks.GetCluster.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["endpoint"] = example.Apply(getClusterResult =&gt; getClusterResult.Endpoint),
        ///         ["kubeconfig-certificate-authority-data"] = example.Apply(getClusterResult =&gt; getClusterResult.CertificateAuthorities[0]?.Data),
        ///         ["identity-oidc-issuer"] = example.Apply(getClusterResult =&gt; getClusterResult.Identities[0]?.Oidcs[0]?.Issuer),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetClusterResult> Invoke(GetClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterResult>("aws:eks/getCluster:getCluster", args ?? new GetClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetClusterArgs()
        {
        }
        public static new GetClusterArgs Empty => new GetClusterArgs();
    }

    public sealed class GetClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetClusterInvokeArgs()
        {
        }
        public static new GetClusterInvokeArgs Empty => new GetClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterResult
    {
        /// <summary>
        /// Configuration block for access config.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterAccessConfigResult> AccessConfigs;
        /// <summary>
        /// ARN of the cluster.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Nested attribute containing `certificate-authority-data` for your cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterCertificateAuthorityResult> CertificateAuthorities;
        /// <summary>
        /// The ID of your local Amazon EKS cluster on the AWS Outpost. This attribute isn't available for an AWS EKS cluster on AWS cloud.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// Unix epoch time stamp in seconds for when the cluster was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The enabled control plane logs.
        /// </summary>
        public readonly ImmutableArray<string> EnabledClusterLogTypes;
        /// <summary>
        /// Endpoint for your Kubernetes API server.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the `aws.eks.Cluster` resource documentation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterIdentityResult> Identities;
        /// <summary>
        /// Nested list containing Kubernetes Network Configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterKubernetesNetworkConfigResult> KubernetesNetworkConfigs;
        public readonly string Name;
        /// <summary>
        /// Contains Outpost Configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterOutpostConfigResult> OutpostConfigs;
        /// <summary>
        /// Platform version for the cluster.
        /// </summary>
        public readonly string PlatformVersion;
        /// <summary>
        /// ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
        /// </summary>
        public readonly string RoleArn;
        /// <summary>
        /// Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Kubernetes server version for the cluster.
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// Nested list containing VPC configuration for the cluster.
        /// </summary>
        public readonly Outputs.GetClusterVpcConfigResult VpcConfig;

        [OutputConstructor]
        private GetClusterResult(
            ImmutableArray<Outputs.GetClusterAccessConfigResult> accessConfigs,

            string arn,

            ImmutableArray<Outputs.GetClusterCertificateAuthorityResult> certificateAuthorities,

            string clusterId,

            string createdAt,

            ImmutableArray<string> enabledClusterLogTypes,

            string endpoint,

            string id,

            ImmutableArray<Outputs.GetClusterIdentityResult> identities,

            ImmutableArray<Outputs.GetClusterKubernetesNetworkConfigResult> kubernetesNetworkConfigs,

            string name,

            ImmutableArray<Outputs.GetClusterOutpostConfigResult> outpostConfigs,

            string platformVersion,

            string roleArn,

            string status,

            ImmutableDictionary<string, string> tags,

            string version,

            Outputs.GetClusterVpcConfigResult vpcConfig)
        {
            AccessConfigs = accessConfigs;
            Arn = arn;
            CertificateAuthorities = certificateAuthorities;
            ClusterId = clusterId;
            CreatedAt = createdAt;
            EnabledClusterLogTypes = enabledClusterLogTypes;
            Endpoint = endpoint;
            Id = id;
            Identities = identities;
            KubernetesNetworkConfigs = kubernetesNetworkConfigs;
            Name = name;
            OutpostConfigs = outpostConfigs;
            PlatformVersion = platformVersion;
            RoleArn = roleArn;
            Status = status;
            Tags = tags;
            Version = version;
            VpcConfig = vpcConfig;
        }
    }
}
