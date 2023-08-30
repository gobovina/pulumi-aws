// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a single EBS volume.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ebs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ebs.NewVolume(ctx, "example", &ebs.VolumeArgs{
//				AvailabilityZone: pulumi.String("us-west-2a"),
//				Size:             pulumi.Int(40),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("HelloWorld"),
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
//
// > **NOTE:** At least one of `size` or `snapshotId` is required when specifying an EBS volume
//
// ## Import
//
// Using `pulumi import`, import EBS Volumes using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ebs/volume:Volume id vol-049df61146c4d7901
//
// ```
type Volume struct {
	pulumi.CustomResourceState

	// The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The AZ where the EBS volume will exist.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// If true, the disk will be encrypted.
	Encrypted pulumi.BoolOutput `pulumi:"encrypted"`
	// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
	FinalSnapshot pulumi.BoolPtrOutput `pulumi:"finalSnapshot"`
	// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
	Iops pulumi.IntOutput `pulumi:"iops"`
	// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
	MultiAttachEnabled pulumi.BoolPtrOutput `pulumi:"multiAttachEnabled"`
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn pulumi.StringPtrOutput `pulumi:"outpostArn"`
	// The size of the drive in GiBs.
	Size pulumi.IntOutput `pulumi:"size"`
	// A snapshot to base the EBS volume off of.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
	//
	// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
	Throughput pulumi.IntOutput `pulumi:"throughput"`
	// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOption) (*Volume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AvailabilityZone == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Volume
	err := ctx.RegisterResource("aws:ebs/volume:Volume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeState, opts ...pulumi.ResourceOption) (*Volume, error) {
	var resource Volume
	err := ctx.ReadResource("aws:ebs/volume:Volume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Volume resources.
type volumeState struct {
	// The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
	Arn *string `pulumi:"arn"`
	// The AZ where the EBS volume will exist.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// If true, the disk will be encrypted.
	Encrypted *bool `pulumi:"encrypted"`
	// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
	FinalSnapshot *bool `pulumi:"finalSnapshot"`
	// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
	Iops *int `pulumi:"iops"`
	// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
	MultiAttachEnabled *bool `pulumi:"multiAttachEnabled"`
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn *string `pulumi:"outpostArn"`
	// The size of the drive in GiBs.
	Size *int `pulumi:"size"`
	// A snapshot to base the EBS volume off of.
	SnapshotId *string `pulumi:"snapshotId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
	//
	// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
	Throughput *int `pulumi:"throughput"`
	// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
	Type *string `pulumi:"type"`
}

type VolumeState struct {
	// The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
	Arn pulumi.StringPtrInput
	// The AZ where the EBS volume will exist.
	AvailabilityZone pulumi.StringPtrInput
	// If true, the disk will be encrypted.
	Encrypted pulumi.BoolPtrInput
	// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
	FinalSnapshot pulumi.BoolPtrInput
	// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
	Iops pulumi.IntPtrInput
	// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
	KmsKeyId pulumi.StringPtrInput
	// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
	MultiAttachEnabled pulumi.BoolPtrInput
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn pulumi.StringPtrInput
	// The size of the drive in GiBs.
	Size pulumi.IntPtrInput
	// A snapshot to base the EBS volume off of.
	SnapshotId pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
	//
	// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
	Throughput pulumi.IntPtrInput
	// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
	Type pulumi.StringPtrInput
}

func (VolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeState)(nil)).Elem()
}

type volumeArgs struct {
	// The AZ where the EBS volume will exist.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// If true, the disk will be encrypted.
	Encrypted *bool `pulumi:"encrypted"`
	// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
	FinalSnapshot *bool `pulumi:"finalSnapshot"`
	// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
	Iops *int `pulumi:"iops"`
	// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
	MultiAttachEnabled *bool `pulumi:"multiAttachEnabled"`
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn *string `pulumi:"outpostArn"`
	// The size of the drive in GiBs.
	Size *int `pulumi:"size"`
	// A snapshot to base the EBS volume off of.
	SnapshotId *string `pulumi:"snapshotId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
	//
	// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
	Throughput *int `pulumi:"throughput"`
	// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// The AZ where the EBS volume will exist.
	AvailabilityZone pulumi.StringInput
	// If true, the disk will be encrypted.
	Encrypted pulumi.BoolPtrInput
	// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
	FinalSnapshot pulumi.BoolPtrInput
	// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
	Iops pulumi.IntPtrInput
	// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
	KmsKeyId pulumi.StringPtrInput
	// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
	MultiAttachEnabled pulumi.BoolPtrInput
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn pulumi.StringPtrInput
	// The size of the drive in GiBs.
	Size pulumi.IntPtrInput
	// A snapshot to base the EBS volume off of.
	SnapshotId pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
	//
	// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
	Throughput pulumi.IntPtrInput
	// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
	Type pulumi.StringPtrInput
}

func (VolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeArgs)(nil)).Elem()
}

type VolumeInput interface {
	pulumi.Input

	ToVolumeOutput() VolumeOutput
	ToVolumeOutputWithContext(ctx context.Context) VolumeOutput
}

func (*Volume) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (i *Volume) ToVolumeOutput() VolumeOutput {
	return i.ToVolumeOutputWithContext(context.Background())
}

func (i *Volume) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeOutput)
}

