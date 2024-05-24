// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securitylake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomLogSourceConfigurationCrawlerConfiguration {
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be used by the AWS Glue crawler.
     * 
     */
    private String roleArn;

    private CustomLogSourceConfigurationCrawlerConfiguration() {}
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be used by the AWS Glue crawler.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLogSourceConfigurationCrawlerConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String roleArn;
        public Builder() {}
        public Builder(CustomLogSourceConfigurationCrawlerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            if (roleArn == null) {
              throw new MissingRequiredPropertyException("CustomLogSourceConfigurationCrawlerConfiguration", "roleArn");
            }
            this.roleArn = roleArn;
            return this;
        }
        public CustomLogSourceConfigurationCrawlerConfiguration build() {
            final var _resultValue = new CustomLogSourceConfigurationCrawlerConfiguration();
            _resultValue.roleArn = roleArn;
            return _resultValue;
        }
    }
}
