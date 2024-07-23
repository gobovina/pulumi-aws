// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleAndNotCostCategory;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleAndNotDimension;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleAndNotTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CostCategoryRuleRuleAndNot {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleAndNotCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleAndNotDimension dimension;
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable CostCategoryRuleRuleAndNotTags tags;

    private CostCategoryRuleRuleAndNot() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleAndNotCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleAndNotDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<CostCategoryRuleRuleAndNotTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryRuleRuleAndNot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CostCategoryRuleRuleAndNotCostCategory costCategory;
        private @Nullable CostCategoryRuleRuleAndNotDimension dimension;
        private @Nullable CostCategoryRuleRuleAndNotTags tags;
        public Builder() {}
        public Builder(CostCategoryRuleRuleAndNot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategory(@Nullable CostCategoryRuleRuleAndNotCostCategory costCategory) {

            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable CostCategoryRuleRuleAndNotDimension dimension) {

            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable CostCategoryRuleRuleAndNotTags tags) {

            this.tags = tags;
            return this;
        }
        public CostCategoryRuleRuleAndNot build() {
            final var _resultValue = new CostCategoryRuleRuleAndNot();
            _resultValue.costCategory = costCategory;
            _resultValue.dimension = dimension;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
