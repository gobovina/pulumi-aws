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
    public sealed class GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameMatchResult> Matches;

        [OutputConstructor]
        private GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameResult(ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationSubjectAlternativeNameMatchResult> matches)
        {
            Matches = matches;
        }
    }
}
