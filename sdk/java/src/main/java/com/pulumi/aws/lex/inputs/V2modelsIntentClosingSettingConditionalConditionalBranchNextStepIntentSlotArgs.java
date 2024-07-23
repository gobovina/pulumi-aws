// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs Empty = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs();

    /**
     * Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
     * 
     */
    @Import(name="mapBlockKey", required=true)
    private Output<String> mapBlockKey;

    /**
     * @return Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
     * 
     */
    public Output<String> mapBlockKey() {
        return this.mapBlockKey;
    }

    /**
     * When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
     * 
     */
    @Import(name="shape")
    private @Nullable Output<String> shape;

    /**
     * @return When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
     * 
     */
    public Optional<Output<String>> shape() {
        return Optional.ofNullable(this.shape);
    }

    /**
     * Configuration block for the current value of the slot. See `value`.
     * 
     */
    @Import(name="value")
    private @Nullable Output<V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs> value;

    /**
     * @return Configuration block for the current value of the slot. See `value`.
     * 
     */
    public Optional<Output<V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs() {}

    private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs $) {
        this.mapBlockKey = $.mapBlockKey;
        this.shape = $.shape;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs $;

        public Builder() {
            $ = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs();
        }

        public Builder(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs defaults) {
            $ = new V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mapBlockKey Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
         * 
         * @return builder
         * 
         */
        public Builder mapBlockKey(Output<String> mapBlockKey) {
            $.mapBlockKey = mapBlockKey;
            return this;
        }

        /**
         * @param mapBlockKey Which attempt to configure. Valid values are `Initial`, `Retry1`, `Retry2`, `Retry3`, `Retry4`, `Retry5`.
         * 
         * @return builder
         * 
         */
        public Builder mapBlockKey(String mapBlockKey) {
            return mapBlockKey(Output.of(mapBlockKey));
        }

        /**
         * @param shape When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
         * 
         * @return builder
         * 
         */
        public Builder shape(@Nullable Output<String> shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param shape When the shape value is `List`, `values` contains a list of slot values. When the value is `Scalar`, `value` contains a single value.
         * 
         * @return builder
         * 
         */
        public Builder shape(String shape) {
            return shape(Output.of(shape));
        }

        /**
         * @param value Configuration block for the current value of the slot. See `value`.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Configuration block for the current value of the slot. See `value`.
         * 
         * @return builder
         * 
         */
        public Builder value(V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotValueArgs value) {
            return value(Output.of(value));
        }

        public V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs build() {
            if ($.mapBlockKey == null) {
                throw new MissingRequiredPropertyException("V2modelsIntentClosingSettingConditionalConditionalBranchNextStepIntentSlotArgs", "mapBlockKey");
            }
            return $;
        }
    }

}
