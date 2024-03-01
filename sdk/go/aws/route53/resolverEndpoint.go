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

// Provides a Route 53 Resolver endpoint resource.
//
// ## Example Usage
//
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
//			_, err := route53.NewResolverEndpoint(ctx, "foo", &route53.ResolverEndpointArgs{
//				Name:      pulumi.String("foo"),
//				Direction: pulumi.String("INBOUND"),
//				SecurityGroupIds: pulumi.StringArray{
//					sg1.Id,
//					sg2.Id,
//				},
//				IpAddresses: route53.ResolverEndpointIpAddressArray{
//					&route53.ResolverEndpointIpAddressArgs{
//						SubnetId: pulumi.Any(sn1.Id),
//					},
//					&route53.ResolverEndpointIpAddressArgs{
//						SubnetId: pulumi.Any(sn2.Id),
//						Ip:       pulumi.String("10.0.64.4"),
//					},
//				},
//				Protocols: pulumi.StringArray{
//					pulumi.String("Do53"),
//					pulumi.String("DoH"),
//				},
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("Prod"),
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
// # Using `pulumi import`, import
//
// Route 53 Resolver endpoints using the Route 53 Resolver endpoint ID. For example:
//
// ```sh
//
//	$ pulumi import aws:route53/resolverEndpoint:ResolverEndpoint foo rslvr-in-abcdef01234567890
//
// ```
type ResolverEndpoint struct {
	pulumi.CustomResourceState

	// The ARN of the Route 53 Resolver endpoint.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The direction of DNS queries to or from the Route 53 Resolver endpoint.
	// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
	// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
	Direction pulumi.StringOutput `pulumi:"direction"`
	// The ID of the VPC that you want to create the resolver endpoint in.
	HostVpcId pulumi.StringOutput `pulumi:"hostVpcId"`
	// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
	// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
	IpAddresses ResolverEndpointIpAddressArrayOutput `pulumi:"ipAddresses"`
	// The friendly name of the Route 53 Resolver endpoint.
	Name pulumi.StringOutput `pulumi:"name"`
	// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
	Protocols pulumi.StringArrayOutput `pulumi:"protocols"`
	// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
	ResolverEndpointType pulumi.StringOutput `pulumi:"resolverEndpointType"`
	// The ID of one or more security groups that you want to use to control access to this VPC.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewResolverEndpoint registers a new resource with the given unique name, arguments, and options.
func NewResolverEndpoint(ctx *pulumi.Context,
	name string, args *ResolverEndpointArgs, opts ...pulumi.ResourceOption) (*ResolverEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Direction == nil {
		return nil, errors.New("invalid value for required argument 'Direction'")
	}
	if args.IpAddresses == nil {
		return nil, errors.New("invalid value for required argument 'IpAddresses'")
	}
	if args.SecurityGroupIds == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResolverEndpoint
	err := ctx.RegisterResource("aws:route53/resolverEndpoint:ResolverEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverEndpoint gets an existing ResolverEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverEndpointState, opts ...pulumi.ResourceOption) (*ResolverEndpoint, error) {
	var resource ResolverEndpoint
	err := ctx.ReadResource("aws:route53/resolverEndpoint:ResolverEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverEndpoint resources.
type resolverEndpointState struct {
	// The ARN of the Route 53 Resolver endpoint.
	Arn *string `pulumi:"arn"`
	// The direction of DNS queries to or from the Route 53 Resolver endpoint.
	// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
	// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
	Direction *string `pulumi:"direction"`
	// The ID of the VPC that you want to create the resolver endpoint in.
	HostVpcId *string `pulumi:"hostVpcId"`
	// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
	// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
	IpAddresses []ResolverEndpointIpAddress `pulumi:"ipAddresses"`
	// The friendly name of the Route 53 Resolver endpoint.
	Name *string `pulumi:"name"`
	// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
	Protocols []string `pulumi:"protocols"`
	// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
	ResolverEndpointType *string `pulumi:"resolverEndpointType"`
	// The ID of one or more security groups that you want to use to control access to this VPC.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ResolverEndpointState struct {
	// The ARN of the Route 53 Resolver endpoint.
	Arn pulumi.StringPtrInput
	// The direction of DNS queries to or from the Route 53 Resolver endpoint.
	// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
	// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
	Direction pulumi.StringPtrInput
	// The ID of the VPC that you want to create the resolver endpoint in.
	HostVpcId pulumi.StringPtrInput
	// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
	// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
	IpAddresses ResolverEndpointIpAddressArrayInput
	// The friendly name of the Route 53 Resolver endpoint.
	Name pulumi.StringPtrInput
	// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
	Protocols pulumi.StringArrayInput
	// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
	ResolverEndpointType pulumi.StringPtrInput
	// The ID of one or more security groups that you want to use to control access to this VPC.
	SecurityGroupIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ResolverEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverEndpointState)(nil)).Elem()
}

type resolverEndpointArgs struct {
	// The direction of DNS queries to or from the Route 53 Resolver endpoint.
	// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
	// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
	Direction string `pulumi:"direction"`
	// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
	// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
	IpAddresses []ResolverEndpointIpAddress `pulumi:"ipAddresses"`
	// The friendly name of the Route 53 Resolver endpoint.
	Name *string `pulumi:"name"`
	// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
	Protocols []string `pulumi:"protocols"`
	// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
	ResolverEndpointType *string `pulumi:"resolverEndpointType"`
	// The ID of one or more security groups that you want to use to control access to this VPC.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ResolverEndpoint resource.
type ResolverEndpointArgs struct {
	// The direction of DNS queries to or from the Route 53 Resolver endpoint.
	// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
	// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
	Direction pulumi.StringInput
	// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
	// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
	IpAddresses ResolverEndpointIpAddressArrayInput
	// The friendly name of the Route 53 Resolver endpoint.
	Name pulumi.StringPtrInput
	// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
	Protocols pulumi.StringArrayInput
	// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
	ResolverEndpointType pulumi.StringPtrInput
	// The ID of one or more security groups that you want to use to control access to this VPC.
	SecurityGroupIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ResolverEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverEndpointArgs)(nil)).Elem()
}

type ResolverEndpointInput interface {
	pulumi.Input

	ToResolverEndpointOutput() ResolverEndpointOutput
	ToResolverEndpointOutputWithContext(ctx context.Context) ResolverEndpointOutput
}

func (*ResolverEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverEndpoint)(nil)).Elem()
}

