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

// Resource for managing an AWS Network Manager SiteToSiteAttachment.
//
// ## Example Usage
// ### Basic Usage
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
//			_, err := networkmanager.NewSiteToSiteVpnAttachment(ctx, "example", &networkmanager.SiteToSiteVpnAttachmentArgs{
//				CoreNetworkId:    pulumi.Any(exampleAwsccNetworkmanagerCoreNetwork.Id),
//				VpnConnectionArn: pulumi.Any(exampleAwsVpnConnection.Arn),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Full Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkmanager"
//	"github.com/pulumi/pulumi-awscc/sdk/v1/go/awscc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func notImplemented(message string) pulumi.AnyOutput {
//	  panic(message)
//	}
//
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// testCustomerGateway, err := ec2.NewCustomerGateway(ctx, "test", &ec2.CustomerGatewayArgs{
// BgpAsn: pulumi.String("65000"),
// IpAddress: pulumi.String("172.0.0.1"),
// Type: pulumi.String("ipsec.1"),
// })
// if err != nil {
// return err
// }
// testVpnConnection, err := ec2.NewVpnConnection(ctx, "test", &ec2.VpnConnectionArgs{
// CustomerGatewayId: testCustomerGateway.ID(),
// Type: pulumi.String("ipsec.1"),
// Tags: pulumi.StringMap{
// "Name": pulumi.String("test"),
// },
// })
// if err != nil {
// return err
// }
// testGlobalNetwork, err := networkmanager.NewGlobalNetwork(ctx, "test", &networkmanager.GlobalNetworkArgs{
// Tags: pulumi.StringMap{
// "Name": pulumi.String("test"),
// },
// })
// if err != nil {
// return err
// }
// testNetworkmanagerCoreNetwork, err := index.NewNetworkmanagerCoreNetwork(ctx, "test", &index.NetworkmanagerCoreNetworkArgs{
// GlobalNetworkId: testGlobalNetwork.ID(),
// PolicyDocument: %!v(PANIC=Format method: fatal: An assertion has failed: unlowered function toJSON),
// })
// if err != nil {
// return err
// }
// _, err = networkmanager.GetCoreNetworkPolicyDocument(ctx, &networkmanager.GetCoreNetworkPolicyDocumentArgs{
// CoreNetworkConfigurations: []networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration{
// {
// VpnEcmpSupport: pulumi.BoolRef(false),
// AsnRanges: []string{
// "64512-64555",
// },
// EdgeLocations: []networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation{
// {
// Location: current.Name,
// Asn: pulumi.StringRef("64512"),
// },
// },
// },
// },
// Segments: []networkmanager.GetCoreNetworkPolicyDocumentSegment{
// {
// Name: "shared",
// Description: pulumi.StringRef("SegmentForSharedServices"),
// RequireAttachmentAcceptance: pulumi.BoolRef(true),
// },
// },
// SegmentActions: []networkmanager.GetCoreNetworkPolicyDocumentSegmentAction{
// {
// Action: "share",
// Mode: pulumi.StringRef("attachment-route"),
// Segment: "shared",
// ShareWiths: []string{
// "*",
// },
// },
// },
// AttachmentPolicies: []networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicy{
// {
// RuleNumber: 1,
// ConditionLogic: pulumi.StringRef("or"),
// Conditions: []networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition{
// {
// Type: "tag-value",
// Operator: pulumi.StringRef("equals"),
// Key: pulumi.StringRef("segment"),
// Value: pulumi.StringRef("shared"),
// },
// },
// Action: {
// AssociationMethod: "constant",
// Segment: pulumi.StringRef("shared"),
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// testSiteToSiteVpnAttachment, err := networkmanager.NewSiteToSiteVpnAttachment(ctx, "test", &networkmanager.SiteToSiteVpnAttachmentArgs{
// CoreNetworkId: testNetworkmanagerCoreNetwork.Id,
// VpnConnectionArn: testVpnConnection.Arn,
// Tags: pulumi.StringMap{
// "segment": pulumi.String("shared"),
// },
// })
// if err != nil {
// return err
// }
// _, err = networkmanager.NewAttachmentAccepter(ctx, "test", &networkmanager.AttachmentAccepterArgs{
// AttachmentId: testSiteToSiteVpnAttachment.ID(),
// AttachmentType: testSiteToSiteVpnAttachment.AttachmentType,
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ## Import
//
// Using `pulumi import`, import `aws_networkmanager_site_to_site_vpn_attachment` using the attachment ID. For example:
//
// ```sh
//
//	$ pulumi import aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment example attachment-0f8fa60d2238d1bd8
//
// ```
type SiteToSiteVpnAttachment struct {
	pulumi.CustomResourceState

	// The ARN of the attachment.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntOutput `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringOutput `pulumi:"coreNetworkArn"`
	// The ID of a core network for the VPN attachment.
	CoreNetworkId pulumi.StringOutput `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation pulumi.StringOutput `pulumi:"edgeLocation"`
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
	// The ARN of the site-to-site VPN connection.
	//
	// The following arguments are optional:
	VpnConnectionArn pulumi.StringOutput `pulumi:"vpnConnectionArn"`
}

// NewSiteToSiteVpnAttachment registers a new resource with the given unique name, arguments, and options.
func NewSiteToSiteVpnAttachment(ctx *pulumi.Context,
	name string, args *SiteToSiteVpnAttachmentArgs, opts ...pulumi.ResourceOption) (*SiteToSiteVpnAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CoreNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'CoreNetworkId'")
	}
	if args.VpnConnectionArn == nil {
		return nil, errors.New("invalid value for required argument 'VpnConnectionArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SiteToSiteVpnAttachment
	err := ctx.RegisterResource("aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSiteToSiteVpnAttachment gets an existing SiteToSiteVpnAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSiteToSiteVpnAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SiteToSiteVpnAttachmentState, opts ...pulumi.ResourceOption) (*SiteToSiteVpnAttachment, error) {
	var resource SiteToSiteVpnAttachment
	err := ctx.ReadResource("aws:networkmanager/siteToSiteVpnAttachment:SiteToSiteVpnAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SiteToSiteVpnAttachment resources.
type siteToSiteVpnAttachmentState struct {
	// The ARN of the attachment.
	Arn *string `pulumi:"arn"`
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber *int `pulumi:"attachmentPolicyRuleNumber"`
	// The type of attachment.
	AttachmentType *string `pulumi:"attachmentType"`
	// The ARN of a core network.
	CoreNetworkArn *string `pulumi:"coreNetworkArn"`
	// The ID of a core network for the VPN attachment.
	CoreNetworkId *string `pulumi:"coreNetworkId"`
	// The Region where the edge is located.
	EdgeLocation *string `pulumi:"edgeLocation"`
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
	// The ARN of the site-to-site VPN connection.
	//
	// The following arguments are optional:
	VpnConnectionArn *string `pulumi:"vpnConnectionArn"`
}

type SiteToSiteVpnAttachmentState struct {
	// The ARN of the attachment.
	Arn pulumi.StringPtrInput
	// The policy rule number associated with the attachment.
	AttachmentPolicyRuleNumber pulumi.IntPtrInput
	// The type of attachment.
	AttachmentType pulumi.StringPtrInput
	// The ARN of a core network.
	CoreNetworkArn pulumi.StringPtrInput
	// The ID of a core network for the VPN attachment.
	CoreNetworkId pulumi.StringPtrInput
	// The Region where the edge is located.
	EdgeLocation pulumi.StringPtrInput
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
	// The ARN of the site-to-site VPN connection.
	//
	// The following arguments are optional:
	VpnConnectionArn pulumi.StringPtrInput
}

func (SiteToSiteVpnAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*siteToSiteVpnAttachmentState)(nil)).Elem()
}

type siteToSiteVpnAttachmentArgs struct {
	// The ID of a core network for the VPN attachment.
	CoreNetworkId string `pulumi:"coreNetworkId"`
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ARN of the site-to-site VPN connection.
	//
	// The following arguments are optional:
	VpnConnectionArn string `pulumi:"vpnConnectionArn"`
}

// The set of arguments for constructing a SiteToSiteVpnAttachment resource.
type SiteToSiteVpnAttachmentArgs struct {
	// The ID of a core network for the VPN attachment.
	CoreNetworkId pulumi.StringInput
	// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ARN of the site-to-site VPN connection.
	//
	// The following arguments are optional:
	VpnConnectionArn pulumi.StringInput
}

func (SiteToSiteVpnAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*siteToSiteVpnAttachmentArgs)(nil)).Elem()
}

type SiteToSiteVpnAttachmentInput interface {
	pulumi.Input

	ToSiteToSiteVpnAttachmentOutput() SiteToSiteVpnAttachmentOutput
	ToSiteToSiteVpnAttachmentOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentOutput
}

func (*SiteToSiteVpnAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**SiteToSiteVpnAttachment)(nil)).Elem()
}

func (i *SiteToSiteVpnAttachment) ToSiteToSiteVpnAttachmentOutput() SiteToSiteVpnAttachmentOutput {
	return i.ToSiteToSiteVpnAttachmentOutputWithContext(context.Background())
}

func (i *SiteToSiteVpnAttachment) ToSiteToSiteVpnAttachmentOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteToSiteVpnAttachmentOutput)
}

// SiteToSiteVpnAttachmentArrayInput is an input type that accepts SiteToSiteVpnAttachmentArray and SiteToSiteVpnAttachmentArrayOutput values.
// You can construct a concrete instance of `SiteToSiteVpnAttachmentArrayInput` via:
//
//	SiteToSiteVpnAttachmentArray{ SiteToSiteVpnAttachmentArgs{...} }
type SiteToSiteVpnAttachmentArrayInput interface {
	pulumi.Input

	ToSiteToSiteVpnAttachmentArrayOutput() SiteToSiteVpnAttachmentArrayOutput
	ToSiteToSiteVpnAttachmentArrayOutputWithContext(context.Context) SiteToSiteVpnAttachmentArrayOutput
}

type SiteToSiteVpnAttachmentArray []SiteToSiteVpnAttachmentInput

func (SiteToSiteVpnAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SiteToSiteVpnAttachment)(nil)).Elem()
}

func (i SiteToSiteVpnAttachmentArray) ToSiteToSiteVpnAttachmentArrayOutput() SiteToSiteVpnAttachmentArrayOutput {
	return i.ToSiteToSiteVpnAttachmentArrayOutputWithContext(context.Background())
}

func (i SiteToSiteVpnAttachmentArray) ToSiteToSiteVpnAttachmentArrayOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteToSiteVpnAttachmentArrayOutput)
}

// SiteToSiteVpnAttachmentMapInput is an input type that accepts SiteToSiteVpnAttachmentMap and SiteToSiteVpnAttachmentMapOutput values.
// You can construct a concrete instance of `SiteToSiteVpnAttachmentMapInput` via:
//
//	SiteToSiteVpnAttachmentMap{ "key": SiteToSiteVpnAttachmentArgs{...} }
type SiteToSiteVpnAttachmentMapInput interface {
	pulumi.Input

	ToSiteToSiteVpnAttachmentMapOutput() SiteToSiteVpnAttachmentMapOutput
	ToSiteToSiteVpnAttachmentMapOutputWithContext(context.Context) SiteToSiteVpnAttachmentMapOutput
}

type SiteToSiteVpnAttachmentMap map[string]SiteToSiteVpnAttachmentInput

func (SiteToSiteVpnAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SiteToSiteVpnAttachment)(nil)).Elem()
}

func (i SiteToSiteVpnAttachmentMap) ToSiteToSiteVpnAttachmentMapOutput() SiteToSiteVpnAttachmentMapOutput {
	return i.ToSiteToSiteVpnAttachmentMapOutputWithContext(context.Background())
}

func (i SiteToSiteVpnAttachmentMap) ToSiteToSiteVpnAttachmentMapOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SiteToSiteVpnAttachmentMapOutput)
}

type SiteToSiteVpnAttachmentOutput struct{ *pulumi.OutputState }

func (SiteToSiteVpnAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SiteToSiteVpnAttachment)(nil)).Elem()
}

func (o SiteToSiteVpnAttachmentOutput) ToSiteToSiteVpnAttachmentOutput() SiteToSiteVpnAttachmentOutput {
	return o
}

func (o SiteToSiteVpnAttachmentOutput) ToSiteToSiteVpnAttachmentOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentOutput {
	return o
}

// The ARN of the attachment.
func (o SiteToSiteVpnAttachmentOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The policy rule number associated with the attachment.
func (o SiteToSiteVpnAttachmentOutput) AttachmentPolicyRuleNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.IntOutput { return v.AttachmentPolicyRuleNumber }).(pulumi.IntOutput)
}

// The type of attachment.
func (o SiteToSiteVpnAttachmentOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// The ARN of a core network.
func (o SiteToSiteVpnAttachmentOutput) CoreNetworkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.CoreNetworkArn }).(pulumi.StringOutput)
}

// The ID of a core network for the VPN attachment.
func (o SiteToSiteVpnAttachmentOutput) CoreNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.CoreNetworkId }).(pulumi.StringOutput)
}

// The Region where the edge is located.
func (o SiteToSiteVpnAttachmentOutput) EdgeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.EdgeLocation }).(pulumi.StringOutput)
}

// The ID of the attachment account owner.
func (o SiteToSiteVpnAttachmentOutput) OwnerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.OwnerAccountId }).(pulumi.StringOutput)
}

// The attachment resource ARN.
func (o SiteToSiteVpnAttachmentOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the segment attachment.
func (o SiteToSiteVpnAttachmentOutput) SegmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.SegmentName }).(pulumi.StringOutput)
}

// The state of the attachment.
func (o SiteToSiteVpnAttachmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o SiteToSiteVpnAttachmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o SiteToSiteVpnAttachmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ARN of the site-to-site VPN connection.
//
// The following arguments are optional:
func (o SiteToSiteVpnAttachmentOutput) VpnConnectionArn() pulumi.StringOutput {
	return o.ApplyT(func(v *SiteToSiteVpnAttachment) pulumi.StringOutput { return v.VpnConnectionArn }).(pulumi.StringOutput)
}

type SiteToSiteVpnAttachmentArrayOutput struct{ *pulumi.OutputState }

func (SiteToSiteVpnAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SiteToSiteVpnAttachment)(nil)).Elem()
}

func (o SiteToSiteVpnAttachmentArrayOutput) ToSiteToSiteVpnAttachmentArrayOutput() SiteToSiteVpnAttachmentArrayOutput {
	return o
}

func (o SiteToSiteVpnAttachmentArrayOutput) ToSiteToSiteVpnAttachmentArrayOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentArrayOutput {
	return o
}

func (o SiteToSiteVpnAttachmentArrayOutput) Index(i pulumi.IntInput) SiteToSiteVpnAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SiteToSiteVpnAttachment {
		return vs[0].([]*SiteToSiteVpnAttachment)[vs[1].(int)]
	}).(SiteToSiteVpnAttachmentOutput)
}

type SiteToSiteVpnAttachmentMapOutput struct{ *pulumi.OutputState }

func (SiteToSiteVpnAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SiteToSiteVpnAttachment)(nil)).Elem()
}

func (o SiteToSiteVpnAttachmentMapOutput) ToSiteToSiteVpnAttachmentMapOutput() SiteToSiteVpnAttachmentMapOutput {
	return o
}

func (o SiteToSiteVpnAttachmentMapOutput) ToSiteToSiteVpnAttachmentMapOutputWithContext(ctx context.Context) SiteToSiteVpnAttachmentMapOutput {
	return o
}

func (o SiteToSiteVpnAttachmentMapOutput) MapIndex(k pulumi.StringInput) SiteToSiteVpnAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SiteToSiteVpnAttachment {
		return vs[0].(map[string]*SiteToSiteVpnAttachment)[vs[1].(string)]
	}).(SiteToSiteVpnAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SiteToSiteVpnAttachmentInput)(nil)).Elem(), &SiteToSiteVpnAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SiteToSiteVpnAttachmentArrayInput)(nil)).Elem(), SiteToSiteVpnAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SiteToSiteVpnAttachmentMapInput)(nil)).Elem(), SiteToSiteVpnAttachmentMap{})
	pulumi.RegisterOutputType(SiteToSiteVpnAttachmentOutput{})
	pulumi.RegisterOutputType(SiteToSiteVpnAttachmentArrayOutput{})
	pulumi.RegisterOutputType(SiteToSiteVpnAttachmentMapOutput{})
}
