// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2ClientVpn
{
    /// <summary>
    /// Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
    /// [AWS Client VPN Administrator's Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
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
    ///     var example = new Aws.Ec2ClientVpn.NetworkAssociation("example", new()
    ///     {
    ///         ClientVpnEndpointId = exampleAwsEc2ClientVpnEndpoint.Id,
    ///         SubnetId = exampleAwsSubnet.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AWS Client VPN network associations using the endpoint ID and the association ID. Values are separated by a `,`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2clientvpn/networkAssociation:NetworkAssociation example cvpn-endpoint-0ac3a1abbccddd666,cvpn-assoc-0b8db902465d069ad
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2clientvpn/networkAssociation:NetworkAssociation")]
    public partial class NetworkAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique ID of the target network association.
        /// </summary>
        [Output("associationId")]
        public Output<string> AssociationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Client VPN endpoint.
        /// </summary>
        [Output("clientVpnEndpointId")]
        public Output<string> ClientVpnEndpointId { get; private set; } = null!;

        /// <summary>
        /// The ID of the subnet to associate with the Client VPN endpoint.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC in which the target subnet is located.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkAssociation(string name, NetworkAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, args ?? new NetworkAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkAssociation(string name, Input<string> id, NetworkAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkAssociation Get(string name, Input<string> id, NetworkAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkAssociation(name, id, state, options);
        }
    }

    public sealed class NetworkAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Client VPN endpoint.
        /// </summary>
        [Input("clientVpnEndpointId", required: true)]
        public Input<string> ClientVpnEndpointId { get; set; } = null!;

        /// <summary>
        /// The ID of the subnet to associate with the Client VPN endpoint.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public NetworkAssociationArgs()
        {
        }
        public static new NetworkAssociationArgs Empty => new NetworkAssociationArgs();
    }

    public sealed class NetworkAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique ID of the target network association.
        /// </summary>
        [Input("associationId")]
        public Input<string>? AssociationId { get; set; }

        /// <summary>
        /// The ID of the Client VPN endpoint.
        /// </summary>
        [Input("clientVpnEndpointId")]
        public Input<string>? ClientVpnEndpointId { get; set; }

        /// <summary>
        /// The ID of the subnet to associate with the Client VPN endpoint.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The ID of the VPC in which the target subnet is located.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NetworkAssociationState()
        {
        }
        public static new NetworkAssociationState Empty => new NetworkAssociationState();
    }
}
