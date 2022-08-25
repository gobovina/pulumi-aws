// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader {
    /**
     * @return Label string.
     * 
     */
    private String name;
    /**
     * @return Value of the custom header.
     * 
     */
    private String value;

    private WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader() {}
    /**
     * @return Label string.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the custom header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader build() {
            final var o = new WebAclRuleActionCaptchaCustomRequestHandlingInsertHeader();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
