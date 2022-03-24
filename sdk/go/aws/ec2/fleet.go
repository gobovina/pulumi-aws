// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage EC2 Fleets.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ec2.NewFleet(ctx, "example", &ec2.FleetArgs{
// 			LaunchTemplateConfig: &ec2.FleetLaunchTemplateConfigArgs{
// 				LaunchTemplateSpecification: &ec2.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs{
// 					LaunchTemplateId: pulumi.Any(aws_launch_template.Example.Id),
// 					Version:          pulumi.Any(aws_launch_template.Example.Latest_version),
// 				},
// 			},
// 			TargetCapacitySpecification: &ec2.FleetTargetCapacitySpecificationArgs{
// 				DefaultTargetCapacityType: pulumi.String("spot"),
// 				TotalTargetCapacity:       pulumi.Int(5),
// 			},
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
// `aws_ec2_fleet` can be imported by using the Fleet identifier, e.g.,
//
// ```sh
//  $ pulumi import aws:ec2/fleet:Fleet example fleet-b9b55d27-c5fc-41ac-a6f3-48fcc91f080c
// ```
type Fleet struct {
	pulumi.CustomResourceState

	// Reserved.
	Context pulumi.StringPtrOutput `pulumi:"context"`
	// Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
	ExcessCapacityTerminationPolicy pulumi.StringPtrOutput `pulumi:"excessCapacityTerminationPolicy"`
	// Nested argument containing EC2 Launch Template configurations. Defined below.
	LaunchTemplateConfig FleetLaunchTemplateConfigOutput `pulumi:"launchTemplateConfig"`
	// Nested argument containing On-Demand configurations. Defined below.
	OnDemandOptions FleetOnDemandOptionsPtrOutput `pulumi:"onDemandOptions"`
	// Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
	ReplaceUnhealthyInstances pulumi.BoolPtrOutput `pulumi:"replaceUnhealthyInstances"`
	// Nested argument containing Spot configurations. Defined below.
	SpotOptions FleetSpotOptionsPtrOutput `pulumi:"spotOptions"`
	// Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Nested argument containing target capacity configurations. Defined below.
	TargetCapacitySpecification FleetTargetCapacitySpecificationOutput `pulumi:"targetCapacitySpecification"`
	// Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
	TerminateInstances pulumi.BoolPtrOutput `pulumi:"terminateInstances"`
	// Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
	TerminateInstancesWithExpiration pulumi.BoolPtrOutput `pulumi:"terminateInstancesWithExpiration"`
	// The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewFleet registers a new resource with the given unique name, arguments, and options.
func NewFleet(ctx *pulumi.Context,
	name string, args *FleetArgs, opts ...pulumi.ResourceOption) (*Fleet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LaunchTemplateConfig == nil {
		return nil, errors.New("invalid value for required argument 'LaunchTemplateConfig'")
	}
	if args.TargetCapacitySpecification == nil {
		return nil, errors.New("invalid value for required argument 'TargetCapacitySpecification'")
	}
	var resource Fleet
	err := ctx.RegisterResource("aws:ec2/fleet:Fleet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFleet gets an existing Fleet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFleet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FleetState, opts ...pulumi.ResourceOption) (*Fleet, error) {
	var resource Fleet
	err := ctx.ReadResource("aws:ec2/fleet:Fleet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Fleet resources.
type fleetState struct {
	// Reserved.
	Context *string `pulumi:"context"`
	// Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
	ExcessCapacityTerminationPolicy *string `pulumi:"excessCapacityTerminationPolicy"`
	// Nested argument containing EC2 Launch Template configurations. Defined below.
	LaunchTemplateConfig *FleetLaunchTemplateConfig `pulumi:"launchTemplateConfig"`
	// Nested argument containing On-Demand configurations. Defined below.
	OnDemandOptions *FleetOnDemandOptions `pulumi:"onDemandOptions"`
	// Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
	ReplaceUnhealthyInstances *bool `pulumi:"replaceUnhealthyInstances"`
	// Nested argument containing Spot configurations. Defined below.
	SpotOptions *FleetSpotOptions `pulumi:"spotOptions"`
	// Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Nested argument containing target capacity configurations. Defined below.
	TargetCapacitySpecification *FleetTargetCapacitySpecification `pulumi:"targetCapacitySpecification"`
	// Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
	TerminateInstances *bool `pulumi:"terminateInstances"`
	// Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
	TerminateInstancesWithExpiration *bool `pulumi:"terminateInstancesWithExpiration"`
	// The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
	Type *string `pulumi:"type"`
}

type FleetState struct {
	// Reserved.
	Context pulumi.StringPtrInput
	// Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
	ExcessCapacityTerminationPolicy pulumi.StringPtrInput
	// Nested argument containing EC2 Launch Template configurations. Defined below.
	LaunchTemplateConfig FleetLaunchTemplateConfigPtrInput
	// Nested argument containing On-Demand configurations. Defined below.
	OnDemandOptions FleetOnDemandOptionsPtrInput
	// Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
	ReplaceUnhealthyInstances pulumi.BoolPtrInput
	// Nested argument containing Spot configurations. Defined below.
	SpotOptions FleetSpotOptionsPtrInput
	// Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Nested argument containing target capacity configurations. Defined below.
	TargetCapacitySpecification FleetTargetCapacitySpecificationPtrInput
	// Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
	TerminateInstances pulumi.BoolPtrInput
	// Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
	TerminateInstancesWithExpiration pulumi.BoolPtrInput
	// The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
	Type pulumi.StringPtrInput
}

func (FleetState) ElementType() reflect.Type {
	return reflect.TypeOf((*fleetState)(nil)).Elem()
}

type fleetArgs struct {
	// Reserved.
	Context *string `pulumi:"context"`
	// Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
	ExcessCapacityTerminationPolicy *string `pulumi:"excessCapacityTerminationPolicy"`
	// Nested argument containing EC2 Launch Template configurations. Defined below.
	LaunchTemplateConfig FleetLaunchTemplateConfig `pulumi:"launchTemplateConfig"`
	// Nested argument containing On-Demand configurations. Defined below.
	OnDemandOptions *FleetOnDemandOptions `pulumi:"onDemandOptions"`
	// Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
	ReplaceUnhealthyInstances *bool `pulumi:"replaceUnhealthyInstances"`
	// Nested argument containing Spot configurations. Defined below.
	SpotOptions *FleetSpotOptions `pulumi:"spotOptions"`
	// Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Nested argument containing target capacity configurations. Defined below.
	TargetCapacitySpecification FleetTargetCapacitySpecification `pulumi:"targetCapacitySpecification"`
	// Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
	TerminateInstances *bool `pulumi:"terminateInstances"`
	// Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
	TerminateInstancesWithExpiration *bool `pulumi:"terminateInstancesWithExpiration"`
	// The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Fleet resource.
type FleetArgs struct {
	// Reserved.
	Context pulumi.StringPtrInput
	// Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
	ExcessCapacityTerminationPolicy pulumi.StringPtrInput
	// Nested argument containing EC2 Launch Template configurations. Defined below.
	LaunchTemplateConfig FleetLaunchTemplateConfigInput
	// Nested argument containing On-Demand configurations. Defined below.
	OnDemandOptions FleetOnDemandOptionsPtrInput
	// Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
	ReplaceUnhealthyInstances pulumi.BoolPtrInput
	// Nested argument containing Spot configurations. Defined below.
	SpotOptions FleetSpotOptionsPtrInput
	// Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Nested argument containing target capacity configurations. Defined below.
	TargetCapacitySpecification FleetTargetCapacitySpecificationInput
	// Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
	TerminateInstances pulumi.BoolPtrInput
	// Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
	TerminateInstancesWithExpiration pulumi.BoolPtrInput
	// The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
	Type pulumi.StringPtrInput
}

func (FleetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fleetArgs)(nil)).Elem()
}

type FleetInput interface {
	pulumi.Input

	ToFleetOutput() FleetOutput
	ToFleetOutputWithContext(ctx context.Context) FleetOutput
}

func (*Fleet) ElementType() reflect.Type {
	return reflect.TypeOf((**Fleet)(nil)).Elem()
}

func (i *Fleet) ToFleetOutput() FleetOutput {
	return i.ToFleetOutputWithContext(context.Background())
}

func (i *Fleet) ToFleetOutputWithContext(ctx context.Context) FleetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetOutput)
}

// FleetArrayInput is an input type that accepts FleetArray and FleetArrayOutput values.
// You can construct a concrete instance of `FleetArrayInput` via:
//
//          FleetArray{ FleetArgs{...} }
type FleetArrayInput interface {
	pulumi.Input

	ToFleetArrayOutput() FleetArrayOutput
	ToFleetArrayOutputWithContext(context.Context) FleetArrayOutput
}

type FleetArray []FleetInput

func (FleetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Fleet)(nil)).Elem()
}

