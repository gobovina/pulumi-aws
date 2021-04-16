// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package glue

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Glue Workflow resource.
// The workflow graph (DAG) can be build using the `glue.Trigger` resource.
// See the example below for creating a graph with four nodes (two triggers and two jobs).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/glue"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := glue.NewWorkflow(ctx, "example", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = glue.NewTrigger(ctx, "example_start", &glue.TriggerArgs{
// 			Type:         pulumi.String("ON_DEMAND"),
// 			WorkflowName: example.Name,
// 			Actions: glue.TriggerActionArray{
// 				&glue.TriggerActionArgs{
// 					JobName: pulumi.String("example-job"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = glue.NewTrigger(ctx, "example_inner", &glue.TriggerArgs{
// 			Type:         pulumi.String("CONDITIONAL"),
// 			WorkflowName: example.Name,
// 			Predicate: &glue.TriggerPredicateArgs{
// 				Conditions: glue.TriggerPredicateConditionArray{
// 					&glue.TriggerPredicateConditionArgs{
// 						JobName: pulumi.String("example-job"),
// 						State:   pulumi.String("SUCCEEDED"),
// 					},
// 				},
// 			},
// 			Actions: glue.TriggerActionArray{
// 				&glue.TriggerActionArgs{
// 					JobName: pulumi.String("another-example-job"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Glue Workflows can be imported using `name`, e.g.
//
// ```sh
//  $ pulumi import aws:glue/workflow:Workflow MyWorkflow MyWorkflow
// ```
type Workflow struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of Glue Workflow
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
	DefaultRunProperties pulumi.MapOutput `pulumi:"defaultRunProperties"`
	// Description of the workflow.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
	MaxConcurrentRuns pulumi.IntPtrOutput `pulumi:"maxConcurrentRuns"`
	// The name you assign to this workflow.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value map of resource tags
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewWorkflow registers a new resource with the given unique name, arguments, and options.
func NewWorkflow(ctx *pulumi.Context,
	name string, args *WorkflowArgs, opts ...pulumi.ResourceOption) (*Workflow, error) {
	if args == nil {
		args = &WorkflowArgs{}
	}

	var resource Workflow
	err := ctx.RegisterResource("aws:glue/workflow:Workflow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkflow gets an existing Workflow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkflow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkflowState, opts ...pulumi.ResourceOption) (*Workflow, error) {
	var resource Workflow
	err := ctx.ReadResource("aws:glue/workflow:Workflow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workflow resources.
type workflowState struct {
	// Amazon Resource Name (ARN) of Glue Workflow
	Arn *string `pulumi:"arn"`
	// A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
	DefaultRunProperties map[string]interface{} `pulumi:"defaultRunProperties"`
	// Description of the workflow.
	Description *string `pulumi:"description"`
	// Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
	MaxConcurrentRuns *int `pulumi:"maxConcurrentRuns"`
	// The name you assign to this workflow.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags
	Tags map[string]string `pulumi:"tags"`
}

type WorkflowState struct {
	// Amazon Resource Name (ARN) of Glue Workflow
	Arn pulumi.StringPtrInput
	// A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
	DefaultRunProperties pulumi.MapInput
	// Description of the workflow.
	Description pulumi.StringPtrInput
	// Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
	MaxConcurrentRuns pulumi.IntPtrInput
	// The name you assign to this workflow.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags
	Tags pulumi.StringMapInput
}

func (WorkflowState) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowState)(nil)).Elem()
}

type workflowArgs struct {
	// A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
	DefaultRunProperties map[string]interface{} `pulumi:"defaultRunProperties"`
	// Description of the workflow.
	Description *string `pulumi:"description"`
	// Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
	MaxConcurrentRuns *int `pulumi:"maxConcurrentRuns"`
	// The name you assign to this workflow.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Workflow resource.
type WorkflowArgs struct {
	// A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
	DefaultRunProperties pulumi.MapInput
	// Description of the workflow.
	Description pulumi.StringPtrInput
	// Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
	MaxConcurrentRuns pulumi.IntPtrInput
	// The name you assign to this workflow.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags
	Tags pulumi.StringMapInput
}

func (WorkflowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowArgs)(nil)).Elem()
}

type WorkflowInput interface {
	pulumi.Input

	ToWorkflowOutput() WorkflowOutput
	ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput
}

func (*Workflow) ElementType() reflect.Type {
	return reflect.TypeOf((*Workflow)(nil))
}

