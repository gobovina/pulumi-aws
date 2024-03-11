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

// Resource for managing an AWS Network Manager ConnectAttachment.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// var splat0 []interface{}
// for _, val0 := range exampleAwsSubnet {
// splat0 = append(splat0, val0.Arn)
// }
// example, err := networkmanager.NewVpcAttachment(ctx, "example", &networkmanager.VpcAttachmentArgs{
// SubnetArns: toPulumiArray(splat0),
// CoreNetworkId: pulumi.Any(exampleAwsccNetworkmanagerCoreNetwork.Id),
// VpcArn: pulumi.Any(exampleAwsVpc.Arn),
// })
// if err != nil {
// return err
// }
// _, err = networkmanager.NewConnectAttachment(ctx, "example", &networkmanager.ConnectAttachmentArgs{
// CoreNetworkId: pulumi.Any(exampleAwsccNetworkmanagerCoreNetwork.Id),
// TransportAttachmentId: example.ID(),
// EdgeLocation: example.EdgeLocation,
// Options: &networkmanager.ConnectAttachmentOptionsArgs{
// Protocol: pulumi.String("GRE"),
// },
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// func toPulumiArray(arr []) pulumi.Array {
// var pulumiArr pulumi.Array
// for _, v := range arr {
// pulumiArr = append(pulumiArr, pulumi.(v))
// }
// return pulumiArr
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ### Usage with attachment accepter
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// var splat0 []interface{}
// for _, val0 := range exampleAwsSubnet {
// splat0 = append(splat0, val0.Arn)
// }
// example, err := networkmanager.NewVpcAttachment(ctx, "example", &networkmanager.VpcAttachmentArgs{
// SubnetArns: toPulumiArray(splat0),
// CoreNetworkId: pulumi.Any(exampleAwsccNetworkmanagerCoreNetwork.Id),
// VpcArn: pulumi.Any(exampleAwsVpc.Arn),
// })
// if err != nil {
// return err
// }
// _, err = networkmanager.NewAttachmentAccepter(ctx, "example", &networkmanager.AttachmentAccepterArgs{
// AttachmentId: example.ID(),
// AttachmentType: example.AttachmentType,
// })
// if err != nil {
// return err
// }
// exampleConnectAttachment, err := networkmanager.NewConnectAttachment(ctx, "example", &networkmanager.ConnectAttachmentArgs{
// CoreNetworkId: pulumi.Any(exampleAwsccNetworkmanagerCoreNetwork.Id),
// TransportAttachmentId: example.ID(),
// EdgeLocation: example.EdgeLocation,
// Options: &networkmanager.ConnectAttachmentOptionsArgs{
// Protocol: pulumi.String("GRE"),
// },
// })
// if err != nil {
// return err
// }
// _, err = networkmanager.NewAttachmentAccepter(ctx, "example2", &networkmanager.AttachmentAccepterArgs{
// AttachmentId: exampleConnectAttachment.ID(),
// AttachmentType: exampleConnectAttachment.AttachmentType,
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// func toPulumiArray(arr []) pulumi.Array {
// var pulumiArr pulumi.Array
// for _, v := range arr {
// pulumiArr = append(pulumiArr, pulumi.(v))
// }
// return pulumiArr
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_networkmanager_connect_attachment` using the attachment ID. For example:
//
// ```sh
// $ pulumi import aws:networkmanager/connectAttachment:ConnectAttachment example attachment-0f8fa60d2238d1bd8
// ```
type ConnectAttachment struct {
	pulumi.CustomResourceState

	// The ARN of the attachment.
	Arn          pulumi.StringOutput `pulumi:"arn"`
	AttachmentId pulumi.StringOutput `pulumi:"attachmentId"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntOutput `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringOutput `pulumi:"coreNetworkArn"`
	// The ID of a core network where you want to create the attachment.
	CoreNetworkId pulumi.StringOutput `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation pulumi.StringOutput `pulumi:"edgeLocation"`
	// Options block. See options for more information.
	//
	// The following arguments are optional:
	Options ConnectAttachmentOptionsOutput `pulumi:"options"`
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringOutput `pulumi:"ownerAccountId"`
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
	// The ID of the attachment between the two connections.
	TransportAttachmentId pulumi.StringOutput `pulumi:"transportAttachmentId"`
}

// NewConnectAttachment registers a new resource with the given unique name, arguments, and options.
func NewConnectAttachment(ctx *pulumi.Context,
	name string, args *ConnectAttachmentArgs, opts ...pulumi.ResourceOption) (*ConnectAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CoreNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'CoreNetworkId'")
	}
	if args.EdgeLocation == nil {
		return nil, errors.New("invalid value for required argument 'EdgeLocation'")
	}
	if args.Options == nil {
		return nil, errors.New("invalid value for required argument 'Options'")
	}
	if args.TransportAttachmentId == nil {
		return nil, errors.New("invalid value for required argument 'TransportAttachmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConnectAttachment
	err := ctx.RegisterResource("aws:networkmanager/connectAttachment:ConnectAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectAttachment gets an existing ConnectAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectAttachmentState, opts ...pulumi.ResourceOption) (*ConnectAttachment, error) {
	var resource ConnectAttachment
	err := ctx.ReadResource("aws:networkmanager/connectAttachment:ConnectAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectAttachment resources.
type connectAttachmentState struct {
	// The ARN of the attachment.
	Arn          *string `pulumi:"arn"`
	AttachmentId *string `pulumi:"attachmentId"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber *int `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType *string `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn *string `pulumi:"coreNetworkArn"`
	// The ID of a core network where you want to create the attachment.
	CoreNetworkId *string `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation *string `pulumi:"edgeLocation"`
	// Options block. See options for more information.
	//
	// The following arguments are optional:
	Options *ConnectAttachmentOptions `pulumi:"options"`
	// The ID of the attachment account owner.
	OwnerAccountId *string `pulumi:"ownerAccountId"`
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
	// The ID of the attachment between the two connections.
	TransportAttachmentId *string `pulumi:"transportAttachmentId"`
}

type ConnectAttachmentState struct {
	// The ARN of the attachment.
	Arn          pulumi.StringPtrInput
	AttachmentId pulumi.StringPtrInput
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntPtrInput
	// The type of attachment.
	AttachmentType pulumi.StringPtrInput
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringPtrInput
	// The ID of a core network where you want to create the attachment.
	CoreNetworkId pulumi.StringPtrInput
	// The Region where the edge is located.
	EdgeLocation pulumi.StringPtrInput
	// Options block. See options for more information.
	//
	// The following arguments are optional:
	Options ConnectAttachmentOptionsPtrInput
	// The ID of the attachment account owner.
	OwnerAccountId pulumi.StringPtrInput
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
	// The ID of the attachment between the two connections.
	TransportAttachmentId pulumi.StringPtrInput
}

func (ConnectAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectAttachmentState)(nil)).Elem()
}

type connectAttachmentArgs struct {
	// The ID of a core network where you want to create the attachment.
	CoreNetworkId string `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation string `pulumi:"edgeLocation"`
	// Options block. See options for more information.
	//
	// The following arguments are optional:
	Options ConnectAttachmentOptions `pulumi:"options"`
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the attachment between the two connections.
	TransportAttachmentId string `pulumi:"transportAttachmentId"`
}

