// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cognito

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cognito User Pool Client resource.
//
// ## Example Usage
// ### Create a basic user pool client
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		pool, err := cognito.NewUserPool(ctx, "pool", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cognito.NewUserPoolClient(ctx, "client", &cognito.UserPoolClientArgs{
// 			UserPoolId: pool.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Create a user pool client with no SRP authentication
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		pool, err := cognito.NewUserPool(ctx, "pool", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cognito.NewUserPoolClient(ctx, "client", &cognito.UserPoolClientArgs{
// 			UserPoolId:     pool.ID(),
// 			GenerateSecret: pulumi.Bool(true),
// 			ExplicitAuthFlows: pulumi.StringArray{
// 				pulumi.String("ADMIN_NO_SRP_AUTH"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Create a user pool client with pinpoint analytics
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cognito"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/pinpoint"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		current, err := aws.GetCallerIdentity(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		testUserPool, err := cognito.NewUserPool(ctx, "testUserPool", nil)
// 		if err != nil {
// 			return err
// 		}
// 		testApp, err := pinpoint.NewApp(ctx, "testApp", nil)
// 		if err != nil {
// 			return err
// 		}
// 		testRole, err := iam.NewRole(ctx, "testRole", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.Any(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Action\": \"sts:AssumeRole\",\n", "      \"Principal\": {\n", "        \"Service\": \"cognito-idp.amazonaws.com\"\n", "      },\n", "      \"Effect\": \"Allow\",\n", "      \"Sid\": \"\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = iam.NewRolePolicy(ctx, "testRolePolicy", &iam.RolePolicyArgs{
// 			Role: testRole.ID(),
// 			Policy: testApp.ApplicationId.ApplyT(func(applicationId string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Action\": [\n", "        \"mobiletargeting:UpdateEndpoint\",\n", "        \"mobiletargeting:PutItems\"\n", "      ],\n", "      \"Effect\": \"Allow\",\n", "      \"Resource\": \"arn:aws:mobiletargeting:*:", current.AccountId, ":apps/", applicationId, "*\"\n", "    }\n", "  ]\n", "}\n"), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cognito.NewUserPoolClient(ctx, "testUserPoolClient", &cognito.UserPoolClientArgs{
// 			UserPoolId: testUserPool.ID(),
// 			AnalyticsConfiguration: &cognito.UserPoolClientAnalyticsConfigurationArgs{
// 				ApplicationId:  testApp.ApplicationId,
// 				ExternalId:     pulumi.String("some_id"),
// 				RoleArn:        testRole.Arn,
// 				UserDataShared: pulumi.Bool(true),
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
// Cognito User Pool Clients can be imported using the `id` of the Cognito User Pool, and the `id` of the Cognito User Pool Client, e.g.,
//
// ```sh
//  $ pulumi import aws:cognito/userPoolClient:UserPoolClient client us-west-2_abc123/3ho4ek12345678909nh3fmhpko
// ```
type UserPoolClient struct {
	pulumi.CustomResourceState

	// Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	AccessTokenValidity pulumi.IntPtrOutput `pulumi:"accessTokenValidity"`
	// List of allowed OAuth flows (code, implicit, client_credentials).
	AllowedOauthFlows pulumi.StringArrayOutput `pulumi:"allowedOauthFlows"`
	// Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
	AllowedOauthFlowsUserPoolClient pulumi.BoolPtrOutput `pulumi:"allowedOauthFlowsUserPoolClient"`
	// List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
	AllowedOauthScopes pulumi.StringArrayOutput `pulumi:"allowedOauthScopes"`
	// Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
	AnalyticsConfiguration UserPoolClientAnalyticsConfigurationPtrOutput `pulumi:"analyticsConfiguration"`
	// List of allowed callback URLs for the identity providers.
	CallbackUrls pulumi.StringArrayOutput `pulumi:"callbackUrls"`
	// Client secret of the user pool client.
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// Default redirect URI. Must be in the list of callback URLs.
	DefaultRedirectUri pulumi.StringPtrOutput `pulumi:"defaultRedirectUri"`
	// Enables or disables token revocation.
	EnableTokenRevocation pulumi.BoolOutput `pulumi:"enableTokenRevocation"`
	// List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
	ExplicitAuthFlows pulumi.StringArrayOutput `pulumi:"explicitAuthFlows"`
	// Should an application secret be generated.
	GenerateSecret pulumi.BoolPtrOutput `pulumi:"generateSecret"`
	// Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	IdTokenValidity pulumi.IntPtrOutput `pulumi:"idTokenValidity"`
	// List of allowed logout URLs for the identity providers.
	LogoutUrls pulumi.StringArrayOutput `pulumi:"logoutUrls"`
	// Name of the application client.
	Name pulumi.StringOutput `pulumi:"name"`
	// Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
	PreventUserExistenceErrors pulumi.StringOutput `pulumi:"preventUserExistenceErrors"`
	// List of user pool attributes the application client can read from.
	ReadAttributes pulumi.StringArrayOutput `pulumi:"readAttributes"`
	// Time limit in days refresh tokens are valid for.
	RefreshTokenValidity pulumi.IntPtrOutput `pulumi:"refreshTokenValidity"`
	// List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `cognito.IdentityProvider` resource(s), or the equivalent string(s).
	SupportedIdentityProviders pulumi.StringArrayOutput `pulumi:"supportedIdentityProviders"`
	// Configuration block for units in which the validity times are represented in. Detailed below.
	TokenValidityUnits UserPoolClientTokenValidityUnitsPtrOutput `pulumi:"tokenValidityUnits"`
	// User pool the client belongs to.
	UserPoolId pulumi.StringOutput `pulumi:"userPoolId"`
	// List of user pool attributes the application client can write to.
	WriteAttributes pulumi.StringArrayOutput `pulumi:"writeAttributes"`
}

// NewUserPoolClient registers a new resource with the given unique name, arguments, and options.
func NewUserPoolClient(ctx *pulumi.Context,
	name string, args *UserPoolClientArgs, opts ...pulumi.ResourceOption) (*UserPoolClient, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.UserPoolId == nil {
		return nil, errors.New("invalid value for required argument 'UserPoolId'")
	}
	var resource UserPoolClient
	err := ctx.RegisterResource("aws:cognito/userPoolClient:UserPoolClient", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserPoolClient gets an existing UserPoolClient resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserPoolClient(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserPoolClientState, opts ...pulumi.ResourceOption) (*UserPoolClient, error) {
	var resource UserPoolClient
	err := ctx.ReadResource("aws:cognito/userPoolClient:UserPoolClient", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserPoolClient resources.
type userPoolClientState struct {
	// Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	AccessTokenValidity *int `pulumi:"accessTokenValidity"`
	// List of allowed OAuth flows (code, implicit, client_credentials).
	AllowedOauthFlows []string `pulumi:"allowedOauthFlows"`
	// Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
	AllowedOauthFlowsUserPoolClient *bool `pulumi:"allowedOauthFlowsUserPoolClient"`
	// List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
	AllowedOauthScopes []string `pulumi:"allowedOauthScopes"`
	// Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
	AnalyticsConfiguration *UserPoolClientAnalyticsConfiguration `pulumi:"analyticsConfiguration"`
	// List of allowed callback URLs for the identity providers.
	CallbackUrls []string `pulumi:"callbackUrls"`
	// Client secret of the user pool client.
	ClientSecret *string `pulumi:"clientSecret"`
	// Default redirect URI. Must be in the list of callback URLs.
	DefaultRedirectUri *string `pulumi:"defaultRedirectUri"`
	// Enables or disables token revocation.
	EnableTokenRevocation *bool `pulumi:"enableTokenRevocation"`
	// List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
	ExplicitAuthFlows []string `pulumi:"explicitAuthFlows"`
	// Should an application secret be generated.
	GenerateSecret *bool `pulumi:"generateSecret"`
	// Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	IdTokenValidity *int `pulumi:"idTokenValidity"`
	// List of allowed logout URLs for the identity providers.
	LogoutUrls []string `pulumi:"logoutUrls"`
	// Name of the application client.
	Name *string `pulumi:"name"`
	// Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
	PreventUserExistenceErrors *string `pulumi:"preventUserExistenceErrors"`
	// List of user pool attributes the application client can read from.
	ReadAttributes []string `pulumi:"readAttributes"`
	// Time limit in days refresh tokens are valid for.
	RefreshTokenValidity *int `pulumi:"refreshTokenValidity"`
	// List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `cognito.IdentityProvider` resource(s), or the equivalent string(s).
	SupportedIdentityProviders []string `pulumi:"supportedIdentityProviders"`
	// Configuration block for units in which the validity times are represented in. Detailed below.
	TokenValidityUnits *UserPoolClientTokenValidityUnits `pulumi:"tokenValidityUnits"`
	// User pool the client belongs to.
	UserPoolId *string `pulumi:"userPoolId"`
	// List of user pool attributes the application client can write to.
	WriteAttributes []string `pulumi:"writeAttributes"`
}

type UserPoolClientState struct {
	// Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	AccessTokenValidity pulumi.IntPtrInput
	// List of allowed OAuth flows (code, implicit, client_credentials).
	AllowedOauthFlows pulumi.StringArrayInput
	// Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
	AllowedOauthFlowsUserPoolClient pulumi.BoolPtrInput
	// List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
	AllowedOauthScopes pulumi.StringArrayInput
	// Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
	AnalyticsConfiguration UserPoolClientAnalyticsConfigurationPtrInput
	// List of allowed callback URLs for the identity providers.
	CallbackUrls pulumi.StringArrayInput
	// Client secret of the user pool client.
	ClientSecret pulumi.StringPtrInput
	// Default redirect URI. Must be in the list of callback URLs.
	DefaultRedirectUri pulumi.StringPtrInput
	// Enables or disables token revocation.
	EnableTokenRevocation pulumi.BoolPtrInput
	// List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
	ExplicitAuthFlows pulumi.StringArrayInput
	// Should an application secret be generated.
	GenerateSecret pulumi.BoolPtrInput
	// Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	IdTokenValidity pulumi.IntPtrInput
	// List of allowed logout URLs for the identity providers.
	LogoutUrls pulumi.StringArrayInput
	// Name of the application client.
	Name pulumi.StringPtrInput
	// Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
	PreventUserExistenceErrors pulumi.StringPtrInput
	// List of user pool attributes the application client can read from.
	ReadAttributes pulumi.StringArrayInput
	// Time limit in days refresh tokens are valid for.
	RefreshTokenValidity pulumi.IntPtrInput
	// List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `cognito.IdentityProvider` resource(s), or the equivalent string(s).
	SupportedIdentityProviders pulumi.StringArrayInput
	// Configuration block for units in which the validity times are represented in. Detailed below.
	TokenValidityUnits UserPoolClientTokenValidityUnitsPtrInput
	// User pool the client belongs to.
	UserPoolId pulumi.StringPtrInput
	// List of user pool attributes the application client can write to.
	WriteAttributes pulumi.StringArrayInput
}

func (UserPoolClientState) ElementType() reflect.Type {
	return reflect.TypeOf((*userPoolClientState)(nil)).Elem()
}

type userPoolClientArgs struct {
	// Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	AccessTokenValidity *int `pulumi:"accessTokenValidity"`
	// List of allowed OAuth flows (code, implicit, client_credentials).
	AllowedOauthFlows []string `pulumi:"allowedOauthFlows"`
	// Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
	AllowedOauthFlowsUserPoolClient *bool `pulumi:"allowedOauthFlowsUserPoolClient"`
	// List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
	AllowedOauthScopes []string `pulumi:"allowedOauthScopes"`
	// Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
	AnalyticsConfiguration *UserPoolClientAnalyticsConfiguration `pulumi:"analyticsConfiguration"`
	// List of allowed callback URLs for the identity providers.
	CallbackUrls []string `pulumi:"callbackUrls"`
	// Default redirect URI. Must be in the list of callback URLs.
	DefaultRedirectUri *string `pulumi:"defaultRedirectUri"`
	// Enables or disables token revocation.
	EnableTokenRevocation *bool `pulumi:"enableTokenRevocation"`
	// List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
	ExplicitAuthFlows []string `pulumi:"explicitAuthFlows"`
	// Should an application secret be generated.
	GenerateSecret *bool `pulumi:"generateSecret"`
	// Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	IdTokenValidity *int `pulumi:"idTokenValidity"`
	// List of allowed logout URLs for the identity providers.
	LogoutUrls []string `pulumi:"logoutUrls"`
	// Name of the application client.
	Name *string `pulumi:"name"`
	// Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
	PreventUserExistenceErrors *string `pulumi:"preventUserExistenceErrors"`
	// List of user pool attributes the application client can read from.
	ReadAttributes []string `pulumi:"readAttributes"`
	// Time limit in days refresh tokens are valid for.
	RefreshTokenValidity *int `pulumi:"refreshTokenValidity"`
	// List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `cognito.IdentityProvider` resource(s), or the equivalent string(s).
	SupportedIdentityProviders []string `pulumi:"supportedIdentityProviders"`
	// Configuration block for units in which the validity times are represented in. Detailed below.
	TokenValidityUnits *UserPoolClientTokenValidityUnits `pulumi:"tokenValidityUnits"`
	// User pool the client belongs to.
	UserPoolId string `pulumi:"userPoolId"`
	// List of user pool attributes the application client can write to.
	WriteAttributes []string `pulumi:"writeAttributes"`
}

// The set of arguments for constructing a UserPoolClient resource.
type UserPoolClientArgs struct {
	// Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	AccessTokenValidity pulumi.IntPtrInput
	// List of allowed OAuth flows (code, implicit, client_credentials).
	AllowedOauthFlows pulumi.StringArrayInput
	// Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
	AllowedOauthFlowsUserPoolClient pulumi.BoolPtrInput
	// List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
	AllowedOauthScopes pulumi.StringArrayInput
	// Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
	AnalyticsConfiguration UserPoolClientAnalyticsConfigurationPtrInput
	// List of allowed callback URLs for the identity providers.
	CallbackUrls pulumi.StringArrayInput
	// Default redirect URI. Must be in the list of callback URLs.
	DefaultRedirectUri pulumi.StringPtrInput
	// Enables or disables token revocation.
	EnableTokenRevocation pulumi.BoolPtrInput
	// List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
	ExplicitAuthFlows pulumi.StringArrayInput
	// Should an application secret be generated.
	GenerateSecret pulumi.BoolPtrInput
	// Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `tokenValidityUnits`.
	IdTokenValidity pulumi.IntPtrInput
	// List of allowed logout URLs for the identity providers.
	LogoutUrls pulumi.StringArrayInput
	// Name of the application client.
	Name pulumi.StringPtrInput
	// Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
	PreventUserExistenceErrors pulumi.StringPtrInput
	// List of user pool attributes the application client can read from.
	ReadAttributes pulumi.StringArrayInput
	// Time limit in days refresh tokens are valid for.
	RefreshTokenValidity pulumi.IntPtrInput
	// List of provider names for the identity providers that are supported on this client. Uses the `providerName` attribute of `cognito.IdentityProvider` resource(s), or the equivalent string(s).
	SupportedIdentityProviders pulumi.StringArrayInput
	// Configuration block for units in which the validity times are represented in. Detailed below.
	TokenValidityUnits UserPoolClientTokenValidityUnitsPtrInput
	// User pool the client belongs to.
	UserPoolId pulumi.StringInput
	// List of user pool attributes the application client can write to.
	WriteAttributes pulumi.StringArrayInput
}

func (UserPoolClientArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userPoolClientArgs)(nil)).Elem()
}

type UserPoolClientInput interface {
	pulumi.Input

	ToUserPoolClientOutput() UserPoolClientOutput
	ToUserPoolClientOutputWithContext(ctx context.Context) UserPoolClientOutput
}

func (*UserPoolClient) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPoolClient)(nil)).Elem()
}

func (i *UserPoolClient) ToUserPoolClientOutput() UserPoolClientOutput {
	return i.ToUserPoolClientOutputWithContext(context.Background())
}

func (i *UserPoolClient) ToUserPoolClientOutputWithContext(ctx context.Context) UserPoolClientOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolClientOutput)
}

// UserPoolClientArrayInput is an input type that accepts UserPoolClientArray and UserPoolClientArrayOutput values.
// You can construct a concrete instance of `UserPoolClientArrayInput` via:
//
//          UserPoolClientArray{ UserPoolClientArgs{...} }
type UserPoolClientArrayInput interface {
	pulumi.Input

	ToUserPoolClientArrayOutput() UserPoolClientArrayOutput
	ToUserPoolClientArrayOutputWithContext(context.Context) UserPoolClientArrayOutput
}

type UserPoolClientArray []UserPoolClientInput

func (UserPoolClientArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPoolClient)(nil)).Elem()
}

func (i UserPoolClientArray) ToUserPoolClientArrayOutput() UserPoolClientArrayOutput {
	return i.ToUserPoolClientArrayOutputWithContext(context.Background())
}

func (i UserPoolClientArray) ToUserPoolClientArrayOutputWithContext(ctx context.Context) UserPoolClientArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolClientArrayOutput)
}

