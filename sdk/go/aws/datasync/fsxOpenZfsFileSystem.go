// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datasync

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an AWS DataSync FSx OpenZfs Location.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/datasync"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datasync.NewFsxOpenZfsFileSystem(ctx, "example", &datasync.FsxOpenZfsFileSystemArgs{
//				FsxFilesystemArn: pulumi.Any(aws_fsx_openzfs_file_system.Example.Arn),
//				SecurityGroupArns: pulumi.StringArray{
//					aws_security_group.Example.Arn,
//				},
//				Protocol: &datasync.FsxOpenZfsFileSystemProtocolArgs{
//					Nfs: &datasync.FsxOpenZfsFileSystemProtocolNfsArgs{
//						MountOptions: &datasync.FsxOpenZfsFileSystemProtocolNfsMountOptionsArgs{
//							Version: pulumi.String("AUTOMATIC"),
//						},
//					},
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
// ## Import
//
// `aws_datasync_location_fsx_openzfs_file_system` can be imported by using the `DataSync-ARN#FSx-openzfs-ARN`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:123456789012:file-system/fs-08e04cd442c1bb94a
//
// ```
type FsxOpenZfsFileSystem struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The time that the FSx for openzfs location was created.
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
	FsxFilesystemArn pulumi.StringOutput `pulumi:"fsxFilesystemArn"`
	// The type of protocol that DataSync uses to access your file system. See below.
	Protocol FsxOpenZfsFileSystemProtocolOutput `pulumi:"protocol"`
	// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
	SecurityGroupArns pulumi.StringArrayOutput `pulumi:"securityGroupArns"`
	// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
	Subdirectory pulumi.StringOutput `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The URL of the FSx for openzfs location that was described.
	Uri pulumi.StringOutput `pulumi:"uri"`
}

// NewFsxOpenZfsFileSystem registers a new resource with the given unique name, arguments, and options.
func NewFsxOpenZfsFileSystem(ctx *pulumi.Context,
	name string, args *FsxOpenZfsFileSystemArgs, opts ...pulumi.ResourceOption) (*FsxOpenZfsFileSystem, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FsxFilesystemArn == nil {
		return nil, errors.New("invalid value for required argument 'FsxFilesystemArn'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	if args.SecurityGroupArns == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupArns'")
	}
	var resource FsxOpenZfsFileSystem
	err := ctx.RegisterResource("aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFsxOpenZfsFileSystem gets an existing FsxOpenZfsFileSystem resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFsxOpenZfsFileSystem(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FsxOpenZfsFileSystemState, opts ...pulumi.ResourceOption) (*FsxOpenZfsFileSystem, error) {
	var resource FsxOpenZfsFileSystem
	err := ctx.ReadResource("aws:datasync/fsxOpenZfsFileSystem:FsxOpenZfsFileSystem", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FsxOpenZfsFileSystem resources.
type fsxOpenZfsFileSystemState struct {
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn *string `pulumi:"arn"`
	// The time that the FSx for openzfs location was created.
	CreationTime *string `pulumi:"creationTime"`
	// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
	FsxFilesystemArn *string `pulumi:"fsxFilesystemArn"`
	// The type of protocol that DataSync uses to access your file system. See below.
	Protocol *FsxOpenZfsFileSystemProtocol `pulumi:"protocol"`
	// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
	SecurityGroupArns []string `pulumi:"securityGroupArns"`
	// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
	Subdirectory *string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The URL of the FSx for openzfs location that was described.
	Uri *string `pulumi:"uri"`
}

type FsxOpenZfsFileSystemState struct {
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringPtrInput
	// The time that the FSx for openzfs location was created.
	CreationTime pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
	FsxFilesystemArn pulumi.StringPtrInput
	// The type of protocol that DataSync uses to access your file system. See below.
	Protocol FsxOpenZfsFileSystemProtocolPtrInput
	// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
	SecurityGroupArns pulumi.StringArrayInput
	// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
	Subdirectory pulumi.StringPtrInput
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The URL of the FSx for openzfs location that was described.
	Uri pulumi.StringPtrInput
}

func (FsxOpenZfsFileSystemState) ElementType() reflect.Type {
	return reflect.TypeOf((*fsxOpenZfsFileSystemState)(nil)).Elem()
}

type fsxOpenZfsFileSystemArgs struct {
	// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
	FsxFilesystemArn string `pulumi:"fsxFilesystemArn"`
	// The type of protocol that DataSync uses to access your file system. See below.
	Protocol FsxOpenZfsFileSystemProtocol `pulumi:"protocol"`
	// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
	SecurityGroupArns []string `pulumi:"securityGroupArns"`
	// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
	Subdirectory *string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a FsxOpenZfsFileSystem resource.
type FsxOpenZfsFileSystemArgs struct {
	// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
	FsxFilesystemArn pulumi.StringInput
	// The type of protocol that DataSync uses to access your file system. See below.
	Protocol FsxOpenZfsFileSystemProtocolInput
	// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
	SecurityGroupArns pulumi.StringArrayInput
	// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
	Subdirectory pulumi.StringPtrInput
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (FsxOpenZfsFileSystemArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fsxOpenZfsFileSystemArgs)(nil)).Elem()
}

type FsxOpenZfsFileSystemInput interface {
	pulumi.Input

	ToFsxOpenZfsFileSystemOutput() FsxOpenZfsFileSystemOutput
	ToFsxOpenZfsFileSystemOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemOutput
}

func (*FsxOpenZfsFileSystem) ElementType() reflect.Type {
	return reflect.TypeOf((**FsxOpenZfsFileSystem)(nil)).Elem()
}

func (i *FsxOpenZfsFileSystem) ToFsxOpenZfsFileSystemOutput() FsxOpenZfsFileSystemOutput {
	return i.ToFsxOpenZfsFileSystemOutputWithContext(context.Background())
}

func (i *FsxOpenZfsFileSystem) ToFsxOpenZfsFileSystemOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FsxOpenZfsFileSystemOutput)
}

// FsxOpenZfsFileSystemArrayInput is an input type that accepts FsxOpenZfsFileSystemArray and FsxOpenZfsFileSystemArrayOutput values.
// You can construct a concrete instance of `FsxOpenZfsFileSystemArrayInput` via:
//
//	FsxOpenZfsFileSystemArray{ FsxOpenZfsFileSystemArgs{...} }
type FsxOpenZfsFileSystemArrayInput interface {
	pulumi.Input

	ToFsxOpenZfsFileSystemArrayOutput() FsxOpenZfsFileSystemArrayOutput
	ToFsxOpenZfsFileSystemArrayOutputWithContext(context.Context) FsxOpenZfsFileSystemArrayOutput
}

type FsxOpenZfsFileSystemArray []FsxOpenZfsFileSystemInput

func (FsxOpenZfsFileSystemArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FsxOpenZfsFileSystem)(nil)).Elem()
}

func (i FsxOpenZfsFileSystemArray) ToFsxOpenZfsFileSystemArrayOutput() FsxOpenZfsFileSystemArrayOutput {
	return i.ToFsxOpenZfsFileSystemArrayOutputWithContext(context.Background())
}

func (i FsxOpenZfsFileSystemArray) ToFsxOpenZfsFileSystemArrayOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FsxOpenZfsFileSystemArrayOutput)
}

// FsxOpenZfsFileSystemMapInput is an input type that accepts FsxOpenZfsFileSystemMap and FsxOpenZfsFileSystemMapOutput values.
// You can construct a concrete instance of `FsxOpenZfsFileSystemMapInput` via:
//
//	FsxOpenZfsFileSystemMap{ "key": FsxOpenZfsFileSystemArgs{...} }
type FsxOpenZfsFileSystemMapInput interface {
	pulumi.Input

	ToFsxOpenZfsFileSystemMapOutput() FsxOpenZfsFileSystemMapOutput
	ToFsxOpenZfsFileSystemMapOutputWithContext(context.Context) FsxOpenZfsFileSystemMapOutput
}

type FsxOpenZfsFileSystemMap map[string]FsxOpenZfsFileSystemInput

func (FsxOpenZfsFileSystemMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FsxOpenZfsFileSystem)(nil)).Elem()
}

func (i FsxOpenZfsFileSystemMap) ToFsxOpenZfsFileSystemMapOutput() FsxOpenZfsFileSystemMapOutput {
	return i.ToFsxOpenZfsFileSystemMapOutputWithContext(context.Background())
}

func (i FsxOpenZfsFileSystemMap) ToFsxOpenZfsFileSystemMapOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FsxOpenZfsFileSystemMapOutput)
}

type FsxOpenZfsFileSystemOutput struct{ *pulumi.OutputState }

func (FsxOpenZfsFileSystemOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FsxOpenZfsFileSystem)(nil)).Elem()
}

func (o FsxOpenZfsFileSystemOutput) ToFsxOpenZfsFileSystemOutput() FsxOpenZfsFileSystemOutput {
	return o
}

func (o FsxOpenZfsFileSystemOutput) ToFsxOpenZfsFileSystemOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemOutput {
	return o
}

// Amazon Resource Name (ARN) of the DataSync Location.
func (o FsxOpenZfsFileSystemOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The time that the FSx for openzfs location was created.
func (o FsxOpenZfsFileSystemOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
func (o FsxOpenZfsFileSystemOutput) FsxFilesystemArn() pulumi.StringOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringOutput { return v.FsxFilesystemArn }).(pulumi.StringOutput)
}

// The type of protocol that DataSync uses to access your file system. See below.
func (o FsxOpenZfsFileSystemOutput) Protocol() FsxOpenZfsFileSystemProtocolOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) FsxOpenZfsFileSystemProtocolOutput { return v.Protocol }).(FsxOpenZfsFileSystemProtocolOutput)
}

// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
func (o FsxOpenZfsFileSystemOutput) SecurityGroupArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringArrayOutput { return v.SecurityGroupArns }).(pulumi.StringArrayOutput)
}

// Subdirectory to perform actions as source or destination. Must start with `/fsx`.
func (o FsxOpenZfsFileSystemOutput) Subdirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringOutput { return v.Subdirectory }).(pulumi.StringOutput)
}

// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o FsxOpenZfsFileSystemOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o FsxOpenZfsFileSystemOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The URL of the FSx for openzfs location that was described.
func (o FsxOpenZfsFileSystemOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *FsxOpenZfsFileSystem) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

type FsxOpenZfsFileSystemArrayOutput struct{ *pulumi.OutputState }

func (FsxOpenZfsFileSystemArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FsxOpenZfsFileSystem)(nil)).Elem()
}

func (o FsxOpenZfsFileSystemArrayOutput) ToFsxOpenZfsFileSystemArrayOutput() FsxOpenZfsFileSystemArrayOutput {
	return o
}

func (o FsxOpenZfsFileSystemArrayOutput) ToFsxOpenZfsFileSystemArrayOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemArrayOutput {
	return o
}

func (o FsxOpenZfsFileSystemArrayOutput) Index(i pulumi.IntInput) FsxOpenZfsFileSystemOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FsxOpenZfsFileSystem {
		return vs[0].([]*FsxOpenZfsFileSystem)[vs[1].(int)]
	}).(FsxOpenZfsFileSystemOutput)
}

type FsxOpenZfsFileSystemMapOutput struct{ *pulumi.OutputState }

func (FsxOpenZfsFileSystemMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FsxOpenZfsFileSystem)(nil)).Elem()
}

func (o FsxOpenZfsFileSystemMapOutput) ToFsxOpenZfsFileSystemMapOutput() FsxOpenZfsFileSystemMapOutput {
	return o
}

func (o FsxOpenZfsFileSystemMapOutput) ToFsxOpenZfsFileSystemMapOutputWithContext(ctx context.Context) FsxOpenZfsFileSystemMapOutput {
	return o
}

func (o FsxOpenZfsFileSystemMapOutput) MapIndex(k pulumi.StringInput) FsxOpenZfsFileSystemOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FsxOpenZfsFileSystem {
		return vs[0].(map[string]*FsxOpenZfsFileSystem)[vs[1].(string)]
	}).(FsxOpenZfsFileSystemOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FsxOpenZfsFileSystemInput)(nil)).Elem(), &FsxOpenZfsFileSystem{})
	pulumi.RegisterInputType(reflect.TypeOf((*FsxOpenZfsFileSystemArrayInput)(nil)).Elem(), FsxOpenZfsFileSystemArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FsxOpenZfsFileSystemMapInput)(nil)).Elem(), FsxOpenZfsFileSystemMap{})
	pulumi.RegisterOutputType(FsxOpenZfsFileSystemOutput{})
	pulumi.RegisterOutputType(FsxOpenZfsFileSystemArrayOutput{})
	pulumi.RegisterOutputType(FsxOpenZfsFileSystemMapOutput{})
}
