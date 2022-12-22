// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfront

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a CloudFront cache policy.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfront.LookupCachePolicy(ctx, &cloudfront.LookupCachePolicyArgs{
//				Name: pulumi.StringRef("example-policy"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### AWS-Managed Policies
//
// AWS managed cache policy names are prefixed with `Managed-`:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfront.LookupCachePolicy(ctx, &cloudfront.LookupCachePolicyArgs{
//				Name: pulumi.StringRef("Managed-CachingOptimized"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCachePolicy(ctx *pulumi.Context, args *LookupCachePolicyArgs, opts ...pulumi.InvokeOption) (*LookupCachePolicyResult, error) {
	var rv LookupCachePolicyResult
	err := ctx.Invoke("aws:cloudfront/getCachePolicy:getCachePolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCachePolicy.
type LookupCachePolicyArgs struct {
	// Identifier for the cache policy.
	Id *string `pulumi:"id"`
	// Unique name to identify the cache policy.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getCachePolicy.
type LookupCachePolicyResult struct {
	// Comment to describe the cache policy.
	Comment string `pulumi:"comment"`
	// Default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
	DefaultTtl int `pulumi:"defaultTtl"`
	// Current version of the cache policy.
	Etag string  `pulumi:"etag"`
	Id   *string `pulumi:"id"`
	// Maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
	MaxTtl int `pulumi:"maxTtl"`
	// Minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
	MinTtl int     `pulumi:"minTtl"`
	Name   *string `pulumi:"name"`
	// The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
	ParametersInCacheKeyAndForwardedToOrigins []GetCachePolicyParametersInCacheKeyAndForwardedToOrigin `pulumi:"parametersInCacheKeyAndForwardedToOrigins"`
}

func LookupCachePolicyOutput(ctx *pulumi.Context, args LookupCachePolicyOutputArgs, opts ...pulumi.InvokeOption) LookupCachePolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCachePolicyResult, error) {
			args := v.(LookupCachePolicyArgs)
			r, err := LookupCachePolicy(ctx, &args, opts...)
			var s LookupCachePolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCachePolicyResultOutput)
}

// A collection of arguments for invoking getCachePolicy.
type LookupCachePolicyOutputArgs struct {
	// Identifier for the cache policy.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Unique name to identify the cache policy.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupCachePolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCachePolicyArgs)(nil)).Elem()
}

// A collection of values returned by getCachePolicy.
type LookupCachePolicyResultOutput struct{ *pulumi.OutputState }

func (LookupCachePolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCachePolicyResult)(nil)).Elem()
}

func (o LookupCachePolicyResultOutput) ToLookupCachePolicyResultOutput() LookupCachePolicyResultOutput {
	return o
}

func (o LookupCachePolicyResultOutput) ToLookupCachePolicyResultOutputWithContext(ctx context.Context) LookupCachePolicyResultOutput {
	return o
}

// Comment to describe the cache policy.
func (o LookupCachePolicyResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) string { return v.Comment }).(pulumi.StringOutput)
}

// Default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
func (o LookupCachePolicyResultOutput) DefaultTtl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) int { return v.DefaultTtl }).(pulumi.IntOutput)
}

// Current version of the cache policy.
func (o LookupCachePolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

func (o LookupCachePolicyResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// Maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
func (o LookupCachePolicyResultOutput) MaxTtl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) int { return v.MaxTtl }).(pulumi.IntOutput)
}

// Minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
func (o LookupCachePolicyResultOutput) MinTtl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) int { return v.MinTtl }).(pulumi.IntOutput)
}

func (o LookupCachePolicyResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
func (o LookupCachePolicyResultOutput) ParametersInCacheKeyAndForwardedToOrigins() GetCachePolicyParametersInCacheKeyAndForwardedToOriginArrayOutput {
	return o.ApplyT(func(v LookupCachePolicyResult) []GetCachePolicyParametersInCacheKeyAndForwardedToOrigin {
		return v.ParametersInCacheKeyAndForwardedToOrigins
	}).(GetCachePolicyParametersInCacheKeyAndForwardedToOriginArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCachePolicyResultOutput{})
}
