// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsmIncidents.Outputs
{

    [OutputType]
    public sealed class ResponsePlanIntegration
    {
        /// <summary>
        /// Details about the PagerDuty configuration for a response plan. The following values are supported:
        /// </summary>
        public readonly ImmutableArray<Outputs.ResponsePlanIntegrationPagerduty> Pagerduties;

        [OutputConstructor]
        private ResponsePlanIntegration(ImmutableArray<Outputs.ResponsePlanIntegrationPagerduty> pagerduties)
        {
            Pagerduties = pagerduties;
        }
    }
}
