// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Route53 Resolver rule association.
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
//			_, err := route53.NewResolverRuleAssociation(ctx, "example", &route53.ResolverRuleAssociationArgs{
//				ResolverRuleId: pulumi.Any(sys.Id),
//				VpcId:          pulumi.Any(foo.Id),
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
// Using `pulumi import`, import Route53 Resolver rule associations using the `id`. For example:
//
// ```sh
// $ pulumi import aws:route53/resolverRuleAssociation:ResolverRuleAssociation example rslvr-rrassoc-97242eaf88example
// ```
type ResolverRuleAssociation struct {
	pulumi.CustomResourceState

	// A name for the association that you're creating between a resolver rule and a VPC.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the resolver rule that you want to associate with the VPC.
	ResolverRuleId pulumi.StringOutput `pulumi:"resolverRuleId"`
	// The ID of the VPC that you want to associate the resolver rule with.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewResolverRuleAssociation registers a new resource with the given unique name, arguments, and options.
func NewResolverRuleAssociation(ctx *pulumi.Context,
	name string, args *ResolverRuleAssociationArgs, opts ...pulumi.ResourceOption) (*ResolverRuleAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResolverRuleId == nil {
		return nil, errors.New("invalid value for required argument 'ResolverRuleId'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResolverRuleAssociation
	err := ctx.RegisterResource("aws:route53/resolverRuleAssociation:ResolverRuleAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverRuleAssociation gets an existing ResolverRuleAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverRuleAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverRuleAssociationState, opts ...pulumi.ResourceOption) (*ResolverRuleAssociation, error) {
	var resource ResolverRuleAssociation
	err := ctx.ReadResource("aws:route53/resolverRuleAssociation:ResolverRuleAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverRuleAssociation resources.
type resolverRuleAssociationState struct {
	// A name for the association that you're creating between a resolver rule and a VPC.
	Name *string `pulumi:"name"`
	// The ID of the resolver rule that you want to associate with the VPC.
	ResolverRuleId *string `pulumi:"resolverRuleId"`
	// The ID of the VPC that you want to associate the resolver rule with.
	VpcId *string `pulumi:"vpcId"`
}

type ResolverRuleAssociationState struct {
	// A name for the association that you're creating between a resolver rule and a VPC.
	Name pulumi.StringPtrInput
	// The ID of the resolver rule that you want to associate with the VPC.
	ResolverRuleId pulumi.StringPtrInput
	// The ID of the VPC that you want to associate the resolver rule with.
	VpcId pulumi.StringPtrInput
}

func (ResolverRuleAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverRuleAssociationState)(nil)).Elem()
}

type resolverRuleAssociationArgs struct {
	// A name for the association that you're creating between a resolver rule and a VPC.
	Name *string `pulumi:"name"`
	// The ID of the resolver rule that you want to associate with the VPC.
	ResolverRuleId string `pulumi:"resolverRuleId"`
	// The ID of the VPC that you want to associate the resolver rule with.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a ResolverRuleAssociation resource.
type ResolverRuleAssociationArgs struct {
	// A name for the association that you're creating between a resolver rule and a VPC.
	Name pulumi.StringPtrInput
	// The ID of the resolver rule that you want to associate with the VPC.
	ResolverRuleId pulumi.StringInput
	// The ID of the VPC that you want to associate the resolver rule with.
	VpcId pulumi.StringInput
}

func (ResolverRuleAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverRuleAssociationArgs)(nil)).Elem()
}

type ResolverRuleAssociationInput interface {
	pulumi.Input

	ToResolverRuleAssociationOutput() ResolverRuleAssociationOutput
	ToResolverRuleAssociationOutputWithContext(ctx context.Context) ResolverRuleAssociationOutput
}

func (*ResolverRuleAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverRuleAssociation)(nil)).Elem()
}

func (i *ResolverRuleAssociation) ToResolverRuleAssociationOutput() ResolverRuleAssociationOutput {
	return i.ToResolverRuleAssociationOutputWithContext(context.Background())
}

func (i *ResolverRuleAssociation) ToResolverRuleAssociationOutputWithContext(ctx context.Context) ResolverRuleAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverRuleAssociationOutput)
}

// ResolverRuleAssociationArrayInput is an input type that accepts ResolverRuleAssociationArray and ResolverRuleAssociationArrayOutput values.
// You can construct a concrete instance of `ResolverRuleAssociationArrayInput` via:
//
//	ResolverRuleAssociationArray{ ResolverRuleAssociationArgs{...} }
type ResolverRuleAssociationArrayInput interface {
	pulumi.Input

	ToResolverRuleAssociationArrayOutput() ResolverRuleAssociationArrayOutput
	ToResolverRuleAssociationArrayOutputWithContext(context.Context) ResolverRuleAssociationArrayOutput
}

