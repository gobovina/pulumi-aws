// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A friendly name of the rule group.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the custom header.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs()
        {
        }
        public static new RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs Empty => new RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs();
    }
}
