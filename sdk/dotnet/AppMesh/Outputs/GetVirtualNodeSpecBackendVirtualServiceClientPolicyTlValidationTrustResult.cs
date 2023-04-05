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
    public sealed class GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustAcmResult> Acms;
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustFileResult> Files;
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSdResult> Sds;

        [OutputConstructor]
        private GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustResult(
            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustAcmResult> acms,

            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustFileResult> files,

            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyTlValidationTrustSdResult> sds)
        {
            Acms = acms;
            Files = files;
            Sds = sds;
        }
    }
}
