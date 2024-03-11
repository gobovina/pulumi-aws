// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sesv2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sesv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := sesv2.LookupEmailIdentity(ctx, &sesv2.LookupEmailIdentityArgs{
//				EmailIdentity: "example.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = sesv2.LookupEmailIdentityMailFromAttributes(ctx, &sesv2.LookupEmailIdentityMailFromAttributesArgs{
//				EmailIdentity: example.EmailIdentity,
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
func LookupEmailIdentityMailFromAttributes(ctx *pulumi.Context, args *LookupEmailIdentityMailFromAttributesArgs, opts ...pulumi.InvokeOption) (*LookupEmailIdentityMailFromAttributesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEmailIdentityMailFromAttributesResult
	err := ctx.Invoke("aws:sesv2/getEmailIdentityMailFromAttributes:getEmailIdentityMailFromAttributes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEmailIdentityMailFromAttributes.
type LookupEmailIdentityMailFromAttributesArgs struct {
	// The name of the email identity.
	EmailIdentity string `pulumi:"emailIdentity"`
}

// A collection of values returned by getEmailIdentityMailFromAttributes.
type LookupEmailIdentityMailFromAttributesResult struct {
	// The action to take if the required MX record isn't found when you send an email. Valid values: `USE_DEFAULT_VALUE`, `REJECT_MESSAGE`.
	BehaviorOnMxFailure string `pulumi:"behaviorOnMxFailure"`
	EmailIdentity       string `pulumi:"emailIdentity"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The custom MAIL FROM domain that you want the verified identity to use.
	MailFromDomain string `pulumi:"mailFromDomain"`
}

func LookupEmailIdentityMailFromAttributesOutput(ctx *pulumi.Context, args LookupEmailIdentityMailFromAttributesOutputArgs, opts ...pulumi.InvokeOption) LookupEmailIdentityMailFromAttributesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEmailIdentityMailFromAttributesResult, error) {
			args := v.(LookupEmailIdentityMailFromAttributesArgs)
			r, err := LookupEmailIdentityMailFromAttributes(ctx, &args, opts...)
			var s LookupEmailIdentityMailFromAttributesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEmailIdentityMailFromAttributesResultOutput)
}

// A collection of arguments for invoking getEmailIdentityMailFromAttributes.
type LookupEmailIdentityMailFromAttributesOutputArgs struct {
	// The name of the email identity.
	EmailIdentity pulumi.StringInput `pulumi:"emailIdentity"`
}

func (LookupEmailIdentityMailFromAttributesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEmailIdentityMailFromAttributesArgs)(nil)).Elem()
}

// A collection of values returned by getEmailIdentityMailFromAttributes.
type LookupEmailIdentityMailFromAttributesResultOutput struct{ *pulumi.OutputState }

func (LookupEmailIdentityMailFromAttributesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEmailIdentityMailFromAttributesResult)(nil)).Elem()
}

func (o LookupEmailIdentityMailFromAttributesResultOutput) ToLookupEmailIdentityMailFromAttributesResultOutput() LookupEmailIdentityMailFromAttributesResultOutput {
	return o
}

func (o LookupEmailIdentityMailFromAttributesResultOutput) ToLookupEmailIdentityMailFromAttributesResultOutputWithContext(ctx context.Context) LookupEmailIdentityMailFromAttributesResultOutput {
	return o
}

// The action to take if the required MX record isn't found when you send an email. Valid values: `USE_DEFAULT_VALUE`, `REJECT_MESSAGE`.
func (o LookupEmailIdentityMailFromAttributesResultOutput) BehaviorOnMxFailure() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailIdentityMailFromAttributesResult) string { return v.BehaviorOnMxFailure }).(pulumi.StringOutput)
}

func (o LookupEmailIdentityMailFromAttributesResultOutput) EmailIdentity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailIdentityMailFromAttributesResult) string { return v.EmailIdentity }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEmailIdentityMailFromAttributesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailIdentityMailFromAttributesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The custom MAIL FROM domain that you want the verified identity to use.
func (o LookupEmailIdentityMailFromAttributesResultOutput) MailFromDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEmailIdentityMailFromAttributesResult) string { return v.MailFromDomain }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEmailIdentityMailFromAttributesResultOutput{})
}
