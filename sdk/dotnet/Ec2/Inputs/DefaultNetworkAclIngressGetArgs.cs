// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class DefaultNetworkAclIngressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The CIDR block to match. This must be a valid network mask.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// The from port to match.
        /// </summary>
        [Input("fromPort", required: true)]
        public Input<int> FromPort { get; set; } = null!;

        /// <summary>
        /// The ICMP type code to be used. Default 0.
        /// </summary>
        [Input("icmpCode")]
        public Input<int>? IcmpCode { get; set; }

        /// <summary>
        /// The ICMP type to be used. Default 0.
        /// </summary>
        [Input("icmpType")]
        public Input<int>? IcmpType { get; set; }

        /// <summary>
        /// The IPv6 CIDR block.
        /// 
        /// &gt; For more information on ICMP types and codes, see [Internet Control Message Protocol (ICMP) Parameters](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml).
        /// </summary>
        [Input("ipv6CidrBlock")]
        public Input<string>? Ipv6CidrBlock { get; set; }

        /// <summary>
        /// The protocol to match. If using the -1 'all' protocol, you must specify a from and to port of 0.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// The rule number. Used for ordering.
        /// </summary>
        [Input("ruleNo", required: true)]
        public Input<int> RuleNo { get; set; } = null!;

        /// <summary>
        /// The to port to match.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("toPort", required: true)]
        public Input<int> ToPort { get; set; } = null!;

        public DefaultNetworkAclIngressGetArgs()
        {
        }
        public static new DefaultNetworkAclIngressGetArgs Empty => new DefaultNetworkAclIngressGetArgs();
    }
}
