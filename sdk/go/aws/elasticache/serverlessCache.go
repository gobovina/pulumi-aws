// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticache

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an ElastiCache Serverless Cache resource which manages memcached or redis.
//
// ## Example Usage
//
// ### Memcached Serverless
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/elasticache"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// var splat0 []interface{}
// for _, val0 := range testAwsSubnet {
// splat0 = append(splat0, val0.Id)
// }
// _, err := elasticache.NewServerlessCache(ctx, "example", &elasticache.ServerlessCacheArgs{
// Engine: pulumi.String("memcached"),
// Name: pulumi.String("example"),
// CacheUsageLimits: &elasticache.ServerlessCacheCacheUsageLimitsArgs{
// DataStorage: &elasticache.ServerlessCacheCacheUsageLimitsDataStorageArgs{
// Maximum: pulumi.Int(10),
// Unit: pulumi.String("GB"),
// },
// EcpuPerSeconds: elasticache.ServerlessCacheCacheUsageLimitsEcpuPerSecondArray{
// &elasticache.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs{
// Maximum: pulumi.Int(5),
// },
// },
// },
// Description: pulumi.String("Test Server"),
// KmsKeyId: pulumi.Any(test.Arn),
// MajorEngineVersion: pulumi.String("1.6"),
// SecurityGroupIds: pulumi.StringArray{
// testAwsSecurityGroup.Id,
// },
// SubnetIds: toPulumiArray(splat0),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// func toPulumiArray(arr []) pulumi.Array {
// var pulumiArr pulumi.Array
// for _, v := range arr {
// pulumiArr = append(pulumiArr, pulumi.(v))
// }
// return pulumiArr
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ### Redis Serverless
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/elasticache"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// var splat0 []interface{}
// for _, val0 := range testAwsSubnet {
// splat0 = append(splat0, val0.Id)
// }
// _, err := elasticache.NewServerlessCache(ctx, "example", &elasticache.ServerlessCacheArgs{
// Engine: pulumi.String("redis"),
// Name: pulumi.String("example"),
// CacheUsageLimits: &elasticache.ServerlessCacheCacheUsageLimitsArgs{
// DataStorage: &elasticache.ServerlessCacheCacheUsageLimitsDataStorageArgs{
// Maximum: pulumi.Int(10),
// Unit: pulumi.String("GB"),
// },
// EcpuPerSeconds: elasticache.ServerlessCacheCacheUsageLimitsEcpuPerSecondArray{
// &elasticache.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs{
// Maximum: pulumi.Int(5),
// },
// },
// },
// DailySnapshotTime: pulumi.String("09:00"),
// Description: pulumi.String("Test Server"),
// KmsKeyId: pulumi.Any(test.Arn),
// MajorEngineVersion: pulumi.String("7"),
// SnapshotRetentionLimit: pulumi.Int(1),
// SecurityGroupIds: pulumi.StringArray{
// testAwsSecurityGroup.Id,
// },
// SubnetIds: toPulumiArray(splat0),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// func toPulumiArray(arr []) pulumi.Array {
// var pulumiArr pulumi.Array
// for _, v := range arr {
// pulumiArr = append(pulumiArr, pulumi.(v))
// }
// return pulumiArr
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import ElastiCache Serverless Cache using the `name`. For example:
//
// ```sh
// $ pulumi import aws:elasticache/serverlessCache:ServerlessCache my_cluster my_cluster
// ```
type ServerlessCache struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the serverless cache.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
	CacheUsageLimits ServerlessCacheCacheUsageLimitsPtrOutput `pulumi:"cacheUsageLimits"`
	// Timestamp of when the serverless cache was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
	DailySnapshotTime pulumi.StringOutput `pulumi:"dailySnapshotTime"`
	// User-provided description for the serverless cache. The default is NULL.
	Description pulumi.StringOutput `pulumi:"description"`
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	Endpoints ServerlessCacheEndpointArrayOutput `pulumi:"endpoints"`
	// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
	Engine pulumi.StringOutput `pulumi:"engine"`
	// The name and version number of the engine the serverless cache is compatible with.
	FullEngineVersion pulumi.StringOutput `pulumi:"fullEngineVersion"`
	// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// The version of the cache engine that will be used to create the serverless cache.
	// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
	MajorEngineVersion pulumi.StringOutput `pulumi:"majorEngineVersion"`
	// The Cluster name which serves as a unique identifier to the serverless cache
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	ReaderEndpoints ServerlessCacheReaderEndpointArrayOutput `pulumi:"readerEndpoints"`
	// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
	SnapshotArnsToRestores pulumi.StringArrayOutput `pulumi:"snapshotArnsToRestores"`
	// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
	SnapshotRetentionLimit pulumi.IntOutput `pulumi:"snapshotRetentionLimit"`
	// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput           `pulumi:"tagsAll"`
	Timeouts ServerlessCacheTimeoutsPtrOutput `pulumi:"timeouts"`
	// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
	UserGroupId pulumi.StringPtrOutput `pulumi:"userGroupId"`
}

