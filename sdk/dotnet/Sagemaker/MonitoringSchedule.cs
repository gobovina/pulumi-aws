// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker monitoring schedule resource.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
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
    ///     var test = new Aws.Sagemaker.MonitoringSchedule("test", new()
    ///     {
    ///         Name = "my-monitoring-schedule",
    ///         MonitoringScheduleConfig = new Aws.Sagemaker.Inputs.MonitoringScheduleMonitoringScheduleConfigArgs
    ///         {
    ///             MonitoringJobDefinitionName = testAwsSagemakerDataQualityJobDefinition.Name,
    ///             MonitoringType = "DataQuality",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import monitoring schedules using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:sagemaker/monitoringSchedule:MonitoringSchedule test_monitoring_schedule monitoring-schedule-foo
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/monitoringSchedule:MonitoringSchedule")]
    public partial class MonitoringSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        /// </summary>
        [Output("monitoringScheduleConfig")]
        public Output<Outputs.MonitoringScheduleMonitoringScheduleConfig> MonitoringScheduleConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a MonitoringSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitoringSchedule(string name, MonitoringScheduleArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/monitoringSchedule:MonitoringSchedule", name, args ?? new MonitoringScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MonitoringSchedule(string name, Input<string> id, MonitoringScheduleState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/monitoringSchedule:MonitoringSchedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MonitoringSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitoringSchedule Get(string name, Input<string> id, MonitoringScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitoringSchedule(name, id, state, options);
        }
    }

    public sealed class MonitoringScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        /// </summary>
        [Input("monitoringScheduleConfig", required: true)]
        public Input<Inputs.MonitoringScheduleMonitoringScheduleConfigArgs> MonitoringScheduleConfig { get; set; } = null!;

        /// <summary>
        /// The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public MonitoringScheduleArgs()
        {
        }
        public static new MonitoringScheduleArgs Empty => new MonitoringScheduleArgs();
    }

    public sealed class MonitoringScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this monitoring schedule.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The configuration object that specifies the monitoring schedule and defines the monitoring job. Fields are documented below.
        /// </summary>
        [Input("monitoringScheduleConfig")]
        public Input<Inputs.MonitoringScheduleMonitoringScheduleConfigGetArgs>? MonitoringScheduleConfig { get; set; }

        /// <summary>
        /// The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public MonitoringScheduleState()
        {
        }
        public static new MonitoringScheduleState Empty => new MonitoringScheduleState();
    }
}
