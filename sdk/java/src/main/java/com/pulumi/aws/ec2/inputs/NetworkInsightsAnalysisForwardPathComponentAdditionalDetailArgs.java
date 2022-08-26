// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs Empty = new NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs();

    @Import(name="additionalDetailType")
    private @Nullable Output<String> additionalDetailType;

    public Optional<Output<String>> additionalDetailType() {
        return Optional.ofNullable(this.additionalDetailType);
    }

    @Import(name="components")
    private @Nullable Output<List<NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs>> components;

    public Optional<Output<List<NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs>>> components() {
        return Optional.ofNullable(this.components);
    }

    private NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs() {}

    private NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs(NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs $) {
        this.additionalDetailType = $.additionalDetailType;
        this.components = $.components;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs $;

        public Builder() {
            $ = new NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs();
        }

        public Builder(NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs defaults) {
            $ = new NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalDetailType(@Nullable Output<String> additionalDetailType) {
            $.additionalDetailType = additionalDetailType;
            return this;
        }

        public Builder additionalDetailType(String additionalDetailType) {
            return additionalDetailType(Output.of(additionalDetailType));
        }

        public Builder components(@Nullable Output<List<NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs>> components) {
            $.components = components;
            return this;
        }

        public Builder components(List<NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs> components) {
            return components(Output.of(components));
        }

        public Builder components(NetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponentArgs... components) {
            return components(List.of(components));
        }

        public NetworkInsightsAnalysisForwardPathComponentAdditionalDetailArgs build() {
            return $;
        }
    }

}
