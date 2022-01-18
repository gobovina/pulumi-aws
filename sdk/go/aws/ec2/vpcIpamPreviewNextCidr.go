// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Previews a CIDR from an IPAM address pool. Only works for private IPv4.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		current, err := aws.GetRegion(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleVpcIpam, err := ec2.NewVpcIpam(ctx, "exampleVpcIpam", &ec2.VpcIpamArgs{
// 			OperatingRegions: ec2.VpcIpamOperatingRegionArray{
// 				&ec2.VpcIpamOperatingRegionArgs{
// 					RegionName: pulumi.String(current.Name),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVpcIpamPool, err := ec2.NewVpcIpamPool(ctx, "exampleVpcIpamPool", &ec2.VpcIpamPoolArgs{
// 			AddressFamily: pulumi.String("ipv4"),
// 			IpamScopeId:   exampleVpcIpam.PrivateDefaultScopeId,
// 			Locale:        pulumi.String(current.Name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVpcIpamPoolCidr, err := ec2.NewVpcIpamPoolCidr(ctx, "exampleVpcIpamPoolCidr", &ec2.VpcIpamPoolCidrArgs{
// 			IpamPoolId: exampleVpcIpamPool.ID(),
// 			Cidr:       pulumi.String("172.2.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec2.NewVpcIpamPreviewNextCidr(ctx, "exampleVpcIpamPreviewNextCidr", &ec2.VpcIpamPreviewNextCidrArgs{
// 			IpamPoolId:    exampleVpcIpamPool.ID(),
// 			NetmaskLength: pulumi.Int(28),
// 			DisallowedCidrs: pulumi.StringArray{
// 				pulumi.String("172.2.0.0/32"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			exampleVpcIpamPoolCidr,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type VpcIpamPreviewNextCidr struct {
	pulumi.CustomResourceState

	// The previewed CIDR from the pool.
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// Exclude a particular CIDR range from being returned by the pool.
	DisallowedCidrs pulumi.StringArrayOutput `pulumi:"disallowedCidrs"`
	// The ID of the pool to which you want to assign a CIDR.
	IpamPoolId pulumi.StringOutput `pulumi:"ipamPoolId"`
	// The netmask length of the CIDR you would like to preview from the IPAM pool.
	NetmaskLength pulumi.IntPtrOutput `pulumi:"netmaskLength"`
}

// NewVpcIpamPreviewNextCidr registers a new resource with the given unique name, arguments, and options.
func NewVpcIpamPreviewNextCidr(ctx *pulumi.Context,
	name string, args *VpcIpamPreviewNextCidrArgs, opts ...pulumi.ResourceOption) (*VpcIpamPreviewNextCidr, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IpamPoolId == nil {
		return nil, errors.New("invalid value for required argument 'IpamPoolId'")
	}
	var resource VpcIpamPreviewNextCidr
	err := ctx.RegisterResource("aws:ec2/vpcIpamPreviewNextCidr:VpcIpamPreviewNextCidr", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcIpamPreviewNextCidr gets an existing VpcIpamPreviewNextCidr resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcIpamPreviewNextCidr(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcIpamPreviewNextCidrState, opts ...pulumi.ResourceOption) (*VpcIpamPreviewNextCidr, error) {
	var resource VpcIpamPreviewNextCidr
	err := ctx.ReadResource("aws:ec2/vpcIpamPreviewNextCidr:VpcIpamPreviewNextCidr", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcIpamPreviewNextCidr resources.
type vpcIpamPreviewNextCidrState struct {
	// The previewed CIDR from the pool.
	Cidr *string `pulumi:"cidr"`
	// Exclude a particular CIDR range from being returned by the pool.
	DisallowedCidrs []string `pulumi:"disallowedCidrs"`
	// The ID of the pool to which you want to assign a CIDR.
	IpamPoolId *string `pulumi:"ipamPoolId"`
	// The netmask length of the CIDR you would like to preview from the IPAM pool.
	NetmaskLength *int `pulumi:"netmaskLength"`
}

type VpcIpamPreviewNextCidrState struct {
	// The previewed CIDR from the pool.
	Cidr pulumi.StringPtrInput
	// Exclude a particular CIDR range from being returned by the pool.
	DisallowedCidrs pulumi.StringArrayInput
	// The ID of the pool to which you want to assign a CIDR.
	IpamPoolId pulumi.StringPtrInput
	// The netmask length of the CIDR you would like to preview from the IPAM pool.
	NetmaskLength pulumi.IntPtrInput
}

func (VpcIpamPreviewNextCidrState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcIpamPreviewNextCidrState)(nil)).Elem()
}

type vpcIpamPreviewNextCidrArgs struct {
	// Exclude a particular CIDR range from being returned by the pool.
	DisallowedCidrs []string `pulumi:"disallowedCidrs"`
	// The ID of the pool to which you want to assign a CIDR.
	IpamPoolId string `pulumi:"ipamPoolId"`
	// The netmask length of the CIDR you would like to preview from the IPAM pool.
	NetmaskLength *int `pulumi:"netmaskLength"`
}

// The set of arguments for constructing a VpcIpamPreviewNextCidr resource.
type VpcIpamPreviewNextCidrArgs struct {
	// Exclude a particular CIDR range from being returned by the pool.
	DisallowedCidrs pulumi.StringArrayInput
	// The ID of the pool to which you want to assign a CIDR.
	IpamPoolId pulumi.StringInput
	// The netmask length of the CIDR you would like to preview from the IPAM pool.
	NetmaskLength pulumi.IntPtrInput
}

func (VpcIpamPreviewNextCidrArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcIpamPreviewNextCidrArgs)(nil)).Elem()
}

