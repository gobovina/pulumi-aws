// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mskconnect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon MSK Connect Connector resource.
//
// ## Example Usage
// ### Basic configuration
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/mskconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mskconnect.NewConnector(ctx, "example", &mskconnect.ConnectorArgs{
//				KafkaconnectVersion: pulumi.String("2.7.1"),
//				Capacity: &mskconnect.ConnectorCapacityArgs{
//					Autoscaling: &mskconnect.ConnectorCapacityAutoscalingArgs{
//						McuCount:       pulumi.Int(1),
//						MinWorkerCount: pulumi.Int(1),
//						MaxWorkerCount: pulumi.Int(2),
//						ScaleInPolicy: &mskconnect.ConnectorCapacityAutoscalingScaleInPolicyArgs{
//							CpuUtilizationPercentage: pulumi.Int(20),
//						},
//						ScaleOutPolicy: &mskconnect.ConnectorCapacityAutoscalingScaleOutPolicyArgs{
//							CpuUtilizationPercentage: pulumi.Int(80),
//						},
//					},
//				},
//				ConnectorConfiguration: pulumi.StringMap{
//					"connector.class": pulumi.String("com.github.jcustenborder.kafka.connect.simulator.SimulatorSinkConnector"),
//					"tasks.max":       pulumi.String("1"),
//					"topics":          pulumi.String("example"),
//				},
//				KafkaCluster: &mskconnect.ConnectorKafkaClusterArgs{
//					ApacheKafkaCluster: &mskconnect.ConnectorKafkaClusterApacheKafkaClusterArgs{
//						BootstrapServers: pulumi.Any(aws_msk_cluster.Example.Bootstrap_brokers_tls),
//						Vpc: &mskconnect.ConnectorKafkaClusterApacheKafkaClusterVpcArgs{
//							SecurityGroups: pulumi.StringArray{
//								aws_security_group.Example.Id,
//							},
//							Subnets: pulumi.StringArray{
//								aws_subnet.Example1.Id,
//								aws_subnet.Example2.Id,
//								aws_subnet.Example3.Id,
//							},
//						},
//					},
//				},
//				KafkaClusterClientAuthentication: &mskconnect.ConnectorKafkaClusterClientAuthenticationArgs{
//					AuthenticationType: pulumi.String("NONE"),
//				},
//				KafkaClusterEncryptionInTransit: &mskconnect.ConnectorKafkaClusterEncryptionInTransitArgs{
//					EncryptionType: pulumi.String("TLS"),
//				},
//				Plugins: mskconnect.ConnectorPluginArray{
//					&mskconnect.ConnectorPluginArgs{
//						CustomPlugin: &mskconnect.ConnectorPluginCustomPluginArgs{
//							Arn:      pulumi.Any(aws_mskconnect_custom_plugin.Example.Arn),
//							Revision: pulumi.Any(aws_mskconnect_custom_plugin.Example.Latest_revision),
//						},
//					},
//				},
//				ServiceExecutionRoleArn: pulumi.Any(aws_iam_role.Example.Arn),
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
// Using `pulumi import`, import MSK Connect Connector using the connector's `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:mskconnect/connector:Connector example 'arn:aws:kafkaconnect:eu-central-1:123456789012:connector/example/264edee4-17a3-412e-bd76-6681cfc93805-3'
//
// ```
type Connector struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the custom plugin.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Information about the capacity allocated to the connector. See below.
	Capacity ConnectorCapacityOutput `pulumi:"capacity"`
	// A map of keys to values that represent the configuration for the connector.
	ConnectorConfiguration pulumi.StringMapOutput `pulumi:"connectorConfiguration"`
	// A summary description of the connector.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies which Apache Kafka cluster to connect to. See below.
	KafkaCluster ConnectorKafkaClusterOutput `pulumi:"kafkaCluster"`
	// Details of the client authentication used by the Apache Kafka cluster. See below.
	KafkaClusterClientAuthentication ConnectorKafkaClusterClientAuthenticationOutput `pulumi:"kafkaClusterClientAuthentication"`
	// Details of encryption in transit to the Apache Kafka cluster. See below.
	KafkaClusterEncryptionInTransit ConnectorKafkaClusterEncryptionInTransitOutput `pulumi:"kafkaClusterEncryptionInTransit"`
	// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
	KafkaconnectVersion pulumi.StringOutput `pulumi:"kafkaconnectVersion"`
	// Details about log delivery. See below.
	LogDelivery ConnectorLogDeliveryPtrOutput `pulumi:"logDelivery"`
	// The name of the connector.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies which plugins to use for the connector. See below.
	Plugins ConnectorPluginArrayOutput `pulumi:"plugins"`
	// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
	ServiceExecutionRoleArn pulumi.StringOutput `pulumi:"serviceExecutionRoleArn"`
	// The current version of the connector.
	Version pulumi.StringOutput `pulumi:"version"`
	// Specifies which worker configuration to use with the connector. See below.
	WorkerConfiguration ConnectorWorkerConfigurationPtrOutput `pulumi:"workerConfiguration"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Capacity == nil {
		return nil, errors.New("invalid value for required argument 'Capacity'")
	}
	if args.ConnectorConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorConfiguration'")
	}
	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	if args.KafkaClusterClientAuthentication == nil {
		return nil, errors.New("invalid value for required argument 'KafkaClusterClientAuthentication'")
	}
	if args.KafkaClusterEncryptionInTransit == nil {
		return nil, errors.New("invalid value for required argument 'KafkaClusterEncryptionInTransit'")
	}
	if args.KafkaconnectVersion == nil {
		return nil, errors.New("invalid value for required argument 'KafkaconnectVersion'")
	}
	if args.Plugins == nil {
		return nil, errors.New("invalid value for required argument 'Plugins'")
	}
	if args.ServiceExecutionRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ServiceExecutionRoleArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connector
	err := ctx.RegisterResource("aws:mskconnect/connector:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("aws:mskconnect/connector:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// The Amazon Resource Name (ARN) of the custom plugin.
	Arn *string `pulumi:"arn"`
	// Information about the capacity allocated to the connector. See below.
	Capacity *ConnectorCapacity `pulumi:"capacity"`
	// A map of keys to values that represent the configuration for the connector.
	ConnectorConfiguration map[string]string `pulumi:"connectorConfiguration"`
	// A summary description of the connector.
	Description *string `pulumi:"description"`
	// Specifies which Apache Kafka cluster to connect to. See below.
	KafkaCluster *ConnectorKafkaCluster `pulumi:"kafkaCluster"`
	// Details of the client authentication used by the Apache Kafka cluster. See below.
	KafkaClusterClientAuthentication *ConnectorKafkaClusterClientAuthentication `pulumi:"kafkaClusterClientAuthentication"`
	// Details of encryption in transit to the Apache Kafka cluster. See below.
	KafkaClusterEncryptionInTransit *ConnectorKafkaClusterEncryptionInTransit `pulumi:"kafkaClusterEncryptionInTransit"`
	// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
	KafkaconnectVersion *string `pulumi:"kafkaconnectVersion"`
	// Details about log delivery. See below.
	LogDelivery *ConnectorLogDelivery `pulumi:"logDelivery"`
	// The name of the connector.
	Name *string `pulumi:"name"`
	// Specifies which plugins to use for the connector. See below.
	Plugins []ConnectorPlugin `pulumi:"plugins"`
	// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
	ServiceExecutionRoleArn *string `pulumi:"serviceExecutionRoleArn"`
	// The current version of the connector.
	Version *string `pulumi:"version"`
	// Specifies which worker configuration to use with the connector. See below.
	WorkerConfiguration *ConnectorWorkerConfiguration `pulumi:"workerConfiguration"`
}

type ConnectorState struct {
	// The Amazon Resource Name (ARN) of the custom plugin.
	Arn pulumi.StringPtrInput
	// Information about the capacity allocated to the connector. See below.
	Capacity ConnectorCapacityPtrInput
	// A map of keys to values that represent the configuration for the connector.
	ConnectorConfiguration pulumi.StringMapInput
	// A summary description of the connector.
	Description pulumi.StringPtrInput
	// Specifies which Apache Kafka cluster to connect to. See below.
	KafkaCluster ConnectorKafkaClusterPtrInput
	// Details of the client authentication used by the Apache Kafka cluster. See below.
	KafkaClusterClientAuthentication ConnectorKafkaClusterClientAuthenticationPtrInput
	// Details of encryption in transit to the Apache Kafka cluster. See below.
	KafkaClusterEncryptionInTransit ConnectorKafkaClusterEncryptionInTransitPtrInput
	// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
	KafkaconnectVersion pulumi.StringPtrInput
	// Details about log delivery. See below.
	LogDelivery ConnectorLogDeliveryPtrInput
	// The name of the connector.
	Name pulumi.StringPtrInput
	// Specifies which plugins to use for the connector. See below.
	Plugins ConnectorPluginArrayInput
	// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
	ServiceExecutionRoleArn pulumi.StringPtrInput
	// The current version of the connector.
	Version pulumi.StringPtrInput
	// Specifies which worker configuration to use with the connector. See below.
	WorkerConfiguration ConnectorWorkerConfigurationPtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	// Information about the capacity allocated to the connector. See below.
	Capacity ConnectorCapacity `pulumi:"capacity"`
	// A map of keys to values that represent the configuration for the connector.
	ConnectorConfiguration map[string]string `pulumi:"connectorConfiguration"`
	// A summary description of the connector.
	Description *string `pulumi:"description"`
	// Specifies which Apache Kafka cluster to connect to. See below.
	KafkaCluster ConnectorKafkaCluster `pulumi:"kafkaCluster"`
	// Details of the client authentication used by the Apache Kafka cluster. See below.
	KafkaClusterClientAuthentication ConnectorKafkaClusterClientAuthentication `pulumi:"kafkaClusterClientAuthentication"`
	// Details of encryption in transit to the Apache Kafka cluster. See below.
	KafkaClusterEncryptionInTransit ConnectorKafkaClusterEncryptionInTransit `pulumi:"kafkaClusterEncryptionInTransit"`
	// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
	KafkaconnectVersion string `pulumi:"kafkaconnectVersion"`
	// Details about log delivery. See below.
	LogDelivery *ConnectorLogDelivery `pulumi:"logDelivery"`
	// The name of the connector.
	Name *string `pulumi:"name"`
	// Specifies which plugins to use for the connector. See below.
	Plugins []ConnectorPlugin `pulumi:"plugins"`
	// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
	ServiceExecutionRoleArn string `pulumi:"serviceExecutionRoleArn"`
	// Specifies which worker configuration to use with the connector. See below.
	WorkerConfiguration *ConnectorWorkerConfiguration `pulumi:"workerConfiguration"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	// Information about the capacity allocated to the connector. See below.
	Capacity ConnectorCapacityInput
	// A map of keys to values that represent the configuration for the connector.
	ConnectorConfiguration pulumi.StringMapInput
	// A summary description of the connector.
	Description pulumi.StringPtrInput
	// Specifies which Apache Kafka cluster to connect to. See below.
	KafkaCluster ConnectorKafkaClusterInput
	// Details of the client authentication used by the Apache Kafka cluster. See below.
	KafkaClusterClientAuthentication ConnectorKafkaClusterClientAuthenticationInput
	// Details of encryption in transit to the Apache Kafka cluster. See below.
	KafkaClusterEncryptionInTransit ConnectorKafkaClusterEncryptionInTransitInput
	// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
	KafkaconnectVersion pulumi.StringInput
	// Details about log delivery. See below.
	LogDelivery ConnectorLogDeliveryPtrInput
	// The name of the connector.
	Name pulumi.StringPtrInput
	// Specifies which plugins to use for the connector. See below.
	Plugins ConnectorPluginArrayInput
	// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
	ServiceExecutionRoleArn pulumi.StringInput
	// Specifies which worker configuration to use with the connector. See below.
	WorkerConfiguration ConnectorWorkerConfigurationPtrInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

// ConnectorArrayInput is an input type that accepts ConnectorArray and ConnectorArrayOutput values.
// You can construct a concrete instance of `ConnectorArrayInput` via:
//
//	ConnectorArray{ ConnectorArgs{...} }
type ConnectorArrayInput interface {
	pulumi.Input

	ToConnectorArrayOutput() ConnectorArrayOutput
	ToConnectorArrayOutputWithContext(context.Context) ConnectorArrayOutput
}

type ConnectorArray []ConnectorInput

func (ConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (i ConnectorArray) ToConnectorArrayOutput() ConnectorArrayOutput {
	return i.ToConnectorArrayOutputWithContext(context.Background())
}

func (i ConnectorArray) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorArrayOutput)
}

// ConnectorMapInput is an input type that accepts ConnectorMap and ConnectorMapOutput values.
// You can construct a concrete instance of `ConnectorMapInput` via:
//
//	ConnectorMap{ "key": ConnectorArgs{...} }
type ConnectorMapInput interface {
	pulumi.Input

	ToConnectorMapOutput() ConnectorMapOutput
	ToConnectorMapOutputWithContext(context.Context) ConnectorMapOutput
}

type ConnectorMap map[string]ConnectorInput

func (ConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (i ConnectorMap) ToConnectorMapOutput() ConnectorMapOutput {
	return i.ToConnectorMapOutputWithContext(context.Background())
}

func (i ConnectorMap) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorMapOutput)
}

