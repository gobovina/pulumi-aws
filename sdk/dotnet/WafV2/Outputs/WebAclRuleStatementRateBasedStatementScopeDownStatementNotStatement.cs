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
    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatement
    {
        /// <summary>
        /// The statements to combine.
        /// </summary>
        public readonly ImmutableArray<Outputs.WebAclRuleStatement> Statements;

        [OutputConstructor]
        private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatement(ImmutableArray<Outputs.WebAclRuleStatement> statements)
        {
            Statements = statements;
        }
    }
}
