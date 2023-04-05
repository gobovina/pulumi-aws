// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeNameResult> SubjectAlternativeNames;
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrustResult> Trusts;

        [OutputConstructor]
        private GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationResult(
            ImmutableArray<Outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationSubjectAlternativeNameResult> subjectAlternativeNames,

            ImmutableArray<Outputs.GetVirtualNodeSpecBackendDefaultClientPolicyTlValidationTrustResult> trusts)
        {
            SubjectAlternativeNames = subjectAlternativeNames;
            Trusts = trusts;
        }
    }
}
