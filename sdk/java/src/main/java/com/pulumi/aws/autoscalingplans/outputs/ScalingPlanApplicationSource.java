// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans.outputs;

import com.pulumi.aws.autoscalingplans.outputs.ScalingPlanApplicationSourceTagFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingPlanApplicationSource {
    /**
     * @return The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * 
     */
    private @Nullable String cloudformationStackArn;
    /**
     * @return A set of tags.
     * 
     */
    private @Nullable List<ScalingPlanApplicationSourceTagFilter> tagFilters;

    private ScalingPlanApplicationSource() {}
    /**
     * @return The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
     * 
     */
    public Optional<String> cloudformationStackArn() {
        return Optional.ofNullable(this.cloudformationStackArn);
    }
    /**
     * @return A set of tags.
     * 
     */
    public List<ScalingPlanApplicationSourceTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanApplicationSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudformationStackArn;
        private @Nullable List<ScalingPlanApplicationSourceTagFilter> tagFilters;
        public Builder() {}
        public Builder(ScalingPlanApplicationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudformationStackArn = defaults.cloudformationStackArn;
    	      this.tagFilters = defaults.tagFilters;
        }

        @CustomType.Setter
        public Builder cloudformationStackArn(@Nullable String cloudformationStackArn) {
            this.cloudformationStackArn = cloudformationStackArn;
            return this;
        }
        @CustomType.Setter
        public Builder tagFilters(@Nullable List<ScalingPlanApplicationSourceTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(ScalingPlanApplicationSourceTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        public ScalingPlanApplicationSource build() {
            final var o = new ScalingPlanApplicationSource();
            o.cloudformationStackArn = cloudformationStackArn;
            o.tagFilters = tagFilters;
            return o;
        }
    }
}
