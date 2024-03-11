// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:
//
// * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
// * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
// * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
// * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rds.NewOptionGroup(ctx, "example", &rds.OptionGroupArgs{
//				Name:                   pulumi.String("option-group-test"),
//				OptionGroupDescription: pulumi.String("Option Group"),
//				EngineName:             pulumi.String("sqlserver-ee"),
//				MajorEngineVersion:     pulumi.String("11.00"),
//				Options: rds.OptionGroupOptionArray{
//					&rds.OptionGroupOptionArgs{
//						OptionName: pulumi.String("Timezone"),
//						OptionSettings: rds.OptionGroupOptionOptionSettingArray{
//							&rds.OptionGroupOptionOptionSettingArgs{
//								Name:  pulumi.String("TIME_ZONE"),
//								Value: pulumi.String("UTC"),
//							},
//						},
//					},
//					&rds.OptionGroupOptionArgs{
//						OptionName: pulumi.String("SQLSERVER_BACKUP_RESTORE"),
//						OptionSettings: rds.OptionGroupOptionOptionSettingArray{
//							&rds.OptionGroupOptionOptionSettingArgs{
//								Name:  pulumi.String("IAM_ROLE_ARN"),
//								Value: pulumi.Any(exampleAwsIamRole.Arn),
//							},
//						},
//					},
//					&rds.OptionGroupOptionArgs{
//						OptionName: pulumi.String("TDE"),
//					},
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
// > **Note:** Any modifications to the `rds.OptionGroup` are set to happen immediately as we default to applying immediately.
//
// > **WARNING:** You can perform a destroy on a `rds.OptionGroup`, as long as it is not associated with any Amazon RDS resource. An option group can be associated with a DB instance, a manual DB snapshot, or an automated DB snapshot.
//
// If you try to delete an option group that is associated with an Amazon RDS resource, an error similar to the following is returned:
//
// > An error occurred (InvalidOptionGroupStateFault) when calling the DeleteOptionGroup operation: The option group 'optionGroupName' cannot be deleted because it is in use.
//
// More information about this can be found [here](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithOptionGroups.html#USER_WorkingWithOptionGroups.Delete).
//
// ## Import
//
// Using `pulumi import`, import DB option groups using the `name`. For example:
//
// ```sh
// $ pulumi import aws:rds/optionGroup:OptionGroup example mysql-option-group
// ```
type OptionGroup struct {
	pulumi.CustomResourceState

	// ARN of the DB option group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies the name of the engine that this option group should be associated with.
	EngineName pulumi.StringOutput `pulumi:"engineName"`
	// Specifies the major version of the engine that this option group should be associated with.
	MajorEngineVersion pulumi.StringOutput `pulumi:"majorEngineVersion"`
	// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// Description of the option group.
	OptionGroupDescription pulumi.StringOutput `pulumi:"optionGroupDescription"`
	// The options to apply. See `option` Block below for more details.
	Options OptionGroupOptionArrayOutput `pulumi:"options"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewOptionGroup registers a new resource with the given unique name, arguments, and options.
func NewOptionGroup(ctx *pulumi.Context,
	name string, args *OptionGroupArgs, opts ...pulumi.ResourceOption) (*OptionGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EngineName == nil {
		return nil, errors.New("invalid value for required argument 'EngineName'")
	}
	if args.MajorEngineVersion == nil {
		return nil, errors.New("invalid value for required argument 'MajorEngineVersion'")
	}
	if args.OptionGroupDescription == nil {
		args.OptionGroupDescription = pulumi.StringPtr("Managed by Pulumi")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OptionGroup
	err := ctx.RegisterResource("aws:rds/optionGroup:OptionGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOptionGroup gets an existing OptionGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOptionGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OptionGroupState, opts ...pulumi.ResourceOption) (*OptionGroup, error) {
	var resource OptionGroup
	err := ctx.ReadResource("aws:rds/optionGroup:OptionGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OptionGroup resources.
type optionGroupState struct {
	// ARN of the DB option group.
	Arn *string `pulumi:"arn"`
	// Specifies the name of the engine that this option group should be associated with.
	EngineName *string `pulumi:"engineName"`
	// Specifies the major version of the engine that this option group should be associated with.
	MajorEngineVersion *string `pulumi:"majorEngineVersion"`
	// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
	NamePrefix *string `pulumi:"namePrefix"`
	// Description of the option group.
	OptionGroupDescription *string `pulumi:"optionGroupDescription"`
	// The options to apply. See `option` Block below for more details.
	Options []OptionGroupOption `pulumi:"options"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type OptionGroupState struct {
	// ARN of the DB option group.
	Arn pulumi.StringPtrInput
	// Specifies the name of the engine that this option group should be associated with.
	EngineName pulumi.StringPtrInput
	// Specifies the major version of the engine that this option group should be associated with.
	MajorEngineVersion pulumi.StringPtrInput
	// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
	NamePrefix pulumi.StringPtrInput
	// Description of the option group.
	OptionGroupDescription pulumi.StringPtrInput
	// The options to apply. See `option` Block below for more details.
	Options OptionGroupOptionArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (OptionGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*optionGroupState)(nil)).Elem()
}

