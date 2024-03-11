// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceCatalog
{
    public static class GetPortfolio
    {
        /// <summary>
        /// Provides information for a Service Catalog Portfolio.
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
        ///     var portfolio = Aws.ServiceCatalog.GetPortfolio.Invoke(new()
        ///     {
        ///         Id = "port-07052002",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetPortfolioResult> InvokeAsync(GetPortfolioArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPortfolioResult>("aws:servicecatalog/getPortfolio:getPortfolio", args ?? new GetPortfolioArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information for a Service Catalog Portfolio.
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
        ///     var portfolio = Aws.ServiceCatalog.GetPortfolio.Invoke(new()
        ///     {
        ///         Id = "port-07052002",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetPortfolioResult> Invoke(GetPortfolioInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPortfolioResult>("aws:servicecatalog/getPortfolio:getPortfolio", args ?? new GetPortfolioInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPortfolioArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public string? AcceptLanguage { get; set; }

        /// <summary>
        /// Portfolio identifier.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Tags applied to the portfolio.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetPortfolioArgs()
        {
        }
        public static new GetPortfolioArgs Empty => new GetPortfolioArgs();
    }

    public sealed class GetPortfolioInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Portfolio identifier.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags applied to the portfolio.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetPortfolioInvokeArgs()
        {
        }
        public static new GetPortfolioInvokeArgs Empty => new GetPortfolioInvokeArgs();
    }


    [OutputType]
    public sealed class GetPortfolioResult
    {
        public readonly string? AcceptLanguage;
        /// <summary>
        /// Portfolio ARN.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Time the portfolio was created.
        /// </summary>
        public readonly string CreatedTime;
        /// <summary>
        /// Description of the portfolio
        /// </summary>
        public readonly string Description;
        public readonly string Id;
        /// <summary>
        /// Portfolio name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Name of the person or organization who owns the portfolio.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Tags applied to the portfolio.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetPortfolioResult(
            string? acceptLanguage,

            string arn,

            string createdTime,

            string description,

            string id,

            string name,

            string providerName,

            ImmutableDictionary<string, string> tags)
        {
            AcceptLanguage = acceptLanguage;
            Arn = arn;
            CreatedTime = createdTime;
            Description = description;
            Id = id;
            Name = name;
            ProviderName = providerName;
            Tags = tags;
        }
    }
}