type ConnectorOutput struct{ *pulumi.OutputState }

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

// The Amazon Resource Name (ARN) of the custom plugin.
func (o ConnectorOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Information about the capacity allocated to the connector. See below.
func (o ConnectorOutput) Capacity() ConnectorCapacityOutput {
	return o.ApplyT(func(v *Connector) ConnectorCapacityOutput { return v.Capacity }).(ConnectorCapacityOutput)
}

// A map of keys to values that represent the configuration for the connector.
func (o ConnectorOutput) ConnectorConfiguration() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.ConnectorConfiguration }).(pulumi.StringMapOutput)
}

// A summary description of the connector.
func (o ConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies which Apache Kafka cluster to connect to. See below.
func (o ConnectorOutput) KafkaCluster() ConnectorKafkaClusterOutput {
	return o.ApplyT(func(v *Connector) ConnectorKafkaClusterOutput { return v.KafkaCluster }).(ConnectorKafkaClusterOutput)
}

// Details of the client authentication used by the Apache Kafka cluster. See below.
func (o ConnectorOutput) KafkaClusterClientAuthentication() ConnectorKafkaClusterClientAuthenticationOutput {
	return o.ApplyT(func(v *Connector) ConnectorKafkaClusterClientAuthenticationOutput {
		return v.KafkaClusterClientAuthentication
	}).(ConnectorKafkaClusterClientAuthenticationOutput)
}

// Details of encryption in transit to the Apache Kafka cluster. See below.
func (o ConnectorOutput) KafkaClusterEncryptionInTransit() ConnectorKafkaClusterEncryptionInTransitOutput {
	return o.ApplyT(func(v *Connector) ConnectorKafkaClusterEncryptionInTransitOutput {
		return v.KafkaClusterEncryptionInTransit
	}).(ConnectorKafkaClusterEncryptionInTransitOutput)
}

// The version of Kafka Connect. It has to be compatible with both the Apache Kafka cluster's version and the plugins.
func (o ConnectorOutput) KafkaconnectVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.KafkaconnectVersion }).(pulumi.StringOutput)
}

