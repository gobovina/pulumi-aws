// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Cognito Identity Pool.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cognito"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iam.NewSamlProvider(ctx, "default", &iam.SamlProviderArgs{
//				SamlMetadataDocument: readFileOrPanic("saml-metadata.xml"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cognito.NewIdentityPool(ctx, "main", &cognito.IdentityPoolArgs{
//				IdentityPoolName:               pulumi.String("identity pool"),
//				AllowUnauthenticatedIdentities: pulumi.Bool(false),
//				AllowClassicFlow:               pulumi.Bool(false),
//				CognitoIdentityProviders: cognito.IdentityPoolCognitoIdentityProviderArray{
//					&cognito.IdentityPoolCognitoIdentityProviderArgs{
//						ClientId:             pulumi.String("6lhlkkfbfb4q5kpp90urffae"),
//						ProviderName:         pulumi.String("cognito-idp.us-east-1.amazonaws.com/us-east-1_Tv0493apJ"),
//						ServerSideTokenCheck: pulumi.Bool(false),
//					},
//					&cognito.IdentityPoolCognitoIdentityProviderArgs{
//						ClientId:             pulumi.String("7kodkvfqfb4qfkp39eurffae"),
//						ProviderName:         pulumi.String("cognito-idp.us-east-1.amazonaws.com/eu-west-1_Zr231apJu"),
//						ServerSideTokenCheck: pulumi.Bool(false),
//					},
//				},
//				SupportedLoginProviders: pulumi.StringMap{
//					"graph.facebook.com":  pulumi.String("7346241598935552"),
//					"accounts.google.com": pulumi.String("123456789012.apps.googleusercontent.com"),
//				},
//				SamlProviderArns: pulumi.StringArray{
//					_default.Arn,
//				},
//				OpenidConnectProviderArns: pulumi.StringArray{
//					pulumi.String("arn:aws:iam::123456789012:oidc-provider/id.example.com"),
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
// Using `pulumi import`, import Cognito Identity Pool using its ID. For example:
//
// ```sh
//
//	$ pulumi import aws:cognito/identityPool:IdentityPool mypool us-west-2:1a234567-8901-234b-5cde-f6789g01h2i3
//
// ```
type IdentityPool struct {
	pulumi.CustomResourceState

	// Enables or disables the classic / basic authentication flow. Default is `false`.
	AllowClassicFlow pulumi.BoolPtrOutput `pulumi:"allowClassicFlow"`
	// Whether the identity pool supports unauthenticated logins or not.
	AllowUnauthenticatedIdentities pulumi.BoolPtrOutput `pulumi:"allowUnauthenticatedIdentities"`
	// The ARN of the identity pool.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// An array of Amazon Cognito Identity user pools and their client IDs.
	CognitoIdentityProviders IdentityPoolCognitoIdentityProviderArrayOutput `pulumi:"cognitoIdentityProviders"`
	// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
	// backend and the Cognito service to communicate about the developer provider.
	DeveloperProviderName pulumi.StringPtrOutput `pulumi:"developerProviderName"`
	// The Cognito Identity Pool name.
	IdentityPoolName pulumi.StringOutput `pulumi:"identityPoolName"`
	// Set of OpendID Connect provider ARNs.
	OpenidConnectProviderArns pulumi.StringArrayOutput `pulumi:"openidConnectProviderArns"`
	// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
	SamlProviderArns pulumi.StringArrayOutput `pulumi:"samlProviderArns"`
	// Key-Value pairs mapping provider names to provider app IDs.
	SupportedLoginProviders pulumi.StringMapOutput `pulumi:"supportedLoginProviders"`
	// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewIdentityPool registers a new resource with the given unique name, arguments, and options.
func NewIdentityPool(ctx *pulumi.Context,
	name string, args *IdentityPoolArgs, opts ...pulumi.ResourceOption) (*IdentityPool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IdentityPoolName == nil {
		return nil, errors.New("invalid value for required argument 'IdentityPoolName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IdentityPool
	err := ctx.RegisterResource("aws:cognito/identityPool:IdentityPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityPool gets an existing IdentityPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityPoolState, opts ...pulumi.ResourceOption) (*IdentityPool, error) {
	var resource IdentityPool
	err := ctx.ReadResource("aws:cognito/identityPool:IdentityPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityPool resources.
type identityPoolState struct {
	// Enables or disables the classic / basic authentication flow. Default is `false`.
	AllowClassicFlow *bool `pulumi:"allowClassicFlow"`
	// Whether the identity pool supports unauthenticated logins or not.
	AllowUnauthenticatedIdentities *bool `pulumi:"allowUnauthenticatedIdentities"`
	// The ARN of the identity pool.
	Arn *string `pulumi:"arn"`
	// An array of Amazon Cognito Identity user pools and their client IDs.
	CognitoIdentityProviders []IdentityPoolCognitoIdentityProvider `pulumi:"cognitoIdentityProviders"`
	// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
	// backend and the Cognito service to communicate about the developer provider.
	DeveloperProviderName *string `pulumi:"developerProviderName"`
	// The Cognito Identity Pool name.
	IdentityPoolName *string `pulumi:"identityPoolName"`
	// Set of OpendID Connect provider ARNs.
	OpenidConnectProviderArns []string `pulumi:"openidConnectProviderArns"`
	// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
	SamlProviderArns []string `pulumi:"samlProviderArns"`
	// Key-Value pairs mapping provider names to provider app IDs.
	SupportedLoginProviders map[string]string `pulumi:"supportedLoginProviders"`
	// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type IdentityPoolState struct {
	// Enables or disables the classic / basic authentication flow. Default is `false`.
	AllowClassicFlow pulumi.BoolPtrInput
	// Whether the identity pool supports unauthenticated logins or not.
	AllowUnauthenticatedIdentities pulumi.BoolPtrInput
	// The ARN of the identity pool.
	Arn pulumi.StringPtrInput
	// An array of Amazon Cognito Identity user pools and their client IDs.
	CognitoIdentityProviders IdentityPoolCognitoIdentityProviderArrayInput
	// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
	// backend and the Cognito service to communicate about the developer provider.
	DeveloperProviderName pulumi.StringPtrInput
	// The Cognito Identity Pool name.
	IdentityPoolName pulumi.StringPtrInput
	// Set of OpendID Connect provider ARNs.
	OpenidConnectProviderArns pulumi.StringArrayInput
	// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
	SamlProviderArns pulumi.StringArrayInput
	// Key-Value pairs mapping provider names to provider app IDs.
	SupportedLoginProviders pulumi.StringMapInput
	// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (IdentityPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolState)(nil)).Elem()
}

type identityPoolArgs struct {
	// Enables or disables the classic / basic authentication flow. Default is `false`.
	AllowClassicFlow *bool `pulumi:"allowClassicFlow"`
	// Whether the identity pool supports unauthenticated logins or not.
	AllowUnauthenticatedIdentities *bool `pulumi:"allowUnauthenticatedIdentities"`
	// An array of Amazon Cognito Identity user pools and their client IDs.
	CognitoIdentityProviders []IdentityPoolCognitoIdentityProvider `pulumi:"cognitoIdentityProviders"`
	// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
	// backend and the Cognito service to communicate about the developer provider.
	DeveloperProviderName *string `pulumi:"developerProviderName"`
	// The Cognito Identity Pool name.
	IdentityPoolName string `pulumi:"identityPoolName"`
	// Set of OpendID Connect provider ARNs.
	OpenidConnectProviderArns []string `pulumi:"openidConnectProviderArns"`
	// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
	SamlProviderArns []string `pulumi:"samlProviderArns"`
	// Key-Value pairs mapping provider names to provider app IDs.
	SupportedLoginProviders map[string]string `pulumi:"supportedLoginProviders"`
	// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a IdentityPool resource.
type IdentityPoolArgs struct {
	// Enables or disables the classic / basic authentication flow. Default is `false`.
	AllowClassicFlow pulumi.BoolPtrInput
	// Whether the identity pool supports unauthenticated logins or not.
	AllowUnauthenticatedIdentities pulumi.BoolPtrInput
	// An array of Amazon Cognito Identity user pools and their client IDs.
	CognitoIdentityProviders IdentityPoolCognitoIdentityProviderArrayInput
	// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
	// backend and the Cognito service to communicate about the developer provider.
	DeveloperProviderName pulumi.StringPtrInput
	// The Cognito Identity Pool name.
	IdentityPoolName pulumi.StringInput
	// Set of OpendID Connect provider ARNs.
	OpenidConnectProviderArns pulumi.StringArrayInput
	// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
	SamlProviderArns pulumi.StringArrayInput
	// Key-Value pairs mapping provider names to provider app IDs.
	SupportedLoginProviders pulumi.StringMapInput
	// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (IdentityPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityPoolArgs)(nil)).Elem()
}

type IdentityPoolInput interface {
	pulumi.Input

	ToIdentityPoolOutput() IdentityPoolOutput
	ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput
}

func (*IdentityPool) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPool)(nil)).Elem()
}

func (i *IdentityPool) ToIdentityPoolOutput() IdentityPoolOutput {
	return i.ToIdentityPoolOutputWithContext(context.Background())
}

func (i *IdentityPool) ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolOutput)
}

// IdentityPoolArrayInput is an input type that accepts IdentityPoolArray and IdentityPoolArrayOutput values.
// You can construct a concrete instance of `IdentityPoolArrayInput` via:
//
//	IdentityPoolArray{ IdentityPoolArgs{...} }
type IdentityPoolArrayInput interface {
	pulumi.Input

	ToIdentityPoolArrayOutput() IdentityPoolArrayOutput
	ToIdentityPoolArrayOutputWithContext(context.Context) IdentityPoolArrayOutput
}

type IdentityPoolArray []IdentityPoolInput

func (IdentityPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPool)(nil)).Elem()
}

