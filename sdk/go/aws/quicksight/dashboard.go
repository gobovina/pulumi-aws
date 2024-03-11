// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package quicksight

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing a QuickSight Dashboard.
//
// ## Example Usage
//
// ### From Source Template
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/quicksight"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := quicksight.NewDashboard(ctx, "example", &quicksight.DashboardArgs{
//				DashboardId:        pulumi.String("example-id"),
//				Name:               pulumi.String("example-name"),
//				VersionDescription: pulumi.String("version"),
//				SourceEntity: &quicksight.DashboardSourceEntityArgs{
//					SourceTemplate: &quicksight.DashboardSourceEntitySourceTemplateArgs{
//						Arn: pulumi.Any(source.Arn),
//						DataSetReferences: quicksight.DashboardSourceEntitySourceTemplateDataSetReferenceArray{
//							&quicksight.DashboardSourceEntitySourceTemplateDataSetReferenceArgs{
//								DataSetArn:         pulumi.Any(dataset.Arn),
//								DataSetPlaceholder: pulumi.String("1"),
//							},
//						},
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
// Using `pulumi import`, import a QuickSight Dashboard using the AWS account ID and dashboard ID separated by a comma (`,`). For example:
//
// ```sh
// $ pulumi import aws:quicksight/dashboard:Dashboard example 123456789012,example-id
// ```
type Dashboard struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the resource.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// AWS account ID.
	AwsAccountId pulumi.StringOutput `pulumi:"awsAccountId"`
	// The time that the dashboard was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Identifier for the dashboard.
	DashboardId pulumi.StringOutput `pulumi:"dashboardId"`
	// Options for publishing the dashboard. See dashboard_publish_options.
	DashboardPublishOptions DashboardDashboardPublishOptionsOutput `pulumi:"dashboardPublishOptions"`
	LastPublishedTime       pulumi.StringOutput                    `pulumi:"lastPublishedTime"`
	// The time that the dashboard was last updated.
	LastUpdatedTime pulumi.StringOutput `pulumi:"lastUpdatedTime"`
	// Display name for the dashboard.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
	Parameters DashboardParametersOutput `pulumi:"parameters"`
	// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
	Permissions DashboardPermissionArrayOutput `pulumi:"permissions"`
	// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
	SourceEntity DashboardSourceEntityPtrOutput `pulumi:"sourceEntity"`
	// Amazon Resource Name (ARN) of a template that was used to create this dashboard.
	SourceEntityArn pulumi.StringOutput `pulumi:"sourceEntityArn"`
	// The dashboard creation status.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
	ThemeArn pulumi.StringPtrOutput `pulumi:"themeArn"`
	// A description of the current dashboard version being created/updated.
	//
	// The following arguments are optional:
	VersionDescription pulumi.StringOutput `pulumi:"versionDescription"`
	// The version number of the dashboard version.
	VersionNumber pulumi.IntOutput `pulumi:"versionNumber"`
}