func (i *ResolverEndpoint) ToResolverEndpointOutput() ResolverEndpointOutput {
	return i.ToResolverEndpointOutputWithContext(context.Background())
}

func (i *ResolverEndpoint) ToResolverEndpointOutputWithContext(ctx context.Context) ResolverEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverEndpointOutput)
}

// ResolverEndpointArrayInput is an input type that accepts ResolverEndpointArray and ResolverEndpointArrayOutput values.
// You can construct a concrete instance of `ResolverEndpointArrayInput` via:
//
//	ResolverEndpointArray{ ResolverEndpointArgs{...} }
type ResolverEndpointArrayInput interface {
	pulumi.Input

	ToResolverEndpointArrayOutput() ResolverEndpointArrayOutput
	ToResolverEndpointArrayOutputWithContext(context.Context) ResolverEndpointArrayOutput
}

type ResolverEndpointArray []ResolverEndpointInput

func (ResolverEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverEndpoint)(nil)).Elem()
}

func (i ResolverEndpointArray) ToResolverEndpointArrayOutput() ResolverEndpointArrayOutput {
	return i.ToResolverEndpointArrayOutputWithContext(context.Background())
}

func (i ResolverEndpointArray) ToResolverEndpointArrayOutputWithContext(ctx context.Context) ResolverEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverEndpointArrayOutput)
}

// ResolverEndpointMapInput is an input type that accepts ResolverEndpointMap and ResolverEndpointMapOutput values.
// You can construct a concrete instance of `ResolverEndpointMapInput` via:
//
//	ResolverEndpointMap{ "key": ResolverEndpointArgs{...} }
type ResolverEndpointMapInput interface {
	pulumi.Input

	ToResolverEndpointMapOutput() ResolverEndpointMapOutput
	ToResolverEndpointMapOutputWithContext(context.Context) ResolverEndpointMapOutput
}

