// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectConnect
{
    /// <summary>
    /// Provides a Direct Connect Gateway.
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
    ///     var example = new Aws.DirectConnect.Gateway("example", new()
    ///     {
    ///         Name = "tf-dxg-example",
    ///         AmazonSideAsn = "64512",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Direct Connect Gateways using the gateway `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:directconnect/gateway:Gateway test abcd1234-dcba-5678-be23-cdef9876ab45
    /// ```
    /// </summary>
    [AwsResourceType("aws:directconnect/gateway:Gateway")]
    public partial class Gateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
        /// </summary>
        [Output("amazonSideAsn")]
        public Output<string> AmazonSideAsn { get; private set; } = null!;

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// AWS Account ID of the gateway.
        /// </summary>
        [Output("ownerAccountId")]
        public Output<string> OwnerAccountId { get; private set; } = null!;


        /// <summary>
        /// Create a Gateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gateway(string name, GatewayArgs args, CustomResourceOptions? options = null)
            : base("aws:directconnect/gateway:Gateway", name, args ?? new GatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gateway(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
            : base("aws:directconnect/gateway:Gateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Gateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gateway Get(string name, Input<string> id, GatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new Gateway(name, id, state, options);
        }
    }

    public sealed class GatewayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
        /// </summary>
        [Input("amazonSideAsn", required: true)]
        public Input<string> AmazonSideAsn { get; set; } = null!;

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GatewayArgs()
        {
        }
        public static new GatewayArgs Empty => new GatewayArgs();
    }

    public sealed class GatewayState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
        /// </summary>
        [Input("amazonSideAsn")]
        public Input<string>? AmazonSideAsn { get; set; }

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// AWS Account ID of the gateway.
        /// </summary>
        [Input("ownerAccountId")]
        public Input<string>? OwnerAccountId { get; set; }

        public GatewayState()
        {
        }
        public static new GatewayState Empty => new GatewayState();
    }
}