func (i IdentityPoolArray) ToIdentityPoolArrayOutput() IdentityPoolArrayOutput {
	return i.ToIdentityPoolArrayOutputWithContext(context.Background())
}

func (i IdentityPoolArray) ToIdentityPoolArrayOutputWithContext(ctx context.Context) IdentityPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolArrayOutput)
}

// IdentityPoolMapInput is an input type that accepts IdentityPoolMap and IdentityPoolMapOutput values.
// You can construct a concrete instance of `IdentityPoolMapInput` via:
//
//	IdentityPoolMap{ "key": IdentityPoolArgs{...} }
type IdentityPoolMapInput interface {
	pulumi.Input

	ToIdentityPoolMapOutput() IdentityPoolMapOutput
	ToIdentityPoolMapOutputWithContext(context.Context) IdentityPoolMapOutput
}

type IdentityPoolMap map[string]IdentityPoolInput

func (IdentityPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPool)(nil)).Elem()
}

func (i IdentityPoolMap) ToIdentityPoolMapOutput() IdentityPoolMapOutput {
	return i.ToIdentityPoolMapOutputWithContext(context.Background())
}

func (i IdentityPoolMap) ToIdentityPoolMapOutputWithContext(ctx context.Context) IdentityPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityPoolMapOutput)
}

