// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigatewayv2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models).
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/apigatewayv2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := apigatewayv2.NewModel(ctx, "example", &apigatewayv2.ModelArgs{
// 			ApiId:       pulumi.Any(aws_apigatewayv2_api.Example.Id),
// 			ContentType: pulumi.String("application/json"),
// 			Schema:      pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"", "$", "schema\": \"http://json-schema.org/draft-04/schema#\",\n", "  \"title\": \"ExampleModel\",\n", "  \"type\": \"object\",\n", "  \"properties\": {\n", "    \"id\": { \"type\": \"string\" }\n", "  }\n", "}\n")),
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
// `aws_apigatewayv2_model` can be imported by using the API identifier and model identifier, e.g.
//
// ```sh
//  $ pulumi import aws:apigatewayv2/model:Model example aabbccddee/1122334
// ```
type Model struct {
	pulumi.CustomResourceState

	// The API identifier.
	ApiId pulumi.StringOutput `pulumi:"apiId"`
	// The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// The description of the model. Must be between 1 and 128 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewModel registers a new resource with the given unique name, arguments, and options.
func NewModel(ctx *pulumi.Context,
	name string, args *ModelArgs, opts ...pulumi.ResourceOption) (*Model, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiId == nil {
		return nil, errors.New("invalid value for required argument 'ApiId'")
	}
	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	var resource Model
	err := ctx.RegisterResource("aws:apigatewayv2/model:Model", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetModel gets an existing Model resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetModel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ModelState, opts ...pulumi.ResourceOption) (*Model, error) {
	var resource Model
	err := ctx.ReadResource("aws:apigatewayv2/model:Model", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Model resources.
type modelState struct {
	// The API identifier.
	ApiId *string `pulumi:"apiId"`
	// The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
	ContentType *string `pulumi:"contentType"`
	// The description of the model. Must be between 1 and 128 characters in length.
	Description *string `pulumi:"description"`
	// The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
	Name *string `pulumi:"name"`
	// The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
	Schema *string `pulumi:"schema"`
}

type ModelState struct {
	// The API identifier.
	ApiId pulumi.StringPtrInput
	// The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
	ContentType pulumi.StringPtrInput
	// The description of the model. Must be between 1 and 128 characters in length.
	Description pulumi.StringPtrInput
	// The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
	Name pulumi.StringPtrInput
	// The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
	Schema pulumi.StringPtrInput
}

func (ModelState) ElementType() reflect.Type {
	return reflect.TypeOf((*modelState)(nil)).Elem()
}

type modelArgs struct {
	// The API identifier.
	ApiId string `pulumi:"apiId"`
	// The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
	ContentType string `pulumi:"contentType"`
	// The description of the model. Must be between 1 and 128 characters in length.
	Description *string `pulumi:"description"`
	// The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
	Name *string `pulumi:"name"`
	// The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a Model resource.
type ModelArgs struct {
	// The API identifier.
	ApiId pulumi.StringInput
	// The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
	ContentType pulumi.StringInput
	// The description of the model. Must be between 1 and 128 characters in length.
	Description pulumi.StringPtrInput
	// The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
	Name pulumi.StringPtrInput
	// The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
	Schema pulumi.StringInput
}

func (ModelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*modelArgs)(nil)).Elem()
}

type ModelInput interface {
	pulumi.Input

	ToModelOutput() ModelOutput
	ToModelOutputWithContext(ctx context.Context) ModelOutput
}

func (*Model) ElementType() reflect.Type {
	return reflect.TypeOf((*Model)(nil))
}

func (i *Model) ToModelOutput() ModelOutput {
	return i.ToModelOutputWithContext(context.Background())
}

func (i *Model) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelOutput)
}

func (i *Model) ToModelPtrOutput() ModelPtrOutput {
	return i.ToModelPtrOutputWithContext(context.Background())
}

func (i *Model) ToModelPtrOutputWithContext(ctx context.Context) ModelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPtrOutput)
}

type ModelPtrInput interface {
	pulumi.Input

	ToModelPtrOutput() ModelPtrOutput
	ToModelPtrOutputWithContext(ctx context.Context) ModelPtrOutput
}

type modelPtrType ModelArgs

func (*modelPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil))
}

