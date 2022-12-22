// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticache

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about an ElastiCache User.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/elasticache"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := elasticache.LookupUser(ctx, &elasticache.LookupUserArgs{
//				UserId: "example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	var rv LookupUserResult
	err := ctx.Invoke("aws:elasticache/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// String for what access a user possesses within the associated ElastiCache replication groups or clusters.
	AccessString       *string  `pulumi:"accessString"`
	Engine             *string  `pulumi:"engine"`
	NoPasswordRequired *bool    `pulumi:"noPasswordRequired"`
	Passwords          []string `pulumi:"passwords"`
	// Identifier for the user.
	UserId string `pulumi:"userId"`
	// User name of the user.
	UserName *string `pulumi:"userName"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// String for what access a user possesses within the associated ElastiCache replication groups or clusters.
	AccessString *string `pulumi:"accessString"`
	Engine       *string `pulumi:"engine"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string   `pulumi:"id"`
	NoPasswordRequired *bool    `pulumi:"noPasswordRequired"`
	Passwords          []string `pulumi:"passwords"`
	// Identifier for the user.
	UserId string `pulumi:"userId"`
	// User name of the user.
	UserName *string `pulumi:"userName"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// String for what access a user possesses within the associated ElastiCache replication groups or clusters.
	AccessString       pulumi.StringPtrInput   `pulumi:"accessString"`
	Engine             pulumi.StringPtrInput   `pulumi:"engine"`
	NoPasswordRequired pulumi.BoolPtrInput     `pulumi:"noPasswordRequired"`
	Passwords          pulumi.StringArrayInput `pulumi:"passwords"`
	// Identifier for the user.
	UserId pulumi.StringInput `pulumi:"userId"`
	// User name of the user.
	UserName pulumi.StringPtrInput `pulumi:"userName"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// String for what access a user possesses within the associated ElastiCache replication groups or clusters.
func (o LookupUserResultOutput) AccessString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.AccessString }).(pulumi.StringPtrOutput)
}

func (o LookupUserResultOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.Engine }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) NoPasswordRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *bool { return v.NoPasswordRequired }).(pulumi.BoolPtrOutput)
}

func (o LookupUserResultOutput) Passwords() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []string { return v.Passwords }).(pulumi.StringArrayOutput)
}

// Identifier for the user.
func (o LookupUserResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.UserId }).(pulumi.StringOutput)
}

// User name of the user.
func (o LookupUserResultOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUserResult) *string { return v.UserName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
