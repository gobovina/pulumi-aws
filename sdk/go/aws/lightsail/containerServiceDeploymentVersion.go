// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lightsail

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a deployment version for your Amazon Lightsail container service.
//
// > **NOTE:** The Amazon Lightsail container service must be enabled to create a deployment.
//
// > **NOTE:** This resource allows you to manage an Amazon Lightsail container service deployment version but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lightsail.NewContainerServiceDeploymentVersion(ctx, "example", &lightsail.ContainerServiceDeploymentVersionArgs{
//				Containers: lightsail.ContainerServiceDeploymentVersionContainerArray{
//					&lightsail.ContainerServiceDeploymentVersionContainerArgs{
//						ContainerName: pulumi.String("hello-world"),
//						Image:         pulumi.String("amazon/amazon-lightsail:hello-world"),
//						Commands:      pulumi.StringArray{},
//						Environment: pulumi.StringMap{
//							"MY_ENVIRONMENT_VARIABLE": pulumi.String("my_value"),
//						},
//						Ports: pulumi.StringMap{
//							"80": pulumi.String("HTTP"),
//						},
//					},
//				},
//				PublicEndpoint: &lightsail.ContainerServiceDeploymentVersionPublicEndpointArgs{
//					ContainerName: pulumi.String("hello-world"),
//					ContainerPort: pulumi.Int(80),
//					HealthCheck: &lightsail.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs{
//						HealthyThreshold:   pulumi.Int(2),
//						UnhealthyThreshold: pulumi.Int(2),
//						TimeoutSeconds:     pulumi.Int(2),
//						IntervalSeconds:    pulumi.Int(5),
//						Path:               pulumi.String("/"),
//						SuccessCodes:       pulumi.String("200-499"),
//					},
//				},
//				ServiceName: pulumi.Any(exampleAwsLightsailContainerService.Name),
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
// Using `pulumi import`, import Lightsail Container Service Deployment Version using the `service_name` and `version` separated by a slash (`/`). For example:
//
// ```sh
//
//	$ pulumi import aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion example container-service-1/1
//
// ```
type ContainerServiceDeploymentVersion struct {
	pulumi.CustomResourceState

	// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
	Containers ContainerServiceDeploymentVersionContainerArrayOutput `pulumi:"containers"`
	// The timestamp when the deployment was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
	PublicEndpoint ContainerServiceDeploymentVersionPublicEndpointPtrOutput `pulumi:"publicEndpoint"`
	// The name for the container service.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// The current state of the container service.
	State pulumi.StringOutput `pulumi:"state"`
	// The version number of the deployment.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewContainerServiceDeploymentVersion registers a new resource with the given unique name, arguments, and options.
func NewContainerServiceDeploymentVersion(ctx *pulumi.Context,
	name string, args *ContainerServiceDeploymentVersionArgs, opts ...pulumi.ResourceOption) (*ContainerServiceDeploymentVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Containers == nil {
		return nil, errors.New("invalid value for required argument 'Containers'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ContainerServiceDeploymentVersion
	err := ctx.RegisterResource("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainerServiceDeploymentVersion gets an existing ContainerServiceDeploymentVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainerServiceDeploymentVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerServiceDeploymentVersionState, opts ...pulumi.ResourceOption) (*ContainerServiceDeploymentVersion, error) {
	var resource ContainerServiceDeploymentVersion
	err := ctx.ReadResource("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContainerServiceDeploymentVersion resources.
type containerServiceDeploymentVersionState struct {
	// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
	Containers []ContainerServiceDeploymentVersionContainer `pulumi:"containers"`
	// The timestamp when the deployment was created.
	CreatedAt *string `pulumi:"createdAt"`
	// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
	PublicEndpoint *ContainerServiceDeploymentVersionPublicEndpoint `pulumi:"publicEndpoint"`
	// The name for the container service.
	ServiceName *string `pulumi:"serviceName"`
	// The current state of the container service.
	State *string `pulumi:"state"`
	// The version number of the deployment.
	Version *int `pulumi:"version"`
}

type ContainerServiceDeploymentVersionState struct {
	// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
	Containers ContainerServiceDeploymentVersionContainerArrayInput
	// The timestamp when the deployment was created.
	CreatedAt pulumi.StringPtrInput
	// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
	PublicEndpoint ContainerServiceDeploymentVersionPublicEndpointPtrInput
	// The name for the container service.
	ServiceName pulumi.StringPtrInput
	// The current state of the container service.
	State pulumi.StringPtrInput
	// The version number of the deployment.
	Version pulumi.IntPtrInput
}

func (ContainerServiceDeploymentVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerServiceDeploymentVersionState)(nil)).Elem()
}

type containerServiceDeploymentVersionArgs struct {
	// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
	Containers []ContainerServiceDeploymentVersionContainer `pulumi:"containers"`
	// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
	PublicEndpoint *ContainerServiceDeploymentVersionPublicEndpoint `pulumi:"publicEndpoint"`
	// The name for the container service.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a ContainerServiceDeploymentVersion resource.
type ContainerServiceDeploymentVersionArgs struct {
	// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
	Containers ContainerServiceDeploymentVersionContainerArrayInput
	// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
	PublicEndpoint ContainerServiceDeploymentVersionPublicEndpointPtrInput
	// The name for the container service.
	ServiceName pulumi.StringInput
}

func (ContainerServiceDeploymentVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerServiceDeploymentVersionArgs)(nil)).Elem()
}

type ContainerServiceDeploymentVersionInput interface {
	pulumi.Input

	ToContainerServiceDeploymentVersionOutput() ContainerServiceDeploymentVersionOutput
	ToContainerServiceDeploymentVersionOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionOutput
}

func (*ContainerServiceDeploymentVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (i *ContainerServiceDeploymentVersion) ToContainerServiceDeploymentVersionOutput() ContainerServiceDeploymentVersionOutput {
	return i.ToContainerServiceDeploymentVersionOutputWithContext(context.Background())
}

func (i *ContainerServiceDeploymentVersion) ToContainerServiceDeploymentVersionOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceDeploymentVersionOutput)
}

// ContainerServiceDeploymentVersionArrayInput is an input type that accepts ContainerServiceDeploymentVersionArray and ContainerServiceDeploymentVersionArrayOutput values.
// You can construct a concrete instance of `ContainerServiceDeploymentVersionArrayInput` via:
//
//	ContainerServiceDeploymentVersionArray{ ContainerServiceDeploymentVersionArgs{...} }
type ContainerServiceDeploymentVersionArrayInput interface {
	pulumi.Input

	ToContainerServiceDeploymentVersionArrayOutput() ContainerServiceDeploymentVersionArrayOutput
	ToContainerServiceDeploymentVersionArrayOutputWithContext(context.Context) ContainerServiceDeploymentVersionArrayOutput
}

type ContainerServiceDeploymentVersionArray []ContainerServiceDeploymentVersionInput

func (ContainerServiceDeploymentVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (i ContainerServiceDeploymentVersionArray) ToContainerServiceDeploymentVersionArrayOutput() ContainerServiceDeploymentVersionArrayOutput {
	return i.ToContainerServiceDeploymentVersionArrayOutputWithContext(context.Background())
}

func (i ContainerServiceDeploymentVersionArray) ToContainerServiceDeploymentVersionArrayOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceDeploymentVersionArrayOutput)
}

// ContainerServiceDeploymentVersionMapInput is an input type that accepts ContainerServiceDeploymentVersionMap and ContainerServiceDeploymentVersionMapOutput values.
// You can construct a concrete instance of `ContainerServiceDeploymentVersionMapInput` via:
//
//	ContainerServiceDeploymentVersionMap{ "key": ContainerServiceDeploymentVersionArgs{...} }
type ContainerServiceDeploymentVersionMapInput interface {
	pulumi.Input

	ToContainerServiceDeploymentVersionMapOutput() ContainerServiceDeploymentVersionMapOutput
	ToContainerServiceDeploymentVersionMapOutputWithContext(context.Context) ContainerServiceDeploymentVersionMapOutput
}

type ContainerServiceDeploymentVersionMap map[string]ContainerServiceDeploymentVersionInput

func (ContainerServiceDeploymentVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (i ContainerServiceDeploymentVersionMap) ToContainerServiceDeploymentVersionMapOutput() ContainerServiceDeploymentVersionMapOutput {
	return i.ToContainerServiceDeploymentVersionMapOutputWithContext(context.Background())
}

func (i ContainerServiceDeploymentVersionMap) ToContainerServiceDeploymentVersionMapOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerServiceDeploymentVersionMapOutput)
}

