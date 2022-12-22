// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lightsail

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Lightsail Disk resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			available, err := aws.GetAvailabilityZones(ctx, &aws.GetAvailabilityZonesArgs{
//				State: pulumi.StringRef("available"),
//				Filters: []aws.GetAvailabilityZonesFilter{
//					{
//						Name: "opt-in-status",
//						Values: []string{
//							"opt-in-not-required",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = lightsail.NewDisk(ctx, "test", &lightsail.DiskArgs{
//				SizeInGb:         pulumi.Int(8),
//				AvailabilityZone: *pulumi.String(available.Names[0]),
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
// `aws_lightsail_disk` can be imported by using the name attribute, e.g.,
//
// ```sh
//
//	$ pulumi import aws:lightsail/disk:Disk test test
//
// ```
type Disk struct {
	pulumi.CustomResourceState

	// The ARN of the Lightsail load balancer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Availability Zone in which to create your disk.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The timestamp when the load balancer was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The name of the Lightsail load balancer.
	Name pulumi.StringOutput `pulumi:"name"`
	// The instance port the load balancer will connect.
	SizeInGb pulumi.IntOutput `pulumi:"sizeInGb"`
	// The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
	SupportCode pulumi.StringOutput `pulumi:"supportCode"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewDisk registers a new resource with the given unique name, arguments, and options.
func NewDisk(ctx *pulumi.Context,
	name string, args *DiskArgs, opts ...pulumi.ResourceOption) (*Disk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AvailabilityZone == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZone'")
	}
	if args.SizeInGb == nil {
		return nil, errors.New("invalid value for required argument 'SizeInGb'")
	}
	var resource Disk
	err := ctx.RegisterResource("aws:lightsail/disk:Disk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDisk gets an existing Disk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskState, opts ...pulumi.ResourceOption) (*Disk, error) {
	var resource Disk
	err := ctx.ReadResource("aws:lightsail/disk:Disk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Disk resources.
type diskState struct {
	// The ARN of the Lightsail load balancer.
	Arn *string `pulumi:"arn"`
	// The Availability Zone in which to create your disk.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The timestamp when the load balancer was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The name of the Lightsail load balancer.
	Name *string `pulumi:"name"`
	// The instance port the load balancer will connect.
	SizeInGb *int `pulumi:"sizeInGb"`
	// The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
	SupportCode *string `pulumi:"supportCode"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type DiskState struct {
	// The ARN of the Lightsail load balancer.
	Arn pulumi.StringPtrInput
	// The Availability Zone in which to create your disk.
	AvailabilityZone pulumi.StringPtrInput
	// The timestamp when the load balancer was created.
	CreatedAt pulumi.StringPtrInput
	// The name of the Lightsail load balancer.
	Name pulumi.StringPtrInput
	// The instance port the load balancer will connect.
	SizeInGb pulumi.IntPtrInput
	// The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
	SupportCode pulumi.StringPtrInput
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (DiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskState)(nil)).Elem()
}

type diskArgs struct {
	// The Availability Zone in which to create your disk.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// The name of the Lightsail load balancer.
	Name *string `pulumi:"name"`
	// The instance port the load balancer will connect.
	SizeInGb int `pulumi:"sizeInGb"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Disk resource.
type DiskArgs struct {
	// The Availability Zone in which to create your disk.
	AvailabilityZone pulumi.StringInput
	// The name of the Lightsail load balancer.
	Name pulumi.StringPtrInput
	// The instance port the load balancer will connect.
	SizeInGb pulumi.IntInput
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskArgs)(nil)).Elem()
}

type DiskInput interface {
	pulumi.Input

	ToDiskOutput() DiskOutput
	ToDiskOutputWithContext(ctx context.Context) DiskOutput
}

func (*Disk) ElementType() reflect.Type {
	return reflect.TypeOf((**Disk)(nil)).Elem()
}

func (i *Disk) ToDiskOutput() DiskOutput {
	return i.ToDiskOutputWithContext(context.Background())
}

func (i *Disk) ToDiskOutputWithContext(ctx context.Context) DiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskOutput)
}

// DiskArrayInput is an input type that accepts DiskArray and DiskArrayOutput values.
// You can construct a concrete instance of `DiskArrayInput` via:
//
//	DiskArray{ DiskArgs{...} }
type DiskArrayInput interface {
	pulumi.Input

	ToDiskArrayOutput() DiskArrayOutput
	ToDiskArrayOutputWithContext(context.Context) DiskArrayOutput
}

type DiskArray []DiskInput

func (DiskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Disk)(nil)).Elem()
}

func (i DiskArray) ToDiskArrayOutput() DiskArrayOutput {
	return i.ToDiskArrayOutputWithContext(context.Background())
}

func (i DiskArray) ToDiskArrayOutputWithContext(ctx context.Context) DiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskArrayOutput)
}

// DiskMapInput is an input type that accepts DiskMap and DiskMapOutput values.
// You can construct a concrete instance of `DiskMapInput` via:
//
//	DiskMap{ "key": DiskArgs{...} }
type DiskMapInput interface {
	pulumi.Input

	ToDiskMapOutput() DiskMapOutput
	ToDiskMapOutputWithContext(context.Context) DiskMapOutput
}

type DiskMap map[string]DiskInput

func (DiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Disk)(nil)).Elem()
}

func (i DiskMap) ToDiskMapOutput() DiskMapOutput {
	return i.ToDiskMapOutputWithContext(context.Background())
}

func (i DiskMap) ToDiskMapOutputWithContext(ctx context.Context) DiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskMapOutput)
}

type DiskOutput struct{ *pulumi.OutputState }

func (DiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Disk)(nil)).Elem()
}

func (o DiskOutput) ToDiskOutput() DiskOutput {
	return o
}

func (o DiskOutput) ToDiskOutputWithContext(ctx context.Context) DiskOutput {
	return o
}

// The ARN of the Lightsail load balancer.
func (o DiskOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Availability Zone in which to create your disk.
func (o DiskOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// The timestamp when the load balancer was created.
func (o DiskOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The name of the Lightsail load balancer.
func (o DiskOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The instance port the load balancer will connect.
func (o DiskOutput) SizeInGb() pulumi.IntOutput {
	return o.ApplyT(func(v *Disk) pulumi.IntOutput { return v.SizeInGb }).(pulumi.IntOutput)
}

// The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
func (o DiskOutput) SupportCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.SupportCode }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DiskOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o DiskOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type DiskArrayOutput struct{ *pulumi.OutputState }

func (DiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Disk)(nil)).Elem()
}

func (o DiskArrayOutput) ToDiskArrayOutput() DiskArrayOutput {
	return o
}

func (o DiskArrayOutput) ToDiskArrayOutputWithContext(ctx context.Context) DiskArrayOutput {
	return o
}

func (o DiskArrayOutput) Index(i pulumi.IntInput) DiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Disk {
		return vs[0].([]*Disk)[vs[1].(int)]
	}).(DiskOutput)
}

type DiskMapOutput struct{ *pulumi.OutputState }

func (DiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Disk)(nil)).Elem()
}

func (o DiskMapOutput) ToDiskMapOutput() DiskMapOutput {
	return o
}

func (o DiskMapOutput) ToDiskMapOutputWithContext(ctx context.Context) DiskMapOutput {
	return o
}

func (o DiskMapOutput) MapIndex(k pulumi.StringInput) DiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Disk {
		return vs[0].(map[string]*Disk)[vs[1].(string)]
	}).(DiskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskInput)(nil)).Elem(), &Disk{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskArrayInput)(nil)).Elem(), DiskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskMapInput)(nil)).Elem(), DiskMap{})
	pulumi.RegisterOutputType(DiskOutput{})
	pulumi.RegisterOutputType(DiskArrayOutput{})
	pulumi.RegisterOutputType(DiskMapOutput{})
}
