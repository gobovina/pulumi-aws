// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directoryservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a replicated Region and directory for Multi-Region replication.
// Multi-Region replication is only supported for the Enterprise Edition of AWS Managed Microsoft AD.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directoryservice"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// example, err := aws.GetRegion(ctx, nil, nil);
// if err != nil {
// return err
// }
// available, err := aws.GetAvailabilityZones(ctx, &aws.GetAvailabilityZonesArgs{
// State: pulumi.StringRef("available"),
// Filters: []aws.GetAvailabilityZonesFilter{
// {
// Name: "opt-in-status",
// Values: []string{
// "opt-in-not-required",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// exampleVpc, err := ec2.NewVpc(ctx, "example", &ec2.VpcArgs{
// CidrBlock: pulumi.String("10.0.0.0/16"),
// Tags: pulumi.StringMap{
// "Name": pulumi.String("Primary"),
// },
// })
// if err != nil {
// return err
// }
// var exampleSubnet []*ec2.Subnet
//
//	for index := 0; index < 2; index++ {
//	    key0 := index
//	    val0 := index
//
// __res, err := ec2.NewSubnet(ctx, fmt.Sprintf("example-%v", key0), &ec2.SubnetArgs{
// VpcId: exampleVpc.ID(),
// AvailabilityZone: available.Names[val0],
// CidrBlock: exampleVpc.CidrBlock.ApplyT(func(cidrBlock string) (std.CidrsubnetResult, error) {
// return std.CidrsubnetOutput(ctx, std.CidrsubnetOutputArgs{
// Input: cidrBlock,
// Newbits: 8,
// Netnum: val0,
// }, nil), nil
// }).(std.CidrsubnetResultOutput).ApplyT(func(invoke std.CidrsubnetResult) (*string, error) {
// return invoke.Result, nil
// }).(pulumi.StringPtrOutput),
// Tags: pulumi.StringMap{
// "Name": pulumi.String("Primary"),
// },
// })
// if err != nil {
// return err
// }
// exampleSubnet = append(exampleSubnet, __res)
// }
// exampleDirectory, err := directoryservice.NewDirectory(ctx, "example", &directoryservice.DirectoryArgs{
// Name: pulumi.String("example.com"),
// Password: pulumi.String("SuperSecretPassw0rd"),
// Type: pulumi.String("MicrosoftAD"),
// VpcSettings: &directoryservice.DirectoryVpcSettingsArgs{
// VpcId: exampleVpc.ID(),
// SubnetIds: %!v(PANIC=Format method: fatal: A failure has occurred: unlowered splat expression @ example.pp:44,17-36),
// },
// })
// if err != nil {
// return err
// }
// available_secondary, err := aws.GetAvailabilityZones(ctx, &aws.GetAvailabilityZonesArgs{
// State: pulumi.StringRef("available"),
// Filters: []aws.GetAvailabilityZonesFilter{
// {
// Name: "opt-in-status",
// Values: []string{
// "opt-in-not-required",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = ec2.NewVpc(ctx, "example-secondary", &ec2.VpcArgs{
// CidrBlock: pulumi.String("10.1.0.0/16"),
// Tags: pulumi.StringMap{
// "Name": pulumi.String("Secondary"),
// },
// })
// if err != nil {
// return err
// }
// var example_secondarySubnet []*ec2.Subnet
//
//	for index := 0; index < 2; index++ {
//	    key0 := index
//	    val0 := index
//
// __res, err := ec2.NewSubnet(ctx, fmt.Sprintf("example-secondary-%v", key0), &ec2.SubnetArgs{
// VpcId: example_secondary.ID(),
// AvailabilityZone: available_secondary.Names[val0],
// CidrBlock: example_secondary.CidrBlock.ApplyT(func(cidrBlock string) (std.CidrsubnetResult, error) {
// return std.CidrsubnetOutput(ctx, std.CidrsubnetOutputArgs{
// Input: cidrBlock,
// Newbits: 8,
// Netnum: val0,
// }, nil), nil
// }).(std.CidrsubnetResultOutput).ApplyT(func(invoke std.CidrsubnetResult) (*string, error) {
// return invoke.Result, nil
// }).(pulumi.StringPtrOutput),
// Tags: pulumi.StringMap{
// "Name": pulumi.String("Secondary"),
// },
// })
// if err != nil {
// return err
// }
// example_secondarySubnet = append(example_secondarySubnet, __res)
// }
// _, err = directoryservice.NewServiceRegion(ctx, "example", &directoryservice.ServiceRegionArgs{
// DirectoryId: exampleDirectory.ID(),
// RegionName: *pulumi.String(example.Name),
// VpcSettings: &directoryservice.ServiceRegionVpcSettingsArgs{
// VpcId: example_secondary.ID(),
// SubnetIds: %!v(PANIC=Format method: fatal: A failure has occurred: unlowered splat expression @ example.pp:87,17-46),
// },
// Tags: pulumi.StringMap{
// "Name": pulumi.String("Secondary"),
// },
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Replicated Regions using directory ID,Region name. For example:
//
// ```sh
// $ pulumi import aws:directoryservice/serviceRegion:ServiceRegion example d-9267651497,us-east-2
// ```
type ServiceRegion struct {
	pulumi.CustomResourceState

	// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
	DesiredNumberOfDomainControllers pulumi.IntOutput `pulumi:"desiredNumberOfDomainControllers"`
	// The identifier of the directory to which you want to add Region replication.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// The name of the Region where you want to add domain controllers for replication.
	RegionName pulumi.StringOutput `pulumi:"regionName"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// VPC information in the replicated Region. Detailed below.
	VpcSettings ServiceRegionVpcSettingsOutput `pulumi:"vpcSettings"`
}

// NewServiceRegion registers a new resource with the given unique name, arguments, and options.
func NewServiceRegion(ctx *pulumi.Context,
	name string, args *ServiceRegionArgs, opts ...pulumi.ResourceOption) (*ServiceRegion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	if args.RegionName == nil {
		return nil, errors.New("invalid value for required argument 'RegionName'")
	}
	if args.VpcSettings == nil {
		return nil, errors.New("invalid value for required argument 'VpcSettings'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceRegion
	err := ctx.RegisterResource("aws:directoryservice/serviceRegion:ServiceRegion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceRegion gets an existing ServiceRegion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceRegion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceRegionState, opts ...pulumi.ResourceOption) (*ServiceRegion, error) {
	var resource ServiceRegion
	err := ctx.ReadResource("aws:directoryservice/serviceRegion:ServiceRegion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceRegion resources.
type serviceRegionState struct {
	// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
	DesiredNumberOfDomainControllers *int `pulumi:"desiredNumberOfDomainControllers"`
	// The identifier of the directory to which you want to add Region replication.
	DirectoryId *string `pulumi:"directoryId"`
	// The name of the Region where you want to add domain controllers for replication.
	RegionName *string `pulumi:"regionName"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// VPC information in the replicated Region. Detailed below.
	VpcSettings *ServiceRegionVpcSettings `pulumi:"vpcSettings"`
}

