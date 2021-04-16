// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type CanaryRunConfig struct {
	// Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
	ActiveTracing *bool `pulumi:"activeTracing"`
	// Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
	MemoryInMb *int `pulumi:"memoryInMb"`
	// Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
	TimeoutInSeconds *int `pulumi:"timeoutInSeconds"`
}

// CanaryRunConfigInput is an input type that accepts CanaryRunConfigArgs and CanaryRunConfigOutput values.
// You can construct a concrete instance of `CanaryRunConfigInput` via:
//
//          CanaryRunConfigArgs{...}
type CanaryRunConfigInput interface {
	pulumi.Input

	ToCanaryRunConfigOutput() CanaryRunConfigOutput
	ToCanaryRunConfigOutputWithContext(context.Context) CanaryRunConfigOutput
}

type CanaryRunConfigArgs struct {
	// Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
	ActiveTracing pulumi.BoolPtrInput `pulumi:"activeTracing"`
	// Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
	MemoryInMb pulumi.IntPtrInput `pulumi:"memoryInMb"`
	// Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
	TimeoutInSeconds pulumi.IntPtrInput `pulumi:"timeoutInSeconds"`
}

func (CanaryRunConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryRunConfig)(nil)).Elem()
}

func (i CanaryRunConfigArgs) ToCanaryRunConfigOutput() CanaryRunConfigOutput {
	return i.ToCanaryRunConfigOutputWithContext(context.Background())
}

func (i CanaryRunConfigArgs) ToCanaryRunConfigOutputWithContext(ctx context.Context) CanaryRunConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryRunConfigOutput)
}

func (i CanaryRunConfigArgs) ToCanaryRunConfigPtrOutput() CanaryRunConfigPtrOutput {
	return i.ToCanaryRunConfigPtrOutputWithContext(context.Background())
}

func (i CanaryRunConfigArgs) ToCanaryRunConfigPtrOutputWithContext(ctx context.Context) CanaryRunConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryRunConfigOutput).ToCanaryRunConfigPtrOutputWithContext(ctx)
}

// CanaryRunConfigPtrInput is an input type that accepts CanaryRunConfigArgs, CanaryRunConfigPtr and CanaryRunConfigPtrOutput values.
// You can construct a concrete instance of `CanaryRunConfigPtrInput` via:
//
//          CanaryRunConfigArgs{...}
//
//  or:
//
//          nil
type CanaryRunConfigPtrInput interface {
	pulumi.Input

	ToCanaryRunConfigPtrOutput() CanaryRunConfigPtrOutput
	ToCanaryRunConfigPtrOutputWithContext(context.Context) CanaryRunConfigPtrOutput
}

type canaryRunConfigPtrType CanaryRunConfigArgs

func CanaryRunConfigPtr(v *CanaryRunConfigArgs) CanaryRunConfigPtrInput {
	return (*canaryRunConfigPtrType)(v)
}

func (*canaryRunConfigPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CanaryRunConfig)(nil)).Elem()
}

func (i *canaryRunConfigPtrType) ToCanaryRunConfigPtrOutput() CanaryRunConfigPtrOutput {
	return i.ToCanaryRunConfigPtrOutputWithContext(context.Background())
}

func (i *canaryRunConfigPtrType) ToCanaryRunConfigPtrOutputWithContext(ctx context.Context) CanaryRunConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryRunConfigPtrOutput)
}

type CanaryRunConfigOutput struct{ *pulumi.OutputState }

func (CanaryRunConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryRunConfig)(nil)).Elem()
}

func (o CanaryRunConfigOutput) ToCanaryRunConfigOutput() CanaryRunConfigOutput {
	return o
}

func (o CanaryRunConfigOutput) ToCanaryRunConfigOutputWithContext(ctx context.Context) CanaryRunConfigOutput {
	return o
}

func (o CanaryRunConfigOutput) ToCanaryRunConfigPtrOutput() CanaryRunConfigPtrOutput {
	return o.ToCanaryRunConfigPtrOutputWithContext(context.Background())
}

