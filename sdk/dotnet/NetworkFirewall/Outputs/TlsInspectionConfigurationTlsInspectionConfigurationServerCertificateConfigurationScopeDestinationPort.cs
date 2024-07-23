// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Outputs
{

    [OutputType]
    public sealed class TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPort
    {
        /// <summary>
        /// The lower limit of the port range. This must be less than or equal to the `to_port`.
        /// </summary>
        public readonly int FromPort;
        /// <summary>
        /// The upper limit of the port range. This must be greater than or equal to the `from_port`.
        /// </summary>
        public readonly int ToPort;

        [OutputConstructor]
        private TlsInspectionConfigurationTlsInspectionConfigurationServerCertificateConfigurationScopeDestinationPort(
            int fromPort,

            int toPort)
        {
            FromPort = fromPort;
            ToPort = toPort;
        }
    }
}
