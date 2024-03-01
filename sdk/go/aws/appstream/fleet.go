// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appstream

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppStream fleet.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appstream"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := appstream.NewFleet(ctx, "test_fleet", &appstream.FleetArgs{
//				Name: pulumi.String("test-fleet"),
//				ComputeCapacity: &appstream.FleetComputeCapacityArgs{
//					DesiredInstances: pulumi.Int(1),
//				},
//				Description:                    pulumi.String("test fleet"),
//				IdleDisconnectTimeoutInSeconds: pulumi.Int(60),
//				DisplayName:                    pulumi.String("test-fleet"),
//				EnableDefaultInternetAccess:    pulumi.Bool(false),
//				FleetType:                      pulumi.String("ON_DEMAND"),
//				ImageName:                      pulumi.String("Amazon-AppStream2-Sample-Image-03-11-2023"),
//				InstanceType:                   pulumi.String("stream.standard.large"),
//				MaxUserDurationInSeconds:       pulumi.Int(600),
//				VpcConfig: &appstream.FleetVpcConfigArgs{
//					SubnetIds: pulumi.StringArray{
//						pulumi.String("subnet-06e9b13400c225127"),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"TagName": pulumi.String("tag-value"),
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
// Using `pulumi import`, import `aws_appstream_fleet` using the id. For example:
//
// ```sh
//
//	$ pulumi import aws:appstream/fleet:Fleet example fleetNameExample
//
// ```
type Fleet struct {
	pulumi.CustomResourceState

	// ARN of the appstream fleet.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Configuration block for the desired capacity of the fleet. See below.
	ComputeCapacity FleetComputeCapacityOutput `pulumi:"computeCapacity"`
	// Date and time, in UTC and extended RFC 3339 format, when the fleet was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Description to display.
	Description pulumi.StringOutput `pulumi:"description"`
	// Amount of time that a streaming session remains active after users disconnect.
	DisconnectTimeoutInSeconds pulumi.IntOutput `pulumi:"disconnectTimeoutInSeconds"`
	// Human-readable friendly name for the AppStream fleet.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
	DomainJoinInfo FleetDomainJoinInfoOutput `pulumi:"domainJoinInfo"`
	// Enables or disables default internet access for the fleet.
	EnableDefaultInternetAccess pulumi.BoolOutput `pulumi:"enableDefaultInternetAccess"`
	// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
	FleetType pulumi.StringOutput `pulumi:"fleetType"`
	// ARN of the IAM role to apply to the fleet.
	IamRoleArn pulumi.StringOutput `pulumi:"iamRoleArn"`
	// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
	IdleDisconnectTimeoutInSeconds pulumi.IntPtrOutput `pulumi:"idleDisconnectTimeoutInSeconds"`
	// ARN of the public, private, or shared image to use.
	ImageArn pulumi.StringOutput `pulumi:"imageArn"`
	// Name of the image used to create the fleet.
	ImageName pulumi.StringOutput `pulumi:"imageName"`
	// Instance type to use when launching fleet instances.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Maximum amount of time that a streaming session can remain active, in seconds.
	MaxUserDurationInSeconds pulumi.IntOutput `pulumi:"maxUserDurationInSeconds"`
	// Unique name for the fleet.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// State of the fleet. Can be `STARTING`, `RUNNING`, `STOPPING` or `STOPPED`
	State pulumi.StringOutput `pulumi:"state"`
	// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
	StreamView pulumi.StringOutput `pulumi:"streamView"`
	// Map of tags to attach to AppStream instances.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration block for the VPC configuration for the image builder. See below.
	VpcConfig FleetVpcConfigOutput `pulumi:"vpcConfig"`
}

