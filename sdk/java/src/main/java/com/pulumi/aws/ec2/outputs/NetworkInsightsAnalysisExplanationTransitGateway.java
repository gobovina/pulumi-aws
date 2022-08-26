// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisExplanationTransitGateway {
    /**
     * @return ARN of the Network Insights Analysis.
     * 
     */
    private @Nullable String arn;
    /**
     * @return ID of the Network Insights Analysis.
     * 
     */
    private @Nullable String id;
    private @Nullable String name;

    private NetworkInsightsAnalysisExplanationTransitGateway() {}
    /**
     * @return ARN of the Network Insights Analysis.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return ID of the Network Insights Analysis.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisExplanationTransitGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(NetworkInsightsAnalysisExplanationTransitGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public NetworkInsightsAnalysisExplanationTransitGateway build() {
            final var o = new NetworkInsightsAnalysisExplanationTransitGateway();
            o.arn = arn;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
