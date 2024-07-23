// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketReplicationConfigurationRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfiguration {
    /**
     * @return The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    private String role;
    /**
     * @return Specifies the rules managing the replication (documented below).
     * 
     */
    private List<BucketReplicationConfigurationRule> rules;

    private BucketReplicationConfiguration() {}
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
    public List<BucketReplicationConfigurationRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String role;
        private List<BucketReplicationConfigurationRule> rules;
        public Builder() {}
        public Builder(BucketReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("BucketReplicationConfiguration", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<BucketReplicationConfigurationRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("BucketReplicationConfiguration", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(BucketReplicationConfigurationRule... rules) {
            return rules(List.of(rules));
        }
        public BucketReplicationConfiguration build() {
            final var _resultValue = new BucketReplicationConfiguration();
            _resultValue.role = role;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
