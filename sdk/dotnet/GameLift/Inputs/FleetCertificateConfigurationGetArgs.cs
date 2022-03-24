// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GameLift.Inputs
{

    public sealed class FleetCertificateConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether a TLS/SSL certificate is generated for a fleet. Valid values are `DISABLED` and `GENERATED`. Default value is `DISABLED`.
        /// </summary>
        [Input("certificateType")]
        public Input<string>? CertificateType { get; set; }

        public FleetCertificateConfigurationGetArgs()
        {
        }
    }
}
