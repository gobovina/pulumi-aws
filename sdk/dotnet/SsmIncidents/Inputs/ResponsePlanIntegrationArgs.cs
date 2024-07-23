// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsmIncidents.Inputs
{

    public sealed class ResponsePlanIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("pagerduties")]
        private InputList<Inputs.ResponsePlanIntegrationPagerdutyArgs>? _pagerduties;

        /// <summary>
        /// Details about the PagerDuty configuration for a response plan. The following values are supported:
        /// </summary>
        public InputList<Inputs.ResponsePlanIntegrationPagerdutyArgs> Pagerduties
        {
            get => _pagerduties ?? (_pagerduties = new InputList<Inputs.ResponsePlanIntegrationPagerdutyArgs>());
            set => _pagerduties = value;
        }

        public ResponsePlanIntegrationArgs()
        {
        }
        public static new ResponsePlanIntegrationArgs Empty => new ResponsePlanIntegrationArgs();
    }
}
