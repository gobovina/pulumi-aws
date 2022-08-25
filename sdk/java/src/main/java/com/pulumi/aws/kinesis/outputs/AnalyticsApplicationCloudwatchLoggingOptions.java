// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationCloudwatchLoggingOptions {
    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    private @Nullable String id;
    /**
     * @return The ARN of the CloudWatch Log Stream.
     * 
     */
    private String logStreamArn;
    /**
     * @return The ARN of the IAM Role used to send application messages.
     * 
     */
    private String roleArn;

    private AnalyticsApplicationCloudwatchLoggingOptions() {}
    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The ARN of the CloudWatch Log Stream.
     * 
     */
    public String logStreamArn() {
        return this.logStreamArn;
    }
    /**
     * @return The ARN of the IAM Role used to send application messages.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationCloudwatchLoggingOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String logStreamArn;
        private String roleArn;
        public Builder() {}
        public Builder(AnalyticsApplicationCloudwatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.logStreamArn = defaults.logStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logStreamArn(String logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AnalyticsApplicationCloudwatchLoggingOptions build() {
            final var o = new AnalyticsApplicationCloudwatchLoggingOptions();
            o.id = id;
            o.logStreamArn = logStreamArn;
            o.roleArn = roleArn;
            return o;
        }
    }
}
