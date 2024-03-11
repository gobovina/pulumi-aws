// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mskconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon MSK Connect Custom Plugin Resource.
//
// ## Example Usage
//
// ### Basic configuration
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/mskconnect"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := s3.NewBucketV2(ctx, "example", &s3.BucketV2Args{
//				Bucket: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBucketObjectv2, err := s3.NewBucketObjectv2(ctx, "example", &s3.BucketObjectv2Args{
//				Bucket: example.ID(),
//				Key:    pulumi.String("debezium.zip"),
//				Source: pulumi.NewFileAsset("debezium.zip"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mskconnect.NewCustomPlugin(ctx, "example", &mskconnect.CustomPluginArgs{
//				Name:        pulumi.String("debezium-example"),
//				ContentType: pulumi.String("ZIP"),
//				Location: &mskconnect.CustomPluginLocationArgs{
//					S3: &mskconnect.CustomPluginLocationS3Args{
//						BucketArn: example.Arn,
//						FileKey:   exampleBucketObjectv2.Key,
//					},
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import MSK Connect Custom Plugin using the plugin's `arn`. For example:
//
// ```sh
// $ pulumi import aws:mskconnect/customPlugin:CustomPlugin example 'arn:aws:kafkaconnect:eu-central-1:123456789012:custom-plugin/debezium-example/abcdefgh-1234-5678-9abc-defghijklmno-4'
// ```
type CustomPlugin struct {
	pulumi.CustomResourceState

	// the Amazon Resource Name (ARN) of the custom plugin.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// A summary description of the custom plugin.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// an ID of the latest successfully created revision of the custom plugin.
	LatestRevision pulumi.IntOutput `pulumi:"latestRevision"`
	// Information about the location of a custom plugin. See below.
	//
	// The following arguments are optional:
	Location CustomPluginLocationOutput `pulumi:"location"`
	// The name of the custom plugin..
	Name pulumi.StringOutput `pulumi:"name"`
	// the state of the custom plugin.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewCustomPlugin registers a new resource with the given unique name, arguments, and options.
func NewCustomPlugin(ctx *pulumi.Context,
	name string, args *CustomPluginArgs, opts ...pulumi.ResourceOption) (*CustomPlugin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomPlugin
	err := ctx.RegisterResource("aws:mskconnect/customPlugin:CustomPlugin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomPlugin gets an existing CustomPlugin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomPlugin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomPluginState, opts ...pulumi.ResourceOption) (*CustomPlugin, error) {
	var resource CustomPlugin
	err := ctx.ReadResource("aws:mskconnect/customPlugin:CustomPlugin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomPlugin resources.
type customPluginState struct {
	// the Amazon Resource Name (ARN) of the custom plugin.
	Arn *string `pulumi:"arn"`
	// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
	ContentType *string `pulumi:"contentType"`
	// A summary description of the custom plugin.
	Description *string `pulumi:"description"`
	// an ID of the latest successfully created revision of the custom plugin.
	LatestRevision *int `pulumi:"latestRevision"`
	// Information about the location of a custom plugin. See below.
	//
	// The following arguments are optional:
	Location *CustomPluginLocation `pulumi:"location"`
	// The name of the custom plugin..
	Name *string `pulumi:"name"`
	// the state of the custom plugin.
	State *string `pulumi:"state"`
}

type CustomPluginState struct {
	// the Amazon Resource Name (ARN) of the custom plugin.
	Arn pulumi.StringPtrInput
	// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
	ContentType pulumi.StringPtrInput
	// A summary description of the custom plugin.
	Description pulumi.StringPtrInput
	// an ID of the latest successfully created revision of the custom plugin.
	LatestRevision pulumi.IntPtrInput
	// Information about the location of a custom plugin. See below.
	//
	// The following arguments are optional:
	Location CustomPluginLocationPtrInput
	// The name of the custom plugin..
	Name pulumi.StringPtrInput
	// the state of the custom plugin.
	State pulumi.StringPtrInput
}

func (CustomPluginState) ElementType() reflect.Type {
	return reflect.TypeOf((*customPluginState)(nil)).Elem()
}

type customPluginArgs struct {
	// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
	ContentType string `pulumi:"contentType"`
	// A summary description of the custom plugin.
	Description *string `pulumi:"description"`
	// Information about the location of a custom plugin. See below.
	//
	// The following arguments are optional:
	Location CustomPluginLocation `pulumi:"location"`
	// The name of the custom plugin..
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a CustomPlugin resource.
type CustomPluginArgs struct {
	// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
	ContentType pulumi.StringInput
	// A summary description of the custom plugin.
	Description pulumi.StringPtrInput
	// Information about the location of a custom plugin. See below.
	//
	// The following arguments are optional:
	Location CustomPluginLocationInput
	// The name of the custom plugin..
	Name pulumi.StringPtrInput
}

func (CustomPluginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customPluginArgs)(nil)).Elem()
}

type CustomPluginInput interface {
	pulumi.Input

	ToCustomPluginOutput() CustomPluginOutput
	ToCustomPluginOutputWithContext(ctx context.Context) CustomPluginOutput
}

func (*CustomPlugin) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomPlugin)(nil)).Elem()
}

