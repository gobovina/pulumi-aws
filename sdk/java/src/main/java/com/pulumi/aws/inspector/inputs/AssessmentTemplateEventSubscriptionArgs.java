// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AssessmentTemplateEventSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentTemplateEventSubscriptionArgs Empty = new AssessmentTemplateEventSubscriptionArgs();

    /**
     * The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
     * 
     */
    @Import(name="event", required=true)
    private Output<String> event;

    /**
     * @return The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
     * 
     */
    public Output<String> event() {
        return this.event;
    }

    /**
     * The ARN of the SNS topic to which notifications are sent.
     * 
     */
    @Import(name="topicArn", required=true)
    private Output<String> topicArn;

    /**
     * @return The ARN of the SNS topic to which notifications are sent.
     * 
     */
    public Output<String> topicArn() {
        return this.topicArn;
    }

    private AssessmentTemplateEventSubscriptionArgs() {}

    private AssessmentTemplateEventSubscriptionArgs(AssessmentTemplateEventSubscriptionArgs $) {
        this.event = $.event;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentTemplateEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentTemplateEventSubscriptionArgs $;

        public Builder() {
            $ = new AssessmentTemplateEventSubscriptionArgs();
        }

        public Builder(AssessmentTemplateEventSubscriptionArgs defaults) {
            $ = new AssessmentTemplateEventSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param event The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
         * 
         * @return builder
         * 
         */
        public Builder event(Output<String> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
         * 
         * @return builder
         * 
         */
        public Builder event(String event) {
            return event(Output.of(event));
        }

        /**
         * @param topicArn The ARN of the SNS topic to which notifications are sent.
         * 
         * @return builder
         * 
         */
        public Builder topicArn(Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn The ARN of the SNS topic to which notifications are sent.
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public AssessmentTemplateEventSubscriptionArgs build() {
            if ($.event == null) {
                throw new MissingRequiredPropertyException("AssessmentTemplateEventSubscriptionArgs", "event");
            }
            if ($.topicArn == null) {
                throw new MissingRequiredPropertyException("AssessmentTemplateEventSubscriptionArgs", "topicArn");
            }
            return $;
        }
    }

}
