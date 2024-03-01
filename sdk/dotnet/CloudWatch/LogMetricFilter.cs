// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch
{
    /// <summary>
    /// Provides a CloudWatch Log Metric Filter resource.
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
    ///     var dada = new Aws.CloudWatch.LogGroup("dada", new()
    ///     {
    ///         Name = "MyApp/access.log",
    ///     });
    /// 
    ///     var yada = new Aws.CloudWatch.LogMetricFilter("yada", new()
    ///     {
    ///         Name = "MyAppAccessCount",
    ///         Pattern = "",
    ///         LogGroupName = dada.Name,
    ///         MetricTransformation = new Aws.CloudWatch.Inputs.LogMetricFilterMetricTransformationArgs
    ///         {
    ///             Name = "EventCount",
    ///             Namespace = "YourNamespace",
    ///             Value = "1",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import CloudWatch Log Metric Filter using the `log_group_name:name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudwatch/logMetricFilter:LogMetricFilter test /aws/lambda/function:test
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudwatch/logMetricFilter:LogMetricFilter")]
    public partial class LogMetricFilter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the log group to associate the metric filter with.
        /// </summary>
        [Output("logGroupName")]
        public Output<string> LogGroupName { get; private set; } = null!;

        /// <summary>
        /// A block defining collection of information needed to define how metric data gets emitted. See below.
        /// </summary>
        [Output("metricTransformation")]
        public Output<Outputs.LogMetricFilterMetricTransformation> MetricTransformation { get; private set; } = null!;

        /// <summary>
        /// A name for the metric filter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
        /// for extracting metric data out of ingested log events.
        /// </summary>
        [Output("pattern")]
        public Output<string> Pattern { get; private set; } = null!;


        /// <summary>
        /// Create a LogMetricFilter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogMetricFilter(string name, LogMetricFilterArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/logMetricFilter:LogMetricFilter", name, args ?? new LogMetricFilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogMetricFilter(string name, Input<string> id, LogMetricFilterState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/logMetricFilter:LogMetricFilter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogMetricFilter Get(string name, Input<string> id, LogMetricFilterState? state = null, CustomResourceOptions? options = null)
        {
            return new LogMetricFilter(name, id, state, options);
        }
    }

    public sealed class LogMetricFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the log group to associate the metric filter with.
        /// </summary>
        [Input("logGroupName", required: true)]
        public Input<string> LogGroupName { get; set; } = null!;

        /// <summary>
        /// A block defining collection of information needed to define how metric data gets emitted. See below.
        /// </summary>
        [Input("metricTransformation", required: true)]
        public Input<Inputs.LogMetricFilterMetricTransformationArgs> MetricTransformation { get; set; } = null!;

        /// <summary>
        /// A name for the metric filter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
        /// for extracting metric data out of ingested log events.
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        public LogMetricFilterArgs()
        {
        }
        public static new LogMetricFilterArgs Empty => new LogMetricFilterArgs();
    }

    public sealed class LogMetricFilterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the log group to associate the metric filter with.
        /// </summary>
        [Input("logGroupName")]
        public Input<string>? LogGroupName { get; set; }

        /// <summary>
        /// A block defining collection of information needed to define how metric data gets emitted. See below.
        /// </summary>
        [Input("metricTransformation")]
        public Input<Inputs.LogMetricFilterMetricTransformationGetArgs>? MetricTransformation { get; set; }

        /// <summary>
        /// A name for the metric filter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
        /// for extracting metric data out of ingested log events.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        public LogMetricFilterState()
        {
        }
        public static new LogMetricFilterState Empty => new LogMetricFilterState();
    }
}
