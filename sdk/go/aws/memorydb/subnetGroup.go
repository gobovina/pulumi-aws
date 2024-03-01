// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package memorydb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a MemoryDB Subnet Group.
//
// More information about subnet groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/subnetgroups.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/memorydb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := ec2.NewVpc(ctx, "example", &ec2.VpcArgs{
//				CidrBlock: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := ec2.NewSubnet(ctx, "example", &ec2.SubnetArgs{
//				VpcId:            example.ID(),
//				CidrBlock:        pulumi.String("10.0.0.0/24"),
//				AvailabilityZone: pulumi.String("us-west-2a"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = memorydb.NewSubnetGroup(ctx, "example", &memorydb.SubnetGroupArgs{
//				Name: pulumi.String("my-subnet-group"),
//				SubnetIds: pulumi.StringArray{
//					exampleSubnet.ID(),
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
// Using `pulumi import`, import a subnet group using its `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:memorydb/subnetGroup:SubnetGroup example my-subnet-group
//
// ```
type SubnetGroup struct {
	pulumi.CustomResourceState

	// The ARN of the subnet group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Description for the subnet group.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The VPC in which the subnet group exists.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewSubnetGroup registers a new resource with the given unique name, arguments, and options.
func NewSubnetGroup(ctx *pulumi.Context,
	name string, args *SubnetGroupArgs, opts ...pulumi.ResourceOption) (*SubnetGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubnetGroup
	err := ctx.RegisterResource("aws:memorydb/subnetGroup:SubnetGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubnetGroup gets an existing SubnetGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubnetGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubnetGroupState, opts ...pulumi.ResourceOption) (*SubnetGroup, error) {
	var resource SubnetGroup
	err := ctx.ReadResource("aws:memorydb/subnetGroup:SubnetGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubnetGroup resources.
type subnetGroupState struct {
	// The ARN of the subnet group.
	Arn *string `pulumi:"arn"`
	// Description for the subnet group.
	Description *string `pulumi:"description"`
	// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
	//
	// The following arguments are optional:
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The VPC in which the subnet group exists.
	VpcId *string `pulumi:"vpcId"`
}

type SubnetGroupState struct {
	// The ARN of the subnet group.
	Arn pulumi.StringPtrInput
	// Description for the subnet group.
	Description pulumi.StringPtrInput
	// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The VPC in which the subnet group exists.
	VpcId pulumi.StringPtrInput
}

func (SubnetGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetGroupState)(nil)).Elem()
}

type subnetGroupArgs struct {
	// Description for the subnet group.
	Description *string `pulumi:"description"`
	// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
	//
	// The following arguments are optional:
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a SubnetGroup resource.
type SubnetGroupArgs struct {
	// Description for the subnet group.
	Description pulumi.StringPtrInput
	// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
	//
	// The following arguments are optional:
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (SubnetGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetGroupArgs)(nil)).Elem()
}

type SubnetGroupInput interface {
	pulumi.Input

	ToSubnetGroupOutput() SubnetGroupOutput
	ToSubnetGroupOutputWithContext(ctx context.Context) SubnetGroupOutput
}

func (*SubnetGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**SubnetGroup)(nil)).Elem()
}

func (i *SubnetGroup) ToSubnetGroupOutput() SubnetGroupOutput {
	return i.ToSubnetGroupOutputWithContext(context.Background())
}

func (i *SubnetGroup) ToSubnetGroupOutputWithContext(ctx context.Context) SubnetGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetGroupOutput)
}

// SubnetGroupArrayInput is an input type that accepts SubnetGroupArray and SubnetGroupArrayOutput values.
// You can construct a concrete instance of `SubnetGroupArrayInput` via:
//
//	SubnetGroupArray{ SubnetGroupArgs{...} }
type SubnetGroupArrayInput interface {
	pulumi.Input

	ToSubnetGroupArrayOutput() SubnetGroupArrayOutput
	ToSubnetGroupArrayOutputWithContext(context.Context) SubnetGroupArrayOutput
}

