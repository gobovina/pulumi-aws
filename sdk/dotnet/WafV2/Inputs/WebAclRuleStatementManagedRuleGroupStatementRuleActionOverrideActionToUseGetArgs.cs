// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allow")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowGetArgs>? Allow { get; set; }

        [Input("block")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs>? Block { get; set; }

        /// <summary>
        /// Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
        /// </summary>
        [Input("captcha")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaGetArgs>? Captcha { get; set; }

        /// <summary>
        /// Instructs AWS WAF to run a check against the request to verify that the request is coming from a legitimate client session. See `challenge` below for details.
        /// </summary>
        [Input("challenge")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeGetArgs>? Challenge { get; set; }

        [Input("count")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountGetArgs>? Count { get; set; }

        public WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs();
    }
}
