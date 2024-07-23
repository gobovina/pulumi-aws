// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Outputs
{

    [OutputType]
    public sealed class DistributionOriginCustomOriginConfig
    {
        /// <summary>
        /// HTTP port the custom origin listens on.
        /// </summary>
        public readonly int HttpPort;
        /// <summary>
        /// HTTPS port the custom origin listens on.
        /// </summary>
        public readonly int HttpsPort;
        /// <summary>
        /// The Custom KeepAlive timeout, in seconds. By default, AWS enforces an upper limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout). Defaults to `5`.
        /// </summary>
        public readonly int? OriginKeepaliveTimeout;
        /// <summary>
        /// Origin protocol policy to apply to your origin. One of `http-only`, `https-only`, or `match-viewer`.
        /// </summary>
        public readonly string OriginProtocolPolicy;
        /// <summary>
        /// The Custom Read timeout, in seconds. By default, AWS enforces an upper limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout). Defaults to `30`.
        /// </summary>
        public readonly int? OriginReadTimeout;
        /// <summary>
        /// List of SSL/TLS protocols that CloudFront can use when connecting to your origin over HTTPS. Valid values: `SSLv3`, `TLSv1`, `TLSv1.1`, `TLSv1.2`. For more information, see [Minimum Origin SSL Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols) in the Amazon CloudFront Developer Guide.
        /// </summary>
        public readonly ImmutableArray<string> OriginSslProtocols;

        [OutputConstructor]
        private DistributionOriginCustomOriginConfig(
            int httpPort,

            int httpsPort,

            int? originKeepaliveTimeout,

            string originProtocolPolicy,

            int? originReadTimeout,

            ImmutableArray<string> originSslProtocols)
        {
            HttpPort = httpPort;
            HttpsPort = httpsPort;
            OriginKeepaliveTimeout = originKeepaliveTimeout;
            OriginProtocolPolicy = originProtocolPolicy;
            OriginReadTimeout = originReadTimeout;
            OriginSslProtocols = originSslProtocols;
        }
    }
}
