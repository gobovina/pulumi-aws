// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail {
    /**
     * @return The email HTML body.
     * 
     */
    private String htmlBody;
    /**
     * @return The email subject.
     * 
     */
    private String subject;
    private String textBody;

    private RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail() {}
    /**
     * @return The email HTML body.
     * 
     */
    public String htmlBody() {
        return this.htmlBody;
    }
    /**
     * @return The email subject.
     * 
     */
    public String subject() {
        return this.subject;
    }
    public String textBody() {
        return this.textBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String htmlBody;
        private String subject;
        private String textBody;
        public Builder() {}
        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.htmlBody = defaults.htmlBody;
    	      this.subject = defaults.subject;
    	      this.textBody = defaults.textBody;
        }

        @CustomType.Setter
        public Builder htmlBody(String htmlBody) {
            this.htmlBody = Objects.requireNonNull(htmlBody);
            return this;
        }
        @CustomType.Setter
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        @CustomType.Setter
        public Builder textBody(String textBody) {
            this.textBody = Objects.requireNonNull(textBody);
            return this;
        }
        public RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail build() {
            final var o = new RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationNoActionEmail();
            o.htmlBody = htmlBody;
            o.subject = subject;
            o.textBody = textBody;
            return o;
        }
    }
}
