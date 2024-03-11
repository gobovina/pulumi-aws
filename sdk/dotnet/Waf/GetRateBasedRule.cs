// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Waf
{
    public static class GetRateBasedRule
    {
        /// <summary>
        /// `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
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
        ///     var example = Aws.Waf.GetRateBasedRule.Invoke(new()
        ///     {
        ///         Name = "tfWAFRateBasedRule",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetRateBasedRuleResult> InvokeAsync(GetRateBasedRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRateBasedRuleResult>("aws:waf/getRateBasedRule:getRateBasedRule", args ?? new GetRateBasedRuleArgs(), options.WithDefaults());

        /// <summary>
        /// `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource Id.
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
        ///     var example = Aws.Waf.GetRateBasedRule.Invoke(new()
        ///     {
        ///         Name = "tfWAFRateBasedRule",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetRateBasedRuleResult> Invoke(GetRateBasedRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRateBasedRuleResult>("aws:waf/getRateBasedRule:getRateBasedRule", args ?? new GetRateBasedRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRateBasedRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the WAF rate based rule.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetRateBasedRuleArgs()
        {
        }
        public static new GetRateBasedRuleArgs Empty => new GetRateBasedRuleArgs();
    }

    public sealed class GetRateBasedRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the WAF rate based rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetRateBasedRuleInvokeArgs()
        {
        }
        public static new GetRateBasedRuleInvokeArgs Empty => new GetRateBasedRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetRateBasedRuleResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetRateBasedRuleResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
