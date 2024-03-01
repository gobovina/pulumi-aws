// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package finspace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS FinSpace Kx Scaling Group.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/finspace"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := finspace.NewKxScalingGroup(ctx, "example", &finspace.KxScalingGroupArgs{
//				Name:               pulumi.String("my-tf-kx-scalinggroup"),
//				EnvironmentId:      pulumi.Any(exampleAwsFinspaceKxEnvironment.Id),
//				AvailabilityZoneId: pulumi.String("use1-az2"),
//				HostType:           pulumi.String("kx.sg.4xlarge"),
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
// Using `pulumi import`, import an AWS FinSpace Kx Scaling Group using the `id` (environment ID and scaling group name, comma-delimited). For example:
//
// ```sh
//
//	$ pulumi import aws:finspace/kxScalingGroup:KxScalingGroup example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-scalinggroup
//
// ```
type KxScalingGroup struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) identifier of the KX Scaling Group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The availability zone identifiers for the requested regions.
	AvailabilityZoneId pulumi.StringOutput `pulumi:"availabilityZoneId"`
	// The list of Managed kdb clusters that are currently active in the given scaling group.
	Clusters pulumi.StringArrayOutput `pulumi:"clusters"`
	// The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
	CreatedTimestamp pulumi.StringOutput `pulumi:"createdTimestamp"`
	// A unique identifier for the kdb environment, where you want to create the scaling group.
	EnvironmentId pulumi.StringOutput `pulumi:"environmentId"`
	// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
	//
	// The following arguments are optional:
	HostType pulumi.StringOutput `pulumi:"hostType"`
	// Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp pulumi.StringOutput `pulumi:"lastModifiedTimestamp"`
	// Unique name for the scaling group that you want to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The status of scaling group.
	Status pulumi.StringOutput `pulumi:"status"`
	// The error message when a failed state occurs.
	StatusReason pulumi.StringOutput `pulumi:"statusReason"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewKxScalingGroup registers a new resource with the given unique name, arguments, and options.
func NewKxScalingGroup(ctx *pulumi.Context,
	name string, args *KxScalingGroupArgs, opts ...pulumi.ResourceOption) (*KxScalingGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AvailabilityZoneId == nil {
		return nil, errors.New("invalid value for required argument 'AvailabilityZoneId'")
	}
	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	if args.HostType == nil {
		return nil, errors.New("invalid value for required argument 'HostType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KxScalingGroup
	err := ctx.RegisterResource("aws:finspace/kxScalingGroup:KxScalingGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKxScalingGroup gets an existing KxScalingGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKxScalingGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KxScalingGroupState, opts ...pulumi.ResourceOption) (*KxScalingGroup, error) {
	var resource KxScalingGroup
	err := ctx.ReadResource("aws:finspace/kxScalingGroup:KxScalingGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KxScalingGroup resources.
type kxScalingGroupState struct {
	// Amazon Resource Name (ARN) identifier of the KX Scaling Group.
	Arn *string `pulumi:"arn"`
	// The availability zone identifiers for the requested regions.
	AvailabilityZoneId *string `pulumi:"availabilityZoneId"`
	// The list of Managed kdb clusters that are currently active in the given scaling group.
	Clusters []string `pulumi:"clusters"`
	// The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
	CreatedTimestamp *string `pulumi:"createdTimestamp"`
	// A unique identifier for the kdb environment, where you want to create the scaling group.
	EnvironmentId *string `pulumi:"environmentId"`
	// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
	//
	// The following arguments are optional:
	HostType *string `pulumi:"hostType"`
	// Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp *string `pulumi:"lastModifiedTimestamp"`
	// Unique name for the scaling group that you want to create.
	Name *string `pulumi:"name"`
	// The status of scaling group.
	Status *string `pulumi:"status"`
	// The error message when a failed state occurs.
	StatusReason *string `pulumi:"statusReason"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type KxScalingGroupState struct {
	// Amazon Resource Name (ARN) identifier of the KX Scaling Group.
	Arn pulumi.StringPtrInput
	// The availability zone identifiers for the requested regions.
	AvailabilityZoneId pulumi.StringPtrInput
	// The list of Managed kdb clusters that are currently active in the given scaling group.
	Clusters pulumi.StringArrayInput
	// The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
	CreatedTimestamp pulumi.StringPtrInput
	// A unique identifier for the kdb environment, where you want to create the scaling group.
	EnvironmentId pulumi.StringPtrInput
	// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
	//
	// The following arguments are optional:
	HostType pulumi.StringPtrInput
	// Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp pulumi.StringPtrInput
	// Unique name for the scaling group that you want to create.
	Name pulumi.StringPtrInput
	// The status of scaling group.
	Status pulumi.StringPtrInput
	// The error message when a failed state occurs.
	StatusReason pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (KxScalingGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*kxScalingGroupState)(nil)).Elem()
}

