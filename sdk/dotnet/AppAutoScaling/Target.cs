// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppAutoScaling
{
    /// <summary>
    /// Provides an Application AutoScaling ScalableTarget resource. To manage policies which get attached to the target, see the `aws.appautoscaling.Policy` resource.
    /// 
    /// &gt; **NOTE:** Scalable targets created before 2023-03-20 may not have an assigned `arn`. These resource cannot use `tags` or participate in `default_tags`. To prevent `pulumi preview` showing differences that can never be reconciled, use the `lifecycle.ignore_changes` meta-argument. See the example below.
    /// 
    /// &gt; **NOTE:** The [Application Auto Scaling service automatically attempts to manage IAM Service-Linked Roles](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) when registering certain service namespaces for the first time. To manually manage this role, see the `aws.iam.ServiceLinkedRole` resource.
    /// 
    /// ## Example Usage
    /// 
    /// ### DynamoDB Table Autoscaling
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
    ///     var dynamodbTableReadTarget = new Aws.AppAutoScaling.Target("dynamodb_table_read_target", new()
    ///     {
    ///         MaxCapacity = 100,
    ///         MinCapacity = 5,
    ///         ResourceId = $"table/{example.Name}",
    ///         ScalableDimension = "dynamodb:table:ReadCapacityUnits",
    ///         ServiceNamespace = "dynamodb",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### DynamoDB Index Autoscaling
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
    ///     var dynamodbIndexReadTarget = new Aws.AppAutoScaling.Target("dynamodb_index_read_target", new()
    ///     {
    ///         MaxCapacity = 100,
    ///         MinCapacity = 5,
    ///         ResourceId = $"table/{example.Name}/index/{indexName}",
    ///         ScalableDimension = "dynamodb:index:ReadCapacityUnits",
    ///         ServiceNamespace = "dynamodb",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### ECS Service Autoscaling
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
    ///     var ecsTarget = new Aws.AppAutoScaling.Target("ecs_target", new()
    ///     {
    ///         MaxCapacity = 4,
    ///         MinCapacity = 1,
    ///         ResourceId = $"service/{example.Name}/{exampleAwsEcsService.Name}",
    ///         ScalableDimension = "ecs:service:DesiredCount",
    ///         ServiceNamespace = "ecs",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Aurora Read Replica Autoscaling
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
    ///     var replicas = new Aws.AppAutoScaling.Target("replicas", new()
    ///     {
    ///         ServiceNamespace = "rds",
    ///         ScalableDimension = "rds:cluster:ReadReplicaCount",
    ///         ResourceId = $"cluster:{example.Id}",
    ///         MinCapacity = 1,
    ///         MaxCapacity = 15,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Suppressing `tags_all` Differences For Older Resources
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
    ///     var ecsTarget = new Aws.AppAutoScaling.Target("ecs_target", new()
    ///     {
    ///         MaxCapacity = 4,
    ///         MinCapacity = 1,
    ///         ResourceId = $"service/{example.Name}/{exampleAwsEcsService.Name}",
    ///         ScalableDimension = "ecs:service:DesiredCount",
    ///         ServiceNamespace = "ecs",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### MSK / Kafka Autoscaling
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
    ///     var mskTarget = new Aws.AppAutoScaling.Target("msk_target", new()
    ///     {
    ///         ServiceNamespace = "kafka",
    ///         ScalableDimension = "kafka:broker-storage:VolumeSize",
    ///         ResourceId = example.Arn,
    ///         MinCapacity = 1,
    ///         MaxCapacity = 8,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Application AutoScaling Target using the `service-namespace` , `resource-id` and `scalable-dimension` separated by `/`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:appautoscaling/target:Target test-target service-namespace/resource-id/scalable-dimension
    /// ```
    /// </summary>
    [AwsResourceType("aws:appautoscaling/target:Target")]
    public partial class Target : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the scalable target.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Max capacity of the scalable target.
        /// </summary>
        [Output("maxCapacity")]
        public Output<int> MaxCapacity { get; private set; } = null!;

        /// <summary>
        /// Min capacity of the scalable target.
        /// </summary>
        [Output("minCapacity")]
        public Output<int> MinCapacity { get; private set; } = null!;

        /// <summary>
        /// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Output("scalableDimension")]
        public Output<string> ScalableDimension { get; private set; } = null!;

        /// <summary>
        /// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Output("serviceNamespace")]
        public Output<string> ServiceNamespace { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the scalable target. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Target resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Target(string name, TargetArgs args, CustomResourceOptions? options = null)
            : base("aws:appautoscaling/target:Target", name, args ?? new TargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Target(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
            : base("aws:appautoscaling/target:Target", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Target resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Target Get(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
        {
            return new Target(name, id, state, options);
        }
    }

    public sealed class TargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Max capacity of the scalable target.
        /// </summary>
        [Input("maxCapacity", required: true)]
        public Input<int> MaxCapacity { get; set; } = null!;

        /// <summary>
        /// Min capacity of the scalable target.
        /// </summary>
        [Input("minCapacity", required: true)]
        public Input<int> MinCapacity { get; set; } = null!;

        /// <summary>
        /// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        /// <summary>
        /// ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("scalableDimension", required: true)]
        public Input<string> ScalableDimension { get; set; } = null!;

        /// <summary>
        /// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("serviceNamespace", required: true)]
        public Input<string> ServiceNamespace { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the scalable target. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public TargetArgs()
        {
        }
        public static new TargetArgs Empty => new TargetArgs();
    }

    public sealed class TargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the scalable target.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Max capacity of the scalable target.
        /// </summary>
        [Input("maxCapacity")]
        public Input<int>? MaxCapacity { get; set; }

        /// <summary>
        /// Min capacity of the scalable target.
        /// </summary>
        [Input("minCapacity")]
        public Input<int>? MinCapacity { get; set; }

        /// <summary>
        /// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("scalableDimension")]
        public Input<string>? ScalableDimension { get; set; }

        /// <summary>
        /// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
        /// </summary>
        [Input("serviceNamespace")]
        public Input<string>? ServiceNamespace { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the scalable target. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public TargetState()
        {
        }
        public static new TargetState Empty => new TargetState();
    }
}
