// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetInstanceTypeOfferingFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypeOfferingResult {
    private @Nullable List<GetInstanceTypeOfferingFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return EC2 Instance Type.
     * 
     */
    private String instanceType;
    private @Nullable String locationType;
    private @Nullable List<String> preferredInstanceTypes;

    private GetInstanceTypeOfferingResult() {}
    public List<GetInstanceTypeOfferingFilter> filters() {
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
     * @return EC2 Instance Type.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    public Optional<String> locationType() {
        return Optional.ofNullable(this.locationType);
    }
    public List<String> preferredInstanceTypes() {
        return this.preferredInstanceTypes == null ? List.of() : this.preferredInstanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeOfferingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetInstanceTypeOfferingFilter> filters;
        private String id;
        private String instanceType;
        private @Nullable String locationType;
        private @Nullable List<String> preferredInstanceTypes;
        public Builder() {}
        public Builder(GetInstanceTypeOfferingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceType = defaults.instanceType;
    	      this.locationType = defaults.locationType;
    	      this.preferredInstanceTypes = defaults.preferredInstanceTypes;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetInstanceTypeOfferingFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstanceTypeOfferingFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder locationType(@Nullable String locationType) {
            this.locationType = locationType;
            return this;
        }
        @CustomType.Setter
        public Builder preferredInstanceTypes(@Nullable List<String> preferredInstanceTypes) {
            this.preferredInstanceTypes = preferredInstanceTypes;
            return this;
        }
        public Builder preferredInstanceTypes(String... preferredInstanceTypes) {
            return preferredInstanceTypes(List.of(preferredInstanceTypes));
        }
        public GetInstanceTypeOfferingResult build() {
            final var o = new GetInstanceTypeOfferingResult();
            o.filters = filters;
            o.id = id;
            o.instanceType = instanceType;
            o.locationType = locationType;
            o.preferredInstanceTypes = preferredInstanceTypes;
            return o;
        }
    }
}