type ServiceRegionState struct {
	// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
	DesiredNumberOfDomainControllers pulumi.IntPtrInput
	// The identifier of the directory to which you want to add Region replication.
	DirectoryId pulumi.StringPtrInput
	// The name of the Region where you want to add domain controllers for replication.
	RegionName pulumi.StringPtrInput
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// VPC information in the replicated Region. Detailed below.
	VpcSettings ServiceRegionVpcSettingsPtrInput
}

func (ServiceRegionState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceRegionState)(nil)).Elem()
}

type serviceRegionArgs struct {
	// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
	DesiredNumberOfDomainControllers *int `pulumi:"desiredNumberOfDomainControllers"`
	// The identifier of the directory to which you want to add Region replication.
	DirectoryId string `pulumi:"directoryId"`
	// The name of the Region where you want to add domain controllers for replication.
	RegionName string `pulumi:"regionName"`
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// VPC information in the replicated Region. Detailed below.
	VpcSettings ServiceRegionVpcSettings `pulumi:"vpcSettings"`
}

// The set of arguments for constructing a ServiceRegion resource.
type ServiceRegionArgs struct {
	// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
	DesiredNumberOfDomainControllers pulumi.IntPtrInput
	// The identifier of the directory to which you want to add Region replication.
	DirectoryId pulumi.StringInput
	// The name of the Region where you want to add domain controllers for replication.
	RegionName pulumi.StringInput
	// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// VPC information in the replicated Region. Detailed below.
	VpcSettings ServiceRegionVpcSettingsInput
}

func (ServiceRegionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceRegionArgs)(nil)).Elem()
}

type ServiceRegionInput interface {
	pulumi.Input

	ToServiceRegionOutput() ServiceRegionOutput
	ToServiceRegionOutputWithContext(ctx context.Context) ServiceRegionOutput
}

func (*ServiceRegion) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceRegion)(nil)).Elem()
}

func (i *ServiceRegion) ToServiceRegionOutput() ServiceRegionOutput {
	return i.ToServiceRegionOutputWithContext(context.Background())
}

func (i *ServiceRegion) ToServiceRegionOutputWithContext(ctx context.Context) ServiceRegionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRegionOutput)
}

// ServiceRegionArrayInput is an input type that accepts ServiceRegionArray and ServiceRegionArrayOutput values.
// You can construct a concrete instance of `ServiceRegionArrayInput` via:
//
//	ServiceRegionArray{ ServiceRegionArgs{...} }
type ServiceRegionArrayInput interface {
	pulumi.Input

	ToServiceRegionArrayOutput() ServiceRegionArrayOutput
	ToServiceRegionArrayOutputWithContext(context.Context) ServiceRegionArrayOutput
}

