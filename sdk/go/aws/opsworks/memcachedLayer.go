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

// Provides an OpsWorks memcached layer resource.
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
//			_, err := opsworks.NewMemcachedLayer(ctx, "cache", &opsworks.MemcachedLayerArgs{
//				StackId: pulumi.Any(aws_opsworks_stack.Main.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type MemcachedLayer struct {
	pulumi.CustomResourceState

	// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
	AllocatedMemory pulumi.IntPtrOutput `pulumi:"allocatedMemory"`
	// The Amazon Resource Name(ARN) of the layer.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrOutput `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrOutput `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrOutput                           `pulumi:"autoHealing"`
	CloudwatchConfiguration MemcachedLayerCloudwatchConfigurationPtrOutput `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  pulumi.StringArrayOutput                       `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     pulumi.StringArrayOutput                       `pulumi:"customDeployRecipes"`
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
	EbsVolumes MemcachedLayerEbsVolumeArrayOutput `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrOutput `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrOutput `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrOutput                      `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    MemcachedLayerLoadBasedAutoScalingOutput `pulumi:"loadBasedAutoScaling"`
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

// NewMemcachedLayer registers a new resource with the given unique name, arguments, and options.
func NewMemcachedLayer(ctx *pulumi.Context,
	name string, args *MemcachedLayerArgs, opts ...pulumi.ResourceOption) (*MemcachedLayer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StackId == nil {
		return nil, errors.New("invalid value for required argument 'StackId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MemcachedLayer
	err := ctx.RegisterResource("aws:opsworks/memcachedLayer:MemcachedLayer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMemcachedLayer gets an existing MemcachedLayer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMemcachedLayer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MemcachedLayerState, opts ...pulumi.ResourceOption) (*MemcachedLayer, error) {
	var resource MemcachedLayer
	err := ctx.ReadResource("aws:opsworks/memcachedLayer:MemcachedLayer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MemcachedLayer resources.
type memcachedLayerState struct {
	// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
	AllocatedMemory *int `pulumi:"allocatedMemory"`
	// The Amazon Resource Name(ARN) of the layer.
	Arn *string `pulumi:"arn"`
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps *bool `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps *bool `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             *bool                                  `pulumi:"autoHealing"`
	CloudwatchConfiguration *MemcachedLayerCloudwatchConfiguration `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  []string                               `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     []string                               `pulumi:"customDeployRecipes"`
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
	EbsVolumes []MemcachedLayerEbsVolume `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer *string `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot *bool `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout *int                                `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    *MemcachedLayerLoadBasedAutoScaling `pulumi:"loadBasedAutoScaling"`
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

type MemcachedLayerState struct {
	// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
	AllocatedMemory pulumi.IntPtrInput
	// The Amazon Resource Name(ARN) of the layer.
	Arn pulumi.StringPtrInput
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrInput
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrInput
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrInput
	CloudwatchConfiguration MemcachedLayerCloudwatchConfigurationPtrInput
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
	EbsVolumes MemcachedLayerEbsVolumeArrayInput
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrInput
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrInput
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrInput
	LoadBasedAutoScaling    MemcachedLayerLoadBasedAutoScalingPtrInput
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

func (MemcachedLayerState) ElementType() reflect.Type {
	return reflect.TypeOf((*memcachedLayerState)(nil)).Elem()
}

type memcachedLayerArgs struct {
	// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
	AllocatedMemory *int `pulumi:"allocatedMemory"`
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps *bool `pulumi:"autoAssignElasticIps"`
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps *bool `pulumi:"autoAssignPublicIps"`
	// Whether to enable auto-healing for the layer.
	AutoHealing             *bool                                  `pulumi:"autoHealing"`
	CloudwatchConfiguration *MemcachedLayerCloudwatchConfiguration `pulumi:"cloudwatchConfiguration"`
	CustomConfigureRecipes  []string                               `pulumi:"customConfigureRecipes"`
	CustomDeployRecipes     []string                               `pulumi:"customDeployRecipes"`
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
	EbsVolumes []MemcachedLayerEbsVolume `pulumi:"ebsVolumes"`
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer *string `pulumi:"elasticLoadBalancer"`
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot *bool `pulumi:"installUpdatesOnBoot"`
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout *int                                `pulumi:"instanceShutdownTimeout"`
	LoadBasedAutoScaling    *MemcachedLayerLoadBasedAutoScaling `pulumi:"loadBasedAutoScaling"`
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

// The set of arguments for constructing a MemcachedLayer resource.
type MemcachedLayerArgs struct {
	// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
	AllocatedMemory pulumi.IntPtrInput
	// Whether to automatically assign an elastic IP address to the layer's instances.
	AutoAssignElasticIps pulumi.BoolPtrInput
	// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
	AutoAssignPublicIps pulumi.BoolPtrInput
	// Whether to enable auto-healing for the layer.
	AutoHealing             pulumi.BoolPtrInput
	CloudwatchConfiguration MemcachedLayerCloudwatchConfigurationPtrInput
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
	EbsVolumes MemcachedLayerEbsVolumeArrayInput
	// Name of an Elastic Load Balancer to attach to this layer
	ElasticLoadBalancer pulumi.StringPtrInput
	// Whether to install OS and package updates on each instance when it boots.
	InstallUpdatesOnBoot pulumi.BoolPtrInput
	// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
	InstanceShutdownTimeout pulumi.IntPtrInput
	LoadBasedAutoScaling    MemcachedLayerLoadBasedAutoScalingPtrInput
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

func (MemcachedLayerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*memcachedLayerArgs)(nil)).Elem()
}

type MemcachedLayerInput interface {
	pulumi.Input

	ToMemcachedLayerOutput() MemcachedLayerOutput
	ToMemcachedLayerOutputWithContext(ctx context.Context) MemcachedLayerOutput
}

func (*MemcachedLayer) ElementType() reflect.Type {
	return reflect.TypeOf((**MemcachedLayer)(nil)).Elem()
}

func (i *MemcachedLayer) ToMemcachedLayerOutput() MemcachedLayerOutput {
	return i.ToMemcachedLayerOutputWithContext(context.Background())
}

func (i *MemcachedLayer) ToMemcachedLayerOutputWithContext(ctx context.Context) MemcachedLayerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemcachedLayerOutput)
}

// MemcachedLayerArrayInput is an input type that accepts MemcachedLayerArray and MemcachedLayerArrayOutput values.
// You can construct a concrete instance of `MemcachedLayerArrayInput` via:
//
//	MemcachedLayerArray{ MemcachedLayerArgs{...} }
type MemcachedLayerArrayInput interface {
	pulumi.Input

	ToMemcachedLayerArrayOutput() MemcachedLayerArrayOutput
	ToMemcachedLayerArrayOutputWithContext(context.Context) MemcachedLayerArrayOutput
}

type MemcachedLayerArray []MemcachedLayerInput

func (MemcachedLayerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MemcachedLayer)(nil)).Elem()
}

func (i MemcachedLayerArray) ToMemcachedLayerArrayOutput() MemcachedLayerArrayOutput {
	return i.ToMemcachedLayerArrayOutputWithContext(context.Background())
}

func (i MemcachedLayerArray) ToMemcachedLayerArrayOutputWithContext(ctx context.Context) MemcachedLayerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemcachedLayerArrayOutput)
}

// MemcachedLayerMapInput is an input type that accepts MemcachedLayerMap and MemcachedLayerMapOutput values.
// You can construct a concrete instance of `MemcachedLayerMapInput` via:
//
//	MemcachedLayerMap{ "key": MemcachedLayerArgs{...} }
type MemcachedLayerMapInput interface {
	pulumi.Input

	ToMemcachedLayerMapOutput() MemcachedLayerMapOutput
	ToMemcachedLayerMapOutputWithContext(context.Context) MemcachedLayerMapOutput
}

type MemcachedLayerMap map[string]MemcachedLayerInput

func (MemcachedLayerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MemcachedLayer)(nil)).Elem()
}

