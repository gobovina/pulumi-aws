// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs Empty = new PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs();

    /**
     * The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * The Elastic Inference accelerator type to use.
     * 
     */
    @Import(name="deviceType")
    private @Nullable Output<String> deviceType;

    /**
     * @return The Elastic Inference accelerator type to use.
     * 
     */
    public Optional<Output<String>> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }

    private PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs() {}

    private PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs(PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs $) {
        this.deviceName = $.deviceName;
        this.deviceType = $.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs $;

        public Builder() {
            $ = new PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs();
        }

        public Builder(PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs defaults) {
            $ = new PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param deviceType The Elastic Inference accelerator type to use.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(@Nullable Output<String> deviceType) {
            $.deviceType = deviceType;
            return this;
        }

        /**
         * @param deviceType The Elastic Inference accelerator type to use.
         * 
         * @return builder
         * 
         */
        public Builder deviceType(String deviceType) {
            return deviceType(Output.of(deviceType));
        }

        public PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs build() {
            return $;
        }
    }

}