func (i *CustomPlugin) ToCustomPluginOutput() CustomPluginOutput {
	return i.ToCustomPluginOutputWithContext(context.Background())
}

func (i *CustomPlugin) ToCustomPluginOutputWithContext(ctx context.Context) CustomPluginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomPluginOutput)
}

// CustomPluginArrayInput is an input type that accepts CustomPluginArray and CustomPluginArrayOutput values.
// You can construct a concrete instance of `CustomPluginArrayInput` via:
//
//	CustomPluginArray{ CustomPluginArgs{...} }
type CustomPluginArrayInput interface {
	pulumi.Input

	ToCustomPluginArrayOutput() CustomPluginArrayOutput
	ToCustomPluginArrayOutputWithContext(context.Context) CustomPluginArrayOutput
}

type CustomPluginArray []CustomPluginInput

func (CustomPluginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomPlugin)(nil)).Elem()
}

func (i CustomPluginArray) ToCustomPluginArrayOutput() CustomPluginArrayOutput {
	return i.ToCustomPluginArrayOutputWithContext(context.Background())
}

func (i CustomPluginArray) ToCustomPluginArrayOutputWithContext(ctx context.Context) CustomPluginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomPluginArrayOutput)
}

// CustomPluginMapInput is an input type that accepts CustomPluginMap and CustomPluginMapOutput values.
// You can construct a concrete instance of `CustomPluginMapInput` via:
//
//	CustomPluginMap{ "key": CustomPluginArgs{...} }
type CustomPluginMapInput interface {
	pulumi.Input

	ToCustomPluginMapOutput() CustomPluginMapOutput
	ToCustomPluginMapOutputWithContext(context.Context) CustomPluginMapOutput
}

type CustomPluginMap map[string]CustomPluginInput

func (CustomPluginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomPlugin)(nil)).Elem()
}

func (i CustomPluginMap) ToCustomPluginMapOutput() CustomPluginMapOutput {
	return i.ToCustomPluginMapOutputWithContext(context.Background())
}

func (i CustomPluginMap) ToCustomPluginMapOutputWithContext(ctx context.Context) CustomPluginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomPluginMapOutput)
}

type CustomPluginOutput struct{ *pulumi.OutputState }

func (CustomPluginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomPlugin)(nil)).Elem()
}

func (o CustomPluginOutput) ToCustomPluginOutput() CustomPluginOutput {
	return o
}

func (o CustomPluginOutput) ToCustomPluginOutputWithContext(ctx context.Context) CustomPluginOutput {
	return o
}

// the Amazon Resource Name (ARN) of the custom plugin.
func (o CustomPluginOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The type of the plugin file. Allowed values are `ZIP` and `JAR`.
func (o CustomPluginOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// A summary description of the custom plugin.
func (o CustomPluginOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// an ID of the latest successfully created revision of the custom plugin.
func (o CustomPluginOutput) LatestRevision() pulumi.IntOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.IntOutput { return v.LatestRevision }).(pulumi.IntOutput)
}

// Information about the location of a custom plugin. See below.
//
// The following arguments are optional:
func (o CustomPluginOutput) Location() CustomPluginLocationOutput {
	return o.ApplyT(func(v *CustomPlugin) CustomPluginLocationOutput { return v.Location }).(CustomPluginLocationOutput)
}

// The name of the custom plugin..
func (o CustomPluginOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// the state of the custom plugin.
func (o CustomPluginOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomPlugin) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type CustomPluginArrayOutput struct{ *pulumi.OutputState }

func (CustomPluginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomPlugin)(nil)).Elem()
}

func (o CustomPluginArrayOutput) ToCustomPluginArrayOutput() CustomPluginArrayOutput {
	return o
}

func (o CustomPluginArrayOutput) ToCustomPluginArrayOutputWithContext(ctx context.Context) CustomPluginArrayOutput {
	return o
}

func (o CustomPluginArrayOutput) Index(i pulumi.IntInput) CustomPluginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomPlugin {
		return vs[0].([]*CustomPlugin)[vs[1].(int)]
	}).(CustomPluginOutput)
}

type CustomPluginMapOutput struct{ *pulumi.OutputState }

func (CustomPluginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomPlugin)(nil)).Elem()
}

func (o CustomPluginMapOutput) ToCustomPluginMapOutput() CustomPluginMapOutput {
	return o
}

func (o CustomPluginMapOutput) ToCustomPluginMapOutputWithContext(ctx context.Context) CustomPluginMapOutput {
	return o
}

func (o CustomPluginMapOutput) MapIndex(k pulumi.StringInput) CustomPluginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomPlugin {
		return vs[0].(map[string]*CustomPlugin)[vs[1].(string)]
	}).(CustomPluginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomPluginInput)(nil)).Elem(), &CustomPlugin{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomPluginArrayInput)(nil)).Elem(), CustomPluginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomPluginMapInput)(nil)).Elem(), CustomPluginMap{})
	pulumi.RegisterOutputType(CustomPluginOutput{})
	pulumi.RegisterOutputType(CustomPluginArrayOutput{})
	pulumi.RegisterOutputType(CustomPluginMapOutput{})
}
