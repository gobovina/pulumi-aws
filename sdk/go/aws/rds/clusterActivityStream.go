// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages RDS Aurora Cluster Database Activity Streams.
//
// Database Activity Streams have some limits and requirements, refer to the [Monitoring Amazon Aurora using Database Activity Streams](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html) documentation for detailed limitations and requirements.
//
// > **Note:** This resource always calls the RDS [`StartActivityStream`][2] API with the `ApplyImmediately` parameter set to `true`. This is because the provider needs the activity stream to be started in order for it to get the associated attributes.
//
// > **Note:** This resource depends on having at least one `rds.ClusterInstance` created. To avoid race conditions when all resources are being created together, add an explicit resource reference using the resource `dependsOn` meta-argument.
//
// > **Note:** This resource is available in all regions except the following: `cn-north-1`, `cn-northwest-1`, `us-gov-east-1`, `us-gov-west-1`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rds.NewCluster(ctx, "default", &rds.ClusterArgs{
//				ClusterIdentifier: pulumi.String("aurora-cluster-demo"),
//				AvailabilityZones: pulumi.StringArray{
//					pulumi.String("us-west-2a"),
//					pulumi.String("us-west-2b"),
//					pulumi.String("us-west-2c"),
//				},
//				DatabaseName:   pulumi.String("mydb"),
//				MasterUsername: pulumi.String("foo"),
//				MasterPassword: pulumi.String("mustbeeightcharaters"),
//				Engine:         pulumi.String("aurora-postgresql"),
//				EngineVersion:  pulumi.String("13.4"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rds.NewClusterInstance(ctx, "default", &rds.ClusterInstanceArgs{
//				Identifier:        pulumi.String("aurora-instance-demo"),
//				ClusterIdentifier: _default.ClusterIdentifier,
//				Engine:            _default.Engine,
//				InstanceClass:     pulumi.String("db.r6g.large"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultKey, err := kms.NewKey(ctx, "default", &kms.KeyArgs{
//				Description: pulumi.String("AWS KMS Key to encrypt Database Activity Stream"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rds.NewClusterActivityStream(ctx, "default", &rds.ClusterActivityStreamArgs{
//				ResourceArn: _default.Arn,
//				Mode:        pulumi.String("async"),
//				KmsKeyId:    defaultKey.KeyId,
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
// Using `pulumi import`, import RDS Aurora Cluster Database Activity Streams using the `resource_arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:rds/clusterActivityStream:ClusterActivityStream default arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster-demo
//
// ```
type ClusterActivityStream struct {
	pulumi.CustomResourceState

	// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
	EngineNativeAuditFieldsIncluded pulumi.BoolPtrOutput `pulumi:"engineNativeAuditFieldsIncluded"`
	// The name of the Amazon Kinesis data stream to be used for the database activity stream.
	KinesisStreamName pulumi.StringOutput `pulumi:"kinesisStreamName"`
	// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The Amazon Resource Name (ARN) of the DB cluster.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
}

