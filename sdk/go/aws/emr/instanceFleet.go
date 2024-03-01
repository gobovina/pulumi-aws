// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package emr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic MapReduce Cluster Instance Fleet configuration.
// See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
//
// > **NOTE:** At this time, Instance Fleets cannot be destroyed through the API nor
// web interface. Instance Fleets are destroyed when the EMR Cluster is destroyed.
// the provider will resize any Instance Fleet to zero when destroying the resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/emr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := emr.NewInstanceFleet(ctx, "task", &emr.InstanceFleetArgs{
//				ClusterId: pulumi.Any(cluster.Id),
//				InstanceTypeConfigs: emr.InstanceFleetInstanceTypeConfigArray{
//					&emr.InstanceFleetInstanceTypeConfigArgs{
//						BidPriceAsPercentageOfOnDemandPrice: pulumi.Float64(100),
//						EbsConfigs: emr.InstanceFleetInstanceTypeConfigEbsConfigArray{
//							&emr.InstanceFleetInstanceTypeConfigEbsConfigArgs{
//								Size:               pulumi.Int(100),
//								Type:               pulumi.String("gp2"),
//								VolumesPerInstance: pulumi.Int(1),
//							},
//						},
//						InstanceType:     pulumi.String("m4.xlarge"),
//						WeightedCapacity: pulumi.Int(1),
//					},
//					&emr.InstanceFleetInstanceTypeConfigArgs{
//						BidPriceAsPercentageOfOnDemandPrice: pulumi.Float64(100),
//						EbsConfigs: emr.InstanceFleetInstanceTypeConfigEbsConfigArray{
//							&emr.InstanceFleetInstanceTypeConfigEbsConfigArgs{
//								Size:               pulumi.Int(100),
//								Type:               pulumi.String("gp2"),
//								VolumesPerInstance: pulumi.Int(1),
//							},
//						},
//						InstanceType:     pulumi.String("m4.2xlarge"),
//						WeightedCapacity: pulumi.Int(2),
//					},
//				},
//				LaunchSpecifications: &emr.InstanceFleetLaunchSpecificationsArgs{
//					SpotSpecifications: emr.InstanceFleetLaunchSpecificationsSpotSpecificationArray{
//						&emr.InstanceFleetLaunchSpecificationsSpotSpecificationArgs{
//							AllocationStrategy:     pulumi.String("capacity-optimized"),
//							BlockDurationMinutes:   pulumi.Int(0),
//							TimeoutAction:          pulumi.String("TERMINATE_CLUSTER"),
//							TimeoutDurationMinutes: pulumi.Int(10),
//						},
//					},
//				},
//				Name:                   pulumi.String("task fleet"),
//				TargetOnDemandCapacity: pulumi.Int(1),
//				TargetSpotCapacity:     pulumi.Int(1),
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
// Using `pulumi import`, import EMR Instance Fleet using the EMR Cluster identifier and Instance Fleet identifier separated by a forward slash (`/`). For example:
//
// ```sh
//
//	$ pulumi import aws:emr/instanceFleet:InstanceFleet example j-123456ABCDEF/if-15EK4O09RZLNR
//
// ```
type InstanceFleet struct {
	pulumi.CustomResourceState

	// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Configuration block for instance fleet
	InstanceTypeConfigs InstanceFleetInstanceTypeConfigArrayOutput `pulumi:"instanceTypeConfigs"`
	// Configuration block for launch specification
	LaunchSpecifications InstanceFleetLaunchSpecificationsPtrOutput `pulumi:"launchSpecifications"`
	// Friendly name given to the instance fleet.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of On-Demand units that have been provisioned for the instance
	// fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
	ProvisionedOnDemandCapacity pulumi.IntOutput `pulumi:"provisionedOnDemandCapacity"`
	// The number of Spot units that have been provisioned for this instance fleet
	// to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
	ProvisionedSpotCapacity pulumi.IntOutput `pulumi:"provisionedSpotCapacity"`
	// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
	TargetOnDemandCapacity pulumi.IntPtrOutput `pulumi:"targetOnDemandCapacity"`
	// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
	TargetSpotCapacity pulumi.IntPtrOutput `pulumi:"targetSpotCapacity"`
}

