// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package inspector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Inspector Classic Assessment Target
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/inspector"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			bar, err := inspector.NewResourceGroup(ctx, "bar", &inspector.ResourceGroupArgs{
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("foo"),
//					"Env":  pulumi.String("bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = inspector.NewAssessmentTarget(ctx, "foo", &inspector.AssessmentTargetArgs{
//				Name:             pulumi.String("assessment target"),
//				ResourceGroupArn: bar.Arn,
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
// Using `pulumi import`, import Inspector Classic Assessment Targets using their Amazon Resource Name (ARN). For example:
//
// ```sh
//
//	$ pulumi import aws:inspector/assessmentTarget:AssessmentTarget example arn:aws:inspector:us-east-1:123456789012:target/0-xxxxxxx
//
// ```
type AssessmentTarget struct {
	pulumi.CustomResourceState

	// The target assessment ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The name of the assessment target.
	Name pulumi.StringOutput `pulumi:"name"`
	// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
	ResourceGroupArn pulumi.StringPtrOutput `pulumi:"resourceGroupArn"`
}

// NewAssessmentTarget registers a new resource with the given unique name, arguments, and options.
func NewAssessmentTarget(ctx *pulumi.Context,
	name string, args *AssessmentTargetArgs, opts ...pulumi.ResourceOption) (*AssessmentTarget, error) {
	if args == nil {
		args = &AssessmentTargetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AssessmentTarget
	err := ctx.RegisterResource("aws:inspector/assessmentTarget:AssessmentTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssessmentTarget gets an existing AssessmentTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssessmentTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssessmentTargetState, opts ...pulumi.ResourceOption) (*AssessmentTarget, error) {
	var resource AssessmentTarget
	err := ctx.ReadResource("aws:inspector/assessmentTarget:AssessmentTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssessmentTarget resources.
type assessmentTargetState struct {
	// The target assessment ARN.
	Arn *string `pulumi:"arn"`
	// The name of the assessment target.
	Name *string `pulumi:"name"`
	// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
	ResourceGroupArn *string `pulumi:"resourceGroupArn"`
}

type AssessmentTargetState struct {
	// The target assessment ARN.
	Arn pulumi.StringPtrInput
	// The name of the assessment target.
	Name pulumi.StringPtrInput
	// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
	ResourceGroupArn pulumi.StringPtrInput
}

func (AssessmentTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentTargetState)(nil)).Elem()
}

type assessmentTargetArgs struct {
	// The name of the assessment target.
	Name *string `pulumi:"name"`
	// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
	ResourceGroupArn *string `pulumi:"resourceGroupArn"`
}

// The set of arguments for constructing a AssessmentTarget resource.
type AssessmentTargetArgs struct {
	// The name of the assessment target.
	Name pulumi.StringPtrInput
	// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
	ResourceGroupArn pulumi.StringPtrInput
}

func (AssessmentTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentTargetArgs)(nil)).Elem()
}

type AssessmentTargetInput interface {
	pulumi.Input

	ToAssessmentTargetOutput() AssessmentTargetOutput
	ToAssessmentTargetOutputWithContext(ctx context.Context) AssessmentTargetOutput
}

func (*AssessmentTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentTarget)(nil)).Elem()
}

func (i *AssessmentTarget) ToAssessmentTargetOutput() AssessmentTargetOutput {
	return i.ToAssessmentTargetOutputWithContext(context.Background())
}

func (i *AssessmentTarget) ToAssessmentTargetOutputWithContext(ctx context.Context) AssessmentTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentTargetOutput)
}

// AssessmentTargetArrayInput is an input type that accepts AssessmentTargetArray and AssessmentTargetArrayOutput values.
// You can construct a concrete instance of `AssessmentTargetArrayInput` via:
//
//	AssessmentTargetArray{ AssessmentTargetArgs{...} }
type AssessmentTargetArrayInput interface {
	pulumi.Input

	ToAssessmentTargetArrayOutput() AssessmentTargetArrayOutput
	ToAssessmentTargetArrayOutputWithContext(context.Context) AssessmentTargetArrayOutput
}

