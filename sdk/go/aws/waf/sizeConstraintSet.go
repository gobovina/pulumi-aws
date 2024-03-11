// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `waf.SizeConstraintSet` resource to manage WAF size constraint sets.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/waf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := waf.NewSizeConstraintSet(ctx, "size_constraint_set", &waf.SizeConstraintSetArgs{
//				Name: pulumi.String("tfsize_constraints"),
//				SizeConstraints: waf.SizeConstraintSetSizeConstraintArray{
//					&waf.SizeConstraintSetSizeConstraintArgs{
//						TextTransformation: pulumi.String("NONE"),
//						ComparisonOperator: pulumi.String("EQ"),
//						Size:               pulumi.Int(4096),
//						FieldToMatch: &waf.SizeConstraintSetSizeConstraintFieldToMatchArgs{
//							Type: pulumi.String("BODY"),
//						},
//					},
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import AWS WAF Size Constraint Set using their ID. For example:
//
// ```sh
// $ pulumi import aws:waf/sizeConstraintSet:SizeConstraintSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
// ```
type SizeConstraintSet struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name or description of the Size Constraint Set.
	Name pulumi.StringOutput `pulumi:"name"`
	// Parts of web requests that you want to inspect the size of.
	SizeConstraints SizeConstraintSetSizeConstraintArrayOutput `pulumi:"sizeConstraints"`
}

// NewSizeConstraintSet registers a new resource with the given unique name, arguments, and options.
func NewSizeConstraintSet(ctx *pulumi.Context,
	name string, args *SizeConstraintSetArgs, opts ...pulumi.ResourceOption) (*SizeConstraintSet, error) {
	if args == nil {
		args = &SizeConstraintSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SizeConstraintSet
	err := ctx.RegisterResource("aws:waf/sizeConstraintSet:SizeConstraintSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSizeConstraintSet gets an existing SizeConstraintSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSizeConstraintSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SizeConstraintSetState, opts ...pulumi.ResourceOption) (*SizeConstraintSet, error) {
	var resource SizeConstraintSet
	err := ctx.ReadResource("aws:waf/sizeConstraintSet:SizeConstraintSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SizeConstraintSet resources.
type sizeConstraintSetState struct {
	// Amazon Resource Name (ARN).
	Arn *string `pulumi:"arn"`
	// Name or description of the Size Constraint Set.
	Name *string `pulumi:"name"`
	// Parts of web requests that you want to inspect the size of.
	SizeConstraints []SizeConstraintSetSizeConstraint `pulumi:"sizeConstraints"`
}

type SizeConstraintSetState struct {
	// Amazon Resource Name (ARN).
	Arn pulumi.StringPtrInput
	// Name or description of the Size Constraint Set.
	Name pulumi.StringPtrInput
	// Parts of web requests that you want to inspect the size of.
	SizeConstraints SizeConstraintSetSizeConstraintArrayInput
}

func (SizeConstraintSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*sizeConstraintSetState)(nil)).Elem()
}

type sizeConstraintSetArgs struct {
	// Name or description of the Size Constraint Set.
	Name *string `pulumi:"name"`
	// Parts of web requests that you want to inspect the size of.
	SizeConstraints []SizeConstraintSetSizeConstraint `pulumi:"sizeConstraints"`
}

// The set of arguments for constructing a SizeConstraintSet resource.
type SizeConstraintSetArgs struct {
	// Name or description of the Size Constraint Set.
	Name pulumi.StringPtrInput
	// Parts of web requests that you want to inspect the size of.
	SizeConstraints SizeConstraintSetSizeConstraintArrayInput
}

func (SizeConstraintSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sizeConstraintSetArgs)(nil)).Elem()
}

type SizeConstraintSetInput interface {
	pulumi.Input

	ToSizeConstraintSetOutput() SizeConstraintSetOutput
	ToSizeConstraintSetOutputWithContext(ctx context.Context) SizeConstraintSetOutput
}

func (*SizeConstraintSet) ElementType() reflect.Type {
	return reflect.TypeOf((**SizeConstraintSet)(nil)).Elem()
}

func (i *SizeConstraintSet) ToSizeConstraintSetOutput() SizeConstraintSetOutput {
	return i.ToSizeConstraintSetOutputWithContext(context.Background())
}

func (i *SizeConstraintSet) ToSizeConstraintSetOutputWithContext(ctx context.Context) SizeConstraintSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SizeConstraintSetOutput)
}

// SizeConstraintSetArrayInput is an input type that accepts SizeConstraintSetArray and SizeConstraintSetArrayOutput values.
// You can construct a concrete instance of `SizeConstraintSetArrayInput` via:
//
//	SizeConstraintSetArray{ SizeConstraintSetArgs{...} }
type SizeConstraintSetArrayInput interface {
	pulumi.Input

	ToSizeConstraintSetArrayOutput() SizeConstraintSetArrayOutput
	ToSizeConstraintSetArrayOutputWithContext(context.Context) SizeConstraintSetArrayOutput
}