// NewClusterActivityStream registers a new resource with the given unique name, arguments, and options.
func NewClusterActivityStream(ctx *pulumi.Context,
	name string, args *ClusterActivityStreamArgs, opts ...pulumi.ResourceOption) (*ClusterActivityStream, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KmsKeyId == nil {
		return nil, errors.New("invalid value for required argument 'KmsKeyId'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.ResourceArn == nil {
		return nil, errors.New("invalid value for required argument 'ResourceArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterActivityStream
	err := ctx.RegisterResource("aws:rds/clusterActivityStream:ClusterActivityStream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterActivityStream gets an existing ClusterActivityStream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterActivityStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterActivityStreamState, opts ...pulumi.ResourceOption) (*ClusterActivityStream, error) {
	var resource ClusterActivityStream
	err := ctx.ReadResource("aws:rds/clusterActivityStream:ClusterActivityStream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterActivityStream resources.
type clusterActivityStreamState struct {
	// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
	EngineNativeAuditFieldsIncluded *bool `pulumi:"engineNativeAuditFieldsIncluded"`
	// The name of the Amazon Kinesis data stream to be used for the database activity stream.
	KinesisStreamName *string `pulumi:"kinesisStreamName"`
	// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
	Mode *string `pulumi:"mode"`
	// The Amazon Resource Name (ARN) of the DB cluster.
	ResourceArn *string `pulumi:"resourceArn"`
}

type ClusterActivityStreamState struct {
	// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
	EngineNativeAuditFieldsIncluded pulumi.BoolPtrInput
	// The name of the Amazon Kinesis data stream to be used for the database activity stream.
	KinesisStreamName pulumi.StringPtrInput
	// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
	KmsKeyId pulumi.StringPtrInput
	// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
	Mode pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the DB cluster.
	ResourceArn pulumi.StringPtrInput
}

func (ClusterActivityStreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterActivityStreamState)(nil)).Elem()
}

type clusterActivityStreamArgs struct {
	// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
	EngineNativeAuditFieldsIncluded *bool `pulumi:"engineNativeAuditFieldsIncluded"`
	// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
	Mode string `pulumi:"mode"`
	// The Amazon Resource Name (ARN) of the DB cluster.
	ResourceArn string `pulumi:"resourceArn"`
}

// The set of arguments for constructing a ClusterActivityStream resource.
type ClusterActivityStreamArgs struct {
	// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
	EngineNativeAuditFieldsIncluded pulumi.BoolPtrInput
	// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
	KmsKeyId pulumi.StringInput
	// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
	Mode pulumi.StringInput
	// The Amazon Resource Name (ARN) of the DB cluster.
	ResourceArn pulumi.StringInput
}

func (ClusterActivityStreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterActivityStreamArgs)(nil)).Elem()
}

type ClusterActivityStreamInput interface {
	pulumi.Input

	ToClusterActivityStreamOutput() ClusterActivityStreamOutput
	ToClusterActivityStreamOutputWithContext(ctx context.Context) ClusterActivityStreamOutput
}

func (*ClusterActivityStream) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterActivityStream)(nil)).Elem()
}

func (i *ClusterActivityStream) ToClusterActivityStreamOutput() ClusterActivityStreamOutput {
	return i.ToClusterActivityStreamOutputWithContext(context.Background())
}

func (i *ClusterActivityStream) ToClusterActivityStreamOutputWithContext(ctx context.Context) ClusterActivityStreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterActivityStreamOutput)
}

// ClusterActivityStreamArrayInput is an input type that accepts ClusterActivityStreamArray and ClusterActivityStreamArrayOutput values.
// You can construct a concrete instance of `ClusterActivityStreamArrayInput` via:
//
//	ClusterActivityStreamArray{ ClusterActivityStreamArgs{...} }
type ClusterActivityStreamArrayInput interface {
	pulumi.Input

	ToClusterActivityStreamArrayOutput() ClusterActivityStreamArrayOutput
	ToClusterActivityStreamArrayOutputWithContext(context.Context) ClusterActivityStreamArrayOutput
}

type ClusterActivityStreamArray []ClusterActivityStreamInput

func (ClusterActivityStreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterActivityStream)(nil)).Elem()
}

func (i ClusterActivityStreamArray) ToClusterActivityStreamArrayOutput() ClusterActivityStreamArrayOutput {
	return i.ToClusterActivityStreamArrayOutputWithContext(context.Background())
}

func (i ClusterActivityStreamArray) ToClusterActivityStreamArrayOutputWithContext(ctx context.Context) ClusterActivityStreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterActivityStreamArrayOutput)
}

// ClusterActivityStreamMapInput is an input type that accepts ClusterActivityStreamMap and ClusterActivityStreamMapOutput values.
// You can construct a concrete instance of `ClusterActivityStreamMapInput` via:
//
//	ClusterActivityStreamMap{ "key": ClusterActivityStreamArgs{...} }
type ClusterActivityStreamMapInput interface {
	pulumi.Input

	ToClusterActivityStreamMapOutput() ClusterActivityStreamMapOutput
	ToClusterActivityStreamMapOutputWithContext(context.Context) ClusterActivityStreamMapOutput
}

