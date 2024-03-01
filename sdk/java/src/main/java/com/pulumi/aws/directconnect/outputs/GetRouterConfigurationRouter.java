// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouterConfigurationRouter {
    /**
     * @return Router platform
     * 
     */
    private String platform;
    /**
     * @return ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     * 
     * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
     * 
     */
    private String routerTypeIdentifier;
    /**
     * @return Router operating system
     * 
     */
    private String software;
    /**
     * @return Router vendor
     * 
     */
    private String vendor;
    /**
     * @return Router XSLT Template Name
     * 
     */
    private String xsltTemplateName;
    private String xsltTemplateNameForMacSec;

    private GetRouterConfigurationRouter() {}
    /**
     * @return Router platform
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
     * 
     * There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
     * 
     */
    public String routerTypeIdentifier() {
        return this.routerTypeIdentifier;
    }
    /**
     * @return Router operating system
     * 
     */
    public String software() {
        return this.software;
    }
    /**
     * @return Router vendor
     * 
     */
    public String vendor() {
        return this.vendor;
    }
    /**
     * @return Router XSLT Template Name
     * 
     */
    public String xsltTemplateName() {
        return this.xsltTemplateName;
    }
    public String xsltTemplateNameForMacSec() {
        return this.xsltTemplateNameForMacSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterConfigurationRouter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String platform;
        private String routerTypeIdentifier;
        private String software;
        private String vendor;
        private String xsltTemplateName;
        private String xsltTemplateNameForMacSec;
        public Builder() {}
        public Builder(GetRouterConfigurationRouter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platform = defaults.platform;
    	      this.routerTypeIdentifier = defaults.routerTypeIdentifier;
    	      this.software = defaults.software;
    	      this.vendor = defaults.vendor;
    	      this.xsltTemplateName = defaults.xsltTemplateName;
    	      this.xsltTemplateNameForMacSec = defaults.xsltTemplateNameForMacSec;
        }

        @CustomType.Setter
        public Builder platform(String platform) {
            if (platform == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "platform");
            }
            this.platform = platform;
            return this;
        }
        @CustomType.Setter
        public Builder routerTypeIdentifier(String routerTypeIdentifier) {
            if (routerTypeIdentifier == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "routerTypeIdentifier");
            }
            this.routerTypeIdentifier = routerTypeIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder software(String software) {
            if (software == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "software");
            }
            this.software = software;
            return this;
        }
        @CustomType.Setter
        public Builder vendor(String vendor) {
            if (vendor == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "vendor");
            }
            this.vendor = vendor;
            return this;
        }
        @CustomType.Setter
        public Builder xsltTemplateName(String xsltTemplateName) {
            if (xsltTemplateName == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "xsltTemplateName");
            }
            this.xsltTemplateName = xsltTemplateName;
            return this;
        }
        @CustomType.Setter
        public Builder xsltTemplateNameForMacSec(String xsltTemplateNameForMacSec) {
            if (xsltTemplateNameForMacSec == null) {
              throw new MissingRequiredPropertyException("GetRouterConfigurationRouter", "xsltTemplateNameForMacSec");
            }
            this.xsltTemplateNameForMacSec = xsltTemplateNameForMacSec;
            return this;
        }
        public GetRouterConfigurationRouter build() {
            final var _resultValue = new GetRouterConfigurationRouter();
            _resultValue.platform = platform;
            _resultValue.routerTypeIdentifier = routerTypeIdentifier;
            _resultValue.software = software;
            _resultValue.vendor = vendor;
            _resultValue.xsltTemplateName = xsltTemplateName;
            _resultValue.xsltTemplateNameForMacSec = xsltTemplateNameForMacSec;
            return _resultValue;
        }
    }
}
