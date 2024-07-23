// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrCostCategoryArgs;
import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrDimensionArgs;
import com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CostCategoryRuleRuleOrOrArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostCategoryRuleRuleOrOrArgs Empty = new CostCategoryRuleRuleOrOrArgs();

    /**
     * Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    @Import(name="costCategory")
    private @Nullable Output<CostCategoryRuleRuleOrOrCostCategoryArgs> costCategory;

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleOrOrCostCategoryArgs>> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }

    /**
     * Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    @Import(name="dimension")
    private @Nullable Output<CostCategoryRuleRuleOrOrDimensionArgs> dimension;

    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleOrOrDimensionArgs>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<CostCategoryRuleRuleOrOrTagsArgs> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<CostCategoryRuleRuleOrOrTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CostCategoryRuleRuleOrOrArgs() {}

    private CostCategoryRuleRuleOrOrArgs(CostCategoryRuleRuleOrOrArgs $) {
        this.costCategory = $.costCategory;
        this.dimension = $.dimension;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostCategoryRuleRuleOrOrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostCategoryRuleRuleOrOrArgs $;

        public Builder() {
            $ = new CostCategoryRuleRuleOrOrArgs();
        }

        public Builder(CostCategoryRuleRuleOrOrArgs defaults) {
            $ = new CostCategoryRuleRuleOrOrArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(@Nullable Output<CostCategoryRuleRuleOrOrCostCategoryArgs> costCategory) {
            $.costCategory = costCategory;
            return this;
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(CostCategoryRuleRuleOrOrCostCategoryArgs costCategory) {
            return costCategory(Output.of(costCategory));
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(@Nullable Output<CostCategoryRuleRuleOrOrDimensionArgs> dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(CostCategoryRuleRuleOrOrDimensionArgs dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<CostCategoryRuleRuleOrOrTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(CostCategoryRuleRuleOrOrTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public CostCategoryRuleRuleOrOrArgs build() {
            return $;
        }
    }

}