// NewServerlessCache registers a new resource with the given unique name, arguments, and options.
func NewServerlessCache(ctx *pulumi.Context,
	name string, args *ServerlessCacheArgs, opts ...pulumi.ResourceOption) (*ServerlessCache, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Engine == nil {
		return nil, errors.New("invalid value for required argument 'Engine'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerlessCache
	err := ctx.RegisterResource("aws:elasticache/serverlessCache:ServerlessCache", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerlessCache gets an existing ServerlessCache resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerlessCache(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerlessCacheState, opts ...pulumi.ResourceOption) (*ServerlessCache, error) {
	var resource ServerlessCache
	err := ctx.ReadResource("aws:elasticache/serverlessCache:ServerlessCache", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerlessCache resources.
type serverlessCacheState struct {
	// The Amazon Resource Name (ARN) of the serverless cache.
	Arn *string `pulumi:"arn"`
	// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
	CacheUsageLimits *ServerlessCacheCacheUsageLimits `pulumi:"cacheUsageLimits"`
	// Timestamp of when the serverless cache was created.
	CreateTime *string `pulumi:"createTime"`
	// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
	DailySnapshotTime *string `pulumi:"dailySnapshotTime"`
	// User-provided description for the serverless cache. The default is NULL.
	Description *string `pulumi:"description"`
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	Endpoints []ServerlessCacheEndpoint `pulumi:"endpoints"`
	// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
	Engine *string `pulumi:"engine"`
	// The name and version number of the engine the serverless cache is compatible with.
	FullEngineVersion *string `pulumi:"fullEngineVersion"`
	// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// The version of the cache engine that will be used to create the serverless cache.
	// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
	MajorEngineVersion *string `pulumi:"majorEngineVersion"`
	// The Cluster name which serves as a unique identifier to the serverless cache
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	ReaderEndpoints []ServerlessCacheReaderEndpoint `pulumi:"readerEndpoints"`
	// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
	SnapshotArnsToRestores []string `pulumi:"snapshotArnsToRestores"`
	// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
	Status *string `pulumi:"status"`
	// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
	SubnetIds []string `pulumi:"subnetIds"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string        `pulumi:"tagsAll"`
	Timeouts *ServerlessCacheTimeouts `pulumi:"timeouts"`
	// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
	UserGroupId *string `pulumi:"userGroupId"`
}

type ServerlessCacheState struct {
	// The Amazon Resource Name (ARN) of the serverless cache.
	Arn pulumi.StringPtrInput
	// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
	CacheUsageLimits ServerlessCacheCacheUsageLimitsPtrInput
	// Timestamp of when the serverless cache was created.
	CreateTime pulumi.StringPtrInput
	// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
	DailySnapshotTime pulumi.StringPtrInput
	// User-provided description for the serverless cache. The default is NULL.
	Description pulumi.StringPtrInput
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	Endpoints ServerlessCacheEndpointArrayInput
	// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
	Engine pulumi.StringPtrInput
	// The name and version number of the engine the serverless cache is compatible with.
	FullEngineVersion pulumi.StringPtrInput
	// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
	KmsKeyId pulumi.StringPtrInput
	// The version of the cache engine that will be used to create the serverless cache.
	// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
	MajorEngineVersion pulumi.StringPtrInput
	// The Cluster name which serves as a unique identifier to the serverless cache
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Represents the information required for client programs to connect to a cache node. See config below for details.
	ReaderEndpoints ServerlessCacheReaderEndpointArrayInput
	// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
	SecurityGroupIds pulumi.StringArrayInput
	// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
	SnapshotArnsToRestores pulumi.StringArrayInput
	// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
	Status pulumi.StringPtrInput
	// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
	SubnetIds pulumi.StringArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts ServerlessCacheTimeoutsPtrInput
	// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
	UserGroupId pulumi.StringPtrInput
}

func (ServerlessCacheState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessCacheState)(nil)).Elem()
}

type serverlessCacheArgs struct {
	// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
	CacheUsageLimits *ServerlessCacheCacheUsageLimits `pulumi:"cacheUsageLimits"`
	// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
	DailySnapshotTime *string `pulumi:"dailySnapshotTime"`
	// User-provided description for the serverless cache. The default is NULL.
	Description *string `pulumi:"description"`
	// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
	Engine string `pulumi:"engine"`
	// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// The version of the cache engine that will be used to create the serverless cache.
	// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
	MajorEngineVersion *string `pulumi:"majorEngineVersion"`
	// The Cluster name which serves as a unique identifier to the serverless cache
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
	SnapshotArnsToRestores []string `pulumi:"snapshotArnsToRestores"`
	// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
	SubnetIds []string `pulumi:"subnetIds"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string        `pulumi:"tags"`
	Timeouts *ServerlessCacheTimeouts `pulumi:"timeouts"`
	// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
	UserGroupId *string `pulumi:"userGroupId"`
}

// The set of arguments for constructing a ServerlessCache resource.
type ServerlessCacheArgs struct {
	// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
	CacheUsageLimits ServerlessCacheCacheUsageLimitsPtrInput
	// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
	DailySnapshotTime pulumi.StringPtrInput
	// User-provided description for the serverless cache. The default is NULL.
	Description pulumi.StringPtrInput
	// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
	Engine pulumi.StringInput
	// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
	KmsKeyId pulumi.StringPtrInput
	// The version of the cache engine that will be used to create the serverless cache.
	// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
	MajorEngineVersion pulumi.StringPtrInput
	// The Cluster name which serves as a unique identifier to the serverless cache
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
	SecurityGroupIds pulumi.StringArrayInput
	// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
	SnapshotArnsToRestores pulumi.StringArrayInput
	// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
	SubnetIds pulumi.StringArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts ServerlessCacheTimeoutsPtrInput
	// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
	UserGroupId pulumi.StringPtrInput
}

func (ServerlessCacheArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessCacheArgs)(nil)).Elem()
}

type ServerlessCacheInput interface {
	pulumi.Input

	ToServerlessCacheOutput() ServerlessCacheOutput
	ToServerlessCacheOutputWithContext(ctx context.Context) ServerlessCacheOutput
}

func (*ServerlessCache) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessCache)(nil)).Elem()
}

func (i *ServerlessCache) ToServerlessCacheOutput() ServerlessCacheOutput {
	return i.ToServerlessCacheOutputWithContext(context.Background())
}

func (i *ServerlessCache) ToServerlessCacheOutputWithContext(ctx context.Context) ServerlessCacheOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCacheOutput)
}

