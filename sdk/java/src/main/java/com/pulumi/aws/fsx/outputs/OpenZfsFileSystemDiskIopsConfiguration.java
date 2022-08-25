// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OpenZfsFileSystemDiskIopsConfiguration {
    /**
     * @return - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    private @Nullable String mode;

    private OpenZfsFileSystemDiskIopsConfiguration() {}
    /**
     * @return - The total number of SSD IOPS provisioned for the file system.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return - Specifies whether the number of IOPS for the file system is using the system. Valid values are `AUTOMATIC` and `USER_PROVISIONED`. Default value is `AUTOMATIC`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemDiskIopsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer iops;
        private @Nullable String mode;
        public Builder() {}
        public Builder(OpenZfsFileSystemDiskIopsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public OpenZfsFileSystemDiskIopsConfiguration build() {
            final var o = new OpenZfsFileSystemDiskIopsConfiguration();
            o.iops = iops;
            o.mode = mode;
            return o;
        }
    }
}
