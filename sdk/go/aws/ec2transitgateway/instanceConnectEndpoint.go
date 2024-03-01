// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EC2 Instance Connect Endpoint.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2transitgateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2transitgateway.NewInstanceConnectEndpoint(ctx, "example", &ec2transitgateway.InstanceConnectEndpointArgs{
//				SubnetId: pulumi.Any(exampleAwsSubnet.Id),
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
// Using `pulumi import`, import EC2 Instance Connect Endpoints using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ec2transitgateway/instanceConnectEndpoint:InstanceConnectEndpoint example eice-012345678
//
// ```
type InstanceConnectEndpoint struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Availability Zone of the EC2 Instance Connect Endpoint.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The DNS name of the EC2 Instance Connect Endpoint.
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// The DNS name of the EC2 Instance Connect FIPS Endpoint.
	FipsDnsName pulumi.StringOutput `pulumi:"fipsDnsName"`
	// The IDs of the ENIs that Amazon EC2 automatically created when creating the EC2 Instance Connect Endpoint.
	NetworkInterfaceIds pulumi.StringArrayOutput `pulumi:"networkInterfaceIds"`
	// The ID of the AWS account that created the EC2 Instance Connect Endpoint.
	OwnerId pulumi.StringOutput `pulumi:"ownerId"`
	// Indicates whether your client's IP address is preserved as the source. Default: `true`.
	PreserveClientIp pulumi.BoolOutput `pulumi:"preserveClientIp"`
	// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput                   `pulumi:"tagsAll"`
	Timeouts InstanceConnectEndpointTimeoutsPtrOutput `pulumi:"timeouts"`
	// The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewInstanceConnectEndpoint registers a new resource with the given unique name, arguments, and options.
func NewInstanceConnectEndpoint(ctx *pulumi.Context,
	name string, args *InstanceConnectEndpointArgs, opts ...pulumi.ResourceOption) (*InstanceConnectEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SubnetId == nil {
		return nil, errors.New("invalid value for required argument 'SubnetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceConnectEndpoint
	err := ctx.RegisterResource("aws:ec2transitgateway/instanceConnectEndpoint:InstanceConnectEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceConnectEndpoint gets an existing InstanceConnectEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceConnectEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceConnectEndpointState, opts ...pulumi.ResourceOption) (*InstanceConnectEndpoint, error) {
	var resource InstanceConnectEndpoint
	err := ctx.ReadResource("aws:ec2transitgateway/instanceConnectEndpoint:InstanceConnectEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceConnectEndpoint resources.
type instanceConnectEndpointState struct {
	// The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
	Arn *string `pulumi:"arn"`
	// The Availability Zone of the EC2 Instance Connect Endpoint.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The DNS name of the EC2 Instance Connect Endpoint.
	DnsName *string `pulumi:"dnsName"`
	// The DNS name of the EC2 Instance Connect FIPS Endpoint.
	FipsDnsName *string `pulumi:"fipsDnsName"`
	// The IDs of the ENIs that Amazon EC2 automatically created when creating the EC2 Instance Connect Endpoint.
	NetworkInterfaceIds []string `pulumi:"networkInterfaceIds"`
	// The ID of the AWS account that created the EC2 Instance Connect Endpoint.
	OwnerId *string `pulumi:"ownerId"`
	// Indicates whether your client's IP address is preserved as the source. Default: `true`.
	PreserveClientIp *bool `pulumi:"preserveClientIp"`
	// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
	SubnetId *string `pulumi:"subnetId"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string                `pulumi:"tagsAll"`
	Timeouts *InstanceConnectEndpointTimeouts `pulumi:"timeouts"`
	// The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
	VpcId *string `pulumi:"vpcId"`
}

type InstanceConnectEndpointState struct {
	// The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
	Arn pulumi.StringPtrInput
	// The Availability Zone of the EC2 Instance Connect Endpoint.
	AvailabilityZone pulumi.StringPtrInput
	// The DNS name of the EC2 Instance Connect Endpoint.
	DnsName pulumi.StringPtrInput
	// The DNS name of the EC2 Instance Connect FIPS Endpoint.
	FipsDnsName pulumi.StringPtrInput
	// The IDs of the ENIs that Amazon EC2 automatically created when creating the EC2 Instance Connect Endpoint.
	NetworkInterfaceIds pulumi.StringArrayInput
	// The ID of the AWS account that created the EC2 Instance Connect Endpoint.
	OwnerId pulumi.StringPtrInput
	// Indicates whether your client's IP address is preserved as the source. Default: `true`.
	PreserveClientIp pulumi.BoolPtrInput
	// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
	SecurityGroupIds pulumi.StringArrayInput
	// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
	SubnetId pulumi.StringPtrInput
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts InstanceConnectEndpointTimeoutsPtrInput
	// The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
	VpcId pulumi.StringPtrInput
}

func (InstanceConnectEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceConnectEndpointState)(nil)).Elem()
}

type instanceConnectEndpointArgs struct {
	// Indicates whether your client's IP address is preserved as the source. Default: `true`.
	PreserveClientIp *bool `pulumi:"preserveClientIp"`
	// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
	SubnetId string `pulumi:"subnetId"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string                `pulumi:"tags"`
	Timeouts *InstanceConnectEndpointTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a InstanceConnectEndpoint resource.
type InstanceConnectEndpointArgs struct {
	// Indicates whether your client's IP address is preserved as the source. Default: `true`.
	PreserveClientIp pulumi.BoolPtrInput
	// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
	SecurityGroupIds pulumi.StringArrayInput
	// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
	SubnetId pulumi.StringInput
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts InstanceConnectEndpointTimeoutsPtrInput
}

func (InstanceConnectEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceConnectEndpointArgs)(nil)).Elem()
}

type InstanceConnectEndpointInput interface {
	pulumi.Input

	ToInstanceConnectEndpointOutput() InstanceConnectEndpointOutput
	ToInstanceConnectEndpointOutputWithContext(ctx context.Context) InstanceConnectEndpointOutput
}

func (*InstanceConnectEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceConnectEndpoint)(nil)).Elem()
}

func (i *InstanceConnectEndpoint) ToInstanceConnectEndpointOutput() InstanceConnectEndpointOutput {
	return i.ToInstanceConnectEndpointOutputWithContext(context.Background())
}

func (i *InstanceConnectEndpoint) ToInstanceConnectEndpointOutputWithContext(ctx context.Context) InstanceConnectEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceConnectEndpointOutput)
}

