// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The signing Amazon Web Services Region for IAM authorization.
        /// </summary>
        [Input("signingRegion")]
        public Input<string>? SigningRegion { get; set; }

        /// <summary>
        /// The signing service name for IAM authorization.
        /// </summary>
        [Input("signingServiceName")]
        public Input<string>? SigningServiceName { get; set; }

        public DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs()
        {
        }
    }
}
