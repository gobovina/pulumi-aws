// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub.Inputs
{

    public sealed class InsightFiltersResourceTagGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comparison", required: true)]
        public Input<string> Comparison { get; set; } = null!;

        /// <summary>
        /// The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public InsightFiltersResourceTagGetArgs()
        {
        }
        public static new InsightFiltersResourceTagGetArgs Empty => new InsightFiltersResourceTagGetArgs();
    }
}
