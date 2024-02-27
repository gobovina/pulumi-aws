// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssoadmin

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS SSO Admin Trusted Token Issuer.
//
// ## Example Usage
//
// ## Import
//
// Using `pulumi import`, import SSO Admin Trusted Token Issuer using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer example arn:aws:sso::012345678901:trustedTokenIssuer/ssoins-lu1ye3gew4mbc7ju/tti-2657c556-9707-11ee-b9d1-0242ac120002
//
// ```
type TrustedTokenIssuer struct {
	pulumi.CustomResourceState

	// ARN of the trusted token issuer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
	ClientToken pulumi.StringPtrOutput `pulumi:"clientToken"`
	// ARN of the instance of IAM Identity Center.
	InstanceArn pulumi.StringOutput `pulumi:"instanceArn"`
	// Name of the trusted token issuer.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
	TrustedTokenIssuerConfiguration TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrOutput `pulumi:"trustedTokenIssuerConfiguration"`
	// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
	//
	// The following arguments are optional:
	TrustedTokenIssuerType pulumi.StringOutput `pulumi:"trustedTokenIssuerType"`
}

// NewTrustedTokenIssuer registers a new resource with the given unique name, arguments, and options.
func NewTrustedTokenIssuer(ctx *pulumi.Context,
	name string, args *TrustedTokenIssuerArgs, opts ...pulumi.ResourceOption) (*TrustedTokenIssuer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceArn == nil {
		return nil, errors.New("invalid value for required argument 'InstanceArn'")
	}
	if args.TrustedTokenIssuerType == nil {
		return nil, errors.New("invalid value for required argument 'TrustedTokenIssuerType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrustedTokenIssuer
	err := ctx.RegisterResource("aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrustedTokenIssuer gets an existing TrustedTokenIssuer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrustedTokenIssuer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrustedTokenIssuerState, opts ...pulumi.ResourceOption) (*TrustedTokenIssuer, error) {
	var resource TrustedTokenIssuer
	err := ctx.ReadResource("aws:ssoadmin/trustedTokenIssuer:TrustedTokenIssuer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrustedTokenIssuer resources.
type trustedTokenIssuerState struct {
	// ARN of the trusted token issuer.
	Arn *string `pulumi:"arn"`
	// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
	ClientToken *string `pulumi:"clientToken"`
	// ARN of the instance of IAM Identity Center.
	InstanceArn *string `pulumi:"instanceArn"`
	// Name of the trusted token issuer.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
	TrustedTokenIssuerConfiguration *TrustedTokenIssuerTrustedTokenIssuerConfiguration `pulumi:"trustedTokenIssuerConfiguration"`
	// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
	//
	// The following arguments are optional:
	TrustedTokenIssuerType *string `pulumi:"trustedTokenIssuerType"`
}

type TrustedTokenIssuerState struct {
	// ARN of the trusted token issuer.
	Arn pulumi.StringPtrInput
	// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
	ClientToken pulumi.StringPtrInput
	// ARN of the instance of IAM Identity Center.
	InstanceArn pulumi.StringPtrInput
	// Name of the trusted token issuer.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
	TrustedTokenIssuerConfiguration TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrInput
	// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
	//
	// The following arguments are optional:
	TrustedTokenIssuerType pulumi.StringPtrInput
}

func (TrustedTokenIssuerState) ElementType() reflect.Type {
	return reflect.TypeOf((*trustedTokenIssuerState)(nil)).Elem()
}

type trustedTokenIssuerArgs struct {
	// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
	ClientToken *string `pulumi:"clientToken"`
	// ARN of the instance of IAM Identity Center.
	InstanceArn string `pulumi:"instanceArn"`
	// Name of the trusted token issuer.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
	TrustedTokenIssuerConfiguration *TrustedTokenIssuerTrustedTokenIssuerConfiguration `pulumi:"trustedTokenIssuerConfiguration"`
	// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
	//
	// The following arguments are optional:
	TrustedTokenIssuerType string `pulumi:"trustedTokenIssuerType"`
}

// The set of arguments for constructing a TrustedTokenIssuer resource.
type TrustedTokenIssuerArgs struct {
	// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
	ClientToken pulumi.StringPtrInput
	// ARN of the instance of IAM Identity Center.
	InstanceArn pulumi.StringInput
	// Name of the trusted token issuer.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
	TrustedTokenIssuerConfiguration TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrInput
	// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
	//
	// The following arguments are optional:
	TrustedTokenIssuerType pulumi.StringInput
}

func (TrustedTokenIssuerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trustedTokenIssuerArgs)(nil)).Elem()
}

type TrustedTokenIssuerInput interface {
	pulumi.Input

	ToTrustedTokenIssuerOutput() TrustedTokenIssuerOutput
	ToTrustedTokenIssuerOutputWithContext(ctx context.Context) TrustedTokenIssuerOutput
}

func (*TrustedTokenIssuer) ElementType() reflect.Type {
	return reflect.TypeOf((**TrustedTokenIssuer)(nil)).Elem()
}

func (i *TrustedTokenIssuer) ToTrustedTokenIssuerOutput() TrustedTokenIssuerOutput {
	return i.ToTrustedTokenIssuerOutputWithContext(context.Background())
}

func (i *TrustedTokenIssuer) ToTrustedTokenIssuerOutputWithContext(ctx context.Context) TrustedTokenIssuerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedTokenIssuerOutput)
}

// TrustedTokenIssuerArrayInput is an input type that accepts TrustedTokenIssuerArray and TrustedTokenIssuerArrayOutput values.
// You can construct a concrete instance of `TrustedTokenIssuerArrayInput` via:
//
//	TrustedTokenIssuerArray{ TrustedTokenIssuerArgs{...} }
type TrustedTokenIssuerArrayInput interface {
	pulumi.Input

	ToTrustedTokenIssuerArrayOutput() TrustedTokenIssuerArrayOutput
	ToTrustedTokenIssuerArrayOutputWithContext(context.Context) TrustedTokenIssuerArrayOutput
}

type TrustedTokenIssuerArray []TrustedTokenIssuerInput

func (TrustedTokenIssuerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrustedTokenIssuer)(nil)).Elem()
}

