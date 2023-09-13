// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pinpoint

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Pinpoint App resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/pinpoint"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pinpoint.NewApp(ctx, "example", &pinpoint.AppArgs{
//				Limits: &pinpoint.AppLimitsArgs{
//					MaximumDuration: pulumi.Int(600),
//				},
//				QuietTime: &pinpoint.AppQuietTimeArgs{
//					End:   pulumi.String("06:00"),
//					Start: pulumi.String("00:00"),
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
// In TODO v1.5.0 and later, use an `import` block to import Pinpoint App using the `application-id`. For exampleterraform import {
//
//	to = aws_pinpoint_app.name
//
//	id = "application-id" } Using `TODO import`, import Pinpoint App using the `application-id`. For exampleconsole % TODO import aws_pinpoint_app.name application-id
type App struct {
	pulumi.CustomResourceState

	// The Application ID of the Pinpoint App.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// Amazon Resource Name (ARN) of the PinPoint Application
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
	CampaignHook AppCampaignHookPtrOutput `pulumi:"campaignHook"`
	// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
	Limits AppLimitsPtrOutput `pulumi:"limits"`
	// The application name. By default generated by TODO
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Pinpoint application. Conflicts with `name`
	NamePrefix pulumi.StringPtrOutput `pulumi:"namePrefix"`
	// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
	QuietTime AppQuietTimePtrOutput `pulumi:"quietTime"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewApp registers a new resource with the given unique name, arguments, and options.
func NewApp(ctx *pulumi.Context,
	name string, args *AppArgs, opts ...pulumi.ResourceOption) (*App, error) {
	if args == nil {
		args = &AppArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource App
	err := ctx.RegisterResource("aws:pinpoint/app:App", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApp gets an existing App resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppState, opts ...pulumi.ResourceOption) (*App, error) {
	var resource App
	err := ctx.ReadResource("aws:pinpoint/app:App", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering App resources.
type appState struct {
	// The Application ID of the Pinpoint App.
	ApplicationId *string `pulumi:"applicationId"`
	// Amazon Resource Name (ARN) of the PinPoint Application
	Arn *string `pulumi:"arn"`
	// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
	CampaignHook *AppCampaignHook `pulumi:"campaignHook"`
	// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
	Limits *AppLimits `pulumi:"limits"`
	// The application name. By default generated by TODO
	Name *string `pulumi:"name"`
	// The name of the Pinpoint application. Conflicts with `name`
	NamePrefix *string `pulumi:"namePrefix"`
	// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
	QuietTime *AppQuietTime `pulumi:"quietTime"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AppState struct {
	// The Application ID of the Pinpoint App.
	ApplicationId pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the PinPoint Application
	Arn pulumi.StringPtrInput
	// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
	CampaignHook AppCampaignHookPtrInput
	// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
	Limits AppLimitsPtrInput
	// The application name. By default generated by TODO
	Name pulumi.StringPtrInput
	// The name of the Pinpoint application. Conflicts with `name`
	NamePrefix pulumi.StringPtrInput
	// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
	QuietTime AppQuietTimePtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (AppState) ElementType() reflect.Type {
	return reflect.TypeOf((*appState)(nil)).Elem()
}

type appArgs struct {
	// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
	CampaignHook *AppCampaignHook `pulumi:"campaignHook"`
	// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
	Limits *AppLimits `pulumi:"limits"`
	// The application name. By default generated by TODO
	Name *string `pulumi:"name"`
	// The name of the Pinpoint application. Conflicts with `name`
	NamePrefix *string `pulumi:"namePrefix"`
	// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
	QuietTime *AppQuietTime `pulumi:"quietTime"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a App resource.
type AppArgs struct {
	// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
	CampaignHook AppCampaignHookPtrInput
	// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
	Limits AppLimitsPtrInput
	// The application name. By default generated by TODO
	Name pulumi.StringPtrInput
	// The name of the Pinpoint application. Conflicts with `name`
	NamePrefix pulumi.StringPtrInput
	// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
	QuietTime AppQuietTimePtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appArgs)(nil)).Elem()
}

type AppInput interface {
	pulumi.Input

	ToAppOutput() AppOutput
	ToAppOutputWithContext(ctx context.Context) AppOutput
}

func (*App) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil)).Elem()
}

func (i *App) ToAppOutput() AppOutput {
	return i.ToAppOutputWithContext(context.Background())
}

func (i *App) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppOutput)
}

func (i *App) ToOutput(ctx context.Context) pulumix.Output[*App] {
	return pulumix.Output[*App]{
		OutputState: i.ToAppOutputWithContext(ctx).OutputState,
	}
}

// AppArrayInput is an input type that accepts AppArray and AppArrayOutput values.
// You can construct a concrete instance of `AppArrayInput` via:
//
//	AppArray{ AppArgs{...} }
type AppArrayInput interface {
	pulumi.Input

	ToAppArrayOutput() AppArrayOutput
	ToAppArrayOutputWithContext(context.Context) AppArrayOutput
}

type AppArray []AppInput

func (AppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*App)(nil)).Elem()
}

func (i AppArray) ToAppArrayOutput() AppArrayOutput {
	return i.ToAppArrayOutputWithContext(context.Background())
}

func (i AppArray) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppArrayOutput)
}

func (i AppArray) ToOutput(ctx context.Context) pulumix.Output[[]*App] {
	return pulumix.Output[[]*App]{
		OutputState: i.ToAppArrayOutputWithContext(ctx).OutputState,
	}
}

// AppMapInput is an input type that accepts AppMap and AppMapOutput values.
// You can construct a concrete instance of `AppMapInput` via:
//
//	AppMap{ "key": AppArgs{...} }
type AppMapInput interface {
	pulumi.Input

	ToAppMapOutput() AppMapOutput
	ToAppMapOutputWithContext(context.Context) AppMapOutput
}

type AppMap map[string]AppInput

func (AppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*App)(nil)).Elem()
}

func (i AppMap) ToAppMapOutput() AppMapOutput {
	return i.ToAppMapOutputWithContext(context.Background())
}

func (i AppMap) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppMapOutput)
}

func (i AppMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*App] {
	return pulumix.Output[map[string]*App]{
		OutputState: i.ToAppMapOutputWithContext(ctx).OutputState,
	}
}

type AppOutput struct{ *pulumi.OutputState }

func (AppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil)).Elem()
}

func (o AppOutput) ToAppOutput() AppOutput {
	return o
}

func (o AppOutput) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return o
}

func (o AppOutput) ToOutput(ctx context.Context) pulumix.Output[*App] {
	return pulumix.Output[*App]{
		OutputState: o.OutputState,
	}
}

// The Application ID of the Pinpoint App.
func (o AppOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// Amazon Resource Name (ARN) of the PinPoint Application
func (o AppOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
func (o AppOutput) CampaignHook() AppCampaignHookPtrOutput {
	return o.ApplyT(func(v *App) AppCampaignHookPtrOutput { return v.CampaignHook }).(AppCampaignHookPtrOutput)
}

// The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
func (o AppOutput) Limits() AppLimitsPtrOutput {
	return o.ApplyT(func(v *App) AppLimitsPtrOutput { return v.Limits }).(AppLimitsPtrOutput)
}

// The application name. By default generated by TODO
func (o AppOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Pinpoint application. Conflicts with `name`
func (o AppOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *App) pulumi.StringPtrOutput { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

// The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
func (o AppOutput) QuietTime() AppQuietTimePtrOutput {
	return o.ApplyT(func(v *App) AppQuietTimePtrOutput { return v.QuietTime }).(AppQuietTimePtrOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AppOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *App) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o AppOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *App) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type AppArrayOutput struct{ *pulumi.OutputState }

func (AppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*App)(nil)).Elem()
}

func (o AppArrayOutput) ToAppArrayOutput() AppArrayOutput {
	return o
}

func (o AppArrayOutput) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return o
}

func (o AppArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*App] {
	return pulumix.Output[[]*App]{
		OutputState: o.OutputState,
	}
}

func (o AppArrayOutput) Index(i pulumi.IntInput) AppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *App {
		return vs[0].([]*App)[vs[1].(int)]
	}).(AppOutput)
}

type AppMapOutput struct{ *pulumi.OutputState }

func (AppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*App)(nil)).Elem()
}

func (o AppMapOutput) ToAppMapOutput() AppMapOutput {
	return o
}

func (o AppMapOutput) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return o
}

func (o AppMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*App] {
	return pulumix.Output[map[string]*App]{
		OutputState: o.OutputState,
	}
}

func (o AppMapOutput) MapIndex(k pulumi.StringInput) AppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *App {
		return vs[0].(map[string]*App)[vs[1].(string)]
	}).(AppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppInput)(nil)).Elem(), &App{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppArrayInput)(nil)).Elem(), AppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppMapInput)(nil)).Elem(), AppMap{})
	pulumi.RegisterOutputType(AppOutput{})
	pulumi.RegisterOutputType(AppArrayOutput{})
	pulumi.RegisterOutputType(AppMapOutput{})
}
