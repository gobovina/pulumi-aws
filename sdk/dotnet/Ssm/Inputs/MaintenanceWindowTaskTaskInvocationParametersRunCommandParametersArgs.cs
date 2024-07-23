// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm.Inputs
{

    public sealed class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration options for sending command output to CloudWatch Logs. Documented below.
        /// </summary>
        [Input("cloudwatchConfig")]
        public Input<Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs>? CloudwatchConfig { get; set; }

        /// <summary>
        /// Information about the command(s) to execute.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
        /// </summary>
        [Input("documentHash")]
        public Input<string>? DocumentHash { get; set; }

        /// <summary>
        /// SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
        /// </summary>
        [Input("documentHashType")]
        public Input<string>? DocumentHashType { get; set; }

        /// <summary>
        /// The version of an Automation document to use during task execution.
        /// </summary>
        [Input("documentVersion")]
        public Input<string>? DocumentVersion { get; set; }

        /// <summary>
        /// Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
        /// </summary>
        [Input("notificationConfig")]
        public Input<Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs>? NotificationConfig { get; set; }

        /// <summary>
        /// The name of the Amazon S3 bucket.
        /// </summary>
        [Input("outputS3Bucket")]
        public Input<string>? OutputS3Bucket { get; set; }

        /// <summary>
        /// The Amazon S3 bucket subfolder.
        /// </summary>
        [Input("outputS3KeyPrefix")]
        public Input<string>? OutputS3KeyPrefix { get; set; }

        [Input("parameters")]
        private InputList<Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>? _parameters;

        /// <summary>
        /// The parameters for the RUN_COMMAND task execution. Documented below.
        /// </summary>
        public InputList<Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
        /// </summary>
        [Input("serviceRoleArn")]
        public Input<string>? ServiceRoleArn { get; set; }

        /// <summary>
        /// If this time is reached and the command has not already started executing, it doesn't run.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs()
        {
        }
        public static new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs Empty => new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs();
    }
}