func (i TrustedTokenIssuerArray) ToTrustedTokenIssuerArrayOutput() TrustedTokenIssuerArrayOutput {
	return i.ToTrustedTokenIssuerArrayOutputWithContext(context.Background())
}

func (i TrustedTokenIssuerArray) ToTrustedTokenIssuerArrayOutputWithContext(ctx context.Context) TrustedTokenIssuerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedTokenIssuerArrayOutput)
}

// TrustedTokenIssuerMapInput is an input type that accepts TrustedTokenIssuerMap and TrustedTokenIssuerMapOutput values.
// You can construct a concrete instance of `TrustedTokenIssuerMapInput` via:
//
//	TrustedTokenIssuerMap{ "key": TrustedTokenIssuerArgs{...} }
type TrustedTokenIssuerMapInput interface {
	pulumi.Input

	ToTrustedTokenIssuerMapOutput() TrustedTokenIssuerMapOutput
	ToTrustedTokenIssuerMapOutputWithContext(context.Context) TrustedTokenIssuerMapOutput
}

type TrustedTokenIssuerMap map[string]TrustedTokenIssuerInput

func (TrustedTokenIssuerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrustedTokenIssuer)(nil)).Elem()
}

func (i TrustedTokenIssuerMap) ToTrustedTokenIssuerMapOutput() TrustedTokenIssuerMapOutput {
	return i.ToTrustedTokenIssuerMapOutputWithContext(context.Background())
}

func (i TrustedTokenIssuerMap) ToTrustedTokenIssuerMapOutputWithContext(ctx context.Context) TrustedTokenIssuerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrustedTokenIssuerMapOutput)
}

