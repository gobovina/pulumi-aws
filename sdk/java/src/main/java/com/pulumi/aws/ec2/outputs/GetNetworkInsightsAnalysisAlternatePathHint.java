// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisAlternatePathHint {
    private String componentArn;
    private String componentId;

    private GetNetworkInsightsAnalysisAlternatePathHint() {}
    public String componentArn() {
        return this.componentArn;
    }
    public String componentId() {
        return this.componentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisAlternatePathHint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String componentArn;
        private String componentId;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisAlternatePathHint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.componentId = defaults.componentId;
        }

        @CustomType.Setter
        public Builder componentArn(String componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }
        @CustomType.Setter
        public Builder componentId(String componentId) {
            this.componentId = Objects.requireNonNull(componentId);
            return this;
        }
        public GetNetworkInsightsAnalysisAlternatePathHint build() {
            final var o = new GetNetworkInsightsAnalysisAlternatePathHint();
            o.componentArn = componentArn;
            o.componentId = componentId;
            return o;
        }
    }
}
