// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Outputs
{

    [OutputType]
    public sealed class ClusterOpenMonitoringPrometheusJmxExporter
    {
        /// <summary>
        /// Indicates whether you want to enable or disable the Node Exporter.
        /// </summary>
        public readonly bool EnabledInBroker;

        [OutputConstructor]
        private ClusterOpenMonitoringPrometheusJmxExporter(bool enabledInBroker)
        {
            EnabledInBroker = enabledInBroker;
        }
    }
}