type ContainerServiceDeploymentVersionOutput struct{ *pulumi.OutputState }

func (ContainerServiceDeploymentVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (o ContainerServiceDeploymentVersionOutput) ToContainerServiceDeploymentVersionOutput() ContainerServiceDeploymentVersionOutput {
	return o
}

func (o ContainerServiceDeploymentVersionOutput) ToContainerServiceDeploymentVersionOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionOutput {
	return o
}

// A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
func (o ContainerServiceDeploymentVersionOutput) Containers() ContainerServiceDeploymentVersionContainerArrayOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) ContainerServiceDeploymentVersionContainerArrayOutput {
		return v.Containers
	}).(ContainerServiceDeploymentVersionContainerArrayOutput)
}

// The timestamp when the deployment was created.
func (o ContainerServiceDeploymentVersionOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
func (o ContainerServiceDeploymentVersionOutput) PublicEndpoint() ContainerServiceDeploymentVersionPublicEndpointPtrOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) ContainerServiceDeploymentVersionPublicEndpointPtrOutput {
		return v.PublicEndpoint
	}).(ContainerServiceDeploymentVersionPublicEndpointPtrOutput)
}

// The name for the container service.
func (o ContainerServiceDeploymentVersionOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// The current state of the container service.
func (o ContainerServiceDeploymentVersionOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The version number of the deployment.
func (o ContainerServiceDeploymentVersionOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *ContainerServiceDeploymentVersion) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type ContainerServiceDeploymentVersionArrayOutput struct{ *pulumi.OutputState }

func (ContainerServiceDeploymentVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (o ContainerServiceDeploymentVersionArrayOutput) ToContainerServiceDeploymentVersionArrayOutput() ContainerServiceDeploymentVersionArrayOutput {
	return o
}

func (o ContainerServiceDeploymentVersionArrayOutput) ToContainerServiceDeploymentVersionArrayOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionArrayOutput {
	return o
}

func (o ContainerServiceDeploymentVersionArrayOutput) Index(i pulumi.IntInput) ContainerServiceDeploymentVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContainerServiceDeploymentVersion {
		return vs[0].([]*ContainerServiceDeploymentVersion)[vs[1].(int)]
	}).(ContainerServiceDeploymentVersionOutput)
}

type ContainerServiceDeploymentVersionMapOutput struct{ *pulumi.OutputState }

func (ContainerServiceDeploymentVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerServiceDeploymentVersion)(nil)).Elem()
}