// NewInstanceFleet registers a new resource with the given unique name, arguments, and options.
func NewInstanceFleet(ctx *pulumi.Context,
	name string, args *InstanceFleetArgs, opts ...pulumi.ResourceOption) (*InstanceFleet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceFleet
	err := ctx.RegisterResource("aws:emr/instanceFleet:InstanceFleet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceFleet gets an existing InstanceFleet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceFleet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceFleetState, opts ...pulumi.ResourceOption) (*InstanceFleet, error) {
	var resource InstanceFleet
	err := ctx.ReadResource("aws:emr/instanceFleet:InstanceFleet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceFleet resources.
type instanceFleetState struct {
	// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
	ClusterId *string `pulumi:"clusterId"`
	// Configuration block for instance fleet
	InstanceTypeConfigs []InstanceFleetInstanceTypeConfig `pulumi:"instanceTypeConfigs"`
	// Configuration block for launch specification
	LaunchSpecifications *InstanceFleetLaunchSpecifications `pulumi:"launchSpecifications"`
	// Friendly name given to the instance fleet.
	Name *string `pulumi:"name"`
	// The number of On-Demand units that have been provisioned for the instance
	// fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
	ProvisionedOnDemandCapacity *int `pulumi:"provisionedOnDemandCapacity"`
	// The number of Spot units that have been provisioned for this instance fleet
	// to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
	ProvisionedSpotCapacity *int `pulumi:"provisionedSpotCapacity"`
	// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
	TargetOnDemandCapacity *int `pulumi:"targetOnDemandCapacity"`
	// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
	TargetSpotCapacity *int `pulumi:"targetSpotCapacity"`
}

type InstanceFleetState struct {
	// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
	ClusterId pulumi.StringPtrInput
	// Configuration block for instance fleet
	InstanceTypeConfigs InstanceFleetInstanceTypeConfigArrayInput
	// Configuration block for launch specification
	LaunchSpecifications InstanceFleetLaunchSpecificationsPtrInput
	// Friendly name given to the instance fleet.
	Name pulumi.StringPtrInput
	// The number of On-Demand units that have been provisioned for the instance
	// fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
	ProvisionedOnDemandCapacity pulumi.IntPtrInput
	// The number of Spot units that have been provisioned for this instance fleet
	// to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
	ProvisionedSpotCapacity pulumi.IntPtrInput
	// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
	TargetOnDemandCapacity pulumi.IntPtrInput
	// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
	TargetSpotCapacity pulumi.IntPtrInput
}

func (InstanceFleetState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceFleetState)(nil)).Elem()
}

type instanceFleetArgs struct {
	// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
	ClusterId string `pulumi:"clusterId"`
	// Configuration block for instance fleet
	InstanceTypeConfigs []InstanceFleetInstanceTypeConfig `pulumi:"instanceTypeConfigs"`
	// Configuration block for launch specification
	LaunchSpecifications *InstanceFleetLaunchSpecifications `pulumi:"launchSpecifications"`
	// Friendly name given to the instance fleet.
	Name *string `pulumi:"name"`
	// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
	TargetOnDemandCapacity *int `pulumi:"targetOnDemandCapacity"`
	// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
	TargetSpotCapacity *int `pulumi:"targetSpotCapacity"`
}

// The set of arguments for constructing a InstanceFleet resource.
type InstanceFleetArgs struct {
	// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
	ClusterId pulumi.StringInput
	// Configuration block for instance fleet
	InstanceTypeConfigs InstanceFleetInstanceTypeConfigArrayInput
	// Configuration block for launch specification
	LaunchSpecifications InstanceFleetLaunchSpecificationsPtrInput
	// Friendly name given to the instance fleet.
	Name pulumi.StringPtrInput
	// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
	TargetOnDemandCapacity pulumi.IntPtrInput
	// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
	TargetSpotCapacity pulumi.IntPtrInput
}

func (InstanceFleetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceFleetArgs)(nil)).Elem()
}

type InstanceFleetInput interface {
	pulumi.Input

	ToInstanceFleetOutput() InstanceFleetOutput
	ToInstanceFleetOutputWithContext(ctx context.Context) InstanceFleetOutput
}

func (*InstanceFleet) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceFleet)(nil)).Elem()
}

func (i *InstanceFleet) ToInstanceFleetOutput() InstanceFleetOutput {
	return i.ToInstanceFleetOutputWithContext(context.Background())
}

func (i *InstanceFleet) ToInstanceFleetOutputWithContext(ctx context.Context) InstanceFleetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceFleetOutput)
}

// InstanceFleetArrayInput is an input type that accepts InstanceFleetArray and InstanceFleetArrayOutput values.
// You can construct a concrete instance of `InstanceFleetArrayInput` via:
//
//	InstanceFleetArray{ InstanceFleetArgs{...} }
type InstanceFleetArrayInput interface {
	pulumi.Input

	ToInstanceFleetArrayOutput() InstanceFleetArrayOutput
	ToInstanceFleetArrayOutputWithContext(context.Context) InstanceFleetArrayOutput
}

type InstanceFleetArray []InstanceFleetInput

func (InstanceFleetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceFleet)(nil)).Elem()
}

func (i InstanceFleetArray) ToInstanceFleetArrayOutput() InstanceFleetArrayOutput {
	return i.ToInstanceFleetArrayOutputWithContext(context.Background())
}

func (i InstanceFleetArray) ToInstanceFleetArrayOutputWithContext(ctx context.Context) InstanceFleetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceFleetArrayOutput)
}

