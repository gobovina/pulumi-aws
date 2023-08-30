// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/redshift"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooVpc, err := ec2.NewVpc(ctx, "fooVpc", &ec2.VpcArgs{
//				CidrBlock: pulumi.String("10.1.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			fooSubnet, err := ec2.NewSubnet(ctx, "fooSubnet", &ec2.SubnetArgs{
//				CidrBlock:        pulumi.String("10.1.1.0/24"),
//				AvailabilityZone: pulumi.String("us-west-2a"),
//				VpcId:            fooVpc.ID(),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("tf-dbsubnet-test-1"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			bar, err := ec2.NewSubnet(ctx, "bar", &ec2.SubnetArgs{
//				CidrBlock:        pulumi.String("10.1.2.0/24"),
//				AvailabilityZone: pulumi.String("us-west-2b"),
//				VpcId:            fooVpc.ID(),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("tf-dbsubnet-test-2"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = redshift.NewSubnetGroup(ctx, "fooSubnetGroup", &redshift.SubnetGroupArgs{
//				SubnetIds: pulumi.StringArray{
//					fooSubnet.ID(),
//					bar.ID(),
//				},
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("Production"),
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
// Using `pulumi import`, import Redshift subnet groups using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:redshift/subnetGroup:SubnetGroup testgroup1 test-cluster-subnet-group
//
// ```
type SubnetGroup struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the Redshift Subnet group name
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the Redshift Subnet group.
	Name pulumi.StringOutput `pulumi:"name"`
	// An array of VPC subnet IDs.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
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
	if args.Description == nil {
		args.Description = pulumi.StringPtr("Managed by Pulumi")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubnetGroup
	err := ctx.RegisterResource("aws:redshift/subnetGroup:SubnetGroup", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:redshift/subnetGroup:SubnetGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubnetGroup resources.
type subnetGroupState struct {
	// Amazon Resource Name (ARN) of the Redshift Subnet group name
	Arn *string `pulumi:"arn"`
	// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
	Description *string `pulumi:"description"`
	// The name of the Redshift Subnet group.
	Name *string `pulumi:"name"`
	// An array of VPC subnet IDs.
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type SubnetGroupState struct {
	// Amazon Resource Name (ARN) of the Redshift Subnet group name
	Arn pulumi.StringPtrInput
	// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
	Description pulumi.StringPtrInput
	// The name of the Redshift Subnet group.
	Name pulumi.StringPtrInput
	// An array of VPC subnet IDs.
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (SubnetGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetGroupState)(nil)).Elem()
}

type subnetGroupArgs struct {
	// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
	Description *string `pulumi:"description"`
	// The name of the Redshift Subnet group.
	Name *string `pulumi:"name"`
	// An array of VPC subnet IDs.
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a SubnetGroup resource.
type SubnetGroupArgs struct {
	// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
	Description pulumi.StringPtrInput
	// The name of the Redshift Subnet group.
	Name pulumi.StringPtrInput
	// An array of VPC subnet IDs.
	SubnetIds pulumi.StringArrayInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

// Amazon Resource Name (ARN) of the Redshift Subnet group name
func (o SubnetGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The description of the Redshift Subnet group. Defaults to "Managed by Pulumi".
func (o SubnetGroupOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the Redshift Subnet group.
func (o SubnetGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An array of VPC subnet IDs.
func (o SubnetGroupOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o SubnetGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o SubnetGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubnetGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
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