type ResolverEndpointMap map[string]ResolverEndpointInput

func (ResolverEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverEndpoint)(nil)).Elem()
}

func (i ResolverEndpointMap) ToResolverEndpointMapOutput() ResolverEndpointMapOutput {
	return i.ToResolverEndpointMapOutputWithContext(context.Background())
}

func (i ResolverEndpointMap) ToResolverEndpointMapOutputWithContext(ctx context.Context) ResolverEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverEndpointMapOutput)
}

type ResolverEndpointOutput struct{ *pulumi.OutputState }

func (ResolverEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverEndpoint)(nil)).Elem()
}

func (o ResolverEndpointOutput) ToResolverEndpointOutput() ResolverEndpointOutput {
	return o
}

func (o ResolverEndpointOutput) ToResolverEndpointOutputWithContext(ctx context.Context) ResolverEndpointOutput {
	return o
}

// The ARN of the Route 53 Resolver endpoint.
func (o ResolverEndpointOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The direction of DNS queries to or from the Route 53 Resolver endpoint.
// Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
// or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
func (o ResolverEndpointOutput) Direction() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringOutput { return v.Direction }).(pulumi.StringOutput)
}

// The ID of the VPC that you want to create the resolver endpoint in.
func (o ResolverEndpointOutput) HostVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringOutput { return v.HostVpcId }).(pulumi.StringOutput)
}

// The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
// to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
func (o ResolverEndpointOutput) IpAddresses() ResolverEndpointIpAddressArrayOutput {
	return o.ApplyT(func(v *ResolverEndpoint) ResolverEndpointIpAddressArrayOutput { return v.IpAddresses }).(ResolverEndpointIpAddressArrayOutput)
}

// The friendly name of the Route 53 Resolver endpoint.
func (o ResolverEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
func (o ResolverEndpointOutput) Protocols() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringArrayOutput { return v.Protocols }).(pulumi.StringArrayOutput)
}

// The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
func (o ResolverEndpointOutput) ResolverEndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringOutput { return v.ResolverEndpointType }).(pulumi.StringOutput)
}

// The ID of one or more security groups that you want to use to control access to this VPC.
func (o ResolverEndpointOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ResolverEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ResolverEndpointOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverEndpoint) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ResolverEndpointArrayOutput struct{ *pulumi.OutputState }

func (ResolverEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverEndpoint)(nil)).Elem()
}

func (o ResolverEndpointArrayOutput) ToResolverEndpointArrayOutput() ResolverEndpointArrayOutput {
	return o
}

func (o ResolverEndpointArrayOutput) ToResolverEndpointArrayOutputWithContext(ctx context.Context) ResolverEndpointArrayOutput {
	return o
}

func (o ResolverEndpointArrayOutput) Index(i pulumi.IntInput) ResolverEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverEndpoint {
		return vs[0].([]*ResolverEndpoint)[vs[1].(int)]
	}).(ResolverEndpointOutput)
}

type ResolverEndpointMapOutput struct{ *pulumi.OutputState }

func (ResolverEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverEndpoint)(nil)).Elem()
}

func (o ResolverEndpointMapOutput) ToResolverEndpointMapOutput() ResolverEndpointMapOutput {
	return o
}

func (o ResolverEndpointMapOutput) ToResolverEndpointMapOutputWithContext(ctx context.Context) ResolverEndpointMapOutput {
	return o
}

func (o ResolverEndpointMapOutput) MapIndex(k pulumi.StringInput) ResolverEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverEndpoint {
		return vs[0].(map[string]*ResolverEndpoint)[vs[1].(string)]
	}).(ResolverEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverEndpointInput)(nil)).Elem(), &ResolverEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverEndpointArrayInput)(nil)).Elem(), ResolverEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverEndpointMapInput)(nil)).Elem(), ResolverEndpointMap{})
	pulumi.RegisterOutputType(ResolverEndpointOutput{})
	pulumi.RegisterOutputType(ResolverEndpointArrayOutput{})
	pulumi.RegisterOutputType(ResolverEndpointMapOutput{})
}
