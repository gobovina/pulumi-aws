// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.DataCatalogArgs;
import com.pulumi.aws.athena.inputs.DataCatalogState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Athena data catalog.
 * 
 * More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).
 * 
 * &gt; **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.athena.DataCatalog;
 * import com.pulumi.aws.athena.DataCatalogArgs;
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
 *         var example = new DataCatalog(&#34;example&#34;, DataCatalogArgs.builder()        
 *             .description(&#34;Example Athena data catalog&#34;)
 *             .parameters(Map.of(&#34;function&#34;, &#34;arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function&#34;))
 *             .tags(Map.of(&#34;Name&#34;, &#34;example-athena-data-catalog&#34;))
 *             .type(&#34;LAMBDA&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Hive based Data Catalog
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.athena.DataCatalog;
 * import com.pulumi.aws.athena.DataCatalogArgs;
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
 *         var example = new DataCatalog(&#34;example&#34;, DataCatalogArgs.builder()        
 *             .description(&#34;Hive based Data Catalog&#34;)
 *             .parameters(Map.of(&#34;metadata-function&#34;, &#34;arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function&#34;))
 *             .type(&#34;HIVE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Glue based Data Catalog
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.athena.DataCatalog;
 * import com.pulumi.aws.athena.DataCatalogArgs;
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
 *         var example = new DataCatalog(&#34;example&#34;, DataCatalogArgs.builder()        
 *             .description(&#34;Glue based Data Catalog&#34;)
 *             .parameters(Map.of(&#34;catalog-id&#34;, &#34;123456789012&#34;))
 *             .type(&#34;GLUE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Lambda based Data Catalog
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.athena.DataCatalog;
 * import com.pulumi.aws.athena.DataCatalogArgs;
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
 *         var example = new DataCatalog(&#34;example&#34;, DataCatalogArgs.builder()        
 *             .description(&#34;Lambda based Data Catalog&#34;)
 *             .parameters(Map.ofEntries(
 *                 Map.entry(&#34;metadata-function&#34;, &#34;arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-1&#34;),
 *                 Map.entry(&#34;record-function&#34;, &#34;arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-2&#34;)
 *             ))
 *             .type(&#34;LAMBDA&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import data catalogs using their `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:athena/dataCatalog:DataCatalog example example-data-catalog
 * ```
 * 
 */
@ResourceType(type="aws:athena/dataCatalog:DataCatalog")
public class DataCatalog extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the data catalog.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the data catalog.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the data catalog.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the data catalog.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> parameters;

    /**
     * @return Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
     * 
     */
    public Output<Map<String,String>> parameters() {
        return this.parameters;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCatalog(String name) {
        this(name, DataCatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCatalog(String name, DataCatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCatalog(String name, DataCatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/dataCatalog:DataCatalog", name, args == null ? DataCatalogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataCatalog(String name, Output<String> id, @Nullable DataCatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/dataCatalog:DataCatalog", name, state, makeResourceOptions(options, id));
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
    public static DataCatalog get(String name, Output<String> id, @Nullable DataCatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataCatalog(name, id, state, options);
    }
}
