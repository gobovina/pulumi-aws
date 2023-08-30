// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appsync

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppSync API Cache.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appsync"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleGraphQLApi, err := appsync.NewGraphQLApi(ctx, "exampleGraphQLApi", &appsync.GraphQLApiArgs{
//				AuthenticationType: pulumi.String("API_KEY"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appsync.NewApiCache(ctx, "exampleApiCache", &appsync.ApiCacheArgs{
//				ApiId:              exampleGraphQLApi.ID(),
//				ApiCachingBehavior: pulumi.String("FULL_REQUEST_CACHING"),
//				Type:               pulumi.String("LARGE"),
//				Ttl:                pulumi.Int(900),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import `aws_appsync_api_cache` using the AppSync API ID. For example:
//
// ```sh
//
//	$ pulumi import aws:appsync/apiCache:ApiCache example xxxxx
//
// ```
type ApiCache struct {
	pulumi.CustomResourceState

	// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
	ApiCachingBehavior pulumi.StringOutput `pulumi:"apiCachingBehavior"`
	// GraphQL API ID.
	ApiId pulumi.StringOutput `pulumi:"apiId"`
	// At-rest encryption flag for cache. You cannot update this setting after creation.
	AtRestEncryptionEnabled pulumi.BoolPtrOutput `pulumi:"atRestEncryptionEnabled"`
	// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
	TransitEncryptionEnabled pulumi.BoolPtrOutput `pulumi:"transitEncryptionEnabled"`
	// TTL in seconds for cache entries.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewApiCache registers a new resource with the given unique name, arguments, and options.
func NewApiCache(ctx *pulumi.Context,
	name string, args *ApiCacheArgs, opts ...pulumi.ResourceOption) (*ApiCache, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiCachingBehavior == nil {
		return nil, errors.New("invalid value for required argument 'ApiCachingBehavior'")
	}
	if args.ApiId == nil {
		return nil, errors.New("invalid value for required argument 'ApiId'")
	}
	if args.Ttl == nil {
		return nil, errors.New("invalid value for required argument 'Ttl'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiCache
	err := ctx.RegisterResource("aws:appsync/apiCache:ApiCache", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiCache gets an existing ApiCache resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiCache(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiCacheState, opts ...pulumi.ResourceOption) (*ApiCache, error) {
	var resource ApiCache
	err := ctx.ReadResource("aws:appsync/apiCache:ApiCache", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiCache resources.
type apiCacheState struct {
	// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
	ApiCachingBehavior *string `pulumi:"apiCachingBehavior"`
	// GraphQL API ID.
	ApiId *string `pulumi:"apiId"`
	// At-rest encryption flag for cache. You cannot update this setting after creation.
	AtRestEncryptionEnabled *bool `pulumi:"atRestEncryptionEnabled"`
	// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
	TransitEncryptionEnabled *bool `pulumi:"transitEncryptionEnabled"`
	// TTL in seconds for cache entries.
	Ttl *int `pulumi:"ttl"`
	// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
	Type *string `pulumi:"type"`
}

type ApiCacheState struct {
	// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
	ApiCachingBehavior pulumi.StringPtrInput
	// GraphQL API ID.
	ApiId pulumi.StringPtrInput
	// At-rest encryption flag for cache. You cannot update this setting after creation.
	AtRestEncryptionEnabled pulumi.BoolPtrInput
	// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
	TransitEncryptionEnabled pulumi.BoolPtrInput
	// TTL in seconds for cache entries.
	Ttl pulumi.IntPtrInput
	// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
	Type pulumi.StringPtrInput
}

func (ApiCacheState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiCacheState)(nil)).Elem()
}

type apiCacheArgs struct {
	// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
	ApiCachingBehavior string `pulumi:"apiCachingBehavior"`
	// GraphQL API ID.
	ApiId string `pulumi:"apiId"`
	// At-rest encryption flag for cache. You cannot update this setting after creation.
	AtRestEncryptionEnabled *bool `pulumi:"atRestEncryptionEnabled"`
	// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
	TransitEncryptionEnabled *bool `pulumi:"transitEncryptionEnabled"`
	// TTL in seconds for cache entries.
	Ttl int `pulumi:"ttl"`
	// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ApiCache resource.
type ApiCacheArgs struct {
	// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
	ApiCachingBehavior pulumi.StringInput
	// GraphQL API ID.
	ApiId pulumi.StringInput
	// At-rest encryption flag for cache. You cannot update this setting after creation.
	AtRestEncryptionEnabled pulumi.BoolPtrInput
	// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
	TransitEncryptionEnabled pulumi.BoolPtrInput
	// TTL in seconds for cache entries.
	Ttl pulumi.IntInput
	// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
	Type pulumi.StringInput
}

func (ApiCacheArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiCacheArgs)(nil)).Elem()
}

type ApiCacheInput interface {
	pulumi.Input

	ToApiCacheOutput() ApiCacheOutput
	ToApiCacheOutputWithContext(ctx context.Context) ApiCacheOutput
}

func (*ApiCache) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiCache)(nil)).Elem()
}

func (i *ApiCache) ToApiCacheOutput() ApiCacheOutput {
	return i.ToApiCacheOutputWithContext(context.Background())
}

func (i *ApiCache) ToApiCacheOutputWithContext(ctx context.Context) ApiCacheOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiCacheOutput)
}

