// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Direct Connect LAG. Connections can be added to the LAG via the `directconnect.Connection` and `directconnect.ConnectionAssociation` resources.
//
// > *NOTE:* When creating a LAG, if no existing connection is specified, Direct Connect will create a connection and this provider will remove this unmanaged connection during resource creation.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := directconnect.NewLinkAggregationGroup(ctx, "hoge", &directconnect.LinkAggregationGroupArgs{
//				Name:                 pulumi.String("tf-dx-lag"),
//				ConnectionsBandwidth: pulumi.String("1Gbps"),
//				Location:             pulumi.String("EqDC2"),
//				ForceDestroy:         pulumi.Bool(true),
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
// Using `pulumi import`, import Direct Connect LAGs using the LAG `id`. For example:
//
// ```sh
// $ pulumi import aws:directconnect/linkAggregationGroup:LinkAggregationGroup test_lag dxlag-fgnsp5rq
// ```
type LinkAggregationGroup struct {
	pulumi.CustomResourceState

	// The ARN of the LAG.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The ID of an existing dedicated connection to migrate to the LAG.
	ConnectionId pulumi.StringPtrOutput `pulumi:"connectionId"`
	// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
	ConnectionsBandwidth pulumi.StringOutput `pulumi:"connectionsBandwidth"`
	// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
	HasLogicalRedundancy pulumi.StringOutput `pulumi:"hasLogicalRedundancy"`
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable pulumi.BoolOutput `pulumi:"jumboFrameCapable"`
	// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the LAG.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the AWS account that owns the LAG.
	OwnerAccountId pulumi.StringOutput `pulumi:"ownerAccountId"`
	// The name of the service provider associated with the LAG.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewLinkAggregationGroup registers a new resource with the given unique name, arguments, and options.
func NewLinkAggregationGroup(ctx *pulumi.Context,
	name string, args *LinkAggregationGroupArgs, opts ...pulumi.ResourceOption) (*LinkAggregationGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionsBandwidth == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionsBandwidth'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkAggregationGroup
	err := ctx.RegisterResource("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkAggregationGroup gets an existing LinkAggregationGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkAggregationGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkAggregationGroupState, opts ...pulumi.ResourceOption) (*LinkAggregationGroup, error) {
	var resource LinkAggregationGroup
	err := ctx.ReadResource("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkAggregationGroup resources.
type linkAggregationGroupState struct {
	// The ARN of the LAG.
	Arn *string `pulumi:"arn"`
	// The ID of an existing dedicated connection to migrate to the LAG.
	ConnectionId *string `pulumi:"connectionId"`
	// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
	ConnectionsBandwidth *string `pulumi:"connectionsBandwidth"`
	// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
	HasLogicalRedundancy *string `pulumi:"hasLogicalRedundancy"`
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable *bool `pulumi:"jumboFrameCapable"`
	// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
	Location *string `pulumi:"location"`
	// The name of the LAG.
	Name *string `pulumi:"name"`
	// The ID of the AWS account that owns the LAG.
	OwnerAccountId *string `pulumi:"ownerAccountId"`
	// The name of the service provider associated with the LAG.
	ProviderName *string `pulumi:"providerName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type LinkAggregationGroupState struct {
	// The ARN of the LAG.
	Arn pulumi.StringPtrInput
	// The ID of an existing dedicated connection to migrate to the LAG.
	ConnectionId pulumi.StringPtrInput
	// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
	ConnectionsBandwidth pulumi.StringPtrInput
	// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
	ForceDestroy pulumi.BoolPtrInput
	// Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
	HasLogicalRedundancy pulumi.StringPtrInput
	// Indicates whether jumbo frames (9001 MTU) are supported.
	JumboFrameCapable pulumi.BoolPtrInput
	// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
	Location pulumi.StringPtrInput
	// The name of the LAG.
	Name pulumi.StringPtrInput
	// The ID of the AWS account that owns the LAG.
	OwnerAccountId pulumi.StringPtrInput
	// The name of the service provider associated with the LAG.
	ProviderName pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (LinkAggregationGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkAggregationGroupState)(nil)).Elem()
}

type linkAggregationGroupArgs struct {
	// The ID of an existing dedicated connection to migrate to the LAG.
	ConnectionId *string `pulumi:"connectionId"`
	// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
	ConnectionsBandwidth string `pulumi:"connectionsBandwidth"`
	// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
	Location string `pulumi:"location"`
	// The name of the LAG.
	Name *string `pulumi:"name"`
	// The name of the service provider associated with the LAG.
	ProviderName *string `pulumi:"providerName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a LinkAggregationGroup resource.
type LinkAggregationGroupArgs struct {
	// The ID of an existing dedicated connection to migrate to the LAG.
	ConnectionId pulumi.StringPtrInput
	// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
	ConnectionsBandwidth pulumi.StringInput
	// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
	ForceDestroy pulumi.BoolPtrInput
	// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
	Location pulumi.StringInput
	// The name of the LAG.
	Name pulumi.StringPtrInput
	// The name of the service provider associated with the LAG.
	ProviderName pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (LinkAggregationGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkAggregationGroupArgs)(nil)).Elem()
}

type LinkAggregationGroupInput interface {
	pulumi.Input

	ToLinkAggregationGroupOutput() LinkAggregationGroupOutput
	ToLinkAggregationGroupOutputWithContext(ctx context.Context) LinkAggregationGroupOutput
}

func (*LinkAggregationGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkAggregationGroup)(nil)).Elem()
}

func (i *LinkAggregationGroup) ToLinkAggregationGroupOutput() LinkAggregationGroupOutput {
	return i.ToLinkAggregationGroupOutputWithContext(context.Background())
}

func (i *LinkAggregationGroup) ToLinkAggregationGroupOutputWithContext(ctx context.Context) LinkAggregationGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkAggregationGroupOutput)
}

