// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VerifiedPermissions.Inputs
{

    public sealed class IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The token claim that you want Verified Permissions to interpret as group membership. For example, `groups`.
        /// </summary>
        [Input("groupClaim", required: true)]
        public Input<string> GroupClaim { get; set; } = null!;

        /// <summary>
        /// The name of the schema entity type that's mapped to the user pool group. Defaults to `AWS::CognitoGroup`.
        /// </summary>
        [Input("groupEntityType", required: true)]
        public Input<string> GroupEntityType { get; set; } = null!;

        public IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs()
        {
        }
        public static new IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs Empty => new IdentitySourceConfigurationOpenIdConnectConfigurationGroupConfigurationArgs();
    }
}
