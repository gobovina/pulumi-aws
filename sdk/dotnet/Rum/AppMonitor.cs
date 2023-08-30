// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rum
{
    /// <summary>
    /// Provides a CloudWatch RUM App Monitor resource.
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
    ///     var example = new Aws.Rum.AppMonitor("example", new()
    ///     {
    ///         Domain = "localhost",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Cloudwatch RUM App Monitor using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:rum/appMonitor:AppMonitor example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:rum/appMonitor:AppMonitor")]
    public partial class AppMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// configuration data for the app monitor. See app_monitor_configuration below.
        /// </summary>
        [Output("appMonitorConfiguration")]
        public Output<Outputs.AppMonitorAppMonitorConfiguration> AppMonitorConfiguration { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the app monitor. Useful for JS templates.
        /// </summary>
        [Output("appMonitorId")]
        public Output<string> AppMonitorId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) specifying the app monitor.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See custom_events below.
        /// </summary>
        [Output("customEvents")]
        public Output<Outputs.AppMonitorCustomEvents> CustomEvents { get; private set; } = null!;

        /// <summary>
        /// Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter  specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. Default value is `false`.
        /// </summary>
        [Output("cwLogEnabled")]
        public Output<bool?> CwLogEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the log group where the copies are stored.
        /// </summary>
        [Output("cwLogGroup")]
        public Output<string> CwLogGroup { get; private set; } = null!;

        /// <summary>
        /// The top-level internet domain name for which your application has administrative authority.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The name of the log stream.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a AppMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppMonitor(string name, AppMonitorArgs args, CustomResourceOptions? options = null)
            : base("aws:rum/appMonitor:AppMonitor", name, args ?? new AppMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppMonitor(string name, Input<string> id, AppMonitorState? state = null, CustomResourceOptions? options = null)
            : base("aws:rum/appMonitor:AppMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppMonitor Get(string name, Input<string> id, AppMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new AppMonitor(name, id, state, options);
        }
    }

    public sealed class AppMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// configuration data for the app monitor. See app_monitor_configuration below.
        /// </summary>
        [Input("appMonitorConfiguration")]
        public Input<Inputs.AppMonitorAppMonitorConfigurationArgs>? AppMonitorConfiguration { get; set; }

        /// <summary>
        /// Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See custom_events below.
        /// </summary>
        [Input("customEvents")]
        public Input<Inputs.AppMonitorCustomEventsArgs>? CustomEvents { get; set; }

        /// <summary>
        /// Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter  specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. Default value is `false`.
        /// </summary>
        [Input("cwLogEnabled")]
        public Input<bool>? CwLogEnabled { get; set; }

        /// <summary>
        /// The top-level internet domain name for which your application has administrative authority.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The name of the log stream.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AppMonitorArgs()
        {
        }
        public static new AppMonitorArgs Empty => new AppMonitorArgs();
    }

    public sealed class AppMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// configuration data for the app monitor. See app_monitor_configuration below.
        /// </summary>
        [Input("appMonitorConfiguration")]
        public Input<Inputs.AppMonitorAppMonitorConfigurationGetArgs>? AppMonitorConfiguration { get; set; }

        /// <summary>
        /// The unique ID of the app monitor. Useful for JS templates.
        /// </summary>
        [Input("appMonitorId")]
        public Input<string>? AppMonitorId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) specifying the app monitor.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See custom_events below.
        /// </summary>
        [Input("customEvents")]
        public Input<Inputs.AppMonitorCustomEventsGetArgs>? CustomEvents { get; set; }

        /// <summary>
        /// Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter  specifies whether RUM sends a copy of this telemetry data to Amazon CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur Amazon CloudWatch Logs charges. Default value is `false`.
        /// </summary>
        [Input("cwLogEnabled")]
        public Input<bool>? CwLogEnabled { get; set; }

        /// <summary>
        /// The name of the log group where the copies are stored.
        /// </summary>
        [Input("cwLogGroup")]
        public Input<string>? CwLogGroup { get; set; }

        /// <summary>
        /// The top-level internet domain name for which your application has administrative authority.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The name of the log stream.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public AppMonitorState()
        {
        }
        public static new AppMonitorState Empty => new AppMonitorState();
    }
}
