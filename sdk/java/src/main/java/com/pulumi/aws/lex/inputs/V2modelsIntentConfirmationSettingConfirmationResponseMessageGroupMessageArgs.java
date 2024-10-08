// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs Empty = new V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs();

    /**
     * Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    @Import(name="customPayload")
    private @Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs> customPayload;

    /**
     * @return Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs>> customPayload() {
        return Optional.ofNullable(this.customPayload);
    }

    /**
     * Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    @Import(name="imageResponseCard")
    private @Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs> imageResponseCard;

    /**
     * @return Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs>> imageResponseCard() {
        return Optional.ofNullable(this.imageResponseCard);
    }

    /**
     * Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    @Import(name="plainTextMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs> plainTextMessage;

    /**
     * @return Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs>> plainTextMessage() {
        return Optional.ofNullable(this.plainTextMessage);
    }

    /**
     * Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    @Import(name="ssmlMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs> ssmlMessage;

    /**
     * @return Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs>> ssmlMessage() {
        return Optional.ofNullable(this.ssmlMessage);
    }

    private V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs() {}

    private V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs $) {
        this.customPayload = $.customPayload;
        this.imageResponseCard = $.imageResponseCard;
        this.plainTextMessage = $.plainTextMessage;
        this.ssmlMessage = $.ssmlMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs $;

        public Builder() {
            $ = new V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs();
        }

        public Builder(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs defaults) {
            $ = new V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(@Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs> customPayload) {
            $.customPayload = customPayload;
            return this;
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageCustomPayloadArgs customPayload) {
            return customPayload(Output.of(customPayload));
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(@Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs> imageResponseCard) {
            $.imageResponseCard = imageResponseCard;
            return this;
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageImageResponseCardArgs imageResponseCard) {
            return imageResponseCard(Output.of(imageResponseCard));
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(@Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs> plainTextMessage) {
            $.plainTextMessage = plainTextMessage;
            return this;
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessagePlainTextMessageArgs plainTextMessage) {
            return plainTextMessage(Output.of(plainTextMessage));
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(@Nullable Output<V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs> ssmlMessage) {
            $.ssmlMessage = ssmlMessage;
            return this;
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageSsmlMessageArgs ssmlMessage) {
            return ssmlMessage(Output.of(ssmlMessage));
        }

        public V2modelsIntentConfirmationSettingConfirmationResponseMessageGroupMessageArgs build() {
            return $;
        }
    }

}
