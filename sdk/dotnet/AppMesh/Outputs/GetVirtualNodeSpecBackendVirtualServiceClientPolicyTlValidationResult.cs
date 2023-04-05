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
    public sealed class GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameResult> SubjectAlternativeNames;
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustResult> Trusts;

        [OutputConstructor]
        private GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationResult(
            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameResult> subjectAlternativeNames,

            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustResult> trusts)
        {
            SubjectAlternativeNames = subjectAlternativeNames;
            Trusts = trusts;
        }
    }
}
