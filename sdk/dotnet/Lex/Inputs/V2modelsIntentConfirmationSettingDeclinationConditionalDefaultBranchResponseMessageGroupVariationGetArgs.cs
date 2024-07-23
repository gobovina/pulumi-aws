// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
        /// </summary>
        [Input("customPayload")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadGetArgs>? CustomPayload { get; set; }

        /// <summary>
        /// Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
        /// </summary>
        [Input("imageResponseCard")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardGetArgs>? ImageResponseCard { get; set; }

        /// <summary>
        /// Configuration block for a message in plain text format. See `plain_text_message`.
        /// </summary>
        [Input("plainTextMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageGetArgs>? PlainTextMessage { get; set; }

        /// <summary>
        /// Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
        /// </summary>
        [Input("ssmlMessage")]
        public Input<Inputs.V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageGetArgs>? SsmlMessage { get; set; }

        public V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs()
        {
        }
        public static new V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs Empty => new V2modelsIntentConfirmationSettingDeclinationConditionalDefaultBranchResponseMessageGroupVariationGetArgs();
    }
}
