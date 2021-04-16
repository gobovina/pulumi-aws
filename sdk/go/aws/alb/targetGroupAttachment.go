// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `elb.Attachment` resource.
//
// > **Note:** `alb.TargetGroupAttachment` is known as `lb.TargetGroupAttachment`. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testTargetGroup, err := lb.NewTargetGroup(ctx, "testTargetGroup", nil)
// 		if err != nil {
// 			return err
// 		}
// 		testInstance, err := ec2.NewInstance(ctx, "testInstance", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = lb.NewTargetGroupAttachment(ctx, "testTargetGroupAttachment", &lb.TargetGroupAttachmentArgs{
// 			TargetGroupArn: testTargetGroup.Arn,
// 			TargetId:       testInstance.ID(),
// 			Port:           pulumi.Int(80),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Usage with lambda
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lambda"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testTargetGroup, err := lb.NewTargetGroup(ctx, "testTargetGroup", &lb.TargetGroupArgs{
// 			TargetType: pulumi.String("lambda"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testFunction, err := lambda.NewFunction(ctx, "testFunction", nil)
// 		if err != nil {
// 			return err
// 		}
// 		withLb, err := lambda.NewPermission(ctx, "withLb", &lambda.PermissionArgs{
// 			Action:    pulumi.String("lambda:InvokeFunction"),
// 			Function:  testFunction.Arn,
// 			Principal: pulumi.String("elasticloadbalancing.amazonaws.com"),
// 			SourceArn: testTargetGroup.Arn,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = lb.NewTargetGroupAttachment(ctx, "testTargetGroupAttachment", &lb.TargetGroupAttachmentArgs{
// 			TargetGroupArn: testTargetGroup.Arn,
// 			TargetId:       testFunction.Arn,
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			withLb,
// 		}))
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
// Target Group Attachments cannot be imported.
type TargetGroupAttachment struct {
	pulumi.CustomResourceState

	// The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
	AvailabilityZone pulumi.StringPtrOutput `pulumi:"availabilityZone"`
	// The port on which targets receive traffic.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The ARN of the target group with which to register targets
	TargetGroupArn pulumi.StringOutput `pulumi:"targetGroupArn"`
	// The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
	TargetId pulumi.StringOutput `pulumi:"targetId"`
}

// NewTargetGroupAttachment registers a new resource with the given unique name, arguments, and options.
func NewTargetGroupAttachment(ctx *pulumi.Context,
	name string, args *TargetGroupAttachmentArgs, opts ...pulumi.ResourceOption) (*TargetGroupAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TargetGroupArn == nil {
		return nil, errors.New("invalid value for required argument 'TargetGroupArn'")
	}
	if args.TargetId == nil {
		return nil, errors.New("invalid value for required argument 'TargetId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("aws:applicationloadbalancing/targetGroupAttachment:TargetGroupAttachment"),
		},
	})
	opts = append(opts, aliases)
	var resource TargetGroupAttachment
	err := ctx.RegisterResource("aws:alb/targetGroupAttachment:TargetGroupAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTargetGroupAttachment gets an existing TargetGroupAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTargetGroupAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TargetGroupAttachmentState, opts ...pulumi.ResourceOption) (*TargetGroupAttachment, error) {
	var resource TargetGroupAttachment
	err := ctx.ReadResource("aws:alb/targetGroupAttachment:TargetGroupAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TargetGroupAttachment resources.
type targetGroupAttachmentState struct {
	// The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The port on which targets receive traffic.
	Port *int `pulumi:"port"`
	// The ARN of the target group with which to register targets
	TargetGroupArn *string `pulumi:"targetGroupArn"`
	// The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
	TargetId *string `pulumi:"targetId"`
}

type TargetGroupAttachmentState struct {
	// The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
	AvailabilityZone pulumi.StringPtrInput
	// The port on which targets receive traffic.
	Port pulumi.IntPtrInput
	// The ARN of the target group with which to register targets
	TargetGroupArn pulumi.StringPtrInput
	// The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
	TargetId pulumi.StringPtrInput
}

func (TargetGroupAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetGroupAttachmentState)(nil)).Elem()
}

