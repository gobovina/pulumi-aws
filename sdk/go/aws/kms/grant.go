// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource-based access control mechanism for a KMS customer master key.
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
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/kms"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		key, err := kms.NewKey(ctx, "key", nil)
// 		if err != nil {
// 			return err
// 		}
// 		role, err := iam.NewRole(ctx, "role", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.Any(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Action\": \"sts:AssumeRole\",\n", "      \"Principal\": {\n", "        \"Service\": \"lambda.amazonaws.com\"\n", "      },\n", "      \"Effect\": \"Allow\",\n", "      \"Sid\": \"\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kms.NewGrant(ctx, "grant", &kms.GrantArgs{
// 			KeyId:            key.KeyId,
// 			GranteePrincipal: role.Arn,
// 			Operations: pulumi.StringArray{
// 				pulumi.String("Encrypt"),
// 				pulumi.String("Decrypt"),
// 				pulumi.String("GenerateDataKey"),
// 			},
// 			Constraints: kms.GrantConstraintArray{
// 				&kms.GrantConstraintArgs{
// 					EncryptionContextEquals: pulumi.StringMap{
// 						"Department": pulumi.String("Finance"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// KMS Grants can be imported using the Key ID and Grant ID separated by a colon (`:`), e.g.
//
// ```sh
//  $ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ababcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
// ```
type Grant struct {
	pulumi.CustomResourceState

	// A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
	Constraints GrantConstraintArrayOutput `pulumi:"constraints"`
	// A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
	GrantCreationTokens pulumi.StringArrayOutput `pulumi:"grantCreationTokens"`
	// The unique identifier for the grant.
	GrantId pulumi.StringOutput `pulumi:"grantId"`
	// The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
	GrantToken pulumi.StringOutput `pulumi:"grantToken"`
	// The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	GranteePrincipal pulumi.StringOutput `pulumi:"granteePrincipal"`
	// The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
	KeyId pulumi.StringOutput `pulumi:"keyId"`
	// A friendly name for identifying the grant.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
	Operations pulumi.StringArrayOutput `pulumi:"operations"`
	// -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
	// See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
	RetireOnDelete pulumi.BoolPtrOutput `pulumi:"retireOnDelete"`
	// The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	RetiringPrincipal pulumi.StringPtrOutput `pulumi:"retiringPrincipal"`
}

// NewGrant registers a new resource with the given unique name, arguments, and options.
func NewGrant(ctx *pulumi.Context,
	name string, args *GrantArgs, opts ...pulumi.ResourceOption) (*Grant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GranteePrincipal == nil {
		return nil, errors.New("invalid value for required argument 'GranteePrincipal'")
	}
	if args.KeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyId'")
	}
	if args.Operations == nil {
		return nil, errors.New("invalid value for required argument 'Operations'")
	}
	var resource Grant
	err := ctx.RegisterResource("aws:kms/grant:Grant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrant gets an existing Grant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantState, opts ...pulumi.ResourceOption) (*Grant, error) {
	var resource Grant
	err := ctx.ReadResource("aws:kms/grant:Grant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Grant resources.
type grantState struct {
	// A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
	Constraints []GrantConstraint `pulumi:"constraints"`
	// A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
	GrantCreationTokens []string `pulumi:"grantCreationTokens"`
	// The unique identifier for the grant.
	GrantId *string `pulumi:"grantId"`
	// The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
	GrantToken *string `pulumi:"grantToken"`
	// The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	GranteePrincipal *string `pulumi:"granteePrincipal"`
	// The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
	KeyId *string `pulumi:"keyId"`
	// A friendly name for identifying the grant.
	Name *string `pulumi:"name"`
	// A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
	Operations []string `pulumi:"operations"`
	// -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
	// See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
	RetireOnDelete *bool `pulumi:"retireOnDelete"`
	// The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	RetiringPrincipal *string `pulumi:"retiringPrincipal"`
}

type GrantState struct {
	// A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
	Constraints GrantConstraintArrayInput
	// A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
	GrantCreationTokens pulumi.StringArrayInput
	// The unique identifier for the grant.
	GrantId pulumi.StringPtrInput
	// The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
	GrantToken pulumi.StringPtrInput
	// The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	GranteePrincipal pulumi.StringPtrInput
	// The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
	KeyId pulumi.StringPtrInput
	// A friendly name for identifying the grant.
	Name pulumi.StringPtrInput
	// A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
	Operations pulumi.StringArrayInput
	// -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
	// See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
	RetireOnDelete pulumi.BoolPtrInput
	// The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	RetiringPrincipal pulumi.StringPtrInput
}

func (GrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantState)(nil)).Elem()
}

type grantArgs struct {
	// A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
	Constraints []GrantConstraint `pulumi:"constraints"`
	// A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
	GrantCreationTokens []string `pulumi:"grantCreationTokens"`
	// The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	GranteePrincipal string `pulumi:"granteePrincipal"`
	// The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
	KeyId string `pulumi:"keyId"`
	// A friendly name for identifying the grant.
	Name *string `pulumi:"name"`
	// A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
	Operations []string `pulumi:"operations"`
	// -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
	// See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
	RetireOnDelete *bool `pulumi:"retireOnDelete"`
	// The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	RetiringPrincipal *string `pulumi:"retiringPrincipal"`
}

