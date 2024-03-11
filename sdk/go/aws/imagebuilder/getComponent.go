// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package imagebuilder

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about an Image Builder Component.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/imagebuilder"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := imagebuilder.LookupComponent(ctx, &imagebuilder.LookupComponentArgs{
//				Arn: "arn:aws:imagebuilder:us-west-2:aws:component/amazon-cloudwatch-agent-linux/1.0.0",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupComponent(ctx *pulumi.Context, args *LookupComponentArgs, opts ...pulumi.InvokeOption) (*LookupComponentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupComponentResult
	err := ctx.Invoke("aws:imagebuilder/getComponent:getComponent", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getComponent.
type LookupComponentArgs struct {
	// ARN of the component.
	Arn string `pulumi:"arn"`
	// Key-value map of resource tags for the component.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getComponent.
type LookupComponentResult struct {
	Arn string `pulumi:"arn"`
	// Change description of the component.
	ChangeDescription string `pulumi:"changeDescription"`
	// Data of the component.
	Data string `pulumi:"data"`
	// Date the component was created.
	DateCreated string `pulumi:"dateCreated"`
	// Description of the component.
	Description string `pulumi:"description"`
	// Encryption status of the component.
	Encrypted bool `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ARN of the Key Management Service (KMS) Key used to encrypt the component.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// Name of the component.
	Name string `pulumi:"name"`
	// Owner of the component.
	Owner string `pulumi:"owner"`
	// Platform of the component.
	Platform string `pulumi:"platform"`
	// Operating Systems (OSes) supported by the component.
	SupportedOsVersions []string `pulumi:"supportedOsVersions"`
	// Key-value map of resource tags for the component.
	Tags map[string]string `pulumi:"tags"`
	// Type of the component.
	Type string `pulumi:"type"`
	// Version of the component.
	Version string `pulumi:"version"`
}

func LookupComponentOutput(ctx *pulumi.Context, args LookupComponentOutputArgs, opts ...pulumi.InvokeOption) LookupComponentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupComponentResult, error) {
			args := v.(LookupComponentArgs)
			r, err := LookupComponent(ctx, &args, opts...)
			var s LookupComponentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupComponentResultOutput)
}

// A collection of arguments for invoking getComponent.
type LookupComponentOutputArgs struct {
	// ARN of the component.
	Arn pulumi.StringInput `pulumi:"arn"`
	// Key-value map of resource tags for the component.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupComponentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupComponentArgs)(nil)).Elem()
}

// A collection of values returned by getComponent.
type LookupComponentResultOutput struct{ *pulumi.OutputState }

func (LookupComponentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupComponentResult)(nil)).Elem()
}

func (o LookupComponentResultOutput) ToLookupComponentResultOutput() LookupComponentResultOutput {
	return o
}

func (o LookupComponentResultOutput) ToLookupComponentResultOutputWithContext(ctx context.Context) LookupComponentResultOutput {
	return o
}

func (o LookupComponentResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Change description of the component.
func (o LookupComponentResultOutput) ChangeDescription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.ChangeDescription }).(pulumi.StringOutput)
}

// Data of the component.
func (o LookupComponentResultOutput) Data() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Data }).(pulumi.StringOutput)
}

// Date the component was created.
func (o LookupComponentResultOutput) DateCreated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.DateCreated }).(pulumi.StringOutput)
}

// Description of the component.
func (o LookupComponentResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Description }).(pulumi.StringOutput)
}

// Encryption status of the component.
func (o LookupComponentResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupComponentResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupComponentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Id }).(pulumi.StringOutput)
}

// ARN of the Key Management Service (KMS) Key used to encrypt the component.
func (o LookupComponentResultOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Name of the component.
func (o LookupComponentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Name }).(pulumi.StringOutput)
}

// Owner of the component.
func (o LookupComponentResultOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Owner }).(pulumi.StringOutput)
}

// Platform of the component.
func (o LookupComponentResultOutput) Platform() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Platform }).(pulumi.StringOutput)
}

// Operating Systems (OSes) supported by the component.
func (o LookupComponentResultOutput) SupportedOsVersions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupComponentResult) []string { return v.SupportedOsVersions }).(pulumi.StringArrayOutput)
}

// Key-value map of resource tags for the component.
func (o LookupComponentResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupComponentResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Type of the component.
func (o LookupComponentResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Type }).(pulumi.StringOutput)
}

// Version of the component.
func (o LookupComponentResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupComponentResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupComponentResultOutput{})
}
