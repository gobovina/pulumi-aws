// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload {
    /**
     * @return Number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    private Integer daysAfterInitiation;

    private BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload() {}
    /**
     * @return Number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    public Integer daysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer daysAfterInitiation;
        public Builder() {}
        public Builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        @CustomType.Setter
        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            if (daysAfterInitiation == null) {
              throw new MissingRequiredPropertyException("BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload", "daysAfterInitiation");
            }
            this.daysAfterInitiation = daysAfterInitiation;
            return this;
        }
        public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload build() {
            final var _resultValue = new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload();
            _resultValue.daysAfterInitiation = daysAfterInitiation;
            return _resultValue;
        }
    }
}