type AssessmentTargetArray []AssessmentTargetInput

func (AssessmentTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssessmentTarget)(nil)).Elem()
}

func (i AssessmentTargetArray) ToAssessmentTargetArrayOutput() AssessmentTargetArrayOutput {
	return i.ToAssessmentTargetArrayOutputWithContext(context.Background())
}

func (i AssessmentTargetArray) ToAssessmentTargetArrayOutputWithContext(ctx context.Context) AssessmentTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentTargetArrayOutput)
}

// AssessmentTargetMapInput is an input type that accepts AssessmentTargetMap and AssessmentTargetMapOutput values.
// You can construct a concrete instance of `AssessmentTargetMapInput` via:
//
//	AssessmentTargetMap{ "key": AssessmentTargetArgs{...} }
type AssessmentTargetMapInput interface {
	pulumi.Input

	ToAssessmentTargetMapOutput() AssessmentTargetMapOutput
	ToAssessmentTargetMapOutputWithContext(context.Context) AssessmentTargetMapOutput
}

type AssessmentTargetMap map[string]AssessmentTargetInput

func (AssessmentTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssessmentTarget)(nil)).Elem()
}

func (i AssessmentTargetMap) ToAssessmentTargetMapOutput() AssessmentTargetMapOutput {
	return i.ToAssessmentTargetMapOutputWithContext(context.Background())
}

func (i AssessmentTargetMap) ToAssessmentTargetMapOutputWithContext(ctx context.Context) AssessmentTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentTargetMapOutput)
}

type AssessmentTargetOutput struct{ *pulumi.OutputState }

func (AssessmentTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentTarget)(nil)).Elem()
}

func (o AssessmentTargetOutput) ToAssessmentTargetOutput() AssessmentTargetOutput {
	return o
}

func (o AssessmentTargetOutput) ToAssessmentTargetOutputWithContext(ctx context.Context) AssessmentTargetOutput {
	return o
}

// The target assessment ARN.
func (o AssessmentTargetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentTarget) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The name of the assessment target.
func (o AssessmentTargetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentTarget) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
func (o AssessmentTargetOutput) ResourceGroupArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AssessmentTarget) pulumi.StringPtrOutput { return v.ResourceGroupArn }).(pulumi.StringPtrOutput)
}

type AssessmentTargetArrayOutput struct{ *pulumi.OutputState }

func (AssessmentTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssessmentTarget)(nil)).Elem()
}

func (o AssessmentTargetArrayOutput) ToAssessmentTargetArrayOutput() AssessmentTargetArrayOutput {
	return o
}

func (o AssessmentTargetArrayOutput) ToAssessmentTargetArrayOutputWithContext(ctx context.Context) AssessmentTargetArrayOutput {
	return o
}

func (o AssessmentTargetArrayOutput) Index(i pulumi.IntInput) AssessmentTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssessmentTarget {
		return vs[0].([]*AssessmentTarget)[vs[1].(int)]
	}).(AssessmentTargetOutput)
}

type AssessmentTargetMapOutput struct{ *pulumi.OutputState }

func (AssessmentTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssessmentTarget)(nil)).Elem()
}

func (o AssessmentTargetMapOutput) ToAssessmentTargetMapOutput() AssessmentTargetMapOutput {
	return o
}

func (o AssessmentTargetMapOutput) ToAssessmentTargetMapOutputWithContext(ctx context.Context) AssessmentTargetMapOutput {
	return o
}

func (o AssessmentTargetMapOutput) MapIndex(k pulumi.StringInput) AssessmentTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssessmentTarget {
		return vs[0].(map[string]*AssessmentTarget)[vs[1].(string)]
	}).(AssessmentTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentTargetInput)(nil)).Elem(), &AssessmentTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentTargetArrayInput)(nil)).Elem(), AssessmentTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentTargetMapInput)(nil)).Elem(), AssessmentTargetMap{})
	pulumi.RegisterOutputType(AssessmentTargetOutput{})
	pulumi.RegisterOutputType(AssessmentTargetArrayOutput{})
	pulumi.RegisterOutputType(AssessmentTargetMapOutput{})
}
