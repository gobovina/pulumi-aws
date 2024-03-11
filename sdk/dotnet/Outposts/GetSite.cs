// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Outposts
{
    public static class GetSite
    {
        /// <summary>
        /// Provides details about an Outposts Site.
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
        ///     var example = Aws.Outposts.GetSite.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSiteResult> InvokeAsync(GetSiteArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSiteResult>("aws:outposts/getSite:getSite", args ?? new GetSiteArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about an Outposts Site.
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
        ///     var example = Aws.Outposts.GetSite.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSiteResult> Invoke(GetSiteInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSiteResult>("aws:outposts/getSite:getSite", args ?? new GetSiteInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSiteArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the Site.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Name of the Site.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetSiteArgs()
        {
        }
        public static new GetSiteArgs Empty => new GetSiteArgs();
    }

    public sealed class GetSiteInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the Site.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the Site.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetSiteInvokeArgs()
        {
        }
        public static new GetSiteInvokeArgs Empty => new GetSiteInvokeArgs();
    }


    [OutputType]
    public sealed class GetSiteResult
    {
        /// <summary>
        /// AWS Account identifier.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Description.
        /// </summary>
        public readonly string Description;
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetSiteResult(
            string accountId,

            string description,

            string id,

            string name)
        {
            AccountId = accountId;
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
