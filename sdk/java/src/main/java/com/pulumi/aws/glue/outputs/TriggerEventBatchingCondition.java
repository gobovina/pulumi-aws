// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerEventBatchingCondition {
    /**
     * @return Number of events that must be received from Amazon EventBridge before EventBridge  event trigger fires.
     * 
     */
    private Integer batchSize;
    /**
     * @return Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is received. Default value is `900`.
     * 
     */
    private @Nullable Integer batchWindow;

    private TriggerEventBatchingCondition() {}
    /**
     * @return Number of events that must be received from Amazon EventBridge before EventBridge  event trigger fires.
     * 
     */
    public Integer batchSize() {
        return this.batchSize;
    }
    /**
     * @return Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is received. Default value is `900`.
     * 
     */
    public Optional<Integer> batchWindow() {
        return Optional.ofNullable(this.batchWindow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerEventBatchingCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer batchSize;
        private @Nullable Integer batchWindow;
        public Builder() {}
        public Builder(TriggerEventBatchingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.batchWindow = defaults.batchWindow;
        }

        @CustomType.Setter
        public Builder batchSize(Integer batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }
        @CustomType.Setter
        public Builder batchWindow(@Nullable Integer batchWindow) {
            this.batchWindow = batchWindow;
            return this;
        }
        public TriggerEventBatchingCondition build() {
            final var o = new TriggerEventBatchingCondition();
            o.batchSize = batchSize;
            o.batchWindow = batchWindow;
            return o;
        }
    }
}
