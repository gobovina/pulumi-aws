// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cleanrooms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cleanrooms.ConfiguredTableArgs;
import com.pulumi.aws.cleanrooms.inputs.ConfiguredTableState;
import com.pulumi.aws.cleanrooms.outputs.ConfiguredTableTableReference;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a AWS Clean Rooms configured table. Configured tables are used to represent references to existing tables in the AWS Glue Data Catalog.
 * 
 * ## Example Usage
 * 
 * ### Configured table with tags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cleanrooms.ConfiguredTable;
 * import com.pulumi.aws.cleanrooms.ConfiguredTableArgs;
 * import com.pulumi.aws.cleanrooms.inputs.ConfiguredTableTableReferenceArgs;
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
 *         var testConfiguredTable = new ConfiguredTable(&#34;testConfiguredTable&#34;, ConfiguredTableArgs.builder()        
 *             .name(&#34;pulumi-example-table&#34;)
 *             .description(&#34;I made this table with Pulumi!&#34;)
 *             .analysisMethod(&#34;DIRECT_QUERY&#34;)
 *             .allowedColumns(            
 *                 &#34;column1&#34;,
 *                 &#34;column2&#34;,
 *                 &#34;column3&#34;)
 *             .tableReference(ConfiguredTableTableReferenceArgs.builder()
 *                 .databaseName(&#34;example_database&#34;)
 *                 .tableName(&#34;example_table&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Project&#34;, &#34;Pulumi&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_cleanrooms_configured_table` using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cleanrooms/configuredTable:ConfiguredTable table 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:cleanrooms/configuredTable:ConfiguredTable")
public class ConfiguredTable extends com.pulumi.resources.CustomResource {
    /**
     * The columns of the references table which will be included in the configured table.
     * 
     */
    @Export(name="allowedColumns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedColumns;

    /**
     * @return The columns of the references table which will be included in the configured table.
     * 
     */
    public Output<List<String>> allowedColumns() {
        return this.allowedColumns;
    }
    /**
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * 
     */
    @Export(name="analysisMethod", refs={String.class}, tree="[0]")
    private Output<String> analysisMethod;

    /**
     * @return The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * 
     */
    public Output<String> analysisMethod() {
        return this.analysisMethod;
    }
    /**
     * The ARN of the configured table.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the configured table.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time the configured table was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The date and time the configured table was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A description for the configured table.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the configured table.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the configured table.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the configured table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A reference to the AWS Glue table which will be used to create the configured table.
     * * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     * * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
     * 
     */
    @Export(name="tableReference", refs={ConfiguredTableTableReference.class}, tree="[0]")
    private Output<ConfiguredTableTableReference> tableReference;

    /**
     * @return A reference to the AWS Glue table which will be used to create the configured table.
     * * `table_reference.database_name` - (Required - Forces new resource) - The name of the AWS Glue database which contains the table.
     * * `table_reference.table_name` - (Required - Forces new resource) - The name of the AWS Glue table which will be used to create the configured table.
     * 
     */
    public Output<ConfiguredTableTableReference> tableReference() {
        return this.tableReference;
    }
    /**
     * Key value pairs which tag the configured table.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key value pairs which tag the configured table.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The date and time the configured table was last updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The date and time the configured table was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfiguredTable(String name) {
        this(name, ConfiguredTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfiguredTable(String name, ConfiguredTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfiguredTable(String name, ConfiguredTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cleanrooms/configuredTable:ConfiguredTable", name, args == null ? ConfiguredTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfiguredTable(String name, Output<String> id, @Nullable ConfiguredTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cleanrooms/configuredTable:ConfiguredTable", name, state, makeResourceOptions(options, id));
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
    public static ConfiguredTable get(String name, Output<String> id, @Nullable ConfiguredTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfiguredTable(name, id, state, options);
    }
}
