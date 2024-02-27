// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
 *
 * ## Example Usage
 * ### DynamoDB Target Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Crawler("example", {
 *     databaseName: aws_glue_catalog_database.example.name,
 *     role: aws_iam_role.example.arn,
 *     dynamodbTargets: [{
 *         path: "table-name",
 *     }],
 * });
 * ```
 * ### JDBC Target Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Crawler("example", {
 *     databaseName: aws_glue_catalog_database.example.name,
 *     role: aws_iam_role.example.arn,
 *     jdbcTargets: [{
 *         connectionName: aws_glue_connection.example.name,
 *         path: "database-name/%",
 *     }],
 * });
 * ```
 * ### S3 Target Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Crawler("example", {
 *     databaseName: aws_glue_catalog_database.example.name,
 *     role: aws_iam_role.example.arn,
 *     s3Targets: [{
 *         path: `s3://${aws_s3_bucket.example.bucket}`,
 *     }],
 * });
 * ```
 * ### Catalog Target Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Crawler("example", {
 *     databaseName: aws_glue_catalog_database.example.name,
 *     role: aws_iam_role.example.arn,
 *     catalogTargets: [{
 *         databaseName: aws_glue_catalog_database.example.name,
 *         tables: [aws_glue_catalog_table.example.name],
 *     }],
 *     schemaChangePolicy: {
 *         deleteBehavior: "LOG",
 *     },
 *     configuration: `{
 *   "Version":1.0,
 *   "Grouping": {
 *     "TableGroupingPolicy": "CombineCompatibleSchemas"
 *   }
 * }
 * `,
 * });
 * ```
 * ### MongoDB Target Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Crawler("example", {
 *     databaseName: aws_glue_catalog_database.example.name,
 *     role: aws_iam_role.example.arn,
 *     mongodbTargets: [{
 *         connectionName: aws_glue_connection.example.name,
 *         path: "database-name/%",
 *     }],
 * });
 * ```
 * ### Configuration Settings Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const eventsCrawler = new aws.glue.Crawler("eventsCrawler", {
 *     databaseName: aws_glue_catalog_database.glue_database.name,
 *     schedule: "cron(0 1 * * ? *)",
 *     role: aws_iam_role.glue_role.arn,
 *     tags: _var.tags,
 *     configuration: JSON.stringify({
 *         Grouping: {
 *             TableGroupingPolicy: "CombineCompatibleSchemas",
 *         },
 *         CrawlerOutput: {
 *             Partitions: {
 *                 AddOrUpdateBehavior: "InheritFromTable",
 *             },
 *         },
 *         Version: 1,
 *     }),
 *     s3Targets: [{
 *         path: `s3://${aws_s3_bucket.data_lake_bucket.bucket}`,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Glue Crawlers using `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:glue/crawler:Crawler MyJob MyJob
 * ```
 */
export class Crawler extends pulumi.CustomResource {
    /**
     * Get an existing Crawler resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CrawlerState, opts?: pulumi.CustomResourceOptions): Crawler {
        return new Crawler(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:glue/crawler:Crawler';

    /**
     * Returns true if the given object is an instance of Crawler.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Crawler {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Crawler.__pulumiType;
    }

    /**
     * The ARN of the crawler
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     */
    public readonly catalogTargets!: pulumi.Output<outputs.glue.CrawlerCatalogTarget[] | undefined>;
    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     */
    public readonly classifiers!: pulumi.Output<string[] | undefined>;
    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     */
    public readonly configuration!: pulumi.Output<string | undefined>;
    /**
     * Glue database where results are written.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * List of nested Delta Lake target arguments. See Delta Target below.
     */
    public readonly deltaTargets!: pulumi.Output<outputs.glue.CrawlerDeltaTarget[] | undefined>;
    /**
     * Description of the crawler.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     */
    public readonly dynamodbTargets!: pulumi.Output<outputs.glue.CrawlerDynamodbTarget[] | undefined>;
    /**
     * List of nested Hudi target arguments. See Iceberg Target below.
     */
    public readonly hudiTargets!: pulumi.Output<outputs.glue.CrawlerHudiTarget[] | undefined>;
    /**
     * List of nested Iceberg target arguments. See Iceberg Target below.
     */
    public readonly icebergTargets!: pulumi.Output<outputs.glue.CrawlerIcebergTarget[] | undefined>;
    /**
     * List of nested JDBC target arguments. See JDBC Target below.
     */
    public readonly jdbcTargets!: pulumi.Output<outputs.glue.CrawlerJdbcTarget[] | undefined>;
    /**
     * Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     */
    public readonly lakeFormationConfiguration!: pulumi.Output<outputs.glue.CrawlerLakeFormationConfiguration | undefined>;
    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     */
    public readonly lineageConfiguration!: pulumi.Output<outputs.glue.CrawlerLineageConfiguration | undefined>;
    /**
     * List of nested MongoDB target arguments. See MongoDB Target below.
     */
    public readonly mongodbTargets!: pulumi.Output<outputs.glue.CrawlerMongodbTarget[] | undefined>;
    /**
     * Name of the crawler.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     */
    public readonly recrawlPolicy!: pulumi.Output<outputs.glue.CrawlerRecrawlPolicy | undefined>;
    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * List of nested Amazon S3 target arguments. See S3 Target below.
     */
    public readonly s3Targets!: pulumi.Output<outputs.glue.CrawlerS3Target[] | undefined>;
    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     */
    public readonly schedule!: pulumi.Output<string | undefined>;
    /**
     * Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     */
    public readonly schemaChangePolicy!: pulumi.Output<outputs.glue.CrawlerSchemaChangePolicy | undefined>;
    /**
     * The name of Security Configuration to be used by the crawler
     */
    public readonly securityConfiguration!: pulumi.Output<string | undefined>;
    /**
     * The table prefix used for catalog tables that are created.
     */
    public readonly tablePrefix!: pulumi.Output<string | undefined>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Crawler resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CrawlerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CrawlerArgs | CrawlerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CrawlerState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["catalogTargets"] = state ? state.catalogTargets : undefined;
            resourceInputs["classifiers"] = state ? state.classifiers : undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["deltaTargets"] = state ? state.deltaTargets : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dynamodbTargets"] = state ? state.dynamodbTargets : undefined;
            resourceInputs["hudiTargets"] = state ? state.hudiTargets : undefined;
            resourceInputs["icebergTargets"] = state ? state.icebergTargets : undefined;
            resourceInputs["jdbcTargets"] = state ? state.jdbcTargets : undefined;
            resourceInputs["lakeFormationConfiguration"] = state ? state.lakeFormationConfiguration : undefined;
            resourceInputs["lineageConfiguration"] = state ? state.lineageConfiguration : undefined;
            resourceInputs["mongodbTargets"] = state ? state.mongodbTargets : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["recrawlPolicy"] = state ? state.recrawlPolicy : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["s3Targets"] = state ? state.s3Targets : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["schemaChangePolicy"] = state ? state.schemaChangePolicy : undefined;
            resourceInputs["securityConfiguration"] = state ? state.securityConfiguration : undefined;
            resourceInputs["tablePrefix"] = state ? state.tablePrefix : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as CrawlerArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["catalogTargets"] = args ? args.catalogTargets : undefined;
            resourceInputs["classifiers"] = args ? args.classifiers : undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["deltaTargets"] = args ? args.deltaTargets : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dynamodbTargets"] = args ? args.dynamodbTargets : undefined;
            resourceInputs["hudiTargets"] = args ? args.hudiTargets : undefined;
            resourceInputs["icebergTargets"] = args ? args.icebergTargets : undefined;
            resourceInputs["jdbcTargets"] = args ? args.jdbcTargets : undefined;
            resourceInputs["lakeFormationConfiguration"] = args ? args.lakeFormationConfiguration : undefined;
            resourceInputs["lineageConfiguration"] = args ? args.lineageConfiguration : undefined;
            resourceInputs["mongodbTargets"] = args ? args.mongodbTargets : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["recrawlPolicy"] = args ? args.recrawlPolicy : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["s3Targets"] = args ? args.s3Targets : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["schemaChangePolicy"] = args ? args.schemaChangePolicy : undefined;
            resourceInputs["securityConfiguration"] = args ? args.securityConfiguration : undefined;
            resourceInputs["tablePrefix"] = args ? args.tablePrefix : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Crawler.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Crawler resources.
 */
export interface CrawlerState {
    /**
     * The ARN of the crawler
     */
    arn?: pulumi.Input<string>;
    /**
     * List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     */
    catalogTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerCatalogTarget>[]>;
    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     */
    classifiers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     */
    configuration?: pulumi.Input<string>;
    /**
     * Glue database where results are written.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * List of nested Delta Lake target arguments. See Delta Target below.
     */
    deltaTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerDeltaTarget>[]>;
    /**
     * Description of the crawler.
     */
    description?: pulumi.Input<string>;
    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     */
    dynamodbTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerDynamodbTarget>[]>;
    /**
     * List of nested Hudi target arguments. See Iceberg Target below.
     */
    hudiTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerHudiTarget>[]>;
    /**
     * List of nested Iceberg target arguments. See Iceberg Target below.
     */
    icebergTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerIcebergTarget>[]>;
    /**
     * List of nested JDBC target arguments. See JDBC Target below.
     */
    jdbcTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerJdbcTarget>[]>;
    /**
     * Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     */
    lakeFormationConfiguration?: pulumi.Input<inputs.glue.CrawlerLakeFormationConfiguration>;
    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     */
    lineageConfiguration?: pulumi.Input<inputs.glue.CrawlerLineageConfiguration>;
    /**
     * List of nested MongoDB target arguments. See MongoDB Target below.
     */
    mongodbTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerMongodbTarget>[]>;
    /**
     * Name of the crawler.
     */
    name?: pulumi.Input<string>;
    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     */
    recrawlPolicy?: pulumi.Input<inputs.glue.CrawlerRecrawlPolicy>;
    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     */
    role?: pulumi.Input<string>;
    /**
     * List of nested Amazon S3 target arguments. See S3 Target below.
     */
    s3Targets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerS3Target>[]>;
    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     */
    schedule?: pulumi.Input<string>;
    /**
     * Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     */
    schemaChangePolicy?: pulumi.Input<inputs.glue.CrawlerSchemaChangePolicy>;
    /**
     * The name of Security Configuration to be used by the crawler
     */
    securityConfiguration?: pulumi.Input<string>;
    /**
     * The table prefix used for catalog tables that are created.
     */
    tablePrefix?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Crawler resource.
 */
export interface CrawlerArgs {
    /**
     * List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
     */
    catalogTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerCatalogTarget>[]>;
    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     */
    classifiers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     */
    configuration?: pulumi.Input<string>;
    /**
     * Glue database where results are written.
     */
    databaseName: pulumi.Input<string>;
    /**
     * List of nested Delta Lake target arguments. See Delta Target below.
     */
    deltaTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerDeltaTarget>[]>;
    /**
     * Description of the crawler.
     */
    description?: pulumi.Input<string>;
    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     */
    dynamodbTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerDynamodbTarget>[]>;
    /**
     * List of nested Hudi target arguments. See Iceberg Target below.
     */
    hudiTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerHudiTarget>[]>;
    /**
     * List of nested Iceberg target arguments. See Iceberg Target below.
     */
    icebergTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerIcebergTarget>[]>;
    /**
     * List of nested JDBC target arguments. See JDBC Target below.
     */
    jdbcTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerJdbcTarget>[]>;
    /**
     * Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
     */
    lakeFormationConfiguration?: pulumi.Input<inputs.glue.CrawlerLakeFormationConfiguration>;
    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     */
    lineageConfiguration?: pulumi.Input<inputs.glue.CrawlerLineageConfiguration>;
    /**
     * List of nested MongoDB target arguments. See MongoDB Target below.
     */
    mongodbTargets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerMongodbTarget>[]>;
    /**
     * Name of the crawler.
     */
    name?: pulumi.Input<string>;
    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     */
    recrawlPolicy?: pulumi.Input<inputs.glue.CrawlerRecrawlPolicy>;
    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     */
    role: pulumi.Input<string>;
    /**
     * List of nested Amazon S3 target arguments. See S3 Target below.
     */
    s3Targets?: pulumi.Input<pulumi.Input<inputs.glue.CrawlerS3Target>[]>;
    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     */
    schedule?: pulumi.Input<string>;
    /**
     * Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     */
    schemaChangePolicy?: pulumi.Input<inputs.glue.CrawlerSchemaChangePolicy>;
    /**
     * The name of Security Configuration to be used by the crawler
     */
    securityConfiguration?: pulumi.Input<string>;
    /**
     * The table prefix used for catalog tables that are created.
     */
    tablePrefix?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
