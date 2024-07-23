// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MaintenanceWindowTaskTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTargetArgs Empty = new MaintenanceWindowTaskTargetArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * The array of strings.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The array of strings.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private MaintenanceWindowTaskTargetArgs() {}

    private MaintenanceWindowTaskTargetArgs(MaintenanceWindowTaskTargetArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowTaskTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowTaskTargetArgs $;

        public Builder() {
            $ = new MaintenanceWindowTaskTargetArgs();
        }

        public Builder(MaintenanceWindowTaskTargetArgs defaults) {
            $ = new MaintenanceWindowTaskTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The array of strings.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public MaintenanceWindowTaskTargetArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("MaintenanceWindowTaskTargetArgs", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("MaintenanceWindowTaskTargetArgs", "values");
            }
            return $;
        }
    }

}
