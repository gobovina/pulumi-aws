// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypeOfferingsResult {
    private @Nullable List<GetInstanceTypeOfferingsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of EC2 Instance Types.
     * 
     */
    private List<String> instanceTypes;
    private @Nullable String locationType;
    /**
     * @return List of location types.
     * 
     */
    private List<String> locationTypes;
    /**
     * @return List of locations.
     * 
     */
    private List<String> locations;

    private GetInstanceTypeOfferingsResult() {}
    public List<GetInstanceTypeOfferingsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of EC2 Instance Types.
     * 
     */
    public List<String> instanceTypes() {
        return this.instanceTypes;
    }
    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }
    /**
     * @return List of location types.
     * 
     */
    public List<String> locationTypes() {
        return this.locationTypes;
    }
    /**
     * @return List of locations.
     * 
     */
    public List<String> locations() {
        return this.locations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeOfferingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetInstanceTypeOfferingsFilter> filters;
        private String id;
        private List<String> instanceTypes;
        private @Nullable String locationType;
        private List<String> locationTypes;
        private List<String> locations;
        public Builder() {}
        public Builder(GetInstanceTypeOfferingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.locationType = defaults.locationType;
    	      this.locationTypes = defaults.locationTypes;
    	      this.locations = defaults.locations;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetInstanceTypeOfferingsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstanceTypeOfferingsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        @CustomType.Setter
        public Builder locationType(@Nullable String locationType) {
            this.locationType = locationType;
            return this;
        }
        @CustomType.Setter
        public Builder locationTypes(List<String> locationTypes) {
            this.locationTypes = Objects.requireNonNull(locationTypes);
            return this;
        }
        public Builder locationTypes(String... locationTypes) {
            return locationTypes(List.of(locationTypes));
        }
        @CustomType.Setter
        public Builder locations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public GetInstanceTypeOfferingsResult build() {
            final var o = new GetInstanceTypeOfferingsResult();
            o.filters = filters;
            o.id = id;
            o.instanceTypes = instanceTypes;
            o.locationType = locationType;
            o.locationTypes = locationTypes;
            o.locations = locations;
            return o;
        }
    }
}
