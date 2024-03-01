// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a transit gateway route table attachment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkmanager.NewTransitGatewayRouteTableAttachment(ctx, "example", &networkmanager.TransitGatewayRouteTableAttachmentArgs{
//				PeeringId:                   pulumi.Any(exampleAwsNetworkmanagerTransitGatewayPeering.Id),
//				TransitGatewayRouteTableArn: pulumi.Any(exampleAwsEc2TransitGatewayRouteTable.Arn),
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
// Using `pulumi import`, import `aws_networkmanager_transit_gateway_route_table_attachment` using the attachment ID. For example:
//
// ```sh
//
//	$ pulumi import aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment example attachment-0f8fa60d2238d1bd8
//
// ```
type TransitGatewayRouteTableAttachment struct {
	pulumi.CustomResourceState

	// Attachment Amazon Resource Name (ARN).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntOutput `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// The ARN of the core network.
	CoreNetworkArn pulumi.StringOutput `pulumi:"coreNetworkArn"`
	// The ID of the core network.
	CoreNetworkId pulumi.StringOutput `pulumi:"coreNetworkId"`
	// The edge location for the peer.
	EdgeLocation pulumi.StringOutput `pulumi:"edgeLocation"`
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringOutput `pulumi:"ownerAccountId"`
	// The ID of the peer for the attachment.
	PeeringId pulumi.StringOutput `pulumi:"peeringId"`
	// The attachment resource ARN.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName pulumi.StringOutput `pulumi:"segmentName"`
	// The state of the attachment.
	State pulumi.StringOutput `pulumi:"state"`
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The ARN of the transit gateway route table for the attachment.
	TransitGatewayRouteTableArn pulumi.StringOutput `pulumi:"transitGatewayRouteTableArn"`
}