func (i *Workflow) ToWorkflowOutput() WorkflowOutput {
	return i.ToWorkflowOutputWithContext(context.Background())
}

func (i *Workflow) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowOutput)
}

func (i *Workflow) ToWorkflowPtrOutput() WorkflowPtrOutput {
	return i.ToWorkflowPtrOutputWithContext(context.Background())
}

func (i *Workflow) ToWorkflowPtrOutputWithContext(ctx context.Context) WorkflowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowPtrOutput)
}

type WorkflowPtrInput interface {
	pulumi.Input

	ToWorkflowPtrOutput() WorkflowPtrOutput
	ToWorkflowPtrOutputWithContext(ctx context.Context) WorkflowPtrOutput
}

type workflowPtrType WorkflowArgs

func (*workflowPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil))
}

func (i *workflowPtrType) ToWorkflowPtrOutput() WorkflowPtrOutput {
	return i.ToWorkflowPtrOutputWithContext(context.Background())
}

func (i *workflowPtrType) ToWorkflowPtrOutputWithContext(ctx context.Context) WorkflowPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowPtrOutput)
}

// WorkflowArrayInput is an input type that accepts WorkflowArray and WorkflowArrayOutput values.
// You can construct a concrete instance of `WorkflowArrayInput` via:
//
//          WorkflowArray{ WorkflowArgs{...} }
type WorkflowArrayInput interface {
	pulumi.Input

	ToWorkflowArrayOutput() WorkflowArrayOutput
	ToWorkflowArrayOutputWithContext(context.Context) WorkflowArrayOutput
}

type WorkflowArray []WorkflowInput

func (WorkflowArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Workflow)(nil))
}

func (i WorkflowArray) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return i.ToWorkflowArrayOutputWithContext(context.Background())
}

func (i WorkflowArray) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowArrayOutput)
}

// WorkflowMapInput is an input type that accepts WorkflowMap and WorkflowMapOutput values.
// You can construct a concrete instance of `WorkflowMapInput` via:
//
//          WorkflowMap{ "key": WorkflowArgs{...} }
type WorkflowMapInput interface {
	pulumi.Input

	ToWorkflowMapOutput() WorkflowMapOutput
	ToWorkflowMapOutputWithContext(context.Context) WorkflowMapOutput
}

type WorkflowMap map[string]WorkflowInput

func (WorkflowMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Workflow)(nil))
}

func (i WorkflowMap) ToWorkflowMapOutput() WorkflowMapOutput {
	return i.ToWorkflowMapOutputWithContext(context.Background())
}

func (i WorkflowMap) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowMapOutput)
}

type WorkflowOutput struct {
	*pulumi.OutputState
}

func (WorkflowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Workflow)(nil))
}

func (o WorkflowOutput) ToWorkflowOutput() WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToWorkflowPtrOutput() WorkflowPtrOutput {
	return o.ToWorkflowPtrOutputWithContext(context.Background())
}

func (o WorkflowOutput) ToWorkflowPtrOutputWithContext(ctx context.Context) WorkflowPtrOutput {
	return o.ApplyT(func(v Workflow) *Workflow {
		return &v
	}).(WorkflowPtrOutput)
}

type WorkflowPtrOutput struct {
	*pulumi.OutputState
}

func (WorkflowPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil))
}

func (o WorkflowPtrOutput) ToWorkflowPtrOutput() WorkflowPtrOutput {
	return o
}

func (o WorkflowPtrOutput) ToWorkflowPtrOutputWithContext(ctx context.Context) WorkflowPtrOutput {
	return o
}

type WorkflowArrayOutput struct{ *pulumi.OutputState }

func (WorkflowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Workflow)(nil))
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) Index(i pulumi.IntInput) WorkflowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Workflow {
		return vs[0].([]Workflow)[vs[1].(int)]
	}).(WorkflowOutput)
}

type WorkflowMapOutput struct{ *pulumi.OutputState }

func (WorkflowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Workflow)(nil))
}

func (o WorkflowMapOutput) ToWorkflowMapOutput() WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) MapIndex(k pulumi.StringInput) WorkflowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Workflow {
		return vs[0].(map[string]Workflow)[vs[1].(string)]
	}).(WorkflowOutput)
}

func init() {
	pulumi.RegisterOutputType(WorkflowOutput{})
	pulumi.RegisterOutputType(WorkflowPtrOutput{})
	pulumi.RegisterOutputType(WorkflowArrayOutput{})
	pulumi.RegisterOutputType(WorkflowMapOutput{})
}
