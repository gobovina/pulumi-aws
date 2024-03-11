// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sesv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Assignment.
//
// This resource is used with "Standard" dedicated IP addresses. This includes addresses [requested and relinquished manually](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-case.html) via an AWS support case, or [Bring Your Own IP](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-byo.html) addresses. Once no longer assigned, this resource returns the IP to the [`ses-default-dedicated-pool`](https://docs.aws.amazon.com/ses/latest/dg/managing-ip-pools.html), managed by AWS.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sesv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sesv2.NewDedicatedIpAssignment(ctx, "example", &sesv2.DedicatedIpAssignmentArgs{
//				Ip:                  pulumi.String("0.0.0.0"),
//				DestinationPoolName: pulumi.String("my-pool"),
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
// Using `pulumi import`, import SESv2 (Simple Email V2) Dedicated IP Assignment using the `id`, which is a comma-separated string made up of `ip` and `destination_pool_name`. For example:
//
// ```sh
// $ pulumi import aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment example "0.0.0.0,my-pool"
// ```
type DedicatedIpAssignment struct {
	pulumi.CustomResourceState

	// Dedicated IP address.
	DestinationPoolName pulumi.StringOutput `pulumi:"destinationPoolName"`
	// Dedicated IP address.
	Ip pulumi.StringOutput `pulumi:"ip"`
}

// NewDedicatedIpAssignment registers a new resource with the given unique name, arguments, and options.
func NewDedicatedIpAssignment(ctx *pulumi.Context,
	name string, args *DedicatedIpAssignmentArgs, opts ...pulumi.ResourceOption) (*DedicatedIpAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationPoolName == nil {
		return nil, errors.New("invalid value for required argument 'DestinationPoolName'")
	}
	if args.Ip == nil {
		return nil, errors.New("invalid value for required argument 'Ip'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DedicatedIpAssignment
	err := ctx.RegisterResource("aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDedicatedIpAssignment gets an existing DedicatedIpAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDedicatedIpAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DedicatedIpAssignmentState, opts ...pulumi.ResourceOption) (*DedicatedIpAssignment, error) {
	var resource DedicatedIpAssignment
	err := ctx.ReadResource("aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DedicatedIpAssignment resources.
type dedicatedIpAssignmentState struct {
	// Dedicated IP address.
	DestinationPoolName *string `pulumi:"destinationPoolName"`
	// Dedicated IP address.
	Ip *string `pulumi:"ip"`
}

type DedicatedIpAssignmentState struct {
	// Dedicated IP address.
	DestinationPoolName pulumi.StringPtrInput
	// Dedicated IP address.
	Ip pulumi.StringPtrInput
}

func (DedicatedIpAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedIpAssignmentState)(nil)).Elem()
}

type dedicatedIpAssignmentArgs struct {
	// Dedicated IP address.
	DestinationPoolName string `pulumi:"destinationPoolName"`
	// Dedicated IP address.
	Ip string `pulumi:"ip"`
}

// The set of arguments for constructing a DedicatedIpAssignment resource.
type DedicatedIpAssignmentArgs struct {
	// Dedicated IP address.
	DestinationPoolName pulumi.StringInput
	// Dedicated IP address.
	Ip pulumi.StringInput
}

func (DedicatedIpAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedIpAssignmentArgs)(nil)).Elem()
}

type DedicatedIpAssignmentInput interface {
	pulumi.Input

	ToDedicatedIpAssignmentOutput() DedicatedIpAssignmentOutput
	ToDedicatedIpAssignmentOutputWithContext(ctx context.Context) DedicatedIpAssignmentOutput
}

func (*DedicatedIpAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedIpAssignment)(nil)).Elem()
}

func (i *DedicatedIpAssignment) ToDedicatedIpAssignmentOutput() DedicatedIpAssignmentOutput {
	return i.ToDedicatedIpAssignmentOutputWithContext(context.Background())
}

func (i *DedicatedIpAssignment) ToDedicatedIpAssignmentOutputWithContext(ctx context.Context) DedicatedIpAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedIpAssignmentOutput)
}

// DedicatedIpAssignmentArrayInput is an input type that accepts DedicatedIpAssignmentArray and DedicatedIpAssignmentArrayOutput values.
// You can construct a concrete instance of `DedicatedIpAssignmentArrayInput` via:
//
//	DedicatedIpAssignmentArray{ DedicatedIpAssignmentArgs{...} }
type DedicatedIpAssignmentArrayInput interface {
	pulumi.Input

	ToDedicatedIpAssignmentArrayOutput() DedicatedIpAssignmentArrayOutput
	ToDedicatedIpAssignmentArrayOutputWithContext(context.Context) DedicatedIpAssignmentArrayOutput
}

