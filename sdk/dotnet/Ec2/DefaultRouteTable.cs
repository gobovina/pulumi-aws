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
    /// Provides a resource to manage a default route table of a VPC. This resource can manage the default route table of the default or a non-default VPC.
    /// 
    /// &gt; **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultRouteTable` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management. **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.MainRouteTableAssociation documentation for more details.
    /// 
    /// Every VPC has a default route table that can be managed but not destroyed. When the provider first adopts a default route table, it **immediately removes all defined routes**. It then proceeds to create any routes specified in the configuration. This step is required so that only the routes specified in the configuration exist in the default route table.
    /// 
    /// For more information, see the Amazon VPC User Guide on [Route Tables](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html). For information about managing normal route tables in this provider, see `aws.ec2.RouteTable`.
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
    ///     var example = new Aws.Ec2.DefaultRouteTable("example", new()
    ///     {
    ///         DefaultRouteTableId = aws_vpc.Example.Default_route_table_id,
    ///         Routes = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.DefaultRouteTableRouteArgs
    ///             {
    ///                 CidrBlock = "10.0.1.0/24",
    ///                 GatewayId = aws_internet_gateway.Example.Id,
    ///             },
    ///             new Aws.Ec2.Inputs.DefaultRouteTableRouteArgs
    ///             {
    ///                 Ipv6CidrBlock = "::/0",
    ///                 EgressOnlyGatewayId = aws_egress_only_internet_gateway.Example.Id,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "example" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// To subsequently remove all managed routes:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.DefaultRouteTable("example", new()
    ///     {
    ///         DefaultRouteTableId = aws_vpc.Example.Default_route_table_id,
    ///         Routes = new[] {},
    ///         Tags = 
    ///         {
    ///             { "Name", "example" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Default VPC route tables using the `vpc_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/defaultRouteTable:DefaultRouteTable example vpc-33cc44dd
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/defaultRouteTable:DefaultRouteTable")]
    public partial class DefaultRouteTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the route table.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// ID of the default route table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("defaultRouteTableId")]
        public Output<string> DefaultRouteTableId { get; private set; } = null!;

        /// <summary>
        /// ID of the AWS account that owns the route table.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// List of virtual gateways for propagation.
        /// </summary>
        [Output("propagatingVgws")]
        public Output<ImmutableArray<string>> PropagatingVgws { get; private set; } = null!;

        /// <summary>
        /// Set of objects. Detailed below
        /// </summary>
        [Output("routes")]
        public Output<ImmutableArray<Outputs.DefaultRouteTableRoute>> Routes { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// ID of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a DefaultRouteTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DefaultRouteTable(string name, DefaultRouteTableArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/defaultRouteTable:DefaultRouteTable", name, args ?? new DefaultRouteTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DefaultRouteTable(string name, Input<string> id, DefaultRouteTableState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/defaultRouteTable:DefaultRouteTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DefaultRouteTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DefaultRouteTable Get(string name, Input<string> id, DefaultRouteTableState? state = null, CustomResourceOptions? options = null)
        {
            return new DefaultRouteTable(name, id, state, options);
        }
    }

    public sealed class DefaultRouteTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the default route table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("defaultRouteTableId", required: true)]
        public Input<string> DefaultRouteTableId { get; set; } = null!;

        [Input("propagatingVgws")]
        private InputList<string>? _propagatingVgws;

        /// <summary>
        /// List of virtual gateways for propagation.
        /// </summary>
        public InputList<string> PropagatingVgws
        {
            get => _propagatingVgws ?? (_propagatingVgws = new InputList<string>());
            set => _propagatingVgws = value;
        }

        [Input("routes")]
        private InputList<Inputs.DefaultRouteTableRouteArgs>? _routes;

        /// <summary>
        /// Set of objects. Detailed below
        /// </summary>
        public InputList<Inputs.DefaultRouteTableRouteArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.DefaultRouteTableRouteArgs>());
            set => _routes = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DefaultRouteTableArgs()
        {
        }
        public static new DefaultRouteTableArgs Empty => new DefaultRouteTableArgs();
    }

    public sealed class DefaultRouteTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the route table.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ID of the default route table.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("defaultRouteTableId")]
        public Input<string>? DefaultRouteTableId { get; set; }

        /// <summary>
        /// ID of the AWS account that owns the route table.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        [Input("propagatingVgws")]
        private InputList<string>? _propagatingVgws;

        /// <summary>
        /// List of virtual gateways for propagation.
        /// </summary>
        public InputList<string> PropagatingVgws
        {
            get => _propagatingVgws ?? (_propagatingVgws = new InputList<string>());
            set => _propagatingVgws = value;
        }

        [Input("routes")]
        private InputList<Inputs.DefaultRouteTableRouteGetArgs>? _routes;

        /// <summary>
        /// Set of objects. Detailed below
        /// </summary>
        public InputList<Inputs.DefaultRouteTableRouteGetArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.DefaultRouteTableRouteGetArgs>());
            set => _routes = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public DefaultRouteTableState()
        {
        }
        public static new DefaultRouteTableState Empty => new DefaultRouteTableState();
    }
}
