// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkfirewall

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Network Firewall Logging Configuration Resource
//
// ## Example Usage
//
// ### Logging to S3
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkfirewall"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkfirewall.NewLoggingConfiguration(ctx, "example", &networkfirewall.LoggingConfigurationArgs{
//				FirewallArn: pulumi.Any(exampleAwsNetworkfirewallFirewall.Arn),
//				LoggingConfiguration: &networkfirewall.LoggingConfigurationLoggingConfigurationArgs{
//					LogDestinationConfigs: networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArray{
//						&networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs{
//							LogDestination: pulumi.StringMap{
//								"bucketName": pulumi.Any(exampleAwsS3Bucket.Bucket),
//								"prefix":     pulumi.String("/example"),
//							},
//							LogDestinationType: pulumi.String("S3"),
//							LogType:            pulumi.String("FLOW"),
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
// <!--End PulumiCodeChooser -->
//
// ### Logging to CloudWatch
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkfirewall"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkfirewall.NewLoggingConfiguration(ctx, "example", &networkfirewall.LoggingConfigurationArgs{
//				FirewallArn: pulumi.Any(exampleAwsNetworkfirewallFirewall.Arn),
//				LoggingConfiguration: &networkfirewall.LoggingConfigurationLoggingConfigurationArgs{
//					LogDestinationConfigs: networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArray{
//						&networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs{
//							LogDestination: pulumi.StringMap{
//								"logGroup": pulumi.Any(exampleAwsCloudwatchLogGroup.Name),
//							},
//							LogDestinationType: pulumi.String("CloudWatchLogs"),
//							LogType:            pulumi.String("ALERT"),
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
// <!--End PulumiCodeChooser -->
//
// ### Logging to Kinesis Data Firehose
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/networkfirewall"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkfirewall.NewLoggingConfiguration(ctx, "example", &networkfirewall.LoggingConfigurationArgs{
//				FirewallArn: pulumi.Any(exampleAwsNetworkfirewallFirewall.Arn),
//				LoggingConfiguration: &networkfirewall.LoggingConfigurationLoggingConfigurationArgs{
//					LogDestinationConfigs: networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArray{
//						&networkfirewall.LoggingConfigurationLoggingConfigurationLogDestinationConfigArgs{
//							LogDestination: pulumi.StringMap{
//								"deliveryStream": pulumi.Any(exampleAwsKinesisFirehoseDeliveryStream.Name),
//							},
//							LogDestinationType: pulumi.String("KinesisDataFirehose"),
//							LogType:            pulumi.String("ALERT"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Network Firewall Logging Configurations using the `firewall_arn`. For example:
//
// ```sh
// $ pulumi import aws:networkfirewall/loggingConfiguration:LoggingConfiguration example arn:aws:network-firewall:us-west-1:123456789012:firewall/example
// ```
type LoggingConfiguration struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Network Firewall firewall.
	FirewallArn pulumi.StringOutput `pulumi:"firewallArn"`
	// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
	LoggingConfiguration LoggingConfigurationLoggingConfigurationOutput `pulumi:"loggingConfiguration"`
}

// NewLoggingConfiguration registers a new resource with the given unique name, arguments, and options.
func NewLoggingConfiguration(ctx *pulumi.Context,
	name string, args *LoggingConfigurationArgs, opts ...pulumi.ResourceOption) (*LoggingConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FirewallArn == nil {
		return nil, errors.New("invalid value for required argument 'FirewallArn'")
	}
	if args.LoggingConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'LoggingConfiguration'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoggingConfiguration
	err := ctx.RegisterResource("aws:networkfirewall/loggingConfiguration:LoggingConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoggingConfiguration gets an existing LoggingConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoggingConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoggingConfigurationState, opts ...pulumi.ResourceOption) (*LoggingConfiguration, error) {
	var resource LoggingConfiguration
	err := ctx.ReadResource("aws:networkfirewall/loggingConfiguration:LoggingConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoggingConfiguration resources.
type loggingConfigurationState struct {
	// The Amazon Resource Name (ARN) of the Network Firewall firewall.
	FirewallArn *string `pulumi:"firewallArn"`
	// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
	LoggingConfiguration *LoggingConfigurationLoggingConfiguration `pulumi:"loggingConfiguration"`
}

type LoggingConfigurationState struct {
	// The Amazon Resource Name (ARN) of the Network Firewall firewall.
	FirewallArn pulumi.StringPtrInput
	// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
	LoggingConfiguration LoggingConfigurationLoggingConfigurationPtrInput
}

func (LoggingConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingConfigurationState)(nil)).Elem()
}

type loggingConfigurationArgs struct {
	// The Amazon Resource Name (ARN) of the Network Firewall firewall.
	FirewallArn string `pulumi:"firewallArn"`
	// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
	LoggingConfiguration LoggingConfigurationLoggingConfiguration `pulumi:"loggingConfiguration"`
}

// The set of arguments for constructing a LoggingConfiguration resource.
type LoggingConfigurationArgs struct {
	// The Amazon Resource Name (ARN) of the Network Firewall firewall.
	FirewallArn pulumi.StringInput
	// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
	LoggingConfiguration LoggingConfigurationLoggingConfigurationInput
}

func (LoggingConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingConfigurationArgs)(nil)).Elem()
}

