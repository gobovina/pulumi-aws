// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingProfileQueueConfigsAssociated {
    /**
     * @return Specifies the channels that agents can handle in the Contact Control Panel (CCP). Valid values are `VOICE`, `CHAT`, `TASK`.
     * 
     */
    private @Nullable String channel;
    /**
     * @return Specifies the delay, in seconds, that a contact should be in the queue before they are routed to an available agent
     * 
     */
    private @Nullable Integer delay;
    /**
     * @return Specifies the order in which contacts are to be handled for the queue.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return Specifies the ARN for the queue.
     * 
     */
    private @Nullable String queueArn;
    /**
     * @return Specifies the identifier for the queue.
     * 
     */
    private @Nullable String queueId;
    /**
     * @return Specifies the name for the queue.
     * 
     */
    private @Nullable String queueName;

    private RoutingProfileQueueConfigsAssociated() {}
    /**
     * @return Specifies the channels that agents can handle in the Contact Control Panel (CCP). Valid values are `VOICE`, `CHAT`, `TASK`.
     * 
     */
    public Optional<String> channel() {
        return Optional.ofNullable(this.channel);
    }
    /**
     * @return Specifies the delay, in seconds, that a contact should be in the queue before they are routed to an available agent
     * 
     */
    public Optional<Integer> delay() {
        return Optional.ofNullable(this.delay);
    }
    /**
     * @return Specifies the order in which contacts are to be handled for the queue.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Specifies the ARN for the queue.
     * 
     */
    public Optional<String> queueArn() {
        return Optional.ofNullable(this.queueArn);
    }
    /**
     * @return Specifies the identifier for the queue.
     * 
     */
    public Optional<String> queueId() {
        return Optional.ofNullable(this.queueId);
    }
    /**
     * @return Specifies the name for the queue.
     * 
     */
    public Optional<String> queueName() {
        return Optional.ofNullable(this.queueName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProfileQueueConfigsAssociated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String channel;
        private @Nullable Integer delay;
        private @Nullable Integer priority;
        private @Nullable String queueArn;
        private @Nullable String queueId;
        private @Nullable String queueName;
        public Builder() {}
        public Builder(RoutingProfileQueueConfigsAssociated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.delay = defaults.delay;
    	      this.priority = defaults.priority;
    	      this.queueArn = defaults.queueArn;
    	      this.queueId = defaults.queueId;
    	      this.queueName = defaults.queueName;
        }

        @CustomType.Setter
        public Builder channel(@Nullable String channel) {
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder delay(@Nullable Integer delay) {
            this.delay = delay;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder queueArn(@Nullable String queueArn) {
            this.queueArn = queueArn;
            return this;
        }
        @CustomType.Setter
        public Builder queueId(@Nullable String queueId) {
            this.queueId = queueId;
            return this;
        }
        @CustomType.Setter
        public Builder queueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }
        public RoutingProfileQueueConfigsAssociated build() {
            final var o = new RoutingProfileQueueConfigsAssociated();
            o.channel = channel;
            o.delay = delay;
            o.priority = priority;
            o.queueArn = queueArn;
            o.queueId = queueId;
            o.queueName = queueName;
            return o;
        }
    }
}
