// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketV2ServerSideEncryptionConfigurationRule {
    /**
     * @return A single object for setting server-side encryption by default. (documented below)
     * 
     */
    private List<BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault> applyServerSideEncryptionByDefaults;
    /**
     * @return Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    private @Nullable Boolean bucketKeyEnabled;

    private BucketV2ServerSideEncryptionConfigurationRule() {}
    /**
     * @return A single object for setting server-side encryption by default. (documented below)
     * 
     */
    public List<BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault> applyServerSideEncryptionByDefaults() {
        return this.applyServerSideEncryptionByDefaults;
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

    public static Builder builder(BucketV2ServerSideEncryptionConfigurationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault> applyServerSideEncryptionByDefaults;
        private @Nullable Boolean bucketKeyEnabled;
        public Builder() {}
        public Builder(BucketV2ServerSideEncryptionConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyServerSideEncryptionByDefaults = defaults.applyServerSideEncryptionByDefaults;
    	      this.bucketKeyEnabled = defaults.bucketKeyEnabled;
        }

        @CustomType.Setter
        public Builder applyServerSideEncryptionByDefaults(List<BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault> applyServerSideEncryptionByDefaults) {
            this.applyServerSideEncryptionByDefaults = Objects.requireNonNull(applyServerSideEncryptionByDefaults);
            return this;
        }
        public Builder applyServerSideEncryptionByDefaults(BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault... applyServerSideEncryptionByDefaults) {
            return applyServerSideEncryptionByDefaults(List.of(applyServerSideEncryptionByDefaults));
        }
        @CustomType.Setter
        public Builder bucketKeyEnabled(@Nullable Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }
        public BucketV2ServerSideEncryptionConfigurationRule build() {
            final var o = new BucketV2ServerSideEncryptionConfigurationRule();
            o.applyServerSideEncryptionByDefaults = applyServerSideEncryptionByDefaults;
            o.bucketKeyEnabled = bucketKeyEnabled;
            return o;
        }
    }
}
