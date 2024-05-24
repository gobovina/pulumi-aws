// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake.Outputs
{

    [OutputType]
    public sealed class CustomLogSourceConfigurationProviderIdentity
    {
        /// <summary>
        /// The external ID used to estalish trust relationship with the AWS identity.
        /// </summary>
        public readonly string ExternalId;
        /// <summary>
        /// The AWS identity principal.
        /// </summary>
        public readonly string Principal;

        [OutputConstructor]
        private CustomLogSourceConfigurationProviderIdentity(
            string externalId,

            string principal)
        {
            ExternalId = externalId;
            Principal = principal;
        }
    }
}
