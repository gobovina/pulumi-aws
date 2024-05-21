// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codeguruprofiler

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS CodeGuru Profiler Profiling Group.
//
// ## Example Usage
//
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codeguruprofiler"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codeguruprofiler.NewProfilingGroup(ctx, "example", &codeguruprofiler.ProfilingGroupArgs{
//				Name:            pulumi.String("example"),
//				ComputePlatform: pulumi.String("Default"),
//				AgentOrchestrationConfig: &codeguruprofiler.ProfilingGroupAgentOrchestrationConfigArgs{
//					ProfilingEnabled: pulumi.Bool(true),
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
// Using `pulumi import`, import CodeGuru Profiler Profiling Group using the `id`. For example:
//
// ```sh
// $ pulumi import aws:codeguruprofiler/profilingGroup:ProfilingGroup example profiling_group-name-12345678
// ```
type ProfilingGroup struct {
	pulumi.CustomResourceState

	// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
	AgentOrchestrationConfig ProfilingGroupAgentOrchestrationConfigPtrOutput `pulumi:"agentOrchestrationConfig"`
	// ARN of the profiling group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Compute platform of the profiling group.
	ComputePlatform pulumi.StringOutput `pulumi:"computePlatform"`
	// Name of the profiling group.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewProfilingGroup registers a new resource with the given unique name, arguments, and options.
func NewProfilingGroup(ctx *pulumi.Context,
	name string, args *ProfilingGroupArgs, opts ...pulumi.ResourceOption) (*ProfilingGroup, error) {
	if args == nil {
		args = &ProfilingGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProfilingGroup
	err := ctx.RegisterResource("aws:codeguruprofiler/profilingGroup:ProfilingGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProfilingGroup gets an existing ProfilingGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProfilingGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProfilingGroupState, opts ...pulumi.ResourceOption) (*ProfilingGroup, error) {
	var resource ProfilingGroup
	err := ctx.ReadResource("aws:codeguruprofiler/profilingGroup:ProfilingGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProfilingGroup resources.
type profilingGroupState struct {
	// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
	AgentOrchestrationConfig *ProfilingGroupAgentOrchestrationConfig `pulumi:"agentOrchestrationConfig"`
	// ARN of the profiling group.
	Arn *string `pulumi:"arn"`
	// Compute platform of the profiling group.
	ComputePlatform *string `pulumi:"computePlatform"`
	// Name of the profiling group.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ProfilingGroupState struct {
	// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
	AgentOrchestrationConfig ProfilingGroupAgentOrchestrationConfigPtrInput
	// ARN of the profiling group.
	Arn pulumi.StringPtrInput
	// Compute platform of the profiling group.
	ComputePlatform pulumi.StringPtrInput
	// Name of the profiling group.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ProfilingGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*profilingGroupState)(nil)).Elem()
}

type profilingGroupArgs struct {
	// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
	AgentOrchestrationConfig *ProfilingGroupAgentOrchestrationConfig `pulumi:"agentOrchestrationConfig"`
	// Compute platform of the profiling group.
	ComputePlatform *string `pulumi:"computePlatform"`
	// Name of the profiling group.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ProfilingGroup resource.
type ProfilingGroupArgs struct {
	// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
	AgentOrchestrationConfig ProfilingGroupAgentOrchestrationConfigPtrInput
	// Compute platform of the profiling group.
	ComputePlatform pulumi.StringPtrInput
	// Name of the profiling group.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ProfilingGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*profilingGroupArgs)(nil)).Elem()
}

type ProfilingGroupInput interface {
	pulumi.Input

	ToProfilingGroupOutput() ProfilingGroupOutput
	ToProfilingGroupOutputWithContext(ctx context.Context) ProfilingGroupOutput
}

func (*ProfilingGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ProfilingGroup)(nil)).Elem()
}

func (i *ProfilingGroup) ToProfilingGroupOutput() ProfilingGroupOutput {
	return i.ToProfilingGroupOutputWithContext(context.Background())
}

func (i *ProfilingGroup) ToProfilingGroupOutputWithContext(ctx context.Context) ProfilingGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProfilingGroupOutput)
}

// ProfilingGroupArrayInput is an input type that accepts ProfilingGroupArray and ProfilingGroupArrayOutput values.
// You can construct a concrete instance of `ProfilingGroupArrayInput` via:
//
//	ProfilingGroupArray{ ProfilingGroupArgs{...} }
type ProfilingGroupArrayInput interface {
	pulumi.Input

	ToProfilingGroupArrayOutput() ProfilingGroupArrayOutput
	ToProfilingGroupArrayOutputWithContext(context.Context) ProfilingGroupArrayOutput
}

type ProfilingGroupArray []ProfilingGroupInput

func (ProfilingGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProfilingGroup)(nil)).Elem()
}

