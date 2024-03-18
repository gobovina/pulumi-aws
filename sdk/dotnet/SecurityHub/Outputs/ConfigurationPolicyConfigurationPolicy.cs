// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub.Outputs
{

    [OutputType]
    public sealed class ConfigurationPolicyConfigurationPolicy
    {
        /// <summary>
        /// A list that defines which security standards are enabled in the configuration policy.
        /// </summary>
        public readonly ImmutableArray<string> EnabledStandardArns;
        /// <summary>
        /// Defines which security controls are enabled in the configuration policy and any customizations to parameters affecting them. See below.
        /// </summary>
        public readonly Outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfiguration? SecurityControlsConfiguration;
        /// <summary>
        /// Indicates whether Security Hub is enabled in the policy.
        /// </summary>
        public readonly bool ServiceEnabled;

        [OutputConstructor]
        private ConfigurationPolicyConfigurationPolicy(
            ImmutableArray<string> enabledStandardArns,

            Outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfiguration? securityControlsConfiguration,

            bool serviceEnabled)
        {
            EnabledStandardArns = enabledStandardArns;
            SecurityControlsConfiguration = securityControlsConfiguration;
            ServiceEnabled = serviceEnabled;
        }
    }
}