type SizeConstraintSetArray []SizeConstraintSetInput

func (SizeConstraintSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SizeConstraintSet)(nil)).Elem()
}

func (i SizeConstraintSetArray) ToSizeConstraintSetArrayOutput() SizeConstraintSetArrayOutput {
	return i.ToSizeConstraintSetArrayOutputWithContext(context.Background())
}

func (i SizeConstraintSetArray) ToSizeConstraintSetArrayOutputWithContext(ctx context.Context) SizeConstraintSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SizeConstraintSetArrayOutput)
}

// SizeConstraintSetMapInput is an input type that accepts SizeConstraintSetMap and SizeConstraintSetMapOutput values.
// You can construct a concrete instance of `SizeConstraintSetMapInput` via:
//
//	SizeConstraintSetMap{ "key": SizeConstraintSetArgs{...} }
type SizeConstraintSetMapInput interface {
	pulumi.Input

	ToSizeConstraintSetMapOutput() SizeConstraintSetMapOutput
	ToSizeConstraintSetMapOutputWithContext(context.Context) SizeConstraintSetMapOutput
}

type SizeConstraintSetMap map[string]SizeConstraintSetInput

func (SizeConstraintSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SizeConstraintSet)(nil)).Elem()
}

func (i SizeConstraintSetMap) ToSizeConstraintSetMapOutput() SizeConstraintSetMapOutput {
	return i.ToSizeConstraintSetMapOutputWithContext(context.Background())
}

func (i SizeConstraintSetMap) ToSizeConstraintSetMapOutputWithContext(ctx context.Context) SizeConstraintSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SizeConstraintSetMapOutput)
}

type SizeConstraintSetOutput struct{ *pulumi.OutputState }

func (SizeConstraintSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SizeConstraintSet)(nil)).Elem()
}

func (o SizeConstraintSetOutput) ToSizeConstraintSetOutput() SizeConstraintSetOutput {
	return o
}

func (o SizeConstraintSetOutput) ToSizeConstraintSetOutputWithContext(ctx context.Context) SizeConstraintSetOutput {
	return o
}

// Amazon Resource Name (ARN).
func (o SizeConstraintSetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SizeConstraintSet) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name or description of the Size Constraint Set.
func (o SizeConstraintSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SizeConstraintSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Parts of web requests that you want to inspect the size of.
func (o SizeConstraintSetOutput) SizeConstraints() SizeConstraintSetSizeConstraintArrayOutput {
	return o.ApplyT(func(v *SizeConstraintSet) SizeConstraintSetSizeConstraintArrayOutput { return v.SizeConstraints }).(SizeConstraintSetSizeConstraintArrayOutput)
}

type SizeConstraintSetArrayOutput struct{ *pulumi.OutputState }

func (SizeConstraintSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SizeConstraintSet)(nil)).Elem()
}

func (o SizeConstraintSetArrayOutput) ToSizeConstraintSetArrayOutput() SizeConstraintSetArrayOutput {
	return o
}

func (o SizeConstraintSetArrayOutput) ToSizeConstraintSetArrayOutputWithContext(ctx context.Context) SizeConstraintSetArrayOutput {
	return o
}

func (o SizeConstraintSetArrayOutput) Index(i pulumi.IntInput) SizeConstraintSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SizeConstraintSet {
		return vs[0].([]*SizeConstraintSet)[vs[1].(int)]
	}).(SizeConstraintSetOutput)
}

type SizeConstraintSetMapOutput struct{ *pulumi.OutputState }

func (SizeConstraintSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SizeConstraintSet)(nil)).Elem()
}

func (o SizeConstraintSetMapOutput) ToSizeConstraintSetMapOutput() SizeConstraintSetMapOutput {
	return o
}

func (o SizeConstraintSetMapOutput) ToSizeConstraintSetMapOutputWithContext(ctx context.Context) SizeConstraintSetMapOutput {
	return o
}

func (o SizeConstraintSetMapOutput) MapIndex(k pulumi.StringInput) SizeConstraintSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SizeConstraintSet {
		return vs[0].(map[string]*SizeConstraintSet)[vs[1].(string)]
	}).(SizeConstraintSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SizeConstraintSetInput)(nil)).Elem(), &SizeConstraintSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*SizeConstraintSetArrayInput)(nil)).Elem(), SizeConstraintSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SizeConstraintSetMapInput)(nil)).Elem(), SizeConstraintSetMap{})
	pulumi.RegisterOutputType(SizeConstraintSetOutput{})
	pulumi.RegisterOutputType(SizeConstraintSetArrayOutput{})
	pulumi.RegisterOutputType(SizeConstraintSetMapOutput{})
}
