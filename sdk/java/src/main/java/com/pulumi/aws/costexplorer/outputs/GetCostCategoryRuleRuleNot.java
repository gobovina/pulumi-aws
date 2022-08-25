// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleNotCostCategory;
import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleNotDimension;
import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleNotTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategoryRuleRuleNot {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private List<GetCostCategoryRuleRuleNotCostCategory> costCategories;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private List<GetCostCategoryRuleRuleNotDimension> dimensions;
    /**
     * @return Resource tags.
     * 
     */
    private List<GetCostCategoryRuleRuleNotTag> tags;

    private GetCostCategoryRuleRuleNot() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public List<GetCostCategoryRuleRuleNotCostCategory> costCategories() {
        return this.costCategories;
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public List<GetCostCategoryRuleRuleNotDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return Resource tags.
     * 
     */
    public List<GetCostCategoryRuleRuleNotTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryRuleRuleNot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCostCategoryRuleRuleNotCostCategory> costCategories;
        private List<GetCostCategoryRuleRuleNotDimension> dimensions;
        private List<GetCostCategoryRuleRuleNotTag> tags;
        public Builder() {}
        public Builder(GetCostCategoryRuleRuleNot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategories = defaults.costCategories;
    	      this.dimensions = defaults.dimensions;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategories(List<GetCostCategoryRuleRuleNotCostCategory> costCategories) {
            this.costCategories = Objects.requireNonNull(costCategories);
            return this;
        }
        public Builder costCategories(GetCostCategoryRuleRuleNotCostCategory... costCategories) {
            return costCategories(List.of(costCategories));
        }
        @CustomType.Setter
        public Builder dimensions(List<GetCostCategoryRuleRuleNotDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetCostCategoryRuleRuleNotDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder tags(List<GetCostCategoryRuleRuleNotTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetCostCategoryRuleRuleNotTag... tags) {
            return tags(List.of(tags));
        }
        public GetCostCategoryRuleRuleNot build() {
            final var o = new GetCostCategoryRuleRuleNot();
            o.costCategories = costCategories;
            o.dimensions = dimensions;
            o.tags = tags;
            return o;
        }
    }
}
