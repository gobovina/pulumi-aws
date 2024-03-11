// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafRegional
{
    public static class GetIpset
    {
        /// <summary>
        /// `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.WafRegional.GetIpset.Invoke(new()
        ///     {
        ///         Name = "tfWAFRegionalIPSet",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetIpsetResult> InvokeAsync(GetIpsetArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpsetResult>("aws:wafregional/getIpset:getIpset", args ?? new GetIpsetArgs(), options.WithDefaults());

        /// <summary>
        /// `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource Id.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.WafRegional.GetIpset.Invoke(new()
        ///     {
        ///         Name = "tfWAFRegionalIPSet",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetIpsetResult> Invoke(GetIpsetInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpsetResult>("aws:wafregional/getIpset:getIpset", args ?? new GetIpsetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpsetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the WAF Regional IP set.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetIpsetArgs()
        {
        }
        public static new GetIpsetArgs Empty => new GetIpsetArgs();
    }

    public sealed class GetIpsetInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the WAF Regional IP set.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetIpsetInvokeArgs()
        {
        }
        public static new GetIpsetInvokeArgs Empty => new GetIpsetInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpsetResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetIpsetResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
