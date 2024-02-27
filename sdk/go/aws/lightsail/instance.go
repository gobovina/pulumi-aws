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

// Provides a Lightsail Instance. Amazon Lightsail is a service to provide easy virtual private servers
// with custom software already setup. See [What is Amazon Lightsail?](https://lightsail.aws.amazon.com/ls/docs/getting-started/article/what-is-amazon-lightsail)
// for more information.
//
// > **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
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
//			_, err := lightsail.NewInstance(ctx, "gitlabTest", &lightsail.InstanceArgs{
//				AvailabilityZone: pulumi.String("us-east-1b"),
//				BlueprintId:      pulumi.String("amazon_linux_2"),
//				BundleId:         pulumi.String("nano_1_0"),
//				KeyPairName:      pulumi.String("some_key_name"),
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
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
// ### Example With User Data
//
// Lightsail user data is handled differently than ec2 user data. Lightsail user data only accepts a single lined string. The below example shows installing apache and creating the index page.
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
//			_, err := lightsail.NewInstance(ctx, "custom", &lightsail.InstanceArgs{
//				AvailabilityZone: pulumi.String("us-east-1b"),
//				BlueprintId:      pulumi.String("amazon_linux_2"),
//				BundleId:         pulumi.String("nano_1_0"),
//				UserData:         pulumi.String("sudo yum install -y httpd && sudo systemctl start httpd && sudo systemctl enable httpd && echo '<h1>Deployed via Pulumi</h1>' | sudo tee /var/www/html/index.html"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Enable Auto Snapshots
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
//			_, err := lightsail.NewInstance(ctx, "test", &lightsail.InstanceArgs{
//				AddOn: &lightsail.InstanceAddOnArgs{
//					SnapshotTime: pulumi.String("06:00"),
//					Status:       pulumi.String("Enabled"),
//					Type:         pulumi.String("AutoSnapshot"),
//				},
//				AvailabilityZone: pulumi.String("us-east-1b"),
//				BlueprintId:      pulumi.String("amazon_linux_2"),
//				BundleId:         pulumi.String("nano_1_0"),
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
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
// Using `pulumi import`, import Lightsail Instances using their name. For example:
//
// ```sh
//
//	$ pulumi import aws:lightsail/instance:Instance gitlab_test 'custom_gitlab'
//
// ```
type Instance struct {
	pulumi.CustomResourceState

	// The add on configuration for the instance. Detailed below.
	AddOn InstanceAddOnPtrOutput `pulumi:"addOn"`
	// The ARN of the Lightsail instance (matches `id`).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Availability Zone in which to create your instance. A
	// list of available zones can be obtained using the AWS CLI command:
	// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The ID for a virtual private server image. A list of available
	// blueprint IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
	BlueprintId pulumi.StringOutput `pulumi:"blueprintId"`
	// The bundle of specification information. A list of available
	// bundle IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
	BundleId pulumi.StringOutput `pulumi:"bundleId"`
	// The number of vCPUs the instance has.
	CpuCount pulumi.IntOutput `pulumi:"cpuCount"`
	// The timestamp when the instance was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
	IpAddressType pulumi.StringPtrOutput `pulumi:"ipAddressType"`
	// List of IPv6 addresses for the Lightsail instance.
	Ipv6Addresses pulumi.StringArrayOutput `pulumi:"ipv6Addresses"`
	// A Boolean value indicating whether this instance has a static IP assigned to it.
	IsStaticIp pulumi.BoolOutput `pulumi:"isStaticIp"`
	// The name of your key pair. Created in the
	// Lightsail console (cannot use `ec2.KeyPair` at this time)
	KeyPairName pulumi.StringPtrOutput `pulumi:"keyPairName"`
	// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
	Name pulumi.StringOutput `pulumi:"name"`
	// The private IP address of the instance.
	PrivateIpAddress pulumi.StringOutput `pulumi:"privateIpAddress"`
	// The public IP address of the instance.
	PublicIpAddress pulumi.StringOutput `pulumi:"publicIpAddress"`
	// The amount of RAM in GB on the instance (e.g., 1.0).
	RamSize pulumi.Float64Output `pulumi:"ramSize"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Single lined launch script as a string to configure server with additional user data
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// The user name for connecting to the instance (e.g., ec2-user).
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AvailabilityZone == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZone'")
	}
	if args.BlueprintId == nil {
		return nil, errors.New("invalid value for required argument 'BlueprintId'")
	}
	if args.BundleId == nil {
		return nil, errors.New("invalid value for required argument 'BundleId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("aws:lightsail/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("aws:lightsail/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// The add on configuration for the instance. Detailed below.
	AddOn *InstanceAddOn `pulumi:"addOn"`
	// The ARN of the Lightsail instance (matches `id`).
	Arn *string `pulumi:"arn"`
	// The Availability Zone in which to create your instance. A
	// list of available zones can be obtained using the AWS CLI command:
	// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The ID for a virtual private server image. A list of available
	// blueprint IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
	BlueprintId *string `pulumi:"blueprintId"`
	// The bundle of specification information. A list of available
	// bundle IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
	BundleId *string `pulumi:"bundleId"`
	// The number of vCPUs the instance has.
	CpuCount *int `pulumi:"cpuCount"`
	// The timestamp when the instance was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
	IpAddressType *string `pulumi:"ipAddressType"`
	// List of IPv6 addresses for the Lightsail instance.
	Ipv6Addresses []string `pulumi:"ipv6Addresses"`
	// A Boolean value indicating whether this instance has a static IP assigned to it.
	IsStaticIp *bool `pulumi:"isStaticIp"`
	// The name of your key pair. Created in the
	// Lightsail console (cannot use `ec2.KeyPair` at this time)
	KeyPairName *string `pulumi:"keyPairName"`
	// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
	Name *string `pulumi:"name"`
	// The private IP address of the instance.
	PrivateIpAddress *string `pulumi:"privateIpAddress"`
	// The public IP address of the instance.
	PublicIpAddress *string `pulumi:"publicIpAddress"`
	// The amount of RAM in GB on the instance (e.g., 1.0).
	RamSize *float64 `pulumi:"ramSize"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Single lined launch script as a string to configure server with additional user data
	UserData *string `pulumi:"userData"`
	// The user name for connecting to the instance (e.g., ec2-user).
	Username *string `pulumi:"username"`
}

