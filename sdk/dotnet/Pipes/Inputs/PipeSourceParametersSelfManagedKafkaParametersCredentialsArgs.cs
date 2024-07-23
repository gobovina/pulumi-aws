// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        [Input("basicAuth")]
        public Input<string>? BasicAuth { get; set; }

        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        [Input("clientCertificateTlsAuth")]
        public Input<string>? ClientCertificateTlsAuth { get; set; }

        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        [Input("saslScram256Auth")]
        public Input<string>? SaslScram256Auth { get; set; }

        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        [Input("saslScram512Auth")]
        public Input<string>? SaslScram512Auth { get; set; }

        public PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs()
        {
        }
        public static new PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs Empty => new PipeSourceParametersSelfManagedKafkaParametersCredentialsArgs();
    }
}
