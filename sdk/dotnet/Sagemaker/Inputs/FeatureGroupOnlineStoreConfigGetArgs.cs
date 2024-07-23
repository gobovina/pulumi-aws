// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class FeatureGroupOnlineStoreConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to `true` to disable the automatic creation of an AWS Glue table when configuring an OfflineStore.
        /// </summary>
        [Input("enableOnlineStore")]
        public Input<bool>? EnableOnlineStore { get; set; }

        /// <summary>
        /// Security config for at-rest encryption of your OnlineStore. See Security Config Below.
        /// </summary>
        [Input("securityConfig")]
        public Input<Inputs.FeatureGroupOnlineStoreConfigSecurityConfigGetArgs>? SecurityConfig { get; set; }

        /// <summary>
        /// Option for different tiers of low latency storage for real-time data retrieval. Valid values are `Standard`, or `InMemory`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// Time to live duration, where the record is hard deleted after the expiration time is reached; ExpiresAt = EventTime + TtlDuration.. See TTl Duration Below.
        /// </summary>
        [Input("ttlDuration")]
        public Input<Inputs.FeatureGroupOnlineStoreConfigTtlDurationGetArgs>? TtlDuration { get; set; }

        public FeatureGroupOnlineStoreConfigGetArgs()
        {
        }
        public static new FeatureGroupOnlineStoreConfigGetArgs Empty => new FeatureGroupOnlineStoreConfigGetArgs();
    }
}
