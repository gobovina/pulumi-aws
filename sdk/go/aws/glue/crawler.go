// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
//
// ## Example Usage
// ### DynamoDB Target Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewCrawler(ctx, "example", &glue.CrawlerArgs{
//				DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//				Role:         pulumi.Any(aws_iam_role.Example.Arn),
//				DynamodbTargets: glue.CrawlerDynamodbTargetArray{
//					&glue.CrawlerDynamodbTargetArgs{
//						Path: pulumi.String("table-name"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### JDBC Target Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewCrawler(ctx, "example", &glue.CrawlerArgs{
//				DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//				Role:         pulumi.Any(aws_iam_role.Example.Arn),
//				JdbcTargets: glue.CrawlerJdbcTargetArray{
//					&glue.CrawlerJdbcTargetArgs{
//						ConnectionName: pulumi.Any(aws_glue_connection.Example.Name),
//						Path:           pulumi.String("database-name/%"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### S3 Target Example
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewCrawler(ctx, "example", &glue.CrawlerArgs{
//				DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//				Role:         pulumi.Any(aws_iam_role.Example.Arn),
//				S3Targets: glue.CrawlerS3TargetArray{
//					&glue.CrawlerS3TargetArgs{
//						Path: pulumi.String(fmt.Sprintf("s3://%v", aws_s3_bucket.Example.Bucket)),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Catalog Target Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewCrawler(ctx, "example", &glue.CrawlerArgs{
//				DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//				Role:         pulumi.Any(aws_iam_role.Example.Arn),
//				CatalogTargets: glue.CrawlerCatalogTargetArray{
//					&glue.CrawlerCatalogTargetArgs{
//						DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//						Tables: pulumi.StringArray{
//							aws_glue_catalog_table.Example.Name,
//						},
//					},
//				},
//				SchemaChangePolicy: &glue.CrawlerSchemaChangePolicyArgs{
//					DeleteBehavior: pulumi.String("LOG"),
//				},
//				Configuration: pulumi.String(`{
//	  "Version":1.0,
//	  "Grouping": {
//	    "TableGroupingPolicy": "CombineCompatibleSchemas"
//	  }
//	}
//
// `),
//
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### MongoDB Target Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := glue.NewCrawler(ctx, "example", &glue.CrawlerArgs{
//				DatabaseName: pulumi.Any(aws_glue_catalog_database.Example.Name),
//				Role:         pulumi.Any(aws_iam_role.Example.Arn),
//				MongodbTargets: glue.CrawlerMongodbTargetArray{
//					&glue.CrawlerMongodbTargetArgs{
//						ConnectionName: pulumi.Any(aws_glue_connection.Example.Name),
//						Path:           pulumi.String("database-name/%"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Configuration Settings Example
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/glue"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"Grouping": map[string]interface{}{
//					"TableGroupingPolicy": "CombineCompatibleSchemas",
//				},
//				"CrawlerOutput": map[string]interface{}{
//					"Partitions": map[string]interface{}{
//						"AddOrUpdateBehavior": "InheritFromTable",
//					},
//				},
//				"Version": 1,
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = glue.NewCrawler(ctx, "eventsCrawler", &glue.CrawlerArgs{
//				DatabaseName:  pulumi.Any(aws_glue_catalog_database.Glue_database.Name),
//				Schedule:      pulumi.String("cron(0 1 * * ? *)"),
//				Role:          pulumi.Any(aws_iam_role.Glue_role.Arn),
//				Tags:          pulumi.Any(_var.Tags),
//				Configuration: pulumi.String(json0),
//				S3Targets: glue.CrawlerS3TargetArray{
//					&glue.CrawlerS3TargetArgs{
//						Path: pulumi.String(fmt.Sprintf("s3://%v", aws_s3_bucket.Data_lake_bucket.Bucket)),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import Glue Crawlers using `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:glue/crawler:Crawler MyJob MyJob
//
// ```
type Crawler struct {
	pulumi.CustomResourceState

	// The ARN of the crawler
	Arn pulumi.StringOutput `pulumi:"arn"`
	// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
	CatalogTargets CrawlerCatalogTargetArrayOutput `pulumi:"catalogTargets"`
	// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
	Classifiers pulumi.StringArrayOutput `pulumi:"classifiers"`
	// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
	Configuration pulumi.StringPtrOutput `pulumi:"configuration"`
	// Glue database where results are written.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// List of nested Delta Lake target arguments. See Delta Target below.
	DeltaTargets CrawlerDeltaTargetArrayOutput `pulumi:"deltaTargets"`
	// Description of the crawler.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of nested DynamoDB target arguments. See Dynamodb Target below.
	DynamodbTargets CrawlerDynamodbTargetArrayOutput `pulumi:"dynamodbTargets"`
	// List of nested Hudi target arguments. See Iceberg Target below.
	HudiTargets CrawlerHudiTargetArrayOutput `pulumi:"hudiTargets"`
	// List of nested Iceberg target arguments. See Iceberg Target below.
	IcebergTargets CrawlerIcebergTargetArrayOutput `pulumi:"icebergTargets"`
	// List of nested JDBC target arguments. See JDBC Target below.
	JdbcTargets CrawlerJdbcTargetArrayOutput `pulumi:"jdbcTargets"`
	// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
	LakeFormationConfiguration CrawlerLakeFormationConfigurationPtrOutput `pulumi:"lakeFormationConfiguration"`
	// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
	LineageConfiguration CrawlerLineageConfigurationPtrOutput `pulumi:"lineageConfiguration"`
	// List of nested MongoDB target arguments. See MongoDB Target below.
	MongodbTargets CrawlerMongodbTargetArrayOutput `pulumi:"mongodbTargets"`
	// Name of the crawler.
	Name pulumi.StringOutput `pulumi:"name"`
	// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
	RecrawlPolicy CrawlerRecrawlPolicyPtrOutput `pulumi:"recrawlPolicy"`
	// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
	Role pulumi.StringOutput `pulumi:"role"`
	// List of nested Amazon S3 target arguments. See S3 Target below.
	S3Targets CrawlerS3TargetArrayOutput `pulumi:"s3Targets"`
	// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
	Schedule pulumi.StringPtrOutput `pulumi:"schedule"`
	// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
	SchemaChangePolicy CrawlerSchemaChangePolicyPtrOutput `pulumi:"schemaChangePolicy"`
	// The name of Security Configuration to be used by the crawler
	SecurityConfiguration pulumi.StringPtrOutput `pulumi:"securityConfiguration"`
	// The table prefix used for catalog tables that are created.
	TablePrefix pulumi.StringPtrOutput `pulumi:"tablePrefix"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewCrawler registers a new resource with the given unique name, arguments, and options.
func NewCrawler(ctx *pulumi.Context,
	name string, args *CrawlerArgs, opts ...pulumi.ResourceOption) (*Crawler, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Crawler
	err := ctx.RegisterResource("aws:glue/crawler:Crawler", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCrawler gets an existing Crawler resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCrawler(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CrawlerState, opts ...pulumi.ResourceOption) (*Crawler, error) {
	var resource Crawler
	err := ctx.ReadResource("aws:glue/crawler:Crawler", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Crawler resources.
type crawlerState struct {
	// The ARN of the crawler
	Arn *string `pulumi:"arn"`
	// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
	CatalogTargets []CrawlerCatalogTarget `pulumi:"catalogTargets"`
	// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
	Classifiers []string `pulumi:"classifiers"`
	// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
	Configuration *string `pulumi:"configuration"`
	// Glue database where results are written.
	DatabaseName *string `pulumi:"databaseName"`
	// List of nested Delta Lake target arguments. See Delta Target below.
	DeltaTargets []CrawlerDeltaTarget `pulumi:"deltaTargets"`
	// Description of the crawler.
	Description *string `pulumi:"description"`
	// List of nested DynamoDB target arguments. See Dynamodb Target below.
	DynamodbTargets []CrawlerDynamodbTarget `pulumi:"dynamodbTargets"`
	// List of nested Hudi target arguments. See Iceberg Target below.
	HudiTargets []CrawlerHudiTarget `pulumi:"hudiTargets"`
	// List of nested Iceberg target arguments. See Iceberg Target below.
	IcebergTargets []CrawlerIcebergTarget `pulumi:"icebergTargets"`
	// List of nested JDBC target arguments. See JDBC Target below.
	JdbcTargets []CrawlerJdbcTarget `pulumi:"jdbcTargets"`
	// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
	LakeFormationConfiguration *CrawlerLakeFormationConfiguration `pulumi:"lakeFormationConfiguration"`
	// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
	LineageConfiguration *CrawlerLineageConfiguration `pulumi:"lineageConfiguration"`
	// List of nested MongoDB target arguments. See MongoDB Target below.
	MongodbTargets []CrawlerMongodbTarget `pulumi:"mongodbTargets"`
	// Name of the crawler.
	Name *string `pulumi:"name"`
	// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
	RecrawlPolicy *CrawlerRecrawlPolicy `pulumi:"recrawlPolicy"`
	// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
	Role *string `pulumi:"role"`
	// List of nested Amazon S3 target arguments. See S3 Target below.
	S3Targets []CrawlerS3Target `pulumi:"s3Targets"`
	// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
	Schedule *string `pulumi:"schedule"`
	// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
	SchemaChangePolicy *CrawlerSchemaChangePolicy `pulumi:"schemaChangePolicy"`
	// The name of Security Configuration to be used by the crawler
	SecurityConfiguration *string `pulumi:"securityConfiguration"`
	// The table prefix used for catalog tables that are created.
	TablePrefix *string `pulumi:"tablePrefix"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type CrawlerState struct {
	// The ARN of the crawler
	Arn pulumi.StringPtrInput
	// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
	CatalogTargets CrawlerCatalogTargetArrayInput
	// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
	Classifiers pulumi.StringArrayInput
	// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
	Configuration pulumi.StringPtrInput
	// Glue database where results are written.
	DatabaseName pulumi.StringPtrInput
	// List of nested Delta Lake target arguments. See Delta Target below.
	DeltaTargets CrawlerDeltaTargetArrayInput
	// Description of the crawler.
	Description pulumi.StringPtrInput
	// List of nested DynamoDB target arguments. See Dynamodb Target below.
	DynamodbTargets CrawlerDynamodbTargetArrayInput
	// List of nested Hudi target arguments. See Iceberg Target below.
	HudiTargets CrawlerHudiTargetArrayInput
	// List of nested Iceberg target arguments. See Iceberg Target below.
	IcebergTargets CrawlerIcebergTargetArrayInput
	// List of nested JDBC target arguments. See JDBC Target below.
	JdbcTargets CrawlerJdbcTargetArrayInput
	// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
	LakeFormationConfiguration CrawlerLakeFormationConfigurationPtrInput
	// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
	LineageConfiguration CrawlerLineageConfigurationPtrInput
	// List of nested MongoDB target arguments. See MongoDB Target below.
	MongodbTargets CrawlerMongodbTargetArrayInput
	// Name of the crawler.
	Name pulumi.StringPtrInput
	// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
	RecrawlPolicy CrawlerRecrawlPolicyPtrInput
	// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
	Role pulumi.StringPtrInput
	// List of nested Amazon S3 target arguments. See S3 Target below.
	S3Targets CrawlerS3TargetArrayInput
	// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
	Schedule pulumi.StringPtrInput
	// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
	SchemaChangePolicy CrawlerSchemaChangePolicyPtrInput
	// The name of Security Configuration to be used by the crawler
	SecurityConfiguration pulumi.StringPtrInput
	// The table prefix used for catalog tables that are created.
	TablePrefix pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (CrawlerState) ElementType() reflect.Type {
	return reflect.TypeOf((*crawlerState)(nil)).Elem()
}

type crawlerArgs struct {
	// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
	CatalogTargets []CrawlerCatalogTarget `pulumi:"catalogTargets"`
	// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
	Classifiers []string `pulumi:"classifiers"`
	// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
	Configuration *string `pulumi:"configuration"`
	// Glue database where results are written.
	DatabaseName string `pulumi:"databaseName"`
	// List of nested Delta Lake target arguments. See Delta Target below.
	DeltaTargets []CrawlerDeltaTarget `pulumi:"deltaTargets"`
	// Description of the crawler.
	Description *string `pulumi:"description"`
	// List of nested DynamoDB target arguments. See Dynamodb Target below.
	DynamodbTargets []CrawlerDynamodbTarget `pulumi:"dynamodbTargets"`
	// List of nested Hudi target arguments. See Iceberg Target below.
	HudiTargets []CrawlerHudiTarget `pulumi:"hudiTargets"`
	// List of nested Iceberg target arguments. See Iceberg Target below.
	IcebergTargets []CrawlerIcebergTarget `pulumi:"icebergTargets"`
	// List of nested JDBC target arguments. See JDBC Target below.
	JdbcTargets []CrawlerJdbcTarget `pulumi:"jdbcTargets"`
	// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
	LakeFormationConfiguration *CrawlerLakeFormationConfiguration `pulumi:"lakeFormationConfiguration"`
	// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
	LineageConfiguration *CrawlerLineageConfiguration `pulumi:"lineageConfiguration"`
	// List of nested MongoDB target arguments. See MongoDB Target below.
	MongodbTargets []CrawlerMongodbTarget `pulumi:"mongodbTargets"`
	// Name of the crawler.
	Name *string `pulumi:"name"`
	// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
	RecrawlPolicy *CrawlerRecrawlPolicy `pulumi:"recrawlPolicy"`
	// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
	Role string `pulumi:"role"`
	// List of nested Amazon S3 target arguments. See S3 Target below.
	S3Targets []CrawlerS3Target `pulumi:"s3Targets"`
	// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
	Schedule *string `pulumi:"schedule"`
	// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
	SchemaChangePolicy *CrawlerSchemaChangePolicy `pulumi:"schemaChangePolicy"`
	// The name of Security Configuration to be used by the crawler
	SecurityConfiguration *string `pulumi:"securityConfiguration"`
	// The table prefix used for catalog tables that are created.
	TablePrefix *string `pulumi:"tablePrefix"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Crawler resource.
type CrawlerArgs struct {
	// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
	CatalogTargets CrawlerCatalogTargetArrayInput
	// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
	Classifiers pulumi.StringArrayInput
	// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
	Configuration pulumi.StringPtrInput
	// Glue database where results are written.
	DatabaseName pulumi.StringInput
	// List of nested Delta Lake target arguments. See Delta Target below.
	DeltaTargets CrawlerDeltaTargetArrayInput
	// Description of the crawler.
	Description pulumi.StringPtrInput
	// List of nested DynamoDB target arguments. See Dynamodb Target below.
	DynamodbTargets CrawlerDynamodbTargetArrayInput
	// List of nested Hudi target arguments. See Iceberg Target below.
	HudiTargets CrawlerHudiTargetArrayInput
	// List of nested Iceberg target arguments. See Iceberg Target below.
	IcebergTargets CrawlerIcebergTargetArrayInput
	// List of nested JDBC target arguments. See JDBC Target below.
	JdbcTargets CrawlerJdbcTargetArrayInput
	// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
	LakeFormationConfiguration CrawlerLakeFormationConfigurationPtrInput
	// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
	LineageConfiguration CrawlerLineageConfigurationPtrInput
	// List of nested MongoDB target arguments. See MongoDB Target below.
	MongodbTargets CrawlerMongodbTargetArrayInput
	// Name of the crawler.
	Name pulumi.StringPtrInput
	// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
	RecrawlPolicy CrawlerRecrawlPolicyPtrInput
	// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
	Role pulumi.StringInput
	// List of nested Amazon S3 target arguments. See S3 Target below.
	S3Targets CrawlerS3TargetArrayInput
	// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
	Schedule pulumi.StringPtrInput
	// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
	SchemaChangePolicy CrawlerSchemaChangePolicyPtrInput
	// The name of Security Configuration to be used by the crawler
	SecurityConfiguration pulumi.StringPtrInput
	// The table prefix used for catalog tables that are created.
	TablePrefix pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (CrawlerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*crawlerArgs)(nil)).Elem()
}

type CrawlerInput interface {
	pulumi.Input

	ToCrawlerOutput() CrawlerOutput
	ToCrawlerOutputWithContext(ctx context.Context) CrawlerOutput
}

func (*Crawler) ElementType() reflect.Type {
	return reflect.TypeOf((**Crawler)(nil)).Elem()
}

func (i *Crawler) ToCrawlerOutput() CrawlerOutput {
	return i.ToCrawlerOutputWithContext(context.Background())
}

func (i *Crawler) ToCrawlerOutputWithContext(ctx context.Context) CrawlerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CrawlerOutput)
}

// CrawlerArrayInput is an input type that accepts CrawlerArray and CrawlerArrayOutput values.
// You can construct a concrete instance of `CrawlerArrayInput` via:
//
//	CrawlerArray{ CrawlerArgs{...} }
type CrawlerArrayInput interface {
	pulumi.Input

	ToCrawlerArrayOutput() CrawlerArrayOutput
	ToCrawlerArrayOutputWithContext(context.Context) CrawlerArrayOutput
}

type CrawlerArray []CrawlerInput

func (CrawlerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Crawler)(nil)).Elem()
}

func (i CrawlerArray) ToCrawlerArrayOutput() CrawlerArrayOutput {
	return i.ToCrawlerArrayOutputWithContext(context.Background())
}

func (i CrawlerArray) ToCrawlerArrayOutputWithContext(ctx context.Context) CrawlerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CrawlerArrayOutput)
}

// CrawlerMapInput is an input type that accepts CrawlerMap and CrawlerMapOutput values.
// You can construct a concrete instance of `CrawlerMapInput` via:
//
//	CrawlerMap{ "key": CrawlerArgs{...} }
type CrawlerMapInput interface {
	pulumi.Input

	ToCrawlerMapOutput() CrawlerMapOutput
	ToCrawlerMapOutputWithContext(context.Context) CrawlerMapOutput
}

type CrawlerMap map[string]CrawlerInput

func (CrawlerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Crawler)(nil)).Elem()
}

func (i CrawlerMap) ToCrawlerMapOutput() CrawlerMapOutput {
	return i.ToCrawlerMapOutputWithContext(context.Background())
}

func (i CrawlerMap) ToCrawlerMapOutputWithContext(ctx context.Context) CrawlerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CrawlerMapOutput)
}

type CrawlerOutput struct{ *pulumi.OutputState }

func (CrawlerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Crawler)(nil)).Elem()
}

func (o CrawlerOutput) ToCrawlerOutput() CrawlerOutput {
	return o
}

func (o CrawlerOutput) ToCrawlerOutputWithContext(ctx context.Context) CrawlerOutput {
	return o
}

// The ARN of the crawler
func (o CrawlerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// List of nested AWS Glue Data Catalog target arguments. See Catalog Target below.
func (o CrawlerOutput) CatalogTargets() CrawlerCatalogTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerCatalogTargetArrayOutput { return v.CatalogTargets }).(CrawlerCatalogTargetArrayOutput)
}

// List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
func (o CrawlerOutput) Classifiers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringArrayOutput { return v.Classifiers }).(pulumi.StringArrayOutput)
}

// JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
func (o CrawlerOutput) Configuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringPtrOutput { return v.Configuration }).(pulumi.StringPtrOutput)
}

// Glue database where results are written.
func (o CrawlerOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// List of nested Delta Lake target arguments. See Delta Target below.
func (o CrawlerOutput) DeltaTargets() CrawlerDeltaTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerDeltaTargetArrayOutput { return v.DeltaTargets }).(CrawlerDeltaTargetArrayOutput)
}

// Description of the crawler.
func (o CrawlerOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// List of nested DynamoDB target arguments. See Dynamodb Target below.
func (o CrawlerOutput) DynamodbTargets() CrawlerDynamodbTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerDynamodbTargetArrayOutput { return v.DynamodbTargets }).(CrawlerDynamodbTargetArrayOutput)
}

// List of nested Hudi target arguments. See Iceberg Target below.
func (o CrawlerOutput) HudiTargets() CrawlerHudiTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerHudiTargetArrayOutput { return v.HudiTargets }).(CrawlerHudiTargetArrayOutput)
}

// List of nested Iceberg target arguments. See Iceberg Target below.
func (o CrawlerOutput) IcebergTargets() CrawlerIcebergTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerIcebergTargetArrayOutput { return v.IcebergTargets }).(CrawlerIcebergTargetArrayOutput)
}

// List of nested JDBC target arguments. See JDBC Target below.
func (o CrawlerOutput) JdbcTargets() CrawlerJdbcTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerJdbcTargetArrayOutput { return v.JdbcTargets }).(CrawlerJdbcTargetArrayOutput)
}

// Specifies Lake Formation configuration settings for the crawler. See Lake Formation Configuration below.
func (o CrawlerOutput) LakeFormationConfiguration() CrawlerLakeFormationConfigurationPtrOutput {
	return o.ApplyT(func(v *Crawler) CrawlerLakeFormationConfigurationPtrOutput { return v.LakeFormationConfiguration }).(CrawlerLakeFormationConfigurationPtrOutput)
}

// Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
func (o CrawlerOutput) LineageConfiguration() CrawlerLineageConfigurationPtrOutput {
	return o.ApplyT(func(v *Crawler) CrawlerLineageConfigurationPtrOutput { return v.LineageConfiguration }).(CrawlerLineageConfigurationPtrOutput)
}

// List of nested MongoDB target arguments. See MongoDB Target below.
func (o CrawlerOutput) MongodbTargets() CrawlerMongodbTargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerMongodbTargetArrayOutput { return v.MongodbTargets }).(CrawlerMongodbTargetArrayOutput)
}

// Name of the crawler.
func (o CrawlerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
func (o CrawlerOutput) RecrawlPolicy() CrawlerRecrawlPolicyPtrOutput {
	return o.ApplyT(func(v *Crawler) CrawlerRecrawlPolicyPtrOutput { return v.RecrawlPolicy }).(CrawlerRecrawlPolicyPtrOutput)
}

// The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
func (o CrawlerOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// List of nested Amazon S3 target arguments. See S3 Target below.
func (o CrawlerOutput) S3Targets() CrawlerS3TargetArrayOutput {
	return o.ApplyT(func(v *Crawler) CrawlerS3TargetArrayOutput { return v.S3Targets }).(CrawlerS3TargetArrayOutput)
}

// A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
func (o CrawlerOutput) Schedule() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringPtrOutput { return v.Schedule }).(pulumi.StringPtrOutput)
}

// Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
func (o CrawlerOutput) SchemaChangePolicy() CrawlerSchemaChangePolicyPtrOutput {
	return o.ApplyT(func(v *Crawler) CrawlerSchemaChangePolicyPtrOutput { return v.SchemaChangePolicy }).(CrawlerSchemaChangePolicyPtrOutput)
}

// The name of Security Configuration to be used by the crawler
func (o CrawlerOutput) SecurityConfiguration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringPtrOutput { return v.SecurityConfiguration }).(pulumi.StringPtrOutput)
}

// The table prefix used for catalog tables that are created.
func (o CrawlerOutput) TablePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringPtrOutput { return v.TablePrefix }).(pulumi.StringPtrOutput)
}

// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o CrawlerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o CrawlerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Crawler) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type CrawlerArrayOutput struct{ *pulumi.OutputState }

func (CrawlerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Crawler)(nil)).Elem()
}

func (o CrawlerArrayOutput) ToCrawlerArrayOutput() CrawlerArrayOutput {
	return o
}

func (o CrawlerArrayOutput) ToCrawlerArrayOutputWithContext(ctx context.Context) CrawlerArrayOutput {
	return o
}

func (o CrawlerArrayOutput) Index(i pulumi.IntInput) CrawlerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Crawler {
		return vs[0].([]*Crawler)[vs[1].(int)]
	}).(CrawlerOutput)
}

type CrawlerMapOutput struct{ *pulumi.OutputState }

func (CrawlerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Crawler)(nil)).Elem()
}

func (o CrawlerMapOutput) ToCrawlerMapOutput() CrawlerMapOutput {
	return o
}

func (o CrawlerMapOutput) ToCrawlerMapOutputWithContext(ctx context.Context) CrawlerMapOutput {
	return o
}

func (o CrawlerMapOutput) MapIndex(k pulumi.StringInput) CrawlerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Crawler {
		return vs[0].(map[string]*Crawler)[vs[1].(string)]
	}).(CrawlerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CrawlerInput)(nil)).Elem(), &Crawler{})
	pulumi.RegisterInputType(reflect.TypeOf((*CrawlerArrayInput)(nil)).Elem(), CrawlerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CrawlerMapInput)(nil)).Elem(), CrawlerMap{})
	pulumi.RegisterOutputType(CrawlerOutput{})
	pulumi.RegisterOutputType(CrawlerArrayOutput{})
	pulumi.RegisterOutputType(CrawlerMapOutput{})
}