type ClusterActivityStreamMap map[string]ClusterActivityStreamInput

func (ClusterActivityStreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterActivityStream)(nil)).Elem()
}

func (i ClusterActivityStreamMap) ToClusterActivityStreamMapOutput() ClusterActivityStreamMapOutput {
	return i.ToClusterActivityStreamMapOutputWithContext(context.Background())
}

func (i ClusterActivityStreamMap) ToClusterActivityStreamMapOutputWithContext(ctx context.Context) ClusterActivityStreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterActivityStreamMapOutput)
}

type ClusterActivityStreamOutput struct{ *pulumi.OutputState }

func (ClusterActivityStreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterActivityStream)(nil)).Elem()
}

func (o ClusterActivityStreamOutput) ToClusterActivityStreamOutput() ClusterActivityStreamOutput {
	return o
}

func (o ClusterActivityStreamOutput) ToClusterActivityStreamOutputWithContext(ctx context.Context) ClusterActivityStreamOutput {
	return o
}

// Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
func (o ClusterActivityStreamOutput) EngineNativeAuditFieldsIncluded() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterActivityStream) pulumi.BoolPtrOutput { return v.EngineNativeAuditFieldsIncluded }).(pulumi.BoolPtrOutput)
}

// The name of the Amazon Kinesis data stream to be used for the database activity stream.
func (o ClusterActivityStreamOutput) KinesisStreamName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterActivityStream) pulumi.StringOutput { return v.KinesisStreamName }).(pulumi.StringOutput)
}

// The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
func (o ClusterActivityStreamOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterActivityStream) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
func (o ClusterActivityStreamOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterActivityStream) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the DB cluster.
func (o ClusterActivityStreamOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterActivityStream) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

type ClusterActivityStreamArrayOutput struct{ *pulumi.OutputState }

func (ClusterActivityStreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterActivityStream)(nil)).Elem()
}

func (o ClusterActivityStreamArrayOutput) ToClusterActivityStreamArrayOutput() ClusterActivityStreamArrayOutput {
	return o
}

func (o ClusterActivityStreamArrayOutput) ToClusterActivityStreamArrayOutputWithContext(ctx context.Context) ClusterActivityStreamArrayOutput {
	return o
}

func (o ClusterActivityStreamArrayOutput) Index(i pulumi.IntInput) ClusterActivityStreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterActivityStream {
		return vs[0].([]*ClusterActivityStream)[vs[1].(int)]
	}).(ClusterActivityStreamOutput)
}

type ClusterActivityStreamMapOutput struct{ *pulumi.OutputState }

func (ClusterActivityStreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterActivityStream)(nil)).Elem()
}

func (o ClusterActivityStreamMapOutput) ToClusterActivityStreamMapOutput() ClusterActivityStreamMapOutput {
	return o
}

func (o ClusterActivityStreamMapOutput) ToClusterActivityStreamMapOutputWithContext(ctx context.Context) ClusterActivityStreamMapOutput {
	return o
}

func (o ClusterActivityStreamMapOutput) MapIndex(k pulumi.StringInput) ClusterActivityStreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterActivityStream {
		return vs[0].(map[string]*ClusterActivityStream)[vs[1].(string)]
	}).(ClusterActivityStreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterActivityStreamInput)(nil)).Elem(), &ClusterActivityStream{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterActivityStreamArrayInput)(nil)).Elem(), ClusterActivityStreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterActivityStreamMapInput)(nil)).Elem(), ClusterActivityStreamMap{})
	pulumi.RegisterOutputType(ClusterActivityStreamOutput{})
	pulumi.RegisterOutputType(ClusterActivityStreamArrayOutput{})
	pulumi.RegisterOutputType(ClusterActivityStreamMapOutput{})
}
