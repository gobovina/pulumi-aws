// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualNodeSpecLoggingAccessLogFileFormatJson;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNodeSpecLoggingAccessLogFileFormat {
    private List<GetVirtualNodeSpecLoggingAccessLogFileFormatJson> jsons;
    private String text;

    private GetVirtualNodeSpecLoggingAccessLogFileFormat() {}
    public List<GetVirtualNodeSpecLoggingAccessLogFileFormatJson> jsons() {
        return this.jsons;
    }
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNodeSpecLoggingAccessLogFileFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualNodeSpecLoggingAccessLogFileFormatJson> jsons;
        private String text;
        public Builder() {}
        public Builder(GetVirtualNodeSpecLoggingAccessLogFileFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsons = defaults.jsons;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder jsons(List<GetVirtualNodeSpecLoggingAccessLogFileFormatJson> jsons) {
            this.jsons = Objects.requireNonNull(jsons);
            return this;
        }
        public Builder jsons(GetVirtualNodeSpecLoggingAccessLogFileFormatJson... jsons) {
            return jsons(List.of(jsons));
        }
        @CustomType.Setter
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GetVirtualNodeSpecLoggingAccessLogFileFormat build() {
            final var o = new GetVirtualNodeSpecLoggingAccessLogFileFormat();
            o.jsons = jsons;
            o.text = text;
            return o;
        }
    }
}
