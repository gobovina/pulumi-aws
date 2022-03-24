// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ECS Task Sets can be imported via the `task_set_id`, `service`, and `cluster` separated by commas (`,`) e.g.
//
// ```sh
//  $ pulumi import aws:ecs/taskSet:TaskSet example ecs-svc/7177320696926227436,arn:aws:ecs:us-west-2:123456789101:service/example/example-1234567890,arn:aws:ecs:us-west-2:123456789101:cluster/example
// ```
type TaskSet struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) that identifies the task set.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The capacity provider strategy to use for the service. Can be one or more.  Defined below.
	CapacityProviderStrategies TaskSetCapacityProviderStrategyArrayOutput `pulumi:"capacityProviderStrategies"`
	// The short name or ARN of the cluster that hosts the service to create the task set in.
	Cluster pulumi.StringOutput `pulumi:"cluster"`
	// The external ID associated with the task set.
	ExternalId  pulumi.StringOutput  `pulumi:"externalId"`
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
	LaunchType pulumi.StringOutput `pulumi:"launchType"`
	// Details on load balancers that are used with a task set. Detailed below.
	LoadBalancers TaskSetLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
	NetworkConfiguration TaskSetNetworkConfigurationPtrOutput `pulumi:"networkConfiguration"`
	// The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
	PlatformVersion pulumi.StringOutput `pulumi:"platformVersion"`
	// A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
	Scale TaskSetScaleOutput `pulumi:"scale"`
	// The short name or ARN of the ECS service.
	Service pulumi.StringOutput `pulumi:"service"`
	// The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
	ServiceRegistries TaskSetServiceRegistriesPtrOutput `pulumi:"serviceRegistries"`
	// The stability status. This indicates whether the task set has reached a steady state.
	StabilityStatus pulumi.StringOutput `pulumi:"stabilityStatus"`
	// The status of the task set.
	Status pulumi.StringOutput `pulumi:"status"`
	// A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
	TaskDefinition pulumi.StringOutput `pulumi:"taskDefinition"`
	// The ID of the task set.
	TaskSetId       pulumi.StringOutput  `pulumi:"taskSetId"`
	WaitUntilStable pulumi.BoolPtrOutput `pulumi:"waitUntilStable"`
	// Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
	WaitUntilStableTimeout pulumi.StringPtrOutput `pulumi:"waitUntilStableTimeout"`
}

