// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs;
import com.pulumi.aws.lex.inputs.V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs Empty = new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs();

    /**
     * Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    @Import(name="customPayload")
    private @Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload;

    /**
     * @return Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs>> customPayload() {
        return Optional.ofNullable(this.customPayload);
    }

    /**
     * Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    @Import(name="imageResponseCard")
    private @Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard;

    /**
     * @return Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs>> imageResponseCard() {
        return Optional.ofNullable(this.imageResponseCard);
    }

    /**
     * Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    @Import(name="plainTextMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage;

    /**
     * @return Configuration block for a message in plain text format. See `plain_text_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs>> plainTextMessage() {
        return Optional.ofNullable(this.plainTextMessage);
    }

    /**
     * Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    @Import(name="ssmlMessage")
    private @Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage;

    /**
     * @return Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
     * 
     */
    public Optional<Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs>> ssmlMessage() {
        return Optional.ofNullable(this.ssmlMessage);
    }

    private V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs() {}

    private V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs $) {
        this.customPayload = $.customPayload;
        this.imageResponseCard = $.imageResponseCard;
        this.plainTextMessage = $.plainTextMessage;
        this.ssmlMessage = $.ssmlMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs $;

        public Builder() {
            $ = new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs();
        }

        public Builder(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs defaults) {
            $ = new V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(@Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs> customPayload) {
            $.customPayload = customPayload;
            return this;
        }

        /**
         * @param customPayload Configuration block for a message in a custom format defined by the client application. See `custom_payload`.
         * 
         * @return builder
         * 
         */
        public Builder customPayload(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationCustomPayloadArgs customPayload) {
            return customPayload(Output.of(customPayload));
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(@Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs> imageResponseCard) {
            $.imageResponseCard = imageResponseCard;
            return this;
        }

        /**
         * @param imageResponseCard Configuration block for a message that defines a response card that the client application can show to the user. See `image_response_card`.
         * 
         * @return builder
         * 
         */
        public Builder imageResponseCard(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationImageResponseCardArgs imageResponseCard) {
            return imageResponseCard(Output.of(imageResponseCard));
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(@Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs> plainTextMessage) {
            $.plainTextMessage = plainTextMessage;
            return this;
        }

        /**
         * @param plainTextMessage Configuration block for a message in plain text format. See `plain_text_message`.
         * 
         * @return builder
         * 
         */
        public Builder plainTextMessage(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationPlainTextMessageArgs plainTextMessage) {
            return plainTextMessage(Output.of(plainTextMessage));
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(@Nullable Output<V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs> ssmlMessage) {
            $.ssmlMessage = ssmlMessage;
            return this;
        }

        /**
         * @param ssmlMessage Configuration block for a message in Speech Synthesis Markup Language (SSML). See `ssml_message`.
         * 
         * @return builder
         * 
         */
        public Builder ssmlMessage(V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationSsmlMessageArgs ssmlMessage) {
            return ssmlMessage(Output.of(ssmlMessage));
        }

        public V2modelsIntentConfirmationSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchResponseMessageGroupVariationArgs build() {
            return $;
        }
    }

}
