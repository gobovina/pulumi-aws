// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketOwnershipControlsRule {
    /**
     * @return Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
     * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
     * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
     * 
     */
    private String objectOwnership;

    private BucketOwnershipControlsRule() {}
    /**
     * @return Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
     * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
     * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
     * 
     */
    public String objectOwnership() {
        return this.objectOwnership;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String objectOwnership;
        public Builder() {}
        public Builder(BucketOwnershipControlsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        @CustomType.Setter
        public Builder objectOwnership(String objectOwnership) {
            if (objectOwnership == null) {
              throw new MissingRequiredPropertyException("BucketOwnershipControlsRule", "objectOwnership");
            }
            this.objectOwnership = objectOwnership;
            return this;
        }
        public BucketOwnershipControlsRule build() {
            final var _resultValue = new BucketOwnershipControlsRule();
            _resultValue.objectOwnership = objectOwnership;
            return _resultValue;
        }
    }
}
