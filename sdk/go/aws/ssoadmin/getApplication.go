// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssoadmin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS SSO Admin Application.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssoadmin"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ssoadmin.LookupApplication(ctx, &ssoadmin.LookupApplicationArgs{
//				ApplicationArn: "arn:aws:sso::012345678901:application/ssoins-1234/apl-5678",
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
func LookupApplication(ctx *pulumi.Context, args *LookupApplicationArgs, opts ...pulumi.InvokeOption) (*LookupApplicationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplicationResult
	err := ctx.Invoke("aws:ssoadmin/getApplication:getApplication", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplication.
type LookupApplicationArgs struct {
	// ARN of the application.
	ApplicationArn string `pulumi:"applicationArn"`
	// Options for the portal associated with an application. See the `ssoadmin.Application` resource documentation. The attributes are the same.
	PortalOptions []GetApplicationPortalOption `pulumi:"portalOptions"`
}

// A collection of values returned by getApplication.
type LookupApplicationResult struct {
	// AWS account ID.
	ApplicationAccount string `pulumi:"applicationAccount"`
	ApplicationArn     string `pulumi:"applicationArn"`
	// ARN of the application provider.
	ApplicationProviderArn string `pulumi:"applicationProviderArn"`
	// Description of the application.
	Description string `pulumi:"description"`
	// ARN of the application.
	Id string `pulumi:"id"`
	// ARN of the instance of IAM Identity Center.
	InstanceArn string `pulumi:"instanceArn"`
	// Name of the application.
	Name string `pulumi:"name"`
	// Options for the portal associated with an application. See the `ssoadmin.Application` resource documentation. The attributes are the same.
	PortalOptions []GetApplicationPortalOption `pulumi:"portalOptions"`
	// Status of the application.
	Status string `pulumi:"status"`
}

func LookupApplicationOutput(ctx *pulumi.Context, args LookupApplicationOutputArgs, opts ...pulumi.InvokeOption) LookupApplicationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplicationResult, error) {
			args := v.(LookupApplicationArgs)
			r, err := LookupApplication(ctx, &args, opts...)
			var s LookupApplicationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplicationResultOutput)
}

// A collection of arguments for invoking getApplication.
type LookupApplicationOutputArgs struct {
	// ARN of the application.
	ApplicationArn pulumi.StringInput `pulumi:"applicationArn"`
	// Options for the portal associated with an application. See the `ssoadmin.Application` resource documentation. The attributes are the same.
	PortalOptions GetApplicationPortalOptionArrayInput `pulumi:"portalOptions"`
}

func (LookupApplicationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationArgs)(nil)).Elem()
}

// A collection of values returned by getApplication.
type LookupApplicationResultOutput struct{ *pulumi.OutputState }

func (LookupApplicationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationResult)(nil)).Elem()
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutput() LookupApplicationResultOutput {
	return o
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutputWithContext(ctx context.Context) LookupApplicationResultOutput {
	return o
}

// AWS account ID.
func (o LookupApplicationResultOutput) ApplicationAccount() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.ApplicationAccount }).(pulumi.StringOutput)
}

func (o LookupApplicationResultOutput) ApplicationArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.ApplicationArn }).(pulumi.StringOutput)
}

// ARN of the application provider.
func (o LookupApplicationResultOutput) ApplicationProviderArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.ApplicationProviderArn }).(pulumi.StringOutput)
}

// Description of the application.
func (o LookupApplicationResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Description }).(pulumi.StringOutput)
}

// ARN of the application.
func (o LookupApplicationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Id }).(pulumi.StringOutput)
}

// ARN of the instance of IAM Identity Center.
func (o LookupApplicationResultOutput) InstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.InstanceArn }).(pulumi.StringOutput)
}

// Name of the application.
func (o LookupApplicationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Name }).(pulumi.StringOutput)
}

// Options for the portal associated with an application. See the `ssoadmin.Application` resource documentation. The attributes are the same.
func (o LookupApplicationResultOutput) PortalOptions() GetApplicationPortalOptionArrayOutput {
	return o.ApplyT(func(v LookupApplicationResult) []GetApplicationPortalOption { return v.PortalOptions }).(GetApplicationPortalOptionArrayOutput)
}

// Status of the application.
func (o LookupApplicationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplicationResultOutput{})
}
