// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an API Gateway Authorizer.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			demoRestApi, err := apigateway.NewRestApi(ctx, "demo", &apigateway.RestApiArgs{
//				Name: pulumi.String("auth-demo"),
//			})
//			if err != nil {
//				return err
//			}
//			invocationAssumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"apigateway.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			invocationRole, err := iam.NewRole(ctx, "invocation_role", &iam.RoleArgs{
//				Name:             pulumi.String("api_gateway_auth_invocation"),
//				Path:             pulumi.String("/"),
//				AssumeRolePolicy: *pulumi.String(invocationAssumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			lambdaAssumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"lambda.amazonaws.com",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			lambda, err := iam.NewRole(ctx, "lambda", &iam.RoleArgs{
//				Name:             pulumi.String("demo-lambda"),
//				AssumeRolePolicy: *pulumi.String(lambdaAssumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			invokeFilebase64sha256, err := std.Filebase64sha256(ctx, &std.Filebase64sha256Args{
//				Input: "lambda-function.zip",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			authorizer, err := lambda.NewFunction(ctx, "authorizer", &lambda.FunctionArgs{
//				Code:           pulumi.NewFileArchive("lambda-function.zip"),
//				Name:           pulumi.String("api_gateway_authorizer"),
//				Role:           lambda.Arn,
//				Handler:        pulumi.String("exports.example"),
//				SourceCodeHash: invokeFilebase64sha256.Result,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apigateway.NewAuthorizer(ctx, "demo", &apigateway.AuthorizerArgs{
//				Name:                  pulumi.String("demo"),
//				RestApi:               demoRestApi.ID(),
//				AuthorizerUri:         authorizer.InvokeArn,
//				AuthorizerCredentials: invocationRole.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			invocationPolicy := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Actions: pulumi.StringArray{
//							pulumi.String("lambda:InvokeFunction"),
//						},
//						Resources: pulumi.StringArray{
//							authorizer.Arn,
//						},
//					},
//				},
//			}, nil)
//			_, err = iam.NewRolePolicy(ctx, "invocation_policy", &iam.RolePolicyArgs{
//				Name: pulumi.String("default"),
//				Role: invocationRole.ID(),
//				Policy: invocationPolicy.ApplyT(func(invocationPolicy iam.GetPolicyDocumentResult) (*string, error) {
//					return &invocationPolicy.Json, nil
//				}).(pulumi.StringPtrOutput),
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
// Using `pulumi import`, import AWS API Gateway Authorizer using the `REST-API-ID/AUTHORIZER-ID`. For example:
//
// ```sh
//
//	$ pulumi import aws:apigateway/authorizer:Authorizer authorizer 12345abcde/example
//
// ```
type Authorizer struct {
	pulumi.CustomResourceState

	// ARN of the API Gateway Authorizer
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
	AuthorizerCredentials pulumi.StringPtrOutput `pulumi:"authorizerCredentials"`
	// TTL of cached authorizer results in seconds. Defaults to `300`.
	AuthorizerResultTtlInSeconds pulumi.IntPtrOutput `pulumi:"authorizerResultTtlInSeconds"`
	// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
	// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
	AuthorizerUri pulumi.StringPtrOutput `pulumi:"authorizerUri"`
	// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
	IdentitySource pulumi.StringPtrOutput `pulumi:"identitySource"`
	// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
	IdentityValidationExpression pulumi.StringPtrOutput `pulumi:"identityValidationExpression"`
	// Name of the authorizer
	Name pulumi.StringOutput `pulumi:"name"`
	// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
	ProviderArns pulumi.StringArrayOutput `pulumi:"providerArns"`
	// ID of the associated REST API
	RestApi pulumi.StringOutput `pulumi:"restApi"`
	// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewAuthorizer registers a new resource with the given unique name, arguments, and options.
func NewAuthorizer(ctx *pulumi.Context,
	name string, args *AuthorizerArgs, opts ...pulumi.ResourceOption) (*Authorizer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RestApi == nil {
		return nil, errors.New("invalid value for required argument 'RestApi'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Authorizer
	err := ctx.RegisterResource("aws:apigateway/authorizer:Authorizer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthorizer gets an existing Authorizer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthorizer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthorizerState, opts ...pulumi.ResourceOption) (*Authorizer, error) {
	var resource Authorizer
	err := ctx.ReadResource("aws:apigateway/authorizer:Authorizer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Authorizer resources.
type authorizerState struct {
	// ARN of the API Gateway Authorizer
	Arn *string `pulumi:"arn"`
	// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
	AuthorizerCredentials *string `pulumi:"authorizerCredentials"`
	// TTL of cached authorizer results in seconds. Defaults to `300`.
	AuthorizerResultTtlInSeconds *int `pulumi:"authorizerResultTtlInSeconds"`
	// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
	// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
	AuthorizerUri *string `pulumi:"authorizerUri"`
	// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
	IdentitySource *string `pulumi:"identitySource"`
	// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
	IdentityValidationExpression *string `pulumi:"identityValidationExpression"`
	// Name of the authorizer
	Name *string `pulumi:"name"`
	// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
	ProviderArns []string `pulumi:"providerArns"`
	// ID of the associated REST API
	RestApi interface{} `pulumi:"restApi"`
	// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
	Type *string `pulumi:"type"`
}

type AuthorizerState struct {
	// ARN of the API Gateway Authorizer
	Arn pulumi.StringPtrInput
	// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
	AuthorizerCredentials pulumi.StringPtrInput
	// TTL of cached authorizer results in seconds. Defaults to `300`.
	AuthorizerResultTtlInSeconds pulumi.IntPtrInput
	// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
	// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
	AuthorizerUri pulumi.StringPtrInput
	// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
	IdentitySource pulumi.StringPtrInput
	// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
	IdentityValidationExpression pulumi.StringPtrInput
	// Name of the authorizer
	Name pulumi.StringPtrInput
	// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
	ProviderArns pulumi.StringArrayInput
	// ID of the associated REST API
	RestApi pulumi.Input
	// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
	Type pulumi.StringPtrInput
}

func (AuthorizerState) ElementType() reflect.Type {
	return reflect.TypeOf((*authorizerState)(nil)).Elem()
}

type authorizerArgs struct {
	// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
	AuthorizerCredentials *string `pulumi:"authorizerCredentials"`
	// TTL of cached authorizer results in seconds. Defaults to `300`.
	AuthorizerResultTtlInSeconds *int `pulumi:"authorizerResultTtlInSeconds"`
	// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
	// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
	AuthorizerUri *string `pulumi:"authorizerUri"`
	// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
	IdentitySource *string `pulumi:"identitySource"`
	// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
	IdentityValidationExpression *string `pulumi:"identityValidationExpression"`
	// Name of the authorizer
	Name *string `pulumi:"name"`
	// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
	ProviderArns []string `pulumi:"providerArns"`
	// ID of the associated REST API
	RestApi interface{} `pulumi:"restApi"`
	// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Authorizer resource.
type AuthorizerArgs struct {
	// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
	AuthorizerCredentials pulumi.StringPtrInput
	// TTL of cached authorizer results in seconds. Defaults to `300`.
	AuthorizerResultTtlInSeconds pulumi.IntPtrInput
	// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
	// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
	AuthorizerUri pulumi.StringPtrInput
	// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
	IdentitySource pulumi.StringPtrInput
	// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
	IdentityValidationExpression pulumi.StringPtrInput
	// Name of the authorizer
	Name pulumi.StringPtrInput
	// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
	ProviderArns pulumi.StringArrayInput
	// ID of the associated REST API
	RestApi pulumi.Input
	// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
	Type pulumi.StringPtrInput
}

func (AuthorizerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authorizerArgs)(nil)).Elem()
}

type AuthorizerInput interface {
	pulumi.Input

	ToAuthorizerOutput() AuthorizerOutput
	ToAuthorizerOutputWithContext(ctx context.Context) AuthorizerOutput
}

func (*Authorizer) ElementType() reflect.Type {
	return reflect.TypeOf((**Authorizer)(nil)).Elem()
}

func (i *Authorizer) ToAuthorizerOutput() AuthorizerOutput {
	return i.ToAuthorizerOutputWithContext(context.Background())
}

func (i *Authorizer) ToAuthorizerOutputWithContext(ctx context.Context) AuthorizerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthorizerOutput)
}

// AuthorizerArrayInput is an input type that accepts AuthorizerArray and AuthorizerArrayOutput values.
// You can construct a concrete instance of `AuthorizerArrayInput` via:
//
//	AuthorizerArray{ AuthorizerArgs{...} }
type AuthorizerArrayInput interface {
	pulumi.Input

	ToAuthorizerArrayOutput() AuthorizerArrayOutput
	ToAuthorizerArrayOutputWithContext(context.Context) AuthorizerArrayOutput
}

type AuthorizerArray []AuthorizerInput

func (AuthorizerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Authorizer)(nil)).Elem()
}

func (i AuthorizerArray) ToAuthorizerArrayOutput() AuthorizerArrayOutput {
	return i.ToAuthorizerArrayOutputWithContext(context.Background())
}

func (i AuthorizerArray) ToAuthorizerArrayOutputWithContext(ctx context.Context) AuthorizerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthorizerArrayOutput)
}

