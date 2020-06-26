// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type GetEbsVolumesFilter struct {
	// The name of the field to filter by, as defined by
	// [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
	// For example, if matching against the `size` filter, use:
	Name string `pulumi:"name"`
	// Set of values that are accepted for the given field.
	// EBS Volume IDs will be selected if any one of the given values match.
	Values []string `pulumi:"values"`
}

// GetEbsVolumesFilterInput is an input type that accepts GetEbsVolumesFilterArgs and GetEbsVolumesFilterOutput values.
// You can construct a concrete instance of `GetEbsVolumesFilterInput` via:
//
//          GetEbsVolumesFilterArgs{...}
type GetEbsVolumesFilterInput interface {
	pulumi.Input

	ToGetEbsVolumesFilterOutput() GetEbsVolumesFilterOutput
	ToGetEbsVolumesFilterOutputWithContext(context.Context) GetEbsVolumesFilterOutput
}

type GetEbsVolumesFilterArgs struct {
	// The name of the field to filter by, as defined by
	// [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
	// For example, if matching against the `size` filter, use:
	Name pulumi.StringInput `pulumi:"name"`
	// Set of values that are accepted for the given field.
	// EBS Volume IDs will be selected if any one of the given values match.
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetEbsVolumesFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEbsVolumesFilter)(nil)).Elem()
}

func (i GetEbsVolumesFilterArgs) ToGetEbsVolumesFilterOutput() GetEbsVolumesFilterOutput {
	return i.ToGetEbsVolumesFilterOutputWithContext(context.Background())
}

func (i GetEbsVolumesFilterArgs) ToGetEbsVolumesFilterOutputWithContext(ctx context.Context) GetEbsVolumesFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetEbsVolumesFilterOutput)
}

// GetEbsVolumesFilterArrayInput is an input type that accepts GetEbsVolumesFilterArray and GetEbsVolumesFilterArrayOutput values.
// You can construct a concrete instance of `GetEbsVolumesFilterArrayInput` via:
//
//          GetEbsVolumesFilterArray{ GetEbsVolumesFilterArgs{...} }
type GetEbsVolumesFilterArrayInput interface {
	pulumi.Input

	ToGetEbsVolumesFilterArrayOutput() GetEbsVolumesFilterArrayOutput
	ToGetEbsVolumesFilterArrayOutputWithContext(context.Context) GetEbsVolumesFilterArrayOutput
}

type GetEbsVolumesFilterArray []GetEbsVolumesFilterInput

func (GetEbsVolumesFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetEbsVolumesFilter)(nil)).Elem()
}

func (i GetEbsVolumesFilterArray) ToGetEbsVolumesFilterArrayOutput() GetEbsVolumesFilterArrayOutput {
	return i.ToGetEbsVolumesFilterArrayOutputWithContext(context.Background())
}

func (i GetEbsVolumesFilterArray) ToGetEbsVolumesFilterArrayOutputWithContext(ctx context.Context) GetEbsVolumesFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetEbsVolumesFilterArrayOutput)
}

type GetEbsVolumesFilterOutput struct{ *pulumi.OutputState }

func (GetEbsVolumesFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEbsVolumesFilter)(nil)).Elem()
}

func (o GetEbsVolumesFilterOutput) ToGetEbsVolumesFilterOutput() GetEbsVolumesFilterOutput {
	return o
}

func (o GetEbsVolumesFilterOutput) ToGetEbsVolumesFilterOutputWithContext(ctx context.Context) GetEbsVolumesFilterOutput {
	return o
}

// The name of the field to filter by, as defined by
// [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
// For example, if matching against the `size` filter, use:
func (o GetEbsVolumesFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetEbsVolumesFilter) string { return v.Name }).(pulumi.StringOutput)
}

// Set of values that are accepted for the given field.
// EBS Volume IDs will be selected if any one of the given values match.
func (o GetEbsVolumesFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEbsVolumesFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetEbsVolumesFilterArrayOutput struct{ *pulumi.OutputState }

func (GetEbsVolumesFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetEbsVolumesFilter)(nil)).Elem()
}

