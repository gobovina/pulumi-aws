// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.aws.pipes.inputs.PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeSourceParametersRabbitmqBrokerParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeSourceParametersRabbitmqBrokerParametersArgs Empty = new PipeSourceParametersRabbitmqBrokerParametersArgs();

    /**
     * The maximum number of records to include in each batch. Maximum value of 10000.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    /**
     * @return The maximum number of records to include in each batch. Maximum value of 10000.
     * 
     */
    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * The credentials needed to access the resource. Detailed below.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs> credentials;

    /**
     * @return The credentials needed to access the resource. Detailed below.
     * 
     */
    public Output<PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs> credentials() {
        return this.credentials;
    }

    /**
     * The maximum length of a time to wait for events. Maximum value of 300.
     * 
     */
    @Import(name="maximumBatchingWindowInSeconds")
    private @Nullable Output<Integer> maximumBatchingWindowInSeconds;

    /**
     * @return The maximum length of a time to wait for events. Maximum value of 300.
     * 
     */
    public Optional<Output<Integer>> maximumBatchingWindowInSeconds() {
        return Optional.ofNullable(this.maximumBatchingWindowInSeconds);
    }

    /**
     * The name of the destination queue to consume. Maximum length of 1000.
     * 
     */
    @Import(name="queueName", required=true)
    private Output<String> queueName;

    /**
     * @return The name of the destination queue to consume. Maximum length of 1000.
     * 
     */
    public Output<String> queueName() {
        return this.queueName;
    }

    /**
     * The name of the virtual host associated with the source broker. Maximum length of 200.
     * 
     */
    @Import(name="virtualHost")
    private @Nullable Output<String> virtualHost;

    /**
     * @return The name of the virtual host associated with the source broker. Maximum length of 200.
     * 
     */
    public Optional<Output<String>> virtualHost() {
        return Optional.ofNullable(this.virtualHost);
    }

    private PipeSourceParametersRabbitmqBrokerParametersArgs() {}

    private PipeSourceParametersRabbitmqBrokerParametersArgs(PipeSourceParametersRabbitmqBrokerParametersArgs $) {
        this.batchSize = $.batchSize;
        this.credentials = $.credentials;
        this.maximumBatchingWindowInSeconds = $.maximumBatchingWindowInSeconds;
        this.queueName = $.queueName;
        this.virtualHost = $.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeSourceParametersRabbitmqBrokerParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeSourceParametersRabbitmqBrokerParametersArgs $;

        public Builder() {
            $ = new PipeSourceParametersRabbitmqBrokerParametersArgs();
        }

        public Builder(PipeSourceParametersRabbitmqBrokerParametersArgs defaults) {
            $ = new PipeSourceParametersRabbitmqBrokerParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSize The maximum number of records to include in each batch. Maximum value of 10000.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param batchSize The maximum number of records to include in each batch. Maximum value of 10000.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        /**
         * @param credentials The credentials needed to access the resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The credentials needed to access the resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder credentials(PipeSourceParametersRabbitmqBrokerParametersCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. Maximum value of 300.
         * 
         * @return builder
         * 
         */
        public Builder maximumBatchingWindowInSeconds(@Nullable Output<Integer> maximumBatchingWindowInSeconds) {
            $.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        /**
         * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. Maximum value of 300.
         * 
         * @return builder
         * 
         */
        public Builder maximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
            return maximumBatchingWindowInSeconds(Output.of(maximumBatchingWindowInSeconds));
        }

        /**
         * @param queueName The name of the destination queue to consume. Maximum length of 1000.
         * 
         * @return builder
         * 
         */
        public Builder queueName(Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param queueName The name of the destination queue to consume. Maximum length of 1000.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        /**
         * @param virtualHost The name of the virtual host associated with the source broker. Maximum length of 200.
         * 
         * @return builder
         * 
         */
        public Builder virtualHost(@Nullable Output<String> virtualHost) {
            $.virtualHost = virtualHost;
            return this;
        }

        /**
         * @param virtualHost The name of the virtual host associated with the source broker. Maximum length of 200.
         * 
         * @return builder
         * 
         */
        public Builder virtualHost(String virtualHost) {
            return virtualHost(Output.of(virtualHost));
        }

        public PipeSourceParametersRabbitmqBrokerParametersArgs build() {
            if ($.credentials == null) {
                throw new MissingRequiredPropertyException("PipeSourceParametersRabbitmqBrokerParametersArgs", "credentials");
            }
            if ($.queueName == null) {
                throw new MissingRequiredPropertyException("PipeSourceParametersRabbitmqBrokerParametersArgs", "queueName");
            }
            return $;
        }
    }

}
