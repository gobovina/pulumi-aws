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

// Provides a Route 53 Resolver query logging configuration association resource.
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
//			_, err := route53.NewResolverQueryLogConfigAssociation(ctx, "example", &route53.ResolverQueryLogConfigAssociationArgs{
//				ResolverQueryLogConfigId: pulumi.Any(exampleAwsRoute53ResolverQueryLogConfig.Id),
//				ResourceId:               pulumi.Any(exampleAwsVpc.Id),
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
// Using `pulumi import`, import  Route 53 Resolver query logging configuration associations using the Route 53 Resolver query logging configuration association ID. For example:
//
// ```sh
// $ pulumi import aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation example rqlca-b320624fef3c4d70
// ```
type ResolverQueryLogConfigAssociation struct {
	pulumi.CustomResourceState

	// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
	ResolverQueryLogConfigId pulumi.StringOutput `pulumi:"resolverQueryLogConfigId"`
	// The ID of a VPC that you want this query logging configuration to log queries for.
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
}

// NewResolverQueryLogConfigAssociation registers a new resource with the given unique name, arguments, and options.
func NewResolverQueryLogConfigAssociation(ctx *pulumi.Context,
	name string, args *ResolverQueryLogConfigAssociationArgs, opts ...pulumi.ResourceOption) (*ResolverQueryLogConfigAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResolverQueryLogConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ResolverQueryLogConfigId'")
	}
	if args.ResourceId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResolverQueryLogConfigAssociation
	err := ctx.RegisterResource("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverQueryLogConfigAssociation gets an existing ResolverQueryLogConfigAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverQueryLogConfigAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverQueryLogConfigAssociationState, opts ...pulumi.ResourceOption) (*ResolverQueryLogConfigAssociation, error) {
	var resource ResolverQueryLogConfigAssociation
	err := ctx.ReadResource("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverQueryLogConfigAssociation resources.
type resolverQueryLogConfigAssociationState struct {
	// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
	ResolverQueryLogConfigId *string `pulumi:"resolverQueryLogConfigId"`
	// The ID of a VPC that you want this query logging configuration to log queries for.
	ResourceId *string `pulumi:"resourceId"`
}

type ResolverQueryLogConfigAssociationState struct {
	// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
	ResolverQueryLogConfigId pulumi.StringPtrInput
	// The ID of a VPC that you want this query logging configuration to log queries for.
	ResourceId pulumi.StringPtrInput
}

func (ResolverQueryLogConfigAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverQueryLogConfigAssociationState)(nil)).Elem()
}

type resolverQueryLogConfigAssociationArgs struct {
	// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
	ResolverQueryLogConfigId string `pulumi:"resolverQueryLogConfigId"`
	// The ID of a VPC that you want this query logging configuration to log queries for.
	ResourceId string `pulumi:"resourceId"`
}

// The set of arguments for constructing a ResolverQueryLogConfigAssociation resource.
type ResolverQueryLogConfigAssociationArgs struct {
	// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
	ResolverQueryLogConfigId pulumi.StringInput
	// The ID of a VPC that you want this query logging configuration to log queries for.
	ResourceId pulumi.StringInput
}

func (ResolverQueryLogConfigAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverQueryLogConfigAssociationArgs)(nil)).Elem()
}

type ResolverQueryLogConfigAssociationInput interface {
	pulumi.Input

	ToResolverQueryLogConfigAssociationOutput() ResolverQueryLogConfigAssociationOutput
	ToResolverQueryLogConfigAssociationOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationOutput
}

func (*ResolverQueryLogConfigAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (i *ResolverQueryLogConfigAssociation) ToResolverQueryLogConfigAssociationOutput() ResolverQueryLogConfigAssociationOutput {
	return i.ToResolverQueryLogConfigAssociationOutputWithContext(context.Background())
}

func (i *ResolverQueryLogConfigAssociation) ToResolverQueryLogConfigAssociationOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverQueryLogConfigAssociationOutput)
}

// ResolverQueryLogConfigAssociationArrayInput is an input type that accepts ResolverQueryLogConfigAssociationArray and ResolverQueryLogConfigAssociationArrayOutput values.
// You can construct a concrete instance of `ResolverQueryLogConfigAssociationArrayInput` via:
//
//	ResolverQueryLogConfigAssociationArray{ ResolverQueryLogConfigAssociationArgs{...} }
type ResolverQueryLogConfigAssociationArrayInput interface {
	pulumi.Input

	ToResolverQueryLogConfigAssociationArrayOutput() ResolverQueryLogConfigAssociationArrayOutput
	ToResolverQueryLogConfigAssociationArrayOutputWithContext(context.Context) ResolverQueryLogConfigAssociationArrayOutput
}

type ResolverQueryLogConfigAssociationArray []ResolverQueryLogConfigAssociationInput

func (ResolverQueryLogConfigAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (i ResolverQueryLogConfigAssociationArray) ToResolverQueryLogConfigAssociationArrayOutput() ResolverQueryLogConfigAssociationArrayOutput {
	return i.ToResolverQueryLogConfigAssociationArrayOutputWithContext(context.Background())
}

func (i ResolverQueryLogConfigAssociationArray) ToResolverQueryLogConfigAssociationArrayOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverQueryLogConfigAssociationArrayOutput)
}

// ResolverQueryLogConfigAssociationMapInput is an input type that accepts ResolverQueryLogConfigAssociationMap and ResolverQueryLogConfigAssociationMapOutput values.
// You can construct a concrete instance of `ResolverQueryLogConfigAssociationMapInput` via:
//
//	ResolverQueryLogConfigAssociationMap{ "key": ResolverQueryLogConfigAssociationArgs{...} }
type ResolverQueryLogConfigAssociationMapInput interface {
	pulumi.Input

	ToResolverQueryLogConfigAssociationMapOutput() ResolverQueryLogConfigAssociationMapOutput
	ToResolverQueryLogConfigAssociationMapOutputWithContext(context.Context) ResolverQueryLogConfigAssociationMapOutput
}

type ResolverQueryLogConfigAssociationMap map[string]ResolverQueryLogConfigAssociationInput

func (ResolverQueryLogConfigAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (i ResolverQueryLogConfigAssociationMap) ToResolverQueryLogConfigAssociationMapOutput() ResolverQueryLogConfigAssociationMapOutput {
	return i.ToResolverQueryLogConfigAssociationMapOutputWithContext(context.Background())
}

func (i ResolverQueryLogConfigAssociationMap) ToResolverQueryLogConfigAssociationMapOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverQueryLogConfigAssociationMapOutput)
}

type ResolverQueryLogConfigAssociationOutput struct{ *pulumi.OutputState }

func (ResolverQueryLogConfigAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (o ResolverQueryLogConfigAssociationOutput) ToResolverQueryLogConfigAssociationOutput() ResolverQueryLogConfigAssociationOutput {
	return o
}

func (o ResolverQueryLogConfigAssociationOutput) ToResolverQueryLogConfigAssociationOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationOutput {
	return o
}

// The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
func (o ResolverQueryLogConfigAssociationOutput) ResolverQueryLogConfigId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverQueryLogConfigAssociation) pulumi.StringOutput { return v.ResolverQueryLogConfigId }).(pulumi.StringOutput)
}

// The ID of a VPC that you want this query logging configuration to log queries for.
func (o ResolverQueryLogConfigAssociationOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverQueryLogConfigAssociation) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

type ResolverQueryLogConfigAssociationArrayOutput struct{ *pulumi.OutputState }

func (ResolverQueryLogConfigAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (o ResolverQueryLogConfigAssociationArrayOutput) ToResolverQueryLogConfigAssociationArrayOutput() ResolverQueryLogConfigAssociationArrayOutput {
	return o
}

func (o ResolverQueryLogConfigAssociationArrayOutput) ToResolverQueryLogConfigAssociationArrayOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationArrayOutput {
	return o
}

func (o ResolverQueryLogConfigAssociationArrayOutput) Index(i pulumi.IntInput) ResolverQueryLogConfigAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverQueryLogConfigAssociation {
		return vs[0].([]*ResolverQueryLogConfigAssociation)[vs[1].(int)]
	}).(ResolverQueryLogConfigAssociationOutput)
}

type ResolverQueryLogConfigAssociationMapOutput struct{ *pulumi.OutputState }

func (ResolverQueryLogConfigAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverQueryLogConfigAssociation)(nil)).Elem()
}

func (o ResolverQueryLogConfigAssociationMapOutput) ToResolverQueryLogConfigAssociationMapOutput() ResolverQueryLogConfigAssociationMapOutput {
	return o
}

func (o ResolverQueryLogConfigAssociationMapOutput) ToResolverQueryLogConfigAssociationMapOutputWithContext(ctx context.Context) ResolverQueryLogConfigAssociationMapOutput {
	return o
}

func (o ResolverQueryLogConfigAssociationMapOutput) MapIndex(k pulumi.StringInput) ResolverQueryLogConfigAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverQueryLogConfigAssociation {
		return vs[0].(map[string]*ResolverQueryLogConfigAssociation)[vs[1].(string)]
	}).(ResolverQueryLogConfigAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverQueryLogConfigAssociationInput)(nil)).Elem(), &ResolverQueryLogConfigAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverQueryLogConfigAssociationArrayInput)(nil)).Elem(), ResolverQueryLogConfigAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverQueryLogConfigAssociationMapInput)(nil)).Elem(), ResolverQueryLogConfigAssociationMap{})
	pulumi.RegisterOutputType(ResolverQueryLogConfigAssociationOutput{})
	pulumi.RegisterOutputType(ResolverQueryLogConfigAssociationArrayOutput{})
	pulumi.RegisterOutputType(ResolverQueryLogConfigAssociationMapOutput{})
}
