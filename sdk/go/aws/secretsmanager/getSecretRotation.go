// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretsmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `secretsmanager.Secret` data source. To retrieve a secret value, see the `secretsmanager.SecretVersion` data source.
//
// ## Example Usage
// ### Retrieve Secret Rotation Configuration
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretsmanager.LookupSecretRotation(ctx, &secretsmanager.LookupSecretRotationArgs{
//				SecretId: exampleAwsSecretsmanagerSecret.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSecretRotation(ctx *pulumi.Context, args *LookupSecretRotationArgs, opts ...pulumi.InvokeOption) (*LookupSecretRotationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecretRotationResult
	err := ctx.Invoke("aws:secretsmanager/getSecretRotation:getSecretRotation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecretRotation.
type LookupSecretRotationArgs struct {
	// Specifies the secret containing the version that you want to retrieve. You can specify either the ARN or the friendly name of the secret.
	SecretId string `pulumi:"secretId"`
}

// A collection of values returned by getSecretRotation.
type LookupSecretRotationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ARN of the secret.
	RotationEnabled bool `pulumi:"rotationEnabled"`
	// Decrypted part of the protected secret information that was originally provided as a string.
	RotationLambdaArn string `pulumi:"rotationLambdaArn"`
	// Decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
	RotationRules []GetSecretRotationRotationRule `pulumi:"rotationRules"`
	SecretId      string                          `pulumi:"secretId"`
}

func LookupSecretRotationOutput(ctx *pulumi.Context, args LookupSecretRotationOutputArgs, opts ...pulumi.InvokeOption) LookupSecretRotationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSecretRotationResult, error) {
			args := v.(LookupSecretRotationArgs)
			r, err := LookupSecretRotation(ctx, &args, opts...)
			var s LookupSecretRotationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSecretRotationResultOutput)
}

// A collection of arguments for invoking getSecretRotation.
type LookupSecretRotationOutputArgs struct {
	// Specifies the secret containing the version that you want to retrieve. You can specify either the ARN or the friendly name of the secret.
	SecretId pulumi.StringInput `pulumi:"secretId"`
}

func (LookupSecretRotationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretRotationArgs)(nil)).Elem()
}

// A collection of values returned by getSecretRotation.
type LookupSecretRotationResultOutput struct{ *pulumi.OutputState }

func (LookupSecretRotationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretRotationResult)(nil)).Elem()
}

func (o LookupSecretRotationResultOutput) ToLookupSecretRotationResultOutput() LookupSecretRotationResultOutput {
	return o
}

func (o LookupSecretRotationResultOutput) ToLookupSecretRotationResultOutputWithContext(ctx context.Context) LookupSecretRotationResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecretRotationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretRotationResult) string { return v.Id }).(pulumi.StringOutput)
}

// ARN of the secret.
func (o LookupSecretRotationResultOutput) RotationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSecretRotationResult) bool { return v.RotationEnabled }).(pulumi.BoolOutput)
}

// Decrypted part of the protected secret information that was originally provided as a string.
func (o LookupSecretRotationResultOutput) RotationLambdaArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretRotationResult) string { return v.RotationLambdaArn }).(pulumi.StringOutput)
}

// Decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
func (o LookupSecretRotationResultOutput) RotationRules() GetSecretRotationRotationRuleArrayOutput {
	return o.ApplyT(func(v LookupSecretRotationResult) []GetSecretRotationRotationRule { return v.RotationRules }).(GetSecretRotationRotationRuleArrayOutput)
}

func (o LookupSecretRotationResultOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretRotationResult) string { return v.SecretId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecretRotationResultOutput{})
}
