// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("items")]
        private InputList<string>? _items;

        /// <summary>
        /// List of item names, such as cookies, headers, or query strings.
        /// </summary>
        public InputList<string> Items
        {
            get => _items ?? (_items = new InputList<string>());
            set => _items = value;
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs()
        {
        }
        public static new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs Empty => new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs();
    }
}