func (o GetEbsVolumesFilterArrayOutput) ToGetEbsVolumesFilterArrayOutput() GetEbsVolumesFilterArrayOutput {
	return o
}

func (o GetEbsVolumesFilterArrayOutput) ToGetEbsVolumesFilterArrayOutputWithContext(ctx context.Context) GetEbsVolumesFilterArrayOutput {
	return o
}

func (o GetEbsVolumesFilterArrayOutput) Index(i pulumi.IntInput) GetEbsVolumesFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetEbsVolumesFilter {
		return vs[0].([]GetEbsVolumesFilter)[vs[1].(int)]
	}).(GetEbsVolumesFilterOutput)
}

type GetSnapshotFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetSnapshotFilterInput is an input type that accepts GetSnapshotFilterArgs and GetSnapshotFilterOutput values.
// You can construct a concrete instance of `GetSnapshotFilterInput` via:
//
//          GetSnapshotFilterArgs{...}
type GetSnapshotFilterInput interface {
	pulumi.Input

	ToGetSnapshotFilterOutput() GetSnapshotFilterOutput
	ToGetSnapshotFilterOutputWithContext(context.Context) GetSnapshotFilterOutput
}

type GetSnapshotFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetSnapshotFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotFilter)(nil)).Elem()
}

func (i GetSnapshotFilterArgs) ToGetSnapshotFilterOutput() GetSnapshotFilterOutput {
	return i.ToGetSnapshotFilterOutputWithContext(context.Background())
}

func (i GetSnapshotFilterArgs) ToGetSnapshotFilterOutputWithContext(ctx context.Context) GetSnapshotFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotFilterOutput)
}

// GetSnapshotFilterArrayInput is an input type that accepts GetSnapshotFilterArray and GetSnapshotFilterArrayOutput values.
// You can construct a concrete instance of `GetSnapshotFilterArrayInput` via:
//
//          GetSnapshotFilterArray{ GetSnapshotFilterArgs{...} }
type GetSnapshotFilterArrayInput interface {
	pulumi.Input

	ToGetSnapshotFilterArrayOutput() GetSnapshotFilterArrayOutput
	ToGetSnapshotFilterArrayOutputWithContext(context.Context) GetSnapshotFilterArrayOutput
}

type GetSnapshotFilterArray []GetSnapshotFilterInput

func (GetSnapshotFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotFilter)(nil)).Elem()
}

func (i GetSnapshotFilterArray) ToGetSnapshotFilterArrayOutput() GetSnapshotFilterArrayOutput {
	return i.ToGetSnapshotFilterArrayOutputWithContext(context.Background())
}

func (i GetSnapshotFilterArray) ToGetSnapshotFilterArrayOutputWithContext(ctx context.Context) GetSnapshotFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotFilterArrayOutput)
}

type GetSnapshotFilterOutput struct{ *pulumi.OutputState }

func (GetSnapshotFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotFilter)(nil)).Elem()
}

func (o GetSnapshotFilterOutput) ToGetSnapshotFilterOutput() GetSnapshotFilterOutput {
	return o
}

func (o GetSnapshotFilterOutput) ToGetSnapshotFilterOutputWithContext(ctx context.Context) GetSnapshotFilterOutput {
	return o
}

func (o GetSnapshotFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetSnapshotFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetSnapshotFilterArrayOutput struct{ *pulumi.OutputState }

func (GetSnapshotFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotFilter)(nil)).Elem()
}

func (o GetSnapshotFilterArrayOutput) ToGetSnapshotFilterArrayOutput() GetSnapshotFilterArrayOutput {
	return o
}

func (o GetSnapshotFilterArrayOutput) ToGetSnapshotFilterArrayOutputWithContext(ctx context.Context) GetSnapshotFilterArrayOutput {
	return o
}

func (o GetSnapshotFilterArrayOutput) Index(i pulumi.IntInput) GetSnapshotFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSnapshotFilter {
		return vs[0].([]GetSnapshotFilter)[vs[1].(int)]
	}).(GetSnapshotFilterOutput)
}

type GetSnapshotIdsFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetSnapshotIdsFilterInput is an input type that accepts GetSnapshotIdsFilterArgs and GetSnapshotIdsFilterOutput values.
// You can construct a concrete instance of `GetSnapshotIdsFilterInput` via:
//
//          GetSnapshotIdsFilterArgs{...}
type GetSnapshotIdsFilterInput interface {
	pulumi.Input

	ToGetSnapshotIdsFilterOutput() GetSnapshotIdsFilterOutput
	ToGetSnapshotIdsFilterOutputWithContext(context.Context) GetSnapshotIdsFilterOutput
}

type GetSnapshotIdsFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetSnapshotIdsFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotIdsFilter)(nil)).Elem()
}

func (i GetSnapshotIdsFilterArgs) ToGetSnapshotIdsFilterOutput() GetSnapshotIdsFilterOutput {
	return i.ToGetSnapshotIdsFilterOutputWithContext(context.Background())
}

func (i GetSnapshotIdsFilterArgs) ToGetSnapshotIdsFilterOutputWithContext(ctx context.Context) GetSnapshotIdsFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotIdsFilterOutput)
}

// GetSnapshotIdsFilterArrayInput is an input type that accepts GetSnapshotIdsFilterArray and GetSnapshotIdsFilterArrayOutput values.
// You can construct a concrete instance of `GetSnapshotIdsFilterArrayInput` via:
//
//          GetSnapshotIdsFilterArray{ GetSnapshotIdsFilterArgs{...} }
type GetSnapshotIdsFilterArrayInput interface {
	pulumi.Input

	ToGetSnapshotIdsFilterArrayOutput() GetSnapshotIdsFilterArrayOutput
	ToGetSnapshotIdsFilterArrayOutputWithContext(context.Context) GetSnapshotIdsFilterArrayOutput
}

type GetSnapshotIdsFilterArray []GetSnapshotIdsFilterInput

func (GetSnapshotIdsFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotIdsFilter)(nil)).Elem()
}

func (i GetSnapshotIdsFilterArray) ToGetSnapshotIdsFilterArrayOutput() GetSnapshotIdsFilterArrayOutput {
	return i.ToGetSnapshotIdsFilterArrayOutputWithContext(context.Background())
}

func (i GetSnapshotIdsFilterArray) ToGetSnapshotIdsFilterArrayOutputWithContext(ctx context.Context) GetSnapshotIdsFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSnapshotIdsFilterArrayOutput)
}

type GetSnapshotIdsFilterOutput struct{ *pulumi.OutputState }

func (GetSnapshotIdsFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotIdsFilter)(nil)).Elem()
}

func (o GetSnapshotIdsFilterOutput) ToGetSnapshotIdsFilterOutput() GetSnapshotIdsFilterOutput {
	return o
}

func (o GetSnapshotIdsFilterOutput) ToGetSnapshotIdsFilterOutputWithContext(ctx context.Context) GetSnapshotIdsFilterOutput {
	return o
}

func (o GetSnapshotIdsFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotIdsFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetSnapshotIdsFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotIdsFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetSnapshotIdsFilterArrayOutput struct{ *pulumi.OutputState }

func (GetSnapshotIdsFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSnapshotIdsFilter)(nil)).Elem()
}

func (o GetSnapshotIdsFilterArrayOutput) ToGetSnapshotIdsFilterArrayOutput() GetSnapshotIdsFilterArrayOutput {
	return o
}

func (o GetSnapshotIdsFilterArrayOutput) ToGetSnapshotIdsFilterArrayOutputWithContext(ctx context.Context) GetSnapshotIdsFilterArrayOutput {
	return o
}

func (o GetSnapshotIdsFilterArrayOutput) Index(i pulumi.IntInput) GetSnapshotIdsFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSnapshotIdsFilter {
		return vs[0].([]GetSnapshotIdsFilter)[vs[1].(int)]
	}).(GetSnapshotIdsFilterOutput)
}

type GetVolumeFilter struct {
	Name   string   `pulumi:"name"`
	Values []string `pulumi:"values"`
}

