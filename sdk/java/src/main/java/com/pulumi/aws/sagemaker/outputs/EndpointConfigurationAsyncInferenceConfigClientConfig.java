// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationAsyncInferenceConfigClientConfig {
    /**
     * @return The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    private @Nullable Integer maxConcurrentInvocationsPerInstance;

    private EndpointConfigurationAsyncInferenceConfigClientConfig() {}
    /**
     * @return The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    public Optional<Integer> maxConcurrentInvocationsPerInstance() {
        return Optional.ofNullable(this.maxConcurrentInvocationsPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigClientConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxConcurrentInvocationsPerInstance;
        public Builder() {}
        public Builder(EndpointConfigurationAsyncInferenceConfigClientConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentInvocationsPerInstance = defaults.maxConcurrentInvocationsPerInstance;
        }

        @CustomType.Setter
        public Builder maxConcurrentInvocationsPerInstance(@Nullable Integer maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigClientConfig build() {
            final var o = new EndpointConfigurationAsyncInferenceConfigClientConfig();
            o.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return o;
        }
    }
}
