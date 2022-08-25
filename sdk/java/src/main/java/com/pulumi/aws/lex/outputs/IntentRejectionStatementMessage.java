// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentRejectionStatementMessage {
    /**
     * @return The text of the message. Must be less than or equal to 1000 characters in length.
     * 
     */
    private String content;
    /**
     * @return The content type of the message string.
     * 
     */
    private String contentType;
    /**
     * @return Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
     */
    private @Nullable Integer groupNumber;

    private IntentRejectionStatementMessage() {}
    /**
     * @return The text of the message. Must be less than or equal to 1000 characters in length.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The content type of the message string.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response. Must be a number between 1 and 5 (inclusive).
     * 
     */
    public Optional<Integer> groupNumber() {
        return Optional.ofNullable(this.groupNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentRejectionStatementMessage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private String contentType;
        private @Nullable Integer groupNumber;
        public Builder() {}
        public Builder(IntentRejectionStatementMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.groupNumber = defaults.groupNumber;
        }

        @CustomType.Setter
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder groupNumber(@Nullable Integer groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }
        public IntentRejectionStatementMessage build() {
            final var o = new IntentRejectionStatementMessage();
            o.content = content;
            o.contentType = contentType;
            o.groupNumber = groupNumber;
            return o;
        }
    }
}
