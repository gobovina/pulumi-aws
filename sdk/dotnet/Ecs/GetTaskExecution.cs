// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs
{
    public static class GetTaskExecution
    {
        /// <summary>
        /// Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don't fit a standard resource lifecycle. See the feature request issue for additional context.
        /// 
        /// &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ecs.GetTaskExecution.Invoke(new()
        ///     {
        ///         Cluster = exampleAwsEcsCluster.Id,
        ///         TaskDefinition = exampleAwsEcsTaskDefinition.Arn,
        ///         DesiredCount = 1,
        ///         LaunchType = "FARGATE",
        ///         NetworkConfiguration = new Aws.Ecs.Inputs.GetTaskExecutionNetworkConfigurationInputArgs
        ///         {
        ///             Subnets = exampleAwsSubnet.Select(__item =&gt; __item.Id).ToList(),
        ///             SecurityGroups = new[]
        ///             {
        ///                 exampleAwsSecurityGroup.Id,
        ///             },
        ///             AssignPublicIp = false,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTaskExecutionResult> InvokeAsync(GetTaskExecutionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTaskExecutionResult>("aws:ecs/getTaskExecution:getTaskExecution", args ?? new GetTaskExecutionArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don't fit a standard resource lifecycle. See the feature request issue for additional context.
        /// 
        /// &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ecs.GetTaskExecution.Invoke(new()
        ///     {
        ///         Cluster = exampleAwsEcsCluster.Id,
        ///         TaskDefinition = exampleAwsEcsTaskDefinition.Arn,
        ///         DesiredCount = 1,
        ///         LaunchType = "FARGATE",
        ///         NetworkConfiguration = new Aws.Ecs.Inputs.GetTaskExecutionNetworkConfigurationInputArgs
        ///         {
        ///             Subnets = exampleAwsSubnet.Select(__item =&gt; __item.Id).ToList(),
        ///             SecurityGroups = new[]
        ///             {
        ///                 exampleAwsSecurityGroup.Id,
        ///             },
        ///             AssignPublicIp = false,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTaskExecutionResult> Invoke(GetTaskExecutionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTaskExecutionResult>("aws:ecs/getTaskExecution:getTaskExecution", args ?? new GetTaskExecutionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTaskExecutionArgs : global::Pulumi.InvokeArgs
    {
        [Input("capacityProviderStrategies")]
        private List<Inputs.GetTaskExecutionCapacityProviderStrategyArgs>? _capacityProviderStrategies;

        /// <summary>
        /// Set of capacity provider strategies to use for the cluster. See below.
        /// </summary>
        public List<Inputs.GetTaskExecutionCapacityProviderStrategyArgs> CapacityProviderStrategies
        {
            get => _capacityProviderStrategies ?? (_capacityProviderStrategies = new List<Inputs.GetTaskExecutionCapacityProviderStrategyArgs>());
            set => _capacityProviderStrategies = value;
        }

        /// <summary>
        /// An identifier that you provide to ensure the idempotency of the request. It must be unique and is case sensitive. Up to 64 characters are allowed. The valid characters are characters in the range of 33-126, inclusive. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/ECS_Idempotency.html).
        /// </summary>
        [Input("clientToken")]
        public string? ClientToken { get; set; }

        /// <summary>
        /// Short name or full Amazon Resource Name (ARN) of the cluster to run the task on.
        /// </summary>
        [Input("cluster", required: true)]
        public string Cluster { get; set; } = null!;

        /// <summary>
        /// Number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks for each call.
        /// </summary>
        [Input("desiredCount")]
        public int? DesiredCount { get; set; }

        /// <summary>
        /// Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
        /// </summary>
        [Input("enableEcsManagedTags")]
        public bool? EnableEcsManagedTags { get; set; }

        /// <summary>
        /// Specifies whether to enable Amazon ECS Exec for the tasks within the service.
        /// </summary>
        [Input("enableExecuteCommand")]
        public bool? EnableExecuteCommand { get; set; }

        /// <summary>
        /// Name of the task group to associate with the task. The default value is the family name of the task definition.
        /// </summary>
        [Input("group")]
        public string? Group { get; set; }

        /// <summary>
        /// Launch type on which to run your service. Valid values are `EC2`, `FARGATE`, and `EXTERNAL`.
        /// </summary>
        [Input("launchType")]
        public string? LaunchType { get; set; }

        /// <summary>
        /// Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
        /// </summary>
        [Input("networkConfiguration")]
        public Inputs.GetTaskExecutionNetworkConfigurationArgs? NetworkConfiguration { get; set; }

        /// <summary>
        /// A list of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
        /// </summary>
        [Input("overrides")]
        public Inputs.GetTaskExecutionOverridesArgs? Overrides { get; set; }

        [Input("placementConstraints")]
        private List<Inputs.GetTaskExecutionPlacementConstraintArgs>? _placementConstraints;

        /// <summary>
        /// An array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
        /// </summary>
        public List<Inputs.GetTaskExecutionPlacementConstraintArgs> PlacementConstraints
        {
            get => _placementConstraints ?? (_placementConstraints = new List<Inputs.GetTaskExecutionPlacementConstraintArgs>());
            set => _placementConstraints = value;
        }

        [Input("placementStrategies")]
        private List<Inputs.GetTaskExecutionPlacementStrategyArgs>? _placementStrategies;

        /// <summary>
        /// The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
        /// </summary>
        public List<Inputs.GetTaskExecutionPlacementStrategyArgs> PlacementStrategies
        {
            get => _placementStrategies ?? (_placementStrategies = new List<Inputs.GetTaskExecutionPlacementStrategyArgs>());
            set => _placementStrategies = value;
        }

        /// <summary>
        /// The platform version the task uses. A platform version is only specified for tasks hosted on Fargate. If one isn't specified, the `LATEST` platform version is used.
        /// </summary>
        [Input("platformVersion")]
        public string? PlatformVersion { get; set; }

        /// <summary>
        /// Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags aren't propagated. An error will be received if you specify the `SERVICE` option when running a task. Valid values are `TASK_DEFINITION` or `NONE`.
        /// </summary>
        [Input("propagateTags")]
        public string? PropagateTags { get; set; }

        /// <summary>
        /// The reference ID to use for the task.
        /// </summary>
        [Input("referenceId")]
        public string? ReferenceId { get; set; }

        /// <summary>
        /// An optional tag specified when a task is started.
        /// </summary>
        [Input("startedBy")]
        public string? StartedBy { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// The `family` and `revision` (`family:revision`) or full ARN of the task definition to run. If a revision isn't specified, the latest `ACTIVE` revision is used.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("taskDefinition", required: true)]
        public string TaskDefinition { get; set; } = null!;

        public GetTaskExecutionArgs()
        {
        }
        public static new GetTaskExecutionArgs Empty => new GetTaskExecutionArgs();
    }

    public sealed class GetTaskExecutionInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("capacityProviderStrategies")]
        private InputList<Inputs.GetTaskExecutionCapacityProviderStrategyInputArgs>? _capacityProviderStrategies;

        /// <summary>
        /// Set of capacity provider strategies to use for the cluster. See below.
        /// </summary>
        public InputList<Inputs.GetTaskExecutionCapacityProviderStrategyInputArgs> CapacityProviderStrategies
        {
            get => _capacityProviderStrategies ?? (_capacityProviderStrategies = new InputList<Inputs.GetTaskExecutionCapacityProviderStrategyInputArgs>());
            set => _capacityProviderStrategies = value;
        }

        /// <summary>
        /// An identifier that you provide to ensure the idempotency of the request. It must be unique and is case sensitive. Up to 64 characters are allowed. The valid characters are characters in the range of 33-126, inclusive. For more information, see [Ensuring idempotency](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/ECS_Idempotency.html).
        /// </summary>
        [Input("clientToken")]
        public Input<string>? ClientToken { get; set; }

        /// <summary>
        /// Short name or full Amazon Resource Name (ARN) of the cluster to run the task on.
        /// </summary>
        [Input("cluster", required: true)]
        public Input<string> Cluster { get; set; } = null!;

        /// <summary>
        /// Number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks for each call.
        /// </summary>
        [Input("desiredCount")]
        public Input<int>? DesiredCount { get; set; }

        /// <summary>
        /// Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
        /// </summary>
        [Input("enableEcsManagedTags")]
        public Input<bool>? EnableEcsManagedTags { get; set; }

        /// <summary>
        /// Specifies whether to enable Amazon ECS Exec for the tasks within the service.
        /// </summary>
        [Input("enableExecuteCommand")]
        public Input<bool>? EnableExecuteCommand { get; set; }

        /// <summary>
        /// Name of the task group to associate with the task. The default value is the family name of the task definition.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Launch type on which to run your service. Valid values are `EC2`, `FARGATE`, and `EXTERNAL`.
        /// </summary>
        [Input("launchType")]
        public Input<string>? LaunchType { get; set; }

        /// <summary>
        /// Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
        /// </summary>
        [Input("networkConfiguration")]
        public Input<Inputs.GetTaskExecutionNetworkConfigurationInputArgs>? NetworkConfiguration { get; set; }

        /// <summary>
        /// A list of container overrides that specify the name of a container in the specified task definition and the overrides it should receive.
        /// </summary>
        [Input("overrides")]
        public Input<Inputs.GetTaskExecutionOverridesInputArgs>? Overrides { get; set; }

        [Input("placementConstraints")]
        private InputList<Inputs.GetTaskExecutionPlacementConstraintInputArgs>? _placementConstraints;

        /// <summary>
        /// An array of placement constraint objects to use for the task. You can specify up to 10 constraints for each task. See below.
        /// </summary>
        public InputList<Inputs.GetTaskExecutionPlacementConstraintInputArgs> PlacementConstraints
        {
            get => _placementConstraints ?? (_placementConstraints = new InputList<Inputs.GetTaskExecutionPlacementConstraintInputArgs>());
            set => _placementConstraints = value;
        }

        [Input("placementStrategies")]
        private InputList<Inputs.GetTaskExecutionPlacementStrategyInputArgs>? _placementStrategies;

        /// <summary>
        /// The placement strategy objects to use for the task. You can specify a maximum of 5 strategy rules for each task. See below.
        /// </summary>
        public InputList<Inputs.GetTaskExecutionPlacementStrategyInputArgs> PlacementStrategies
        {
            get => _placementStrategies ?? (_placementStrategies = new InputList<Inputs.GetTaskExecutionPlacementStrategyInputArgs>());
            set => _placementStrategies = value;
        }

        /// <summary>
        /// The platform version the task uses. A platform version is only specified for tasks hosted on Fargate. If one isn't specified, the `LATEST` platform version is used.
        /// </summary>
        [Input("platformVersion")]
        public Input<string>? PlatformVersion { get; set; }

        /// <summary>
        /// Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags aren't propagated. An error will be received if you specify the `SERVICE` option when running a task. Valid values are `TASK_DEFINITION` or `NONE`.
        /// </summary>
        [Input("propagateTags")]
        public Input<string>? PropagateTags { get; set; }

        /// <summary>
        /// The reference ID to use for the task.
        /// </summary>
        [Input("referenceId")]
        public Input<string>? ReferenceId { get; set; }

        /// <summary>
        /// An optional tag specified when a task is started.
        /// </summary>
        [Input("startedBy")]
        public Input<string>? StartedBy { get; set; }

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
        /// The `family` and `revision` (`family:revision`) or full ARN of the task definition to run. If a revision isn't specified, the latest `ACTIVE` revision is used.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("taskDefinition", required: true)]
        public Input<string> TaskDefinition { get; set; } = null!;

        public GetTaskExecutionInvokeArgs()
        {
        }
        public static new GetTaskExecutionInvokeArgs Empty => new GetTaskExecutionInvokeArgs();
    }


    [OutputType]
    public sealed class GetTaskExecutionResult
    {
        public readonly ImmutableArray<Outputs.GetTaskExecutionCapacityProviderStrategyResult> CapacityProviderStrategies;
        public readonly string? ClientToken;
        public readonly string Cluster;
        public readonly int? DesiredCount;
        public readonly bool? EnableEcsManagedTags;
        public readonly bool? EnableExecuteCommand;
        public readonly string? Group;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? LaunchType;
        public readonly Outputs.GetTaskExecutionNetworkConfigurationResult? NetworkConfiguration;
        public readonly Outputs.GetTaskExecutionOverridesResult? Overrides;
        public readonly ImmutableArray<Outputs.GetTaskExecutionPlacementConstraintResult> PlacementConstraints;
        public readonly ImmutableArray<Outputs.GetTaskExecutionPlacementStrategyResult> PlacementStrategies;
        public readonly string? PlatformVersion;
        public readonly string? PropagateTags;
        public readonly string? ReferenceId;
        public readonly string? StartedBy;
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// A list of the provisioned task ARNs.
        /// </summary>
        public readonly ImmutableArray<string> TaskArns;
        public readonly string TaskDefinition;

        [OutputConstructor]
        private GetTaskExecutionResult(
            ImmutableArray<Outputs.GetTaskExecutionCapacityProviderStrategyResult> capacityProviderStrategies,

            string? clientToken,

            string cluster,

            int? desiredCount,

            bool? enableEcsManagedTags,

            bool? enableExecuteCommand,

            string? group,

            string id,

            string? launchType,

            Outputs.GetTaskExecutionNetworkConfigurationResult? networkConfiguration,

            Outputs.GetTaskExecutionOverridesResult? overrides,

            ImmutableArray<Outputs.GetTaskExecutionPlacementConstraintResult> placementConstraints,

            ImmutableArray<Outputs.GetTaskExecutionPlacementStrategyResult> placementStrategies,

            string? platformVersion,

            string? propagateTags,

            string? referenceId,

            string? startedBy,

            ImmutableDictionary<string, string>? tags,

            ImmutableArray<string> taskArns,

            string taskDefinition)
        {
            CapacityProviderStrategies = capacityProviderStrategies;
            ClientToken = clientToken;
            Cluster = cluster;
            DesiredCount = desiredCount;
            EnableEcsManagedTags = enableEcsManagedTags;
            EnableExecuteCommand = enableExecuteCommand;
            Group = group;
            Id = id;
            LaunchType = launchType;
            NetworkConfiguration = networkConfiguration;
            Overrides = overrides;
            PlacementConstraints = placementConstraints;
            PlacementStrategies = placementStrategies;
            PlatformVersion = platformVersion;
            PropagateTags = propagateTags;
            ReferenceId = referenceId;
            StartedBy = startedBy;
            Tags = tags;
            TaskArns = taskArns;
            TaskDefinition = taskDefinition;
        }
    }
}
