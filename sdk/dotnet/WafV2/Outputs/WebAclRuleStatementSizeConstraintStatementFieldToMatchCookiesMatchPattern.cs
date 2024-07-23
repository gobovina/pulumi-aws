// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern
    {
        /// <summary>
        /// An empty configuration block that is used for inspecting all headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll? All;
        public readonly ImmutableArray<string> ExcludedCookies;
        public readonly ImmutableArray<string> IncludedCookies;

        [OutputConstructor]
        private WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPattern(
            Outputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAll? all,

            ImmutableArray<string> excludedCookies,

            ImmutableArray<string> includedCookies)
        {
            All = all;
            ExcludedCookies = excludedCookies;
            IncludedCookies = includedCookies;
        }
    }
}