// NewFleet registers a new resource with the given unique name, arguments, and options.
func NewFleet(ctx *pulumi.Context,
	name string, args *FleetArgs, opts ...pulumi.ResourceOption) (*Fleet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ComputeCapacity == nil {
		return nil, errors.New("invalid value for required argument 'ComputeCapacity'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Fleet
	err := ctx.RegisterResource("aws:appstream/fleet:Fleet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFleet gets an existing Fleet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFleet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FleetState, opts ...pulumi.ResourceOption) (*Fleet, error) {
	var resource Fleet
	err := ctx.ReadResource("aws:appstream/fleet:Fleet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Fleet resources.
type fleetState struct {
	// ARN of the appstream fleet.
	Arn *string `pulumi:"arn"`
	// Configuration block for the desired capacity of the fleet. See below.
	ComputeCapacity *FleetComputeCapacity `pulumi:"computeCapacity"`
	// Date and time, in UTC and extended RFC 3339 format, when the fleet was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Description to display.
	Description *string `pulumi:"description"`
	// Amount of time that a streaming session remains active after users disconnect.
	DisconnectTimeoutInSeconds *int `pulumi:"disconnectTimeoutInSeconds"`
	// Human-readable friendly name for the AppStream fleet.
	DisplayName *string `pulumi:"displayName"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
	DomainJoinInfo *FleetDomainJoinInfo `pulumi:"domainJoinInfo"`
	// Enables or disables default internet access for the fleet.
	EnableDefaultInternetAccess *bool `pulumi:"enableDefaultInternetAccess"`
	// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
	FleetType *string `pulumi:"fleetType"`
	// ARN of the IAM role to apply to the fleet.
	IamRoleArn *string `pulumi:"iamRoleArn"`
	// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
	IdleDisconnectTimeoutInSeconds *int `pulumi:"idleDisconnectTimeoutInSeconds"`
	// ARN of the public, private, or shared image to use.
	ImageArn *string `pulumi:"imageArn"`
	// Name of the image used to create the fleet.
	ImageName *string `pulumi:"imageName"`
	// Instance type to use when launching fleet instances.
	InstanceType *string `pulumi:"instanceType"`
	// Maximum amount of time that a streaming session can remain active, in seconds.
	MaxUserDurationInSeconds *int `pulumi:"maxUserDurationInSeconds"`
	// Unique name for the fleet.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// State of the fleet. Can be `STARTING`, `RUNNING`, `STOPPING` or `STOPPED`
	State *string `pulumi:"state"`
	// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
	StreamView *string `pulumi:"streamView"`
	// Map of tags to attach to AppStream instances.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block for the VPC configuration for the image builder. See below.
	VpcConfig *FleetVpcConfig `pulumi:"vpcConfig"`
}

type FleetState struct {
	// ARN of the appstream fleet.
	Arn pulumi.StringPtrInput
	// Configuration block for the desired capacity of the fleet. See below.
	ComputeCapacity FleetComputeCapacityPtrInput
	// Date and time, in UTC and extended RFC 3339 format, when the fleet was created.
	CreatedTime pulumi.StringPtrInput
	// Description to display.
	Description pulumi.StringPtrInput
	// Amount of time that a streaming session remains active after users disconnect.
	DisconnectTimeoutInSeconds pulumi.IntPtrInput
	// Human-readable friendly name for the AppStream fleet.
	DisplayName pulumi.StringPtrInput
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
	DomainJoinInfo FleetDomainJoinInfoPtrInput
	// Enables or disables default internet access for the fleet.
	EnableDefaultInternetAccess pulumi.BoolPtrInput
	// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
	FleetType pulumi.StringPtrInput
	// ARN of the IAM role to apply to the fleet.
	IamRoleArn pulumi.StringPtrInput
	// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
	IdleDisconnectTimeoutInSeconds pulumi.IntPtrInput
	// ARN of the public, private, or shared image to use.
	ImageArn pulumi.StringPtrInput
	// Name of the image used to create the fleet.
	ImageName pulumi.StringPtrInput
	// Instance type to use when launching fleet instances.
	InstanceType pulumi.StringPtrInput
	// Maximum amount of time that a streaming session can remain active, in seconds.
	MaxUserDurationInSeconds pulumi.IntPtrInput
	// Unique name for the fleet.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// State of the fleet. Can be `STARTING`, `RUNNING`, `STOPPING` or `STOPPED`
	State pulumi.StringPtrInput
	// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
	StreamView pulumi.StringPtrInput
	// Map of tags to attach to AppStream instances.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Configuration block for the VPC configuration for the image builder. See below.
	VpcConfig FleetVpcConfigPtrInput
}

func (FleetState) ElementType() reflect.Type {
	return reflect.TypeOf((*fleetState)(nil)).Elem()
}

type fleetArgs struct {
	// Configuration block for the desired capacity of the fleet. See below.
	ComputeCapacity FleetComputeCapacity `pulumi:"computeCapacity"`
	// Description to display.
	Description *string `pulumi:"description"`
	// Amount of time that a streaming session remains active after users disconnect.
	DisconnectTimeoutInSeconds *int `pulumi:"disconnectTimeoutInSeconds"`
	// Human-readable friendly name for the AppStream fleet.
	DisplayName *string `pulumi:"displayName"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
	DomainJoinInfo *FleetDomainJoinInfo `pulumi:"domainJoinInfo"`
	// Enables or disables default internet access for the fleet.
	EnableDefaultInternetAccess *bool `pulumi:"enableDefaultInternetAccess"`
	// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
	FleetType *string `pulumi:"fleetType"`
	// ARN of the IAM role to apply to the fleet.
	IamRoleArn *string `pulumi:"iamRoleArn"`
	// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
	IdleDisconnectTimeoutInSeconds *int `pulumi:"idleDisconnectTimeoutInSeconds"`
	// ARN of the public, private, or shared image to use.
	ImageArn *string `pulumi:"imageArn"`
	// Name of the image used to create the fleet.
	ImageName *string `pulumi:"imageName"`
	// Instance type to use when launching fleet instances.
	InstanceType string `pulumi:"instanceType"`
	// Maximum amount of time that a streaming session can remain active, in seconds.
	MaxUserDurationInSeconds *int `pulumi:"maxUserDurationInSeconds"`
	// Unique name for the fleet.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
	StreamView *string `pulumi:"streamView"`
	// Map of tags to attach to AppStream instances.
	Tags map[string]string `pulumi:"tags"`
	// Configuration block for the VPC configuration for the image builder. See below.
	VpcConfig *FleetVpcConfig `pulumi:"vpcConfig"`
}

// The set of arguments for constructing a Fleet resource.
type FleetArgs struct {
	// Configuration block for the desired capacity of the fleet. See below.
	ComputeCapacity FleetComputeCapacityInput
	// Description to display.
	Description pulumi.StringPtrInput
	// Amount of time that a streaming session remains active after users disconnect.
	DisconnectTimeoutInSeconds pulumi.IntPtrInput
	// Human-readable friendly name for the AppStream fleet.
	DisplayName pulumi.StringPtrInput
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
	DomainJoinInfo FleetDomainJoinInfoPtrInput
	// Enables or disables default internet access for the fleet.
	EnableDefaultInternetAccess pulumi.BoolPtrInput
	// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
	FleetType pulumi.StringPtrInput
	// ARN of the IAM role to apply to the fleet.
	IamRoleArn pulumi.StringPtrInput
	// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
	IdleDisconnectTimeoutInSeconds pulumi.IntPtrInput
	// ARN of the public, private, or shared image to use.
	ImageArn pulumi.StringPtrInput
	// Name of the image used to create the fleet.
	ImageName pulumi.StringPtrInput
	// Instance type to use when launching fleet instances.
	InstanceType pulumi.StringInput
	// Maximum amount of time that a streaming session can remain active, in seconds.
	MaxUserDurationInSeconds pulumi.IntPtrInput
	// Unique name for the fleet.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
	StreamView pulumi.StringPtrInput
	// Map of tags to attach to AppStream instances.
	Tags pulumi.StringMapInput
	// Configuration block for the VPC configuration for the image builder. See below.
	VpcConfig FleetVpcConfigPtrInput
}

func (FleetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fleetArgs)(nil)).Elem()
}

type FleetInput interface {
	pulumi.Input

	ToFleetOutput() FleetOutput
	ToFleetOutputWithContext(ctx context.Context) FleetOutput
}

func (*Fleet) ElementType() reflect.Type {
	return reflect.TypeOf((**Fleet)(nil)).Elem()
}

func (i *Fleet) ToFleetOutput() FleetOutput {
	return i.ToFleetOutputWithContext(context.Background())
}

func (i *Fleet) ToFleetOutputWithContext(ctx context.Context) FleetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetOutput)
}

// FleetArrayInput is an input type that accepts FleetArray and FleetArrayOutput values.
// You can construct a concrete instance of `FleetArrayInput` via:
//
//	FleetArray{ FleetArgs{...} }
type FleetArrayInput interface {
	pulumi.Input

	ToFleetArrayOutput() FleetArrayOutput
	ToFleetArrayOutputWithContext(context.Context) FleetArrayOutput
}

type FleetArray []FleetInput

func (FleetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Fleet)(nil)).Elem()
}

