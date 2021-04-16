// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an IAM access key. This is a set of credentials that allow API requests to be made as an IAM user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		lbUser, err := iam.NewUser(ctx, "lbUser", &iam.UserArgs{
// 			Path: pulumi.String("/system/"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		lbAccessKey, err := iam.NewAccessKey(ctx, "lbAccessKey", &iam.AccessKeyArgs{
// 			User:   lbUser.Name,
// 			PgpKey: pulumi.String("keybase:some_person_that_exists"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iam.NewUserPolicy(ctx, "lbRo", &iam.UserPolicyArgs{
// 			User:   lbUser.Name,
// 			Policy: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Action\": [\n", "        \"ec2:Describe*\"\n", "      ],\n", "      \"Effect\": \"Allow\",\n", "      \"Resource\": \"*\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("secret", lbAccessKey.EncryptedSecret)
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testUser, err := iam.NewUser(ctx, "testUser", &iam.UserArgs{
// 			Path: pulumi.String("/test/"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testAccessKey, err := iam.NewAccessKey(ctx, "testAccessKey", &iam.AccessKeyArgs{
// 			User: testUser.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("awsIamSmtpPasswordV4", testAccessKey.SesSmtpPasswordV4)
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// IAM Access Keys can be imported using the identifier, e.g.
//
// ```sh
//  $ pulumi import aws:iam/accessKey:AccessKey example AKIA1234567890
// ```
//
//  Resource attributes such as `encrypted_secret`, `key_fingerprint`, `pgp_key`, `secret`, and `ses_smtp_password_v4` are not available for imported resources as this information cannot be read from the IAM API.
type AccessKey struct {
	pulumi.CustomResourceState

	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
	CreateDate      pulumi.StringOutput `pulumi:"createDate"`
	EncryptedSecret pulumi.StringOutput `pulumi:"encryptedSecret"`
	// The fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
	KeyFingerprint pulumi.StringOutput `pulumi:"keyFingerprint"`
	// Either a base-64 encoded PGP public key, or a
	// keybase username in the form `keybase:some_person_that_exists`, for use
	// in the `encryptedSecret` output attribute.
	PgpKey pulumi.StringPtrOutput `pulumi:"pgpKey"`
	// The secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgpKey` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
	Secret pulumi.StringOutput `pulumi:"secret"`
	// The secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
	SesSmtpPasswordV4 pulumi.StringOutput `pulumi:"sesSmtpPasswordV4"`
	// The access key status to apply. Defaults to `Active`.
	// Valid values are `Active` and `Inactive`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The IAM user to associate with this access key.
	User pulumi.StringOutput `pulumi:"user"`
}

// NewAccessKey registers a new resource with the given unique name, arguments, and options.
func NewAccessKey(ctx *pulumi.Context,
	name string, args *AccessKeyArgs, opts ...pulumi.ResourceOption) (*AccessKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.User == nil {
		return nil, errors.New("invalid value for required argument 'User'")
	}
	var resource AccessKey
	err := ctx.RegisterResource("aws:iam/accessKey:AccessKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessKey gets an existing AccessKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessKeyState, opts ...pulumi.ResourceOption) (*AccessKey, error) {
	var resource AccessKey
	err := ctx.ReadResource("aws:iam/accessKey:AccessKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessKey resources.
type accessKeyState struct {
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
	CreateDate      *string `pulumi:"createDate"`
	EncryptedSecret *string `pulumi:"encryptedSecret"`
	// The fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
	KeyFingerprint *string `pulumi:"keyFingerprint"`
	// Either a base-64 encoded PGP public key, or a
	// keybase username in the form `keybase:some_person_that_exists`, for use
	// in the `encryptedSecret` output attribute.
	PgpKey *string `pulumi:"pgpKey"`
	// The secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgpKey` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
	Secret *string `pulumi:"secret"`
	// The secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
	SesSmtpPasswordV4 *string `pulumi:"sesSmtpPasswordV4"`
	// The access key status to apply. Defaults to `Active`.
	// Valid values are `Active` and `Inactive`.
	Status *string `pulumi:"status"`
	// The IAM user to associate with this access key.
	User *string `pulumi:"user"`
}

type AccessKeyState struct {
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
	CreateDate      pulumi.StringPtrInput
	EncryptedSecret pulumi.StringPtrInput
	// The fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
	KeyFingerprint pulumi.StringPtrInput
	// Either a base-64 encoded PGP public key, or a
	// keybase username in the form `keybase:some_person_that_exists`, for use
	// in the `encryptedSecret` output attribute.
	PgpKey pulumi.StringPtrInput
	// The secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgpKey` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
	Secret pulumi.StringPtrInput
	// The secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
	SesSmtpPasswordV4 pulumi.StringPtrInput
	// The access key status to apply. Defaults to `Active`.
	// Valid values are `Active` and `Inactive`.
	Status pulumi.StringPtrInput
	// The IAM user to associate with this access key.
	User pulumi.StringPtrInput
}

func (AccessKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessKeyState)(nil)).Elem()
}

type accessKeyArgs struct {
	// Either a base-64 encoded PGP public key, or a
	// keybase username in the form `keybase:some_person_that_exists`, for use
	// in the `encryptedSecret` output attribute.
	PgpKey *string `pulumi:"pgpKey"`
	// The access key status to apply. Defaults to `Active`.
	// Valid values are `Active` and `Inactive`.
	Status *string `pulumi:"status"`
	// The IAM user to associate with this access key.
	User string `pulumi:"user"`
}

// The set of arguments for constructing a AccessKey resource.
type AccessKeyArgs struct {
	// Either a base-64 encoded PGP public key, or a
	// keybase username in the form `keybase:some_person_that_exists`, for use
	// in the `encryptedSecret` output attribute.
	PgpKey pulumi.StringPtrInput
	// The access key status to apply. Defaults to `Active`.
	// Valid values are `Active` and `Inactive`.
	Status pulumi.StringPtrInput
	// The IAM user to associate with this access key.
	User pulumi.StringInput
}

func (AccessKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessKeyArgs)(nil)).Elem()
}

type AccessKeyInput interface {
	pulumi.Input

	ToAccessKeyOutput() AccessKeyOutput
	ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput
}

func (*AccessKey) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessKey)(nil))
}

