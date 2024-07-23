// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationEbsBlockDevice;
import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice;
import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationRootBlockDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetRequestLaunchSpecification {
    private String ami;
    private @Nullable Boolean associatePublicIpAddress;
    /**
     * @return The availability zone in which to place the request.
     * 
     */
    private @Nullable String availabilityZone;
    private @Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices;
    private @Nullable Boolean ebsOptimized;
    private @Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices;
    private @Nullable String iamInstanceProfile;
    private @Nullable String iamInstanceProfileArn;
    /**
     * @return The type of instance to request.
     * 
     */
    private String instanceType;
    private @Nullable String keyName;
    private @Nullable Boolean monitoring;
    private @Nullable String placementGroup;
    private @Nullable String placementTenancy;
    private @Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices;
    /**
     * @return The maximum bid price per unit hour.
     * 
     */
    private @Nullable String spotPrice;
    /**
     * @return The subnet in which to launch the requested instance.
     * 
     */
    private @Nullable String subnetId;
    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable Map<String,String> tags;
    private @Nullable String userData;
    private @Nullable List<String> vpcSecurityGroupIds;
    /**
     * @return The capacity added to the fleet by a fulfilled request.
     * 
     */
    private @Nullable String weightedCapacity;

    private SpotFleetRequestLaunchSpecification() {}
    public String ami() {
        return this.ami;
    }
    public Optional<Boolean> associatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    /**
     * @return The availability zone in which to place the request.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices() {
        return this.ebsBlockDevices == null ? List.of() : this.ebsBlockDevices;
    }
    public Optional<Boolean> ebsOptimized() {
        return Optional.ofNullable(this.ebsOptimized);
    }
    public List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? List.of() : this.ephemeralBlockDevices;
    }
    public Optional<String> iamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }
    public Optional<String> iamInstanceProfileArn() {
        return Optional.ofNullable(this.iamInstanceProfileArn);
    }
    /**
     * @return The type of instance to request.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    public Optional<Boolean> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    public Optional<String> placementGroup() {
        return Optional.ofNullable(this.placementGroup);
    }
    public Optional<String> placementTenancy() {
        return Optional.ofNullable(this.placementTenancy);
    }
    public List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices() {
        return this.rootBlockDevices == null ? List.of() : this.rootBlockDevices;
    }
    /**
     * @return The maximum bid price per unit hour.
     * 
     */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * @return The subnet in which to launch the requested instance.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    public List<String> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? List.of() : this.vpcSecurityGroupIds;
    }
    /**
     * @return The capacity added to the fleet by a fulfilled request.
     * 
     */
    public Optional<String> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ami;
        private @Nullable Boolean associatePublicIpAddress;
        private @Nullable String availabilityZone;
        private @Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices;
        private @Nullable Boolean ebsOptimized;
        private @Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices;
        private @Nullable String iamInstanceProfile;
        private @Nullable String iamInstanceProfileArn;
        private String instanceType;
        private @Nullable String keyName;
        private @Nullable Boolean monitoring;
        private @Nullable String placementGroup;
        private @Nullable String placementTenancy;
        private @Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable String userData;
        private @Nullable List<String> vpcSecurityGroupIds;
        private @Nullable String weightedCapacity;
        public Builder() {}
        public Builder(SpotFleetRequestLaunchSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.iamInstanceProfileArn = defaults.iamInstanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        @CustomType.Setter
        public Builder ami(String ami) {
            if (ami == null) {
              throw new MissingRequiredPropertyException("SpotFleetRequestLaunchSpecification", "ami");
            }
            this.ami = ami;
            return this;
        }
        @CustomType.Setter
        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {

            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {

            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder ebsBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices) {

            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }
        public Builder ebsBlockDevices(SpotFleetRequestLaunchSpecificationEbsBlockDevice... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }
        @CustomType.Setter
        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {

            this.ebsOptimized = ebsOptimized;
            return this;
        }
        @CustomType.Setter
        public Builder ephemeralBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices) {

            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }
        public Builder ephemeralBlockDevices(SpotFleetRequestLaunchSpecificationEphemeralBlockDevice... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }
        @CustomType.Setter
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {

            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        @CustomType.Setter
        public Builder iamInstanceProfileArn(@Nullable String iamInstanceProfileArn) {

            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("SpotFleetRequestLaunchSpecification", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder keyName(@Nullable String keyName) {

            this.keyName = keyName;
            return this;
        }
        @CustomType.Setter
        public Builder monitoring(@Nullable Boolean monitoring) {

            this.monitoring = monitoring;
            return this;
        }
        @CustomType.Setter
        public Builder placementGroup(@Nullable String placementGroup) {

            this.placementGroup = placementGroup;
            return this;
        }
        @CustomType.Setter
        public Builder placementTenancy(@Nullable String placementTenancy) {

            this.placementTenancy = placementTenancy;
            return this;
        }
        @CustomType.Setter
        public Builder rootBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices) {

            this.rootBlockDevices = rootBlockDevices;
            return this;
        }
        public Builder rootBlockDevices(SpotFleetRequestLaunchSpecificationRootBlockDevice... rootBlockDevices) {
            return rootBlockDevices(List.of(rootBlockDevices));
        }
        @CustomType.Setter
        public Builder spotPrice(@Nullable String spotPrice) {

            this.spotPrice = spotPrice;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable String subnetId) {

            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder userData(@Nullable String userData) {

            this.userData = userData;
            return this;
        }
        @CustomType.Setter
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {

            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        @CustomType.Setter
        public Builder weightedCapacity(@Nullable String weightedCapacity) {

            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public SpotFleetRequestLaunchSpecification build() {
            final var _resultValue = new SpotFleetRequestLaunchSpecification();
            _resultValue.ami = ami;
            _resultValue.associatePublicIpAddress = associatePublicIpAddress;
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.ebsBlockDevices = ebsBlockDevices;
            _resultValue.ebsOptimized = ebsOptimized;
            _resultValue.ephemeralBlockDevices = ephemeralBlockDevices;
            _resultValue.iamInstanceProfile = iamInstanceProfile;
            _resultValue.iamInstanceProfileArn = iamInstanceProfileArn;
            _resultValue.instanceType = instanceType;
            _resultValue.keyName = keyName;
            _resultValue.monitoring = monitoring;
            _resultValue.placementGroup = placementGroup;
            _resultValue.placementTenancy = placementTenancy;
            _resultValue.rootBlockDevices = rootBlockDevices;
            _resultValue.spotPrice = spotPrice;
            _resultValue.subnetId = subnetId;
            _resultValue.tags = tags;
            _resultValue.userData = userData;
            _resultValue.vpcSecurityGroupIds = vpcSecurityGroupIds;
            _resultValue.weightedCapacity = weightedCapacity;
            return _resultValue;
        }
    }
}
