// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appconfig

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppConfig Extension resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appconfig"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			testTopic, err := sns.NewTopic(ctx, "test", &sns.TopicArgs{
//				Name: pulumi.String("test"),
//			})
//			if err != nil {
//				return err
//			}
//			test, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"appconfig.amazonaws.com",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			testRole, err := iam.NewRole(ctx, "test", &iam.RoleArgs{
//				Name:             pulumi.String("test"),
//				AssumeRolePolicy: *pulumi.String(test.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appconfig.NewExtension(ctx, "test", &appconfig.ExtensionArgs{
//				Name:        pulumi.String("test"),
//				Description: pulumi.String("test description"),
//				ActionPoints: appconfig.ExtensionActionPointArray{
//					&appconfig.ExtensionActionPointArgs{
//						Point: pulumi.String("ON_DEPLOYMENT_COMPLETE"),
//						Actions: appconfig.ExtensionActionPointActionArray{
//							&appconfig.ExtensionActionPointActionArgs{
//								Name:    pulumi.String("test"),
//								RoleArn: testRole.Arn,
//								Uri:     testTopic.Arn,
//							},
//						},
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Type": pulumi.String("AppConfig Extension"),
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
// Using `pulumi import`, import AppConfig Extensions using their extension ID. For example:
//
// ```sh
//
//	$ pulumi import aws:appconfig/extension:Extension example 71rxuzt
//
// ```
type Extension struct {
	pulumi.CustomResourceState

	// The action points defined in the extension. Detailed below.
	ActionPoints ExtensionActionPointArrayOutput `pulumi:"actionPoints"`
	// ARN of the AppConfig Extension.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Information about the extension.
	Description pulumi.StringOutput `pulumi:"description"`
	// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
	Parameters ExtensionParameterArrayOutput `pulumi:"parameters"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The version number for the extension.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewExtension registers a new resource with the given unique name, arguments, and options.
func NewExtension(ctx *pulumi.Context,
	name string, args *ExtensionArgs, opts ...pulumi.ResourceOption) (*Extension, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionPoints == nil {
		return nil, errors.New("invalid value for required argument 'ActionPoints'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Extension
	err := ctx.RegisterResource("aws:appconfig/extension:Extension", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExtension gets an existing Extension resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExtension(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExtensionState, opts ...pulumi.ResourceOption) (*Extension, error) {
	var resource Extension
	err := ctx.ReadResource("aws:appconfig/extension:Extension", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Extension resources.
type extensionState struct {
	// The action points defined in the extension. Detailed below.
	ActionPoints []ExtensionActionPoint `pulumi:"actionPoints"`
	// ARN of the AppConfig Extension.
	Arn *string `pulumi:"arn"`
	// Information about the extension.
	Description *string `pulumi:"description"`
	// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
	Name *string `pulumi:"name"`
	// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
	Parameters []ExtensionParameter `pulumi:"parameters"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The version number for the extension.
	Version *int `pulumi:"version"`
}

type ExtensionState struct {
	// The action points defined in the extension. Detailed below.
	ActionPoints ExtensionActionPointArrayInput
	// ARN of the AppConfig Extension.
	Arn pulumi.StringPtrInput
	// Information about the extension.
	Description pulumi.StringPtrInput
	// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
	Name pulumi.StringPtrInput
	// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
	Parameters ExtensionParameterArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The version number for the extension.
	Version pulumi.IntPtrInput
}

func (ExtensionState) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionState)(nil)).Elem()
}

