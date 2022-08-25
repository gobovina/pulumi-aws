// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceRulesSourceList;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatefulRule;
import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleGroupRulesSource {
    /**
     * @return A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    private @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
    /**
     * @return The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    private @Nullable String rulesString;
    /**
     * @return Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    private @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
    /**
     * @return A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    private @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;

    private RuleGroupRuleGroupRulesSource() {}
    /**
     * @return A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    public Optional<RuleGroupRuleGroupRulesSourceRulesSourceList> rulesSourceList() {
        return Optional.ofNullable(this.rulesSourceList);
    }
    /**
     * @return The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    public Optional<String> rulesString() {
        return Optional.ofNullable(this.rulesString);
    }
    /**
     * @return Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    public List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules() {
        return this.statefulRules == null ? List.of() : this.statefulRules;
    }
    /**
     * @return A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    public Optional<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions> statelessRulesAndCustomActions() {
        return Optional.ofNullable(this.statelessRulesAndCustomActions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
        private @Nullable String rulesString;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
        private @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;
        public Builder() {}
        public Builder(RuleGroupRuleGroupRulesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        @CustomType.Setter
        public Builder rulesSourceList(@Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }
        @CustomType.Setter
        public Builder rulesString(@Nullable String rulesString) {
            this.rulesString = rulesString;
            return this;
        }
        @CustomType.Setter
        public Builder statefulRules(@Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }
        public Builder statefulRules(RuleGroupRuleGroupRulesSourceStatefulRule... statefulRules) {
            return statefulRules(List.of(statefulRules));
        }
        @CustomType.Setter
        public Builder statelessRulesAndCustomActions(@Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }
        public RuleGroupRuleGroupRulesSource build() {
            final var o = new RuleGroupRuleGroupRulesSource();
            o.rulesSourceList = rulesSourceList;
            o.rulesString = rulesString;
            o.statefulRules = statefulRules;
            o.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return o;
        }
    }
}
