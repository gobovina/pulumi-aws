// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SelectionConditionStringNotLikeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelectionConditionStringNotLikeArgs Empty = new SelectionConditionStringNotLikeArgs();

    /**
     * The key in a key-value pair.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key in a key-value pair.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value in a key-value pair.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value in a key-value pair.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SelectionConditionStringNotLikeArgs() {}

    private SelectionConditionStringNotLikeArgs(SelectionConditionStringNotLikeArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectionConditionStringNotLikeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectionConditionStringNotLikeArgs $;

        public Builder() {
            $ = new SelectionConditionStringNotLikeArgs();
        }

        public Builder(SelectionConditionStringNotLikeArgs defaults) {
            $ = new SelectionConditionStringNotLikeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key in a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key in a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value in a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value in a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SelectionConditionStringNotLikeArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("SelectionConditionStringNotLikeArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("SelectionConditionStringNotLikeArgs", "value");
            }
            return $;
        }
    }

}
