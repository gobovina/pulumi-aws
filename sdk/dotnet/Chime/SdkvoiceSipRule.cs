// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Chime
{
    /// <summary>
    /// A SIP rule associates your SIP media application with a phone number or a Request URI hostname. You can associate a SIP rule with more than one SIP media application. Each application then runs only that rule.
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
    ///     var example = new Aws.Chime.SdkvoiceSipRule("example", new()
    ///     {
    ///         Name = "example-sip-rule",
    ///         TriggerType = "RequestUriHostname",
    ///         TriggerValue = example_voice_connector.OutboundHostName,
    ///         TargetApplications = new[]
    ///         {
    ///             new Aws.Chime.Inputs.SdkvoiceSipRuleTargetApplicationArgs
    ///             {
    ///                 Priority = 1,
    ///                 SipMediaApplicationId = example_sma.Id,
    ///                 AwsRegion = "us-east-1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import a ChimeSDKVoice SIP Rule using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:chime/sdkvoiceSipRule:SdkvoiceSipRule example abcdef123456
    /// ```
    /// </summary>
    [AwsResourceType("aws:chime/sdkvoiceSipRule:SdkvoiceSipRule")]
    public partial class SdkvoiceSipRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enables or disables a rule. You must disable rules before you can delete them.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// The name of the SIP rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `target_applications`.
        /// </summary>
        [Output("targetApplications")]
        public Output<ImmutableArray<Outputs.SdkvoiceSipRuleTargetApplication>> TargetApplications { get; private set; } = null!;

        /// <summary>
        /// The type of trigger assigned to the SIP rule in `trigger_value`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
        /// </summary>
        [Output("triggerType")]
        public Output<string> TriggerType { get; private set; } = null!;

        /// <summary>
        /// If `trigger_type` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `trigger_type` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("triggerValue")]
        public Output<string> TriggerValue { get; private set; } = null!;


        /// <summary>
        /// Create a SdkvoiceSipRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SdkvoiceSipRule(string name, SdkvoiceSipRuleArgs args, CustomResourceOptions? options = null)
            : base("aws:chime/sdkvoiceSipRule:SdkvoiceSipRule", name, args ?? new SdkvoiceSipRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SdkvoiceSipRule(string name, Input<string> id, SdkvoiceSipRuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:chime/sdkvoiceSipRule:SdkvoiceSipRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SdkvoiceSipRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SdkvoiceSipRule Get(string name, Input<string> id, SdkvoiceSipRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new SdkvoiceSipRule(name, id, state, options);
        }
    }

    public sealed class SdkvoiceSipRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables or disables a rule. You must disable rules before you can delete them.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the SIP rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("targetApplications", required: true)]
        private InputList<Inputs.SdkvoiceSipRuleTargetApplicationArgs>? _targetApplications;

        /// <summary>
        /// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `target_applications`.
        /// </summary>
        public InputList<Inputs.SdkvoiceSipRuleTargetApplicationArgs> TargetApplications
        {
            get => _targetApplications ?? (_targetApplications = new InputList<Inputs.SdkvoiceSipRuleTargetApplicationArgs>());
            set => _targetApplications = value;
        }

        /// <summary>
        /// The type of trigger assigned to the SIP rule in `trigger_value`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
        /// </summary>
        [Input("triggerType", required: true)]
        public Input<string> TriggerType { get; set; } = null!;

        /// <summary>
        /// If `trigger_type` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `trigger_type` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("triggerValue", required: true)]
        public Input<string> TriggerValue { get; set; } = null!;

        public SdkvoiceSipRuleArgs()
        {
        }
        public static new SdkvoiceSipRuleArgs Empty => new SdkvoiceSipRuleArgs();
    }

    public sealed class SdkvoiceSipRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables or disables a rule. You must disable rules before you can delete them.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the SIP rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("targetApplications")]
        private InputList<Inputs.SdkvoiceSipRuleTargetApplicationGetArgs>? _targetApplications;

        /// <summary>
        /// List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used. See `target_applications`.
        /// </summary>
        public InputList<Inputs.SdkvoiceSipRuleTargetApplicationGetArgs> TargetApplications
        {
            get => _targetApplications ?? (_targetApplications = new InputList<Inputs.SdkvoiceSipRuleTargetApplicationGetArgs>());
            set => _targetApplications = value;
        }

        /// <summary>
        /// The type of trigger assigned to the SIP rule in `trigger_value`. Valid values are `RequestUriHostname` or `ToPhoneNumber`.
        /// </summary>
        [Input("triggerType")]
        public Input<string>? TriggerType { get; set; }

        /// <summary>
        /// If `trigger_type` is `RequestUriHostname`, the value can be the outbound host name of an Amazon Chime Voice Connector. If `trigger_type` is `ToPhoneNumber`, the value can be a customer-owned phone number in the E164 format. The Sip Media Application specified in the Sip Rule is triggered if the request URI in an incoming SIP request matches the `RequestUriHostname`, or if the "To" header in the incoming SIP request matches the `ToPhoneNumber` value.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("triggerValue")]
        public Input<string>? TriggerValue { get; set; }

        public SdkvoiceSipRuleState()
        {
        }
        public static new SdkvoiceSipRuleState Empty => new SdkvoiceSipRuleState();
    }
}
