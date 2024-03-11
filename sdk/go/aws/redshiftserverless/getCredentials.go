// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshiftserverless

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides redshift serverless temporary credentials for a workgroup.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/redshiftserverless"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := redshiftserverless.GetCredentials(ctx, &redshiftserverless.GetCredentialsArgs{
//				WorkgroupName: exampleAwsRedshiftserverlessWorkgroup.WorkgroupName,
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
func GetCredentials(ctx *pulumi.Context, args *GetCredentialsArgs, opts ...pulumi.InvokeOption) (*GetCredentialsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCredentialsResult
	err := ctx.Invoke("aws:redshiftserverless/getCredentials:getCredentials", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCredentials.
type GetCredentialsArgs struct {
	// The name of the database to get temporary authorization to log on to.
	DbName *string `pulumi:"dbName"`
	// The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum is 3600 seconds.
	DurationSeconds *int `pulumi:"durationSeconds"`
	// The name of the workgroup associated with the database.
	WorkgroupName string `pulumi:"workgroupName"`
}

// A collection of values returned by getCredentials.
type GetCredentialsResult struct {
	DbName *string `pulumi:"dbName"`
	// Temporary password that authorizes the user name returned by `dbUser` to log on to the database `dbName`.
	DbPassword string `pulumi:"dbPassword"`
	// A database user name that is authorized to log on to the database `dbName` using the password `dbPassword` . If the specified `dbUser` exists in the database, the new user name has the same database privileges as the user named in `dbUser` . By default, the user is added to PUBLIC. the user doesn't exist in the database.
	DbUser          string `pulumi:"dbUser"`
	DurationSeconds *int   `pulumi:"durationSeconds"`
	// Date and time the password in `dbPassword` expires.
	Expiration string `pulumi:"expiration"`
	// The provider-assigned unique ID for this managed resource.
	Id            string `pulumi:"id"`
	WorkgroupName string `pulumi:"workgroupName"`
}

func GetCredentialsOutput(ctx *pulumi.Context, args GetCredentialsOutputArgs, opts ...pulumi.InvokeOption) GetCredentialsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCredentialsResult, error) {
			args := v.(GetCredentialsArgs)
			r, err := GetCredentials(ctx, &args, opts...)
			var s GetCredentialsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCredentialsResultOutput)
}

// A collection of arguments for invoking getCredentials.
type GetCredentialsOutputArgs struct {
	// The name of the database to get temporary authorization to log on to.
	DbName pulumi.StringPtrInput `pulumi:"dbName"`
	// The number of seconds until the returned temporary password expires. The minimum is 900 seconds, and the maximum is 3600 seconds.
	DurationSeconds pulumi.IntPtrInput `pulumi:"durationSeconds"`
	// The name of the workgroup associated with the database.
	WorkgroupName pulumi.StringInput `pulumi:"workgroupName"`
}

func (GetCredentialsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCredentialsArgs)(nil)).Elem()
}

// A collection of values returned by getCredentials.
type GetCredentialsResultOutput struct{ *pulumi.OutputState }

func (GetCredentialsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCredentialsResult)(nil)).Elem()
}

func (o GetCredentialsResultOutput) ToGetCredentialsResultOutput() GetCredentialsResultOutput {
	return o
}

func (o GetCredentialsResultOutput) ToGetCredentialsResultOutputWithContext(ctx context.Context) GetCredentialsResultOutput {
	return o
}

func (o GetCredentialsResultOutput) DbName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCredentialsResult) *string { return v.DbName }).(pulumi.StringPtrOutput)
}

// Temporary password that authorizes the user name returned by `dbUser` to log on to the database `dbName`.
func (o GetCredentialsResultOutput) DbPassword() pulumi.StringOutput {
	return o.ApplyT(func(v GetCredentialsResult) string { return v.DbPassword }).(pulumi.StringOutput)
}

// A database user name that is authorized to log on to the database `dbName` using the password `dbPassword` . If the specified `dbUser` exists in the database, the new user name has the same database privileges as the user named in `dbUser` . By default, the user is added to PUBLIC. the user doesn't exist in the database.
func (o GetCredentialsResultOutput) DbUser() pulumi.StringOutput {
	return o.ApplyT(func(v GetCredentialsResult) string { return v.DbUser }).(pulumi.StringOutput)
}

func (o GetCredentialsResultOutput) DurationSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetCredentialsResult) *int { return v.DurationSeconds }).(pulumi.IntPtrOutput)
}

// Date and time the password in `dbPassword` expires.
func (o GetCredentialsResultOutput) Expiration() pulumi.StringOutput {
	return o.ApplyT(func(v GetCredentialsResult) string { return v.Expiration }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCredentialsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCredentialsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCredentialsResultOutput) WorkgroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetCredentialsResult) string { return v.WorkgroupName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCredentialsResultOutput{})
}
