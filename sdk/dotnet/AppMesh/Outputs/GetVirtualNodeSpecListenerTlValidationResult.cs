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
    public sealed class GetVirtualNodeSpecListenerTlValidationResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecListenerTlValidationSubjectAlternativeNameResult> SubjectAlternativeNames;
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecListenerTlValidationTrustResult> Trusts;

        [OutputConstructor]
        private GetVirtualNodeSpecListenerTlValidationResult(
            ImmutableArray<Outputs.GetVirtualNodeSpecListenerTlValidationSubjectAlternativeNameResult> subjectAlternativeNames,

            ImmutableArray<Outputs.GetVirtualNodeSpecListenerTlValidationTrustResult> trusts)
        {
            SubjectAlternativeNames = subjectAlternativeNames;
            Trusts = trusts;
        }
    }
}
