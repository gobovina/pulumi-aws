// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionFixedResponse {
    /**
     * @return The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    private String contentType;
    /**
     * @return The message body.
     * 
     */
    private @Nullable String messageBody;
    /**
     * @return The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    private @Nullable String statusCode;

    private ListenerRuleActionFixedResponse() {}
    /**
     * @return The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return The message body.
     * 
     */
    public Optional<String> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    /**
     * @return The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    public Optional<String> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionFixedResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentType;
        private @Nullable String messageBody;
        private @Nullable String statusCode;
        public Builder() {}
        public Builder(ListenerRuleActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public ListenerRuleActionFixedResponse build() {
            final var o = new ListenerRuleActionFixedResponse();
            o.contentType = contentType;
            o.messageBody = messageBody;
            o.statusCode = statusCode;
            return o;
        }
    }
}
