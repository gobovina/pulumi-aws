// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitylake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Security Lake Custom Log Source.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/securitylake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitylake.NewCustomLogSource(ctx, "example", &securitylake.CustomLogSourceArgs{
//				SourceName:    pulumi.String("example-name"),
//				SourceVersion: pulumi.String("1.0"),
//				EventClasses: pulumi.StringArray{
//					pulumi.String("FILE_ACTIVITY"),
//				},
//				Configuration: &securitylake.CustomLogSourceConfigurationArgs{
//					CrawlerConfiguration: &securitylake.CustomLogSourceConfigurationCrawlerConfigurationArgs{
//						RoleArn: pulumi.Any(customLog.Arn),
//					},
//					ProviderIdentity: &securitylake.CustomLogSourceConfigurationProviderIdentityArgs{
//						ExternalId: pulumi.String("example-id"),
//						Principal:  pulumi.String("123456789012"),
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
// Using `pulumi import`, import Custom log sources using the source name. For example:
//
// ```sh
// $ pulumi import aws:securitylake/customLogSource:CustomLogSource example example-name
// ```
type CustomLogSource struct {
	pulumi.CustomResourceState

	// The attributes of a third-party custom source.
	Attributes CustomLogSourceAttributeArrayOutput `pulumi:"attributes"`
	// The configuration for the third-party custom source.
	Configuration CustomLogSourceConfigurationPtrOutput `pulumi:"configuration"`
	// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
	EventClasses pulumi.StringArrayOutput `pulumi:"eventClasses"`
	// The details of the log provider for a third-party custom source.
	ProviderDetails CustomLogSourceProviderDetailArrayOutput `pulumi:"providerDetails"`
	// Specify the name for a third-party custom source. This must be a Regionally unique value.
	SourceName pulumi.StringOutput `pulumi:"sourceName"`
	// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
	SourceVersion pulumi.StringOutput `pulumi:"sourceVersion"`
}

// NewCustomLogSource registers a new resource with the given unique name, arguments, and options.
func NewCustomLogSource(ctx *pulumi.Context,
	name string, args *CustomLogSourceArgs, opts ...pulumi.ResourceOption) (*CustomLogSource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SourceName == nil {
		return nil, errors.New("invalid value for required argument 'SourceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomLogSource
	err := ctx.RegisterResource("aws:securitylake/customLogSource:CustomLogSource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomLogSource gets an existing CustomLogSource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomLogSource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomLogSourceState, opts ...pulumi.ResourceOption) (*CustomLogSource, error) {
	var resource CustomLogSource
	err := ctx.ReadResource("aws:securitylake/customLogSource:CustomLogSource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomLogSource resources.
type customLogSourceState struct {
	// The attributes of a third-party custom source.
	Attributes []CustomLogSourceAttribute `pulumi:"attributes"`
	// The configuration for the third-party custom source.
	Configuration *CustomLogSourceConfiguration `pulumi:"configuration"`
	// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
	EventClasses []string `pulumi:"eventClasses"`
	// The details of the log provider for a third-party custom source.
	ProviderDetails []CustomLogSourceProviderDetail `pulumi:"providerDetails"`
	// Specify the name for a third-party custom source. This must be a Regionally unique value.
	SourceName *string `pulumi:"sourceName"`
	// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
	SourceVersion *string `pulumi:"sourceVersion"`
}

type CustomLogSourceState struct {
	// The attributes of a third-party custom source.
	Attributes CustomLogSourceAttributeArrayInput
	// The configuration for the third-party custom source.
	Configuration CustomLogSourceConfigurationPtrInput
	// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
	EventClasses pulumi.StringArrayInput
	// The details of the log provider for a third-party custom source.
	ProviderDetails CustomLogSourceProviderDetailArrayInput
	// Specify the name for a third-party custom source. This must be a Regionally unique value.
	SourceName pulumi.StringPtrInput
	// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
	SourceVersion pulumi.StringPtrInput
}

func (CustomLogSourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*customLogSourceState)(nil)).Elem()
}

type customLogSourceArgs struct {
	// The configuration for the third-party custom source.
	Configuration *CustomLogSourceConfiguration `pulumi:"configuration"`
	// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
	EventClasses []string `pulumi:"eventClasses"`
	// Specify the name for a third-party custom source. This must be a Regionally unique value.
	SourceName string `pulumi:"sourceName"`
	// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
	SourceVersion *string `pulumi:"sourceVersion"`
}

// The set of arguments for constructing a CustomLogSource resource.
type CustomLogSourceArgs struct {
	// The configuration for the third-party custom source.
	Configuration CustomLogSourceConfigurationPtrInput
	// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
	EventClasses pulumi.StringArrayInput
	// Specify the name for a third-party custom source. This must be a Regionally unique value.
	SourceName pulumi.StringInput
	// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
	SourceVersion pulumi.StringPtrInput
}

func (CustomLogSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customLogSourceArgs)(nil)).Elem()
}

type CustomLogSourceInput interface {
	pulumi.Input

	ToCustomLogSourceOutput() CustomLogSourceOutput
	ToCustomLogSourceOutputWithContext(ctx context.Context) CustomLogSourceOutput
}

func (*CustomLogSource) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomLogSource)(nil)).Elem()
}

func (i *CustomLogSource) ToCustomLogSourceOutput() CustomLogSourceOutput {
	return i.ToCustomLogSourceOutputWithContext(context.Background())
}

func (i *CustomLogSource) ToCustomLogSourceOutputWithContext(ctx context.Context) CustomLogSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomLogSourceOutput)
}