// LinkAggregationGroupArrayInput is an input type that accepts LinkAggregationGroupArray and LinkAggregationGroupArrayOutput values.
// You can construct a concrete instance of `LinkAggregationGroupArrayInput` via:
//
//	LinkAggregationGroupArray{ LinkAggregationGroupArgs{...} }
type LinkAggregationGroupArrayInput interface {
	pulumi.Input

	ToLinkAggregationGroupArrayOutput() LinkAggregationGroupArrayOutput
	ToLinkAggregationGroupArrayOutputWithContext(context.Context) LinkAggregationGroupArrayOutput
}

type LinkAggregationGroupArray []LinkAggregationGroupInput

func (LinkAggregationGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkAggregationGroup)(nil)).Elem()
}

func (i LinkAggregationGroupArray) ToLinkAggregationGroupArrayOutput() LinkAggregationGroupArrayOutput {
	return i.ToLinkAggregationGroupArrayOutputWithContext(context.Background())
}

func (i LinkAggregationGroupArray) ToLinkAggregationGroupArrayOutputWithContext(ctx context.Context) LinkAggregationGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkAggregationGroupArrayOutput)
}

// LinkAggregationGroupMapInput is an input type that accepts LinkAggregationGroupMap and LinkAggregationGroupMapOutput values.
// You can construct a concrete instance of `LinkAggregationGroupMapInput` via:
//
//	LinkAggregationGroupMap{ "key": LinkAggregationGroupArgs{...} }
type LinkAggregationGroupMapInput interface {
	pulumi.Input

	ToLinkAggregationGroupMapOutput() LinkAggregationGroupMapOutput
	ToLinkAggregationGroupMapOutputWithContext(context.Context) LinkAggregationGroupMapOutput
}

type LinkAggregationGroupMap map[string]LinkAggregationGroupInput

func (LinkAggregationGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkAggregationGroup)(nil)).Elem()
}

func (i LinkAggregationGroupMap) ToLinkAggregationGroupMapOutput() LinkAggregationGroupMapOutput {
	return i.ToLinkAggregationGroupMapOutputWithContext(context.Background())
}