// AuthorizerMapInput is an input type that accepts AuthorizerMap and AuthorizerMapOutput values.
// You can construct a concrete instance of `AuthorizerMapInput` via:
//
//	AuthorizerMap{ "key": AuthorizerArgs{...} }
type AuthorizerMapInput interface {
	pulumi.Input

	ToAuthorizerMapOutput() AuthorizerMapOutput
	ToAuthorizerMapOutputWithContext(context.Context) AuthorizerMapOutput
}

type AuthorizerMap map[string]AuthorizerInput

func (AuthorizerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Authorizer)(nil)).Elem()
}

func (i AuthorizerMap) ToAuthorizerMapOutput() AuthorizerMapOutput {
	return i.ToAuthorizerMapOutputWithContext(context.Background())
}

func (i AuthorizerMap) ToAuthorizerMapOutputWithContext(ctx context.Context) AuthorizerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthorizerMapOutput)
}

type AuthorizerOutput struct{ *pulumi.OutputState }

func (AuthorizerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Authorizer)(nil)).Elem()
}

func (o AuthorizerOutput) ToAuthorizerOutput() AuthorizerOutput {
	return o
}

func (o AuthorizerOutput) ToAuthorizerOutputWithContext(ctx context.Context) AuthorizerOutput {
	return o
}

// ARN of the API Gateway Authorizer
func (o AuthorizerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
func (o AuthorizerOutput) AuthorizerCredentials() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringPtrOutput { return v.AuthorizerCredentials }).(pulumi.StringPtrOutput)
}

