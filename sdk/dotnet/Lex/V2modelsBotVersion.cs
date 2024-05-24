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
    /// Resource for managing an AWS Lex V2 Models Bot Version.
    /// 
    /// ## Example Usage
    /// 
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
    ///     var test = new Aws.Lex.V2modelsBotVersion("test", new()
    ///     {
    ///         BotId = testAwsLexv2models.Id,
    ///         LocaleSpecification = 
    ///         {
    ///             { "en_US", new Aws.Lex.Inputs.V2modelsBotVersionLocaleSpecificationArgs
    ///             {
    ///                 SourceBotVersion = "DRAFT",
    ///             } },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Lex V2 Models Bot Version using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:lex/v2modelsBotVersion:V2modelsBotVersion example id-12345678,1
    /// ```
    /// </summary>
    [AwsResourceType("aws:lex/v2modelsBotVersion:V2modelsBotVersion")]
    public partial class V2modelsBotVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Idientifier of the bot to create the version for.
        /// </summary>
        [Output("botId")]
        public Output<string> BotId { get; private set; } = null!;

        /// <summary>
        /// Version number assigned to the version.
        /// </summary>
        [Output("botVersion")]
        public Output<string> BotVersion { get; private set; } = null!;

        /// <summary>
        /// A description of the version. Use the description to help identify the version in lists.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies the locales that Amazon Lex adds to this version. You can choose the draft version or any other previously published version for each locale. When you specify a source version, the locale data is copied from the source version to the new version.
        /// 
        /// The attribute value is a map with one or more entries, each of which has a locale name as the key and an object with the following attribute as the value:
        /// * `sourceBotVersion` - (Required) The version of a bot used for a bot locale. Valid values: `DRAFT`, a numeric version.
        /// </summary>
        [Output("localeSpecification")]
        public Output<ImmutableDictionary<string, Outputs.V2modelsBotVersionLocaleSpecification>> LocaleSpecification { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.V2modelsBotVersionTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a V2modelsBotVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V2modelsBotVersion(string name, V2modelsBotVersionArgs args, CustomResourceOptions? options = null)
            : base("aws:lex/v2modelsBotVersion:V2modelsBotVersion", name, args ?? new V2modelsBotVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V2modelsBotVersion(string name, Input<string> id, V2modelsBotVersionState? state = null, CustomResourceOptions? options = null)
            : base("aws:lex/v2modelsBotVersion:V2modelsBotVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing V2modelsBotVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V2modelsBotVersion Get(string name, Input<string> id, V2modelsBotVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new V2modelsBotVersion(name, id, state, options);
        }
    }

    public sealed class V2modelsBotVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Idientifier of the bot to create the version for.
        /// </summary>
        [Input("botId", required: true)]
        public Input<string> BotId { get; set; } = null!;

        /// <summary>
        /// Version number assigned to the version.
        /// </summary>
        [Input("botVersion")]
        public Input<string>? BotVersion { get; set; }

        /// <summary>
        /// A description of the version. Use the description to help identify the version in lists.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("localeSpecification", required: true)]
        private InputMap<Inputs.V2modelsBotVersionLocaleSpecificationArgs>? _localeSpecification;

        /// <summary>
        /// Specifies the locales that Amazon Lex adds to this version. You can choose the draft version or any other previously published version for each locale. When you specify a source version, the locale data is copied from the source version to the new version.
        /// 
        /// The attribute value is a map with one or more entries, each of which has a locale name as the key and an object with the following attribute as the value:
        /// * `sourceBotVersion` - (Required) The version of a bot used for a bot locale. Valid values: `DRAFT`, a numeric version.
        /// </summary>
        public InputMap<Inputs.V2modelsBotVersionLocaleSpecificationArgs> LocaleSpecification
        {
            get => _localeSpecification ?? (_localeSpecification = new InputMap<Inputs.V2modelsBotVersionLocaleSpecificationArgs>());
            set => _localeSpecification = value;
        }

        [Input("timeouts")]
        public Input<Inputs.V2modelsBotVersionTimeoutsArgs>? Timeouts { get; set; }

        public V2modelsBotVersionArgs()
        {
        }
        public static new V2modelsBotVersionArgs Empty => new V2modelsBotVersionArgs();
    }

    public sealed class V2modelsBotVersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Idientifier of the bot to create the version for.
        /// </summary>
        [Input("botId")]
        public Input<string>? BotId { get; set; }

        /// <summary>
        /// Version number assigned to the version.
        /// </summary>
        [Input("botVersion")]
        public Input<string>? BotVersion { get; set; }

        /// <summary>
        /// A description of the version. Use the description to help identify the version in lists.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("localeSpecification")]
        private InputMap<Inputs.V2modelsBotVersionLocaleSpecificationGetArgs>? _localeSpecification;

        /// <summary>
        /// Specifies the locales that Amazon Lex adds to this version. You can choose the draft version or any other previously published version for each locale. When you specify a source version, the locale data is copied from the source version to the new version.
        /// 
        /// The attribute value is a map with one or more entries, each of which has a locale name as the key and an object with the following attribute as the value:
        /// * `sourceBotVersion` - (Required) The version of a bot used for a bot locale. Valid values: `DRAFT`, a numeric version.
        /// </summary>
        public InputMap<Inputs.V2modelsBotVersionLocaleSpecificationGetArgs> LocaleSpecification
        {
            get => _localeSpecification ?? (_localeSpecification = new InputMap<Inputs.V2modelsBotVersionLocaleSpecificationGetArgs>());
            set => _localeSpecification = value;
        }

        [Input("timeouts")]
        public Input<Inputs.V2modelsBotVersionTimeoutsGetArgs>? Timeouts { get; set; }

        public V2modelsBotVersionState()
        {
        }
        public static new V2modelsBotVersionState Empty => new V2modelsBotVersionState();
    }
}