func (i LinkAggregationGroupMap) ToLinkAggregationGroupMapOutputWithContext(ctx context.Context) LinkAggregationGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkAggregationGroupMapOutput)
}

type LinkAggregationGroupOutput struct{ *pulumi.OutputState }

func (LinkAggregationGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkAggregationGroup)(nil)).Elem()
}

func (o LinkAggregationGroupOutput) ToLinkAggregationGroupOutput() LinkAggregationGroupOutput {
	return o
}

func (o LinkAggregationGroupOutput) ToLinkAggregationGroupOutputWithContext(ctx context.Context) LinkAggregationGroupOutput {
	return o
}

// The ARN of the LAG.
func (o LinkAggregationGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The ID of an existing dedicated connection to migrate to the LAG.
func (o LinkAggregationGroupOutput) ConnectionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringPtrOutput { return v.ConnectionId }).(pulumi.StringPtrOutput)
}

// The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
func (o LinkAggregationGroupOutput) ConnectionsBandwidth() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.ConnectionsBandwidth }).(pulumi.StringOutput)
}

// A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
func (o LinkAggregationGroupOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
func (o LinkAggregationGroupOutput) HasLogicalRedundancy() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.HasLogicalRedundancy }).(pulumi.StringOutput)
}

// Indicates whether jumbo frames (9001 MTU) are supported.
func (o LinkAggregationGroupOutput) JumboFrameCapable() pulumi.BoolOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.BoolOutput { return v.JumboFrameCapable }).(pulumi.BoolOutput)
}

// The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
func (o LinkAggregationGroupOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the LAG.
func (o LinkAggregationGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the AWS account that owns the LAG.
func (o LinkAggregationGroupOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The name of the service provider associated with the LAG.
func (o LinkAggregationGroupOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o LinkAggregationGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o LinkAggregationGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkAggregationGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type LinkAggregationGroupArrayOutput struct{ *pulumi.OutputState }

func (LinkAggregationGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkAggregationGroup)(nil)).Elem()
}

func (o LinkAggregationGroupArrayOutput) ToLinkAggregationGroupArrayOutput() LinkAggregationGroupArrayOutput {
	return o
}

func (o LinkAggregationGroupArrayOutput) ToLinkAggregationGroupArrayOutputWithContext(ctx context.Context) LinkAggregationGroupArrayOutput {
	return o
}

func (o LinkAggregationGroupArrayOutput) Index(i pulumi.IntInput) LinkAggregationGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkAggregationGroup {
		return vs[0].([]*LinkAggregationGroup)[vs[1].(int)]
	}).(LinkAggregationGroupOutput)
}

type LinkAggregationGroupMapOutput struct{ *pulumi.OutputState }

func (LinkAggregationGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkAggregationGroup)(nil)).Elem()
}

func (o LinkAggregationGroupMapOutput) ToLinkAggregationGroupMapOutput() LinkAggregationGroupMapOutput {
	return o
}

func (o LinkAggregationGroupMapOutput) ToLinkAggregationGroupMapOutputWithContext(ctx context.Context) LinkAggregationGroupMapOutput {
	return o
}

func (o LinkAggregationGroupMapOutput) MapIndex(k pulumi.StringInput) LinkAggregationGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkAggregationGroup {
		return vs[0].(map[string]*LinkAggregationGroup)[vs[1].(string)]
	}).(LinkAggregationGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkAggregationGroupInput)(nil)).Elem(), &LinkAggregationGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkAggregationGroupArrayInput)(nil)).Elem(), LinkAggregationGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkAggregationGroupMapInput)(nil)).Elem(), LinkAggregationGroupMap{})
	pulumi.RegisterOutputType(LinkAggregationGroupOutput{})
	pulumi.RegisterOutputType(LinkAggregationGroupArrayOutput{})
	pulumi.RegisterOutputType(LinkAggregationGroupMapOutput{})
}
