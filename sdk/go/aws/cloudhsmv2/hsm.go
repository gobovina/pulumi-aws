// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudhsmv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an HSM module in Amazon CloudHSM v2 cluster.
//
// ## Example Usage
//
// The following example below creates an HSM module in CloudHSM cluster.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudhsmv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cluster, err := cloudhsmv2.LookupCluster(ctx, &cloudhsmv2.LookupClusterArgs{
//				ClusterId: cloudhsmClusterId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudhsmv2.NewHsm(ctx, "cloudhsm_v2_hsm", &cloudhsmv2.HsmArgs{
//				SubnetId:  *pulumi.String(cluster.SubnetIds[0]),
//				ClusterId: *pulumi.String(cluster.ClusterId),
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
// Using `pulumi import`, import HSM modules using their HSM ID. For example:
//
// ```sh
//
//	$ pulumi import aws:cloudhsmv2/hsm:Hsm bar hsm-quo8dahtaca
//
// ```
type Hsm struct {
	pulumi.CustomResourceState

	// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The ID of Cloud HSM v2 cluster to which HSM will be added.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The id of the ENI interface allocated for HSM module.
	HsmEniId pulumi.StringOutput `pulumi:"hsmEniId"`
	// The id of the HSM module.
	HsmId pulumi.StringOutput `pulumi:"hsmId"`
	// The state of the HSM module.
	HsmState pulumi.StringOutput `pulumi:"hsmState"`
	// The IP address of HSM module. Must be within the CIDR of selected subnet.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
}

// NewHsm registers a new resource with the given unique name, arguments, and options.
func NewHsm(ctx *pulumi.Context,
	name string, args *HsmArgs, opts ...pulumi.ResourceOption) (*Hsm, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Hsm
	err := ctx.RegisterResource("aws:cloudhsmv2/hsm:Hsm", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHsm gets an existing Hsm resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHsm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HsmState, opts ...pulumi.ResourceOption) (*Hsm, error) {
	var resource Hsm
	err := ctx.ReadResource("aws:cloudhsmv2/hsm:Hsm", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Hsm resources.
type hsmState struct {
	// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The ID of Cloud HSM v2 cluster to which HSM will be added.
	ClusterId *string `pulumi:"clusterId"`
	// The id of the ENI interface allocated for HSM module.
	HsmEniId *string `pulumi:"hsmEniId"`
	// The id of the HSM module.
	HsmId *string `pulumi:"hsmId"`
	// The state of the HSM module.
	HsmState *string `pulumi:"hsmState"`
	// The IP address of HSM module. Must be within the CIDR of selected subnet.
	IpAddress *string `pulumi:"ipAddress"`
	// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
	SubnetId *string `pulumi:"subnetId"`
}

type HsmState struct {
	// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
	AvailabilityZone pulumi.StringPtrInput
	// The ID of Cloud HSM v2 cluster to which HSM will be added.
	ClusterId pulumi.StringPtrInput
	// The id of the ENI interface allocated for HSM module.
	HsmEniId pulumi.StringPtrInput
	// The id of the HSM module.
	HsmId pulumi.StringPtrInput
	// The state of the HSM module.
	HsmState pulumi.StringPtrInput
	// The IP address of HSM module. Must be within the CIDR of selected subnet.
	IpAddress pulumi.StringPtrInput
	// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
	SubnetId pulumi.StringPtrInput
}

func (HsmState) ElementType() reflect.Type {
	return reflect.TypeOf((*hsmState)(nil)).Elem()
}

type hsmArgs struct {
	// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The ID of Cloud HSM v2 cluster to which HSM will be added.
	ClusterId string `pulumi:"clusterId"`
	// The IP address of HSM module. Must be within the CIDR of selected subnet.
	IpAddress *string `pulumi:"ipAddress"`
	// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
	SubnetId *string `pulumi:"subnetId"`
}

// The set of arguments for constructing a Hsm resource.
type HsmArgs struct {
	// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
	AvailabilityZone pulumi.StringPtrInput
	// The ID of Cloud HSM v2 cluster to which HSM will be added.
	ClusterId pulumi.StringInput
	// The IP address of HSM module. Must be within the CIDR of selected subnet.
	IpAddress pulumi.StringPtrInput
	// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
	SubnetId pulumi.StringPtrInput
}

func (HsmArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hsmArgs)(nil)).Elem()
}

type HsmInput interface {
	pulumi.Input

	ToHsmOutput() HsmOutput
	ToHsmOutputWithContext(ctx context.Context) HsmOutput
}

func (*Hsm) ElementType() reflect.Type {
	return reflect.TypeOf((**Hsm)(nil)).Elem()
}

func (i *Hsm) ToHsmOutput() HsmOutput {
	return i.ToHsmOutputWithContext(context.Background())
}

func (i *Hsm) ToHsmOutputWithContext(ctx context.Context) HsmOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HsmOutput)
}

