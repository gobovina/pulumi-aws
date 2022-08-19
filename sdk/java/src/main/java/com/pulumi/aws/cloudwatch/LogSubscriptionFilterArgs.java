// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogSubscriptionFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogSubscriptionFilterArgs Empty = new LogSubscriptionFilterArgs();

    /**
     * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    /**
     * @return The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    /**
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are &#34;Random&#34; and &#34;ByLogStream&#34;.
     * 
     */
    @Import(name="distribution")
    private @Nullable Output<String> distribution;

    /**
     * @return The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are &#34;Random&#34; and &#34;ByLogStream&#34;.
     * 
     */
    public Optional<Output<String>> distribution() {
        return Optional.ofNullable(this.distribution);
    }

    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. Use empty string `&#34;&#34;` to match everything. For more information, see the [Amazon CloudWatch Logs User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html).
     * 
     */
    @Import(name="filterPattern", required=true)
    private Output<String> filterPattern;

    /**
     * @return A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. Use empty string `&#34;&#34;` to match everything. For more information, see the [Amazon CloudWatch Logs User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html).
     * 
     */
    public Output<String> filterPattern() {
        return this.filterPattern;
    }

    /**
     * The name of the log group to associate the subscription filter with
     * 
     */
    @Import(name="logGroup", required=true)
    private Output<String> logGroup;

    /**
     * @return The name of the log group to associate the subscription filter with
     * 
     */
    public Output<String> logGroup() {
        return this.logGroup;
    }

    /**
     * A name for the subscription filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the subscription filter
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private LogSubscriptionFilterArgs() {}

    private LogSubscriptionFilterArgs(LogSubscriptionFilterArgs $) {
        this.destinationArn = $.destinationArn;
        this.distribution = $.distribution;
        this.filterPattern = $.filterPattern;
        this.logGroup = $.logGroup;
        this.name = $.name;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSubscriptionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSubscriptionFilterArgs $;

        public Builder() {
            $ = new LogSubscriptionFilterArgs();
        }

        public Builder(LogSubscriptionFilterArgs defaults) {
            $ = new LogSubscriptionFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationArn The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        /**
         * @param destinationArn The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        /**
         * @param distribution The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are &#34;Random&#34; and &#34;ByLogStream&#34;.
         * 
         * @return builder
         * 
         */
        public Builder distribution(@Nullable Output<String> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are &#34;Random&#34; and &#34;ByLogStream&#34;.
         * 
         * @return builder
         * 
         */
        public Builder distribution(String distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param filterPattern A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. Use empty string `&#34;&#34;` to match everything. For more information, see the [Amazon CloudWatch Logs User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html).
         * 
         * @return builder
         * 
         */
        public Builder filterPattern(Output<String> filterPattern) {
            $.filterPattern = filterPattern;
            return this;
        }

        /**
         * @param filterPattern A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. Use empty string `&#34;&#34;` to match everything. For more information, see the [Amazon CloudWatch Logs User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html).
         * 
         * @return builder
         * 
         */
        public Builder filterPattern(String filterPattern) {
            return filterPattern(Output.of(filterPattern));
        }

        /**
         * @param logGroup The name of the log group to associate the subscription filter with
         * 
         * @return builder
         * 
         */
        public Builder logGroup(Output<String> logGroup) {
            $.logGroup = logGroup;
            return this;
        }

        /**
         * @param logGroup The name of the log group to associate the subscription filter with
         * 
         * @return builder
         * 
         */
        public Builder logGroup(String logGroup) {
            return logGroup(Output.of(logGroup));
        }

        /**
         * @param name A name for the subscription filter
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the subscription filter
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public LogSubscriptionFilterArgs build() {
            $.destinationArn = Objects.requireNonNull($.destinationArn, "expected parameter 'destinationArn' to be non-null");
            $.filterPattern = Objects.requireNonNull($.filterPattern, "expected parameter 'filterPattern' to be non-null");
            $.logGroup = Objects.requireNonNull($.logGroup, "expected parameter 'logGroup' to be non-null");
            return $;
        }
    }

}