func (o ContainerServiceDeploymentVersionMapOutput) ToContainerServiceDeploymentVersionMapOutput() ContainerServiceDeploymentVersionMapOutput {
	return o
}

func (o ContainerServiceDeploymentVersionMapOutput) ToContainerServiceDeploymentVersionMapOutputWithContext(ctx context.Context) ContainerServiceDeploymentVersionMapOutput {
	return o
}

func (o ContainerServiceDeploymentVersionMapOutput) MapIndex(k pulumi.StringInput) ContainerServiceDeploymentVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContainerServiceDeploymentVersion {
		return vs[0].(map[string]*ContainerServiceDeploymentVersion)[vs[1].(string)]
	}).(ContainerServiceDeploymentVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceDeploymentVersionInput)(nil)).Elem(), &ContainerServiceDeploymentVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceDeploymentVersionArrayInput)(nil)).Elem(), ContainerServiceDeploymentVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerServiceDeploymentVersionMapInput)(nil)).Elem(), ContainerServiceDeploymentVersionMap{})
	pulumi.RegisterOutputType(ContainerServiceDeploymentVersionOutput{})
	pulumi.RegisterOutputType(ContainerServiceDeploymentVersionArrayOutput{})
	pulumi.RegisterOutputType(ContainerServiceDeploymentVersionMapOutput{})
}
