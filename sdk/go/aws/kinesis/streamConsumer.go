// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kinesis

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a Kinesis Stream Consumer.
//
// > **Note:** You can register up to 20 consumers per stream. A given consumer can only be registered with one stream at a time.
//
// For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kinesis"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := kinesis.NewStream(ctx, "example", &kinesis.StreamArgs{
//				Name:       pulumi.String("example-stream"),
//				ShardCount: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kinesis.NewStreamConsumer(ctx, "example", &kinesis.StreamConsumerArgs{
//				Name:      pulumi.String("example-consumer"),
//				StreamArn: example.Arn,
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
// Using `pulumi import`, import Kinesis Stream Consumers using the Amazon Resource Name (ARN). For example:
//
// ```sh
//
//	$ pulumi import aws:kinesis/streamConsumer:StreamConsumer example arn:aws:kinesis:us-west-2:123456789012:stream/example/consumer/example:1616044553
//
// ```
type StreamConsumer struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the stream consumer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
	CreationTimestamp pulumi.StringOutput `pulumi:"creationTimestamp"`
	// Name of the stream consumer.
	Name pulumi.StringOutput `pulumi:"name"`
	// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
	StreamArn pulumi.StringOutput `pulumi:"streamArn"`
}

// NewStreamConsumer registers a new resource with the given unique name, arguments, and options.
func NewStreamConsumer(ctx *pulumi.Context,
	name string, args *StreamConsumerArgs, opts ...pulumi.ResourceOption) (*StreamConsumer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StreamArn == nil {
		return nil, errors.New("invalid value for required argument 'StreamArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamConsumer
	err := ctx.RegisterResource("aws:kinesis/streamConsumer:StreamConsumer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamConsumer gets an existing StreamConsumer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamConsumer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamConsumerState, opts ...pulumi.ResourceOption) (*StreamConsumer, error) {
	var resource StreamConsumer
	err := ctx.ReadResource("aws:kinesis/streamConsumer:StreamConsumer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamConsumer resources.
type streamConsumerState struct {
	// Amazon Resource Name (ARN) of the stream consumer.
	Arn *string `pulumi:"arn"`
	// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// Name of the stream consumer.
	Name *string `pulumi:"name"`
	// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
	StreamArn *string `pulumi:"streamArn"`
}

type StreamConsumerState struct {
	// Amazon Resource Name (ARN) of the stream consumer.
	Arn pulumi.StringPtrInput
	// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
	CreationTimestamp pulumi.StringPtrInput
	// Name of the stream consumer.
	Name pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
	StreamArn pulumi.StringPtrInput
}

func (StreamConsumerState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamConsumerState)(nil)).Elem()
}

type streamConsumerArgs struct {
	// Name of the stream consumer.
	Name *string `pulumi:"name"`
	// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
	StreamArn string `pulumi:"streamArn"`
}

// The set of arguments for constructing a StreamConsumer resource.
type StreamConsumerArgs struct {
	// Name of the stream consumer.
	Name pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
	StreamArn pulumi.StringInput
}

func (StreamConsumerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamConsumerArgs)(nil)).Elem()
}

type StreamConsumerInput interface {
	pulumi.Input

	ToStreamConsumerOutput() StreamConsumerOutput
	ToStreamConsumerOutputWithContext(ctx context.Context) StreamConsumerOutput
}

func (*StreamConsumer) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamConsumer)(nil)).Elem()
}

func (i *StreamConsumer) ToStreamConsumerOutput() StreamConsumerOutput {
	return i.ToStreamConsumerOutputWithContext(context.Background())
}

func (i *StreamConsumer) ToStreamConsumerOutputWithContext(ctx context.Context) StreamConsumerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamConsumerOutput)
}

// StreamConsumerArrayInput is an input type that accepts StreamConsumerArray and StreamConsumerArrayOutput values.
// You can construct a concrete instance of `StreamConsumerArrayInput` via:
//
//	StreamConsumerArray{ StreamConsumerArgs{...} }
type StreamConsumerArrayInput interface {
	pulumi.Input

	ToStreamConsumerArrayOutput() StreamConsumerArrayOutput
	ToStreamConsumerArrayOutputWithContext(context.Context) StreamConsumerArrayOutput
}

