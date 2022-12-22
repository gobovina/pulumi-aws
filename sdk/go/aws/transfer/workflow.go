// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AWS Transfer Workflow resource.
//
// ## Example Usage
// ### Basic single step example
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewWorkflow(ctx, "example", &transfer.WorkflowArgs{
//				Steps: transfer.WorkflowStepArray{
//					&transfer.WorkflowStepArgs{
//						DeleteStepDetails: &transfer.WorkflowStepDeleteStepDetailsArgs{
//							Name:               pulumi.String("example"),
//							SourceFileLocation: pulumi.String(fmt.Sprintf("${original.file}")),
//						},
//						Type: pulumi.String("DELETE"),
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
// ### Multistep example
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewWorkflow(ctx, "example", &transfer.WorkflowArgs{
//				Steps: transfer.WorkflowStepArray{
//					&transfer.WorkflowStepArgs{
//						CustomStepDetails: &transfer.WorkflowStepCustomStepDetailsArgs{
//							Name:               pulumi.String("example"),
//							SourceFileLocation: pulumi.String(fmt.Sprintf("${original.file}")),
//							Target:             pulumi.Any(aws_lambda_function.Example.Arn),
//							TimeoutSeconds:     pulumi.Int(60),
//						},
//						Type: pulumi.String("CUSTOM"),
//					},
//					&transfer.WorkflowStepArgs{
//						TagStepDetails: &transfer.WorkflowStepTagStepDetailsArgs{
//							Name:               pulumi.String("example"),
//							SourceFileLocation: pulumi.String(fmt.Sprintf("${original.file}")),
//							Tags: transfer.WorkflowStepTagStepDetailsTagArray{
//								&transfer.WorkflowStepTagStepDetailsTagArgs{
//									Key:   pulumi.String("Name"),
//									Value: pulumi.String("Hello World"),
//								},
//							},
//						},
//						Type: pulumi.String("TAG"),
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
//
// ## Import
//
// Transfer Workflows can be imported using the `worflow_id`.
//
// ```sh
//
//	$ pulumi import aws:transfer/workflow:Workflow example example
//
// ```
type Workflow struct {
	pulumi.CustomResourceState

	// The Workflow ARN.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A textual description for the workflow.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
	OnExceptionSteps WorkflowOnExceptionStepArrayOutput `pulumi:"onExceptionSteps"`
	// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
	Steps WorkflowStepArrayOutput `pulumi:"steps"`
	// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewWorkflow registers a new resource with the given unique name, arguments, and options.
func NewWorkflow(ctx *pulumi.Context,
	name string, args *WorkflowArgs, opts ...pulumi.ResourceOption) (*Workflow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Steps == nil {
		return nil, errors.New("invalid value for required argument 'Steps'")
	}
	var resource Workflow
	err := ctx.RegisterResource("aws:transfer/workflow:Workflow", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:transfer/workflow:Workflow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workflow resources.
type workflowState struct {
	// The Workflow ARN.
	Arn *string `pulumi:"arn"`
	// A textual description for the workflow.
	Description *string `pulumi:"description"`
	// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
	OnExceptionSteps []WorkflowOnExceptionStep `pulumi:"onExceptionSteps"`
	// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
	Steps []WorkflowStep `pulumi:"steps"`
	// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type WorkflowState struct {
	// The Workflow ARN.
	Arn pulumi.StringPtrInput
	// A textual description for the workflow.
	Description pulumi.StringPtrInput
	// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
	OnExceptionSteps WorkflowOnExceptionStepArrayInput
	// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
	Steps WorkflowStepArrayInput
	// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (WorkflowState) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowState)(nil)).Elem()
}

type workflowArgs struct {
	// A textual description for the workflow.
	Description *string `pulumi:"description"`
	// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
	OnExceptionSteps []WorkflowOnExceptionStep `pulumi:"onExceptionSteps"`
	// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
	Steps []WorkflowStep `pulumi:"steps"`
	// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Workflow resource.
type WorkflowArgs struct {
	// A textual description for the workflow.
	Description pulumi.StringPtrInput
	// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
	OnExceptionSteps WorkflowOnExceptionStepArrayInput
	// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
	Steps WorkflowStepArrayInput
	// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
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
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (i *Workflow) ToWorkflowOutput() WorkflowOutput {
	return i.ToWorkflowOutputWithContext(context.Background())
}

func (i *Workflow) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowOutput)
}

// WorkflowArrayInput is an input type that accepts WorkflowArray and WorkflowArrayOutput values.
// You can construct a concrete instance of `WorkflowArrayInput` via:
//
//	WorkflowArray{ WorkflowArgs{...} }
type WorkflowArrayInput interface {
	pulumi.Input

	ToWorkflowArrayOutput() WorkflowArrayOutput
	ToWorkflowArrayOutputWithContext(context.Context) WorkflowArrayOutput
}

type WorkflowArray []WorkflowInput

func (WorkflowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
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
//	WorkflowMap{ "key": WorkflowArgs{...} }
type WorkflowMapInput interface {
	pulumi.Input

	ToWorkflowMapOutput() WorkflowMapOutput
	ToWorkflowMapOutputWithContext(context.Context) WorkflowMapOutput
}

type WorkflowMap map[string]WorkflowInput

func (WorkflowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (i WorkflowMap) ToWorkflowMapOutput() WorkflowMapOutput {
	return i.ToWorkflowMapOutputWithContext(context.Background())
}

func (i WorkflowMap) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowMapOutput)
}

type WorkflowOutput struct{ *pulumi.OutputState }

func (WorkflowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (o WorkflowOutput) ToWorkflowOutput() WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return o
}

// The Workflow ARN.
func (o WorkflowOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A textual description for the workflow.
func (o WorkflowOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
func (o WorkflowOutput) OnExceptionSteps() WorkflowOnExceptionStepArrayOutput {
	return o.ApplyT(func(v *Workflow) WorkflowOnExceptionStepArrayOutput { return v.OnExceptionSteps }).(WorkflowOnExceptionStepArrayOutput)
}

// Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
func (o WorkflowOutput) Steps() WorkflowStepArrayOutput {
	return o.ApplyT(func(v *Workflow) WorkflowStepArrayOutput { return v.Steps }).(WorkflowStepArrayOutput)
}

// Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
func (o WorkflowOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o WorkflowOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type WorkflowArrayOutput struct{ *pulumi.OutputState }

func (WorkflowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) Index(i pulumi.IntInput) WorkflowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].([]*Workflow)[vs[1].(int)]
	}).(WorkflowOutput)
}

type WorkflowMapOutput struct{ *pulumi.OutputState }

func (WorkflowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (o WorkflowMapOutput) ToWorkflowMapOutput() WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) MapIndex(k pulumi.StringInput) WorkflowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].(map[string]*Workflow)[vs[1].(string)]
	}).(WorkflowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowInput)(nil)).Elem(), &Workflow{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowArrayInput)(nil)).Elem(), WorkflowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowMapInput)(nil)).Elem(), WorkflowMap{})
	pulumi.RegisterOutputType(WorkflowOutput{})
	pulumi.RegisterOutputType(WorkflowArrayOutput{})
	pulumi.RegisterOutputType(WorkflowMapOutput{})
}
