// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a default route table of a VPC. This resource can manage the default route table of the default or a non-default VPC.
//
// > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `ec2.DefaultRouteTable` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management. **Do not** use both `ec2.DefaultRouteTable` to manage a default route table **and** `ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See ec2.MainRouteTableAssociation documentation for more details.
//
// Every VPC has a default route table that can be managed but not destroyed. When the provider first adopts a default route table, it **immediately removes all defined routes**. It then proceeds to create any routes specified in the configuration. This step is required so that only the routes specified in the configuration exist in the default route table.
//
// For more information, see the Amazon VPC User Guide on [Route Tables](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html). For information about managing normal route tables in this provider, see `ec2.RouteTable`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2.NewDefaultRouteTable(ctx, "example", &ec2.DefaultRouteTableArgs{
//				DefaultRouteTableId: pulumi.Any(exampleAwsVpc.DefaultRouteTableId),
//				Routes: ec2.DefaultRouteTableRouteArray{
//					&ec2.DefaultRouteTableRouteArgs{
//						CidrBlock: pulumi.String("10.0.1.0/24"),
//						GatewayId: pulumi.Any(exampleAwsInternetGateway.Id),
//					},
//					&ec2.DefaultRouteTableRouteArgs{
//						Ipv6CidrBlock:       pulumi.String("::/0"),
//						EgressOnlyGatewayId: pulumi.Any(exampleAwsEgressOnlyInternetGateway.Id),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example"),
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
// To subsequently remove all managed routes:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2.NewDefaultRouteTable(ctx, "example", &ec2.DefaultRouteTableArgs{
//				DefaultRouteTableId: pulumi.Any(exampleAwsVpc.DefaultRouteTableId),
//				Routes:              ec2.DefaultRouteTableRouteArray{},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example"),
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
// Using `pulumi import`, import Default VPC route tables using the `vpc_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ec2/defaultRouteTable:DefaultRouteTable example vpc-33cc44dd
//
// ```
type DefaultRouteTable struct {
	pulumi.CustomResourceState

	// The ARN of the route table.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ID of the default route table.
	//
	// The following arguments are optional:
	DefaultRouteTableId pulumi.StringOutput `pulumi:"defaultRouteTableId"`
	// ID of the AWS account that owns the route table.
	OwnerId pulumi.StringOutput `pulumi:"ownerId"`
	// List of virtual gateways for propagation.
	PropagatingVgws pulumi.StringArrayOutput `pulumi:"propagatingVgws"`
	// Set of objects. Detailed below
	Routes DefaultRouteTableRouteArrayOutput `pulumi:"routes"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// ID of the VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewDefaultRouteTable registers a new resource with the given unique name, arguments, and options.
func NewDefaultRouteTable(ctx *pulumi.Context,
	name string, args *DefaultRouteTableArgs, opts ...pulumi.ResourceOption) (*DefaultRouteTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultRouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'DefaultRouteTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DefaultRouteTable
	err := ctx.RegisterResource("aws:ec2/defaultRouteTable:DefaultRouteTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDefaultRouteTable gets an existing DefaultRouteTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDefaultRouteTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DefaultRouteTableState, opts ...pulumi.ResourceOption) (*DefaultRouteTable, error) {
	var resource DefaultRouteTable
	err := ctx.ReadResource("aws:ec2/defaultRouteTable:DefaultRouteTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DefaultRouteTable resources.
type defaultRouteTableState struct {
	// The ARN of the route table.
	Arn *string `pulumi:"arn"`
	// ID of the default route table.
	//
	// The following arguments are optional:
	DefaultRouteTableId *string `pulumi:"defaultRouteTableId"`
	// ID of the AWS account that owns the route table.
	OwnerId *string `pulumi:"ownerId"`
	// List of virtual gateways for propagation.
	PropagatingVgws []string `pulumi:"propagatingVgws"`
	// Set of objects. Detailed below
	Routes []DefaultRouteTableRoute `pulumi:"routes"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
}

