// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mq

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon MQ broker resource. This resources also manages users for the broker.
//
// > For more information on Amazon MQ, see [Amazon MQ documentation](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/welcome.html).
//
// > **NOTE:** Amazon MQ currently places limits on **RabbitMQ** brokers. For example, a RabbitMQ broker cannot have: instances with an associated IP address of an ENI attached to the broker, an associated LDAP server to authenticate and authorize broker connections, storage type `EFS`, or audit logging. Although this resource allows you to create RabbitMQ users, RabbitMQ users cannot have console access or groups. Also, Amazon MQ does not return information about RabbitMQ users so drift detection is not possible.
//
// > **NOTE:** Changes to an MQ Broker can occur when you change a parameter, such as `configuration` or `user`, and are reflected in the next maintenance window. Because of this, the provider may report a difference in its planning phase because a modification has not yet taken place. You can use the `applyImmediately` flag to instruct the service to apply the change immediately (see documentation below). Using `applyImmediately` can result in a brief downtime as the broker reboots.
//
// ## Example Usage
// ### Basic Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/mq"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mq.NewBroker(ctx, "example", &mq.BrokerArgs{
//				BrokerName: pulumi.String("example"),
//				Configuration: &mq.BrokerConfigurationArgs{
//					Id:       pulumi.Any(test.Id),
//					Revision: pulumi.Any(test.LatestRevision),
//				},
//				EngineType:       pulumi.String("ActiveMQ"),
//				EngineVersion:    pulumi.String("5.17.6"),
//				HostInstanceType: pulumi.String("mq.t2.micro"),
//				SecurityGroups: pulumi.StringArray{
//					testAwsSecurityGroup.Id,
//				},
//				Users: mq.BrokerUserArray{
//					&mq.BrokerUserArgs{
//						Username: pulumi.String("ExampleUser"),
//						Password: pulumi.String("MindTheGap"),
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
// ### High-throughput Optimized Example
//
// This example shows the use of EBS storage for high-throughput optimized performance.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/mq"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mq.NewBroker(ctx, "example", &mq.BrokerArgs{
//				BrokerName: pulumi.String("example"),
//				Configuration: &mq.BrokerConfigurationArgs{
//					Id:       pulumi.Any(test.Id),
//					Revision: pulumi.Any(test.LatestRevision),
//				},
//				EngineType:       pulumi.String("ActiveMQ"),
//				EngineVersion:    pulumi.String("5.17.6"),
//				StorageType:      pulumi.String("ebs"),
//				HostInstanceType: pulumi.String("mq.m5.large"),
//				SecurityGroups: pulumi.StringArray{
//					testAwsSecurityGroup.Id,
//				},
//				Users: mq.BrokerUserArray{
//					&mq.BrokerUserArgs{
//						Username: pulumi.String("ExampleUser"),
//						Password: pulumi.String("MindTheGap"),
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
// Using `pulumi import`, import MQ Brokers using their broker id. For example:
//
// ```sh
//
//	$ pulumi import aws:mq/broker:Broker example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
//
// ```
type Broker struct {
	pulumi.CustomResourceState

	// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
	ApplyImmediately pulumi.BoolPtrOutput `pulumi:"applyImmediately"`
	// ARN of the broker.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
	AuthenticationStrategy pulumi.StringOutput `pulumi:"authenticationStrategy"`
	// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
	AutoMinorVersionUpgrade pulumi.BoolPtrOutput `pulumi:"autoMinorVersionUpgrade"`
	// Name of the broker.
	BrokerName pulumi.StringOutput `pulumi:"brokerName"`
	// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
	Configuration BrokerConfigurationOutput `pulumi:"configuration"`
	// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
	DeploymentMode pulumi.StringPtrOutput `pulumi:"deploymentMode"`
	// Configuration block containing encryption options. Detailed below.
	EncryptionOptions BrokerEncryptionOptionsPtrOutput `pulumi:"encryptionOptions"`
	// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
	EngineType pulumi.StringOutput `pulumi:"engineType"`
	// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
	HostInstanceType pulumi.StringOutput `pulumi:"hostInstanceType"`
	// List of information about allocated brokers (both active & standby).
	// * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engineType`.
	// * `instances.0.ip_address` - IP Address of the broker.
	// * `instances.0.endpoints` - Broker's wire-level protocol endpoints in the following order & format referenceable e.g., as `instances.0.endpoints.0` (SSL):
	// * For `ActiveMQ`:
	// * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
	// * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
	// * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
	// * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
	// * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
	// * For `RabbitMQ`:
	// * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
	Instances BrokerInstanceArrayOutput `pulumi:"instances"`
	// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
	LdapServerMetadata BrokerLdapServerMetadataPtrOutput `pulumi:"ldapServerMetadata"`
	// Configuration block for the logging configuration of the broker. Detailed below.
	Logs BrokerLogsPtrOutput `pulumi:"logs"`
	// Configuration block for the maintenance window start time. Detailed below.
	MaintenanceWindowStartTime BrokerMaintenanceWindowStartTimeOutput `pulumi:"maintenanceWindowStartTime"`
	// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
	PubliclyAccessible pulumi.BoolPtrOutput `pulumi:"publiclyAccessible"`
	// List of security group IDs assigned to the broker.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
	StorageType pulumi.StringOutput `pulumi:"storageType"`
	// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
	//
	// The following arguments are optional:
	Users BrokerUserArrayOutput `pulumi:"users"`
}

