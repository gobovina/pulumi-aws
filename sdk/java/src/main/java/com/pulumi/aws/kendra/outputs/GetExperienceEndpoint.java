// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExperienceEndpoint {
    /**
     * @return The endpoint of your Amazon Kendra Experience.
     * 
     */
    private String endpoint;
    /**
     * @return The type of endpoint for your Amazon Kendra Experience.
     * 
     */
    private String endpointType;

    private GetExperienceEndpoint() {}
    /**
     * @return The endpoint of your Amazon Kendra Experience.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The type of endpoint for your Amazon Kendra Experience.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperienceEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private String endpointType;
        public Builder() {}
        public Builder(GetExperienceEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.endpointType = defaults.endpointType;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public GetExperienceEndpoint build() {
            final var o = new GetExperienceEndpoint();
            o.endpoint = endpoint;
            o.endpointType = endpointType;
            return o;
        }
    }
}
