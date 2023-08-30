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
    /// Manages an EC2 Transit Gateway Multicast Domain.
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
    ///     var available = Aws.GetAvailabilityZones.Invoke(new()
    ///     {
    ///         State = "available",
    ///     });
    /// 
    ///     var amazonLinux = Aws.Ec2.GetAmi.Invoke(new()
    ///     {
    ///         MostRecent = true,
    ///         Owners = new[]
    ///         {
    ///             "amazon",
    ///         },
    ///         Filters = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.GetAmiFilterInputArgs
    ///             {
    ///                 Name = "name",
    ///                 Values = new[]
    ///                 {
    ///                     "amzn-ami-hvm-*-x86_64-gp2",
    ///                 },
    ///             },
    ///             new Aws.Ec2.Inputs.GetAmiFilterInputArgs
    ///             {
    ///                 Name = "owner-alias",
    ///                 Values = new[]
    ///                 {
    ///                     "amazon",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var vpc1 = new Aws.Ec2.Vpc("vpc1", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var vpc2 = new Aws.Ec2.Vpc("vpc2", new()
    ///     {
    ///         CidrBlock = "10.1.0.0/16",
    ///     });
    /// 
    ///     var subnet1 = new Aws.Ec2.Subnet("subnet1", new()
    ///     {
    ///         VpcId = vpc1.Id,
    ///         CidrBlock = "10.0.1.0/24",
    ///         AvailabilityZone = available.Apply(getAvailabilityZonesResult =&gt; getAvailabilityZonesResult.Names[0]),
    ///     });
    /// 
    ///     var subnet2 = new Aws.Ec2.Subnet("subnet2", new()
    ///     {
    ///         VpcId = vpc1.Id,
    ///         CidrBlock = "10.0.2.0/24",
    ///         AvailabilityZone = available.Apply(getAvailabilityZonesResult =&gt; getAvailabilityZonesResult.Names[1]),
    ///     });
    /// 
    ///     var subnet3 = new Aws.Ec2.Subnet("subnet3", new()
    ///     {
    ///         VpcId = vpc2.Id,
    ///         CidrBlock = "10.1.1.0/24",
    ///         AvailabilityZone = available.Apply(getAvailabilityZonesResult =&gt; getAvailabilityZonesResult.Names[0]),
    ///     });
    /// 
    ///     var instance1 = new Aws.Ec2.Instance("instance1", new()
    ///     {
    ///         Ami = amazonLinux.Apply(getAmiResult =&gt; getAmiResult.Id),
    ///         InstanceType = "t2.micro",
    ///         SubnetId = subnet1.Id,
    ///     });
    /// 
    ///     var instance2 = new Aws.Ec2.Instance("instance2", new()
    ///     {
    ///         Ami = amazonLinux.Apply(getAmiResult =&gt; getAmiResult.Id),
    ///         InstanceType = "t2.micro",
    ///         SubnetId = subnet2.Id,
    ///     });
    /// 
    ///     var instance3 = new Aws.Ec2.Instance("instance3", new()
    ///     {
    ///         Ami = amazonLinux.Apply(getAmiResult =&gt; getAmiResult.Id),
    ///         InstanceType = "t2.micro",
    ///         SubnetId = subnet3.Id,
    ///     });
    /// 
    ///     var tgw = new Aws.Ec2TransitGateway.TransitGateway("tgw", new()
    ///     {
    ///         MulticastSupport = "enable",
    ///     });
    /// 
    ///     var attachment1 = new Aws.Ec2TransitGateway.VpcAttachment("attachment1", new()
    ///     {
    ///         SubnetIds = new[]
    ///         {
    ///             subnet1.Id,
    ///             subnet2.Id,
    ///         },
    ///         TransitGatewayId = tgw.Id,
    ///         VpcId = vpc1.Id,
    ///     });
    /// 
    ///     var attachment2 = new Aws.Ec2TransitGateway.VpcAttachment("attachment2", new()
    ///     {
    ///         SubnetIds = new[]
    ///         {
    ///             subnet3.Id,
    ///         },
    ///         TransitGatewayId = tgw.Id,
    ///         VpcId = vpc2.Id,
    ///     });
    /// 
    ///     var domain = new Aws.Ec2TransitGateway.MulticastDomain("domain", new()
    ///     {
    ///         TransitGatewayId = tgw.Id,
    ///         StaticSourcesSupport = "enable",
    ///         Tags = 
    ///         {
    ///             { "Name", "Transit_Gateway_Multicast_Domain_Example" },
    ///         },
    ///     });
    /// 
    ///     var association3 = new Aws.Ec2TransitGateway.MulticastDomainAssociation("association3", new()
    ///     {
    ///         SubnetId = subnet3.Id,
    ///         TransitGatewayAttachmentId = attachment2.Id,
    ///         TransitGatewayMulticastDomainId = domain.Id,
    ///     });
    /// 
    ///     var source = new Aws.Ec2TransitGateway.MulticastGroupSource("source", new()
    ///     {
    ///         GroupIpAddress = "224.0.0.1",
    ///         NetworkInterfaceId = instance3.PrimaryNetworkInterfaceId,
    ///         TransitGatewayMulticastDomainId = association3.TransitGatewayMulticastDomainId,
    ///     });
    /// 
    ///     var association1 = new Aws.Ec2TransitGateway.MulticastDomainAssociation("association1", new()
    ///     {
    ///         SubnetId = subnet1.Id,
    ///         TransitGatewayAttachmentId = attachment1.Id,
    ///         TransitGatewayMulticastDomainId = domain.Id,
    ///     });
    /// 
    ///     var association2 = new Aws.Ec2TransitGateway.MulticastDomainAssociation("association2", new()
    ///     {
    ///         SubnetId = subnet2.Id,
    ///         TransitGatewayAttachmentId = attachment2.Id,
    ///         TransitGatewayMulticastDomainId = domain.Id,
    ///     });
    /// 
    ///     var member1 = new Aws.Ec2TransitGateway.MulticastGroupMember("member1", new()
    ///     {
    ///         GroupIpAddress = "224.0.0.1",
    ///         NetworkInterfaceId = instance1.PrimaryNetworkInterfaceId,
    ///         TransitGatewayMulticastDomainId = association1.TransitGatewayMulticastDomainId,
    ///     });
    /// 
    ///     var member2 = new Aws.Ec2TransitGateway.MulticastGroupMember("member2", new()
    ///     {
    ///         GroupIpAddress = "224.0.0.1",
    ///         NetworkInterfaceId = instance2.PrimaryNetworkInterfaceId,
    ///         TransitGatewayMulticastDomainId = association1.TransitGatewayMulticastDomainId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ec2_transit_gateway_multicast_domain` using the EC2 Transit Gateway Multicast Domain identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2transitgateway/multicastDomain:MulticastDomain example tgw-mcast-domain-12345
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2transitgateway/multicastDomain:MulticastDomain")]
    public partial class MulticastDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Output("autoAcceptSharedAssociations")]
        public Output<string?> AutoAcceptSharedAssociations { get; private set; } = null!;

        /// <summary>
        /// Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Output("igmpv2Support")]
        public Output<string?> Igmpv2Support { get; private set; } = null!;

        /// <summary>
        /// Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Output("staticSourcesSupport")]
        public Output<string?> StaticSourcesSupport { get; private set; } = null!;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        /// </summary>
        [Output("transitGatewayId")]
        public Output<string> TransitGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a MulticastDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MulticastDomain(string name, MulticastDomainArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/multicastDomain:MulticastDomain", name, args ?? new MulticastDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MulticastDomain(string name, Input<string> id, MulticastDomainState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2transitgateway/multicastDomain:MulticastDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MulticastDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MulticastDomain Get(string name, Input<string> id, MulticastDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new MulticastDomain(name, id, state, options);
        }
    }

    public sealed class MulticastDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("autoAcceptSharedAssociations")]
        public Input<string>? AutoAcceptSharedAssociations { get; set; }

        /// <summary>
        /// Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("igmpv2Support")]
        public Input<string>? Igmpv2Support { get; set; }

        /// <summary>
        /// Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("staticSourcesSupport")]
        public Input<string>? StaticSourcesSupport { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        /// </summary>
        [Input("transitGatewayId", required: true)]
        public Input<string> TransitGatewayId { get; set; } = null!;

        public MulticastDomainArgs()
        {
        }
        public static new MulticastDomainArgs Empty => new MulticastDomainArgs();
    }

    public sealed class MulticastDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("autoAcceptSharedAssociations")]
        public Input<string>? AutoAcceptSharedAssociations { get; set; }

        /// <summary>
        /// Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("igmpv2Support")]
        public Input<string>? Igmpv2Support { get; set; }

        /// <summary>
        /// Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain. Valid values: `disable`, `enable`. Default value: `disable`.
        /// </summary>
        [Input("staticSourcesSupport")]
        public Input<string>? StaticSourcesSupport { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the EC2 Transit Gateway Multicast Domain. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// EC2 Transit Gateway identifier. The EC2 Transit Gateway must have `multicast_support` enabled.
        /// </summary>
        [Input("transitGatewayId")]
        public Input<string>? TransitGatewayId { get; set; }

        public MulticastDomainState()
        {
        }
        public static new MulticastDomainState Empty => new MulticastDomainState();
    }
}