type kxScalingGroupArgs struct {
	// The availability zone identifiers for the requested regions.
	AvailabilityZoneId string `pulumi:"availabilityZoneId"`
	// A unique identifier for the kdb environment, where you want to create the scaling group.
	EnvironmentId string `pulumi:"environmentId"`
	// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
	//
	// The following arguments are optional:
	HostType string `pulumi:"hostType"`
	// Unique name for the scaling group that you want to create.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a KxScalingGroup resource.
type KxScalingGroupArgs struct {
	// The availability zone identifiers for the requested regions.
	AvailabilityZoneId pulumi.StringInput
	// A unique identifier for the kdb environment, where you want to create the scaling group.
	EnvironmentId pulumi.StringInput
	// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
	//
	// The following arguments are optional:
	HostType pulumi.StringInput
	// Unique name for the scaling group that you want to create.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
	Tags pulumi.StringMapInput
}

func (KxScalingGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kxScalingGroupArgs)(nil)).Elem()
}

type KxScalingGroupInput interface {
	pulumi.Input

	ToKxScalingGroupOutput() KxScalingGroupOutput
	ToKxScalingGroupOutputWithContext(ctx context.Context) KxScalingGroupOutput
}

func (*KxScalingGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**KxScalingGroup)(nil)).Elem()
}

func (i *KxScalingGroup) ToKxScalingGroupOutput() KxScalingGroupOutput {
	return i.ToKxScalingGroupOutputWithContext(context.Background())
}

func (i *KxScalingGroup) ToKxScalingGroupOutputWithContext(ctx context.Context) KxScalingGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxScalingGroupOutput)
}

// KxScalingGroupArrayInput is an input type that accepts KxScalingGroupArray and KxScalingGroupArrayOutput values.
// You can construct a concrete instance of `KxScalingGroupArrayInput` via:
//
//	KxScalingGroupArray{ KxScalingGroupArgs{...} }
type KxScalingGroupArrayInput interface {
	pulumi.Input

	ToKxScalingGroupArrayOutput() KxScalingGroupArrayOutput
	ToKxScalingGroupArrayOutputWithContext(context.Context) KxScalingGroupArrayOutput
}

type KxScalingGroupArray []KxScalingGroupInput

func (KxScalingGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KxScalingGroup)(nil)).Elem()
}

func (i KxScalingGroupArray) ToKxScalingGroupArrayOutput() KxScalingGroupArrayOutput {
	return i.ToKxScalingGroupArrayOutputWithContext(context.Background())
}

func (i KxScalingGroupArray) ToKxScalingGroupArrayOutputWithContext(ctx context.Context) KxScalingGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxScalingGroupArrayOutput)
}

// KxScalingGroupMapInput is an input type that accepts KxScalingGroupMap and KxScalingGroupMapOutput values.
// You can construct a concrete instance of `KxScalingGroupMapInput` via:
//
//	KxScalingGroupMap{ "key": KxScalingGroupArgs{...} }
type KxScalingGroupMapInput interface {
	pulumi.Input

	ToKxScalingGroupMapOutput() KxScalingGroupMapOutput
	ToKxScalingGroupMapOutputWithContext(context.Context) KxScalingGroupMapOutput
}

type KxScalingGroupMap map[string]KxScalingGroupInput

func (KxScalingGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KxScalingGroup)(nil)).Elem()
}

