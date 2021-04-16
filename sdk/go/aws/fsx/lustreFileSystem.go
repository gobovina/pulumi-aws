// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fsx

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a FSx Lustre File System. See the [FSx Lustre Guide](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html) for more information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/fsx"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := fsx.NewLustreFileSystem(ctx, "example", &fsx.LustreFileSystemArgs{
// 			ImportPath:      pulumi.String(fmt.Sprintf("%v%v", "s3://", aws_s3_bucket.Example.Bucket)),
// 			StorageCapacity: pulumi.Int(1200),
// 			SubnetIds: pulumi.String(pulumi.String{
// 				pulumi.Any(aws_subnet.Example.Id),
// 			}),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// FSx File Systems can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import aws:fsx/lustreFileSystem:LustreFileSystem example fs-543ab12b1ca672f33
// ```
//
//  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the provider configuration on an imported resource, this provider will always show a difference. To workaround this behavior, either omit the argument from the provider configuration or use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to hide the difference, e.g. terraform resource "aws_fsx_lustre_file_system" "example" {
//
// # ... other configuration ...
//
//  security_group_ids = [aws_security_group.example.id]
//
// # There is no FSx API for reading security_group_ids
//
//  lifecycle {
//
//  ignore_changes = [security_group_ids]
//
//  } }
type LustreFileSystem struct {
	pulumi.CustomResourceState

	// Amazon Resource Name of the file system.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
	AutoImportPolicy pulumi.StringOutput `pulumi:"autoImportPolicy"`
	// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
	AutomaticBackupRetentionDays pulumi.IntOutput `pulumi:"automaticBackupRetentionDays"`
	// A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
	CopyTagsToBackups pulumi.BoolPtrOutput `pulumi:"copyTagsToBackups"`
	// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
	DailyAutomaticBackupStartTime pulumi.StringOutput `pulumi:"dailyAutomaticBackupStartTime"`
	// - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`. `SCRATCH_1` deployment types cannot have `storageCapacity` increased.
	DeploymentType pulumi.StringPtrOutput `pulumi:"deploymentType"`
	// DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
	DriveCacheType pulumi.StringPtrOutput `pulumi:"driveCacheType"`
	// S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
	ExportPath pulumi.StringOutput `pulumi:"exportPath"`
	// S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
	ImportPath pulumi.StringPtrOutput `pulumi:"importPath"`
	// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
	ImportedFileChunkSize pulumi.IntOutput `pulumi:"importedFileChunkSize"`
	// ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// The value to be used when mounting the filesystem.
	MountName pulumi.StringOutput `pulumi:"mountName"`
	// Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
	NetworkInterfaceIds pulumi.StringArrayOutput `pulumi:"networkInterfaceIds"`
	// AWS account identifier that created the file system.
	OwnerId pulumi.StringOutput `pulumi:"ownerId"`
	// - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
	PerUnitStorageThroughput pulumi.IntPtrOutput `pulumi:"perUnitStorageThroughput"`
	// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
	StorageCapacity pulumi.IntOutput `pulumi:"storageCapacity"`
	// - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
	StorageType pulumi.StringPtrOutput `pulumi:"storageType"`
	// A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
	SubnetIds pulumi.StringOutput `pulumi:"subnetIds"`
	// A map of tags to assign to the file system.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Identifier of the Virtual Private Cloud for the file system.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
	WeeklyMaintenanceStartTime pulumi.StringOutput `pulumi:"weeklyMaintenanceStartTime"`
}

