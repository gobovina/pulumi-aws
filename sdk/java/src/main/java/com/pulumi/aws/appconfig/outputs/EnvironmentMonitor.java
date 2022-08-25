// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentMonitor {
    /**
     * @return ARN of the Amazon CloudWatch alarm.
     * 
     */
    private String alarmArn;
    /**
     * @return ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
     */
    private @Nullable String alarmRoleArn;

    private EnvironmentMonitor() {}
    /**
     * @return ARN of the Amazon CloudWatch alarm.
     * 
     */
    public String alarmArn() {
        return this.alarmArn;
    }
    /**
     * @return ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
     */
    public Optional<String> alarmRoleArn() {
        return Optional.ofNullable(this.alarmRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alarmArn;
        private @Nullable String alarmRoleArn;
        public Builder() {}
        public Builder(EnvironmentMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.alarmRoleArn = defaults.alarmRoleArn;
        }

        @CustomType.Setter
        public Builder alarmArn(String alarmArn) {
            this.alarmArn = Objects.requireNonNull(alarmArn);
            return this;
        }
        @CustomType.Setter
        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }
        public EnvironmentMonitor build() {
            final var o = new EnvironmentMonitor();
            o.alarmArn = alarmArn;
            o.alarmRoleArn = alarmRoleArn;
            return o;
        }
    }
}
