// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class GroupMixedInstancesPolicyLaunchTemplateOverrideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Override the instance type in the Launch Template with instance types that satisfy the requirements.
        /// </summary>
        [Input("instanceRequirements")]
        public Input<Inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsArgs>? InstanceRequirements { get; set; }

        /// <summary>
        /// Override the instance type in the Launch Template.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Override the instance launch template specification in the Launch Template.
        /// </summary>
        [Input("launchTemplateSpecification")]
        public Input<Inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecificationArgs>? LaunchTemplateSpecification { get; set; }

        /// <summary>
        /// Number of capacity units, which gives the instance type a proportional weight to other instance types.
        /// </summary>
        [Input("weightedCapacity")]
        public Input<string>? WeightedCapacity { get; set; }

        public GroupMixedInstancesPolicyLaunchTemplateOverrideArgs()
        {
        }
        public static new GroupMixedInstancesPolicyLaunchTemplateOverrideArgs Empty => new GroupMixedInstancesPolicyLaunchTemplateOverrideArgs();
    }
}