func (o CanaryRunConfigOutput) ToCanaryRunConfigPtrOutputWithContext(ctx context.Context) CanaryRunConfigPtrOutput {
	return o.ApplyT(func(v CanaryRunConfig) *CanaryRunConfig {
		return &v
	}).(CanaryRunConfigPtrOutput)
}

// Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
func (o CanaryRunConfigOutput) ActiveTracing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v CanaryRunConfig) *bool { return v.ActiveTracing }).(pulumi.BoolPtrOutput)
}

// Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
func (o CanaryRunConfigOutput) MemoryInMb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v CanaryRunConfig) *int { return v.MemoryInMb }).(pulumi.IntPtrOutput)
}

// Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
func (o CanaryRunConfigOutput) TimeoutInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v CanaryRunConfig) *int { return v.TimeoutInSeconds }).(pulumi.IntPtrOutput)
}

type CanaryRunConfigPtrOutput struct{ *pulumi.OutputState }

func (CanaryRunConfigPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CanaryRunConfig)(nil)).Elem()
}

func (o CanaryRunConfigPtrOutput) ToCanaryRunConfigPtrOutput() CanaryRunConfigPtrOutput {
	return o
}

func (o CanaryRunConfigPtrOutput) ToCanaryRunConfigPtrOutputWithContext(ctx context.Context) CanaryRunConfigPtrOutput {
	return o
}

func (o CanaryRunConfigPtrOutput) Elem() CanaryRunConfigOutput {
	return o.ApplyT(func(v *CanaryRunConfig) CanaryRunConfig { return *v }).(CanaryRunConfigOutput)
}

// Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
func (o CanaryRunConfigPtrOutput) ActiveTracing() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CanaryRunConfig) *bool {
		if v == nil {
			return nil
		}
		return v.ActiveTracing
	}).(pulumi.BoolPtrOutput)
}

// Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
func (o CanaryRunConfigPtrOutput) MemoryInMb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CanaryRunConfig) *int {
		if v == nil {
			return nil
		}
		return v.MemoryInMb
	}).(pulumi.IntPtrOutput)
}

// Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
func (o CanaryRunConfigPtrOutput) TimeoutInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CanaryRunConfig) *int {
		if v == nil {
			return nil
		}
		return v.TimeoutInSeconds
	}).(pulumi.IntPtrOutput)
}

type CanarySchedule struct {
	// Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
	DurationInSeconds *int `pulumi:"durationInSeconds"`
	// Rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.
	Expression string `pulumi:"expression"`
}

// CanaryScheduleInput is an input type that accepts CanaryScheduleArgs and CanaryScheduleOutput values.
// You can construct a concrete instance of `CanaryScheduleInput` via:
//
//          CanaryScheduleArgs{...}
type CanaryScheduleInput interface {
	pulumi.Input

	ToCanaryScheduleOutput() CanaryScheduleOutput
	ToCanaryScheduleOutputWithContext(context.Context) CanaryScheduleOutput
}

type CanaryScheduleArgs struct {
	// Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
	DurationInSeconds pulumi.IntPtrInput `pulumi:"durationInSeconds"`
	// Rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.
	Expression pulumi.StringInput `pulumi:"expression"`
}

func (CanaryScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CanarySchedule)(nil)).Elem()
}

func (i CanaryScheduleArgs) ToCanaryScheduleOutput() CanaryScheduleOutput {
	return i.ToCanaryScheduleOutputWithContext(context.Background())
}

func (i CanaryScheduleArgs) ToCanaryScheduleOutputWithContext(ctx context.Context) CanaryScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryScheduleOutput)
}

func (i CanaryScheduleArgs) ToCanarySchedulePtrOutput() CanarySchedulePtrOutput {
	return i.ToCanarySchedulePtrOutputWithContext(context.Background())
}

