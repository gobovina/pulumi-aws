// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetVpcIpamPool
    {
        /// <summary>
        /// `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was created in another root
        /// module and you need the pool's id as an input variable. For example, pools
        /// can be shared via RAM and used to create vpcs with CIDRs from that pool.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows an account that has only 1 pool, perhaps shared
        /// via RAM, and using that pool id to create a VPC with a CIDR derived from
        /// AWS IPAM.
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
        ///     var test = Aws.Ec2.GetVpcIpamPool.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "description",
        ///                 Values = new[]
        ///                 {
        ///                     "*test*",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "address-family",
        ///                 Values = new[]
        ///                 {
        ///                     "ipv4",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var testVpc = new Aws.Ec2.Vpc("test", new()
        ///     {
        ///         Ipv4IpamPoolId = test.Apply(getVpcIpamPoolResult =&gt; getVpcIpamPoolResult.Id),
        ///         Ipv4NetmaskLength = 28,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVpcIpamPoolResult> InvokeAsync(GetVpcIpamPoolArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcIpamPoolResult>("aws:ec2/getVpcIpamPool:getVpcIpamPool", args ?? new GetVpcIpamPoolArgs(), options.WithDefaults());

        /// <summary>
        /// `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was created in another root
        /// module and you need the pool's id as an input variable. For example, pools
        /// can be shared via RAM and used to create vpcs with CIDRs from that pool.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows an account that has only 1 pool, perhaps shared
        /// via RAM, and using that pool id to create a VPC with a CIDR derived from
        /// AWS IPAM.
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
        ///     var test = Aws.Ec2.GetVpcIpamPool.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "description",
        ///                 Values = new[]
        ///                 {
        ///                     "*test*",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "address-family",
        ///                 Values = new[]
        ///                 {
        ///                     "ipv4",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var testVpc = new Aws.Ec2.Vpc("test", new()
        ///     {
        ///         Ipv4IpamPoolId = test.Apply(getVpcIpamPoolResult =&gt; getVpcIpamPoolResult.Id),
        ///         Ipv4NetmaskLength = 28,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVpcIpamPoolResult> Invoke(GetVpcIpamPoolInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcIpamPoolResult>("aws:ec2/getVpcIpamPool:getVpcIpamPool", args ?? new GetVpcIpamPoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcIpamPoolArgs : global::Pulumi.InvokeArgs
    {
        [Input("allocationResourceTags")]
        private Dictionary<string, string>? _allocationResourceTags;

        /// <summary>
        /// Tags that are required to create resources in using this pool.
        /// </summary>
        public Dictionary<string, string> AllocationResourceTags
        {
            get => _allocationResourceTags ?? (_allocationResourceTags = new Dictionary<string, string>());
            set => _allocationResourceTags = value;
        }

        [Input("filters")]
        private List<Inputs.GetVpcIpamPoolFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetVpcIpamPoolFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpcIpamPoolFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the IPAM pool.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// ID of the IPAM pool you would like information on.
        /// </summary>
        [Input("ipamPoolId")]
        public string? IpamPoolId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags to assigned to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetVpcIpamPoolArgs()
        {
        }
        public static new GetVpcIpamPoolArgs Empty => new GetVpcIpamPoolArgs();
    }

    public sealed class GetVpcIpamPoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("allocationResourceTags")]
        private InputMap<string>? _allocationResourceTags;

        /// <summary>
        /// Tags that are required to create resources in using this pool.
        /// </summary>
        public InputMap<string> AllocationResourceTags
        {
            get => _allocationResourceTags ?? (_allocationResourceTags = new InputMap<string>());
            set => _allocationResourceTags = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetVpcIpamPoolFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetVpcIpamPoolFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpcIpamPoolFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the IPAM pool.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// ID of the IPAM pool you would like information on.
        /// </summary>
        [Input("ipamPoolId")]
        public Input<string>? IpamPoolId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetVpcIpamPoolInvokeArgs()
        {
        }
        public static new GetVpcIpamPoolInvokeArgs Empty => new GetVpcIpamPoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcIpamPoolResult
    {
        /// <summary>
        /// IP protocol assigned to this pool.
        /// </summary>
        public readonly string AddressFamily;
        /// <summary>
        /// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is `10.0.0.0/8` and you enter 16 here, new allocations will default to `10.0.0.0/16`.
        /// </summary>
        public readonly int AllocationDefaultNetmaskLength;
        /// <summary>
        /// The maximum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        public readonly int AllocationMaxNetmaskLength;
        /// <summary>
        /// The minimum netmask length that will be required for CIDR allocations in this pool.
        /// </summary>
        public readonly int AllocationMinNetmaskLength;
        /// <summary>
        /// Tags that are required to create resources in using this pool.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AllocationResourceTags;
        /// <summary>
        /// ARN of the pool
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
        /// </summary>
        public readonly bool AutoImport;
        /// <summary>
        /// Limits which service in AWS that the pool can be used in. `ec2` for example, allows users to use space for Elastic IP addresses and VPCs.
        /// </summary>
        public readonly string AwsService;
        /// <summary>
        /// Description for the IPAM pool.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetVpcIpamPoolFilterResult> Filters;
        /// <summary>
        /// ID of the IPAM pool.
        /// </summary>
        public readonly string? Id;
        public readonly string? IpamPoolId;
        /// <summary>
        /// ID of the scope the pool belongs to.
        /// </summary>
        public readonly string IpamScopeId;
        public readonly string IpamScopeType;
        /// <summary>
        /// Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region.
        /// </summary>
        public readonly string Locale;
        public readonly int PoolDepth;
        /// <summary>
        /// Defines whether or not IPv6 pool space is publicly advertisable over the internet.
        /// </summary>
        public readonly bool PubliclyAdvertisable;
        /// <summary>
        /// ID of the source IPAM pool.
        /// </summary>
        public readonly string SourceIpamPoolId;
        public readonly string State;
        /// <summary>
        /// Map of tags to assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetVpcIpamPoolResult(
            string addressFamily,

            int allocationDefaultNetmaskLength,

            int allocationMaxNetmaskLength,

            int allocationMinNetmaskLength,

            ImmutableDictionary<string, string> allocationResourceTags,

            string arn,

            bool autoImport,

            string awsService,

            string description,

            ImmutableArray<Outputs.GetVpcIpamPoolFilterResult> filters,

            string? id,

            string? ipamPoolId,

            string ipamScopeId,

            string ipamScopeType,

            string locale,

            int poolDepth,

            bool publiclyAdvertisable,

            string sourceIpamPoolId,

            string state,

            ImmutableDictionary<string, string> tags)
        {
            AddressFamily = addressFamily;
            AllocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            AllocationMaxNetmaskLength = allocationMaxNetmaskLength;
            AllocationMinNetmaskLength = allocationMinNetmaskLength;
            AllocationResourceTags = allocationResourceTags;
            Arn = arn;
            AutoImport = autoImport;
            AwsService = awsService;
            Description = description;
            Filters = filters;
            Id = id;
            IpamPoolId = ipamPoolId;
            IpamScopeId = ipamScopeId;
            IpamScopeType = ipamScopeType;
            Locale = locale;
            PoolDepth = poolDepth;
            PubliclyAdvertisable = publiclyAdvertisable;
            SourceIpamPoolId = sourceIpamPoolId;
            State = state;
            Tags = tags;
        }
    }
}
