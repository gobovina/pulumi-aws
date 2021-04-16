// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicediscovery

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Service Discovery Service resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicediscovery"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleVpc, err := ec2.NewVpc(ctx, "exampleVpc", &ec2.VpcArgs{
// 			CidrBlock:          pulumi.String("10.0.0.0/16"),
// 			EnableDnsSupport:   pulumi.Bool(true),
// 			EnableDnsHostnames: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		examplePrivateDnsNamespace, err := servicediscovery.NewPrivateDnsNamespace(ctx, "examplePrivateDnsNamespace", &servicediscovery.PrivateDnsNamespaceArgs{
// 			Description: pulumi.String("example"),
// 			Vpc:         exampleVpc.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = servicediscovery.NewService(ctx, "exampleService", &servicediscovery.ServiceArgs{
// 			DnsConfig: &servicediscovery.ServiceDnsConfigArgs{
// 				NamespaceId: examplePrivateDnsNamespace.ID(),
// 				DnsRecords: servicediscovery.ServiceDnsConfigDnsRecordArray{
// 					&servicediscovery.ServiceDnsConfigDnsRecordArgs{
// 						Ttl:  pulumi.Int(10),
// 						Type: pulumi.String("A"),
// 					},
// 				},
// 				RoutingPolicy: pulumi.String("MULTIVALUE"),
// 			},
// 			HealthCheckCustomConfig: &servicediscovery.ServiceHealthCheckCustomConfigArgs{
// 				FailureThreshold: pulumi.Int(1),
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
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicediscovery"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		examplePublicDnsNamespace, err := servicediscovery.NewPublicDnsNamespace(ctx, "examplePublicDnsNamespace", &servicediscovery.PublicDnsNamespaceArgs{
// 			Description: pulumi.String("example"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = servicediscovery.NewService(ctx, "exampleService", &servicediscovery.ServiceArgs{
// 			DnsConfig: &servicediscovery.ServiceDnsConfigArgs{
// 				NamespaceId: examplePublicDnsNamespace.ID(),
// 				DnsRecords: servicediscovery.ServiceDnsConfigDnsRecordArray{
// 					&servicediscovery.ServiceDnsConfigDnsRecordArgs{
// 						Ttl:  pulumi.Int(10),
// 						Type: pulumi.String("A"),
// 					},
// 				},
// 			},
// 			HealthCheckConfig: &servicediscovery.ServiceHealthCheckConfigArgs{
// 				FailureThreshold: pulumi.Int(10),
// 				ResourcePath:     pulumi.String("path"),
// 				Type:             pulumi.String("HTTP"),
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
// Service Discovery Service can be imported using the service ID, e.g.
//
// ```sh
//  $ pulumi import aws:servicediscovery/service:Service example 0123456789
// ```
type Service struct {
	pulumi.CustomResourceState

	// The ARN of the service.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of the service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
	DnsConfig ServiceDnsConfigPtrOutput `pulumi:"dnsConfig"`
	// A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
	HealthCheckConfig ServiceHealthCheckConfigPtrOutput `pulumi:"healthCheckConfig"`
	// A complex type that contains settings for ECS managed health checks.
	HealthCheckCustomConfig ServiceHealthCheckCustomConfigPtrOutput `pulumi:"healthCheckCustomConfig"`
	// The name of the service.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the namespace to use for DNS configuration.
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// A map of tags to assign to the service.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewService registers a new resource with the given unique name, arguments, and options.
func NewService(ctx *pulumi.Context,
	name string, args *ServiceArgs, opts ...pulumi.ResourceOption) (*Service, error) {
	if args == nil {
		args = &ServiceArgs{}
	}

	var resource Service
	err := ctx.RegisterResource("aws:servicediscovery/service:Service", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:servicediscovery/service:Service", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Service resources.
type serviceState struct {
	// The ARN of the service.
	Arn *string `pulumi:"arn"`
	// The description of the service.
	Description *string `pulumi:"description"`
	// A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
	DnsConfig *ServiceDnsConfig `pulumi:"dnsConfig"`
	// A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
	HealthCheckConfig *ServiceHealthCheckConfig `pulumi:"healthCheckConfig"`
	// A complex type that contains settings for ECS managed health checks.
	HealthCheckCustomConfig *ServiceHealthCheckCustomConfig `pulumi:"healthCheckCustomConfig"`
	// The name of the service.
	Name *string `pulumi:"name"`
	// The ID of the namespace to use for DNS configuration.
	NamespaceId *string `pulumi:"namespaceId"`
	// A map of tags to assign to the service.
	Tags map[string]string `pulumi:"tags"`
}

type ServiceState struct {
	// The ARN of the service.
	Arn pulumi.StringPtrInput
	// The description of the service.
	Description pulumi.StringPtrInput
	// A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
	DnsConfig ServiceDnsConfigPtrInput
	// A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
	HealthCheckConfig ServiceHealthCheckConfigPtrInput
	// A complex type that contains settings for ECS managed health checks.
	HealthCheckCustomConfig ServiceHealthCheckCustomConfigPtrInput
	// The name of the service.
	Name pulumi.StringPtrInput
	// The ID of the namespace to use for DNS configuration.
	NamespaceId pulumi.StringPtrInput
	// A map of tags to assign to the service.
	Tags pulumi.StringMapInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// The description of the service.
	Description *string `pulumi:"description"`
	// A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
	DnsConfig *ServiceDnsConfig `pulumi:"dnsConfig"`
	// A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
	HealthCheckConfig *ServiceHealthCheckConfig `pulumi:"healthCheckConfig"`
	// A complex type that contains settings for ECS managed health checks.
	HealthCheckCustomConfig *ServiceHealthCheckCustomConfig `pulumi:"healthCheckCustomConfig"`
	// The name of the service.
	Name *string `pulumi:"name"`
	// The ID of the namespace to use for DNS configuration.
	NamespaceId *string `pulumi:"namespaceId"`
	// A map of tags to assign to the service.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// The description of the service.
	Description pulumi.StringPtrInput
	// A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
	DnsConfig ServiceDnsConfigPtrInput
	// A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
	HealthCheckConfig ServiceHealthCheckConfigPtrInput
	// A complex type that contains settings for ECS managed health checks.
	HealthCheckCustomConfig ServiceHealthCheckCustomConfigPtrInput
	// The name of the service.
	Name pulumi.StringPtrInput
	// The ID of the namespace to use for DNS configuration.
	NamespaceId pulumi.StringPtrInput
	// A map of tags to assign to the service.
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
	return reflect.TypeOf((*Service)(nil))
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

func (i *Service) ToServicePtrOutput() ServicePtrOutput {
	return i.ToServicePtrOutputWithContext(context.Background())
}

func (i *Service) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePtrOutput)
}

type ServicePtrInput interface {
	pulumi.Input

	ToServicePtrOutput() ServicePtrOutput
	ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput
}

type servicePtrType ServiceArgs

func (*servicePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil))
}

func (i *servicePtrType) ToServicePtrOutput() ServicePtrOutput {
	return i.ToServicePtrOutputWithContext(context.Background())
}

func (i *servicePtrType) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePtrOutput)
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//          ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Service)(nil))
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
//          ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Service)(nil))
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

type ServiceOutput struct {
	*pulumi.OutputState
}

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Service)(nil))
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

func (o ServiceOutput) ToServicePtrOutput() ServicePtrOutput {
	return o.ToServicePtrOutputWithContext(context.Background())
}

func (o ServiceOutput) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return o.ApplyT(func(v Service) *Service {
		return &v
	}).(ServicePtrOutput)
}

type ServicePtrOutput struct {
	*pulumi.OutputState
}

func (ServicePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil))
}

func (o ServicePtrOutput) ToServicePtrOutput() ServicePtrOutput {
	return o
}

func (o ServicePtrOutput) ToServicePtrOutputWithContext(ctx context.Context) ServicePtrOutput {
	return o
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Service)(nil))
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Service {
		return vs[0].([]Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Service)(nil))
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Service {
		return vs[0].(map[string]Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServicePtrOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
