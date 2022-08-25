// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEndpointClientConnectOption {
    private Boolean enabled;
    private String lambdaFunctionArn;

    private GetEndpointClientConnectOption() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public String lambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointClientConnectOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String lambdaFunctionArn;
        public Builder() {}
        public Builder(GetEndpointClientConnectOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lambdaFunctionArn = defaults.lambdaFunctionArn;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder lambdaFunctionArn(String lambdaFunctionArn) {
            this.lambdaFunctionArn = Objects.requireNonNull(lambdaFunctionArn);
            return this;
        }
        public GetEndpointClientConnectOption build() {
            final var o = new GetEndpointClientConnectOption();
            o.enabled = enabled;
            o.lambdaFunctionArn = lambdaFunctionArn;
            return o;
        }
    }
}
