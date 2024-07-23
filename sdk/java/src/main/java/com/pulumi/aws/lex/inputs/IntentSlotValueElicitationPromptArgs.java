// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentSlotValueElicitationPromptArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentSlotValueElicitationPromptArgs Empty = new IntentSlotValueElicitationPromptArgs();

    /**
     * The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
     * 
     */
    @Import(name="maxAttempts", required=true)
    private Output<Integer> maxAttempts;

    /**
     * @return The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
     * 
     */
    public Output<Integer> maxAttempts() {
        return this.maxAttempts;
    }

    @Import(name="messages", required=true)
    private Output<List<IntentSlotValueElicitationPromptMessageArgs>> messages;

    public Output<List<IntentSlotValueElicitationPromptMessageArgs>> messages() {
        return this.messages;
    }

    @Import(name="responseCard")
    private @Nullable Output<String> responseCard;

    public Optional<Output<String>> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    private IntentSlotValueElicitationPromptArgs() {}

    private IntentSlotValueElicitationPromptArgs(IntentSlotValueElicitationPromptArgs $) {
        this.maxAttempts = $.maxAttempts;
        this.messages = $.messages;
        this.responseCard = $.responseCard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentSlotValueElicitationPromptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentSlotValueElicitationPromptArgs $;

        public Builder() {
            $ = new IntentSlotValueElicitationPromptArgs();
        }

        public Builder(IntentSlotValueElicitationPromptArgs defaults) {
            $ = new IntentSlotValueElicitationPromptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxAttempts The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(Output<Integer> maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * @param maxAttempts The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(Integer maxAttempts) {
            return maxAttempts(Output.of(maxAttempts));
        }

        public Builder messages(Output<List<IntentSlotValueElicitationPromptMessageArgs>> messages) {
            $.messages = messages;
            return this;
        }

        public Builder messages(List<IntentSlotValueElicitationPromptMessageArgs> messages) {
            return messages(Output.of(messages));
        }

        public Builder messages(IntentSlotValueElicitationPromptMessageArgs... messages) {
            return messages(List.of(messages));
        }

        public Builder responseCard(@Nullable Output<String> responseCard) {
            $.responseCard = responseCard;
            return this;
        }

        public Builder responseCard(String responseCard) {
            return responseCard(Output.of(responseCard));
        }

        public IntentSlotValueElicitationPromptArgs build() {
            if ($.maxAttempts == null) {
                throw new MissingRequiredPropertyException("IntentSlotValueElicitationPromptArgs", "maxAttempts");
            }
            if ($.messages == null) {
                throw new MissingRequiredPropertyException("IntentSlotValueElicitationPromptArgs", "messages");
            }
            return $;
        }
    }

}
