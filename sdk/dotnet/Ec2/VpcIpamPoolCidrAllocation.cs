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
    /// Allocates (reserves) a CIDR from an IPAM address pool, preventing usage by IPAM. Only works for private IPv4.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
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
    ///     var exampleVpcIpam = new Aws.Ec2.VpcIpam("example", new()
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
    ///         IpamScopeId = exampleVpcIpam.PrivateDefaultScopeId,
    ///         Locale = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///     });
    /// 
    ///     var example = new Aws.Ec2.VpcIpamPoolCidrAllocation("example", new()
    ///     {
    ///         IpamPoolId = exampleVpcIpamPool.Id,
    ///         Cidr = "172.20.0.0/24",
    ///     });
    /// 
    ///     var exampleVpcIpamPoolCidr = new Aws.Ec2.VpcIpamPoolCidr("example", new()
    ///     {
    ///         IpamPoolId = exampleVpcIpamPool.Id,
    ///         Cidr = "172.20.0.0/16",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// With the `disallowed_cidrs` attribute:
    /// 
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
    ///     var exampleVpcIpam = new Aws.Ec2.VpcIpam("example", new()
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
    ///         IpamScopeId = exampleVpcIpam.PrivateDefaultScopeId,
    ///         Locale = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///     });
    /// 
    ///     var example = new Aws.Ec2.VpcIpamPoolCidrAllocation("example", new()
    ///     {
    ///         IpamPoolId = exampleVpcIpamPool.Id,
    ///         NetmaskLength = 28,
    ///         DisallowedCidrs = new[]
    ///         {
    ///             "172.20.0.0/28",
    ///         },
    ///     });
    /// 
    ///     var exampleVpcIpamPoolCidr = new Aws.Ec2.VpcIpamPoolCidr("example", new()
    ///     {
    ///         IpamPoolId = exampleVpcIpamPool.Id,
    ///         Cidr = "172.20.0.0/16",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IPAM allocations using the allocation `id` and `pool id`, separated by `_`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation example ipam-pool-alloc-0dc6d196509c049ba8b549ff99f639736_ipam-pool-07cfb559e0921fcbe
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation")]
    public partial class VpcIpamPoolCidrAllocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// The description for the allocation.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Exclude a particular CIDR range from being returned by the pool.
        /// </summary>
        [Output("disallowedCidrs")]
        public Output<ImmutableArray<string>> DisallowedCidrs { get; private set; } = null!;

        [Output("ipamPoolAllocationId")]
        public Output<string> IpamPoolAllocationId { get; private set; } = null!;

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Output("ipamPoolId")]
        public Output<string> IpamPoolId { get; private set; } = null!;

        /// <summary>
        /// The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-128`.
        /// </summary>
        [Output("netmaskLength")]
        public Output<int?> NetmaskLength { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// The owner of the resource.
        /// </summary>
        [Output("resourceOwner")]
        public Output<string> ResourceOwner { get; private set; } = null!;

        /// <summary>
        /// The type of the resource.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;


        /// <summary>
        /// Create a VpcIpamPoolCidrAllocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcIpamPoolCidrAllocation(string name, VpcIpamPoolCidrAllocationArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation", name, args ?? new VpcIpamPoolCidrAllocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcIpamPoolCidrAllocation(string name, Input<string> id, VpcIpamPoolCidrAllocationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPoolCidrAllocation:VpcIpamPoolCidrAllocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcIpamPoolCidrAllocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcIpamPoolCidrAllocation Get(string name, Input<string> id, VpcIpamPoolCidrAllocationState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcIpamPoolCidrAllocation(name, id, state, options);
        }
    }

    public sealed class VpcIpamPoolCidrAllocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The description for the allocation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("disallowedCidrs")]
        private InputList<string>? _disallowedCidrs;

        /// <summary>
        /// Exclude a particular CIDR range from being returned by the pool.
        /// </summary>
        public InputList<string> DisallowedCidrs
        {
            get => _disallowedCidrs ?? (_disallowedCidrs = new InputList<string>());
            set => _disallowedCidrs = value;
        }

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Input("ipamPoolId", required: true)]
        public Input<string> IpamPoolId { get; set; } = null!;

        /// <summary>
        /// The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-128`.
        /// </summary>
        [Input("netmaskLength")]
        public Input<int>? NetmaskLength { get; set; }

        public VpcIpamPoolCidrAllocationArgs()
        {
        }
        public static new VpcIpamPoolCidrAllocationArgs Empty => new VpcIpamPoolCidrAllocationArgs();
    }

    public sealed class VpcIpamPoolCidrAllocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The description for the allocation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("disallowedCidrs")]
        private InputList<string>? _disallowedCidrs;

        /// <summary>
        /// Exclude a particular CIDR range from being returned by the pool.
        /// </summary>
        public InputList<string> DisallowedCidrs
        {
            get => _disallowedCidrs ?? (_disallowedCidrs = new InputList<string>());
            set => _disallowedCidrs = value;
        }

        [Input("ipamPoolAllocationId")]
        public Input<string>? IpamPoolAllocationId { get; set; }

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Input("ipamPoolId")]
        public Input<string>? IpamPoolId { get; set; }

        /// <summary>
        /// The netmask length of the CIDR you would like to allocate to the IPAM pool. Valid Values: `0-128`.
        /// </summary>
        [Input("netmaskLength")]
        public Input<int>? NetmaskLength { get; set; }

        /// <summary>
        /// The ID of the resource.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The owner of the resource.
        /// </summary>
        [Input("resourceOwner")]
        public Input<string>? ResourceOwner { get; set; }

        /// <summary>
        /// The type of the resource.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        public VpcIpamPoolCidrAllocationState()
        {
        }
        public static new VpcIpamPoolCidrAllocationState Empty => new VpcIpamPoolCidrAllocationState();
    }
}