// NewLustreFileSystem registers a new resource with the given unique name, arguments, and options.
func NewLustreFileSystem(ctx *pulumi.Context,
	name string, args *LustreFileSystemArgs, opts ...pulumi.ResourceOption) (*LustreFileSystem, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StorageCapacity == nil {
		return nil, errors.New("invalid value for required argument 'StorageCapacity'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	var resource LustreFileSystem
	err := ctx.RegisterResource("aws:fsx/lustreFileSystem:LustreFileSystem", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLustreFileSystem gets an existing LustreFileSystem resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLustreFileSystem(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LustreFileSystemState, opts ...pulumi.ResourceOption) (*LustreFileSystem, error) {
	var resource LustreFileSystem
	err := ctx.ReadResource("aws:fsx/lustreFileSystem:LustreFileSystem", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LustreFileSystem resources.
type lustreFileSystemState struct {
	// Amazon Resource Name of the file system.
	Arn *string `pulumi:"arn"`
	// How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
	AutoImportPolicy *string `pulumi:"autoImportPolicy"`
	// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
	AutomaticBackupRetentionDays *int `pulumi:"automaticBackupRetentionDays"`
	// A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
	CopyTagsToBackups *bool `pulumi:"copyTagsToBackups"`
	// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
	DailyAutomaticBackupStartTime *string `pulumi:"dailyAutomaticBackupStartTime"`
	// - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`. `SCRATCH_1` deployment types cannot have `storageCapacity` increased.
	DeploymentType *string `pulumi:"deploymentType"`
	// DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
	DnsName *string `pulumi:"dnsName"`
	// - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
	DriveCacheType *string `pulumi:"driveCacheType"`
	// S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
	ExportPath *string `pulumi:"exportPath"`
	// S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
	ImportPath *string `pulumi:"importPath"`
	// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
	ImportedFileChunkSize *int `pulumi:"importedFileChunkSize"`
	// ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// The value to be used when mounting the filesystem.
	MountName *string `pulumi:"mountName"`
	// Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
	NetworkInterfaceIds []string `pulumi:"networkInterfaceIds"`
	// AWS account identifier that created the file system.
	OwnerId *string `pulumi:"ownerId"`
	// - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
	PerUnitStorageThroughput *int `pulumi:"perUnitStorageThroughput"`
	// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
	StorageCapacity *int `pulumi:"storageCapacity"`
	// - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
	StorageType *string `pulumi:"storageType"`
	// A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
	SubnetIds *string `pulumi:"subnetIds"`
	// A map of tags to assign to the file system.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of the Virtual Private Cloud for the file system.
	VpcId *string `pulumi:"vpcId"`
	// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
	WeeklyMaintenanceStartTime *string `pulumi:"weeklyMaintenanceStartTime"`
}

type LustreFileSystemState struct {
	// Amazon Resource Name of the file system.
	Arn pulumi.StringPtrInput
	// How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
	AutoImportPolicy pulumi.StringPtrInput
	// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
	AutomaticBackupRetentionDays pulumi.IntPtrInput
	// A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
	CopyTagsToBackups pulumi.BoolPtrInput
	// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
	DailyAutomaticBackupStartTime pulumi.StringPtrInput
	// - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`. `SCRATCH_1` deployment types cannot have `storageCapacity` increased.
	DeploymentType pulumi.StringPtrInput
	// DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
	DnsName pulumi.StringPtrInput
	// - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
	DriveCacheType pulumi.StringPtrInput
	// S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
	ExportPath pulumi.StringPtrInput
	// S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
	ImportPath pulumi.StringPtrInput
	// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
	ImportedFileChunkSize pulumi.IntPtrInput
	// ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
	KmsKeyId pulumi.StringPtrInput
	// The value to be used when mounting the filesystem.
	MountName pulumi.StringPtrInput
	// Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
	NetworkInterfaceIds pulumi.StringArrayInput
	// AWS account identifier that created the file system.
	OwnerId pulumi.StringPtrInput
	// - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
	PerUnitStorageThroughput pulumi.IntPtrInput
	// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
	SecurityGroupIds pulumi.StringArrayInput
	// The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
	StorageCapacity pulumi.IntPtrInput
	// - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
	StorageType pulumi.StringPtrInput
	// A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
	SubnetIds pulumi.StringPtrInput
	// A map of tags to assign to the file system.
	Tags pulumi.StringMapInput
	// Identifier of the Virtual Private Cloud for the file system.
	VpcId pulumi.StringPtrInput
	// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
	WeeklyMaintenanceStartTime pulumi.StringPtrInput
}

func (LustreFileSystemState) ElementType() reflect.Type {
	return reflect.TypeOf((*lustreFileSystemState)(nil)).Elem()
}

type lustreFileSystemArgs struct {
	// How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
	AutoImportPolicy *string `pulumi:"autoImportPolicy"`
	// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
	AutomaticBackupRetentionDays *int `pulumi:"automaticBackupRetentionDays"`
	// A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
	CopyTagsToBackups *bool `pulumi:"copyTagsToBackups"`
	// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
	DailyAutomaticBackupStartTime *string `pulumi:"dailyAutomaticBackupStartTime"`
	// - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`. `SCRATCH_1` deployment types cannot have `storageCapacity` increased.
	DeploymentType *string `pulumi:"deploymentType"`
	// - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
	DriveCacheType *string `pulumi:"driveCacheType"`
	// S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
	ExportPath *string `pulumi:"exportPath"`
	// S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
	ImportPath *string `pulumi:"importPath"`
	// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
	ImportedFileChunkSize *int `pulumi:"importedFileChunkSize"`
	// ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
	PerUnitStorageThroughput *int `pulumi:"perUnitStorageThroughput"`
	// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
	StorageCapacity int `pulumi:"storageCapacity"`
	// - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
	StorageType *string `pulumi:"storageType"`
	// A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
	SubnetIds string `pulumi:"subnetIds"`
	// A map of tags to assign to the file system.
	Tags map[string]string `pulumi:"tags"`
	// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
	WeeklyMaintenanceStartTime *string `pulumi:"weeklyMaintenanceStartTime"`
}

// The set of arguments for constructing a LustreFileSystem resource.
type LustreFileSystemArgs struct {
	// How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details.
	AutoImportPolicy pulumi.StringPtrInput
	// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` deployment_type.
	AutomaticBackupRetentionDays pulumi.IntPtrInput
	// A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` deployment_type. The default value is false.
	CopyTagsToBackups pulumi.BoolPtrInput
	// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` deployment_type. Requires `automaticBackupRetentionDays` to be set.
	DailyAutomaticBackupStartTime pulumi.StringPtrInput
	// - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`. `SCRATCH_1` deployment types cannot have `storageCapacity` increased.
	DeploymentType pulumi.StringPtrInput
	// - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
	DriveCacheType pulumi.StringPtrInput
	// S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
	ExportPath pulumi.StringPtrInput
	// S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
	ImportPath pulumi.StringPtrInput
	// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
	ImportedFileChunkSize pulumi.IntPtrInput
	// ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` deployment_type. Defaults to an AWS managed KMS Key.
	KmsKeyId pulumi.StringPtrInput
	// - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` deployment_type. Valid values for `SSD` storageType are 50, 100, 200. Valid values for `HDD` storageType are 12, 40.
	PerUnitStorageThroughput pulumi.IntPtrInput
	// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
	SecurityGroupIds pulumi.StringArrayInput
	// The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
	StorageCapacity pulumi.IntInput
	// - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
	StorageType pulumi.StringPtrInput
	// A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
	SubnetIds pulumi.StringInput
	// A map of tags to assign to the file system.
	Tags pulumi.StringMapInput
	// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
	WeeklyMaintenanceStartTime pulumi.StringPtrInput
}

func (LustreFileSystemArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lustreFileSystemArgs)(nil)).Elem()
}

type LustreFileSystemInput interface {
	pulumi.Input

	ToLustreFileSystemOutput() LustreFileSystemOutput
	ToLustreFileSystemOutputWithContext(ctx context.Context) LustreFileSystemOutput
}

func (*LustreFileSystem) ElementType() reflect.Type {
	return reflect.TypeOf((*LustreFileSystem)(nil))
}

func (i *LustreFileSystem) ToLustreFileSystemOutput() LustreFileSystemOutput {
	return i.ToLustreFileSystemOutputWithContext(context.Background())
}

func (i *LustreFileSystem) ToLustreFileSystemOutputWithContext(ctx context.Context) LustreFileSystemOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LustreFileSystemOutput)
}

func (i *LustreFileSystem) ToLustreFileSystemPtrOutput() LustreFileSystemPtrOutput {
	return i.ToLustreFileSystemPtrOutputWithContext(context.Background())
}

func (i *LustreFileSystem) ToLustreFileSystemPtrOutputWithContext(ctx context.Context) LustreFileSystemPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LustreFileSystemPtrOutput)
}

