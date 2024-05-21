// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.aws.bedrock.inputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentKnowledgeBaseKnowledgeBaseConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgentKnowledgeBaseKnowledgeBaseConfigurationArgs Empty = new AgentKnowledgeBaseKnowledgeBaseConfigurationArgs();

    /**
     * Type of data that the data source is converted into for the knowledge base. Valid Values: `VECTOR`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of data that the data source is converted into for the knowledge base. Valid Values: `VECTOR`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Details about the embeddings model that&#39;sused to convert the data source. See `vector_knowledge_base_configuration` block for details.
     * 
     */
    @Import(name="vectorKnowledgeBaseConfiguration")
    private @Nullable Output<AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs> vectorKnowledgeBaseConfiguration;

    /**
     * @return Details about the embeddings model that&#39;sused to convert the data source. See `vector_knowledge_base_configuration` block for details.
     * 
     */
    public Optional<Output<AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs>> vectorKnowledgeBaseConfiguration() {
        return Optional.ofNullable(this.vectorKnowledgeBaseConfiguration);
    }

    private AgentKnowledgeBaseKnowledgeBaseConfigurationArgs() {}

    private AgentKnowledgeBaseKnowledgeBaseConfigurationArgs(AgentKnowledgeBaseKnowledgeBaseConfigurationArgs $) {
        this.type = $.type;
        this.vectorKnowledgeBaseConfiguration = $.vectorKnowledgeBaseConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentKnowledgeBaseKnowledgeBaseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentKnowledgeBaseKnowledgeBaseConfigurationArgs $;

        public Builder() {
            $ = new AgentKnowledgeBaseKnowledgeBaseConfigurationArgs();
        }

        public Builder(AgentKnowledgeBaseKnowledgeBaseConfigurationArgs defaults) {
            $ = new AgentKnowledgeBaseKnowledgeBaseConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of data that the data source is converted into for the knowledge base. Valid Values: `VECTOR`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of data that the data source is converted into for the knowledge base. Valid Values: `VECTOR`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vectorKnowledgeBaseConfiguration Details about the embeddings model that&#39;sused to convert the data source. See `vector_knowledge_base_configuration` block for details.
         * 
         * @return builder
         * 
         */
        public Builder vectorKnowledgeBaseConfiguration(@Nullable Output<AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs> vectorKnowledgeBaseConfiguration) {
            $.vectorKnowledgeBaseConfiguration = vectorKnowledgeBaseConfiguration;
            return this;
        }

        /**
         * @param vectorKnowledgeBaseConfiguration Details about the embeddings model that&#39;sused to convert the data source. See `vector_knowledge_base_configuration` block for details.
         * 
         * @return builder
         * 
         */
        public Builder vectorKnowledgeBaseConfiguration(AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfigurationArgs vectorKnowledgeBaseConfiguration) {
            return vectorKnowledgeBaseConfiguration(Output.of(vectorKnowledgeBaseConfiguration));
        }

        public AgentKnowledgeBaseKnowledgeBaseConfigurationArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AgentKnowledgeBaseKnowledgeBaseConfigurationArgs", "type");
            }
            return $;
        }
    }

}
