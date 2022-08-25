// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glacier.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VaultNotification {
    /**
     * @return You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    private List<String> events;
    /**
     * @return The SNS Topic ARN.
     * 
     */
    private String snsTopic;

    private VaultNotification() {}
    /**
     * @return You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
     * 
     */
    public List<String> events() {
        return this.events;
    }
    /**
     * @return The SNS Topic ARN.
     * 
     */
    public String snsTopic() {
        return this.snsTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> events;
        private String snsTopic;
        public Builder() {}
        public Builder(VaultNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.snsTopic = defaults.snsTopic;
        }

        @CustomType.Setter
        public Builder events(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }
        @CustomType.Setter
        public Builder snsTopic(String snsTopic) {
            this.snsTopic = Objects.requireNonNull(snsTopic);
            return this;
        }
        public VaultNotification build() {
            final var o = new VaultNotification();
            o.events = events;
            o.snsTopic = snsTopic;
            return o;
        }
    }
}