// ApiCacheArrayInput is an input type that accepts ApiCacheArray and ApiCacheArrayOutput values.
// You can construct a concrete instance of `ApiCacheArrayInput` via:
//
//	ApiCacheArray{ ApiCacheArgs{...} }
type ApiCacheArrayInput interface {
	pulumi.Input

	ToApiCacheArrayOutput() ApiCacheArrayOutput
	ToApiCacheArrayOutputWithContext(context.Context) ApiCacheArrayOutput
}

type ApiCacheArray []ApiCacheInput

func (ApiCacheArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiCache)(nil)).Elem()
}

func (i ApiCacheArray) ToApiCacheArrayOutput() ApiCacheArrayOutput {
	return i.ToApiCacheArrayOutputWithContext(context.Background())
}

func (i ApiCacheArray) ToApiCacheArrayOutputWithContext(ctx context.Context) ApiCacheArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiCacheArrayOutput)
}

// ApiCacheMapInput is an input type that accepts ApiCacheMap and ApiCacheMapOutput values.
// You can construct a concrete instance of `ApiCacheMapInput` via:
//
//	ApiCacheMap{ "key": ApiCacheArgs{...} }
type ApiCacheMapInput interface {
	pulumi.Input

	ToApiCacheMapOutput() ApiCacheMapOutput
	ToApiCacheMapOutputWithContext(context.Context) ApiCacheMapOutput
}

type ApiCacheMap map[string]ApiCacheInput

func (ApiCacheMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiCache)(nil)).Elem()
}

func (i ApiCacheMap) ToApiCacheMapOutput() ApiCacheMapOutput {
	return i.ToApiCacheMapOutputWithContext(context.Background())
}

func (i ApiCacheMap) ToApiCacheMapOutputWithContext(ctx context.Context) ApiCacheMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiCacheMapOutput)
}

type ApiCacheOutput struct{ *pulumi.OutputState }

func (ApiCacheOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiCache)(nil)).Elem()
}

func (o ApiCacheOutput) ToApiCacheOutput() ApiCacheOutput {
	return o
}

func (o ApiCacheOutput) ToApiCacheOutputWithContext(ctx context.Context) ApiCacheOutput {
	return o
}

// Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
func (o ApiCacheOutput) ApiCachingBehavior() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.StringOutput { return v.ApiCachingBehavior }).(pulumi.StringOutput)
}

// GraphQL API ID.
func (o ApiCacheOutput) ApiId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.StringOutput { return v.ApiId }).(pulumi.StringOutput)
}

// At-rest encryption flag for cache. You cannot update this setting after creation.
func (o ApiCacheOutput) AtRestEncryptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.BoolPtrOutput { return v.AtRestEncryptionEnabled }).(pulumi.BoolPtrOutput)
}

// Transit encryption flag when connecting to cache. You cannot update this setting after creation.
func (o ApiCacheOutput) TransitEncryptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.BoolPtrOutput { return v.TransitEncryptionEnabled }).(pulumi.BoolPtrOutput)
}

// TTL in seconds for cache entries.
func (o ApiCacheOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

// Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
func (o ApiCacheOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiCache) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ApiCacheArrayOutput struct{ *pulumi.OutputState }

func (ApiCacheArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiCache)(nil)).Elem()
}

func (o ApiCacheArrayOutput) ToApiCacheArrayOutput() ApiCacheArrayOutput {
	return o
}

func (o ApiCacheArrayOutput) ToApiCacheArrayOutputWithContext(ctx context.Context) ApiCacheArrayOutput {
	return o
}

func (o ApiCacheArrayOutput) Index(i pulumi.IntInput) ApiCacheOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiCache {
		return vs[0].([]*ApiCache)[vs[1].(int)]
	}).(ApiCacheOutput)
}

type ApiCacheMapOutput struct{ *pulumi.OutputState }

func (ApiCacheMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiCache)(nil)).Elem()
}

func (o ApiCacheMapOutput) ToApiCacheMapOutput() ApiCacheMapOutput {
	return o
}

func (o ApiCacheMapOutput) ToApiCacheMapOutputWithContext(ctx context.Context) ApiCacheMapOutput {
	return o
}

func (o ApiCacheMapOutput) MapIndex(k pulumi.StringInput) ApiCacheOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiCache {
		return vs[0].(map[string]*ApiCache)[vs[1].(string)]
	}).(ApiCacheOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiCacheInput)(nil)).Elem(), &ApiCache{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiCacheArrayInput)(nil)).Elem(), ApiCacheArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiCacheMapInput)(nil)).Elem(), ApiCacheMap{})
	pulumi.RegisterOutputType(ApiCacheOutput{})
	pulumi.RegisterOutputType(ApiCacheArrayOutput{})
	pulumi.RegisterOutputType(ApiCacheMapOutput{})
}
