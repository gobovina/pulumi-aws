// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Glue Catalog Database Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality
//
// ## Example Usage
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
//			_, err := glue.NewCatalogDatabase(ctx, "example", &glue.CatalogDatabaseArgs{
//				Name: pulumi.String("MyCatalogDatabase"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Create Table Default Permissions
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
//			_, err := glue.NewCatalogDatabase(ctx, "example", &glue.CatalogDatabaseArgs{
//				CreateTableDefaultPermissions: glue.CatalogDatabaseCreateTableDefaultPermissionArray{
//					&glue.CatalogDatabaseCreateTableDefaultPermissionArgs{
//						Permissions: pulumi.StringArray{
//							pulumi.String("SELECT"),
//						},
//						Principal: &glue.CatalogDatabaseCreateTableDefaultPermissionPrincipalArgs{
//							DataLakePrincipalIdentifier: pulumi.String("IAM_ALLOWED_PRINCIPALS"),
//						},
//					},
//				},
//				Name: pulumi.String("MyCatalogDatabase"),
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
// Using `pulumi import`, import Glue Catalog Databases using the `catalog_id:name`. If you have not set a Catalog ID specify the AWS Account ID that the database is in. For example:
//
// ```sh
//
//	$ pulumi import aws:glue/catalogDatabase:CatalogDatabase database 123456789012:my_database
//
// ```
type CatalogDatabase struct {
	pulumi.CustomResourceState

	// ARN of the Glue Catalog Database.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
	CatalogId pulumi.StringOutput `pulumi:"catalogId"`
	// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
	CreateTableDefaultPermissions CatalogDatabaseCreateTableDefaultPermissionArrayOutput `pulumi:"createTableDefaultPermissions"`
	// Description of the database.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
	FederatedDatabase CatalogDatabaseFederatedDatabasePtrOutput `pulumi:"federatedDatabase"`
	// Location of the database (for example, an HDFS path).
	LocationUri pulumi.StringOutput `pulumi:"locationUri"`
	// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
	Name pulumi.StringOutput `pulumi:"name"`
	// List of key-value pairs that define parameters and properties of the database.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration block for a target database for resource linking. See `targetDatabase` below.
	TargetDatabase CatalogDatabaseTargetDatabasePtrOutput `pulumi:"targetDatabase"`
}

