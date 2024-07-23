// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mwaa.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentLoggingConfigurationTaskLogs {
    private @Nullable String cloudWatchLogGroupArn;
    /**
     * @return Enabling or disabling the collection of logs
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    private @Nullable String logLevel;

    private EnvironmentLoggingConfigurationTaskLogs() {}
    public Optional<String> cloudWatchLogGroupArn() {
        return Optional.ofNullable(this.cloudWatchLogGroupArn);
    }
    /**
     * @return Enabling or disabling the collection of logs
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    public Optional<String> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationTaskLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudWatchLogGroupArn;
        private @Nullable Boolean enabled;
        private @Nullable String logLevel;
        public Builder() {}
        public Builder(EnvironmentLoggingConfigurationTaskLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        @CustomType.Setter
        public Builder cloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {

            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder logLevel(@Nullable String logLevel) {

            this.logLevel = logLevel;
            return this;
        }
        public EnvironmentLoggingConfigurationTaskLogs build() {
            final var _resultValue = new EnvironmentLoggingConfigurationTaskLogs();
            _resultValue.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            _resultValue.enabled = enabled;
            _resultValue.logLevel = logLevel;
            return _resultValue;
        }
    }
}
