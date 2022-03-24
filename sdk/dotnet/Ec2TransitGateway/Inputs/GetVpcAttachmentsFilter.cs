// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2TransitGateway.Inputs
{

    public sealed class GetVpcAttachmentsFilterArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the filter check available value on [official documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayVpcAttachments.html)
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("values", required: true)]
        private List<string>? _values;

        /// <summary>
        /// List of one or more values for the filter.
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetVpcAttachmentsFilterArgs()
        {
        }
    }
}
