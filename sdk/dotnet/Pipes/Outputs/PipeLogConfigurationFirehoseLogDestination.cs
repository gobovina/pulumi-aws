// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeLogConfigurationFirehoseLogDestination
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Kinesis Data Firehose delivery stream to which EventBridge delivers the pipe log records.
        /// </summary>
        public readonly string DeliveryStreamArn;

        [OutputConstructor]
        private PipeLogConfigurationFirehoseLogDestination(string deliveryStreamArn)
        {
            DeliveryStreamArn = deliveryStreamArn;
        }
    }
}
