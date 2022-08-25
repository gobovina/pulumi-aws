// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketServerSideEncryptionConfigurationRule;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BucketServerSideEncryptionConfiguration {
    /**
     * @return A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    private BucketServerSideEncryptionConfigurationRule rule;

    private BucketServerSideEncryptionConfiguration() {}
    /**
     * @return A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    public BucketServerSideEncryptionConfigurationRule rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BucketServerSideEncryptionConfigurationRule rule;
        public Builder() {}
        public Builder(BucketServerSideEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        @CustomType.Setter
        public Builder rule(BucketServerSideEncryptionConfigurationRule rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public BucketServerSideEncryptionConfiguration build() {
            final var o = new BucketServerSideEncryptionConfiguration();
            o.rule = rule;
            return o;
        }
    }
}
