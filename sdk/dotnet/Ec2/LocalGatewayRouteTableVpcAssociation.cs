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
    /// Manages an EC2 Local Gateway Route Table VPC Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#vpc-associations).
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
    ///     var example = Aws.Ec2.GetLocalGatewayRouteTable.Invoke(new()
    ///     {
    ///         OutpostArn = "arn:aws:outposts:us-west-2:123456789012:outpost/op-1234567890abcdef",
    ///     });
    /// 
    ///     var exampleVpc = new Aws.Ec2.Vpc("example", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var exampleLocalGatewayRouteTableVpcAssociation = new Aws.Ec2.LocalGatewayRouteTableVpcAssociation("example", new()
    ///     {
    ///         LocalGatewayRouteTableId = example.Apply(getLocalGatewayRouteTableResult =&gt; getLocalGatewayRouteTableResult.Id),
    ///         VpcId = exampleVpc.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ec2_local_gateway_route_table_vpc_association` using the Local Gateway Route Table VPC Association identifier. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation example lgw-vpc-assoc-1234567890abcdef
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation")]
    public partial class LocalGatewayRouteTableVpcAssociation : global::Pulumi.CustomResource
    {
        [Output("localGatewayId")]
        public Output<string> LocalGatewayId { get; private set; } = null!;

        /// <summary>
        /// Identifier of EC2 Local Gateway Route Table.
        /// </summary>
        [Output("localGatewayRouteTableId")]
        public Output<string> LocalGatewayRouteTableId { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Identifier of EC2 VPC.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a LocalGatewayRouteTableVpcAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LocalGatewayRouteTableVpcAssociation(string name, LocalGatewayRouteTableVpcAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, args ?? new LocalGatewayRouteTableVpcAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LocalGatewayRouteTableVpcAssociation(string name, Input<string> id, LocalGatewayRouteTableVpcAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LocalGatewayRouteTableVpcAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LocalGatewayRouteTableVpcAssociation Get(string name, Input<string> id, LocalGatewayRouteTableVpcAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new LocalGatewayRouteTableVpcAssociation(name, id, state, options);
        }
    }

    public sealed class LocalGatewayRouteTableVpcAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of EC2 Local Gateway Route Table.
        /// </summary>
        [Input("localGatewayRouteTableId", required: true)]
        public Input<string> LocalGatewayRouteTableId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier of EC2 VPC.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public LocalGatewayRouteTableVpcAssociationArgs()
        {
        }
        public static new LocalGatewayRouteTableVpcAssociationArgs Empty => new LocalGatewayRouteTableVpcAssociationArgs();
    }

    public sealed class LocalGatewayRouteTableVpcAssociationState : global::Pulumi.ResourceArgs
    {
        [Input("localGatewayId")]
        public Input<string>? LocalGatewayId { get; set; }

        /// <summary>
        /// Identifier of EC2 Local Gateway Route Table.
        /// </summary>
        [Input("localGatewayRouteTableId")]
        public Input<string>? LocalGatewayRouteTableId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Identifier of EC2 VPC.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public LocalGatewayRouteTableVpcAssociationState()
        {
        }
        public static new LocalGatewayRouteTableVpcAssociationState Empty => new LocalGatewayRouteTableVpcAssociationState();
    }
}
