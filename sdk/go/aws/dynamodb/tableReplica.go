// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynamodb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DynamoDB table replica resource for [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html).
//
// > **Note:** Use `lifecycle` `ignoreChanges` for `replica` in the associated dynamodb.Table configuration.
//
// > **Note:** Do not use the `replica` configuration block of dynamodb.Table together with this resource as the two configuration options are mutually exclusive.
//
// ## Example Usage
// ### Basic Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dynamodb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aws.NewProvider(ctx, "main", &aws.ProviderArgs{
//				Region: pulumi.String("us-west-2"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = aws.NewProvider(ctx, "alt", &aws.ProviderArgs{
//				Region: pulumi.String("us-east-2"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTable, err := dynamodb.NewTable(ctx, "exampleTable", &dynamodb.TableArgs{
//				HashKey:        pulumi.String("BrodoBaggins"),
//				BillingMode:    pulumi.String("PAY_PER_REQUEST"),
//				StreamEnabled:  pulumi.Bool(true),
//				StreamViewType: pulumi.String("NEW_AND_OLD_IMAGES"),
//				Attributes: dynamodb.TableAttributeArray{
//					&dynamodb.TableAttributeArgs{
//						Name: pulumi.String("BrodoBaggins"),
//						Type: pulumi.String("S"),
//					},
//				},
//			}, pulumi.Provider(aws.Main))
//			if err != nil {
//				return err
//			}
//			_, err = dynamodb.NewTableReplica(ctx, "exampleTableReplica", &dynamodb.TableReplicaArgs{
//				GlobalTableArn: exampleTable.Arn,
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("IZPAWS"),
//					"Pozo": pulumi.String("Amargo"),
//				},
//			}, pulumi.Provider(aws.Alt))
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
// ~> __Note:__ When importing, use the region where the initial or _main_ global table resides, _not_ the region of the replica.
//
// Using `pulumi import`, import DynamoDB table replicas using the `table-name:main-region`. For example:
//
// ~> __Note:__ When importing, use the region where the initial or _main_ global table resides, _not_ the region of the replica.
//
// ```sh
//
//	$ pulumi import aws:dynamodb/tableReplica:TableReplica example TestTable:us-west-2
//
// ```
type TableReplica struct {
	pulumi.CustomResourceState

	// ARN of the table replica.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ARN of the _main_ or global table which this resource will replicate.
	//
	// Optional arguments:
	GlobalTableArn pulumi.StringOutput `pulumi:"globalTableArn"`
	// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
	// Whether to enable Point In Time Recovery for the replica. Default is `false`.
	PointInTimeRecovery pulumi.BoolPtrOutput `pulumi:"pointInTimeRecovery"`
	// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
	TableClassOverride pulumi.StringPtrOutput `pulumi:"tableClassOverride"`
	// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewTableReplica registers a new resource with the given unique name, arguments, and options.
func NewTableReplica(ctx *pulumi.Context,
	name string, args *TableReplicaArgs, opts ...pulumi.ResourceOption) (*TableReplica, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GlobalTableArn == nil {
		return nil, errors.New("invalid value for required argument 'GlobalTableArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableReplica
	err := ctx.RegisterResource("aws:dynamodb/tableReplica:TableReplica", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableReplica gets an existing TableReplica resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableReplica(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableReplicaState, opts ...pulumi.ResourceOption) (*TableReplica, error) {
	var resource TableReplica
	err := ctx.ReadResource("aws:dynamodb/tableReplica:TableReplica", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableReplica resources.
type tableReplicaState struct {
	// ARN of the table replica.
	Arn *string `pulumi:"arn"`
	// ARN of the _main_ or global table which this resource will replicate.
	//
	// Optional arguments:
	GlobalTableArn *string `pulumi:"globalTableArn"`
	// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Whether to enable Point In Time Recovery for the replica. Default is `false`.
	PointInTimeRecovery *bool `pulumi:"pointInTimeRecovery"`
	// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
	TableClassOverride *string `pulumi:"tableClassOverride"`
	// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type TableReplicaState struct {
	// ARN of the table replica.
	Arn pulumi.StringPtrInput
	// ARN of the _main_ or global table which this resource will replicate.
	//
	// Optional arguments:
	GlobalTableArn pulumi.StringPtrInput
	// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
	KmsKeyArn pulumi.StringPtrInput
	// Whether to enable Point In Time Recovery for the replica. Default is `false`.
	PointInTimeRecovery pulumi.BoolPtrInput
	// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
	TableClassOverride pulumi.StringPtrInput
	// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (TableReplicaState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableReplicaState)(nil)).Elem()
}

type tableReplicaArgs struct {
	// ARN of the _main_ or global table which this resource will replicate.
	//
	// Optional arguments:
	GlobalTableArn string `pulumi:"globalTableArn"`
	// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Whether to enable Point In Time Recovery for the replica. Default is `false`.
	PointInTimeRecovery *bool `pulumi:"pointInTimeRecovery"`
	// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
	TableClassOverride *string `pulumi:"tableClassOverride"`
	// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a TableReplica resource.
type TableReplicaArgs struct {
	// ARN of the _main_ or global table which this resource will replicate.
	//
	// Optional arguments:
	GlobalTableArn pulumi.StringInput
	// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
	KmsKeyArn pulumi.StringPtrInput
	// Whether to enable Point In Time Recovery for the replica. Default is `false`.
	PointInTimeRecovery pulumi.BoolPtrInput
	// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
	TableClassOverride pulumi.StringPtrInput
	// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (TableReplicaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableReplicaArgs)(nil)).Elem()
}

type TableReplicaInput interface {
	pulumi.Input

	ToTableReplicaOutput() TableReplicaOutput
	ToTableReplicaOutputWithContext(ctx context.Context) TableReplicaOutput
}

func (*TableReplica) ElementType() reflect.Type {
	return reflect.TypeOf((**TableReplica)(nil)).Elem()
}

func (i *TableReplica) ToTableReplicaOutput() TableReplicaOutput {
	return i.ToTableReplicaOutputWithContext(context.Background())
}

func (i *TableReplica) ToTableReplicaOutputWithContext(ctx context.Context) TableReplicaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableReplicaOutput)
}

// TableReplicaArrayInput is an input type that accepts TableReplicaArray and TableReplicaArrayOutput values.
// You can construct a concrete instance of `TableReplicaArrayInput` via:
//
//	TableReplicaArray{ TableReplicaArgs{...} }
type TableReplicaArrayInput interface {
	pulumi.Input

	ToTableReplicaArrayOutput() TableReplicaArrayOutput
	ToTableReplicaArrayOutputWithContext(context.Context) TableReplicaArrayOutput
}

type TableReplicaArray []TableReplicaInput

func (TableReplicaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableReplica)(nil)).Elem()
}

func (i TableReplicaArray) ToTableReplicaArrayOutput() TableReplicaArrayOutput {
	return i.ToTableReplicaArrayOutputWithContext(context.Background())
}

func (i TableReplicaArray) ToTableReplicaArrayOutputWithContext(ctx context.Context) TableReplicaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableReplicaArrayOutput)
}

// TableReplicaMapInput is an input type that accepts TableReplicaMap and TableReplicaMapOutput values.
// You can construct a concrete instance of `TableReplicaMapInput` via:
//
//	TableReplicaMap{ "key": TableReplicaArgs{...} }
type TableReplicaMapInput interface {
	pulumi.Input

	ToTableReplicaMapOutput() TableReplicaMapOutput
	ToTableReplicaMapOutputWithContext(context.Context) TableReplicaMapOutput
}

type TableReplicaMap map[string]TableReplicaInput

func (TableReplicaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableReplica)(nil)).Elem()
}

