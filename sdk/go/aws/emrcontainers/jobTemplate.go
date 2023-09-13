// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package emrcontainers

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages an EMR Containers (EMR on EKS) Job Template.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/emrcontainers"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := emrcontainers.NewJobTemplate(ctx, "example", &emrcontainers.JobTemplateArgs{
//				JobTemplateData: &emrcontainers.JobTemplateJobTemplateDataArgs{
//					ExecutionRoleArn: pulumi.Any(aws_iam_role.Example.Arn),
//					ReleaseLabel:     pulumi.String("emr-6.10.0-latest"),
//					JobDriver: &emrcontainers.JobTemplateJobTemplateDataJobDriverArgs{
//						SparkSqlJobDriver: &emrcontainers.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs{
//							EntryPoint: pulumi.String("default"),
//						},
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
// In TODO v1.5.0 and later, use an `import` block to import EKS job templates using the `id`. For exampleterraform import {
//
//	to = aws_emrcontainers_job_template.example
//
//	id = "a1b2c3d4e5f6g7h8i9j10k11l" } Using `TODO import`, import EKS job templates using the `id`. For exampleconsole % TODO import aws_emrcontainers_job_template.example a1b2c3d4e5f6g7h8i9j10k11l
type JobTemplate struct {
	pulumi.CustomResourceState

	// ARN of the job template.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The job template data which holds values of StartJobRun API request.
	JobTemplateData JobTemplateJobTemplateDataOutput `pulumi:"jobTemplateData"`
	// The KMS key ARN used to encrypt the job template.
	KmsKeyArn pulumi.StringPtrOutput `pulumi:"kmsKeyArn"`
	// The specified name of the job template.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewJobTemplate registers a new resource with the given unique name, arguments, and options.
func NewJobTemplate(ctx *pulumi.Context,
	name string, args *JobTemplateArgs, opts ...pulumi.ResourceOption) (*JobTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.JobTemplateData == nil {
		return nil, errors.New("invalid value for required argument 'JobTemplateData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource JobTemplate
	err := ctx.RegisterResource("aws:emrcontainers/jobTemplate:JobTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJobTemplate gets an existing JobTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJobTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobTemplateState, opts ...pulumi.ResourceOption) (*JobTemplate, error) {
	var resource JobTemplate
	err := ctx.ReadResource("aws:emrcontainers/jobTemplate:JobTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JobTemplate resources.
type jobTemplateState struct {
	// ARN of the job template.
	Arn *string `pulumi:"arn"`
	// The job template data which holds values of StartJobRun API request.
	JobTemplateData *JobTemplateJobTemplateData `pulumi:"jobTemplateData"`
	// The KMS key ARN used to encrypt the job template.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// The specified name of the job template.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type JobTemplateState struct {
	// ARN of the job template.
	Arn pulumi.StringPtrInput
	// The job template data which holds values of StartJobRun API request.
	JobTemplateData JobTemplateJobTemplateDataPtrInput
	// The KMS key ARN used to encrypt the job template.
	KmsKeyArn pulumi.StringPtrInput
	// The specified name of the job template.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (JobTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobTemplateState)(nil)).Elem()
}

type jobTemplateArgs struct {
	// The job template data which holds values of StartJobRun API request.
	JobTemplateData JobTemplateJobTemplateData `pulumi:"jobTemplateData"`
	// The KMS key ARN used to encrypt the job template.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// The specified name of the job template.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a JobTemplate resource.
type JobTemplateArgs struct {
	// The job template data which holds values of StartJobRun API request.
	JobTemplateData JobTemplateJobTemplateDataInput
	// The KMS key ARN used to encrypt the job template.
	KmsKeyArn pulumi.StringPtrInput
	// The specified name of the job template.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (JobTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobTemplateArgs)(nil)).Elem()
}

type JobTemplateInput interface {
	pulumi.Input

	ToJobTemplateOutput() JobTemplateOutput
	ToJobTemplateOutputWithContext(ctx context.Context) JobTemplateOutput
}

func (*JobTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**JobTemplate)(nil)).Elem()
}

func (i *JobTemplate) ToJobTemplateOutput() JobTemplateOutput {
	return i.ToJobTemplateOutputWithContext(context.Background())
}

func (i *JobTemplate) ToJobTemplateOutputWithContext(ctx context.Context) JobTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobTemplateOutput)
}

func (i *JobTemplate) ToOutput(ctx context.Context) pulumix.Output[*JobTemplate] {
	return pulumix.Output[*JobTemplate]{
		OutputState: i.ToJobTemplateOutputWithContext(ctx).OutputState,
	}
}

// JobTemplateArrayInput is an input type that accepts JobTemplateArray and JobTemplateArrayOutput values.
// You can construct a concrete instance of `JobTemplateArrayInput` via:
//
//	JobTemplateArray{ JobTemplateArgs{...} }
type JobTemplateArrayInput interface {
	pulumi.Input

	ToJobTemplateArrayOutput() JobTemplateArrayOutput
	ToJobTemplateArrayOutputWithContext(context.Context) JobTemplateArrayOutput
}

type JobTemplateArray []JobTemplateInput

func (JobTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobTemplate)(nil)).Elem()
}

func (i JobTemplateArray) ToJobTemplateArrayOutput() JobTemplateArrayOutput {
	return i.ToJobTemplateArrayOutputWithContext(context.Background())
}

func (i JobTemplateArray) ToJobTemplateArrayOutputWithContext(ctx context.Context) JobTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobTemplateArrayOutput)
}