type LoggingConfigurationInput interface {
	pulumi.Input

	ToLoggingConfigurationOutput() LoggingConfigurationOutput
	ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput
}

func (*LoggingConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingConfiguration)(nil)).Elem()
}

func (i *LoggingConfiguration) ToLoggingConfigurationOutput() LoggingConfigurationOutput {
	return i.ToLoggingConfigurationOutputWithContext(context.Background())
}

func (i *LoggingConfiguration) ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationOutput)
}

// LoggingConfigurationArrayInput is an input type that accepts LoggingConfigurationArray and LoggingConfigurationArrayOutput values.
// You can construct a concrete instance of `LoggingConfigurationArrayInput` via:
//
//	LoggingConfigurationArray{ LoggingConfigurationArgs{...} }
type LoggingConfigurationArrayInput interface {
	pulumi.Input

	ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput
	ToLoggingConfigurationArrayOutputWithContext(context.Context) LoggingConfigurationArrayOutput
}

type LoggingConfigurationArray []LoggingConfigurationInput

func (LoggingConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingConfiguration)(nil)).Elem()
}

func (i LoggingConfigurationArray) ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput {
	return i.ToLoggingConfigurationArrayOutputWithContext(context.Background())
}

func (i LoggingConfigurationArray) ToLoggingConfigurationArrayOutputWithContext(ctx context.Context) LoggingConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationArrayOutput)
}

// LoggingConfigurationMapInput is an input type that accepts LoggingConfigurationMap and LoggingConfigurationMapOutput values.
// You can construct a concrete instance of `LoggingConfigurationMapInput` via:
//
//	LoggingConfigurationMap{ "key": LoggingConfigurationArgs{...} }
type LoggingConfigurationMapInput interface {
	pulumi.Input

	ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput
	ToLoggingConfigurationMapOutputWithContext(context.Context) LoggingConfigurationMapOutput
}

type LoggingConfigurationMap map[string]LoggingConfigurationInput

func (LoggingConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingConfiguration)(nil)).Elem()
}

func (i LoggingConfigurationMap) ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput {
	return i.ToLoggingConfigurationMapOutputWithContext(context.Background())
}

func (i LoggingConfigurationMap) ToLoggingConfigurationMapOutputWithContext(ctx context.Context) LoggingConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingConfigurationMapOutput)
}

type LoggingConfigurationOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationOutput) ToLoggingConfigurationOutput() LoggingConfigurationOutput {
	return o
}

func (o LoggingConfigurationOutput) ToLoggingConfigurationOutputWithContext(ctx context.Context) LoggingConfigurationOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Network Firewall firewall.
func (o LoggingConfigurationOutput) FirewallArn() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingConfiguration) pulumi.StringOutput { return v.FirewallArn }).(pulumi.StringOutput)
}

// A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
func (o LoggingConfigurationOutput) LoggingConfiguration() LoggingConfigurationLoggingConfigurationOutput {
	return o.ApplyT(func(v *LoggingConfiguration) LoggingConfigurationLoggingConfigurationOutput {
		return v.LoggingConfiguration
	}).(LoggingConfigurationLoggingConfigurationOutput)
}

type LoggingConfigurationArrayOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationArrayOutput) ToLoggingConfigurationArrayOutput() LoggingConfigurationArrayOutput {
	return o
}

func (o LoggingConfigurationArrayOutput) ToLoggingConfigurationArrayOutputWithContext(ctx context.Context) LoggingConfigurationArrayOutput {
	return o
}

func (o LoggingConfigurationArrayOutput) Index(i pulumi.IntInput) LoggingConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoggingConfiguration {
		return vs[0].([]*LoggingConfiguration)[vs[1].(int)]
	}).(LoggingConfigurationOutput)
}

type LoggingConfigurationMapOutput struct{ *pulumi.OutputState }

func (LoggingConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingConfiguration)(nil)).Elem()
}

func (o LoggingConfigurationMapOutput) ToLoggingConfigurationMapOutput() LoggingConfigurationMapOutput {
	return o
}

func (o LoggingConfigurationMapOutput) ToLoggingConfigurationMapOutputWithContext(ctx context.Context) LoggingConfigurationMapOutput {
	return o
}

func (o LoggingConfigurationMapOutput) MapIndex(k pulumi.StringInput) LoggingConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoggingConfiguration {
		return vs[0].(map[string]*LoggingConfiguration)[vs[1].(string)]
	}).(LoggingConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationInput)(nil)).Elem(), &LoggingConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationArrayInput)(nil)).Elem(), LoggingConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingConfigurationMapInput)(nil)).Elem(), LoggingConfigurationMap{})
	pulumi.RegisterOutputType(LoggingConfigurationOutput{})
	pulumi.RegisterOutputType(LoggingConfigurationArrayOutput{})
	pulumi.RegisterOutputType(LoggingConfigurationMapOutput{})
}
