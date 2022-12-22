// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EC2 Transit Gateway Peering Attachment.
// For examples of custom route table association and propagation, see the [EC2 Transit Gateway Networking Examples Guide](https://docs.aws.amazon.com/vpc/latest/tgw/TGW_Scenarios.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2transitgateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aws.NewProvider(ctx, "local", &aws.ProviderArgs{
//				Region: pulumi.String("us-east-1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = aws.NewProvider(ctx, "peer", &aws.ProviderArgs{
//				Region: pulumi.String("us-west-2"),
//			})
//			if err != nil {
//				return err
//			}
//			peerRegion, err := aws.GetRegion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			localTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "localTransitGateway", &ec2transitgateway.TransitGatewayArgs{
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Local TGW"),
//				},
//			}, pulumi.Provider(aws.Local))
//			if err != nil {
//				return err
//			}
//			peerTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "peerTransitGateway", &ec2transitgateway.TransitGatewayArgs{
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Peer TGW"),
//				},
//			}, pulumi.Provider(aws.Peer))
//			if err != nil {
//				return err
//			}
//			_, err = ec2transitgateway.NewPeeringAttachment(ctx, "example", &ec2transitgateway.PeeringAttachmentArgs{
//				PeerAccountId:        peerTransitGateway.OwnerId,
//				PeerRegion:           *pulumi.String(peerRegion.Name),
//				PeerTransitGatewayId: peerTransitGateway.ID(),
//				TransitGatewayId:     localTransitGateway.ID(),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("TGW Peering Requestor"),
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
// `aws_ec2_transit_gateway_peering_attachment` can be imported by using the EC2 Transit Gateway Attachment identifier, e.g.,
//
// ```sh
//
//	$ pulumi import aws:ec2transitgateway/peeringAttachment:PeeringAttachment example tgw-attach-12345678
//
// ```
type PeeringAttachment struct {
	pulumi.CustomResourceState

	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
	PeerAccountId pulumi.StringOutput `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringOutput `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringOutput `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringOutput `pulumi:"transitGatewayId"`
}

// NewPeeringAttachment registers a new resource with the given unique name, arguments, and options.
func NewPeeringAttachment(ctx *pulumi.Context,
	name string, args *PeeringAttachmentArgs, opts ...pulumi.ResourceOption) (*PeeringAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PeerRegion == nil {
		return nil, errors.New("invalid value for required argument 'PeerRegion'")
	}
	if args.PeerTransitGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'PeerTransitGatewayId'")
	}
	if args.TransitGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'TransitGatewayId'")
	}
	var resource PeeringAttachment
	err := ctx.RegisterResource("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPeeringAttachment gets an existing PeeringAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPeeringAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PeeringAttachmentState, opts ...pulumi.ResourceOption) (*PeeringAttachment, error) {
	var resource PeeringAttachment
	err := ctx.ReadResource("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PeeringAttachment resources.
type peeringAttachmentState struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
	PeerAccountId *string `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion *string `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId *string `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId *string `pulumi:"transitGatewayId"`
}

type PeeringAttachmentState struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
	PeerAccountId pulumi.StringPtrInput
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringPtrInput
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringPtrInput
	// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringPtrInput
}

func (PeeringAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*peeringAttachmentState)(nil)).Elem()
}

