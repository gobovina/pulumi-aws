// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Mwaa.Inputs
{

    public sealed class EnvironmentLoggingConfigurationSchedulerLogsArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudWatchLogGroupArn")]
        public Input<string>? CloudWatchLogGroupArn { get; set; }

        /// <summary>
        /// Enabling or disabling the collection of logs
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
        /// </summary>
        [Input("logLevel")]
        public Input<string>? LogLevel { get; set; }

        public EnvironmentLoggingConfigurationSchedulerLogsArgs()
        {
        }
        public static new EnvironmentLoggingConfigurationSchedulerLogsArgs Empty => new EnvironmentLoggingConfigurationSchedulerLogsArgs();
    }
}
