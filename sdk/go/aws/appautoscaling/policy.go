// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appautoscaling

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Application AutoScaling Policy resource.
//
// ## Example Usage
// ### DynamoDB Table Autoscaling
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appautoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			dynamodbTableReadTarget, err := appautoscaling.NewTarget(ctx, "dynamodb_table_read_target", &appautoscaling.TargetArgs{
//				MaxCapacity:       pulumi.Int(100),
//				MinCapacity:       pulumi.Int(5),
//				ResourceId:        pulumi.String("table/tableName"),
//				ScalableDimension: pulumi.String("dynamodb:table:ReadCapacityUnits"),
//				ServiceNamespace:  pulumi.String("dynamodb"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appautoscaling.NewPolicy(ctx, "dynamodb_table_read_policy", &appautoscaling.PolicyArgs{
//				Name: dynamodbTableReadTarget.ResourceId.ApplyT(func(resourceId string) (string, error) {
//					return fmt.Sprintf("DynamoDBReadCapacityUtilization:%v", resourceId), nil
//				}).(pulumi.StringOutput),
//				PolicyType:        pulumi.String("TargetTrackingScaling"),
//				ResourceId:        dynamodbTableReadTarget.ResourceId,
//				ScalableDimension: dynamodbTableReadTarget.ScalableDimension,
//				ServiceNamespace:  dynamodbTableReadTarget.ServiceNamespace,
//				TargetTrackingScalingPolicyConfiguration: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationArgs{
//					PredefinedMetricSpecification: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs{
//						PredefinedMetricType: pulumi.String("DynamoDBReadCapacityUtilization"),
//					},
//					TargetValue: pulumi.Float64(70),
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
// ### ECS Service Autoscaling
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appautoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ecsTarget, err := appautoscaling.NewTarget(ctx, "ecs_target", &appautoscaling.TargetArgs{
//				MaxCapacity:       pulumi.Int(4),
//				MinCapacity:       pulumi.Int(1),
//				ResourceId:        pulumi.String("service/clusterName/serviceName"),
//				ScalableDimension: pulumi.String("ecs:service:DesiredCount"),
//				ServiceNamespace:  pulumi.String("ecs"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appautoscaling.NewPolicy(ctx, "ecs_policy", &appautoscaling.PolicyArgs{
//				Name:              pulumi.String("scale-down"),
//				PolicyType:        pulumi.String("StepScaling"),
//				ResourceId:        ecsTarget.ResourceId,
//				ScalableDimension: ecsTarget.ScalableDimension,
//				ServiceNamespace:  ecsTarget.ServiceNamespace,
//				StepScalingPolicyConfiguration: &appautoscaling.PolicyStepScalingPolicyConfigurationArgs{
//					AdjustmentType:        pulumi.String("ChangeInCapacity"),
//					Cooldown:              pulumi.Int(60),
//					MetricAggregationType: pulumi.String("Maximum"),
//					StepAdjustments: appautoscaling.PolicyStepScalingPolicyConfigurationStepAdjustmentArray{
//						&appautoscaling.PolicyStepScalingPolicyConfigurationStepAdjustmentArgs{
//							MetricIntervalUpperBound: pulumi.String("0"),
//							ScalingAdjustment:        -1,
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
// ### Preserve desired count when updating an autoscaled ECS Service
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.NewService(ctx, "ecs_service", &ecs.ServiceArgs{
//				Name:           pulumi.String("serviceName"),
//				Cluster:        pulumi.String("clusterName"),
//				TaskDefinition: pulumi.String("taskDefinitionFamily:1"),
//				DesiredCount:   pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Aurora Read Replica Autoscaling
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appautoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			replicas, err := appautoscaling.NewTarget(ctx, "replicas", &appautoscaling.TargetArgs{
//				ServiceNamespace:  pulumi.String("rds"),
//				ScalableDimension: pulumi.String("rds:cluster:ReadReplicaCount"),
//				ResourceId:        pulumi.String(fmt.Sprintf("cluster:%v", example.Id)),
//				MinCapacity:       pulumi.Int(1),
//				MaxCapacity:       pulumi.Int(15),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appautoscaling.NewPolicy(ctx, "replicas", &appautoscaling.PolicyArgs{
//				Name:              pulumi.String("cpu-auto-scaling"),
//				ServiceNamespace:  replicas.ServiceNamespace,
//				ScalableDimension: replicas.ScalableDimension,
//				ResourceId:        replicas.ResourceId,
//				PolicyType:        pulumi.String("TargetTrackingScaling"),
//				TargetTrackingScalingPolicyConfiguration: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationArgs{
//					PredefinedMetricSpecification: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs{
//						PredefinedMetricType: pulumi.String("RDSReaderAverageCPUUtilization"),
//					},
//					TargetValue:      pulumi.Float64(75),
//					ScaleInCooldown:  pulumi.Int(300),
//					ScaleOutCooldown: pulumi.Int(300),
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
// ### Create target tracking scaling policy using metric math
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appautoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ecsTarget, err := appautoscaling.NewTarget(ctx, "ecs_target", &appautoscaling.TargetArgs{
//				MaxCapacity:       pulumi.Int(4),
//				MinCapacity:       pulumi.Int(1),
//				ResourceId:        pulumi.String("service/clusterName/serviceName"),
//				ScalableDimension: pulumi.String("ecs:service:DesiredCount"),
//				ServiceNamespace:  pulumi.String("ecs"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appautoscaling.NewPolicy(ctx, "example", &appautoscaling.PolicyArgs{
//				Name:              pulumi.String("foo"),
//				PolicyType:        pulumi.String("TargetTrackingScaling"),
//				ResourceId:        ecsTarget.ResourceId,
//				ScalableDimension: ecsTarget.ScalableDimension,
//				ServiceNamespace:  ecsTarget.ServiceNamespace,
//				TargetTrackingScalingPolicyConfiguration: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationArgs{
//					TargetValue: pulumi.Float64(100),
//					CustomizedMetricSpecification: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationArgs{
//						Metrics: appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArray{
//							&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs{
//								Label: pulumi.String("Get the queue size (the number of messages waiting to be processed)"),
//								Id:    pulumi.String("m1"),
//								MetricStat: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs{
//									Metric: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs{
//										MetricName: pulumi.String("ApproximateNumberOfMessagesVisible"),
//										Namespace:  pulumi.String("AWS/SQS"),
//										Dimensions: appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArray{
//											&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs{
//												Name:  pulumi.String("QueueName"),
//												Value: pulumi.String("my-queue"),
//											},
//										},
//									},
//									Stat: pulumi.String("Sum"),
//								},
//								ReturnData: pulumi.Bool(false),
//							},
//							&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs{
//								Label: pulumi.String("Get the ECS running task count (the number of currently running tasks)"),
//								Id:    pulumi.String("m2"),
//								MetricStat: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatArgs{
//									Metric: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs{
//										MetricName: pulumi.String("RunningTaskCount"),
//										Namespace:  pulumi.String("ECS/ContainerInsights"),
//										Dimensions: appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArray{
//											&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs{
//												Name:  pulumi.String("ClusterName"),
//												Value: pulumi.String("default"),
//											},
//											&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs{
//												Name:  pulumi.String("ServiceName"),
//												Value: pulumi.String("web-app"),
//											},
//										},
//									},
//									Stat: pulumi.String("Average"),
//								},
//								ReturnData: pulumi.Bool(false),
//							},
//							&appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricArgs{
//								Label:      pulumi.String("Calculate the backlog per instance"),
//								Id:         pulumi.String("e1"),
//								Expression: pulumi.String("m1 / m2"),
//								ReturnData: pulumi.Bool(true),
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
// ### MSK / Kafka Autoscaling
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appautoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			mskTarget, err := appautoscaling.NewTarget(ctx, "msk_target", &appautoscaling.TargetArgs{
//				ServiceNamespace:  pulumi.String("kafka"),
//				ScalableDimension: pulumi.String("kafka:broker-storage:VolumeSize"),
//				ResourceId:        pulumi.Any(example.Arn),
//				MinCapacity:       pulumi.Int(1),
//				MaxCapacity:       pulumi.Int(8),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appautoscaling.NewPolicy(ctx, "targets", &appautoscaling.PolicyArgs{
//				Name:              pulumi.String("storage-size-auto-scaling"),
//				ServiceNamespace:  mskTarget.ServiceNamespace,
//				ScalableDimension: mskTarget.ScalableDimension,
//				ResourceId:        mskTarget.ResourceId,
//				PolicyType:        pulumi.String("TargetTrackingScaling"),
//				TargetTrackingScalingPolicyConfiguration: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationArgs{
//					PredefinedMetricSpecification: &appautoscaling.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs{
//						PredefinedMetricType: pulumi.String("KafkaBrokerStorageUtilization"),
//					},
//					TargetValue: pulumi.Float64(55),
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
// Using `pulumi import`, import Application AutoScaling Policy using the `service-namespace` , `resource-id`, `scalable-dimension` and `policy-name` separated by `/`. For example:
//
// ```sh
//
//	$ pulumi import aws:appautoscaling/policy:Policy test-policy service-namespace/resource-id/scalable-dimension/policy-name
//
// ```
type Policy struct {
	pulumi.CustomResourceState

	// List of CloudWatch alarm ARNs associated with the scaling policy.
	AlarmArns pulumi.StringArrayOutput `pulumi:"alarmArns"`
	// ARN assigned by AWS to the scaling policy.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name of the policy. Must be between 1 and 255 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
	PolicyType pulumi.StringPtrOutput `pulumi:"policyType"`
	// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
	// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ScalableDimension pulumi.StringOutput `pulumi:"scalableDimension"`
	// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ServiceNamespace pulumi.StringOutput `pulumi:"serviceNamespace"`
	// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
	StepScalingPolicyConfiguration PolicyStepScalingPolicyConfigurationPtrOutput `pulumi:"stepScalingPolicyConfiguration"`
	// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
	TargetTrackingScalingPolicyConfiguration PolicyTargetTrackingScalingPolicyConfigurationPtrOutput `pulumi:"targetTrackingScalingPolicyConfiguration"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceId'")
	}
	if args.ScalableDimension == nil {
		return nil, errors.New("invalid value for required argument 'ScalableDimension'")
	}
	if args.ServiceNamespace == nil {
		return nil, errors.New("invalid value for required argument 'ServiceNamespace'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Policy
	err := ctx.RegisterResource("aws:appautoscaling/policy:Policy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicy gets an existing Policy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyState, opts ...pulumi.ResourceOption) (*Policy, error) {
	var resource Policy
	err := ctx.ReadResource("aws:appautoscaling/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	// List of CloudWatch alarm ARNs associated with the scaling policy.
	AlarmArns []string `pulumi:"alarmArns"`
	// ARN assigned by AWS to the scaling policy.
	Arn *string `pulumi:"arn"`
	// Name of the policy. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
	PolicyType *string `pulumi:"policyType"`
	// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ResourceId *string `pulumi:"resourceId"`
	// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ScalableDimension *string `pulumi:"scalableDimension"`
	// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ServiceNamespace *string `pulumi:"serviceNamespace"`
	// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
	StepScalingPolicyConfiguration *PolicyStepScalingPolicyConfiguration `pulumi:"stepScalingPolicyConfiguration"`
	// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
	TargetTrackingScalingPolicyConfiguration *PolicyTargetTrackingScalingPolicyConfiguration `pulumi:"targetTrackingScalingPolicyConfiguration"`
}

type PolicyState struct {
	// List of CloudWatch alarm ARNs associated with the scaling policy.
	AlarmArns pulumi.StringArrayInput
	// ARN assigned by AWS to the scaling policy.
	Arn pulumi.StringPtrInput
	// Name of the policy. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
	PolicyType pulumi.StringPtrInput
	// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ResourceId pulumi.StringPtrInput
	// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ScalableDimension pulumi.StringPtrInput
	// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ServiceNamespace pulumi.StringPtrInput
	// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
	StepScalingPolicyConfiguration PolicyStepScalingPolicyConfigurationPtrInput
	// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
	TargetTrackingScalingPolicyConfiguration PolicyTargetTrackingScalingPolicyConfigurationPtrInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// Name of the policy. Must be between 1 and 255 characters in length.
	Name *string `pulumi:"name"`
	// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
	PolicyType *string `pulumi:"policyType"`
	// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ResourceId string `pulumi:"resourceId"`
	// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ScalableDimension string `pulumi:"scalableDimension"`
	// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ServiceNamespace string `pulumi:"serviceNamespace"`
	// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
	StepScalingPolicyConfiguration *PolicyStepScalingPolicyConfiguration `pulumi:"stepScalingPolicyConfiguration"`
	// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
	TargetTrackingScalingPolicyConfiguration *PolicyTargetTrackingScalingPolicyConfiguration `pulumi:"targetTrackingScalingPolicyConfiguration"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// Name of the policy. Must be between 1 and 255 characters in length.
	Name pulumi.StringPtrInput
	// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
	PolicyType pulumi.StringPtrInput
	// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ResourceId pulumi.StringInput
	// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ScalableDimension pulumi.StringInput
	// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
	ServiceNamespace pulumi.StringInput
	// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
	StepScalingPolicyConfiguration PolicyStepScalingPolicyConfigurationPtrInput
	// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
	TargetTrackingScalingPolicyConfiguration PolicyTargetTrackingScalingPolicyConfigurationPtrInput
}

func (PolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyArgs)(nil)).Elem()
}

type PolicyInput interface {
	pulumi.Input

	ToPolicyOutput() PolicyOutput
	ToPolicyOutputWithContext(ctx context.Context) PolicyOutput
}

func (*Policy) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//	PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (i PolicyArray) ToPolicyArrayOutput() PolicyArrayOutput {
	return i.ToPolicyArrayOutputWithContext(context.Background())
}

func (i PolicyArray) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyArrayOutput)
}

// PolicyMapInput is an input type that accepts PolicyMap and PolicyMapOutput values.
// You can construct a concrete instance of `PolicyMapInput` via:
//
//	PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct{ *pulumi.OutputState }

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

// List of CloudWatch alarm ARNs associated with the scaling policy.
func (o PolicyOutput) AlarmArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringArrayOutput { return v.AlarmArns }).(pulumi.StringArrayOutput)
}

// ARN assigned by AWS to the scaling policy.
func (o PolicyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name of the policy. Must be between 1 and 255 characters in length.
func (o PolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
func (o PolicyOutput) PolicyType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringPtrOutput { return v.PolicyType }).(pulumi.StringPtrOutput)
}

// Resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
func (o PolicyOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

// Scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
func (o PolicyOutput) ScalableDimension() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.ScalableDimension }).(pulumi.StringOutput)
}

// AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
func (o PolicyOutput) ServiceNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.ServiceNamespace }).(pulumi.StringOutput)
}

// Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
func (o PolicyOutput) StepScalingPolicyConfiguration() PolicyStepScalingPolicyConfigurationPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyStepScalingPolicyConfigurationPtrOutput { return v.StepScalingPolicyConfiguration }).(PolicyStepScalingPolicyConfigurationPtrOutput)
}

// Target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
func (o PolicyOutput) TargetTrackingScalingPolicyConfiguration() PolicyTargetTrackingScalingPolicyConfigurationPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyTargetTrackingScalingPolicyConfigurationPtrOutput {
		return v.TargetTrackingScalingPolicyConfiguration
	}).(PolicyTargetTrackingScalingPolicyConfigurationPtrOutput)
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].([]*Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].(map[string]*Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyInput)(nil)).Elem(), &Policy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyArrayInput)(nil)).Elem(), PolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyMapInput)(nil)).Elem(), PolicyMap{})
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
