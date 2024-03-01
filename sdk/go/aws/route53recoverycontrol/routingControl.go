// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53recoverycontrol

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Route 53 Recovery Control Config Routing Control.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53recoverycontrol"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53recoverycontrol.NewRoutingControl(ctx, "example", &route53recoverycontrol.RoutingControlArgs{
//				Name:       pulumi.String("tinlicker"),
//				ClusterArn: pulumi.String("arn:aws:route53-recovery-control::881188118811:cluster/8d47920e-d789-437d-803a-2dcc4b204393"),
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
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53recoverycontrol"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53recoverycontrol.NewRoutingControl(ctx, "example", &route53recoverycontrol.RoutingControlArgs{
//				Name:            pulumi.String("thomasoliver"),
//				ClusterArn:      pulumi.String("arn:aws:route53-recovery-control::881188118811:cluster/8d47920e-d789-437d-803a-2dcc4b204393"),
//				ControlPanelArn: pulumi.String("arn:aws:route53-recovery-control::428113431245:controlpanel/abd5fbfc052d4844a082dbf400f61da8"),
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
// Using `pulumi import`, import Route53 Recovery Control Config Routing Control using the routing control arn. For example:
//
// ```sh
//
//	$ pulumi import aws:route53recoverycontrol/routingControl:RoutingControl mycontrol arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8/routingcontrol/d5d90e587870494b
//
// ```
type RoutingControl struct {
	pulumi.CustomResourceState

	// ARN of the routing control.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ARN of the cluster in which this routing control will reside.
	ClusterArn pulumi.StringOutput `pulumi:"clusterArn"`
	// ARN of the control panel in which this routing control will reside.
	ControlPanelArn pulumi.StringOutput `pulumi:"controlPanelArn"`
	// The name describing the routing control.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewRoutingControl registers a new resource with the given unique name, arguments, and options.
func NewRoutingControl(ctx *pulumi.Context,
	name string, args *RoutingControlArgs, opts ...pulumi.ResourceOption) (*RoutingControl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterArn == nil {
		return nil, errors.New("invalid value for required argument 'ClusterArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoutingControl
	err := ctx.RegisterResource("aws:route53recoverycontrol/routingControl:RoutingControl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoutingControl gets an existing RoutingControl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoutingControl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoutingControlState, opts ...pulumi.ResourceOption) (*RoutingControl, error) {
	var resource RoutingControl
	err := ctx.ReadResource("aws:route53recoverycontrol/routingControl:RoutingControl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoutingControl resources.
type routingControlState struct {
	// ARN of the routing control.
	Arn *string `pulumi:"arn"`
	// ARN of the cluster in which this routing control will reside.
	ClusterArn *string `pulumi:"clusterArn"`
	// ARN of the control panel in which this routing control will reside.
	ControlPanelArn *string `pulumi:"controlPanelArn"`
	// The name describing the routing control.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status *string `pulumi:"status"`
}

type RoutingControlState struct {
	// ARN of the routing control.
	Arn pulumi.StringPtrInput
	// ARN of the cluster in which this routing control will reside.
	ClusterArn pulumi.StringPtrInput
	// ARN of the control panel in which this routing control will reside.
	ControlPanelArn pulumi.StringPtrInput
	// The name describing the routing control.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
	Status pulumi.StringPtrInput
}

func (RoutingControlState) ElementType() reflect.Type {
	return reflect.TypeOf((*routingControlState)(nil)).Elem()
}

type routingControlArgs struct {
	// ARN of the cluster in which this routing control will reside.
	ClusterArn string `pulumi:"clusterArn"`
	// ARN of the control panel in which this routing control will reside.
	ControlPanelArn *string `pulumi:"controlPanelArn"`
	// The name describing the routing control.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a RoutingControl resource.
type RoutingControlArgs struct {
	// ARN of the cluster in which this routing control will reside.
	ClusterArn pulumi.StringInput
	// ARN of the control panel in which this routing control will reside.
	ControlPanelArn pulumi.StringPtrInput
	// The name describing the routing control.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
}

func (RoutingControlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routingControlArgs)(nil)).Elem()
}

type RoutingControlInput interface {
	pulumi.Input

	ToRoutingControlOutput() RoutingControlOutput
	ToRoutingControlOutputWithContext(ctx context.Context) RoutingControlOutput
}

func (*RoutingControl) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingControl)(nil)).Elem()
}

func (i *RoutingControl) ToRoutingControlOutput() RoutingControlOutput {
	return i.ToRoutingControlOutputWithContext(context.Background())
}

func (i *RoutingControl) ToRoutingControlOutputWithContext(ctx context.Context) RoutingControlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingControlOutput)
}

