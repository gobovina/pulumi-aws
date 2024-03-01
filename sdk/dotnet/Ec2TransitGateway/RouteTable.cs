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
    /// Manages an EC2 Transit Gateway Route Table.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2TransitGateway.RouteTable("example", new()
    ///     {
    ///         TransitGatewayId = exampleAwsEc2TransitGateway.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ec2_transit_gateway_route_table` using the EC2 Transit Gateway Route Table identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2transitgateway/routeTable:RouteTable example tgw-rtb-12345678
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2transitgateway/routeTable:RouteTable")]
    public partial class RouteTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Boolean whether this is the default association route table for the EC2 Transit Gateway.
        /// </summary>
        [Output("defaultAssociationRouteTable")]
        public Output<bool> DefaultAssociationRouteTable { get; private set; } = null!;

        /// <summary>
        /// Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
        /// </summary>
        [Output("defaultPropagationRouteTable")]
        public Output<bool> DefaultPropagationRouteTable { get; private set; } = null!;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Route Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Identifier of EC2 Transit Gateway.
        /// </summary>
        [Output("transitGatewayId")]
        public Output<string> TransitGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a RouteTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteTable(string name, RouteTableArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/routeTable:RouteTable", name, args ?? new RouteTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteTable(string name, Input<string> id, RouteTableState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/routeTable:RouteTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouteTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteTable Get(string name, Input<string> id, RouteTableState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteTable(name, id, state, options);
        }
    }

    public sealed class RouteTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Route Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier of EC2 Transit Gateway.
        /// </summary>
        [Input("transitGatewayId", required: true)]
        public Input<string> TransitGatewayId { get; set; } = null!;

        public RouteTableArgs()
        {
        }
        public static new RouteTableArgs Empty => new RouteTableArgs();
    }

    public sealed class RouteTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Boolean whether this is the default association route table for the EC2 Transit Gateway.
        /// </summary>
        [Input("defaultAssociationRouteTable")]
        public Input<bool>? DefaultAssociationRouteTable { get; set; }

        /// <summary>
        /// Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
        /// </summary>
        [Input("defaultPropagationRouteTable")]
        public Input<bool>? DefaultPropagationRouteTable { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Route Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Identifier of EC2 Transit Gateway.
        /// </summary>
        [Input("transitGatewayId")]
        public Input<string>? TransitGatewayId { get; set; }

        public RouteTableState()
        {
        }
        public static new RouteTableState Empty => new RouteTableState();
    }
}
