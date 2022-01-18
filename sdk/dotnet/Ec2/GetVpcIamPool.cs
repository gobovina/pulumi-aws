// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Aws.Ec2
{
    public static class GetVpcIamPool
    {
        /// <summary>
        /// `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was created in another root
        /// module and you need the pool's id as an input variable. For example, pools
        /// can be shared via RAM and used to create vpcs with CIDRs from that pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows an account that has only 1 pool, perhaps shared
        /// via RAM, and using that pool id to create a VPC with a CIDR derived from
        /// AWS IPAM.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testVpcIamPool = Output.Create(Aws.Ec2.GetVpcIamPool.InvokeAsync());
        ///         var testVpc = new Aws.Ec2.Vpc("testVpc", new Aws.Ec2.VpcArgs
        ///         {
        ///             Ipv4IpamPoolId = testVpcIamPool.Apply(testVpcIamPool =&gt; testVpcIamPool.Id),
        ///             Ipv4NetmaskLength = 28,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcIamPoolResult> InvokeAsync(GetVpcIamPoolArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVpcIamPoolResult>("aws:ec2/getVpcIamPool:getVpcIamPool", args ?? new GetVpcIamPoolArgs(), options.WithVersion());

        /// <summary>
        /// `aws.ec2.VpcIpamPool` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was created in another root
        /// module and you need the pool's id as an input variable. For example, pools
        /// can be shared via RAM and used to create vpcs with CIDRs from that pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows an account that has only 1 pool, perhaps shared
        /// via RAM, and using that pool id to create a VPC with a CIDR derived from
        /// AWS IPAM.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testVpcIamPool = Output.Create(Aws.Ec2.GetVpcIamPool.InvokeAsync());
        ///         var testVpc = new Aws.Ec2.Vpc("testVpc", new Aws.Ec2.VpcArgs
        ///         {
        ///             Ipv4IpamPoolId = testVpcIamPool.Apply(testVpcIamPool =&gt; testVpcIamPool.Id),
        ///             Ipv4NetmaskLength = 28,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcIamPoolResult> Invoke(GetVpcIamPoolInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetVpcIamPoolResult>("aws:ec2/getVpcIamPool:getVpcIamPool", args ?? new GetVpcIamPoolInvokeArgs(), options.WithVersion());
    }


    public sealed class GetVpcIamPoolArgs : Pulumi.InvokeArgs
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
        private List<Inputs.GetVpcIamPoolFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetVpcIamPoolFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpcIamPoolFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// -
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("ipamPoolId")]
        public string? IpamPoolId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags to assigned to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetVpcIamPoolArgs()
        {
        }
    }

    public sealed class GetVpcIamPoolInvokeArgs : Pulumi.InvokeArgs
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
        private InputList<Inputs.GetVpcIamPoolFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetVpcIamPoolFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpcIamPoolFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// -
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("ipamPoolId")]
        public Input<string>? IpamPoolId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetVpcIamPoolInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetVpcIamPoolResult
    {
        /// <summary>
        /// The IP protocol assigned to this pool.
        /// </summary>
        public readonly string AddressFamily;
        /// <summary>
        /// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
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
        /// Amazon Resource Name (ARN) of the pool
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
        /// </summary>
        public readonly bool AutoImport;
        /// <summary>
        /// Limits which service in AWS that the pool can be used in. "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
        /// </summary>
        public readonly string AwsService;
        /// <summary>
        /// A description for the IPAM pool.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetVpcIamPoolFilterResult> Filters;
        public readonly string? Id;
        public readonly string? IpamPoolId;
        /// <summary>
        /// The ID of the scope the pool belongs to.
        /// </summary>
        public readonly string IpamScopeId;
        public readonly string IpamScopeType;
        /// <summary>
        /// Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region.
        /// </summary>
        public readonly string Locale;
        public readonly int PoolDepth;
        /// <summary>
        /// Defines whether or not IPv6 pool space is publicly ∂advertisable over the internet.
        /// </summary>
        public readonly bool PubliclyAdvertisable;
        /// <summary>
        /// The ID of the source IPAM pool.
        /// </summary>
        public readonly string SourceIpamPoolId;
        public readonly string State;
        /// <summary>
        /// A map of tags to assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetVpcIamPoolResult(
            string addressFamily,

            int allocationDefaultNetmaskLength,

            int allocationMaxNetmaskLength,

            int allocationMinNetmaskLength,

            ImmutableDictionary<string, string> allocationResourceTags,

            string arn,

            bool autoImport,

            string awsService,

            string description,

            ImmutableArray<Outputs.GetVpcIamPoolFilterResult> filters,

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
