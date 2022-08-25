// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppLimits {
    /**
     * @return The maximum number of messages that the campaign can send daily.
     * 
     */
    private @Nullable Integer daily;
    /**
     * @return The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
     * 
     */
    private @Nullable Integer maximumDuration;
    /**
     * @return The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
     * 
     */
    private @Nullable Integer messagesPerSecond;
    /**
     * @return The maximum total number of messages that the campaign can send.
     * 
     */
    private @Nullable Integer total;

    private AppLimits() {}
    /**
     * @return The maximum number of messages that the campaign can send daily.
     * 
     */
    public Optional<Integer> daily() {
        return Optional.ofNullable(this.daily);
    }
    /**
     * @return The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
     * 
     */
    public Optional<Integer> maximumDuration() {
        return Optional.ofNullable(this.maximumDuration);
    }
    /**
     * @return The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
     * 
     */
    public Optional<Integer> messagesPerSecond() {
        return Optional.ofNullable(this.messagesPerSecond);
    }
    /**
     * @return The maximum total number of messages that the campaign can send.
     * 
     */
    public Optional<Integer> total() {
        return Optional.ofNullable(this.total);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer daily;
        private @Nullable Integer maximumDuration;
        private @Nullable Integer messagesPerSecond;
        private @Nullable Integer total;
        public Builder() {}
        public Builder(AppLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daily = defaults.daily;
    	      this.maximumDuration = defaults.maximumDuration;
    	      this.messagesPerSecond = defaults.messagesPerSecond;
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder daily(@Nullable Integer daily) {
            this.daily = daily;
            return this;
        }
        @CustomType.Setter
        public Builder maximumDuration(@Nullable Integer maximumDuration) {
            this.maximumDuration = maximumDuration;
            return this;
        }
        @CustomType.Setter
        public Builder messagesPerSecond(@Nullable Integer messagesPerSecond) {
            this.messagesPerSecond = messagesPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder total(@Nullable Integer total) {
            this.total = total;
            return this;
        }
        public AppLimits build() {
            final var o = new AppLimits();
            o.daily = daily;
            o.maximumDuration = maximumDuration;
            o.messagesPerSecond = messagesPerSecond;
            o.total = total;
            return o;
        }
    }
}