// NewBroker registers a new resource with the given unique name, arguments, and options.
func NewBroker(ctx *pulumi.Context,
	name string, args *BrokerArgs, opts ...pulumi.ResourceOption) (*Broker, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EngineType == nil {
		return nil, errors.New("invalid value for required argument 'EngineType'")
	}
	if args.EngineVersion == nil {
		return nil, errors.New("invalid value for required argument 'EngineVersion'")
	}
	if args.HostInstanceType == nil {
		return nil, errors.New("invalid value for required argument 'HostInstanceType'")
	}
	if args.Users == nil {
		return nil, errors.New("invalid value for required argument 'Users'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Broker
	err := ctx.RegisterResource("aws:mq/broker:Broker", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBroker gets an existing Broker resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBroker(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrokerState, opts ...pulumi.ResourceOption) (*Broker, error) {
	var resource Broker
	err := ctx.ReadResource("aws:mq/broker:Broker", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Broker resources.
type brokerState struct {
	// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// ARN of the broker.
	Arn *string `pulumi:"arn"`
	// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
	AuthenticationStrategy *string `pulumi:"authenticationStrategy"`
	// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
	AutoMinorVersionUpgrade *bool `pulumi:"autoMinorVersionUpgrade"`
	// Name of the broker.
	BrokerName *string `pulumi:"brokerName"`
	// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
	Configuration *BrokerConfiguration `pulumi:"configuration"`
	// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
	DeploymentMode *string `pulumi:"deploymentMode"`
	// Configuration block containing encryption options. Detailed below.
	EncryptionOptions *BrokerEncryptionOptions `pulumi:"encryptionOptions"`
	// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
	EngineType *string `pulumi:"engineType"`
	// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
	EngineVersion *string `pulumi:"engineVersion"`
	// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
	HostInstanceType *string `pulumi:"hostInstanceType"`
	// List of information about allocated brokers (both active & standby).
	// * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engineType`.
	// * `instances.0.ip_address` - IP Address of the broker.
	// * `instances.0.endpoints` - Broker's wire-level protocol endpoints in the following order & format referenceable e.g., as `instances.0.endpoints.0` (SSL):
	// * For `ActiveMQ`:
	// * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
	// * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
	// * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
	// * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
	// * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
	// * For `RabbitMQ`:
	// * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
	Instances []BrokerInstance `pulumi:"instances"`
	// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
	LdapServerMetadata *BrokerLdapServerMetadata `pulumi:"ldapServerMetadata"`
	// Configuration block for the logging configuration of the broker. Detailed below.
	Logs *BrokerLogs `pulumi:"logs"`
	// Configuration block for the maintenance window start time. Detailed below.
	MaintenanceWindowStartTime *BrokerMaintenanceWindowStartTime `pulumi:"maintenanceWindowStartTime"`
	// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
	PubliclyAccessible *bool `pulumi:"publiclyAccessible"`
	// List of security group IDs assigned to the broker.
	SecurityGroups []string `pulumi:"securityGroups"`
	// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
	StorageType *string `pulumi:"storageType"`
	// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
	SubnetIds []string `pulumi:"subnetIds"`
	// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
	//
	// The following arguments are optional:
	Users []BrokerUser `pulumi:"users"`
}

type BrokerState struct {
	// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
	ApplyImmediately pulumi.BoolPtrInput
	// ARN of the broker.
	Arn pulumi.StringPtrInput
	// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
	AuthenticationStrategy pulumi.StringPtrInput
	// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	// Name of the broker.
	BrokerName pulumi.StringPtrInput
	// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
	Configuration BrokerConfigurationPtrInput
	// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
	DeploymentMode pulumi.StringPtrInput
	// Configuration block containing encryption options. Detailed below.
	EncryptionOptions BrokerEncryptionOptionsPtrInput
	// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
	EngineType pulumi.StringPtrInput
	// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
	EngineVersion pulumi.StringPtrInput
	// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
	HostInstanceType pulumi.StringPtrInput
	// List of information about allocated brokers (both active & standby).
	// * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engineType`.
	// * `instances.0.ip_address` - IP Address of the broker.
	// * `instances.0.endpoints` - Broker's wire-level protocol endpoints in the following order & format referenceable e.g., as `instances.0.endpoints.0` (SSL):
	// * For `ActiveMQ`:
	// * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
	// * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
	// * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
	// * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
	// * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
	// * For `RabbitMQ`:
	// * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
	Instances BrokerInstanceArrayInput
	// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
	LdapServerMetadata BrokerLdapServerMetadataPtrInput
	// Configuration block for the logging configuration of the broker. Detailed below.
	Logs BrokerLogsPtrInput
	// Configuration block for the maintenance window start time. Detailed below.
	MaintenanceWindowStartTime BrokerMaintenanceWindowStartTimePtrInput
	// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
	PubliclyAccessible pulumi.BoolPtrInput
	// List of security group IDs assigned to the broker.
	SecurityGroups pulumi.StringArrayInput
	// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
	StorageType pulumi.StringPtrInput
	// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
	SubnetIds pulumi.StringArrayInput
	// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
	//
	// The following arguments are optional:
	Users BrokerUserArrayInput
}

func (BrokerState) ElementType() reflect.Type {
	return reflect.TypeOf((*brokerState)(nil)).Elem()
}

type brokerArgs struct {
	// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
	AuthenticationStrategy *string `pulumi:"authenticationStrategy"`
	// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
	AutoMinorVersionUpgrade *bool `pulumi:"autoMinorVersionUpgrade"`
	// Name of the broker.
	BrokerName *string `pulumi:"brokerName"`
	// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
	Configuration *BrokerConfiguration `pulumi:"configuration"`
	// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
	DeploymentMode *string `pulumi:"deploymentMode"`
	// Configuration block containing encryption options. Detailed below.
	EncryptionOptions *BrokerEncryptionOptions `pulumi:"encryptionOptions"`
	// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
	EngineType string `pulumi:"engineType"`
	// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
	EngineVersion string `pulumi:"engineVersion"`
	// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
	HostInstanceType string `pulumi:"hostInstanceType"`
	// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
	LdapServerMetadata *BrokerLdapServerMetadata `pulumi:"ldapServerMetadata"`
	// Configuration block for the logging configuration of the broker. Detailed below.
	Logs *BrokerLogs `pulumi:"logs"`
	// Configuration block for the maintenance window start time. Detailed below.
	MaintenanceWindowStartTime *BrokerMaintenanceWindowStartTime `pulumi:"maintenanceWindowStartTime"`
	// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
	PubliclyAccessible *bool `pulumi:"publiclyAccessible"`
	// List of security group IDs assigned to the broker.
	SecurityGroups []string `pulumi:"securityGroups"`
	// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
	StorageType *string `pulumi:"storageType"`
	// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
	SubnetIds []string `pulumi:"subnetIds"`
	// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
	//
	// The following arguments are optional:
	Users []BrokerUser `pulumi:"users"`
}

// The set of arguments for constructing a Broker resource.
type BrokerArgs struct {
	// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
	ApplyImmediately pulumi.BoolPtrInput
	// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
	AuthenticationStrategy pulumi.StringPtrInput
	// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	// Name of the broker.
	BrokerName pulumi.StringPtrInput
	// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
	Configuration BrokerConfigurationPtrInput
	// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
	DeploymentMode pulumi.StringPtrInput
	// Configuration block containing encryption options. Detailed below.
	EncryptionOptions BrokerEncryptionOptionsPtrInput
	// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
	EngineType pulumi.StringInput
	// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
	EngineVersion pulumi.StringInput
	// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
	HostInstanceType pulumi.StringInput
	// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
	LdapServerMetadata BrokerLdapServerMetadataPtrInput
	// Configuration block for the logging configuration of the broker. Detailed below.
	Logs BrokerLogsPtrInput
	// Configuration block for the maintenance window start time. Detailed below.
	MaintenanceWindowStartTime BrokerMaintenanceWindowStartTimePtrInput
	// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
	PubliclyAccessible pulumi.BoolPtrInput
	// List of security group IDs assigned to the broker.
	SecurityGroups pulumi.StringArrayInput
	// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
	StorageType pulumi.StringPtrInput
	// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
	SubnetIds pulumi.StringArrayInput
	// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
	//
	// The following arguments are optional:
	Users BrokerUserArrayInput
}

func (BrokerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*brokerArgs)(nil)).Elem()
}

type BrokerInput interface {
	pulumi.Input

	ToBrokerOutput() BrokerOutput
	ToBrokerOutputWithContext(ctx context.Context) BrokerOutput
}

func (*Broker) ElementType() reflect.Type {
	return reflect.TypeOf((**Broker)(nil)).Elem()
}

func (i *Broker) ToBrokerOutput() BrokerOutput {
	return i.ToBrokerOutputWithContext(context.Background())
}

func (i *Broker) ToBrokerOutputWithContext(ctx context.Context) BrokerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokerOutput)
}

// BrokerArrayInput is an input type that accepts BrokerArray and BrokerArrayOutput values.
// You can construct a concrete instance of `BrokerArrayInput` via:
//
//	BrokerArray{ BrokerArgs{...} }
type BrokerArrayInput interface {
	pulumi.Input

	ToBrokerArrayOutput() BrokerArrayOutput
	ToBrokerArrayOutputWithContext(context.Context) BrokerArrayOutput
}

type BrokerArray []BrokerInput

func (BrokerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Broker)(nil)).Elem()
}