type optionGroupArgs struct {
	// Specifies the name of the engine that this option group should be associated with.
	EngineName string `pulumi:"engineName"`
	// Specifies the major version of the engine that this option group should be associated with.
	MajorEngineVersion string `pulumi:"majorEngineVersion"`
	// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
	NamePrefix *string `pulumi:"namePrefix"`
	// Description of the option group.
	OptionGroupDescription *string `pulumi:"optionGroupDescription"`
	// The options to apply. See `option` Block below for more details.
	Options []OptionGroupOption `pulumi:"options"`
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a OptionGroup resource.
type OptionGroupArgs struct {
	// Specifies the name of the engine that this option group should be associated with.
	EngineName pulumi.StringInput
	// Specifies the major version of the engine that this option group should be associated with.
	MajorEngineVersion pulumi.StringInput
	// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
	NamePrefix pulumi.StringPtrInput
	// Description of the option group.
	OptionGroupDescription pulumi.StringPtrInput
	// The options to apply. See `option` Block below for more details.
	Options OptionGroupOptionArrayInput
	// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (OptionGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*optionGroupArgs)(nil)).Elem()
}

type OptionGroupInput interface {
	pulumi.Input

	ToOptionGroupOutput() OptionGroupOutput
	ToOptionGroupOutputWithContext(ctx context.Context) OptionGroupOutput
}

func (*OptionGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**OptionGroup)(nil)).Elem()
}

func (i *OptionGroup) ToOptionGroupOutput() OptionGroupOutput {
	return i.ToOptionGroupOutputWithContext(context.Background())
}

func (i *OptionGroup) ToOptionGroupOutputWithContext(ctx context.Context) OptionGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionGroupOutput)
}

// OptionGroupArrayInput is an input type that accepts OptionGroupArray and OptionGroupArrayOutput values.
// You can construct a concrete instance of `OptionGroupArrayInput` via:
//
//	OptionGroupArray{ OptionGroupArgs{...} }
type OptionGroupArrayInput interface {
	pulumi.Input

	ToOptionGroupArrayOutput() OptionGroupArrayOutput
	ToOptionGroupArrayOutputWithContext(context.Context) OptionGroupArrayOutput
}

type OptionGroupArray []OptionGroupInput

func (OptionGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OptionGroup)(nil)).Elem()
}

func (i OptionGroupArray) ToOptionGroupArrayOutput() OptionGroupArrayOutput {
	return i.ToOptionGroupArrayOutputWithContext(context.Background())
}

func (i OptionGroupArray) ToOptionGroupArrayOutputWithContext(ctx context.Context) OptionGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionGroupArrayOutput)
}

