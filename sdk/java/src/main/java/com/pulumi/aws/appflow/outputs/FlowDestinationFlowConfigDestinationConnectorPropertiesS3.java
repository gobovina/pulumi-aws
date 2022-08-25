// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesS3 {
    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    private String bucketName;
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    private @Nullable String bucketPrefix;
    /**
     * @return The configuration that determines how Amazon AppFlow should format the flow output data when Upsolver is used as the destination. See Upsolver S3 Output Format Config for more details.
     * 
     */
    private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig s3OutputFormatConfig;

    private FlowDestinationFlowConfigDestinationConnectorPropertiesS3() {}
    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return The configuration that determines how Amazon AppFlow should format the flow output data when Upsolver is used as the destination. See Upsolver S3 Output Format Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig> s3OutputFormatConfig() {
        return Optional.ofNullable(this.s3OutputFormatConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig s3OutputFormatConfig;
        public Builder() {}
        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder s3OutputFormatConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig s3OutputFormatConfig) {
            this.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }
        public FlowDestinationFlowConfigDestinationConnectorPropertiesS3 build() {
            final var o = new FlowDestinationFlowConfigDestinationConnectorPropertiesS3();
            o.bucketName = bucketName;
            o.bucketPrefix = bucketPrefix;
            o.s3OutputFormatConfig = s3OutputFormatConfig;
            return o;
        }
    }
}
