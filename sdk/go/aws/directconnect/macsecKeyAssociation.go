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

// Provides a MAC Security (MACSec) secret key resource for use with Direct Connect. See [MACsec prerequisites](https://docs.aws.amazon.com/directconnect/latest/UserGuide/direct-connect-mac-sec-getting-started.html#mac-sec-prerequisites) for information about MAC Security (MACsec) prerequisites.
//
// Creating this resource will also create a resource of type `secretsmanager.Secret` which is managed by Direct Connect. While you can import this resource into your state, because this secret is managed by Direct Connect, you will not be able to make any modifications to it. See [How AWS Direct Connect uses AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/integrating_how-services-use-secrets_directconnect.html) for details.
//
// > **Note:** All arguments including `ckn` and `cak` will be stored in the raw state as plain-text.
// **Note:** The `secretArn` argument can only be used to reference a previously created MACSec key. You cannot associate a Secrets Manager secret created outside of the `directconnect.MacsecKeyAssociation` resource.
//
// ## Example Usage
//
// ### Create MACSec key with CKN and CAK
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
//			example, err := directconnect.LookupConnection(ctx, &directconnect.LookupConnectionArgs{
//				Name: "tf-dx-connection",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = directconnect.NewMacsecKeyAssociation(ctx, "test", &directconnect.MacsecKeyAssociationArgs{
//				ConnectionId: *pulumi.String(example.Id),
//				Ckn:          pulumi.String("0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef"),
//				Cak:          pulumi.String("abcdef0123456789abcdef0123456789abcdef0123456789abcdef0123456789"),
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
// ### Create MACSec key with existing Secrets Manager secret
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directconnect"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := directconnect.LookupConnection(ctx, &directconnect.LookupConnectionArgs{
//				Name: "tf-dx-connection",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetSecret, err := secretsmanager.LookupSecret(ctx, &secretsmanager.LookupSecretArgs{
//				Name: pulumi.StringRef("directconnect!prod/us-east-1/directconnect/0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = directconnect.NewMacsecKeyAssociation(ctx, "test", &directconnect.MacsecKeyAssociationArgs{
//				ConnectionId: *pulumi.String(example.Id),
//				SecretArn:    *pulumi.String(exampleGetSecret.Arn),
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
type MacsecKeyAssociation struct {
	pulumi.CustomResourceState

	// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
	Cak pulumi.StringPtrOutput `pulumi:"cak"`
	// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
	Ckn pulumi.StringOutput `pulumi:"ckn"`
	// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
	//
	// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
	SecretArn pulumi.StringOutput `pulumi:"secretArn"`
	// The date in UTC format that the MAC Security (MACsec) secret key takes effect.
	StartOn pulumi.StringOutput `pulumi:"startOn"`
	// The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewMacsecKeyAssociation registers a new resource with the given unique name, arguments, and options.
func NewMacsecKeyAssociation(ctx *pulumi.Context,
	name string, args *MacsecKeyAssociationArgs, opts ...pulumi.ResourceOption) (*MacsecKeyAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MacsecKeyAssociation
	err := ctx.RegisterResource("aws:directconnect/macsecKeyAssociation:MacsecKeyAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMacsecKeyAssociation gets an existing MacsecKeyAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMacsecKeyAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MacsecKeyAssociationState, opts ...pulumi.ResourceOption) (*MacsecKeyAssociation, error) {
	var resource MacsecKeyAssociation
	err := ctx.ReadResource("aws:directconnect/macsecKeyAssociation:MacsecKeyAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MacsecKeyAssociation resources.
type macsecKeyAssociationState struct {
	// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
	Cak *string `pulumi:"cak"`
	// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
	Ckn *string `pulumi:"ckn"`
	// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
	ConnectionId *string `pulumi:"connectionId"`
	// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
	//
	// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
	SecretArn *string `pulumi:"secretArn"`
	// The date in UTC format that the MAC Security (MACsec) secret key takes effect.
	StartOn *string `pulumi:"startOn"`
	// The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
	State *string `pulumi:"state"`
}

type MacsecKeyAssociationState struct {
	// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
	Cak pulumi.StringPtrInput
	// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
	Ckn pulumi.StringPtrInput
	// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
	ConnectionId pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
	//
	// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
	SecretArn pulumi.StringPtrInput
	// The date in UTC format that the MAC Security (MACsec) secret key takes effect.
	StartOn pulumi.StringPtrInput
	// The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
	State pulumi.StringPtrInput
}

func (MacsecKeyAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*macsecKeyAssociationState)(nil)).Elem()
}

type macsecKeyAssociationArgs struct {
	// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
	Cak *string `pulumi:"cak"`
	// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
	Ckn *string `pulumi:"ckn"`
	// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
	ConnectionId string `pulumi:"connectionId"`
	// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
	//
	// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
	SecretArn *string `pulumi:"secretArn"`
}

// The set of arguments for constructing a MacsecKeyAssociation resource.
type MacsecKeyAssociationArgs struct {
	// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
	Cak pulumi.StringPtrInput
	// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
	Ckn pulumi.StringPtrInput
	// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
	ConnectionId pulumi.StringInput
	// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
	//
	// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
	SecretArn pulumi.StringPtrInput
}

func (MacsecKeyAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*macsecKeyAssociationArgs)(nil)).Elem()
}

