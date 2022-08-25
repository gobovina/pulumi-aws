// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BudgetNotification {
    /**
     * @return (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    private String comparisonOperator;
    /**
     * @return (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    private String notificationType;
    /**
     * @return (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    private @Nullable List<String> subscriberEmailAddresses;
    /**
     * @return (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    private @Nullable List<String> subscriberSnsTopicArns;
    /**
     * @return (Required) Threshold when the notification should be sent.
     * 
     */
    private Double threshold;
    /**
     * @return (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    private String thresholdType;

    private BudgetNotification() {}
    /**
     * @return (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    public String comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * @return (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    public String notificationType() {
        return this.notificationType;
    }
    /**
     * @return (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    public List<String> subscriberEmailAddresses() {
        return this.subscriberEmailAddresses == null ? List.of() : this.subscriberEmailAddresses;
    }
    /**
     * @return (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    public List<String> subscriberSnsTopicArns() {
        return this.subscriberSnsTopicArns == null ? List.of() : this.subscriberSnsTopicArns;
    }
    /**
     * @return (Required) Threshold when the notification should be sent.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    public String thresholdType() {
        return this.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comparisonOperator;
        private String notificationType;
        private @Nullable List<String> subscriberEmailAddresses;
        private @Nullable List<String> subscriberSnsTopicArns;
        private Double threshold;
        private String thresholdType;
        public Builder() {}
        public Builder(BudgetNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.notificationType = defaults.notificationType;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.subscriberSnsTopicArns = defaults.subscriberSnsTopicArns;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        @CustomType.Setter
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        @CustomType.Setter
        public Builder notificationType(String notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }
        @CustomType.Setter
        public Builder subscriberEmailAddresses(@Nullable List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }
        public Builder subscriberEmailAddresses(String... subscriberEmailAddresses) {
            return subscriberEmailAddresses(List.of(subscriberEmailAddresses));
        }
        @CustomType.Setter
        public Builder subscriberSnsTopicArns(@Nullable List<String> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }
        public Builder subscriberSnsTopicArns(String... subscriberSnsTopicArns) {
            return subscriberSnsTopicArns(List.of(subscriberSnsTopicArns));
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdType(String thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }
        public BudgetNotification build() {
            final var o = new BudgetNotification();
            o.comparisonOperator = comparisonOperator;
            o.notificationType = notificationType;
            o.subscriberEmailAddresses = subscriberEmailAddresses;
            o.subscriberSnsTopicArns = subscriberSnsTopicArns;
            o.threshold = threshold;
            o.thresholdType = thresholdType;
            return o;
        }
    }
}
