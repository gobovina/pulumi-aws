// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Outputs
{

    [OutputType]
    public sealed class LifecyclePolicyPolicyDetails
    {
        /// <summary>
        /// The actions to be performed when the event-based policy is triggered. You can specify only one action per policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `action` configuration block.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsAction? Action;
        /// <summary>
        /// The event that triggers the event-based policy. This parameter is required for event-based policies only. If you are creating a snapshot or AMI policy, omit this parameter. See the `event_source` configuration block.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsEventSource? EventSource;
        /// <summary>
        /// A set of optional parameters for snapshot and AMI lifecycle policies. See the `parameters` configuration block.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsParameters? Parameters;
        /// <summary>
        /// The valid target resource types and actions a policy can manage. Specify `EBS_SNAPSHOT_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify `IMAGE_MANAGEMENT` to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. Specify `EVENT_BASED_POLICY` to create an event-based policy that performs specific actions when a defined event occurs in your AWS account. Default value is `EBS_SNAPSHOT_MANAGEMENT`.
        /// </summary>
        public readonly string? PolicyType;
        /// <summary>
        /// The location of the resources to backup. If the source resources are located in an AWS Region, specify `CLOUD`. If the source resources are located on an Outpost in your account, specify `OUTPOST`. If you specify `OUTPOST`, Amazon Data Lifecycle Manager backs up all resources of the specified type with matching target tags across all of the Outposts in your account. Valid values are `CLOUD` and `OUTPOST`.
        /// </summary>
        public readonly string? ResourceLocations;
        /// <summary>
        /// A list of resource types that should be targeted by the lifecycle policy. Valid values are `VOLUME` and `INSTANCE`.
        /// </summary>
        public readonly ImmutableArray<string> ResourceTypes;
        /// <summary>
        /// See the `schedule` configuration block.
        /// </summary>
        public readonly ImmutableArray<Outputs.LifecyclePolicyPolicyDetailsSchedule> Schedules;
        /// <summary>
        /// A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
        /// 
        /// &gt; Note: You cannot have overlapping lifecycle policies that share the same `target_tags`. TODO is unable to detect this at plan time but it will fail during apply.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? TargetTags;

        [OutputConstructor]
        private LifecyclePolicyPolicyDetails(
            Outputs.LifecyclePolicyPolicyDetailsAction? action,

            Outputs.LifecyclePolicyPolicyDetailsEventSource? eventSource,

            Outputs.LifecyclePolicyPolicyDetailsParameters? parameters,

            string? policyType,

            string? resourceLocations,

            ImmutableArray<string> resourceTypes,

            ImmutableArray<Outputs.LifecyclePolicyPolicyDetailsSchedule> schedules,

            ImmutableDictionary<string, string>? targetTags)
        {
            Action = action;
            EventSource = eventSource;
            Parameters = parameters;
            PolicyType = policyType;
            ResourceLocations = resourceLocations;
            ResourceTypes = resourceTypes;
            Schedules = schedules;
            TargetTags = targetTags;
        }
    }
}
