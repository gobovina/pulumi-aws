// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devicefarm

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage AWS Device Farm Device Pools.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/devicefarm"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := devicefarm.NewDevicePool(ctx, "example", &devicefarm.DevicePoolArgs{
//				ProjectArn: pulumi.Any(aws_devicefarm_project.Example.Arn),
//				Rules: devicefarm.DevicePoolRuleArray{
//					&devicefarm.DevicePoolRuleArgs{
//						Attribute: pulumi.String("OS_VERSION"),
//						Operator:  pulumi.String("EQUALS"),
//						Value:     pulumi.String("\"AVAILABLE\""),
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
// Using `pulumi import`, import DeviceFarm Device Pools using their ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:devicefarm/devicePool:DevicePool example arn:aws:devicefarm:us-west-2:123456789012:devicepool:4fa784c7-ccb4-4dbf-ba4f-02198320daa1/4fa784c7-ccb4-4dbf-ba4f-02198320daa1
//
// ```
type DevicePool struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name of this Device Pool
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The device pool's description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The number of devices that Device Farm can add to your device pool.
	MaxDevices pulumi.IntPtrOutput `pulumi:"maxDevices"`
	// The name of the Device Pool
	Name pulumi.StringOutput `pulumi:"name"`
	// The ARN of the project for the device pool.
	ProjectArn pulumi.StringOutput `pulumi:"projectArn"`
	// The device pool's rules. See Rule.
	Rules DevicePoolRuleArrayOutput `pulumi:"rules"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	Type    pulumi.StringOutput    `pulumi:"type"`
}

// NewDevicePool registers a new resource with the given unique name, arguments, and options.
func NewDevicePool(ctx *pulumi.Context,
	name string, args *DevicePoolArgs, opts ...pulumi.ResourceOption) (*DevicePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectArn == nil {
		return nil, errors.New("invalid value for required argument 'ProjectArn'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DevicePool
	err := ctx.RegisterResource("aws:devicefarm/devicePool:DevicePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevicePool gets an existing DevicePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevicePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevicePoolState, opts ...pulumi.ResourceOption) (*DevicePool, error) {
	var resource DevicePool
	err := ctx.ReadResource("aws:devicefarm/devicePool:DevicePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevicePool resources.
type devicePoolState struct {
	// The Amazon Resource Name of this Device Pool
	Arn *string `pulumi:"arn"`
	// The device pool's description.
	Description *string `pulumi:"description"`
	// The number of devices that Device Farm can add to your device pool.
	MaxDevices *int `pulumi:"maxDevices"`
	// The name of the Device Pool
	Name *string `pulumi:"name"`
	// The ARN of the project for the device pool.
	ProjectArn *string `pulumi:"projectArn"`
	// The device pool's rules. See Rule.
	Rules []DevicePoolRule `pulumi:"rules"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	Type    *string           `pulumi:"type"`
}

type DevicePoolState struct {
	// The Amazon Resource Name of this Device Pool
	Arn pulumi.StringPtrInput
	// The device pool's description.
	Description pulumi.StringPtrInput
	// The number of devices that Device Farm can add to your device pool.
	MaxDevices pulumi.IntPtrInput
	// The name of the Device Pool
	Name pulumi.StringPtrInput
	// The ARN of the project for the device pool.
	ProjectArn pulumi.StringPtrInput
	// The device pool's rules. See Rule.
	Rules DevicePoolRuleArrayInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	Type    pulumi.StringPtrInput
}

func (DevicePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePoolState)(nil)).Elem()
}