// CustomLogSourceArrayInput is an input type that accepts CustomLogSourceArray and CustomLogSourceArrayOutput values.
// You can construct a concrete instance of `CustomLogSourceArrayInput` via:
//
//	CustomLogSourceArray{ CustomLogSourceArgs{...} }
type CustomLogSourceArrayInput interface {
	pulumi.Input

	ToCustomLogSourceArrayOutput() CustomLogSourceArrayOutput
	ToCustomLogSourceArrayOutputWithContext(context.Context) CustomLogSourceArrayOutput
}

type CustomLogSourceArray []CustomLogSourceInput

func (CustomLogSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomLogSource)(nil)).Elem()
}

func (i CustomLogSourceArray) ToCustomLogSourceArrayOutput() CustomLogSourceArrayOutput {
	return i.ToCustomLogSourceArrayOutputWithContext(context.Background())
}

func (i CustomLogSourceArray) ToCustomLogSourceArrayOutputWithContext(ctx context.Context) CustomLogSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomLogSourceArrayOutput)
}

// CustomLogSourceMapInput is an input type that accepts CustomLogSourceMap and CustomLogSourceMapOutput values.
// You can construct a concrete instance of `CustomLogSourceMapInput` via:
//
//	CustomLogSourceMap{ "key": CustomLogSourceArgs{...} }
type CustomLogSourceMapInput interface {
	pulumi.Input

	ToCustomLogSourceMapOutput() CustomLogSourceMapOutput
	ToCustomLogSourceMapOutputWithContext(context.Context) CustomLogSourceMapOutput
}

type CustomLogSourceMap map[string]CustomLogSourceInput

func (CustomLogSourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomLogSource)(nil)).Elem()
}

func (i CustomLogSourceMap) ToCustomLogSourceMapOutput() CustomLogSourceMapOutput {
	return i.ToCustomLogSourceMapOutputWithContext(context.Background())
}

func (i CustomLogSourceMap) ToCustomLogSourceMapOutputWithContext(ctx context.Context) CustomLogSourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomLogSourceMapOutput)
}

type CustomLogSourceOutput struct{ *pulumi.OutputState }

func (CustomLogSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomLogSource)(nil)).Elem()
}

func (o CustomLogSourceOutput) ToCustomLogSourceOutput() CustomLogSourceOutput {
	return o
}

func (o CustomLogSourceOutput) ToCustomLogSourceOutputWithContext(ctx context.Context) CustomLogSourceOutput {
	return o
}

// The attributes of a third-party custom source.
func (o CustomLogSourceOutput) Attributes() CustomLogSourceAttributeArrayOutput {
	return o.ApplyT(func(v *CustomLogSource) CustomLogSourceAttributeArrayOutput { return v.Attributes }).(CustomLogSourceAttributeArrayOutput)
}

// The configuration for the third-party custom source.
func (o CustomLogSourceOutput) Configuration() CustomLogSourceConfigurationPtrOutput {
	return o.ApplyT(func(v *CustomLogSource) CustomLogSourceConfigurationPtrOutput { return v.Configuration }).(CustomLogSourceConfigurationPtrOutput)
}

// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
func (o CustomLogSourceOutput) EventClasses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomLogSource) pulumi.StringArrayOutput { return v.EventClasses }).(pulumi.StringArrayOutput)
}

// The details of the log provider for a third-party custom source.
func (o CustomLogSourceOutput) ProviderDetails() CustomLogSourceProviderDetailArrayOutput {
	return o.ApplyT(func(v *CustomLogSource) CustomLogSourceProviderDetailArrayOutput { return v.ProviderDetails }).(CustomLogSourceProviderDetailArrayOutput)
}

// Specify the name for a third-party custom source. This must be a Regionally unique value.
func (o CustomLogSourceOutput) SourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomLogSource) pulumi.StringOutput { return v.SourceName }).(pulumi.StringOutput)
}

// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
func (o CustomLogSourceOutput) SourceVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomLogSource) pulumi.StringOutput { return v.SourceVersion }).(pulumi.StringOutput)
}

type CustomLogSourceArrayOutput struct{ *pulumi.OutputState }

func (CustomLogSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomLogSource)(nil)).Elem()
}

func (o CustomLogSourceArrayOutput) ToCustomLogSourceArrayOutput() CustomLogSourceArrayOutput {
	return o
}

func (o CustomLogSourceArrayOutput) ToCustomLogSourceArrayOutputWithContext(ctx context.Context) CustomLogSourceArrayOutput {
	return o
}

func (o CustomLogSourceArrayOutput) Index(i pulumi.IntInput) CustomLogSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomLogSource {
		return vs[0].([]*CustomLogSource)[vs[1].(int)]
	}).(CustomLogSourceOutput)
}

type CustomLogSourceMapOutput struct{ *pulumi.OutputState }

func (CustomLogSourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomLogSource)(nil)).Elem()
}

func (o CustomLogSourceMapOutput) ToCustomLogSourceMapOutput() CustomLogSourceMapOutput {
	return o
}

func (o CustomLogSourceMapOutput) ToCustomLogSourceMapOutputWithContext(ctx context.Context) CustomLogSourceMapOutput {
	return o
}

func (o CustomLogSourceMapOutput) MapIndex(k pulumi.StringInput) CustomLogSourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomLogSource {
		return vs[0].(map[string]*CustomLogSource)[vs[1].(string)]
	}).(CustomLogSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomLogSourceInput)(nil)).Elem(), &CustomLogSource{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomLogSourceArrayInput)(nil)).Elem(), CustomLogSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomLogSourceMapInput)(nil)).Elem(), CustomLogSourceMap{})
	pulumi.RegisterOutputType(CustomLogSourceOutput{})
	pulumi.RegisterOutputType(CustomLogSourceArrayOutput{})
	pulumi.RegisterOutputType(CustomLogSourceMapOutput{})
}
