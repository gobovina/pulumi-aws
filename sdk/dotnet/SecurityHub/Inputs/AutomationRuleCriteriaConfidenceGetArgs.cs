// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub.Inputs
{

    public sealed class AutomationRuleCriteriaConfidenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The equal-to condition to be applied to a single field when querying for findings, provided as a String.
        /// </summary>
        [Input("eq")]
        public Input<double>? Eq { get; set; }

        [Input("gt")]
        public Input<double>? Gt { get; set; }

        /// <summary>
        /// The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
        /// </summary>
        [Input("gte")]
        public Input<double>? Gte { get; set; }

        [Input("lt")]
        public Input<double>? Lt { get; set; }

        /// <summary>
        /// The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
        /// </summary>
        [Input("lte")]
        public Input<double>? Lte { get; set; }

        public AutomationRuleCriteriaConfidenceGetArgs()
        {
        }
        public static new AutomationRuleCriteriaConfidenceGetArgs Empty => new AutomationRuleCriteriaConfidenceGetArgs();
    }
}
