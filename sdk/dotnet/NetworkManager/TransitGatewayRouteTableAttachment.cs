// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager
{
    /// <summary>
    /// Creates a transit gateway route table attachment.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.NetworkManager.TransitGatewayRouteTableAttachment("example", new()
    ///     {
    ///         PeeringId = aws_networkmanager_transit_gateway_peering.Example.Id,
    ///         TransitGatewayRouteTableArn = aws_ec2_transit_gateway_route_table.Example.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_networkmanager_transit_gateway_route_table_attachment` can be imported using the attachment ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment example attachment-0f8fa60d2238d1bd8
    /// ```
    /// </summary>
    [AwsResourceType("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment")]
    public partial class TransitGatewayRouteTableAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Attachment Amazon Resource Name (ARN).
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The policy rule number associated with the attachment.
        /// </summary>
        [Output("attachmentPolicyRuleNumber")]
        public Output<int> AttachmentPolicyRuleNumber { get; private set; } = null!;

        /// <summary>
        /// The type of attachment.
        /// </summary>
        [Output("attachmentType")]
        public Output<string> AttachmentType { get; private set; } = null!;

        /// <summary>
        /// The ARN of the core network.
        /// </summary>
        [Output("coreNetworkArn")]
        public Output<string> CoreNetworkArn { get; private set; } = null!;

        /// <summary>
        /// The ID of the core network.
        /// </summary>
        [Output("coreNetworkId")]
        public Output<string> CoreNetworkId { get; private set; } = null!;

        /// <summary>
        /// The edge location for the peer.
        /// </summary>
        [Output("edgeLocation")]
        public Output<string> EdgeLocation { get; private set; } = null!;

        /// <summary>
        /// The ID of the attachment account owner.
        /// </summary>
        [Output("ownerAccountId")]
        public Output<string> OwnerAccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of the peer for the attachment.
        /// </summary>
        [Output("peeringId")]
        public Output<string> PeeringId { get; private set; } = null!;

        /// <summary>
        /// The attachment resource ARN.
        /// </summary>
        [Output("resourceArn")]
        public Output<string> ResourceArn { get; private set; } = null!;

        /// <summary>
        /// The name of the segment attachment.
        /// </summary>
        [Output("segmentName")]
        public Output<string> SegmentName { get; private set; } = null!;

        /// <summary>
        /// The state of the attachment.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The ARN of the transit gateway route table for the attachment.
        /// </summary>
        [Output("transitGatewayRouteTableArn")]
        public Output<string> TransitGatewayRouteTableArn { get; private set; } = null!;


        /// <summary>
        /// Create a TransitGatewayRouteTableAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitGatewayRouteTableAttachment(string name, TransitGatewayRouteTableAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, args ?? new TransitGatewayRouteTableAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitGatewayRouteTableAttachment(string name, Input<string> id, TransitGatewayRouteTableAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitGatewayRouteTableAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitGatewayRouteTableAttachment Get(string name, Input<string> id, TransitGatewayRouteTableAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitGatewayRouteTableAttachment(name, id, state, options);
        }
    }

    public sealed class TransitGatewayRouteTableAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the peer for the attachment.
        /// </summary>
        [Input("peeringId", required: true)]
        public Input<string> PeeringId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The ARN of the transit gateway route table for the attachment.
        /// </summary>
        [Input("transitGatewayRouteTableArn", required: true)]
        public Input<string> TransitGatewayRouteTableArn { get; set; } = null!;

        public TransitGatewayRouteTableAttachmentArgs()
        {
        }
        public static new TransitGatewayRouteTableAttachmentArgs Empty => new TransitGatewayRouteTableAttachmentArgs();
    }

    public sealed class TransitGatewayRouteTableAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Attachment Amazon Resource Name (ARN).
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The policy rule number associated with the attachment.
        /// </summary>
        [Input("attachmentPolicyRuleNumber")]
        public Input<int>? AttachmentPolicyRuleNumber { get; set; }

        /// <summary>
        /// The type of attachment.
        /// </summary>
        [Input("attachmentType")]
        public Input<string>? AttachmentType { get; set; }

        /// <summary>
        /// The ARN of the core network.
        /// </summary>
        [Input("coreNetworkArn")]
        public Input<string>? CoreNetworkArn { get; set; }

        /// <summary>
        /// The ID of the core network.
        /// </summary>
        [Input("coreNetworkId")]
        public Input<string>? CoreNetworkId { get; set; }

        /// <summary>
        /// The edge location for the peer.
        /// </summary>
        [Input("edgeLocation")]
        public Input<string>? EdgeLocation { get; set; }

        /// <summary>
        /// The ID of the attachment account owner.
        /// </summary>
        [Input("ownerAccountId")]
        public Input<string>? OwnerAccountId { get; set; }

        /// <summary>
        /// The ID of the peer for the attachment.
        /// </summary>
        [Input("peeringId")]
        public Input<string>? PeeringId { get; set; }

        /// <summary>
        /// The attachment resource ARN.
        /// </summary>
        [Input("resourceArn")]
        public Input<string>? ResourceArn { get; set; }

        /// <summary>
        /// The name of the segment attachment.
        /// </summary>
        [Input("segmentName")]
        public Input<string>? SegmentName { get; set; }

        /// <summary>
        /// The state of the attachment.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The ARN of the transit gateway route table for the attachment.
        /// </summary>
        [Input("transitGatewayRouteTableArn")]
        public Input<string>? TransitGatewayRouteTableArn { get; set; }

        public TransitGatewayRouteTableAttachmentState()
        {
        }
        public static new TransitGatewayRouteTableAttachmentState Empty => new TransitGatewayRouteTableAttachmentState();
    }
}
