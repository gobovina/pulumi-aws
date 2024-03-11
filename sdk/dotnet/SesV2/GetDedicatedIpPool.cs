// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SesV2
{
    public static class GetDedicatedIpPool
    {
        /// <summary>
        /// Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.SesV2.GetDedicatedIpPool.Invoke(new()
        ///     {
        ///         PoolName = "my-pool",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetDedicatedIpPoolResult> InvokeAsync(GetDedicatedIpPoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDedicatedIpPoolResult>("aws:sesv2/getDedicatedIpPool:getDedicatedIpPool", args ?? new GetDedicatedIpPoolArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.SesV2.GetDedicatedIpPool.Invoke(new()
        ///     {
        ///         PoolName = "my-pool",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetDedicatedIpPoolResult> Invoke(GetDedicatedIpPoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDedicatedIpPoolResult>("aws:sesv2/getDedicatedIpPool:getDedicatedIpPool", args ?? new GetDedicatedIpPoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDedicatedIpPoolArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the dedicated IP pool.
        /// </summary>
        [Input("poolName", required: true)]
        public string PoolName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags attached to the pool.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetDedicatedIpPoolArgs()
        {
        }
        public static new GetDedicatedIpPoolArgs Empty => new GetDedicatedIpPoolArgs();
    }

    public sealed class GetDedicatedIpPoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the dedicated IP pool.
        /// </summary>
        [Input("poolName", required: true)]
        public Input<string> PoolName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags attached to the pool.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetDedicatedIpPoolInvokeArgs()
        {
        }
        public static new GetDedicatedIpPoolInvokeArgs Empty => new GetDedicatedIpPoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetDedicatedIpPoolResult
    {
        /// <summary>
        /// ARN of the Dedicated IP Pool.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// A list of objects describing the pool's dedicated IP's. See `dedicated_ips`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDedicatedIpPoolDedicatedIpResult> DedicatedIps;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string PoolName;
        /// <summary>
        /// (Optional) IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`.
        /// </summary>
        public readonly string ScalingMode;
        /// <summary>
        /// A map of tags attached to the pool.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetDedicatedIpPoolResult(
            string arn,

            ImmutableArray<Outputs.GetDedicatedIpPoolDedicatedIpResult> dedicatedIps,

            string id,

            string poolName,

            string scalingMode,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            DedicatedIps = dedicatedIps;
            Id = id;
            PoolName = poolName;
            ScalingMode = scalingMode;
            Tags = tags;
        }
    }
}
