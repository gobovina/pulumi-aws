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
    public sealed class GetVirtualGatewaySpecListenerTlCertificateFileResult
    {
        public readonly string CertificateChain;
        public readonly string PrivateKey;

        [OutputConstructor]
        private GetVirtualGatewaySpecListenerTlCertificateFileResult(
            string certificateChain,

            string privateKey)
        {
            CertificateChain = certificateChain;
            PrivateKey = privateKey;
        }
    }
}
