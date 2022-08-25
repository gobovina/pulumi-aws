// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateMetadataOption {
    private String httpEndpoint;
    private String httpProtocolIpv6;
    private Integer httpPutResponseHopLimit;
    private String httpTokens;
    private String instanceMetadataTags;

    private GetLaunchTemplateMetadataOption() {}
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    public String httpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }
    public Integer httpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }
    public String httpTokens() {
        return this.httpTokens;
    }
    public String instanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateMetadataOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String httpEndpoint;
        private String httpProtocolIpv6;
        private Integer httpPutResponseHopLimit;
        private String httpTokens;
        private String instanceMetadataTags;
        public Builder() {}
        public Builder(GetLaunchTemplateMetadataOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpProtocolIpv6 = defaults.httpProtocolIpv6;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
    	      this.instanceMetadataTags = defaults.instanceMetadataTags;
        }

        @CustomType.Setter
        public Builder httpEndpoint(String httpEndpoint) {
            this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder httpProtocolIpv6(String httpProtocolIpv6) {
            this.httpProtocolIpv6 = Objects.requireNonNull(httpProtocolIpv6);
            return this;
        }
        @CustomType.Setter
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Objects.requireNonNull(httpPutResponseHopLimit);
            return this;
        }
        @CustomType.Setter
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = Objects.requireNonNull(httpTokens);
            return this;
        }
        @CustomType.Setter
        public Builder instanceMetadataTags(String instanceMetadataTags) {
            this.instanceMetadataTags = Objects.requireNonNull(instanceMetadataTags);
            return this;
        }
        public GetLaunchTemplateMetadataOption build() {
            final var o = new GetLaunchTemplateMetadataOption();
            o.httpEndpoint = httpEndpoint;
            o.httpProtocolIpv6 = httpProtocolIpv6;
            o.httpPutResponseHopLimit = httpPutResponseHopLimit;
            o.httpTokens = httpTokens;
            o.instanceMetadataTags = instanceMetadataTags;
            return o;
        }
    }
}