func (i BrokerArray) ToBrokerArrayOutput() BrokerArrayOutput {
	return i.ToBrokerArrayOutputWithContext(context.Background())
}

func (i BrokerArray) ToBrokerArrayOutputWithContext(ctx context.Context) BrokerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokerArrayOutput)
}

// BrokerMapInput is an input type that accepts BrokerMap and BrokerMapOutput values.
// You can construct a concrete instance of `BrokerMapInput` via:
//
//	BrokerMap{ "key": BrokerArgs{...} }
type BrokerMapInput interface {
	pulumi.Input

	ToBrokerMapOutput() BrokerMapOutput
	ToBrokerMapOutputWithContext(context.Context) BrokerMapOutput
}

type BrokerMap map[string]BrokerInput

func (BrokerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Broker)(nil)).Elem()
}

func (i BrokerMap) ToBrokerMapOutput() BrokerMapOutput {
	return i.ToBrokerMapOutputWithContext(context.Background())
}

func (i BrokerMap) ToBrokerMapOutputWithContext(ctx context.Context) BrokerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrokerMapOutput)
}

type BrokerOutput struct{ *pulumi.OutputState }

func (BrokerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Broker)(nil)).Elem()
}

func (o BrokerOutput) ToBrokerOutput() BrokerOutput {
	return o
}

