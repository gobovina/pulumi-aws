// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rbin.Inputs
{

    public sealed class RuleResourceTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tag key.
        /// </summary>
        [Input("resourceTagKey", required: true)]
        public Input<string> ResourceTagKey { get; set; } = null!;

        /// <summary>
        /// The tag value.
        /// </summary>
        [Input("resourceTagValue")]
        public Input<string>? ResourceTagValue { get; set; }

        public RuleResourceTagGetArgs()
        {
        }
        public static new RuleResourceTagGetArgs Empty => new RuleResourceTagGetArgs();
    }
}
