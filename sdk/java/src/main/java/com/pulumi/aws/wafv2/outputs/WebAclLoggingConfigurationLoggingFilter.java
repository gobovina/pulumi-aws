// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclLoggingConfigurationLoggingFilterFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclLoggingConfigurationLoggingFilter {
    /**
     * @return Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
     * 
     */
    private String defaultBehavior;
    /**
     * @return Filter(s) that you want to apply to the logs. See Filter below for more details.
     * 
     */
    private List<WebAclLoggingConfigurationLoggingFilterFilter> filters;

    private WebAclLoggingConfigurationLoggingFilter() {}
    /**
     * @return Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
     * 
     */
    public String defaultBehavior() {
        return this.defaultBehavior;
    }
    /**
     * @return Filter(s) that you want to apply to the logs. See Filter below for more details.
     * 
     */
    public List<WebAclLoggingConfigurationLoggingFilterFilter> filters() {
        return this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultBehavior;
        private List<WebAclLoggingConfigurationLoggingFilterFilter> filters;
        public Builder() {}
        public Builder(WebAclLoggingConfigurationLoggingFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBehavior = defaults.defaultBehavior;
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder defaultBehavior(String defaultBehavior) {
            this.defaultBehavior = Objects.requireNonNull(defaultBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder filters(List<WebAclLoggingConfigurationLoggingFilterFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(WebAclLoggingConfigurationLoggingFilterFilter... filters) {
            return filters(List.of(filters));
        }
        public WebAclLoggingConfigurationLoggingFilter build() {
            final var o = new WebAclLoggingConfigurationLoggingFilter();
            o.defaultBehavior = defaultBehavior;
            o.filters = filters;
            return o;
        }
    }
}
