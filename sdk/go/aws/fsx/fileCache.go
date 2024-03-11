// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fsx

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an Amazon File Cache cache.
// See the [Create File Cache](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileCache.html) for more information.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/fsx"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := fsx.NewFileCache(ctx, "example", &fsx.FileCacheArgs{
//				DataRepositoryAssociations: fsx.FileCacheDataRepositoryAssociationArray{
//					&fsx.FileCacheDataRepositoryAssociationArgs{
//						DataRepositoryPath: pulumi.String("nfs://filer.domain.com"),
//						DataRepositorySubdirectories: pulumi.StringArray{
//							pulumi.String("test"),
//							pulumi.String("test2"),
//						},
//						FileCachePath: pulumi.String("/ns1"),
//						Nfs: fsx.FileCacheDataRepositoryAssociationNfArray{
//							&fsx.FileCacheDataRepositoryAssociationNfArgs{
//								DnsIps: pulumi.StringArray{
//									pulumi.String("192.168.0.1"),
//									pulumi.String("192.168.0.2"),
//								},
//								Version: pulumi.String("NFS3"),
//							},
//						},
//					},
//				},
//				FileCacheType:        pulumi.String("LUSTRE"),
//				FileCacheTypeVersion: pulumi.String("2.12"),
//				LustreConfigurations: fsx.FileCacheLustreConfigurationArray{
//					&fsx.FileCacheLustreConfigurationArgs{
//						DeploymentType: pulumi.String("CACHE_1"),
//						MetadataConfigurations: fsx.FileCacheLustreConfigurationMetadataConfigurationArray{
//							&fsx.FileCacheLustreConfigurationMetadataConfigurationArgs{
//								StorageCapacity: pulumi.Int(2400),
//							},
//						},
//						PerUnitStorageThroughput:   pulumi.Int(1000),
//						WeeklyMaintenanceStartTime: pulumi.String("2:05:00"),
//					},
//				},
//				SubnetIds: pulumi.StringArray{
//					test1.Id,
//				},
//				StorageCapacity: pulumi.Int(1200),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Amazon File Cache cache using the resource `id`. For example:
//
// ```sh
// $ pulumi import aws:fsx/fileCache:FileCache example fc-8012925589
// ```
type FileCache struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) for the resource.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
	CopyTagsToDataRepositoryAssociations pulumi.BoolPtrOutput `pulumi:"copyTagsToDataRepositoryAssociations"`
	// A list of IDs of data repository associations that are associated with this cache.
	DataRepositoryAssociationIds pulumi.StringArrayOutput `pulumi:"dataRepositoryAssociationIds"`
	// See the `dataRepositoryAssociation` configuration block. Max of 8.
	// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
	DataRepositoryAssociations FileCacheDataRepositoryAssociationArrayOutput `pulumi:"dataRepositoryAssociations"`
	// The Domain Name System (DNS) name for the cache.
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// The system-generated, unique ID of the cache.
	FileCacheId pulumi.StringOutput `pulumi:"fileCacheId"`
	// The type of cache that you're creating. The only supported value is `LUSTRE`.
	FileCacheType pulumi.StringOutput `pulumi:"fileCacheType"`
	// The version for the type of cache that you're creating. The only supported value is `2.12`.
	FileCacheTypeVersion pulumi.StringOutput `pulumi:"fileCacheTypeVersion"`
	// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
	LustreConfigurations FileCacheLustreConfigurationArrayOutput `pulumi:"lustreConfigurations"`
	// A list of network interface IDs.
	NetworkInterfaceIds pulumi.StringArrayOutput `pulumi:"networkInterfaceIds"`
	OwnerId             pulumi.StringOutput      `pulumi:"ownerId"`
	// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
	StorageCapacity pulumi.IntOutput `pulumi:"storageCapacity"`
	// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The ID of your virtual private cloud (VPC).
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewFileCache registers a new resource with the given unique name, arguments, and options.
func NewFileCache(ctx *pulumi.Context,
	name string, args *FileCacheArgs, opts ...pulumi.ResourceOption) (*FileCache, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileCacheType == nil {
		return nil, errors.New("invalid value for required argument 'FileCacheType'")
	}
	if args.FileCacheTypeVersion == nil {
		return nil, errors.New("invalid value for required argument 'FileCacheTypeVersion'")
	}
	if args.StorageCapacity == nil {
		return nil, errors.New("invalid value for required argument 'StorageCapacity'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FileCache
	err := ctx.RegisterResource("aws:fsx/fileCache:FileCache", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileCache gets an existing FileCache resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileCache(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileCacheState, opts ...pulumi.ResourceOption) (*FileCache, error) {
	var resource FileCache
	err := ctx.ReadResource("aws:fsx/fileCache:FileCache", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileCache resources.
type fileCacheState struct {
	// The Amazon Resource Name (ARN) for the resource.
	Arn *string `pulumi:"arn"`
	// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
	CopyTagsToDataRepositoryAssociations *bool `pulumi:"copyTagsToDataRepositoryAssociations"`
	// A list of IDs of data repository associations that are associated with this cache.
	DataRepositoryAssociationIds []string `pulumi:"dataRepositoryAssociationIds"`
	// See the `dataRepositoryAssociation` configuration block. Max of 8.
	// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
	DataRepositoryAssociations []FileCacheDataRepositoryAssociation `pulumi:"dataRepositoryAssociations"`
	// The Domain Name System (DNS) name for the cache.
	DnsName *string `pulumi:"dnsName"`
	// The system-generated, unique ID of the cache.
	FileCacheId *string `pulumi:"fileCacheId"`
	// The type of cache that you're creating. The only supported value is `LUSTRE`.
	FileCacheType *string `pulumi:"fileCacheType"`
	// The version for the type of cache that you're creating. The only supported value is `2.12`.
	FileCacheTypeVersion *string `pulumi:"fileCacheTypeVersion"`
	// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
	LustreConfigurations []FileCacheLustreConfiguration `pulumi:"lustreConfigurations"`
	// A list of network interface IDs.
	NetworkInterfaceIds []string `pulumi:"networkInterfaceIds"`
	OwnerId             *string  `pulumi:"ownerId"`
	// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
	StorageCapacity *int `pulumi:"storageCapacity"`
	// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
	//
	// The following arguments are optional:
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The ID of your virtual private cloud (VPC).
	VpcId *string `pulumi:"vpcId"`
}

type FileCacheState struct {
	// The Amazon Resource Name (ARN) for the resource.
	Arn pulumi.StringPtrInput
	// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
	CopyTagsToDataRepositoryAssociations pulumi.BoolPtrInput
	// A list of IDs of data repository associations that are associated with this cache.
	DataRepositoryAssociationIds pulumi.StringArrayInput
	// See the `dataRepositoryAssociation` configuration block. Max of 8.
	// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
	DataRepositoryAssociations FileCacheDataRepositoryAssociationArrayInput
	// The Domain Name System (DNS) name for the cache.
	DnsName pulumi.StringPtrInput
	// The system-generated, unique ID of the cache.
	FileCacheId pulumi.StringPtrInput
	// The type of cache that you're creating. The only supported value is `LUSTRE`.
	FileCacheType pulumi.StringPtrInput
	// The version for the type of cache that you're creating. The only supported value is `2.12`.
	FileCacheTypeVersion pulumi.StringPtrInput
	// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
	KmsKeyId pulumi.StringPtrInput
	// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
	LustreConfigurations FileCacheLustreConfigurationArrayInput
	// A list of network interface IDs.
	NetworkInterfaceIds pulumi.StringArrayInput
	OwnerId             pulumi.StringPtrInput
	// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
	SecurityGroupIds pulumi.StringArrayInput
	// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
	StorageCapacity pulumi.IntPtrInput
	// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The ID of your virtual private cloud (VPC).
	VpcId pulumi.StringPtrInput
}

func (FileCacheState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileCacheState)(nil)).Elem()
}

type fileCacheArgs struct {
	// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
	CopyTagsToDataRepositoryAssociations *bool `pulumi:"copyTagsToDataRepositoryAssociations"`
	// See the `dataRepositoryAssociation` configuration block. Max of 8.
	// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
	DataRepositoryAssociations []FileCacheDataRepositoryAssociation `pulumi:"dataRepositoryAssociations"`
	// The type of cache that you're creating. The only supported value is `LUSTRE`.
	FileCacheType string `pulumi:"fileCacheType"`
	// The version for the type of cache that you're creating. The only supported value is `2.12`.
	FileCacheTypeVersion string `pulumi:"fileCacheTypeVersion"`
	// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
	LustreConfigurations []FileCacheLustreConfiguration `pulumi:"lustreConfigurations"`
	// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
	StorageCapacity int `pulumi:"storageCapacity"`
	// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
	//
	// The following arguments are optional:
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a FileCache resource.
type FileCacheArgs struct {
	// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
	CopyTagsToDataRepositoryAssociations pulumi.BoolPtrInput
	// See the `dataRepositoryAssociation` configuration block. Max of 8.
	// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
	DataRepositoryAssociations FileCacheDataRepositoryAssociationArrayInput
	// The type of cache that you're creating. The only supported value is `LUSTRE`.
	FileCacheType pulumi.StringInput
	// The version for the type of cache that you're creating. The only supported value is `2.12`.
	FileCacheTypeVersion pulumi.StringInput
	// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
	KmsKeyId pulumi.StringPtrInput
	// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
	LustreConfigurations FileCacheLustreConfigurationArrayInput
	// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
	SecurityGroupIds pulumi.StringArrayInput
	// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
	StorageCapacity pulumi.IntInput
	// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (FileCacheArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileCacheArgs)(nil)).Elem()
}

type FileCacheInput interface {
	pulumi.Input

	ToFileCacheOutput() FileCacheOutput
	ToFileCacheOutputWithContext(ctx context.Context) FileCacheOutput
}

func (*FileCache) ElementType() reflect.Type {
	return reflect.TypeOf((**FileCache)(nil)).Elem()
}

func (i *FileCache) ToFileCacheOutput() FileCacheOutput {
	return i.ToFileCacheOutputWithContext(context.Background())
}

func (i *FileCache) ToFileCacheOutputWithContext(ctx context.Context) FileCacheOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileCacheOutput)
}

// FileCacheArrayInput is an input type that accepts FileCacheArray and FileCacheArrayOutput values.
// You can construct a concrete instance of `FileCacheArrayInput` via:
//
//	FileCacheArray{ FileCacheArgs{...} }
type FileCacheArrayInput interface {
	pulumi.Input

	ToFileCacheArrayOutput() FileCacheArrayOutput
	ToFileCacheArrayOutputWithContext(context.Context) FileCacheArrayOutput
}

type FileCacheArray []FileCacheInput

func (FileCacheArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileCache)(nil)).Elem()
}

func (i FileCacheArray) ToFileCacheArrayOutput() FileCacheArrayOutput {
	return i.ToFileCacheArrayOutputWithContext(context.Background())
}

func (i FileCacheArray) ToFileCacheArrayOutputWithContext(ctx context.Context) FileCacheArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileCacheArrayOutput)
}

