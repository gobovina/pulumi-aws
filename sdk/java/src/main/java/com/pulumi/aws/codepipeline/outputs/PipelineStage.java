// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.outputs;

import com.pulumi.aws.codepipeline.outputs.PipelineStageAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PipelineStage {
    /**
     * @return The action(s) to include in the stage. Defined as an `action` block below
     * 
     */
    private List<PipelineStageAction> actions;
    /**
     * @return The name of the stage.
     * 
     */
    private String name;

    private PipelineStage() {}
    /**
     * @return The action(s) to include in the stage. Defined as an `action` block below
     * 
     */
    public List<PipelineStageAction> actions() {
        return this.actions;
    }
    /**
     * @return The name of the stage.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineStage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PipelineStageAction> actions;
        private String name;
        public Builder() {}
        public Builder(PipelineStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder actions(List<PipelineStageAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(PipelineStageAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PipelineStage build() {
            final var o = new PipelineStage();
            o.actions = actions;
            o.name = name;
            return o;
        }
    }
}
