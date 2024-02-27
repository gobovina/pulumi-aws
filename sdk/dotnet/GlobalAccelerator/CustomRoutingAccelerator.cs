// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GlobalAccelerator
{
    /// <summary>
    /// Creates a Global Accelerator custom routing accelerator.
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
    ///     var example = new Aws.GlobalAccelerator.CustomRoutingAccelerator("example", new()
    ///     {
    ///         Attributes = new Aws.GlobalAccelerator.Inputs.CustomRoutingAcceleratorAttributesArgs
    ///         {
    ///             FlowLogsEnabled = true,
    ///             FlowLogsS3Bucket = "example-bucket",
    ///             FlowLogsS3Prefix = "flow-logs/",
    ///         },
    ///         Enabled = true,
    ///         IpAddressType = "IPV4",
    ///         IpAddresses = new[]
    ///         {
    ///             "1.2.3.4",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Global Accelerator custom routing accelerators using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
    /// ```
    /// </summary>
    [AwsResourceType("aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator")]
    public partial class CustomRoutingAccelerator : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The attributes of the accelerator. Fields documented below.
        /// </summary>
        [Output("attributes")]
        public Output<Outputs.CustomRoutingAcceleratorAttributes?> Attributes { get; private set; } = null!;

        /// <summary>
        /// The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// -  The Global Accelerator Route 53 zone ID that can be used to
        /// route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
        /// is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
        /// </summary>
        [Output("hostedZoneId")]
        public Output<string> HostedZoneId { get; private set; } = null!;

        /// <summary>
        /// The IP address type that an accelerator supports. For a custom routing accelerator, the value must be `"IPV4"`.
        /// </summary>
        [Output("ipAddressType")]
        public Output<string?> IpAddressType { get; private set; } = null!;

        /// <summary>
        /// The IP addresses to use for BYOIP accelerators. If not specified, the service assigns IP addresses. Valid values: 1 or 2 IPv4 addresses.
        /// </summary>
        [Output("ipAddresses")]
        public Output<ImmutableArray<string>> IpAddresses { get; private set; } = null!;

        /// <summary>
        /// IP address set associated with the accelerator.
        /// </summary>
        [Output("ipSets")]
        public Output<ImmutableArray<Outputs.CustomRoutingAcceleratorIpSet>> IpSets { get; private set; } = null!;

        /// <summary>
        /// The name of a custom routing accelerator.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// Create a CustomRoutingAccelerator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomRoutingAccelerator(string name, CustomRoutingAcceleratorArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator", name, args ?? new CustomRoutingAcceleratorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomRoutingAccelerator(string name, Input<string> id, CustomRoutingAcceleratorState? state = null, CustomResourceOptions? options = null)
            : base("aws:globalaccelerator/customRoutingAccelerator:CustomRoutingAccelerator", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomRoutingAccelerator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomRoutingAccelerator Get(string name, Input<string> id, CustomRoutingAcceleratorState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomRoutingAccelerator(name, id, state, options);
        }
    }

    public sealed class CustomRoutingAcceleratorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attributes of the accelerator. Fields documented below.
        /// </summary>
        [Input("attributes")]
        public Input<Inputs.CustomRoutingAcceleratorAttributesArgs>? Attributes { get; set; }

        /// <summary>
        /// Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The IP address type that an accelerator supports. For a custom routing accelerator, the value must be `"IPV4"`.
        /// </summary>
        [Input("ipAddressType")]
        public Input<string>? IpAddressType { get; set; }

        [Input("ipAddresses")]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// The IP addresses to use for BYOIP accelerators. If not specified, the service assigns IP addresses. Valid values: 1 or 2 IPv4 addresses.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        /// <summary>
        /// The name of a custom routing accelerator.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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

        public CustomRoutingAcceleratorArgs()
        {
        }
        public static new CustomRoutingAcceleratorArgs Empty => new CustomRoutingAcceleratorArgs();
    }

    public sealed class CustomRoutingAcceleratorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attributes of the accelerator. Fields documented below.
        /// </summary>
        [Input("attributes")]
        public Input<Inputs.CustomRoutingAcceleratorAttributesGetArgs>? Attributes { get; set; }

        /// <summary>
        /// The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        /// <summary>
        /// Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// -  The Global Accelerator Route 53 zone ID that can be used to
        /// route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
        /// is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        /// <summary>
        /// The IP address type that an accelerator supports. For a custom routing accelerator, the value must be `"IPV4"`.
        /// </summary>
        [Input("ipAddressType")]
        public Input<string>? IpAddressType { get; set; }

        [Input("ipAddresses")]
        private InputList<string>? _ipAddresses;

        /// <summary>
        /// The IP addresses to use for BYOIP accelerators. If not specified, the service assigns IP addresses. Valid values: 1 or 2 IPv4 addresses.
        /// </summary>
        public InputList<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<string>());
            set => _ipAddresses = value;
        }

        [Input("ipSets")]
        private InputList<Inputs.CustomRoutingAcceleratorIpSetGetArgs>? _ipSets;

        /// <summary>
        /// IP address set associated with the accelerator.
        /// </summary>
        public InputList<Inputs.CustomRoutingAcceleratorIpSetGetArgs> IpSets
        {
            get => _ipSets ?? (_ipSets = new InputList<Inputs.CustomRoutingAcceleratorIpSetGetArgs>());
            set => _ipSets = value;
        }

        /// <summary>
        /// The name of a custom routing accelerator.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public CustomRoutingAcceleratorState()
        {
        }
        public static new CustomRoutingAcceleratorState Empty => new CustomRoutingAcceleratorState();
    }
}
