// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallFirewallStatusSyncStateAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallFirewallStatusSyncState {
    /**
     * @return Nested list describing the attachment status of the firewall&#39;s association with a single VPC subnet.
     * 
     */
    private @Nullable List<FirewallFirewallStatusSyncStateAttachment> attachments;
    /**
     * @return The Availability Zone where the subnet is configured.
     * 
     */
    private @Nullable String availabilityZone;

    private FirewallFirewallStatusSyncState() {}
    /**
     * @return Nested list describing the attachment status of the firewall&#39;s association with a single VPC subnet.
     * 
     */
    public List<FirewallFirewallStatusSyncStateAttachment> attachments() {
        return this.attachments == null ? List.of() : this.attachments;
    }
    /**
     * @return The Availability Zone where the subnet is configured.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FirewallFirewallStatusSyncStateAttachment> attachments;
        private @Nullable String availabilityZone;
        public Builder() {}
        public Builder(FirewallFirewallStatusSyncState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.availabilityZone = defaults.availabilityZone;
        }

        @CustomType.Setter
        public Builder attachments(@Nullable List<FirewallFirewallStatusSyncStateAttachment> attachments) {
            this.attachments = attachments;
            return this;
        }
        public Builder attachments(FirewallFirewallStatusSyncStateAttachment... attachments) {
            return attachments(List.of(attachments));
        }
        @CustomType.Setter
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public FirewallFirewallStatusSyncState build() {
            final var o = new FirewallFirewallStatusSyncState();
            o.attachments = attachments;
            o.availabilityZone = availabilityZone;
            return o;
        }
    }
}
