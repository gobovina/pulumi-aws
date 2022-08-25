// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesAmplitude;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesDatadog;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesDynatrace;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesInforNexus;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesMarketo;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesS3;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesSalesforce;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesSapoData;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesServiceNow;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesSingular;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesSlack;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesVeeva;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfigSourceConnectorPropertiesZendesk;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfigSourceConnectorProperties {
    /**
     * @return The operation to be performed on the provided Amplitude source fields. The only valid value is `BETWEEN`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesAmplitude amplitude;
    /**
     * @return Operators supported by the custom connector. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector customConnector;
    /**
     * @return The operation to be performed on the provided Datadog source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesDatadog datadog;
    /**
     * @return The operation to be performed on the provided Dynatrace source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesDynatrace dynatrace;
    /**
     * @return The operation to be performed on the provided Google Analytics source fields. Valid values are `PROJECTION` and `BETWEEN`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics googleAnalytics;
    /**
     * @return The operation to be performed on the provided Infor Nexus source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesInforNexus inforNexus;
    /**
     * @return The operation to be performed on the provided Marketo source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesMarketo marketo;
    /**
     * @return The operation to be performed on the provided Amazon S3 source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesS3 s3;
    /**
     * @return The operation to be performed on the provided Salesforce source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSalesforce salesforce;
    /**
     * @return The operation to be performed on the provided SAPOData source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSapoData sapoData;
    /**
     * @return The operation to be performed on the provided ServiceNow source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesServiceNow serviceNow;
    /**
     * @return The operation to be performed on the provided Singular source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSingular singular;
    /**
     * @return The operation to be performed on the provided Slack source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSlack slack;
    /**
     * @return The operation to be performed on the provided Trend Micro source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro trendmicro;
    /**
     * @return The operation to be performed on the provided Veeva source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesVeeva veeva;
    /**
     * @return The operation to be performed on the provided Zendesk source fields. Valid values are `PROJECTION`, `GREATER_THAN`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesZendesk zendesk;

    private FlowSourceFlowConfigSourceConnectorProperties() {}
    /**
     * @return The operation to be performed on the provided Amplitude source fields. The only valid value is `BETWEEN`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesAmplitude> amplitude() {
        return Optional.ofNullable(this.amplitude);
    }
    /**
     * @return Operators supported by the custom connector. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector> customConnector() {
        return Optional.ofNullable(this.customConnector);
    }
    /**
     * @return The operation to be performed on the provided Datadog source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return The operation to be performed on the provided Dynatrace source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesDynatrace> dynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }
    /**
     * @return The operation to be performed on the provided Google Analytics source fields. Valid values are `PROJECTION` and `BETWEEN`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics> googleAnalytics() {
        return Optional.ofNullable(this.googleAnalytics);
    }
    /**
     * @return The operation to be performed on the provided Infor Nexus source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesInforNexus> inforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }
    /**
     * @return The operation to be performed on the provided Marketo source fields. Valid values are `PROJECTION`, `BETWEEN`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesMarketo> marketo() {
        return Optional.ofNullable(this.marketo);
    }
    /**
     * @return The operation to be performed on the provided Amazon S3 source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesS3> s3() {
        return Optional.ofNullable(this.s3);
    }
    /**
     * @return The operation to be performed on the provided Salesforce source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesSalesforce> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }
    /**
     * @return The operation to be performed on the provided SAPOData source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesSapoData> sapoData() {
        return Optional.ofNullable(this.sapoData);
    }
    /**
     * @return The operation to be performed on the provided ServiceNow source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesServiceNow> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }
    /**
     * @return The operation to be performed on the provided Singular source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesSingular> singular() {
        return Optional.ofNullable(this.singular);
    }
    /**
     * @return The operation to be performed on the provided Slack source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesSlack> slack() {
        return Optional.ofNullable(this.slack);
    }
    /**
     * @return The operation to be performed on the provided Trend Micro source fields. Valid values are `PROJECTION`, `EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro> trendmicro() {
        return Optional.ofNullable(this.trendmicro);
    }
    /**
     * @return The operation to be performed on the provided Veeva source fields. Valid values are `PROJECTION`, `LESS_THAN`, `GREATER_THAN`, `CONTAINS`, `BETWEEN`, `LESS_THAN_OR_EQUAL_TO`, `GREATER_THAN_OR_EQUAL_TO`, `EQUAL_TO`, `NOT_EQUAL_TO`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesVeeva> veeva() {
        return Optional.ofNullable(this.veeva);
    }
    /**
     * @return The operation to be performed on the provided Zendesk source fields. Valid values are `PROJECTION`, `GREATER_THAN`, `ADDITION`, `MULTIPLICATION`, `DIVISION`, `SUBTRACTION`, `MASK_ALL`, `MASK_FIRST_N`, `MASK_LAST_N`, `VALIDATE_NON_NULL`, `VALIDATE_NON_ZERO`, `VALIDATE_NON_NEGATIVE`, `VALIDATE_NUMERIC`, and `NO_OP`.
     * 
     */
    public Optional<FlowSourceFlowConfigSourceConnectorPropertiesZendesk> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigSourceConnectorProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesAmplitude amplitude;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector customConnector;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesDatadog datadog;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesDynatrace dynatrace;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics googleAnalytics;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesInforNexus inforNexus;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesMarketo marketo;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesS3 s3;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSalesforce salesforce;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSapoData sapoData;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesServiceNow serviceNow;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSingular singular;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesSlack slack;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro trendmicro;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesVeeva veeva;
        private @Nullable FlowSourceFlowConfigSourceConnectorPropertiesZendesk zendesk;
        public Builder() {}
        public Builder(FlowSourceFlowConfigSourceConnectorProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amplitude = defaults.amplitude;
    	      this.customConnector = defaults.customConnector;
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.googleAnalytics = defaults.googleAnalytics;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.sapoData = defaults.sapoData;
    	      this.serviceNow = defaults.serviceNow;
    	      this.singular = defaults.singular;
    	      this.slack = defaults.slack;
    	      this.trendmicro = defaults.trendmicro;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        @CustomType.Setter
        public Builder amplitude(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesAmplitude amplitude) {
            this.amplitude = amplitude;
            return this;
        }
        @CustomType.Setter
        public Builder customConnector(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesCustomConnector customConnector) {
            this.customConnector = customConnector;
            return this;
        }
        @CustomType.Setter
        public Builder datadog(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesDatadog datadog) {
            this.datadog = datadog;
            return this;
        }
        @CustomType.Setter
        public Builder dynatrace(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesDynatrace dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }
        @CustomType.Setter
        public Builder googleAnalytics(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalytics googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }
        @CustomType.Setter
        public Builder inforNexus(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesInforNexus inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }
        @CustomType.Setter
        public Builder marketo(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesMarketo marketo) {
            this.marketo = marketo;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesS3 s3) {
            this.s3 = s3;
            return this;
        }
        @CustomType.Setter
        public Builder salesforce(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesSalesforce salesforce) {
            this.salesforce = salesforce;
            return this;
        }
        @CustomType.Setter
        public Builder sapoData(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesSapoData sapoData) {
            this.sapoData = sapoData;
            return this;
        }
        @CustomType.Setter
        public Builder serviceNow(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesServiceNow serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }
        @CustomType.Setter
        public Builder singular(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesSingular singular) {
            this.singular = singular;
            return this;
        }
        @CustomType.Setter
        public Builder slack(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesSlack slack) {
            this.slack = slack;
            return this;
        }
        @CustomType.Setter
        public Builder trendmicro(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesTrendmicro trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }
        @CustomType.Setter
        public Builder veeva(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesVeeva veeva) {
            this.veeva = veeva;
            return this;
        }
        @CustomType.Setter
        public Builder zendesk(@Nullable FlowSourceFlowConfigSourceConnectorPropertiesZendesk zendesk) {
            this.zendesk = zendesk;
            return this;
        }
        public FlowSourceFlowConfigSourceConnectorProperties build() {
            final var o = new FlowSourceFlowConfigSourceConnectorProperties();
            o.amplitude = amplitude;
            o.customConnector = customConnector;
            o.datadog = datadog;
            o.dynatrace = dynatrace;
            o.googleAnalytics = googleAnalytics;
            o.inforNexus = inforNexus;
            o.marketo = marketo;
            o.s3 = s3;
            o.salesforce = salesforce;
            o.sapoData = sapoData;
            o.serviceNow = serviceNow;
            o.singular = singular;
            o.slack = slack;
            o.trendmicro = trendmicro;
            o.veeva = veeva;
            o.zendesk = zendesk;
            return o;
        }
    }
}