// The set of arguments for constructing a ConnectAttachment resource.
type ConnectAttachmentArgs struct {
	// The ID of a core network where you want to create the attachment.
	CoreNetworkId pulumi.StringInput
	// The Region where the edge is located.
	EdgeLocation pulumi.StringInput
	// Options block. See options for more information.
	//
	// The following arguments are optional:
	Options ConnectAttachmentOptionsInput
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ID of the attachment between the two connections.
	TransportAttachmentId pulumi.StringInput
}

func (ConnectAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectAttachmentArgs)(nil)).Elem()
}

type ConnectAttachmentInput interface {
	pulumi.Input

	ToConnectAttachmentOutput() ConnectAttachmentOutput
	ToConnectAttachmentOutputWithContext(ctx context.Context) ConnectAttachmentOutput
}

func (*ConnectAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectAttachment)(nil)).Elem()
}

func (i *ConnectAttachment) ToConnectAttachmentOutput() ConnectAttachmentOutput {
	return i.ToConnectAttachmentOutputWithContext(context.Background())
}

func (i *ConnectAttachment) ToConnectAttachmentOutputWithContext(ctx context.Context) ConnectAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectAttachmentOutput)
}

// ConnectAttachmentArrayInput is an input type that accepts ConnectAttachmentArray and ConnectAttachmentArrayOutput values.
// You can construct a concrete instance of `ConnectAttachmentArrayInput` via:
//
//	ConnectAttachmentArray{ ConnectAttachmentArgs{...} }
type ConnectAttachmentArrayInput interface {
	pulumi.Input

	ToConnectAttachmentArrayOutput() ConnectAttachmentArrayOutput
	ToConnectAttachmentArrayOutputWithContext(context.Context) ConnectAttachmentArrayOutput
}

type ConnectAttachmentArray []ConnectAttachmentInput

func (ConnectAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectAttachment)(nil)).Elem()
}

func (i ConnectAttachmentArray) ToConnectAttachmentArrayOutput() ConnectAttachmentArrayOutput {
	return i.ToConnectAttachmentArrayOutputWithContext(context.Background())
}

func (i ConnectAttachmentArray) ToConnectAttachmentArrayOutputWithContext(ctx context.Context) ConnectAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectAttachmentArrayOutput)
}