type devicePoolArgs struct {
	// The device pool's description.
	Description *string `pulumi:"description"`
	// The number of devices that Device Farm can add to your device pool.
	MaxDevices *int `pulumi:"maxDevices"`
	// The name of the Device Pool
	Name *string `pulumi:"name"`
	// The ARN of the project for the device pool.
	ProjectArn string `pulumi:"projectArn"`
	// The device pool's rules. See Rule.
	Rules []DevicePoolRule `pulumi:"rules"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DevicePool resource.
type DevicePoolArgs struct {
	// The device pool's description.
	Description pulumi.StringPtrInput
	// The number of devices that Device Farm can add to your device pool.
	MaxDevices pulumi.IntPtrInput
	// The name of the Device Pool
	Name pulumi.StringPtrInput
	// The ARN of the project for the device pool.
	ProjectArn pulumi.StringInput
	// The device pool's rules. See Rule.
	Rules DevicePoolRuleArrayInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DevicePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePoolArgs)(nil)).Elem()
}

type DevicePoolInput interface {
	pulumi.Input

	ToDevicePoolOutput() DevicePoolOutput
	ToDevicePoolOutputWithContext(ctx context.Context) DevicePoolOutput
}

func (*DevicePool) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePool)(nil)).Elem()
}

func (i *DevicePool) ToDevicePoolOutput() DevicePoolOutput {
	return i.ToDevicePoolOutputWithContext(context.Background())
}

func (i *DevicePool) ToDevicePoolOutputWithContext(ctx context.Context) DevicePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePoolOutput)
}

// DevicePoolArrayInput is an input type that accepts DevicePoolArray and DevicePoolArrayOutput values.
// You can construct a concrete instance of `DevicePoolArrayInput` via:
//
//	DevicePoolArray{ DevicePoolArgs{...} }
type DevicePoolArrayInput interface {
	pulumi.Input

	ToDevicePoolArrayOutput() DevicePoolArrayOutput
	ToDevicePoolArrayOutputWithContext(context.Context) DevicePoolArrayOutput
}

type DevicePoolArray []DevicePoolInput

func (DevicePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePool)(nil)).Elem()
}

func (i DevicePoolArray) ToDevicePoolArrayOutput() DevicePoolArrayOutput {
	return i.ToDevicePoolArrayOutputWithContext(context.Background())
}

func (i DevicePoolArray) ToDevicePoolArrayOutputWithContext(ctx context.Context) DevicePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePoolArrayOutput)
}

// DevicePoolMapInput is an input type that accepts DevicePoolMap and DevicePoolMapOutput values.
// You can construct a concrete instance of `DevicePoolMapInput` via:
//
//	DevicePoolMap{ "key": DevicePoolArgs{...} }
type DevicePoolMapInput interface {
	pulumi.Input

	ToDevicePoolMapOutput() DevicePoolMapOutput
	ToDevicePoolMapOutputWithContext(context.Context) DevicePoolMapOutput
}

type DevicePoolMap map[string]DevicePoolInput

func (DevicePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePool)(nil)).Elem()
}

func (i DevicePoolMap) ToDevicePoolMapOutput() DevicePoolMapOutput {
	return i.ToDevicePoolMapOutputWithContext(context.Background())
}

func (i DevicePoolMap) ToDevicePoolMapOutputWithContext(ctx context.Context) DevicePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePoolMapOutput)
}

type DevicePoolOutput struct{ *pulumi.OutputState }

func (DevicePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePool)(nil)).Elem()
}

func (o DevicePoolOutput) ToDevicePoolOutput() DevicePoolOutput {
	return o
}

func (o DevicePoolOutput) ToDevicePoolOutputWithContext(ctx context.Context) DevicePoolOutput {
	return o
}

// The Amazon Resource Name of this Device Pool
func (o DevicePoolOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The device pool's description.
func (o DevicePoolOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The number of devices that Device Farm can add to your device pool.
func (o DevicePoolOutput) MaxDevices() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.IntPtrOutput { return v.MaxDevices }).(pulumi.IntPtrOutput)
}

// The name of the Device Pool
func (o DevicePoolOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ARN of the project for the device pool.
func (o DevicePoolOutput) ProjectArn() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringOutput { return v.ProjectArn }).(pulumi.StringOutput)
}

// The device pool's rules. See Rule.
func (o DevicePoolOutput) Rules() DevicePoolRuleArrayOutput {
	return o.ApplyT(func(v *DevicePool) DevicePoolRuleArrayOutput { return v.Rules }).(DevicePoolRuleArrayOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DevicePoolOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DevicePoolOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o DevicePoolOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePool) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DevicePoolArrayOutput struct{ *pulumi.OutputState }

func (DevicePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePool)(nil)).Elem()
}

func (o DevicePoolArrayOutput) ToDevicePoolArrayOutput() DevicePoolArrayOutput {
	return o
}

func (o DevicePoolArrayOutput) ToDevicePoolArrayOutputWithContext(ctx context.Context) DevicePoolArrayOutput {
	return o
}

func (o DevicePoolArrayOutput) Index(i pulumi.IntInput) DevicePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DevicePool {
		return vs[0].([]*DevicePool)[vs[1].(int)]
	}).(DevicePoolOutput)
}

type DevicePoolMapOutput struct{ *pulumi.OutputState }

func (DevicePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePool)(nil)).Elem()
}

func (o DevicePoolMapOutput) ToDevicePoolMapOutput() DevicePoolMapOutput {
	return o
}

func (o DevicePoolMapOutput) ToDevicePoolMapOutputWithContext(ctx context.Context) DevicePoolMapOutput {
	return o
}

func (o DevicePoolMapOutput) MapIndex(k pulumi.StringInput) DevicePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DevicePool {
		return vs[0].(map[string]*DevicePool)[vs[1].(string)]
	}).(DevicePoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePoolInput)(nil)).Elem(), &DevicePool{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePoolArrayInput)(nil)).Elem(), DevicePoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePoolMapInput)(nil)).Elem(), DevicePoolMap{})
	pulumi.RegisterOutputType(DevicePoolOutput{})
	pulumi.RegisterOutputType(DevicePoolArrayOutput{})
	pulumi.RegisterOutputType(DevicePoolMapOutput{})
}
