// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs extends com.pulumi.resources.ResourceArgs {

    public static final RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs Empty = new RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs();

    /**
     * The email HTML body.
     * 
     */
    @Import(name="htmlBody", required=true)
    private Output<String> htmlBody;

    /**
     * @return The email HTML body.
     * 
     */
    public Output<String> htmlBody() {
        return this.htmlBody;
    }

    /**
     * The email subject.
     * 
     */
    @Import(name="subject", required=true)
    private Output<String> subject;

    /**
     * @return The email subject.
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }

    /**
     * The email text body.
     * 
     */
    @Import(name="textBody", required=true)
    private Output<String> textBody;

    /**
     * @return The email text body.
     * 
     */
    public Output<String> textBody() {
        return this.textBody;
    }

    private RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs() {}

    private RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs $) {
        this.htmlBody = $.htmlBody;
        this.subject = $.subject;
        this.textBody = $.textBody;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs $;

        public Builder() {
            $ = new RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs();
        }

        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs defaults) {
            $ = new RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param htmlBody The email HTML body.
         * 
         * @return builder
         * 
         */
        public Builder htmlBody(Output<String> htmlBody) {
            $.htmlBody = htmlBody;
            return this;
        }

        /**
         * @param htmlBody The email HTML body.
         * 
         * @return builder
         * 
         */
        public Builder htmlBody(String htmlBody) {
            return htmlBody(Output.of(htmlBody));
        }

        /**
         * @param subject The email subject.
         * 
         * @return builder
         * 
         */
        public Builder subject(Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The email subject.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param textBody The email text body.
         * 
         * @return builder
         * 
         */
        public Builder textBody(Output<String> textBody) {
            $.textBody = textBody;
            return this;
        }

        /**
         * @param textBody The email text body.
         * 
         * @return builder
         * 
         */
        public Builder textBody(String textBody) {
            return textBody(Output.of(textBody));
        }

        public RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs build() {
            if ($.htmlBody == null) {
                throw new MissingRequiredPropertyException("RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs", "htmlBody");
            }
            if ($.subject == null) {
                throw new MissingRequiredPropertyException("RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs", "subject");
            }
            if ($.textBody == null) {
                throw new MissingRequiredPropertyException("RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmailArgs", "textBody");
            }
            return $;
        }
    }

}