// GetVolumeFilterInput is an input type that accepts GetVolumeFilterArgs and GetVolumeFilterOutput values.
// You can construct a concrete instance of `GetVolumeFilterInput` via:
//
//          GetVolumeFilterArgs{...}
type GetVolumeFilterInput interface {
	pulumi.Input

	ToGetVolumeFilterOutput() GetVolumeFilterOutput
	ToGetVolumeFilterOutputWithContext(context.Context) GetVolumeFilterOutput
}

type GetVolumeFilterArgs struct {
	Name   pulumi.StringInput      `pulumi:"name"`
	Values pulumi.StringArrayInput `pulumi:"values"`
}

func (GetVolumeFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeFilter)(nil)).Elem()
}

func (i GetVolumeFilterArgs) ToGetVolumeFilterOutput() GetVolumeFilterOutput {
	return i.ToGetVolumeFilterOutputWithContext(context.Background())
}

func (i GetVolumeFilterArgs) ToGetVolumeFilterOutputWithContext(ctx context.Context) GetVolumeFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetVolumeFilterOutput)
}

// GetVolumeFilterArrayInput is an input type that accepts GetVolumeFilterArray and GetVolumeFilterArrayOutput values.
// You can construct a concrete instance of `GetVolumeFilterArrayInput` via:
//
//          GetVolumeFilterArray{ GetVolumeFilterArgs{...} }
type GetVolumeFilterArrayInput interface {
	pulumi.Input

	ToGetVolumeFilterArrayOutput() GetVolumeFilterArrayOutput
	ToGetVolumeFilterArrayOutputWithContext(context.Context) GetVolumeFilterArrayOutput
}

type GetVolumeFilterArray []GetVolumeFilterInput

func (GetVolumeFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetVolumeFilter)(nil)).Elem()
}

func (i GetVolumeFilterArray) ToGetVolumeFilterArrayOutput() GetVolumeFilterArrayOutput {
	return i.ToGetVolumeFilterArrayOutputWithContext(context.Background())
}

func (i GetVolumeFilterArray) ToGetVolumeFilterArrayOutputWithContext(ctx context.Context) GetVolumeFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetVolumeFilterArrayOutput)
}

type GetVolumeFilterOutput struct{ *pulumi.OutputState }

func (GetVolumeFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeFilter)(nil)).Elem()
}

func (o GetVolumeFilterOutput) ToGetVolumeFilterOutput() GetVolumeFilterOutput {
	return o
}

func (o GetVolumeFilterOutput) ToGetVolumeFilterOutputWithContext(ctx context.Context) GetVolumeFilterOutput {
	return o
}

func (o GetVolumeFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeFilter) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetVolumeFilterOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVolumeFilter) []string { return v.Values }).(pulumi.StringArrayOutput)
}

type GetVolumeFilterArrayOutput struct{ *pulumi.OutputState }

func (GetVolumeFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetVolumeFilter)(nil)).Elem()
}

func (o GetVolumeFilterArrayOutput) ToGetVolumeFilterArrayOutput() GetVolumeFilterArrayOutput {
	return o
}

func (o GetVolumeFilterArrayOutput) ToGetVolumeFilterArrayOutputWithContext(ctx context.Context) GetVolumeFilterArrayOutput {
	return o
}

func (o GetVolumeFilterArrayOutput) Index(i pulumi.IntInput) GetVolumeFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetVolumeFilter {
		return vs[0].([]GetVolumeFilter)[vs[1].(int)]
	}).(GetVolumeFilterOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEbsVolumesFilterOutput{})
	pulumi.RegisterOutputType(GetEbsVolumesFilterArrayOutput{})
	pulumi.RegisterOutputType(GetSnapshotFilterOutput{})
	pulumi.RegisterOutputType(GetSnapshotFilterArrayOutput{})
	pulumi.RegisterOutputType(GetSnapshotIdsFilterOutput{})
	pulumi.RegisterOutputType(GetSnapshotIdsFilterArrayOutput{})
	pulumi.RegisterOutputType(GetVolumeFilterOutput{})
	pulumi.RegisterOutputType(GetVolumeFilterArrayOutput{})
}