// InstanceConnectEndpointArrayInput is an input type that accepts InstanceConnectEndpointArray and InstanceConnectEndpointArrayOutput values.
// You can construct a concrete instance of `InstanceConnectEndpointArrayInput` via:
//
//	InstanceConnectEndpointArray{ InstanceConnectEndpointArgs{...} }
type InstanceConnectEndpointArrayInput interface {
	pulumi.Input

	ToInstanceConnectEndpointArrayOutput() InstanceConnectEndpointArrayOutput
	ToInstanceConnectEndpointArrayOutputWithContext(context.Context) InstanceConnectEndpointArrayOutput
}

type InstanceConnectEndpointArray []InstanceConnectEndpointInput

func (InstanceConnectEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceConnectEndpoint)(nil)).Elem()
}

func (i InstanceConnectEndpointArray) ToInstanceConnectEndpointArrayOutput() InstanceConnectEndpointArrayOutput {
	return i.ToInstanceConnectEndpointArrayOutputWithContext(context.Background())
}

func (i InstanceConnectEndpointArray) ToInstanceConnectEndpointArrayOutputWithContext(ctx context.Context) InstanceConnectEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceConnectEndpointArrayOutput)
}

// InstanceConnectEndpointMapInput is an input type that accepts InstanceConnectEndpointMap and InstanceConnectEndpointMapOutput values.
// You can construct a concrete instance of `InstanceConnectEndpointMapInput` via:
//
//	InstanceConnectEndpointMap{ "key": InstanceConnectEndpointArgs{...} }
type InstanceConnectEndpointMapInput interface {
	pulumi.Input

	ToInstanceConnectEndpointMapOutput() InstanceConnectEndpointMapOutput
	ToInstanceConnectEndpointMapOutputWithContext(context.Context) InstanceConnectEndpointMapOutput
}

type InstanceConnectEndpointMap map[string]InstanceConnectEndpointInput

func (InstanceConnectEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceConnectEndpoint)(nil)).Elem()
}

func (i InstanceConnectEndpointMap) ToInstanceConnectEndpointMapOutput() InstanceConnectEndpointMapOutput {
	return i.ToInstanceConnectEndpointMapOutputWithContext(context.Background())
}

