// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OrganizationConfigurationDatasourcesS3Logs {
    /**
     * @return Set to `true` if you want S3 data event logs to be automatically enabled for new members of the organization. Default: `false`
     * 
     */
    private Boolean autoEnable;

    private OrganizationConfigurationDatasourcesS3Logs() {}
    /**
     * @return Set to `true` if you want S3 data event logs to be automatically enabled for new members of the organization. Default: `false`
     * 
     */
    public Boolean autoEnable() {
        return this.autoEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasourcesS3Logs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoEnable;
        public Builder() {}
        public Builder(OrganizationConfigurationDatasourcesS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
        }

        @CustomType.Setter
        public Builder autoEnable(Boolean autoEnable) {
            this.autoEnable = Objects.requireNonNull(autoEnable);
            return this;
        }
        public OrganizationConfigurationDatasourcesS3Logs build() {
            final var o = new OrganizationConfigurationDatasourcesS3Logs();
            o.autoEnable = autoEnable;
            return o;
        }
    }
}
