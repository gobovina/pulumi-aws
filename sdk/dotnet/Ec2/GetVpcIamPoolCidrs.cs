// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    [Obsolete(@"aws.ec2/getvpciampoolcidrs.getVpcIamPoolCidrs has been deprecated in favor of aws.ec2/getvpcipampoolcidrs.getVpcIpamPoolCidrs")]
    public static class GetVpcIamPoolCidrs
    {
        /// <summary>
        /// `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var p = Aws.Ec2.GetVpcIpamPool.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "description",
        ///                 Values = new[]
        ///                 {
        ///                     "*mypool*",
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
        ///     var c = Aws.Ec2.GetVpcIpamPoolCidrs.Invoke(new()
        ///     {
        ///         IpamPoolId = p.Apply(getVpcIpamPoolResult =&gt; getVpcIpamPoolResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Filtering:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var c = Aws.Ec2.GetVpcIpamPoolCidrs.Invoke(new()
        ///     {
        ///         IpamPoolId = "ipam-pool-123",
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolCidrsFilterInputArgs
        ///             {
        ///                 Name = "cidr",
        ///                 Values = new[]
        ///                 {
        ///                     "10.*",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var mycidrs = .Where(cidr =&gt; cidr.State == "provisioned").Select(cidr =&gt; 
        ///     {
        ///         return cidr.Cidr;
        ///     }).ToList();
        /// 
        ///     var pls = new Aws.Ec2.ManagedPrefixList("pls", new()
        ///     {
        ///         Entries = mycidrs.Select((v, k) =&gt; new { Key = k, Value = v }).Apply(entries =&gt; entries.Select(entry =&gt; 
        ///         {
        ///             return 
        ///             {
        ///                 { "cidr", entry.Value },
        ///                 { "description", entry.Value },
        ///             };
        ///         }).ToList()),
        ///         Name = $"IPAM Pool ({test.Id}) Cidrs",
        ///         AddressFamily = "IPv4",
        ///         MaxEntries = mycidrs.Length,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcIamPoolCidrsResult> InvokeAsync(GetVpcIamPoolCidrsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcIamPoolCidrsResult>("aws:ec2/getVpcIamPoolCidrs:getVpcIamPoolCidrs", args ?? new GetVpcIamPoolCidrsArgs(), options.WithDefaults());

        /// <summary>
        /// `aws.ec2.getVpcIpamPoolCidrs` provides details about an IPAM pool.
        /// 
        /// This resource can prove useful when an ipam pool was shared to your account and you want to know all (or a filtered list) of the CIDRs that are provisioned into the pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var p = Aws.Ec2.GetVpcIpamPool.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolFilterInputArgs
        ///             {
        ///                 Name = "description",
        ///                 Values = new[]
        ///                 {
        ///                     "*mypool*",
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
        ///     var c = Aws.Ec2.GetVpcIpamPoolCidrs.Invoke(new()
        ///     {
        ///         IpamPoolId = p.Apply(getVpcIpamPoolResult =&gt; getVpcIpamPoolResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Filtering:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var c = Aws.Ec2.GetVpcIpamPoolCidrs.Invoke(new()
        ///     {
        ///         IpamPoolId = "ipam-pool-123",
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetVpcIpamPoolCidrsFilterInputArgs
        ///             {
        ///                 Name = "cidr",
        ///                 Values = new[]
        ///                 {
        ///                     "10.*",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var mycidrs = .Where(cidr =&gt; cidr.State == "provisioned").Select(cidr =&gt; 
        ///     {
        ///         return cidr.Cidr;
        ///     }).ToList();
        /// 
        ///     var pls = new Aws.Ec2.ManagedPrefixList("pls", new()
        ///     {
        ///         Entries = mycidrs.Select((v, k) =&gt; new { Key = k, Value = v }).Apply(entries =&gt; entries.Select(entry =&gt; 
        ///         {
        ///             return 
        ///             {
        ///                 { "cidr", entry.Value },
        ///                 { "description", entry.Value },
        ///             };
        ///         }).ToList()),
        ///         Name = $"IPAM Pool ({test.Id}) Cidrs",
        ///         AddressFamily = "IPv4",
        ///         MaxEntries = mycidrs.Length,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcIamPoolCidrsResult> Invoke(GetVpcIamPoolCidrsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcIamPoolCidrsResult>("aws:ec2/getVpcIamPoolCidrs:getVpcIamPoolCidrs", args ?? new GetVpcIamPoolCidrsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcIamPoolCidrsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVpcIamPoolCidrsFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetVpcIamPoolCidrsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpcIamPoolCidrsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the IPAM pool you would like the list of provisioned CIDRs.
        /// </summary>
        [Input("ipamPoolId", required: true)]
        public string IpamPoolId { get; set; } = null!;

        public GetVpcIamPoolCidrsArgs()
        {
        }
        public static new GetVpcIamPoolCidrsArgs Empty => new GetVpcIamPoolCidrsArgs();
    }

    public sealed class GetVpcIamPoolCidrsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVpcIamPoolCidrsFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetVpcIamPoolCidrsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpcIamPoolCidrsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// ID of the IPAM pool you would like the list of provisioned CIDRs.
        /// </summary>
        [Input("ipamPoolId", required: true)]
        public Input<string> IpamPoolId { get; set; } = null!;

        public GetVpcIamPoolCidrsInvokeArgs()
        {
        }
        public static new GetVpcIamPoolCidrsInvokeArgs Empty => new GetVpcIamPoolCidrsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcIamPoolCidrsResult
    {
        public readonly ImmutableArray<Outputs.GetVpcIamPoolCidrsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The CIDRs provisioned into the IPAM pool, described below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcIamPoolCidrsIpamPoolCidrResult> IpamPoolCidrs;
        public readonly string IpamPoolId;

        [OutputConstructor]
        private GetVpcIamPoolCidrsResult(
            ImmutableArray<Outputs.GetVpcIamPoolCidrsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetVpcIamPoolCidrsIpamPoolCidrResult> ipamPoolCidrs,

            string ipamPoolId)
        {
            Filters = filters;
            Id = id;
            IpamPoolCidrs = ipamPoolCidrs;
            IpamPoolId = ipamPoolId;
        }
    }
}