// The set of arguments for constructing a Grant resource.
type GrantArgs struct {
	// A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
	Constraints GrantConstraintArrayInput
	// A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
	GrantCreationTokens pulumi.StringArrayInput
	// The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	GranteePrincipal pulumi.StringInput
	// The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
	KeyId pulumi.StringInput
	// A friendly name for identifying the grant.
	Name pulumi.StringPtrInput
	// A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
	Operations pulumi.StringArrayInput
	// -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
	// See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
	RetireOnDelete pulumi.BoolPtrInput
	// The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
	RetiringPrincipal pulumi.StringPtrInput
}

func (GrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantArgs)(nil)).Elem()
}

type GrantInput interface {
	pulumi.Input

	ToGrantOutput() GrantOutput
	ToGrantOutputWithContext(ctx context.Context) GrantOutput
}

func (*Grant) ElementType() reflect.Type {
	return reflect.TypeOf((*Grant)(nil))
}

func (i *Grant) ToGrantOutput() GrantOutput {
	return i.ToGrantOutputWithContext(context.Background())
}

func (i *Grant) ToGrantOutputWithContext(ctx context.Context) GrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantOutput)
}

func (i *Grant) ToGrantPtrOutput() GrantPtrOutput {
	return i.ToGrantPtrOutputWithContext(context.Background())
}

func (i *Grant) ToGrantPtrOutputWithContext(ctx context.Context) GrantPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPtrOutput)
}

type GrantPtrInput interface {
	pulumi.Input

	ToGrantPtrOutput() GrantPtrOutput
	ToGrantPtrOutputWithContext(ctx context.Context) GrantPtrOutput
}

type grantPtrType GrantArgs

func (*grantPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Grant)(nil))
}

func (i *grantPtrType) ToGrantPtrOutput() GrantPtrOutput {
	return i.ToGrantPtrOutputWithContext(context.Background())
}

func (i *grantPtrType) ToGrantPtrOutputWithContext(ctx context.Context) GrantPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPtrOutput)
}

// GrantArrayInput is an input type that accepts GrantArray and GrantArrayOutput values.
// You can construct a concrete instance of `GrantArrayInput` via:
//
//          GrantArray{ GrantArgs{...} }
type GrantArrayInput interface {
	pulumi.Input

	ToGrantArrayOutput() GrantArrayOutput
	ToGrantArrayOutputWithContext(context.Context) GrantArrayOutput
}

type GrantArray []GrantInput

func (GrantArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Grant)(nil))
}

func (i GrantArray) ToGrantArrayOutput() GrantArrayOutput {
	return i.ToGrantArrayOutputWithContext(context.Background())
}

func (i GrantArray) ToGrantArrayOutputWithContext(ctx context.Context) GrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantArrayOutput)
}

// GrantMapInput is an input type that accepts GrantMap and GrantMapOutput values.
// You can construct a concrete instance of `GrantMapInput` via:
//
//          GrantMap{ "key": GrantArgs{...} }
type GrantMapInput interface {
	pulumi.Input

	ToGrantMapOutput() GrantMapOutput
	ToGrantMapOutputWithContext(context.Context) GrantMapOutput
}

type GrantMap map[string]GrantInput

func (GrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Grant)(nil))
}

func (i GrantMap) ToGrantMapOutput() GrantMapOutput {
	return i.ToGrantMapOutputWithContext(context.Background())
}

func (i GrantMap) ToGrantMapOutputWithContext(ctx context.Context) GrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantMapOutput)
}

type GrantOutput struct {
	*pulumi.OutputState
}

func (GrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Grant)(nil))
}

func (o GrantOutput) ToGrantOutput() GrantOutput {
	return o
}

func (o GrantOutput) ToGrantOutputWithContext(ctx context.Context) GrantOutput {
	return o
}

func (o GrantOutput) ToGrantPtrOutput() GrantPtrOutput {
	return o.ToGrantPtrOutputWithContext(context.Background())
}

func (o GrantOutput) ToGrantPtrOutputWithContext(ctx context.Context) GrantPtrOutput {
	return o.ApplyT(func(v Grant) *Grant {
		return &v
	}).(GrantPtrOutput)
}

type GrantPtrOutput struct {
	*pulumi.OutputState
}

func (GrantPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Grant)(nil))
}

func (o GrantPtrOutput) ToGrantPtrOutput() GrantPtrOutput {
	return o
}

func (o GrantPtrOutput) ToGrantPtrOutputWithContext(ctx context.Context) GrantPtrOutput {
	return o
}

type GrantArrayOutput struct{ *pulumi.OutputState }

func (GrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Grant)(nil))
}

func (o GrantArrayOutput) ToGrantArrayOutput() GrantArrayOutput {
	return o
}

func (o GrantArrayOutput) ToGrantArrayOutputWithContext(ctx context.Context) GrantArrayOutput {
	return o
}

func (o GrantArrayOutput) Index(i pulumi.IntInput) GrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Grant {
		return vs[0].([]Grant)[vs[1].(int)]
	}).(GrantOutput)
}

type GrantMapOutput struct{ *pulumi.OutputState }

func (GrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Grant)(nil))
}

func (o GrantMapOutput) ToGrantMapOutput() GrantMapOutput {
	return o
}

func (o GrantMapOutput) ToGrantMapOutputWithContext(ctx context.Context) GrantMapOutput {
	return o
}

func (o GrantMapOutput) MapIndex(k pulumi.StringInput) GrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Grant {
		return vs[0].(map[string]Grant)[vs[1].(string)]
	}).(GrantOutput)
}

func init() {
	pulumi.RegisterOutputType(GrantOutput{})
	pulumi.RegisterOutputType(GrantPtrOutput{})
	pulumi.RegisterOutputType(GrantArrayOutput{})
	pulumi.RegisterOutputType(GrantMapOutput{})
}
