// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package controltower

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// List of Control Tower controls applied to an OU.
func GetControls(ctx *pulumi.Context, args *GetControlsArgs, opts ...pulumi.InvokeOption) (*GetControlsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetControlsResult
	err := ctx.Invoke("aws:controltower/getControls:getControls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getControls.
type GetControlsArgs struct {
	// The ARN of the organizational unit.
	TargetIdentifier string `pulumi:"targetIdentifier"`
}

// A collection of values returned by getControls.
type GetControlsResult struct {
	// List of all the ARNs for the controls applied to the `targetIdentifier`.
	EnabledControls []string `pulumi:"enabledControls"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	TargetIdentifier string `pulumi:"targetIdentifier"`
}

func GetControlsOutput(ctx *pulumi.Context, args GetControlsOutputArgs, opts ...pulumi.InvokeOption) GetControlsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetControlsResult, error) {
			args := v.(GetControlsArgs)
			r, err := GetControls(ctx, &args, opts...)
			var s GetControlsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetControlsResultOutput)
}

// A collection of arguments for invoking getControls.
type GetControlsOutputArgs struct {
	// The ARN of the organizational unit.
	TargetIdentifier pulumi.StringInput `pulumi:"targetIdentifier"`
}

func (GetControlsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetControlsArgs)(nil)).Elem()
}

// A collection of values returned by getControls.
type GetControlsResultOutput struct{ *pulumi.OutputState }

func (GetControlsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetControlsResult)(nil)).Elem()
}

func (o GetControlsResultOutput) ToGetControlsResultOutput() GetControlsResultOutput {
	return o
}

func (o GetControlsResultOutput) ToGetControlsResultOutputWithContext(ctx context.Context) GetControlsResultOutput {
	return o
}

// List of all the ARNs for the controls applied to the `targetIdentifier`.
func (o GetControlsResultOutput) EnabledControls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetControlsResult) []string { return v.EnabledControls }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetControlsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetControlsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetControlsResultOutput) TargetIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetControlsResult) string { return v.TargetIdentifier }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetControlsResultOutput{})
}
