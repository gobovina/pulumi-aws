// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch.Outputs
{

    [OutputType]
    public sealed class SchedulingPolicyFairSharePolicy
    {
        /// <summary>
        /// A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
        /// </summary>
        public readonly int? ComputeReservation;
        public readonly int? ShareDecaySeconds;
        /// <summary>
        /// One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SchedulingPolicyFairSharePolicyShareDistribution> ShareDistributions;

        [OutputConstructor]
        private SchedulingPolicyFairSharePolicy(
            int? computeReservation,

            int? shareDecaySeconds,

            ImmutableArray<Outputs.SchedulingPolicyFairSharePolicyShareDistribution> shareDistributions)
        {
            ComputeReservation = computeReservation;
            ShareDecaySeconds = shareDecaySeconds;
            ShareDistributions = shareDistributions;
        }
    }
}
