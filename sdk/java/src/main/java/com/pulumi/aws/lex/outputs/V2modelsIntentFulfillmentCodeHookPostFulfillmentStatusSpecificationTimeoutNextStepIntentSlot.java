// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.aws.lex.outputs.V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValue;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot {
    /**
     * @return Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
     * 
     */
    private String mapBlockKey;
    /**
     * @return When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
     * 
     */
    private @Nullable String shape;
    /**
     * @return Configuration block for the current value of the slot. See `value`.
     * 
     */
    private @Nullable V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValue value;

    private V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot() {}
    /**
     * @return Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
     * 
     */
    public String mapBlockKey() {
        return this.mapBlockKey;
    }
    /**
     * @return When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
     * 
     */
    public Optional<String> shape() {
        return Optional.ofNullable(this.shape);
    }
    /**
     * @return Configuration block for the current value of the slot. See `value`.
     * 
     */
    public Optional<V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mapBlockKey;
        private @Nullable String shape;
        private @Nullable V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValue value;
        public Builder() {}
        public Builder(V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapBlockKey = defaults.mapBlockKey;
    	      this.shape = defaults.shape;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder mapBlockKey(String mapBlockKey) {
            if (mapBlockKey == null) {
              throw new MissingRequiredPropertyException("V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot", "mapBlockKey");
            }
            this.mapBlockKey = mapBlockKey;
            return this;
        }
        @CustomType.Setter
        public Builder shape(@Nullable String shape) {

            this.shape = shape;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlotValue value) {

            this.value = value;
            return this;
        }
        public V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot build() {
            final var _resultValue = new V2modelsIntentFulfillmentCodeHookPostFulfillmentStatusSpecificationTimeoutNextStepIntentSlot();
            _resultValue.mapBlockKey = mapBlockKey;
            _resultValue.shape = shape;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
