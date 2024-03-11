// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about an EBS Snapshot for use when provisioning EBS Volumes
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := ebs.LookupSnapshot(ctx, &ebs.LookupSnapshotArgs{
//				MostRecent: pulumi.BoolRef(true),
//				Owners: []string{
//					"self",
//				},
//				Filters: []ebs.GetSnapshotFilter{
//					{
//						Name: "volume-size",
//						Values: []string{
//							"40",
//						},
//					},
//					{
//						Name: "tag:Name",
//						Values: []string{
//							"Example",
//						},
//					},
//				},
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
func LookupSnapshot(ctx *pulumi.Context, args *LookupSnapshotArgs, opts ...pulumi.InvokeOption) (*LookupSnapshotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSnapshotResult
	err := ctx.Invoke("aws:ebs/getSnapshot:getSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshot.
type LookupSnapshotArgs struct {
	// One or more name/value pairs to filter off of. There are
	// several valid keys, for a full reference, check out
	// [describe-snapshots in the AWS CLI reference][1].
	Filters []GetSnapshotFilter `pulumi:"filters"`
	// If more than one result is returned, use the most recent snapshot.
	MostRecent *bool `pulumi:"mostRecent"`
	// Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
	Owners []string `pulumi:"owners"`
	// One or more AWS accounts IDs that can create volumes from the snapshot.
	RestorableByUserIds []string `pulumi:"restorableByUserIds"`
	// Returns information on a specific snapshot_id.
	SnapshotIds []string `pulumi:"snapshotIds"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getSnapshot.
type LookupSnapshotResult struct {
	// ARN of the EBS Snapshot.
	Arn string `pulumi:"arn"`
	// The data encryption key identifier for the snapshot.
	DataEncryptionKeyId string `pulumi:"dataEncryptionKeyId"`
	// Description for the snapshot
	Description string `pulumi:"description"`
	// Whether the snapshot is encrypted.
	Encrypted bool                `pulumi:"encrypted"`
	Filters   []GetSnapshotFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ARN for the KMS encryption key.
	KmsKeyId   string `pulumi:"kmsKeyId"`
	MostRecent *bool  `pulumi:"mostRecent"`
	// ARN of the Outpost on which the snapshot is stored.
	OutpostArn string `pulumi:"outpostArn"`
	// Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
	OwnerAlias string `pulumi:"ownerAlias"`
	// AWS account ID of the EBS snapshot owner.
	OwnerId             string   `pulumi:"ownerId"`
	Owners              []string `pulumi:"owners"`
	RestorableByUserIds []string `pulumi:"restorableByUserIds"`
	// Snapshot ID (e.g., snap-59fcb34e).
	SnapshotId  string   `pulumi:"snapshotId"`
	SnapshotIds []string `pulumi:"snapshotIds"`
	// Snapshot state.
	State string `pulumi:"state"`
	// Storage tier in which the snapshot is stored.
	StorageTier string `pulumi:"storageTier"`
	// Map of tags for the resource.
	Tags map[string]string `pulumi:"tags"`
	// Volume ID (e.g., vol-59fcb34e).
	VolumeId string `pulumi:"volumeId"`
	// Size of the drive in GiBs.
	VolumeSize int `pulumi:"volumeSize"`
}

func LookupSnapshotOutput(ctx *pulumi.Context, args LookupSnapshotOutputArgs, opts ...pulumi.InvokeOption) LookupSnapshotResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSnapshotResult, error) {
			args := v.(LookupSnapshotArgs)
			r, err := LookupSnapshot(ctx, &args, opts...)
			var s LookupSnapshotResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSnapshotResultOutput)
}

// A collection of arguments for invoking getSnapshot.
type LookupSnapshotOutputArgs struct {
	// One or more name/value pairs to filter off of. There are
	// several valid keys, for a full reference, check out
	// [describe-snapshots in the AWS CLI reference][1].
	Filters GetSnapshotFilterArrayInput `pulumi:"filters"`
	// If more than one result is returned, use the most recent snapshot.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
	Owners pulumi.StringArrayInput `pulumi:"owners"`
	// One or more AWS accounts IDs that can create volumes from the snapshot.
	RestorableByUserIds pulumi.StringArrayInput `pulumi:"restorableByUserIds"`
	// Returns information on a specific snapshot_id.
	SnapshotIds pulumi.StringArrayInput `pulumi:"snapshotIds"`
	// Map of tags for the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshot.
type LookupSnapshotResultOutput struct{ *pulumi.OutputState }

func (LookupSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotResult)(nil)).Elem()
}

func (o LookupSnapshotResultOutput) ToLookupSnapshotResultOutput() LookupSnapshotResultOutput {
	return o
}

func (o LookupSnapshotResultOutput) ToLookupSnapshotResultOutputWithContext(ctx context.Context) LookupSnapshotResultOutput {
	return o
}

// ARN of the EBS Snapshot.
func (o LookupSnapshotResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The data encryption key identifier for the snapshot.
func (o LookupSnapshotResultOutput) DataEncryptionKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.DataEncryptionKeyId }).(pulumi.StringOutput)
}

// Description for the snapshot
func (o LookupSnapshotResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.Description }).(pulumi.StringOutput)
}

// Whether the snapshot is encrypted.
func (o LookupSnapshotResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSnapshotResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

func (o LookupSnapshotResultOutput) Filters() GetSnapshotFilterArrayOutput {
	return o.ApplyT(func(v LookupSnapshotResult) []GetSnapshotFilter { return v.Filters }).(GetSnapshotFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

// ARN for the KMS encryption key.
func (o LookupSnapshotResultOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

func (o LookupSnapshotResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupSnapshotResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// ARN of the Outpost on which the snapshot is stored.
func (o LookupSnapshotResultOutput) OutpostArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.OutpostArn }).(pulumi.StringOutput)
}

// Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
func (o LookupSnapshotResultOutput) OwnerAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.OwnerAlias }).(pulumi.StringOutput)
}

// AWS account ID of the EBS snapshot owner.
func (o LookupSnapshotResultOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.OwnerId }).(pulumi.StringOutput)
}

func (o LookupSnapshotResultOutput) Owners() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSnapshotResult) []string { return v.Owners }).(pulumi.StringArrayOutput)
}

func (o LookupSnapshotResultOutput) RestorableByUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSnapshotResult) []string { return v.RestorableByUserIds }).(pulumi.StringArrayOutput)
}

// Snapshot ID (e.g., snap-59fcb34e).
func (o LookupSnapshotResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

func (o LookupSnapshotResultOutput) SnapshotIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSnapshotResult) []string { return v.SnapshotIds }).(pulumi.StringArrayOutput)
}

// Snapshot state.
func (o LookupSnapshotResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.State }).(pulumi.StringOutput)
}

// Storage tier in which the snapshot is stored.
func (o LookupSnapshotResultOutput) StorageTier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.StorageTier }).(pulumi.StringOutput)
}

// Map of tags for the resource.
func (o LookupSnapshotResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSnapshotResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Volume ID (e.g., vol-59fcb34e).
func (o LookupSnapshotResultOutput) VolumeId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotResult) string { return v.VolumeId }).(pulumi.StringOutput)
}

// Size of the drive in GiBs.
func (o LookupSnapshotResultOutput) VolumeSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSnapshotResult) int { return v.VolumeSize }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSnapshotResultOutput{})
}
