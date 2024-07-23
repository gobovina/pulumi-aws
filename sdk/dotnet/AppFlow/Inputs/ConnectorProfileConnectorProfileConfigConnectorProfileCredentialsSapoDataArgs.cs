// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SAPOData basic authentication credentials.
        /// </summary>
        [Input("basicAuthCredentials")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataBasicAuthCredentialsArgs>? BasicAuthCredentials { get; set; }

        /// <summary>
        /// The SAPOData OAuth type authentication credentials.
        /// </summary>
        [Input("oauthCredentials")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataOauthCredentialsArgs>? OauthCredentials { get; set; }

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsSapoDataArgs();
    }
}
