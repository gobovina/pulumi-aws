// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsworks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an OpsWorks PHP application layer resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opsworks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := opsworks.NewPhpAppLayer(ctx, "app", &opsworks.PhpAppLayerArgs{
//				StackId: pulumi.Any(main.Id),
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
// Using `pulumi import`, import OpsWorks PHP Application Layers using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:opsworks/phpAppLayer:PhpAppLayer bar 00000000-0000-0000-0000-000000000000
//
// ```
type PhpAppLayer struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name(ARN) of the layer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrOutput `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrOutput `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrOutput                        `pulumi:"autoHealing"`
	CloudwatchConfiguration PhpAppLayerCloudwatchConfigurationPtrOutput `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  pulumi.StringArrayOutput                    `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     pulumi.StringArrayOutput                    `pulumi:"customDeployRecipes"`
	// The ARN of an IAM profile that will be used for the layer's instances.
	CustomInstanceProfileArn pulumi.StringPtrOutput `pulumi:"customInstanceProfileArn"`
	// Custom JSON attributes to apply to the layer.
	CustomJson pulumi.StringPtrOutput `pulumi:"customJson"`
	// Ids for a set of security groups to apply to the layer's instances.
	CustomSecurityGroupIds pulumi.StringArrayOutput `pulumi:"customSecurityGroupIds"`
	CustomSetupRecipes     pulumi.StringArrayOutput `pulumi:"customSetupRecipes"`
	CustomShutdownRecipes  pulumi.StringArrayOutput `pulumi:"customShutdownRecipes"`
	CustomUndeployRecipes  pulumi.StringArrayOutput `pulumi:"customUndeployRecipes"`
	// Whether to enable Elastic Load Balancing connection draining.
	DrainElbOnShutdown pulumi.BoolPtrOutput `pulumi:"drainElbOnShutdown"`
	// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
	EbsVolumes PhpAppLayerEbsVolumeArrayOutput `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrOutput `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrOutput `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrOutput                   `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    PhpAppLayerLoadBasedAutoScalingOutput `pulumi:"loadBasedAutoScaling"`
	// A human-readable name for the layer.
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the stack the layer will belong to.
	StackId pulumi.StringOutput `pulumi:"stackId"`
	// Names of a set of system packages to install on the layer's instances.
	SystemPackages pulumi.StringArrayOutput `pulumi:"systemPackages"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// The following extra optional arguments, all lists of Chef recipe names, allow
	// custom Chef recipes to be applied to layer instances at the five different
	// lifecycle events, if custom cookbooks are enabled on the layer's stack:
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Whether to use EBS-optimized instances.
	UseEbsOptimizedInstances pulumi.BoolPtrOutput `pulumi:"useEbsOptimizedInstances"`
}

// NewPhpAppLayer registers a new resource with the given unique name, arguments, and options.
func NewPhpAppLayer(ctx *pulumi.Context,
	name string, args *PhpAppLayerArgs, opts ...pulumi.ResourceOption) (*PhpAppLayer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StackId == nil {
		return nil, errors.New("invalid value for required argument 'StackId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PhpAppLayer
	err := ctx.RegisterResource("aws:opsworks/phpAppLayer:PhpAppLayer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPhpAppLayer gets an existing PhpAppLayer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPhpAppLayer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PhpAppLayerState, opts ...pulumi.ResourceOption) (*PhpAppLayer, error) {
	var resource PhpAppLayer
	err := ctx.ReadResource("aws:opsworks/phpAppLayer:PhpAppLayer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PhpAppLayer resources.
type phpAppLayerState struct {
	// The Amazon Resource Name(ARN) of the layer.
	Arn *string `pulumi:"arn"`
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps *bool `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps *bool `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             *bool                               `pulumi:"autoHealing"`
	CloudwatchConfiguration *PhpAppLayerCloudwatchConfiguration `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  []string                            `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     []string                            `pulumi:"customDeployRecipes"`
	// The ARN of an IAM profile that will be used for the layer's instances.
	CustomInstanceProfileArn *string `pulumi:"customInstanceProfileArn"`
	// Custom JSON attributes to apply to the layer.
	CustomJson *string `pulumi:"customJson"`
	// Ids for a set of security groups to apply to the layer's instances.
	CustomSecurityGroupIds []string `pulumi:"customSecurityGroupIds"`
	CustomSetupRecipes     []string `pulumi:"customSetupRecipes"`
	CustomShutdownRecipes  []string `pulumi:"customShutdownRecipes"`
	CustomUndeployRecipes  []string `pulumi:"customUndeployRecipes"`
	// Whether to enable Elastic Load Balancing connection draining.
	DrainElbOnShutdown *bool `pulumi:"drainElbOnShutdown"`
	// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
	EbsVolumes []PhpAppLayerEbsVolume `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer *string `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot *bool `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout *int                             `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    *PhpAppLayerLoadBasedAutoScaling `pulumi:"loadBasedAutoScaling"`
	// A human-readable name for the layer.
	Name *string `pulumi:"name"`
	// ID of the stack the layer will belong to.
	StackId *string `pulumi:"stackId"`
	// Names of a set of system packages to install on the layer's instances.
	SystemPackages []string `pulumi:"systemPackages"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// The following extra optional arguments, all lists of Chef recipe names, allow
	// custom Chef recipes to be applied to layer instances at the five different
	// lifecycle events, if custom cookbooks are enabled on the layer's stack:
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Whether to use EBS-optimized instances.
	UseEbsOptimizedInstances *bool `pulumi:"useEbsOptimizedInstances"`
}