// ConnectAttachmentMapInput is an input type that accepts ConnectAttachmentMap and ConnectAttachmentMapOutput values.
// You can construct a concrete instance of `ConnectAttachmentMapInput` via:
//
//	ConnectAttachmentMap{ "key": ConnectAttachmentArgs{...} }
type ConnectAttachmentMapInput interface {
	pulumi.Input

	ToConnectAttachmentMapOutput() ConnectAttachmentMapOutput
	ToConnectAttachmentMapOutputWithContext(context.Context) ConnectAttachmentMapOutput
}

type ConnectAttachmentMap map[string]ConnectAttachmentInput

func (ConnectAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectAttachment)(nil)).Elem()
}

func (i ConnectAttachmentMap) ToConnectAttachmentMapOutput() ConnectAttachmentMapOutput {
	return i.ToConnectAttachmentMapOutputWithContext(context.Background())
}

func (i ConnectAttachmentMap) ToConnectAttachmentMapOutputWithContext(ctx context.Context) ConnectAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectAttachmentMapOutput)
}

type ConnectAttachmentOutput struct{ *pulumi.OutputState }

func (ConnectAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectAttachment)(nil)).Elem()
}

func (o ConnectAttachmentOutput) ToConnectAttachmentOutput() ConnectAttachmentOutput {
	return o
}

func (o ConnectAttachmentOutput) ToConnectAttachmentOutputWithContext(ctx context.Context) ConnectAttachmentOutput {
	return o
}

// The ARN of the attachment.
func (o ConnectAttachmentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

func (o ConnectAttachmentOutput) AttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.AttachmentId }).(pulumi.StringOutput)
}

// The policy rule number associated with the attachment.
func (o ConnectAttachmentOutput) AttachmentPolicyRuleNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.IntOutput { return v.AttachmentPolicyRuleNumber }).(pulumi.IntOutput)
}

// The type of attachment.
func (o ConnectAttachmentOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// The ARN of a core network.
func (o ConnectAttachmentOutput) CoreNetworkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.CoreNetworkArn }).(pulumi.StringOutput)
}

// The ID of a core network where you want to create the attachment.
func (o ConnectAttachmentOutput) CoreNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.CoreNetworkId }).(pulumi.StringOutput)
}

// The Region where the edge is located.
func (o ConnectAttachmentOutput) EdgeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.EdgeLocation }).(pulumi.StringOutput)
}

// Options block. See options for more information.
//
// The following arguments are optional:
func (o ConnectAttachmentOutput) Options() ConnectAttachmentOptionsOutput {
	return o.ApplyT(func(v *ConnectAttachment) ConnectAttachmentOptionsOutput { return v.Options }).(ConnectAttachmentOptionsOutput)
}

// The ID of the attachment account owner.
func (o ConnectAttachmentOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The attachment resource ARN.
func (o ConnectAttachmentOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the segment attachment.
func (o ConnectAttachmentOutput) SegmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.SegmentName }).(pulumi.StringOutput)
}

// The state of the attachment.
func (o ConnectAttachmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ConnectAttachmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ConnectAttachmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ID of the attachment between the two connections.
func (o ConnectAttachmentOutput) TransportAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectAttachment) pulumi.StringOutput { return v.TransportAttachmentId }).(pulumi.StringOutput)
}

type ConnectAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ConnectAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectAttachment)(nil)).Elem()
}

func (o ConnectAttachmentArrayOutput) ToConnectAttachmentArrayOutput() ConnectAttachmentArrayOutput {
	return o
}

func (o ConnectAttachmentArrayOutput) ToConnectAttachmentArrayOutputWithContext(ctx context.Context) ConnectAttachmentArrayOutput {
	return o
}

func (o ConnectAttachmentArrayOutput) Index(i pulumi.IntInput) ConnectAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectAttachment {
		return vs[0].([]*ConnectAttachment)[vs[1].(int)]
	}).(ConnectAttachmentOutput)
}

type ConnectAttachmentMapOutput struct{ *pulumi.OutputState }

func (ConnectAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectAttachment)(nil)).Elem()
}

func (o ConnectAttachmentMapOutput) ToConnectAttachmentMapOutput() ConnectAttachmentMapOutput {
	return o
}

func (o ConnectAttachmentMapOutput) ToConnectAttachmentMapOutputWithContext(ctx context.Context) ConnectAttachmentMapOutput {
	return o
}

func (o ConnectAttachmentMapOutput) MapIndex(k pulumi.StringInput) ConnectAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectAttachment {
		return vs[0].(map[string]*ConnectAttachment)[vs[1].(string)]
	}).(ConnectAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectAttachmentInput)(nil)).Elem(), &ConnectAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectAttachmentArrayInput)(nil)).Elem(), ConnectAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectAttachmentMapInput)(nil)).Elem(), ConnectAttachmentMap{})
	pulumi.RegisterOutputType(ConnectAttachmentOutput{})
	pulumi.RegisterOutputType(ConnectAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ConnectAttachmentMapOutput{})
}
