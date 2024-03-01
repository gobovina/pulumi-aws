// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auditmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Audit Manager Assessment Report.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/auditmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auditmanager.NewAssessmentReport(ctx, "test", &auditmanager.AssessmentReportArgs{
//				Name:         pulumi.String("example"),
//				AssessmentId: pulumi.Any(testAwsAuditmanagerAssessment.Id),
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
// Using `pulumi import`, import Audit Manager Assessment Reports using the assessment report `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:auditmanager/assessmentReport:AssessmentReport example abc123-de45
//
// ```
type AssessmentReport struct {
	pulumi.CustomResourceState

	// Unique identifier of the assessment to create the report from.
	//
	// The following arguments are optional:
	AssessmentId pulumi.StringOutput `pulumi:"assessmentId"`
	// Name of the user who created the assessment report.
	Author pulumi.StringOutput `pulumi:"author"`
	// Description of the assessment report.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the assessment report.
	Name pulumi.StringOutput `pulumi:"name"`
	// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewAssessmentReport registers a new resource with the given unique name, arguments, and options.
func NewAssessmentReport(ctx *pulumi.Context,
	name string, args *AssessmentReportArgs, opts ...pulumi.ResourceOption) (*AssessmentReport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AssessmentId == nil {
		return nil, errors.New("invalid value for required argument 'AssessmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AssessmentReport
	err := ctx.RegisterResource("aws:auditmanager/assessmentReport:AssessmentReport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssessmentReport gets an existing AssessmentReport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssessmentReport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssessmentReportState, opts ...pulumi.ResourceOption) (*AssessmentReport, error) {
	var resource AssessmentReport
	err := ctx.ReadResource("aws:auditmanager/assessmentReport:AssessmentReport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AssessmentReport resources.
type assessmentReportState struct {
	// Unique identifier of the assessment to create the report from.
	//
	// The following arguments are optional:
	AssessmentId *string `pulumi:"assessmentId"`
	// Name of the user who created the assessment report.
	Author *string `pulumi:"author"`
	// Description of the assessment report.
	Description *string `pulumi:"description"`
	// Name of the assessment report.
	Name *string `pulumi:"name"`
	// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
	Status *string `pulumi:"status"`
}

type AssessmentReportState struct {
	// Unique identifier of the assessment to create the report from.
	//
	// The following arguments are optional:
	AssessmentId pulumi.StringPtrInput
	// Name of the user who created the assessment report.
	Author pulumi.StringPtrInput
	// Description of the assessment report.
	Description pulumi.StringPtrInput
	// Name of the assessment report.
	Name pulumi.StringPtrInput
	// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
	Status pulumi.StringPtrInput
}

func (AssessmentReportState) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentReportState)(nil)).Elem()
}

type assessmentReportArgs struct {
	// Unique identifier of the assessment to create the report from.
	//
	// The following arguments are optional:
	AssessmentId string `pulumi:"assessmentId"`
	// Description of the assessment report.
	Description *string `pulumi:"description"`
	// Name of the assessment report.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AssessmentReport resource.
type AssessmentReportArgs struct {
	// Unique identifier of the assessment to create the report from.
	//
	// The following arguments are optional:
	AssessmentId pulumi.StringInput
	// Description of the assessment report.
	Description pulumi.StringPtrInput
	// Name of the assessment report.
	Name pulumi.StringPtrInput
}

func (AssessmentReportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assessmentReportArgs)(nil)).Elem()
}

type AssessmentReportInput interface {
	pulumi.Input

	ToAssessmentReportOutput() AssessmentReportOutput
	ToAssessmentReportOutputWithContext(ctx context.Context) AssessmentReportOutput
}

func (*AssessmentReport) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentReport)(nil)).Elem()
}

func (i *AssessmentReport) ToAssessmentReportOutput() AssessmentReportOutput {
	return i.ToAssessmentReportOutputWithContext(context.Background())
}

func (i *AssessmentReport) ToAssessmentReportOutputWithContext(ctx context.Context) AssessmentReportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentReportOutput)
}

// AssessmentReportArrayInput is an input type that accepts AssessmentReportArray and AssessmentReportArrayOutput values.
// You can construct a concrete instance of `AssessmentReportArrayInput` via:
//
//	AssessmentReportArray{ AssessmentReportArgs{...} }
type AssessmentReportArrayInput interface {
	pulumi.Input

	ToAssessmentReportArrayOutput() AssessmentReportArrayOutput
	ToAssessmentReportArrayOutputWithContext(context.Context) AssessmentReportArrayOutput
}

