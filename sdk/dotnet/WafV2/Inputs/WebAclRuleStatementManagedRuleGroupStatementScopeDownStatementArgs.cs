// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logical rule statement used to combine other rule statements with AND logic. See `and_statement` below for details.
        /// </summary>
        [Input("andStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs>? AndStatement { get; set; }

        /// <summary>
        /// Rule statement that defines a string match search for AWS WAF to apply to web requests. See `byte_match_statement` below for details.
        /// </summary>
        [Input("byteMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs>? ByteMatchStatement { get; set; }

        /// <summary>
        /// Rule statement used to identify web requests based on country of origin. See `geo_match_statement` below for details.
        /// </summary>
        [Input("geoMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs>? GeoMatchStatement { get; set; }

        /// <summary>
        /// Rule statement used to detect web requests coming from particular IP addresses or address ranges. See `ip_set_reference_statement` below for details.
        /// </summary>
        [Input("ipSetReferenceStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementArgs>? IpSetReferenceStatement { get; set; }

        /// <summary>
        /// Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See `label_match_statement` below for details.
        /// </summary>
        [Input("labelMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementLabelMatchStatementArgs>? LabelMatchStatement { get; set; }

        /// <summary>
        /// Logical rule statement used to negate the results of another rule statement. See `not_statement` below for details.
        /// </summary>
        [Input("notStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementArgs>? NotStatement { get; set; }

        /// <summary>
        /// Logical rule statement used to combine other rule statements with OR logic. See `or_statement` below for details.
        /// </summary>
        [Input("orStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementArgs>? OrStatement { get; set; }

        /// <summary>
        /// Rule statement used to search web request components for a match against a single regular expression. See `regex_match_statement` below for details.
        /// </summary>
        [Input("regexMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs>? RegexMatchStatement { get; set; }

        /// <summary>
        /// Rule statement used to search web request components for matches with regular expressions. See `regex_pattern_set_reference_statement` below for details.
        /// </summary>
        [Input("regexPatternSetReferenceStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs>? RegexPatternSetReferenceStatement { get; set; }

        /// <summary>
        /// Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See `size_constraint_statement` below for more details.
        /// </summary>
        [Input("sizeConstraintStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs>? SizeConstraintStatement { get; set; }

        /// <summary>
        /// An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See `sqli_match_statement` below for details.
        /// </summary>
        [Input("sqliMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs>? SqliMatchStatement { get; set; }

        /// <summary>
        /// Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See `xss_match_statement` below for details.
        /// </summary>
        [Input("xssMatchStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs>? XssMatchStatement { get; set; }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs();
    }
}
