// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkmanager.NewVpcAttachment(ctx, "example", &networkmanager.VpcAttachmentArgs{
//				SubnetArns: pulumi.StringArray{
//					pulumi.Any(aws_subnet.Example.Arn),
//				},
//				CoreNetworkId: pulumi.Any(awscc_networkmanager_core_network.Example.Id),
//				VpcArn:        pulumi.Any(aws_vpc.Example.Arn),
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
// NetworkManager VpcAttachment can be imported using the `attachment_id`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:networkmanager/vpcAttachment:VpcAttachment example attachment-0f8fa60d2238d1bd8
//
// ```
type VpcAttachment struct {
	pulumi.CustomResourceState

	// The ARN of the attachment.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntOutput `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringOutput `pulumi:"coreNetworkArn"`
	// The ID of a core network for the VPC attachment.
	CoreNetworkId pulumi.StringOutput `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation pulumi.StringOutput `pulumi:"edgeLocation"`
	// Options for the VPC attachment.
	Options VpcAttachmentOptionsPtrOutput `pulumi:"options"`
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringOutput `pulumi:"ownerAccountId"`
	// The attachment resource ARN.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName pulumi.StringOutput `pulumi:"segmentName"`
	// The state of the attachment.
	State pulumi.StringOutput `pulumi:"state"`
	// The subnet ARN of the VPC attachment.
	SubnetArns pulumi.StringArrayOutput `pulumi:"subnetArns"`
	Tags       pulumi.StringMapOutput   `pulumi:"tags"`
	TagsAll    pulumi.StringMapOutput   `pulumi:"tagsAll"`
	// The ARN of the VPC.
	VpcArn pulumi.StringOutput `pulumi:"vpcArn"`
}

// NewVpcAttachment registers a new resource with the given unique name, arguments, and options.
func NewVpcAttachment(ctx *pulumi.Context,
	name string, args *VpcAttachmentArgs, opts ...pulumi.ResourceOption) (*VpcAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CoreNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'CoreNetworkId'")
	}
	if args.SubnetArns == nil {
		return nil, errors.New("invalid value for required argument 'SubnetArns'")
	}
	if args.VpcArn == nil {
		return nil, errors.New("invalid value for required argument 'VpcArn'")
	}
	var resource VpcAttachment
	err := ctx.RegisterResource("aws:networkmanager/vpcAttachment:VpcAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcAttachment gets an existing VpcAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcAttachmentState, opts ...pulumi.ResourceOption) (*VpcAttachment, error) {
	var resource VpcAttachment
	err := ctx.ReadResource("aws:networkmanager/vpcAttachment:VpcAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcAttachment resources.
type vpcAttachmentState struct {
	// The ARN of the attachment.
	Arn *string `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber *int `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType *string `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn *string `pulumi:"coreNetworkArn"`
	// The ID of a core network for the VPC attachment.
	CoreNetworkId *string `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation *string `pulumi:"edgeLocation"`
	// Options for the VPC attachment.
	Options *VpcAttachmentOptions `pulumi:"options"`
	// The ID of the attachment account owner.
	OwnerAccountId *string `pulumi:"ownerAccountId"`
	// The attachment resource ARN.
	ResourceArn *string `pulumi:"resourceArn"`
	// The name of the segment attachment.
	SegmentName *string `pulumi:"segmentName"`
	// The state of the attachment.
	State *string `pulumi:"state"`
	// The subnet ARN of the VPC attachment.
	SubnetArns []string          `pulumi:"subnetArns"`
	Tags       map[string]string `pulumi:"tags"`
	TagsAll    map[string]string `pulumi:"tagsAll"`
	// The ARN of the VPC.
	VpcArn *string `pulumi:"vpcArn"`
}

type VpcAttachmentState struct {
	// The ARN of the attachment.
	Arn pulumi.StringPtrInput
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntPtrInput
	// The type of attachment.
	AttachmentType pulumi.StringPtrInput
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringPtrInput
	// The ID of a core network for the VPC attachment.
	CoreNetworkId pulumi.StringPtrInput
	// The Region where the edge is located.
	EdgeLocation pulumi.StringPtrInput
	// Options for the VPC attachment.
	Options VpcAttachmentOptionsPtrInput
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringPtrInput
	// The attachment resource ARN.
	ResourceArn pulumi.StringPtrInput
	// The name of the segment attachment.
	SegmentName pulumi.StringPtrInput
	// The state of the attachment.
	State pulumi.StringPtrInput
	// The subnet ARN of the VPC attachment.
	SubnetArns pulumi.StringArrayInput
	Tags       pulumi.StringMapInput
	TagsAll    pulumi.StringMapInput
	// The ARN of the VPC.
	VpcArn pulumi.StringPtrInput
}

func (VpcAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcAttachmentState)(nil)).Elem()
}

type vpcAttachmentArgs struct {
	// The ID of a core network for the VPC attachment.
	CoreNetworkId string `pulumi:"coreNetworkId"`
	// Options for the VPC attachment.
	Options *VpcAttachmentOptions `pulumi:"options"`
	// The subnet ARN of the VPC attachment.
	SubnetArns []string          `pulumi:"subnetArns"`
	Tags       map[string]string `pulumi:"tags"`
	TagsAll    map[string]string `pulumi:"tagsAll"`
	// The ARN of the VPC.
	VpcArn string `pulumi:"vpcArn"`
}

// The set of arguments for constructing a VpcAttachment resource.
type VpcAttachmentArgs struct {
	// The ID of a core network for the VPC attachment.
	CoreNetworkId pulumi.StringInput
	// Options for the VPC attachment.
	Options VpcAttachmentOptionsPtrInput
	// The subnet ARN of the VPC attachment.
	SubnetArns pulumi.StringArrayInput
	Tags       pulumi.StringMapInput
	TagsAll    pulumi.StringMapInput
	// The ARN of the VPC.
	VpcArn pulumi.StringInput
}

func (VpcAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcAttachmentArgs)(nil)).Elem()
}

type VpcAttachmentInput interface {
	pulumi.Input

	ToVpcAttachmentOutput() VpcAttachmentOutput
	ToVpcAttachmentOutputWithContext(ctx context.Context) VpcAttachmentOutput
}

func (*VpcAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcAttachment)(nil)).Elem()
}

func (i *VpcAttachment) ToVpcAttachmentOutput() VpcAttachmentOutput {
	return i.ToVpcAttachmentOutputWithContext(context.Background())
}

func (i *VpcAttachment) ToVpcAttachmentOutputWithContext(ctx context.Context) VpcAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAttachmentOutput)
}

// VpcAttachmentArrayInput is an input type that accepts VpcAttachmentArray and VpcAttachmentArrayOutput values.
// You can construct a concrete instance of `VpcAttachmentArrayInput` via:
//
//	VpcAttachmentArray{ VpcAttachmentArgs{...} }
type VpcAttachmentArrayInput interface {
	pulumi.Input

	ToVpcAttachmentArrayOutput() VpcAttachmentArrayOutput
	ToVpcAttachmentArrayOutputWithContext(context.Context) VpcAttachmentArrayOutput
}

type VpcAttachmentArray []VpcAttachmentInput

func (VpcAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcAttachment)(nil)).Elem()
}

func (i VpcAttachmentArray) ToVpcAttachmentArrayOutput() VpcAttachmentArrayOutput {
	return i.ToVpcAttachmentArrayOutputWithContext(context.Background())
}

func (i VpcAttachmentArray) ToVpcAttachmentArrayOutputWithContext(ctx context.Context) VpcAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAttachmentArrayOutput)
}

// VpcAttachmentMapInput is an input type that accepts VpcAttachmentMap and VpcAttachmentMapOutput values.
// You can construct a concrete instance of `VpcAttachmentMapInput` via:
//
//	VpcAttachmentMap{ "key": VpcAttachmentArgs{...} }
type VpcAttachmentMapInput interface {
	pulumi.Input

	ToVpcAttachmentMapOutput() VpcAttachmentMapOutput
	ToVpcAttachmentMapOutputWithContext(context.Context) VpcAttachmentMapOutput
}

type VpcAttachmentMap map[string]VpcAttachmentInput

func (VpcAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcAttachment)(nil)).Elem()
}

func (i VpcAttachmentMap) ToVpcAttachmentMapOutput() VpcAttachmentMapOutput {
	return i.ToVpcAttachmentMapOutputWithContext(context.Background())
}

func (i VpcAttachmentMap) ToVpcAttachmentMapOutputWithContext(ctx context.Context) VpcAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcAttachmentMapOutput)
}

type VpcAttachmentOutput struct{ *pulumi.OutputState }

func (VpcAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcAttachment)(nil)).Elem()
}

func (o VpcAttachmentOutput) ToVpcAttachmentOutput() VpcAttachmentOutput {
	return o
}

func (o VpcAttachmentOutput) ToVpcAttachmentOutputWithContext(ctx context.Context) VpcAttachmentOutput {
	return o
}

// The ARN of the attachment.
func (o VpcAttachmentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The policy rule number associated with the attachment.
func (o VpcAttachmentOutput) AttachmentPolicyRuleNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.IntOutput { return v.AttachmentPolicyRuleNumber }).(pulumi.IntOutput)
}

// The type of attachment.
func (o VpcAttachmentOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// The ARN of a core network.
func (o VpcAttachmentOutput) CoreNetworkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.CoreNetworkArn }).(pulumi.StringOutput)
}

// The ID of a core network for the VPC attachment.
func (o VpcAttachmentOutput) CoreNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.CoreNetworkId }).(pulumi.StringOutput)
}

// The Region where the edge is located.
func (o VpcAttachmentOutput) EdgeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.EdgeLocation }).(pulumi.StringOutput)
}

// Options for the VPC attachment.
func (o VpcAttachmentOutput) Options() VpcAttachmentOptionsPtrOutput {
	return o.ApplyT(func(v *VpcAttachment) VpcAttachmentOptionsPtrOutput { return v.Options }).(VpcAttachmentOptionsPtrOutput)
}

// The ID of the attachment account owner.
func (o VpcAttachmentOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The attachment resource ARN.
func (o VpcAttachmentOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the segment attachment.
func (o VpcAttachmentOutput) SegmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.SegmentName }).(pulumi.StringOutput)
}

// The state of the attachment.
func (o VpcAttachmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The subnet ARN of the VPC attachment.
func (o VpcAttachmentOutput) SubnetArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringArrayOutput { return v.SubnetArns }).(pulumi.StringArrayOutput)
}

func (o VpcAttachmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o VpcAttachmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ARN of the VPC.
func (o VpcAttachmentOutput) VpcArn() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcAttachment) pulumi.StringOutput { return v.VpcArn }).(pulumi.StringOutput)
}

type VpcAttachmentArrayOutput struct{ *pulumi.OutputState }

func (VpcAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcAttachment)(nil)).Elem()
}

func (o VpcAttachmentArrayOutput) ToVpcAttachmentArrayOutput() VpcAttachmentArrayOutput {
	return o
}

func (o VpcAttachmentArrayOutput) ToVpcAttachmentArrayOutputWithContext(ctx context.Context) VpcAttachmentArrayOutput {
	return o
}

func (o VpcAttachmentArrayOutput) Index(i pulumi.IntInput) VpcAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcAttachment {
		return vs[0].([]*VpcAttachment)[vs[1].(int)]
	}).(VpcAttachmentOutput)
}

type VpcAttachmentMapOutput struct{ *pulumi.OutputState }

func (VpcAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcAttachment)(nil)).Elem()
}

func (o VpcAttachmentMapOutput) ToVpcAttachmentMapOutput() VpcAttachmentMapOutput {
	return o
}

func (o VpcAttachmentMapOutput) ToVpcAttachmentMapOutputWithContext(ctx context.Context) VpcAttachmentMapOutput {
	return o
}

func (o VpcAttachmentMapOutput) MapIndex(k pulumi.StringInput) VpcAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcAttachment {
		return vs[0].(map[string]*VpcAttachment)[vs[1].(string)]
	}).(VpcAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAttachmentInput)(nil)).Elem(), &VpcAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAttachmentArrayInput)(nil)).Elem(), VpcAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcAttachmentMapInput)(nil)).Elem(), VpcAttachmentMap{})
	pulumi.RegisterOutputType(VpcAttachmentOutput{})
	pulumi.RegisterOutputType(VpcAttachmentArrayOutput{})
	pulumi.RegisterOutputType(VpcAttachmentMapOutput{})
}
