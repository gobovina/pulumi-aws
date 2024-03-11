// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceQuotas
{
    public static class GetTemplates
    {
        /// <summary>
        /// Data source for managing an AWS Service Quotas Templates.
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
        ///     var example = Aws.ServiceQuotas.GetTemplates.Invoke(new()
        ///     {
        ///         Region = "us-east-1",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetTemplatesResult> InvokeAsync(GetTemplatesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTemplatesResult>("aws:servicequotas/getTemplates:getTemplates", args ?? new GetTemplatesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS Service Quotas Templates.
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
        ///     var example = Aws.ServiceQuotas.GetTemplates.Invoke(new()
        ///     {
        ///         Region = "us-east-1",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetTemplatesResult> Invoke(GetTemplatesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTemplatesResult>("aws:servicequotas/getTemplates:getTemplates", args ?? new GetTemplatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTemplatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS Region to which the quota increases apply.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        [Input("templates")]
        private List<Inputs.GetTemplatesTemplateArgs>? _templates;

        /// <summary>
        /// A list of quota increase templates for specified region. See `templates`.
        /// </summary>
        public List<Inputs.GetTemplatesTemplateArgs> Templates
        {
            get => _templates ?? (_templates = new List<Inputs.GetTemplatesTemplateArgs>());
            set => _templates = value;
        }

        public GetTemplatesArgs()
        {
        }
        public static new GetTemplatesArgs Empty => new GetTemplatesArgs();
    }

    public sealed class GetTemplatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS Region to which the quota increases apply.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("templates")]
        private InputList<Inputs.GetTemplatesTemplateInputArgs>? _templates;

        /// <summary>
        /// A list of quota increase templates for specified region. See `templates`.
        /// </summary>
        public InputList<Inputs.GetTemplatesTemplateInputArgs> Templates
        {
            get => _templates ?? (_templates = new InputList<Inputs.GetTemplatesTemplateInputArgs>());
            set => _templates = value;
        }

        public GetTemplatesInvokeArgs()
        {
        }
        public static new GetTemplatesInvokeArgs Empty => new GetTemplatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTemplatesResult
    {
        public readonly string Id;
        /// <summary>
        /// AWS Region to which the template applies.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// A list of quota increase templates for specified region. See `templates`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetTemplatesResult(
            string id,

            string region,

            ImmutableArray<Outputs.GetTemplatesTemplateResult> templates)
        {
            Id = id;
            Region = region;
            Templates = templates;
        }
    }
}