// NewCatalogDatabase registers a new resource with the given unique name, arguments, and options.
func NewCatalogDatabase(ctx *pulumi.Context,
	name string, args *CatalogDatabaseArgs, opts ...pulumi.ResourceOption) (*CatalogDatabase, error) {
	if args == nil {
		args = &CatalogDatabaseArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CatalogDatabase
	err := ctx.RegisterResource("aws:glue/catalogDatabase:CatalogDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalogDatabase gets an existing CatalogDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalogDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogDatabaseState, opts ...pulumi.ResourceOption) (*CatalogDatabase, error) {
	var resource CatalogDatabase
	err := ctx.ReadResource("aws:glue/catalogDatabase:CatalogDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CatalogDatabase resources.
type catalogDatabaseState struct {
	// ARN of the Glue Catalog Database.
	Arn *string `pulumi:"arn"`
	// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
	CatalogId *string `pulumi:"catalogId"`
	// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
	CreateTableDefaultPermissions []CatalogDatabaseCreateTableDefaultPermission `pulumi:"createTableDefaultPermissions"`
	// Description of the database.
	Description *string `pulumi:"description"`
	// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
	FederatedDatabase *CatalogDatabaseFederatedDatabase `pulumi:"federatedDatabase"`
	// Location of the database (for example, an HDFS path).
	LocationUri *string `pulumi:"locationUri"`
	// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
	Name *string `pulumi:"name"`
	// List of key-value pairs that define parameters and properties of the database.
	Parameters map[string]string `pulumi:"parameters"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block for a target database for resource linking. See `targetDatabase` below.
	TargetDatabase *CatalogDatabaseTargetDatabase `pulumi:"targetDatabase"`
}

type CatalogDatabaseState struct {
	// ARN of the Glue Catalog Database.
	Arn pulumi.StringPtrInput
	// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
	CatalogId pulumi.StringPtrInput
	// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
	CreateTableDefaultPermissions CatalogDatabaseCreateTableDefaultPermissionArrayInput
	// Description of the database.
	Description pulumi.StringPtrInput
	// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
	FederatedDatabase CatalogDatabaseFederatedDatabasePtrInput
	// Location of the database (for example, an HDFS path).
	LocationUri pulumi.StringPtrInput
	// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
	Name pulumi.StringPtrInput
	// List of key-value pairs that define parameters and properties of the database.
	Parameters pulumi.StringMapInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Configuration block for a target database for resource linking. See `targetDatabase` below.
	TargetDatabase CatalogDatabaseTargetDatabasePtrInput
}

func (CatalogDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogDatabaseState)(nil)).Elem()
}

type catalogDatabaseArgs struct {
	// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
	CatalogId *string `pulumi:"catalogId"`
	// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
	CreateTableDefaultPermissions []CatalogDatabaseCreateTableDefaultPermission `pulumi:"createTableDefaultPermissions"`
	// Description of the database.
	Description *string `pulumi:"description"`
	// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
	FederatedDatabase *CatalogDatabaseFederatedDatabase `pulumi:"federatedDatabase"`
	// Location of the database (for example, an HDFS path).
	LocationUri *string `pulumi:"locationUri"`
	// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
	Name *string `pulumi:"name"`
	// List of key-value pairs that define parameters and properties of the database.
	Parameters map[string]string `pulumi:"parameters"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Configuration block for a target database for resource linking. See `targetDatabase` below.
	TargetDatabase *CatalogDatabaseTargetDatabase `pulumi:"targetDatabase"`
}

// The set of arguments for constructing a CatalogDatabase resource.
type CatalogDatabaseArgs struct {
	// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
	CatalogId pulumi.StringPtrInput
	// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
	CreateTableDefaultPermissions CatalogDatabaseCreateTableDefaultPermissionArrayInput
	// Description of the database.
	Description pulumi.StringPtrInput
	// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
	FederatedDatabase CatalogDatabaseFederatedDatabasePtrInput
	// Location of the database (for example, an HDFS path).
	LocationUri pulumi.StringPtrInput
	// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
	Name pulumi.StringPtrInput
	// List of key-value pairs that define parameters and properties of the database.
	Parameters pulumi.StringMapInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Configuration block for a target database for resource linking. See `targetDatabase` below.
	TargetDatabase CatalogDatabaseTargetDatabasePtrInput
}

func (CatalogDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogDatabaseArgs)(nil)).Elem()
}

type CatalogDatabaseInput interface {
	pulumi.Input

	ToCatalogDatabaseOutput() CatalogDatabaseOutput
	ToCatalogDatabaseOutputWithContext(ctx context.Context) CatalogDatabaseOutput
}

func (*CatalogDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogDatabase)(nil)).Elem()
}

func (i *CatalogDatabase) ToCatalogDatabaseOutput() CatalogDatabaseOutput {
	return i.ToCatalogDatabaseOutputWithContext(context.Background())
}

func (i *CatalogDatabase) ToCatalogDatabaseOutputWithContext(ctx context.Context) CatalogDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogDatabaseOutput)
}

// CatalogDatabaseArrayInput is an input type that accepts CatalogDatabaseArray and CatalogDatabaseArrayOutput values.
// You can construct a concrete instance of `CatalogDatabaseArrayInput` via:
//
//	CatalogDatabaseArray{ CatalogDatabaseArgs{...} }
type CatalogDatabaseArrayInput interface {
	pulumi.Input

	ToCatalogDatabaseArrayOutput() CatalogDatabaseArrayOutput
	ToCatalogDatabaseArrayOutputWithContext(context.Context) CatalogDatabaseArrayOutput
}

type CatalogDatabaseArray []CatalogDatabaseInput

func (CatalogDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CatalogDatabase)(nil)).Elem()
}

func (i CatalogDatabaseArray) ToCatalogDatabaseArrayOutput() CatalogDatabaseArrayOutput {
	return i.ToCatalogDatabaseArrayOutputWithContext(context.Background())
}

func (i CatalogDatabaseArray) ToCatalogDatabaseArrayOutputWithContext(ctx context.Context) CatalogDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogDatabaseArrayOutput)
}

// CatalogDatabaseMapInput is an input type that accepts CatalogDatabaseMap and CatalogDatabaseMapOutput values.
// You can construct a concrete instance of `CatalogDatabaseMapInput` via:
//
//	CatalogDatabaseMap{ "key": CatalogDatabaseArgs{...} }
type CatalogDatabaseMapInput interface {
	pulumi.Input

	ToCatalogDatabaseMapOutput() CatalogDatabaseMapOutput
	ToCatalogDatabaseMapOutputWithContext(context.Context) CatalogDatabaseMapOutput
}

type CatalogDatabaseMap map[string]CatalogDatabaseInput

func (CatalogDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CatalogDatabase)(nil)).Elem()
}

func (i CatalogDatabaseMap) ToCatalogDatabaseMapOutput() CatalogDatabaseMapOutput {
	return i.ToCatalogDatabaseMapOutputWithContext(context.Background())
}

