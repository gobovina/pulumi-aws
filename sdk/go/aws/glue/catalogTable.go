// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Glue Catalog Table Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality.
//
// ## Example Usage
// ### Basic Table
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v2/go/aws/glue"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err = glue.NewCatalogTable(ctx, "awsGlueCatalogTable", &glue.CatalogTableArgs{
// 			DatabaseName: pulumi.String("MyCatalogDatabase"),
// 			Name:         pulumi.String("MyCatalogTable"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Parquet Table for Athena
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v2/go/aws/glue"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err = glue.NewCatalogTable(ctx, "awsGlueCatalogTable", &glue.CatalogTableArgs{
// 			DatabaseName: pulumi.String("MyCatalogDatabase"),
// 			Name:         pulumi.String("MyCatalogTable"),
// 			Parameters: pulumi.Map{
// 				"EXTERNAL":            pulumi.String("TRUE"),
// 				"parquet.compression": pulumi.String("SNAPPY"),
// 			},
// 			StorageDescriptor: &glue.CatalogTableStorageDescriptorArgs{
// 				Columns: glue.CatalogTableStorageDescriptorColumnArray{
// 					&glue.CatalogTableStorageDescriptorColumnArgs{
// 						Name: pulumi.String("my_string"),
// 						Type: pulumi.String("string"),
// 					},
// 					&glue.CatalogTableStorageDescriptorColumnArgs{
// 						Name: pulumi.String("my_double"),
// 						Type: pulumi.String("double"),
// 					},
// 					&glue.CatalogTableStorageDescriptorColumnArgs{
// 						Comment: pulumi.String(""),
// 						Name:    pulumi.String("my_date"),
// 						Type:    pulumi.String("date"),
// 					},
// 					&glue.CatalogTableStorageDescriptorColumnArgs{
// 						Comment: pulumi.String(""),
// 						Name:    pulumi.String("my_bigint"),
// 						Type:    pulumi.String("bigint"),
// 					},
// 					&glue.CatalogTableStorageDescriptorColumnArgs{
// 						Comment: pulumi.String(""),
// 						Name:    pulumi.String("my_struct"),
// 						Type:    pulumi.String("struct<my_nested_string:string>"),
// 					},
// 				},
// 				InputFormat:  pulumi.String("org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat"),
// 				Location:     pulumi.String("s3://my-bucket/event-streams/my-stream"),
// 				OutputFormat: pulumi.String("org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat"),
// 				SerDeInfo: &glue.CatalogTableStorageDescriptorSerDeInfoArgs{
// 					Name: pulumi.String("my-stream"),
// 					Parameters: pulumi.Map{
// 						"serialization.format": pulumi.String("1"),
// 					},
// 					SerializationLibrary: pulumi.String("org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe"),
// 				},
// 			},
// 			TableType: pulumi.String("EXTERNAL_TABLE"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type CatalogTable struct {
	pulumi.CustomResourceState

	// The ARN of the Glue Table.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
	CatalogId pulumi.StringOutput `pulumi:"catalogId"`
	// Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// Description of the table.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the SerDe.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner of the table.
	Owner pulumi.StringPtrOutput `pulumi:"owner"`
	// A map of initialization parameters for the SerDe, in key-value form.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
	PartitionKeys CatalogTablePartitionKeyArrayOutput `pulumi:"partitionKeys"`
	// Retention time for this table.
	Retention pulumi.IntPtrOutput `pulumi:"retention"`
	// A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
	StorageDescriptor CatalogTableStorageDescriptorPtrOutput `pulumi:"storageDescriptor"`
	// The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
	TableType pulumi.StringPtrOutput `pulumi:"tableType"`
	// If the table is a view, the expanded text of the view; otherwise null.
	ViewExpandedText pulumi.StringPtrOutput `pulumi:"viewExpandedText"`
	// If the table is a view, the original text of the view; otherwise null.
	ViewOriginalText pulumi.StringPtrOutput `pulumi:"viewOriginalText"`
}