type ResolverRuleAssociationArray []ResolverRuleAssociationInput

func (ResolverRuleAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverRuleAssociation)(nil)).Elem()
}

func (i ResolverRuleAssociationArray) ToResolverRuleAssociationArrayOutput() ResolverRuleAssociationArrayOutput {
	return i.ToResolverRuleAssociationArrayOutputWithContext(context.Background())
}

func (i ResolverRuleAssociationArray) ToResolverRuleAssociationArrayOutputWithContext(ctx context.Context) ResolverRuleAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverRuleAssociationArrayOutput)
}

// ResolverRuleAssociationMapInput is an input type that accepts ResolverRuleAssociationMap and ResolverRuleAssociationMapOutput values.
// You can construct a concrete instance of `ResolverRuleAssociationMapInput` via:
//
//	ResolverRuleAssociationMap{ "key": ResolverRuleAssociationArgs{...} }
type ResolverRuleAssociationMapInput interface {
	pulumi.Input

	ToResolverRuleAssociationMapOutput() ResolverRuleAssociationMapOutput
	ToResolverRuleAssociationMapOutputWithContext(context.Context) ResolverRuleAssociationMapOutput
}

type ResolverRuleAssociationMap map[string]ResolverRuleAssociationInput

func (ResolverRuleAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverRuleAssociation)(nil)).Elem()
}

func (i ResolverRuleAssociationMap) ToResolverRuleAssociationMapOutput() ResolverRuleAssociationMapOutput {
	return i.ToResolverRuleAssociationMapOutputWithContext(context.Background())
}

func (i ResolverRuleAssociationMap) ToResolverRuleAssociationMapOutputWithContext(ctx context.Context) ResolverRuleAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverRuleAssociationMapOutput)
}

type ResolverRuleAssociationOutput struct{ *pulumi.OutputState }

func (ResolverRuleAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverRuleAssociation)(nil)).Elem()
}

func (o ResolverRuleAssociationOutput) ToResolverRuleAssociationOutput() ResolverRuleAssociationOutput {
	return o
}

func (o ResolverRuleAssociationOutput) ToResolverRuleAssociationOutputWithContext(ctx context.Context) ResolverRuleAssociationOutput {
	return o
}

// A name for the association that you're creating between a resolver rule and a VPC.
func (o ResolverRuleAssociationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverRuleAssociation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the resolver rule that you want to associate with the VPC.
func (o ResolverRuleAssociationOutput) ResolverRuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverRuleAssociation) pulumi.StringOutput { return v.ResolverRuleId }).(pulumi.StringOutput)
}

// The ID of the VPC that you want to associate the resolver rule with.
func (o ResolverRuleAssociationOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverRuleAssociation) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type ResolverRuleAssociationArrayOutput struct{ *pulumi.OutputState }

func (ResolverRuleAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverRuleAssociation)(nil)).Elem()
}

func (o ResolverRuleAssociationArrayOutput) ToResolverRuleAssociationArrayOutput() ResolverRuleAssociationArrayOutput {
	return o
}

func (o ResolverRuleAssociationArrayOutput) ToResolverRuleAssociationArrayOutputWithContext(ctx context.Context) ResolverRuleAssociationArrayOutput {
	return o
}

func (o ResolverRuleAssociationArrayOutput) Index(i pulumi.IntInput) ResolverRuleAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverRuleAssociation {
		return vs[0].([]*ResolverRuleAssociation)[vs[1].(int)]
	}).(ResolverRuleAssociationOutput)
}

type ResolverRuleAssociationMapOutput struct{ *pulumi.OutputState }

func (ResolverRuleAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverRuleAssociation)(nil)).Elem()
}

func (o ResolverRuleAssociationMapOutput) ToResolverRuleAssociationMapOutput() ResolverRuleAssociationMapOutput {
	return o
}

func (o ResolverRuleAssociationMapOutput) ToResolverRuleAssociationMapOutputWithContext(ctx context.Context) ResolverRuleAssociationMapOutput {
	return o
}

func (o ResolverRuleAssociationMapOutput) MapIndex(k pulumi.StringInput) ResolverRuleAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverRuleAssociation {
		return vs[0].(map[string]*ResolverRuleAssociation)[vs[1].(string)]
	}).(ResolverRuleAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverRuleAssociationInput)(nil)).Elem(), &ResolverRuleAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverRuleAssociationArrayInput)(nil)).Elem(), ResolverRuleAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverRuleAssociationMapInput)(nil)).Elem(), ResolverRuleAssociationMap{})
	pulumi.RegisterOutputType(ResolverRuleAssociationOutput{})
	pulumi.RegisterOutputType(ResolverRuleAssociationArrayOutput{})
	pulumi.RegisterOutputType(ResolverRuleAssociationMapOutput{})
}
