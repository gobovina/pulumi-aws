// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotCostCategoryArgs;
import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotDimensionArgs;
import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CostCategoryRuleRuleNotNotArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostCategoryRuleRuleNotNotArgs Empty = new CostCategoryRuleRuleNotNotArgs();

    /**
     * Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    @Import(name="costCategory")
    private @Nullable Output<CostCategoryRuleRuleNotNotCostCategoryArgs> costCategory;

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleNotNotCostCategoryArgs>> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }

    /**
     * Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    @Import(name="dimension")
    private @Nullable Output<CostCategoryRuleRuleNotNotDimensionArgs> dimension;

    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleNotNotDimensionArgs>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<CostCategoryRuleRuleNotNotTagsArgs> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleNotNotTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CostCategoryRuleRuleNotNotArgs() {}

    private CostCategoryRuleRuleNotNotArgs(CostCategoryRuleRuleNotNotArgs $) {
        this.costCategory = $.costCategory;
        this.dimension = $.dimension;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostCategoryRuleRuleNotNotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostCategoryRuleRuleNotNotArgs $;

        public Builder() {
            $ = new CostCategoryRuleRuleNotNotArgs();
        }

        public Builder(CostCategoryRuleRuleNotNotArgs defaults) {
            $ = new CostCategoryRuleRuleNotNotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(@Nullable Output<CostCategoryRuleRuleNotNotCostCategoryArgs> costCategory) {
            $.costCategory = costCategory;
            return this;
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(CostCategoryRuleRuleNotNotCostCategoryArgs costCategory) {
            return costCategory(Output.of(costCategory));
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(@Nullable Output<CostCategoryRuleRuleNotNotDimensionArgs> dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(CostCategoryRuleRuleNotNotDimensionArgs dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<CostCategoryRuleRuleNotNotTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(CostCategoryRuleRuleNotNotTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public CostCategoryRuleRuleNotNotArgs build() {
            return $;
        }
    }

}
