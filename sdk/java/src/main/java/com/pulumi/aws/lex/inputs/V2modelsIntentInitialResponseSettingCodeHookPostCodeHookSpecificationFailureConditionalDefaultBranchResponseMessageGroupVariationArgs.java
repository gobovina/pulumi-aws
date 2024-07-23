// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs Empty = new V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs();

    /**
     * Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    @Import(name="customPayload")
    private @Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload;

    /**
     * @return Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    public Optional<Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs>> customPayload() {
        return Optional.ofNullable(this.customPayload);
    }

    /**
     * Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    @Import(name="imageResponseCard")
    private @Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard;

    /**
     * @return Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    public Optional<Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs>> imageResponseCard() {
        return Optional.ofNullable(this.imageResponseCard);
    }

    /**
     * Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    @Import(name="plainTextMessage")
    private @Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage;

    /**
     * @return Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    public Optional<Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs>> plainTextMessage() {
        return Optional.ofNullable(this.plainTextMessage);
    }

    /**
     * Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    @Import(name="ssmlMessage")
    private @Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage;

    /**
     * @return Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    public Optional<Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs>> ssmlMessage() {
        return Optional.ofNullable(this.ssmlMessage);
    }

    private V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs() {}

    private V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs $) {
        this.customPayload = $.customPayload;
        this.imageResponseCard = $.imageResponseCard;
        this.plainTextMessage = $.plainTextMessage;
        this.ssmlMessage = $.ssmlMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs $;

        public Builder() {
            $ = new V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs();
        }

        public Builder(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs defaults) {
            $ = new V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(@Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload) {
            $.customPayload = customPayload;
            return this;
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs customPayload) {
            return customPayload(Output.of(customPayload));
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(@Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard) {
            $.imageResponseCard = imageResponseCard;
            return this;
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs imageResponseCard) {
            return imageResponseCard(Output.of(imageResponseCard));
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(@Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage) {
            $.plainTextMessage = plainTextMessage;
            return this;
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs plainTextMessage) {
            return plainTextMessage(Output.of(plainTextMessage));
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(@Nullable Output<V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage) {
            $.ssmlMessage = ssmlMessage;
            return this;
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs ssmlMessage) {
            return ssmlMessage(Output.of(ssmlMessage));
        }

        public V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalDefaultBranchResponseMessageGroupVariationArgs build() {
            return $;
        }
    }

}
