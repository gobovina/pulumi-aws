// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Attaches Principal to AWS IoT Thing.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iot"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := iot.NewThing(ctx, "example", &iot.ThingArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			invokeFile, err := std.File(ctx, &std.FileArgs{
//				Input: "csr.pem",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			cert, err := iot.NewCertificate(ctx, "cert", &iot.CertificateArgs{
//				Csr:    invokeFile.Result,
//				Active: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iot.NewThingPrincipalAttachment(ctx, "att", &iot.ThingPrincipalAttachmentArgs{
//				Principal: cert.Arn,
//				Thing:     example.Name,
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
type ThingPrincipalAttachment struct {
	pulumi.CustomResourceState

	// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
	Principal pulumi.StringOutput `pulumi:"principal"`
	// The name of the thing.
	Thing pulumi.StringOutput `pulumi:"thing"`
}

// NewThingPrincipalAttachment registers a new resource with the given unique name, arguments, and options.
func NewThingPrincipalAttachment(ctx *pulumi.Context,
	name string, args *ThingPrincipalAttachmentArgs, opts ...pulumi.ResourceOption) (*ThingPrincipalAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Principal == nil {
		return nil, errors.New("invalid value for required argument 'Principal'")
	}
	if args.Thing == nil {
		return nil, errors.New("invalid value for required argument 'Thing'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ThingPrincipalAttachment
	err := ctx.RegisterResource("aws:iot/thingPrincipalAttachment:ThingPrincipalAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetThingPrincipalAttachment gets an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetThingPrincipalAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThingPrincipalAttachmentState, opts ...pulumi.ResourceOption) (*ThingPrincipalAttachment, error) {
	var resource ThingPrincipalAttachment
	err := ctx.ReadResource("aws:iot/thingPrincipalAttachment:ThingPrincipalAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ThingPrincipalAttachment resources.
type thingPrincipalAttachmentState struct {
	// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
	Principal *string `pulumi:"principal"`
	// The name of the thing.
	Thing *string `pulumi:"thing"`
}

type ThingPrincipalAttachmentState struct {
	// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
	Principal pulumi.StringPtrInput
	// The name of the thing.
	Thing pulumi.StringPtrInput
}

func (ThingPrincipalAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*thingPrincipalAttachmentState)(nil)).Elem()
}

type thingPrincipalAttachmentArgs struct {
	// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
	Principal string `pulumi:"principal"`
	// The name of the thing.
	Thing string `pulumi:"thing"`
}

// The set of arguments for constructing a ThingPrincipalAttachment resource.
type ThingPrincipalAttachmentArgs struct {
	// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
	Principal pulumi.StringInput
	// The name of the thing.
	Thing pulumi.StringInput
}

func (ThingPrincipalAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*thingPrincipalAttachmentArgs)(nil)).Elem()
}

type ThingPrincipalAttachmentInput interface {
	pulumi.Input

	ToThingPrincipalAttachmentOutput() ThingPrincipalAttachmentOutput
	ToThingPrincipalAttachmentOutputWithContext(ctx context.Context) ThingPrincipalAttachmentOutput
}

func (*ThingPrincipalAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingPrincipalAttachment)(nil)).Elem()
}

func (i *ThingPrincipalAttachment) ToThingPrincipalAttachmentOutput() ThingPrincipalAttachmentOutput {
	return i.ToThingPrincipalAttachmentOutputWithContext(context.Background())
}

func (i *ThingPrincipalAttachment) ToThingPrincipalAttachmentOutputWithContext(ctx context.Context) ThingPrincipalAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingPrincipalAttachmentOutput)
}

// ThingPrincipalAttachmentArrayInput is an input type that accepts ThingPrincipalAttachmentArray and ThingPrincipalAttachmentArrayOutput values.
// You can construct a concrete instance of `ThingPrincipalAttachmentArrayInput` via:
//
//	ThingPrincipalAttachmentArray{ ThingPrincipalAttachmentArgs{...} }
type ThingPrincipalAttachmentArrayInput interface {
	pulumi.Input

	ToThingPrincipalAttachmentArrayOutput() ThingPrincipalAttachmentArrayOutput
	ToThingPrincipalAttachmentArrayOutputWithContext(context.Context) ThingPrincipalAttachmentArrayOutput
}

type ThingPrincipalAttachmentArray []ThingPrincipalAttachmentInput

func (ThingPrincipalAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingPrincipalAttachment)(nil)).Elem()
}

func (i ThingPrincipalAttachmentArray) ToThingPrincipalAttachmentArrayOutput() ThingPrincipalAttachmentArrayOutput {
	return i.ToThingPrincipalAttachmentArrayOutputWithContext(context.Background())
}

