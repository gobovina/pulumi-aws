// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2TransitGateway
{
    public static class GetRouteTableAssociations
    {
        /// <summary>
        /// Provides information for multiple EC2 Transit Gateway Route Table Associations, such as their identifiers.
        /// 
        /// ## Example Usage
        /// 
        /// ### By Transit Gateway Identifier
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
        ///     var example = Aws.Ec2TransitGateway.GetRouteTableAssociations.Invoke(new()
        ///     {
        ///         TransitGatewayRouteTableId = exampleAwsEc2TransitGatewayRouteTable.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetRouteTableAssociationsResult> InvokeAsync(GetRouteTableAssociationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteTableAssociationsResult>("aws:ec2transitgateway/getRouteTableAssociations:getRouteTableAssociations", args ?? new GetRouteTableAssociationsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information for multiple EC2 Transit Gateway Route Table Associations, such as their identifiers.
        /// 
        /// ## Example Usage
        /// 
        /// ### By Transit Gateway Identifier
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
        ///     var example = Aws.Ec2TransitGateway.GetRouteTableAssociations.Invoke(new()
        ///     {
        ///         TransitGatewayRouteTableId = exampleAwsEc2TransitGatewayRouteTable.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetRouteTableAssociationsResult> Invoke(GetRouteTableAssociationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteTableAssociationsResult>("aws:ec2transitgateway/getRouteTableAssociations:getRouteTableAssociations", args ?? new GetRouteTableAssociationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteTableAssociationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetRouteTableAssociationsFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public List<Inputs.GetRouteTableAssociationsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRouteTableAssociationsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Identifier of EC2 Transit Gateway Route Table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("transitGatewayRouteTableId", required: true)]
        public string TransitGatewayRouteTableId { get; set; } = null!;

        public GetRouteTableAssociationsArgs()
        {
        }
        public static new GetRouteTableAssociationsArgs Empty => new GetRouteTableAssociationsArgs();
    }

    public sealed class GetRouteTableAssociationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetRouteTableAssociationsFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public InputList<Inputs.GetRouteTableAssociationsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRouteTableAssociationsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Identifier of EC2 Transit Gateway Route Table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("transitGatewayRouteTableId", required: true)]
        public Input<string> TransitGatewayRouteTableId { get; set; } = null!;

        public GetRouteTableAssociationsInvokeArgs()
        {
        }
        public static new GetRouteTableAssociationsInvokeArgs Empty => new GetRouteTableAssociationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteTableAssociationsResult
    {
        public readonly ImmutableArray<Outputs.GetRouteTableAssociationsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of Transit Gateway Route Table Association identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string TransitGatewayRouteTableId;

        [OutputConstructor]
        private GetRouteTableAssociationsResult(
            ImmutableArray<Outputs.GetRouteTableAssociationsFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            string transitGatewayRouteTableId)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            TransitGatewayRouteTableId = transitGatewayRouteTableId;
        }
    }
}
