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
    /// Manages an EC2 Transit Gateway.
    /// 
    /// ## Example Usage
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
    ///     var example = new Aws.Ec2TransitGateway.TransitGateway("example", new()
    ///     {
    ///         Description = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ec2_transit_gateway` using the EC2 Transit Gateway identifier. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2transitgateway/transitGateway:TransitGateway example tgw-12345678
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2transitgateway/transitGateway:TransitGateway")]
    public partial class TransitGateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
        /// 
        /// &gt; **NOTE:** Modifying `amazon_side_asn` on a Transit Gateway with active BGP sessions is [not allowed](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyTransitGatewayOptions.html). You must first delete all Transit Gateway attachments that have BGP configured prior to modifying `amazon_side_asn`.
        /// </summary>
        [Output("amazonSideAsn")]
        public Output<int?> AmazonSideAsn { get; private set; } = null!;

        /// <summary>
        /// EC2 Transit Gateway Amazon Resource Name (ARN)
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Identifier of the default association route table
        /// </summary>
        [Output("associationDefaultRouteTableId")]
        public Output<string> AssociationDefaultRouteTableId { get; private set; } = null!;

        /// <summary>
        /// Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Output("autoAcceptSharedAttachments")]
        public Output<string?> AutoAcceptSharedAttachments { get; private set; } = null!;

        /// <summary>
        /// Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Output("defaultRouteTableAssociation")]
        public Output<string?> DefaultRouteTableAssociation { get; private set; } = null!;

        /// <summary>
        /// Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Output("defaultRouteTablePropagation")]
        public Output<string?> DefaultRouteTablePropagation { get; private set; } = null!;

        /// <summary>
        /// Description of the EC2 Transit Gateway.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Output("dnsSupport")]
        public Output<string?> DnsSupport { get; private set; } = null!;

        /// <summary>
        /// Whether Multicast support is enabled. Required to use `ec2_transit_gateway_multicast_domain`. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Output("multicastSupport")]
        public Output<string?> MulticastSupport { get; private set; } = null!;

        /// <summary>
        /// Identifier of the AWS account that owns the EC2 Transit Gateway
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// Identifier of the default propagation route table
        /// </summary>
        [Output("propagationDefaultRouteTableId")]
        public Output<string> PropagationDefaultRouteTableId { get; private set; } = null!;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
        /// </summary>
        [Output("transitGatewayCidrBlocks")]
        public Output<ImmutableArray<string>> TransitGatewayCidrBlocks { get; private set; } = null!;

        /// <summary>
        /// Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Output("vpnEcmpSupport")]
        public Output<string?> VpnEcmpSupport { get; private set; } = null!;


        /// <summary>
        /// Create a TransitGateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitGateway(string name, TransitGatewayArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/transitGateway:TransitGateway", name, args ?? new TransitGatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitGateway(string name, Input<string> id, TransitGatewayState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/transitGateway:TransitGateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitGateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitGateway Get(string name, Input<string> id, TransitGatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitGateway(name, id, state, options);
        }
    }

    public sealed class TransitGatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
        /// 
        /// &gt; **NOTE:** Modifying `amazon_side_asn` on a Transit Gateway with active BGP sessions is [not allowed](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyTransitGatewayOptions.html). You must first delete all Transit Gateway attachments that have BGP configured prior to modifying `amazon_side_asn`.
        /// </summary>
        [Input("amazonSideAsn")]
        public Input<int>? AmazonSideAsn { get; set; }

        /// <summary>
        /// Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("autoAcceptSharedAttachments")]
        public Input<string>? AutoAcceptSharedAttachments { get; set; }

        /// <summary>
        /// Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("defaultRouteTableAssociation")]
        public Input<string>? DefaultRouteTableAssociation { get; set; }

        /// <summary>
        /// Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("defaultRouteTablePropagation")]
        public Input<string>? DefaultRouteTablePropagation { get; set; }

        /// <summary>
        /// Description of the EC2 Transit Gateway.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("dnsSupport")]
        public Input<string>? DnsSupport { get; set; }

        /// <summary>
        /// Whether Multicast support is enabled. Required to use `ec2_transit_gateway_multicast_domain`. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("multicastSupport")]
        public Input<string>? MulticastSupport { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("transitGatewayCidrBlocks")]
        private InputList<string>? _transitGatewayCidrBlocks;

        /// <summary>
        /// One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
        /// </summary>
        public InputList<string> TransitGatewayCidrBlocks
        {
            get => _transitGatewayCidrBlocks ?? (_transitGatewayCidrBlocks = new InputList<string>());
            set => _transitGatewayCidrBlocks = value;
        }

        /// <summary>
        /// Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("vpnEcmpSupport")]
        public Input<string>? VpnEcmpSupport { get; set; }

        public TransitGatewayArgs()
        {
        }
        public static new TransitGatewayArgs Empty => new TransitGatewayArgs();
    }

    public sealed class TransitGatewayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
        /// 
        /// &gt; **NOTE:** Modifying `amazon_side_asn` on a Transit Gateway with active BGP sessions is [not allowed](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyTransitGatewayOptions.html). You must first delete all Transit Gateway attachments that have BGP configured prior to modifying `amazon_side_asn`.
        /// </summary>
        [Input("amazonSideAsn")]
        public Input<int>? AmazonSideAsn { get; set; }

        /// <summary>
        /// EC2 Transit Gateway Amazon Resource Name (ARN)
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Identifier of the default association route table
        /// </summary>
        [Input("associationDefaultRouteTableId")]
        public Input<string>? AssociationDefaultRouteTableId { get; set; }

        /// <summary>
        /// Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("autoAcceptSharedAttachments")]
        public Input<string>? AutoAcceptSharedAttachments { get; set; }

        /// <summary>
        /// Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("defaultRouteTableAssociation")]
        public Input<string>? DefaultRouteTableAssociation { get; set; }

        /// <summary>
        /// Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("defaultRouteTablePropagation")]
        public Input<string>? DefaultRouteTablePropagation { get; set; }

        /// <summary>
        /// Description of the EC2 Transit Gateway.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("dnsSupport")]
        public Input<string>? DnsSupport { get; set; }

        /// <summary>
        /// Whether Multicast support is enabled. Required to use `ec2_transit_gateway_multicast_domain`. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("multicastSupport")]
        public Input<string>? MulticastSupport { get; set; }

        /// <summary>
        /// Identifier of the AWS account that owns the EC2 Transit Gateway
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// Identifier of the default propagation route table
        /// </summary>
        [Input("propagationDefaultRouteTableId")]
        public Input<string>? PropagationDefaultRouteTableId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("transitGatewayCidrBlocks")]
        private InputList<string>? _transitGatewayCidrBlocks;

        /// <summary>
        /// One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
        /// </summary>
        public InputList<string> TransitGatewayCidrBlocks
        {
            get => _transitGatewayCidrBlocks ?? (_transitGatewayCidrBlocks = new InputList<string>());
            set => _transitGatewayCidrBlocks = value;
        }

        /// <summary>
        /// Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
        /// </summary>
        [Input("vpnEcmpSupport")]
        public Input<string>? VpnEcmpSupport { get; set; }

        public TransitGatewayState()
        {
        }
        public static new TransitGatewayState Empty => new TransitGatewayState();
    }
}