type targetGroupAttachmentArgs struct {
	// The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The port on which targets receive traffic.
	Port *int `pulumi:"port"`
	// The ARN of the target group with which to register targets
	TargetGroupArn string `pulumi:"targetGroupArn"`
	// The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
	TargetId string `pulumi:"targetId"`
}

// The set of arguments for constructing a TargetGroupAttachment resource.
type TargetGroupAttachmentArgs struct {
	// The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
	AvailabilityZone pulumi.StringPtrInput
	// The port on which targets receive traffic.
	Port pulumi.IntPtrInput
	// The ARN of the target group with which to register targets
	TargetGroupArn pulumi.StringInput
	// The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
	TargetId pulumi.StringInput
}

func (TargetGroupAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetGroupAttachmentArgs)(nil)).Elem()
}

type TargetGroupAttachmentInput interface {
	pulumi.Input

	ToTargetGroupAttachmentOutput() TargetGroupAttachmentOutput
	ToTargetGroupAttachmentOutputWithContext(ctx context.Context) TargetGroupAttachmentOutput
}

func (*TargetGroupAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*TargetGroupAttachment)(nil))
}

func (i *TargetGroupAttachment) ToTargetGroupAttachmentOutput() TargetGroupAttachmentOutput {
	return i.ToTargetGroupAttachmentOutputWithContext(context.Background())
}

func (i *TargetGroupAttachment) ToTargetGroupAttachmentOutputWithContext(ctx context.Context) TargetGroupAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetGroupAttachmentOutput)
}

func (i *TargetGroupAttachment) ToTargetGroupAttachmentPtrOutput() TargetGroupAttachmentPtrOutput {
	return i.ToTargetGroupAttachmentPtrOutputWithContext(context.Background())
}

func (i *TargetGroupAttachment) ToTargetGroupAttachmentPtrOutputWithContext(ctx context.Context) TargetGroupAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetGroupAttachmentPtrOutput)
}

type TargetGroupAttachmentPtrInput interface {
	pulumi.Input

	ToTargetGroupAttachmentPtrOutput() TargetGroupAttachmentPtrOutput
	ToTargetGroupAttachmentPtrOutputWithContext(ctx context.Context) TargetGroupAttachmentPtrOutput
}

type targetGroupAttachmentPtrType TargetGroupAttachmentArgs

func (*targetGroupAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TargetGroupAttachment)(nil))
}

func (i *targetGroupAttachmentPtrType) ToTargetGroupAttachmentPtrOutput() TargetGroupAttachmentPtrOutput {
	return i.ToTargetGroupAttachmentPtrOutputWithContext(context.Background())
}

func (i *targetGroupAttachmentPtrType) ToTargetGroupAttachmentPtrOutputWithContext(ctx context.Context) TargetGroupAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetGroupAttachmentPtrOutput)
}

// TargetGroupAttachmentArrayInput is an input type that accepts TargetGroupAttachmentArray and TargetGroupAttachmentArrayOutput values.
// You can construct a concrete instance of `TargetGroupAttachmentArrayInput` via:
//
//          TargetGroupAttachmentArray{ TargetGroupAttachmentArgs{...} }
type TargetGroupAttachmentArrayInput interface {
	pulumi.Input

	ToTargetGroupAttachmentArrayOutput() TargetGroupAttachmentArrayOutput
	ToTargetGroupAttachmentArrayOutputWithContext(context.Context) TargetGroupAttachmentArrayOutput
}

type TargetGroupAttachmentArray []TargetGroupAttachmentInput

func (TargetGroupAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TargetGroupAttachment)(nil))
}

func (i TargetGroupAttachmentArray) ToTargetGroupAttachmentArrayOutput() TargetGroupAttachmentArrayOutput {
	return i.ToTargetGroupAttachmentArrayOutputWithContext(context.Background())
}

func (i TargetGroupAttachmentArray) ToTargetGroupAttachmentArrayOutputWithContext(ctx context.Context) TargetGroupAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetGroupAttachmentArrayOutput)
}

// TargetGroupAttachmentMapInput is an input type that accepts TargetGroupAttachmentMap and TargetGroupAttachmentMapOutput values.
// You can construct a concrete instance of `TargetGroupAttachmentMapInput` via:
//
//          TargetGroupAttachmentMap{ "key": TargetGroupAttachmentArgs{...} }
type TargetGroupAttachmentMapInput interface {
	pulumi.Input

	ToTargetGroupAttachmentMapOutput() TargetGroupAttachmentMapOutput
	ToTargetGroupAttachmentMapOutputWithContext(context.Context) TargetGroupAttachmentMapOutput
}

