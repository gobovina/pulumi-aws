// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.outputs;

import com.pulumi.aws.mq.outputs.GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypeOfferingsBrokerInstanceOption {
    /**
     * @return The list of available AZs. See Availability Zones. below
     * 
     */
    private List<GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone> availabilityZones;
    /**
     * @return Filter response by engine type.
     * 
     */
    private String engineType;
    /**
     * @return Filter response by host instance type.
     * 
     */
    private String hostInstanceType;
    /**
     * @return Filter response by storage type.
     * 
     */
    private String storageType;
    /**
     * @return The list of supported deployment modes.
     * 
     */
    private List<String> supportedDeploymentModes;
    /**
     * @return The list of supported engine versions.
     * 
     */
    private List<String> supportedEngineVersions;

    private GetInstanceTypeOfferingsBrokerInstanceOption() {}
    /**
     * @return The list of available AZs. See Availability Zones. below
     * 
     */
    public List<GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return Filter response by engine type.
     * 
     */
    public String engineType() {
        return this.engineType;
    }
    /**
     * @return Filter response by host instance type.
     * 
     */
    public String hostInstanceType() {
        return this.hostInstanceType;
    }
    /**
     * @return Filter response by storage type.
     * 
     */
    public String storageType() {
        return this.storageType;
    }
    /**
     * @return The list of supported deployment modes.
     * 
     */
    public List<String> supportedDeploymentModes() {
        return this.supportedDeploymentModes;
    }
    /**
     * @return The list of supported engine versions.
     * 
     */
    public List<String> supportedEngineVersions() {
        return this.supportedEngineVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeOfferingsBrokerInstanceOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone> availabilityZones;
        private String engineType;
        private String hostInstanceType;
        private String storageType;
        private List<String> supportedDeploymentModes;
        private List<String> supportedEngineVersions;
        public Builder() {}
        public Builder(GetInstanceTypeOfferingsBrokerInstanceOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.engineType = defaults.engineType;
    	      this.hostInstanceType = defaults.hostInstanceType;
    	      this.storageType = defaults.storageType;
    	      this.supportedDeploymentModes = defaults.supportedDeploymentModes;
    	      this.supportedEngineVersions = defaults.supportedEngineVersions;
        }

        @CustomType.Setter
        public Builder availabilityZones(List<GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(GetInstanceTypeOfferingsBrokerInstanceOptionAvailabilityZone... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder engineType(String engineType) {
            this.engineType = Objects.requireNonNull(engineType);
            return this;
        }
        @CustomType.Setter
        public Builder hostInstanceType(String hostInstanceType) {
            this.hostInstanceType = Objects.requireNonNull(hostInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        @CustomType.Setter
        public Builder supportedDeploymentModes(List<String> supportedDeploymentModes) {
            this.supportedDeploymentModes = Objects.requireNonNull(supportedDeploymentModes);
            return this;
        }
        public Builder supportedDeploymentModes(String... supportedDeploymentModes) {
            return supportedDeploymentModes(List.of(supportedDeploymentModes));
        }
        @CustomType.Setter
        public Builder supportedEngineVersions(List<String> supportedEngineVersions) {
            this.supportedEngineVersions = Objects.requireNonNull(supportedEngineVersions);
            return this;
        }
        public Builder supportedEngineVersions(String... supportedEngineVersions) {
            return supportedEngineVersions(List.of(supportedEngineVersions));
        }
        public GetInstanceTypeOfferingsBrokerInstanceOption build() {
            final var o = new GetInstanceTypeOfferingsBrokerInstanceOption();
            o.availabilityZones = availabilityZones;
            o.engineType = engineType;
            o.hostInstanceType = hostInstanceType;
            o.storageType = storageType;
            o.supportedDeploymentModes = supportedDeploymentModes;
            o.supportedEngineVersions = supportedEngineVersions;
            return o;
        }
    }
}