func (i FleetArray) ToFleetArrayOutput() FleetArrayOutput {
	return i.ToFleetArrayOutputWithContext(context.Background())
}

func (i FleetArray) ToFleetArrayOutputWithContext(ctx context.Context) FleetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetArrayOutput)
}

// FleetMapInput is an input type that accepts FleetMap and FleetMapOutput values.
// You can construct a concrete instance of `FleetMapInput` via:
//
//	FleetMap{ "key": FleetArgs{...} }
type FleetMapInput interface {
	pulumi.Input

	ToFleetMapOutput() FleetMapOutput
	ToFleetMapOutputWithContext(context.Context) FleetMapOutput
}

type FleetMap map[string]FleetInput

func (FleetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Fleet)(nil)).Elem()
}

func (i FleetMap) ToFleetMapOutput() FleetMapOutput {
	return i.ToFleetMapOutputWithContext(context.Background())
}

func (i FleetMap) ToFleetMapOutputWithContext(ctx context.Context) FleetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetMapOutput)
}

type FleetOutput struct{ *pulumi.OutputState }

func (FleetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Fleet)(nil)).Elem()
}

func (o FleetOutput) ToFleetOutput() FleetOutput {
	return o
}

func (o FleetOutput) ToFleetOutputWithContext(ctx context.Context) FleetOutput {
	return o
}