func (i FleetArray) ToFleetArrayOutput() FleetArrayOutput {
	return i.ToFleetArrayOutputWithContext(context.Background())
}

func (i FleetArray) ToFleetArrayOutputWithContext(ctx context.Context) FleetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetArrayOutput)
}

// FleetMapInput is an input type that accepts FleetMap and FleetMapOutput values.
// You can construct a concrete instance of `FleetMapInput` via:
//
//          FleetMap{ "key": FleetArgs{...} }
type FleetMapInput interface {
	pulumi.Input

	ToFleetMapOutput() FleetMapOutput
	ToFleetMapOutputWithContext(context.Context) FleetMapOutput
}

type FleetMap map[string]FleetInput

func (FleetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Fleet)(nil)).Elem()
}

func (i FleetMap) ToFleetMapOutput() FleetMapOutput {
	return i.ToFleetMapOutputWithContext(context.Background())
}

func (i FleetMap) ToFleetMapOutputWithContext(ctx context.Context) FleetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FleetMapOutput)
}

type FleetOutput struct{ *pulumi.OutputState }

func (FleetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Fleet)(nil)).Elem()
}

func (o FleetOutput) ToFleetOutput() FleetOutput {
	return o
}

func (o FleetOutput) ToFleetOutputWithContext(ctx context.Context) FleetOutput {
	return o
}