type AssessmentReportArray []AssessmentReportInput

func (AssessmentReportArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssessmentReport)(nil)).Elem()
}

func (i AssessmentReportArray) ToAssessmentReportArrayOutput() AssessmentReportArrayOutput {
	return i.ToAssessmentReportArrayOutputWithContext(context.Background())
}

func (i AssessmentReportArray) ToAssessmentReportArrayOutputWithContext(ctx context.Context) AssessmentReportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentReportArrayOutput)
}

// AssessmentReportMapInput is an input type that accepts AssessmentReportMap and AssessmentReportMapOutput values.
// You can construct a concrete instance of `AssessmentReportMapInput` via:
//
//	AssessmentReportMap{ "key": AssessmentReportArgs{...} }
type AssessmentReportMapInput interface {
	pulumi.Input

	ToAssessmentReportMapOutput() AssessmentReportMapOutput
	ToAssessmentReportMapOutputWithContext(context.Context) AssessmentReportMapOutput
}

type AssessmentReportMap map[string]AssessmentReportInput

func (AssessmentReportMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssessmentReport)(nil)).Elem()
}

func (i AssessmentReportMap) ToAssessmentReportMapOutput() AssessmentReportMapOutput {
	return i.ToAssessmentReportMapOutputWithContext(context.Background())
}

func (i AssessmentReportMap) ToAssessmentReportMapOutputWithContext(ctx context.Context) AssessmentReportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssessmentReportMapOutput)
}

type AssessmentReportOutput struct{ *pulumi.OutputState }

func (AssessmentReportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AssessmentReport)(nil)).Elem()
}

func (o AssessmentReportOutput) ToAssessmentReportOutput() AssessmentReportOutput {
	return o
}

func (o AssessmentReportOutput) ToAssessmentReportOutputWithContext(ctx context.Context) AssessmentReportOutput {
	return o
}

// Unique identifier of the assessment to create the report from.
//
// The following arguments are optional:
func (o AssessmentReportOutput) AssessmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentReport) pulumi.StringOutput { return v.AssessmentId }).(pulumi.StringOutput)
}

// Name of the user who created the assessment report.
func (o AssessmentReportOutput) Author() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentReport) pulumi.StringOutput { return v.Author }).(pulumi.StringOutput)
}

// Description of the assessment report.
func (o AssessmentReportOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AssessmentReport) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the assessment report.
func (o AssessmentReportOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentReport) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
func (o AssessmentReportOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AssessmentReport) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type AssessmentReportArrayOutput struct{ *pulumi.OutputState }

func (AssessmentReportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AssessmentReport)(nil)).Elem()
}

func (o AssessmentReportArrayOutput) ToAssessmentReportArrayOutput() AssessmentReportArrayOutput {
	return o
}

func (o AssessmentReportArrayOutput) ToAssessmentReportArrayOutputWithContext(ctx context.Context) AssessmentReportArrayOutput {
	return o
}

func (o AssessmentReportArrayOutput) Index(i pulumi.IntInput) AssessmentReportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AssessmentReport {
		return vs[0].([]*AssessmentReport)[vs[1].(int)]
	}).(AssessmentReportOutput)
}

type AssessmentReportMapOutput struct{ *pulumi.OutputState }

func (AssessmentReportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AssessmentReport)(nil)).Elem()
}

func (o AssessmentReportMapOutput) ToAssessmentReportMapOutput() AssessmentReportMapOutput {
	return o
}

func (o AssessmentReportMapOutput) ToAssessmentReportMapOutputWithContext(ctx context.Context) AssessmentReportMapOutput {
	return o
}

func (o AssessmentReportMapOutput) MapIndex(k pulumi.StringInput) AssessmentReportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AssessmentReport {
		return vs[0].(map[string]*AssessmentReport)[vs[1].(string)]
	}).(AssessmentReportOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentReportInput)(nil)).Elem(), &AssessmentReport{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentReportArrayInput)(nil)).Elem(), AssessmentReportArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssessmentReportMapInput)(nil)).Elem(), AssessmentReportMap{})
	pulumi.RegisterOutputType(AssessmentReportOutput{})
	pulumi.RegisterOutputType(AssessmentReportArrayOutput{})
	pulumi.RegisterOutputType(AssessmentReportMapOutput{})
}