// ServerlessCacheArrayInput is an input type that accepts ServerlessCacheArray and ServerlessCacheArrayOutput values.
// You can construct a concrete instance of `ServerlessCacheArrayInput` via:
//
//	ServerlessCacheArray{ ServerlessCacheArgs{...} }
type ServerlessCacheArrayInput interface {
	pulumi.Input

	ToServerlessCacheArrayOutput() ServerlessCacheArrayOutput
	ToServerlessCacheArrayOutputWithContext(context.Context) ServerlessCacheArrayOutput
}

type ServerlessCacheArray []ServerlessCacheInput

func (ServerlessCacheArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessCache)(nil)).Elem()
}

func (i ServerlessCacheArray) ToServerlessCacheArrayOutput() ServerlessCacheArrayOutput {
	return i.ToServerlessCacheArrayOutputWithContext(context.Background())
}

func (i ServerlessCacheArray) ToServerlessCacheArrayOutputWithContext(ctx context.Context) ServerlessCacheArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCacheArrayOutput)
}

// ServerlessCacheMapInput is an input type that accepts ServerlessCacheMap and ServerlessCacheMapOutput values.
// You can construct a concrete instance of `ServerlessCacheMapInput` via:
//
//	ServerlessCacheMap{ "key": ServerlessCacheArgs{...} }
type ServerlessCacheMapInput interface {
	pulumi.Input

	ToServerlessCacheMapOutput() ServerlessCacheMapOutput
	ToServerlessCacheMapOutputWithContext(context.Context) ServerlessCacheMapOutput
}

type ServerlessCacheMap map[string]ServerlessCacheInput

func (ServerlessCacheMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessCache)(nil)).Elem()
}

func (i ServerlessCacheMap) ToServerlessCacheMapOutput() ServerlessCacheMapOutput {
	return i.ToServerlessCacheMapOutputWithContext(context.Background())
}

func (i ServerlessCacheMap) ToServerlessCacheMapOutputWithContext(ctx context.Context) ServerlessCacheMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCacheMapOutput)
}

type ServerlessCacheOutput struct{ *pulumi.OutputState }

func (ServerlessCacheOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessCache)(nil)).Elem()
}

func (o ServerlessCacheOutput) ToServerlessCacheOutput() ServerlessCacheOutput {
	return o
}

func (o ServerlessCacheOutput) ToServerlessCacheOutputWithContext(ctx context.Context) ServerlessCacheOutput {
	return o
}

