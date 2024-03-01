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

// Provides a Cognito User Identity Provider resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cognito"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cognito.NewUserPool(ctx, "example", &cognito.UserPoolArgs{
//				Name: pulumi.String("example-pool"),
//				AutoVerifiedAttributes: pulumi.StringArray{
//					pulumi.String("email"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cognito.NewIdentityProvider(ctx, "example_provider", &cognito.IdentityProviderArgs{
//				UserPoolId:   example.ID(),
//				ProviderName: pulumi.String("Google"),
//				ProviderType: pulumi.String("Google"),
//				ProviderDetails: pulumi.StringMap{
//					"authorize_scopes": pulumi.String("email"),
//					"client_id":        pulumi.String("your client_id"),
//					"client_secret":    pulumi.String("your client_secret"),
//				},
//				AttributeMapping: pulumi.StringMap{
//					"email":    pulumi.String("email"),
//					"username": pulumi.String("sub"),
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
// Using `pulumi import`, import `aws_cognito_identity_provider` resources using their User Pool ID and Provider Name. For example:
//
// ```sh
//
//	$ pulumi import aws:cognito/identityProvider:IdentityProvider example us-west-2_abc123:CorpAD
//
// ```
type IdentityProvider struct {
	pulumi.CustomResourceState

	// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
	AttributeMapping pulumi.StringMapOutput `pulumi:"attributeMapping"`
	// The list of identity providers.
	IdpIdentifiers pulumi.StringArrayOutput `pulumi:"idpIdentifiers"`
	// The map of identity details, such as access token
	ProviderDetails pulumi.StringMapOutput `pulumi:"providerDetails"`
	// The provider name
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
	ProviderType pulumi.StringOutput `pulumi:"providerType"`
	// The user pool id
	UserPoolId pulumi.StringOutput `pulumi:"userPoolId"`
}

// NewIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewIdentityProvider(ctx *pulumi.Context,
	name string, args *IdentityProviderArgs, opts ...pulumi.ResourceOption) (*IdentityProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProviderDetails == nil {
		return nil, errors.New("invalid value for required argument 'ProviderDetails'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	if args.ProviderType == nil {
		return nil, errors.New("invalid value for required argument 'ProviderType'")
	}
	if args.UserPoolId == nil {
		return nil, errors.New("invalid value for required argument 'UserPoolId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IdentityProvider
	err := ctx.RegisterResource("aws:cognito/identityProvider:IdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityProvider gets an existing IdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityProviderState, opts ...pulumi.ResourceOption) (*IdentityProvider, error) {
	var resource IdentityProvider
	err := ctx.ReadResource("aws:cognito/identityProvider:IdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityProvider resources.
type identityProviderState struct {
	// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
	AttributeMapping map[string]string `pulumi:"attributeMapping"`
	// The list of identity providers.
	IdpIdentifiers []string `pulumi:"idpIdentifiers"`
	// The map of identity details, such as access token
	ProviderDetails map[string]string `pulumi:"providerDetails"`
	// The provider name
	ProviderName *string `pulumi:"providerName"`
	// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
	ProviderType *string `pulumi:"providerType"`
	// The user pool id
	UserPoolId *string `pulumi:"userPoolId"`
}

type IdentityProviderState struct {
	// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
	AttributeMapping pulumi.StringMapInput
	// The list of identity providers.
	IdpIdentifiers pulumi.StringArrayInput
	// The map of identity details, such as access token
	ProviderDetails pulumi.StringMapInput
	// The provider name
	ProviderName pulumi.StringPtrInput
	// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
	ProviderType pulumi.StringPtrInput
	// The user pool id
	UserPoolId pulumi.StringPtrInput
}

func (IdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderState)(nil)).Elem()
}

type identityProviderArgs struct {
	// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
	AttributeMapping map[string]string `pulumi:"attributeMapping"`
	// The list of identity providers.
	IdpIdentifiers []string `pulumi:"idpIdentifiers"`
	// The map of identity details, such as access token
	ProviderDetails map[string]string `pulumi:"providerDetails"`
	// The provider name
	ProviderName string `pulumi:"providerName"`
	// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
	ProviderType string `pulumi:"providerType"`
	// The user pool id
	UserPoolId string `pulumi:"userPoolId"`
}

// The set of arguments for constructing a IdentityProvider resource.
type IdentityProviderArgs struct {
	// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
	AttributeMapping pulumi.StringMapInput
	// The list of identity providers.
	IdpIdentifiers pulumi.StringArrayInput
	// The map of identity details, such as access token
	ProviderDetails pulumi.StringMapInput
	// The provider name
	ProviderName pulumi.StringInput
	// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
	ProviderType pulumi.StringInput
	// The user pool id
	UserPoolId pulumi.StringInput
}

func (IdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderArgs)(nil)).Elem()
}

type IdentityProviderInput interface {
	pulumi.Input

	ToIdentityProviderOutput() IdentityProviderOutput
	ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput
}

func (*IdentityProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProvider)(nil)).Elem()
}

