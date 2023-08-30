// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigatewayv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Amazon API Gateway Version 2 integration response.
// More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigatewayv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apigatewayv2.NewIntegrationResponse(ctx, "example", &apigatewayv2.IntegrationResponseArgs{
//				ApiId:                  pulumi.Any(aws_apigatewayv2_api.Example.Id),
//				IntegrationId:          pulumi.Any(aws_apigatewayv2_integration.Example.Id),
//				IntegrationResponseKey: pulumi.String("/200/"),
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
// Using `pulumi import`, import `aws_apigatewayv2_integration_response` using the API identifier, integration identifier and integration response identifier. For example:
//
// ```sh
//
//	$ pulumi import aws:apigatewayv2/integrationResponse:IntegrationResponse example aabbccddee/1122334/998877
//
// ```
type IntegrationResponse struct {
	pulumi.CustomResourceState

	// API identifier.
	ApiId pulumi.StringOutput `pulumi:"apiId"`
	// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
	ContentHandlingStrategy pulumi.StringPtrOutput `pulumi:"contentHandlingStrategy"`
	// Identifier of the `apigatewayv2.Integration`.
	IntegrationId pulumi.StringOutput `pulumi:"integrationId"`
	// Integration response key.
	IntegrationResponseKey pulumi.StringOutput `pulumi:"integrationResponseKey"`
	// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
	ResponseTemplates pulumi.StringMapOutput `pulumi:"responseTemplates"`
	// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
	TemplateSelectionExpression pulumi.StringPtrOutput `pulumi:"templateSelectionExpression"`
}

// NewIntegrationResponse registers a new resource with the given unique name, arguments, and options.
func NewIntegrationResponse(ctx *pulumi.Context,
	name string, args *IntegrationResponseArgs, opts ...pulumi.ResourceOption) (*IntegrationResponse, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiId == nil {
		return nil, errors.New("invalid value for required argument 'ApiId'")
	}
	if args.IntegrationId == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationId'")
	}
	if args.IntegrationResponseKey == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationResponseKey'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IntegrationResponse
	err := ctx.RegisterResource("aws:apigatewayv2/integrationResponse:IntegrationResponse", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationResponse gets an existing IntegrationResponse resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationResponse(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationResponseState, opts ...pulumi.ResourceOption) (*IntegrationResponse, error) {
	var resource IntegrationResponse
	err := ctx.ReadResource("aws:apigatewayv2/integrationResponse:IntegrationResponse", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationResponse resources.
type integrationResponseState struct {
	// API identifier.
	ApiId *string `pulumi:"apiId"`
	// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
	ContentHandlingStrategy *string `pulumi:"contentHandlingStrategy"`
	// Identifier of the `apigatewayv2.Integration`.
	IntegrationId *string `pulumi:"integrationId"`
	// Integration response key.
	IntegrationResponseKey *string `pulumi:"integrationResponseKey"`
	// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
	ResponseTemplates map[string]string `pulumi:"responseTemplates"`
	// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
	TemplateSelectionExpression *string `pulumi:"templateSelectionExpression"`
}

type IntegrationResponseState struct {
	// API identifier.
	ApiId pulumi.StringPtrInput
	// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
	ContentHandlingStrategy pulumi.StringPtrInput
	// Identifier of the `apigatewayv2.Integration`.
	IntegrationId pulumi.StringPtrInput
	// Integration response key.
	IntegrationResponseKey pulumi.StringPtrInput
	// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
	ResponseTemplates pulumi.StringMapInput
	// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
	TemplateSelectionExpression pulumi.StringPtrInput
}

func (IntegrationResponseState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationResponseState)(nil)).Elem()
}

type integrationResponseArgs struct {
	// API identifier.
	ApiId string `pulumi:"apiId"`
	// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
	ContentHandlingStrategy *string `pulumi:"contentHandlingStrategy"`
	// Identifier of the `apigatewayv2.Integration`.
	IntegrationId string `pulumi:"integrationId"`
	// Integration response key.
	IntegrationResponseKey string `pulumi:"integrationResponseKey"`
	// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
	ResponseTemplates map[string]string `pulumi:"responseTemplates"`
	// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
	TemplateSelectionExpression *string `pulumi:"templateSelectionExpression"`
}

// The set of arguments for constructing a IntegrationResponse resource.
type IntegrationResponseArgs struct {
	// API identifier.
	ApiId pulumi.StringInput
	// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
	ContentHandlingStrategy pulumi.StringPtrInput
	// Identifier of the `apigatewayv2.Integration`.
	IntegrationId pulumi.StringInput
	// Integration response key.
	IntegrationResponseKey pulumi.StringInput
	// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
	ResponseTemplates pulumi.StringMapInput
	// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
	TemplateSelectionExpression pulumi.StringPtrInput
}

func (IntegrationResponseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationResponseArgs)(nil)).Elem()
}

type IntegrationResponseInput interface {
	pulumi.Input

	ToIntegrationResponseOutput() IntegrationResponseOutput
	ToIntegrationResponseOutputWithContext(ctx context.Context) IntegrationResponseOutput
}

func (*IntegrationResponse) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationResponse)(nil)).Elem()
}

func (i *IntegrationResponse) ToIntegrationResponseOutput() IntegrationResponseOutput {
	return i.ToIntegrationResponseOutputWithContext(context.Background())
}

func (i *IntegrationResponse) ToIntegrationResponseOutputWithContext(ctx context.Context) IntegrationResponseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationResponseOutput)
}

