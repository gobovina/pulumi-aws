// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisForwardPathComponentAttachedTo {
    /**
     * @return ARN of the selected Network Insights Analysis.
     * 
     */
    private String arn;
    private String id;
    /**
     * @return Name of the filter field. Valid values can be found in the EC2 [`DescribeNetworkInsightsAnalyses`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInsightsAnalyses.html) API Reference.
     * 
     */
    private String name;

    private GetNetworkInsightsAnalysisForwardPathComponentAttachedTo() {}
    /**
     * @return ARN of the selected Network Insights Analysis.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the filter field. Valid values can be found in the EC2 [`DescribeNetworkInsightsAnalyses`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInsightsAnalyses.html) API Reference.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisForwardPathComponentAttachedTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisForwardPathComponentAttachedTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentAttachedTo", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentAttachedTo", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworkInsightsAnalysisForwardPathComponentAttachedTo", "name");
            }
            this.name = name;
            return this;
        }
        public GetNetworkInsightsAnalysisForwardPathComponentAttachedTo build() {
            final var _resultValue = new GetNetworkInsightsAnalysisForwardPathComponentAttachedTo();
            _resultValue.arn = arn;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