// TTL of cached authorizer results in seconds. Defaults to `300`.
func (o AuthorizerOutput) AuthorizerResultTtlInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.IntPtrOutput { return v.AuthorizerResultTtlInSeconds }).(pulumi.IntPtrOutput)
}

// Authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
// e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
func (o AuthorizerOutput) AuthorizerUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringPtrOutput { return v.AuthorizerUri }).(pulumi.StringPtrOutput)
}

// Source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
func (o AuthorizerOutput) IdentitySource() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringPtrOutput { return v.IdentitySource }).(pulumi.StringPtrOutput)
}

// Validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
func (o AuthorizerOutput) IdentityValidationExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringPtrOutput { return v.IdentityValidationExpression }).(pulumi.StringPtrOutput)
}

// Name of the authorizer
func (o AuthorizerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// List of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
func (o AuthorizerOutput) ProviderArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringArrayOutput { return v.ProviderArns }).(pulumi.StringArrayOutput)
}

// ID of the associated REST API
func (o AuthorizerOutput) RestApi() pulumi.StringOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringOutput { return v.RestApi }).(pulumi.StringOutput)
}

// Type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
func (o AuthorizerOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Authorizer) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type AuthorizerArrayOutput struct{ *pulumi.OutputState }

func (AuthorizerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Authorizer)(nil)).Elem()
}

func (o AuthorizerArrayOutput) ToAuthorizerArrayOutput() AuthorizerArrayOutput {
	return o
}

func (o AuthorizerArrayOutput) ToAuthorizerArrayOutputWithContext(ctx context.Context) AuthorizerArrayOutput {
	return o
}

func (o AuthorizerArrayOutput) Index(i pulumi.IntInput) AuthorizerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Authorizer {
		return vs[0].([]*Authorizer)[vs[1].(int)]
	}).(AuthorizerOutput)
}

type AuthorizerMapOutput struct{ *pulumi.OutputState }

func (AuthorizerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Authorizer)(nil)).Elem()
}

func (o AuthorizerMapOutput) ToAuthorizerMapOutput() AuthorizerMapOutput {
	return o
}

func (o AuthorizerMapOutput) ToAuthorizerMapOutputWithContext(ctx context.Context) AuthorizerMapOutput {
	return o
}

func (o AuthorizerMapOutput) MapIndex(k pulumi.StringInput) AuthorizerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Authorizer {
		return vs[0].(map[string]*Authorizer)[vs[1].(string)]
	}).(AuthorizerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthorizerInput)(nil)).Elem(), &Authorizer{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthorizerArrayInput)(nil)).Elem(), AuthorizerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthorizerMapInput)(nil)).Elem(), AuthorizerMap{})
	pulumi.RegisterOutputType(AuthorizerOutput{})
	pulumi.RegisterOutputType(AuthorizerArrayOutput{})
	pulumi.RegisterOutputType(AuthorizerMapOutput{})
}