type MacsecKeyAssociationInput interface {
	pulumi.Input

	ToMacsecKeyAssociationOutput() MacsecKeyAssociationOutput
	ToMacsecKeyAssociationOutputWithContext(ctx context.Context) MacsecKeyAssociationOutput
}

func (*MacsecKeyAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**MacsecKeyAssociation)(nil)).Elem()
}

func (i *MacsecKeyAssociation) ToMacsecKeyAssociationOutput() MacsecKeyAssociationOutput {
	return i.ToMacsecKeyAssociationOutputWithContext(context.Background())
}

func (i *MacsecKeyAssociation) ToMacsecKeyAssociationOutputWithContext(ctx context.Context) MacsecKeyAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MacsecKeyAssociationOutput)
}

// MacsecKeyAssociationArrayInput is an input type that accepts MacsecKeyAssociationArray and MacsecKeyAssociationArrayOutput values.
// You can construct a concrete instance of `MacsecKeyAssociationArrayInput` via:
//
//	MacsecKeyAssociationArray{ MacsecKeyAssociationArgs{...} }
type MacsecKeyAssociationArrayInput interface {
	pulumi.Input

	ToMacsecKeyAssociationArrayOutput() MacsecKeyAssociationArrayOutput
	ToMacsecKeyAssociationArrayOutputWithContext(context.Context) MacsecKeyAssociationArrayOutput
}

type MacsecKeyAssociationArray []MacsecKeyAssociationInput

func (MacsecKeyAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MacsecKeyAssociation)(nil)).Elem()
}

func (i MacsecKeyAssociationArray) ToMacsecKeyAssociationArrayOutput() MacsecKeyAssociationArrayOutput {
	return i.ToMacsecKeyAssociationArrayOutputWithContext(context.Background())
}

func (i MacsecKeyAssociationArray) ToMacsecKeyAssociationArrayOutputWithContext(ctx context.Context) MacsecKeyAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MacsecKeyAssociationArrayOutput)
}

// MacsecKeyAssociationMapInput is an input type that accepts MacsecKeyAssociationMap and MacsecKeyAssociationMapOutput values.
// You can construct a concrete instance of `MacsecKeyAssociationMapInput` via:
//
//	MacsecKeyAssociationMap{ "key": MacsecKeyAssociationArgs{...} }
type MacsecKeyAssociationMapInput interface {
	pulumi.Input

	ToMacsecKeyAssociationMapOutput() MacsecKeyAssociationMapOutput
	ToMacsecKeyAssociationMapOutputWithContext(context.Context) MacsecKeyAssociationMapOutput
}

type MacsecKeyAssociationMap map[string]MacsecKeyAssociationInput

func (MacsecKeyAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MacsecKeyAssociation)(nil)).Elem()
}