// IntegrationResponseArrayInput is an input type that accepts IntegrationResponseArray and IntegrationResponseArrayOutput values.
// You can construct a concrete instance of `IntegrationResponseArrayInput` via:
//
//	IntegrationResponseArray{ IntegrationResponseArgs{...} }
type IntegrationResponseArrayInput interface {
	pulumi.Input

	ToIntegrationResponseArrayOutput() IntegrationResponseArrayOutput
	ToIntegrationResponseArrayOutputWithContext(context.Context) IntegrationResponseArrayOutput
}

type IntegrationResponseArray []IntegrationResponseInput

func (IntegrationResponseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationResponse)(nil)).Elem()
}

func (i IntegrationResponseArray) ToIntegrationResponseArrayOutput() IntegrationResponseArrayOutput {
	return i.ToIntegrationResponseArrayOutputWithContext(context.Background())
}

func (i IntegrationResponseArray) ToIntegrationResponseArrayOutputWithContext(ctx context.Context) IntegrationResponseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationResponseArrayOutput)
}

// IntegrationResponseMapInput is an input type that accepts IntegrationResponseMap and IntegrationResponseMapOutput values.
// You can construct a concrete instance of `IntegrationResponseMapInput` via:
//
//	IntegrationResponseMap{ "key": IntegrationResponseArgs{...} }
type IntegrationResponseMapInput interface {
	pulumi.Input

	ToIntegrationResponseMapOutput() IntegrationResponseMapOutput
	ToIntegrationResponseMapOutputWithContext(context.Context) IntegrationResponseMapOutput
}

type IntegrationResponseMap map[string]IntegrationResponseInput

func (IntegrationResponseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationResponse)(nil)).Elem()
}

func (i IntegrationResponseMap) ToIntegrationResponseMapOutput() IntegrationResponseMapOutput {
	return i.ToIntegrationResponseMapOutputWithContext(context.Background())
}

func (i IntegrationResponseMap) ToIntegrationResponseMapOutputWithContext(ctx context.Context) IntegrationResponseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationResponseMapOutput)
}

type IntegrationResponseOutput struct{ *pulumi.OutputState }

func (IntegrationResponseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationResponse)(nil)).Elem()
}

func (o IntegrationResponseOutput) ToIntegrationResponseOutput() IntegrationResponseOutput {
	return o
}

func (o IntegrationResponseOutput) ToIntegrationResponseOutputWithContext(ctx context.Context) IntegrationResponseOutput {
	return o
}

// API identifier.
func (o IntegrationResponseOutput) ApiId() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringOutput { return v.ApiId }).(pulumi.StringOutput)
}

// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
func (o IntegrationResponseOutput) ContentHandlingStrategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringPtrOutput { return v.ContentHandlingStrategy }).(pulumi.StringPtrOutput)
}

// Identifier of the `apigatewayv2.Integration`.
func (o IntegrationResponseOutput) IntegrationId() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringOutput { return v.IntegrationId }).(pulumi.StringOutput)
}

// Integration response key.
func (o IntegrationResponseOutput) IntegrationResponseKey() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringOutput { return v.IntegrationResponseKey }).(pulumi.StringOutput)
}

// Map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
func (o IntegrationResponseOutput) ResponseTemplates() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringMapOutput { return v.ResponseTemplates }).(pulumi.StringMapOutput)
}

// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
func (o IntegrationResponseOutput) TemplateSelectionExpression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IntegrationResponse) pulumi.StringPtrOutput { return v.TemplateSelectionExpression }).(pulumi.StringPtrOutput)
}

type IntegrationResponseArrayOutput struct{ *pulumi.OutputState }

func (IntegrationResponseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationResponse)(nil)).Elem()
}

func (o IntegrationResponseArrayOutput) ToIntegrationResponseArrayOutput() IntegrationResponseArrayOutput {
	return o
}

func (o IntegrationResponseArrayOutput) ToIntegrationResponseArrayOutputWithContext(ctx context.Context) IntegrationResponseArrayOutput {
	return o
}

func (o IntegrationResponseArrayOutput) Index(i pulumi.IntInput) IntegrationResponseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IntegrationResponse {
		return vs[0].([]*IntegrationResponse)[vs[1].(int)]
	}).(IntegrationResponseOutput)
}

type IntegrationResponseMapOutput struct{ *pulumi.OutputState }

func (IntegrationResponseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationResponse)(nil)).Elem()
}

func (o IntegrationResponseMapOutput) ToIntegrationResponseMapOutput() IntegrationResponseMapOutput {
	return o
}

func (o IntegrationResponseMapOutput) ToIntegrationResponseMapOutputWithContext(ctx context.Context) IntegrationResponseMapOutput {
	return o
}

func (o IntegrationResponseMapOutput) MapIndex(k pulumi.StringInput) IntegrationResponseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IntegrationResponse {
		return vs[0].(map[string]*IntegrationResponse)[vs[1].(string)]
	}).(IntegrationResponseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationResponseInput)(nil)).Elem(), &IntegrationResponse{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationResponseArrayInput)(nil)).Elem(), IntegrationResponseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationResponseMapInput)(nil)).Elem(), IntegrationResponseMap{})
	pulumi.RegisterOutputType(IntegrationResponseOutput{})
	pulumi.RegisterOutputType(IntegrationResponseArrayOutput{})
	pulumi.RegisterOutputType(IntegrationResponseMapOutput{})
}