func (i InstanceConnectEndpointMap) ToInstanceConnectEndpointMapOutputWithContext(ctx context.Context) InstanceConnectEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceConnectEndpointMapOutput)
}

type InstanceConnectEndpointOutput struct{ *pulumi.OutputState }

func (InstanceConnectEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceConnectEndpoint)(nil)).Elem()
}

func (o InstanceConnectEndpointOutput) ToInstanceConnectEndpointOutput() InstanceConnectEndpointOutput {
	return o
}

func (o InstanceConnectEndpointOutput) ToInstanceConnectEndpointOutputWithContext(ctx context.Context) InstanceConnectEndpointOutput {
	return o
}

// The Amazon Resource Name (ARN) of the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Availability Zone of the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// The DNS name of the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.DnsName }).(pulumi.StringOutput)
}

// The DNS name of the EC2 Instance Connect FIPS Endpoint.
func (o InstanceConnectEndpointOutput) FipsDnsName() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.FipsDnsName }).(pulumi.StringOutput)
}

// The IDs of the ENIs that Amazon EC2 automatically created when creating the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) NetworkInterfaceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringArrayOutput { return v.NetworkInterfaceIds }).(pulumi.StringArrayOutput)
}

// The ID of the AWS account that created the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.OwnerId }).(pulumi.StringOutput)
}

// Indicates whether your client's IP address is preserved as the source. Default: `true`.
func (o InstanceConnectEndpointOutput) PreserveClientIp() pulumi.BoolOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.BoolOutput { return v.PreserveClientIp }).(pulumi.BoolOutput)
}

// One or more security groups to associate with the endpoint. If you don't specify a security group, the default security group for the VPC will be associated with the endpoint.
func (o InstanceConnectEndpointOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
func (o InstanceConnectEndpointOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o InstanceConnectEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o InstanceConnectEndpointOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o InstanceConnectEndpointOutput) Timeouts() InstanceConnectEndpointTimeoutsPtrOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) InstanceConnectEndpointTimeoutsPtrOutput { return v.Timeouts }).(InstanceConnectEndpointTimeoutsPtrOutput)
}

// The ID of the VPC in which the EC2 Instance Connect Endpoint was created.
func (o InstanceConnectEndpointOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceConnectEndpoint) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type InstanceConnectEndpointArrayOutput struct{ *pulumi.OutputState }

func (InstanceConnectEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceConnectEndpoint)(nil)).Elem()
}

func (o InstanceConnectEndpointArrayOutput) ToInstanceConnectEndpointArrayOutput() InstanceConnectEndpointArrayOutput {
	return o
}

func (o InstanceConnectEndpointArrayOutput) ToInstanceConnectEndpointArrayOutputWithContext(ctx context.Context) InstanceConnectEndpointArrayOutput {
	return o
}

func (o InstanceConnectEndpointArrayOutput) Index(i pulumi.IntInput) InstanceConnectEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceConnectEndpoint {
		return vs[0].([]*InstanceConnectEndpoint)[vs[1].(int)]
	}).(InstanceConnectEndpointOutput)
}

type InstanceConnectEndpointMapOutput struct{ *pulumi.OutputState }

func (InstanceConnectEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceConnectEndpoint)(nil)).Elem()
}

func (o InstanceConnectEndpointMapOutput) ToInstanceConnectEndpointMapOutput() InstanceConnectEndpointMapOutput {
	return o
}

func (o InstanceConnectEndpointMapOutput) ToInstanceConnectEndpointMapOutputWithContext(ctx context.Context) InstanceConnectEndpointMapOutput {
	return o
}

func (o InstanceConnectEndpointMapOutput) MapIndex(k pulumi.StringInput) InstanceConnectEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceConnectEndpoint {
		return vs[0].(map[string]*InstanceConnectEndpoint)[vs[1].(string)]
	}).(InstanceConnectEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceConnectEndpointInput)(nil)).Elem(), &InstanceConnectEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceConnectEndpointArrayInput)(nil)).Elem(), InstanceConnectEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceConnectEndpointMapInput)(nil)).Elem(), InstanceConnectEndpointMap{})
	pulumi.RegisterOutputType(InstanceConnectEndpointOutput{})
	pulumi.RegisterOutputType(InstanceConnectEndpointArrayOutput{})
	pulumi.RegisterOutputType(InstanceConnectEndpointMapOutput{})
}
