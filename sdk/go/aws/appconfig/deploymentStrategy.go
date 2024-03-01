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

// Provides an AppConfig Deployment Strategy resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appconfig"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := appconfig.NewDeploymentStrategy(ctx, "example", &appconfig.DeploymentStrategyArgs{
//				Name:                        pulumi.String("example-deployment-strategy-tf"),
//				Description:                 pulumi.String("Example Deployment Strategy"),
//				DeploymentDurationInMinutes: pulumi.Int(3),
//				FinalBakeTimeInMinutes:      pulumi.Int(4),
//				GrowthFactor:                pulumi.Float64(10),
//				GrowthType:                  pulumi.String("LINEAR"),
//				ReplicateTo:                 pulumi.String("NONE"),
//				Tags: pulumi.StringMap{
//					"Type": pulumi.String("AppConfig Deployment Strategy"),
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
// Using `pulumi import`, import AppConfig Deployment Strategies using their deployment strategy ID. For example:
//
// ```sh
//
//	$ pulumi import aws:appconfig/deploymentStrategy:DeploymentStrategy example 11xxxxx
//
// ```
type DeploymentStrategy struct {
	pulumi.CustomResourceState

	// ARN of the AppConfig Deployment Strategy.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
	DeploymentDurationInMinutes pulumi.IntOutput `pulumi:"deploymentDurationInMinutes"`
	// Description of the deployment strategy. Can be at most 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
	FinalBakeTimeInMinutes pulumi.IntPtrOutput `pulumi:"finalBakeTimeInMinutes"`
	// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
	GrowthFactor pulumi.Float64Output `pulumi:"growthFactor"`
	// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
	GrowthType pulumi.StringPtrOutput `pulumi:"growthType"`
	// Name for the deployment strategy. Must be between 1 and 64 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
	ReplicateTo pulumi.StringOutput `pulumi:"replicateTo"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewDeploymentStrategy registers a new resource with the given unique name, arguments, and options.
func NewDeploymentStrategy(ctx *pulumi.Context,
	name string, args *DeploymentStrategyArgs, opts ...pulumi.ResourceOption) (*DeploymentStrategy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentDurationInMinutes == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentDurationInMinutes'")
	}
	if args.GrowthFactor == nil {
		return nil, errors.New("invalid value for required argument 'GrowthFactor'")
	}
	if args.ReplicateTo == nil {
		return nil, errors.New("invalid value for required argument 'ReplicateTo'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeploymentStrategy
	err := ctx.RegisterResource("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentStrategy gets an existing DeploymentStrategy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentStrategy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentStrategyState, opts ...pulumi.ResourceOption) (*DeploymentStrategy, error) {
	var resource DeploymentStrategy
	err := ctx.ReadResource("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentStrategy resources.
type deploymentStrategyState struct {
	// ARN of the AppConfig Deployment Strategy.
	Arn *string `pulumi:"arn"`
	// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
	DeploymentDurationInMinutes *int `pulumi:"deploymentDurationInMinutes"`
	// Description of the deployment strategy. Can be at most 1024 characters.
	Description *string `pulumi:"description"`
	// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
	FinalBakeTimeInMinutes *int `pulumi:"finalBakeTimeInMinutes"`
	// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
	GrowthFactor *float64 `pulumi:"growthFactor"`
	// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
	GrowthType *string `pulumi:"growthType"`
	// Name for the deployment strategy. Must be between 1 and 64 characters in length.
	Name *string `pulumi:"name"`
	// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
	ReplicateTo *string `pulumi:"replicateTo"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type DeploymentStrategyState struct {
	// ARN of the AppConfig Deployment Strategy.
	Arn pulumi.StringPtrInput
	// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
	DeploymentDurationInMinutes pulumi.IntPtrInput
	// Description of the deployment strategy. Can be at most 1024 characters.
	Description pulumi.StringPtrInput
	// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
	FinalBakeTimeInMinutes pulumi.IntPtrInput
	// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
	GrowthFactor pulumi.Float64PtrInput
	// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
	GrowthType pulumi.StringPtrInput
	// Name for the deployment strategy. Must be between 1 and 64 characters in length.
	Name pulumi.StringPtrInput
	// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
	ReplicateTo pulumi.StringPtrInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (DeploymentStrategyState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentStrategyState)(nil)).Elem()
}

