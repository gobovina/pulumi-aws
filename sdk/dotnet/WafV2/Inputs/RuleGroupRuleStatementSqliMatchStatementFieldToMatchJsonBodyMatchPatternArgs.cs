// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty configuration block that is used for inspecting all headers.
        /// </summary>
        [Input("all")]
        public Input<Inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs>? All { get; set; }

        [Input("includedPaths")]
        private InputList<string>? _includedPaths;
        public InputList<string> IncludedPaths
        {
            get => _includedPaths ?? (_includedPaths = new InputList<string>());
            set => _includedPaths = value;
        }

        public RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs()
        {
        }
        public static new RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs Empty => new RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs();
    }
}