type IdentityPoolOutput struct{ *pulumi.OutputState }

func (IdentityPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityPool)(nil)).Elem()
}

func (o IdentityPoolOutput) ToIdentityPoolOutput() IdentityPoolOutput {
	return o
}

func (o IdentityPoolOutput) ToIdentityPoolOutputWithContext(ctx context.Context) IdentityPoolOutput {
	return o
}

// Enables or disables the classic / basic authentication flow. Default is `false`.
func (o IdentityPoolOutput) AllowClassicFlow() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.BoolPtrOutput { return v.AllowClassicFlow }).(pulumi.BoolPtrOutput)
}

// Whether the identity pool supports unauthenticated logins or not.
func (o IdentityPoolOutput) AllowUnauthenticatedIdentities() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.BoolPtrOutput { return v.AllowUnauthenticatedIdentities }).(pulumi.BoolPtrOutput)
}

// The ARN of the identity pool.
func (o IdentityPoolOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// An array of Amazon Cognito Identity user pools and their client IDs.
func (o IdentityPoolOutput) CognitoIdentityProviders() IdentityPoolCognitoIdentityProviderArrayOutput {
	return o.ApplyT(func(v *IdentityPool) IdentityPoolCognitoIdentityProviderArrayOutput {
		return v.CognitoIdentityProviders
	}).(IdentityPoolCognitoIdentityProviderArrayOutput)
}

// The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
// backend and the Cognito service to communicate about the developer provider.
func (o IdentityPoolOutput) DeveloperProviderName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringPtrOutput { return v.DeveloperProviderName }).(pulumi.StringPtrOutput)
}

