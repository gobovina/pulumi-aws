// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallPolicyFirewallPolicyStatelessCustomAction {
    private List<GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition> actionDefinitions;
    private String actionName;

    private GetFirewallPolicyFirewallPolicyStatelessCustomAction() {}
    public List<GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition> actionDefinitions() {
        return this.actionDefinitions;
    }
    public String actionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition> actionDefinitions;
        private String actionName;
        public Builder() {}
        public Builder(GetFirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinitions = defaults.actionDefinitions;
    	      this.actionName = defaults.actionName;
        }

        @CustomType.Setter
        public Builder actionDefinitions(List<GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition> actionDefinitions) {
            this.actionDefinitions = Objects.requireNonNull(actionDefinitions);
            return this;
        }
        public Builder actionDefinitions(GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition... actionDefinitions) {
            return actionDefinitions(List.of(actionDefinitions));
        }
        @CustomType.Setter
        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public GetFirewallPolicyFirewallPolicyStatelessCustomAction build() {
            final var o = new GetFirewallPolicyFirewallPolicyStatelessCustomAction();
            o.actionDefinitions = actionDefinitions;
            o.actionName = actionName;
            return o;
        }
    }
}