type VpcIpamPreviewNextCidrInput interface {
	pulumi.Input

	ToVpcIpamPreviewNextCidrOutput() VpcIpamPreviewNextCidrOutput
	ToVpcIpamPreviewNextCidrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrOutput
}

func (*VpcIpamPreviewNextCidr) ElementType() reflect.Type {
	return reflect.TypeOf((*VpcIpamPreviewNextCidr)(nil))
}

func (i *VpcIpamPreviewNextCidr) ToVpcIpamPreviewNextCidrOutput() VpcIpamPreviewNextCidrOutput {
	return i.ToVpcIpamPreviewNextCidrOutputWithContext(context.Background())
}

func (i *VpcIpamPreviewNextCidr) ToVpcIpamPreviewNextCidrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcIpamPreviewNextCidrOutput)
}

func (i *VpcIpamPreviewNextCidr) ToVpcIpamPreviewNextCidrPtrOutput() VpcIpamPreviewNextCidrPtrOutput {
	return i.ToVpcIpamPreviewNextCidrPtrOutputWithContext(context.Background())
}

func (i *VpcIpamPreviewNextCidr) ToVpcIpamPreviewNextCidrPtrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcIpamPreviewNextCidrPtrOutput)
}

type VpcIpamPreviewNextCidrPtrInput interface {
	pulumi.Input

	ToVpcIpamPreviewNextCidrPtrOutput() VpcIpamPreviewNextCidrPtrOutput
	ToVpcIpamPreviewNextCidrPtrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrPtrOutput
}

type vpcIpamPreviewNextCidrPtrType VpcIpamPreviewNextCidrArgs

func (*vpcIpamPreviewNextCidrPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcIpamPreviewNextCidr)(nil))
}

func (i *vpcIpamPreviewNextCidrPtrType) ToVpcIpamPreviewNextCidrPtrOutput() VpcIpamPreviewNextCidrPtrOutput {
	return i.ToVpcIpamPreviewNextCidrPtrOutputWithContext(context.Background())
}

func (i *vpcIpamPreviewNextCidrPtrType) ToVpcIpamPreviewNextCidrPtrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcIpamPreviewNextCidrPtrOutput)
}

// VpcIpamPreviewNextCidrArrayInput is an input type that accepts VpcIpamPreviewNextCidrArray and VpcIpamPreviewNextCidrArrayOutput values.
// You can construct a concrete instance of `VpcIpamPreviewNextCidrArrayInput` via:
//
//          VpcIpamPreviewNextCidrArray{ VpcIpamPreviewNextCidrArgs{...} }
type VpcIpamPreviewNextCidrArrayInput interface {
	pulumi.Input

	ToVpcIpamPreviewNextCidrArrayOutput() VpcIpamPreviewNextCidrArrayOutput
	ToVpcIpamPreviewNextCidrArrayOutputWithContext(context.Context) VpcIpamPreviewNextCidrArrayOutput
}

type VpcIpamPreviewNextCidrArray []VpcIpamPreviewNextCidrInput

func (VpcIpamPreviewNextCidrArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcIpamPreviewNextCidr)(nil)).Elem()
}

func (i VpcIpamPreviewNextCidrArray) ToVpcIpamPreviewNextCidrArrayOutput() VpcIpamPreviewNextCidrArrayOutput {
	return i.ToVpcIpamPreviewNextCidrArrayOutputWithContext(context.Background())
}

func (i VpcIpamPreviewNextCidrArray) ToVpcIpamPreviewNextCidrArrayOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcIpamPreviewNextCidrArrayOutput)
}

// VpcIpamPreviewNextCidrMapInput is an input type that accepts VpcIpamPreviewNextCidrMap and VpcIpamPreviewNextCidrMapOutput values.
// You can construct a concrete instance of `VpcIpamPreviewNextCidrMapInput` via:
//
//          VpcIpamPreviewNextCidrMap{ "key": VpcIpamPreviewNextCidrArgs{...} }
type VpcIpamPreviewNextCidrMapInput interface {
	pulumi.Input

	ToVpcIpamPreviewNextCidrMapOutput() VpcIpamPreviewNextCidrMapOutput
	ToVpcIpamPreviewNextCidrMapOutputWithContext(context.Context) VpcIpamPreviewNextCidrMapOutput
}

type VpcIpamPreviewNextCidrMap map[string]VpcIpamPreviewNextCidrInput

func (VpcIpamPreviewNextCidrMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcIpamPreviewNextCidr)(nil)).Elem()
}

