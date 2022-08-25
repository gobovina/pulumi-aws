// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift {
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    private @Nullable String bucketPrefix;
    /**
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
     * 
     */
    private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig errorHandlingConfig;
    /**
     * @return The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Snowflake.
     * 
     */
    private String intermediateBucketName;
    /**
     * @return The object specified in the Veeva flow source.
     * 
     */
    private String object;

    private FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift() {}
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }
    /**
     * @return The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Snowflake.
     * 
     */
    public String intermediateBucketName() {
        return this.intermediateBucketName;
    }
    /**
     * @return The object specified in the Veeva flow source.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketPrefix;
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig errorHandlingConfig;
        private String intermediateBucketName;
        private String object;
        public Builder() {}
        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.intermediateBucketName = defaults.intermediateBucketName;
    	      this.object = defaults.object;
        }

        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder errorHandlingConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder intermediateBucketName(String intermediateBucketName) {
            this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName);
            return this;
        }
        @CustomType.Setter
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift build() {
            final var o = new FlowDestinationFlowConfigDestinationConnectorPropertiesRedshift();
            o.bucketPrefix = bucketPrefix;
            o.errorHandlingConfig = errorHandlingConfig;
            o.intermediateBucketName = intermediateBucketName;
            o.object = object;
            return o;
        }
    }
}