func (i ThingPrincipalAttachmentArray) ToThingPrincipalAttachmentArrayOutputWithContext(ctx context.Context) ThingPrincipalAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingPrincipalAttachmentArrayOutput)
}

// ThingPrincipalAttachmentMapInput is an input type that accepts ThingPrincipalAttachmentMap and ThingPrincipalAttachmentMapOutput values.
// You can construct a concrete instance of `ThingPrincipalAttachmentMapInput` via:
//
//	ThingPrincipalAttachmentMap{ "key": ThingPrincipalAttachmentArgs{...} }
type ThingPrincipalAttachmentMapInput interface {
	pulumi.Input

	ToThingPrincipalAttachmentMapOutput() ThingPrincipalAttachmentMapOutput
	ToThingPrincipalAttachmentMapOutputWithContext(context.Context) ThingPrincipalAttachmentMapOutput
}

type ThingPrincipalAttachmentMap map[string]ThingPrincipalAttachmentInput

func (ThingPrincipalAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingPrincipalAttachment)(nil)).Elem()
}

func (i ThingPrincipalAttachmentMap) ToThingPrincipalAttachmentMapOutput() ThingPrincipalAttachmentMapOutput {
	return i.ToThingPrincipalAttachmentMapOutputWithContext(context.Background())
}

func (i ThingPrincipalAttachmentMap) ToThingPrincipalAttachmentMapOutputWithContext(ctx context.Context) ThingPrincipalAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingPrincipalAttachmentMapOutput)
}

type ThingPrincipalAttachmentOutput struct{ *pulumi.OutputState }

func (ThingPrincipalAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingPrincipalAttachment)(nil)).Elem()
}

func (o ThingPrincipalAttachmentOutput) ToThingPrincipalAttachmentOutput() ThingPrincipalAttachmentOutput {
	return o
}

func (o ThingPrincipalAttachmentOutput) ToThingPrincipalAttachmentOutputWithContext(ctx context.Context) ThingPrincipalAttachmentOutput {
	return o
}

// The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
func (o ThingPrincipalAttachmentOutput) Principal() pulumi.StringOutput {
	return o.ApplyT(func(v *ThingPrincipalAttachment) pulumi.StringOutput { return v.Principal }).(pulumi.StringOutput)
}

// The name of the thing.
func (o ThingPrincipalAttachmentOutput) Thing() pulumi.StringOutput {
	return o.ApplyT(func(v *ThingPrincipalAttachment) pulumi.StringOutput { return v.Thing }).(pulumi.StringOutput)
}

type ThingPrincipalAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ThingPrincipalAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingPrincipalAttachment)(nil)).Elem()
}

func (o ThingPrincipalAttachmentArrayOutput) ToThingPrincipalAttachmentArrayOutput() ThingPrincipalAttachmentArrayOutput {
	return o
}

func (o ThingPrincipalAttachmentArrayOutput) ToThingPrincipalAttachmentArrayOutputWithContext(ctx context.Context) ThingPrincipalAttachmentArrayOutput {
	return o
}

func (o ThingPrincipalAttachmentArrayOutput) Index(i pulumi.IntInput) ThingPrincipalAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ThingPrincipalAttachment {
		return vs[0].([]*ThingPrincipalAttachment)[vs[1].(int)]
	}).(ThingPrincipalAttachmentOutput)
}

type ThingPrincipalAttachmentMapOutput struct{ *pulumi.OutputState }

func (ThingPrincipalAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingPrincipalAttachment)(nil)).Elem()
}

func (o ThingPrincipalAttachmentMapOutput) ToThingPrincipalAttachmentMapOutput() ThingPrincipalAttachmentMapOutput {
	return o
}

func (o ThingPrincipalAttachmentMapOutput) ToThingPrincipalAttachmentMapOutputWithContext(ctx context.Context) ThingPrincipalAttachmentMapOutput {
	return o
}

func (o ThingPrincipalAttachmentMapOutput) MapIndex(k pulumi.StringInput) ThingPrincipalAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ThingPrincipalAttachment {
		return vs[0].(map[string]*ThingPrincipalAttachment)[vs[1].(string)]
	}).(ThingPrincipalAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThingPrincipalAttachmentInput)(nil)).Elem(), &ThingPrincipalAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingPrincipalAttachmentArrayInput)(nil)).Elem(), ThingPrincipalAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingPrincipalAttachmentMapInput)(nil)).Elem(), ThingPrincipalAttachmentMap{})
	pulumi.RegisterOutputType(ThingPrincipalAttachmentOutput{})
	pulumi.RegisterOutputType(ThingPrincipalAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ThingPrincipalAttachmentMapOutput{})
}
