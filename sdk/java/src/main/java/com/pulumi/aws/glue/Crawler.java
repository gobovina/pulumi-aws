// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.glue.CrawlerArgs;
import com.pulumi.aws.glue.inputs.CrawlerState;
import com.pulumi.aws.glue.outputs.CrawlerCatalogTarget;
import com.pulumi.aws.glue.outputs.CrawlerDeltaTarget;
import com.pulumi.aws.glue.outputs.CrawlerDynamodbTarget;
import com.pulumi.aws.glue.outputs.CrawlerHudiTarget;
import com.pulumi.aws.glue.outputs.CrawlerIcebergTarget;
import com.pulumi.aws.glue.outputs.CrawlerJdbcTarget;
import com.pulumi.aws.glue.outputs.CrawlerLakeFormationConfiguration;
import com.pulumi.aws.glue.outputs.CrawlerLineageConfiguration;
import com.pulumi.aws.glue.outputs.CrawlerMongodbTarget;
import com.pulumi.aws.glue.outputs.CrawlerRecrawlPolicy;
import com.pulumi.aws.glue.outputs.CrawlerS3Target;
import com.pulumi.aws.glue.outputs.CrawlerSchemaChangePolicy;
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
 * Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
 * 
 * ## Example Usage
 * 
 * ### DynamoDB Target Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerDynamodbTargetArgs;
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
 *         var example = new Crawler(&#34;example&#34;, CrawlerArgs.builder()        
 *             .databaseName(exampleAwsGlueCatalogDatabase.name())
 *             .name(&#34;example&#34;)
 *             .role(exampleAwsIamRole.arn())
 *             .dynamodbTargets(CrawlerDynamodbTargetArgs.builder()
 *                 .path(&#34;table-name&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### JDBC Target Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerJdbcTargetArgs;
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
 *         var example = new Crawler(&#34;example&#34;, CrawlerArgs.builder()        
 *             .databaseName(exampleAwsGlueCatalogDatabase.name())
 *             .name(&#34;example&#34;)
 *             .role(exampleAwsIamRole.arn())
 *             .jdbcTargets(CrawlerJdbcTargetArgs.builder()
 *                 .connectionName(exampleAwsGlueConnection.name())
 *                 .path(&#34;database-name/%&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### S3 Target Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs;
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
 *         var example = new Crawler(&#34;example&#34;, CrawlerArgs.builder()        
 *             .databaseName(exampleAwsGlueCatalogDatabase.name())
 *             .name(&#34;example&#34;)
 *             .role(exampleAwsIamRole.arn())
 *             .s3Targets(CrawlerS3TargetArgs.builder()
 *                 .path(String.format(&#34;s3://%s&#34;, exampleAwsS3Bucket.bucket()))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Catalog Target Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerCatalogTargetArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerSchemaChangePolicyArgs;
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
 *         var example = new Crawler(&#34;example&#34;, CrawlerArgs.builder()        
 *             .databaseName(exampleAwsGlueCatalogDatabase.name())
 *             .name(&#34;example&#34;)
 *             .role(exampleAwsIamRole.arn())
 *             .catalogTargets(CrawlerCatalogTargetArgs.builder()
 *                 .databaseName(exampleAwsGlueCatalogDatabase.name())
 *                 .tables(exampleAwsGlueCatalogTable.name())
 *                 .build())
 *             .schemaChangePolicy(CrawlerSchemaChangePolicyArgs.builder()
 *                 .deleteBehavior(&#34;LOG&#34;)
 *                 .build())
 *             .configuration(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;:1.0,
 *   &#34;Grouping&#34;: {
 *     &#34;TableGroupingPolicy&#34;: &#34;CombineCompatibleSchemas&#34;
 *   }
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### MongoDB Target Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerMongodbTargetArgs;
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
 *         var example = new Crawler(&#34;example&#34;, CrawlerArgs.builder()        
 *             .databaseName(exampleAwsGlueCatalogDatabase.name())
 *             .name(&#34;example&#34;)
 *             .role(exampleAwsIamRole.arn())
 *             .mongodbTargets(CrawlerMongodbTargetArgs.builder()
 *                 .connectionName(exampleAwsGlueConnection.name())
 *                 .path(&#34;database-name/%&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Configuration Settings Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.glue.Crawler;
 * import com.pulumi.aws.glue.CrawlerArgs;
 * import com.pulumi.aws.glue.inputs.CrawlerS3TargetArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var eventsCrawler = new Crawler(&#34;eventsCrawler&#34;, CrawlerArgs.builder()        
 *             .databaseName(glueDatabase.name())
 *             .schedule(&#34;cron(0 1 * * ? *)&#34;)
 *             .name(String.format(&#34;events_crawler_%s&#34;, environmentName))
 *             .role(glueRole.arn())
 *             .tags(tags)
 *             .configuration(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;grouping&#34;, jsonObject(
 *                         jsonProperty(&#34;tableGroupingPolicy&#34;, &#34;CombineCompatibleSchemas&#34;)
 *                     )),
 *                     jsonProperty(&#34;crawlerOutput&#34;, jsonObject(
 *                         jsonProperty(&#34;partitions&#34;, jsonObject(
 *                             jsonProperty(&#34;addOrUpdateBehavior&#34;, &#34;InheritFromTable&#34;)
 *                         ))
 *                     )),
 *                     jsonProperty(&#34;version&#34;, 1)
 *                 )))
 *             .s3Targets(CrawlerS3TargetArgs.builder()
 *                 .path(String.format(&#34;s3://%s&#34;, dataLakeBucket.bucket()))
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
 * Using `pulumi import`, import Glue Crawlers using `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:glue/crawler:Crawler MyJob MyJob
 * ```
 * 
 */
@ResourceType(type="aws:glue/crawler:Crawler")
public class Crawler extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the crawler
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the crawler
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     * 
     */
    @Export(name="catalogTargets", refs={List.class,CrawlerCatalogTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerCatalogTarget>> catalogTargets;

    /**
     * @return List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     * 
     */
    public Output<Optional<List<CrawlerCatalogTarget>>> catalogTargets() {
        return Codegen.optional(this.catalogTargets);
    }
    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    @Export(name="classifiers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> classifiers;

    /**
     * @return List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    public Output<Optional<List<String>>> classifiers() {
        return Codegen.optional(this.classifiers);
    }
    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    @Export(name="configuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> configuration;

    /**
     * @return JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    public Output<Optional<String>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * Glue database where results are written.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return Glue database where results are written.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * List of nested Delta Lake target arguments. See Delta Target below.
     * 
     */
    @Export(name="deltaTargets", refs={List.class,CrawlerDeltaTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerDeltaTarget>> deltaTargets;

    /**
     * @return List of nested Delta Lake target arguments. See Delta Target below.
     * 
     */
    public Output<Optional<List<CrawlerDeltaTarget>>> deltaTargets() {
        return Codegen.optional(this.deltaTargets);
    }
    /**
     * Description of the crawler.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the crawler.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    @Export(name="dynamodbTargets", refs={List.class,CrawlerDynamodbTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerDynamodbTarget>> dynamodbTargets;

    /**
     * @return List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    public Output<Optional<List<CrawlerDynamodbTarget>>> dynamodbTargets() {
        return Codegen.optional(this.dynamodbTargets);
    }
    /**
     * List of nested Hudi target arguments. See Iceberg Target below.
     * 
     */
    @Export(name="hudiTargets", refs={List.class,CrawlerHudiTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerHudiTarget>> hudiTargets;

    /**
     * @return List of nested Hudi target arguments. See Iceberg Target below.
     * 
     */
    public Output<Optional<List<CrawlerHudiTarget>>> hudiTargets() {
        return Codegen.optional(this.hudiTargets);
    }
    /**
     * List of nested Iceberg target arguments. See Iceberg Target below.
     * 
     */
    @Export(name="icebergTargets", refs={List.class,CrawlerIcebergTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerIcebergTarget>> icebergTargets;

    /**
     * @return List of nested Iceberg target arguments. See Iceberg Target below.
     * 
     */
    public Output<Optional<List<CrawlerIcebergTarget>>> icebergTargets() {
        return Codegen.optional(this.icebergTargets);
    }
    /**
     * List of nested JDBC target arguments. See JDBC Target below.
     * 
     */
    @Export(name="jdbcTargets", refs={List.class,CrawlerJdbcTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerJdbcTarget>> jdbcTargets;

    /**
     * @return List of nested JDBC target arguments. See JDBC Target below.
     * 
     */
    public Output<Optional<List<CrawlerJdbcTarget>>> jdbcTargets() {
        return Codegen.optional(this.jdbcTargets);
    }
    /**
     * Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     * 
     */
    @Export(name="lakeFormationConfiguration", refs={CrawlerLakeFormationConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ CrawlerLakeFormationConfiguration> lakeFormationConfiguration;

    /**
     * @return Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     * 
     */
    public Output<Optional<CrawlerLakeFormationConfiguration>> lakeFormationConfiguration() {
        return Codegen.optional(this.lakeFormationConfiguration);
    }
    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    @Export(name="lineageConfiguration", refs={CrawlerLineageConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ CrawlerLineageConfiguration> lineageConfiguration;

    /**
     * @return Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    public Output<Optional<CrawlerLineageConfiguration>> lineageConfiguration() {
        return Codegen.optional(this.lineageConfiguration);
    }
    /**
     * List of nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    @Export(name="mongodbTargets", refs={List.class,CrawlerMongodbTarget.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerMongodbTarget>> mongodbTargets;

    /**
     * @return List of nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    public Output<Optional<List<CrawlerMongodbTarget>>> mongodbTargets() {
        return Codegen.optional(this.mongodbTargets);
    }
    /**
     * Name of the crawler.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the crawler.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    @Export(name="recrawlPolicy", refs={CrawlerRecrawlPolicy.class}, tree="[0]")
    private Output</* @Nullable */ CrawlerRecrawlPolicy> recrawlPolicy;

    /**
     * @return A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    public Output<Optional<CrawlerRecrawlPolicy>> recrawlPolicy() {
        return Codegen.optional(this.recrawlPolicy);
    }
    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * List of nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    @Export(name="s3Targets", refs={List.class,CrawlerS3Target.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CrawlerS3Target>> s3Targets;

    /**
     * @return List of nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    public Output<Optional<List<CrawlerS3Target>>> s3Targets() {
        return Codegen.optional(this.s3Targets);
    }
    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    @Export(name="schedule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schedule;

    /**
     * @return A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * 
     */
    @Export(name="schemaChangePolicy", refs={CrawlerSchemaChangePolicy.class}, tree="[0]")
    private Output</* @Nullable */ CrawlerSchemaChangePolicy> schemaChangePolicy;

    /**
     * @return Policy for the crawler&#39;s update and deletion behavior. See Schema Change Policy below.
     * 
     */
    public Output<Optional<CrawlerSchemaChangePolicy>> schemaChangePolicy() {
        return Codegen.optional(this.schemaChangePolicy);
    }
    /**
     * The name of Security Configuration to be used by the crawler
     * 
     */
    @Export(name="securityConfiguration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityConfiguration;

    /**
     * @return The name of Security Configuration to be used by the crawler
     * 
     */
    public Output<Optional<String>> securityConfiguration() {
        return Codegen.optional(this.securityConfiguration);
    }
    /**
     * The table prefix used for catalog tables that are created.
     * 
     */
    @Export(name="tablePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tablePrefix;

    /**
     * @return The table prefix used for catalog tables that are created.
     * 
     */
    public Output<Optional<String>> tablePrefix() {
        return Codegen.optional(this.tablePrefix);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Crawler(String name) {
        this(name, CrawlerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Crawler(String name, CrawlerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Crawler(String name, CrawlerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/crawler:Crawler", name, args == null ? CrawlerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Crawler(String name, Output<String> id, @Nullable CrawlerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/crawler:Crawler", name, state, makeResourceOptions(options, id));
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
    public static Crawler get(String name, Output<String> id, @Nullable CrawlerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Crawler(name, id, state, options);
    }
}