type PhpAppLayerState struct {
	// The Amazon Resource Name(ARN) of the layer.
	Arn pulumi.StringPtrInput
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrInput
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrInput
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrInput
	CloudwatchConfiguration PhpAppLayerCloudwatchConfigurationPtrInput
	CustomConfigureRecipes  pulumi.StringArrayInput
	CustomDeployRecipes     pulumi.StringArrayInput
	// The ARN of an IAM profile that will be used for the layer's instances.
	CustomInstanceProfileArn pulumi.StringPtrInput
	// Custom JSON attributes to apply to the layer.
	CustomJson pulumi.StringPtrInput
	// Ids for a set of security groups to apply to the layer's instances.
	CustomSecurityGroupIds pulumi.StringArrayInput
	CustomSetupRecipes     pulumi.StringArrayInput
	CustomShutdownRecipes  pulumi.StringArrayInput
	CustomUndeployRecipes  pulumi.StringArrayInput
	// Whether to enable Elastic Load Balancing connection draining.
	DrainElbOnShutdown pulumi.BoolPtrInput
	// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
	EbsVolumes PhpAppLayerEbsVolumeArrayInput
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrInput
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrInput
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrInput
	LoadBasedAutoScaling    PhpAppLayerLoadBasedAutoScalingPtrInput
	// A human-readable name for the layer.
	Name pulumi.StringPtrInput
	// ID of the stack the layer will belong to.
	StackId pulumi.StringPtrInput
	// Names of a set of system packages to install on the layer's instances.
	SystemPackages pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// The following extra optional arguments, all lists of Chef recipe names, allow
	// custom Chef recipes to be applied to layer instances at the five different
	// lifecycle events, if custom cookbooks are enabled on the layer's stack:
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Whether to use EBS-optimized instances.
	UseEbsOptimizedInstances pulumi.BoolPtrInput
}

func (PhpAppLayerState) ElementType() reflect.Type {
	return reflect.TypeOf((*phpAppLayerState)(nil)).Elem()
}