type LustreFileSystemPtrInput interface {
	pulumi.Input

	ToLustreFileSystemPtrOutput() LustreFileSystemPtrOutput
	ToLustreFileSystemPtrOutputWithContext(ctx context.Context) LustreFileSystemPtrOutput
}

type lustreFileSystemPtrType LustreFileSystemArgs

func (*lustreFileSystemPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LustreFileSystem)(nil))
}

func (i *lustreFileSystemPtrType) ToLustreFileSystemPtrOutput() LustreFileSystemPtrOutput {
	return i.ToLustreFileSystemPtrOutputWithContext(context.Background())
}

func (i *lustreFileSystemPtrType) ToLustreFileSystemPtrOutputWithContext(ctx context.Context) LustreFileSystemPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LustreFileSystemPtrOutput)
}

// LustreFileSystemArrayInput is an input type that accepts LustreFileSystemArray and LustreFileSystemArrayOutput values.
// You can construct a concrete instance of `LustreFileSystemArrayInput` via:
//
//          LustreFileSystemArray{ LustreFileSystemArgs{...} }
type LustreFileSystemArrayInput interface {
	pulumi.Input

	ToLustreFileSystemArrayOutput() LustreFileSystemArrayOutput
	ToLustreFileSystemArrayOutputWithContext(context.Context) LustreFileSystemArrayOutput
}

type LustreFileSystemArray []LustreFileSystemInput