// ARN of the appstream fleet.
func (o FleetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Configuration block for the desired capacity of the fleet. See below.
func (o FleetOutput) ComputeCapacity() FleetComputeCapacityOutput {
	return o.ApplyT(func(v *Fleet) FleetComputeCapacityOutput { return v.ComputeCapacity }).(FleetComputeCapacityOutput)
}

// Date and time, in UTC and extended RFC 3339 format, when the fleet was created.
func (o FleetOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Description to display.
func (o FleetOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Amount of time that a streaming session remains active after users disconnect.
func (o FleetOutput) DisconnectTimeoutInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Fleet) pulumi.IntOutput { return v.DisconnectTimeoutInSeconds }).(pulumi.IntOutput)
}

// Human-readable friendly name for the AppStream fleet.
func (o FleetOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
func (o FleetOutput) DomainJoinInfo() FleetDomainJoinInfoOutput {
	return o.ApplyT(func(v *Fleet) FleetDomainJoinInfoOutput { return v.DomainJoinInfo }).(FleetDomainJoinInfoOutput)
}

// Enables or disables default internet access for the fleet.
func (o FleetOutput) EnableDefaultInternetAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v *Fleet) pulumi.BoolOutput { return v.EnableDefaultInternetAccess }).(pulumi.BoolOutput)
}

// Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
func (o FleetOutput) FleetType() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.FleetType }).(pulumi.StringOutput)
}

// ARN of the IAM role to apply to the fleet.
func (o FleetOutput) IamRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.IamRoleArn }).(pulumi.StringOutput)
}

// Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnectTimeoutInSeconds` time interval begins. Defaults to 60 seconds.
func (o FleetOutput) IdleDisconnectTimeoutInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.IntPtrOutput { return v.IdleDisconnectTimeoutInSeconds }).(pulumi.IntPtrOutput)
}

// ARN of the public, private, or shared image to use.
func (o FleetOutput) ImageArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.ImageArn }).(pulumi.StringOutput)
}

// Name of the image used to create the fleet.
func (o FleetOutput) ImageName() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.ImageName }).(pulumi.StringOutput)
}

// Instance type to use when launching fleet instances.
func (o FleetOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// Maximum amount of time that a streaming session can remain active, in seconds.
func (o FleetOutput) MaxUserDurationInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Fleet) pulumi.IntOutput { return v.MaxUserDurationInSeconds }).(pulumi.IntOutput)
}

// Unique name for the fleet.
//
// The following arguments are optional:
func (o FleetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// State of the fleet. Can be `STARTING`, `RUNNING`, `STOPPING` or `STOPPED`
func (o FleetOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
func (o FleetOutput) StreamView() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.StreamView }).(pulumi.StringOutput)
}

// Map of tags to attach to AppStream instances.
func (o FleetOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o FleetOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration block for the VPC configuration for the image builder. See below.
func (o FleetOutput) VpcConfig() FleetVpcConfigOutput {
	return o.ApplyT(func(v *Fleet) FleetVpcConfigOutput { return v.VpcConfig }).(FleetVpcConfigOutput)
}

type FleetArrayOutput struct{ *pulumi.OutputState }

func (FleetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Fleet)(nil)).Elem()
}

func (o FleetArrayOutput) ToFleetArrayOutput() FleetArrayOutput {
	return o
}

func (o FleetArrayOutput) ToFleetArrayOutputWithContext(ctx context.Context) FleetArrayOutput {
	return o
}

func (o FleetArrayOutput) Index(i pulumi.IntInput) FleetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Fleet {
		return vs[0].([]*Fleet)[vs[1].(int)]
	}).(FleetOutput)
}

type FleetMapOutput struct{ *pulumi.OutputState }

func (FleetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Fleet)(nil)).Elem()
}

func (o FleetMapOutput) ToFleetMapOutput() FleetMapOutput {
	return o
}

func (o FleetMapOutput) ToFleetMapOutputWithContext(ctx context.Context) FleetMapOutput {
	return o
}

func (o FleetMapOutput) MapIndex(k pulumi.StringInput) FleetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Fleet {
		return vs[0].(map[string]*Fleet)[vs[1].(string)]
	}).(FleetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FleetInput)(nil)).Elem(), &Fleet{})
	pulumi.RegisterInputType(reflect.TypeOf((*FleetArrayInput)(nil)).Elem(), FleetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FleetMapInput)(nil)).Elem(), FleetMap{})
	pulumi.RegisterOutputType(FleetOutput{})
	pulumi.RegisterOutputType(FleetArrayOutput{})
	pulumi.RegisterOutputType(FleetMapOutput{})
}
