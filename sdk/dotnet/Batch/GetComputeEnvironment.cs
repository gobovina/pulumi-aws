// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch
{
    public static class GetComputeEnvironment
    {
        /// <summary>
        /// The Batch Compute Environment data source allows access to details of a specific
        /// compute environment within AWS Batch.
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
        ///     var batch_mongo = Aws.Batch.GetComputeEnvironment.Invoke(new()
        ///     {
        ///         ComputeEnvironmentName = "batch-mongo-production",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetComputeEnvironmentResult> InvokeAsync(GetComputeEnvironmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetComputeEnvironmentResult>("aws:batch/getComputeEnvironment:getComputeEnvironment", args ?? new GetComputeEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// The Batch Compute Environment data source allows access to details of a specific
        /// compute environment within AWS Batch.
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
        ///     var batch_mongo = Aws.Batch.GetComputeEnvironment.Invoke(new()
        ///     {
        ///         ComputeEnvironmentName = "batch-mongo-production",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetComputeEnvironmentResult> Invoke(GetComputeEnvironmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetComputeEnvironmentResult>("aws:batch/getComputeEnvironment:getComputeEnvironment", args ?? new GetComputeEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetComputeEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Batch Compute Environment
        /// </summary>
        [Input("computeEnvironmentName", required: true)]
        public string ComputeEnvironmentName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetComputeEnvironmentArgs()
        {
        }
        public static new GetComputeEnvironmentArgs Empty => new GetComputeEnvironmentArgs();
    }

    public sealed class GetComputeEnvironmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Batch Compute Environment
        /// </summary>
        [Input("computeEnvironmentName", required: true)]
        public Input<string> ComputeEnvironmentName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetComputeEnvironmentInvokeArgs()
        {
        }
        public static new GetComputeEnvironmentInvokeArgs Empty => new GetComputeEnvironmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetComputeEnvironmentResult
    {
        /// <summary>
        /// ARN of the compute environment.
        /// </summary>
        public readonly string Arn;
        public readonly string ComputeEnvironmentName;
        /// <summary>
        /// ARN of the underlying Amazon ECS cluster used by the compute environment.
        /// </summary>
        public readonly string EcsClusterArn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
        /// </summary>
        public readonly string ServiceRole;
        /// <summary>
        /// State of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Current status of the compute environment (for example, `CREATING` or `VALID`).
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Short, human-readable string to provide additional details about the current status of the compute environment.
        /// </summary>
        public readonly string StatusReason;
        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Specifies the infrastructure update policy for the compute environment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetComputeEnvironmentUpdatePolicyResult> UpdatePolicies;

        [OutputConstructor]
        private GetComputeEnvironmentResult(
            string arn,

            string computeEnvironmentName,

            string ecsClusterArn,

            string id,

            string serviceRole,

            string state,

            string status,

            string statusReason,

            ImmutableDictionary<string, string> tags,

            string type,

            ImmutableArray<Outputs.GetComputeEnvironmentUpdatePolicyResult> updatePolicies)
        {
            Arn = arn;
            ComputeEnvironmentName = computeEnvironmentName;
            EcsClusterArn = ecsClusterArn;
            Id = id;
            ServiceRole = serviceRole;
            State = state;
            Status = status;
            StatusReason = statusReason;
            Tags = tags;
            Type = type;
            UpdatePolicies = updatePolicies;
        }
    }
}
