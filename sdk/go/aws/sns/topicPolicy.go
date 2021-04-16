// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package sns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an SNS topic policy resource
//
// > **NOTE:** If a Principal is specified as just an AWS account ID rather than an ARN, AWS silently converts it to the ARN for the root user, causing future deployments to differ. To avoid this problem, just specify the full ARN, e.g. `arn:aws:iam::123456789012:root`
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/iam"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/sns"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		test, err := sns.NewTopic(ctx, "test", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = sns.NewTopicPolicy(ctx, "_default", &sns.TopicPolicyArgs{
// 			Arn: test.Arn,
// 			Policy: snsTopicPolicy.ApplyT(func(snsTopicPolicy iam.GetPolicyDocumentResult) (string, error) {
// 				return snsTopicPolicy.Json, nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// SNS Topic Policy can be imported using the topic ARN, e.g.
//
// ```sh
//  $ pulumi import aws:sns/topicPolicy:TopicPolicy user_updates arn:aws:sns:us-west-2:0123456789012:my-topic
// ```
type TopicPolicy struct {
	pulumi.CustomResourceState

	// The ARN of the SNS topic
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The fully-formed AWS policy as JSON.
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewTopicPolicy registers a new resource with the given unique name, arguments, and options.
func NewTopicPolicy(ctx *pulumi.Context,
	name string, args *TopicPolicyArgs, opts ...pulumi.ResourceOption) (*TopicPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Arn == nil {
		return nil, errors.New("invalid value for required argument 'Arn'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	var resource TopicPolicy
	err := ctx.RegisterResource("aws:sns/topicPolicy:TopicPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopicPolicy gets an existing TopicPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopicPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicPolicyState, opts ...pulumi.ResourceOption) (*TopicPolicy, error) {
	var resource TopicPolicy
	err := ctx.ReadResource("aws:sns/topicPolicy:TopicPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TopicPolicy resources.
type topicPolicyState struct {
	// The ARN of the SNS topic
	Arn *string `pulumi:"arn"`
	// The fully-formed AWS policy as JSON.
	Policy *string `pulumi:"policy"`
}

type TopicPolicyState struct {
	// The ARN of the SNS topic
	Arn pulumi.StringPtrInput
	// The fully-formed AWS policy as JSON.
	Policy pulumi.StringPtrInput
}

func (TopicPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicPolicyState)(nil)).Elem()
}

type topicPolicyArgs struct {
	// The ARN of the SNS topic
	Arn string `pulumi:"arn"`
	// The fully-formed AWS policy as JSON.
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a TopicPolicy resource.
type TopicPolicyArgs struct {
	// The ARN of the SNS topic
	Arn pulumi.StringInput
	// The fully-formed AWS policy as JSON.
	Policy pulumi.StringInput
}

func (TopicPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicPolicyArgs)(nil)).Elem()
}

type TopicPolicyInput interface {
	pulumi.Input

	ToTopicPolicyOutput() TopicPolicyOutput
	ToTopicPolicyOutputWithContext(ctx context.Context) TopicPolicyOutput
}

func (*TopicPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*TopicPolicy)(nil))
}

func (i *TopicPolicy) ToTopicPolicyOutput() TopicPolicyOutput {
	return i.ToTopicPolicyOutputWithContext(context.Background())
}

func (i *TopicPolicy) ToTopicPolicyOutputWithContext(ctx context.Context) TopicPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicPolicyOutput)
}

func (i *TopicPolicy) ToTopicPolicyPtrOutput() TopicPolicyPtrOutput {
	return i.ToTopicPolicyPtrOutputWithContext(context.Background())
}

func (i *TopicPolicy) ToTopicPolicyPtrOutputWithContext(ctx context.Context) TopicPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicPolicyPtrOutput)
}

type TopicPolicyPtrInput interface {
	pulumi.Input

	ToTopicPolicyPtrOutput() TopicPolicyPtrOutput
	ToTopicPolicyPtrOutputWithContext(ctx context.Context) TopicPolicyPtrOutput
}

type topicPolicyPtrType TopicPolicyArgs

func (*topicPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicPolicy)(nil))
}

func (i *topicPolicyPtrType) ToTopicPolicyPtrOutput() TopicPolicyPtrOutput {
	return i.ToTopicPolicyPtrOutputWithContext(context.Background())
}

func (i *topicPolicyPtrType) ToTopicPolicyPtrOutputWithContext(ctx context.Context) TopicPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicPolicyPtrOutput)
}

