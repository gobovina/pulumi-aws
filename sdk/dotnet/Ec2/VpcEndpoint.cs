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
    /// Provides a VPC Endpoint resource.
    /// 
    /// &gt; **NOTE on VPC Endpoints and VPC Endpoint Associations:** The provider provides both standalone VPC Endpoint Associations for
    /// Route Tables - (an association between a VPC endpoint and a single `route_table_id`),
    /// Security Groups - (an association between a VPC endpoint and a single `security_group_id`),
    /// and Subnets - (an association between a VPC endpoint and a single `subnet_id`) and
    /// a VPC Endpoint resource with `route_table_ids` and `subnet_ids` attributes.
    /// Do not use the same resource ID in both a VPC Endpoint resource and a VPC Endpoint Association resource.
    /// Doing so will cause a conflict of associations and will overwrite the association.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.s3",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Basic w/ Tags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var s3 = new Aws.Ec2.VpcEndpoint("s3", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.s3",
    ///         Tags = 
    ///         {
    ///             { "Environment", "test" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Interface Endpoint Type
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ec2 = new Aws.Ec2.VpcEndpoint("ec2", new()
    ///     {
    ///         VpcId = aws_vpc.Main.Id,
    ///         ServiceName = "com.amazonaws.us-west-2.ec2",
    ///         VpcEndpointType = "Interface",
    ///         SecurityGroupIds = new[]
    ///         {
    ///             aws_security_group.Sg1.Id,
    ///         },
    ///         PrivateDnsEnabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gateway Load Balancer Endpoint Type
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var exampleVpcEndpointService = new Aws.Ec2.VpcEndpointService("exampleVpcEndpointService", new()
    ///     {
    ///         AcceptanceRequired = false,
    ///         AllowedPrincipals = new[]
    ///         {
    ///             current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
    ///         },
    ///         GatewayLoadBalancerArns = new[]
    ///         {
    ///             aws_lb.Example.Arn,
    ///         },
    ///     });
    /// 
    ///     var exampleVpcEndpoint = new Aws.Ec2.VpcEndpoint("exampleVpcEndpoint", new()
    ///     {
    ///         ServiceName = exampleVpcEndpointService.ServiceName,
    ///         SubnetIds = new[]
    ///         {
    ///             aws_subnet.Example.Id,
    ///         },
    ///         VpcEndpointType = exampleVpcEndpointService.ServiceType,
    ///         VpcId = aws_vpc.Example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import VPC Endpoints using the VPC endpoint `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcEndpoint:VpcEndpoint endpoint1 vpce-3ecf2a57
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcEndpoint:VpcEndpoint")]
    public partial class VpcEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the VPC endpoint.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        /// </summary>
        [Output("autoAccept")]
        public Output<bool?> AutoAccept { get; private set; } = null!;

        /// <summary>
        /// The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
        /// </summary>
        [Output("cidrBlocks")]
        public Output<ImmutableArray<string>> CidrBlocks { get; private set; } = null!;

        /// <summary>
        /// The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
        /// </summary>
        [Output("dnsEntries")]
        public Output<ImmutableArray<Outputs.VpcEndpointDnsEntry>> DnsEntries { get; private set; } = null!;

        /// <summary>
        /// The DNS options for the endpoint. See dns_options below.
        /// </summary>
        [Output("dnsOptions")]
        public Output<Outputs.VpcEndpointDnsOptions> DnsOptions { get; private set; } = null!;

        /// <summary>
        /// The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        /// </summary>
        [Output("ipAddressType")]
        public Output<string> IpAddressType { get; private set; } = null!;

        /// <summary>
        /// One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
        /// </summary>
        [Output("networkInterfaceIds")]
        public Output<ImmutableArray<string>> NetworkInterfaceIds { get; private set; } = null!;

        /// <summary>
        /// The ID of the AWS account that owns the VPC endpoint.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
        /// </summary>
        [Output("prefixListId")]
        public Output<string> PrefixListId { get; private set; } = null!;

        /// <summary>
        /// Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
        /// Defaults to `false`.
        /// </summary>
        [Output("privateDnsEnabled")]
        public Output<bool?> PrivateDnsEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
        /// </summary>
        [Output("requesterManaged")]
        public Output<bool> RequesterManaged { get; private set; } = null!;

        /// <summary>
        /// One or more route table IDs. Applicable for endpoints of type `Gateway`.
        /// </summary>
        [Output("routeTableIds")]
        public Output<ImmutableArray<string>> RouteTableIds { get; private set; } = null!;

        /// <summary>
        /// The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
        /// If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// The state of the VPC endpoint.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        /// </summary>
        [Output("vpcEndpointType")]
        public Output<string?> VpcEndpointType { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC in which the endpoint will be used.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpoint(string name, VpcEndpointArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpoint:VpcEndpoint", name, args ?? new VpcEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpoint(string name, Input<string> id, VpcEndpointState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpoint:VpcEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpoint Get(string name, Input<string> id, VpcEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpoint(name, id, state, options);
        }
    }

    public sealed class VpcEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        /// </summary>
        [Input("autoAccept")]
        public Input<bool>? AutoAccept { get; set; }

        /// <summary>
        /// The DNS options for the endpoint. See dns_options below.
        /// </summary>
        [Input("dnsOptions")]
        public Input<Inputs.VpcEndpointDnsOptionsArgs>? DnsOptions { get; set; }

        /// <summary>
        /// The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        /// </summary>
        [Input("ipAddressType")]
        public Input<string>? IpAddressType { get; set; }

        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
        /// Defaults to `false`.
        /// </summary>
        [Input("privateDnsEnabled")]
        public Input<bool>? PrivateDnsEnabled { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// One or more route table IDs. Applicable for endpoints of type `Gateway`.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
        /// If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        /// </summary>
        [Input("vpcEndpointType")]
        public Input<string>? VpcEndpointType { get; set; }

        /// <summary>
        /// The ID of the VPC in which the endpoint will be used.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public VpcEndpointArgs()
        {
        }
        public static new VpcEndpointArgs Empty => new VpcEndpointArgs();
    }

    public sealed class VpcEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the VPC endpoint.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
        /// </summary>
        [Input("autoAccept")]
        public Input<bool>? AutoAccept { get; set; }

        [Input("cidrBlocks")]
        private InputList<string>? _cidrBlocks;

        /// <summary>
        /// The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
        /// </summary>
        public InputList<string> CidrBlocks
        {
            get => _cidrBlocks ?? (_cidrBlocks = new InputList<string>());
            set => _cidrBlocks = value;
        }

        [Input("dnsEntries")]
        private InputList<Inputs.VpcEndpointDnsEntryGetArgs>? _dnsEntries;

        /// <summary>
        /// The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
        /// </summary>
        public InputList<Inputs.VpcEndpointDnsEntryGetArgs> DnsEntries
        {
            get => _dnsEntries ?? (_dnsEntries = new InputList<Inputs.VpcEndpointDnsEntryGetArgs>());
            set => _dnsEntries = value;
        }

        /// <summary>
        /// The DNS options for the endpoint. See dns_options below.
        /// </summary>
        [Input("dnsOptions")]
        public Input<Inputs.VpcEndpointDnsOptionsGetArgs>? DnsOptions { get; set; }

        /// <summary>
        /// The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
        /// </summary>
        [Input("ipAddressType")]
        public Input<string>? IpAddressType { get; set; }

        [Input("networkInterfaceIds")]
        private InputList<string>? _networkInterfaceIds;

        /// <summary>
        /// One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
        /// </summary>
        public InputList<string> NetworkInterfaceIds
        {
            get => _networkInterfaceIds ?? (_networkInterfaceIds = new InputList<string>());
            set => _networkInterfaceIds = value;
        }

        /// <summary>
        /// The ID of the AWS account that owns the VPC endpoint.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        /// <summary>
        /// Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
        /// Defaults to `false`.
        /// </summary>
        [Input("privateDnsEnabled")]
        public Input<bool>? PrivateDnsEnabled { get; set; }

        /// <summary>
        /// Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
        /// </summary>
        [Input("requesterManaged")]
        public Input<bool>? RequesterManaged { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// One or more route table IDs. Applicable for endpoints of type `Gateway`.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
        /// If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// The state of the VPC endpoint.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
        /// </summary>
        [Input("vpcEndpointType")]
        public Input<string>? VpcEndpointType { get; set; }

        /// <summary>
        /// The ID of the VPC in which the endpoint will be used.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public VpcEndpointState()
        {
        }
        public static new VpcEndpointState Empty => new VpcEndpointState();
    }
}
