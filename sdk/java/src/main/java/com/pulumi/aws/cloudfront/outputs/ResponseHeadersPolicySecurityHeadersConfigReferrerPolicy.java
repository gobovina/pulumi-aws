// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy {
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private Boolean override;
    /**
     * @return The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    private String referrerPolicy;

    private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy() {}
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }
    /**
     * @return The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    public String referrerPolicy() {
        return this.referrerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean override;
        private String referrerPolicy;
        public Builder() {}
        public Builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        @CustomType.Setter
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        @CustomType.Setter
        public Builder referrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy build() {
            final var o = new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy();
            o.override = override;
            o.referrerPolicy = referrerPolicy;
            return o;
        }
    }
}
