// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirehoseDeliveryStreamKinesisSourceConfiguration {
    /**
     * @return The kinesis stream used as the source of the firehose delivery stream.
     * 
     */
    private String kinesisStreamArn;
    /**
     * @return The ARN of the role that provides access to the source Kinesis stream.
     * 
     */
    private String roleArn;

    private FirehoseDeliveryStreamKinesisSourceConfiguration() {}
    /**
     * @return The kinesis stream used as the source of the firehose delivery stream.
     * 
     */
    public String kinesisStreamArn() {
        return this.kinesisStreamArn;
    }
    /**
     * @return The ARN of the role that provides access to the source Kinesis stream.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamKinesisSourceConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kinesisStreamArn;
        private String roleArn;
        public Builder() {}
        public Builder(FirehoseDeliveryStreamKinesisSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamArn = defaults.kinesisStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder kinesisStreamArn(String kinesisStreamArn) {
            this.kinesisStreamArn = Objects.requireNonNull(kinesisStreamArn);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public FirehoseDeliveryStreamKinesisSourceConfiguration build() {
            final var o = new FirehoseDeliveryStreamKinesisSourceConfiguration();
            o.kinesisStreamArn = kinesisStreamArn;
            o.roleArn = roleArn;
            return o;
        }
    }
}
