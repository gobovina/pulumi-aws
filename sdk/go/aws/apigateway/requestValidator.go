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

// Manages an API Gateway Request Validator.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apigateway.NewRequestValidator(ctx, "example", &apigateway.RequestValidatorArgs{
//				RestApi:                   pulumi.Any(aws_api_gateway_rest_api.Example.Id),
//				ValidateRequestBody:       pulumi.Bool(true),
//				ValidateRequestParameters: pulumi.Bool(true),
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
// Using `pulumi import`, import `aws_api_gateway_request_validator` using `REST-API-ID/REQUEST-VALIDATOR-ID`. For example:
//
// ```sh
//
//	$ pulumi import aws:apigateway/requestValidator:RequestValidator example 12345abcde/67890fghij
//
// ```
type RequestValidator struct {
	pulumi.CustomResourceState

	// Name of the request validator
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the associated Rest API
	RestApi pulumi.StringOutput `pulumi:"restApi"`
	// Boolean whether to validate request body. Defaults to `false`.
	ValidateRequestBody pulumi.BoolPtrOutput `pulumi:"validateRequestBody"`
	// Boolean whether to validate request parameters. Defaults to `false`.
	ValidateRequestParameters pulumi.BoolPtrOutput `pulumi:"validateRequestParameters"`
}

// NewRequestValidator registers a new resource with the given unique name, arguments, and options.
func NewRequestValidator(ctx *pulumi.Context,
	name string, args *RequestValidatorArgs, opts ...pulumi.ResourceOption) (*RequestValidator, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RestApi == nil {
		return nil, errors.New("invalid value for required argument 'RestApi'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RequestValidator
	err := ctx.RegisterResource("aws:apigateway/requestValidator:RequestValidator", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRequestValidator gets an existing RequestValidator resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRequestValidator(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RequestValidatorState, opts ...pulumi.ResourceOption) (*RequestValidator, error) {
	var resource RequestValidator
	err := ctx.ReadResource("aws:apigateway/requestValidator:RequestValidator", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RequestValidator resources.
type requestValidatorState struct {
	// Name of the request validator
	Name *string `pulumi:"name"`
	// ID of the associated Rest API
	RestApi interface{} `pulumi:"restApi"`
	// Boolean whether to validate request body. Defaults to `false`.
	ValidateRequestBody *bool `pulumi:"validateRequestBody"`
	// Boolean whether to validate request parameters. Defaults to `false`.
	ValidateRequestParameters *bool `pulumi:"validateRequestParameters"`
}

type RequestValidatorState struct {
	// Name of the request validator
	Name pulumi.StringPtrInput
	// ID of the associated Rest API
	RestApi pulumi.Input
	// Boolean whether to validate request body. Defaults to `false`.
	ValidateRequestBody pulumi.BoolPtrInput
	// Boolean whether to validate request parameters. Defaults to `false`.
	ValidateRequestParameters pulumi.BoolPtrInput
}

func (RequestValidatorState) ElementType() reflect.Type {
	return reflect.TypeOf((*requestValidatorState)(nil)).Elem()
}

type requestValidatorArgs struct {
	// Name of the request validator
	Name *string `pulumi:"name"`
	// ID of the associated Rest API
	RestApi interface{} `pulumi:"restApi"`
	// Boolean whether to validate request body. Defaults to `false`.
	ValidateRequestBody *bool `pulumi:"validateRequestBody"`
	// Boolean whether to validate request parameters. Defaults to `false`.
	ValidateRequestParameters *bool `pulumi:"validateRequestParameters"`
}

// The set of arguments for constructing a RequestValidator resource.
type RequestValidatorArgs struct {
	// Name of the request validator
	Name pulumi.StringPtrInput
	// ID of the associated Rest API
	RestApi pulumi.Input
	// Boolean whether to validate request body. Defaults to `false`.
	ValidateRequestBody pulumi.BoolPtrInput
	// Boolean whether to validate request parameters. Defaults to `false`.
	ValidateRequestParameters pulumi.BoolPtrInput
}

func (RequestValidatorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*requestValidatorArgs)(nil)).Elem()
}

type RequestValidatorInput interface {
	pulumi.Input

	ToRequestValidatorOutput() RequestValidatorOutput
	ToRequestValidatorOutputWithContext(ctx context.Context) RequestValidatorOutput
}

func (*RequestValidator) ElementType() reflect.Type {
	return reflect.TypeOf((**RequestValidator)(nil)).Elem()
}

func (i *RequestValidator) ToRequestValidatorOutput() RequestValidatorOutput {
	return i.ToRequestValidatorOutputWithContext(context.Background())
}

func (i *RequestValidator) ToRequestValidatorOutputWithContext(ctx context.Context) RequestValidatorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestValidatorOutput)
}

// RequestValidatorArrayInput is an input type that accepts RequestValidatorArray and RequestValidatorArrayOutput values.
// You can construct a concrete instance of `RequestValidatorArrayInput` via:
//
//	RequestValidatorArray{ RequestValidatorArgs{...} }
type RequestValidatorArrayInput interface {
	pulumi.Input

	ToRequestValidatorArrayOutput() RequestValidatorArrayOutput
	ToRequestValidatorArrayOutputWithContext(context.Context) RequestValidatorArrayOutput
}

type RequestValidatorArray []RequestValidatorInput

func (RequestValidatorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RequestValidator)(nil)).Elem()
}