// NewTaskSet registers a new resource with the given unique name, arguments, and options.
func NewTaskSet(ctx *pulumi.Context,
	name string, args *TaskSetArgs, opts ...pulumi.ResourceOption) (*TaskSet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cluster == nil {
		return nil, errors.New("invalid value for required argument 'Cluster'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	if args.TaskDefinition == nil {
		return nil, errors.New("invalid value for required argument 'TaskDefinition'")
	}
	var resource TaskSet
	err := ctx.RegisterResource("aws:ecs/taskSet:TaskSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTaskSet gets an existing TaskSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTaskSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TaskSetState, opts ...pulumi.ResourceOption) (*TaskSet, error) {
	var resource TaskSet
	err := ctx.ReadResource("aws:ecs/taskSet:TaskSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TaskSet resources.
type taskSetState struct {
	// The Amazon Resource Name (ARN) that identifies the task set.
	Arn *string `pulumi:"arn"`
	// The capacity provider strategy to use for the service. Can be one or more.  Defined below.
	CapacityProviderStrategies []TaskSetCapacityProviderStrategy `pulumi:"capacityProviderStrategies"`
	// The short name or ARN of the cluster that hosts the service to create the task set in.
	Cluster *string `pulumi:"cluster"`
	// The external ID associated with the task set.
	ExternalId  *string `pulumi:"externalId"`
	ForceDelete *bool   `pulumi:"forceDelete"`
	// The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
	LaunchType *string `pulumi:"launchType"`
	// Details on load balancers that are used with a task set. Detailed below.
	LoadBalancers []TaskSetLoadBalancer `pulumi:"loadBalancers"`
	// The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
	NetworkConfiguration *TaskSetNetworkConfiguration `pulumi:"networkConfiguration"`
	// The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
	PlatformVersion *string `pulumi:"platformVersion"`
	// A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
	Scale *TaskSetScale `pulumi:"scale"`
	// The short name or ARN of the ECS service.
	Service *string `pulumi:"service"`
	// The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
	ServiceRegistries *TaskSetServiceRegistries `pulumi:"serviceRegistries"`
	// The stability status. This indicates whether the task set has reached a steady state.
	StabilityStatus *string `pulumi:"stabilityStatus"`
	// The status of the task set.
	Status *string `pulumi:"status"`
	// A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
	TaskDefinition *string `pulumi:"taskDefinition"`
	// The ID of the task set.
	TaskSetId       *string `pulumi:"taskSetId"`
	WaitUntilStable *bool   `pulumi:"waitUntilStable"`
	// Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
	WaitUntilStableTimeout *string `pulumi:"waitUntilStableTimeout"`
}

type TaskSetState struct {
	// The Amazon Resource Name (ARN) that identifies the task set.
	Arn pulumi.StringPtrInput
	// The capacity provider strategy to use for the service. Can be one or more.  Defined below.
	CapacityProviderStrategies TaskSetCapacityProviderStrategyArrayInput
	// The short name or ARN of the cluster that hosts the service to create the task set in.
	Cluster pulumi.StringPtrInput
	// The external ID associated with the task set.
	ExternalId  pulumi.StringPtrInput
	ForceDelete pulumi.BoolPtrInput
	// The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
	LaunchType pulumi.StringPtrInput
	// Details on load balancers that are used with a task set. Detailed below.
	LoadBalancers TaskSetLoadBalancerArrayInput
	// The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
	NetworkConfiguration TaskSetNetworkConfigurationPtrInput
	// The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
	PlatformVersion pulumi.StringPtrInput
	// A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
	Scale TaskSetScalePtrInput
	// The short name or ARN of the ECS service.
	Service pulumi.StringPtrInput
	// The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
	ServiceRegistries TaskSetServiceRegistriesPtrInput
	// The stability status. This indicates whether the task set has reached a steady state.
	StabilityStatus pulumi.StringPtrInput
	// The status of the task set.
	Status pulumi.StringPtrInput
	// A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
	TaskDefinition pulumi.StringPtrInput
	// The ID of the task set.
	TaskSetId       pulumi.StringPtrInput
	WaitUntilStable pulumi.BoolPtrInput
	// Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
	WaitUntilStableTimeout pulumi.StringPtrInput
}

func (TaskSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*taskSetState)(nil)).Elem()
}

type taskSetArgs struct {
	// The capacity provider strategy to use for the service. Can be one or more.  Defined below.
	CapacityProviderStrategies []TaskSetCapacityProviderStrategy `pulumi:"capacityProviderStrategies"`
	// The short name or ARN of the cluster that hosts the service to create the task set in.
	Cluster string `pulumi:"cluster"`
	// The external ID associated with the task set.
	ExternalId  *string `pulumi:"externalId"`
	ForceDelete *bool   `pulumi:"forceDelete"`
	// The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
	LaunchType *string `pulumi:"launchType"`
	// Details on load balancers that are used with a task set. Detailed below.
	LoadBalancers []TaskSetLoadBalancer `pulumi:"loadBalancers"`
	// The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
	NetworkConfiguration *TaskSetNetworkConfiguration `pulumi:"networkConfiguration"`
	// The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
	PlatformVersion *string `pulumi:"platformVersion"`
	// A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
	Scale *TaskSetScale `pulumi:"scale"`
	// The short name or ARN of the ECS service.
	Service string `pulumi:"service"`
	// The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
	ServiceRegistries *TaskSetServiceRegistries `pulumi:"serviceRegistries"`
	// A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
	Tags map[string]string `pulumi:"tags"`
	// The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
	TaskDefinition  string `pulumi:"taskDefinition"`
	WaitUntilStable *bool  `pulumi:"waitUntilStable"`
	// Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
	WaitUntilStableTimeout *string `pulumi:"waitUntilStableTimeout"`
}

// The set of arguments for constructing a TaskSet resource.
type TaskSetArgs struct {
	// The capacity provider strategy to use for the service. Can be one or more.  Defined below.
	CapacityProviderStrategies TaskSetCapacityProviderStrategyArrayInput
	// The short name or ARN of the cluster that hosts the service to create the task set in.
	Cluster pulumi.StringInput
	// The external ID associated with the task set.
	ExternalId  pulumi.StringPtrInput
	ForceDelete pulumi.BoolPtrInput
	// The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
	LaunchType pulumi.StringPtrInput
	// Details on load balancers that are used with a task set. Detailed below.
	LoadBalancers TaskSetLoadBalancerArrayInput
	// The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
	NetworkConfiguration TaskSetNetworkConfigurationPtrInput
	// The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
	PlatformVersion pulumi.StringPtrInput
	// A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
	Scale TaskSetScalePtrInput
	// The short name or ARN of the ECS service.
	Service pulumi.StringInput
	// The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`. Detailed below.
	ServiceRegistries TaskSetServiceRegistriesPtrInput
	// A map of tags to assign to the file system. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copyTagsToBackups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
	Tags pulumi.StringMapInput
	// The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
	TaskDefinition  pulumi.StringInput
	WaitUntilStable pulumi.BoolPtrInput
	// Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
	WaitUntilStableTimeout pulumi.StringPtrInput
}

func (TaskSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*taskSetArgs)(nil)).Elem()
}