type peeringAttachmentArgs struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
	PeerAccountId *string `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion string `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId string `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId string `pulumi:"transitGatewayId"`
}

// The set of arguments for constructing a PeeringAttachment resource.
type PeeringAttachmentArgs struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
	PeerAccountId pulumi.StringPtrInput
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringInput
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringInput
	// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringInput
}

func (PeeringAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*peeringAttachmentArgs)(nil)).Elem()
}

type PeeringAttachmentInput interface {
	pulumi.Input

	ToPeeringAttachmentOutput() PeeringAttachmentOutput
	ToPeeringAttachmentOutputWithContext(ctx context.Context) PeeringAttachmentOutput
}

func (*PeeringAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**PeeringAttachment)(nil)).Elem()
}

func (i *PeeringAttachment) ToPeeringAttachmentOutput() PeeringAttachmentOutput {
	return i.ToPeeringAttachmentOutputWithContext(context.Background())
}

func (i *PeeringAttachment) ToPeeringAttachmentOutputWithContext(ctx context.Context) PeeringAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeeringAttachmentOutput)
}

// PeeringAttachmentArrayInput is an input type that accepts PeeringAttachmentArray and PeeringAttachmentArrayOutput values.
// You can construct a concrete instance of `PeeringAttachmentArrayInput` via:
//
//	PeeringAttachmentArray{ PeeringAttachmentArgs{...} }
type PeeringAttachmentArrayInput interface {
	pulumi.Input

	ToPeeringAttachmentArrayOutput() PeeringAttachmentArrayOutput
	ToPeeringAttachmentArrayOutputWithContext(context.Context) PeeringAttachmentArrayOutput
}

type PeeringAttachmentArray []PeeringAttachmentInput

func (PeeringAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeeringAttachment)(nil)).Elem()
}

func (i PeeringAttachmentArray) ToPeeringAttachmentArrayOutput() PeeringAttachmentArrayOutput {
	return i.ToPeeringAttachmentArrayOutputWithContext(context.Background())
}

func (i PeeringAttachmentArray) ToPeeringAttachmentArrayOutputWithContext(ctx context.Context) PeeringAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeeringAttachmentArrayOutput)
}

// PeeringAttachmentMapInput is an input type that accepts PeeringAttachmentMap and PeeringAttachmentMapOutput values.
// You can construct a concrete instance of `PeeringAttachmentMapInput` via:
//
//	PeeringAttachmentMap{ "key": PeeringAttachmentArgs{...} }
type PeeringAttachmentMapInput interface {
	pulumi.Input

	ToPeeringAttachmentMapOutput() PeeringAttachmentMapOutput
	ToPeeringAttachmentMapOutputWithContext(context.Context) PeeringAttachmentMapOutput
}

type PeeringAttachmentMap map[string]PeeringAttachmentInput

func (PeeringAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeeringAttachment)(nil)).Elem()
}

func (i PeeringAttachmentMap) ToPeeringAttachmentMapOutput() PeeringAttachmentMapOutput {
	return i.ToPeeringAttachmentMapOutputWithContext(context.Background())
}

func (i PeeringAttachmentMap) ToPeeringAttachmentMapOutputWithContext(ctx context.Context) PeeringAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeeringAttachmentMapOutput)
}

type PeeringAttachmentOutput struct{ *pulumi.OutputState }

func (PeeringAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PeeringAttachment)(nil)).Elem()
}

func (o PeeringAttachmentOutput) ToPeeringAttachmentOutput() PeeringAttachmentOutput {
	return o
}

func (o PeeringAttachmentOutput) ToPeeringAttachmentOutputWithContext(ctx context.Context) PeeringAttachmentOutput {
	return o
}

// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the AWS provider is currently connected to.
func (o PeeringAttachmentOutput) PeerAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringOutput { return v.PeerAccountId }).(pulumi.StringOutput)
}

// Region of EC2 Transit Gateway to peer with.
func (o PeeringAttachmentOutput) PeerRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringOutput { return v.PeerRegion }).(pulumi.StringOutput)
}

// Identifier of EC2 Transit Gateway to peer with.
func (o PeeringAttachmentOutput) PeerTransitGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringOutput { return v.PeerTransitGatewayId }).(pulumi.StringOutput)
}

// Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o PeeringAttachmentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o PeeringAttachmentOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Identifier of EC2 Transit Gateway.
func (o PeeringAttachmentOutput) TransitGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeeringAttachment) pulumi.StringOutput { return v.TransitGatewayId }).(pulumi.StringOutput)
}

type PeeringAttachmentArrayOutput struct{ *pulumi.OutputState }

func (PeeringAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeeringAttachment)(nil)).Elem()
}

func (o PeeringAttachmentArrayOutput) ToPeeringAttachmentArrayOutput() PeeringAttachmentArrayOutput {
	return o
}

func (o PeeringAttachmentArrayOutput) ToPeeringAttachmentArrayOutputWithContext(ctx context.Context) PeeringAttachmentArrayOutput {
	return o
}

func (o PeeringAttachmentArrayOutput) Index(i pulumi.IntInput) PeeringAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PeeringAttachment {
		return vs[0].([]*PeeringAttachment)[vs[1].(int)]
	}).(PeeringAttachmentOutput)
}

type PeeringAttachmentMapOutput struct{ *pulumi.OutputState }

func (PeeringAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeeringAttachment)(nil)).Elem()
}

func (o PeeringAttachmentMapOutput) ToPeeringAttachmentMapOutput() PeeringAttachmentMapOutput {
	return o
}

func (o PeeringAttachmentMapOutput) ToPeeringAttachmentMapOutputWithContext(ctx context.Context) PeeringAttachmentMapOutput {
	return o
}

func (o PeeringAttachmentMapOutput) MapIndex(k pulumi.StringInput) PeeringAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PeeringAttachment {
		return vs[0].(map[string]*PeeringAttachment)[vs[1].(string)]
	}).(PeeringAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PeeringAttachmentInput)(nil)).Elem(), &PeeringAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeeringAttachmentArrayInput)(nil)).Elem(), PeeringAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeeringAttachmentMapInput)(nil)).Elem(), PeeringAttachmentMap{})
	pulumi.RegisterOutputType(PeeringAttachmentOutput{})
	pulumi.RegisterOutputType(PeeringAttachmentArrayOutput{})
	pulumi.RegisterOutputType(PeeringAttachmentMapOutput{})
}