func (i RequestValidatorArray) ToRequestValidatorArrayOutput() RequestValidatorArrayOutput {
	return i.ToRequestValidatorArrayOutputWithContext(context.Background())
}

func (i RequestValidatorArray) ToRequestValidatorArrayOutputWithContext(ctx context.Context) RequestValidatorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestValidatorArrayOutput)
}

// RequestValidatorMapInput is an input type that accepts RequestValidatorMap and RequestValidatorMapOutput values.
// You can construct a concrete instance of `RequestValidatorMapInput` via:
//
//	RequestValidatorMap{ "key": RequestValidatorArgs{...} }
type RequestValidatorMapInput interface {
	pulumi.Input

	ToRequestValidatorMapOutput() RequestValidatorMapOutput
	ToRequestValidatorMapOutputWithContext(context.Context) RequestValidatorMapOutput
}

type RequestValidatorMap map[string]RequestValidatorInput

func (RequestValidatorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RequestValidator)(nil)).Elem()
}

func (i RequestValidatorMap) ToRequestValidatorMapOutput() RequestValidatorMapOutput {
	return i.ToRequestValidatorMapOutputWithContext(context.Background())
}

func (i RequestValidatorMap) ToRequestValidatorMapOutputWithContext(ctx context.Context) RequestValidatorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RequestValidatorMapOutput)
}

type RequestValidatorOutput struct{ *pulumi.OutputState }

func (RequestValidatorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RequestValidator)(nil)).Elem()
}

func (o RequestValidatorOutput) ToRequestValidatorOutput() RequestValidatorOutput {
	return o
}

func (o RequestValidatorOutput) ToRequestValidatorOutputWithContext(ctx context.Context) RequestValidatorOutput {
	return o
}

// Name of the request validator
func (o RequestValidatorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RequestValidator) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the associated Rest API
func (o RequestValidatorOutput) RestApi() pulumi.StringOutput {
	return o.ApplyT(func(v *RequestValidator) pulumi.StringOutput { return v.RestApi }).(pulumi.StringOutput)
}

// Boolean whether to validate request body. Defaults to `false`.
func (o RequestValidatorOutput) ValidateRequestBody() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RequestValidator) pulumi.BoolPtrOutput { return v.ValidateRequestBody }).(pulumi.BoolPtrOutput)
}

// Boolean whether to validate request parameters. Defaults to `false`.
func (o RequestValidatorOutput) ValidateRequestParameters() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RequestValidator) pulumi.BoolPtrOutput { return v.ValidateRequestParameters }).(pulumi.BoolPtrOutput)
}

type RequestValidatorArrayOutput struct{ *pulumi.OutputState }

func (RequestValidatorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RequestValidator)(nil)).Elem()
}

func (o RequestValidatorArrayOutput) ToRequestValidatorArrayOutput() RequestValidatorArrayOutput {
	return o
}

func (o RequestValidatorArrayOutput) ToRequestValidatorArrayOutputWithContext(ctx context.Context) RequestValidatorArrayOutput {
	return o
}

func (o RequestValidatorArrayOutput) Index(i pulumi.IntInput) RequestValidatorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RequestValidator {
		return vs[0].([]*RequestValidator)[vs[1].(int)]
	}).(RequestValidatorOutput)
}

type RequestValidatorMapOutput struct{ *pulumi.OutputState }

func (RequestValidatorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RequestValidator)(nil)).Elem()
}

func (o RequestValidatorMapOutput) ToRequestValidatorMapOutput() RequestValidatorMapOutput {
	return o
}

func (o RequestValidatorMapOutput) ToRequestValidatorMapOutputWithContext(ctx context.Context) RequestValidatorMapOutput {
	return o
}

func (o RequestValidatorMapOutput) MapIndex(k pulumi.StringInput) RequestValidatorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RequestValidator {
		return vs[0].(map[string]*RequestValidator)[vs[1].(string)]
	}).(RequestValidatorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RequestValidatorInput)(nil)).Elem(), &RequestValidator{})
	pulumi.RegisterInputType(reflect.TypeOf((*RequestValidatorArrayInput)(nil)).Elem(), RequestValidatorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RequestValidatorMapInput)(nil)).Elem(), RequestValidatorMap{})
	pulumi.RegisterOutputType(RequestValidatorOutput{})
	pulumi.RegisterOutputType(RequestValidatorArrayOutput{})
	pulumi.RegisterOutputType(RequestValidatorMapOutput{})
}