// NewTransitGatewayRouteTableAttachment registers a new resource with the given unique name, arguments, and options.
func NewTransitGatewayRouteTableAttachment(ctx *pulumi.Context,
	name string, args *TransitGatewayRouteTableAttachmentArgs, opts ...pulumi.ResourceOption) (*TransitGatewayRouteTableAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PeeringId == nil {
		return nil, errors.New("invalid value for required argument 'PeeringId'")
	}
	if args.TransitGatewayRouteTableArn == nil {
		return nil, errors.New("invalid value for required argument 'TransitGatewayRouteTableArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitGatewayRouteTableAttachment
	err := ctx.RegisterResource("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitGatewayRouteTableAttachment gets an existing TransitGatewayRouteTableAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitGatewayRouteTableAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitGatewayRouteTableAttachmentState, opts ...pulumi.ResourceOption) (*TransitGatewayRouteTableAttachment, error) {
	var resource TransitGatewayRouteTableAttachment
	err := ctx.ReadResource("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitGatewayRouteTableAttachment resources.
type transitGatewayRouteTableAttachmentState struct {
	// Attachment Amazon Resource Name (ARN).
	Arn *string `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber *int `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType *string `pulumi:"attachmentType"`
	// The ARN of the core network.
	CoreNetworkArn *string `pulumi:"coreNetworkArn"`
	// The ID of the core network.
	CoreNetworkId *string `pulumi:"coreNetworkId"`
	// The edge location for the peer.
	EdgeLocation *string `pulumi:"edgeLocation"`
	// The ID of the attachment account owner.
	OwnerAccountId *string `pulumi:"ownerAccountId"`
	// The ID of the peer for the attachment.
	PeeringId *string `pulumi:"peeringId"`
	// The attachment resource ARN.
	ResourceArn *string `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName *string `pulumi:"segmentName"`
	// The state of the attachment.
	State *string `pulumi:"state"`
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The ARN of the transit gateway route table for the attachment.
	TransitGatewayRouteTableArn *string `pulumi:"transitGatewayRouteTableArn"`
}

type TransitGatewayRouteTableAttachmentState struct {
	// Attachment Amazon Resource Name (ARN).
	Arn pulumi.StringPtrInput
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntPtrInput
	// The type of attachment.
	AttachmentType pulumi.StringPtrInput
	// The ARN of the core network.
	CoreNetworkArn pulumi.StringPtrInput
	// The ID of the core network.
	CoreNetworkId pulumi.StringPtrInput
	// The edge location for the peer.
	EdgeLocation pulumi.StringPtrInput
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringPtrInput
	// The ID of the peer for the attachment.
	PeeringId pulumi.StringPtrInput
	// The attachment resource ARN.
	ResourceArn pulumi.StringPtrInput
	// The name of the segment attachment.
	SegmentName pulumi.StringPtrInput
	// The state of the attachment.
	State pulumi.StringPtrInput
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The ARN of the transit gateway route table for the attachment.
	TransitGatewayRouteTableArn pulumi.StringPtrInput
}

func (TransitGatewayRouteTableAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayRouteTableAttachmentState)(nil)).Elem()
}

type transitGatewayRouteTableAttachmentArgs struct {
	// The ID of the peer for the attachment.
	PeeringId string `pulumi:"peeringId"`
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ARN of the transit gateway route table for the attachment.
	TransitGatewayRouteTableArn string `pulumi:"transitGatewayRouteTableArn"`
}

// The set of arguments for constructing a TransitGatewayRouteTableAttachment resource.
type TransitGatewayRouteTableAttachmentArgs struct {
	// The ID of the peer for the attachment.
	PeeringId pulumi.StringInput
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ARN of the transit gateway route table for the attachment.
	TransitGatewayRouteTableArn pulumi.StringInput
}

func (TransitGatewayRouteTableAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayRouteTableAttachmentArgs)(nil)).Elem()
}

type TransitGatewayRouteTableAttachmentInput interface {
	pulumi.Input

	ToTransitGatewayRouteTableAttachmentOutput() TransitGatewayRouteTableAttachmentOutput
	ToTransitGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentOutput
}

func (*TransitGatewayRouteTableAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (i *TransitGatewayRouteTableAttachment) ToTransitGatewayRouteTableAttachmentOutput() TransitGatewayRouteTableAttachmentOutput {
	return i.ToTransitGatewayRouteTableAttachmentOutputWithContext(context.Background())
}

func (i *TransitGatewayRouteTableAttachment) ToTransitGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRouteTableAttachmentOutput)
}

// TransitGatewayRouteTableAttachmentArrayInput is an input type that accepts TransitGatewayRouteTableAttachmentArray and TransitGatewayRouteTableAttachmentArrayOutput values.
// You can construct a concrete instance of `TransitGatewayRouteTableAttachmentArrayInput` via:
//
//	TransitGatewayRouteTableAttachmentArray{ TransitGatewayRouteTableAttachmentArgs{...} }
type TransitGatewayRouteTableAttachmentArrayInput interface {
	pulumi.Input

	ToTransitGatewayRouteTableAttachmentArrayOutput() TransitGatewayRouteTableAttachmentArrayOutput
	ToTransitGatewayRouteTableAttachmentArrayOutputWithContext(context.Context) TransitGatewayRouteTableAttachmentArrayOutput
}

type TransitGatewayRouteTableAttachmentArray []TransitGatewayRouteTableAttachmentInput

func (TransitGatewayRouteTableAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (i TransitGatewayRouteTableAttachmentArray) ToTransitGatewayRouteTableAttachmentArrayOutput() TransitGatewayRouteTableAttachmentArrayOutput {
	return i.ToTransitGatewayRouteTableAttachmentArrayOutputWithContext(context.Background())
}

func (i TransitGatewayRouteTableAttachmentArray) ToTransitGatewayRouteTableAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRouteTableAttachmentArrayOutput)
}

// TransitGatewayRouteTableAttachmentMapInput is an input type that accepts TransitGatewayRouteTableAttachmentMap and TransitGatewayRouteTableAttachmentMapOutput values.
// You can construct a concrete instance of `TransitGatewayRouteTableAttachmentMapInput` via:
//
//	TransitGatewayRouteTableAttachmentMap{ "key": TransitGatewayRouteTableAttachmentArgs{...} }
type TransitGatewayRouteTableAttachmentMapInput interface {
	pulumi.Input

	ToTransitGatewayRouteTableAttachmentMapOutput() TransitGatewayRouteTableAttachmentMapOutput
	ToTransitGatewayRouteTableAttachmentMapOutputWithContext(context.Context) TransitGatewayRouteTableAttachmentMapOutput
}

type TransitGatewayRouteTableAttachmentMap map[string]TransitGatewayRouteTableAttachmentInput

func (TransitGatewayRouteTableAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (i TransitGatewayRouteTableAttachmentMap) ToTransitGatewayRouteTableAttachmentMapOutput() TransitGatewayRouteTableAttachmentMapOutput {
	return i.ToTransitGatewayRouteTableAttachmentMapOutputWithContext(context.Background())
}

func (i TransitGatewayRouteTableAttachmentMap) ToTransitGatewayRouteTableAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayRouteTableAttachmentMapOutput)
}

type TransitGatewayRouteTableAttachmentOutput struct{ *pulumi.OutputState }

func (TransitGatewayRouteTableAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (o TransitGatewayRouteTableAttachmentOutput) ToTransitGatewayRouteTableAttachmentOutput() TransitGatewayRouteTableAttachmentOutput {
	return o
}

func (o TransitGatewayRouteTableAttachmentOutput) ToTransitGatewayRouteTableAttachmentOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentOutput {
	return o
}

// Attachment Amazon Resource Name (ARN).
func (o TransitGatewayRouteTableAttachmentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The policy rule number associated with the attachment.
func (o TransitGatewayRouteTableAttachmentOutput) AttachmentPolicyRuleNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.IntOutput { return v.AttachmentPolicyRuleNumber }).(pulumi.IntOutput)
}

// The type of attachment.
func (o TransitGatewayRouteTableAttachmentOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// The ARN of the core network.
func (o TransitGatewayRouteTableAttachmentOutput) CoreNetworkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.CoreNetworkArn }).(pulumi.StringOutput)
}

// The ID of the core network.
func (o TransitGatewayRouteTableAttachmentOutput) CoreNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.CoreNetworkId }).(pulumi.StringOutput)
}

// The edge location for the peer.
func (o TransitGatewayRouteTableAttachmentOutput) EdgeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.EdgeLocation }).(pulumi.StringOutput)
}

// The ID of the attachment account owner.
func (o TransitGatewayRouteTableAttachmentOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The ID of the peer for the attachment.
func (o TransitGatewayRouteTableAttachmentOutput) PeeringId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.PeeringId }).(pulumi.StringOutput)
}

// The attachment resource ARN.
func (o TransitGatewayRouteTableAttachmentOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the segment attachment.
func (o TransitGatewayRouteTableAttachmentOutput) SegmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.SegmentName }).(pulumi.StringOutput)
}

// The state of the attachment.
func (o TransitGatewayRouteTableAttachmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TransitGatewayRouteTableAttachmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o TransitGatewayRouteTableAttachmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ARN of the transit gateway route table for the attachment.
func (o TransitGatewayRouteTableAttachmentOutput) TransitGatewayRouteTableArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayRouteTableAttachment) pulumi.StringOutput { return v.TransitGatewayRouteTableArn }).(pulumi.StringOutput)
}

type TransitGatewayRouteTableAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TransitGatewayRouteTableAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (o TransitGatewayRouteTableAttachmentArrayOutput) ToTransitGatewayRouteTableAttachmentArrayOutput() TransitGatewayRouteTableAttachmentArrayOutput {
	return o
}

func (o TransitGatewayRouteTableAttachmentArrayOutput) ToTransitGatewayRouteTableAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentArrayOutput {
	return o
}

func (o TransitGatewayRouteTableAttachmentArrayOutput) Index(i pulumi.IntInput) TransitGatewayRouteTableAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitGatewayRouteTableAttachment {
		return vs[0].([]*TransitGatewayRouteTableAttachment)[vs[1].(int)]
	}).(TransitGatewayRouteTableAttachmentOutput)
}

type TransitGatewayRouteTableAttachmentMapOutput struct{ *pulumi.OutputState }

func (TransitGatewayRouteTableAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayRouteTableAttachment)(nil)).Elem()
}

func (o TransitGatewayRouteTableAttachmentMapOutput) ToTransitGatewayRouteTableAttachmentMapOutput() TransitGatewayRouteTableAttachmentMapOutput {
	return o
}

func (o TransitGatewayRouteTableAttachmentMapOutput) ToTransitGatewayRouteTableAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayRouteTableAttachmentMapOutput {
	return o
}

func (o TransitGatewayRouteTableAttachmentMapOutput) MapIndex(k pulumi.StringInput) TransitGatewayRouteTableAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitGatewayRouteTableAttachment {
		return vs[0].(map[string]*TransitGatewayRouteTableAttachment)[vs[1].(string)]
	}).(TransitGatewayRouteTableAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRouteTableAttachmentInput)(nil)).Elem(), &TransitGatewayRouteTableAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRouteTableAttachmentArrayInput)(nil)).Elem(), TransitGatewayRouteTableAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayRouteTableAttachmentMapInput)(nil)).Elem(), TransitGatewayRouteTableAttachmentMap{})
	pulumi.RegisterOutputType(TransitGatewayRouteTableAttachmentOutput{})
	pulumi.RegisterOutputType(TransitGatewayRouteTableAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TransitGatewayRouteTableAttachmentMapOutput{})
}
