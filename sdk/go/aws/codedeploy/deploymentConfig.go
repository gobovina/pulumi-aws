// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package codedeploy

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CodeDeploy deployment config for an application
//
// ## Example Usage
// ### Server Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/codedeploy"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooDeploymentConfig, err := codedeploy.NewDeploymentConfig(ctx, "fooDeploymentConfig", &codedeploy.DeploymentConfigArgs{
// 			DeploymentConfigName: pulumi.String("test-deployment-config"),
// 			MinimumHealthyHosts: &codedeploy.DeploymentConfigMinimumHealthyHostsArgs{
// 				Type:  pulumi.String("HOST_COUNT"),
// 				Value: pulumi.Int(2),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = codedeploy.NewDeploymentGroup(ctx, "fooDeploymentGroup", &codedeploy.DeploymentGroupArgs{
// 			AppName:              pulumi.Any(aws_codedeploy_app.Foo_app.Name),
// 			DeploymentGroupName:  pulumi.String("bar"),
// 			ServiceRoleArn:       pulumi.Any(aws_iam_role.Foo_role.Arn),
// 			DeploymentConfigName: fooDeploymentConfig.ID(),
// 			Ec2TagFilters: codedeploy.DeploymentGroupEc2TagFilterArray{
// 				&codedeploy.DeploymentGroupEc2TagFilterArgs{
// 					Key:   pulumi.String("filterkey"),
// 					Type:  pulumi.String("KEY_AND_VALUE"),
// 					Value: pulumi.String("filtervalue"),
// 				},
// 			},
// 			TriggerConfigurations: codedeploy.DeploymentGroupTriggerConfigurationArray{
// 				&codedeploy.DeploymentGroupTriggerConfigurationArgs{
// 					TriggerEvents: pulumi.StringArray{
// 						pulumi.String("DeploymentFailure"),
// 					},
// 					TriggerName:      pulumi.String("foo-trigger"),
// 					TriggerTargetArn: pulumi.String("foo-topic-arn"),
// 				},
// 			},
// 			AutoRollbackConfiguration: &codedeploy.DeploymentGroupAutoRollbackConfigurationArgs{
// 				Enabled: pulumi.Bool(true),
// 				Events: pulumi.StringArray{
// 					pulumi.String("DEPLOYMENT_FAILURE"),
// 				},
// 			},
// 			AlarmConfiguration: &codedeploy.DeploymentGroupAlarmConfigurationArgs{
// 				Alarms: pulumi.StringArray{
// 					pulumi.String("my-alarm-name"),
// 				},
// 				Enabled: pulumi.Bool(true),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Lambda Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/codedeploy"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooDeploymentConfig, err := codedeploy.NewDeploymentConfig(ctx, "fooDeploymentConfig", &codedeploy.DeploymentConfigArgs{
// 			DeploymentConfigName: pulumi.String("test-deployment-config"),
// 			ComputePlatform:      pulumi.String("Lambda"),
// 			TrafficRoutingConfig: &codedeploy.DeploymentConfigTrafficRoutingConfigArgs{
// 				Type: pulumi.String("TimeBasedLinear"),
// 				TimeBasedLinear: &codedeploy.DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs{
// 					Interval:   pulumi.Int(10),
// 					Percentage: pulumi.Int(10),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = codedeploy.NewDeploymentGroup(ctx, "fooDeploymentGroup", &codedeploy.DeploymentGroupArgs{
// 			AppName:              pulumi.Any(aws_codedeploy_app.Foo_app.Name),
// 			DeploymentGroupName:  pulumi.String("bar"),
// 			ServiceRoleArn:       pulumi.Any(aws_iam_role.Foo_role.Arn),
// 			DeploymentConfigName: fooDeploymentConfig.ID(),
// 			AutoRollbackConfiguration: &codedeploy.DeploymentGroupAutoRollbackConfigurationArgs{
// 				Enabled: pulumi.Bool(true),
// 				Events: pulumi.StringArray{
// 					pulumi.String("DEPLOYMENT_STOP_ON_ALARM"),
// 				},
// 			},
// 			AlarmConfiguration: &codedeploy.DeploymentGroupAlarmConfigurationArgs{
// 				Alarms: pulumi.StringArray{
// 					pulumi.String("my-alarm-name"),
// 				},
// 				Enabled: pulumi.Bool(true),
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
// CodeDeploy Deployment Configurations can be imported using the `deployment_config_name`, e.g.
//
// ```sh
//  $ pulumi import aws:codedeploy/deploymentConfig:DeploymentConfig example my-deployment-config
// ```
type DeploymentConfig struct {
	pulumi.CustomResourceState

	// The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
	ComputePlatform pulumi.StringPtrOutput `pulumi:"computePlatform"`
	// The AWS Assigned deployment config id
	DeploymentConfigId pulumi.StringOutput `pulumi:"deploymentConfigId"`
	// The name of the deployment config.
	DeploymentConfigName pulumi.StringOutput `pulumi:"deploymentConfigName"`
	// A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
	MinimumHealthyHosts DeploymentConfigMinimumHealthyHostsPtrOutput `pulumi:"minimumHealthyHosts"`
	// A trafficRoutingConfig block. Traffic Routing Config is documented below.
	TrafficRoutingConfig DeploymentConfigTrafficRoutingConfigPtrOutput `pulumi:"trafficRoutingConfig"`
}

