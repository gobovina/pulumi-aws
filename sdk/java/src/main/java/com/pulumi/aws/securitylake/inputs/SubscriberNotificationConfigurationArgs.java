// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securitylake.inputs;

import com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs;
import com.pulumi.aws.securitylake.inputs.SubscriberNotificationConfigurationSqsNotificationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriberNotificationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriberNotificationConfigurationArgs Empty = new SubscriberNotificationConfigurationArgs();

    /**
     * The configurations for HTTPS subscriber notification.
     * 
     */
    @Import(name="httpsNotificationConfiguration")
    private @Nullable Output<SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs> httpsNotificationConfiguration;

    /**
     * @return The configurations for HTTPS subscriber notification.
     * 
     */
    public Optional<Output<SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs>> httpsNotificationConfiguration() {
        return Optional.ofNullable(this.httpsNotificationConfiguration);
    }

    /**
     * The configurations for SQS subscriber notification.
     * There are no parameters within `sqs_notification_configuration`.
     * 
     */
    @Import(name="sqsNotificationConfiguration")
    private @Nullable Output<SubscriberNotificationConfigurationSqsNotificationConfigurationArgs> sqsNotificationConfiguration;

    /**
     * @return The configurations for SQS subscriber notification.
     * There are no parameters within `sqs_notification_configuration`.
     * 
     */
    public Optional<Output<SubscriberNotificationConfigurationSqsNotificationConfigurationArgs>> sqsNotificationConfiguration() {
        return Optional.ofNullable(this.sqsNotificationConfiguration);
    }

    private SubscriberNotificationConfigurationArgs() {}

    private SubscriberNotificationConfigurationArgs(SubscriberNotificationConfigurationArgs $) {
        this.httpsNotificationConfiguration = $.httpsNotificationConfiguration;
        this.sqsNotificationConfiguration = $.sqsNotificationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriberNotificationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriberNotificationConfigurationArgs $;

        public Builder() {
            $ = new SubscriberNotificationConfigurationArgs();
        }

        public Builder(SubscriberNotificationConfigurationArgs defaults) {
            $ = new SubscriberNotificationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpsNotificationConfiguration The configurations for HTTPS subscriber notification.
         * 
         * @return builder
         * 
         */
        public Builder httpsNotificationConfiguration(@Nullable Output<SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs> httpsNotificationConfiguration) {
            $.httpsNotificationConfiguration = httpsNotificationConfiguration;
            return this;
        }

        /**
         * @param httpsNotificationConfiguration The configurations for HTTPS subscriber notification.
         * 
         * @return builder
         * 
         */
        public Builder httpsNotificationConfiguration(SubscriberNotificationConfigurationHttpsNotificationConfigurationArgs httpsNotificationConfiguration) {
            return httpsNotificationConfiguration(Output.of(httpsNotificationConfiguration));
        }

        /**
         * @param sqsNotificationConfiguration The configurations for SQS subscriber notification.
         * There are no parameters within `sqs_notification_configuration`.
         * 
         * @return builder
         * 
         */
        public Builder sqsNotificationConfiguration(@Nullable Output<SubscriberNotificationConfigurationSqsNotificationConfigurationArgs> sqsNotificationConfiguration) {
            $.sqsNotificationConfiguration = sqsNotificationConfiguration;
            return this;
        }

        /**
         * @param sqsNotificationConfiguration The configurations for SQS subscriber notification.
         * There are no parameters within `sqs_notification_configuration`.
         * 
         * @return builder
         * 
         */
        public Builder sqsNotificationConfiguration(SubscriberNotificationConfigurationSqsNotificationConfigurationArgs sqsNotificationConfiguration) {
            return sqsNotificationConfiguration(Output.of(sqsNotificationConfiguration));
        }

        public SubscriberNotificationConfigurationArgs build() {
            return $;
        }
    }

}
