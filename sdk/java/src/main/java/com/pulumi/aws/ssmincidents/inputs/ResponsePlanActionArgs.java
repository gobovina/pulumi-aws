// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmincidents.inputs;

import com.pulumi.aws.ssmincidents.inputs.ResponsePlanActionSsmAutomationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePlanActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePlanActionArgs Empty = new ResponsePlanActionArgs();

    /**
     * The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
     * 
     */
    @Import(name="ssmAutomations")
    private @Nullable Output<List<ResponsePlanActionSsmAutomationArgs>> ssmAutomations;

    /**
     * @return The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
     * 
     */
    public Optional<Output<List<ResponsePlanActionSsmAutomationArgs>>> ssmAutomations() {
        return Optional.ofNullable(this.ssmAutomations);
    }

    private ResponsePlanActionArgs() {}

    private ResponsePlanActionArgs(ResponsePlanActionArgs $) {
        this.ssmAutomations = $.ssmAutomations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanActionArgs $;

        public Builder() {
            $ = new ResponsePlanActionArgs();
        }

        public Builder(ResponsePlanActionArgs defaults) {
            $ = new ResponsePlanActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ssmAutomations The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
         * 
         * @return builder
         * 
         */
        public Builder ssmAutomations(@Nullable Output<List<ResponsePlanActionSsmAutomationArgs>> ssmAutomations) {
            $.ssmAutomations = ssmAutomations;
            return this;
        }

        /**
         * @param ssmAutomations The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
         * 
         * @return builder
         * 
         */
        public Builder ssmAutomations(List<ResponsePlanActionSsmAutomationArgs> ssmAutomations) {
            return ssmAutomations(Output.of(ssmAutomations));
        }

        /**
         * @param ssmAutomations The Systems Manager automation document to start as the runbook at the beginning of the incident. The following values are supported:
         * 
         * @return builder
         * 
         */
        public Builder ssmAutomations(ResponsePlanActionSsmAutomationArgs... ssmAutomations) {
            return ssmAutomations(List.of(ssmAutomations));
        }

        public ResponsePlanActionArgs build() {
            return $;
        }
    }

}
