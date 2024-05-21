// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs Empty = new AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs();

    /**
     * ARN of the secret that you created in AWS Secrets Manager that is linked to your Redis Enterprise Cloud database.
     * 
     */
    @Import(name="credentialsSecretArn", required=true)
    private Output<String> credentialsSecretArn;

    /**
     * @return ARN of the secret that you created in AWS Secrets Manager that is linked to your Redis Enterprise Cloud database.
     * 
     */
    public Output<String> credentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * Endpoint URL of the Redis Enterprise Cloud database.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Endpoint URL of the Redis Enterprise Cloud database.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * 
     */
    @Import(name="fieldMapping")
    private @Nullable Output<AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs> fieldMapping;

    /**
     * @return The names of the fields to which to map information about the vector store. This block supports the following arguments:
     * 
     */
    public Optional<Output<AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs>> fieldMapping() {
        return Optional.ofNullable(this.fieldMapping);
    }

    /**
     * Name of the vector index.
     * 
     */
    @Import(name="vectorIndexName", required=true)
    private Output<String> vectorIndexName;

    /**
     * @return Name of the vector index.
     * 
     */
    public Output<String> vectorIndexName() {
        return this.vectorIndexName;
    }

    private AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs() {}

    private AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs(AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs $) {
        this.credentialsSecretArn = $.credentialsSecretArn;
        this.endpoint = $.endpoint;
        this.fieldMapping = $.fieldMapping;
        this.vectorIndexName = $.vectorIndexName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs $;

        public Builder() {
            $ = new AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs();
        }

        public Builder(AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs defaults) {
            $ = new AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentialsSecretArn ARN of the secret that you created in AWS Secrets Manager that is linked to your Redis Enterprise Cloud database.
         * 
         * @return builder
         * 
         */
        public Builder credentialsSecretArn(Output<String> credentialsSecretArn) {
            $.credentialsSecretArn = credentialsSecretArn;
            return this;
        }

        /**
         * @param credentialsSecretArn ARN of the secret that you created in AWS Secrets Manager that is linked to your Redis Enterprise Cloud database.
         * 
         * @return builder
         * 
         */
        public Builder credentialsSecretArn(String credentialsSecretArn) {
            return credentialsSecretArn(Output.of(credentialsSecretArn));
        }

        /**
         * @param endpoint Endpoint URL of the Redis Enterprise Cloud database.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint URL of the Redis Enterprise Cloud database.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder fieldMapping(@Nullable Output<AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs> fieldMapping) {
            $.fieldMapping = fieldMapping;
            return this;
        }

        /**
         * @param fieldMapping The names of the fields to which to map information about the vector store. This block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder fieldMapping(AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationFieldMappingArgs fieldMapping) {
            return fieldMapping(Output.of(fieldMapping));
        }

        /**
         * @param vectorIndexName Name of the vector index.
         * 
         * @return builder
         * 
         */
        public Builder vectorIndexName(Output<String> vectorIndexName) {
            $.vectorIndexName = vectorIndexName;
            return this;
        }

        /**
         * @param vectorIndexName Name of the vector index.
         * 
         * @return builder
         * 
         */
        public Builder vectorIndexName(String vectorIndexName) {
            return vectorIndexName(Output.of(vectorIndexName));
        }

        public AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs build() {
            if ($.credentialsSecretArn == null) {
                throw new MissingRequiredPropertyException("AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs", "credentialsSecretArn");
            }
            if ($.endpoint == null) {
                throw new MissingRequiredPropertyException("AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs", "endpoint");
            }
            if ($.vectorIndexName == null) {
                throw new MissingRequiredPropertyException("AgentKnowledgeBaseStorageConfigurationRedisEnterpriseCloudConfigurationArgs", "vectorIndexName");
            }
            return $;
        }
    }

}