// The Cognito Identity Pool name.
func (o IdentityPoolOutput) IdentityPoolName() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringOutput { return v.IdentityPoolName }).(pulumi.StringOutput)
}

// Set of OpendID Connect provider ARNs.
func (o IdentityPoolOutput) OpenidConnectProviderArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringArrayOutput { return v.OpenidConnectProviderArns }).(pulumi.StringArrayOutput)
}

// An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
func (o IdentityPoolOutput) SamlProviderArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringArrayOutput { return v.SamlProviderArns }).(pulumi.StringArrayOutput)
}

// Key-Value pairs mapping provider names to provider app IDs.
func (o IdentityPoolOutput) SupportedLoginProviders() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringMapOutput { return v.SupportedLoginProviders }).(pulumi.StringMapOutput)
}

// A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o IdentityPoolOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o IdentityPoolOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IdentityPool) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type IdentityPoolArrayOutput struct{ *pulumi.OutputState }

func (IdentityPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityPool)(nil)).Elem()
}

func (o IdentityPoolArrayOutput) ToIdentityPoolArrayOutput() IdentityPoolArrayOutput {
	return o
}

func (o IdentityPoolArrayOutput) ToIdentityPoolArrayOutputWithContext(ctx context.Context) IdentityPoolArrayOutput {
	return o
}

func (o IdentityPoolArrayOutput) Index(i pulumi.IntInput) IdentityPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IdentityPool {
		return vs[0].([]*IdentityPool)[vs[1].(int)]
	}).(IdentityPoolOutput)
}

type IdentityPoolMapOutput struct{ *pulumi.OutputState }

func (IdentityPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityPool)(nil)).Elem()
}

func (o IdentityPoolMapOutput) ToIdentityPoolMapOutput() IdentityPoolMapOutput {
	return o
}

func (o IdentityPoolMapOutput) ToIdentityPoolMapOutputWithContext(ctx context.Context) IdentityPoolMapOutput {
	return o
}

func (o IdentityPoolMapOutput) MapIndex(k pulumi.StringInput) IdentityPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IdentityPool {
		return vs[0].(map[string]*IdentityPool)[vs[1].(string)]
	}).(IdentityPoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolInput)(nil)).Elem(), &IdentityPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolArrayInput)(nil)).Elem(), IdentityPoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityPoolMapInput)(nil)).Elem(), IdentityPoolMap{})
	pulumi.RegisterOutputType(IdentityPoolOutput{})
	pulumi.RegisterOutputType(IdentityPoolArrayOutput{})
	pulumi.RegisterOutputType(IdentityPoolMapOutput{})
}
