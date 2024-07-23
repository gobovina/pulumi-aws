// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleNotAndCostCategory;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleNotAndDimension;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleNotAndTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CostCategoryRuleRuleNotAnd {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleNotAndCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private @Nullable CostCategoryRuleRuleNotAndDimension dimension;
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable CostCategoryRuleRuleNotAndTags tags;

    private CostCategoryRuleRuleNotAnd() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleNotAndCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleNotAndDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<CostCategoryRuleRuleNotAndTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryRuleRuleNotAnd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CostCategoryRuleRuleNotAndCostCategory costCategory;
        private @Nullable CostCategoryRuleRuleNotAndDimension dimension;
        private @Nullable CostCategoryRuleRuleNotAndTags tags;
        public Builder() {}
        public Builder(CostCategoryRuleRuleNotAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategory(@Nullable CostCategoryRuleRuleNotAndCostCategory costCategory) {

            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable CostCategoryRuleRuleNotAndDimension dimension) {

            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable CostCategoryRuleRuleNotAndTags tags) {

            this.tags = tags;
            return this;
        }
        public CostCategoryRuleRuleNotAnd build() {
            final var _resultValue = new CostCategoryRuleRuleNotAnd();
            _resultValue.costCategory = costCategory;
            _resultValue.dimension = dimension;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
