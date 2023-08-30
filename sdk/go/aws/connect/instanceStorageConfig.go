// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Connect Instance Storage Config resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// ## Example Usage
// ### Storage Config Kinesis Firehose Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewInstanceStorageConfig(ctx, "example", &connect.InstanceStorageConfigArgs{
//				InstanceId:   pulumi.Any(aws_connect_instance.Example.Id),
//				ResourceType: pulumi.String("CONTACT_TRACE_RECORDS"),
//				StorageConfig: &connect.InstanceStorageConfigStorageConfigArgs{
//					KinesisFirehoseConfig: &connect.InstanceStorageConfigStorageConfigKinesisFirehoseConfigArgs{
//						FirehoseArn: pulumi.Any(aws_kinesis_firehose_delivery_stream.Example.Arn),
//					},
//					StorageType: pulumi.String("KINESIS_FIREHOSE"),
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
// ### Storage Config Kinesis Stream Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewInstanceStorageConfig(ctx, "example", &connect.InstanceStorageConfigArgs{
//				InstanceId:   pulumi.Any(aws_connect_instance.Example.Id),
//				ResourceType: pulumi.String("CONTACT_TRACE_RECORDS"),
//				StorageConfig: &connect.InstanceStorageConfigStorageConfigArgs{
//					KinesisStreamConfig: &connect.InstanceStorageConfigStorageConfigKinesisStreamConfigArgs{
//						StreamArn: pulumi.Any(aws_kinesis_stream.Example.Arn),
//					},
//					StorageType: pulumi.String("KINESIS_STREAM"),
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
// ### Storage Config Kinesis Video Stream Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewInstanceStorageConfig(ctx, "example", &connect.InstanceStorageConfigArgs{
//				InstanceId:   pulumi.Any(aws_connect_instance.Example.Id),
//				ResourceType: pulumi.String("MEDIA_STREAMS"),
//				StorageConfig: &connect.InstanceStorageConfigStorageConfigArgs{
//					KinesisVideoStreamConfig: &connect.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs{
//						Prefix:               pulumi.String("example"),
//						RetentionPeriodHours: pulumi.Int(3),
//						EncryptionConfig: &connect.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs{
//							EncryptionType: pulumi.String("KMS"),
//							KeyId:          pulumi.Any(aws_kms_key.Example.Arn),
//						},
//					},
//					StorageType: pulumi.String("KINESIS_VIDEO_STREAM"),
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
// ### Storage Config S3 Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewInstanceStorageConfig(ctx, "example", &connect.InstanceStorageConfigArgs{
//				InstanceId:   pulumi.Any(aws_connect_instance.Example.Id),
//				ResourceType: pulumi.String("CHAT_TRANSCRIPTS"),
//				StorageConfig: &connect.InstanceStorageConfigStorageConfigArgs{
//					S3Config: &connect.InstanceStorageConfigStorageConfigS3ConfigArgs{
//						BucketName:   pulumi.Any(aws_s3_bucket.Example.Id),
//						BucketPrefix: pulumi.String("example"),
//					},
//					StorageType: pulumi.String("S3"),
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
// ### Storage Config S3 Config with Encryption Config
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewInstanceStorageConfig(ctx, "example", &connect.InstanceStorageConfigArgs{
//				InstanceId:   pulumi.Any(aws_connect_instance.Example.Id),
//				ResourceType: pulumi.String("CHAT_TRANSCRIPTS"),
//				StorageConfig: &connect.InstanceStorageConfigStorageConfigArgs{
//					S3Config: &connect.InstanceStorageConfigStorageConfigS3ConfigArgs{
//						BucketName:   pulumi.Any(aws_s3_bucket.Example.Id),
//						BucketPrefix: pulumi.String("example"),
//						EncryptionConfig: &connect.InstanceStorageConfigStorageConfigS3ConfigEncryptionConfigArgs{
//							EncryptionType: pulumi.String("KMS"),
//							KeyId:          pulumi.Any(aws_kms_key.Example.Arn),
//						},
//					},
//					StorageType: pulumi.String("S3"),
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
// Using `pulumi import`, import Amazon Connect Instance Storage Configs using the `instance_id`, `association_id`, and `resource_type` separated by a colon (`:`). For example:
//
// ```sh
//
//	$ pulumi import aws:connect/instanceStorageConfig:InstanceStorageConfig example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5:CHAT_TRANSCRIPTS
//
// ```
type InstanceStorageConfig struct {
	pulumi.CustomResourceState

	// The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
	AssociationId pulumi.StringOutput `pulumi:"associationId"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
	ResourceType pulumi.StringOutput `pulumi:"resourceType"`
	// Specifies the storage configuration options for the Connect Instance. Documented below.
	StorageConfig InstanceStorageConfigStorageConfigOutput `pulumi:"storageConfig"`
}

// NewInstanceStorageConfig registers a new resource with the given unique name, arguments, and options.
func NewInstanceStorageConfig(ctx *pulumi.Context,
	name string, args *InstanceStorageConfigArgs, opts ...pulumi.ResourceOption) (*InstanceStorageConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.ResourceType == nil {
		return nil, errors.New("invalid value for required argument 'ResourceType'")
	}
	if args.StorageConfig == nil {
		return nil, errors.New("invalid value for required argument 'StorageConfig'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceStorageConfig
	err := ctx.RegisterResource("aws:connect/instanceStorageConfig:InstanceStorageConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceStorageConfig gets an existing InstanceStorageConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceStorageConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceStorageConfigState, opts ...pulumi.ResourceOption) (*InstanceStorageConfig, error) {
	var resource InstanceStorageConfig
	err := ctx.ReadResource("aws:connect/instanceStorageConfig:InstanceStorageConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceStorageConfig resources.
type instanceStorageConfigState struct {
	// The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
	AssociationId *string `pulumi:"associationId"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
	ResourceType *string `pulumi:"resourceType"`
	// Specifies the storage configuration options for the Connect Instance. Documented below.
	StorageConfig *InstanceStorageConfigStorageConfig `pulumi:"storageConfig"`
}

type InstanceStorageConfigState struct {
	// The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
	AssociationId pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
	ResourceType pulumi.StringPtrInput
	// Specifies the storage configuration options for the Connect Instance. Documented below.
	StorageConfig InstanceStorageConfigStorageConfigPtrInput
}

func (InstanceStorageConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceStorageConfigState)(nil)).Elem()
}