func (i ProfilingGroupArray) ToProfilingGroupArrayOutput() ProfilingGroupArrayOutput {
	return i.ToProfilingGroupArrayOutputWithContext(context.Background())
}

func (i ProfilingGroupArray) ToProfilingGroupArrayOutputWithContext(ctx context.Context) ProfilingGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProfilingGroupArrayOutput)
}

// ProfilingGroupMapInput is an input type that accepts ProfilingGroupMap and ProfilingGroupMapOutput values.
// You can construct a concrete instance of `ProfilingGroupMapInput` via:
//
//	ProfilingGroupMap{ "key": ProfilingGroupArgs{...} }
type ProfilingGroupMapInput interface {
	pulumi.Input

	ToProfilingGroupMapOutput() ProfilingGroupMapOutput
	ToProfilingGroupMapOutputWithContext(context.Context) ProfilingGroupMapOutput
}

type ProfilingGroupMap map[string]ProfilingGroupInput

func (ProfilingGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProfilingGroup)(nil)).Elem()
}

func (i ProfilingGroupMap) ToProfilingGroupMapOutput() ProfilingGroupMapOutput {
	return i.ToProfilingGroupMapOutputWithContext(context.Background())
}

func (i ProfilingGroupMap) ToProfilingGroupMapOutputWithContext(ctx context.Context) ProfilingGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProfilingGroupMapOutput)
}

type ProfilingGroupOutput struct{ *pulumi.OutputState }

func (ProfilingGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProfilingGroup)(nil)).Elem()
}

func (o ProfilingGroupOutput) ToProfilingGroupOutput() ProfilingGroupOutput {
	return o
}

func (o ProfilingGroupOutput) ToProfilingGroupOutputWithContext(ctx context.Context) ProfilingGroupOutput {
	return o
}

// Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
func (o ProfilingGroupOutput) AgentOrchestrationConfig() ProfilingGroupAgentOrchestrationConfigPtrOutput {
	return o.ApplyT(func(v *ProfilingGroup) ProfilingGroupAgentOrchestrationConfigPtrOutput {
		return v.AgentOrchestrationConfig
	}).(ProfilingGroupAgentOrchestrationConfigPtrOutput)
}

// ARN of the profiling group.
func (o ProfilingGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ProfilingGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Compute platform of the profiling group.
func (o ProfilingGroupOutput) ComputePlatform() pulumi.StringOutput {
	return o.ApplyT(func(v *ProfilingGroup) pulumi.StringOutput { return v.ComputePlatform }).(pulumi.StringOutput)
}

// Name of the profiling group.
//
// The following arguments are optional:
func (o ProfilingGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProfilingGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ProfilingGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ProfilingGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ProfilingGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ProfilingGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ProfilingGroupArrayOutput struct{ *pulumi.OutputState }

func (ProfilingGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProfilingGroup)(nil)).Elem()
}

func (o ProfilingGroupArrayOutput) ToProfilingGroupArrayOutput() ProfilingGroupArrayOutput {
	return o
}

func (o ProfilingGroupArrayOutput) ToProfilingGroupArrayOutputWithContext(ctx context.Context) ProfilingGroupArrayOutput {
	return o
}

func (o ProfilingGroupArrayOutput) Index(i pulumi.IntInput) ProfilingGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProfilingGroup {
		return vs[0].([]*ProfilingGroup)[vs[1].(int)]
	}).(ProfilingGroupOutput)
}

type ProfilingGroupMapOutput struct{ *pulumi.OutputState }

func (ProfilingGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProfilingGroup)(nil)).Elem()
}

func (o ProfilingGroupMapOutput) ToProfilingGroupMapOutput() ProfilingGroupMapOutput {
	return o
}

func (o ProfilingGroupMapOutput) ToProfilingGroupMapOutputWithContext(ctx context.Context) ProfilingGroupMapOutput {
	return o
}

func (o ProfilingGroupMapOutput) MapIndex(k pulumi.StringInput) ProfilingGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProfilingGroup {
		return vs[0].(map[string]*ProfilingGroup)[vs[1].(string)]
	}).(ProfilingGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProfilingGroupInput)(nil)).Elem(), &ProfilingGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProfilingGroupArrayInput)(nil)).Elem(), ProfilingGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProfilingGroupMapInput)(nil)).Elem(), ProfilingGroupMap{})
	pulumi.RegisterOutputType(ProfilingGroupOutput{})
	pulumi.RegisterOutputType(ProfilingGroupArrayOutput{})
	pulumi.RegisterOutputType(ProfilingGroupMapOutput{})
}