type StreamConsumerArray []StreamConsumerInput

func (StreamConsumerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamConsumer)(nil)).Elem()
}

func (i StreamConsumerArray) ToStreamConsumerArrayOutput() StreamConsumerArrayOutput {
	return i.ToStreamConsumerArrayOutputWithContext(context.Background())
}

func (i StreamConsumerArray) ToStreamConsumerArrayOutputWithContext(ctx context.Context) StreamConsumerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamConsumerArrayOutput)
}

// StreamConsumerMapInput is an input type that accepts StreamConsumerMap and StreamConsumerMapOutput values.
// You can construct a concrete instance of `StreamConsumerMapInput` via:
//
//	StreamConsumerMap{ "key": StreamConsumerArgs{...} }
type StreamConsumerMapInput interface {
	pulumi.Input

	ToStreamConsumerMapOutput() StreamConsumerMapOutput
	ToStreamConsumerMapOutputWithContext(context.Context) StreamConsumerMapOutput
}

type StreamConsumerMap map[string]StreamConsumerInput

func (StreamConsumerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamConsumer)(nil)).Elem()
}

func (i StreamConsumerMap) ToStreamConsumerMapOutput() StreamConsumerMapOutput {
	return i.ToStreamConsumerMapOutputWithContext(context.Background())
}

func (i StreamConsumerMap) ToStreamConsumerMapOutputWithContext(ctx context.Context) StreamConsumerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamConsumerMapOutput)
}

type StreamConsumerOutput struct{ *pulumi.OutputState }

func (StreamConsumerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamConsumer)(nil)).Elem()
}

func (o StreamConsumerOutput) ToStreamConsumerOutput() StreamConsumerOutput {
	return o
}

func (o StreamConsumerOutput) ToStreamConsumerOutputWithContext(ctx context.Context) StreamConsumerOutput {
	return o
}

// Amazon Resource Name (ARN) of the stream consumer.
func (o StreamConsumerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamConsumer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
func (o StreamConsumerOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamConsumer) pulumi.StringOutput { return v.CreationTimestamp }).(pulumi.StringOutput)
}

// Name of the stream consumer.
func (o StreamConsumerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamConsumer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Amazon Resource Name (ARN) of the data stream the consumer is registered with.
func (o StreamConsumerOutput) StreamArn() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamConsumer) pulumi.StringOutput { return v.StreamArn }).(pulumi.StringOutput)
}

type StreamConsumerArrayOutput struct{ *pulumi.OutputState }

func (StreamConsumerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamConsumer)(nil)).Elem()
}

func (o StreamConsumerArrayOutput) ToStreamConsumerArrayOutput() StreamConsumerArrayOutput {
	return o
}

func (o StreamConsumerArrayOutput) ToStreamConsumerArrayOutputWithContext(ctx context.Context) StreamConsumerArrayOutput {
	return o
}

func (o StreamConsumerArrayOutput) Index(i pulumi.IntInput) StreamConsumerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamConsumer {
		return vs[0].([]*StreamConsumer)[vs[1].(int)]
	}).(StreamConsumerOutput)
}

type StreamConsumerMapOutput struct{ *pulumi.OutputState }

func (StreamConsumerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamConsumer)(nil)).Elem()
}

func (o StreamConsumerMapOutput) ToStreamConsumerMapOutput() StreamConsumerMapOutput {
	return o
}

func (o StreamConsumerMapOutput) ToStreamConsumerMapOutputWithContext(ctx context.Context) StreamConsumerMapOutput {
	return o
}

func (o StreamConsumerMapOutput) MapIndex(k pulumi.StringInput) StreamConsumerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamConsumer {
		return vs[0].(map[string]*StreamConsumer)[vs[1].(string)]
	}).(StreamConsumerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamConsumerInput)(nil)).Elem(), &StreamConsumer{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamConsumerArrayInput)(nil)).Elem(), StreamConsumerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamConsumerMapInput)(nil)).Elem(), StreamConsumerMap{})
	pulumi.RegisterOutputType(StreamConsumerOutput{})
	pulumi.RegisterOutputType(StreamConsumerArrayOutput{})
	pulumi.RegisterOutputType(StreamConsumerMapOutput{})
}