// NewDeploymentConfig registers a new resource with the given unique name, arguments, and options.
func NewDeploymentConfig(ctx *pulumi.Context,
	name string, args *DeploymentConfigArgs, opts ...pulumi.ResourceOption) (*DeploymentConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentConfigName == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentConfigName'")
	}
	var resource DeploymentConfig
	err := ctx.RegisterResource("aws:codedeploy/deploymentConfig:DeploymentConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentConfig gets an existing DeploymentConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentConfigState, opts ...pulumi.ResourceOption) (*DeploymentConfig, error) {
	var resource DeploymentConfig
	err := ctx.ReadResource("aws:codedeploy/deploymentConfig:DeploymentConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentConfig resources.
type deploymentConfigState struct {
	// The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
	ComputePlatform *string `pulumi:"computePlatform"`
	// The AWS Assigned deployment config id
	DeploymentConfigId *string `pulumi:"deploymentConfigId"`
	// The name of the deployment config.
	DeploymentConfigName *string `pulumi:"deploymentConfigName"`
	// A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
	MinimumHealthyHosts *DeploymentConfigMinimumHealthyHosts `pulumi:"minimumHealthyHosts"`
	// A trafficRoutingConfig block. Traffic Routing Config is documented below.
	TrafficRoutingConfig *DeploymentConfigTrafficRoutingConfig `pulumi:"trafficRoutingConfig"`
}

type DeploymentConfigState struct {
	// The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
	ComputePlatform pulumi.StringPtrInput
	// The AWS Assigned deployment config id
	DeploymentConfigId pulumi.StringPtrInput
	// The name of the deployment config.
	DeploymentConfigName pulumi.StringPtrInput
	// A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
	MinimumHealthyHosts DeploymentConfigMinimumHealthyHostsPtrInput
	// A trafficRoutingConfig block. Traffic Routing Config is documented below.
	TrafficRoutingConfig DeploymentConfigTrafficRoutingConfigPtrInput
}

func (DeploymentConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentConfigState)(nil)).Elem()
}

type deploymentConfigArgs struct {
	// The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
	ComputePlatform *string `pulumi:"computePlatform"`
	// The name of the deployment config.
	DeploymentConfigName string `pulumi:"deploymentConfigName"`
	// A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
	MinimumHealthyHosts *DeploymentConfigMinimumHealthyHosts `pulumi:"minimumHealthyHosts"`
	// A trafficRoutingConfig block. Traffic Routing Config is documented below.
	TrafficRoutingConfig *DeploymentConfigTrafficRoutingConfig `pulumi:"trafficRoutingConfig"`
}

// The set of arguments for constructing a DeploymentConfig resource.
type DeploymentConfigArgs struct {
	// The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
	ComputePlatform pulumi.StringPtrInput
	// The name of the deployment config.
	DeploymentConfigName pulumi.StringInput
	// A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
	MinimumHealthyHosts DeploymentConfigMinimumHealthyHostsPtrInput
	// A trafficRoutingConfig block. Traffic Routing Config is documented below.
	TrafficRoutingConfig DeploymentConfigTrafficRoutingConfigPtrInput
}

func (DeploymentConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentConfigArgs)(nil)).Elem()
}

type DeploymentConfigInput interface {
	pulumi.Input

	ToDeploymentConfigOutput() DeploymentConfigOutput
	ToDeploymentConfigOutputWithContext(ctx context.Context) DeploymentConfigOutput
}

func (*DeploymentConfig) ElementType() reflect.Type {
	return reflect.TypeOf((*DeploymentConfig)(nil))
}

func (i *DeploymentConfig) ToDeploymentConfigOutput() DeploymentConfigOutput {
	return i.ToDeploymentConfigOutputWithContext(context.Background())
}

func (i *DeploymentConfig) ToDeploymentConfigOutputWithContext(ctx context.Context) DeploymentConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentConfigOutput)
}

func (i *DeploymentConfig) ToDeploymentConfigPtrOutput() DeploymentConfigPtrOutput {
	return i.ToDeploymentConfigPtrOutputWithContext(context.Background())
}

func (i *DeploymentConfig) ToDeploymentConfigPtrOutputWithContext(ctx context.Context) DeploymentConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentConfigPtrOutput)
}

type DeploymentConfigPtrInput interface {
	pulumi.Input

	ToDeploymentConfigPtrOutput() DeploymentConfigPtrOutput
	ToDeploymentConfigPtrOutputWithContext(ctx context.Context) DeploymentConfigPtrOutput
}

type deploymentConfigPtrType DeploymentConfigArgs

func (*deploymentConfigPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentConfig)(nil))
}

func (i *deploymentConfigPtrType) ToDeploymentConfigPtrOutput() DeploymentConfigPtrOutput {
	return i.ToDeploymentConfigPtrOutputWithContext(context.Background())
}

func (i *deploymentConfigPtrType) ToDeploymentConfigPtrOutputWithContext(ctx context.Context) DeploymentConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentConfigPtrOutput)
}