// UserPoolClientMapInput is an input type that accepts UserPoolClientMap and UserPoolClientMapOutput values.
// You can construct a concrete instance of `UserPoolClientMapInput` via:
//
//          UserPoolClientMap{ "key": UserPoolClientArgs{...} }
type UserPoolClientMapInput interface {
	pulumi.Input

	ToUserPoolClientMapOutput() UserPoolClientMapOutput
	ToUserPoolClientMapOutputWithContext(context.Context) UserPoolClientMapOutput
}

type UserPoolClientMap map[string]UserPoolClientInput

func (UserPoolClientMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPoolClient)(nil)).Elem()
}

func (i UserPoolClientMap) ToUserPoolClientMapOutput() UserPoolClientMapOutput {
	return i.ToUserPoolClientMapOutputWithContext(context.Background())
}

func (i UserPoolClientMap) ToUserPoolClientMapOutputWithContext(ctx context.Context) UserPoolClientMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPoolClientMapOutput)
}

type UserPoolClientOutput struct{ *pulumi.OutputState }

func (UserPoolClientOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPoolClient)(nil)).Elem()
}

func (o UserPoolClientOutput) ToUserPoolClientOutput() UserPoolClientOutput {
	return o
}

func (o UserPoolClientOutput) ToUserPoolClientOutputWithContext(ctx context.Context) UserPoolClientOutput {
	return o
}

