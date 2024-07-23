// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrOrCostCategory;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrOrDimension;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrOrTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CostCategoryRuleRuleOrOr {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleOrOrCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleOrOrDimension dimension;
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable CostCategoryRuleRuleOrOrTags tags;

    private CostCategoryRuleRuleOrOr() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleOrOrCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleOrOrDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<CostCategoryRuleRuleOrOrTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryRuleRuleOrOr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CostCategoryRuleRuleOrOrCostCategory costCategory;
        private @Nullable CostCategoryRuleRuleOrOrDimension dimension;
        private @Nullable CostCategoryRuleRuleOrOrTags tags;
        public Builder() {}
        public Builder(CostCategoryRuleRuleOrOr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategory(@Nullable CostCategoryRuleRuleOrOrCostCategory costCategory) {

            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable CostCategoryRuleRuleOrOrDimension dimension) {

            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable CostCategoryRuleRuleOrOrTags tags) {

            this.tags = tags;
            return this;
        }
        public CostCategoryRuleRuleOrOr build() {
            final var _resultValue = new CostCategoryRuleRuleOrOr();
            _resultValue.costCategory = costCategory;
            _resultValue.dimension = dimension;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
