// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePlacementConstraint {
    /**
     * @return Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    private @Nullable String expression;
    /**
     * @return Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    private String type;

    private ServicePlacementConstraint() {}
    /**
     * @return Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private String type;
        public Builder() {}
        public Builder(ServicePlacementConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ServicePlacementConstraint build() {
            final var o = new ServicePlacementConstraint();
            o.expression = expression;
            o.type = type;
            return o;
        }
    }
}
