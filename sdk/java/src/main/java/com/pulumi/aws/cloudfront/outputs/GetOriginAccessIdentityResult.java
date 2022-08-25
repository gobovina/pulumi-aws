// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOriginAccessIdentityResult {
    /**
     * @return Internal value used by CloudFront to allow future
     * updates to the origin access identity.
     * 
     */
    private String callerReference;
    /**
     * @return A shortcut to the full path for the
     * origin access identity to use in CloudFront, see below.
     * 
     */
    private String cloudfrontAccessIdentityPath;
    /**
     * @return An optional comment for the origin access identity.
     * 
     */
    private String comment;
    /**
     * @return The current version of the origin access identity&#39;s information.
     * For example: `E2QWRUHAPOMQZL`.
     * 
     */
    private String etag;
    /**
     * @return A pre-generated ARN for use in S3 bucket policies (see below).
     * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
     * E2QWRUHAPOMQZL`.
     * 
     */
    private String iamArn;
    private String id;
    /**
     * @return The Amazon S3 canonical user ID for the origin
     * access identity, which you use when giving the origin access identity read
     * permission to an object in Amazon S3.
     * 
     */
    private String s3CanonicalUserId;

    private GetOriginAccessIdentityResult() {}
    /**
     * @return Internal value used by CloudFront to allow future
     * updates to the origin access identity.
     * 
     */
    public String callerReference() {
        return this.callerReference;
    }
    /**
     * @return A shortcut to the full path for the
     * origin access identity to use in CloudFront, see below.
     * 
     */
    public String cloudfrontAccessIdentityPath() {
        return this.cloudfrontAccessIdentityPath;
    }
    /**
     * @return An optional comment for the origin access identity.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The current version of the origin access identity&#39;s information.
     * For example: `E2QWRUHAPOMQZL`.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A pre-generated ARN for use in S3 bucket policies (see below).
     * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
     * E2QWRUHAPOMQZL`.
     * 
     */
    public String iamArn() {
        return this.iamArn;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The Amazon S3 canonical user ID for the origin
     * access identity, which you use when giving the origin access identity read
     * permission to an object in Amazon S3.
     * 
     */
    public String s3CanonicalUserId() {
        return this.s3CanonicalUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginAccessIdentityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String callerReference;
        private String cloudfrontAccessIdentityPath;
        private String comment;
        private String etag;
        private String iamArn;
        private String id;
        private String s3CanonicalUserId;
        public Builder() {}
        public Builder(GetOriginAccessIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.cloudfrontAccessIdentityPath = defaults.cloudfrontAccessIdentityPath;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.iamArn = defaults.iamArn;
    	      this.id = defaults.id;
    	      this.s3CanonicalUserId = defaults.s3CanonicalUserId;
        }

        @CustomType.Setter
        public Builder callerReference(String callerReference) {
            this.callerReference = Objects.requireNonNull(callerReference);
            return this;
        }
        @CustomType.Setter
        public Builder cloudfrontAccessIdentityPath(String cloudfrontAccessIdentityPath) {
            this.cloudfrontAccessIdentityPath = Objects.requireNonNull(cloudfrontAccessIdentityPath);
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder iamArn(String iamArn) {
            this.iamArn = Objects.requireNonNull(iamArn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder s3CanonicalUserId(String s3CanonicalUserId) {
            this.s3CanonicalUserId = Objects.requireNonNull(s3CanonicalUserId);
            return this;
        }
        public GetOriginAccessIdentityResult build() {
            final var o = new GetOriginAccessIdentityResult();
            o.callerReference = callerReference;
            o.cloudfrontAccessIdentityPath = cloudfrontAccessIdentityPath;
            o.comment = comment;
            o.etag = etag;
            o.iamArn = iamArn;
            o.id = id;
            o.s3CanonicalUserId = s3CanonicalUserId;
            return o;
        }
    }
}
