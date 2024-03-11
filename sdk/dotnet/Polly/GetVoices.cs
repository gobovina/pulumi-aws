// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Polly
{
    public static class GetVoices
    {
        /// <summary>
        /// Data source for managing an AWS Polly Voices.
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
        ///     var example = Aws.Polly.GetVoices.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### With Language Code
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
        ///     var example = Aws.Polly.GetVoices.Invoke(new()
        ///     {
        ///         LanguageCode = "en-GB",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVoicesResult> InvokeAsync(GetVoicesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVoicesResult>("aws:polly/getVoices:getVoices", args ?? new GetVoicesArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS Polly Voices.
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
        ///     var example = Aws.Polly.GetVoices.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### With Language Code
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
        ///     var example = Aws.Polly.GetVoices.Invoke(new()
        ///     {
        ///         LanguageCode = "en-GB",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVoicesResult> Invoke(GetVoicesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVoicesResult>("aws:polly/getVoices:getVoices", args ?? new GetVoicesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVoicesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Engine used by Amazon Polly when processing input text for speech synthesis. Valid values are `standard`, `neural`, and `long-form`.
        /// </summary>
        [Input("engine")]
        public string? Engine { get; set; }

        /// <summary>
        /// Whether to return any bilingual voices that use the specified language as an additional language.
        /// </summary>
        [Input("includeAdditionalLanguageCodes")]
        public bool? IncludeAdditionalLanguageCodes { get; set; }

        /// <summary>
        /// Language identification tag for filtering the list of voices returned. If not specified, all available voices are returned.
        /// </summary>
        [Input("languageCode")]
        public string? LanguageCode { get; set; }

        [Input("voices")]
        private List<Inputs.GetVoicesVoiceArgs>? _voices;

        /// <summary>
        /// List of voices with their properties. See `voices` Attribute Reference below.
        /// </summary>
        public List<Inputs.GetVoicesVoiceArgs> Voices
        {
            get => _voices ?? (_voices = new List<Inputs.GetVoicesVoiceArgs>());
            set => _voices = value;
        }

        public GetVoicesArgs()
        {
        }
        public static new GetVoicesArgs Empty => new GetVoicesArgs();
    }

    public sealed class GetVoicesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Engine used by Amazon Polly when processing input text for speech synthesis. Valid values are `standard`, `neural`, and `long-form`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Whether to return any bilingual voices that use the specified language as an additional language.
        /// </summary>
        [Input("includeAdditionalLanguageCodes")]
        public Input<bool>? IncludeAdditionalLanguageCodes { get; set; }

        /// <summary>
        /// Language identification tag for filtering the list of voices returned. If not specified, all available voices are returned.
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        [Input("voices")]
        private InputList<Inputs.GetVoicesVoiceInputArgs>? _voices;

        /// <summary>
        /// List of voices with their properties. See `voices` Attribute Reference below.
        /// </summary>
        public InputList<Inputs.GetVoicesVoiceInputArgs> Voices
        {
            get => _voices ?? (_voices = new InputList<Inputs.GetVoicesVoiceInputArgs>());
            set => _voices = value;
        }

        public GetVoicesInvokeArgs()
        {
        }
        public static new GetVoicesInvokeArgs Empty => new GetVoicesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVoicesResult
    {
        public readonly string? Engine;
        /// <summary>
        /// Amazon Polly assigned voice ID.
        /// </summary>
        public readonly string Id;
        public readonly bool? IncludeAdditionalLanguageCodes;
        /// <summary>
        /// Language code of the voice.
        /// </summary>
        public readonly string? LanguageCode;
        /// <summary>
        /// List of voices with their properties. See `voices` Attribute Reference below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVoicesVoiceResult> Voices;

        [OutputConstructor]
        private GetVoicesResult(
            string? engine,

            string id,

            bool? includeAdditionalLanguageCodes,

            string? languageCode,

            ImmutableArray<Outputs.GetVoicesVoiceResult> voices)
        {
            Engine = engine;
            Id = id;
            IncludeAdditionalLanguageCodes = includeAdditionalLanguageCodes;
            LanguageCode = languageCode;
            Voices = voices;
        }
    }
}
