// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.aws.apigateway.inputs.UsagePlanApiStageThrottleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanApiStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsagePlanApiStageArgs Empty = new UsagePlanApiStageArgs();

    /**
     * API Id of the associated API stage in a usage plan.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API Id of the associated API stage in a usage plan.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * API stage name of the associated API stage in a usage plan.
     * 
     */
    @Import(name="stage", required=true)
    private Output<String> stage;

    /**
     * @return API stage name of the associated API stage in a usage plan.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }

    /**
     * The throttling limits of the usage plan.
     * 
     */
    @Import(name="throttles")
    private @Nullable Output<List<UsagePlanApiStageThrottleArgs>> throttles;

    /**
     * @return The throttling limits of the usage plan.
     * 
     */
    public Optional<Output<List<UsagePlanApiStageThrottleArgs>>> throttles() {
        return Optional.ofNullable(this.throttles);
    }

    private UsagePlanApiStageArgs() {}

    private UsagePlanApiStageArgs(UsagePlanApiStageArgs $) {
        this.apiId = $.apiId;
        this.stage = $.stage;
        this.throttles = $.throttles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanApiStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanApiStageArgs $;

        public Builder() {
            $ = new UsagePlanApiStageArgs();
        }

        public Builder(UsagePlanApiStageArgs defaults) {
            $ = new UsagePlanApiStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API Id of the associated API stage in a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API Id of the associated API stage in a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param stage API stage name of the associated API stage in a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder stage(Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage API stage name of the associated API stage in a usage plan.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        /**
         * @param throttles The throttling limits of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder throttles(@Nullable Output<List<UsagePlanApiStageThrottleArgs>> throttles) {
            $.throttles = throttles;
            return this;
        }

        /**
         * @param throttles The throttling limits of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder throttles(List<UsagePlanApiStageThrottleArgs> throttles) {
            return throttles(Output.of(throttles));
        }

        /**
         * @param throttles The throttling limits of the usage plan.
         * 
         * @return builder
         * 
         */
        public Builder throttles(UsagePlanApiStageThrottleArgs... throttles) {
            return throttles(List.of(throttles));
        }

        public UsagePlanApiStageArgs build() {
            if ($.apiId == null) {
                throw new MissingRequiredPropertyException("UsagePlanApiStageArgs", "apiId");
            }
            if ($.stage == null) {
                throw new MissingRequiredPropertyException("UsagePlanApiStageArgs", "stage");
            }
            return $;
        }
    }

}
