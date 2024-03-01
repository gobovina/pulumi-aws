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
    /// Provides a VPC Endpoint Service resource.
    /// Service consumers can create an _Interface_ VPC Endpoint to connect to the service.
    /// 
    /// &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
    /// both a standalone VPC Endpoint Service Allowed Principal resource
    /// and a VPC Endpoint Service resource with an `allowed_principals` attribute. Do not use the same principal ARN in both
    /// a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
    /// and will overwrite the association.
    /// 
    /// ## Example Usage
    /// ### Network Load Balancers
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.VpcEndpointService("example", new()
    ///     {
    ///         AcceptanceRequired = false,
    ///         NetworkLoadBalancerArns = new[]
    ///         {
    ///             exampleAwsLb.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gateway Load Balancers
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.VpcEndpointService("example", new()
    ///     {
    ///         AcceptanceRequired = false,
    ///         GatewayLoadBalancerArns = new[]
    ///         {
    ///             exampleAwsLb.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import VPC Endpoint Services using the VPC endpoint service `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcEndpointService:VpcEndpointService foo vpce-svc-0f97a19d3fa8220bc
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcEndpointService:VpcEndpointService")]
    public partial class VpcEndpointService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
        /// </summary>
        [Output("acceptanceRequired")]
        public Output<bool> AcceptanceRequired { get; private set; } = null!;

        /// <summary>
        /// The ARNs of one or more principals allowed to discover the endpoint service.
        /// </summary>
        [Output("allowedPrincipals")]
        public Output<ImmutableArray<string>> AllowedPrincipals { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the VPC endpoint service.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A set of Availability Zones in which the service is available.
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// A set of DNS names for the service.
        /// </summary>
        [Output("baseEndpointDnsNames")]
        public Output<ImmutableArray<string>> BaseEndpointDnsNames { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
        /// </summary>
        [Output("gatewayLoadBalancerArns")]
        public Output<ImmutableArray<string>> GatewayLoadBalancerArns { get; private set; } = null!;

        /// <summary>
        /// Whether or not the service manages its VPC endpoints - `true` or `false`.
        /// </summary>
        [Output("managesVpcEndpoints")]
        public Output<bool> ManagesVpcEndpoints { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
        /// </summary>
        [Output("networkLoadBalancerArns")]
        public Output<ImmutableArray<string>> NetworkLoadBalancerArns { get; private set; } = null!;

        /// <summary>
        /// The private DNS name for the service.
        /// </summary>
        [Output("privateDnsName")]
        public Output<string> PrivateDnsName { get; private set; } = null!;

        /// <summary>
        /// List of objects containing information about the endpoint service private DNS name configuration.
        /// </summary>
        [Output("privateDnsNameConfigurations")]
        public Output<ImmutableArray<Outputs.VpcEndpointServicePrivateDnsNameConfiguration>> PrivateDnsNameConfigurations { get; private set; } = null!;

        /// <summary>
        /// The service name.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// The service type, `Gateway` or `Interface`.
        /// </summary>
        [Output("serviceType")]
        public Output<string> ServiceType { get; private set; } = null!;

        /// <summary>
        /// Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The supported IP address types. The possible values are `ipv4` and `ipv6`.
        /// </summary>
        [Output("supportedIpAddressTypes")]
        public Output<ImmutableArray<string>> SupportedIpAddressTypes { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpointService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpointService(string name, VpcEndpointServiceArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpointService:VpcEndpointService", name, args ?? new VpcEndpointServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpointService(string name, Input<string> id, VpcEndpointServiceState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpointService:VpcEndpointService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpointService Get(string name, Input<string> id, VpcEndpointServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpointService(name, id, state, options);
        }
    }

    public sealed class VpcEndpointServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
        /// </summary>
        [Input("acceptanceRequired", required: true)]
        public Input<bool> AcceptanceRequired { get; set; } = null!;

        [Input("allowedPrincipals")]
        private InputList<string>? _allowedPrincipals;

        /// <summary>
        /// The ARNs of one or more principals allowed to discover the endpoint service.
        /// </summary>
        public InputList<string> AllowedPrincipals
        {
            get => _allowedPrincipals ?? (_allowedPrincipals = new InputList<string>());
            set => _allowedPrincipals = value;
        }

        [Input("gatewayLoadBalancerArns")]
        private InputList<string>? _gatewayLoadBalancerArns;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
        /// </summary>
        public InputList<string> GatewayLoadBalancerArns
        {
            get => _gatewayLoadBalancerArns ?? (_gatewayLoadBalancerArns = new InputList<string>());
            set => _gatewayLoadBalancerArns = value;
        }

        [Input("networkLoadBalancerArns")]
        private InputList<string>? _networkLoadBalancerArns;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
        /// </summary>
        public InputList<string> NetworkLoadBalancerArns
        {
            get => _networkLoadBalancerArns ?? (_networkLoadBalancerArns = new InputList<string>());
            set => _networkLoadBalancerArns = value;
        }

        /// <summary>
        /// The private DNS name for the service.
        /// </summary>
        [Input("privateDnsName")]
        public Input<string>? PrivateDnsName { get; set; }

        [Input("supportedIpAddressTypes")]
        private InputList<string>? _supportedIpAddressTypes;

        /// <summary>
        /// The supported IP address types. The possible values are `ipv4` and `ipv6`.
        /// </summary>
        public InputList<string> SupportedIpAddressTypes
        {
            get => _supportedIpAddressTypes ?? (_supportedIpAddressTypes = new InputList<string>());
            set => _supportedIpAddressTypes = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VpcEndpointServiceArgs()
        {
        }
        public static new VpcEndpointServiceArgs Empty => new VpcEndpointServiceArgs();
    }

    public sealed class VpcEndpointServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
        /// </summary>
        [Input("acceptanceRequired")]
        public Input<bool>? AcceptanceRequired { get; set; }

        [Input("allowedPrincipals")]
        private InputList<string>? _allowedPrincipals;

        /// <summary>
        /// The ARNs of one or more principals allowed to discover the endpoint service.
        /// </summary>
        public InputList<string> AllowedPrincipals
        {
            get => _allowedPrincipals ?? (_allowedPrincipals = new InputList<string>());
            set => _allowedPrincipals = value;
        }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the VPC endpoint service.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// A set of Availability Zones in which the service is available.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        [Input("baseEndpointDnsNames")]
        private InputList<string>? _baseEndpointDnsNames;

        /// <summary>
        /// A set of DNS names for the service.
        /// </summary>
        public InputList<string> BaseEndpointDnsNames
        {
            get => _baseEndpointDnsNames ?? (_baseEndpointDnsNames = new InputList<string>());
            set => _baseEndpointDnsNames = value;
        }

        [Input("gatewayLoadBalancerArns")]
        private InputList<string>? _gatewayLoadBalancerArns;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
        /// </summary>
        public InputList<string> GatewayLoadBalancerArns
        {
            get => _gatewayLoadBalancerArns ?? (_gatewayLoadBalancerArns = new InputList<string>());
            set => _gatewayLoadBalancerArns = value;
        }

        /// <summary>
        /// Whether or not the service manages its VPC endpoints - `true` or `false`.
        /// </summary>
        [Input("managesVpcEndpoints")]
        public Input<bool>? ManagesVpcEndpoints { get; set; }

        [Input("networkLoadBalancerArns")]
        private InputList<string>? _networkLoadBalancerArns;

        /// <summary>
        /// Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
        /// </summary>
        public InputList<string> NetworkLoadBalancerArns
        {
            get => _networkLoadBalancerArns ?? (_networkLoadBalancerArns = new InputList<string>());
            set => _networkLoadBalancerArns = value;
        }

        /// <summary>
        /// The private DNS name for the service.
        /// </summary>
        [Input("privateDnsName")]
        public Input<string>? PrivateDnsName { get; set; }

        [Input("privateDnsNameConfigurations")]
        private InputList<Inputs.VpcEndpointServicePrivateDnsNameConfigurationGetArgs>? _privateDnsNameConfigurations;

        /// <summary>
        /// List of objects containing information about the endpoint service private DNS name configuration.
        /// </summary>
        public InputList<Inputs.VpcEndpointServicePrivateDnsNameConfigurationGetArgs> PrivateDnsNameConfigurations
        {
            get => _privateDnsNameConfigurations ?? (_privateDnsNameConfigurations = new InputList<Inputs.VpcEndpointServicePrivateDnsNameConfigurationGetArgs>());
            set => _privateDnsNameConfigurations = value;
        }

        /// <summary>
        /// The service name.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// The service type, `Gateway` or `Interface`.
        /// </summary>
        [Input("serviceType")]
        public Input<string>? ServiceType { get; set; }

        /// <summary>
        /// Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("supportedIpAddressTypes")]
        private InputList<string>? _supportedIpAddressTypes;

        /// <summary>
        /// The supported IP address types. The possible values are `ipv4` and `ipv6`.
        /// </summary>
        public InputList<string> SupportedIpAddressTypes
        {
            get => _supportedIpAddressTypes ?? (_supportedIpAddressTypes = new InputList<string>());
            set => _supportedIpAddressTypes = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public VpcEndpointServiceState()
        {
        }
        public static new VpcEndpointServiceState Empty => new VpcEndpointServiceState();
    }
}
