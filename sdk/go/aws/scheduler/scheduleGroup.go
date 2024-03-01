// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scheduler

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an EventBridge Scheduler Schedule Group resource.
//
// You can find out more about EventBridge Scheduler in the [User Guide](https://docs.aws.amazon.com/scheduler/latest/UserGuide/what-is-scheduler.html).
//
// > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/scheduler"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scheduler.NewScheduleGroup(ctx, "example", &scheduler.ScheduleGroupArgs{
//				Name: pulumi.String("my-schedule-group"),
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
// Using `pulumi import`, import schedule groups using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:scheduler/scheduleGroup:ScheduleGroup example my-schedule-group
//
// ```
type ScheduleGroup struct {
	pulumi.CustomResourceState

	// ARN of the schedule group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Time at which the schedule group was created.
	CreationDate pulumi.StringOutput `pulumi:"creationDate"`
	// Time at which the schedule group was last modified.
	LastModificationDate pulumi.StringOutput `pulumi:"lastModificationDate"`
	// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// State of the schedule group. Can be `ACTIVE` or `DELETING`.
	State pulumi.StringOutput `pulumi:"state"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewScheduleGroup registers a new resource with the given unique name, arguments, and options.
func NewScheduleGroup(ctx *pulumi.Context,
	name string, args *ScheduleGroupArgs, opts ...pulumi.ResourceOption) (*ScheduleGroup, error) {
	if args == nil {
		args = &ScheduleGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScheduleGroup
	err := ctx.RegisterResource("aws:scheduler/scheduleGroup:ScheduleGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScheduleGroup gets an existing ScheduleGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScheduleGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduleGroupState, opts ...pulumi.ResourceOption) (*ScheduleGroup, error) {
	var resource ScheduleGroup
	err := ctx.ReadResource("aws:scheduler/scheduleGroup:ScheduleGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScheduleGroup resources.
type scheduleGroupState struct {
	// ARN of the schedule group.
	Arn *string `pulumi:"arn"`
	// Time at which the schedule group was created.
	CreationDate *string `pulumi:"creationDate"`
	// Time at which the schedule group was last modified.
	LastModificationDate *string `pulumi:"lastModificationDate"`
	// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// State of the schedule group. Can be `ACTIVE` or `DELETING`.
	State *string `pulumi:"state"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ScheduleGroupState struct {
	// ARN of the schedule group.
	Arn pulumi.StringPtrInput
	// Time at which the schedule group was created.
	CreationDate pulumi.StringPtrInput
	// Time at which the schedule group was last modified.
	LastModificationDate pulumi.StringPtrInput
	// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// State of the schedule group. Can be `ACTIVE` or `DELETING`.
	State pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ScheduleGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleGroupState)(nil)).Elem()
}

type scheduleGroupArgs struct {
	// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ScheduleGroup resource.
type ScheduleGroupArgs struct {
	// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ScheduleGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleGroupArgs)(nil)).Elem()
}

type ScheduleGroupInput interface {
	pulumi.Input

	ToScheduleGroupOutput() ScheduleGroupOutput
	ToScheduleGroupOutputWithContext(ctx context.Context) ScheduleGroupOutput
}

func (*ScheduleGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduleGroup)(nil)).Elem()
}

func (i *ScheduleGroup) ToScheduleGroupOutput() ScheduleGroupOutput {
	return i.ToScheduleGroupOutputWithContext(context.Background())
}

func (i *ScheduleGroup) ToScheduleGroupOutputWithContext(ctx context.Context) ScheduleGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleGroupOutput)
}

// ScheduleGroupArrayInput is an input type that accepts ScheduleGroupArray and ScheduleGroupArrayOutput values.
// You can construct a concrete instance of `ScheduleGroupArrayInput` via:
//
//	ScheduleGroupArray{ ScheduleGroupArgs{...} }
type ScheduleGroupArrayInput interface {
	pulumi.Input

	ToScheduleGroupArrayOutput() ScheduleGroupArrayOutput
	ToScheduleGroupArrayOutputWithContext(context.Context) ScheduleGroupArrayOutput
}

type ScheduleGroupArray []ScheduleGroupInput

func (ScheduleGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduleGroup)(nil)).Elem()
}

