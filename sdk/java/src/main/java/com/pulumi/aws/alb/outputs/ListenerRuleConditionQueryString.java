// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleConditionQueryString {
    /**
     * @return Query string key pattern to match.
     * 
     */
    private @Nullable String key;
    /**
     * @return Query string value pattern to match.
     * 
     */
    private String value;

    private ListenerRuleConditionQueryString() {}
    /**
     * @return Query string key pattern to match.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Query string value pattern to match.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionQueryString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private String value;
        public Builder() {}
        public Builder(ListenerRuleConditionQueryString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListenerRuleConditionQueryString build() {
            final var o = new ListenerRuleConditionQueryString();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
