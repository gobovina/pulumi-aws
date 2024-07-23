// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Secrets Manager secret containing the credentials.
        /// </summary>
        [Input("basicAuth", required: true)]
        public Input<string> BasicAuth { get; set; } = null!;

        public PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs()
        {
        }
        public static new PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs Empty => new PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs();
    }
}
