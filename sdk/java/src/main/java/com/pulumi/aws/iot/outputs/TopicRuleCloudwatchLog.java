// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleCloudwatchLog {
    /**
     * @return The CloudWatch log group name.
     * 
     */
    private String logGroupName;
    /**
     * @return The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    private String roleArn;

    private TopicRuleCloudwatchLog() {}
    /**
     * @return The CloudWatch log group name.
     * 
     */
    public String logGroupName() {
        return this.logGroupName;
    }
    /**
     * @return The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String logGroupName;
        private String roleArn;
        public Builder() {}
        public Builder(TopicRuleCloudwatchLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleCloudwatchLog build() {
            final var o = new TopicRuleCloudwatchLog();
            o.logGroupName = logGroupName;
            o.roleArn = roleArn;
            return o;
        }
    }
}
