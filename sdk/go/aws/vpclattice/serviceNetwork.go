// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpclattice

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS VPC Lattice Service Network.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/vpclattice"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := vpclattice.NewServiceNetwork(ctx, "example", &vpclattice.ServiceNetworkArgs{
//				AuthType: pulumi.String("AWS_IAM"),
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
// Using `pulumi import`, import VPC Lattice Service Network using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:vpclattice/serviceNetwork:ServiceNetwork example sn-0158f91c1e3358dba
//
// ```
type ServiceNetwork struct {
	pulumi.CustomResourceState

	// ARN of the Service Network.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Type of IAM policy. Either `NONE` or `AWS_IAM`.
	AuthType pulumi.StringOutput `pulumi:"authType"`
	// Name of the service network
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewServiceNetwork registers a new resource with the given unique name, arguments, and options.
func NewServiceNetwork(ctx *pulumi.Context,
	name string, args *ServiceNetworkArgs, opts ...pulumi.ResourceOption) (*ServiceNetwork, error) {
	if args == nil {
		args = &ServiceNetworkArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceNetwork
	err := ctx.RegisterResource("aws:vpclattice/serviceNetwork:ServiceNetwork", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceNetwork gets an existing ServiceNetwork resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceNetworkState, opts ...pulumi.ResourceOption) (*ServiceNetwork, error) {
	var resource ServiceNetwork
	err := ctx.ReadResource("aws:vpclattice/serviceNetwork:ServiceNetwork", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceNetwork resources.
type serviceNetworkState struct {
	// ARN of the Service Network.
	Arn *string `pulumi:"arn"`
	// Type of IAM policy. Either `NONE` or `AWS_IAM`.
	AuthType *string `pulumi:"authType"`
	// Name of the service network
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ServiceNetworkState struct {
	// ARN of the Service Network.
	Arn pulumi.StringPtrInput
	// Type of IAM policy. Either `NONE` or `AWS_IAM`.
	AuthType pulumi.StringPtrInput
	// Name of the service network
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (ServiceNetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceNetworkState)(nil)).Elem()
}

type serviceNetworkArgs struct {
	// Type of IAM policy. Either `NONE` or `AWS_IAM`.
	AuthType *string `pulumi:"authType"`
	// Name of the service network
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ServiceNetwork resource.
type ServiceNetworkArgs struct {
	// Type of IAM policy. Either `NONE` or `AWS_IAM`.
	AuthType pulumi.StringPtrInput
	// Name of the service network
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ServiceNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceNetworkArgs)(nil)).Elem()
}

type ServiceNetworkInput interface {
	pulumi.Input

	ToServiceNetworkOutput() ServiceNetworkOutput
	ToServiceNetworkOutputWithContext(ctx context.Context) ServiceNetworkOutput
}

func (*ServiceNetwork) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceNetwork)(nil)).Elem()
}

func (i *ServiceNetwork) ToServiceNetworkOutput() ServiceNetworkOutput {
	return i.ToServiceNetworkOutputWithContext(context.Background())
}

func (i *ServiceNetwork) ToServiceNetworkOutputWithContext(ctx context.Context) ServiceNetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNetworkOutput)
}

// ServiceNetworkArrayInput is an input type that accepts ServiceNetworkArray and ServiceNetworkArrayOutput values.
// You can construct a concrete instance of `ServiceNetworkArrayInput` via:
//
//	ServiceNetworkArray{ ServiceNetworkArgs{...} }
type ServiceNetworkArrayInput interface {
	pulumi.Input

	ToServiceNetworkArrayOutput() ServiceNetworkArrayOutput
	ToServiceNetworkArrayOutputWithContext(context.Context) ServiceNetworkArrayOutput
}

type ServiceNetworkArray []ServiceNetworkInput

func (ServiceNetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceNetwork)(nil)).Elem()
}

func (i ServiceNetworkArray) ToServiceNetworkArrayOutput() ServiceNetworkArrayOutput {
	return i.ToServiceNetworkArrayOutputWithContext(context.Background())
}

