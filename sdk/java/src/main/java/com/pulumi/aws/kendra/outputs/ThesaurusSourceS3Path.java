// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ThesaurusSourceS3Path {
    /**
     * @return The name of the S3 bucket that contains the file.
     * 
     */
    private String bucket;
    /**
     * @return The name of the file.
     * 
     */
    private String key;

    private ThesaurusSourceS3Path() {}
    /**
     * @return The name of the S3 bucket that contains the file.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return The name of the file.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThesaurusSourceS3Path defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String key;
        public Builder() {}
        public Builder(ThesaurusSourceS3Path defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public ThesaurusSourceS3Path build() {
            final var o = new ThesaurusSourceS3Path();
            o.bucket = bucket;
            o.key = key;
            return o;
        }
    }
}
