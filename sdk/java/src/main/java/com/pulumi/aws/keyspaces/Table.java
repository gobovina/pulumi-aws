// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.keyspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.keyspaces.TableArgs;
import com.pulumi.aws.keyspaces.inputs.TableState;
import com.pulumi.aws.keyspaces.outputs.TableCapacitySpecification;
import com.pulumi.aws.keyspaces.outputs.TableClientSideTimestamps;
import com.pulumi.aws.keyspaces.outputs.TableComment;
import com.pulumi.aws.keyspaces.outputs.TableEncryptionSpecification;
import com.pulumi.aws.keyspaces.outputs.TablePointInTimeRecovery;
import com.pulumi.aws.keyspaces.outputs.TableSchemaDefinition;
import com.pulumi.aws.keyspaces.outputs.TableTtl;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Keyspaces Table.
 * 
 * More information about Keyspaces tables can be found in the [Keyspaces Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.keyspaces.Table;
 * import com.pulumi.aws.keyspaces.TableArgs;
 * import com.pulumi.aws.keyspaces.inputs.TableSchemaDefinitionArgs;
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
 *         var example = new Table(&#34;example&#34;, TableArgs.builder()        
 *             .keyspaceName(aws_keyspaces_keyspace.example().name())
 *             .tableName(&#34;my_table&#34;)
 *             .schemaDefinition(TableSchemaDefinitionArgs.builder()
 *                 .columns(TableSchemaDefinitionColumnArgs.builder()
 *                     .name(&#34;Message&#34;)
 *                     .type(&#34;ASCII&#34;)
 *                     .build())
 *                 .partitionKeys(TableSchemaDefinitionPartitionKeyArgs.builder()
 *                     .name(&#34;Message&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import a table using the `keyspace_name` and `table_name` separated by `/`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:keyspaces/table:Table example my_keyspace/my_table
 * ```
 * 
 */
@ResourceType(type="aws:keyspaces/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the table.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the table.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the read/write throughput capacity mode for the table.
     * 
     */
    @Export(name="capacitySpecification", refs={TableCapacitySpecification.class}, tree="[0]")
    private Output<TableCapacitySpecification> capacitySpecification;

    /**
     * @return Specifies the read/write throughput capacity mode for the table.
     * 
     */
    public Output<TableCapacitySpecification> capacitySpecification() {
        return this.capacitySpecification;
    }
    /**
     * Enables client-side timestamps for the table. By default, the setting is disabled.
     * 
     */
    @Export(name="clientSideTimestamps", refs={TableClientSideTimestamps.class}, tree="[0]")
    private Output</* @Nullable */ TableClientSideTimestamps> clientSideTimestamps;

    /**
     * @return Enables client-side timestamps for the table. By default, the setting is disabled.
     * 
     */
    public Output<Optional<TableClientSideTimestamps>> clientSideTimestamps() {
        return Codegen.optional(this.clientSideTimestamps);
    }
    /**
     * A description of the table.
     * 
     */
    @Export(name="comment", refs={TableComment.class}, tree="[0]")
    private Output<TableComment> comment;

    /**
     * @return A description of the table.
     * 
     */
    public Output<TableComment> comment() {
        return this.comment;
    }
    /**
     * The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
     * 
     */
    @Export(name="defaultTimeToLive", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultTimeToLive;

    /**
     * @return The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
     * 
     */
    public Output<Optional<Integer>> defaultTimeToLive() {
        return Codegen.optional(this.defaultTimeToLive);
    }
    /**
     * Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     * 
     */
    @Export(name="encryptionSpecification", refs={TableEncryptionSpecification.class}, tree="[0]")
    private Output<TableEncryptionSpecification> encryptionSpecification;

    /**
     * @return Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     * 
     */
    public Output<TableEncryptionSpecification> encryptionSpecification() {
        return this.encryptionSpecification;
    }
    /**
     * The name of the keyspace that the table is going to be created in.
     * 
     */
    @Export(name="keyspaceName", refs={String.class}, tree="[0]")
    private Output<String> keyspaceName;

    /**
     * @return The name of the keyspace that the table is going to be created in.
     * 
     */
    public Output<String> keyspaceName() {
        return this.keyspaceName;
    }
    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     * 
     */
    @Export(name="pointInTimeRecovery", refs={TablePointInTimeRecovery.class}, tree="[0]")
    private Output<TablePointInTimeRecovery> pointInTimeRecovery;

    /**
     * @return Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     * 
     */
    public Output<TablePointInTimeRecovery> pointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }
    /**
     * Describes the schema of the table.
     * 
     */
    @Export(name="schemaDefinition", refs={TableSchemaDefinition.class}, tree="[0]")
    private Output<TableSchemaDefinition> schemaDefinition;

    /**
     * @return Describes the schema of the table.
     * 
     */
    public Output<TableSchemaDefinition> schemaDefinition() {
        return this.schemaDefinition;
    }
    /**
     * The name of the table.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="tableName", refs={String.class}, tree="[0]")
    private Output<String> tableName;

    /**
     * @return The name of the table.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     * 
     */
    @Export(name="ttl", refs={TableTtl.class}, tree="[0]")
    private Output</* @Nullable */ TableTtl> ttl;

    /**
     * @return Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     * 
     */
    public Output<Optional<TableTtl>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:keyspaces/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:keyspaces/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