func (i *AccessKey) ToAccessKeyOutput() AccessKeyOutput {
	return i.ToAccessKeyOutputWithContext(context.Background())
}

func (i *AccessKey) ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyOutput)
}

func (i *AccessKey) ToAccessKeyPtrOutput() AccessKeyPtrOutput {
	return i.ToAccessKeyPtrOutputWithContext(context.Background())
}

func (i *AccessKey) ToAccessKeyPtrOutputWithContext(ctx context.Context) AccessKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyPtrOutput)
}

type AccessKeyPtrInput interface {
	pulumi.Input

	ToAccessKeyPtrOutput() AccessKeyPtrOutput
	ToAccessKeyPtrOutputWithContext(ctx context.Context) AccessKeyPtrOutput
}

type accessKeyPtrType AccessKeyArgs

func (*accessKeyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessKey)(nil))
}

func (i *accessKeyPtrType) ToAccessKeyPtrOutput() AccessKeyPtrOutput {
	return i.ToAccessKeyPtrOutputWithContext(context.Background())
}

func (i *accessKeyPtrType) ToAccessKeyPtrOutputWithContext(ctx context.Context) AccessKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyPtrOutput)
}

// AccessKeyArrayInput is an input type that accepts AccessKeyArray and AccessKeyArrayOutput values.
// You can construct a concrete instance of `AccessKeyArrayInput` via:
//
//          AccessKeyArray{ AccessKeyArgs{...} }
type AccessKeyArrayInput interface {
	pulumi.Input

	ToAccessKeyArrayOutput() AccessKeyArrayOutput
	ToAccessKeyArrayOutputWithContext(context.Context) AccessKeyArrayOutput
}

