// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package verifiedaccess

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing a Verified Access Instance Trust Provider Attachment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/verifiedaccess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := verifiedaccess.NewInstance(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			exampleTrustProvider, err := verifiedaccess.NewTrustProvider(ctx, "example", &verifiedaccess.TrustProviderArgs{
//				DeviceTrustProviderType: pulumi.String("jamf"),
//				PolicyReferenceName:     pulumi.String("example"),
//				TrustProviderType:       pulumi.String("device"),
//				DeviceOptions: &verifiedaccess.TrustProviderDeviceOptionsArgs{
//					TenantId: pulumi.String("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = verifiedaccess.NewInstanceTrustProviderAttachment(ctx, "example", &verifiedaccess.InstanceTrustProviderAttachmentArgs{
//				VerifiedaccessInstanceId:      example.ID(),
//				VerifiedaccessTrustProviderId: exampleTrustProvider.ID(),
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
// Using `pulumi import`, import Verified Access Instance Trust Provider Attachments using the `verifiedaccess_instance_id` and `verifiedaccess_trust_provider_id` separated by a forward slash (`/`). For example:
//
// ```sh
//
//	$ pulumi import aws:verifiedaccess/instanceTrustProviderAttachment:InstanceTrustProviderAttachment example vai-1234567890abcdef0/vatp-8012925589
//
// ```
type InstanceTrustProviderAttachment struct {
	pulumi.CustomResourceState

	// The ID of the Verified Access instance to attach the Trust Provider to.
	VerifiedaccessInstanceId pulumi.StringOutput `pulumi:"verifiedaccessInstanceId"`
	// The ID of the Verified Access trust provider.
	VerifiedaccessTrustProviderId pulumi.StringOutput `pulumi:"verifiedaccessTrustProviderId"`
}

// NewInstanceTrustProviderAttachment registers a new resource with the given unique name, arguments, and options.
func NewInstanceTrustProviderAttachment(ctx *pulumi.Context,
	name string, args *InstanceTrustProviderAttachmentArgs, opts ...pulumi.ResourceOption) (*InstanceTrustProviderAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VerifiedaccessInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'VerifiedaccessInstanceId'")
	}
	if args.VerifiedaccessTrustProviderId == nil {
		return nil, errors.New("invalid value for required argument 'VerifiedaccessTrustProviderId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceTrustProviderAttachment
	err := ctx.RegisterResource("aws:verifiedaccess/instanceTrustProviderAttachment:InstanceTrustProviderAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceTrustProviderAttachment gets an existing InstanceTrustProviderAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceTrustProviderAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceTrustProviderAttachmentState, opts ...pulumi.ResourceOption) (*InstanceTrustProviderAttachment, error) {
	var resource InstanceTrustProviderAttachment
	err := ctx.ReadResource("aws:verifiedaccess/instanceTrustProviderAttachment:InstanceTrustProviderAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceTrustProviderAttachment resources.
type instanceTrustProviderAttachmentState struct {
	// The ID of the Verified Access instance to attach the Trust Provider to.
	VerifiedaccessInstanceId *string `pulumi:"verifiedaccessInstanceId"`
	// The ID of the Verified Access trust provider.
	VerifiedaccessTrustProviderId *string `pulumi:"verifiedaccessTrustProviderId"`
}

type InstanceTrustProviderAttachmentState struct {
	// The ID of the Verified Access instance to attach the Trust Provider to.
	VerifiedaccessInstanceId pulumi.StringPtrInput
	// The ID of the Verified Access trust provider.
	VerifiedaccessTrustProviderId pulumi.StringPtrInput
}

func (InstanceTrustProviderAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTrustProviderAttachmentState)(nil)).Elem()
}

type instanceTrustProviderAttachmentArgs struct {
	// The ID of the Verified Access instance to attach the Trust Provider to.
	VerifiedaccessInstanceId string `pulumi:"verifiedaccessInstanceId"`
	// The ID of the Verified Access trust provider.
	VerifiedaccessTrustProviderId string `pulumi:"verifiedaccessTrustProviderId"`
}

// The set of arguments for constructing a InstanceTrustProviderAttachment resource.
type InstanceTrustProviderAttachmentArgs struct {
	// The ID of the Verified Access instance to attach the Trust Provider to.
	VerifiedaccessInstanceId pulumi.StringInput
	// The ID of the Verified Access trust provider.
	VerifiedaccessTrustProviderId pulumi.StringInput
}

func (InstanceTrustProviderAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceTrustProviderAttachmentArgs)(nil)).Elem()
}

type InstanceTrustProviderAttachmentInput interface {
	pulumi.Input

	ToInstanceTrustProviderAttachmentOutput() InstanceTrustProviderAttachmentOutput
	ToInstanceTrustProviderAttachmentOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentOutput
}

func (*InstanceTrustProviderAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTrustProviderAttachment)(nil)).Elem()
}

func (i *InstanceTrustProviderAttachment) ToInstanceTrustProviderAttachmentOutput() InstanceTrustProviderAttachmentOutput {
	return i.ToInstanceTrustProviderAttachmentOutputWithContext(context.Background())
}

func (i *InstanceTrustProviderAttachment) ToInstanceTrustProviderAttachmentOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTrustProviderAttachmentOutput)
}

// InstanceTrustProviderAttachmentArrayInput is an input type that accepts InstanceTrustProviderAttachmentArray and InstanceTrustProviderAttachmentArrayOutput values.
// You can construct a concrete instance of `InstanceTrustProviderAttachmentArrayInput` via:
//
//	InstanceTrustProviderAttachmentArray{ InstanceTrustProviderAttachmentArgs{...} }
type InstanceTrustProviderAttachmentArrayInput interface {
	pulumi.Input

	ToInstanceTrustProviderAttachmentArrayOutput() InstanceTrustProviderAttachmentArrayOutput
	ToInstanceTrustProviderAttachmentArrayOutputWithContext(context.Context) InstanceTrustProviderAttachmentArrayOutput
}

