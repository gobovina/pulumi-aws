// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			main, err := route53.NewDelegationSet(ctx, "main", &route53.DelegationSetArgs{
//				ReferenceName: pulumi.String("DynDNS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewZone(ctx, "primary", &route53.ZoneArgs{
//				Name:            pulumi.String("mydomain.com"),
//				DelegationSetId: main.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewZone(ctx, "secondary", &route53.ZoneArgs{
//				Name:            pulumi.String("coolcompany.io"),
//				DelegationSetId: main.ID(),
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
// Using `pulumi import`, import Route53 Delegation Sets using the delegation set `id`. For example:
//
// ```sh
// $ pulumi import aws:route53/delegationSet:DelegationSet set1 N1PA6795SAMPLE
// ```
type DelegationSet struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Delegation Set.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A list of authoritative name servers for the hosted zone
	// (effectively a list of NS records).
	NameServers pulumi.StringArrayOutput `pulumi:"nameServers"`
	// This is a reference name used in Caller Reference
	// (helpful for identifying single delegation set amongst others)
	ReferenceName pulumi.StringPtrOutput `pulumi:"referenceName"`
}

// NewDelegationSet registers a new resource with the given unique name, arguments, and options.
func NewDelegationSet(ctx *pulumi.Context,
	name string, args *DelegationSetArgs, opts ...pulumi.ResourceOption) (*DelegationSet, error) {
	if args == nil {
		args = &DelegationSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DelegationSet
	err := ctx.RegisterResource("aws:route53/delegationSet:DelegationSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDelegationSet gets an existing DelegationSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDelegationSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DelegationSetState, opts ...pulumi.ResourceOption) (*DelegationSet, error) {
	var resource DelegationSet
	err := ctx.ReadResource("aws:route53/delegationSet:DelegationSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DelegationSet resources.
type delegationSetState struct {
	// The Amazon Resource Name (ARN) of the Delegation Set.
	Arn *string `pulumi:"arn"`
	// A list of authoritative name servers for the hosted zone
	// (effectively a list of NS records).
	NameServers []string `pulumi:"nameServers"`
	// This is a reference name used in Caller Reference
	// (helpful for identifying single delegation set amongst others)
	ReferenceName *string `pulumi:"referenceName"`
}

type DelegationSetState struct {
	// The Amazon Resource Name (ARN) of the Delegation Set.
	Arn pulumi.StringPtrInput
	// A list of authoritative name servers for the hosted zone
	// (effectively a list of NS records).
	NameServers pulumi.StringArrayInput
	// This is a reference name used in Caller Reference
	// (helpful for identifying single delegation set amongst others)
	ReferenceName pulumi.StringPtrInput
}

func (DelegationSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*delegationSetState)(nil)).Elem()
}

type delegationSetArgs struct {
	// This is a reference name used in Caller Reference
	// (helpful for identifying single delegation set amongst others)
	ReferenceName *string `pulumi:"referenceName"`
}

// The set of arguments for constructing a DelegationSet resource.
type DelegationSetArgs struct {
	// This is a reference name used in Caller Reference
	// (helpful for identifying single delegation set amongst others)
	ReferenceName pulumi.StringPtrInput
}

func (DelegationSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*delegationSetArgs)(nil)).Elem()
}

type DelegationSetInput interface {
	pulumi.Input

	ToDelegationSetOutput() DelegationSetOutput
	ToDelegationSetOutputWithContext(ctx context.Context) DelegationSetOutput
}

func (*DelegationSet) ElementType() reflect.Type {
	return reflect.TypeOf((**DelegationSet)(nil)).Elem()
}

func (i *DelegationSet) ToDelegationSetOutput() DelegationSetOutput {
	return i.ToDelegationSetOutputWithContext(context.Background())
}

func (i *DelegationSet) ToDelegationSetOutputWithContext(ctx context.Context) DelegationSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegationSetOutput)
}

// DelegationSetArrayInput is an input type that accepts DelegationSetArray and DelegationSetArrayOutput values.
// You can construct a concrete instance of `DelegationSetArrayInput` via:
//
//	DelegationSetArray{ DelegationSetArgs{...} }
type DelegationSetArrayInput interface {
	pulumi.Input

	ToDelegationSetArrayOutput() DelegationSetArrayOutput
	ToDelegationSetArrayOutputWithContext(context.Context) DelegationSetArrayOutput
}

