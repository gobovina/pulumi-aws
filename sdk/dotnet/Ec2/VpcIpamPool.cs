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
    /// Provides an IP address pool resource for IPAM.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
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
    ///     var current = Aws.GetRegion.Invoke();
    /// 
    ///     var example = new Aws.Ec2.VpcIpam("example", new()
    ///     {
    ///         OperatingRegions = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.VpcIpamOperatingRegionArgs
    ///             {
    ///                 RegionName = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleVpcIpamPool = new Aws.Ec2.VpcIpamPool("example", new()
    ///     {
    ///         AddressFamily = "ipv4",
    ///         IpamScopeId = example.PrivateDefaultScopeId,
    ///         Locale = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// Nested Pools:
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
    ///     var current = Aws.GetRegion.Invoke();
    /// 
    ///     var example = new Aws.Ec2.VpcIpam("example", new()
    ///     {
    ///         OperatingRegions = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.VpcIpamOperatingRegionArgs
    ///             {
    ///                 RegionName = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///             },
    ///         },
    ///     });
    /// 
    ///     var parent = new Aws.Ec2.VpcIpamPool("parent", new()
    ///     {
    ///         AddressFamily = "ipv4",
    ///         IpamScopeId = example.PrivateDefaultScopeId,
    ///     });
    /// 
    ///     var parentTest = new Aws.Ec2.VpcIpamPoolCidr("parent_test", new()
    ///     {
    ///         IpamPoolId = parent.Id,
    ///         Cidr = "172.20.0.0/16",
    ///     });
    /// 
    ///     var child = new Aws.Ec2.VpcIpamPool("child", new()
    ///     {
    ///         AddressFamily = "ipv4",
    ///         IpamScopeId = example.PrivateDefaultScopeId,
    ///         Locale = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///         SourceIpamPoolId = parent.Id,
    ///     });
    /// 
    ///     var childTest = new Aws.Ec2.VpcIpamPoolCidr("child_test", new()
    ///     {
    ///         IpamPoolId = child.Id,
    ///         Cidr = "172.20.0.0/24",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IPAMs using the IPAM pool `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2/vpcIpamPool:VpcIpamPool example ipam-pool-0958f95207d978e1e
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcIpamPool:VpcIpamPool")]
    public partial class VpcIpamPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
        /// </summary>
        [Output("addressFamily")]
        public Output<string> AddressFamily { get; private set; } = null!;

        /// <summary>
        /// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
        /// </summary>
        [Output("allocationDefaultNetmaskLength")]
        public Output<int?> AllocationDefaultNetmaskLength { get; private set; } = null!;

        /// <summary>
        /// The maximum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Output("allocationMaxNetmaskLength")]
        public Output<int?> AllocationMaxNetmaskLength { get; private set; } = null!;

        /// <summary>
        /// The minimum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Output("allocationMinNetmaskLength")]
        public Output<int?> AllocationMinNetmaskLength { get; private set; } = null!;

        /// <summary>
        /// Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
        /// </summary>
        [Output("allocationResourceTags")]
        public Output<ImmutableDictionary<string, string>?> AllocationResourceTags { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of IPAM
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
        /// within the CIDR range in the pool.
        /// </summary>
        [Output("autoImport")]
        public Output<bool?> AutoImport { get; private set; } = null!;

        /// <summary>
        /// Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
        /// </summary>
        [Output("awsService")]
        public Output<string?> AwsService { get; private set; } = null!;

        /// <summary>
        /// A description for the IPAM pool.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID of the scope in which you would like to create the IPAM pool.
        /// </summary>
        [Output("ipamScopeId")]
        public Output<string> IpamScopeId { get; private set; } = null!;

        [Output("ipamScopeType")]
        public Output<string> IpamScopeType { get; private set; } = null!;

        /// <summary>
        /// The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
        /// </summary>
        [Output("locale")]
        public Output<string?> Locale { get; private set; } = null!;

        [Output("poolDepth")]
        public Output<int> PoolDepth { get; private set; } = null!;

        /// <summary>
        /// The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
        /// </summary>
        [Output("publicIpSource")]
        public Output<string?> PublicIpSource { get; private set; } = null!;

        /// <summary>
        /// Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `address_family = "ipv6"` and `public_ip_source = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `public_ip_source = "amazon"`.
        /// </summary>
        [Output("publiclyAdvertisable")]
        public Output<bool?> PubliclyAdvertisable { get; private set; } = null!;

        /// <summary>
        /// The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
        /// </summary>
        [Output("sourceIpamPoolId")]
        public Output<string?> SourceIpamPoolId { get; private set; } = null!;

        /// <summary>
        /// The ID of the IPAM
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

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
        /// Create a VpcIpamPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcIpamPool(string name, VpcIpamPoolArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPool:VpcIpamPool", name, args ?? new VpcIpamPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcIpamPool(string name, Input<string> id, VpcIpamPoolState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPool:VpcIpamPool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcIpamPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcIpamPool Get(string name, Input<string> id, VpcIpamPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcIpamPool(name, id, state, options);
        }
    }

    public sealed class VpcIpamPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
        /// </summary>
        [Input("addressFamily", required: true)]
        public Input<string> AddressFamily { get; set; } = null!;

        /// <summary>
        /// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
        /// </summary>
        [Input("allocationDefaultNetmaskLength")]
        public Input<int>? AllocationDefaultNetmaskLength { get; set; }

        /// <summary>
        /// The maximum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Input("allocationMaxNetmaskLength")]
        public Input<int>? AllocationMaxNetmaskLength { get; set; }

        /// <summary>
        /// The minimum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Input("allocationMinNetmaskLength")]
        public Input<int>? AllocationMinNetmaskLength { get; set; }

        [Input("allocationResourceTags")]
        private InputMap<string>? _allocationResourceTags;

        /// <summary>
        /// Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
        /// </summary>
        public InputMap<string> AllocationResourceTags
        {
            get => _allocationResourceTags ?? (_allocationResourceTags = new InputMap<string>());
            set => _allocationResourceTags = value;
        }

        /// <summary>
        /// If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
        /// within the CIDR range in the pool.
        /// </summary>
        [Input("autoImport")]
        public Input<bool>? AutoImport { get; set; }

        /// <summary>
        /// Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
        /// </summary>
        [Input("awsService")]
        public Input<string>? AwsService { get; set; }

        /// <summary>
        /// A description for the IPAM pool.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the scope in which you would like to create the IPAM pool.
        /// </summary>
        [Input("ipamScopeId", required: true)]
        public Input<string> IpamScopeId { get; set; } = null!;

        /// <summary>
        /// The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
        /// </summary>
        [Input("locale")]
        public Input<string>? Locale { get; set; }

        /// <summary>
        /// The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
        /// </summary>
        [Input("publicIpSource")]
        public Input<string>? PublicIpSource { get; set; }

        /// <summary>
        /// Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `address_family = "ipv6"` and `public_ip_source = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `public_ip_source = "amazon"`.
        /// </summary>
        [Input("publiclyAdvertisable")]
        public Input<bool>? PubliclyAdvertisable { get; set; }

        /// <summary>
        /// The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
        /// </summary>
        [Input("sourceIpamPoolId")]
        public Input<string>? SourceIpamPoolId { get; set; }

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

        public VpcIpamPoolArgs()
        {
        }
        public static new VpcIpamPoolArgs Empty => new VpcIpamPoolArgs();
    }

    public sealed class VpcIpamPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
        /// </summary>
        [Input("addressFamily")]
        public Input<string>? AddressFamily { get; set; }

        /// <summary>
        /// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
        /// </summary>
        [Input("allocationDefaultNetmaskLength")]
        public Input<int>? AllocationDefaultNetmaskLength { get; set; }

        /// <summary>
        /// The maximum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Input("allocationMaxNetmaskLength")]
        public Input<int>? AllocationMaxNetmaskLength { get; set; }

        /// <summary>
        /// The minimum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        [Input("allocationMinNetmaskLength")]
        public Input<int>? AllocationMinNetmaskLength { get; set; }

        [Input("allocationResourceTags")]
        private InputMap<string>? _allocationResourceTags;

        /// <summary>
        /// Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
        /// </summary>
        public InputMap<string> AllocationResourceTags
        {
            get => _allocationResourceTags ?? (_allocationResourceTags = new InputMap<string>());
            set => _allocationResourceTags = value;
        }

        /// <summary>
        /// Amazon Resource Name (ARN) of IPAM
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
        /// within the CIDR range in the pool.
        /// </summary>
        [Input("autoImport")]
        public Input<bool>? AutoImport { get; set; }

        /// <summary>
        /// Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
        /// </summary>
        [Input("awsService")]
        public Input<string>? AwsService { get; set; }

        /// <summary>
        /// A description for the IPAM pool.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the scope in which you would like to create the IPAM pool.
        /// </summary>
        [Input("ipamScopeId")]
        public Input<string>? IpamScopeId { get; set; }

        [Input("ipamScopeType")]
        public Input<string>? IpamScopeType { get; set; }

        /// <summary>
        /// The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
        /// </summary>
        [Input("locale")]
        public Input<string>? Locale { get; set; }

        [Input("poolDepth")]
        public Input<int>? PoolDepth { get; set; }

        /// <summary>
        /// The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
        /// </summary>
        [Input("publicIpSource")]
        public Input<string>? PublicIpSource { get; set; }

        /// <summary>
        /// Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `address_family = "ipv6"` and `public_ip_source = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `public_ip_source = "amazon"`.
        /// </summary>
        [Input("publiclyAdvertisable")]
        public Input<bool>? PubliclyAdvertisable { get; set; }

        /// <summary>
        /// The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
        /// </summary>
        [Input("sourceIpamPoolId")]
        public Input<string>? SourceIpamPoolId { get; set; }

        /// <summary>
        /// The ID of the IPAM
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

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

        public VpcIpamPoolState()
        {
        }
        public static new VpcIpamPoolState Empty => new VpcIpamPoolState();
    }
}
