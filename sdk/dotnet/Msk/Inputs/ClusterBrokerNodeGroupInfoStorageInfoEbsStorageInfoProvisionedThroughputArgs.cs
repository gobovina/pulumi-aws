// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Inputs
{

    public sealed class ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second. The minimum value is `250`. The maximum value varies between broker type. You can refer to the valid values for the maximum volume throughput at the following [documentation on throughput bottlenecks](https://docs.aws.amazon.com/msk/latest/developerguide/msk-provision-throughput.html#throughput-bottlenecks)
        /// </summary>
        [Input("volumeThroughput")]
        public Input<int>? VolumeThroughput { get; set; }

        public ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs()
        {
        }
        public static new ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs Empty => new ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs();
    }
}
