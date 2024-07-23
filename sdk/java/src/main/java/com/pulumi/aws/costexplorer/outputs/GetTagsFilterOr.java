// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetTagsFilterOrCostCategory;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterOrDimension;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterOrTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagsFilterOr {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See `cost_category` block below for details.
     * 
     */
    private @Nullable GetTagsFilterOrCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * 
     */
    private @Nullable GetTagsFilterOrDimension dimension;
    /**
     * @return Tags that match your request.
     * 
     */
    private @Nullable GetTagsFilterOrTags tags;

    private GetTagsFilterOr() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See `cost_category` block below for details.
     * 
     */
    public Optional<GetTagsFilterOrCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * 
     */
    public Optional<GetTagsFilterOrDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Tags that match your request.
     * 
     */
    public Optional<GetTagsFilterOrTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsFilterOr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetTagsFilterOrCostCategory costCategory;
        private @Nullable GetTagsFilterOrDimension dimension;
        private @Nullable GetTagsFilterOrTags tags;
        public Builder() {}
        public Builder(GetTagsFilterOr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategory(@Nullable GetTagsFilterOrCostCategory costCategory) {

            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable GetTagsFilterOrDimension dimension) {

            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable GetTagsFilterOrTags tags) {

            this.tags = tags;
            return this;
        }
        public GetTagsFilterOr build() {
            final var _resultValue = new GetTagsFilterOr();
            _resultValue.costCategory = costCategory;
            _resultValue.dimension = dimension;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