// RoutingControlArrayInput is an input type that accepts RoutingControlArray and RoutingControlArrayOutput values.
// You can construct a concrete instance of `RoutingControlArrayInput` via:
//
//	RoutingControlArray{ RoutingControlArgs{...} }
type RoutingControlArrayInput interface {
	pulumi.Input

	ToRoutingControlArrayOutput() RoutingControlArrayOutput
	ToRoutingControlArrayOutputWithContext(context.Context) RoutingControlArrayOutput
}

type RoutingControlArray []RoutingControlInput

func (RoutingControlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingControl)(nil)).Elem()
}

func (i RoutingControlArray) ToRoutingControlArrayOutput() RoutingControlArrayOutput {
	return i.ToRoutingControlArrayOutputWithContext(context.Background())
}

func (i RoutingControlArray) ToRoutingControlArrayOutputWithContext(ctx context.Context) RoutingControlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingControlArrayOutput)
}

// RoutingControlMapInput is an input type that accepts RoutingControlMap and RoutingControlMapOutput values.
// You can construct a concrete instance of `RoutingControlMapInput` via:
//
//	RoutingControlMap{ "key": RoutingControlArgs{...} }
type RoutingControlMapInput interface {
	pulumi.Input

	ToRoutingControlMapOutput() RoutingControlMapOutput
	ToRoutingControlMapOutputWithContext(context.Context) RoutingControlMapOutput
}

type RoutingControlMap map[string]RoutingControlInput

func (RoutingControlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingControl)(nil)).Elem()
}

func (i RoutingControlMap) ToRoutingControlMapOutput() RoutingControlMapOutput {
	return i.ToRoutingControlMapOutputWithContext(context.Background())
}

func (i RoutingControlMap) ToRoutingControlMapOutputWithContext(ctx context.Context) RoutingControlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoutingControlMapOutput)
}

type RoutingControlOutput struct{ *pulumi.OutputState }

func (RoutingControlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoutingControl)(nil)).Elem()
}

func (o RoutingControlOutput) ToRoutingControlOutput() RoutingControlOutput {
	return o
}

func (o RoutingControlOutput) ToRoutingControlOutputWithContext(ctx context.Context) RoutingControlOutput {
	return o
}

// ARN of the routing control.
func (o RoutingControlOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingControl) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ARN of the cluster in which this routing control will reside.
func (o RoutingControlOutput) ClusterArn() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingControl) pulumi.StringOutput { return v.ClusterArn }).(pulumi.StringOutput)
}

// ARN of the control panel in which this routing control will reside.
func (o RoutingControlOutput) ControlPanelArn() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingControl) pulumi.StringOutput { return v.ControlPanelArn }).(pulumi.StringOutput)
}

// The name describing the routing control.
//
// The following arguments are optional:
func (o RoutingControlOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingControl) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
func (o RoutingControlOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RoutingControl) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type RoutingControlArrayOutput struct{ *pulumi.OutputState }

func (RoutingControlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoutingControl)(nil)).Elem()
}

func (o RoutingControlArrayOutput) ToRoutingControlArrayOutput() RoutingControlArrayOutput {
	return o
}

func (o RoutingControlArrayOutput) ToRoutingControlArrayOutputWithContext(ctx context.Context) RoutingControlArrayOutput {
	return o
}

func (o RoutingControlArrayOutput) Index(i pulumi.IntInput) RoutingControlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoutingControl {
		return vs[0].([]*RoutingControl)[vs[1].(int)]
	}).(RoutingControlOutput)
}

type RoutingControlMapOutput struct{ *pulumi.OutputState }

func (RoutingControlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoutingControl)(nil)).Elem()
}

func (o RoutingControlMapOutput) ToRoutingControlMapOutput() RoutingControlMapOutput {
	return o
}

func (o RoutingControlMapOutput) ToRoutingControlMapOutputWithContext(ctx context.Context) RoutingControlMapOutput {
	return o
}

func (o RoutingControlMapOutput) MapIndex(k pulumi.StringInput) RoutingControlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoutingControl {
		return vs[0].(map[string]*RoutingControl)[vs[1].(string)]
	}).(RoutingControlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingControlInput)(nil)).Elem(), &RoutingControl{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingControlArrayInput)(nil)).Elem(), RoutingControlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoutingControlMapInput)(nil)).Elem(), RoutingControlMap{})
	pulumi.RegisterOutputType(RoutingControlOutput{})
	pulumi.RegisterOutputType(RoutingControlArrayOutput{})
	pulumi.RegisterOutputType(RoutingControlMapOutput{})
}
