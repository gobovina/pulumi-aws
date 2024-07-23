// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Inputs
{

    public sealed class LifecyclePolicyPolicyDetailsScheduleShareRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("targetAccounts", required: true)]
        private InputList<string>? _targetAccounts;

        /// <summary>
        /// The IDs of the AWS accounts with which to share the snapshots.
        /// </summary>
        public InputList<string> TargetAccounts
        {
            get => _targetAccounts ?? (_targetAccounts = new InputList<string>());
            set => _targetAccounts = value;
        }

        [Input("unshareInterval")]
        public Input<int>? UnshareInterval { get; set; }

        [Input("unshareIntervalUnit")]
        public Input<string>? UnshareIntervalUnit { get; set; }

        public LifecyclePolicyPolicyDetailsScheduleShareRuleGetArgs()
        {
        }
        public static new LifecyclePolicyPolicyDetailsScheduleShareRuleGetArgs Empty => new LifecyclePolicyPolicyDetailsScheduleShareRuleGetArgs();
    }
}
