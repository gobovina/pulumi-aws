// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake.Inputs
{

    public sealed class CustomLogSourceConfigurationProviderIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The external ID used to estalish trust relationship with the AWS identity.
        /// </summary>
        [Input("externalId", required: true)]
        public Input<string> ExternalId { get; set; } = null!;

        /// <summary>
        /// The AWS identity principal.
        /// </summary>
        [Input("principal", required: true)]
        public Input<string> Principal { get; set; } = null!;

        public CustomLogSourceConfigurationProviderIdentityGetArgs()
        {
        }
        public static new CustomLogSourceConfigurationProviderIdentityGetArgs Empty => new CustomLogSourceConfigurationProviderIdentityGetArgs();
    }
}