func (i JobTemplateArray) ToOutput(ctx context.Context) pulumix.Output[[]*JobTemplate] {
	return pulumix.Output[[]*JobTemplate]{
		OutputState: i.ToJobTemplateArrayOutputWithContext(ctx).OutputState,
	}
}

// JobTemplateMapInput is an input type that accepts JobTemplateMap and JobTemplateMapOutput values.
// You can construct a concrete instance of `JobTemplateMapInput` via:
//
//	JobTemplateMap{ "key": JobTemplateArgs{...} }
type JobTemplateMapInput interface {
	pulumi.Input

	ToJobTemplateMapOutput() JobTemplateMapOutput
	ToJobTemplateMapOutputWithContext(context.Context) JobTemplateMapOutput
}

type JobTemplateMap map[string]JobTemplateInput

func (JobTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobTemplate)(nil)).Elem()
}

func (i JobTemplateMap) ToJobTemplateMapOutput() JobTemplateMapOutput {
	return i.ToJobTemplateMapOutputWithContext(context.Background())
}

func (i JobTemplateMap) ToJobTemplateMapOutputWithContext(ctx context.Context) JobTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobTemplateMapOutput)
}

func (i JobTemplateMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*JobTemplate] {
	return pulumix.Output[map[string]*JobTemplate]{
		OutputState: i.ToJobTemplateMapOutputWithContext(ctx).OutputState,
	}
}

type JobTemplateOutput struct{ *pulumi.OutputState }

func (JobTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JobTemplate)(nil)).Elem()
}

func (o JobTemplateOutput) ToJobTemplateOutput() JobTemplateOutput {
	return o
}

func (o JobTemplateOutput) ToJobTemplateOutputWithContext(ctx context.Context) JobTemplateOutput {
	return o
}

func (o JobTemplateOutput) ToOutput(ctx context.Context) pulumix.Output[*JobTemplate] {
	return pulumix.Output[*JobTemplate]{
		OutputState: o.OutputState,
	}
}

// ARN of the job template.
func (o JobTemplateOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *JobTemplate) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The job template data which holds values of StartJobRun API request.
func (o JobTemplateOutput) JobTemplateData() JobTemplateJobTemplateDataOutput {
	return o.ApplyT(func(v *JobTemplate) JobTemplateJobTemplateDataOutput { return v.JobTemplateData }).(JobTemplateJobTemplateDataOutput)
}

// The KMS key ARN used to encrypt the job template.
func (o JobTemplateOutput) KmsKeyArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JobTemplate) pulumi.StringPtrOutput { return v.KmsKeyArn }).(pulumi.StringPtrOutput)
}

// The specified name of the job template.
func (o JobTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JobTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o JobTemplateOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *JobTemplate) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o JobTemplateOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *JobTemplate) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type JobTemplateArrayOutput struct{ *pulumi.OutputState }

func (JobTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobTemplate)(nil)).Elem()
}

func (o JobTemplateArrayOutput) ToJobTemplateArrayOutput() JobTemplateArrayOutput {
	return o
}

func (o JobTemplateArrayOutput) ToJobTemplateArrayOutputWithContext(ctx context.Context) JobTemplateArrayOutput {
	return o
}

func (o JobTemplateArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*JobTemplate] {
	return pulumix.Output[[]*JobTemplate]{
		OutputState: o.OutputState,
	}
}

func (o JobTemplateArrayOutput) Index(i pulumi.IntInput) JobTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JobTemplate {
		return vs[0].([]*JobTemplate)[vs[1].(int)]
	}).(JobTemplateOutput)
}

type JobTemplateMapOutput struct{ *pulumi.OutputState }

func (JobTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobTemplate)(nil)).Elem()
}

func (o JobTemplateMapOutput) ToJobTemplateMapOutput() JobTemplateMapOutput {
	return o
}

func (o JobTemplateMapOutput) ToJobTemplateMapOutputWithContext(ctx context.Context) JobTemplateMapOutput {
	return o
}

func (o JobTemplateMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*JobTemplate] {
	return pulumix.Output[map[string]*JobTemplate]{
		OutputState: o.OutputState,
	}
}

func (o JobTemplateMapOutput) MapIndex(k pulumi.StringInput) JobTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JobTemplate {
		return vs[0].(map[string]*JobTemplate)[vs[1].(string)]
	}).(JobTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobTemplateInput)(nil)).Elem(), &JobTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobTemplateArrayInput)(nil)).Elem(), JobTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobTemplateMapInput)(nil)).Elem(), JobTemplateMap{})
	pulumi.RegisterOutputType(JobTemplateOutput{})
	pulumi.RegisterOutputType(JobTemplateArrayOutput{})
	pulumi.RegisterOutputType(JobTemplateMapOutput{})
}
