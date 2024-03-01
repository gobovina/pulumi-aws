// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage the default customer master key (CMK) that your AWS account uses to encrypt EBS volumes.
//
// Your AWS account has an AWS-managed default CMK that is used for encrypting an EBS volume when no CMK is specified in the API call that creates the volume.
// By using the `ebs.DefaultKmsKey` resource, you can specify a customer-managed CMK to use in place of the AWS-managed default CMK.
//
// > **NOTE:** Creating an `ebs.DefaultKmsKey` resource does not enable default EBS encryption. Use the `ebs.EncryptionByDefault` to enable default EBS encryption.
//
// > **NOTE:** Destroying this resource will reset the default CMK to the account's AWS-managed default CMK for EBS.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ebs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ebs.NewDefaultKmsKey(ctx, "example", &ebs.DefaultKmsKeyArgs{
//				KeyArn: pulumi.Any(exampleAwsKmsKey.Arn),
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
// Using `pulumi import`, import the EBS default KMS CMK using the KMS key ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:ebs/defaultKmsKey:DefaultKmsKey example arn:aws:kms:us-east-1:123456789012:key/abcd-1234
//
// ```
type DefaultKmsKey struct {
	pulumi.CustomResourceState

	// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
	KeyArn pulumi.StringOutput `pulumi:"keyArn"`
}

// NewDefaultKmsKey registers a new resource with the given unique name, arguments, and options.
func NewDefaultKmsKey(ctx *pulumi.Context,
	name string, args *DefaultKmsKeyArgs, opts ...pulumi.ResourceOption) (*DefaultKmsKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyArn == nil {
		return nil, errors.New("invalid value for required argument 'KeyArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DefaultKmsKey
	err := ctx.RegisterResource("aws:ebs/defaultKmsKey:DefaultKmsKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDefaultKmsKey gets an existing DefaultKmsKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDefaultKmsKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DefaultKmsKeyState, opts ...pulumi.ResourceOption) (*DefaultKmsKey, error) {
	var resource DefaultKmsKey
	err := ctx.ReadResource("aws:ebs/defaultKmsKey:DefaultKmsKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DefaultKmsKey resources.
type defaultKmsKeyState struct {
	// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
	KeyArn *string `pulumi:"keyArn"`
}

type DefaultKmsKeyState struct {
	// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
	KeyArn pulumi.StringPtrInput
}

func (DefaultKmsKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultKmsKeyState)(nil)).Elem()
}

type defaultKmsKeyArgs struct {
	// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
	KeyArn string `pulumi:"keyArn"`
}

// The set of arguments for constructing a DefaultKmsKey resource.
type DefaultKmsKeyArgs struct {
	// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
	KeyArn pulumi.StringInput
}

func (DefaultKmsKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultKmsKeyArgs)(nil)).Elem()
}

type DefaultKmsKeyInput interface {
	pulumi.Input

	ToDefaultKmsKeyOutput() DefaultKmsKeyOutput
	ToDefaultKmsKeyOutputWithContext(ctx context.Context) DefaultKmsKeyOutput
}

func (*DefaultKmsKey) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultKmsKey)(nil)).Elem()
}

func (i *DefaultKmsKey) ToDefaultKmsKeyOutput() DefaultKmsKeyOutput {
	return i.ToDefaultKmsKeyOutputWithContext(context.Background())
}

func (i *DefaultKmsKey) ToDefaultKmsKeyOutputWithContext(ctx context.Context) DefaultKmsKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultKmsKeyOutput)
}

// DefaultKmsKeyArrayInput is an input type that accepts DefaultKmsKeyArray and DefaultKmsKeyArrayOutput values.
// You can construct a concrete instance of `DefaultKmsKeyArrayInput` via:
//
//	DefaultKmsKeyArray{ DefaultKmsKeyArgs{...} }
type DefaultKmsKeyArrayInput interface {
	pulumi.Input

	ToDefaultKmsKeyArrayOutput() DefaultKmsKeyArrayOutput
	ToDefaultKmsKeyArrayOutputWithContext(context.Context) DefaultKmsKeyArrayOutput
}

type DefaultKmsKeyArray []DefaultKmsKeyInput

func (DefaultKmsKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultKmsKey)(nil)).Elem()
}

