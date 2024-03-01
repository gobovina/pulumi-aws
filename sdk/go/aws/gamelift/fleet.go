// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gamelift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a GameLift Fleet resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/gamelift"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gamelift.NewFleet(ctx, "example", &gamelift.FleetArgs{
//				BuildId:         pulumi.Any(exampleAwsGameliftBuild.Id),
//				Ec2InstanceType: pulumi.String("t2.micro"),
//				FleetType:       pulumi.String("ON_DEMAND"),
//				Name:            pulumi.String("example-fleet-name"),
//				RuntimeConfiguration: &gamelift.FleetRuntimeConfigurationArgs{
//					ServerProcesses: gamelift.FleetRuntimeConfigurationServerProcessArray{
//						&gamelift.FleetRuntimeConfigurationServerProcessArgs{
//							ConcurrentExecutions: pulumi.Int(1),
//							LaunchPath:           pulumi.String("C:\\game\\GomokuServer.exe"),
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
//
// ## Import
//
// Using `pulumi import`, import GameLift Fleets using the ID. For example:
//
// ```sh
//
//	$ pulumi import aws:gamelift/fleet:Fleet example <fleet-id>
//
// ```
type Fleet struct {
	pulumi.CustomResourceState

	// Fleet ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Build ARN.
	BuildArn pulumi.StringOutput `pulumi:"buildArn"`
	// ID of the GameLift Build to be deployed on the fleet.
	BuildId pulumi.StringPtrOutput `pulumi:"buildId"`
	// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
	CertificateConfiguration FleetCertificateConfigurationOutput `pulumi:"certificateConfiguration"`
	// Human-readable description of the fleet.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
	Ec2InboundPermissions FleetEc2InboundPermissionArrayOutput `pulumi:"ec2InboundPermissions"`
	// Name of an EC2 instance typeE.g., `t2.micro`
	Ec2InstanceType pulumi.StringOutput `pulumi:"ec2InstanceType"`
	// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
	FleetType pulumi.StringPtrOutput `pulumi:"fleetType"`
	// ARN of an IAM role that instances in the fleet can assume.
	InstanceRoleArn pulumi.StringPtrOutput   `pulumi:"instanceRoleArn"`
	LogPaths        pulumi.StringArrayOutput `pulumi:"logPaths"`
	// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
	MetricGroups pulumi.StringArrayOutput `pulumi:"metricGroups"`
	// The name of the fleet.
	Name pulumi.StringOutput `pulumi:"name"`
	// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
	NewGameSessionProtectionPolicy pulumi.StringPtrOutput `pulumi:"newGameSessionProtectionPolicy"`
	// Operating system of the fleet's computing resources.
	OperatingSystem pulumi.StringOutput `pulumi:"operatingSystem"`
	// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
	ResourceCreationLimitPolicy FleetResourceCreationLimitPolicyPtrOutput `pulumi:"resourceCreationLimitPolicy"`
	// Instructions for launching server processes on each instance in the fleet. See below.
	RuntimeConfiguration FleetRuntimeConfigurationPtrOutput `pulumi:"runtimeConfiguration"`
	// Script ARN.
	ScriptArn pulumi.StringOutput `pulumi:"scriptArn"`
	// ID of the GameLift Script to be deployed on the fleet.
	ScriptId pulumi.StringPtrOutput `pulumi:"scriptId"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewFleet registers a new resource with the given unique name, arguments, and options.
func NewFleet(ctx *pulumi.Context,
	name string, args *FleetArgs, opts ...pulumi.ResourceOption) (*Fleet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ec2InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'Ec2InstanceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Fleet
	err := ctx.RegisterResource("aws:gamelift/fleet:Fleet", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:gamelift/fleet:Fleet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Fleet resources.
type fleetState struct {
	// Fleet ARN.
	Arn *string `pulumi:"arn"`
	// Build ARN.
	BuildArn *string `pulumi:"buildArn"`
	// ID of the GameLift Build to be deployed on the fleet.
	BuildId *string `pulumi:"buildId"`
	// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
	CertificateConfiguration *FleetCertificateConfiguration `pulumi:"certificateConfiguration"`
	// Human-readable description of the fleet.
	Description *string `pulumi:"description"`
	// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
	Ec2InboundPermissions []FleetEc2InboundPermission `pulumi:"ec2InboundPermissions"`
	// Name of an EC2 instance typeE.g., `t2.micro`
	Ec2InstanceType *string `pulumi:"ec2InstanceType"`
	// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
	FleetType *string `pulumi:"fleetType"`
	// ARN of an IAM role that instances in the fleet can assume.
	InstanceRoleArn *string  `pulumi:"instanceRoleArn"`
	LogPaths        []string `pulumi:"logPaths"`
	// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
	MetricGroups []string `pulumi:"metricGroups"`
	// The name of the fleet.
	Name *string `pulumi:"name"`
	// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
	NewGameSessionProtectionPolicy *string `pulumi:"newGameSessionProtectionPolicy"`
	// Operating system of the fleet's computing resources.
	OperatingSystem *string `pulumi:"operatingSystem"`
	// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
	ResourceCreationLimitPolicy *FleetResourceCreationLimitPolicy `pulumi:"resourceCreationLimitPolicy"`
	// Instructions for launching server processes on each instance in the fleet. See below.
	RuntimeConfiguration *FleetRuntimeConfiguration `pulumi:"runtimeConfiguration"`
	// Script ARN.
	ScriptArn *string `pulumi:"scriptArn"`
	// ID of the GameLift Script to be deployed on the fleet.
	ScriptId *string `pulumi:"scriptId"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type FleetState struct {
	// Fleet ARN.
	Arn pulumi.StringPtrInput
	// Build ARN.
	BuildArn pulumi.StringPtrInput
	// ID of the GameLift Build to be deployed on the fleet.
	BuildId pulumi.StringPtrInput
	// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
	CertificateConfiguration FleetCertificateConfigurationPtrInput
	// Human-readable description of the fleet.
	Description pulumi.StringPtrInput
	// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
	Ec2InboundPermissions FleetEc2InboundPermissionArrayInput
	// Name of an EC2 instance typeE.g., `t2.micro`
	Ec2InstanceType pulumi.StringPtrInput
	// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
	FleetType pulumi.StringPtrInput
	// ARN of an IAM role that instances in the fleet can assume.
	InstanceRoleArn pulumi.StringPtrInput
	LogPaths        pulumi.StringArrayInput
	// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
	MetricGroups pulumi.StringArrayInput
	// The name of the fleet.
	Name pulumi.StringPtrInput
	// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
	NewGameSessionProtectionPolicy pulumi.StringPtrInput
	// Operating system of the fleet's computing resources.
	OperatingSystem pulumi.StringPtrInput
	// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
	ResourceCreationLimitPolicy FleetResourceCreationLimitPolicyPtrInput
	// Instructions for launching server processes on each instance in the fleet. See below.
	RuntimeConfiguration FleetRuntimeConfigurationPtrInput
	// Script ARN.
	ScriptArn pulumi.StringPtrInput
	// ID of the GameLift Script to be deployed on the fleet.
	ScriptId pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (FleetState) ElementType() reflect.Type {
	return reflect.TypeOf((*fleetState)(nil)).Elem()
}

type fleetArgs struct {
	// ID of the GameLift Build to be deployed on the fleet.
	BuildId *string `pulumi:"buildId"`
	// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
	CertificateConfiguration *FleetCertificateConfiguration `pulumi:"certificateConfiguration"`
	// Human-readable description of the fleet.
	Description *string `pulumi:"description"`
	// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
	Ec2InboundPermissions []FleetEc2InboundPermission `pulumi:"ec2InboundPermissions"`
	// Name of an EC2 instance typeE.g., `t2.micro`
	Ec2InstanceType string `pulumi:"ec2InstanceType"`
	// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
	FleetType *string `pulumi:"fleetType"`
	// ARN of an IAM role that instances in the fleet can assume.
	InstanceRoleArn *string `pulumi:"instanceRoleArn"`
	// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
	MetricGroups []string `pulumi:"metricGroups"`
	// The name of the fleet.
	Name *string `pulumi:"name"`
	// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
	NewGameSessionProtectionPolicy *string `pulumi:"newGameSessionProtectionPolicy"`
	// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
	ResourceCreationLimitPolicy *FleetResourceCreationLimitPolicy `pulumi:"resourceCreationLimitPolicy"`
	// Instructions for launching server processes on each instance in the fleet. See below.
	RuntimeConfiguration *FleetRuntimeConfiguration `pulumi:"runtimeConfiguration"`
	// ID of the GameLift Script to be deployed on the fleet.
	ScriptId *string `pulumi:"scriptId"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Fleet resource.
type FleetArgs struct {
	// ID of the GameLift Build to be deployed on the fleet.
	BuildId pulumi.StringPtrInput
	// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
	CertificateConfiguration FleetCertificateConfigurationPtrInput
	// Human-readable description of the fleet.
	Description pulumi.StringPtrInput
	// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
	Ec2InboundPermissions FleetEc2InboundPermissionArrayInput
	// Name of an EC2 instance typeE.g., `t2.micro`
	Ec2InstanceType pulumi.StringInput
	// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
	FleetType pulumi.StringPtrInput
	// ARN of an IAM role that instances in the fleet can assume.
	InstanceRoleArn pulumi.StringPtrInput
	// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
	MetricGroups pulumi.StringArrayInput
	// The name of the fleet.
	Name pulumi.StringPtrInput
	// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
	NewGameSessionProtectionPolicy pulumi.StringPtrInput
	// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
	ResourceCreationLimitPolicy FleetResourceCreationLimitPolicyPtrInput
	// Instructions for launching server processes on each instance in the fleet. See below.
	RuntimeConfiguration FleetRuntimeConfigurationPtrInput
	// ID of the GameLift Script to be deployed on the fleet.
	ScriptId pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
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
//	FleetArray{ FleetArgs{...} }
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
//	FleetMap{ "key": FleetArgs{...} }
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

// Fleet ARN.
func (o FleetOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Build ARN.
func (o FleetOutput) BuildArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.BuildArn }).(pulumi.StringOutput)
}

// ID of the GameLift Build to be deployed on the fleet.
func (o FleetOutput) BuildId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.BuildId }).(pulumi.StringPtrOutput)
}

// Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
func (o FleetOutput) CertificateConfiguration() FleetCertificateConfigurationOutput {
	return o.ApplyT(func(v *Fleet) FleetCertificateConfigurationOutput { return v.CertificateConfiguration }).(FleetCertificateConfigurationOutput)
}

// Human-readable description of the fleet.
func (o FleetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
func (o FleetOutput) Ec2InboundPermissions() FleetEc2InboundPermissionArrayOutput {
	return o.ApplyT(func(v *Fleet) FleetEc2InboundPermissionArrayOutput { return v.Ec2InboundPermissions }).(FleetEc2InboundPermissionArrayOutput)
}

// Name of an EC2 instance typeE.g., `t2.micro`
func (o FleetOutput) Ec2InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Ec2InstanceType }).(pulumi.StringOutput)
}

// Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
func (o FleetOutput) FleetType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.FleetType }).(pulumi.StringPtrOutput)
}

// ARN of an IAM role that instances in the fleet can assume.
func (o FleetOutput) InstanceRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.InstanceRoleArn }).(pulumi.StringPtrOutput)
}

func (o FleetOutput) LogPaths() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringArrayOutput { return v.LogPaths }).(pulumi.StringArrayOutput)
}

// List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
func (o FleetOutput) MetricGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringArrayOutput { return v.MetricGroups }).(pulumi.StringArrayOutput)
}

// The name of the fleet.
func (o FleetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
func (o FleetOutput) NewGameSessionProtectionPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.NewGameSessionProtectionPolicy }).(pulumi.StringPtrOutput)
}

// Operating system of the fleet's computing resources.
func (o FleetOutput) OperatingSystem() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.OperatingSystem }).(pulumi.StringOutput)
}

// Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
func (o FleetOutput) ResourceCreationLimitPolicy() FleetResourceCreationLimitPolicyPtrOutput {
	return o.ApplyT(func(v *Fleet) FleetResourceCreationLimitPolicyPtrOutput { return v.ResourceCreationLimitPolicy }).(FleetResourceCreationLimitPolicyPtrOutput)
}

// Instructions for launching server processes on each instance in the fleet. See below.
func (o FleetOutput) RuntimeConfiguration() FleetRuntimeConfigurationPtrOutput {
	return o.ApplyT(func(v *Fleet) FleetRuntimeConfigurationPtrOutput { return v.RuntimeConfiguration }).(FleetRuntimeConfigurationPtrOutput)
}

// Script ARN.
func (o FleetOutput) ScriptArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringOutput { return v.ScriptArn }).(pulumi.StringOutput)
}

// ID of the GameLift Script to be deployed on the fleet.
func (o FleetOutput) ScriptId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringPtrOutput { return v.ScriptId }).(pulumi.StringPtrOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o FleetOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o FleetOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Fleet) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
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