// TopicPolicyArrayInput is an input type that accepts TopicPolicyArray and TopicPolicyArrayOutput values.
// You can construct a concrete instance of `TopicPolicyArrayInput` via:
//
//          TopicPolicyArray{ TopicPolicyArgs{...} }
type TopicPolicyArrayInput interface {
	pulumi.Input

	ToTopicPolicyArrayOutput() TopicPolicyArrayOutput
	ToTopicPolicyArrayOutputWithContext(context.Context) TopicPolicyArrayOutput
}

type TopicPolicyArray []TopicPolicyInput

func (TopicPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TopicPolicy)(nil))
}

func (i TopicPolicyArray) ToTopicPolicyArrayOutput() TopicPolicyArrayOutput {
	return i.ToTopicPolicyArrayOutputWithContext(context.Background())
}

func (i TopicPolicyArray) ToTopicPolicyArrayOutputWithContext(ctx context.Context) TopicPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicPolicyArrayOutput)
}

// TopicPolicyMapInput is an input type that accepts TopicPolicyMap and TopicPolicyMapOutput values.
// You can construct a concrete instance of `TopicPolicyMapInput` via:
//
//          TopicPolicyMap{ "key": TopicPolicyArgs{...} }
type TopicPolicyMapInput interface {
	pulumi.Input

	ToTopicPolicyMapOutput() TopicPolicyMapOutput
	ToTopicPolicyMapOutputWithContext(context.Context) TopicPolicyMapOutput
}

type TopicPolicyMap map[string]TopicPolicyInput

func (TopicPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TopicPolicy)(nil))
}

func (i TopicPolicyMap) ToTopicPolicyMapOutput() TopicPolicyMapOutput {
	return i.ToTopicPolicyMapOutputWithContext(context.Background())
}

func (i TopicPolicyMap) ToTopicPolicyMapOutputWithContext(ctx context.Context) TopicPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicPolicyMapOutput)
}

type TopicPolicyOutput struct {
	*pulumi.OutputState
}

func (TopicPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TopicPolicy)(nil))
}

func (o TopicPolicyOutput) ToTopicPolicyOutput() TopicPolicyOutput {
	return o
}

func (o TopicPolicyOutput) ToTopicPolicyOutputWithContext(ctx context.Context) TopicPolicyOutput {
	return o
}

func (o TopicPolicyOutput) ToTopicPolicyPtrOutput() TopicPolicyPtrOutput {
	return o.ToTopicPolicyPtrOutputWithContext(context.Background())
}

func (o TopicPolicyOutput) ToTopicPolicyPtrOutputWithContext(ctx context.Context) TopicPolicyPtrOutput {
	return o.ApplyT(func(v TopicPolicy) *TopicPolicy {
		return &v
	}).(TopicPolicyPtrOutput)
}

type TopicPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (TopicPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicPolicy)(nil))
}

func (o TopicPolicyPtrOutput) ToTopicPolicyPtrOutput() TopicPolicyPtrOutput {
	return o
}

func (o TopicPolicyPtrOutput) ToTopicPolicyPtrOutputWithContext(ctx context.Context) TopicPolicyPtrOutput {
	return o
}

type TopicPolicyArrayOutput struct{ *pulumi.OutputState }

func (TopicPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TopicPolicy)(nil))
}

func (o TopicPolicyArrayOutput) ToTopicPolicyArrayOutput() TopicPolicyArrayOutput {
	return o
}

func (o TopicPolicyArrayOutput) ToTopicPolicyArrayOutputWithContext(ctx context.Context) TopicPolicyArrayOutput {
	return o
}

func (o TopicPolicyArrayOutput) Index(i pulumi.IntInput) TopicPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TopicPolicy {
		return vs[0].([]TopicPolicy)[vs[1].(int)]
	}).(TopicPolicyOutput)
}

type TopicPolicyMapOutput struct{ *pulumi.OutputState }

func (TopicPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TopicPolicy)(nil))
}

func (o TopicPolicyMapOutput) ToTopicPolicyMapOutput() TopicPolicyMapOutput {
	return o
}

func (o TopicPolicyMapOutput) ToTopicPolicyMapOutputWithContext(ctx context.Context) TopicPolicyMapOutput {
	return o
}

func (o TopicPolicyMapOutput) MapIndex(k pulumi.StringInput) TopicPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TopicPolicy {
		return vs[0].(map[string]TopicPolicy)[vs[1].(string)]
	}).(TopicPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(TopicPolicyOutput{})
	pulumi.RegisterOutputType(TopicPolicyPtrOutput{})
	pulumi.RegisterOutputType(TopicPolicyArrayOutput{})
	pulumi.RegisterOutputType(TopicPolicyMapOutput{})
}
