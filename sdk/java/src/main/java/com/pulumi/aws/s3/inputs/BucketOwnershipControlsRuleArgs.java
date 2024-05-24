// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BucketOwnershipControlsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsRuleArgs Empty = new BucketOwnershipControlsRuleArgs();

    /**
     * Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
     * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
     * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
     * 
     */
    @Import(name="objectOwnership", required=true)
    private Output<String> objectOwnership;

    /**
     * @return Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
     * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
     * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
     * 
     */
    public Output<String> objectOwnership() {
        return this.objectOwnership;
    }

    private BucketOwnershipControlsRuleArgs() {}

    private BucketOwnershipControlsRuleArgs(BucketOwnershipControlsRuleArgs $) {
        this.objectOwnership = $.objectOwnership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketOwnershipControlsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketOwnershipControlsRuleArgs $;

        public Builder() {
            $ = new BucketOwnershipControlsRuleArgs();
        }

        public Builder(BucketOwnershipControlsRuleArgs defaults) {
            $ = new BucketOwnershipControlsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectOwnership Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
         * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
         * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
         * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder objectOwnership(Output<String> objectOwnership) {
            $.objectOwnership = objectOwnership;
            return this;
        }

        /**
         * @param objectOwnership Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
         * * `BucketOwnerPreferred` - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the `bucket-owner-full-control` canned ACL.
         * * `ObjectWriter` - Uploading account will own the object if the object is uploaded with the `bucket-owner-full-control` canned ACL.
         * * `BucketOwnerEnforced` - Bucket owner automatically owns and has full control over every object in the bucket. ACLs no longer affect permissions to data in the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder objectOwnership(String objectOwnership) {
            return objectOwnership(Output.of(objectOwnership));
        }

        public BucketOwnershipControlsRuleArgs build() {
            if ($.objectOwnership == null) {
                throw new MissingRequiredPropertyException("BucketOwnershipControlsRuleArgs", "objectOwnership");
            }
            return $;
        }
    }

}
