// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationInputsKinesisStream {
    /**
     * @return The ARN of the Kinesis Stream.
     * 
     */
    private String resourceArn;
    /**
     * @return The ARN of the IAM Role used to access the stream.
     * 
     */
    private String roleArn;

    private AnalyticsApplicationInputsKinesisStream() {}
    /**
     * @return The ARN of the Kinesis Stream.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }
    /**
     * @return The ARN of the IAM Role used to access the stream.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsKinesisStream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceArn;
        private String roleArn;
        public Builder() {}
        public Builder(AnalyticsApplicationInputsKinesisStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AnalyticsApplicationInputsKinesisStream build() {
            final var o = new AnalyticsApplicationInputsKinesisStream();
            o.resourceArn = resourceArn;
            o.roleArn = roleArn;
            return o;
        }
    }
}
