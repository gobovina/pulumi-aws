// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class InstanceMetadataOptionsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the metadata service is available. Valid values include `enabled` or `disabled`. Defaults to `enabled`.
        /// </summary>
        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        /// <summary>
        /// Desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values are integer from `1` to `64`. Defaults to `1`.
        /// </summary>
        [Input("httpPutResponseHopLimit")]
        public Input<int>? HttpPutResponseHopLimit { get; set; }

        /// <summary>
        /// Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Valid values include `optional` or `required`. Defaults to `optional`.
        /// </summary>
        [Input("httpTokens")]
        public Input<string>? HttpTokens { get; set; }

        /// <summary>
        /// Enables or disables access to instance tags from the instance metadata service. Valid values include `enabled` or `disabled`. Defaults to `disabled`.
        /// </summary>
        [Input("instanceMetadataTags")]
        public Input<string>? InstanceMetadataTags { get; set; }

        public InstanceMetadataOptionsGetArgs()
        {
        }
    }
}
