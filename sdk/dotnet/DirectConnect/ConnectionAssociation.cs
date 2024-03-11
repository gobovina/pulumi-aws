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
    /// Associates a Direct Connect Connection with a LAG.
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
    ///     var example = new Aws.DirectConnect.Connection("example", new()
    ///     {
    ///         Name = "example",
    ///         Bandwidth = "1Gbps",
    ///         Location = "EqSe2-EQ",
    ///     });
    /// 
    ///     var exampleLinkAggregationGroup = new Aws.DirectConnect.LinkAggregationGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         ConnectionsBandwidth = "1Gbps",
    ///         Location = "EqSe2-EQ",
    ///     });
    /// 
    ///     var exampleConnectionAssociation = new Aws.DirectConnect.ConnectionAssociation("example", new()
    ///     {
    ///         ConnectionId = example.Id,
    ///         LagId = exampleLinkAggregationGroup.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:directconnect/connectionAssociation:ConnectionAssociation")]
    public partial class ConnectionAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the connection.
        /// </summary>
        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the LAG with which to associate the connection.
        /// </summary>
        [Output("lagId")]
        public Output<string> LagId { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectionAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectionAssociation(string name, ConnectionAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:directconnect/connectionAssociation:ConnectionAssociation", name, args ?? new ConnectionAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectionAssociation(string name, Input<string> id, ConnectionAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:directconnect/connectionAssociation:ConnectionAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConnectionAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectionAssociation Get(string name, Input<string> id, ConnectionAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectionAssociation(name, id, state, options);
        }
    }

    public sealed class ConnectionAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the connection.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        /// <summary>
        /// The ID of the LAG with which to associate the connection.
        /// </summary>
        [Input("lagId", required: true)]
        public Input<string> LagId { get; set; } = null!;

        public ConnectionAssociationArgs()
        {
        }
        public static new ConnectionAssociationArgs Empty => new ConnectionAssociationArgs();
    }

    public sealed class ConnectionAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the connection.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// The ID of the LAG with which to associate the connection.
        /// </summary>
        [Input("lagId")]
        public Input<string>? LagId { get; set; }

        public ConnectionAssociationState()
        {
        }
        public static new ConnectionAssociationState Empty => new ConnectionAssociationState();
    }
}
