// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.TableItemArgs;
import com.pulumi.aws.dynamodb.inputs.TableItemState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DynamoDB table item resource
 * 
 * &gt; **Note:** This resource is not meant to be used for managing large amounts of data in your table, it is not designed to scale.
 *   You should perform **regular backups** of all data in the table, see [AWS docs for more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/BackupRestore.html).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
 * import com.pulumi.aws.dynamodb.TableItem;
 * import com.pulumi.aws.dynamodb.TableItemArgs;
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
 *         var exampleTable = new Table(&#34;exampleTable&#34;, TableArgs.builder()        
 *             .name(&#34;example-name&#34;)
 *             .readCapacity(10)
 *             .writeCapacity(10)
 *             .hashKey(&#34;exampleHashKey&#34;)
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;exampleHashKey&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example = new TableItem(&#34;example&#34;, TableItemArgs.builder()        
 *             .tableName(exampleTable.name())
 *             .hashKey(exampleTable.hashKey())
 *             .item(&#34;&#34;&#34;
 * {
 *   &#34;exampleHashKey&#34;: {&#34;S&#34;: &#34;something&#34;},
 *   &#34;one&#34;: {&#34;N&#34;: &#34;11111&#34;},
 *   &#34;two&#34;: {&#34;N&#34;: &#34;22222&#34;},
 *   &#34;three&#34;: {&#34;N&#34;: &#34;33333&#34;},
 *   &#34;four&#34;: {&#34;N&#34;: &#34;44444&#34;}
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You cannot import DynamoDB table items.
 * 
 */
@ResourceType(type="aws:dynamodb/tableItem:TableItem")
public class TableItem extends com.pulumi.resources.CustomResource {
    /**
     * Hash key to use for lookups and identification of the item
     * 
     */
    @Export(name="hashKey", refs={String.class}, tree="[0]")
    private Output<String> hashKey;

    /**
     * @return Hash key to use for lookups and identification of the item
     * 
     */
    public Output<String> hashKey() {
        return this.hashKey;
    }
    /**
     * JSON representation of a map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    @Export(name="item", refs={String.class}, tree="[0]")
    private Output<String> item;

    /**
     * @return JSON representation of a map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    public Output<String> item() {
        return this.item;
    }
    /**
     * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    @Export(name="rangeKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rangeKey;

    /**
     * @return Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    public Output<Optional<String>> rangeKey() {
        return Codegen.optional(this.rangeKey);
    }
    /**
     * Name of the table to contain the item.
     * 
     */
    @Export(name="tableName", refs={String.class}, tree="[0]")
    private Output<String> tableName;

    /**
     * @return Name of the table to contain the item.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableItem(String name) {
        this(name, TableItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableItem(String name, TableItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableItem(String name, TableItemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, args == null ? TableItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableItem(String name, Output<String> id, @Nullable TableItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, state, makeResourceOptions(options, id));
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
    public static TableItem get(String name, Output<String> id, @Nullable TableItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableItem(name, id, state, options);
    }
}
