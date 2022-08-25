// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TaskDefinitionInferenceAccelerator {
    /**
     * @return Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    private String deviceName;
    /**
     * @return Elastic Inference accelerator type to use.
     * 
     */
    private String deviceType;

    private TaskDefinitionInferenceAccelerator() {}
    /**
     * @return Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Elastic Inference accelerator type to use.
     * 
     */
    public String deviceType() {
        return this.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAccelerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private String deviceType;
        public Builder() {}
        public Builder(TaskDefinitionInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder deviceType(String deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }
        public TaskDefinitionInferenceAccelerator build() {
            final var o = new TaskDefinitionInferenceAccelerator();
            o.deviceName = deviceName;
            o.deviceType = deviceType;
            return o;
        }
    }
}