func (i CanaryScheduleArgs) ToCanarySchedulePtrOutputWithContext(ctx context.Context) CanarySchedulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryScheduleOutput).ToCanarySchedulePtrOutputWithContext(ctx)
}

// CanarySchedulePtrInput is an input type that accepts CanaryScheduleArgs, CanarySchedulePtr and CanarySchedulePtrOutput values.
// You can construct a concrete instance of `CanarySchedulePtrInput` via:
//
//          CanaryScheduleArgs{...}
//
//  or:
//
//          nil
type CanarySchedulePtrInput interface {
	pulumi.Input

	ToCanarySchedulePtrOutput() CanarySchedulePtrOutput
	ToCanarySchedulePtrOutputWithContext(context.Context) CanarySchedulePtrOutput
}

type canarySchedulePtrType CanaryScheduleArgs

func CanarySchedulePtr(v *CanaryScheduleArgs) CanarySchedulePtrInput {
	return (*canarySchedulePtrType)(v)
}

func (*canarySchedulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CanarySchedule)(nil)).Elem()
}

func (i *canarySchedulePtrType) ToCanarySchedulePtrOutput() CanarySchedulePtrOutput {
	return i.ToCanarySchedulePtrOutputWithContext(context.Background())
}

func (i *canarySchedulePtrType) ToCanarySchedulePtrOutputWithContext(ctx context.Context) CanarySchedulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanarySchedulePtrOutput)
}

type CanaryScheduleOutput struct{ *pulumi.OutputState }

func (CanaryScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CanarySchedule)(nil)).Elem()
}

func (o CanaryScheduleOutput) ToCanaryScheduleOutput() CanaryScheduleOutput {
	return o
}

func (o CanaryScheduleOutput) ToCanaryScheduleOutputWithContext(ctx context.Context) CanaryScheduleOutput {
	return o
}

func (o CanaryScheduleOutput) ToCanarySchedulePtrOutput() CanarySchedulePtrOutput {
	return o.ToCanarySchedulePtrOutputWithContext(context.Background())
}

func (o CanaryScheduleOutput) ToCanarySchedulePtrOutputWithContext(ctx context.Context) CanarySchedulePtrOutput {
	return o.ApplyT(func(v CanarySchedule) *CanarySchedule {
		return &v
	}).(CanarySchedulePtrOutput)
}

// Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
func (o CanaryScheduleOutput) DurationInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v CanarySchedule) *int { return v.DurationInSeconds }).(pulumi.IntPtrOutput)
}

// Rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.
func (o CanaryScheduleOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v CanarySchedule) string { return v.Expression }).(pulumi.StringOutput)
}

type CanarySchedulePtrOutput struct{ *pulumi.OutputState }

func (CanarySchedulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CanarySchedule)(nil)).Elem()
}

func (o CanarySchedulePtrOutput) ToCanarySchedulePtrOutput() CanarySchedulePtrOutput {
	return o
}

func (o CanarySchedulePtrOutput) ToCanarySchedulePtrOutputWithContext(ctx context.Context) CanarySchedulePtrOutput {
	return o
}

func (o CanarySchedulePtrOutput) Elem() CanaryScheduleOutput {
	return o.ApplyT(func(v *CanarySchedule) CanarySchedule { return *v }).(CanaryScheduleOutput)
}

// Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
func (o CanarySchedulePtrOutput) DurationInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CanarySchedule) *int {
		if v == nil {
			return nil
		}
		return v.DurationInSeconds
	}).(pulumi.IntPtrOutput)
}

// Rate expression that defines how often the canary is to run. The syntax is rate(number unit). unit can be minute, minutes, or hour.
func (o CanarySchedulePtrOutput) Expression() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CanarySchedule) *string {
		if v == nil {
			return nil
		}
		return &v.Expression
	}).(pulumi.StringPtrOutput)
}

