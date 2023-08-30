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
    /// Resource for managing an AWS NetworkManager SiteToSiteAttachment.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.NetworkManager.SiteToSiteVpnAttachment("example", new()
    ///     {
    ///         CoreNetworkId = awscc_networkmanager_core_network.Example.Id,
    ///         VpnConnectionArn = aws_vpn_connection.Example.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_networkmanager_site_to_site_vpn_attachment` using the attachment ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment example attachment-0f8fa60d2238d1bd8
    /// ```
    /// </summary>
    [AwsResourceType("aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment")]
    public partial class SiteToSiteVpnAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the attachment.
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
        /// The ARN of a core network.
        /// </summary>
        [Output("coreNetworkArn")]
        public Output<string> CoreNetworkArn { get; private set; } = null!;

        /// <summary>
        /// The ID of a core network for the VPN attachment.
        /// </summary>
        [Output("coreNetworkId")]
        public Output<string> CoreNetworkId { get; private set; } = null!;

        /// <summary>
        /// The Region where the edge is located.
        /// </summary>
        [Output("edgeLocation")]
        public Output<string> EdgeLocation { get; private set; } = null!;

        /// <summary>
        /// The ID of the attachment account owner.
        /// </summary>
        [Output("ownerAccountId")]
        public Output<string> OwnerAccountId { get; private set; } = null!;

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

        /// <summary>
        /// Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The ARN of the site-to-site VPN connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("vpnConnectionArn")]
        public Output<string> VpnConnectionArn { get; private set; } = null!;


        /// <summary>
        /// Create a SiteToSiteVpnAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SiteToSiteVpnAttachment(string name, SiteToSiteVpnAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment", name, args ?? new SiteToSiteVpnAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SiteToSiteVpnAttachment(string name, Input<string> id, SiteToSiteVpnAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SiteToSiteVpnAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SiteToSiteVpnAttachment Get(string name, Input<string> id, SiteToSiteVpnAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new SiteToSiteVpnAttachment(name, id, state, options);
        }
    }

    public sealed class SiteToSiteVpnAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of a core network for the VPN attachment.
        /// </summary>
        [Input("coreNetworkId", required: true)]
        public Input<string> CoreNetworkId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ARN of the site-to-site VPN connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpnConnectionArn", required: true)]
        public Input<string> VpnConnectionArn { get; set; } = null!;

        public SiteToSiteVpnAttachmentArgs()
        {
        }
        public static new SiteToSiteVpnAttachmentArgs Empty => new SiteToSiteVpnAttachmentArgs();
    }

    public sealed class SiteToSiteVpnAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the attachment.
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
        /// The ARN of a core network.
        /// </summary>
        [Input("coreNetworkArn")]
        public Input<string>? CoreNetworkArn { get; set; }

        /// <summary>
        /// The ID of a core network for the VPN attachment.
        /// </summary>
        [Input("coreNetworkId")]
        public Input<string>? CoreNetworkId { get; set; }

        /// <summary>
        /// The Region where the edge is located.
        /// </summary>
        [Input("edgeLocation")]
        public Input<string>? EdgeLocation { get; set; }

        /// <summary>
        /// The ID of the attachment account owner.
        /// </summary>
        [Input("ownerAccountId")]
        public Input<string>? OwnerAccountId { get; set; }

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

        /// <summary>
        /// Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// The ARN of the site-to-site VPN connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpnConnectionArn")]
        public Input<string>? VpnConnectionArn { get; set; }

        public SiteToSiteVpnAttachmentState()
        {
        }
        public static new SiteToSiteVpnAttachmentState Empty => new SiteToSiteVpnAttachmentState();
    }
}
