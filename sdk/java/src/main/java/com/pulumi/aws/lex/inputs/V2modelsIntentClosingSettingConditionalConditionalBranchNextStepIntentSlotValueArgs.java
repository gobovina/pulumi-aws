// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs Empty = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs();

    /**
     * Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
     * 
     */
    @Import(name="interpretedValue")
    private @Nullable Output<String> interpretedValue;

    /**
     * @return Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
     * 
     */
    public Optional<Output<String>> interpretedValue() {
        return Optional.ofNullable(this.interpretedValue);
    }

    private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs() {}

    private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs $) {
        this.interpretedValue = $.interpretedValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs $;

        public Builder() {
            $ = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs();
        }

        public Builder(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs defaults) {
            $ = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interpretedValue Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
         * 
         * @return builder
         * 
         */
        public Builder interpretedValue(@Nullable Output<String> interpretedValue) {
            $.interpretedValue = interpretedValue;
            return this;
        }

        /**
         * @param interpretedValue Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
         * 
         * @return builder
         * 
         */
        public Builder interpretedValue(String interpretedValue) {
            return interpretedValue(Output.of(interpretedValue));
        }

        public V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs build() {
            return $;
        }
    }

}
