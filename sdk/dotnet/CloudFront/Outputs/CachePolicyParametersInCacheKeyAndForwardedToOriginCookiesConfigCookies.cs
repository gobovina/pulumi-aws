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
    public sealed class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies
    {
        /// <summary>
        /// List of item names, such as cookies, headers, or query strings.
        /// </summary>
        public readonly ImmutableArray<string> Items;

        [OutputConstructor]
        private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies(ImmutableArray<string> items)
        {
            Items = items;
        }
    }
}