type InstanceTrustProviderAttachmentArray []InstanceTrustProviderAttachmentInput

func (InstanceTrustProviderAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTrustProviderAttachment)(nil)).Elem()
}

func (i InstanceTrustProviderAttachmentArray) ToInstanceTrustProviderAttachmentArrayOutput() InstanceTrustProviderAttachmentArrayOutput {
	return i.ToInstanceTrustProviderAttachmentArrayOutputWithContext(context.Background())
}

func (i InstanceTrustProviderAttachmentArray) ToInstanceTrustProviderAttachmentArrayOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTrustProviderAttachmentArrayOutput)
}

// InstanceTrustProviderAttachmentMapInput is an input type that accepts InstanceTrustProviderAttachmentMap and InstanceTrustProviderAttachmentMapOutput values.
// You can construct a concrete instance of `InstanceTrustProviderAttachmentMapInput` via:
//
//	InstanceTrustProviderAttachmentMap{ "key": InstanceTrustProviderAttachmentArgs{...} }
type InstanceTrustProviderAttachmentMapInput interface {
	pulumi.Input

	ToInstanceTrustProviderAttachmentMapOutput() InstanceTrustProviderAttachmentMapOutput
	ToInstanceTrustProviderAttachmentMapOutputWithContext(context.Context) InstanceTrustProviderAttachmentMapOutput
}

type InstanceTrustProviderAttachmentMap map[string]InstanceTrustProviderAttachmentInput

func (InstanceTrustProviderAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTrustProviderAttachment)(nil)).Elem()
}

func (i InstanceTrustProviderAttachmentMap) ToInstanceTrustProviderAttachmentMapOutput() InstanceTrustProviderAttachmentMapOutput {
	return i.ToInstanceTrustProviderAttachmentMapOutputWithContext(context.Background())
}

func (i InstanceTrustProviderAttachmentMap) ToInstanceTrustProviderAttachmentMapOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceTrustProviderAttachmentMapOutput)
}

type InstanceTrustProviderAttachmentOutput struct{ *pulumi.OutputState }

func (InstanceTrustProviderAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceTrustProviderAttachment)(nil)).Elem()
}

func (o InstanceTrustProviderAttachmentOutput) ToInstanceTrustProviderAttachmentOutput() InstanceTrustProviderAttachmentOutput {
	return o
}

func (o InstanceTrustProviderAttachmentOutput) ToInstanceTrustProviderAttachmentOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentOutput {
	return o
}

// The ID of the Verified Access instance to attach the Trust Provider to.
func (o InstanceTrustProviderAttachmentOutput) VerifiedaccessInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTrustProviderAttachment) pulumi.StringOutput { return v.VerifiedaccessInstanceId }).(pulumi.StringOutput)
}

// The ID of the Verified Access trust provider.
func (o InstanceTrustProviderAttachmentOutput) VerifiedaccessTrustProviderId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceTrustProviderAttachment) pulumi.StringOutput { return v.VerifiedaccessTrustProviderId }).(pulumi.StringOutput)
}

type InstanceTrustProviderAttachmentArrayOutput struct{ *pulumi.OutputState }

func (InstanceTrustProviderAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceTrustProviderAttachment)(nil)).Elem()
}

func (o InstanceTrustProviderAttachmentArrayOutput) ToInstanceTrustProviderAttachmentArrayOutput() InstanceTrustProviderAttachmentArrayOutput {
	return o
}

func (o InstanceTrustProviderAttachmentArrayOutput) ToInstanceTrustProviderAttachmentArrayOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentArrayOutput {
	return o
}

func (o InstanceTrustProviderAttachmentArrayOutput) Index(i pulumi.IntInput) InstanceTrustProviderAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceTrustProviderAttachment {
		return vs[0].([]*InstanceTrustProviderAttachment)[vs[1].(int)]
	}).(InstanceTrustProviderAttachmentOutput)
}

type InstanceTrustProviderAttachmentMapOutput struct{ *pulumi.OutputState }

func (InstanceTrustProviderAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceTrustProviderAttachment)(nil)).Elem()
}

func (o InstanceTrustProviderAttachmentMapOutput) ToInstanceTrustProviderAttachmentMapOutput() InstanceTrustProviderAttachmentMapOutput {
	return o
}

func (o InstanceTrustProviderAttachmentMapOutput) ToInstanceTrustProviderAttachmentMapOutputWithContext(ctx context.Context) InstanceTrustProviderAttachmentMapOutput {
	return o
}

func (o InstanceTrustProviderAttachmentMapOutput) MapIndex(k pulumi.StringInput) InstanceTrustProviderAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceTrustProviderAttachment {
		return vs[0].(map[string]*InstanceTrustProviderAttachment)[vs[1].(string)]
	}).(InstanceTrustProviderAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTrustProviderAttachmentInput)(nil)).Elem(), &InstanceTrustProviderAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTrustProviderAttachmentArrayInput)(nil)).Elem(), InstanceTrustProviderAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceTrustProviderAttachmentMapInput)(nil)).Elem(), InstanceTrustProviderAttachmentMap{})
	pulumi.RegisterOutputType(InstanceTrustProviderAttachmentOutput{})
	pulumi.RegisterOutputType(InstanceTrustProviderAttachmentArrayOutput{})
	pulumi.RegisterOutputType(InstanceTrustProviderAttachmentMapOutput{})
}
