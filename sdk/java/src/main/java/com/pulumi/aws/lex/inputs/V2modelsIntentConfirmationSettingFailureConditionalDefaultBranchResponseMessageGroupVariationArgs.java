// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs Empty = new V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs();

    /**
     * Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    @Import(name="customPayload")
    private @Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload;

    /**
     * @return Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs>> customPayload() {
        return Optional.ofNullable(this.customPayload);
    }

    /**
     * Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    @Import(name="imageResponseCard")
    private @Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard;

    /**
     * @return Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs>> imageResponseCard() {
        return Optional.ofNullable(this.imageResponseCard);
    }

    /**
     * Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    @Import(name="plainTextMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage;

    /**
     * @return Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs>> plainTextMessage() {
        return Optional.ofNullable(this.plainTextMessage);
    }

    /**
     * Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    @Import(name="ssmlMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage;

    /**
     * @return Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs>> ssmlMessage() {
        return Optional.ofNullable(this.ssmlMessage);
    }

    private V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs() {}

    private V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs $) {
        this.customPayload = $.customPayload;
        this.imageResponseCard = $.imageResponseCard;
        this.plainTextMessage = $.plainTextMessage;
        this.ssmlMessage = $.ssmlMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs $;

        public Builder() {
            $ = new V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs();
        }

        public Builder(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs defaults) {
            $ = new V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(@Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload) {
            $.customPayload = customPayload;
            return this;
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationCustomPayloadArgs customPayload) {
            return customPayload(Output.of(customPayload));
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(@Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard) {
            $.imageResponseCard = imageResponseCard;
            return this;
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationImageResponseCardArgs imageResponseCard) {
            return imageResponseCard(Output.of(imageResponseCard));
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(@Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage) {
            $.plainTextMessage = plainTextMessage;
            return this;
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationPlainTextMessageArgs plainTextMessage) {
            return plainTextMessage(Output.of(plainTextMessage));
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(@Nullable Output<V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage) {
            $.ssmlMessage = ssmlMessage;
            return this;
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationSsmlMessageArgs ssmlMessage) {
            return ssmlMessage(Output.of(ssmlMessage));
        }

        public V2modelsIntentConfirmationSettingFailureConditionalDefaultBranchResponseMessageGroupVariationArgs build() {
            return $;
        }
    }

}
