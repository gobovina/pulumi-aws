// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets a registration code used to register a CA certificate with AWS IoT.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iot"
//	"github.com/pulumi/pulumi-tls/sdk/v4/go/tls"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := iot.GetRegistrationCode(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			verification, err := tls.NewPrivateKey(ctx, "verification", &tls.PrivateKeyArgs{
//				Algorithm: pulumi.String("RSA"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = tls.NewCertRequest(ctx, "verification", &tls.CertRequestArgs{
//				KeyAlgorithm:  pulumi.String("RSA"),
//				PrivateKeyPem: verification.PrivateKeyPem,
//				Subject: &tls.CertRequestSubjectArgs{
//					CommonName: *pulumi.String(example.RegistrationCode),
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
func GetRegistrationCode(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRegistrationCodeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegistrationCodeResult
	err := ctx.Invoke("aws:iot/getRegistrationCode:getRegistrationCode", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRegistrationCode.
type GetRegistrationCodeResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The CA certificate registration code.
	RegistrationCode string `pulumi:"registrationCode"`
}

func GetRegistrationCodeOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetRegistrationCodeResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetRegistrationCodeResult, error) {
		r, err := GetRegistrationCode(ctx, opts...)
		var s GetRegistrationCodeResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetRegistrationCodeResultOutput)
}

// A collection of values returned by getRegistrationCode.
type GetRegistrationCodeResultOutput struct{ *pulumi.OutputState }

func (GetRegistrationCodeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegistrationCodeResult)(nil)).Elem()
}

func (o GetRegistrationCodeResultOutput) ToGetRegistrationCodeResultOutput() GetRegistrationCodeResultOutput {
	return o
}

func (o GetRegistrationCodeResultOutput) ToGetRegistrationCodeResultOutputWithContext(ctx context.Context) GetRegistrationCodeResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRegistrationCodeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegistrationCodeResult) string { return v.Id }).(pulumi.StringOutput)
}

// The CA certificate registration code.
func (o GetRegistrationCodeResultOutput) RegistrationCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegistrationCodeResult) string { return v.RegistrationCode }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegistrationCodeResultOutput{})
}