func (i CatalogDatabaseMap) ToCatalogDatabaseMapOutputWithContext(ctx context.Context) CatalogDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogDatabaseMapOutput)
}

type CatalogDatabaseOutput struct{ *pulumi.OutputState }

func (CatalogDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogDatabase)(nil)).Elem()
}

func (o CatalogDatabaseOutput) ToCatalogDatabaseOutput() CatalogDatabaseOutput {
	return o
}

func (o CatalogDatabaseOutput) ToCatalogDatabaseOutputWithContext(ctx context.Context) CatalogDatabaseOutput {
	return o
}

// ARN of the Glue Catalog Database.
func (o CatalogDatabaseOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
func (o CatalogDatabaseOutput) CatalogId() pulumi.StringOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringOutput { return v.CatalogId }).(pulumi.StringOutput)
}

// Creates a set of default permissions on the table for principals. See `createTableDefaultPermission` below.
func (o CatalogDatabaseOutput) CreateTableDefaultPermissions() CatalogDatabaseCreateTableDefaultPermissionArrayOutput {
	return o.ApplyT(func(v *CatalogDatabase) CatalogDatabaseCreateTableDefaultPermissionArrayOutput {
		return v.CreateTableDefaultPermissions
	}).(CatalogDatabaseCreateTableDefaultPermissionArrayOutput)
}

// Description of the database.
func (o CatalogDatabaseOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Configuration block that references an entity outside the AWS Glue Data Catalog. See `federatedDatabase` below.
func (o CatalogDatabaseOutput) FederatedDatabase() CatalogDatabaseFederatedDatabasePtrOutput {
	return o.ApplyT(func(v *CatalogDatabase) CatalogDatabaseFederatedDatabasePtrOutput { return v.FederatedDatabase }).(CatalogDatabaseFederatedDatabasePtrOutput)
}

// Location of the database (for example, an HDFS path).
func (o CatalogDatabaseOutput) LocationUri() pulumi.StringOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringOutput { return v.LocationUri }).(pulumi.StringOutput)
}

// Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
func (o CatalogDatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// List of key-value pairs that define parameters and properties of the database.
func (o CatalogDatabaseOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o CatalogDatabaseOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o CatalogDatabaseOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CatalogDatabase) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration block for a target database for resource linking. See `targetDatabase` below.
func (o CatalogDatabaseOutput) TargetDatabase() CatalogDatabaseTargetDatabasePtrOutput {
	return o.ApplyT(func(v *CatalogDatabase) CatalogDatabaseTargetDatabasePtrOutput { return v.TargetDatabase }).(CatalogDatabaseTargetDatabasePtrOutput)
}

type CatalogDatabaseArrayOutput struct{ *pulumi.OutputState }

func (CatalogDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CatalogDatabase)(nil)).Elem()
}

func (o CatalogDatabaseArrayOutput) ToCatalogDatabaseArrayOutput() CatalogDatabaseArrayOutput {
	return o
}

func (o CatalogDatabaseArrayOutput) ToCatalogDatabaseArrayOutputWithContext(ctx context.Context) CatalogDatabaseArrayOutput {
	return o
}

func (o CatalogDatabaseArrayOutput) Index(i pulumi.IntInput) CatalogDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CatalogDatabase {
		return vs[0].([]*CatalogDatabase)[vs[1].(int)]
	}).(CatalogDatabaseOutput)
}

type CatalogDatabaseMapOutput struct{ *pulumi.OutputState }

func (CatalogDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CatalogDatabase)(nil)).Elem()
}

func (o CatalogDatabaseMapOutput) ToCatalogDatabaseMapOutput() CatalogDatabaseMapOutput {
	return o
}

func (o CatalogDatabaseMapOutput) ToCatalogDatabaseMapOutputWithContext(ctx context.Context) CatalogDatabaseMapOutput {
	return o
}

func (o CatalogDatabaseMapOutput) MapIndex(k pulumi.StringInput) CatalogDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CatalogDatabase {
		return vs[0].(map[string]*CatalogDatabase)[vs[1].(string)]
	}).(CatalogDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogDatabaseInput)(nil)).Elem(), &CatalogDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogDatabaseArrayInput)(nil)).Elem(), CatalogDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogDatabaseMapInput)(nil)).Elem(), CatalogDatabaseMap{})
	pulumi.RegisterOutputType(CatalogDatabaseOutput{})
	pulumi.RegisterOutputType(CatalogDatabaseArrayOutput{})
	pulumi.RegisterOutputType(CatalogDatabaseMapOutput{})
}