type DefaultRouteTableState struct {
	// The ARN of the route table.
	Arn pulumi.StringPtrInput
	// ID of the default route table.
	//
	// The following arguments are optional:
	DefaultRouteTableId pulumi.StringPtrInput
	// ID of the AWS account that owns the route table.
	OwnerId pulumi.StringPtrInput
	// List of virtual gateways for propagation.
	PropagatingVgws pulumi.StringArrayInput
	// Set of objects. Detailed below
	Routes DefaultRouteTableRouteArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// ID of the VPC.
	VpcId pulumi.StringPtrInput
}

func (DefaultRouteTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultRouteTableState)(nil)).Elem()
}

type defaultRouteTableArgs struct {
	// ID of the default route table.
	//
	// The following arguments are optional:
	DefaultRouteTableId string `pulumi:"defaultRouteTableId"`
	// List of virtual gateways for propagation.
	PropagatingVgws []string `pulumi:"propagatingVgws"`
	// Set of objects. Detailed below
	Routes []DefaultRouteTableRoute `pulumi:"routes"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DefaultRouteTable resource.
type DefaultRouteTableArgs struct {
	// ID of the default route table.
	//
	// The following arguments are optional:
	DefaultRouteTableId pulumi.StringInput
	// List of virtual gateways for propagation.
	PropagatingVgws pulumi.StringArrayInput
	// Set of objects. Detailed below
	Routes DefaultRouteTableRouteArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DefaultRouteTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultRouteTableArgs)(nil)).Elem()
}

type DefaultRouteTableInput interface {
	pulumi.Input

	ToDefaultRouteTableOutput() DefaultRouteTableOutput
	ToDefaultRouteTableOutputWithContext(ctx context.Context) DefaultRouteTableOutput
}

func (*DefaultRouteTable) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultRouteTable)(nil)).Elem()
}

func (i *DefaultRouteTable) ToDefaultRouteTableOutput() DefaultRouteTableOutput {
	return i.ToDefaultRouteTableOutputWithContext(context.Background())
}

func (i *DefaultRouteTable) ToDefaultRouteTableOutputWithContext(ctx context.Context) DefaultRouteTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultRouteTableOutput)
}

// DefaultRouteTableArrayInput is an input type that accepts DefaultRouteTableArray and DefaultRouteTableArrayOutput values.
// You can construct a concrete instance of `DefaultRouteTableArrayInput` via:
//
//	DefaultRouteTableArray{ DefaultRouteTableArgs{...} }
type DefaultRouteTableArrayInput interface {
	pulumi.Input

	ToDefaultRouteTableArrayOutput() DefaultRouteTableArrayOutput
	ToDefaultRouteTableArrayOutputWithContext(context.Context) DefaultRouteTableArrayOutput
}

type DefaultRouteTableArray []DefaultRouteTableInput

func (DefaultRouteTableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultRouteTable)(nil)).Elem()
}

func (i DefaultRouteTableArray) ToDefaultRouteTableArrayOutput() DefaultRouteTableArrayOutput {
	return i.ToDefaultRouteTableArrayOutputWithContext(context.Background())
}

func (i DefaultRouteTableArray) ToDefaultRouteTableArrayOutputWithContext(ctx context.Context) DefaultRouteTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultRouteTableArrayOutput)
}

// DefaultRouteTableMapInput is an input type that accepts DefaultRouteTableMap and DefaultRouteTableMapOutput values.
// You can construct a concrete instance of `DefaultRouteTableMapInput` via:
//
//	DefaultRouteTableMap{ "key": DefaultRouteTableArgs{...} }
type DefaultRouteTableMapInput interface {
	pulumi.Input

	ToDefaultRouteTableMapOutput() DefaultRouteTableMapOutput
	ToDefaultRouteTableMapOutputWithContext(context.Context) DefaultRouteTableMapOutput
}

type DefaultRouteTableMap map[string]DefaultRouteTableInput

func (DefaultRouteTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultRouteTable)(nil)).Elem()
}

func (i DefaultRouteTableMap) ToDefaultRouteTableMapOutput() DefaultRouteTableMapOutput {
	return i.ToDefaultRouteTableMapOutputWithContext(context.Background())
}

func (i DefaultRouteTableMap) ToDefaultRouteTableMapOutputWithContext(ctx context.Context) DefaultRouteTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultRouteTableMapOutput)
}

type DefaultRouteTableOutput struct{ *pulumi.OutputState }

func (DefaultRouteTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultRouteTable)(nil)).Elem()
}

func (o DefaultRouteTableOutput) ToDefaultRouteTableOutput() DefaultRouteTableOutput {
	return o
}

func (o DefaultRouteTableOutput) ToDefaultRouteTableOutputWithContext(ctx context.Context) DefaultRouteTableOutput {
	return o
}

// The ARN of the route table.
func (o DefaultRouteTableOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ID of the default route table.
//
// The following arguments are optional:
func (o DefaultRouteTableOutput) DefaultRouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringOutput { return v.DefaultRouteTableId }).(pulumi.StringOutput)
}

// ID of the AWS account that owns the route table.
func (o DefaultRouteTableOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringOutput { return v.OwnerId }).(pulumi.StringOutput)
}

// List of virtual gateways for propagation.
func (o DefaultRouteTableOutput) PropagatingVgws() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringArrayOutput { return v.PropagatingVgws }).(pulumi.StringArrayOutput)
}

// Set of objects. Detailed below
func (o DefaultRouteTableOutput) Routes() DefaultRouteTableRouteArrayOutput {
	return o.ApplyT(func(v *DefaultRouteTable) DefaultRouteTableRouteArrayOutput { return v.Routes }).(DefaultRouteTableRouteArrayOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DefaultRouteTableOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DefaultRouteTableOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// ID of the VPC.
func (o DefaultRouteTableOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultRouteTable) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type DefaultRouteTableArrayOutput struct{ *pulumi.OutputState }

func (DefaultRouteTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultRouteTable)(nil)).Elem()
}

func (o DefaultRouteTableArrayOutput) ToDefaultRouteTableArrayOutput() DefaultRouteTableArrayOutput {
	return o
}

func (o DefaultRouteTableArrayOutput) ToDefaultRouteTableArrayOutputWithContext(ctx context.Context) DefaultRouteTableArrayOutput {
	return o
}

func (o DefaultRouteTableArrayOutput) Index(i pulumi.IntInput) DefaultRouteTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DefaultRouteTable {
		return vs[0].([]*DefaultRouteTable)[vs[1].(int)]
	}).(DefaultRouteTableOutput)
}

type DefaultRouteTableMapOutput struct{ *pulumi.OutputState }

func (DefaultRouteTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultRouteTable)(nil)).Elem()
}

func (o DefaultRouteTableMapOutput) ToDefaultRouteTableMapOutput() DefaultRouteTableMapOutput {
	return o
}

func (o DefaultRouteTableMapOutput) ToDefaultRouteTableMapOutputWithContext(ctx context.Context) DefaultRouteTableMapOutput {
	return o
}

func (o DefaultRouteTableMapOutput) MapIndex(k pulumi.StringInput) DefaultRouteTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DefaultRouteTable {
		return vs[0].(map[string]*DefaultRouteTable)[vs[1].(string)]
	}).(DefaultRouteTableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultRouteTableInput)(nil)).Elem(), &DefaultRouteTable{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultRouteTableArrayInput)(nil)).Elem(), DefaultRouteTableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultRouteTableMapInput)(nil)).Elem(), DefaultRouteTableMap{})
	pulumi.RegisterOutputType(DefaultRouteTableOutput{})
	pulumi.RegisterOutputType(DefaultRouteTableArrayOutput{})
	pulumi.RegisterOutputType(DefaultRouteTableMapOutput{})
}
