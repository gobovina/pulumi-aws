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

// Manages a FSx ONTAP Volume.
// See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/fsx"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := fsx.NewOntapVolume(ctx, "test", &fsx.OntapVolumeArgs{
//				Name:                     pulumi.String("test"),
//				JunctionPath:             pulumi.String("/test"),
//				SizeInMegabytes:          pulumi.Int(1024),
//				StorageEfficiencyEnabled: pulumi.Bool(true),
//				StorageVirtualMachineId:  pulumi.Any(testAwsFsxOntapStorageVirtualMachine.Id),
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
// ### Using Tiering Policy
//
// Additional information on tiering policy with ONTAP Volumes can be found in the [FSx ONTAP Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html).
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
//			_, err := fsx.NewOntapVolume(ctx, "test", &fsx.OntapVolumeArgs{
//				Name:                     pulumi.String("test"),
//				JunctionPath:             pulumi.String("/test"),
//				SizeInMegabytes:          pulumi.Int(1024),
//				StorageEfficiencyEnabled: pulumi.Bool(true),
//				StorageVirtualMachineId:  pulumi.Any(testAwsFsxOntapStorageVirtualMachine.Id),
//				TieringPolicy: &fsx.OntapVolumeTieringPolicyArgs{
//					Name:          pulumi.String("AUTO"),
//					CoolingPeriod: pulumi.Int(31),
//				},
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
// Using `pulumi import`, import FSx ONTAP volume using the `id`. For example:
//
// ```sh
// $ pulumi import aws:fsx/ontapVolume:OntapVolume example fsvol-12345678abcdef123
// ```
type OntapVolume struct {
	pulumi.CustomResourceState

	// Amazon Resource Name of the volune.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	BypassSnaplockEnterpriseRetention pulumi.BoolPtrOutput `pulumi:"bypassSnaplockEnterpriseRetention"`
	// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
	CopyTagsToBackups pulumi.BoolPtrOutput `pulumi:"copyTagsToBackups"`
	// Describes the file system for the volume, e.g. `fs-12345679`
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
	FlexcacheEndpointType pulumi.StringOutput `pulumi:"flexcacheEndpointType"`
	// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
	JunctionPath pulumi.StringPtrOutput `pulumi:"junctionPath"`
	// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
	OntapVolumeType pulumi.StringOutput `pulumi:"ontapVolumeType"`
	// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
	SecurityStyle pulumi.StringOutput `pulumi:"securityStyle"`
	// Specifies the size of the volume, in megabytes (MB), that you are creating.
	SizeInMegabytes pulumi.IntOutput `pulumi:"sizeInMegabytes"`
	// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	SkipFinalBackup pulumi.BoolPtrOutput `pulumi:"skipFinalBackup"`
	// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
	SnaplockConfiguration OntapVolumeSnaplockConfigurationPtrOutput `pulumi:"snaplockConfiguration"`
	// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
	SnapshotPolicy pulumi.StringOutput `pulumi:"snapshotPolicy"`
	// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
	StorageEfficiencyEnabled pulumi.BoolPtrOutput `pulumi:"storageEfficiencyEnabled"`
	// Specifies the storage virtual machine in which to create the volume.
	StorageVirtualMachineId pulumi.StringOutput `pulumi:"storageVirtualMachineId"`
	// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
	TieringPolicy OntapVolumeTieringPolicyPtrOutput `pulumi:"tieringPolicy"`
	// The Volume's UUID (universally unique identifier).
	Uuid pulumi.StringOutput `pulumi:"uuid"`
	// The type of volume, currently the only valid value is `ONTAP`.
	VolumeType pulumi.StringPtrOutput `pulumi:"volumeType"`
}