type AccessKeyArray []AccessKeyInput

func (AccessKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AccessKey)(nil))
}

func (i AccessKeyArray) ToAccessKeyArrayOutput() AccessKeyArrayOutput {
	return i.ToAccessKeyArrayOutputWithContext(context.Background())
}

func (i AccessKeyArray) ToAccessKeyArrayOutputWithContext(ctx context.Context) AccessKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyArrayOutput)
}

// AccessKeyMapInput is an input type that accepts AccessKeyMap and AccessKeyMapOutput values.
// You can construct a concrete instance of `AccessKeyMapInput` via:
//
//          AccessKeyMap{ "key": AccessKeyArgs{...} }
type AccessKeyMapInput interface {
	pulumi.Input

	ToAccessKeyMapOutput() AccessKeyMapOutput
	ToAccessKeyMapOutputWithContext(context.Context) AccessKeyMapOutput
}

type AccessKeyMap map[string]AccessKeyInput

func (AccessKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AccessKey)(nil))
}

func (i AccessKeyMap) ToAccessKeyMapOutput() AccessKeyMapOutput {
	return i.ToAccessKeyMapOutputWithContext(context.Background())
}

func (i AccessKeyMap) ToAccessKeyMapOutputWithContext(ctx context.Context) AccessKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyMapOutput)
}

type AccessKeyOutput struct {
	*pulumi.OutputState
}

func (AccessKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessKey)(nil))
}

func (o AccessKeyOutput) ToAccessKeyOutput() AccessKeyOutput {
	return o
}

func (o AccessKeyOutput) ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput {
	return o
}

func (o AccessKeyOutput) ToAccessKeyPtrOutput() AccessKeyPtrOutput {
	return o.ToAccessKeyPtrOutputWithContext(context.Background())
}

func (o AccessKeyOutput) ToAccessKeyPtrOutputWithContext(ctx context.Context) AccessKeyPtrOutput {
	return o.ApplyT(func(v AccessKey) *AccessKey {
		return &v
	}).(AccessKeyPtrOutput)
}

type AccessKeyPtrOutput struct {
	*pulumi.OutputState
}

func (AccessKeyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessKey)(nil))
}

func (o AccessKeyPtrOutput) ToAccessKeyPtrOutput() AccessKeyPtrOutput {
	return o
}

func (o AccessKeyPtrOutput) ToAccessKeyPtrOutputWithContext(ctx context.Context) AccessKeyPtrOutput {
	return o
}

type AccessKeyArrayOutput struct{ *pulumi.OutputState }

func (AccessKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AccessKey)(nil))
}

func (o AccessKeyArrayOutput) ToAccessKeyArrayOutput() AccessKeyArrayOutput {
	return o
}

func (o AccessKeyArrayOutput) ToAccessKeyArrayOutputWithContext(ctx context.Context) AccessKeyArrayOutput {
	return o
}

func (o AccessKeyArrayOutput) Index(i pulumi.IntInput) AccessKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AccessKey {
		return vs[0].([]AccessKey)[vs[1].(int)]
	}).(AccessKeyOutput)
}

type AccessKeyMapOutput struct{ *pulumi.OutputState }

func (AccessKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AccessKey)(nil))
}

func (o AccessKeyMapOutput) ToAccessKeyMapOutput() AccessKeyMapOutput {
	return o
}

func (o AccessKeyMapOutput) ToAccessKeyMapOutputWithContext(ctx context.Context) AccessKeyMapOutput {
	return o
}

func (o AccessKeyMapOutput) MapIndex(k pulumi.StringInput) AccessKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AccessKey {
		return vs[0].(map[string]AccessKey)[vs[1].(string)]
	}).(AccessKeyOutput)
}

func init() {
	pulumi.RegisterOutputType(AccessKeyOutput{})
	pulumi.RegisterOutputType(AccessKeyPtrOutput{})
	pulumi.RegisterOutputType(AccessKeyArrayOutput{})
	pulumi.RegisterOutputType(AccessKeyMapOutput{})
}