func (i *IdentityProvider) ToIdentityProviderOutput() IdentityProviderOutput {
	return i.ToIdentityProviderOutputWithContext(context.Background())
}

func (i *IdentityProvider) ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderOutput)
}

// IdentityProviderArrayInput is an input type that accepts IdentityProviderArray and IdentityProviderArrayOutput values.
// You can construct a concrete instance of `IdentityProviderArrayInput` via:
//
//	IdentityProviderArray{ IdentityProviderArgs{...} }
type IdentityProviderArrayInput interface {
	pulumi.Input

	ToIdentityProviderArrayOutput() IdentityProviderArrayOutput
	ToIdentityProviderArrayOutputWithContext(context.Context) IdentityProviderArrayOutput
}

type IdentityProviderArray []IdentityProviderInput

func (IdentityProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityProvider)(nil)).Elem()
}

func (i IdentityProviderArray) ToIdentityProviderArrayOutput() IdentityProviderArrayOutput {
	return i.ToIdentityProviderArrayOutputWithContext(context.Background())
}

func (i IdentityProviderArray) ToIdentityProviderArrayOutputWithContext(ctx context.Context) IdentityProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderArrayOutput)
}

// IdentityProviderMapInput is an input type that accepts IdentityProviderMap and IdentityProviderMapOutput values.
// You can construct a concrete instance of `IdentityProviderMapInput` via:
//
//	IdentityProviderMap{ "key": IdentityProviderArgs{...} }
type IdentityProviderMapInput interface {
	pulumi.Input

	ToIdentityProviderMapOutput() IdentityProviderMapOutput
	ToIdentityProviderMapOutputWithContext(context.Context) IdentityProviderMapOutput
}

type IdentityProviderMap map[string]IdentityProviderInput

func (IdentityProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityProvider)(nil)).Elem()
}

func (i IdentityProviderMap) ToIdentityProviderMapOutput() IdentityProviderMapOutput {
	return i.ToIdentityProviderMapOutputWithContext(context.Background())
}

func (i IdentityProviderMap) ToIdentityProviderMapOutputWithContext(ctx context.Context) IdentityProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderMapOutput)
}

type IdentityProviderOutput struct{ *pulumi.OutputState }

func (IdentityProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderOutput) ToIdentityProviderOutput() IdentityProviderOutput {
	return o
}

func (o IdentityProviderOutput) ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput {
	return o
}

// The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
func (o IdentityProviderOutput) AttributeMapping() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringMapOutput { return v.AttributeMapping }).(pulumi.StringMapOutput)
}

// The list of identity providers.
func (o IdentityProviderOutput) IdpIdentifiers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringArrayOutput { return v.IdpIdentifiers }).(pulumi.StringArrayOutput)
}

// The map of identity details, such as access token
func (o IdentityProviderOutput) ProviderDetails() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringMapOutput { return v.ProviderDetails }).(pulumi.StringMapOutput)
}

// The provider name
func (o IdentityProviderOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
func (o IdentityProviderOutput) ProviderType() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.ProviderType }).(pulumi.StringOutput)
}

// The user pool id
func (o IdentityProviderOutput) UserPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.UserPoolId }).(pulumi.StringOutput)
}

type IdentityProviderArrayOutput struct{ *pulumi.OutputState }

func (IdentityProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderArrayOutput) ToIdentityProviderArrayOutput() IdentityProviderArrayOutput {
	return o
}

func (o IdentityProviderArrayOutput) ToIdentityProviderArrayOutputWithContext(ctx context.Context) IdentityProviderArrayOutput {
	return o
}

func (o IdentityProviderArrayOutput) Index(i pulumi.IntInput) IdentityProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IdentityProvider {
		return vs[0].([]*IdentityProvider)[vs[1].(int)]
	}).(IdentityProviderOutput)
}

type IdentityProviderMapOutput struct{ *pulumi.OutputState }

func (IdentityProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderMapOutput) ToIdentityProviderMapOutput() IdentityProviderMapOutput {
	return o
}

func (o IdentityProviderMapOutput) ToIdentityProviderMapOutputWithContext(ctx context.Context) IdentityProviderMapOutput {
	return o
}

func (o IdentityProviderMapOutput) MapIndex(k pulumi.StringInput) IdentityProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IdentityProvider {
		return vs[0].(map[string]*IdentityProvider)[vs[1].(string)]
	}).(IdentityProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderInput)(nil)).Elem(), &IdentityProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderArrayInput)(nil)).Elem(), IdentityProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderMapInput)(nil)).Elem(), IdentityProviderMap{})
	pulumi.RegisterOutputType(IdentityProviderOutput{})
	pulumi.RegisterOutputType(IdentityProviderArrayOutput{})
	pulumi.RegisterOutputType(IdentityProviderMapOutput{})
}