// NewOntapVolume registers a new resource with the given unique name, arguments, and options.
func NewOntapVolume(ctx *pulumi.Context,
	name string, args *OntapVolumeArgs, opts ...pulumi.ResourceOption) (*OntapVolume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SizeInMegabytes == nil {
		return nil, errors.New("invalid value for required argument 'SizeInMegabytes'")
	}
	if args.StorageVirtualMachineId == nil {
		return nil, errors.New("invalid value for required argument 'StorageVirtualMachineId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OntapVolume
	err := ctx.RegisterResource("aws:fsx/ontapVolume:OntapVolume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOntapVolume gets an existing OntapVolume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOntapVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OntapVolumeState, opts ...pulumi.ResourceOption) (*OntapVolume, error) {
	var resource OntapVolume
	err := ctx.ReadResource("aws:fsx/ontapVolume:OntapVolume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OntapVolume resources.
type ontapVolumeState struct {
	// Amazon Resource Name of the volune.
	Arn *string `pulumi:"arn"`
	// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	BypassSnaplockEnterpriseRetention *bool `pulumi:"bypassSnaplockEnterpriseRetention"`
	// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
	CopyTagsToBackups *bool `pulumi:"copyTagsToBackups"`
	// Describes the file system for the volume, e.g. `fs-12345679`
	FileSystemId *string `pulumi:"fileSystemId"`
	// Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
	FlexcacheEndpointType *string `pulumi:"flexcacheEndpointType"`
	// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
	JunctionPath *string `pulumi:"junctionPath"`
	// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
	Name *string `pulumi:"name"`
	// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
	OntapVolumeType *string `pulumi:"ontapVolumeType"`
	// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
	SecurityStyle *string `pulumi:"securityStyle"`
	// Specifies the size of the volume, in megabytes (MB), that you are creating.
	SizeInMegabytes *int `pulumi:"sizeInMegabytes"`
	// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	SkipFinalBackup *bool `pulumi:"skipFinalBackup"`
	// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
	SnaplockConfiguration *OntapVolumeSnaplockConfiguration `pulumi:"snaplockConfiguration"`
	// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
	SnapshotPolicy *string `pulumi:"snapshotPolicy"`
	// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
	StorageEfficiencyEnabled *bool `pulumi:"storageEfficiencyEnabled"`
	// Specifies the storage virtual machine in which to create the volume.
	StorageVirtualMachineId *string `pulumi:"storageVirtualMachineId"`
	// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
	TieringPolicy *OntapVolumeTieringPolicy `pulumi:"tieringPolicy"`
	// The Volume's UUID (universally unique identifier).
	Uuid *string `pulumi:"uuid"`
	// The type of volume, currently the only valid value is `ONTAP`.
	VolumeType *string `pulumi:"volumeType"`
}

type OntapVolumeState struct {
	// Amazon Resource Name of the volune.
	Arn pulumi.StringPtrInput
	// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	BypassSnaplockEnterpriseRetention pulumi.BoolPtrInput
	// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
	CopyTagsToBackups pulumi.BoolPtrInput
	// Describes the file system for the volume, e.g. `fs-12345679`
	FileSystemId pulumi.StringPtrInput
	// Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
	FlexcacheEndpointType pulumi.StringPtrInput
	// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
	JunctionPath pulumi.StringPtrInput
	// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
	Name pulumi.StringPtrInput
	// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
	OntapVolumeType pulumi.StringPtrInput
	// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
	SecurityStyle pulumi.StringPtrInput
	// Specifies the size of the volume, in megabytes (MB), that you are creating.
	SizeInMegabytes pulumi.IntPtrInput
	// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	SkipFinalBackup pulumi.BoolPtrInput
	// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
	SnaplockConfiguration OntapVolumeSnaplockConfigurationPtrInput
	// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
	SnapshotPolicy pulumi.StringPtrInput
	// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
	StorageEfficiencyEnabled pulumi.BoolPtrInput
	// Specifies the storage virtual machine in which to create the volume.
	StorageVirtualMachineId pulumi.StringPtrInput
	// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
	TieringPolicy OntapVolumeTieringPolicyPtrInput
	// The Volume's UUID (universally unique identifier).
	Uuid pulumi.StringPtrInput
	// The type of volume, currently the only valid value is `ONTAP`.
	VolumeType pulumi.StringPtrInput
}

func (OntapVolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*ontapVolumeState)(nil)).Elem()
}

type ontapVolumeArgs struct {
	// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	BypassSnaplockEnterpriseRetention *bool `pulumi:"bypassSnaplockEnterpriseRetention"`
	// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
	CopyTagsToBackups *bool `pulumi:"copyTagsToBackups"`
	// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
	JunctionPath *string `pulumi:"junctionPath"`
	// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
	Name *string `pulumi:"name"`
	// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
	OntapVolumeType *string `pulumi:"ontapVolumeType"`
	// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
	SecurityStyle *string `pulumi:"securityStyle"`
	// Specifies the size of the volume, in megabytes (MB), that you are creating.
	SizeInMegabytes int `pulumi:"sizeInMegabytes"`
	// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	SkipFinalBackup *bool `pulumi:"skipFinalBackup"`
	// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
	SnaplockConfiguration *OntapVolumeSnaplockConfiguration `pulumi:"snaplockConfiguration"`
	// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
	SnapshotPolicy *string `pulumi:"snapshotPolicy"`
	// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
	StorageEfficiencyEnabled *bool `pulumi:"storageEfficiencyEnabled"`
	// Specifies the storage virtual machine in which to create the volume.
	StorageVirtualMachineId string `pulumi:"storageVirtualMachineId"`
	// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
	TieringPolicy *OntapVolumeTieringPolicy `pulumi:"tieringPolicy"`
	// The type of volume, currently the only valid value is `ONTAP`.
	VolumeType *string `pulumi:"volumeType"`
}

// The set of arguments for constructing a OntapVolume resource.
type OntapVolumeArgs struct {
	// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	BypassSnaplockEnterpriseRetention pulumi.BoolPtrInput
	// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
	CopyTagsToBackups pulumi.BoolPtrInput
	// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
	JunctionPath pulumi.StringPtrInput
	// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
	Name pulumi.StringPtrInput
	// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
	OntapVolumeType pulumi.StringPtrInput
	// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
	SecurityStyle pulumi.StringPtrInput
	// Specifies the size of the volume, in megabytes (MB), that you are creating.
	SizeInMegabytes pulumi.IntInput
	// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
	SkipFinalBackup pulumi.BoolPtrInput
	// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
	SnaplockConfiguration OntapVolumeSnaplockConfigurationPtrInput
	// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
	SnapshotPolicy pulumi.StringPtrInput
	// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
	StorageEfficiencyEnabled pulumi.BoolPtrInput
	// Specifies the storage virtual machine in which to create the volume.
	StorageVirtualMachineId pulumi.StringInput
	// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
	TieringPolicy OntapVolumeTieringPolicyPtrInput
	// The type of volume, currently the only valid value is `ONTAP`.
	VolumeType pulumi.StringPtrInput
}

func (OntapVolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ontapVolumeArgs)(nil)).Elem()
}

type OntapVolumeInput interface {
	pulumi.Input

	ToOntapVolumeOutput() OntapVolumeOutput
	ToOntapVolumeOutputWithContext(ctx context.Context) OntapVolumeOutput
}

func (*OntapVolume) ElementType() reflect.Type {
	return reflect.TypeOf((**OntapVolume)(nil)).Elem()
}

func (i *OntapVolume) ToOntapVolumeOutput() OntapVolumeOutput {
	return i.ToOntapVolumeOutputWithContext(context.Background())
}

func (i *OntapVolume) ToOntapVolumeOutputWithContext(ctx context.Context) OntapVolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OntapVolumeOutput)
}