type phpAppLayerArgs struct {
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps *bool `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps *bool `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             *bool                               `pulumi:"autoHealing"`
	CloudwatchConfiguration *PhpAppLayerCloudwatchConfiguration `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  []string                            `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     []string                            `pulumi:"customDeployRecipes"`
	// The ARN of an IAM profile that will be used for the layer's instances.
	CustomInstanceProfileArn *string `pulumi:"customInstanceProfileArn"`
	// Custom JSON attributes to apply to the layer.
	CustomJson *string `pulumi:"customJson"`
	// Ids for a set of security groups to apply to the layer's instances.
	CustomSecurityGroupIds []string `pulumi:"customSecurityGroupIds"`
	CustomSetupRecipes     []string `pulumi:"customSetupRecipes"`
	CustomShutdownRecipes  []string `pulumi:"customShutdownRecipes"`
	CustomUndeployRecipes  []string `pulumi:"customUndeployRecipes"`
	// Whether to enable Elastic Load Balancing connection draining.
	DrainElbOnShutdown *bool `pulumi:"drainElbOnShutdown"`
	// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
	EbsVolumes []PhpAppLayerEbsVolume `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer *string `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot *bool `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout *int                             `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    *PhpAppLayerLoadBasedAutoScaling `pulumi:"loadBasedAutoScaling"`
	// A human-readable name for the layer.
	Name *string `pulumi:"name"`
	// ID of the stack the layer will belong to.
	StackId string `pulumi:"stackId"`
	// Names of a set of system packages to install on the layer's instances.
	SystemPackages []string `pulumi:"systemPackages"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// The following extra optional arguments, all lists of Chef recipe names, allow
	// custom Chef recipes to be applied to layer instances at the five different
	// lifecycle events, if custom cookbooks are enabled on the layer's stack:
	Tags map[string]string `pulumi:"tags"`
	// Whether to use EBS-optimized instances.
	UseEbsOptimizedInstances *bool `pulumi:"useEbsOptimizedInstances"`
}

// The set of arguments for constructing a PhpAppLayer resource.
type PhpAppLayerArgs struct {
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrInput
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrInput
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrInput
	CloudwatchConfiguration PhpAppLayerCloudwatchConfigurationPtrInput
	CustomConfigureRecipes  pulumi.StringArrayInput
	CustomDeployRecipes     pulumi.StringArrayInput
	// The ARN of an IAM profile that will be used for the layer's instances.
	CustomInstanceProfileArn pulumi.StringPtrInput
	// Custom JSON attributes to apply to the layer.
	CustomJson pulumi.StringPtrInput
	// Ids for a set of security groups to apply to the layer's instances.
	CustomSecurityGroupIds pulumi.StringArrayInput
	CustomSetupRecipes     pulumi.StringArrayInput
	CustomShutdownRecipes  pulumi.StringArrayInput
	CustomUndeployRecipes  pulumi.StringArrayInput
	// Whether to enable Elastic Load Balancing connection draining.
	DrainElbOnShutdown pulumi.BoolPtrInput
	// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
	EbsVolumes PhpAppLayerEbsVolumeArrayInput
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrInput
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrInput
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrInput
	LoadBasedAutoScaling    PhpAppLayerLoadBasedAutoScalingPtrInput
	// A human-readable name for the layer.
	Name pulumi.StringPtrInput
	// ID of the stack the layer will belong to.
	StackId pulumi.StringInput
	// Names of a set of system packages to install on the layer's instances.
	SystemPackages pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// The following extra optional arguments, all lists of Chef recipe names, allow
	// custom Chef recipes to be applied to layer instances at the five different
	// lifecycle events, if custom cookbooks are enabled on the layer's stack:
	Tags pulumi.StringMapInput
	// Whether to use EBS-optimized instances.
	UseEbsOptimizedInstances pulumi.BoolPtrInput
}

func (PhpAppLayerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*phpAppLayerArgs)(nil)).Elem()
}

type PhpAppLayerInput interface {
	pulumi.Input

	ToPhpAppLayerOutput() PhpAppLayerOutput
	ToPhpAppLayerOutputWithContext(ctx context.Context) PhpAppLayerOutput
}

func (*PhpAppLayer) ElementType() reflect.Type {
	return reflect.TypeOf((**PhpAppLayer)(nil)).Elem()
}

func (i *PhpAppLayer) ToPhpAppLayerOutput() PhpAppLayerOutput {
	return i.ToPhpAppLayerOutputWithContext(context.Background())
}

func (i *PhpAppLayer) ToPhpAppLayerOutputWithContext(ctx context.Context) PhpAppLayerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhpAppLayerOutput)
}

// PhpAppLayerArrayInput is an input type that accepts PhpAppLayerArray and PhpAppLayerArrayOutput values.
// You can construct a concrete instance of `PhpAppLayerArrayInput` via:
//
//	PhpAppLayerArray{ PhpAppLayerArgs{...} }
type PhpAppLayerArrayInput interface {
	pulumi.Input

	ToPhpAppLayerArrayOutput() PhpAppLayerArrayOutput
	ToPhpAppLayerArrayOutputWithContext(context.Context) PhpAppLayerArrayOutput
}

type PhpAppLayerArray []PhpAppLayerInput

func (PhpAppLayerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PhpAppLayer)(nil)).Elem()
}

func (i PhpAppLayerArray) ToPhpAppLayerArrayOutput() PhpAppLayerArrayOutput {
	return i.ToPhpAppLayerArrayOutputWithContext(context.Background())
}

func (i PhpAppLayerArray) ToPhpAppLayerArrayOutputWithContext(ctx context.Context) PhpAppLayerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhpAppLayerArrayOutput)
}

// PhpAppLayerMapInput is an input type that accepts PhpAppLayerMap and PhpAppLayerMapOutput values.
// You can construct a concrete instance of `PhpAppLayerMapInput` via:
//
//	PhpAppLayerMap{ "key": PhpAppLayerArgs{...} }
type PhpAppLayerMapInput interface {
	pulumi.Input

	ToPhpAppLayerMapOutput() PhpAppLayerMapOutput
	ToPhpAppLayerMapOutputWithContext(context.Context) PhpAppLayerMapOutput
}

type PhpAppLayerMap map[string]PhpAppLayerInput

func (PhpAppLayerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PhpAppLayer)(nil)).Elem()
}

func (i PhpAppLayerMap) ToPhpAppLayerMapOutput() PhpAppLayerMapOutput {
	return i.ToPhpAppLayerMapOutputWithContext(context.Background())
}

func (i PhpAppLayerMap) ToPhpAppLayerMapOutputWithContext(ctx context.Context) PhpAppLayerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PhpAppLayerMapOutput)
}

type PhpAppLayerOutput struct{ *pulumi.OutputState }

func (PhpAppLayerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PhpAppLayer)(nil)).Elem()
}

func (o PhpAppLayerOutput) ToPhpAppLayerOutput() PhpAppLayerOutput {
	return o
}

func (o PhpAppLayerOutput) ToPhpAppLayerOutputWithContext(ctx context.Context) PhpAppLayerOutput {
	return o
}

// The Amazon Resource Name(ARN) of the layer.
func (o PhpAppLayerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether to automatically assign an elastic IP address to the layer's instances.
func (o PhpAppLayerOutput) AutoAssignElasticIps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.AutoAssignElasticIps }).(pulumi.BoolPtrOutput)
}

// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
func (o PhpAppLayerOutput) AutoAssignPublicIps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.AutoAssignPublicIps }).(pulumi.BoolPtrOutput)
}

// Whether to enable auto-healing for the layer.
func (o PhpAppLayerOutput) AutoHealing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.AutoHealing }).(pulumi.BoolPtrOutput)
}

func (o PhpAppLayerOutput) CloudwatchConfiguration() PhpAppLayerCloudwatchConfigurationPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) PhpAppLayerCloudwatchConfigurationPtrOutput { return v.CloudwatchConfiguration }).(PhpAppLayerCloudwatchConfigurationPtrOutput)
}

func (o PhpAppLayerOutput) CustomConfigureRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomConfigureRecipes }).(pulumi.StringArrayOutput)
}

func (o PhpAppLayerOutput) CustomDeployRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomDeployRecipes }).(pulumi.StringArrayOutput)
}

// The ARN of an IAM profile that will be used for the layer's instances.
func (o PhpAppLayerOutput) CustomInstanceProfileArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringPtrOutput { return v.CustomInstanceProfileArn }).(pulumi.StringPtrOutput)
}

// Custom JSON attributes to apply to the layer.
func (o PhpAppLayerOutput) CustomJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringPtrOutput { return v.CustomJson }).(pulumi.StringPtrOutput)
}

// Ids for a set of security groups to apply to the layer's instances.
func (o PhpAppLayerOutput) CustomSecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomSecurityGroupIds }).(pulumi.StringArrayOutput)
}

func (o PhpAppLayerOutput) CustomSetupRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomSetupRecipes }).(pulumi.StringArrayOutput)
}

func (o PhpAppLayerOutput) CustomShutdownRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomShutdownRecipes }).(pulumi.StringArrayOutput)
}

func (o PhpAppLayerOutput) CustomUndeployRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.CustomUndeployRecipes }).(pulumi.StringArrayOutput)
}

// Whether to enable Elastic Load Balancing connection draining.
func (o PhpAppLayerOutput) DrainElbOnShutdown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.DrainElbOnShutdown }).(pulumi.BoolPtrOutput)
}

// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
func (o PhpAppLayerOutput) EbsVolumes() PhpAppLayerEbsVolumeArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) PhpAppLayerEbsVolumeArrayOutput { return v.EbsVolumes }).(PhpAppLayerEbsVolumeArrayOutput)
}

// Name of an Elastic Load Balancer to attach to this layer
func (o PhpAppLayerOutput) ElasticLoadBalancer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringPtrOutput { return v.ElasticLoadBalancer }).(pulumi.StringPtrOutput)
}

// Whether to install OS and package updates on each instance when it boots.
func (o PhpAppLayerOutput) InstallUpdatesOnBoot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.InstallUpdatesOnBoot }).(pulumi.BoolPtrOutput)
}

// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
func (o PhpAppLayerOutput) InstanceShutdownTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.IntPtrOutput { return v.InstanceShutdownTimeout }).(pulumi.IntPtrOutput)
}

func (o PhpAppLayerOutput) LoadBasedAutoScaling() PhpAppLayerLoadBasedAutoScalingOutput {
	return o.ApplyT(func(v *PhpAppLayer) PhpAppLayerLoadBasedAutoScalingOutput { return v.LoadBasedAutoScaling }).(PhpAppLayerLoadBasedAutoScalingOutput)
}

// A human-readable name for the layer.
func (o PhpAppLayerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the stack the layer will belong to.
func (o PhpAppLayerOutput) StackId() pulumi.StringOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringOutput { return v.StackId }).(pulumi.StringOutput)
}

// Names of a set of system packages to install on the layer's instances.
func (o PhpAppLayerOutput) SystemPackages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringArrayOutput { return v.SystemPackages }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
//
// The following extra optional arguments, all lists of Chef recipe names, allow
// custom Chef recipes to be applied to layer instances at the five different
// lifecycle events, if custom cookbooks are enabled on the layer's stack:
func (o PhpAppLayerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o PhpAppLayerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Whether to use EBS-optimized instances.
func (o PhpAppLayerOutput) UseEbsOptimizedInstances() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PhpAppLayer) pulumi.BoolPtrOutput { return v.UseEbsOptimizedInstances }).(pulumi.BoolPtrOutput)
}

type PhpAppLayerArrayOutput struct{ *pulumi.OutputState }

func (PhpAppLayerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PhpAppLayer)(nil)).Elem()
}

func (o PhpAppLayerArrayOutput) ToPhpAppLayerArrayOutput() PhpAppLayerArrayOutput {
	return o
}

func (o PhpAppLayerArrayOutput) ToPhpAppLayerArrayOutputWithContext(ctx context.Context) PhpAppLayerArrayOutput {
	return o
}

func (o PhpAppLayerArrayOutput) Index(i pulumi.IntInput) PhpAppLayerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PhpAppLayer {
		return vs[0].([]*PhpAppLayer)[vs[1].(int)]
	}).(PhpAppLayerOutput)
}

type PhpAppLayerMapOutput struct{ *pulumi.OutputState }

func (PhpAppLayerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PhpAppLayer)(nil)).Elem()
}

func (o PhpAppLayerMapOutput) ToPhpAppLayerMapOutput() PhpAppLayerMapOutput {
	return o
}

func (o PhpAppLayerMapOutput) ToPhpAppLayerMapOutputWithContext(ctx context.Context) PhpAppLayerMapOutput {
	return o
}

func (o PhpAppLayerMapOutput) MapIndex(k pulumi.StringInput) PhpAppLayerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PhpAppLayer {
		return vs[0].(map[string]*PhpAppLayer)[vs[1].(string)]
	}).(PhpAppLayerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PhpAppLayerInput)(nil)).Elem(), &PhpAppLayer{})
	pulumi.RegisterInputType(reflect.TypeOf((*PhpAppLayerArrayInput)(nil)).Elem(), PhpAppLayerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PhpAppLayerMapInput)(nil)).Elem(), PhpAppLayerMap{})
	pulumi.RegisterOutputType(PhpAppLayerOutput{})
	pulumi.RegisterOutputType(PhpAppLayerArrayOutput{})
	pulumi.RegisterOutputType(PhpAppLayerMapOutput{})
}
