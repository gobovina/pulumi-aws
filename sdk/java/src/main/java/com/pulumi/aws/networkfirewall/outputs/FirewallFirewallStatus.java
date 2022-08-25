// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallFirewallStatusSyncState;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirewallFirewallStatus {
    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    private @Nullable List<FirewallFirewallStatusSyncState> syncStates;

    private FirewallFirewallStatus() {}
    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    public List<FirewallFirewallStatusSyncState> syncStates() {
        return this.syncStates == null ? List.of() : this.syncStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FirewallFirewallStatusSyncState> syncStates;
        public Builder() {}
        public Builder(FirewallFirewallStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.syncStates = defaults.syncStates;
        }

        @CustomType.Setter
        public Builder syncStates(@Nullable List<FirewallFirewallStatusSyncState> syncStates) {
            this.syncStates = syncStates;
            return this;
        }
        public Builder syncStates(FirewallFirewallStatusSyncState... syncStates) {
            return syncStates(List.of(syncStates));
        }
        public FirewallFirewallStatus build() {
            final var o = new FirewallFirewallStatus();
            o.syncStates = syncStates;
            return o;
        }
    }
}
