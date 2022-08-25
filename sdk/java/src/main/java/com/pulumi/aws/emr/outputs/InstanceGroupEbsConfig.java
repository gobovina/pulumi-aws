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
public final class InstanceGroupEbsConfig {
    /**
     * @return The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    private @Nullable Integer iops;
    /**
     * @return The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
     * 
     */
    private Integer size;
    /**
     * @return The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
     * 
     */
    private String type;
    /**
     * @return The number of EBS Volumes to attach per instance.
     * 
     */
    private @Nullable Integer volumesPerInstance;

    private InstanceGroupEbsConfig() {}
    /**
     * @return The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The number of EBS Volumes to attach per instance.
     * 
     */
    public Optional<Integer> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupEbsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer iops;
        private Integer size;
        private String type;
        private @Nullable Integer volumesPerInstance;
        public Builder() {}
        public Builder(InstanceGroupEbsConfig defaults) {
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
        public InstanceGroupEbsConfig build() {
            final var o = new InstanceGroupEbsConfig();
            o.iops = iops;
            o.size = size;
            o.type = type;
            o.volumesPerInstance = volumesPerInstance;
            return o;
        }
    }
}
