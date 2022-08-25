// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyCorsConfig {
    /**
     * @return A Boolean value that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP response header.
     * 
     */
    private Boolean accessControlAllowCredentials;
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the Access-Control-Allow-Headers HTTP response header.
     * 
     */
    private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders;
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods;
    /**
     * @return Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the Access-Control-Allow-Origin HTTP response header.
     * 
     */
    private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins;
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers HTTP response header.
     * 
     */
    private List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders;
    /**
     * @return A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    private Integer accessControlMaxAgeSec;
    private Boolean originOverride;

    private GetResponseHeadersPolicyCorsConfig() {}
    /**
     * @return A Boolean value that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP response header.
     * 
     */
    public Boolean accessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the Access-Control-Allow-Headers HTTP response header.
     * 
     */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }
    /**
     * @return Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the Access-Control-Allow-Origin HTTP response header.
     * 
     */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }
    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers HTTP response header.
     * 
     */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders() {
        return this.accessControlExposeHeaders;
    }
    /**
     * @return A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    public Integer accessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }
    public Boolean originOverride() {
        return this.originOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCorsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean accessControlAllowCredentials;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders;
        private Integer accessControlMaxAgeSec;
        private Boolean originOverride;
        public Builder() {}
        public Builder(GetResponseHeadersPolicyCorsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        @CustomType.Setter
        public Builder accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }
        @CustomType.Setter
        public Builder accessControlAllowHeaders(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }
        public Builder accessControlAllowHeaders(GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader... accessControlAllowHeaders) {
            return accessControlAllowHeaders(List.of(accessControlAllowHeaders));
        }
        @CustomType.Setter
        public Builder accessControlAllowMethods(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }
        public Builder accessControlAllowMethods(GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod... accessControlAllowMethods) {
            return accessControlAllowMethods(List.of(accessControlAllowMethods));
        }
        @CustomType.Setter
        public Builder accessControlAllowOrigins(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }
        public Builder accessControlAllowOrigins(GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin... accessControlAllowOrigins) {
            return accessControlAllowOrigins(List.of(accessControlAllowOrigins));
        }
        @CustomType.Setter
        public Builder accessControlExposeHeaders(List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders) {
            this.accessControlExposeHeaders = Objects.requireNonNull(accessControlExposeHeaders);
            return this;
        }
        public Builder accessControlExposeHeaders(GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader... accessControlExposeHeaders) {
            return accessControlExposeHeaders(List.of(accessControlExposeHeaders));
        }
        @CustomType.Setter
        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }
        @CustomType.Setter
        public Builder originOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }
        public GetResponseHeadersPolicyCorsConfig build() {
            final var o = new GetResponseHeadersPolicyCorsConfig();
            o.accessControlAllowCredentials = accessControlAllowCredentials;
            o.accessControlAllowHeaders = accessControlAllowHeaders;
            o.accessControlAllowMethods = accessControlAllowMethods;
            o.accessControlAllowOrigins = accessControlAllowOrigins;
            o.accessControlExposeHeaders = accessControlExposeHeaders;
            o.accessControlMaxAgeSec = accessControlMaxAgeSec;
            o.originOverride = originOverride;
            return o;
        }
    }
}
