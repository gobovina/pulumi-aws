// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class RoutingProfileQueueConfigsAssociated
    {
        /// <summary>
        /// Specifies the channels that agents can handle in the Contact Control Panel (CCP). Valid values are `VOICE`, `CHAT`, `TASK`.
        /// </summary>
        public readonly string? Channel;
        /// <summary>
        /// Specifies the delay, in seconds, that a contact should be in the queue before they are routed to an available agent
        /// </summary>
        public readonly int? Delay;
        /// <summary>
        /// Specifies the order in which contacts are to be handled for the queue.
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Specifies the ARN for the queue.
        /// </summary>
        public readonly string? QueueArn;
        /// <summary>
        /// Specifies the identifier for the queue.
        /// </summary>
        public readonly string? QueueId;
        /// <summary>
        /// Specifies the name for the queue.
        /// </summary>
        public readonly string? QueueName;

        [OutputConstructor]
        private RoutingProfileQueueConfigsAssociated(
            string? channel,

            int? delay,

            int? priority,

            string? queueArn,

            string? queueId,

            string? queueName)
        {
            Channel = channel;
            Delay = delay;
            Priority = priority;
            QueueArn = queueArn;
            QueueId = queueId;
            QueueName = queueName;
        }
    }
}
