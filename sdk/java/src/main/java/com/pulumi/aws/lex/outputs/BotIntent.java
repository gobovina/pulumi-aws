// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotIntent {
    /**
     * @return The name of the intent. Must be less than or equal to 100 characters in length.
     * 
     */
    private String intentName;
    /**
     * @return The version of the intent. Must be less than or equal to 64 characters in length.
     * 
     */
    private String intentVersion;

    private BotIntent() {}
    /**
     * @return The name of the intent. Must be less than or equal to 100 characters in length.
     * 
     */
    public String intentName() {
        return this.intentName;
    }
    /**
     * @return The version of the intent. Must be less than or equal to 64 characters in length.
     * 
     */
    public String intentVersion() {
        return this.intentVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String intentName;
        private String intentVersion;
        public Builder() {}
        public Builder(BotIntent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intentName = defaults.intentName;
    	      this.intentVersion = defaults.intentVersion;
        }

        @CustomType.Setter
        public Builder intentName(String intentName) {
            this.intentName = Objects.requireNonNull(intentName);
            return this;
        }
        @CustomType.Setter
        public Builder intentVersion(String intentVersion) {
            this.intentVersion = Objects.requireNonNull(intentVersion);
            return this;
        }
        public BotIntent build() {
            final var o = new BotIntent();
            o.intentName = intentName;
            o.intentVersion = intentVersion;
            return o;
        }
    }
}
