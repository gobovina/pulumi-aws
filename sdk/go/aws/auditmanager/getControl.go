// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auditmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS Audit Manager Control.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/auditmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auditmanager.LookupControl(ctx, &auditmanager.LookupControlArgs{
//				Name: "1. Risk Management",
//				Type: "Standard",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### With Framework Resource
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/auditmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := auditmanager.LookupControl(ctx, &auditmanager.LookupControlArgs{
//				Name: "1. Risk Management",
//				Type: "Standard",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			example2, err := auditmanager.LookupControl(ctx, &auditmanager.LookupControlArgs{
//				Name: "2. Personnel",
//				Type: "Standard",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = auditmanager.NewFramework(ctx, "example", &auditmanager.FrameworkArgs{
//				Name: pulumi.String("example"),
//				ControlSets: auditmanager.FrameworkControlSetArray{
//					&auditmanager.FrameworkControlSetArgs{
//						Name: pulumi.String("example"),
//						Controls: auditmanager.FrameworkControlSetControlArray{
//							&auditmanager.FrameworkControlSetControlArgs{
//								Id: *pulumi.String(example.Id),
//							},
//						},
//					},
//					&auditmanager.FrameworkControlSetArgs{
//						Name: pulumi.String("example2"),
//						Controls: auditmanager.FrameworkControlSetControlArray{
//							&auditmanager.FrameworkControlSetControlArgs{
//								Id: *pulumi.String(example2.Id),
//							},
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
func LookupControl(ctx *pulumi.Context, args *LookupControlArgs, opts ...pulumi.InvokeOption) (*LookupControlResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupControlResult
	err := ctx.Invoke("aws:auditmanager/getControl:getControl", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getControl.
type LookupControlArgs struct {
	ControlMappingSources []GetControlControlMappingSource `pulumi:"controlMappingSources"`
	// Name of the control.
	Name string `pulumi:"name"`
	// Type of control. Valid values are `Custom` and `Standard`.
	Type string `pulumi:"type"`
}

// A collection of values returned by getControl.
type LookupControlResult struct {
	ActionPlanInstructions string                           `pulumi:"actionPlanInstructions"`
	ActionPlanTitle        string                           `pulumi:"actionPlanTitle"`
	Arn                    string                           `pulumi:"arn"`
	ControlMappingSources  []GetControlControlMappingSource `pulumi:"controlMappingSources"`
	Description            string                           `pulumi:"description"`
	Id                     string                           `pulumi:"id"`
	Name                   string                           `pulumi:"name"`
	Tags                   map[string]string                `pulumi:"tags"`
	TestingInformation     string                           `pulumi:"testingInformation"`
	Type                   string                           `pulumi:"type"`
}

func LookupControlOutput(ctx *pulumi.Context, args LookupControlOutputArgs, opts ...pulumi.InvokeOption) LookupControlResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupControlResult, error) {
			args := v.(LookupControlArgs)
			r, err := LookupControl(ctx, &args, opts...)
			var s LookupControlResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupControlResultOutput)
}

// A collection of arguments for invoking getControl.
type LookupControlOutputArgs struct {
	ControlMappingSources GetControlControlMappingSourceArrayInput `pulumi:"controlMappingSources"`
	// Name of the control.
	Name pulumi.StringInput `pulumi:"name"`
	// Type of control. Valid values are `Custom` and `Standard`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (LookupControlOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupControlArgs)(nil)).Elem()
}

// A collection of values returned by getControl.
type LookupControlResultOutput struct{ *pulumi.OutputState }

func (LookupControlResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupControlResult)(nil)).Elem()
}

func (o LookupControlResultOutput) ToLookupControlResultOutput() LookupControlResultOutput {
	return o
}

func (o LookupControlResultOutput) ToLookupControlResultOutputWithContext(ctx context.Context) LookupControlResultOutput {
	return o
}

func (o LookupControlResultOutput) ActionPlanInstructions() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.ActionPlanInstructions }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) ActionPlanTitle() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.ActionPlanTitle }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) ControlMappingSources() GetControlControlMappingSourceArrayOutput {
	return o.ApplyT(func(v LookupControlResult) []GetControlControlMappingSource { return v.ControlMappingSources }).(GetControlControlMappingSourceArrayOutput)
}

func (o LookupControlResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupControlResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LookupControlResultOutput) TestingInformation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.TestingInformation }).(pulumi.StringOutput)
}

func (o LookupControlResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupControlResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupControlResultOutput{})
}