type DelegationSetArray []DelegationSetInput

func (DelegationSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DelegationSet)(nil)).Elem()
}

func (i DelegationSetArray) ToDelegationSetArrayOutput() DelegationSetArrayOutput {
	return i.ToDelegationSetArrayOutputWithContext(context.Background())
}

func (i DelegationSetArray) ToDelegationSetArrayOutputWithContext(ctx context.Context) DelegationSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegationSetArrayOutput)
}

// DelegationSetMapInput is an input type that accepts DelegationSetMap and DelegationSetMapOutput values.
// You can construct a concrete instance of `DelegationSetMapInput` via:
//
//	DelegationSetMap{ "key": DelegationSetArgs{...} }
type DelegationSetMapInput interface {
	pulumi.Input

	ToDelegationSetMapOutput() DelegationSetMapOutput
	ToDelegationSetMapOutputWithContext(context.Context) DelegationSetMapOutput
}

type DelegationSetMap map[string]DelegationSetInput

func (DelegationSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DelegationSet)(nil)).Elem()
}

func (i DelegationSetMap) ToDelegationSetMapOutput() DelegationSetMapOutput {
	return i.ToDelegationSetMapOutputWithContext(context.Background())
}

func (i DelegationSetMap) ToDelegationSetMapOutputWithContext(ctx context.Context) DelegationSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DelegationSetMapOutput)
}

type DelegationSetOutput struct{ *pulumi.OutputState }

func (DelegationSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DelegationSet)(nil)).Elem()
}

func (o DelegationSetOutput) ToDelegationSetOutput() DelegationSetOutput {
	return o
}

func (o DelegationSetOutput) ToDelegationSetOutputWithContext(ctx context.Context) DelegationSetOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Delegation Set.
func (o DelegationSetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *DelegationSet) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A list of authoritative name servers for the hosted zone
// (effectively a list of NS records).
func (o DelegationSetOutput) NameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DelegationSet) pulumi.StringArrayOutput { return v.NameServers }).(pulumi.StringArrayOutput)
}

// This is a reference name used in Caller Reference
// (helpful for identifying single delegation set amongst others)
func (o DelegationSetOutput) ReferenceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DelegationSet) pulumi.StringPtrOutput { return v.ReferenceName }).(pulumi.StringPtrOutput)
}

type DelegationSetArrayOutput struct{ *pulumi.OutputState }

func (DelegationSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DelegationSet)(nil)).Elem()
}

func (o DelegationSetArrayOutput) ToDelegationSetArrayOutput() DelegationSetArrayOutput {
	return o
}

func (o DelegationSetArrayOutput) ToDelegationSetArrayOutputWithContext(ctx context.Context) DelegationSetArrayOutput {
	return o
}

func (o DelegationSetArrayOutput) Index(i pulumi.IntInput) DelegationSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DelegationSet {
		return vs[0].([]*DelegationSet)[vs[1].(int)]
	}).(DelegationSetOutput)
}

type DelegationSetMapOutput struct{ *pulumi.OutputState }

func (DelegationSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DelegationSet)(nil)).Elem()
}

func (o DelegationSetMapOutput) ToDelegationSetMapOutput() DelegationSetMapOutput {
	return o
}

func (o DelegationSetMapOutput) ToDelegationSetMapOutputWithContext(ctx context.Context) DelegationSetMapOutput {
	return o
}

func (o DelegationSetMapOutput) MapIndex(k pulumi.StringInput) DelegationSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DelegationSet {
		return vs[0].(map[string]*DelegationSet)[vs[1].(string)]
	}).(DelegationSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DelegationSetInput)(nil)).Elem(), &DelegationSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegationSetArrayInput)(nil)).Elem(), DelegationSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DelegationSetMapInput)(nil)).Elem(), DelegationSetMap{})
	pulumi.RegisterOutputType(DelegationSetOutput{})
	pulumi.RegisterOutputType(DelegationSetArrayOutput{})
	pulumi.RegisterOutputType(DelegationSetMapOutput{})
}