type TaskSetInput interface {
	pulumi.Input

	ToTaskSetOutput() TaskSetOutput
	ToTaskSetOutputWithContext(ctx context.Context) TaskSetOutput
}

func (*TaskSet) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskSet)(nil)).Elem()
}

func (i *TaskSet) ToTaskSetOutput() TaskSetOutput {
	return i.ToTaskSetOutputWithContext(context.Background())
}

func (i *TaskSet) ToTaskSetOutputWithContext(ctx context.Context) TaskSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskSetOutput)
}

// TaskSetArrayInput is an input type that accepts TaskSetArray and TaskSetArrayOutput values.
// You can construct a concrete instance of `TaskSetArrayInput` via:
//
//          TaskSetArray{ TaskSetArgs{...} }
type TaskSetArrayInput interface {
	pulumi.Input

	ToTaskSetArrayOutput() TaskSetArrayOutput
	ToTaskSetArrayOutputWithContext(context.Context) TaskSetArrayOutput
}

type TaskSetArray []TaskSetInput

func (TaskSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskSet)(nil)).Elem()
}

func (i TaskSetArray) ToTaskSetArrayOutput() TaskSetArrayOutput {
	return i.ToTaskSetArrayOutputWithContext(context.Background())
}

func (i TaskSetArray) ToTaskSetArrayOutputWithContext(ctx context.Context) TaskSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskSetArrayOutput)
}

// TaskSetMapInput is an input type that accepts TaskSetMap and TaskSetMapOutput values.
// You can construct a concrete instance of `TaskSetMapInput` via:
//
//          TaskSetMap{ "key": TaskSetArgs{...} }
type TaskSetMapInput interface {
	pulumi.Input

	ToTaskSetMapOutput() TaskSetMapOutput
	ToTaskSetMapOutputWithContext(context.Context) TaskSetMapOutput
}

type TaskSetMap map[string]TaskSetInput

func (TaskSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskSet)(nil)).Elem()
}

func (i TaskSetMap) ToTaskSetMapOutput() TaskSetMapOutput {
	return i.ToTaskSetMapOutputWithContext(context.Background())
}

func (i TaskSetMap) ToTaskSetMapOutputWithContext(ctx context.Context) TaskSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskSetMapOutput)
}

type TaskSetOutput struct{ *pulumi.OutputState }

func (TaskSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskSet)(nil)).Elem()
}

func (o TaskSetOutput) ToTaskSetOutput() TaskSetOutput {
	return o
}

func (o TaskSetOutput) ToTaskSetOutputWithContext(ctx context.Context) TaskSetOutput {
	return o
}

type TaskSetArrayOutput struct{ *pulumi.OutputState }

func (TaskSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskSet)(nil)).Elem()
}

func (o TaskSetArrayOutput) ToTaskSetArrayOutput() TaskSetArrayOutput {
	return o
}

func (o TaskSetArrayOutput) ToTaskSetArrayOutputWithContext(ctx context.Context) TaskSetArrayOutput {
	return o
}

func (o TaskSetArrayOutput) Index(i pulumi.IntInput) TaskSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TaskSet {
		return vs[0].([]*TaskSet)[vs[1].(int)]
	}).(TaskSetOutput)
}

type TaskSetMapOutput struct{ *pulumi.OutputState }

func (TaskSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskSet)(nil)).Elem()
}

func (o TaskSetMapOutput) ToTaskSetMapOutput() TaskSetMapOutput {
	return o
}

func (o TaskSetMapOutput) ToTaskSetMapOutputWithContext(ctx context.Context) TaskSetMapOutput {
	return o
}

func (o TaskSetMapOutput) MapIndex(k pulumi.StringInput) TaskSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TaskSet {
		return vs[0].(map[string]*TaskSet)[vs[1].(string)]
	}).(TaskSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TaskSetInput)(nil)).Elem(), &TaskSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskSetArrayInput)(nil)).Elem(), TaskSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskSetMapInput)(nil)).Elem(), TaskSetMap{})
	pulumi.RegisterOutputType(TaskSetOutput{})
	pulumi.RegisterOutputType(TaskSetArrayOutput{})
	pulumi.RegisterOutputType(TaskSetMapOutput{})
}