// OntapVolumeArrayInput is an input type that accepts OntapVolumeArray and OntapVolumeArrayOutput values.
// You can construct a concrete instance of `OntapVolumeArrayInput` via:
//
//	OntapVolumeArray{ OntapVolumeArgs{...} }
type OntapVolumeArrayInput interface {
	pulumi.Input

	ToOntapVolumeArrayOutput() OntapVolumeArrayOutput
	ToOntapVolumeArrayOutputWithContext(context.Context) OntapVolumeArrayOutput
}

type OntapVolumeArray []OntapVolumeInput

func (OntapVolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OntapVolume)(nil)).Elem()
}

func (i OntapVolumeArray) ToOntapVolumeArrayOutput() OntapVolumeArrayOutput {
	return i.ToOntapVolumeArrayOutputWithContext(context.Background())
}

func (i OntapVolumeArray) ToOntapVolumeArrayOutputWithContext(ctx context.Context) OntapVolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OntapVolumeArrayOutput)
}

// OntapVolumeMapInput is an input type that accepts OntapVolumeMap and OntapVolumeMapOutput values.
// You can construct a concrete instance of `OntapVolumeMapInput` via:
//
//	OntapVolumeMap{ "key": OntapVolumeArgs{...} }
type OntapVolumeMapInput interface {
	pulumi.Input

	ToOntapVolumeMapOutput() OntapVolumeMapOutput
	ToOntapVolumeMapOutputWithContext(context.Context) OntapVolumeMapOutput
}

type OntapVolumeMap map[string]OntapVolumeInput

func (OntapVolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OntapVolume)(nil)).Elem()
}

func (i OntapVolumeMap) ToOntapVolumeMapOutput() OntapVolumeMapOutput {
	return i.ToOntapVolumeMapOutputWithContext(context.Background())
}

func (i OntapVolumeMap) ToOntapVolumeMapOutputWithContext(ctx context.Context) OntapVolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OntapVolumeMapOutput)
}

type OntapVolumeOutput struct{ *pulumi.OutputState }

func (OntapVolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OntapVolume)(nil)).Elem()
}

func (o OntapVolumeOutput) ToOntapVolumeOutput() OntapVolumeOutput {
	return o
}

func (o OntapVolumeOutput) ToOntapVolumeOutputWithContext(ctx context.Context) OntapVolumeOutput {
	return o
}

// Amazon Resource Name of the volune.
func (o OntapVolumeOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
func (o OntapVolumeOutput) BypassSnaplockEnterpriseRetention() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.BoolPtrOutput { return v.BypassSnaplockEnterpriseRetention }).(pulumi.BoolPtrOutput)
}

