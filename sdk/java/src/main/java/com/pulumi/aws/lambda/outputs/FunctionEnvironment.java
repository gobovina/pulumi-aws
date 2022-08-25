// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FunctionEnvironment {
    /**
     * @return Map of environment variables that are accessible from the function code during execution.
     * 
     */
    private @Nullable Map<String,String> variables;

    private FunctionEnvironment() {}
    /**
     * @return Map of environment variables that are accessible from the function code during execution.
     * 
     */
    public Map<String,String> variables() {
        return this.variables == null ? Map.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> variables;
        public Builder() {}
        public Builder(FunctionEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder variables(@Nullable Map<String,String> variables) {
            this.variables = variables;
            return this;
        }
        public FunctionEnvironment build() {
            final var o = new FunctionEnvironment();
            o.variables = variables;
            return o;
        }
    }
}