func (i DefaultKmsKeyArray) ToDefaultKmsKeyArrayOutput() DefaultKmsKeyArrayOutput {
	return i.ToDefaultKmsKeyArrayOutputWithContext(context.Background())
}

func (i DefaultKmsKeyArray) ToDefaultKmsKeyArrayOutputWithContext(ctx context.Context) DefaultKmsKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultKmsKeyArrayOutput)
}

// DefaultKmsKeyMapInput is an input type that accepts DefaultKmsKeyMap and DefaultKmsKeyMapOutput values.
// You can construct a concrete instance of `DefaultKmsKeyMapInput` via:
//
//	DefaultKmsKeyMap{ "key": DefaultKmsKeyArgs{...} }
type DefaultKmsKeyMapInput interface {
	pulumi.Input

	ToDefaultKmsKeyMapOutput() DefaultKmsKeyMapOutput
	ToDefaultKmsKeyMapOutputWithContext(context.Context) DefaultKmsKeyMapOutput
}

type DefaultKmsKeyMap map[string]DefaultKmsKeyInput

func (DefaultKmsKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultKmsKey)(nil)).Elem()
}

func (i DefaultKmsKeyMap) ToDefaultKmsKeyMapOutput() DefaultKmsKeyMapOutput {
	return i.ToDefaultKmsKeyMapOutputWithContext(context.Background())
}

func (i DefaultKmsKeyMap) ToDefaultKmsKeyMapOutputWithContext(ctx context.Context) DefaultKmsKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultKmsKeyMapOutput)
}

type DefaultKmsKeyOutput struct{ *pulumi.OutputState }

func (DefaultKmsKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultKmsKey)(nil)).Elem()
}

func (o DefaultKmsKeyOutput) ToDefaultKmsKeyOutput() DefaultKmsKeyOutput {
	return o
}

func (o DefaultKmsKeyOutput) ToDefaultKmsKeyOutputWithContext(ctx context.Context) DefaultKmsKeyOutput {
	return o
}

// The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
func (o DefaultKmsKeyOutput) KeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultKmsKey) pulumi.StringOutput { return v.KeyArn }).(pulumi.StringOutput)
}

type DefaultKmsKeyArrayOutput struct{ *pulumi.OutputState }

func (DefaultKmsKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultKmsKey)(nil)).Elem()
}

func (o DefaultKmsKeyArrayOutput) ToDefaultKmsKeyArrayOutput() DefaultKmsKeyArrayOutput {
	return o
}

func (o DefaultKmsKeyArrayOutput) ToDefaultKmsKeyArrayOutputWithContext(ctx context.Context) DefaultKmsKeyArrayOutput {
	return o
}

func (o DefaultKmsKeyArrayOutput) Index(i pulumi.IntInput) DefaultKmsKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DefaultKmsKey {
		return vs[0].([]*DefaultKmsKey)[vs[1].(int)]
	}).(DefaultKmsKeyOutput)
}

type DefaultKmsKeyMapOutput struct{ *pulumi.OutputState }

func (DefaultKmsKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultKmsKey)(nil)).Elem()
}

func (o DefaultKmsKeyMapOutput) ToDefaultKmsKeyMapOutput() DefaultKmsKeyMapOutput {
	return o
}

func (o DefaultKmsKeyMapOutput) ToDefaultKmsKeyMapOutputWithContext(ctx context.Context) DefaultKmsKeyMapOutput {
	return o
}

func (o DefaultKmsKeyMapOutput) MapIndex(k pulumi.StringInput) DefaultKmsKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DefaultKmsKey {
		return vs[0].(map[string]*DefaultKmsKey)[vs[1].(string)]
	}).(DefaultKmsKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultKmsKeyInput)(nil)).Elem(), &DefaultKmsKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultKmsKeyArrayInput)(nil)).Elem(), DefaultKmsKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultKmsKeyMapInput)(nil)).Elem(), DefaultKmsKeyMap{})
	pulumi.RegisterOutputType(DefaultKmsKeyOutput{})
	pulumi.RegisterOutputType(DefaultKmsKeyArrayOutput{})
	pulumi.RegisterOutputType(DefaultKmsKeyMapOutput{})
}
