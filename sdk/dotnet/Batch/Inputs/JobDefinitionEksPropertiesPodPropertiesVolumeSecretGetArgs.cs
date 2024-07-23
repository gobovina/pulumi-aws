// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch.Inputs
{

    public sealed class JobDefinitionEksPropertiesPodPropertiesVolumeSecretGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the secret or the secret's keys must be defined.
        /// </summary>
        [Input("optional")]
        public Input<bool>? Optional { get; set; }

        /// <summary>
        /// The name of the secret. The name must be allowed as a DNS subdomain name.
        /// </summary>
        [Input("secretName", required: true)]
        public Input<string> SecretName { get; set; } = null!;

        public JobDefinitionEksPropertiesPodPropertiesVolumeSecretGetArgs()
        {
        }
        public static new JobDefinitionEksPropertiesPodPropertiesVolumeSecretGetArgs Empty => new JobDefinitionEksPropertiesPodPropertiesVolumeSecretGetArgs();
    }
}
