// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionForwardStickiness {
    /**
     * @return The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    private Integer duration;
    /**
     * @return Indicates whether target group stickiness is enabled.
     * 
     */
    private @Nullable Boolean enabled;

    private ListenerRuleActionForwardStickiness() {}
    /**
     * @return The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    public Integer duration() {
        return this.duration;
    }
    /**
     * @return Indicates whether target group stickiness is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardStickiness defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer duration;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ListenerRuleActionForwardStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ListenerRuleActionForwardStickiness build() {
            final var o = new ListenerRuleActionForwardStickiness();
            o.duration = duration;
            o.enabled = enabled;
            return o;
        }
    }
}
