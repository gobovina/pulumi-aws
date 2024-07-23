// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeSourceParametersSelfManagedKafkaParametersCredentials
    {
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        public readonly string? BasicAuth;
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        public readonly string? ClientCertificateTlsAuth;
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        public readonly string? SaslScram256Auth;
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        public readonly string? SaslScram512Auth;

        [OutputConstructor]
        private PipeSourceParametersSelfManagedKafkaParametersCredentials(
            string? basicAuth,

            string? clientCertificateTlsAuth,

            string? saslScram256Auth,

            string? saslScram512Auth)
        {
            BasicAuth = basicAuth;
            ClientCertificateTlsAuth = clientCertificateTlsAuth;
            SaslScram256Auth = saslScram256Auth;
            SaslScram512Auth = saslScram512Auth;
        }
    }
}
