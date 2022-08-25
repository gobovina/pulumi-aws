// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig {
    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    private @Nullable String bucketName;
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    private @Nullable String bucketPrefix;

    private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig() {}
    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable String bucketPrefix;
        public Builder() {}
        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig build() {
            final var o = new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig();
            o.bucketName = bucketName;
            o.bucketPrefix = bucketPrefix;
            return o;
        }
    }
}