func (i *modelPtrType) ToModelPtrOutput() ModelPtrOutput {
	return i.ToModelPtrOutputWithContext(context.Background())
}

func (i *modelPtrType) ToModelPtrOutputWithContext(ctx context.Context) ModelPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPtrOutput)
}

// ModelArrayInput is an input type that accepts ModelArray and ModelArrayOutput values.
// You can construct a concrete instance of `ModelArrayInput` via:
//
//          ModelArray{ ModelArgs{...} }
type ModelArrayInput interface {
	pulumi.Input

	ToModelArrayOutput() ModelArrayOutput
	ToModelArrayOutputWithContext(context.Context) ModelArrayOutput
}

type ModelArray []ModelInput

func (ModelArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Model)(nil))
}

func (i ModelArray) ToModelArrayOutput() ModelArrayOutput {
	return i.ToModelArrayOutputWithContext(context.Background())
}

func (i ModelArray) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelArrayOutput)
}

// ModelMapInput is an input type that accepts ModelMap and ModelMapOutput values.
// You can construct a concrete instance of `ModelMapInput` via:
//
//          ModelMap{ "key": ModelArgs{...} }
type ModelMapInput interface {
	pulumi.Input

	ToModelMapOutput() ModelMapOutput
	ToModelMapOutputWithContext(context.Context) ModelMapOutput
}

type ModelMap map[string]ModelInput

func (ModelMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Model)(nil))
}

func (i ModelMap) ToModelMapOutput() ModelMapOutput {
	return i.ToModelMapOutputWithContext(context.Background())
}

func (i ModelMap) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelMapOutput)
}

type ModelOutput struct {
	*pulumi.OutputState
}

func (ModelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Model)(nil))
}

func (o ModelOutput) ToModelOutput() ModelOutput {
	return o
}

func (o ModelOutput) ToModelOutputWithContext(ctx context.Context) ModelOutput {
	return o
}

func (o ModelOutput) ToModelPtrOutput() ModelPtrOutput {
	return o.ToModelPtrOutputWithContext(context.Background())
}

func (o ModelOutput) ToModelPtrOutputWithContext(ctx context.Context) ModelPtrOutput {
	return o.ApplyT(func(v Model) *Model {
		return &v
	}).(ModelPtrOutput)
}

type ModelPtrOutput struct {
	*pulumi.OutputState
}

func (ModelPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Model)(nil))
}

func (o ModelPtrOutput) ToModelPtrOutput() ModelPtrOutput {
	return o
}

func (o ModelPtrOutput) ToModelPtrOutputWithContext(ctx context.Context) ModelPtrOutput {
	return o
}

type ModelArrayOutput struct{ *pulumi.OutputState }

func (ModelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Model)(nil))
}

func (o ModelArrayOutput) ToModelArrayOutput() ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) ToModelArrayOutputWithContext(ctx context.Context) ModelArrayOutput {
	return o
}

func (o ModelArrayOutput) Index(i pulumi.IntInput) ModelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Model {
		return vs[0].([]Model)[vs[1].(int)]
	}).(ModelOutput)
}

type ModelMapOutput struct{ *pulumi.OutputState }

func (ModelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Model)(nil))
}

func (o ModelMapOutput) ToModelMapOutput() ModelMapOutput {
	return o
}

func (o ModelMapOutput) ToModelMapOutputWithContext(ctx context.Context) ModelMapOutput {
	return o
}

func (o ModelMapOutput) MapIndex(k pulumi.StringInput) ModelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Model {
		return vs[0].(map[string]Model)[vs[1].(string)]
	}).(ModelOutput)
}

func init() {
	pulumi.RegisterOutputType(ModelOutput{})
	pulumi.RegisterOutputType(ModelPtrOutput{})
	pulumi.RegisterOutputType(ModelArrayOutput{})
	pulumi.RegisterOutputType(ModelMapOutput{})
}
