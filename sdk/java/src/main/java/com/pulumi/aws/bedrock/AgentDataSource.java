// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.bedrock.AgentDataSourceArgs;
import com.pulumi.aws.bedrock.inputs.AgentDataSourceState;
import com.pulumi.aws.bedrock.outputs.AgentDataSourceDataSourceConfiguration;
import com.pulumi.aws.bedrock.outputs.AgentDataSourceServerSideEncryptionConfiguration;
import com.pulumi.aws.bedrock.outputs.AgentDataSourceTimeouts;
import com.pulumi.aws.bedrock.outputs.AgentDataSourceVectorIngestionConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Agents for Amazon Bedrock Data Source.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.bedrock.AgentDataSource;
 * import com.pulumi.aws.bedrock.AgentDataSourceArgs;
 * import com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationArgs;
 * import com.pulumi.aws.bedrock.inputs.AgentDataSourceDataSourceConfigurationS3ConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new AgentDataSource("example", AgentDataSourceArgs.builder()
 *             .knowledgeBaseId("EMDPPAYPZI")
 *             .name("example")
 *             .dataSourceConfiguration(AgentDataSourceDataSourceConfigurationArgs.builder()
 *                 .type("S3")
 *                 .s3Configuration(AgentDataSourceDataSourceConfigurationS3ConfigurationArgs.builder()
 *                     .bucketArn("arn:aws:s3:::example-bucket")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Agents for Amazon Bedrock Data Source using the data source ID and the knowledge base ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:bedrock/agentDataSource:AgentDataSource example GWCMFMQF6T,EMDPPAYPZI
 * ```
 * 
 */
@ResourceType(type="aws:bedrock/agentDataSource:AgentDataSource")
public class AgentDataSource extends com.pulumi.resources.CustomResource {
    /**
     * Data deletion policy for a data source. Valid values: `RETAIN`, `DELETE`.
     * 
     */
    @Export(name="dataDeletionPolicy", refs={String.class}, tree="[0]")
    private Output<String> dataDeletionPolicy;

    /**
     * @return Data deletion policy for a data source. Valid values: `RETAIN`, `DELETE`.
     * 
     */
    public Output<String> dataDeletionPolicy() {
        return this.dataDeletionPolicy;
    }
    /**
     * Details about how the data source is stored. See `data_source_configuration` block for details.
     * 
     */
    @Export(name="dataSourceConfiguration", refs={AgentDataSourceDataSourceConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AgentDataSourceDataSourceConfiguration> dataSourceConfiguration;

    /**
     * @return Details about how the data source is stored. See `data_source_configuration` block for details.
     * 
     */
    public Output<Optional<AgentDataSourceDataSourceConfiguration>> dataSourceConfiguration() {
        return Codegen.optional(this.dataSourceConfiguration);
    }
    /**
     * Unique identifier of the data source.
     * 
     */
    @Export(name="dataSourceId", refs={String.class}, tree="[0]")
    private Output<String> dataSourceId;

    /**
     * @return Unique identifier of the data source.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Description of the data source.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the data source.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the knowledge base to which the data source belongs.
     * 
     */
    @Export(name="knowledgeBaseId", refs={String.class}, tree="[0]")
    private Output<String> knowledgeBaseId;

    /**
     * @return Unique identifier of the knowledge base to which the data source belongs.
     * 
     */
    public Output<String> knowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    /**
     * Name of the data source.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the data source.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Details about the configuration of the server-side encryption. See `server_side_encryption_configuration` block for details.
     * 
     */
    @Export(name="serverSideEncryptionConfiguration", refs={AgentDataSourceServerSideEncryptionConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AgentDataSourceServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    /**
     * @return Details about the configuration of the server-side encryption. See `server_side_encryption_configuration` block for details.
     * 
     */
    public Output<Optional<AgentDataSourceServerSideEncryptionConfiguration>> serverSideEncryptionConfiguration() {
        return Codegen.optional(this.serverSideEncryptionConfiguration);
    }
    @Export(name="timeouts", refs={AgentDataSourceTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ AgentDataSourceTimeouts> timeouts;

    public Output<Optional<AgentDataSourceTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Details about the configuration of the server-side encryption. See `vector_ingestion_configuration` block for details.
     * 
     */
    @Export(name="vectorIngestionConfiguration", refs={AgentDataSourceVectorIngestionConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AgentDataSourceVectorIngestionConfiguration> vectorIngestionConfiguration;

    /**
     * @return Details about the configuration of the server-side encryption. See `vector_ingestion_configuration` block for details.
     * 
     */
    public Output<Optional<AgentDataSourceVectorIngestionConfiguration>> vectorIngestionConfiguration() {
        return Codegen.optional(this.vectorIngestionConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AgentDataSource(String name) {
        this(name, AgentDataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AgentDataSource(String name, AgentDataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AgentDataSource(String name, AgentDataSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/agentDataSource:AgentDataSource", name, args == null ? AgentDataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AgentDataSource(String name, Output<String> id, @Nullable AgentDataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/agentDataSource:AgentDataSource", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AgentDataSource get(String name, Output<String> id, @Nullable AgentDataSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AgentDataSource(name, id, state, options);
    }
}