type instanceStorageConfigArgs struct {
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
	ResourceType string `pulumi:"resourceType"`
	// Specifies the storage configuration options for the Connect Instance. Documented below.
	StorageConfig InstanceStorageConfigStorageConfig `pulumi:"storageConfig"`
}

// The set of arguments for constructing a InstanceStorageConfig resource.
type InstanceStorageConfigArgs struct {
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
	ResourceType pulumi.StringInput
	// Specifies the storage configuration options for the Connect Instance. Documented below.
	StorageConfig InstanceStorageConfigStorageConfigInput
}

func (InstanceStorageConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceStorageConfigArgs)(nil)).Elem()
}

type InstanceStorageConfigInput interface {
	pulumi.Input

	ToInstanceStorageConfigOutput() InstanceStorageConfigOutput
	ToInstanceStorageConfigOutputWithContext(ctx context.Context) InstanceStorageConfigOutput
}

func (*InstanceStorageConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceStorageConfig)(nil)).Elem()
}

func (i *InstanceStorageConfig) ToInstanceStorageConfigOutput() InstanceStorageConfigOutput {
	return i.ToInstanceStorageConfigOutputWithContext(context.Background())
}

func (i *InstanceStorageConfig) ToInstanceStorageConfigOutputWithContext(ctx context.Context) InstanceStorageConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceStorageConfigOutput)
}

// InstanceStorageConfigArrayInput is an input type that accepts InstanceStorageConfigArray and InstanceStorageConfigArrayOutput values.
// You can construct a concrete instance of `InstanceStorageConfigArrayInput` via:
//
//	InstanceStorageConfigArray{ InstanceStorageConfigArgs{...} }
type InstanceStorageConfigArrayInput interface {
	pulumi.Input

	ToInstanceStorageConfigArrayOutput() InstanceStorageConfigArrayOutput
	ToInstanceStorageConfigArrayOutputWithContext(context.Context) InstanceStorageConfigArrayOutput
}

type InstanceStorageConfigArray []InstanceStorageConfigInput

func (InstanceStorageConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceStorageConfig)(nil)).Elem()
}

func (i InstanceStorageConfigArray) ToInstanceStorageConfigArrayOutput() InstanceStorageConfigArrayOutput {
	return i.ToInstanceStorageConfigArrayOutputWithContext(context.Background())
}

func (i InstanceStorageConfigArray) ToInstanceStorageConfigArrayOutputWithContext(ctx context.Context) InstanceStorageConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceStorageConfigArrayOutput)
}