// The Amazon Resource Name (ARN) of the serverless cache.
func (o ServerlessCacheOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
func (o ServerlessCacheOutput) CacheUsageLimits() ServerlessCacheCacheUsageLimitsPtrOutput {
	return o.ApplyT(func(v *ServerlessCache) ServerlessCacheCacheUsageLimitsPtrOutput { return v.CacheUsageLimits }).(ServerlessCacheCacheUsageLimitsPtrOutput)
}

// Timestamp of when the serverless cache was created.
func (o ServerlessCacheOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
func (o ServerlessCacheOutput) DailySnapshotTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.DailySnapshotTime }).(pulumi.StringOutput)
}

// User-provided description for the serverless cache. The default is NULL.
func (o ServerlessCacheOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Represents the information required for client programs to connect to a cache node. See config below for details.
func (o ServerlessCacheOutput) Endpoints() ServerlessCacheEndpointArrayOutput {
	return o.ApplyT(func(v *ServerlessCache) ServerlessCacheEndpointArrayOutput { return v.Endpoints }).(ServerlessCacheEndpointArrayOutput)
}

// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
func (o ServerlessCacheOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.Engine }).(pulumi.StringOutput)
}

// The name and version number of the engine the serverless cache is compatible with.
func (o ServerlessCacheOutput) FullEngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.FullEngineVersion }).(pulumi.StringOutput)
}

// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
func (o ServerlessCacheOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// The version of the cache engine that will be used to create the serverless cache.
// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
func (o ServerlessCacheOutput) MajorEngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.MajorEngineVersion }).(pulumi.StringOutput)
}

// The Cluster name which serves as a unique identifier to the serverless cache
//
// The following arguments are optional:
func (o ServerlessCacheOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Represents the information required for client programs to connect to a cache node. See config below for details.
func (o ServerlessCacheOutput) ReaderEndpoints() ServerlessCacheReaderEndpointArrayOutput {
	return o.ApplyT(func(v *ServerlessCache) ServerlessCacheReaderEndpointArrayOutput { return v.ReaderEndpoints }).(ServerlessCacheReaderEndpointArrayOutput)
}

// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
func (o ServerlessCacheOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
func (o ServerlessCacheOutput) SnapshotArnsToRestores() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringArrayOutput { return v.SnapshotArnsToRestores }).(pulumi.StringArrayOutput)
}

// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
func (o ServerlessCacheOutput) SnapshotRetentionLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.IntOutput { return v.SnapshotRetentionLimit }).(pulumi.IntOutput)
}

// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
func (o ServerlessCacheOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
func (o ServerlessCacheOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServerlessCacheOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ServerlessCacheOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o ServerlessCacheOutput) Timeouts() ServerlessCacheTimeoutsPtrOutput {
	return o.ApplyT(func(v *ServerlessCache) ServerlessCacheTimeoutsPtrOutput { return v.Timeouts }).(ServerlessCacheTimeoutsPtrOutput)
}

// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
func (o ServerlessCacheOutput) UserGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerlessCache) pulumi.StringPtrOutput { return v.UserGroupId }).(pulumi.StringPtrOutput)
}

type ServerlessCacheArrayOutput struct{ *pulumi.OutputState }

func (ServerlessCacheArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessCache)(nil)).Elem()
}

func (o ServerlessCacheArrayOutput) ToServerlessCacheArrayOutput() ServerlessCacheArrayOutput {
	return o
}

func (o ServerlessCacheArrayOutput) ToServerlessCacheArrayOutputWithContext(ctx context.Context) ServerlessCacheArrayOutput {
	return o
}

func (o ServerlessCacheArrayOutput) Index(i pulumi.IntInput) ServerlessCacheOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerlessCache {
		return vs[0].([]*ServerlessCache)[vs[1].(int)]
	}).(ServerlessCacheOutput)
}

type ServerlessCacheMapOutput struct{ *pulumi.OutputState }

func (ServerlessCacheMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessCache)(nil)).Elem()
}

func (o ServerlessCacheMapOutput) ToServerlessCacheMapOutput() ServerlessCacheMapOutput {
	return o
}

func (o ServerlessCacheMapOutput) ToServerlessCacheMapOutputWithContext(ctx context.Context) ServerlessCacheMapOutput {
	return o
}

func (o ServerlessCacheMapOutput) MapIndex(k pulumi.StringInput) ServerlessCacheOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerlessCache {
		return vs[0].(map[string]*ServerlessCache)[vs[1].(string)]
	}).(ServerlessCacheOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCacheInput)(nil)).Elem(), &ServerlessCache{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCacheArrayInput)(nil)).Elem(), ServerlessCacheArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCacheMapInput)(nil)).Elem(), ServerlessCacheMap{})
	pulumi.RegisterOutputType(ServerlessCacheOutput{})
	pulumi.RegisterOutputType(ServerlessCacheArrayOutput{})
	pulumi.RegisterOutputType(ServerlessCacheMapOutput{})
}
