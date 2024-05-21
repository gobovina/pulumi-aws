// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Amplify.Outputs
{

    [OutputType]
    public sealed class DomainAssociationSubDomain
    {
        /// <summary>
        /// Branch name setting for the subdomain.
        /// </summary>
        public readonly string BranchName;
        /// <summary>
        /// DNS record for the subdomain in a space-prefixed and space-delimited format (` CNAME &lt;target&gt;`).
        /// </summary>
        public readonly string? DnsRecord;
        /// <summary>
        /// Prefix setting for the subdomain.
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// Verified status of the subdomain.
        /// </summary>
        public readonly bool? Verified;

        [OutputConstructor]
        private DomainAssociationSubDomain(
            string branchName,

            string? dnsRecord,

            string prefix,

            bool? verified)
        {
            BranchName = branchName;
            DnsRecord = dnsRecord;
            Prefix = prefix;
            Verified = verified;
        }
    }
}
