// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks
{
    public static class GetAccessEntry
    {
        /// <summary>
        /// Access Entry Configurations for an EKS Cluster.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Eks.GetAccessEntry.Invoke(new()
        ///     {
        ///         ClusterName = exampleAwsEksCluster.Name,
        ///         PrincipalArn = exampleAwsIamRole.Arn,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["eksAccessEntryOutputs"] = exampleAwsEksAccessEntry,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccessEntryResult> InvokeAsync(GetAccessEntryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessEntryResult>("aws:eks/getAccessEntry:getAccessEntry", args ?? new GetAccessEntryArgs(), options.WithDefaults());

        /// <summary>
        /// Access Entry Configurations for an EKS Cluster.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Eks.GetAccessEntry.Invoke(new()
        ///     {
        ///         ClusterName = exampleAwsEksCluster.Name,
        ///         PrincipalArn = exampleAwsIamRole.Arn,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["eksAccessEntryOutputs"] = exampleAwsEksAccessEntry,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccessEntryResult> Invoke(GetAccessEntryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessEntryResult>("aws:eks/getAccessEntry:getAccessEntry", args ?? new GetAccessEntryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessEntryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the EKS Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The IAM Principal ARN which requires Authentication access to the EKS cluster.
        /// </summary>
        [Input("principalArn", required: true)]
        public string PrincipalArn { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetAccessEntryArgs()
        {
        }
        public static new GetAccessEntryArgs Empty => new GetAccessEntryArgs();
    }

    public sealed class GetAccessEntryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the EKS Cluster.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The IAM Principal ARN which requires Authentication access to the EKS cluster.
        /// </summary>
        [Input("principalArn", required: true)]
        public Input<string> PrincipalArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetAccessEntryInvokeArgs()
        {
        }
        public static new GetAccessEntryInvokeArgs Empty => new GetAccessEntryInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessEntryResult
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Access Entry.
        /// </summary>
        public readonly string AccessEntryArn;
        public readonly string ClusterName;
        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
        /// </summary>
        public readonly ImmutableArray<string> KubernetesGroups;
        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
        /// </summary>
        public readonly string ModifiedAt;
        public readonly string PrincipalArn;
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public readonly ImmutableDictionary<string, string> TagsAll;
        /// <summary>
        /// Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
        /// </summary>
        public readonly string UserName;

        [OutputConstructor]
        private GetAccessEntryResult(
            string accessEntryArn,

            string clusterName,

            string createdAt,

            string id,

            ImmutableArray<string> kubernetesGroups,

            string modifiedAt,

            string principalArn,

            ImmutableDictionary<string, string>? tags,

            ImmutableDictionary<string, string> tagsAll,

            string type,

            string userName)
        {
            AccessEntryArn = accessEntryArn;
            ClusterName = clusterName;
            CreatedAt = createdAt;
            Id = id;
            KubernetesGroups = kubernetesGroups;
            ModifiedAt = modifiedAt;
            PrincipalArn = principalArn;
            Tags = tags;
            TagsAll = tagsAll;
            Type = type;
            UserName = userName;
        }
    }
}
