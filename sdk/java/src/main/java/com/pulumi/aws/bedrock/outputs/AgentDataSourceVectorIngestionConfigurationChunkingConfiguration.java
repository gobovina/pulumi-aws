// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.outputs;

import com.pulumi.aws.bedrock.outputs.AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AgentDataSourceVectorIngestionConfigurationChunkingConfiguration {
    private String chunkingStrategy;
    private @Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfiguration fixedSizeChunkingConfiguration;

    private AgentDataSourceVectorIngestionConfigurationChunkingConfiguration() {}
    public String chunkingStrategy() {
        return this.chunkingStrategy;
    }
    public Optional<AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfiguration> fixedSizeChunkingConfiguration() {
        return Optional.ofNullable(this.fixedSizeChunkingConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDataSourceVectorIngestionConfigurationChunkingConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String chunkingStrategy;
        private @Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfiguration fixedSizeChunkingConfiguration;
        public Builder() {}
        public Builder(AgentDataSourceVectorIngestionConfigurationChunkingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chunkingStrategy = defaults.chunkingStrategy;
    	      this.fixedSizeChunkingConfiguration = defaults.fixedSizeChunkingConfiguration;
        }

        @CustomType.Setter
        public Builder chunkingStrategy(String chunkingStrategy) {
            if (chunkingStrategy == null) {
              throw new MissingRequiredPropertyException("AgentDataSourceVectorIngestionConfigurationChunkingConfiguration", "chunkingStrategy");
            }
            this.chunkingStrategy = chunkingStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder fixedSizeChunkingConfiguration(@Nullable AgentDataSourceVectorIngestionConfigurationChunkingConfigurationFixedSizeChunkingConfiguration fixedSizeChunkingConfiguration) {

            this.fixedSizeChunkingConfiguration = fixedSizeChunkingConfiguration;
            return this;
        }
        public AgentDataSourceVectorIngestionConfigurationChunkingConfiguration build() {
            final var _resultValue = new AgentDataSourceVectorIngestionConfigurationChunkingConfiguration();
            _resultValue.chunkingStrategy = chunkingStrategy;
            _resultValue.fixedSizeChunkingConfiguration = fixedSizeChunkingConfiguration;
            return _resultValue;
        }
    }
}
