// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction {
    private String eventAction;
    /**
     * @return Whether to send a notification.
     * 
     */
    private Boolean notify;

    private RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction() {}
    public String eventAction() {
        return this.eventAction;
    }
    /**
     * @return Whether to send a notification.
     * 
     */
    public Boolean notify_() {
        return this.notify;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventAction;
        private Boolean notify;
        public Builder() {}
        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventAction = defaults.eventAction;
    	      this.notify = defaults.notify;
        }

        @CustomType.Setter
        public Builder eventAction(String eventAction) {
            if (eventAction == null) {
              throw new MissingRequiredPropertyException("RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction", "eventAction");
            }
            this.eventAction = eventAction;
            return this;
        }
        @CustomType.Setter("notify")
        public Builder notify_(Boolean notify) {
            if (notify == null) {
              throw new MissingRequiredPropertyException("RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction", "notify");
            }
            this.notify = notify;
            return this;
        }
        public RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction build() {
            final var _resultValue = new RiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction();
            _resultValue.eventAction = eventAction;
            _resultValue.notify = notify;
            return _resultValue;
        }
    }
}
