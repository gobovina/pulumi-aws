// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.GetReleaseLabelsFilters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReleaseLabelsResult {
    private @Nullable GetReleaseLabelsFilters filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The returned release labels.
     * 
     */
    private List<String> releaseLabels;

    private GetReleaseLabelsResult() {}
    public Optional<GetReleaseLabelsFilters> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The returned release labels.
     * 
     */
    public List<String> releaseLabels() {
        return this.releaseLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseLabelsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetReleaseLabelsFilters filters;
        private String id;
        private List<String> releaseLabels;
        public Builder() {}
        public Builder(GetReleaseLabelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.releaseLabels = defaults.releaseLabels;
        }

        @CustomType.Setter
        public Builder filters(@Nullable GetReleaseLabelsFilters filters) {
            this.filters = filters;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder releaseLabels(List<String> releaseLabels) {
            this.releaseLabels = Objects.requireNonNull(releaseLabels);
            return this;
        }
        public Builder releaseLabels(String... releaseLabels) {
            return releaseLabels(List.of(releaseLabels));
        }
        public GetReleaseLabelsResult build() {
            final var o = new GetReleaseLabelsResult();
            o.filters = filters;
            o.id = id;
            o.releaseLabels = releaseLabels;
            return o;
        }
    }
}