// InstanceStorageConfigMapInput is an input type that accepts InstanceStorageConfigMap and InstanceStorageConfigMapOutput values.
// You can construct a concrete instance of `InstanceStorageConfigMapInput` via:
//
//	InstanceStorageConfigMap{ "key": InstanceStorageConfigArgs{...} }
type InstanceStorageConfigMapInput interface {
	pulumi.Input

	ToInstanceStorageConfigMapOutput() InstanceStorageConfigMapOutput
	ToInstanceStorageConfigMapOutputWithContext(context.Context) InstanceStorageConfigMapOutput
}

type InstanceStorageConfigMap map[string]InstanceStorageConfigInput

func (InstanceStorageConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceStorageConfig)(nil)).Elem()
}

func (i InstanceStorageConfigMap) ToInstanceStorageConfigMapOutput() InstanceStorageConfigMapOutput {
	return i.ToInstanceStorageConfigMapOutputWithContext(context.Background())
}

func (i InstanceStorageConfigMap) ToInstanceStorageConfigMapOutputWithContext(ctx context.Context) InstanceStorageConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceStorageConfigMapOutput)
}

type InstanceStorageConfigOutput struct{ *pulumi.OutputState }

func (InstanceStorageConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceStorageConfig)(nil)).Elem()
}

func (o InstanceStorageConfigOutput) ToInstanceStorageConfigOutput() InstanceStorageConfigOutput {
	return o
}

func (o InstanceStorageConfigOutput) ToInstanceStorageConfigOutputWithContext(ctx context.Context) InstanceStorageConfigOutput {
	return o
}

// The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
func (o InstanceStorageConfigOutput) AssociationId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceStorageConfig) pulumi.StringOutput { return v.AssociationId }).(pulumi.StringOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o InstanceStorageConfigOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceStorageConfig) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// A valid resource type. Valid Values: `AGENT_EVENTS` | `ATTACHMENTS` | `CALL_RECORDINGS` | `CHAT_TRANSCRIPTS` | `CONTACT_EVALUATIONS` | `CONTACT_TRACE_RECORDS` | `MEDIA_STREAMS` | `REAL_TIME_CONTACT_ANALYSIS_SEGMENTS` | `SCHEDULED_REPORTS`.
func (o InstanceStorageConfigOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceStorageConfig) pulumi.StringOutput { return v.ResourceType }).(pulumi.StringOutput)
}

// Specifies the storage configuration options for the Connect Instance. Documented below.
func (o InstanceStorageConfigOutput) StorageConfig() InstanceStorageConfigStorageConfigOutput {
	return o.ApplyT(func(v *InstanceStorageConfig) InstanceStorageConfigStorageConfigOutput { return v.StorageConfig }).(InstanceStorageConfigStorageConfigOutput)
}

type InstanceStorageConfigArrayOutput struct{ *pulumi.OutputState }

func (InstanceStorageConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceStorageConfig)(nil)).Elem()
}

func (o InstanceStorageConfigArrayOutput) ToInstanceStorageConfigArrayOutput() InstanceStorageConfigArrayOutput {
	return o
}

func (o InstanceStorageConfigArrayOutput) ToInstanceStorageConfigArrayOutputWithContext(ctx context.Context) InstanceStorageConfigArrayOutput {
	return o
}

func (o InstanceStorageConfigArrayOutput) Index(i pulumi.IntInput) InstanceStorageConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceStorageConfig {
		return vs[0].([]*InstanceStorageConfig)[vs[1].(int)]
	}).(InstanceStorageConfigOutput)
}

type InstanceStorageConfigMapOutput struct{ *pulumi.OutputState }

func (InstanceStorageConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceStorageConfig)(nil)).Elem()
}

func (o InstanceStorageConfigMapOutput) ToInstanceStorageConfigMapOutput() InstanceStorageConfigMapOutput {
	return o
}

func (o InstanceStorageConfigMapOutput) ToInstanceStorageConfigMapOutputWithContext(ctx context.Context) InstanceStorageConfigMapOutput {
	return o
}

func (o InstanceStorageConfigMapOutput) MapIndex(k pulumi.StringInput) InstanceStorageConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceStorageConfig {
		return vs[0].(map[string]*InstanceStorageConfig)[vs[1].(string)]
	}).(InstanceStorageConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceStorageConfigInput)(nil)).Elem(), &InstanceStorageConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceStorageConfigArrayInput)(nil)).Elem(), InstanceStorageConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceStorageConfigMapInput)(nil)).Elem(), InstanceStorageConfigMap{})
	pulumi.RegisterOutputType(InstanceStorageConfigOutput{})
	pulumi.RegisterOutputType(InstanceStorageConfigArrayOutput{})
	pulumi.RegisterOutputType(InstanceStorageConfigMapOutput{})
}