// InstanceFleetMapInput is an input type that accepts InstanceFleetMap and InstanceFleetMapOutput values.
// You can construct a concrete instance of `InstanceFleetMapInput` via:
//
//	InstanceFleetMap{ "key": InstanceFleetArgs{...} }
type InstanceFleetMapInput interface {
	pulumi.Input

	ToInstanceFleetMapOutput() InstanceFleetMapOutput
	ToInstanceFleetMapOutputWithContext(context.Context) InstanceFleetMapOutput
}

type InstanceFleetMap map[string]InstanceFleetInput

func (InstanceFleetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceFleet)(nil)).Elem()
}

func (i InstanceFleetMap) ToInstanceFleetMapOutput() InstanceFleetMapOutput {
	return i.ToInstanceFleetMapOutputWithContext(context.Background())
}

func (i InstanceFleetMap) ToInstanceFleetMapOutputWithContext(ctx context.Context) InstanceFleetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceFleetMapOutput)
}

type InstanceFleetOutput struct{ *pulumi.OutputState }

func (InstanceFleetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceFleet)(nil)).Elem()
}

func (o InstanceFleetOutput) ToInstanceFleetOutput() InstanceFleetOutput {
	return o
}

func (o InstanceFleetOutput) ToInstanceFleetOutputWithContext(ctx context.Context) InstanceFleetOutput {
	return o
}

// ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
func (o InstanceFleetOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Configuration block for instance fleet
func (o InstanceFleetOutput) InstanceTypeConfigs() InstanceFleetInstanceTypeConfigArrayOutput {
	return o.ApplyT(func(v *InstanceFleet) InstanceFleetInstanceTypeConfigArrayOutput { return v.InstanceTypeConfigs }).(InstanceFleetInstanceTypeConfigArrayOutput)
}

// Configuration block for launch specification
func (o InstanceFleetOutput) LaunchSpecifications() InstanceFleetLaunchSpecificationsPtrOutput {
	return o.ApplyT(func(v *InstanceFleet) InstanceFleetLaunchSpecificationsPtrOutput { return v.LaunchSpecifications }).(InstanceFleetLaunchSpecificationsPtrOutput)
}

// Friendly name given to the instance fleet.
func (o InstanceFleetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of On-Demand units that have been provisioned for the instance
// fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
func (o InstanceFleetOutput) ProvisionedOnDemandCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.IntOutput { return v.ProvisionedOnDemandCapacity }).(pulumi.IntOutput)
}

// The number of Spot units that have been provisioned for this instance fleet
// to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
func (o InstanceFleetOutput) ProvisionedSpotCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.IntOutput { return v.ProvisionedSpotCapacity }).(pulumi.IntOutput)
}

// The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
func (o InstanceFleetOutput) TargetOnDemandCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.IntPtrOutput { return v.TargetOnDemandCapacity }).(pulumi.IntPtrOutput)
}

// The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
func (o InstanceFleetOutput) TargetSpotCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstanceFleet) pulumi.IntPtrOutput { return v.TargetSpotCapacity }).(pulumi.IntPtrOutput)
}

type InstanceFleetArrayOutput struct{ *pulumi.OutputState }

func (InstanceFleetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceFleet)(nil)).Elem()
}

func (o InstanceFleetArrayOutput) ToInstanceFleetArrayOutput() InstanceFleetArrayOutput {
	return o
}

func (o InstanceFleetArrayOutput) ToInstanceFleetArrayOutputWithContext(ctx context.Context) InstanceFleetArrayOutput {
	return o
}

func (o InstanceFleetArrayOutput) Index(i pulumi.IntInput) InstanceFleetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceFleet {
		return vs[0].([]*InstanceFleet)[vs[1].(int)]
	}).(InstanceFleetOutput)
}

type InstanceFleetMapOutput struct{ *pulumi.OutputState }

func (InstanceFleetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceFleet)(nil)).Elem()
}

func (o InstanceFleetMapOutput) ToInstanceFleetMapOutput() InstanceFleetMapOutput {
	return o
}

func (o InstanceFleetMapOutput) ToInstanceFleetMapOutputWithContext(ctx context.Context) InstanceFleetMapOutput {
	return o
}

func (o InstanceFleetMapOutput) MapIndex(k pulumi.StringInput) InstanceFleetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceFleet {
		return vs[0].(map[string]*InstanceFleet)[vs[1].(string)]
	}).(InstanceFleetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceFleetInput)(nil)).Elem(), &InstanceFleet{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceFleetArrayInput)(nil)).Elem(), InstanceFleetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceFleetMapInput)(nil)).Elem(), InstanceFleetMap{})
	pulumi.RegisterOutputType(InstanceFleetOutput{})
	pulumi.RegisterOutputType(InstanceFleetArrayOutput{})
	pulumi.RegisterOutputType(InstanceFleetMapOutput{})
}