type UserPoolClientArrayOutput struct{ *pulumi.OutputState }

func (UserPoolClientArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPoolClient)(nil)).Elem()
}

func (o UserPoolClientArrayOutput) ToUserPoolClientArrayOutput() UserPoolClientArrayOutput {
	return o
}

func (o UserPoolClientArrayOutput) ToUserPoolClientArrayOutputWithContext(ctx context.Context) UserPoolClientArrayOutput {
	return o
}

func (o UserPoolClientArrayOutput) Index(i pulumi.IntInput) UserPoolClientOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserPoolClient {
		return vs[0].([]*UserPoolClient)[vs[1].(int)]
	}).(UserPoolClientOutput)
}

type UserPoolClientMapOutput struct{ *pulumi.OutputState }

func (UserPoolClientMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPoolClient)(nil)).Elem()
}

func (o UserPoolClientMapOutput) ToUserPoolClientMapOutput() UserPoolClientMapOutput {
	return o
}

func (o UserPoolClientMapOutput) ToUserPoolClientMapOutputWithContext(ctx context.Context) UserPoolClientMapOutput {
	return o
}

func (o UserPoolClientMapOutput) MapIndex(k pulumi.StringInput) UserPoolClientOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserPoolClient {
		return vs[0].(map[string]*UserPoolClient)[vs[1].(string)]
	}).(UserPoolClientOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolClientInput)(nil)).Elem(), &UserPoolClient{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolClientArrayInput)(nil)).Elem(), UserPoolClientArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPoolClientMapInput)(nil)).Elem(), UserPoolClientMap{})
	pulumi.RegisterOutputType(UserPoolClientOutput{})
	pulumi.RegisterOutputType(UserPoolClientArrayOutput{})
	pulumi.RegisterOutputType(UserPoolClientMapOutput{})
}
