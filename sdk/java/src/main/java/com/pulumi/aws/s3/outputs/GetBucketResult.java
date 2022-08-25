// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBucketResult {
    /**
     * @return The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    private String arn;
    private String bucket;
    /**
     * @return The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    private String bucketDomainName;
    /**
     * @return The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    private String bucketRegionalDomainName;
    /**
     * @return The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    private String hostedZoneId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The AWS region this bucket resides in.
     * 
     */
    private String region;
    /**
     * @return The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    private String websiteDomain;
    /**
     * @return The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    private String websiteEndpoint;

    private GetBucketResult() {}
    /**
     * @return The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    public String bucketDomainName() {
        return this.bucketDomainName;
    }
    /**
     * @return The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    public String bucketRegionalDomainName() {
        return this.bucketRegionalDomainName;
    }
    /**
     * @return The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    public String hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The AWS region this bucket resides in.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    public String websiteDomain() {
        return this.websiteDomain;
    }
    /**
     * @return The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    public String websiteEndpoint() {
        return this.websiteEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String bucket;
        private String bucketDomainName;
        private String bucketRegionalDomainName;
        private String hostedZoneId;
        private String id;
        private String region;
        private String websiteDomain;
        private String websiteEndpoint;
        public Builder() {}
        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bucket = defaults.bucket;
    	      this.bucketDomainName = defaults.bucketDomainName;
    	      this.bucketRegionalDomainName = defaults.bucketRegionalDomainName;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.websiteDomain = defaults.websiteDomain;
    	      this.websiteEndpoint = defaults.websiteEndpoint;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder bucketDomainName(String bucketDomainName) {
            this.bucketDomainName = Objects.requireNonNull(bucketDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder bucketRegionalDomainName(String bucketRegionalDomainName) {
            this.bucketRegionalDomainName = Objects.requireNonNull(bucketRegionalDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder websiteDomain(String websiteDomain) {
            this.websiteDomain = Objects.requireNonNull(websiteDomain);
            return this;
        }
        @CustomType.Setter
        public Builder websiteEndpoint(String websiteEndpoint) {
            this.websiteEndpoint = Objects.requireNonNull(websiteEndpoint);
            return this;
        }
        public GetBucketResult build() {
            final var o = new GetBucketResult();
            o.arn = arn;
            o.bucket = bucket;
            o.bucketDomainName = bucketDomainName;
            o.bucketRegionalDomainName = bucketRegionalDomainName;
            o.hostedZoneId = hostedZoneId;
            o.id = id;
            o.region = region;
            o.websiteDomain = websiteDomain;
            o.websiteEndpoint = websiteEndpoint;
            return o;
        }
    }
}
