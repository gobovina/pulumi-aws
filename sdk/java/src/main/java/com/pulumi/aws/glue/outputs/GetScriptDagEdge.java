// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScriptDagEdge {
    /**
     * @return The ID of the node at which the edge starts.
     * 
     */
    private String source;
    /**
     * @return The ID of the node at which the edge ends.
     * 
     */
    private String target;
    /**
     * @return The target of the edge.
     * 
     */
    private @Nullable String targetParameter;

    private GetScriptDagEdge() {}
    /**
     * @return The ID of the node at which the edge starts.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The ID of the node at which the edge ends.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The target of the edge.
     * 
     */
    public Optional<String> targetParameter() {
        return Optional.ofNullable(this.targetParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptDagEdge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String source;
        private String target;
        private @Nullable String targetParameter;
        public Builder() {}
        public Builder(GetScriptDagEdge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.targetParameter = defaults.targetParameter;
        }

        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder targetParameter(@Nullable String targetParameter) {
            this.targetParameter = targetParameter;
            return this;
        }
        public GetScriptDagEdge build() {
            final var o = new GetScriptDagEdge();
            o.source = source;
            o.target = target;
            o.targetParameter = targetParameter;
            return o;
        }
    }
}