// HsmArrayInput is an input type that accepts HsmArray and HsmArrayOutput values.
// You can construct a concrete instance of `HsmArrayInput` via:
//
//	HsmArray{ HsmArgs{...} }
type HsmArrayInput interface {
	pulumi.Input

	ToHsmArrayOutput() HsmArrayOutput
	ToHsmArrayOutputWithContext(context.Context) HsmArrayOutput
}

type HsmArray []HsmInput

func (HsmArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hsm)(nil)).Elem()
}

func (i HsmArray) ToHsmArrayOutput() HsmArrayOutput {
	return i.ToHsmArrayOutputWithContext(context.Background())
}

func (i HsmArray) ToHsmArrayOutputWithContext(ctx context.Context) HsmArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HsmArrayOutput)
}

// HsmMapInput is an input type that accepts HsmMap and HsmMapOutput values.
// You can construct a concrete instance of `HsmMapInput` via:
//
//	HsmMap{ "key": HsmArgs{...} }
type HsmMapInput interface {
	pulumi.Input

	ToHsmMapOutput() HsmMapOutput
	ToHsmMapOutputWithContext(context.Context) HsmMapOutput
}

type HsmMap map[string]HsmInput

func (HsmMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hsm)(nil)).Elem()
}

func (i HsmMap) ToHsmMapOutput() HsmMapOutput {
	return i.ToHsmMapOutputWithContext(context.Background())
}

func (i HsmMap) ToHsmMapOutputWithContext(ctx context.Context) HsmMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HsmMapOutput)
}

type HsmOutput struct{ *pulumi.OutputState }

func (HsmOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Hsm)(nil)).Elem()
}

func (o HsmOutput) ToHsmOutput() HsmOutput {
	return o
}

func (o HsmOutput) ToHsmOutputWithContext(ctx context.Context) HsmOutput {
	return o
}

// The IDs of AZ in which HSM module will be located. Conflicts with `subnetId`.
func (o HsmOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// The ID of Cloud HSM v2 cluster to which HSM will be added.
func (o HsmOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The id of the ENI interface allocated for HSM module.
func (o HsmOutput) HsmEniId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.HsmEniId }).(pulumi.StringOutput)
}

// The id of the HSM module.
func (o HsmOutput) HsmId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.HsmId }).(pulumi.StringOutput)
}

// The state of the HSM module.
func (o HsmOutput) HsmState() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.HsmState }).(pulumi.StringOutput)
}

// The IP address of HSM module. Must be within the CIDR of selected subnet.
func (o HsmOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// The ID of subnet in which HSM module will be located. Conflicts with `availabilityZone`.
func (o HsmOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hsm) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

type HsmArrayOutput struct{ *pulumi.OutputState }

func (HsmArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hsm)(nil)).Elem()
}

func (o HsmArrayOutput) ToHsmArrayOutput() HsmArrayOutput {
	return o
}

func (o HsmArrayOutput) ToHsmArrayOutputWithContext(ctx context.Context) HsmArrayOutput {
	return o
}

func (o HsmArrayOutput) Index(i pulumi.IntInput) HsmOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Hsm {
		return vs[0].([]*Hsm)[vs[1].(int)]
	}).(HsmOutput)
}

type HsmMapOutput struct{ *pulumi.OutputState }

func (HsmMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hsm)(nil)).Elem()
}

func (o HsmMapOutput) ToHsmMapOutput() HsmMapOutput {
	return o
}

func (o HsmMapOutput) ToHsmMapOutputWithContext(ctx context.Context) HsmMapOutput {
	return o
}

func (o HsmMapOutput) MapIndex(k pulumi.StringInput) HsmOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Hsm {
		return vs[0].(map[string]*Hsm)[vs[1].(string)]
	}).(HsmOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HsmInput)(nil)).Elem(), &Hsm{})
	pulumi.RegisterInputType(reflect.TypeOf((*HsmArrayInput)(nil)).Elem(), HsmArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HsmMapInput)(nil)).Elem(), HsmMap{})
	pulumi.RegisterOutputType(HsmOutput{})
	pulumi.RegisterOutputType(HsmArrayOutput{})
	pulumi.RegisterOutputType(HsmMapOutput{})
}