func (i MacsecKeyAssociationMap) ToMacsecKeyAssociationMapOutput() MacsecKeyAssociationMapOutput {
	return i.ToMacsecKeyAssociationMapOutputWithContext(context.Background())
}

func (i MacsecKeyAssociationMap) ToMacsecKeyAssociationMapOutputWithContext(ctx context.Context) MacsecKeyAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MacsecKeyAssociationMapOutput)
}

type MacsecKeyAssociationOutput struct{ *pulumi.OutputState }

func (MacsecKeyAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MacsecKeyAssociation)(nil)).Elem()
}

func (o MacsecKeyAssociationOutput) ToMacsecKeyAssociationOutput() MacsecKeyAssociationOutput {
	return o
}

func (o MacsecKeyAssociationOutput) ToMacsecKeyAssociationOutputWithContext(ctx context.Context) MacsecKeyAssociationOutput {
	return o
}

// The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
func (o MacsecKeyAssociationOutput) Cak() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringPtrOutput { return v.Cak }).(pulumi.StringPtrOutput)
}

// The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
func (o MacsecKeyAssociationOutput) Ckn() pulumi.StringOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringOutput { return v.Ckn }).(pulumi.StringOutput)
}

// The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
func (o MacsecKeyAssociationOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
//
// > **Note:** `ckn` and `cak` are mutually exclusive with `secretArn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secretArn`. If you use the `secretArn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
func (o MacsecKeyAssociationOutput) SecretArn() pulumi.StringOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringOutput { return v.SecretArn }).(pulumi.StringOutput)
}

// The date in UTC format that the MAC Security (MACsec) secret key takes effect.
func (o MacsecKeyAssociationOutput) StartOn() pulumi.StringOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringOutput { return v.StartOn }).(pulumi.StringOutput)
}

// The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
func (o MacsecKeyAssociationOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *MacsecKeyAssociation) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type MacsecKeyAssociationArrayOutput struct{ *pulumi.OutputState }

func (MacsecKeyAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MacsecKeyAssociation)(nil)).Elem()
}

func (o MacsecKeyAssociationArrayOutput) ToMacsecKeyAssociationArrayOutput() MacsecKeyAssociationArrayOutput {
	return o
}

func (o MacsecKeyAssociationArrayOutput) ToMacsecKeyAssociationArrayOutputWithContext(ctx context.Context) MacsecKeyAssociationArrayOutput {
	return o
}

func (o MacsecKeyAssociationArrayOutput) Index(i pulumi.IntInput) MacsecKeyAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MacsecKeyAssociation {
		return vs[0].([]*MacsecKeyAssociation)[vs[1].(int)]
	}).(MacsecKeyAssociationOutput)
}

type MacsecKeyAssociationMapOutput struct{ *pulumi.OutputState }

func (MacsecKeyAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MacsecKeyAssociation)(nil)).Elem()
}

func (o MacsecKeyAssociationMapOutput) ToMacsecKeyAssociationMapOutput() MacsecKeyAssociationMapOutput {
	return o
}

func (o MacsecKeyAssociationMapOutput) ToMacsecKeyAssociationMapOutputWithContext(ctx context.Context) MacsecKeyAssociationMapOutput {
	return o
}

func (o MacsecKeyAssociationMapOutput) MapIndex(k pulumi.StringInput) MacsecKeyAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MacsecKeyAssociation {
		return vs[0].(map[string]*MacsecKeyAssociation)[vs[1].(string)]
	}).(MacsecKeyAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MacsecKeyAssociationInput)(nil)).Elem(), &MacsecKeyAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*MacsecKeyAssociationArrayInput)(nil)).Elem(), MacsecKeyAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MacsecKeyAssociationMapInput)(nil)).Elem(), MacsecKeyAssociationMap{})
	pulumi.RegisterOutputType(MacsecKeyAssociationOutput{})
	pulumi.RegisterOutputType(MacsecKeyAssociationArrayOutput{})
	pulumi.RegisterOutputType(MacsecKeyAssociationMapOutput{})
}
