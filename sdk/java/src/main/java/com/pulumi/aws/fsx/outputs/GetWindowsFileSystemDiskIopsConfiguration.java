// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsFileSystemDiskIopsConfiguration {
    private Integer iops;
    private String mode;

    private GetWindowsFileSystemDiskIopsConfiguration() {}
    public Integer iops() {
        return this.iops;
    }
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFileSystemDiskIopsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer iops;
        private String mode;
        public Builder() {}
        public Builder(GetWindowsFileSystemDiskIopsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GetWindowsFileSystemDiskIopsConfiguration build() {
            final var o = new GetWindowsFileSystemDiskIopsConfiguration();
            o.iops = iops;
            o.mode = mode;
            return o;
        }
    }
}
