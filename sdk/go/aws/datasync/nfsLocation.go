// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datasync

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an NFS Location within AWS DataSync.
//
// > **NOTE:** The DataSync Agents must be available before creating this resource.
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
//			_, err := datasync.NewNfsLocation(ctx, "example", &datasync.NfsLocationArgs{
//				ServerHostname: pulumi.String("nfs.example.com"),
//				Subdirectory:   pulumi.String("/exported/path"),
//				OnPremConfig: &datasync.NfsLocationOnPremConfigArgs{
//					AgentArns: pulumi.StringArray{
//						aws_datasync_agent.Example.Arn,
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
// `aws_datasync_location_nfs` can be imported by using the DataSync Task Amazon Resource Name (ARN), e.g.,
//
// ```sh
//
//	$ pulumi import aws:datasync/nfsLocation:NfsLocation example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
//
// ```
type NfsLocation struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Configuration block containing mount options used by DataSync to access the NFS Server.
	MountOptions NfsLocationMountOptionsPtrOutput `pulumi:"mountOptions"`
	// Configuration block containing information for connecting to the NFS File System.
	OnPremConfig NfsLocationOnPremConfigOutput `pulumi:"onPremConfig"`
	// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
	ServerHostname pulumi.StringOutput `pulumi:"serverHostname"`
	// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
	Subdirectory pulumi.StringOutput `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	Uri     pulumi.StringOutput    `pulumi:"uri"`
}

// NewNfsLocation registers a new resource with the given unique name, arguments, and options.
func NewNfsLocation(ctx *pulumi.Context,
	name string, args *NfsLocationArgs, opts ...pulumi.ResourceOption) (*NfsLocation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OnPremConfig == nil {
		return nil, errors.New("invalid value for required argument 'OnPremConfig'")
	}
	if args.ServerHostname == nil {
		return nil, errors.New("invalid value for required argument 'ServerHostname'")
	}
	if args.Subdirectory == nil {
		return nil, errors.New("invalid value for required argument 'Subdirectory'")
	}
	var resource NfsLocation
	err := ctx.RegisterResource("aws:datasync/nfsLocation:NfsLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNfsLocation gets an existing NfsLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNfsLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NfsLocationState, opts ...pulumi.ResourceOption) (*NfsLocation, error) {
	var resource NfsLocation
	err := ctx.ReadResource("aws:datasync/nfsLocation:NfsLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NfsLocation resources.
type nfsLocationState struct {
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn *string `pulumi:"arn"`
	// Configuration block containing mount options used by DataSync to access the NFS Server.
	MountOptions *NfsLocationMountOptions `pulumi:"mountOptions"`
	// Configuration block containing information for connecting to the NFS File System.
	OnPremConfig *NfsLocationOnPremConfig `pulumi:"onPremConfig"`
	// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
	ServerHostname *string `pulumi:"serverHostname"`
	// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
	Subdirectory *string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	Uri     *string           `pulumi:"uri"`
}

type NfsLocationState struct {
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringPtrInput
	// Configuration block containing mount options used by DataSync to access the NFS Server.
	MountOptions NfsLocationMountOptionsPtrInput
	// Configuration block containing information for connecting to the NFS File System.
	OnPremConfig NfsLocationOnPremConfigPtrInput
	// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
	ServerHostname pulumi.StringPtrInput
	// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
	Subdirectory pulumi.StringPtrInput
	// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	Uri     pulumi.StringPtrInput
}

func (NfsLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*nfsLocationState)(nil)).Elem()
}

type nfsLocationArgs struct {
	// Configuration block containing mount options used by DataSync to access the NFS Server.
	MountOptions *NfsLocationMountOptions `pulumi:"mountOptions"`
	// Configuration block containing information for connecting to the NFS File System.
	OnPremConfig NfsLocationOnPremConfig `pulumi:"onPremConfig"`
	// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
	ServerHostname string `pulumi:"serverHostname"`
	// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
	Subdirectory string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a NfsLocation resource.
type NfsLocationArgs struct {
	// Configuration block containing mount options used by DataSync to access the NFS Server.
	MountOptions NfsLocationMountOptionsPtrInput
	// Configuration block containing information for connecting to the NFS File System.
	OnPremConfig NfsLocationOnPremConfigInput
	// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
	ServerHostname pulumi.StringInput
	// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
	Subdirectory pulumi.StringInput
	// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (NfsLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nfsLocationArgs)(nil)).Elem()
}

type NfsLocationInput interface {
	pulumi.Input

	ToNfsLocationOutput() NfsLocationOutput
	ToNfsLocationOutputWithContext(ctx context.Context) NfsLocationOutput
}

func (*NfsLocation) ElementType() reflect.Type {
	return reflect.TypeOf((**NfsLocation)(nil)).Elem()
}

func (i *NfsLocation) ToNfsLocationOutput() NfsLocationOutput {
	return i.ToNfsLocationOutputWithContext(context.Background())
}

func (i *NfsLocation) ToNfsLocationOutputWithContext(ctx context.Context) NfsLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NfsLocationOutput)
}

// NfsLocationArrayInput is an input type that accepts NfsLocationArray and NfsLocationArrayOutput values.
// You can construct a concrete instance of `NfsLocationArrayInput` via:
//
//	NfsLocationArray{ NfsLocationArgs{...} }
type NfsLocationArrayInput interface {
	pulumi.Input

	ToNfsLocationArrayOutput() NfsLocationArrayOutput
	ToNfsLocationArrayOutputWithContext(context.Context) NfsLocationArrayOutput
}

type NfsLocationArray []NfsLocationInput

func (NfsLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NfsLocation)(nil)).Elem()
}

func (i NfsLocationArray) ToNfsLocationArrayOutput() NfsLocationArrayOutput {
	return i.ToNfsLocationArrayOutputWithContext(context.Background())
}

func (i NfsLocationArray) ToNfsLocationArrayOutputWithContext(ctx context.Context) NfsLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NfsLocationArrayOutput)
}

// NfsLocationMapInput is an input type that accepts NfsLocationMap and NfsLocationMapOutput values.
// You can construct a concrete instance of `NfsLocationMapInput` via:
//
//	NfsLocationMap{ "key": NfsLocationArgs{...} }
type NfsLocationMapInput interface {
	pulumi.Input

	ToNfsLocationMapOutput() NfsLocationMapOutput
	ToNfsLocationMapOutputWithContext(context.Context) NfsLocationMapOutput
}

type NfsLocationMap map[string]NfsLocationInput

func (NfsLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NfsLocation)(nil)).Elem()
}

func (i NfsLocationMap) ToNfsLocationMapOutput() NfsLocationMapOutput {
	return i.ToNfsLocationMapOutputWithContext(context.Background())
}

func (i NfsLocationMap) ToNfsLocationMapOutputWithContext(ctx context.Context) NfsLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NfsLocationMapOutput)
}

type NfsLocationOutput struct{ *pulumi.OutputState }

func (NfsLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NfsLocation)(nil)).Elem()
}

func (o NfsLocationOutput) ToNfsLocationOutput() NfsLocationOutput {
	return o
}

func (o NfsLocationOutput) ToNfsLocationOutputWithContext(ctx context.Context) NfsLocationOutput {
	return o
}

// Amazon Resource Name (ARN) of the DataSync Location.
func (o NfsLocationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Configuration block containing mount options used by DataSync to access the NFS Server.
func (o NfsLocationOutput) MountOptions() NfsLocationMountOptionsPtrOutput {
	return o.ApplyT(func(v *NfsLocation) NfsLocationMountOptionsPtrOutput { return v.MountOptions }).(NfsLocationMountOptionsPtrOutput)
}

// Configuration block containing information for connecting to the NFS File System.
func (o NfsLocationOutput) OnPremConfig() NfsLocationOnPremConfigOutput {
	return o.ApplyT(func(v *NfsLocation) NfsLocationOnPremConfigOutput { return v.OnPremConfig }).(NfsLocationOnPremConfigOutput)
}

// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
func (o NfsLocationOutput) ServerHostname() pulumi.StringOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringOutput { return v.ServerHostname }).(pulumi.StringOutput)
}

// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
func (o NfsLocationOutput) Subdirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringOutput { return v.Subdirectory }).(pulumi.StringOutput)
}

// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o NfsLocationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o NfsLocationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o NfsLocationOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *NfsLocation) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

type NfsLocationArrayOutput struct{ *pulumi.OutputState }

func (NfsLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NfsLocation)(nil)).Elem()
}

func (o NfsLocationArrayOutput) ToNfsLocationArrayOutput() NfsLocationArrayOutput {
	return o
}

func (o NfsLocationArrayOutput) ToNfsLocationArrayOutputWithContext(ctx context.Context) NfsLocationArrayOutput {
	return o
}

func (o NfsLocationArrayOutput) Index(i pulumi.IntInput) NfsLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NfsLocation {
		return vs[0].([]*NfsLocation)[vs[1].(int)]
	}).(NfsLocationOutput)
}

type NfsLocationMapOutput struct{ *pulumi.OutputState }

func (NfsLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NfsLocation)(nil)).Elem()
}

func (o NfsLocationMapOutput) ToNfsLocationMapOutput() NfsLocationMapOutput {
	return o
}

func (o NfsLocationMapOutput) ToNfsLocationMapOutputWithContext(ctx context.Context) NfsLocationMapOutput {
	return o
}

func (o NfsLocationMapOutput) MapIndex(k pulumi.StringInput) NfsLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NfsLocation {
		return vs[0].(map[string]*NfsLocation)[vs[1].(string)]
	}).(NfsLocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NfsLocationInput)(nil)).Elem(), &NfsLocation{})
	pulumi.RegisterInputType(reflect.TypeOf((*NfsLocationArrayInput)(nil)).Elem(), NfsLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NfsLocationMapInput)(nil)).Elem(), NfsLocationMap{})
	pulumi.RegisterOutputType(NfsLocationOutput{})
	pulumi.RegisterOutputType(NfsLocationArrayOutput{})
	pulumi.RegisterOutputType(NfsLocationMapOutput{})
}
