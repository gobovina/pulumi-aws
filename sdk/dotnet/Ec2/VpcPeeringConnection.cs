// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a resource to manage a VPC peering connection.
    /// 
    /// &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
    /// both a standalone VPC Peering Connection Options and a VPC Peering Connection
    /// resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
    /// connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
    /// Doing so will cause a conflict of options and will overwrite the options.
    /// Using a VPC Peering Connection Options resource decouples management of the connection options from
    /// management of the VPC Peering Connection and allows options to be set correctly in cross-account scenarios.
    /// 
    /// &gt; **Note:** For cross-account (requester's AWS account differs from the accepter's AWS account) or inter-region
    /// VPC Peering Connections use the `aws.ec2.VpcPeeringConnection` resource to manage the requester's side of the
    /// connection and use the `aws.ec2.VpcPeeringConnectionAccepter` resource to manage the accepter's side of the connection.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new Aws.Ec2.VpcPeeringConnection("foo", new Aws.Ec2.VpcPeeringConnectionArgs
    ///         {
    ///             PeerOwnerId = @var.Peer_owner_id,
    ///             PeerVpcId = aws_vpc.Bar.Id,
    ///             VpcId = aws_vpc.Foo.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Basic usage with connection options:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new Aws.Ec2.VpcPeeringConnection("foo", new Aws.Ec2.VpcPeeringConnectionArgs
    ///         {
    ///             Accepter = new Aws.Ec2.Inputs.VpcPeeringConnectionAccepterArgs
    ///             {
    ///                 AllowRemoteVpcDnsResolution = true,
    ///             },
    ///             PeerOwnerId = @var.Peer_owner_id,
    ///             PeerVpcId = aws_vpc.Bar.Id,
    ///             Requester = new Aws.Ec2.Inputs.VpcPeeringConnectionRequesterArgs
    ///             {
    ///                 AllowRemoteVpcDnsResolution = true,
    ///             },
    ///             VpcId = aws_vpc.Foo.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Basic usage with tags:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var fooVpc = new Aws.Ec2.Vpc("fooVpc", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.1.0.0/16",
    ///         });
    ///         var bar = new Aws.Ec2.Vpc("bar", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.2.0.0/16",
    ///         });
    ///         var fooVpcPeeringConnection = new Aws.Ec2.VpcPeeringConnection("fooVpcPeeringConnection", new Aws.Ec2.VpcPeeringConnectionArgs
    ///         {
    ///             AutoAccept = true,
    ///             PeerOwnerId = @var.Peer_owner_id,
    ///             PeerVpcId = bar.Id,
    ///             Tags = 
    ///             {
    ///                 { "Name", "VPC Peering between foo and bar" },
    ///             },
    ///             VpcId = fooVpc.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Basic usage with region:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var fooVpc = new Aws.Ec2.Vpc("fooVpc", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.1.0.0/16",
    ///         });
    ///         var bar = new Aws.Ec2.Vpc("bar", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.2.0.0/16",
    ///         });
    ///         var fooVpcPeeringConnection = new Aws.Ec2.VpcPeeringConnection("fooVpcPeeringConnection", new Aws.Ec2.VpcPeeringConnectionArgs
    ///         {
    ///             PeerOwnerId = @var.Peer_owner_id,
    ///             PeerVpcId = bar.Id,
    ///             VpcId = fooVpc.Id,
    ///             PeerRegion = "us-east-1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Notes
    /// 
    /// If both VPCs are not in the same AWS account do not enable the `auto_accept` attribute.
    /// The accepter can manage its side of the connection using the `aws.ec2.VpcPeeringConnectionAccepter` resource
    /// or accept the connection manually using the AWS Management Console, AWS CLI, through SDKs, etc.
    /// </summary>
    public partial class VpcPeeringConnection : Pulumi.CustomResource
    {
        /// <summary>
        /// The status of the VPC Peering Connection request.
        /// </summary>
        [Output("acceptStatus")]
        public Output<string> AcceptStatus { get; private set; } = null!;

        /// <summary>
        /// An optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
        /// the peering connection (a maximum of one).
        /// </summary>
        [Output("accepter")]
        public Output<Outputs.VpcPeeringConnectionAccepter> Accepter { get; private set; } = null!;

        /// <summary>
        /// Accept the peering (both VPCs need to be in the same AWS account).
        /// </summary>
        [Output("autoAccept")]
        public Output<bool?> AutoAccept { get; private set; } = null!;

        /// <summary>
        /// The AWS account ID of the owner of the peer VPC.
        /// Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
        /// </summary>
        [Output("peerOwnerId")]
        public Output<string> PeerOwnerId { get; private set; } = null!;

        /// <summary>
        /// The region of the accepter VPC of the [VPC Peering Connection]. `auto_accept` must be `false`,
        /// and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
        /// </summary>
        [Output("peerRegion")]
        public Output<string> PeerRegion { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC with which you are creating the VPC Peering Connection.
        /// </summary>
        [Output("peerVpcId")]
        public Output<string> PeerVpcId { get; private set; } = null!;

        /// <summary>
        /// A optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
        /// the peering connection (a maximum of one).
        /// </summary>
        [Output("requester")]
        public Output<Outputs.VpcPeeringConnectionRequester> Requester { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the requester VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcPeeringConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcPeeringConnection(string name, VpcPeeringConnectionArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcPeeringConnection:VpcPeeringConnection", name, args ?? new VpcPeeringConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcPeeringConnection(string name, Input<string> id, VpcPeeringConnectionState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcPeeringConnection:VpcPeeringConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcPeeringConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcPeeringConnection Get(string name, Input<string> id, VpcPeeringConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcPeeringConnection(name, id, state, options);
        }
    }

    public sealed class VpcPeeringConnectionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
        /// the peering connection (a maximum of one).
        /// </summary>
        [Input("accepter")]
        public Input<Inputs.VpcPeeringConnectionAccepterArgs>? Accepter { get; set; }

        /// <summary>
        /// Accept the peering (both VPCs need to be in the same AWS account).
        /// </summary>
        [Input("autoAccept")]
        public Input<bool>? AutoAccept { get; set; }

        /// <summary>
        /// The AWS account ID of the owner of the peer VPC.
        /// Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
        /// </summary>
        [Input("peerOwnerId")]
        public Input<string>? PeerOwnerId { get; set; }

        /// <summary>
        /// The region of the accepter VPC of the [VPC Peering Connection]. `auto_accept` must be `false`,
        /// and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
        /// </summary>
        [Input("peerRegion")]
        public Input<string>? PeerRegion { get; set; }

        /// <summary>
        /// The ID of the VPC with which you are creating the VPC Peering Connection.
        /// </summary>
        [Input("peerVpcId", required: true)]
        public Input<string> PeerVpcId { get; set; } = null!;

        /// <summary>
        /// A optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
        /// the peering connection (a maximum of one).
        /// </summary>
        [Input("requester")]
        public Input<Inputs.VpcPeeringConnectionRequesterArgs>? Requester { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the requester VPC.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public VpcPeeringConnectionArgs()
        {
        }
    }

    public sealed class VpcPeeringConnectionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the VPC Peering Connection request.
        /// </summary>
        [Input("acceptStatus")]
        public Input<string>? AcceptStatus { get; set; }

        /// <summary>
        /// An optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
        /// the peering connection (a maximum of one).
        /// </summary>
        [Input("accepter")]
        public Input<Inputs.VpcPeeringConnectionAccepterGetArgs>? Accepter { get; set; }

        /// <summary>
        /// Accept the peering (both VPCs need to be in the same AWS account).
        /// </summary>
        [Input("autoAccept")]
        public Input<bool>? AutoAccept { get; set; }

        /// <summary>
        /// The AWS account ID of the owner of the peer VPC.
        /// Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
        /// </summary>
        [Input("peerOwnerId")]
        public Input<string>? PeerOwnerId { get; set; }

        /// <summary>
        /// The region of the accepter VPC of the [VPC Peering Connection]. `auto_accept` must be `false`,
        /// and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
        /// </summary>
        [Input("peerRegion")]
        public Input<string>? PeerRegion { get; set; }

        /// <summary>
        /// The ID of the VPC with which you are creating the VPC Peering Connection.
        /// </summary>
        [Input("peerVpcId")]
        public Input<string>? PeerVpcId { get; set; }

        /// <summary>
        /// A optional configuration block that allows for [VPC Peering Connection]
        /// (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
        /// the peering connection (a maximum of one).
        /// </summary>
        [Input("requester")]
        public Input<Inputs.VpcPeeringConnectionRequesterGetArgs>? Requester { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the requester VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public VpcPeeringConnectionState()
        {
        }
    }
}