func (i KxScalingGroupMap) ToKxScalingGroupMapOutput() KxScalingGroupMapOutput {
	return i.ToKxScalingGroupMapOutputWithContext(context.Background())
}

func (i KxScalingGroupMap) ToKxScalingGroupMapOutputWithContext(ctx context.Context) KxScalingGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxScalingGroupMapOutput)
}

type KxScalingGroupOutput struct{ *pulumi.OutputState }

func (KxScalingGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KxScalingGroup)(nil)).Elem()
}

func (o KxScalingGroupOutput) ToKxScalingGroupOutput() KxScalingGroupOutput {
	return o
}

func (o KxScalingGroupOutput) ToKxScalingGroupOutputWithContext(ctx context.Context) KxScalingGroupOutput {
	return o
}

// Amazon Resource Name (ARN) identifier of the KX Scaling Group.
func (o KxScalingGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The availability zone identifiers for the requested regions.
func (o KxScalingGroupOutput) AvailabilityZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.AvailabilityZoneId }).(pulumi.StringOutput)
}

// The list of Managed kdb clusters that are currently active in the given scaling group.
func (o KxScalingGroupOutput) Clusters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringArrayOutput { return v.Clusters }).(pulumi.StringArrayOutput)
}

// The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
func (o KxScalingGroupOutput) CreatedTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.CreatedTimestamp }).(pulumi.StringOutput)
}

// A unique identifier for the kdb environment, where you want to create the scaling group.
func (o KxScalingGroupOutput) EnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.EnvironmentId }).(pulumi.StringOutput)
}

// The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
//
// The following arguments are optional:
func (o KxScalingGroupOutput) HostType() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.HostType }).(pulumi.StringOutput)
}

// Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
func (o KxScalingGroupOutput) LastModifiedTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.LastModifiedTimestamp }).(pulumi.StringOutput)
}

// Unique name for the scaling group that you want to create.
func (o KxScalingGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The status of scaling group.
func (o KxScalingGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The error message when a failed state occurs.
func (o KxScalingGroupOutput) StatusReason() pulumi.StringOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringOutput { return v.StatusReason }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
func (o KxScalingGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o KxScalingGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KxScalingGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type KxScalingGroupArrayOutput struct{ *pulumi.OutputState }

func (KxScalingGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KxScalingGroup)(nil)).Elem()
}

func (o KxScalingGroupArrayOutput) ToKxScalingGroupArrayOutput() KxScalingGroupArrayOutput {
	return o
}

func (o KxScalingGroupArrayOutput) ToKxScalingGroupArrayOutputWithContext(ctx context.Context) KxScalingGroupArrayOutput {
	return o
}

func (o KxScalingGroupArrayOutput) Index(i pulumi.IntInput) KxScalingGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KxScalingGroup {
		return vs[0].([]*KxScalingGroup)[vs[1].(int)]
	}).(KxScalingGroupOutput)
}

type KxScalingGroupMapOutput struct{ *pulumi.OutputState }

func (KxScalingGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KxScalingGroup)(nil)).Elem()
}

func (o KxScalingGroupMapOutput) ToKxScalingGroupMapOutput() KxScalingGroupMapOutput {
	return o
}

func (o KxScalingGroupMapOutput) ToKxScalingGroupMapOutputWithContext(ctx context.Context) KxScalingGroupMapOutput {
	return o
}

func (o KxScalingGroupMapOutput) MapIndex(k pulumi.StringInput) KxScalingGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KxScalingGroup {
		return vs[0].(map[string]*KxScalingGroup)[vs[1].(string)]
	}).(KxScalingGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KxScalingGroupInput)(nil)).Elem(), &KxScalingGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*KxScalingGroupArrayInput)(nil)).Elem(), KxScalingGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KxScalingGroupMapInput)(nil)).Elem(), KxScalingGroupMap{})
	pulumi.RegisterOutputType(KxScalingGroupOutput{})
	pulumi.RegisterOutputType(KxScalingGroupArrayOutput{})
	pulumi.RegisterOutputType(KxScalingGroupMapOutput{})
}