// NewCatalogTable registers a new resource with the given unique name, arguments, and options.
func NewCatalogTable(ctx *pulumi.Context,
	name string, args *CatalogTableArgs, opts ...pulumi.ResourceOption) (*CatalogTable, error) {
	if args == nil || args.DatabaseName == nil {
		return nil, errors.New("missing required argument 'DatabaseName'")
	}
	if args == nil {
		args = &CatalogTableArgs{}
	}
	var resource CatalogTable
	err := ctx.RegisterResource("aws:glue/catalogTable:CatalogTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalogTable gets an existing CatalogTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalogTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogTableState, opts ...pulumi.ResourceOption) (*CatalogTable, error) {
	var resource CatalogTable
	err := ctx.ReadResource("aws:glue/catalogTable:CatalogTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CatalogTable resources.
type catalogTableState struct {
	// The ARN of the Glue Table.
	Arn *string `pulumi:"arn"`
	// ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
	CatalogId *string `pulumi:"catalogId"`
	// Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
	DatabaseName *string `pulumi:"databaseName"`
	// Description of the table.
	Description *string `pulumi:"description"`
	// Name of the SerDe.
	Name *string `pulumi:"name"`
	// Owner of the table.
	Owner *string `pulumi:"owner"`
	// A map of initialization parameters for the SerDe, in key-value form.
	Parameters map[string]string `pulumi:"parameters"`
	// A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
	PartitionKeys []CatalogTablePartitionKey `pulumi:"partitionKeys"`
	// Retention time for this table.
	Retention *int `pulumi:"retention"`
	// A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
	StorageDescriptor *CatalogTableStorageDescriptor `pulumi:"storageDescriptor"`
	// The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
	TableType *string `pulumi:"tableType"`
	// If the table is a view, the expanded text of the view; otherwise null.
	ViewExpandedText *string `pulumi:"viewExpandedText"`
	// If the table is a view, the original text of the view; otherwise null.
	ViewOriginalText *string `pulumi:"viewOriginalText"`
}

type CatalogTableState struct {
	// The ARN of the Glue Table.
	Arn pulumi.StringPtrInput
	// ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
	CatalogId pulumi.StringPtrInput
	// Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
	DatabaseName pulumi.StringPtrInput
	// Description of the table.
	Description pulumi.StringPtrInput
	// Name of the SerDe.
	Name pulumi.StringPtrInput
	// Owner of the table.
	Owner pulumi.StringPtrInput
	// A map of initialization parameters for the SerDe, in key-value form.
	Parameters pulumi.StringMapInput
	// A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
	PartitionKeys CatalogTablePartitionKeyArrayInput
	// Retention time for this table.
	Retention pulumi.IntPtrInput
	// A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
	StorageDescriptor CatalogTableStorageDescriptorPtrInput
	// The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
	TableType pulumi.StringPtrInput
	// If the table is a view, the expanded text of the view; otherwise null.
	ViewExpandedText pulumi.StringPtrInput
	// If the table is a view, the original text of the view; otherwise null.
	ViewOriginalText pulumi.StringPtrInput
}

func (CatalogTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogTableState)(nil)).Elem()
}

type catalogTableArgs struct {
	// ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
	CatalogId *string `pulumi:"catalogId"`
	// Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
	DatabaseName string `pulumi:"databaseName"`
	// Description of the table.
	Description *string `pulumi:"description"`
	// Name of the SerDe.
	Name *string `pulumi:"name"`
	// Owner of the table.
	Owner *string `pulumi:"owner"`
	// A map of initialization parameters for the SerDe, in key-value form.
	Parameters map[string]string `pulumi:"parameters"`
	// A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
	PartitionKeys []CatalogTablePartitionKey `pulumi:"partitionKeys"`
	// Retention time for this table.
	Retention *int `pulumi:"retention"`
	// A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
	StorageDescriptor *CatalogTableStorageDescriptor `pulumi:"storageDescriptor"`
	// The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
	TableType *string `pulumi:"tableType"`
	// If the table is a view, the expanded text of the view; otherwise null.
	ViewExpandedText *string `pulumi:"viewExpandedText"`
	// If the table is a view, the original text of the view; otherwise null.
	ViewOriginalText *string `pulumi:"viewOriginalText"`
}

// The set of arguments for constructing a CatalogTable resource.
type CatalogTableArgs struct {
	// ID of the Glue Catalog and database to create the table in. If omitted, this defaults to the AWS Account ID plus the database name.
	CatalogId pulumi.StringPtrInput
	// Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
	DatabaseName pulumi.StringInput
	// Description of the table.
	Description pulumi.StringPtrInput
	// Name of the SerDe.
	Name pulumi.StringPtrInput
	// Owner of the table.
	Owner pulumi.StringPtrInput
	// A map of initialization parameters for the SerDe, in key-value form.
	Parameters pulumi.StringMapInput
	// A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
	PartitionKeys CatalogTablePartitionKeyArrayInput
	// Retention time for this table.
	Retention pulumi.IntPtrInput
	// A storage descriptor object containing information about the physical storage of this table. You can refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor) for a full explanation of this object.
	StorageDescriptor CatalogTableStorageDescriptorPtrInput
	// The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
	TableType pulumi.StringPtrInput
	// If the table is a view, the expanded text of the view; otherwise null.
	ViewExpandedText pulumi.StringPtrInput
	// If the table is a view, the original text of the view; otherwise null.
	ViewOriginalText pulumi.StringPtrInput
}

func (CatalogTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogTableArgs)(nil)).Elem()
}