func (i ServiceNetworkArray) ToServiceNetworkArrayOutputWithContext(ctx context.Context) ServiceNetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNetworkArrayOutput)
}

// ServiceNetworkMapInput is an input type that accepts ServiceNetworkMap and ServiceNetworkMapOutput values.
// You can construct a concrete instance of `ServiceNetworkMapInput` via:
//
//	ServiceNetworkMap{ "key": ServiceNetworkArgs{...} }
type ServiceNetworkMapInput interface {
	pulumi.Input

	ToServiceNetworkMapOutput() ServiceNetworkMapOutput
	ToServiceNetworkMapOutputWithContext(context.Context) ServiceNetworkMapOutput
}

type ServiceNetworkMap map[string]ServiceNetworkInput

func (ServiceNetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceNetwork)(nil)).Elem()
}

func (i ServiceNetworkMap) ToServiceNetworkMapOutput() ServiceNetworkMapOutput {
	return i.ToServiceNetworkMapOutputWithContext(context.Background())
}

func (i ServiceNetworkMap) ToServiceNetworkMapOutputWithContext(ctx context.Context) ServiceNetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceNetworkMapOutput)
}

type ServiceNetworkOutput struct{ *pulumi.OutputState }

func (ServiceNetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceNetwork)(nil)).Elem()
}

func (o ServiceNetworkOutput) ToServiceNetworkOutput() ServiceNetworkOutput {
	return o
}

func (o ServiceNetworkOutput) ToServiceNetworkOutputWithContext(ctx context.Context) ServiceNetworkOutput {
	return o
}

// ARN of the Service Network.
func (o ServiceNetworkOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNetwork) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Type of IAM policy. Either `NONE` or `AWS_IAM`.
func (o ServiceNetworkOutput) AuthType() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNetwork) pulumi.StringOutput { return v.AuthType }).(pulumi.StringOutput)
}

// Name of the service network
//
// The following arguments are optional:
func (o ServiceNetworkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceNetwork) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServiceNetworkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceNetwork) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ServiceNetworkOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceNetwork) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ServiceNetworkArrayOutput struct{ *pulumi.OutputState }

func (ServiceNetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceNetwork)(nil)).Elem()
}

func (o ServiceNetworkArrayOutput) ToServiceNetworkArrayOutput() ServiceNetworkArrayOutput {
	return o
}

func (o ServiceNetworkArrayOutput) ToServiceNetworkArrayOutputWithContext(ctx context.Context) ServiceNetworkArrayOutput {
	return o
}

func (o ServiceNetworkArrayOutput) Index(i pulumi.IntInput) ServiceNetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceNetwork {
		return vs[0].([]*ServiceNetwork)[vs[1].(int)]
	}).(ServiceNetworkOutput)
}

type ServiceNetworkMapOutput struct{ *pulumi.OutputState }

func (ServiceNetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceNetwork)(nil)).Elem()
}

func (o ServiceNetworkMapOutput) ToServiceNetworkMapOutput() ServiceNetworkMapOutput {
	return o
}

func (o ServiceNetworkMapOutput) ToServiceNetworkMapOutputWithContext(ctx context.Context) ServiceNetworkMapOutput {
	return o
}

func (o ServiceNetworkMapOutput) MapIndex(k pulumi.StringInput) ServiceNetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceNetwork {
		return vs[0].(map[string]*ServiceNetwork)[vs[1].(string)]
	}).(ServiceNetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNetworkInput)(nil)).Elem(), &ServiceNetwork{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNetworkArrayInput)(nil)).Elem(), ServiceNetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceNetworkMapInput)(nil)).Elem(), ServiceNetworkMap{})
	pulumi.RegisterOutputType(ServiceNetworkOutput{})
	pulumi.RegisterOutputType(ServiceNetworkArrayOutput{})
	pulumi.RegisterOutputType(ServiceNetworkMapOutput{})
}
