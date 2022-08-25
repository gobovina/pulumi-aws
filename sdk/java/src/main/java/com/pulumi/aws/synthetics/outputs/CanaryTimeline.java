// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanaryTimeline {
    /**
     * @return Date and time the canary was created.
     * 
     */
    private @Nullable String created;
    /**
     * @return Date and time the canary was most recently modified.
     * 
     */
    private @Nullable String lastModified;
    /**
     * @return Date and time that the canary&#39;s most recent run started.
     * 
     */
    private @Nullable String lastStarted;
    /**
     * @return Date and time that the canary&#39;s most recent run ended.
     * 
     */
    private @Nullable String lastStopped;

    private CanaryTimeline() {}
    /**
     * @return Date and time the canary was created.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return Date and time the canary was most recently modified.
     * 
     */
    public Optional<String> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }
    /**
     * @return Date and time that the canary&#39;s most recent run started.
     * 
     */
    public Optional<String> lastStarted() {
        return Optional.ofNullable(this.lastStarted);
    }
    /**
     * @return Date and time that the canary&#39;s most recent run ended.
     * 
     */
    public Optional<String> lastStopped() {
        return Optional.ofNullable(this.lastStopped);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryTimeline defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String created;
        private @Nullable String lastModified;
        private @Nullable String lastStarted;
        private @Nullable String lastStopped;
        public Builder() {}
        public Builder(CanaryTimeline defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.lastModified = defaults.lastModified;
    	      this.lastStarted = defaults.lastStarted;
    	      this.lastStopped = defaults.lastStopped;
        }

        @CustomType.Setter
        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder lastModified(@Nullable String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        @CustomType.Setter
        public Builder lastStarted(@Nullable String lastStarted) {
            this.lastStarted = lastStarted;
            return this;
        }
        @CustomType.Setter
        public Builder lastStopped(@Nullable String lastStopped) {
            this.lastStopped = lastStopped;
            return this;
        }
        public CanaryTimeline build() {
            final var o = new CanaryTimeline();
            o.created = created;
            o.lastModified = lastModified;
            o.lastStarted = lastStarted;
            o.lastStopped = lastStopped;
            return o;
        }
    }
}