func (i MemcachedLayerMap) ToMemcachedLayerMapOutput() MemcachedLayerMapOutput {
	return i.ToMemcachedLayerMapOutputWithContext(context.Background())
}

func (i MemcachedLayerMap) ToMemcachedLayerMapOutputWithContext(ctx context.Context) MemcachedLayerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemcachedLayerMapOutput)
}

type MemcachedLayerOutput struct{ *pulumi.OutputState }

func (MemcachedLayerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MemcachedLayer)(nil)).Elem()
}

func (o MemcachedLayerOutput) ToMemcachedLayerOutput() MemcachedLayerOutput {
	return o
}

func (o MemcachedLayerOutput) ToMemcachedLayerOutputWithContext(ctx context.Context) MemcachedLayerOutput {
	return o
}

// Amount of memory to allocate for the cache on each instance, in megabytes. Defaults to 512MB.
func (o MemcachedLayerOutput) AllocatedMemory() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.IntPtrOutput { return v.AllocatedMemory }).(pulumi.IntPtrOutput)
}

// The Amazon Resource Name(ARN) of the layer.
func (o MemcachedLayerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether to automatically assign an elastic IP address to the layer's instances.
func (o MemcachedLayerOutput) AutoAssignElasticIps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.AutoAssignElasticIps }).(pulumi.BoolPtrOutput)
}

