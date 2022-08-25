// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig {
    /**
     * @return Number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return Volume size, in gibibytes (GiB).
     * 
     */
    private Integer size;
    /**
     * @return Volume type. Valid options are `gp3`, `gp2`, `io1`, `standard`, `st1` and `sc1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    private String type;
    /**
     * @return Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
     */
    private @Nullable Integer volumesPerInstance;

    private ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig() {}
    /**
     * @return Number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return Volume size, in gibibytes (GiB).
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Volume type. Valid options are `gp3`, `gp2`, `io1`, `standard`, `st1` and `sc1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
     */
    public Optional<Integer> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer iops;
        private Integer size;
        private String type;
        private @Nullable Integer volumesPerInstance;
        public Builder() {}
        public Builder(ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        @CustomType.Setter
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }
        public ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig build() {
            final var o = new ClusterCoreInstanceFleetInstanceTypeConfigEbsConfig();
            o.iops = iops;
            o.size = size;
            o.type = type;
            o.volumesPerInstance = volumesPerInstance;
            return o;
        }
    }
}
