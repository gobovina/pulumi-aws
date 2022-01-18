// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class InstanceMetadataOptions
    {
        /// <summary>
        /// Whether the metadata service is available. Valid values include `enabled` or `disabled`. Defaults to `enabled`.
        /// </summary>
        public readonly string? HttpEndpoint;
        /// <summary>
        /// Desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values are integer from `1` to `64`. Defaults to `1`.
        /// </summary>
        public readonly int? HttpPutResponseHopLimit;
        /// <summary>
        /// Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Valid values include `optional` or `required`. Defaults to `optional`.
        /// </summary>
        public readonly string? HttpTokens;
        /// <summary>
        /// Enables or disables access to instance tags from the instance metadata service. Valid values include `enabled` or `disabled`. Defaults to `disabled`.
        /// </summary>
        public readonly string? InstanceMetadataTags;

        [OutputConstructor]
        private InstanceMetadataOptions(
            string? httpEndpoint,

            int? httpPutResponseHopLimit,

            string? httpTokens,

            string? instanceMetadataTags)
        {
            HttpEndpoint = httpEndpoint;
            HttpPutResponseHopLimit = httpPutResponseHopLimit;
            HttpTokens = httpTokens;
            InstanceMetadataTags = instanceMetadataTags;
        }
    }
}
