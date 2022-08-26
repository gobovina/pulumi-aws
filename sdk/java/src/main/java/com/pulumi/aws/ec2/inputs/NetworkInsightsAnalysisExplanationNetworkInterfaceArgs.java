// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisExplanationNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisExplanationNetworkInterfaceArgs Empty = new NetworkInsightsAnalysisExplanationNetworkInterfaceArgs();

    /**
     * ARN of the Network Insights Analysis.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the Network Insights Analysis.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ID of the Network Insights Analysis.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the Network Insights Analysis.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NetworkInsightsAnalysisExplanationNetworkInterfaceArgs() {}

    private NetworkInsightsAnalysisExplanationNetworkInterfaceArgs(NetworkInsightsAnalysisExplanationNetworkInterfaceArgs $) {
        this.arn = $.arn;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAnalysisExplanationNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAnalysisExplanationNetworkInterfaceArgs $;

        public Builder() {
            $ = new NetworkInsightsAnalysisExplanationNetworkInterfaceArgs();
        }

        public Builder(NetworkInsightsAnalysisExplanationNetworkInterfaceArgs defaults) {
            $ = new NetworkInsightsAnalysisExplanationNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the Network Insights Analysis.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the Network Insights Analysis.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param id ID of the Network Insights Analysis.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Network Insights Analysis.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NetworkInsightsAnalysisExplanationNetworkInterfaceArgs build() {
            return $;
        }
    }

}
