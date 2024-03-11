// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    public static class GetSamlProvider
    {
        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// IAM SAML provider. This will allow you to easily retrieve the metadata
        /// document of an existing SAML provider.
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
        ///     var example = Aws.Iam.GetSamlProvider.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:iam::123456789:saml-provider/myprovider",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSamlProviderResult> InvokeAsync(GetSamlProviderArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSamlProviderResult>("aws:iam/getSamlProvider:getSamlProvider", args ?? new GetSamlProviderArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// IAM SAML provider. This will allow you to easily retrieve the metadata
        /// document of an existing SAML provider.
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
        ///     var example = Aws.Iam.GetSamlProvider.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:iam::123456789:saml-provider/myprovider",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSamlProviderResult> Invoke(GetSamlProviderInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSamlProviderResult>("aws:iam/getSamlProvider:getSamlProvider", args ?? new GetSamlProviderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSamlProviderArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN assigned by AWS for the provider.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Tags attached to the SAML provider.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetSamlProviderArgs()
        {
        }
        public static new GetSamlProviderArgs Empty => new GetSamlProviderArgs();
    }

    public sealed class GetSamlProviderInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN assigned by AWS for the provider.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags attached to the SAML provider.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetSamlProviderInvokeArgs()
        {
        }
        public static new GetSamlProviderInvokeArgs Empty => new GetSamlProviderInvokeArgs();
    }


    [OutputType]
    public sealed class GetSamlProviderResult
    {
        public readonly string Arn;
        /// <summary>
        /// Creation date of the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
        /// </summary>
        public readonly string CreateDate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the provider.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The XML document generated by an identity provider that supports SAML 2.0.
        /// </summary>
        public readonly string SamlMetadataDocument;
        /// <summary>
        /// Tags attached to the SAML provider.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2007 15:04:05 MST`.
        /// </summary>
        public readonly string ValidUntil;

        [OutputConstructor]
        private GetSamlProviderResult(
            string arn,

            string createDate,

            string id,

            string name,

            string samlMetadataDocument,

            ImmutableDictionary<string, string> tags,

            string validUntil)
        {
            Arn = arn;
            CreateDate = createDate;
            Id = id;
            Name = name;
            SamlMetadataDocument = samlMetadataDocument;
            Tags = tags;
            ValidUntil = validUntil;
        }
    }
}