type CanaryTimeline struct {
	// Date and time the canary was created.
	Created *string `pulumi:"created"`
	// Date and time the canary was most recently modified.
	LastModified *string `pulumi:"lastModified"`
	// Date and time that the canary's most recent run started.
	LastStarted *string `pulumi:"lastStarted"`
	// Date and time that the canary's most recent run ended.
	LastStopped *string `pulumi:"lastStopped"`
}

// CanaryTimelineInput is an input type that accepts CanaryTimelineArgs and CanaryTimelineOutput values.
// You can construct a concrete instance of `CanaryTimelineInput` via:
//
//          CanaryTimelineArgs{...}
type CanaryTimelineInput interface {
	pulumi.Input

	ToCanaryTimelineOutput() CanaryTimelineOutput
	ToCanaryTimelineOutputWithContext(context.Context) CanaryTimelineOutput
}

type CanaryTimelineArgs struct {
	// Date and time the canary was created.
	Created pulumi.StringPtrInput `pulumi:"created"`
	// Date and time the canary was most recently modified.
	LastModified pulumi.StringPtrInput `pulumi:"lastModified"`
	// Date and time that the canary's most recent run started.
	LastStarted pulumi.StringPtrInput `pulumi:"lastStarted"`
	// Date and time that the canary's most recent run ended.
	LastStopped pulumi.StringPtrInput `pulumi:"lastStopped"`
}

func (CanaryTimelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryTimeline)(nil)).Elem()
}

func (i CanaryTimelineArgs) ToCanaryTimelineOutput() CanaryTimelineOutput {
	return i.ToCanaryTimelineOutputWithContext(context.Background())
}

func (i CanaryTimelineArgs) ToCanaryTimelineOutputWithContext(ctx context.Context) CanaryTimelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryTimelineOutput)
}

// CanaryTimelineArrayInput is an input type that accepts CanaryTimelineArray and CanaryTimelineArrayOutput values.
// You can construct a concrete instance of `CanaryTimelineArrayInput` via:
//
//          CanaryTimelineArray{ CanaryTimelineArgs{...} }
type CanaryTimelineArrayInput interface {
	pulumi.Input

	ToCanaryTimelineArrayOutput() CanaryTimelineArrayOutput
	ToCanaryTimelineArrayOutputWithContext(context.Context) CanaryTimelineArrayOutput
}

type CanaryTimelineArray []CanaryTimelineInput

func (CanaryTimelineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CanaryTimeline)(nil)).Elem()
}

func (i CanaryTimelineArray) ToCanaryTimelineArrayOutput() CanaryTimelineArrayOutput {
	return i.ToCanaryTimelineArrayOutputWithContext(context.Background())
}

func (i CanaryTimelineArray) ToCanaryTimelineArrayOutputWithContext(ctx context.Context) CanaryTimelineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryTimelineArrayOutput)
}

type CanaryTimelineOutput struct{ *pulumi.OutputState }

func (CanaryTimelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryTimeline)(nil)).Elem()
}

func (o CanaryTimelineOutput) ToCanaryTimelineOutput() CanaryTimelineOutput {
	return o
}

func (o CanaryTimelineOutput) ToCanaryTimelineOutputWithContext(ctx context.Context) CanaryTimelineOutput {
	return o
}

// Date and time the canary was created.
func (o CanaryTimelineOutput) Created() pulumi.StringPtrOutput {
	return o.ApplyT(func(v CanaryTimeline) *string { return v.Created }).(pulumi.StringPtrOutput)
}

// Date and time the canary was most recently modified.
func (o CanaryTimelineOutput) LastModified() pulumi.StringPtrOutput {
	return o.ApplyT(func(v CanaryTimeline) *string { return v.LastModified }).(pulumi.StringPtrOutput)
}

// Date and time that the canary's most recent run started.
func (o CanaryTimelineOutput) LastStarted() pulumi.StringPtrOutput {
	return o.ApplyT(func(v CanaryTimeline) *string { return v.LastStarted }).(pulumi.StringPtrOutput)
}