func (i VpcIpamPreviewNextCidrMap) ToVpcIpamPreviewNextCidrMapOutput() VpcIpamPreviewNextCidrMapOutput {
	return i.ToVpcIpamPreviewNextCidrMapOutputWithContext(context.Background())
}

func (i VpcIpamPreviewNextCidrMap) ToVpcIpamPreviewNextCidrMapOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcIpamPreviewNextCidrMapOutput)
}

type VpcIpamPreviewNextCidrOutput struct{ *pulumi.OutputState }

func (VpcIpamPreviewNextCidrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VpcIpamPreviewNextCidr)(nil))
}

func (o VpcIpamPreviewNextCidrOutput) ToVpcIpamPreviewNextCidrOutput() VpcIpamPreviewNextCidrOutput {
	return o
}

func (o VpcIpamPreviewNextCidrOutput) ToVpcIpamPreviewNextCidrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrOutput {
	return o
}

func (o VpcIpamPreviewNextCidrOutput) ToVpcIpamPreviewNextCidrPtrOutput() VpcIpamPreviewNextCidrPtrOutput {
	return o.ToVpcIpamPreviewNextCidrPtrOutputWithContext(context.Background())
}

func (o VpcIpamPreviewNextCidrOutput) ToVpcIpamPreviewNextCidrPtrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VpcIpamPreviewNextCidr) *VpcIpamPreviewNextCidr {
		return &v
	}).(VpcIpamPreviewNextCidrPtrOutput)
}

type VpcIpamPreviewNextCidrPtrOutput struct{ *pulumi.OutputState }

func (VpcIpamPreviewNextCidrPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcIpamPreviewNextCidr)(nil))
}

func (o VpcIpamPreviewNextCidrPtrOutput) ToVpcIpamPreviewNextCidrPtrOutput() VpcIpamPreviewNextCidrPtrOutput {
	return o
}

func (o VpcIpamPreviewNextCidrPtrOutput) ToVpcIpamPreviewNextCidrPtrOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrPtrOutput {
	return o
}

func (o VpcIpamPreviewNextCidrPtrOutput) Elem() VpcIpamPreviewNextCidrOutput {
	return o.ApplyT(func(v *VpcIpamPreviewNextCidr) VpcIpamPreviewNextCidr {
		if v != nil {
			return *v
		}
		var ret VpcIpamPreviewNextCidr
		return ret
	}).(VpcIpamPreviewNextCidrOutput)
}

type VpcIpamPreviewNextCidrArrayOutput struct{ *pulumi.OutputState }

func (VpcIpamPreviewNextCidrArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VpcIpamPreviewNextCidr)(nil))
}

func (o VpcIpamPreviewNextCidrArrayOutput) ToVpcIpamPreviewNextCidrArrayOutput() VpcIpamPreviewNextCidrArrayOutput {
	return o
}

func (o VpcIpamPreviewNextCidrArrayOutput) ToVpcIpamPreviewNextCidrArrayOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrArrayOutput {
	return o
}

func (o VpcIpamPreviewNextCidrArrayOutput) Index(i pulumi.IntInput) VpcIpamPreviewNextCidrOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VpcIpamPreviewNextCidr {
		return vs[0].([]VpcIpamPreviewNextCidr)[vs[1].(int)]
	}).(VpcIpamPreviewNextCidrOutput)
}

type VpcIpamPreviewNextCidrMapOutput struct{ *pulumi.OutputState }

func (VpcIpamPreviewNextCidrMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]VpcIpamPreviewNextCidr)(nil))
}

func (o VpcIpamPreviewNextCidrMapOutput) ToVpcIpamPreviewNextCidrMapOutput() VpcIpamPreviewNextCidrMapOutput {
	return o
}

func (o VpcIpamPreviewNextCidrMapOutput) ToVpcIpamPreviewNextCidrMapOutputWithContext(ctx context.Context) VpcIpamPreviewNextCidrMapOutput {
	return o
}

func (o VpcIpamPreviewNextCidrMapOutput) MapIndex(k pulumi.StringInput) VpcIpamPreviewNextCidrOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) VpcIpamPreviewNextCidr {
		return vs[0].(map[string]VpcIpamPreviewNextCidr)[vs[1].(string)]
	}).(VpcIpamPreviewNextCidrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcIpamPreviewNextCidrInput)(nil)).Elem(), &VpcIpamPreviewNextCidr{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcIpamPreviewNextCidrPtrInput)(nil)).Elem(), &VpcIpamPreviewNextCidr{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcIpamPreviewNextCidrArrayInput)(nil)).Elem(), VpcIpamPreviewNextCidrArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcIpamPreviewNextCidrMapInput)(nil)).Elem(), VpcIpamPreviewNextCidrMap{})
	pulumi.RegisterOutputType(VpcIpamPreviewNextCidrOutput{})
	pulumi.RegisterOutputType(VpcIpamPreviewNextCidrPtrOutput{})
	pulumi.RegisterOutputType(VpcIpamPreviewNextCidrArrayOutput{})
	pulumi.RegisterOutputType(VpcIpamPreviewNextCidrMapOutput{})
}
