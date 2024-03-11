// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs
{
    public static class GetService
    {
        /// <summary>
        /// The ECS Service data source allows access to details of a specific
        /// Service within a AWS ECS Cluster.
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
        ///     var example = Aws.Ecs.GetService.Invoke(new()
        ///     {
        ///         ServiceName = "example",
        ///         ClusterArn = exampleAwsEcsCluster.Arn,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("aws:ecs/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// The ECS Service data source allows access to details of a specific
        /// Service within a AWS ECS Cluster.
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
        ///     var example = Aws.Ecs.GetService.Invoke(new()
        ///     {
        ///         ServiceName = "example",
        ///         ClusterArn = exampleAwsEcsCluster.Arn,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("aws:ecs/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the ECS Cluster
        /// </summary>
        [Input("clusterArn", required: true)]
        public string ClusterArn { get; set; } = null!;

        /// <summary>
        /// Name of the ECS Service
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Resource tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the ECS Cluster
        /// </summary>
        [Input("clusterArn", required: true)]
        public Input<string> ClusterArn { get; set; } = null!;

        /// <summary>
        /// Name of the ECS Service
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        /// <summary>
        /// ARN of the ECS Service
        /// </summary>
        public readonly string Arn;
        public readonly string ClusterArn;
        /// <summary>
        /// Number of tasks for the ECS Service
        /// </summary>
        public readonly int DesiredCount;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Launch type for the ECS Service
        /// </summary>
        public readonly string LaunchType;
        /// <summary>
        /// Scheduling strategy for the ECS Service
        /// </summary>
        public readonly string SchedulingStrategy;
        public readonly string ServiceName;
        /// <summary>
        /// Resource tags.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Family for the latest ACTIVE revision or full ARN of the task definition.
        /// </summary>
        public readonly string TaskDefinition;

        [OutputConstructor]
        private GetServiceResult(
            string arn,

            string clusterArn,

            int desiredCount,

            string id,

            string launchType,

            string schedulingStrategy,

            string serviceName,

            ImmutableDictionary<string, string> tags,

            string taskDefinition)
        {
            Arn = arn;
            ClusterArn = clusterArn;
            DesiredCount = desiredCount;
            Id = id;
            LaunchType = launchType;
            SchedulingStrategy = schedulingStrategy;
            ServiceName = serviceName;
            Tags = tags;
            TaskDefinition = taskDefinition;
        }
    }
}
