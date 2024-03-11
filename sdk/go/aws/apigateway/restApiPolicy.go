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

// Provides an API Gateway REST API Policy.
//
// > **Note:** Amazon API Gateway Version 1 resources are used for creating and deploying REST APIs. To create and deploy WebSocket and HTTP APIs, use Amazon API Gateway Version 2 resources.
//
// ## Example Usage
//
// ### Basic
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			testRestApi, err := apigateway.NewRestApi(ctx, "test", &apigateway.RestApiArgs{
//				Name: pulumi.String("example-rest-api"),
//			})
//			if err != nil {
//				return err
//			}
//			test := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Principals: iam.GetPolicyDocumentStatementPrincipalArray{
//							&iam.GetPolicyDocumentStatementPrincipalArgs{
//								Type: pulumi.String("AWS"),
//								Identifiers: pulumi.StringArray{
//									pulumi.String("*"),
//								},
//							},
//						},
//						Actions: pulumi.StringArray{
//							pulumi.String("execute-api:Invoke"),
//						},
//						Resources: pulumi.StringArray{
//							testRestApi.ExecutionArn,
//						},
//						Conditions: iam.GetPolicyDocumentStatementConditionArray{
//							&iam.GetPolicyDocumentStatementConditionArgs{
//								Test:     pulumi.String("IpAddress"),
//								Variable: pulumi.String("aws:SourceIp"),
//								Values: pulumi.StringArray{
//									pulumi.String("123.123.123.123/32"),
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			_, err = apigateway.NewRestApiPolicy(ctx, "test", &apigateway.RestApiPolicyArgs{
//				RestApiId: testRestApi.ID(),
//				Policy: test.ApplyT(func(test iam.GetPolicyDocumentResult) (*string, error) {
//					return &test.Json, nil
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_api_gateway_rest_api_policy` using the REST API ID. For example:
//
// ```sh
// $ pulumi import aws:apigateway/restApiPolicy:RestApiPolicy example 12345abcde
// ```
type RestApiPolicy struct {
	pulumi.CustomResourceState

	// JSON formatted policy document that controls access to the API Gateway.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// ID of the REST API.
	RestApiId pulumi.StringOutput `pulumi:"restApiId"`
}

// NewRestApiPolicy registers a new resource with the given unique name, arguments, and options.
func NewRestApiPolicy(ctx *pulumi.Context,
	name string, args *RestApiPolicyArgs, opts ...pulumi.ResourceOption) (*RestApiPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.RestApiId == nil {
		return nil, errors.New("invalid value for required argument 'RestApiId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RestApiPolicy
	err := ctx.RegisterResource("aws:apigateway/restApiPolicy:RestApiPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRestApiPolicy gets an existing RestApiPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRestApiPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RestApiPolicyState, opts ...pulumi.ResourceOption) (*RestApiPolicy, error) {
	var resource RestApiPolicy
	err := ctx.ReadResource("aws:apigateway/restApiPolicy:RestApiPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RestApiPolicy resources.
type restApiPolicyState struct {
	// JSON formatted policy document that controls access to the API Gateway.
	Policy *string `pulumi:"policy"`
	// ID of the REST API.
	RestApiId *string `pulumi:"restApiId"`
}

type RestApiPolicyState struct {
	// JSON formatted policy document that controls access to the API Gateway.
	Policy pulumi.StringPtrInput
	// ID of the REST API.
	RestApiId pulumi.StringPtrInput
}

func (RestApiPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*restApiPolicyState)(nil)).Elem()
}

type restApiPolicyArgs struct {
	// JSON formatted policy document that controls access to the API Gateway.
	Policy string `pulumi:"policy"`
	// ID of the REST API.
	RestApiId string `pulumi:"restApiId"`
}

// The set of arguments for constructing a RestApiPolicy resource.
type RestApiPolicyArgs struct {
	// JSON formatted policy document that controls access to the API Gateway.
	Policy pulumi.StringInput
	// ID of the REST API.
	RestApiId pulumi.StringInput
}

func (RestApiPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*restApiPolicyArgs)(nil)).Elem()
}

type RestApiPolicyInput interface {
	pulumi.Input

	ToRestApiPolicyOutput() RestApiPolicyOutput
	ToRestApiPolicyOutputWithContext(ctx context.Context) RestApiPolicyOutput
}

func (*RestApiPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**RestApiPolicy)(nil)).Elem()
}

func (i *RestApiPolicy) ToRestApiPolicyOutput() RestApiPolicyOutput {
	return i.ToRestApiPolicyOutputWithContext(context.Background())
}

func (i *RestApiPolicy) ToRestApiPolicyOutputWithContext(ctx context.Context) RestApiPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestApiPolicyOutput)
}

// RestApiPolicyArrayInput is an input type that accepts RestApiPolicyArray and RestApiPolicyArrayOutput values.
// You can construct a concrete instance of `RestApiPolicyArrayInput` via:
//
//	RestApiPolicyArray{ RestApiPolicyArgs{...} }
type RestApiPolicyArrayInput interface {
	pulumi.Input

	ToRestApiPolicyArrayOutput() RestApiPolicyArrayOutput
	ToRestApiPolicyArrayOutputWithContext(context.Context) RestApiPolicyArrayOutput
}

type RestApiPolicyArray []RestApiPolicyInput

func (RestApiPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RestApiPolicy)(nil)).Elem()
}