// Date and time that the canary's most recent run ended.
func (o CanaryTimelineOutput) LastStopped() pulumi.StringPtrOutput {
	return o.ApplyT(func(v CanaryTimeline) *string { return v.LastStopped }).(pulumi.StringPtrOutput)
}

type CanaryTimelineArrayOutput struct{ *pulumi.OutputState }

func (CanaryTimelineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CanaryTimeline)(nil)).Elem()
}

func (o CanaryTimelineArrayOutput) ToCanaryTimelineArrayOutput() CanaryTimelineArrayOutput {
	return o
}

func (o CanaryTimelineArrayOutput) ToCanaryTimelineArrayOutputWithContext(ctx context.Context) CanaryTimelineArrayOutput {
	return o
}

func (o CanaryTimelineArrayOutput) Index(i pulumi.IntInput) CanaryTimelineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CanaryTimeline {
		return vs[0].([]CanaryTimeline)[vs[1].(int)]
	}).(CanaryTimelineOutput)
}

type CanaryVpcConfig struct {
	// IDs of the security groups for this canary.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// IDs of the subnets where this canary is to run.
	SubnetIds []string `pulumi:"subnetIds"`
	// ID of the VPC where this canary is to run.
	VpcId *string `pulumi:"vpcId"`
}

// CanaryVpcConfigInput is an input type that accepts CanaryVpcConfigArgs and CanaryVpcConfigOutput values.
// You can construct a concrete instance of `CanaryVpcConfigInput` via:
//
//          CanaryVpcConfigArgs{...}
type CanaryVpcConfigInput interface {
	pulumi.Input

	ToCanaryVpcConfigOutput() CanaryVpcConfigOutput
	ToCanaryVpcConfigOutputWithContext(context.Context) CanaryVpcConfigOutput
}

type CanaryVpcConfigArgs struct {
	// IDs of the security groups for this canary.
	SecurityGroupIds pulumi.StringArrayInput `pulumi:"securityGroupIds"`
	// IDs of the subnets where this canary is to run.
	SubnetIds pulumi.StringArrayInput `pulumi:"subnetIds"`
	// ID of the VPC where this canary is to run.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (CanaryVpcConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryVpcConfig)(nil)).Elem()
}

func (i CanaryVpcConfigArgs) ToCanaryVpcConfigOutput() CanaryVpcConfigOutput {
	return i.ToCanaryVpcConfigOutputWithContext(context.Background())
}

func (i CanaryVpcConfigArgs) ToCanaryVpcConfigOutputWithContext(ctx context.Context) CanaryVpcConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryVpcConfigOutput)
}

func (i CanaryVpcConfigArgs) ToCanaryVpcConfigPtrOutput() CanaryVpcConfigPtrOutput {
	return i.ToCanaryVpcConfigPtrOutputWithContext(context.Background())
}

func (i CanaryVpcConfigArgs) ToCanaryVpcConfigPtrOutputWithContext(ctx context.Context) CanaryVpcConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryVpcConfigOutput).ToCanaryVpcConfigPtrOutputWithContext(ctx)
}

// CanaryVpcConfigPtrInput is an input type that accepts CanaryVpcConfigArgs, CanaryVpcConfigPtr and CanaryVpcConfigPtrOutput values.
// You can construct a concrete instance of `CanaryVpcConfigPtrInput` via:
//
//          CanaryVpcConfigArgs{...}
//
//  or:
//
//          nil
type CanaryVpcConfigPtrInput interface {
	pulumi.Input

	ToCanaryVpcConfigPtrOutput() CanaryVpcConfigPtrOutput
	ToCanaryVpcConfigPtrOutputWithContext(context.Context) CanaryVpcConfigPtrOutput
}

type canaryVpcConfigPtrType CanaryVpcConfigArgs

func CanaryVpcConfigPtr(v *CanaryVpcConfigArgs) CanaryVpcConfigPtrInput {
	return (*canaryVpcConfigPtrType)(v)
}

