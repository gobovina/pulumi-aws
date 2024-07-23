// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeSourceParametersManagedStreamingKafkaParameters
    {
        /// <summary>
        /// The maximum number of records to include in each batch. Maximum value of 10000.
        /// </summary>
        public readonly int? BatchSize;
        /// <summary>
        /// The name of the destination queue to consume. Maximum value of 200.
        /// </summary>
        public readonly string? ConsumerGroupId;
        /// <summary>
        /// The credentials needed to access the resource. Detailed below.
        /// </summary>
        public readonly Outputs.PipeSourceParametersManagedStreamingKafkaParametersCredentials? Credentials;
        /// <summary>
        /// The maximum length of a time to wait for events. Maximum value of 300.
        /// </summary>
        public readonly int? MaximumBatchingWindowInSeconds;
        /// <summary>
        /// The position in a stream from which to start reading. Valid values: TRIM_HORIZON, LATEST.
        /// </summary>
        public readonly string? StartingPosition;
        /// <summary>
        /// The name of the topic that the pipe will read from. Maximum length of 249.
        /// </summary>
        public readonly string TopicName;

        [OutputConstructor]
        private PipeSourceParametersManagedStreamingKafkaParameters(
            int? batchSize,

            string? consumerGroupId,

            Outputs.PipeSourceParametersManagedStreamingKafkaParametersCredentials? credentials,

            int? maximumBatchingWindowInSeconds,

            string? startingPosition,

            string topicName)
        {
            BatchSize = batchSize;
            ConsumerGroupId = consumerGroupId;
            Credentials = credentials;
            MaximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            StartingPosition = startingPosition;
            TopicName = topicName;
        }
    }
}