type InstanceState struct {
	// The add on configuration for the instance. Detailed below.
	AddOn InstanceAddOnPtrInput
	// The ARN of the Lightsail instance (matches `id`).
	Arn pulumi.StringPtrInput
	// The Availability Zone in which to create your instance. A
	// list of available zones can be obtained using the AWS CLI command:
	// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
	AvailabilityZone pulumi.StringPtrInput
	// The ID for a virtual private server image. A list of available
	// blueprint IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
	BlueprintId pulumi.StringPtrInput
	// The bundle of specification information. A list of available
	// bundle IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
	BundleId pulumi.StringPtrInput
	// The number of vCPUs the instance has.
	CpuCount pulumi.IntPtrInput
	// The timestamp when the instance was created.
	CreatedAt pulumi.StringPtrInput
	// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
	IpAddressType pulumi.StringPtrInput
	// List of IPv6 addresses for the Lightsail instance.
	Ipv6Addresses pulumi.StringArrayInput
	// A Boolean value indicating whether this instance has a static IP assigned to it.
	IsStaticIp pulumi.BoolPtrInput
	// The name of your key pair. Created in the
	// Lightsail console (cannot use `ec2.KeyPair` at this time)
	KeyPairName pulumi.StringPtrInput
	// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
	Name pulumi.StringPtrInput
	// The private IP address of the instance.
	PrivateIpAddress pulumi.StringPtrInput
	// The public IP address of the instance.
	PublicIpAddress pulumi.StringPtrInput
	// The amount of RAM in GB on the instance (e.g., 1.0).
	RamSize pulumi.Float64PtrInput
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Single lined launch script as a string to configure server with additional user data
	UserData pulumi.StringPtrInput
	// The user name for connecting to the instance (e.g., ec2-user).
	Username pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// The add on configuration for the instance. Detailed below.
	AddOn *InstanceAddOn `pulumi:"addOn"`
	// The Availability Zone in which to create your instance. A
	// list of available zones can be obtained using the AWS CLI command:
	// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
	AvailabilityZone string `pulumi:"availabilityZone"`
	// The ID for a virtual private server image. A list of available
	// blueprint IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
	BlueprintId string `pulumi:"blueprintId"`
	// The bundle of specification information. A list of available
	// bundle IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
	BundleId string `pulumi:"bundleId"`
	// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
	IpAddressType *string `pulumi:"ipAddressType"`
	// The name of your key pair. Created in the
	// Lightsail console (cannot use `ec2.KeyPair` at this time)
	KeyPairName *string `pulumi:"keyPairName"`
	// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Single lined launch script as a string to configure server with additional user data
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The add on configuration for the instance. Detailed below.
	AddOn InstanceAddOnPtrInput
	// The Availability Zone in which to create your instance. A
	// list of available zones can be obtained using the AWS CLI command:
	// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
	AvailabilityZone pulumi.StringInput
	// The ID for a virtual private server image. A list of available
	// blueprint IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
	BlueprintId pulumi.StringInput
	// The bundle of specification information. A list of available
	// bundle IDs can be obtained using the AWS CLI command:
	// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
	BundleId pulumi.StringInput
	// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
	IpAddressType pulumi.StringPtrInput
	// The name of your key pair. Created in the
	// Lightsail console (cannot use `ec2.KeyPair` at this time)
	KeyPairName pulumi.StringPtrInput
	// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Single lined launch script as a string to configure server with additional user data
	UserData pulumi.StringPtrInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

// The add on configuration for the instance. Detailed below.
func (o InstanceOutput) AddOn() InstanceAddOnPtrOutput {
	return o.ApplyT(func(v *Instance) InstanceAddOnPtrOutput { return v.AddOn }).(InstanceAddOnPtrOutput)
}

// The ARN of the Lightsail instance (matches `id`).
func (o InstanceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Availability Zone in which to create your instance. A
// list of available zones can be obtained using the AWS CLI command:
// [`aws lightsail get-regions --include-availability-zones`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-regions.html).
func (o InstanceOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// The ID for a virtual private server image. A list of available
// blueprint IDs can be obtained using the AWS CLI command:
// [`aws lightsail get-blueprints`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-blueprints.html).
func (o InstanceOutput) BlueprintId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.BlueprintId }).(pulumi.StringOutput)
}

