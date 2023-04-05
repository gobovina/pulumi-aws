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
    public sealed class GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustAcmResult> Acms;
        public readonly ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustFileResult> Files;
        public readonly ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustSdResult> Sds;

        [OutputConstructor]
        private GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustResult(
            ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustAcmResult> acms,

            ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustFileResult> files,

            ImmutableArray<Outputs.GetVirtualGatewaySpecBackendDefaultClientPolicyTlValidationTrustSdResult> sds)
        {
            Acms = acms;
            Files = files;
            Sds = sds;
        }
    }
}