type ServiceRegionArray []ServiceRegionInput

func (ServiceRegionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceRegion)(nil)).Elem()
}

func (i ServiceRegionArray) ToServiceRegionArrayOutput() ServiceRegionArrayOutput {
	return i.ToServiceRegionArrayOutputWithContext(context.Background())
}

func (i ServiceRegionArray) ToServiceRegionArrayOutputWithContext(ctx context.Context) ServiceRegionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRegionArrayOutput)
}

// ServiceRegionMapInput is an input type that accepts ServiceRegionMap and ServiceRegionMapOutput values.
// You can construct a concrete instance of `ServiceRegionMapInput` via:
//
//	ServiceRegionMap{ "key": ServiceRegionArgs{...} }
type ServiceRegionMapInput interface {
	pulumi.Input

	ToServiceRegionMapOutput() ServiceRegionMapOutput
	ToServiceRegionMapOutputWithContext(context.Context) ServiceRegionMapOutput
}

type ServiceRegionMap map[string]ServiceRegionInput

func (ServiceRegionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceRegion)(nil)).Elem()
}

func (i ServiceRegionMap) ToServiceRegionMapOutput() ServiceRegionMapOutput {
	return i.ToServiceRegionMapOutputWithContext(context.Background())
}

func (i ServiceRegionMap) ToServiceRegionMapOutputWithContext(ctx context.Context) ServiceRegionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceRegionMapOutput)
}

type ServiceRegionOutput struct{ *pulumi.OutputState }

func (ServiceRegionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceRegion)(nil)).Elem()
}

func (o ServiceRegionOutput) ToServiceRegionOutput() ServiceRegionOutput {
	return o
}

func (o ServiceRegionOutput) ToServiceRegionOutputWithContext(ctx context.Context) ServiceRegionOutput {
	return o
}

// The number of domain controllers desired in the replicated directory. Minimum value of `2`.
func (o ServiceRegionOutput) DesiredNumberOfDomainControllers() pulumi.IntOutput {
	return o.ApplyT(func(v *ServiceRegion) pulumi.IntOutput { return v.DesiredNumberOfDomainControllers }).(pulumi.IntOutput)
}

// The identifier of the directory to which you want to add Region replication.
func (o ServiceRegionOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceRegion) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// The name of the Region where you want to add domain controllers for replication.
func (o ServiceRegionOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceRegion) pulumi.StringOutput { return v.RegionName }).(pulumi.StringOutput)
}

// Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServiceRegionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceRegion) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ServiceRegionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceRegion) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// VPC information in the replicated Region. Detailed below.
func (o ServiceRegionOutput) VpcSettings() ServiceRegionVpcSettingsOutput {
	return o.ApplyT(func(v *ServiceRegion) ServiceRegionVpcSettingsOutput { return v.VpcSettings }).(ServiceRegionVpcSettingsOutput)
}

type ServiceRegionArrayOutput struct{ *pulumi.OutputState }

func (ServiceRegionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceRegion)(nil)).Elem()
}

func (o ServiceRegionArrayOutput) ToServiceRegionArrayOutput() ServiceRegionArrayOutput {
	return o
}

func (o ServiceRegionArrayOutput) ToServiceRegionArrayOutputWithContext(ctx context.Context) ServiceRegionArrayOutput {
	return o
}

func (o ServiceRegionArrayOutput) Index(i pulumi.IntInput) ServiceRegionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceRegion {
		return vs[0].([]*ServiceRegion)[vs[1].(int)]
	}).(ServiceRegionOutput)
}

type ServiceRegionMapOutput struct{ *pulumi.OutputState }

func (ServiceRegionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceRegion)(nil)).Elem()
}

func (o ServiceRegionMapOutput) ToServiceRegionMapOutput() ServiceRegionMapOutput {
	return o
}

func (o ServiceRegionMapOutput) ToServiceRegionMapOutputWithContext(ctx context.Context) ServiceRegionMapOutput {
	return o
}

func (o ServiceRegionMapOutput) MapIndex(k pulumi.StringInput) ServiceRegionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceRegion {
		return vs[0].(map[string]*ServiceRegion)[vs[1].(string)]
	}).(ServiceRegionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRegionInput)(nil)).Elem(), &ServiceRegion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRegionArrayInput)(nil)).Elem(), ServiceRegionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceRegionMapInput)(nil)).Elem(), ServiceRegionMap{})
	pulumi.RegisterOutputType(ServiceRegionOutput{})
	pulumi.RegisterOutputType(ServiceRegionArrayOutput{})
	pulumi.RegisterOutputType(ServiceRegionMapOutput{})
}
