// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lambda

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Lambda Code Signing Config. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
//
// For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.LookupCodeSigningConfig(ctx, &lambda.LookupCodeSigningConfigArgs{
//				Arn: fmt.Sprintf("arn:aws:lambda:%v:%v:code-signing-config:csc-0f6c334abcdea4d8b", awsRegion, awsAccount),
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
func LookupCodeSigningConfig(ctx *pulumi.Context, args *LookupCodeSigningConfigArgs, opts ...pulumi.InvokeOption) (*LookupCodeSigningConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCodeSigningConfigResult
	err := ctx.Invoke("aws:lambda/getCodeSigningConfig:getCodeSigningConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCodeSigningConfig.
type LookupCodeSigningConfigArgs struct {
	// ARN of the code signing configuration.
	Arn string `pulumi:"arn"`
}

// A collection of values returned by getCodeSigningConfig.
type LookupCodeSigningConfigResult struct {
	// List of allowed publishers as signing profiles for this code signing configuration.
	AllowedPublishers []GetCodeSigningConfigAllowedPublisher `pulumi:"allowedPublishers"`
	Arn               string                                 `pulumi:"arn"`
	// Unique identifier for the code signing configuration.
	ConfigId string `pulumi:"configId"`
	// Code signing configuration description.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Date and time that the code signing configuration was last modified.
	LastModified string `pulumi:"lastModified"`
	// List of code signing policies that control the validation failure action for signature mismatch or expiry.
	Policies []GetCodeSigningConfigPolicy `pulumi:"policies"`
}

func LookupCodeSigningConfigOutput(ctx *pulumi.Context, args LookupCodeSigningConfigOutputArgs, opts ...pulumi.InvokeOption) LookupCodeSigningConfigResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCodeSigningConfigResult, error) {
			args := v.(LookupCodeSigningConfigArgs)
			r, err := LookupCodeSigningConfig(ctx, &args, opts...)
			var s LookupCodeSigningConfigResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCodeSigningConfigResultOutput)
}

// A collection of arguments for invoking getCodeSigningConfig.
type LookupCodeSigningConfigOutputArgs struct {
	// ARN of the code signing configuration.
	Arn pulumi.StringInput `pulumi:"arn"`
}

func (LookupCodeSigningConfigOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCodeSigningConfigArgs)(nil)).Elem()
}

// A collection of values returned by getCodeSigningConfig.
type LookupCodeSigningConfigResultOutput struct{ *pulumi.OutputState }

func (LookupCodeSigningConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCodeSigningConfigResult)(nil)).Elem()
}

func (o LookupCodeSigningConfigResultOutput) ToLookupCodeSigningConfigResultOutput() LookupCodeSigningConfigResultOutput {
	return o
}

func (o LookupCodeSigningConfigResultOutput) ToLookupCodeSigningConfigResultOutputWithContext(ctx context.Context) LookupCodeSigningConfigResultOutput {
	return o
}

// List of allowed publishers as signing profiles for this code signing configuration.
func (o LookupCodeSigningConfigResultOutput) AllowedPublishers() GetCodeSigningConfigAllowedPublisherArrayOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) []GetCodeSigningConfigAllowedPublisher {
		return v.AllowedPublishers
	}).(GetCodeSigningConfigAllowedPublisherArrayOutput)
}

func (o LookupCodeSigningConfigResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Unique identifier for the code signing configuration.
func (o LookupCodeSigningConfigResultOutput) ConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) string { return v.ConfigId }).(pulumi.StringOutput)
}

// Code signing configuration description.
func (o LookupCodeSigningConfigResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCodeSigningConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

// Date and time that the code signing configuration was last modified.
func (o LookupCodeSigningConfigResultOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) string { return v.LastModified }).(pulumi.StringOutput)
}

// List of code signing policies that control the validation failure action for signature mismatch or expiry.
func (o LookupCodeSigningConfigResultOutput) Policies() GetCodeSigningConfigPolicyArrayOutput {
	return o.ApplyT(func(v LookupCodeSigningConfigResult) []GetCodeSigningConfigPolicy { return v.Policies }).(GetCodeSigningConfigPolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCodeSigningConfigResultOutput{})
}
