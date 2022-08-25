// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureConfigurationLoggingS3Logs {
    /**
     * @return Name of the S3 Bucket.
     * 
     */
    private String s3BucketName;
    /**
     * @return Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    private @Nullable String s3KeyPrefix;

    private InfrastructureConfigurationLoggingS3Logs() {}
    /**
     * @return Name of the S3 Bucket.
     * 
     */
    public String s3BucketName() {
        return this.s3BucketName;
    }
    /**
     * @return Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLoggingS3Logs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;
        public Builder() {}
        public Builder(InfrastructureConfigurationLoggingS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        @CustomType.Setter
        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        @CustomType.Setter
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public InfrastructureConfigurationLoggingS3Logs build() {
            final var o = new InfrastructureConfigurationLoggingS3Logs();
            o.s3BucketName = s3BucketName;
            o.s3KeyPrefix = s3KeyPrefix;
            return o;
        }
    }
}