func (o BrokerOutput) ToBrokerOutputWithContext(ctx context.Context) BrokerOutput {
	return o
}

// Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
func (o BrokerOutput) ApplyImmediately() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Broker) pulumi.BoolPtrOutput { return v.ApplyImmediately }).(pulumi.BoolPtrOutput)
}

// ARN of the broker.
func (o BrokerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engineType` `RabbitMQ`.
func (o BrokerOutput) AuthenticationStrategy() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.AuthenticationStrategy }).(pulumi.StringOutput)
}

// Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
func (o BrokerOutput) AutoMinorVersionUpgrade() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Broker) pulumi.BoolPtrOutput { return v.AutoMinorVersionUpgrade }).(pulumi.BoolPtrOutput)
}

// Name of the broker.
func (o BrokerOutput) BrokerName() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.BrokerName }).(pulumi.StringOutput)
}

// Configuration block for broker configuration. Applies to `engineType` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
func (o BrokerOutput) Configuration() BrokerConfigurationOutput {
	return o.ApplyT(func(v *Broker) BrokerConfigurationOutput { return v.Configuration }).(BrokerConfigurationOutput)
}

// Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
func (o BrokerOutput) DeploymentMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringPtrOutput { return v.DeploymentMode }).(pulumi.StringPtrOutput)
}

// Configuration block containing encryption options. Detailed below.
func (o BrokerOutput) EncryptionOptions() BrokerEncryptionOptionsPtrOutput {
	return o.ApplyT(func(v *Broker) BrokerEncryptionOptionsPtrOutput { return v.EncryptionOptions }).(BrokerEncryptionOptionsPtrOutput)
}

// Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
func (o BrokerOutput) EngineType() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.EngineType }).(pulumi.StringOutput)
}

// Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
func (o BrokerOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.EngineVersion }).(pulumi.StringOutput)
}

// Broker's instance type. For example, `mq.t3.micro`, `mq.m5.large`.
func (o BrokerOutput) HostInstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.HostInstanceType }).(pulumi.StringOutput)
}

// List of information about allocated brokers (both active & standby).
// * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engineType`.
// * `instances.0.ip_address` - IP Address of the broker.
// * `instances.0.endpoints` - Broker's wire-level protocol endpoints in the following order & format referenceable e.g., as `instances.0.endpoints.0` (SSL):
// * For `ActiveMQ`:
// * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
// * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
// * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
// * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
// * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
// * For `RabbitMQ`:
// * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
func (o BrokerOutput) Instances() BrokerInstanceArrayOutput {
	return o.ApplyT(func(v *Broker) BrokerInstanceArrayOutput { return v.Instances }).(BrokerInstanceArrayOutput)
}

// Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engineType` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
func (o BrokerOutput) LdapServerMetadata() BrokerLdapServerMetadataPtrOutput {
	return o.ApplyT(func(v *Broker) BrokerLdapServerMetadataPtrOutput { return v.LdapServerMetadata }).(BrokerLdapServerMetadataPtrOutput)
}

// Configuration block for the logging configuration of the broker. Detailed below.
func (o BrokerOutput) Logs() BrokerLogsPtrOutput {
	return o.ApplyT(func(v *Broker) BrokerLogsPtrOutput { return v.Logs }).(BrokerLogsPtrOutput)
}

// Configuration block for the maintenance window start time. Detailed below.
func (o BrokerOutput) MaintenanceWindowStartTime() BrokerMaintenanceWindowStartTimeOutput {
	return o.ApplyT(func(v *Broker) BrokerMaintenanceWindowStartTimeOutput { return v.MaintenanceWindowStartTime }).(BrokerMaintenanceWindowStartTimeOutput)
}

// Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
func (o BrokerOutput) PubliclyAccessible() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Broker) pulumi.BoolPtrOutput { return v.PubliclyAccessible }).(pulumi.BoolPtrOutput)
}

