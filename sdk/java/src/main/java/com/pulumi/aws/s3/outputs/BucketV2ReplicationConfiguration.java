// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketV2ReplicationConfigurationRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketV2ReplicationConfiguration {
    /**
     * @return The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    private String role;
    /**
     * @return Specifies the rules managing the replication (documented below).
     * 
     */
    private List<BucketV2ReplicationConfigurationRule> rules;

    private BucketV2ReplicationConfiguration() {}
    /**
     * @return The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return Specifies the rules managing the replication (documented below).
     * 
     */
    public List<BucketV2ReplicationConfigurationRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2ReplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String role;
        private List<BucketV2ReplicationConfigurationRule> rules;
        public Builder() {}
        public Builder(BucketV2ReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<BucketV2ReplicationConfigurationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(BucketV2ReplicationConfigurationRule... rules) {
            return rules(List.of(rules));
        }
        public BucketV2ReplicationConfiguration build() {
            final var o = new BucketV2ReplicationConfiguration();
            o.role = role;
            o.rules = rules;
            return o;
        }
    }
}
