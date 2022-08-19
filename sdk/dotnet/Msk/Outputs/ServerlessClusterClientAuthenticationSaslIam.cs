// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Outputs
{

    [OutputType]
    public sealed class ServerlessClusterClientAuthenticationSaslIam
    {
        /// <summary>
        /// Whether SASL/IAM authentication is enabled or not.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private ServerlessClusterClientAuthenticationSaslIam(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
