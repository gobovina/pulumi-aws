// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package evidently

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CloudWatch Evidently Project resource.
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/evidently"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := evidently.NewProject(ctx, "example", &evidently.ProjectArgs{
//				Description: pulumi.String("Example Description"),
//				Tags: pulumi.StringMap{
//					"Key1": pulumi.String("example Project"),
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
// ### Store evaluation events in a CloudWatch Log Group
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/evidently"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := evidently.NewProject(ctx, "example", &evidently.ProjectArgs{
//				DataDelivery: &evidently.ProjectDataDeliveryArgs{
//					CloudwatchLogs: &evidently.ProjectDataDeliveryCloudwatchLogsArgs{
//						LogGroup: pulumi.String("example-log-group-name"),
//					},
//				},
//				Description: pulumi.String("Example Description"),
//				Tags: pulumi.StringMap{
//					"Key1": pulumi.String("example Project"),
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
// ### Store evaluation events in an S3 bucket
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/evidently"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := evidently.NewProject(ctx, "example", &evidently.ProjectArgs{
//				DataDelivery: &evidently.ProjectDataDeliveryArgs{
//					S3Destination: &evidently.ProjectDataDeliveryS3DestinationArgs{
//						Bucket: pulumi.String("example-bucket-name"),
//						Prefix: pulumi.String("example"),
//					},
//				},
//				Description: pulumi.String("Example Description"),
//				Tags: pulumi.StringMap{
//					"Key1": pulumi.String("example Project"),
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
// Using `pulumi import`, import CloudWatch Evidently Project using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:evidently/project:Project example arn:aws:evidently:us-east-1:123456789012:segment/example
//
// ```
type Project struct {
	pulumi.CustomResourceState

	// The number of ongoing experiments currently in the project.
	ActiveExperimentCount pulumi.IntOutput `pulumi:"activeExperimentCount"`
	// The number of ongoing launches currently in the project.
	ActiveLaunchCount pulumi.IntOutput `pulumi:"activeLaunchCount"`
	// The ARN of the project.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The date and time that the project is created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
	DataDelivery ProjectDataDeliveryPtrOutput `pulumi:"dataDelivery"`
	// Specifies the description of the project.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
	ExperimentCount pulumi.IntOutput `pulumi:"experimentCount"`
	// The number of features currently in the project.
	FeatureCount pulumi.IntOutput `pulumi:"featureCount"`
	// The date and time that the project was most recently updated.
	LastUpdatedTime pulumi.StringOutput `pulumi:"lastUpdatedTime"`
	// The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
	LaunchCount pulumi.IntOutput `pulumi:"launchCount"`
	// A name for the project.
	Name pulumi.StringOutput `pulumi:"name"`
	// The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
	Status pulumi.StringOutput `pulumi:"status"`
	// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		args = &ProjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("aws:evidently/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("aws:evidently/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// The number of ongoing experiments currently in the project.
	ActiveExperimentCount *int `pulumi:"activeExperimentCount"`
	// The number of ongoing launches currently in the project.
	ActiveLaunchCount *int `pulumi:"activeLaunchCount"`
	// The ARN of the project.
	Arn *string `pulumi:"arn"`
	// The date and time that the project is created.
	CreatedTime *string `pulumi:"createdTime"`
	// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
	DataDelivery *ProjectDataDelivery `pulumi:"dataDelivery"`
	// Specifies the description of the project.
	Description *string `pulumi:"description"`
	// The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
	ExperimentCount *int `pulumi:"experimentCount"`
	// The number of features currently in the project.
	FeatureCount *int `pulumi:"featureCount"`
	// The date and time that the project was most recently updated.
	LastUpdatedTime *string `pulumi:"lastUpdatedTime"`
	// The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
	LaunchCount *int `pulumi:"launchCount"`
	// A name for the project.
	Name *string `pulumi:"name"`
	// The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
	Status *string `pulumi:"status"`
	// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ProjectState struct {
	// The number of ongoing experiments currently in the project.
	ActiveExperimentCount pulumi.IntPtrInput
	// The number of ongoing launches currently in the project.
	ActiveLaunchCount pulumi.IntPtrInput
	// The ARN of the project.
	Arn pulumi.StringPtrInput
	// The date and time that the project is created.
	CreatedTime pulumi.StringPtrInput
	// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
	DataDelivery ProjectDataDeliveryPtrInput
	// Specifies the description of the project.
	Description pulumi.StringPtrInput
	// The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
	ExperimentCount pulumi.IntPtrInput
	// The number of features currently in the project.
	FeatureCount pulumi.IntPtrInput
	// The date and time that the project was most recently updated.
	LastUpdatedTime pulumi.StringPtrInput
	// The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
	LaunchCount pulumi.IntPtrInput
	// A name for the project.
	Name pulumi.StringPtrInput
	// The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
	Status pulumi.StringPtrInput
	// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
	DataDelivery *ProjectDataDelivery `pulumi:"dataDelivery"`
	// Specifies the description of the project.
	Description *string `pulumi:"description"`
	// A name for the project.
	Name *string `pulumi:"name"`
	// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
	DataDelivery ProjectDataDeliveryPtrInput
	// Specifies the description of the project.
	Description pulumi.StringPtrInput
	// A name for the project.
	Name pulumi.StringPtrInput
	// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// The number of ongoing experiments currently in the project.
func (o ProjectOutput) ActiveExperimentCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.ActiveExperimentCount }).(pulumi.IntOutput)
}

// The number of ongoing launches currently in the project.
func (o ProjectOutput) ActiveLaunchCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.ActiveLaunchCount }).(pulumi.IntOutput)
}

// The ARN of the project.
func (o ProjectOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The date and time that the project is created.
func (o ProjectOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// A block that contains information about where Evidently is to store evaluation events for longer term storage, if you choose to do so. If you choose not to store these events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. See below.
func (o ProjectOutput) DataDelivery() ProjectDataDeliveryPtrOutput {
	return o.ApplyT(func(v *Project) ProjectDataDeliveryPtrOutput { return v.DataDelivery }).(ProjectDataDeliveryPtrOutput)
}

// Specifies the description of the project.
func (o ProjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The number of experiments currently in the project. This includes all experiments that have been created and not deleted, whether they are ongoing or not.
func (o ProjectOutput) ExperimentCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.ExperimentCount }).(pulumi.IntOutput)
}

// The number of features currently in the project.
func (o ProjectOutput) FeatureCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.FeatureCount }).(pulumi.IntOutput)
}

// The date and time that the project was most recently updated.
func (o ProjectOutput) LastUpdatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.LastUpdatedTime }).(pulumi.StringOutput)
}

// The number of launches currently in the project. This includes all launches that have been created and not deleted, whether they are ongoing or not.
func (o ProjectOutput) LaunchCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.LaunchCount }).(pulumi.IntOutput)
}

// A name for the project.
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The current state of the project. Valid values are `AVAILABLE` and `UPDATING`.
func (o ProjectOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Tags to apply to the project. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ProjectOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Project) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ProjectOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Project) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
