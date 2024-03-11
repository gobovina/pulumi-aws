// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.glue.CatalogTableArgs;
import com.pulumi.aws.glue.inputs.CatalogTableState;
import com.pulumi.aws.glue.outputs.CatalogTableOpenTableFormatInput;
import com.pulumi.aws.glue.outputs.CatalogTablePartitionIndex;
import com.pulumi.aws.glue.outputs.CatalogTablePartitionKey;
import com.pulumi.aws.glue.outputs.CatalogTableStorageDescriptor;
import com.pulumi.aws.glue.outputs.CatalogTableTargetTable;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Glue Catalog Table Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality.
 * 
 * ## Example Usage
 * 
 * ### Basic Table
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.CatalogTable;
 * import com.pulumi.aws.glue.CatalogTableArgs;
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
 *         var awsGlueCatalogTable = new CatalogTable(&#34;awsGlueCatalogTable&#34;, CatalogTableArgs.builder()        
 *             .name(&#34;MyCatalogTable&#34;)
 *             .databaseName(&#34;MyCatalogDatabase&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Parquet Table for Athena
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.CatalogTable;
 * import com.pulumi.aws.glue.CatalogTableArgs;
 * import com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorArgs;
 * import com.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoArgs;
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
 *         var awsGlueCatalogTable = new CatalogTable(&#34;awsGlueCatalogTable&#34;, CatalogTableArgs.builder()        
 *             .name(&#34;MyCatalogTable&#34;)
 *             .databaseName(&#34;MyCatalogDatabase&#34;)
 *             .tableType(&#34;EXTERNAL_TABLE&#34;)
 *             .parameters(Map.ofEntries(
 *                 Map.entry(&#34;EXTERNAL&#34;, &#34;TRUE&#34;),
 *                 Map.entry(&#34;parquet.compression&#34;, &#34;SNAPPY&#34;)
 *             ))
 *             .storageDescriptor(CatalogTableStorageDescriptorArgs.builder()
 *                 .location(&#34;s3://my-bucket/event-streams/my-stream&#34;)
 *                 .inputFormat(&#34;org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat&#34;)
 *                 .outputFormat(&#34;org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat&#34;)
 *                 .serDeInfo(CatalogTableStorageDescriptorSerDeInfoArgs.builder()
 *                     .name(&#34;my-stream&#34;)
 *                     .serializationLibrary(&#34;org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe&#34;)
 *                     .parameters(Map.of(&#34;serialization.format&#34;, 1))
 *                     .build())
 *                 .columns(                
 *                     CatalogTableStorageDescriptorColumnArgs.builder()
 *                         .name(&#34;my_string&#34;)
 *                         .type(&#34;string&#34;)
 *                         .build(),
 *                     CatalogTableStorageDescriptorColumnArgs.builder()
 *                         .name(&#34;my_double&#34;)
 *                         .type(&#34;double&#34;)
 *                         .build(),
 *                     CatalogTableStorageDescriptorColumnArgs.builder()
 *                         .name(&#34;my_date&#34;)
 *                         .type(&#34;date&#34;)
 *                         .comment(&#34;&#34;)
 *                         .build(),
 *                     CatalogTableStorageDescriptorColumnArgs.builder()
 *                         .name(&#34;my_bigint&#34;)
 *                         .type(&#34;bigint&#34;)
 *                         .comment(&#34;&#34;)
 *                         .build(),
 *                     CatalogTableStorageDescriptorColumnArgs.builder()
 *                         .name(&#34;my_struct&#34;)
 *                         .type(&#34;struct&lt;my_nested_string:string&gt;&#34;)
 *                         .comment(&#34;&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Glue Tables using the catalog ID (usually AWS account ID), database name, and table name. For example:
 * 
 * ```sh
 * $ pulumi import aws:glue/catalogTable:CatalogTable MyTable 123456789012:MyDatabase:MyTable
 * ```
 * 
 */
@ResourceType(type="aws:glue/catalogTable:CatalogTable")
public class CatalogTable extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Glue Table.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Glue Table.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
     * 
     */
    @Export(name="catalogId", refs={String.class}, tree="[0]")
    private Output<String> catalogId;

    /**
     * @return ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     * The follow arguments are optional:
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     * The follow arguments are optional:
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Description of the table.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the table.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration block for open table formats. See `open_table_format_input` below.
     * 
     */
    @Export(name="openTableFormatInput", refs={CatalogTableOpenTableFormatInput.class}, tree="[0]")
    private Output</* @Nullable */ CatalogTableOpenTableFormatInput> openTableFormatInput;

    /**
     * @return Configuration block for open table formats. See `open_table_format_input` below.
     * 
     */
    public Output<Optional<CatalogTableOpenTableFormatInput>> openTableFormatInput() {
        return Codegen.optional(this.openTableFormatInput);
    }
    /**
     * Owner of the table.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> owner;

    /**
     * @return Owner of the table.
     * 
     */
    public Output<Optional<String>> owner() {
        return Codegen.optional(this.owner);
    }
    /**
     * Properties associated with this table, as a list of key-value pairs.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Properties associated with this table, as a list of key-value pairs.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Configuration block for a maximum of 3 partition indexes. See `partition_index` below.
     * 
     */
    @Export(name="partitionIndices", refs={List.class,CatalogTablePartitionIndex.class}, tree="[0,1]")
    private Output<List<CatalogTablePartitionIndex>> partitionIndices;

    /**
     * @return Configuration block for a maximum of 3 partition indexes. See `partition_index` below.
     * 
     */
    public Output<List<CatalogTablePartitionIndex>> partitionIndices() {
        return this.partitionIndices;
    }
    /**
     * Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partition_keys` below.
     * 
     */
    @Export(name="partitionKeys", refs={List.class,CatalogTablePartitionKey.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CatalogTablePartitionKey>> partitionKeys;

    /**
     * @return Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partition_keys` below.
     * 
     */
    public Output<Optional<List<CatalogTablePartitionKey>>> partitionKeys() {
        return Codegen.optional(this.partitionKeys);
    }
    /**
     * Retention time for this table.
     * 
     */
    @Export(name="retention", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retention;

    /**
     * @return Retention time for this table.
     * 
     */
    public Output<Optional<Integer>> retention() {
        return Codegen.optional(this.retention);
    }
    /**
     * Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storage_descriptor` below.
     * 
     */
    @Export(name="storageDescriptor", refs={CatalogTableStorageDescriptor.class}, tree="[0]")
    private Output</* @Nullable */ CatalogTableStorageDescriptor> storageDescriptor;

    /**
     * @return Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storage_descriptor` below.
     * 
     */
    public Output<Optional<CatalogTableStorageDescriptor>> storageDescriptor() {
        return Codegen.optional(this.storageDescriptor);
    }
    /**
     * Type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
     * 
     */
    @Export(name="tableType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tableType;

    /**
     * @return Type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
     * 
     */
    public Output<Optional<String>> tableType() {
        return Codegen.optional(this.tableType);
    }
    /**
     * Configuration block of a target table for resource linking. See `target_table` below.
     * 
     */
    @Export(name="targetTable", refs={CatalogTableTargetTable.class}, tree="[0]")
    private Output</* @Nullable */ CatalogTableTargetTable> targetTable;

    /**
     * @return Configuration block of a target table for resource linking. See `target_table` below.
     * 
     */
    public Output<Optional<CatalogTableTargetTable>> targetTable() {
        return Codegen.optional(this.targetTable);
    }
    /**
     * If the table is a view, the expanded text of the view; otherwise null.
     * 
     */
    @Export(name="viewExpandedText", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> viewExpandedText;

    /**
     * @return If the table is a view, the expanded text of the view; otherwise null.
     * 
     */
    public Output<Optional<String>> viewExpandedText() {
        return Codegen.optional(this.viewExpandedText);
    }
    /**
     * If the table is a view, the original text of the view; otherwise null.
     * 
     */
    @Export(name="viewOriginalText", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> viewOriginalText;

    /**
     * @return If the table is a view, the original text of the view; otherwise null.
     * 
     */
    public Output<Optional<String>> viewOriginalText() {
        return Codegen.optional(this.viewOriginalText);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogTable(String name) {
        this(name, CatalogTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogTable(String name, CatalogTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogTable(String name, CatalogTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/catalogTable:CatalogTable", name, args == null ? CatalogTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CatalogTable(String name, Output<String> id, @Nullable CatalogTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/catalogTable:CatalogTable", name, state, makeResourceOptions(options, id));
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
    public static CatalogTable get(String name, Output<String> id, @Nullable CatalogTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CatalogTable(name, id, state, options);
    }
}