// A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
func (o OntapVolumeOutput) CopyTagsToBackups() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.BoolPtrOutput { return v.CopyTagsToBackups }).(pulumi.BoolPtrOutput)
}

// Describes the file system for the volume, e.g. `fs-12345679`
func (o OntapVolumeOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
func (o OntapVolumeOutput) FlexcacheEndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.FlexcacheEndpointType }).(pulumi.StringOutput)
}

// Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
func (o OntapVolumeOutput) JunctionPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringPtrOutput { return v.JunctionPath }).(pulumi.StringPtrOutput)
}

// The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
func (o OntapVolumeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
func (o OntapVolumeOutput) OntapVolumeType() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.OntapVolumeType }).(pulumi.StringOutput)
}

// Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
func (o OntapVolumeOutput) SecurityStyle() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.SecurityStyle }).(pulumi.StringOutput)
}

// Specifies the size of the volume, in megabytes (MB), that you are creating.
func (o OntapVolumeOutput) SizeInMegabytes() pulumi.IntOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.IntOutput { return v.SizeInMegabytes }).(pulumi.IntOutput)
}

// When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
func (o OntapVolumeOutput) SkipFinalBackup() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.BoolPtrOutput { return v.SkipFinalBackup }).(pulumi.BoolPtrOutput)
}

// The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
func (o OntapVolumeOutput) SnaplockConfiguration() OntapVolumeSnaplockConfigurationPtrOutput {
	return o.ApplyT(func(v *OntapVolume) OntapVolumeSnaplockConfigurationPtrOutput { return v.SnaplockConfiguration }).(OntapVolumeSnaplockConfigurationPtrOutput)
}

// Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
func (o OntapVolumeOutput) SnapshotPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.SnapshotPolicy }).(pulumi.StringOutput)
}

// Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
func (o OntapVolumeOutput) StorageEfficiencyEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.BoolPtrOutput { return v.StorageEfficiencyEnabled }).(pulumi.BoolPtrOutput)
}

// Specifies the storage virtual machine in which to create the volume.
func (o OntapVolumeOutput) StorageVirtualMachineId() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.StorageVirtualMachineId }).(pulumi.StringOutput)
}

// A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o OntapVolumeOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o OntapVolumeOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
func (o OntapVolumeOutput) TieringPolicy() OntapVolumeTieringPolicyPtrOutput {
	return o.ApplyT(func(v *OntapVolume) OntapVolumeTieringPolicyPtrOutput { return v.TieringPolicy }).(OntapVolumeTieringPolicyPtrOutput)
}

// The Volume's UUID (universally unique identifier).
func (o OntapVolumeOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

// The type of volume, currently the only valid value is `ONTAP`.
func (o OntapVolumeOutput) VolumeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OntapVolume) pulumi.StringPtrOutput { return v.VolumeType }).(pulumi.StringPtrOutput)
}

type OntapVolumeArrayOutput struct{ *pulumi.OutputState }

func (OntapVolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OntapVolume)(nil)).Elem()
}

func (o OntapVolumeArrayOutput) ToOntapVolumeArrayOutput() OntapVolumeArrayOutput {
	return o
}

func (o OntapVolumeArrayOutput) ToOntapVolumeArrayOutputWithContext(ctx context.Context) OntapVolumeArrayOutput {
	return o
}

func (o OntapVolumeArrayOutput) Index(i pulumi.IntInput) OntapVolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OntapVolume {
		return vs[0].([]*OntapVolume)[vs[1].(int)]
	}).(OntapVolumeOutput)
}

type OntapVolumeMapOutput struct{ *pulumi.OutputState }

func (OntapVolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OntapVolume)(nil)).Elem()
}

func (o OntapVolumeMapOutput) ToOntapVolumeMapOutput() OntapVolumeMapOutput {
	return o
}

func (o OntapVolumeMapOutput) ToOntapVolumeMapOutputWithContext(ctx context.Context) OntapVolumeMapOutput {
	return o
}

func (o OntapVolumeMapOutput) MapIndex(k pulumi.StringInput) OntapVolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OntapVolume {
		return vs[0].(map[string]*OntapVolume)[vs[1].(string)]
	}).(OntapVolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OntapVolumeInput)(nil)).Elem(), &OntapVolume{})
	pulumi.RegisterInputType(reflect.TypeOf((*OntapVolumeArrayInput)(nil)).Elem(), OntapVolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OntapVolumeMapInput)(nil)).Elem(), OntapVolumeMap{})
	pulumi.RegisterOutputType(OntapVolumeOutput{})
	pulumi.RegisterOutputType(OntapVolumeArrayOutput{})
	pulumi.RegisterOutputType(OntapVolumeMapOutput{})
}
