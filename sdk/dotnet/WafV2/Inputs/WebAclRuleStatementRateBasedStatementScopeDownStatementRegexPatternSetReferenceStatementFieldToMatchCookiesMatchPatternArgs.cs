// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An empty configuration block that is used for inspecting all headers.
        /// </summary>
        [Input("all")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs>? All { get; set; }

        [Input("excludedCookies")]
        private InputList<string>? _excludedCookies;
        public InputList<string> ExcludedCookies
        {
            get => _excludedCookies ?? (_excludedCookies = new InputList<string>());
            set => _excludedCookies = value;
        }

        [Input("includedCookies")]
        private InputList<string>? _includedCookies;
        public InputList<string> IncludedCookies
        {
            get => _includedCookies ?? (_includedCookies = new InputList<string>());
            set => _includedCookies = value;
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs()
        {
        }
        public static new WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs Empty => new WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs();
    }
}
