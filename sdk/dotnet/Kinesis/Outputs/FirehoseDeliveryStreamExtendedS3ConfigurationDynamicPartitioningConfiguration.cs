// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Outputs
{

    [OutputType]
    public sealed class FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration
    {
        /// <summary>
        /// Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
        /// </summary>
        public readonly int? RetryDuration;

        [OutputConstructor]
        private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration(
            bool? enabled,

            int? retryDuration)
        {
            Enabled = enabled;
            RetryDuration = retryDuration;
        }
    }
}
