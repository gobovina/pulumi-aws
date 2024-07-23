// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmincidents.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResponsePlanIntegrationPagerduty {
    /**
     * @return The name of the response plan.
     * 
     */
    private String name;
    /**
     * @return The ID of the AWS Secrets Manager secret that stores your PagerDuty key &amp;mdash; either a General Access REST API Key or User Token REST API Key &amp;mdash; and other user credentials.
     * 
     * For more information about the constraints for each field, see [CreateResponsePlan](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateResponsePlan.html) in the *AWS Systems Manager Incident Manager API Reference*.
     * 
     */
    private String secretId;
    /**
     * @return The ID of the PagerDuty service that the response plan associated with the incident at launch.
     * 
     */
    private String serviceId;

    private ResponsePlanIntegrationPagerduty() {}
    /**
     * @return The name of the response plan.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the AWS Secrets Manager secret that stores your PagerDuty key &amp;mdash; either a General Access REST API Key or User Token REST API Key &amp;mdash; and other user credentials.
     * 
     * For more information about the constraints for each field, see [CreateResponsePlan](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateResponsePlan.html) in the *AWS Systems Manager Incident Manager API Reference*.
     * 
     */
    public String secretId() {
        return this.secretId;
    }
    /**
     * @return The ID of the PagerDuty service that the response plan associated with the incident at launch.
     * 
     */
    public String serviceId() {
        return this.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanIntegrationPagerduty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String secretId;
        private String serviceId;
        public Builder() {}
        public Builder(ResponsePlanIntegrationPagerduty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretId = defaults.secretId;
    	      this.serviceId = defaults.serviceId;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ResponsePlanIntegrationPagerduty", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder secretId(String secretId) {
            if (secretId == null) {
              throw new MissingRequiredPropertyException("ResponsePlanIntegrationPagerduty", "secretId");
            }
            this.secretId = secretId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceId(String serviceId) {
            if (serviceId == null) {
              throw new MissingRequiredPropertyException("ResponsePlanIntegrationPagerduty", "serviceId");
            }
            this.serviceId = serviceId;
            return this;
        }
        public ResponsePlanIntegrationPagerduty build() {
            final var _resultValue = new ResponsePlanIntegrationPagerduty();
            _resultValue.name = name;
            _resultValue.secretId = secretId;
            _resultValue.serviceId = serviceId;
            return _resultValue;
        }
    }
}