func (i ScheduleGroupArray) ToScheduleGroupArrayOutput() ScheduleGroupArrayOutput {
	return i.ToScheduleGroupArrayOutputWithContext(context.Background())
}

func (i ScheduleGroupArray) ToScheduleGroupArrayOutputWithContext(ctx context.Context) ScheduleGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleGroupArrayOutput)
}

// ScheduleGroupMapInput is an input type that accepts ScheduleGroupMap and ScheduleGroupMapOutput values.
// You can construct a concrete instance of `ScheduleGroupMapInput` via:
//
//	ScheduleGroupMap{ "key": ScheduleGroupArgs{...} }
type ScheduleGroupMapInput interface {
	pulumi.Input

	ToScheduleGroupMapOutput() ScheduleGroupMapOutput
	ToScheduleGroupMapOutputWithContext(context.Context) ScheduleGroupMapOutput
}

type ScheduleGroupMap map[string]ScheduleGroupInput

func (ScheduleGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduleGroup)(nil)).Elem()
}

func (i ScheduleGroupMap) ToScheduleGroupMapOutput() ScheduleGroupMapOutput {
	return i.ToScheduleGroupMapOutputWithContext(context.Background())
}

func (i ScheduleGroupMap) ToScheduleGroupMapOutputWithContext(ctx context.Context) ScheduleGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleGroupMapOutput)
}

type ScheduleGroupOutput struct{ *pulumi.OutputState }

func (ScheduleGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduleGroup)(nil)).Elem()
}

func (o ScheduleGroupOutput) ToScheduleGroupOutput() ScheduleGroupOutput {
	return o
}

func (o ScheduleGroupOutput) ToScheduleGroupOutputWithContext(ctx context.Context) ScheduleGroupOutput {
	return o
}

// ARN of the schedule group.
func (o ScheduleGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Time at which the schedule group was created.
func (o ScheduleGroupOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.CreationDate }).(pulumi.StringOutput)
}

// Time at which the schedule group was last modified.
func (o ScheduleGroupOutput) LastModificationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.LastModificationDate }).(pulumi.StringOutput)
}

// Name of the schedule group. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
func (o ScheduleGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (o ScheduleGroupOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// State of the schedule group. Can be `ACTIVE` or `DELETING`.
func (o ScheduleGroupOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ScheduleGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ScheduleGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ScheduleGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ScheduleGroupArrayOutput struct{ *pulumi.OutputState }

func (ScheduleGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduleGroup)(nil)).Elem()
}

func (o ScheduleGroupArrayOutput) ToScheduleGroupArrayOutput() ScheduleGroupArrayOutput {
	return o
}

func (o ScheduleGroupArrayOutput) ToScheduleGroupArrayOutputWithContext(ctx context.Context) ScheduleGroupArrayOutput {
	return o
}

func (o ScheduleGroupArrayOutput) Index(i pulumi.IntInput) ScheduleGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScheduleGroup {
		return vs[0].([]*ScheduleGroup)[vs[1].(int)]
	}).(ScheduleGroupOutput)
}

type ScheduleGroupMapOutput struct{ *pulumi.OutputState }

func (ScheduleGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduleGroup)(nil)).Elem()
}

func (o ScheduleGroupMapOutput) ToScheduleGroupMapOutput() ScheduleGroupMapOutput {
	return o
}

func (o ScheduleGroupMapOutput) ToScheduleGroupMapOutputWithContext(ctx context.Context) ScheduleGroupMapOutput {
	return o
}

func (o ScheduleGroupMapOutput) MapIndex(k pulumi.StringInput) ScheduleGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScheduleGroup {
		return vs[0].(map[string]*ScheduleGroup)[vs[1].(string)]
	}).(ScheduleGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleGroupInput)(nil)).Elem(), &ScheduleGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleGroupArrayInput)(nil)).Elem(), ScheduleGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleGroupMapInput)(nil)).Elem(), ScheduleGroupMap{})
	pulumi.RegisterOutputType(ScheduleGroupOutput{})
	pulumi.RegisterOutputType(ScheduleGroupArrayOutput{})
	pulumi.RegisterOutputType(ScheduleGroupMapOutput{})
}