// VolumeArrayInput is an input type that accepts VolumeArray and VolumeArrayOutput values.
// You can construct a concrete instance of `VolumeArrayInput` via:
//
//	VolumeArray{ VolumeArgs{...} }
type VolumeArrayInput interface {
	pulumi.Input

	ToVolumeArrayOutput() VolumeArrayOutput
	ToVolumeArrayOutputWithContext(context.Context) VolumeArrayOutput
}

type VolumeArray []VolumeInput

func (VolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (i VolumeArray) ToVolumeArrayOutput() VolumeArrayOutput {
	return i.ToVolumeArrayOutputWithContext(context.Background())
}

func (i VolumeArray) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeArrayOutput)
}

// VolumeMapInput is an input type that accepts VolumeMap and VolumeMapOutput values.
// You can construct a concrete instance of `VolumeMapInput` via:
//
//	VolumeMap{ "key": VolumeArgs{...} }
type VolumeMapInput interface {
	pulumi.Input

	ToVolumeMapOutput() VolumeMapOutput
	ToVolumeMapOutputWithContext(context.Context) VolumeMapOutput
}

type VolumeMap map[string]VolumeInput

func (VolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (i VolumeMap) ToVolumeMapOutput() VolumeMapOutput {
	return i.ToVolumeMapOutputWithContext(context.Background())
}

func (i VolumeMap) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeMapOutput)
}

type VolumeOutput struct{ *pulumi.OutputState }

func (VolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (o VolumeOutput) ToVolumeOutput() VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return o
}

// The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
func (o VolumeOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The AZ where the EBS volume will exist.
func (o VolumeOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// If true, the disk will be encrypted.
func (o VolumeOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v *Volume) pulumi.BoolOutput { return v.Encrypted }).(pulumi.BoolOutput)
}

// If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
func (o VolumeOutput) FinalSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.BoolPtrOutput { return v.FinalSnapshot }).(pulumi.BoolPtrOutput)
}

// The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
func (o VolumeOutput) Iops() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.Iops }).(pulumi.IntOutput)
}

// The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
func (o VolumeOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
func (o VolumeOutput) MultiAttachEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.BoolPtrOutput { return v.MultiAttachEnabled }).(pulumi.BoolPtrOutput)
}

// The Amazon Resource Name (ARN) of the Outpost.
func (o VolumeOutput) OutpostArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.OutpostArn }).(pulumi.StringPtrOutput)
}

// The size of the drive in GiBs.
func (o VolumeOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// A snapshot to base the EBS volume off of.
func (o VolumeOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.SnapshotId }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o VolumeOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o VolumeOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
//
// > **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
func (o VolumeOutput) Throughput() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.Throughput }).(pulumi.IntOutput)
}

// The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
func (o VolumeOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type VolumeArrayOutput struct{ *pulumi.OutputState }

func (VolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (o VolumeArrayOutput) ToVolumeArrayOutput() VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) Index(i pulumi.IntInput) VolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].([]*Volume)[vs[1].(int)]
	}).(VolumeOutput)
}

type VolumeMapOutput struct{ *pulumi.OutputState }

func (VolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (o VolumeMapOutput) ToVolumeMapOutput() VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) MapIndex(k pulumi.StringInput) VolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].(map[string]*Volume)[vs[1].(string)]
	}).(VolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeInput)(nil)).Elem(), &Volume{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeArrayInput)(nil)).Elem(), VolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeMapInput)(nil)).Elem(), VolumeMap{})
	pulumi.RegisterOutputType(VolumeOutput{})
	pulumi.RegisterOutputType(VolumeArrayOutput{})
	pulumi.RegisterOutputType(VolumeMapOutput{})
}
