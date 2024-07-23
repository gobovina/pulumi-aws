// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs;
import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs Empty = new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs();

    @Import(name="errorHandlingConfig")
    private @Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs> errorHandlingConfig;

    public Optional<Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs>> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }

    @Import(name="idFieldNames")
    private @Nullable Output<List<String>> idFieldNames;

    public Optional<Output<List<String>>> idFieldNames() {
        return Optional.ofNullable(this.idFieldNames);
    }

    @Import(name="objectPath", required=true)
    private Output<String> objectPath;

    public Output<String> objectPath() {
        return this.objectPath;
    }

    /**
     * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
     * 
     */
    @Import(name="successResponseHandlingConfig")
    private @Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs> successResponseHandlingConfig;

    /**
     * @return Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
     * 
     */
    public Optional<Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs>> successResponseHandlingConfig() {
        return Optional.ofNullable(this.successResponseHandlingConfig);
    }

    @Import(name="writeOperationType")
    private @Nullable Output<String> writeOperationType;

    public Optional<Output<String>> writeOperationType() {
        return Optional.ofNullable(this.writeOperationType);
    }

    private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs() {}

    private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs $) {
        this.errorHandlingConfig = $.errorHandlingConfig;
        this.idFieldNames = $.idFieldNames;
        this.objectPath = $.objectPath;
        this.successResponseHandlingConfig = $.successResponseHandlingConfig;
        this.writeOperationType = $.writeOperationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs $;

        public Builder() {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs();
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs defaults) {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorHandlingConfig(@Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs> errorHandlingConfig) {
            $.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder errorHandlingConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigArgs errorHandlingConfig) {
            return errorHandlingConfig(Output.of(errorHandlingConfig));
        }

        public Builder idFieldNames(@Nullable Output<List<String>> idFieldNames) {
            $.idFieldNames = idFieldNames;
            return this;
        }

        public Builder idFieldNames(List<String> idFieldNames) {
            return idFieldNames(Output.of(idFieldNames));
        }

        public Builder idFieldNames(String... idFieldNames) {
            return idFieldNames(List.of(idFieldNames));
        }

        public Builder objectPath(Output<String> objectPath) {
            $.objectPath = objectPath;
            return this;
        }

        public Builder objectPath(String objectPath) {
            return objectPath(Output.of(objectPath));
        }

        /**
         * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder successResponseHandlingConfig(@Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs> successResponseHandlingConfig) {
            $.successResponseHandlingConfig = successResponseHandlingConfig;
            return this;
        }

        /**
         * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder successResponseHandlingConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigArgs successResponseHandlingConfig) {
            return successResponseHandlingConfig(Output.of(successResponseHandlingConfig));
        }

        public Builder writeOperationType(@Nullable Output<String> writeOperationType) {
            $.writeOperationType = writeOperationType;
            return this;
        }

        public Builder writeOperationType(String writeOperationType) {
            return writeOperationType(Output.of(writeOperationType));
        }

        public FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs build() {
            if ($.objectPath == null) {
                throw new MissingRequiredPropertyException("FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataArgs", "objectPath");
            }
            return $;
        }
    }

}
