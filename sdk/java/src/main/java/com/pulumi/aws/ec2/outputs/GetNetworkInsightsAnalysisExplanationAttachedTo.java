// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisExplanationAttachedTo {
    /**
     * @return The ARN of the selected Network Insights Analysis.
     * 
     */
    private String arn;
    private String id;
    /**
     * @return The name of the filter field. Valid values can be found in the EC2 [`DescribeNetworkInsightsAnalyses`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInsightsAnalyses.html) API Reference.
     * 
     */
    private String name;

    private GetNetworkInsightsAnalysisExplanationAttachedTo() {}
    /**
     * @return The ARN of the selected Network Insights Analysis.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the filter field. Valid values can be found in the EC2 [`DescribeNetworkInsightsAnalyses`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInsightsAnalyses.html) API Reference.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisExplanationAttachedTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisExplanationAttachedTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetNetworkInsightsAnalysisExplanationAttachedTo build() {
            final var o = new GetNetworkInsightsAnalysisExplanationAttachedTo();
            o.arn = arn;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
