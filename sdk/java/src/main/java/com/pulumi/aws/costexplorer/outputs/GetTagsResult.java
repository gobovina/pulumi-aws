// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetTagsFilter;
import com.pulumi.aws.costexplorer.outputs.GetTagsSortBy;
import com.pulumi.aws.costexplorer.outputs.GetTagsTimePeriod;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagsResult {
    private @Nullable GetTagsFilter filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String searchString;
    private @Nullable List<GetTagsSortBy> sortBies;
    private @Nullable String tagKey;
    /**
     * @return Tags that match your request.
     * 
     */
    private List<String> tags;
    private GetTagsTimePeriod timePeriod;

    private GetTagsResult() {}
    public Optional<GetTagsFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> searchString() {
        return Optional.ofNullable(this.searchString);
    }
    public List<GetTagsSortBy> sortBies() {
        return this.sortBies == null ? List.of() : this.sortBies;
    }
    public Optional<String> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * @return Tags that match your request.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    public GetTagsTimePeriod timePeriod() {
        return this.timePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetTagsFilter filter;
        private String id;
        private @Nullable String searchString;
        private @Nullable List<GetTagsSortBy> sortBies;
        private @Nullable String tagKey;
        private List<String> tags;
        private GetTagsTimePeriod timePeriod;
        public Builder() {}
        public Builder(GetTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.searchString = defaults.searchString;
    	      this.sortBies = defaults.sortBies;
    	      this.tagKey = defaults.tagKey;
    	      this.tags = defaults.tags;
    	      this.timePeriod = defaults.timePeriod;
        }

        @CustomType.Setter
        public Builder filter(@Nullable GetTagsFilter filter) {
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder searchString(@Nullable String searchString) {
            this.searchString = searchString;
            return this;
        }
        @CustomType.Setter
        public Builder sortBies(@Nullable List<GetTagsSortBy> sortBies) {
            this.sortBies = sortBies;
            return this;
        }
        public Builder sortBies(GetTagsSortBy... sortBies) {
            return sortBies(List.of(sortBies));
        }
        @CustomType.Setter
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder timePeriod(GetTagsTimePeriod timePeriod) {
            this.timePeriod = Objects.requireNonNull(timePeriod);
            return this;
        }
        public GetTagsResult build() {
            final var o = new GetTagsResult();
            o.filter = filter;
            o.id = id;
            o.searchString = searchString;
            o.sortBies = sortBies;
            o.tagKey = tagKey;
            o.tags = tags;
            o.timePeriod = timePeriod;
            return o;
        }
    }
}
