// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apprunner

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an App Runner Observability Configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apprunner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apprunner.NewObservabilityConfiguration(ctx, "example", &apprunner.ObservabilityConfigurationArgs{
//				ObservabilityConfigurationName: pulumi.String("example"),
//				TraceConfiguration: &apprunner.ObservabilityConfigurationTraceConfigurationArgs{
//					Vendor: pulumi.String("AWSXRAY"),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-apprunner-observability-configuration"),
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
// Using `pulumi import`, import App Runner Observability Configuration using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:apprunner/observabilityConfiguration:ObservabilityConfiguration example arn:aws:apprunner:us-east-1:1234567890:observabilityconfiguration/example/1/d75bc7ea55b71e724fe5c23452fe22a1
//
// ```
type ObservabilityConfiguration struct {
	pulumi.CustomResourceState

	// ARN of this observability configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
	Latest pulumi.BoolOutput `pulumi:"latest"`
	// Name of the observability configuration.
	ObservabilityConfigurationName pulumi.StringOutput `pulumi:"observabilityConfigurationName"`
	// The revision of this observability configuration.
	ObservabilityConfigurationRevision pulumi.IntOutput `pulumi:"observabilityConfigurationRevision"`
	// Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
	TraceConfiguration ObservabilityConfigurationTraceConfigurationPtrOutput `pulumi:"traceConfiguration"`
}

// NewObservabilityConfiguration registers a new resource with the given unique name, arguments, and options.
func NewObservabilityConfiguration(ctx *pulumi.Context,
	name string, args *ObservabilityConfigurationArgs, opts ...pulumi.ResourceOption) (*ObservabilityConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ObservabilityConfigurationName == nil {
		return nil, errors.New("invalid value for required argument 'ObservabilityConfigurationName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ObservabilityConfiguration
	err := ctx.RegisterResource("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObservabilityConfiguration gets an existing ObservabilityConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObservabilityConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObservabilityConfigurationState, opts ...pulumi.ResourceOption) (*ObservabilityConfiguration, error) {
	var resource ObservabilityConfiguration
	err := ctx.ReadResource("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObservabilityConfiguration resources.
type observabilityConfigurationState struct {
	// ARN of this observability configuration.
	Arn *string `pulumi:"arn"`
	// Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
	Latest *bool `pulumi:"latest"`
	// Name of the observability configuration.
	ObservabilityConfigurationName *string `pulumi:"observabilityConfigurationName"`
	// The revision of this observability configuration.
	ObservabilityConfigurationRevision *int `pulumi:"observabilityConfigurationRevision"`
	// Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
	TraceConfiguration *ObservabilityConfigurationTraceConfiguration `pulumi:"traceConfiguration"`
}

type ObservabilityConfigurationState struct {
	// ARN of this observability configuration.
	Arn pulumi.StringPtrInput
	// Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
	Latest pulumi.BoolPtrInput
	// Name of the observability configuration.
	ObservabilityConfigurationName pulumi.StringPtrInput
	// The revision of this observability configuration.
	ObservabilityConfigurationRevision pulumi.IntPtrInput
	// Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
	TraceConfiguration ObservabilityConfigurationTraceConfigurationPtrInput
}

func (ObservabilityConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*observabilityConfigurationState)(nil)).Elem()
}

type observabilityConfigurationArgs struct {
	// Name of the observability configuration.
	ObservabilityConfigurationName string `pulumi:"observabilityConfigurationName"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
	TraceConfiguration *ObservabilityConfigurationTraceConfiguration `pulumi:"traceConfiguration"`
}

// The set of arguments for constructing a ObservabilityConfiguration resource.
type ObservabilityConfigurationArgs struct {
	// Name of the observability configuration.
	ObservabilityConfigurationName pulumi.StringInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
	TraceConfiguration ObservabilityConfigurationTraceConfigurationPtrInput
}

func (ObservabilityConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*observabilityConfigurationArgs)(nil)).Elem()
}

type ObservabilityConfigurationInput interface {
	pulumi.Input

	ToObservabilityConfigurationOutput() ObservabilityConfigurationOutput
	ToObservabilityConfigurationOutputWithContext(ctx context.Context) ObservabilityConfigurationOutput
}

func (*ObservabilityConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**ObservabilityConfiguration)(nil)).Elem()
}

func (i *ObservabilityConfiguration) ToObservabilityConfigurationOutput() ObservabilityConfigurationOutput {
	return i.ToObservabilityConfigurationOutputWithContext(context.Background())
}

func (i *ObservabilityConfiguration) ToObservabilityConfigurationOutputWithContext(ctx context.Context) ObservabilityConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObservabilityConfigurationOutput)
}

// ObservabilityConfigurationArrayInput is an input type that accepts ObservabilityConfigurationArray and ObservabilityConfigurationArrayOutput values.
// You can construct a concrete instance of `ObservabilityConfigurationArrayInput` via:
//
//	ObservabilityConfigurationArray{ ObservabilityConfigurationArgs{...} }
type ObservabilityConfigurationArrayInput interface {
	pulumi.Input

	ToObservabilityConfigurationArrayOutput() ObservabilityConfigurationArrayOutput
	ToObservabilityConfigurationArrayOutputWithContext(context.Context) ObservabilityConfigurationArrayOutput
}

type ObservabilityConfigurationArray []ObservabilityConfigurationInput

func (ObservabilityConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObservabilityConfiguration)(nil)).Elem()
}

func (i ObservabilityConfigurationArray) ToObservabilityConfigurationArrayOutput() ObservabilityConfigurationArrayOutput {
	return i.ToObservabilityConfigurationArrayOutputWithContext(context.Background())
}

func (i ObservabilityConfigurationArray) ToObservabilityConfigurationArrayOutputWithContext(ctx context.Context) ObservabilityConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObservabilityConfigurationArrayOutput)
}

// ObservabilityConfigurationMapInput is an input type that accepts ObservabilityConfigurationMap and ObservabilityConfigurationMapOutput values.
// You can construct a concrete instance of `ObservabilityConfigurationMapInput` via:
//
//	ObservabilityConfigurationMap{ "key": ObservabilityConfigurationArgs{...} }
type ObservabilityConfigurationMapInput interface {
	pulumi.Input

	ToObservabilityConfigurationMapOutput() ObservabilityConfigurationMapOutput
	ToObservabilityConfigurationMapOutputWithContext(context.Context) ObservabilityConfigurationMapOutput
}

type ObservabilityConfigurationMap map[string]ObservabilityConfigurationInput

func (ObservabilityConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObservabilityConfiguration)(nil)).Elem()
}

func (i ObservabilityConfigurationMap) ToObservabilityConfigurationMapOutput() ObservabilityConfigurationMapOutput {
	return i.ToObservabilityConfigurationMapOutputWithContext(context.Background())
}

func (i ObservabilityConfigurationMap) ToObservabilityConfigurationMapOutputWithContext(ctx context.Context) ObservabilityConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObservabilityConfigurationMapOutput)
}

type ObservabilityConfigurationOutput struct{ *pulumi.OutputState }

func (ObservabilityConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObservabilityConfiguration)(nil)).Elem()
}

func (o ObservabilityConfigurationOutput) ToObservabilityConfigurationOutput() ObservabilityConfigurationOutput {
	return o
}

func (o ObservabilityConfigurationOutput) ToObservabilityConfigurationOutputWithContext(ctx context.Context) ObservabilityConfigurationOutput {
	return o
}

// ARN of this observability configuration.
func (o ObservabilityConfigurationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
func (o ObservabilityConfigurationOutput) Latest() pulumi.BoolOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.BoolOutput { return v.Latest }).(pulumi.BoolOutput)
}

// Name of the observability configuration.
func (o ObservabilityConfigurationOutput) ObservabilityConfigurationName() pulumi.StringOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.StringOutput { return v.ObservabilityConfigurationName }).(pulumi.StringOutput)
}

// The revision of this observability configuration.
func (o ObservabilityConfigurationOutput) ObservabilityConfigurationRevision() pulumi.IntOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.IntOutput { return v.ObservabilityConfigurationRevision }).(pulumi.IntOutput)
}

// Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
func (o ObservabilityConfigurationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ObservabilityConfigurationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ObservabilityConfigurationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
func (o ObservabilityConfigurationOutput) TraceConfiguration() ObservabilityConfigurationTraceConfigurationPtrOutput {
	return o.ApplyT(func(v *ObservabilityConfiguration) ObservabilityConfigurationTraceConfigurationPtrOutput {
		return v.TraceConfiguration
	}).(ObservabilityConfigurationTraceConfigurationPtrOutput)
}

type ObservabilityConfigurationArrayOutput struct{ *pulumi.OutputState }

func (ObservabilityConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObservabilityConfiguration)(nil)).Elem()
}

func (o ObservabilityConfigurationArrayOutput) ToObservabilityConfigurationArrayOutput() ObservabilityConfigurationArrayOutput {
	return o
}

func (o ObservabilityConfigurationArrayOutput) ToObservabilityConfigurationArrayOutputWithContext(ctx context.Context) ObservabilityConfigurationArrayOutput {
	return o
}

func (o ObservabilityConfigurationArrayOutput) Index(i pulumi.IntInput) ObservabilityConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObservabilityConfiguration {
		return vs[0].([]*ObservabilityConfiguration)[vs[1].(int)]
	}).(ObservabilityConfigurationOutput)
}

type ObservabilityConfigurationMapOutput struct{ *pulumi.OutputState }

func (ObservabilityConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObservabilityConfiguration)(nil)).Elem()
}

func (o ObservabilityConfigurationMapOutput) ToObservabilityConfigurationMapOutput() ObservabilityConfigurationMapOutput {
	return o
}

func (o ObservabilityConfigurationMapOutput) ToObservabilityConfigurationMapOutputWithContext(ctx context.Context) ObservabilityConfigurationMapOutput {
	return o
}

func (o ObservabilityConfigurationMapOutput) MapIndex(k pulumi.StringInput) ObservabilityConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObservabilityConfiguration {
		return vs[0].(map[string]*ObservabilityConfiguration)[vs[1].(string)]
	}).(ObservabilityConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObservabilityConfigurationInput)(nil)).Elem(), &ObservabilityConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObservabilityConfigurationArrayInput)(nil)).Elem(), ObservabilityConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObservabilityConfigurationMapInput)(nil)).Elem(), ObservabilityConfigurationMap{})
	pulumi.RegisterOutputType(ObservabilityConfigurationOutput{})
	pulumi.RegisterOutputType(ObservabilityConfigurationArrayOutput{})
	pulumi.RegisterOutputType(ObservabilityConfigurationMapOutput{})
}
