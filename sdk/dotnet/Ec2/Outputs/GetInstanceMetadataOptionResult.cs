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
    public sealed class GetInstanceMetadataOptionResult
    {
        /// <summary>
        /// The state of the metadata service: `enabled`, `disabled`.
        /// </summary>
        public readonly string HttpEndpoint;
        /// <summary>
        /// The desired HTTP PUT response hop limit for instance metadata requests.
        /// </summary>
        public readonly int HttpPutResponseHopLimit;
        /// <summary>
        /// If session tokens are required: `optional`, `required`.
        /// </summary>
        public readonly string HttpTokens;
        /// <summary>
        /// If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
        /// </summary>
        public readonly string InstanceMetadataTags;

        [OutputConstructor]
        private GetInstanceMetadataOptionResult(
            string httpEndpoint,

            int httpPutResponseHopLimit,

            string httpTokens,

            string instanceMetadataTags)
        {
            HttpEndpoint = httpEndpoint;
            HttpPutResponseHopLimit = httpPutResponseHopLimit;
            HttpTokens = httpTokens;
            InstanceMetadataTags = instanceMetadataTags;
        }
    }
}