// FileCacheMapInput is an input type that accepts FileCacheMap and FileCacheMapOutput values.
// You can construct a concrete instance of `FileCacheMapInput` via:
//
//	FileCacheMap{ "key": FileCacheArgs{...} }
type FileCacheMapInput interface {
	pulumi.Input

	ToFileCacheMapOutput() FileCacheMapOutput
	ToFileCacheMapOutputWithContext(context.Context) FileCacheMapOutput
}

type FileCacheMap map[string]FileCacheInput

func (FileCacheMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileCache)(nil)).Elem()
}

func (i FileCacheMap) ToFileCacheMapOutput() FileCacheMapOutput {
	return i.ToFileCacheMapOutputWithContext(context.Background())
}

func (i FileCacheMap) ToFileCacheMapOutputWithContext(ctx context.Context) FileCacheMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileCacheMapOutput)
}

type FileCacheOutput struct{ *pulumi.OutputState }

func (FileCacheOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileCache)(nil)).Elem()
}

func (o FileCacheOutput) ToFileCacheOutput() FileCacheOutput {
	return o
}

func (o FileCacheOutput) ToFileCacheOutputWithContext(ctx context.Context) FileCacheOutput {
	return o
}

// The Amazon Resource Name (ARN) for the resource.
func (o FileCacheOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
func (o FileCacheOutput) CopyTagsToDataRepositoryAssociations() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileCache) pulumi.BoolPtrOutput { return v.CopyTagsToDataRepositoryAssociations }).(pulumi.BoolPtrOutput)
}

