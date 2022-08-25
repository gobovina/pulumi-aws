// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplatePrivateDnsNameOption {
    private Boolean enableResourceNameDnsARecord;
    private Boolean enableResourceNameDnsAaaaRecord;
    private String hostnameType;

    private GetLaunchTemplatePrivateDnsNameOption() {}
    public Boolean enableResourceNameDnsARecord() {
        return this.enableResourceNameDnsARecord;
    }
    public Boolean enableResourceNameDnsAaaaRecord() {
        return this.enableResourceNameDnsAaaaRecord;
    }
    public String hostnameType() {
        return this.hostnameType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplatePrivateDnsNameOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableResourceNameDnsARecord;
        private Boolean enableResourceNameDnsAaaaRecord;
        private String hostnameType;
        public Builder() {}
        public Builder(GetLaunchTemplatePrivateDnsNameOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableResourceNameDnsARecord = defaults.enableResourceNameDnsARecord;
    	      this.enableResourceNameDnsAaaaRecord = defaults.enableResourceNameDnsAaaaRecord;
    	      this.hostnameType = defaults.hostnameType;
        }

        @CustomType.Setter
        public Builder enableResourceNameDnsARecord(Boolean enableResourceNameDnsARecord) {
            this.enableResourceNameDnsARecord = Objects.requireNonNull(enableResourceNameDnsARecord);
            return this;
        }
        @CustomType.Setter
        public Builder enableResourceNameDnsAaaaRecord(Boolean enableResourceNameDnsAaaaRecord) {
            this.enableResourceNameDnsAaaaRecord = Objects.requireNonNull(enableResourceNameDnsAaaaRecord);
            return this;
        }
        @CustomType.Setter
        public Builder hostnameType(String hostnameType) {
            this.hostnameType = Objects.requireNonNull(hostnameType);
            return this;
        }
        public GetLaunchTemplatePrivateDnsNameOption build() {
            final var o = new GetLaunchTemplatePrivateDnsNameOption();
            o.enableResourceNameDnsARecord = enableResourceNameDnsARecord;
            o.enableResourceNameDnsAaaaRecord = enableResourceNameDnsAaaaRecord;
            o.hostnameType = hostnameType;
            return o;
        }
    }
}