// The bundle of specification information. A list of available
// bundle IDs can be obtained using the AWS CLI command:
// [`aws lightsail get-bundles`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/lightsail/get-bundles.html).
func (o InstanceOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.BundleId }).(pulumi.StringOutput)
}

// The number of vCPUs the instance has.
func (o InstanceOutput) CpuCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Instance) pulumi.IntOutput { return v.CpuCount }).(pulumi.IntOutput)
}

// The timestamp when the instance was created.
func (o InstanceOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The IP address type of the Lightsail Instance. Valid Values: `dualstack` | `ipv4`.
func (o InstanceOutput) IpAddressType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.IpAddressType }).(pulumi.StringPtrOutput)
}

// List of IPv6 addresses for the Lightsail instance.
func (o InstanceOutput) Ipv6Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringArrayOutput { return v.Ipv6Addresses }).(pulumi.StringArrayOutput)
}

// A Boolean value indicating whether this instance has a static IP assigned to it.
func (o InstanceOutput) IsStaticIp() pulumi.BoolOutput {
	return o.ApplyT(func(v *Instance) pulumi.BoolOutput { return v.IsStaticIp }).(pulumi.BoolOutput)
}

// The name of your key pair. Created in the
// Lightsail console (cannot use `ec2.KeyPair` at this time)
func (o InstanceOutput) KeyPairName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.KeyPairName }).(pulumi.StringPtrOutput)
}

// The name of the Lightsail Instance. Names must be unique within each AWS Region in your Lightsail account.
func (o InstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The private IP address of the instance.
func (o InstanceOutput) PrivateIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PrivateIpAddress }).(pulumi.StringOutput)
}

// The public IP address of the instance.
func (o InstanceOutput) PublicIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.PublicIpAddress }).(pulumi.StringOutput)
}

// The amount of RAM in GB on the instance (e.g., 1.0).
func (o InstanceOutput) RamSize() pulumi.Float64Output {
	return o.ApplyT(func(v *Instance) pulumi.Float64Output { return v.RamSize }).(pulumi.Float64Output)
}

// A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o InstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o InstanceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Single lined launch script as a string to configure server with additional user data
func (o InstanceOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

// The user name for connecting to the instance (e.g., ec2-user).
func (o InstanceOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