// OptionGroupMapInput is an input type that accepts OptionGroupMap and OptionGroupMapOutput values.
// You can construct a concrete instance of `OptionGroupMapInput` via:
//
//	OptionGroupMap{ "key": OptionGroupArgs{...} }
type OptionGroupMapInput interface {
	pulumi.Input

	ToOptionGroupMapOutput() OptionGroupMapOutput
	ToOptionGroupMapOutputWithContext(context.Context) OptionGroupMapOutput
}

type OptionGroupMap map[string]OptionGroupInput

func (OptionGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OptionGroup)(nil)).Elem()
}

func (i OptionGroupMap) ToOptionGroupMapOutput() OptionGroupMapOutput {
	return i.ToOptionGroupMapOutputWithContext(context.Background())
}

func (i OptionGroupMap) ToOptionGroupMapOutputWithContext(ctx context.Context) OptionGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionGroupMapOutput)
}

type OptionGroupOutput struct{ *pulumi.OutputState }

func (OptionGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OptionGroup)(nil)).Elem()
}

func (o OptionGroupOutput) ToOptionGroupOutput() OptionGroupOutput {
	return o
}

func (o OptionGroupOutput) ToOptionGroupOutputWithContext(ctx context.Context) OptionGroupOutput {
	return o
}

// ARN of the DB option group.
func (o OptionGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies the name of the engine that this option group should be associated with.
func (o OptionGroupOutput) EngineName() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.EngineName }).(pulumi.StringOutput)
}

// Specifies the major version of the engine that this option group should be associated with.
func (o OptionGroupOutput) MajorEngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.MajorEngineVersion }).(pulumi.StringOutput)
}

// Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
func (o OptionGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
func (o OptionGroupOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// Description of the option group.
func (o OptionGroupOutput) OptionGroupDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringOutput { return v.OptionGroupDescription }).(pulumi.StringOutput)
}

// The options to apply. See `option` Block below for more details.
func (o OptionGroupOutput) Options() OptionGroupOptionArrayOutput {
	return o.ApplyT(func(v *OptionGroup) OptionGroupOptionArrayOutput { return v.Options }).(OptionGroupOptionArrayOutput)
}

// Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o OptionGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o OptionGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *OptionGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type OptionGroupArrayOutput struct{ *pulumi.OutputState }

func (OptionGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OptionGroup)(nil)).Elem()
}

func (o OptionGroupArrayOutput) ToOptionGroupArrayOutput() OptionGroupArrayOutput {
	return o
}

func (o OptionGroupArrayOutput) ToOptionGroupArrayOutputWithContext(ctx context.Context) OptionGroupArrayOutput {
	return o
}

func (o OptionGroupArrayOutput) Index(i pulumi.IntInput) OptionGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OptionGroup {
		return vs[0].([]*OptionGroup)[vs[1].(int)]
	}).(OptionGroupOutput)
}

type OptionGroupMapOutput struct{ *pulumi.OutputState }

func (OptionGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OptionGroup)(nil)).Elem()
}

func (o OptionGroupMapOutput) ToOptionGroupMapOutput() OptionGroupMapOutput {
	return o
}

func (o OptionGroupMapOutput) ToOptionGroupMapOutputWithContext(ctx context.Context) OptionGroupMapOutput {
	return o
}

func (o OptionGroupMapOutput) MapIndex(k pulumi.StringInput) OptionGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OptionGroup {
		return vs[0].(map[string]*OptionGroup)[vs[1].(string)]
	}).(OptionGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OptionGroupInput)(nil)).Elem(), &OptionGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*OptionGroupArrayInput)(nil)).Elem(), OptionGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OptionGroupMapInput)(nil)).Elem(), OptionGroupMap{})
	pulumi.RegisterOutputType(OptionGroupOutput{})
	pulumi.RegisterOutputType(OptionGroupArrayOutput{})
	pulumi.RegisterOutputType(OptionGroupMapOutput{})
}
