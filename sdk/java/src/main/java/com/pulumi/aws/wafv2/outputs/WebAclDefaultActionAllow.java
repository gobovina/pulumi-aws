// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclDefaultActionAllowCustomRequestHandling;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclDefaultActionAllow {
    /**
     * @return Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    private @Nullable WebAclDefaultActionAllowCustomRequestHandling customRequestHandling;

    private WebAclDefaultActionAllow() {}
    /**
     * @return Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    public Optional<WebAclDefaultActionAllowCustomRequestHandling> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclDefaultActionAllowCustomRequestHandling customRequestHandling;
        public Builder() {}
        public Builder(WebAclDefaultActionAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        @CustomType.Setter
        public Builder customRequestHandling(@Nullable WebAclDefaultActionAllowCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public WebAclDefaultActionAllow build() {
            final var o = new WebAclDefaultActionAllow();
            o.customRequestHandling = customRequestHandling;
            return o;
        }
    }
}
