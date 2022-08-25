// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAcceleratorAttribute {
    private Boolean flowLogsEnabled;
    private String flowLogsS3Bucket;
    private String flowLogsS3Prefix;

    private GetAcceleratorAttribute() {}
    public Boolean flowLogsEnabled() {
        return this.flowLogsEnabled;
    }
    public String flowLogsS3Bucket() {
        return this.flowLogsS3Bucket;
    }
    public String flowLogsS3Prefix() {
        return this.flowLogsS3Prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean flowLogsEnabled;
        private String flowLogsS3Bucket;
        private String flowLogsS3Prefix;
        public Builder() {}
        public Builder(GetAcceleratorAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowLogsEnabled = defaults.flowLogsEnabled;
    	      this.flowLogsS3Bucket = defaults.flowLogsS3Bucket;
    	      this.flowLogsS3Prefix = defaults.flowLogsS3Prefix;
        }

        @CustomType.Setter
        public Builder flowLogsEnabled(Boolean flowLogsEnabled) {
            this.flowLogsEnabled = Objects.requireNonNull(flowLogsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder flowLogsS3Bucket(String flowLogsS3Bucket) {
            this.flowLogsS3Bucket = Objects.requireNonNull(flowLogsS3Bucket);
            return this;
        }
        @CustomType.Setter
        public Builder flowLogsS3Prefix(String flowLogsS3Prefix) {
            this.flowLogsS3Prefix = Objects.requireNonNull(flowLogsS3Prefix);
            return this;
        }
        public GetAcceleratorAttribute build() {
            final var o = new GetAcceleratorAttribute();
            o.flowLogsEnabled = flowLogsEnabled;
            o.flowLogsS3Bucket = flowLogsS3Bucket;
            o.flowLogsS3Prefix = flowLogsS3Prefix;
            return o;
        }
    }
}