// DeploymentConfigArrayInput is an input type that accepts DeploymentConfigArray and DeploymentConfigArrayOutput values.
// You can construct a concrete instance of `DeploymentConfigArrayInput` via:
//
//          DeploymentConfigArray{ DeploymentConfigArgs{...} }
type DeploymentConfigArrayInput interface {
	pulumi.Input

	ToDeploymentConfigArrayOutput() DeploymentConfigArrayOutput
	ToDeploymentConfigArrayOutputWithContext(context.Context) DeploymentConfigArrayOutput
}

type DeploymentConfigArray []DeploymentConfigInput

func (DeploymentConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*DeploymentConfig)(nil))
}

func (i DeploymentConfigArray) ToDeploymentConfigArrayOutput() DeploymentConfigArrayOutput {
	return i.ToDeploymentConfigArrayOutputWithContext(context.Background())
}

func (i DeploymentConfigArray) ToDeploymentConfigArrayOutputWithContext(ctx context.Context) DeploymentConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentConfigArrayOutput)
}

// DeploymentConfigMapInput is an input type that accepts DeploymentConfigMap and DeploymentConfigMapOutput values.
// You can construct a concrete instance of `DeploymentConfigMapInput` via:
//
//          DeploymentConfigMap{ "key": DeploymentConfigArgs{...} }
type DeploymentConfigMapInput interface {
	pulumi.Input

	ToDeploymentConfigMapOutput() DeploymentConfigMapOutput
	ToDeploymentConfigMapOutputWithContext(context.Context) DeploymentConfigMapOutput
}

type DeploymentConfigMap map[string]DeploymentConfigInput

func (DeploymentConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*DeploymentConfig)(nil))
}

func (i DeploymentConfigMap) ToDeploymentConfigMapOutput() DeploymentConfigMapOutput {
	return i.ToDeploymentConfigMapOutputWithContext(context.Background())
}

func (i DeploymentConfigMap) ToDeploymentConfigMapOutputWithContext(ctx context.Context) DeploymentConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentConfigMapOutput)
}

type DeploymentConfigOutput struct {
	*pulumi.OutputState
}

func (DeploymentConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DeploymentConfig)(nil))
}

func (o DeploymentConfigOutput) ToDeploymentConfigOutput() DeploymentConfigOutput {
	return o
}

func (o DeploymentConfigOutput) ToDeploymentConfigOutputWithContext(ctx context.Context) DeploymentConfigOutput {
	return o
}

func (o DeploymentConfigOutput) ToDeploymentConfigPtrOutput() DeploymentConfigPtrOutput {
	return o.ToDeploymentConfigPtrOutputWithContext(context.Background())
}

func (o DeploymentConfigOutput) ToDeploymentConfigPtrOutputWithContext(ctx context.Context) DeploymentConfigPtrOutput {
	return o.ApplyT(func(v DeploymentConfig) *DeploymentConfig {
		return &v
	}).(DeploymentConfigPtrOutput)
}

type DeploymentConfigPtrOutput struct {
	*pulumi.OutputState
}

func (DeploymentConfigPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentConfig)(nil))
}

func (o DeploymentConfigPtrOutput) ToDeploymentConfigPtrOutput() DeploymentConfigPtrOutput {
	return o
}

func (o DeploymentConfigPtrOutput) ToDeploymentConfigPtrOutputWithContext(ctx context.Context) DeploymentConfigPtrOutput {
	return o
}

type DeploymentConfigArrayOutput struct{ *pulumi.OutputState }

func (DeploymentConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DeploymentConfig)(nil))
}

func (o DeploymentConfigArrayOutput) ToDeploymentConfigArrayOutput() DeploymentConfigArrayOutput {
	return o
}

func (o DeploymentConfigArrayOutput) ToDeploymentConfigArrayOutputWithContext(ctx context.Context) DeploymentConfigArrayOutput {
	return o
}

func (o DeploymentConfigArrayOutput) Index(i pulumi.IntInput) DeploymentConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DeploymentConfig {
		return vs[0].([]DeploymentConfig)[vs[1].(int)]
	}).(DeploymentConfigOutput)
}

type DeploymentConfigMapOutput struct{ *pulumi.OutputState }

func (DeploymentConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DeploymentConfig)(nil))
}

func (o DeploymentConfigMapOutput) ToDeploymentConfigMapOutput() DeploymentConfigMapOutput {
	return o
}

func (o DeploymentConfigMapOutput) ToDeploymentConfigMapOutputWithContext(ctx context.Context) DeploymentConfigMapOutput {
	return o
}

func (o DeploymentConfigMapOutput) MapIndex(k pulumi.StringInput) DeploymentConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DeploymentConfig {
		return vs[0].(map[string]DeploymentConfig)[vs[1].(string)]
	}).(DeploymentConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(DeploymentConfigOutput{})
	pulumi.RegisterOutputType(DeploymentConfigPtrOutput{})
	pulumi.RegisterOutputType(DeploymentConfigArrayOutput{})
	pulumi.RegisterOutputType(DeploymentConfigMapOutput{})
}