// For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
func (o MemcachedLayerOutput) AutoAssignPublicIps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.AutoAssignPublicIps }).(pulumi.BoolPtrOutput)
}

// Whether to enable auto-healing for the layer.
func (o MemcachedLayerOutput) AutoHealing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.AutoHealing }).(pulumi.BoolPtrOutput)
}

func (o MemcachedLayerOutput) CloudwatchConfiguration() MemcachedLayerCloudwatchConfigurationPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) MemcachedLayerCloudwatchConfigurationPtrOutput {
		return v.CloudwatchConfiguration
	}).(MemcachedLayerCloudwatchConfigurationPtrOutput)
}

func (o MemcachedLayerOutput) CustomConfigureRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomConfigureRecipes }).(pulumi.StringArrayOutput)
}

func (o MemcachedLayerOutput) CustomDeployRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomDeployRecipes }).(pulumi.StringArrayOutput)
}

// The ARN of an IAM profile that will be used for the layer's instances.
func (o MemcachedLayerOutput) CustomInstanceProfileArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringPtrOutput { return v.CustomInstanceProfileArn }).(pulumi.StringPtrOutput)
}

// Custom JSON attributes to apply to the layer.
func (o MemcachedLayerOutput) CustomJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringPtrOutput { return v.CustomJson }).(pulumi.StringPtrOutput)
}

// Ids for a set of security groups to apply to the layer's instances.
func (o MemcachedLayerOutput) CustomSecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomSecurityGroupIds }).(pulumi.StringArrayOutput)
}

func (o MemcachedLayerOutput) CustomSetupRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomSetupRecipes }).(pulumi.StringArrayOutput)
}

func (o MemcachedLayerOutput) CustomShutdownRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomShutdownRecipes }).(pulumi.StringArrayOutput)
}

func (o MemcachedLayerOutput) CustomUndeployRecipes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.CustomUndeployRecipes }).(pulumi.StringArrayOutput)
}

// Whether to enable Elastic Load Balancing connection draining.
func (o MemcachedLayerOutput) DrainElbOnShutdown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.DrainElbOnShutdown }).(pulumi.BoolPtrOutput)
}

// `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
func (o MemcachedLayerOutput) EbsVolumes() MemcachedLayerEbsVolumeArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) MemcachedLayerEbsVolumeArrayOutput { return v.EbsVolumes }).(MemcachedLayerEbsVolumeArrayOutput)
}