type extensionArgs struct {
	// The action points defined in the extension. Detailed below.
	ActionPoints []ExtensionActionPoint `pulumi:"actionPoints"`
	// Information about the extension.
	Description *string `pulumi:"description"`
	// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
	Name *string `pulumi:"name"`
	// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
	Parameters []ExtensionParameter `pulumi:"parameters"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Extension resource.
type ExtensionArgs struct {
	// The action points defined in the extension. Detailed below.
	ActionPoints ExtensionActionPointArrayInput
	// Information about the extension.
	Description pulumi.StringPtrInput
	// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
	Name pulumi.StringPtrInput
	// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
	Parameters ExtensionParameterArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ExtensionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*extensionArgs)(nil)).Elem()
}

type ExtensionInput interface {
	pulumi.Input

	ToExtensionOutput() ExtensionOutput
	ToExtensionOutputWithContext(ctx context.Context) ExtensionOutput
}

func (*Extension) ElementType() reflect.Type {
	return reflect.TypeOf((**Extension)(nil)).Elem()
}

func (i *Extension) ToExtensionOutput() ExtensionOutput {
	return i.ToExtensionOutputWithContext(context.Background())
}

func (i *Extension) ToExtensionOutputWithContext(ctx context.Context) ExtensionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionOutput)
}

// ExtensionArrayInput is an input type that accepts ExtensionArray and ExtensionArrayOutput values.
// You can construct a concrete instance of `ExtensionArrayInput` via:
//
//	ExtensionArray{ ExtensionArgs{...} }
type ExtensionArrayInput interface {
	pulumi.Input

	ToExtensionArrayOutput() ExtensionArrayOutput
	ToExtensionArrayOutputWithContext(context.Context) ExtensionArrayOutput
}

type ExtensionArray []ExtensionInput

func (ExtensionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Extension)(nil)).Elem()
}

func (i ExtensionArray) ToExtensionArrayOutput() ExtensionArrayOutput {
	return i.ToExtensionArrayOutputWithContext(context.Background())
}

func (i ExtensionArray) ToExtensionArrayOutputWithContext(ctx context.Context) ExtensionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionArrayOutput)
}

// ExtensionMapInput is an input type that accepts ExtensionMap and ExtensionMapOutput values.
// You can construct a concrete instance of `ExtensionMapInput` via:
//
//	ExtensionMap{ "key": ExtensionArgs{...} }
type ExtensionMapInput interface {
	pulumi.Input

	ToExtensionMapOutput() ExtensionMapOutput
	ToExtensionMapOutputWithContext(context.Context) ExtensionMapOutput
}

type ExtensionMap map[string]ExtensionInput

func (ExtensionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Extension)(nil)).Elem()
}

func (i ExtensionMap) ToExtensionMapOutput() ExtensionMapOutput {
	return i.ToExtensionMapOutputWithContext(context.Background())
}

func (i ExtensionMap) ToExtensionMapOutputWithContext(ctx context.Context) ExtensionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExtensionMapOutput)
}

type ExtensionOutput struct{ *pulumi.OutputState }

func (ExtensionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Extension)(nil)).Elem()
}

func (o ExtensionOutput) ToExtensionOutput() ExtensionOutput {
	return o
}

func (o ExtensionOutput) ToExtensionOutputWithContext(ctx context.Context) ExtensionOutput {
	return o
}

// The action points defined in the extension. Detailed below.
func (o ExtensionOutput) ActionPoints() ExtensionActionPointArrayOutput {
	return o.ApplyT(func(v *Extension) ExtensionActionPointArrayOutput { return v.ActionPoints }).(ExtensionActionPointArrayOutput)
}

// ARN of the AppConfig Extension.
func (o ExtensionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Extension) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Information about the extension.
func (o ExtensionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Extension) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
func (o ExtensionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Extension) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
func (o ExtensionOutput) Parameters() ExtensionParameterArrayOutput {
	return o.ApplyT(func(v *Extension) ExtensionParameterArrayOutput { return v.Parameters }).(ExtensionParameterArrayOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ExtensionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Extension) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ExtensionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Extension) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The version number for the extension.
func (o ExtensionOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *Extension) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ExtensionArrayOutput struct{ *pulumi.OutputState }

func (ExtensionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Extension)(nil)).Elem()
}

func (o ExtensionArrayOutput) ToExtensionArrayOutput() ExtensionArrayOutput {
	return o
}

func (o ExtensionArrayOutput) ToExtensionArrayOutputWithContext(ctx context.Context) ExtensionArrayOutput {
	return o
}

func (o ExtensionArrayOutput) Index(i pulumi.IntInput) ExtensionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Extension {
		return vs[0].([]*Extension)[vs[1].(int)]
	}).(ExtensionOutput)
}

type ExtensionMapOutput struct{ *pulumi.OutputState }

func (ExtensionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Extension)(nil)).Elem()
}

func (o ExtensionMapOutput) ToExtensionMapOutput() ExtensionMapOutput {
	return o
}

func (o ExtensionMapOutput) ToExtensionMapOutputWithContext(ctx context.Context) ExtensionMapOutput {
	return o
}

func (o ExtensionMapOutput) MapIndex(k pulumi.StringInput) ExtensionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Extension {
		return vs[0].(map[string]*Extension)[vs[1].(string)]
	}).(ExtensionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionInput)(nil)).Elem(), &Extension{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionArrayInput)(nil)).Elem(), ExtensionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExtensionMapInput)(nil)).Elem(), ExtensionMap{})
	pulumi.RegisterOutputType(ExtensionOutput{})
	pulumi.RegisterOutputType(ExtensionArrayOutput{})
	pulumi.RegisterOutputType(ExtensionMapOutput{})
}