func (i TableReplicaMap) ToTableReplicaMapOutput() TableReplicaMapOutput {
	return i.ToTableReplicaMapOutputWithContext(context.Background())
}

func (i TableReplicaMap) ToTableReplicaMapOutputWithContext(ctx context.Context) TableReplicaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableReplicaMapOutput)
}

type TableReplicaOutput struct{ *pulumi.OutputState }

func (TableReplicaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableReplica)(nil)).Elem()
}

func (o TableReplicaOutput) ToTableReplicaOutput() TableReplicaOutput {
	return o
}

func (o TableReplicaOutput) ToTableReplicaOutputWithContext(ctx context.Context) TableReplicaOutput {
	return o
}

// ARN of the table replica.
func (o TableReplicaOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ARN of the _main_ or global table which this resource will replicate.
//
// Optional arguments:
func (o TableReplicaOutput) GlobalTableArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringOutput { return v.GlobalTableArn }).(pulumi.StringOutput)
}

// ARN of the CMK that should be used for the AWS KMS encryption. This argument should only be used if the key is different from the default KMS-managed DynamoDB key, `alias/aws/dynamodb`. **Note:** This attribute will _not_ be populated with the ARN of _default_ keys.
func (o TableReplicaOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

// Whether to enable Point In Time Recovery for the replica. Default is `false`.
func (o TableReplicaOutput) PointInTimeRecovery() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.BoolPtrOutput { return v.PointInTimeRecovery }).(pulumi.BoolPtrOutput)
}

// Storage class of the table replica. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`. If not used, the table replica will use the same class as the global table.
func (o TableReplicaOutput) TableClassOverride() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringPtrOutput { return v.TableClassOverride }).(pulumi.StringPtrOutput)
}

// Map of tags to populate on the created table. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TableReplicaOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o TableReplicaOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TableReplica) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type TableReplicaArrayOutput struct{ *pulumi.OutputState }

func (TableReplicaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableReplica)(nil)).Elem()
}

func (o TableReplicaArrayOutput) ToTableReplicaArrayOutput() TableReplicaArrayOutput {
	return o
}

func (o TableReplicaArrayOutput) ToTableReplicaArrayOutputWithContext(ctx context.Context) TableReplicaArrayOutput {
	return o
}

func (o TableReplicaArrayOutput) Index(i pulumi.IntInput) TableReplicaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableReplica {
		return vs[0].([]*TableReplica)[vs[1].(int)]
	}).(TableReplicaOutput)
}

type TableReplicaMapOutput struct{ *pulumi.OutputState }

func (TableReplicaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableReplica)(nil)).Elem()
}

func (o TableReplicaMapOutput) ToTableReplicaMapOutput() TableReplicaMapOutput {
	return o
}

func (o TableReplicaMapOutput) ToTableReplicaMapOutputWithContext(ctx context.Context) TableReplicaMapOutput {
	return o
}

func (o TableReplicaMapOutput) MapIndex(k pulumi.StringInput) TableReplicaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableReplica {
		return vs[0].(map[string]*TableReplica)[vs[1].(string)]
	}).(TableReplicaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableReplicaInput)(nil)).Elem(), &TableReplica{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableReplicaArrayInput)(nil)).Elem(), TableReplicaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableReplicaMapInput)(nil)).Elem(), TableReplicaMap{})
	pulumi.RegisterOutputType(TableReplicaOutput{})
	pulumi.RegisterOutputType(TableReplicaArrayOutput{})
	pulumi.RegisterOutputType(TableReplicaMapOutput{})
}
