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
    public sealed class ConfigurationPolicyConfigurationPolicySecurityControlsConfiguration
    {
        /// <summary>
        /// A list of security controls that are disabled in the configuration policy Security Hub enables all other controls (including newly released controls) other than the listed controls. Conflicts with `enabled_control_identifiers`.
        /// </summary>
        public readonly ImmutableArray<string> DisabledControlIdentifiers;
        /// <summary>
        /// A list of security controls that are enabled in the configuration policy. Security Hub disables all other controls (including newly released controls) other than the listed controls. Conflicts with `disabled_control_identifiers`.
        /// </summary>
        public readonly ImmutableArray<string> EnabledControlIdentifiers;
        /// <summary>
        /// A list of control parameter customizations that are included in a configuration policy. Include multiple blocks to define multiple control custom parameters. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameter> SecurityControlCustomParameters;

        [OutputConstructor]
        private ConfigurationPolicyConfigurationPolicySecurityControlsConfiguration(
            ImmutableArray<string> disabledControlIdentifiers,

            ImmutableArray<string> enabledControlIdentifiers,

            ImmutableArray<Outputs.ConfigurationPolicyConfigurationPolicySecurityControlsConfigurationSecurityControlCustomParameter> securityControlCustomParameters)
        {
            DisabledControlIdentifiers = disabledControlIdentifiers;
            EnabledControlIdentifiers = enabledControlIdentifiers;
            SecurityControlCustomParameters = securityControlCustomParameters;
        }
    }
}
