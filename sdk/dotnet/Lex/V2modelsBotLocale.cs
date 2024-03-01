// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex
{
    /// <summary>
    /// Resource for managing an AWS Lex V2 Models Bot Locale.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Lex.V2modelsBotLocale("example", new()
    ///     {
    ///         BotId = exampleAwsLexv2modelsBot.Id,
    ///         BotVersion = "DRAFT",
    ///         LocaleId = "en_US",
    ///         NLuIntentConfidenceThreshold = 0.7,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Voice Settings
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Lex.V2modelsBotLocale("example", new()
    ///     {
    ///         BotId = exampleAwsLexv2modelsBot.Id,
    ///         BotVersion = "DRAFT",
    ///         LocaleId = "en_US",
    ///         NLuIntentConfidenceThreshold = 0.7,
    ///         VoiceSettings = new Aws.Lex.Inputs.V2modelsBotLocaleVoiceSettingsArgs
    ///         {
    ///             VoiceId = "Kendra",
    ///             Engine = "standard",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Lex V2 Models Bot Locale using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:lex/v2modelsBotLocale:V2modelsBotLocale example en_US,abcd-12345678,1
    /// ```
    /// </summary>
    [AwsResourceType("aws:lex/v2modelsBotLocale:V2modelsBotLocale")]
    public partial class V2modelsBotLocale : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier of the bot to create the locale for.
        /// </summary>
        [Output("botId")]
        public Output<string> BotId { get; private set; } = null!;

        /// <summary>
        /// Version of the bot to create the locale for. This can only be the draft version of the bot.
        /// </summary>
        [Output("botVersion")]
        public Output<string> BotVersion { get; private set; } = null!;

        /// <summary>
        /// Description of the bot locale. Use this to help identify the bot locale in lists.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
        /// </summary>
        [Output("localeId")]
        public Output<string> LocaleId { get; private set; } = null!;

        /// <summary>
        /// Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("nLuIntentConfidenceThreshold")]
        public Output<double> NLuIntentConfidenceThreshold { get; private set; } = null!;

        /// <summary>
        /// Specified locale name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.V2modelsBotLocaleTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
        /// </summary>
        [Output("voiceSettings")]
        public Output<Outputs.V2modelsBotLocaleVoiceSettings?> VoiceSettings { get; private set; } = null!;


        /// <summary>
        /// Create a V2modelsBotLocale resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V2modelsBotLocale(string name, V2modelsBotLocaleArgs args, CustomResourceOptions? options = null)
            : base("aws:lex/v2modelsBotLocale:V2modelsBotLocale", name, args ?? new V2modelsBotLocaleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V2modelsBotLocale(string name, Input<string> id, V2modelsBotLocaleState? state = null, CustomResourceOptions? options = null)
            : base("aws:lex/v2modelsBotLocale:V2modelsBotLocale", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing V2modelsBotLocale resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V2modelsBotLocale Get(string name, Input<string> id, V2modelsBotLocaleState? state = null, CustomResourceOptions? options = null)
        {
            return new V2modelsBotLocale(name, id, state, options);
        }
    }

    public sealed class V2modelsBotLocaleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the bot to create the locale for.
        /// </summary>
        [Input("botId", required: true)]
        public Input<string> BotId { get; set; } = null!;

        /// <summary>
        /// Version of the bot to create the locale for. This can only be the draft version of the bot.
        /// </summary>
        [Input("botVersion", required: true)]
        public Input<string> BotVersion { get; set; } = null!;

        /// <summary>
        /// Description of the bot locale. Use this to help identify the bot locale in lists.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
        /// </summary>
        [Input("localeId", required: true)]
        public Input<string> LocaleId { get; set; } = null!;

        /// <summary>
        /// Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("nLuIntentConfidenceThreshold", required: true)]
        public Input<double> NLuIntentConfidenceThreshold { get; set; } = null!;

        /// <summary>
        /// Specified locale name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("timeouts")]
        public Input<Inputs.V2modelsBotLocaleTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
        /// </summary>
        [Input("voiceSettings")]
        public Input<Inputs.V2modelsBotLocaleVoiceSettingsArgs>? VoiceSettings { get; set; }

        public V2modelsBotLocaleArgs()
        {
        }
        public static new V2modelsBotLocaleArgs Empty => new V2modelsBotLocaleArgs();
    }

    public sealed class V2modelsBotLocaleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the bot to create the locale for.
        /// </summary>
        [Input("botId")]
        public Input<string>? BotId { get; set; }

        /// <summary>
        /// Version of the bot to create the locale for. This can only be the draft version of the bot.
        /// </summary>
        [Input("botVersion")]
        public Input<string>? BotVersion { get; set; }

        /// <summary>
        /// Description of the bot locale. Use this to help identify the bot locale in lists.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages (https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html)
        /// </summary>
        [Input("localeId")]
        public Input<string>? LocaleId { get; set; }

        /// <summary>
        /// Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("nLuIntentConfidenceThreshold")]
        public Input<double>? NLuIntentConfidenceThreshold { get; set; }

        /// <summary>
        /// Specified locale name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("timeouts")]
        public Input<Inputs.V2modelsBotLocaleTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. See `voice_settings`.
        /// </summary>
        [Input("voiceSettings")]
        public Input<Inputs.V2modelsBotLocaleVoiceSettingsGetArgs>? VoiceSettings { get; set; }

        public V2modelsBotLocaleState()
        {
        }
        public static new V2modelsBotLocaleState Empty => new V2modelsBotLocaleState();
    }
}