func (*canaryVpcConfigPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CanaryVpcConfig)(nil)).Elem()
}

func (i *canaryVpcConfigPtrType) ToCanaryVpcConfigPtrOutput() CanaryVpcConfigPtrOutput {
	return i.ToCanaryVpcConfigPtrOutputWithContext(context.Background())
}

func (i *canaryVpcConfigPtrType) ToCanaryVpcConfigPtrOutputWithContext(ctx context.Context) CanaryVpcConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CanaryVpcConfigPtrOutput)
}

type CanaryVpcConfigOutput struct{ *pulumi.OutputState }

func (CanaryVpcConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CanaryVpcConfig)(nil)).Elem()
}

func (o CanaryVpcConfigOutput) ToCanaryVpcConfigOutput() CanaryVpcConfigOutput {
	return o
}

func (o CanaryVpcConfigOutput) ToCanaryVpcConfigOutputWithContext(ctx context.Context) CanaryVpcConfigOutput {
	return o
}

func (o CanaryVpcConfigOutput) ToCanaryVpcConfigPtrOutput() CanaryVpcConfigPtrOutput {
	return o.ToCanaryVpcConfigPtrOutputWithContext(context.Background())
}

func (o CanaryVpcConfigOutput) ToCanaryVpcConfigPtrOutputWithContext(ctx context.Context) CanaryVpcConfigPtrOutput {
	return o.ApplyT(func(v CanaryVpcConfig) *CanaryVpcConfig {
		return &v
	}).(CanaryVpcConfigPtrOutput)
}

// IDs of the security groups for this canary.
func (o CanaryVpcConfigOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v CanaryVpcConfig) []string { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// IDs of the subnets where this canary is to run.
func (o CanaryVpcConfigOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v CanaryVpcConfig) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// ID of the VPC where this canary is to run.
func (o CanaryVpcConfigOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v CanaryVpcConfig) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

type CanaryVpcConfigPtrOutput struct{ *pulumi.OutputState }

func (CanaryVpcConfigPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CanaryVpcConfig)(nil)).Elem()
}

func (o CanaryVpcConfigPtrOutput) ToCanaryVpcConfigPtrOutput() CanaryVpcConfigPtrOutput {
	return o
}

func (o CanaryVpcConfigPtrOutput) ToCanaryVpcConfigPtrOutputWithContext(ctx context.Context) CanaryVpcConfigPtrOutput {
	return o
}

func (o CanaryVpcConfigPtrOutput) Elem() CanaryVpcConfigOutput {
	return o.ApplyT(func(v *CanaryVpcConfig) CanaryVpcConfig { return *v }).(CanaryVpcConfigOutput)
}

// IDs of the security groups for this canary.
func (o CanaryVpcConfigPtrOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CanaryVpcConfig) []string {
		if v == nil {
			return nil
		}
		return v.SecurityGroupIds
	}).(pulumi.StringArrayOutput)
}

// IDs of the subnets where this canary is to run.
func (o CanaryVpcConfigPtrOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CanaryVpcConfig) []string {
		if v == nil {
			return nil
		}
		return v.SubnetIds
	}).(pulumi.StringArrayOutput)
}

// ID of the VPC where this canary is to run.
func (o CanaryVpcConfigPtrOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CanaryVpcConfig) *string {
		if v == nil {
			return nil
		}
		return v.VpcId
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(CanaryRunConfigOutput{})
	pulumi.RegisterOutputType(CanaryRunConfigPtrOutput{})
	pulumi.RegisterOutputType(CanaryScheduleOutput{})
	pulumi.RegisterOutputType(CanarySchedulePtrOutput{})
	pulumi.RegisterOutputType(CanaryTimelineOutput{})
	pulumi.RegisterOutputType(CanaryTimelineArrayOutput{})
	pulumi.RegisterOutputType(CanaryVpcConfigOutput{})
	pulumi.RegisterOutputType(CanaryVpcConfigPtrOutput{})
}
