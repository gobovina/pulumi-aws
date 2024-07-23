// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Outputs
{

    [OutputType]
    public sealed class GroupMixedInstancesPolicyLaunchTemplateOverride
    {
        /// <summary>
        /// Override the instance type in the Launch Template with instance types that satisfy the requirements.
        /// </summary>
        public readonly Outputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirements? InstanceRequirements;
        /// <summary>
        /// Override the instance type in the Launch Template.
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// Override the instance launch template specification in the Launch Template.
        /// </summary>
        public readonly Outputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification? LaunchTemplateSpecification;
        /// <summary>
        /// Number of capacity units, which gives the instance type a proportional weight to other instance types.
        /// </summary>
        public readonly string? WeightedCapacity;

        [OutputConstructor]
        private GroupMixedInstancesPolicyLaunchTemplateOverride(
            Outputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirements? instanceRequirements,

            string? instanceType,

            Outputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification? launchTemplateSpecification,

            string? weightedCapacity)
        {
            InstanceRequirements = instanceRequirements;
            InstanceType = instanceType;
            LaunchTemplateSpecification = launchTemplateSpecification;
            WeightedCapacity = weightedCapacity;
        }
    }
}
