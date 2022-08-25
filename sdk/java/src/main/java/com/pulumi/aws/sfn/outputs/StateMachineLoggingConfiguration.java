// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StateMachineLoggingConfiguration {
    /**
     * @return Determines whether execution data is included in your log. When set to `false`, data is excluded.
     * 
     */
    private @Nullable Boolean includeExecutionData;
    /**
     * @return Defines which category of execution history events are logged. Valid values: `ALL`, `ERROR`, `FATAL`, `OFF`
     * 
     */
    private @Nullable String level;
    /**
     * @return Amazon Resource Name (ARN) of a CloudWatch log group. Make sure the State Machine has the correct IAM policies for logging. The ARN must end with `:*`
     * 
     */
    private @Nullable String logDestination;

    private StateMachineLoggingConfiguration() {}
    /**
     * @return Determines whether execution data is included in your log. When set to `false`, data is excluded.
     * 
     */
    public Optional<Boolean> includeExecutionData() {
        return Optional.ofNullable(this.includeExecutionData);
    }
    /**
     * @return Defines which category of execution history events are logged. Valid values: `ALL`, `ERROR`, `FATAL`, `OFF`
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return Amazon Resource Name (ARN) of a CloudWatch log group. Make sure the State Machine has the correct IAM policies for logging. The ARN must end with `:*`
     * 
     */
    public Optional<String> logDestination() {
        return Optional.ofNullable(this.logDestination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLoggingConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean includeExecutionData;
        private @Nullable String level;
        private @Nullable String logDestination;
        public Builder() {}
        public Builder(StateMachineLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeExecutionData = defaults.includeExecutionData;
    	      this.level = defaults.level;
    	      this.logDestination = defaults.logDestination;
        }

        @CustomType.Setter
        public Builder includeExecutionData(@Nullable Boolean includeExecutionData) {
            this.includeExecutionData = includeExecutionData;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder logDestination(@Nullable String logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public StateMachineLoggingConfiguration build() {
            final var o = new StateMachineLoggingConfiguration();
            o.includeExecutionData = includeExecutionData;
            o.level = level;
            o.logDestination = logDestination;
            return o;
        }
    }
}
