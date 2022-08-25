// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBotAssociationLexBot {
    /**
     * @return The Region that the Amazon Lex (V1) bot was created in.
     * 
     */
    private String lexRegion;
    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    private String name;

    private GetBotAssociationLexBot() {}
    /**
     * @return The Region that the Amazon Lex (V1) bot was created in.
     * 
     */
    public String lexRegion() {
        return this.lexRegion;
    }
    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAssociationLexBot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lexRegion;
        private String name;
        public Builder() {}
        public Builder(GetBotAssociationLexBot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lexRegion = defaults.lexRegion;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder lexRegion(String lexRegion) {
            this.lexRegion = Objects.requireNonNull(lexRegion);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetBotAssociationLexBot build() {
            final var o = new GetBotAssociationLexBot();
            o.lexRegion = lexRegion;
            o.name = name;
            return o;
        }
    }
}