type FleetArrayOutput struct{ *pulumi.OutputState }

func (FleetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Fleet)(nil)).Elem()
}

func (o FleetArrayOutput) ToFleetArrayOutput() FleetArrayOutput {
	return o
}

func (o FleetArrayOutput) ToFleetArrayOutputWithContext(ctx context.Context) FleetArrayOutput {
	return o
}

func (o FleetArrayOutput) Index(i pulumi.IntInput) FleetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Fleet {
		return vs[0].([]*Fleet)[vs[1].(int)]
	}).(FleetOutput)
}

type FleetMapOutput struct{ *pulumi.OutputState }

func (FleetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Fleet)(nil)).Elem()
}

func (o FleetMapOutput) ToFleetMapOutput() FleetMapOutput {
	return o
}

func (o FleetMapOutput) ToFleetMapOutputWithContext(ctx context.Context) FleetMapOutput {
	return o
}

func (o FleetMapOutput) MapIndex(k pulumi.StringInput) FleetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Fleet {
		return vs[0].(map[string]*Fleet)[vs[1].(string)]
	}).(FleetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FleetInput)(nil)).Elem(), &Fleet{})
	pulumi.RegisterInputType(reflect.TypeOf((*FleetArrayInput)(nil)).Elem(), FleetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FleetMapInput)(nil)).Elem(), FleetMap{})
	pulumi.RegisterOutputType(FleetOutput{})
	pulumi.RegisterOutputType(FleetArrayOutput{})
	pulumi.RegisterOutputType(FleetMapOutput{})
}