// Name of an Elastic Load Balancer to attach to this layer
func (o MemcachedLayerOutput) ElasticLoadBalancer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringPtrOutput { return v.ElasticLoadBalancer }).(pulumi.StringPtrOutput)
}

// Whether to install OS and package updates on each instance when it boots.
func (o MemcachedLayerOutput) InstallUpdatesOnBoot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.InstallUpdatesOnBoot }).(pulumi.BoolPtrOutput)
}

// The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
func (o MemcachedLayerOutput) InstanceShutdownTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.IntPtrOutput { return v.InstanceShutdownTimeout }).(pulumi.IntPtrOutput)
}

func (o MemcachedLayerOutput) LoadBasedAutoScaling() MemcachedLayerLoadBasedAutoScalingOutput {
	return o.ApplyT(func(v *MemcachedLayer) MemcachedLayerLoadBasedAutoScalingOutput { return v.LoadBasedAutoScaling }).(MemcachedLayerLoadBasedAutoScalingOutput)
}

// A human-readable name for the layer.
func (o MemcachedLayerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the stack the layer will belong to.
func (o MemcachedLayerOutput) StackId() pulumi.StringOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringOutput { return v.StackId }).(pulumi.StringOutput)
}

// Names of a set of system packages to install on the layer's instances.
func (o MemcachedLayerOutput) SystemPackages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringArrayOutput { return v.SystemPackages }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
//
// The following extra optional arguments, all lists of Chef recipe names, allow
// custom Chef recipes to be applied to layer instances at the five different
// lifecycle events, if custom cookbooks are enabled on the layer's stack:
func (o MemcachedLayerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o MemcachedLayerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Whether to use EBS-optimized instances.
func (o MemcachedLayerOutput) UseEbsOptimizedInstances() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MemcachedLayer) pulumi.BoolPtrOutput { return v.UseEbsOptimizedInstances }).(pulumi.BoolPtrOutput)
}

type MemcachedLayerArrayOutput struct{ *pulumi.OutputState }

func (MemcachedLayerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MemcachedLayer)(nil)).Elem()
}

func (o MemcachedLayerArrayOutput) ToMemcachedLayerArrayOutput() MemcachedLayerArrayOutput {
	return o
}

func (o MemcachedLayerArrayOutput) ToMemcachedLayerArrayOutputWithContext(ctx context.Context) MemcachedLayerArrayOutput {
	return o
}

func (o MemcachedLayerArrayOutput) Index(i pulumi.IntInput) MemcachedLayerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MemcachedLayer {
		return vs[0].([]*MemcachedLayer)[vs[1].(int)]
	}).(MemcachedLayerOutput)
}

type MemcachedLayerMapOutput struct{ *pulumi.OutputState }

func (MemcachedLayerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MemcachedLayer)(nil)).Elem()
}

func (o MemcachedLayerMapOutput) ToMemcachedLayerMapOutput() MemcachedLayerMapOutput {
	return o
}

func (o MemcachedLayerMapOutput) ToMemcachedLayerMapOutputWithContext(ctx context.Context) MemcachedLayerMapOutput {
	return o
}

func (o MemcachedLayerMapOutput) MapIndex(k pulumi.StringInput) MemcachedLayerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MemcachedLayer {
		return vs[0].(map[string]*MemcachedLayer)[vs[1].(string)]
	}).(MemcachedLayerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MemcachedLayerInput)(nil)).Elem(), &MemcachedLayer{})
	pulumi.RegisterInputType(reflect.TypeOf((*MemcachedLayerArrayInput)(nil)).Elem(), MemcachedLayerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MemcachedLayerMapInput)(nil)).Elem(), MemcachedLayerMap{})
	pulumi.RegisterOutputType(MemcachedLayerOutput{})
	pulumi.RegisterOutputType(MemcachedLayerArrayOutput{})
	pulumi.RegisterOutputType(MemcachedLayerMapOutput{})
}