type DedicatedIpAssignmentArray []DedicatedIpAssignmentInput

func (DedicatedIpAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedIpAssignment)(nil)).Elem()
}

func (i DedicatedIpAssignmentArray) ToDedicatedIpAssignmentArrayOutput() DedicatedIpAssignmentArrayOutput {
	return i.ToDedicatedIpAssignmentArrayOutputWithContext(context.Background())
}

func (i DedicatedIpAssignmentArray) ToDedicatedIpAssignmentArrayOutputWithContext(ctx context.Context) DedicatedIpAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedIpAssignmentArrayOutput)
}

// DedicatedIpAssignmentMapInput is an input type that accepts DedicatedIpAssignmentMap and DedicatedIpAssignmentMapOutput values.
// You can construct a concrete instance of `DedicatedIpAssignmentMapInput` via:
//
//	DedicatedIpAssignmentMap{ "key": DedicatedIpAssignmentArgs{...} }
type DedicatedIpAssignmentMapInput interface {
	pulumi.Input

	ToDedicatedIpAssignmentMapOutput() DedicatedIpAssignmentMapOutput
	ToDedicatedIpAssignmentMapOutputWithContext(context.Context) DedicatedIpAssignmentMapOutput
}

type DedicatedIpAssignmentMap map[string]DedicatedIpAssignmentInput

func (DedicatedIpAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedIpAssignment)(nil)).Elem()
}

func (i DedicatedIpAssignmentMap) ToDedicatedIpAssignmentMapOutput() DedicatedIpAssignmentMapOutput {
	return i.ToDedicatedIpAssignmentMapOutputWithContext(context.Background())
}

func (i DedicatedIpAssignmentMap) ToDedicatedIpAssignmentMapOutputWithContext(ctx context.Context) DedicatedIpAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedIpAssignmentMapOutput)
}

type DedicatedIpAssignmentOutput struct{ *pulumi.OutputState }

func (DedicatedIpAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedIpAssignment)(nil)).Elem()
}

func (o DedicatedIpAssignmentOutput) ToDedicatedIpAssignmentOutput() DedicatedIpAssignmentOutput {
	return o
}

func (o DedicatedIpAssignmentOutput) ToDedicatedIpAssignmentOutputWithContext(ctx context.Context) DedicatedIpAssignmentOutput {
	return o
}

// Dedicated IP address.
func (o DedicatedIpAssignmentOutput) DestinationPoolName() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedIpAssignment) pulumi.StringOutput { return v.DestinationPoolName }).(pulumi.StringOutput)
}

// Dedicated IP address.
func (o DedicatedIpAssignmentOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedIpAssignment) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

type DedicatedIpAssignmentArrayOutput struct{ *pulumi.OutputState }

func (DedicatedIpAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedIpAssignment)(nil)).Elem()
}

func (o DedicatedIpAssignmentArrayOutput) ToDedicatedIpAssignmentArrayOutput() DedicatedIpAssignmentArrayOutput {
	return o
}

func (o DedicatedIpAssignmentArrayOutput) ToDedicatedIpAssignmentArrayOutputWithContext(ctx context.Context) DedicatedIpAssignmentArrayOutput {
	return o
}

func (o DedicatedIpAssignmentArrayOutput) Index(i pulumi.IntInput) DedicatedIpAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DedicatedIpAssignment {
		return vs[0].([]*DedicatedIpAssignment)[vs[1].(int)]
	}).(DedicatedIpAssignmentOutput)
}

type DedicatedIpAssignmentMapOutput struct{ *pulumi.OutputState }

func (DedicatedIpAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedIpAssignment)(nil)).Elem()
}

func (o DedicatedIpAssignmentMapOutput) ToDedicatedIpAssignmentMapOutput() DedicatedIpAssignmentMapOutput {
	return o
}

func (o DedicatedIpAssignmentMapOutput) ToDedicatedIpAssignmentMapOutputWithContext(ctx context.Context) DedicatedIpAssignmentMapOutput {
	return o
}

func (o DedicatedIpAssignmentMapOutput) MapIndex(k pulumi.StringInput) DedicatedIpAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DedicatedIpAssignment {
		return vs[0].(map[string]*DedicatedIpAssignment)[vs[1].(string)]
	}).(DedicatedIpAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedIpAssignmentInput)(nil)).Elem(), &DedicatedIpAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedIpAssignmentArrayInput)(nil)).Elem(), DedicatedIpAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedIpAssignmentMapInput)(nil)).Elem(), DedicatedIpAssignmentMap{})
	pulumi.RegisterOutputType(DedicatedIpAssignmentOutput{})
	pulumi.RegisterOutputType(DedicatedIpAssignmentArrayOutput{})
	pulumi.RegisterOutputType(DedicatedIpAssignmentMapOutput{})
}
