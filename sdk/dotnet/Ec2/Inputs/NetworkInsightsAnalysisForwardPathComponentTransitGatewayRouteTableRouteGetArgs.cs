// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attachmentId")]
        public Input<string>? AttachmentId { get; set; }

        [Input("destinationCidr")]
        public Input<string>? DestinationCidr { get; set; }

        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("routeOrigin")]
        public Input<string>? RouteOrigin { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        public NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteGetArgs()
        {
        }
        public static new NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteGetArgs Empty => new NetworkInsightsAnalysisForwardPathComponentTransitGatewayRouteTableRouteGetArgs();
    }
}
