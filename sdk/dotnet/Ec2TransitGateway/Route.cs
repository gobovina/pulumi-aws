// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2TransitGateway
{
    /// <summary>
    /// Manages an EC2 Transit Gateway Route.
    /// 
    /// ## Example Usage
    /// 
    /// ### Standard usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2TransitGateway.Route("example", new()
    ///     {
    ///         DestinationCidrBlock = "0.0.0.0/0",
    ///         TransitGatewayAttachmentId = exampleAwsEc2TransitGatewayVpcAttachment.Id,
    ///         TransitGatewayRouteTableId = exampleAwsEc2TransitGateway.AssociationDefaultRouteTableId,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Blackhole route
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2TransitGateway.Route("example", new()
    ///     {
    ///         DestinationCidrBlock = "0.0.0.0/0",
    ///         Blackhole = true,
    ///         TransitGatewayRouteTableId = exampleAwsEc2TransitGateway.AssociationDefaultRouteTableId,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ec2_transit_gateway_route` using the EC2 Transit Gateway Route Table, an underscore, and the destination. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2transitgateway/route:Route")]
    public partial class Route : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether to drop traffic that matches this route (default to `false`).
        /// </summary>
        [Output("blackhole")]
        public Output<bool?> Blackhole { get; private set; } = null!;

        /// <summary>
        /// IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        /// </summary>
        [Output("destinationCidrBlock")]
        public Output<string> DestinationCidrBlock { get; private set; } = null!;

        /// <summary>
        /// Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        /// </summary>
        [Output("transitGatewayAttachmentId")]
        public Output<string?> TransitGatewayAttachmentId { get; private set; } = null!;

        /// <summary>
        /// Identifier of EC2 Transit Gateway Route Table.
        /// </summary>
        [Output("transitGatewayRouteTableId")]
        public Output<string> TransitGatewayRouteTableId { get; private set; } = null!;


        /// <summary>
        /// Create a Route resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Route(string name, RouteArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/route:Route", name, args ?? new RouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Route(string name, Input<string> id, RouteState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/route:Route", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Route resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Route Get(string name, Input<string> id, RouteState? state = null, CustomResourceOptions? options = null)
        {
            return new Route(name, id, state, options);
        }
    }

    public sealed class RouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to drop traffic that matches this route (default to `false`).
        /// </summary>
        [Input("blackhole")]
        public Input<bool>? Blackhole { get; set; }

        /// <summary>
        /// IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        /// </summary>
        [Input("destinationCidrBlock", required: true)]
        public Input<string> DestinationCidrBlock { get; set; } = null!;

        /// <summary>
        /// Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        /// </summary>
        [Input("transitGatewayAttachmentId")]
        public Input<string>? TransitGatewayAttachmentId { get; set; }

        /// <summary>
        /// Identifier of EC2 Transit Gateway Route Table.
        /// </summary>
        [Input("transitGatewayRouteTableId", required: true)]
        public Input<string> TransitGatewayRouteTableId { get; set; } = null!;

        public RouteArgs()
        {
        }
        public static new RouteArgs Empty => new RouteArgs();
    }

    public sealed class RouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to drop traffic that matches this route (default to `false`).
        /// </summary>
        [Input("blackhole")]
        public Input<bool>? Blackhole { get; set; }

        /// <summary>
        /// IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
        /// </summary>
        [Input("destinationCidrBlock")]
        public Input<string>? DestinationCidrBlock { get; set; }

        /// <summary>
        /// Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
        /// </summary>
        [Input("transitGatewayAttachmentId")]
        public Input<string>? TransitGatewayAttachmentId { get; set; }

        /// <summary>
        /// Identifier of EC2 Transit Gateway Route Table.
        /// </summary>
        [Input("transitGatewayRouteTableId")]
        public Input<string>? TransitGatewayRouteTableId { get; set; }

        public RouteState()
        {
        }
        public static new RouteState Empty => new RouteState();
    }
}
