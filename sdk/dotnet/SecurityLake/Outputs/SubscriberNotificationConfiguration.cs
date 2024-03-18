// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake.Outputs
{

    [OutputType]
    public sealed class SubscriberNotificationConfiguration
    {
        /// <summary>
        /// The configurations for HTTPS subscriber notification.
        /// </summary>
        public readonly Outputs.SubscriberNotificationConfigurationHttpsNotificationConfiguration? HttpsNotificationConfiguration;
        /// <summary>
        /// The configurations for SQS subscriber notification.
        /// </summary>
        public readonly Outputs.SubscriberNotificationConfigurationSqsNotificationConfiguration? SqsNotificationConfiguration;

        [OutputConstructor]
        private SubscriberNotificationConfiguration(
            Outputs.SubscriberNotificationConfigurationHttpsNotificationConfiguration? httpsNotificationConfiguration,

            Outputs.SubscriberNotificationConfigurationSqsNotificationConfiguration? sqsNotificationConfiguration)
        {
            HttpsNotificationConfiguration = httpsNotificationConfiguration;
            SqsNotificationConfiguration = sqsNotificationConfiguration;
        }
    }
}
