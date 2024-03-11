// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apprunner

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an App Runner Service.
//
// ## Example Usage
//
// ### Service with a Code Repository Source
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apprunner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apprunner.NewService(ctx, "example", &apprunner.ServiceArgs{
//				ServiceName: pulumi.String("example"),
//				SourceConfiguration: &apprunner.ServiceSourceConfigurationArgs{
//					AuthenticationConfiguration: &apprunner.ServiceSourceConfigurationAuthenticationConfigurationArgs{
//						ConnectionArn: pulumi.Any(exampleAwsApprunnerConnection.Arn),
//					},
//					CodeRepository: &apprunner.ServiceSourceConfigurationCodeRepositoryArgs{
//						CodeConfiguration: &apprunner.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs{
//							CodeConfigurationValues: &apprunner.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs{
//								BuildCommand: pulumi.String("python setup.py develop"),
//								Port:         pulumi.String("8000"),
//								Runtime:      pulumi.String("PYTHON_3"),
//								StartCommand: pulumi.String("python runapp.py"),
//							},
//							ConfigurationSource: pulumi.String("API"),
//						},
//						RepositoryUrl: pulumi.String("https://github.com/example/my-example-python-app"),
//						SourceCodeVersion: &apprunner.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs{
//							Type:  pulumi.String("BRANCH"),
//							Value: pulumi.String("main"),
//						},
//					},
//				},
//				NetworkConfiguration: &apprunner.ServiceNetworkConfigurationArgs{
//					EgressConfiguration: &apprunner.ServiceNetworkConfigurationEgressConfigurationArgs{
//						EgressType:      pulumi.String("VPC"),
//						VpcConnectorArn: pulumi.Any(connector.Arn),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-apprunner-service"),
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
// ### Service with an Image Repository Source
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apprunner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apprunner.NewService(ctx, "example", &apprunner.ServiceArgs{
//				ServiceName: pulumi.String("example"),
//				SourceConfiguration: &apprunner.ServiceSourceConfigurationArgs{
//					ImageRepository: &apprunner.ServiceSourceConfigurationImageRepositoryArgs{
//						ImageConfiguration: &apprunner.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs{
//							Port: pulumi.String("8000"),
//						},
//						ImageIdentifier:     pulumi.String("public.ecr.aws/aws-containers/hello-app-runner:latest"),
//						ImageRepositoryType: pulumi.String("ECR_PUBLIC"),
//					},
//					AutoDeploymentsEnabled: pulumi.Bool(false),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-apprunner-service"),
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
// ### Service with Observability Configuration
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/apprunner"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleObservabilityConfiguration, err := apprunner.NewObservabilityConfiguration(ctx, "example", &apprunner.ObservabilityConfigurationArgs{
//				ObservabilityConfigurationName: pulumi.String("example"),
//				TraceConfiguration: &apprunner.ObservabilityConfigurationTraceConfigurationArgs{
//					Vendor: pulumi.String("AWSXRAY"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apprunner.NewService(ctx, "example", &apprunner.ServiceArgs{
//				ServiceName: pulumi.String("example"),
//				ObservabilityConfiguration: &apprunner.ServiceObservabilityConfigurationArgs{
//					ObservabilityConfigurationArn: exampleObservabilityConfiguration.Arn,
//					ObservabilityEnabled:          pulumi.Bool(true),
//				},
//				SourceConfiguration: &apprunner.ServiceSourceConfigurationArgs{
//					ImageRepository: &apprunner.ServiceSourceConfigurationImageRepositoryArgs{
//						ImageConfiguration: &apprunner.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs{
//							Port: pulumi.String("8000"),
//						},
//						ImageIdentifier:     pulumi.String("public.ecr.aws/aws-containers/hello-app-runner:latest"),
//						ImageRepositoryType: pulumi.String("ECR_PUBLIC"),
//					},
//					AutoDeploymentsEnabled: pulumi.Bool(false),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-apprunner-service"),
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
// Using `pulumi import`, import App Runner Services using the `arn`. For example:
//
// ```sh
// $ pulumi import aws:apprunner/service:Service example arn:aws:apprunner:us-east-1:1234567890:service/example/0a03292a89764e5882c41d8f991c82fe
// ```
type Service struct {
	pulumi.CustomResourceState

	// ARN of the App Runner service.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
	AutoScalingConfigurationArn pulumi.StringOutput `pulumi:"autoScalingConfigurationArn"`
	// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
	EncryptionConfiguration ServiceEncryptionConfigurationPtrOutput `pulumi:"encryptionConfiguration"`
	// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
	HealthCheckConfiguration ServiceHealthCheckConfigurationOutput `pulumi:"healthCheckConfiguration"`
	// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
	InstanceConfiguration ServiceInstanceConfigurationOutput `pulumi:"instanceConfiguration"`
	// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
	NetworkConfiguration ServiceNetworkConfigurationOutput `pulumi:"networkConfiguration"`
	// The observability configuration of your service. See Observability Configuration below for more details.
	ObservabilityConfiguration ServiceObservabilityConfigurationPtrOutput `pulumi:"observabilityConfiguration"`
	// An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// Name of the service.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
	ServiceUrl pulumi.StringOutput `pulumi:"serviceUrl"`
	// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
	//
	// The following arguments are optional:
	SourceConfiguration ServiceSourceConfigurationOutput `pulumi:"sourceConfiguration"`
	// Current state of the App Runner service.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewService registers a new resource with the given unique name, arguments, and options.
func NewService(ctx *pulumi.Context,
	name string, args *ServiceArgs, opts ...pulumi.ResourceOption) (*Service, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.SourceConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'SourceConfiguration'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Service
	err := ctx.RegisterResource("aws:apprunner/service:Service", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetService gets an existing Service resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceState, opts ...pulumi.ResourceOption) (*Service, error) {
	var resource Service
	err := ctx.ReadResource("aws:apprunner/service:Service", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Service resources.
type serviceState struct {
	// ARN of the App Runner service.
	Arn *string `pulumi:"arn"`
	// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
	AutoScalingConfigurationArn *string `pulumi:"autoScalingConfigurationArn"`
	// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
	EncryptionConfiguration *ServiceEncryptionConfiguration `pulumi:"encryptionConfiguration"`
	// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
	HealthCheckConfiguration *ServiceHealthCheckConfiguration `pulumi:"healthCheckConfiguration"`
	// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
	InstanceConfiguration *ServiceInstanceConfiguration `pulumi:"instanceConfiguration"`
	// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
	NetworkConfiguration *ServiceNetworkConfiguration `pulumi:"networkConfiguration"`
	// The observability configuration of your service. See Observability Configuration below for more details.
	ObservabilityConfiguration *ServiceObservabilityConfiguration `pulumi:"observabilityConfiguration"`
	// An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
	ServiceId *string `pulumi:"serviceId"`
	// Name of the service.
	ServiceName *string `pulumi:"serviceName"`
	// Subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
	ServiceUrl *string `pulumi:"serviceUrl"`
	// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
	//
	// The following arguments are optional:
	SourceConfiguration *ServiceSourceConfiguration `pulumi:"sourceConfiguration"`
	// Current state of the App Runner service.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ServiceState struct {
	// ARN of the App Runner service.
	Arn pulumi.StringPtrInput
	// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
	AutoScalingConfigurationArn pulumi.StringPtrInput
	// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
	EncryptionConfiguration ServiceEncryptionConfigurationPtrInput
	// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
	HealthCheckConfiguration ServiceHealthCheckConfigurationPtrInput
	// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
	InstanceConfiguration ServiceInstanceConfigurationPtrInput
	// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
	NetworkConfiguration ServiceNetworkConfigurationPtrInput
	// The observability configuration of your service. See Observability Configuration below for more details.
	ObservabilityConfiguration ServiceObservabilityConfigurationPtrInput
	// An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
	ServiceId pulumi.StringPtrInput
	// Name of the service.
	ServiceName pulumi.StringPtrInput
	// Subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
	ServiceUrl pulumi.StringPtrInput
	// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
	//
	// The following arguments are optional:
	SourceConfiguration ServiceSourceConfigurationPtrInput
	// Current state of the App Runner service.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
	AutoScalingConfigurationArn *string `pulumi:"autoScalingConfigurationArn"`
	// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
	EncryptionConfiguration *ServiceEncryptionConfiguration `pulumi:"encryptionConfiguration"`
	// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
	HealthCheckConfiguration *ServiceHealthCheckConfiguration `pulumi:"healthCheckConfiguration"`
	// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
	InstanceConfiguration *ServiceInstanceConfiguration `pulumi:"instanceConfiguration"`
	// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
	NetworkConfiguration *ServiceNetworkConfiguration `pulumi:"networkConfiguration"`
	// The observability configuration of your service. See Observability Configuration below for more details.
	ObservabilityConfiguration *ServiceObservabilityConfiguration `pulumi:"observabilityConfiguration"`
	// Name of the service.
	ServiceName string `pulumi:"serviceName"`
	// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
	//
	// The following arguments are optional:
	SourceConfiguration ServiceSourceConfiguration `pulumi:"sourceConfiguration"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
	AutoScalingConfigurationArn pulumi.StringPtrInput
	// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
	EncryptionConfiguration ServiceEncryptionConfigurationPtrInput
	// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
	HealthCheckConfiguration ServiceHealthCheckConfigurationPtrInput
	// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
	InstanceConfiguration ServiceInstanceConfigurationPtrInput
	// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
	NetworkConfiguration ServiceNetworkConfigurationPtrInput
	// The observability configuration of your service. See Observability Configuration below for more details.
	ObservabilityConfiguration ServiceObservabilityConfigurationPtrInput
	// Name of the service.
	ServiceName pulumi.StringInput
	// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
	//
	// The following arguments are optional:
	SourceConfiguration ServiceSourceConfigurationInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceArgs)(nil)).Elem()
}

type ServiceInput interface {
	pulumi.Input

	ToServiceOutput() ServiceOutput
	ToServiceOutputWithContext(ctx context.Context) ServiceOutput
}

func (*Service) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//	ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (i ServiceArray) ToServiceArrayOutput() ServiceArrayOutput {
	return i.ToServiceArrayOutputWithContext(context.Background())
}

func (i ServiceArray) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceArrayOutput)
}

// ServiceMapInput is an input type that accepts ServiceMap and ServiceMapOutput values.
// You can construct a concrete instance of `ServiceMapInput` via:
//
//	ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

type ServiceOutput struct{ *pulumi.OutputState }

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

// ARN of the App Runner service.
func (o ServiceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
func (o ServiceOutput) AutoScalingConfigurationArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.AutoScalingConfigurationArn }).(pulumi.StringOutput)
}

// An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
func (o ServiceOutput) EncryptionConfiguration() ServiceEncryptionConfigurationPtrOutput {
	return o.ApplyT(func(v *Service) ServiceEncryptionConfigurationPtrOutput { return v.EncryptionConfiguration }).(ServiceEncryptionConfigurationPtrOutput)
}

// Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
func (o ServiceOutput) HealthCheckConfiguration() ServiceHealthCheckConfigurationOutput {
	return o.ApplyT(func(v *Service) ServiceHealthCheckConfigurationOutput { return v.HealthCheckConfiguration }).(ServiceHealthCheckConfigurationOutput)
}

// The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
func (o ServiceOutput) InstanceConfiguration() ServiceInstanceConfigurationOutput {
	return o.ApplyT(func(v *Service) ServiceInstanceConfigurationOutput { return v.InstanceConfiguration }).(ServiceInstanceConfigurationOutput)
}

// Configuration settings related to network traffic of the web application that the App Runner service runs. See Network Configuration below for more details.
func (o ServiceOutput) NetworkConfiguration() ServiceNetworkConfigurationOutput {
	return o.ApplyT(func(v *Service) ServiceNetworkConfigurationOutput { return v.NetworkConfiguration }).(ServiceNetworkConfigurationOutput)
}

// The observability configuration of your service. See Observability Configuration below for more details.
func (o ServiceOutput) ObservabilityConfiguration() ServiceObservabilityConfigurationPtrOutput {
	return o.ApplyT(func(v *Service) ServiceObservabilityConfigurationPtrOutput { return v.ObservabilityConfiguration }).(ServiceObservabilityConfigurationPtrOutput)
}

// An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
func (o ServiceOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// Name of the service.
func (o ServiceOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
func (o ServiceOutput) ServiceUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.ServiceUrl }).(pulumi.StringOutput)
}

// The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
//
// The following arguments are optional:
func (o ServiceOutput) SourceConfiguration() ServiceSourceConfigurationOutput {
	return o.ApplyT(func(v *Service) ServiceSourceConfigurationOutput { return v.SourceConfiguration }).(ServiceSourceConfigurationOutput)
}

// Current state of the App Runner service.
func (o ServiceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServiceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Service) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ServiceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Service) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Service {
		return vs[0].([]*Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Service {
		return vs[0].(map[string]*Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceInput)(nil)).Elem(), &Service{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceArrayInput)(nil)).Elem(), ServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMapInput)(nil)).Elem(), ServiceMap{})
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
