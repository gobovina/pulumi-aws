// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue {
    /**
     * @return Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
     * 
     */
    private @Nullable String interpretedValue;

    private V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue() {}
    /**
     * @return Value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
     * 
     */
    public Optional<String> interpretedValue() {
        return Optional.ofNullable(this.interpretedValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String interpretedValue;
        public Builder() {}
        public Builder(V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interpretedValue = defaults.interpretedValue;
        }

        @CustomType.Setter
        public Builder interpretedValue(@Nullable String interpretedValue) {

            this.interpretedValue = interpretedValue;
            return this;
        }
        public V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue build() {
            final var _resultValue = new V2modelsIntentInitialResponseSettingCodeHookPostCodeHookSpecificationFailureConditionalConditionalBranchNextStepIntentSlotValue();
            _resultValue.interpretedValue = interpretedValue;
            return _resultValue;
        }
    }
}
