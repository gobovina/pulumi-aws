// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GameLift.Outputs
{

    [OutputType]
    public sealed class GameServerGroupAutoScalingPolicyTargetTrackingConfiguration
    {
        /// <summary>
        /// Desired value to use with a game server group target-based scaling policy.
        /// </summary>
        public readonly double TargetValue;

        [OutputConstructor]
        private GameServerGroupAutoScalingPolicyTargetTrackingConfiguration(double targetValue)
        {
            TargetValue = targetValue;
        }
    }
}