type deploymentStrategyArgs struct {
	// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
	DeploymentDurationInMinutes int `pulumi:"deploymentDurationInMinutes"`
	// Description of the deployment strategy. Can be at most 1024 characters.
	Description *string `pulumi:"description"`
	// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
	FinalBakeTimeInMinutes *int `pulumi:"finalBakeTimeInMinutes"`
	// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
	GrowthFactor float64 `pulumi:"growthFactor"`
	// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
	GrowthType *string `pulumi:"growthType"`
	// Name for the deployment strategy. Must be between 1 and 64 characters in length.
	Name *string `pulumi:"name"`
	// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
	ReplicateTo string `pulumi:"replicateTo"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DeploymentStrategy resource.
type DeploymentStrategyArgs struct {
	// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
	DeploymentDurationInMinutes pulumi.IntInput
	// Description of the deployment strategy. Can be at most 1024 characters.
	Description pulumi.StringPtrInput
	// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
	FinalBakeTimeInMinutes pulumi.IntPtrInput
	// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
	GrowthFactor pulumi.Float64Input
	// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
	GrowthType pulumi.StringPtrInput
	// Name for the deployment strategy. Must be between 1 and 64 characters in length.
	Name pulumi.StringPtrInput
	// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
	ReplicateTo pulumi.StringInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DeploymentStrategyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentStrategyArgs)(nil)).Elem()
}

type DeploymentStrategyInput interface {
	pulumi.Input

	ToDeploymentStrategyOutput() DeploymentStrategyOutput
	ToDeploymentStrategyOutputWithContext(ctx context.Context) DeploymentStrategyOutput
}

func (*DeploymentStrategy) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentStrategy)(nil)).Elem()
}

func (i *DeploymentStrategy) ToDeploymentStrategyOutput() DeploymentStrategyOutput {
	return i.ToDeploymentStrategyOutputWithContext(context.Background())
}

func (i *DeploymentStrategy) ToDeploymentStrategyOutputWithContext(ctx context.Context) DeploymentStrategyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentStrategyOutput)
}

// DeploymentStrategyArrayInput is an input type that accepts DeploymentStrategyArray and DeploymentStrategyArrayOutput values.
// You can construct a concrete instance of `DeploymentStrategyArrayInput` via:
//
//	DeploymentStrategyArray{ DeploymentStrategyArgs{...} }
type DeploymentStrategyArrayInput interface {
	pulumi.Input

	ToDeploymentStrategyArrayOutput() DeploymentStrategyArrayOutput
	ToDeploymentStrategyArrayOutputWithContext(context.Context) DeploymentStrategyArrayOutput
}

type DeploymentStrategyArray []DeploymentStrategyInput

func (DeploymentStrategyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentStrategy)(nil)).Elem()
}

func (i DeploymentStrategyArray) ToDeploymentStrategyArrayOutput() DeploymentStrategyArrayOutput {
	return i.ToDeploymentStrategyArrayOutputWithContext(context.Background())
}

func (i DeploymentStrategyArray) ToDeploymentStrategyArrayOutputWithContext(ctx context.Context) DeploymentStrategyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentStrategyArrayOutput)
}

// DeploymentStrategyMapInput is an input type that accepts DeploymentStrategyMap and DeploymentStrategyMapOutput values.
// You can construct a concrete instance of `DeploymentStrategyMapInput` via:
//
//	DeploymentStrategyMap{ "key": DeploymentStrategyArgs{...} }
type DeploymentStrategyMapInput interface {
	pulumi.Input

	ToDeploymentStrategyMapOutput() DeploymentStrategyMapOutput
	ToDeploymentStrategyMapOutputWithContext(context.Context) DeploymentStrategyMapOutput
}

type DeploymentStrategyMap map[string]DeploymentStrategyInput

func (DeploymentStrategyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentStrategy)(nil)).Elem()
}

func (i DeploymentStrategyMap) ToDeploymentStrategyMapOutput() DeploymentStrategyMapOutput {
	return i.ToDeploymentStrategyMapOutputWithContext(context.Background())
}

func (i DeploymentStrategyMap) ToDeploymentStrategyMapOutputWithContext(ctx context.Context) DeploymentStrategyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentStrategyMapOutput)
}

type DeploymentStrategyOutput struct{ *pulumi.OutputState }

func (DeploymentStrategyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentStrategy)(nil)).Elem()
}

func (o DeploymentStrategyOutput) ToDeploymentStrategyOutput() DeploymentStrategyOutput {
	return o
}

func (o DeploymentStrategyOutput) ToDeploymentStrategyOutputWithContext(ctx context.Context) DeploymentStrategyOutput {
	return o
}

// ARN of the AppConfig Deployment Strategy.
func (o DeploymentStrategyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
func (o DeploymentStrategyOutput) DeploymentDurationInMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.IntOutput { return v.DeploymentDurationInMinutes }).(pulumi.IntOutput)
}

// Description of the deployment strategy. Can be at most 1024 characters.
func (o DeploymentStrategyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
func (o DeploymentStrategyOutput) FinalBakeTimeInMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.IntPtrOutput { return v.FinalBakeTimeInMinutes }).(pulumi.IntPtrOutput)
}

// Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
func (o DeploymentStrategyOutput) GrowthFactor() pulumi.Float64Output {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.Float64Output { return v.GrowthFactor }).(pulumi.Float64Output)
}

// Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
func (o DeploymentStrategyOutput) GrowthType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringPtrOutput { return v.GrowthType }).(pulumi.StringPtrOutput)
}

// Name for the deployment strategy. Must be between 1 and 64 characters in length.
func (o DeploymentStrategyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
func (o DeploymentStrategyOutput) ReplicateTo() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringOutput { return v.ReplicateTo }).(pulumi.StringOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DeploymentStrategyOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DeploymentStrategyOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DeploymentStrategy) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type DeploymentStrategyArrayOutput struct{ *pulumi.OutputState }

func (DeploymentStrategyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentStrategy)(nil)).Elem()
}

func (o DeploymentStrategyArrayOutput) ToDeploymentStrategyArrayOutput() DeploymentStrategyArrayOutput {
	return o
}

func (o DeploymentStrategyArrayOutput) ToDeploymentStrategyArrayOutputWithContext(ctx context.Context) DeploymentStrategyArrayOutput {
	return o
}

func (o DeploymentStrategyArrayOutput) Index(i pulumi.IntInput) DeploymentStrategyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentStrategy {
		return vs[0].([]*DeploymentStrategy)[vs[1].(int)]
	}).(DeploymentStrategyOutput)
}

type DeploymentStrategyMapOutput struct{ *pulumi.OutputState }

func (DeploymentStrategyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentStrategy)(nil)).Elem()
}

func (o DeploymentStrategyMapOutput) ToDeploymentStrategyMapOutput() DeploymentStrategyMapOutput {
	return o
}

func (o DeploymentStrategyMapOutput) ToDeploymentStrategyMapOutputWithContext(ctx context.Context) DeploymentStrategyMapOutput {
	return o
}

func (o DeploymentStrategyMapOutput) MapIndex(k pulumi.StringInput) DeploymentStrategyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentStrategy {
		return vs[0].(map[string]*DeploymentStrategy)[vs[1].(string)]
	}).(DeploymentStrategyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentStrategyInput)(nil)).Elem(), &DeploymentStrategy{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentStrategyArrayInput)(nil)).Elem(), DeploymentStrategyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentStrategyMapInput)(nil)).Elem(), DeploymentStrategyMap{})
	pulumi.RegisterOutputType(DeploymentStrategyOutput{})
	pulumi.RegisterOutputType(DeploymentStrategyArrayOutput{})
	pulumi.RegisterOutputType(DeploymentStrategyMapOutput{})
}
