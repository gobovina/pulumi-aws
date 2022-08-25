// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionCustomErrorResponse {
    /**
     * @return The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    private @Nullable Integer errorCachingMinTtl;
    /**
     * @return The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    private Integer errorCode;
    /**
     * @return The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    private @Nullable Integer responseCode;
    /**
     * @return The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    private @Nullable String responsePagePath;

    private DistributionCustomErrorResponse() {}
    /**
     * @return The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    public Optional<Integer> errorCachingMinTtl() {
        return Optional.ofNullable(this.errorCachingMinTtl);
    }
    /**
     * @return The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    public Integer errorCode() {
        return this.errorCode;
    }
    /**
     * @return The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    public Optional<Integer> responseCode() {
        return Optional.ofNullable(this.responseCode);
    }
    /**
     * @return The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    public Optional<String> responsePagePath() {
        return Optional.ofNullable(this.responsePagePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomErrorResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer errorCachingMinTtl;
        private Integer errorCode;
        private @Nullable Integer responseCode;
        private @Nullable String responsePagePath;
        public Builder() {}
        public Builder(DistributionCustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCachingMinTtl = defaults.errorCachingMinTtl;
    	      this.errorCode = defaults.errorCode;
    	      this.responseCode = defaults.responseCode;
    	      this.responsePagePath = defaults.responsePagePath;
        }

        @CustomType.Setter
        public Builder errorCachingMinTtl(@Nullable Integer errorCachingMinTtl) {
            this.errorCachingMinTtl = errorCachingMinTtl;
            return this;
        }
        @CustomType.Setter
        public Builder errorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        @CustomType.Setter
        public Builder responseCode(@Nullable Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        @CustomType.Setter
        public Builder responsePagePath(@Nullable String responsePagePath) {
            this.responsePagePath = responsePagePath;
            return this;
        }
        public DistributionCustomErrorResponse build() {
            final var o = new DistributionCustomErrorResponse();
            o.errorCachingMinTtl = errorCachingMinTtl;
            o.errorCode = errorCode;
            o.responseCode = responseCode;
            o.responsePagePath = responsePagePath;
            return o;
        }
    }
}
