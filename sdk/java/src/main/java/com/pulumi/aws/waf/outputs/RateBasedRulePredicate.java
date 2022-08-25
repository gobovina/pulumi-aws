// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RateBasedRulePredicate {
    /**
     * @return A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    private String dataId;
    /**
     * @return Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `ByteMatchSet`, `IPSet`, `SqlInjectionMatchSet`, `XssMatchSet`, or `SizeConstraintSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
     * 
     */
    private Boolean negated;
    /**
     * @return The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    private String type;

    private RateBasedRulePredicate() {}
    /**
     * @return A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    public String dataId() {
        return this.dataId;
    }
    /**
     * @return Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `ByteMatchSet`, `IPSet`, `SqlInjectionMatchSet`, `XssMatchSet`, or `SizeConstraintSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
     * 
     */
    public Boolean negated() {
        return this.negated;
    }
    /**
     * @return The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateBasedRulePredicate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dataId;
        private Boolean negated;
        private String type;
        public Builder() {}
        public Builder(RateBasedRulePredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder dataId(String dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }
        @CustomType.Setter
        public Builder negated(Boolean negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RateBasedRulePredicate build() {
            final var o = new RateBasedRulePredicate();
            o.dataId = dataId;
            o.negated = negated;
            o.type = type;
            return o;
        }
    }
}