type SubnetGroupArray []SubnetGroupInput

func (SubnetGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubnetGroup)(nil)).Elem()
}

func (i SubnetGroupArray) ToSubnetGroupArrayOutput() SubnetGroupArrayOutput {
	return i.ToSubnetGroupArrayOutputWithContext(context.Background())
}

func (i SubnetGroupArray) ToSubnetGroupArrayOutputWithContext(ctx context.Context) SubnetGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetGroupArrayOutput)
}

// SubnetGroupMapInput is an input type that accepts SubnetGroupMap and SubnetGroupMapOutput values.
// You can construct a concrete instance of `SubnetGroupMapInput` via:
//
//	SubnetGroupMap{ "key": SubnetGroupArgs{...} }
type SubnetGroupMapInput interface {
	pulumi.Input

	ToSubnetGroupMapOutput() SubnetGroupMapOutput
	ToSubnetGroupMapOutputWithContext(context.Context) SubnetGroupMapOutput
}

type SubnetGroupMap map[string]SubnetGroupInput

func (SubnetGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubnetGroup)(nil)).Elem()
}

func (i SubnetGroupMap) ToSubnetGroupMapOutput() SubnetGroupMapOutput {
	return i.ToSubnetGroupMapOutputWithContext(context.Background())
}

func (i SubnetGroupMap) ToSubnetGroupMapOutputWithContext(ctx context.Context) SubnetGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetGroupMapOutput)
}

type SubnetGroupOutput struct{ *pulumi.OutputState }

func (SubnetGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubnetGroup)(nil)).Elem()
}

func (o SubnetGroupOutput) ToSubnetGroupOutput() SubnetGroupOutput {
	return o
}

func (o SubnetGroupOutput) ToSubnetGroupOutputWithContext(ctx context.Context) SubnetGroupOutput {
	return o
}

// The ARN of the subnet group.
func (o SubnetGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Description for the subnet group.
func (o SubnetGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the subnet group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
func (o SubnetGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (o SubnetGroupOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
//
// The following arguments are optional:
func (o SubnetGroupOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o SubnetGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o SubnetGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The VPC in which the subnet group exists.
func (o SubnetGroupOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type SubnetGroupArrayOutput struct{ *pulumi.OutputState }

func (SubnetGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubnetGroup)(nil)).Elem()
}

func (o SubnetGroupArrayOutput) ToSubnetGroupArrayOutput() SubnetGroupArrayOutput {
	return o
}

func (o SubnetGroupArrayOutput) ToSubnetGroupArrayOutputWithContext(ctx context.Context) SubnetGroupArrayOutput {
	return o
}

func (o SubnetGroupArrayOutput) Index(i pulumi.IntInput) SubnetGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubnetGroup {
		return vs[0].([]*SubnetGroup)[vs[1].(int)]
	}).(SubnetGroupOutput)
}

type SubnetGroupMapOutput struct{ *pulumi.OutputState }

func (SubnetGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubnetGroup)(nil)).Elem()
}

func (o SubnetGroupMapOutput) ToSubnetGroupMapOutput() SubnetGroupMapOutput {
	return o
}

func (o SubnetGroupMapOutput) ToSubnetGroupMapOutputWithContext(ctx context.Context) SubnetGroupMapOutput {
	return o
}

func (o SubnetGroupMapOutput) MapIndex(k pulumi.StringInput) SubnetGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubnetGroup {
		return vs[0].(map[string]*SubnetGroup)[vs[1].(string)]
	}).(SubnetGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetGroupInput)(nil)).Elem(), &SubnetGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetGroupArrayInput)(nil)).Elem(), SubnetGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetGroupMapInput)(nil)).Elem(), SubnetGroupMap{})
	pulumi.RegisterOutputType(SubnetGroupOutput{})
	pulumi.RegisterOutputType(SubnetGroupArrayOutput{})
	pulumi.RegisterOutputType(SubnetGroupMapOutput{})
}
