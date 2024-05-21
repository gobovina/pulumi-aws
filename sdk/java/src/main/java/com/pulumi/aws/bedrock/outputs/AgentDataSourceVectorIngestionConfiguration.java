// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.outputs;

import com.pulumi.aws.bedrock.outputs.AgentDataSourceVectorIngestionConfigurationChunkingConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AgentDataSourceVectorIngestionConfiguration {
    /**
     * @return Details about how to chunk the documents in the data source. A chunk refers to an excerpt from a data source that is returned when the knowledge base that it belongs to is queried. See `chunking_configuration` block for details.
     * 
     */
    private @Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfiguration chunkingConfiguration;

    private AgentDataSourceVectorIngestionConfiguration() {}
    /**
     * @return Details about how to chunk the documents in the data source. A chunk refers to an excerpt from a data source that is returned when the knowledge base that it belongs to is queried. See `chunking_configuration` block for details.
     * 
     */
    public Optional<AgentDataSourceVectorIngestionConfigurationChunkingConfiguration> chunkingConfiguration() {
        return Optional.ofNullable(this.chunkingConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDataSourceVectorIngestionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfiguration chunkingConfiguration;
        public Builder() {}
        public Builder(AgentDataSourceVectorIngestionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chunkingConfiguration = defaults.chunkingConfiguration;
        }

        @CustomType.Setter
        public Builder chunkingConfiguration(@Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfiguration chunkingConfiguration) {

            this.chunkingConfiguration = chunkingConfiguration;
            return this;
        }
        public AgentDataSourceVectorIngestionConfiguration build() {
            final var _resultValue = new AgentDataSourceVectorIngestionConfiguration();
            _resultValue.chunkingConfiguration = chunkingConfiguration;
            return _resultValue;
        }
    }
}