// Details about log delivery. See below.
func (o ConnectorOutput) LogDelivery() ConnectorLogDeliveryPtrOutput {
	return o.ApplyT(func(v *Connector) ConnectorLogDeliveryPtrOutput { return v.LogDelivery }).(ConnectorLogDeliveryPtrOutput)
}

// The name of the connector.
func (o ConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies which plugins to use for the connector. See below.
func (o ConnectorOutput) Plugins() ConnectorPluginArrayOutput {
	return o.ApplyT(func(v *Connector) ConnectorPluginArrayOutput { return v.Plugins }).(ConnectorPluginArrayOutput)
}

// The Amazon Resource Name (ARN) of the IAM role used by the connector to access the Amazon Web Services resources that it needs. The types of resources depends on the logic of the connector. For example, a connector that has Amazon S3 as a destination must have permissions that allow it to write to the S3 destination bucket.
func (o ConnectorOutput) ServiceExecutionRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.ServiceExecutionRoleArn }).(pulumi.StringOutput)
}

// The current version of the connector.
func (o ConnectorOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

// Specifies which worker configuration to use with the connector. See below.
func (o ConnectorOutput) WorkerConfiguration() ConnectorWorkerConfigurationPtrOutput {
	return o.ApplyT(func(v *Connector) ConnectorWorkerConfigurationPtrOutput { return v.WorkerConfiguration }).(ConnectorWorkerConfigurationPtrOutput)
}

type ConnectorArrayOutput struct{ *pulumi.OutputState }

func (ConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (o ConnectorArrayOutput) ToConnectorArrayOutput() ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) Index(i pulumi.IntInput) ConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].([]*Connector)[vs[1].(int)]
	}).(ConnectorOutput)
}

type ConnectorMapOutput struct{ *pulumi.OutputState }

func (ConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (o ConnectorMapOutput) ToConnectorMapOutput() ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) MapIndex(k pulumi.StringInput) ConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].(map[string]*Connector)[vs[1].(string)]
	}).(ConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorInput)(nil)).Elem(), &Connector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorArrayInput)(nil)).Elem(), ConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorMapInput)(nil)).Elem(), ConnectorMap{})
	pulumi.RegisterOutputType(ConnectorOutput{})
	pulumi.RegisterOutputType(ConnectorArrayOutput{})
	pulumi.RegisterOutputType(ConnectorMapOutput{})
}
