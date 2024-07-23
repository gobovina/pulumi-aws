// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsEventSourceParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsEventSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsEventSourceArgs Empty = new LifecyclePolicyPolicyDetailsEventSourceArgs();

    @Import(name="parameters", required=true)
    private Output<LifecyclePolicyPolicyDetailsEventSourceParametersArgs> parameters;

    public Output<LifecyclePolicyPolicyDetailsEventSourceParametersArgs> parameters() {
        return this.parameters;
    }

    /**
     * The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LifecyclePolicyPolicyDetailsEventSourceArgs() {}

    private LifecyclePolicyPolicyDetailsEventSourceArgs(LifecyclePolicyPolicyDetailsEventSourceArgs $) {
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsEventSourceArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsEventSourceArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsEventSourceArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsEventSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameters(Output<LifecyclePolicyPolicyDetailsEventSourceParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(LifecyclePolicyPolicyDetailsEventSourceParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param type The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LifecyclePolicyPolicyDetailsEventSourceArgs build() {
            if ($.parameters == null) {
                throw new MissingRequiredPropertyException("LifecyclePolicyPolicyDetailsEventSourceArgs", "parameters");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("LifecyclePolicyPolicyDetailsEventSourceArgs", "type");
            }
            return $;
        }
    }

}