func (LustreFileSystemArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LustreFileSystem)(nil))
}

func (i LustreFileSystemArray) ToLustreFileSystemArrayOutput() LustreFileSystemArrayOutput {
	return i.ToLustreFileSystemArrayOutputWithContext(context.Background())
}

func (i LustreFileSystemArray) ToLustreFileSystemArrayOutputWithContext(ctx context.Context) LustreFileSystemArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LustreFileSystemArrayOutput)
}

// LustreFileSystemMapInput is an input type that accepts LustreFileSystemMap and LustreFileSystemMapOutput values.
// You can construct a concrete instance of `LustreFileSystemMapInput` via:
//
//          LustreFileSystemMap{ "key": LustreFileSystemArgs{...} }
type LustreFileSystemMapInput interface {
	pulumi.Input

	ToLustreFileSystemMapOutput() LustreFileSystemMapOutput
	ToLustreFileSystemMapOutputWithContext(context.Context) LustreFileSystemMapOutput
}

type LustreFileSystemMap map[string]LustreFileSystemInput

func (LustreFileSystemMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LustreFileSystem)(nil))
}

func (i LustreFileSystemMap) ToLustreFileSystemMapOutput() LustreFileSystemMapOutput {
	return i.ToLustreFileSystemMapOutputWithContext(context.Background())
}

func (i LustreFileSystemMap) ToLustreFileSystemMapOutputWithContext(ctx context.Context) LustreFileSystemMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LustreFileSystemMapOutput)
}

type LustreFileSystemOutput struct {
	*pulumi.OutputState
}

func (LustreFileSystemOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LustreFileSystem)(nil))
}

func (o LustreFileSystemOutput) ToLustreFileSystemOutput() LustreFileSystemOutput {
	return o
}

func (o LustreFileSystemOutput) ToLustreFileSystemOutputWithContext(ctx context.Context) LustreFileSystemOutput {
	return o
}

func (o LustreFileSystemOutput) ToLustreFileSystemPtrOutput() LustreFileSystemPtrOutput {
	return o.ToLustreFileSystemPtrOutputWithContext(context.Background())
}

func (o LustreFileSystemOutput) ToLustreFileSystemPtrOutputWithContext(ctx context.Context) LustreFileSystemPtrOutput {
	return o.ApplyT(func(v LustreFileSystem) *LustreFileSystem {
		return &v
	}).(LustreFileSystemPtrOutput)
}

type LustreFileSystemPtrOutput struct {
	*pulumi.OutputState
}

func (LustreFileSystemPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LustreFileSystem)(nil))
}

func (o LustreFileSystemPtrOutput) ToLustreFileSystemPtrOutput() LustreFileSystemPtrOutput {
	return o
}

func (o LustreFileSystemPtrOutput) ToLustreFileSystemPtrOutputWithContext(ctx context.Context) LustreFileSystemPtrOutput {
	return o
}

type LustreFileSystemArrayOutput struct{ *pulumi.OutputState }

func (LustreFileSystemArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LustreFileSystem)(nil))
}

func (o LustreFileSystemArrayOutput) ToLustreFileSystemArrayOutput() LustreFileSystemArrayOutput {
	return o
}

func (o LustreFileSystemArrayOutput) ToLustreFileSystemArrayOutputWithContext(ctx context.Context) LustreFileSystemArrayOutput {
	return o
}

func (o LustreFileSystemArrayOutput) Index(i pulumi.IntInput) LustreFileSystemOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LustreFileSystem {
		return vs[0].([]LustreFileSystem)[vs[1].(int)]
	}).(LustreFileSystemOutput)
}

type LustreFileSystemMapOutput struct{ *pulumi.OutputState }

func (LustreFileSystemMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LustreFileSystem)(nil))
}

func (o LustreFileSystemMapOutput) ToLustreFileSystemMapOutput() LustreFileSystemMapOutput {
	return o
}

func (o LustreFileSystemMapOutput) ToLustreFileSystemMapOutputWithContext(ctx context.Context) LustreFileSystemMapOutput {
	return o
}

func (o LustreFileSystemMapOutput) MapIndex(k pulumi.StringInput) LustreFileSystemOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LustreFileSystem {
		return vs[0].(map[string]LustreFileSystem)[vs[1].(string)]
	}).(LustreFileSystemOutput)
}

func init() {
	pulumi.RegisterOutputType(LustreFileSystemOutput{})
	pulumi.RegisterOutputType(LustreFileSystemPtrOutput{})
	pulumi.RegisterOutputType(LustreFileSystemArrayOutput{})
	pulumi.RegisterOutputType(LustreFileSystemMapOutput{})
}
