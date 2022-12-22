// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kinesis

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a Kinesis Stream Consumer.
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
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/kinesis"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kinesis.LookupStreamConsumer(ctx, &kinesis.LookupStreamConsumerArgs{
//				Name:      pulumi.StringRef("example-consumer"),
//				StreamArn: aws_kinesis_stream.Example.Arn,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupStreamConsumer(ctx *pulumi.Context, args *LookupStreamConsumerArgs, opts ...pulumi.InvokeOption) (*LookupStreamConsumerResult, error) {
	var rv LookupStreamConsumerResult
	err := ctx.Invoke("aws:kinesis/getStreamConsumer:getStreamConsumer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamConsumer.
type LookupStreamConsumerArgs struct {
	// ARN of the stream consumer.
	Arn *string `pulumi:"arn"`
	// Name of the stream consumer.
	Name *string `pulumi:"name"`
	// ARN of the data stream the consumer is registered with.
	StreamArn string `pulumi:"streamArn"`
}

// A collection of values returned by getStreamConsumer.
type LookupStreamConsumerResult struct {
	Arn string `pulumi:"arn"`
	// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
	CreationTimestamp string `pulumi:"creationTimestamp"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Current status of the stream consumer.
	Status    string `pulumi:"status"`
	StreamArn string `pulumi:"streamArn"`
}

func LookupStreamConsumerOutput(ctx *pulumi.Context, args LookupStreamConsumerOutputArgs, opts ...pulumi.InvokeOption) LookupStreamConsumerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupStreamConsumerResult, error) {
			args := v.(LookupStreamConsumerArgs)
			r, err := LookupStreamConsumer(ctx, &args, opts...)
			var s LookupStreamConsumerResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupStreamConsumerResultOutput)
}

// A collection of arguments for invoking getStreamConsumer.
type LookupStreamConsumerOutputArgs struct {
	// ARN of the stream consumer.
	Arn pulumi.StringPtrInput `pulumi:"arn"`
	// Name of the stream consumer.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// ARN of the data stream the consumer is registered with.
	StreamArn pulumi.StringInput `pulumi:"streamArn"`
}

func (LookupStreamConsumerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConsumerArgs)(nil)).Elem()
}

// A collection of values returned by getStreamConsumer.
type LookupStreamConsumerResultOutput struct{ *pulumi.OutputState }

func (LookupStreamConsumerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConsumerResult)(nil)).Elem()
}

func (o LookupStreamConsumerResultOutput) ToLookupStreamConsumerResultOutput() LookupStreamConsumerResultOutput {
	return o
}

func (o LookupStreamConsumerResultOutput) ToLookupStreamConsumerResultOutputWithContext(ctx context.Context) LookupStreamConsumerResultOutput {
	return o
}

func (o LookupStreamConsumerResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
func (o LookupStreamConsumerResultOutput) CreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.CreationTimestamp }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupStreamConsumerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupStreamConsumerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.Name }).(pulumi.StringOutput)
}

// Current status of the stream consumer.
func (o LookupStreamConsumerResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupStreamConsumerResultOutput) StreamArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConsumerResult) string { return v.StreamArn }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamConsumerResultOutput{})
}