// NewDashboard registers a new resource with the given unique name, arguments, and options.
func NewDashboard(ctx *pulumi.Context,
	name string, args *DashboardArgs, opts ...pulumi.ResourceOption) (*Dashboard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DashboardId == nil {
		return nil, errors.New("invalid value for required argument 'DashboardId'")
	}
	if args.VersionDescription == nil {
		return nil, errors.New("invalid value for required argument 'VersionDescription'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Dashboard
	err := ctx.RegisterResource("aws:quicksight/dashboard:Dashboard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDashboard gets an existing Dashboard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDashboard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DashboardState, opts ...pulumi.ResourceOption) (*Dashboard, error) {
	var resource Dashboard
	err := ctx.ReadResource("aws:quicksight/dashboard:Dashboard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Dashboard resources.
type dashboardState struct {
	// The Amazon Resource Name (ARN) of the resource.
	Arn *string `pulumi:"arn"`
	// AWS account ID.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// The time that the dashboard was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Identifier for the dashboard.
	DashboardId *string `pulumi:"dashboardId"`
	// Options for publishing the dashboard. See dashboard_publish_options.
	DashboardPublishOptions *DashboardDashboardPublishOptions `pulumi:"dashboardPublishOptions"`
	LastPublishedTime       *string                           `pulumi:"lastPublishedTime"`
	// The time that the dashboard was last updated.
	LastUpdatedTime *string `pulumi:"lastUpdatedTime"`
	// Display name for the dashboard.
	Name *string `pulumi:"name"`
	// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
	Parameters *DashboardParameters `pulumi:"parameters"`
	// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
	Permissions []DashboardPermission `pulumi:"permissions"`
	// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
	SourceEntity *DashboardSourceEntity `pulumi:"sourceEntity"`
	// Amazon Resource Name (ARN) of a template that was used to create this dashboard.
	SourceEntityArn *string `pulumi:"sourceEntityArn"`
	// The dashboard creation status.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
	ThemeArn *string `pulumi:"themeArn"`
	// A description of the current dashboard version being created/updated.
	//
	// The following arguments are optional:
	VersionDescription *string `pulumi:"versionDescription"`
	// The version number of the dashboard version.
	VersionNumber *int `pulumi:"versionNumber"`
}

type DashboardState struct {
	// The Amazon Resource Name (ARN) of the resource.
	Arn pulumi.StringPtrInput
	// AWS account ID.
	AwsAccountId pulumi.StringPtrInput
	// The time that the dashboard was created.
	CreatedTime pulumi.StringPtrInput
	// Identifier for the dashboard.
	DashboardId pulumi.StringPtrInput
	// Options for publishing the dashboard. See dashboard_publish_options.
	DashboardPublishOptions DashboardDashboardPublishOptionsPtrInput
	LastPublishedTime       pulumi.StringPtrInput
	// The time that the dashboard was last updated.
	LastUpdatedTime pulumi.StringPtrInput
	// Display name for the dashboard.
	Name pulumi.StringPtrInput
	// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
	Parameters DashboardParametersPtrInput
	// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
	Permissions DashboardPermissionArrayInput
	// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
	SourceEntity DashboardSourceEntityPtrInput
	// Amazon Resource Name (ARN) of a template that was used to create this dashboard.
	SourceEntityArn pulumi.StringPtrInput
	// The dashboard creation status.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
	ThemeArn pulumi.StringPtrInput
	// A description of the current dashboard version being created/updated.
	//
	// The following arguments are optional:
	VersionDescription pulumi.StringPtrInput
	// The version number of the dashboard version.
	VersionNumber pulumi.IntPtrInput
}

func (DashboardState) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardState)(nil)).Elem()
}

type dashboardArgs struct {
	// AWS account ID.
	AwsAccountId *string `pulumi:"awsAccountId"`
	// Identifier for the dashboard.
	DashboardId string `pulumi:"dashboardId"`
	// Options for publishing the dashboard. See dashboard_publish_options.
	DashboardPublishOptions *DashboardDashboardPublishOptions `pulumi:"dashboardPublishOptions"`
	// Display name for the dashboard.
	Name *string `pulumi:"name"`
	// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
	Parameters *DashboardParameters `pulumi:"parameters"`
	// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
	Permissions []DashboardPermission `pulumi:"permissions"`
	// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
	SourceEntity *DashboardSourceEntity `pulumi:"sourceEntity"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
	ThemeArn *string `pulumi:"themeArn"`
	// A description of the current dashboard version being created/updated.
	//
	// The following arguments are optional:
	VersionDescription string `pulumi:"versionDescription"`
}

// The set of arguments for constructing a Dashboard resource.
type DashboardArgs struct {
	// AWS account ID.
	AwsAccountId pulumi.StringPtrInput
	// Identifier for the dashboard.
	DashboardId pulumi.StringInput
	// Options for publishing the dashboard. See dashboard_publish_options.
	DashboardPublishOptions DashboardDashboardPublishOptionsPtrInput
	// Display name for the dashboard.
	Name pulumi.StringPtrInput
	// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
	Parameters DashboardParametersPtrInput
	// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
	Permissions DashboardPermissionArrayInput
	// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
	SourceEntity DashboardSourceEntityPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
	ThemeArn pulumi.StringPtrInput
	// A description of the current dashboard version being created/updated.
	//
	// The following arguments are optional:
	VersionDescription pulumi.StringInput
}

func (DashboardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dashboardArgs)(nil)).Elem()
}

type DashboardInput interface {
	pulumi.Input

	ToDashboardOutput() DashboardOutput
	ToDashboardOutputWithContext(ctx context.Context) DashboardOutput
}

func (*Dashboard) ElementType() reflect.Type {
	return reflect.TypeOf((**Dashboard)(nil)).Elem()
}

func (i *Dashboard) ToDashboardOutput() DashboardOutput {
	return i.ToDashboardOutputWithContext(context.Background())
}

func (i *Dashboard) ToDashboardOutputWithContext(ctx context.Context) DashboardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardOutput)
}

// DashboardArrayInput is an input type that accepts DashboardArray and DashboardArrayOutput values.
// You can construct a concrete instance of `DashboardArrayInput` via:
//
//	DashboardArray{ DashboardArgs{...} }
type DashboardArrayInput interface {
	pulumi.Input

	ToDashboardArrayOutput() DashboardArrayOutput
	ToDashboardArrayOutputWithContext(context.Context) DashboardArrayOutput
}

type DashboardArray []DashboardInput

func (DashboardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Dashboard)(nil)).Elem()
}

func (i DashboardArray) ToDashboardArrayOutput() DashboardArrayOutput {
	return i.ToDashboardArrayOutputWithContext(context.Background())
}

func (i DashboardArray) ToDashboardArrayOutputWithContext(ctx context.Context) DashboardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardArrayOutput)
}

// DashboardMapInput is an input type that accepts DashboardMap and DashboardMapOutput values.
// You can construct a concrete instance of `DashboardMapInput` via:
//
//	DashboardMap{ "key": DashboardArgs{...} }
type DashboardMapInput interface {
	pulumi.Input

	ToDashboardMapOutput() DashboardMapOutput
	ToDashboardMapOutputWithContext(context.Context) DashboardMapOutput
}

type DashboardMap map[string]DashboardInput

func (DashboardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Dashboard)(nil)).Elem()
}

func (i DashboardMap) ToDashboardMapOutput() DashboardMapOutput {
	return i.ToDashboardMapOutputWithContext(context.Background())
}

func (i DashboardMap) ToDashboardMapOutputWithContext(ctx context.Context) DashboardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DashboardMapOutput)
}

type DashboardOutput struct{ *pulumi.OutputState }

func (DashboardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Dashboard)(nil)).Elem()
}

func (o DashboardOutput) ToDashboardOutput() DashboardOutput {
	return o
}

func (o DashboardOutput) ToDashboardOutputWithContext(ctx context.Context) DashboardOutput {
	return o
}

// The Amazon Resource Name (ARN) of the resource.
func (o DashboardOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// AWS account ID.
func (o DashboardOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.AwsAccountId }).(pulumi.StringOutput)
}

// The time that the dashboard was created.
func (o DashboardOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Identifier for the dashboard.
func (o DashboardOutput) DashboardId() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.DashboardId }).(pulumi.StringOutput)
}

// Options for publishing the dashboard. See dashboard_publish_options.
func (o DashboardOutput) DashboardPublishOptions() DashboardDashboardPublishOptionsOutput {
	return o.ApplyT(func(v *Dashboard) DashboardDashboardPublishOptionsOutput { return v.DashboardPublishOptions }).(DashboardDashboardPublishOptionsOutput)
}

func (o DashboardOutput) LastPublishedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.LastPublishedTime }).(pulumi.StringOutput)
}

// The time that the dashboard was last updated.
func (o DashboardOutput) LastUpdatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.LastUpdatedTime }).(pulumi.StringOutput)
}

// Display name for the dashboard.
func (o DashboardOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
func (o DashboardOutput) Parameters() DashboardParametersOutput {
	return o.ApplyT(func(v *Dashboard) DashboardParametersOutput { return v.Parameters }).(DashboardParametersOutput)
}

// A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
func (o DashboardOutput) Permissions() DashboardPermissionArrayOutput {
	return o.ApplyT(func(v *Dashboard) DashboardPermissionArrayOutput { return v.Permissions }).(DashboardPermissionArrayOutput)
}

// The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
func (o DashboardOutput) SourceEntity() DashboardSourceEntityPtrOutput {
	return o.ApplyT(func(v *Dashboard) DashboardSourceEntityPtrOutput { return v.SourceEntity }).(DashboardSourceEntityPtrOutput)
}

// Amazon Resource Name (ARN) of a template that was used to create this dashboard.
func (o DashboardOutput) SourceEntityArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.SourceEntityArn }).(pulumi.StringOutput)
}

// The dashboard creation status.
func (o DashboardOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DashboardOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DashboardOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
func (o DashboardOutput) ThemeArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringPtrOutput { return v.ThemeArn }).(pulumi.StringPtrOutput)
}

// A description of the current dashboard version being created/updated.
//
// The following arguments are optional:
func (o DashboardOutput) VersionDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.StringOutput { return v.VersionDescription }).(pulumi.StringOutput)
}

// The version number of the dashboard version.
func (o DashboardOutput) VersionNumber() pulumi.IntOutput {
	return o.ApplyT(func(v *Dashboard) pulumi.IntOutput { return v.VersionNumber }).(pulumi.IntOutput)
}

type DashboardArrayOutput struct{ *pulumi.OutputState }

func (DashboardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Dashboard)(nil)).Elem()
}

func (o DashboardArrayOutput) ToDashboardArrayOutput() DashboardArrayOutput {
	return o
}

func (o DashboardArrayOutput) ToDashboardArrayOutputWithContext(ctx context.Context) DashboardArrayOutput {
	return o
}

func (o DashboardArrayOutput) Index(i pulumi.IntInput) DashboardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Dashboard {
		return vs[0].([]*Dashboard)[vs[1].(int)]
	}).(DashboardOutput)
}

type DashboardMapOutput struct{ *pulumi.OutputState }

func (DashboardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Dashboard)(nil)).Elem()
}

func (o DashboardMapOutput) ToDashboardMapOutput() DashboardMapOutput {
	return o
}

func (o DashboardMapOutput) ToDashboardMapOutputWithContext(ctx context.Context) DashboardMapOutput {
	return o
}

func (o DashboardMapOutput) MapIndex(k pulumi.StringInput) DashboardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Dashboard {
		return vs[0].(map[string]*Dashboard)[vs[1].(string)]
	}).(DashboardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardInput)(nil)).Elem(), &Dashboard{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardArrayInput)(nil)).Elem(), DashboardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DashboardMapInput)(nil)).Elem(), DashboardMap{})
	pulumi.RegisterOutputType(DashboardOutput{})
	pulumi.RegisterOutputType(DashboardArrayOutput{})
	pulumi.RegisterOutputType(DashboardMapOutput{})
}