type TrustedTokenIssuerOutput struct{ *pulumi.OutputState }

func (TrustedTokenIssuerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrustedTokenIssuer)(nil)).Elem()
}

func (o TrustedTokenIssuerOutput) ToTrustedTokenIssuerOutput() TrustedTokenIssuerOutput {
	return o
}

func (o TrustedTokenIssuerOutput) ToTrustedTokenIssuerOutputWithContext(ctx context.Context) TrustedTokenIssuerOutput {
	return o
}

// ARN of the trusted token issuer.
func (o TrustedTokenIssuerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
func (o TrustedTokenIssuerOutput) ClientToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringPtrOutput { return v.ClientToken }).(pulumi.StringPtrOutput)
}

// ARN of the instance of IAM Identity Center.
func (o TrustedTokenIssuerOutput) InstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringOutput { return v.InstanceArn }).(pulumi.StringOutput)
}

// Name of the trusted token issuer.
func (o TrustedTokenIssuerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TrustedTokenIssuerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o TrustedTokenIssuerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
func (o TrustedTokenIssuerOutput) TrustedTokenIssuerConfiguration() TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrOutput {
		return v.TrustedTokenIssuerConfiguration
	}).(TrustedTokenIssuerTrustedTokenIssuerConfigurationPtrOutput)
}

// Specifies the type of the trusted token issuer. Valid values are `OIDC_JWT`
//
// The following arguments are optional:
func (o TrustedTokenIssuerOutput) TrustedTokenIssuerType() pulumi.StringOutput {
	return o.ApplyT(func(v *TrustedTokenIssuer) pulumi.StringOutput { return v.TrustedTokenIssuerType }).(pulumi.StringOutput)
}

type TrustedTokenIssuerArrayOutput struct{ *pulumi.OutputState }

func (TrustedTokenIssuerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrustedTokenIssuer)(nil)).Elem()
}

func (o TrustedTokenIssuerArrayOutput) ToTrustedTokenIssuerArrayOutput() TrustedTokenIssuerArrayOutput {
	return o
}

func (o TrustedTokenIssuerArrayOutput) ToTrustedTokenIssuerArrayOutputWithContext(ctx context.Context) TrustedTokenIssuerArrayOutput {
	return o
}

func (o TrustedTokenIssuerArrayOutput) Index(i pulumi.IntInput) TrustedTokenIssuerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrustedTokenIssuer {
		return vs[0].([]*TrustedTokenIssuer)[vs[1].(int)]
	}).(TrustedTokenIssuerOutput)
}

type TrustedTokenIssuerMapOutput struct{ *pulumi.OutputState }

func (TrustedTokenIssuerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrustedTokenIssuer)(nil)).Elem()
}

func (o TrustedTokenIssuerMapOutput) ToTrustedTokenIssuerMapOutput() TrustedTokenIssuerMapOutput {
	return o
}

func (o TrustedTokenIssuerMapOutput) ToTrustedTokenIssuerMapOutputWithContext(ctx context.Context) TrustedTokenIssuerMapOutput {
	return o
}

func (o TrustedTokenIssuerMapOutput) MapIndex(k pulumi.StringInput) TrustedTokenIssuerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrustedTokenIssuer {
		return vs[0].(map[string]*TrustedTokenIssuer)[vs[1].(string)]
	}).(TrustedTokenIssuerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedTokenIssuerInput)(nil)).Elem(), &TrustedTokenIssuer{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedTokenIssuerArrayInput)(nil)).Elem(), TrustedTokenIssuerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrustedTokenIssuerMapInput)(nil)).Elem(), TrustedTokenIssuerMap{})
	pulumi.RegisterOutputType(TrustedTokenIssuerOutput{})
	pulumi.RegisterOutputType(TrustedTokenIssuerArrayOutput{})
	pulumi.RegisterOutputType(TrustedTokenIssuerMapOutput{})
}