// List of security group IDs assigned to the broker.
func (o BrokerOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringArrayOutput { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// Storage type of the broker. For `engineType` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engineType` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
func (o BrokerOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringOutput { return v.StorageType }).(pulumi.StringOutput)
}

// List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
func (o BrokerOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// Map of tags to assign to the broker. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o BrokerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o BrokerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Broker) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration block for broker users. For `engineType` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
//
// The following arguments are optional:
func (o BrokerOutput) Users() BrokerUserArrayOutput {
	return o.ApplyT(func(v *Broker) BrokerUserArrayOutput { return v.Users }).(BrokerUserArrayOutput)
}

type BrokerArrayOutput struct{ *pulumi.OutputState }

func (BrokerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Broker)(nil)).Elem()
}

func (o BrokerArrayOutput) ToBrokerArrayOutput() BrokerArrayOutput {
	return o
}

func (o BrokerArrayOutput) ToBrokerArrayOutputWithContext(ctx context.Context) BrokerArrayOutput {
	return o
}

func (o BrokerArrayOutput) Index(i pulumi.IntInput) BrokerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Broker {
		return vs[0].([]*Broker)[vs[1].(int)]
	}).(BrokerOutput)
}

type BrokerMapOutput struct{ *pulumi.OutputState }

func (BrokerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Broker)(nil)).Elem()
}

func (o BrokerMapOutput) ToBrokerMapOutput() BrokerMapOutput {
	return o
}

func (o BrokerMapOutput) ToBrokerMapOutputWithContext(ctx context.Context) BrokerMapOutput {
	return o
}

func (o BrokerMapOutput) MapIndex(k pulumi.StringInput) BrokerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Broker {
		return vs[0].(map[string]*Broker)[vs[1].(string)]
	}).(BrokerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrokerInput)(nil)).Elem(), &Broker{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrokerArrayInput)(nil)).Elem(), BrokerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrokerMapInput)(nil)).Elem(), BrokerMap{})
	pulumi.RegisterOutputType(BrokerOutput{})
	pulumi.RegisterOutputType(BrokerArrayOutput{})
	pulumi.RegisterOutputType(BrokerMapOutput{})
}