type TargetGroupAttachmentMap map[string]TargetGroupAttachmentInput

func (TargetGroupAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TargetGroupAttachment)(nil))
}

func (i TargetGroupAttachmentMap) ToTargetGroupAttachmentMapOutput() TargetGroupAttachmentMapOutput {
	return i.ToTargetGroupAttachmentMapOutputWithContext(context.Background())
}

func (i TargetGroupAttachmentMap) ToTargetGroupAttachmentMapOutputWithContext(ctx context.Context) TargetGroupAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TargetGroupAttachmentMapOutput)
}

type TargetGroupAttachmentOutput struct {
	*pulumi.OutputState
}

func (TargetGroupAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TargetGroupAttachment)(nil))
}

func (o TargetGroupAttachmentOutput) ToTargetGroupAttachmentOutput() TargetGroupAttachmentOutput {
	return o
}

func (o TargetGroupAttachmentOutput) ToTargetGroupAttachmentOutputWithContext(ctx context.Context) TargetGroupAttachmentOutput {
	return o
}

func (o TargetGroupAttachmentOutput) ToTargetGroupAttachmentPtrOutput() TargetGroupAttachmentPtrOutput {
	return o.ToTargetGroupAttachmentPtrOutputWithContext(context.Background())
}

func (o TargetGroupAttachmentOutput) ToTargetGroupAttachmentPtrOutputWithContext(ctx context.Context) TargetGroupAttachmentPtrOutput {
	return o.ApplyT(func(v TargetGroupAttachment) *TargetGroupAttachment {
		return &v
	}).(TargetGroupAttachmentPtrOutput)
}

type TargetGroupAttachmentPtrOutput struct {
	*pulumi.OutputState
}

func (TargetGroupAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TargetGroupAttachment)(nil))
}

func (o TargetGroupAttachmentPtrOutput) ToTargetGroupAttachmentPtrOutput() TargetGroupAttachmentPtrOutput {
	return o
}

func (o TargetGroupAttachmentPtrOutput) ToTargetGroupAttachmentPtrOutputWithContext(ctx context.Context) TargetGroupAttachmentPtrOutput {
	return o
}

type TargetGroupAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TargetGroupAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TargetGroupAttachment)(nil))
}

func (o TargetGroupAttachmentArrayOutput) ToTargetGroupAttachmentArrayOutput() TargetGroupAttachmentArrayOutput {
	return o
}

func (o TargetGroupAttachmentArrayOutput) ToTargetGroupAttachmentArrayOutputWithContext(ctx context.Context) TargetGroupAttachmentArrayOutput {
	return o
}

func (o TargetGroupAttachmentArrayOutput) Index(i pulumi.IntInput) TargetGroupAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TargetGroupAttachment {
		return vs[0].([]TargetGroupAttachment)[vs[1].(int)]
	}).(TargetGroupAttachmentOutput)
}

type TargetGroupAttachmentMapOutput struct{ *pulumi.OutputState }

func (TargetGroupAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TargetGroupAttachment)(nil))
}

func (o TargetGroupAttachmentMapOutput) ToTargetGroupAttachmentMapOutput() TargetGroupAttachmentMapOutput {
	return o
}

func (o TargetGroupAttachmentMapOutput) ToTargetGroupAttachmentMapOutputWithContext(ctx context.Context) TargetGroupAttachmentMapOutput {
	return o
}

func (o TargetGroupAttachmentMapOutput) MapIndex(k pulumi.StringInput) TargetGroupAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TargetGroupAttachment {
		return vs[0].(map[string]TargetGroupAttachment)[vs[1].(string)]
	}).(TargetGroupAttachmentOutput)
}

func init() {
	pulumi.RegisterOutputType(TargetGroupAttachmentOutput{})
	pulumi.RegisterOutputType(TargetGroupAttachmentPtrOutput{})
	pulumi.RegisterOutputType(TargetGroupAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TargetGroupAttachmentMapOutput{})
}
