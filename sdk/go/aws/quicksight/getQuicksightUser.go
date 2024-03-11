// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package quicksight

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source can be used to fetch information about a specific
// QuickSight user. By using this data source, you can reference QuickSight user
// properties without having to hard code ARNs or unique IDs as input.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/quicksight"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := quicksight.GetQuicksightUser(ctx, &quicksight.GetQuicksightUserArgs{
//				UserName: "example",
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
func GetQuicksightUser(ctx *pulumi.Context, args *GetQuicksightUserArgs, opts ...pulumi.InvokeOption) (*GetQuicksightUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetQuicksightUserResult
	err := ctx.Invoke("aws:quicksight/getQuicksightUser:getQuicksightUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getQuicksightUser.
type GetQuicksightUserArgs struct {
	// AWS account ID.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// QuickSight namespace. Defaults to `default`.
	Namespace *string `pulumi:"namespace"`
	// The name of the user that you want to match.
	//
	// The following arguments are optional:
	UserName string `pulumi:"userName"`
}

// A collection of values returned by getQuicksightUser.
type GetQuicksightUserResult struct {
	// The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
	Active bool `pulumi:"active"`
	// The Amazon Resource Name (ARN) for the user.
	Arn          string `pulumi:"arn"`
	AwsAccountId string `pulumi:"awsAccountId"`
	// The user's email address.
	Email string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The type of identity authentication used by the user.
	IdentityType string  `pulumi:"identityType"`
	Namespace    *string `pulumi:"namespace"`
	// The principal ID of the user.
	PrincipalId string `pulumi:"principalId"`
	UserName    string `pulumi:"userName"`
	// The Amazon QuickSight role for the user. The user role can be one of the following:.
	UserRole string `pulumi:"userRole"`
}

func GetQuicksightUserOutput(ctx *pulumi.Context, args GetQuicksightUserOutputArgs, opts ...pulumi.InvokeOption) GetQuicksightUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetQuicksightUserResult, error) {
			args := v.(GetQuicksightUserArgs)
			r, err := GetQuicksightUser(ctx, &args, opts...)
			var s GetQuicksightUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetQuicksightUserResultOutput)
}

// A collection of arguments for invoking getQuicksightUser.
type GetQuicksightUserOutputArgs struct {
	// AWS account ID.
	AwsAccountId pulumi.StringPtrInput `pulumi:"awsAccountId"`
	// QuickSight namespace. Defaults to `default`.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// The name of the user that you want to match.
	//
	// The following arguments are optional:
	UserName pulumi.StringInput `pulumi:"userName"`
}

func (GetQuicksightUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetQuicksightUserArgs)(nil)).Elem()
}

// A collection of values returned by getQuicksightUser.
type GetQuicksightUserResultOutput struct{ *pulumi.OutputState }

func (GetQuicksightUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetQuicksightUserResult)(nil)).Elem()
}

func (o GetQuicksightUserResultOutput) ToGetQuicksightUserResultOutput() GetQuicksightUserResultOutput {
	return o
}

func (o GetQuicksightUserResultOutput) ToGetQuicksightUserResultOutputWithContext(ctx context.Context) GetQuicksightUserResultOutput {
	return o
}

// The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
func (o GetQuicksightUserResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// The Amazon Resource Name (ARN) for the user.
func (o GetQuicksightUserResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o GetQuicksightUserResultOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.AwsAccountId }).(pulumi.StringOutput)
}

// The user's email address.
func (o GetQuicksightUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetQuicksightUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The type of identity authentication used by the user.
func (o GetQuicksightUserResultOutput) IdentityType() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.IdentityType }).(pulumi.StringOutput)
}

func (o GetQuicksightUserResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The principal ID of the user.
func (o GetQuicksightUserResultOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.PrincipalId }).(pulumi.StringOutput)
}

func (o GetQuicksightUserResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.UserName }).(pulumi.StringOutput)
}

// The Amazon QuickSight role for the user. The user role can be one of the following:.
func (o GetQuicksightUserResultOutput) UserRole() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuicksightUserResult) string { return v.UserRole }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetQuicksightUserResultOutput{})
}