// A list of IDs of data repository associations that are associated with this cache.
func (o FileCacheOutput) DataRepositoryAssociationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringArrayOutput { return v.DataRepositoryAssociationIds }).(pulumi.StringArrayOutput)
}

// See the `dataRepositoryAssociation` configuration block. Max of 8.
// A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
func (o FileCacheOutput) DataRepositoryAssociations() FileCacheDataRepositoryAssociationArrayOutput {
	return o.ApplyT(func(v *FileCache) FileCacheDataRepositoryAssociationArrayOutput { return v.DataRepositoryAssociations }).(FileCacheDataRepositoryAssociationArrayOutput)
}

// The Domain Name System (DNS) name for the cache.
func (o FileCacheOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.DnsName }).(pulumi.StringOutput)
}

// The system-generated, unique ID of the cache.
func (o FileCacheOutput) FileCacheId() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.FileCacheId }).(pulumi.StringOutput)
}

// The type of cache that you're creating. The only supported value is `LUSTRE`.
func (o FileCacheOutput) FileCacheType() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.FileCacheType }).(pulumi.StringOutput)
}

// The version for the type of cache that you're creating. The only supported value is `2.12`.
func (o FileCacheOutput) FileCacheTypeVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.FileCacheTypeVersion }).(pulumi.StringOutput)
}

// Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
func (o FileCacheOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

// See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
func (o FileCacheOutput) LustreConfigurations() FileCacheLustreConfigurationArrayOutput {
	return o.ApplyT(func(v *FileCache) FileCacheLustreConfigurationArrayOutput { return v.LustreConfigurations }).(FileCacheLustreConfigurationArrayOutput)
}

// A list of network interface IDs.
func (o FileCacheOutput) NetworkInterfaceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringArrayOutput { return v.NetworkInterfaceIds }).(pulumi.StringArrayOutput)
}

func (o FileCacheOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.OwnerId }).(pulumi.StringOutput)
}

// A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
func (o FileCacheOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
func (o FileCacheOutput) StorageCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *FileCache) pulumi.IntOutput { return v.StorageCapacity }).(pulumi.IntOutput)
}

// A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
//
// The following arguments are optional:
func (o FileCacheOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o FileCacheOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o FileCacheOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ID of your virtual private cloud (VPC).
func (o FileCacheOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *FileCache) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type FileCacheArrayOutput struct{ *pulumi.OutputState }

func (FileCacheArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileCache)(nil)).Elem()
}

func (o FileCacheArrayOutput) ToFileCacheArrayOutput() FileCacheArrayOutput {
	return o
}

func (o FileCacheArrayOutput) ToFileCacheArrayOutputWithContext(ctx context.Context) FileCacheArrayOutput {
	return o
}

func (o FileCacheArrayOutput) Index(i pulumi.IntInput) FileCacheOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileCache {
		return vs[0].([]*FileCache)[vs[1].(int)]
	}).(FileCacheOutput)
}

type FileCacheMapOutput struct{ *pulumi.OutputState }

func (FileCacheMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileCache)(nil)).Elem()
}

func (o FileCacheMapOutput) ToFileCacheMapOutput() FileCacheMapOutput {
	return o
}

func (o FileCacheMapOutput) ToFileCacheMapOutputWithContext(ctx context.Context) FileCacheMapOutput {
	return o
}

func (o FileCacheMapOutput) MapIndex(k pulumi.StringInput) FileCacheOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileCache {
		return vs[0].(map[string]*FileCache)[vs[1].(string)]
	}).(FileCacheOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileCacheInput)(nil)).Elem(), &FileCache{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileCacheArrayInput)(nil)).Elem(), FileCacheArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileCacheMapInput)(nil)).Elem(), FileCacheMap{})
	pulumi.RegisterOutputType(FileCacheOutput{})
	pulumi.RegisterOutputType(FileCacheArrayOutput{})
	pulumi.RegisterOutputType(FileCacheMapOutput{})
}