func (i RestApiPolicyArray) ToRestApiPolicyArrayOutput() RestApiPolicyArrayOutput {
	return i.ToRestApiPolicyArrayOutputWithContext(context.Background())
}

func (i RestApiPolicyArray) ToRestApiPolicyArrayOutputWithContext(ctx context.Context) RestApiPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestApiPolicyArrayOutput)
}

// RestApiPolicyMapInput is an input type that accepts RestApiPolicyMap and RestApiPolicyMapOutput values.
// You can construct a concrete instance of `RestApiPolicyMapInput` via:
//
//	RestApiPolicyMap{ "key": RestApiPolicyArgs{...} }
type RestApiPolicyMapInput interface {
	pulumi.Input

	ToRestApiPolicyMapOutput() RestApiPolicyMapOutput
	ToRestApiPolicyMapOutputWithContext(context.Context) RestApiPolicyMapOutput
}

type RestApiPolicyMap map[string]RestApiPolicyInput

func (RestApiPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RestApiPolicy)(nil)).Elem()
}

func (i RestApiPolicyMap) ToRestApiPolicyMapOutput() RestApiPolicyMapOutput {
	return i.ToRestApiPolicyMapOutputWithContext(context.Background())
}

func (i RestApiPolicyMap) ToRestApiPolicyMapOutputWithContext(ctx context.Context) RestApiPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestApiPolicyMapOutput)
}

type RestApiPolicyOutput struct{ *pulumi.OutputState }

func (RestApiPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RestApiPolicy)(nil)).Elem()
}

func (o RestApiPolicyOutput) ToRestApiPolicyOutput() RestApiPolicyOutput {
	return o
}

func (o RestApiPolicyOutput) ToRestApiPolicyOutputWithContext(ctx context.Context) RestApiPolicyOutput {
	return o
}

// JSON formatted policy document that controls access to the API Gateway.
func (o RestApiPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *RestApiPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// ID of the REST API.
func (o RestApiPolicyOutput) RestApiId() pulumi.StringOutput {
	return o.ApplyT(func(v *RestApiPolicy) pulumi.StringOutput { return v.RestApiId }).(pulumi.StringOutput)
}

type RestApiPolicyArrayOutput struct{ *pulumi.OutputState }

func (RestApiPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RestApiPolicy)(nil)).Elem()
}

func (o RestApiPolicyArrayOutput) ToRestApiPolicyArrayOutput() RestApiPolicyArrayOutput {
	return o
}

func (o RestApiPolicyArrayOutput) ToRestApiPolicyArrayOutputWithContext(ctx context.Context) RestApiPolicyArrayOutput {
	return o
}

func (o RestApiPolicyArrayOutput) Index(i pulumi.IntInput) RestApiPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RestApiPolicy {
		return vs[0].([]*RestApiPolicy)[vs[1].(int)]
	}).(RestApiPolicyOutput)
}

type RestApiPolicyMapOutput struct{ *pulumi.OutputState }

func (RestApiPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RestApiPolicy)(nil)).Elem()
}

func (o RestApiPolicyMapOutput) ToRestApiPolicyMapOutput() RestApiPolicyMapOutput {
	return o
}

func (o RestApiPolicyMapOutput) ToRestApiPolicyMapOutputWithContext(ctx context.Context) RestApiPolicyMapOutput {
	return o
}

func (o RestApiPolicyMapOutput) MapIndex(k pulumi.StringInput) RestApiPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RestApiPolicy {
		return vs[0].(map[string]*RestApiPolicy)[vs[1].(string)]
	}).(RestApiPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RestApiPolicyInput)(nil)).Elem(), &RestApiPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*RestApiPolicyArrayInput)(nil)).Elem(), RestApiPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RestApiPolicyMapInput)(nil)).Elem(), RestApiPolicyMap{})
	pulumi.RegisterOutputType(RestApiPolicyOutput{})
	pulumi.RegisterOutputType(RestApiPolicyArrayOutput{})
	pulumi.RegisterOutputType(RestApiPolicyMapOutput{})
}
