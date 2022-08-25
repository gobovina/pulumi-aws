// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketServerSideEncryptionConfigurationRule {
    /**
     * @return A single object for setting server-side encryption by default. (documented below)
     * 
     */
    private BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;
    /**
     * @return Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    private @Nullable Boolean bucketKeyEnabled;

    private BucketServerSideEncryptionConfigurationRule() {}
    /**
     * @return A single object for setting server-side encryption by default. (documented below)
     * 
     */
    public BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }
    /**
     * @return Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    public Optional<Boolean> bucketKeyEnabled() {
        return Optional.ofNullable(this.bucketKeyEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionConfigurationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;
        private @Nullable Boolean bucketKeyEnabled;
        public Builder() {}
        public Builder(BucketServerSideEncryptionConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyServerSideEncryptionByDefault = defaults.applyServerSideEncryptionByDefault;
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
        }

        @CustomType.Setter
        public Builder applyServerSideEncryptionByDefault(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = Objects.requireNonNull(applyServerSideEncryptionByDefault);
            return this;
        }
        @CustomType.Setter
        public Builder bucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }
        public BucketServerSideEncryptionConfigurationRule build() {
            final var o = new BucketServerSideEncryptionConfigurationRule();
            o.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            o.bucketKeyEnabled = bucketKeyEnabled;
            return o;
        }
    }
}
