// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs;
import com.pulumi.aws.bedrock.inputs.AgentDataSourceServerSideEncryptionConfigurationArgs;
import com.pulumi.aws.bedrock.inputs.AgentDataSourceTimeoutsArgs;
import com.pulumi.aws.bedrock.inputs.AgentDataSourceVectorIngestionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentDataSourceState extends com.pulumi.resources.ResourceArgs {

    public static final AgentDataSourceState Empty = new AgentDataSourceState();

    @Import(name="dataDeletionPolicy")
    private @Nullable Output<String> dataDeletionPolicy;

    public Optional<Output<String>> dataDeletionPolicy() {
        return Optional.ofNullable(this.dataDeletionPolicy);
    }

    @Import(name="dataSourceConfiguration")
    private @Nullable Output<AgentDataSourceDataSourceConfigurationArgs> dataSourceConfiguration;

    public Optional<Output<AgentDataSourceDataSourceConfigurationArgs>> dataSourceConfiguration() {
        return Optional.ofNullable(this.dataSourceConfiguration);
    }

    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="knowledgeBaseId")
    private @Nullable Output<String> knowledgeBaseId;

    public Optional<Output<String>> knowledgeBaseId() {
        return Optional.ofNullable(this.knowledgeBaseId);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="serverSideEncryptionConfiguration")
    private @Nullable Output<AgentDataSourceServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Optional<Output<AgentDataSourceServerSideEncryptionConfigurationArgs>> serverSideEncryptionConfiguration() {
        return Optional.ofNullable(this.serverSideEncryptionConfiguration);
    }

    @Import(name="timeouts")
    private @Nullable Output<AgentDataSourceTimeoutsArgs> timeouts;

    public Optional<Output<AgentDataSourceTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    @Import(name="vectorIngestionConfiguration")
    private @Nullable Output<AgentDataSourceVectorIngestionConfigurationArgs> vectorIngestionConfiguration;

    public Optional<Output<AgentDataSourceVectorIngestionConfigurationArgs>> vectorIngestionConfiguration() {
        return Optional.ofNullable(this.vectorIngestionConfiguration);
    }

    private AgentDataSourceState() {}

    private AgentDataSourceState(AgentDataSourceState $) {
        this.dataDeletionPolicy = $.dataDeletionPolicy;
        this.dataSourceConfiguration = $.dataSourceConfiguration;
        this.dataSourceId = $.dataSourceId;
        this.description = $.description;
        this.knowledgeBaseId = $.knowledgeBaseId;
        this.name = $.name;
        this.serverSideEncryptionConfiguration = $.serverSideEncryptionConfiguration;
        this.timeouts = $.timeouts;
        this.vectorIngestionConfiguration = $.vectorIngestionConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentDataSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentDataSourceState $;

        public Builder() {
            $ = new AgentDataSourceState();
        }

        public Builder(AgentDataSourceState defaults) {
            $ = new AgentDataSourceState(Objects.requireNonNull(defaults));
        }

        public Builder dataDeletionPolicy(@Nullable Output<String> dataDeletionPolicy) {
            $.dataDeletionPolicy = dataDeletionPolicy;
            return this;
        }

        public Builder dataDeletionPolicy(String dataDeletionPolicy) {
            return dataDeletionPolicy(Output.of(dataDeletionPolicy));
        }

        public Builder dataSourceConfiguration(@Nullable Output<AgentDataSourceDataSourceConfigurationArgs> dataSourceConfiguration) {
            $.dataSourceConfiguration = dataSourceConfiguration;
            return this;
        }

        public Builder dataSourceConfiguration(AgentDataSourceDataSourceConfigurationArgs dataSourceConfiguration) {
            return dataSourceConfiguration(Output.of(dataSourceConfiguration));
        }

        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder knowledgeBaseId(@Nullable Output<String> knowledgeBaseId) {
            $.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            return knowledgeBaseId(Output.of(knowledgeBaseId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serverSideEncryptionConfiguration(@Nullable Output<AgentDataSourceServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            $.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder serverSideEncryptionConfiguration(AgentDataSourceServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(Output.of(serverSideEncryptionConfiguration));
        }

        public Builder timeouts(@Nullable Output<AgentDataSourceTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(AgentDataSourceTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public Builder vectorIngestionConfiguration(@Nullable Output<AgentDataSourceVectorIngestionConfigurationArgs> vectorIngestionConfiguration) {
            $.vectorIngestionConfiguration = vectorIngestionConfiguration;
            return this;
        }

        public Builder vectorIngestionConfiguration(AgentDataSourceVectorIngestionConfigurationArgs vectorIngestionConfiguration) {
            return vectorIngestionConfiguration(Output.of(vectorIngestionConfiguration));
        }

        public AgentDataSourceState build() {
            return $;
        }
    }

}
