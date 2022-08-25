// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetImageRecipeBlockDeviceMappingEb;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageRecipeBlockDeviceMapping {
    /**
     * @return Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    private String deviceName;
    /**
     * @return Single list of object with Elastic Block Storage (EBS) block device mapping settings.
     * 
     */
    private List<GetImageRecipeBlockDeviceMappingEb> ebs;
    /**
     * @return Whether to remove a mapping from the parent image.
     * 
     */
    private String noDevice;
    /**
     * @return Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    private String virtualName;

    private GetImageRecipeBlockDeviceMapping() {}
    /**
     * @return Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Single list of object with Elastic Block Storage (EBS) block device mapping settings.
     * 
     */
    public List<GetImageRecipeBlockDeviceMappingEb> ebs() {
        return this.ebs;
    }
    /**
     * @return Whether to remove a mapping from the parent image.
     * 
     */
    public String noDevice() {
        return this.noDevice;
    }
    /**
     * @return Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    public String virtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deviceName;
        private List<GetImageRecipeBlockDeviceMappingEb> ebs;
        private String noDevice;
        private String virtualName;
        public Builder() {}
        public Builder(GetImageRecipeBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder ebs(List<GetImageRecipeBlockDeviceMappingEb> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }
        public Builder ebs(GetImageRecipeBlockDeviceMappingEb... ebs) {
            return ebs(List.of(ebs));
        }
        @CustomType.Setter
        public Builder noDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }
        @CustomType.Setter
        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetImageRecipeBlockDeviceMapping build() {
            final var o = new GetImageRecipeBlockDeviceMapping();
            o.deviceName = deviceName;
            o.ebs = ebs;
            o.noDevice = noDevice;
            o.virtualName = virtualName;
            return o;
        }
    }
}
