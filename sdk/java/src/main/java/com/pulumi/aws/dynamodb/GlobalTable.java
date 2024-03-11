// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.GlobalTableArgs;
import com.pulumi.aws.dynamodb.inputs.GlobalTableState;
import com.pulumi.aws.dynamodb.outputs.GlobalTableReplica;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html). These are layered on top of existing DynamoDB Tables.
 * 
 * &gt; **NOTE:** To instead manage [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html), use the `aws.dynamodb.Table` resource `replica` configuration block.
 * 
 * &gt; Note: There are many restrictions before you can properly create DynamoDB Global Tables in multiple regions. See the [AWS DynamoDB Global Table Requirements](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables_reqs_bestpractices.html) for more information.
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
 * import com.pulumi.aws.dynamodb.GlobalTable;
 * import com.pulumi.aws.dynamodb.GlobalTableArgs;
 * import com.pulumi.aws.dynamodb.inputs.GlobalTableReplicaArgs;
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
 *         var us_east_1 = new Table(&#34;us-east-1&#34;, TableArgs.builder()        
 *             .hashKey(&#34;myAttribute&#34;)
 *             .name(&#34;myTable&#34;)
 *             .streamEnabled(true)
 *             .streamViewType(&#34;NEW_AND_OLD_IMAGES&#34;)
 *             .readCapacity(1)
 *             .writeCapacity(1)
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;myAttribute&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .build());
 * 
 *         var us_west_2 = new Table(&#34;us-west-2&#34;, TableArgs.builder()        
 *             .hashKey(&#34;myAttribute&#34;)
 *             .name(&#34;myTable&#34;)
 *             .streamEnabled(true)
 *             .streamViewType(&#34;NEW_AND_OLD_IMAGES&#34;)
 *             .readCapacity(1)
 *             .writeCapacity(1)
 *             .attributes(TableAttributeArgs.builder()
 *                 .name(&#34;myAttribute&#34;)
 *                 .type(&#34;S&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myTable = new GlobalTable(&#34;myTable&#34;, GlobalTableArgs.builder()        
 *             .name(&#34;myTable&#34;)
 *             .replicas(            
 *                 GlobalTableReplicaArgs.builder()
 *                     .regionName(&#34;us-east-1&#34;)
 *                     .build(),
 *                 GlobalTableReplicaArgs.builder()
 *                     .regionName(&#34;us-west-2&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DynamoDB Global Tables using the global table name. For example:
 * 
 * ```sh
 * $ pulumi import aws:dynamodb/globalTable:GlobalTable MyTable MyTable
 * ```
 * 
 */
@ResourceType(type="aws:dynamodb/globalTable:GlobalTable")
public class GlobalTable extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the DynamoDB Global Table
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the DynamoDB Global Table
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the global table. Must match underlying DynamoDB Table names in all regions.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the global table. Must match underlying DynamoDB Table names in all regions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * 
     */
    @Export(name="replicas", refs={List.class,GlobalTableReplica.class}, tree="[0,1]")
    private Output<List<GlobalTableReplica>> replicas;

    /**
     * @return Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * 
     */
    public Output<List<GlobalTableReplica>> replicas() {
        return this.replicas;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalTable(String name) {
        this(name, GlobalTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalTable(String name, GlobalTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalTable(String name, GlobalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/globalTable:GlobalTable", name, args == null ? GlobalTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalTable(String name, Output<String> id, @Nullable GlobalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/globalTable:GlobalTable", name, state, makeResourceOptions(options, id));
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
    public static GlobalTable get(String name, Output<String> id, @Nullable GlobalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalTable(name, id, state, options);
    }
}
