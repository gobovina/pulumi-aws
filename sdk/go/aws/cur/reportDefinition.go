// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cur

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages Cost and Usage Report Definitions.
//
// > *NOTE:* The AWS Cost and Usage Report service is only available in `us-east-1` currently.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cur"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cur.NewReportDefinition(ctx, "exampleCurReportDefinition", &cur.ReportDefinitionArgs{
//				AdditionalArtifacts: pulumi.StringArray{
//					pulumi.String("REDSHIFT"),
//					pulumi.String("QUICKSIGHT"),
//				},
//				AdditionalSchemaElements: pulumi.StringArray{
//					pulumi.String("RESOURCES"),
//					pulumi.String("SPLIT_COST_ALLOCATION_DATA"),
//				},
//				Compression: pulumi.String("GZIP"),
//				Format:      pulumi.String("textORcsv"),
//				ReportName:  pulumi.String("example-cur-report-definition"),
//				S3Bucket:    pulumi.String("example-bucket-name"),
//				S3Region:    pulumi.String("us-east-1"),
//				TimeUnit:    pulumi.String("HOURLY"),
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
// Using `pulumi import`, import Report Definitions using the `report_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:cur/reportDefinition:ReportDefinition example_cur_report_definition example-cur-report-definition
//
// ```
type ReportDefinition struct {
	pulumi.CustomResourceState

	// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
	AdditionalArtifacts pulumi.StringArrayOutput `pulumi:"additionalArtifacts"`
	// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
	AdditionalSchemaElements pulumi.StringArrayOutput `pulumi:"additionalSchemaElements"`
	// The Amazon Resource Name (ARN) specifying the cur report.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
	Compression pulumi.StringOutput `pulumi:"compression"`
	// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
	Format pulumi.StringOutput `pulumi:"format"`
	// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
	RefreshClosedReports pulumi.BoolPtrOutput `pulumi:"refreshClosedReports"`
	// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
	ReportName pulumi.StringOutput `pulumi:"reportName"`
	// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
	ReportVersioning pulumi.StringPtrOutput `pulumi:"reportVersioning"`
	// Name of the existing S3 bucket to hold generated reports.
	S3Bucket pulumi.StringOutput `pulumi:"s3Bucket"`
	// Report path prefix. Limited to 256 characters.
	S3Prefix pulumi.StringPtrOutput `pulumi:"s3Prefix"`
	// Region of the existing S3 bucket to hold generated reports.
	S3Region pulumi.StringOutput `pulumi:"s3Region"`
	// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
	TimeUnit pulumi.StringOutput `pulumi:"timeUnit"`
}

// NewReportDefinition registers a new resource with the given unique name, arguments, and options.
func NewReportDefinition(ctx *pulumi.Context,
	name string, args *ReportDefinitionArgs, opts ...pulumi.ResourceOption) (*ReportDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AdditionalSchemaElements == nil {
		return nil, errors.New("invalid value for required argument 'AdditionalSchemaElements'")
	}
	if args.Compression == nil {
		return nil, errors.New("invalid value for required argument 'Compression'")
	}
	if args.Format == nil {
		return nil, errors.New("invalid value for required argument 'Format'")
	}
	if args.ReportName == nil {
		return nil, errors.New("invalid value for required argument 'ReportName'")
	}
	if args.S3Bucket == nil {
		return nil, errors.New("invalid value for required argument 'S3Bucket'")
	}
	if args.S3Region == nil {
		return nil, errors.New("invalid value for required argument 'S3Region'")
	}
	if args.TimeUnit == nil {
		return nil, errors.New("invalid value for required argument 'TimeUnit'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReportDefinition
	err := ctx.RegisterResource("aws:cur/reportDefinition:ReportDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReportDefinition gets an existing ReportDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReportDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReportDefinitionState, opts ...pulumi.ResourceOption) (*ReportDefinition, error) {
	var resource ReportDefinition
	err := ctx.ReadResource("aws:cur/reportDefinition:ReportDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReportDefinition resources.
type reportDefinitionState struct {
	// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
	AdditionalArtifacts []string `pulumi:"additionalArtifacts"`
	// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
	AdditionalSchemaElements []string `pulumi:"additionalSchemaElements"`
	// The Amazon Resource Name (ARN) specifying the cur report.
	Arn *string `pulumi:"arn"`
	// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
	Compression *string `pulumi:"compression"`
	// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
	Format *string `pulumi:"format"`
	// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
	RefreshClosedReports *bool `pulumi:"refreshClosedReports"`
	// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
	ReportName *string `pulumi:"reportName"`
	// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
	ReportVersioning *string `pulumi:"reportVersioning"`
	// Name of the existing S3 bucket to hold generated reports.
	S3Bucket *string `pulumi:"s3Bucket"`
	// Report path prefix. Limited to 256 characters.
	S3Prefix *string `pulumi:"s3Prefix"`
	// Region of the existing S3 bucket to hold generated reports.
	S3Region *string `pulumi:"s3Region"`
	// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
	TimeUnit *string `pulumi:"timeUnit"`
}

type ReportDefinitionState struct {
	// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
	AdditionalArtifacts pulumi.StringArrayInput
	// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
	AdditionalSchemaElements pulumi.StringArrayInput
	// The Amazon Resource Name (ARN) specifying the cur report.
	Arn pulumi.StringPtrInput
	// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
	Compression pulumi.StringPtrInput
	// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
	Format pulumi.StringPtrInput
	// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
	RefreshClosedReports pulumi.BoolPtrInput
	// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
	ReportName pulumi.StringPtrInput
	// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
	ReportVersioning pulumi.StringPtrInput
	// Name of the existing S3 bucket to hold generated reports.
	S3Bucket pulumi.StringPtrInput
	// Report path prefix. Limited to 256 characters.
	S3Prefix pulumi.StringPtrInput
	// Region of the existing S3 bucket to hold generated reports.
	S3Region pulumi.StringPtrInput
	// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
	TimeUnit pulumi.StringPtrInput
}

func (ReportDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*reportDefinitionState)(nil)).Elem()
}

type reportDefinitionArgs struct {
	// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
	AdditionalArtifacts []string `pulumi:"additionalArtifacts"`
	// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
	AdditionalSchemaElements []string `pulumi:"additionalSchemaElements"`
	// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
	Compression string `pulumi:"compression"`
	// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
	Format string `pulumi:"format"`
	// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
	RefreshClosedReports *bool `pulumi:"refreshClosedReports"`
	// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
	ReportName string `pulumi:"reportName"`
	// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
	ReportVersioning *string `pulumi:"reportVersioning"`
	// Name of the existing S3 bucket to hold generated reports.
	S3Bucket string `pulumi:"s3Bucket"`
	// Report path prefix. Limited to 256 characters.
	S3Prefix *string `pulumi:"s3Prefix"`
	// Region of the existing S3 bucket to hold generated reports.
	S3Region string `pulumi:"s3Region"`
	// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
	TimeUnit string `pulumi:"timeUnit"`
}

// The set of arguments for constructing a ReportDefinition resource.
type ReportDefinitionArgs struct {
	// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
	AdditionalArtifacts pulumi.StringArrayInput
	// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
	AdditionalSchemaElements pulumi.StringArrayInput
	// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
	Compression pulumi.StringInput
	// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
	Format pulumi.StringInput
	// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
	RefreshClosedReports pulumi.BoolPtrInput
	// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
	ReportName pulumi.StringInput
	// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
	ReportVersioning pulumi.StringPtrInput
	// Name of the existing S3 bucket to hold generated reports.
	S3Bucket pulumi.StringInput
	// Report path prefix. Limited to 256 characters.
	S3Prefix pulumi.StringPtrInput
	// Region of the existing S3 bucket to hold generated reports.
	S3Region pulumi.StringInput
	// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
	TimeUnit pulumi.StringInput
}

func (ReportDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reportDefinitionArgs)(nil)).Elem()
}

type ReportDefinitionInput interface {
	pulumi.Input

	ToReportDefinitionOutput() ReportDefinitionOutput
	ToReportDefinitionOutputWithContext(ctx context.Context) ReportDefinitionOutput
}

func (*ReportDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**ReportDefinition)(nil)).Elem()
}

func (i *ReportDefinition) ToReportDefinitionOutput() ReportDefinitionOutput {
	return i.ToReportDefinitionOutputWithContext(context.Background())
}

func (i *ReportDefinition) ToReportDefinitionOutputWithContext(ctx context.Context) ReportDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportDefinitionOutput)
}

// ReportDefinitionArrayInput is an input type that accepts ReportDefinitionArray and ReportDefinitionArrayOutput values.
// You can construct a concrete instance of `ReportDefinitionArrayInput` via:
//
//	ReportDefinitionArray{ ReportDefinitionArgs{...} }
type ReportDefinitionArrayInput interface {
	pulumi.Input

	ToReportDefinitionArrayOutput() ReportDefinitionArrayOutput
	ToReportDefinitionArrayOutputWithContext(context.Context) ReportDefinitionArrayOutput
}

type ReportDefinitionArray []ReportDefinitionInput

func (ReportDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReportDefinition)(nil)).Elem()
}

func (i ReportDefinitionArray) ToReportDefinitionArrayOutput() ReportDefinitionArrayOutput {
	return i.ToReportDefinitionArrayOutputWithContext(context.Background())
}

func (i ReportDefinitionArray) ToReportDefinitionArrayOutputWithContext(ctx context.Context) ReportDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportDefinitionArrayOutput)
}

// ReportDefinitionMapInput is an input type that accepts ReportDefinitionMap and ReportDefinitionMapOutput values.
// You can construct a concrete instance of `ReportDefinitionMapInput` via:
//
//	ReportDefinitionMap{ "key": ReportDefinitionArgs{...} }
type ReportDefinitionMapInput interface {
	pulumi.Input

	ToReportDefinitionMapOutput() ReportDefinitionMapOutput
	ToReportDefinitionMapOutputWithContext(context.Context) ReportDefinitionMapOutput
}

type ReportDefinitionMap map[string]ReportDefinitionInput

func (ReportDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReportDefinition)(nil)).Elem()
}

func (i ReportDefinitionMap) ToReportDefinitionMapOutput() ReportDefinitionMapOutput {
	return i.ToReportDefinitionMapOutputWithContext(context.Background())
}

func (i ReportDefinitionMap) ToReportDefinitionMapOutputWithContext(ctx context.Context) ReportDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportDefinitionMapOutput)
}

type ReportDefinitionOutput struct{ *pulumi.OutputState }

func (ReportDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReportDefinition)(nil)).Elem()
}

func (o ReportDefinitionOutput) ToReportDefinitionOutput() ReportDefinitionOutput {
	return o
}

func (o ReportDefinitionOutput) ToReportDefinitionOutputWithContext(ctx context.Context) ReportDefinitionOutput {
	return o
}

// A list of additional artifacts. Valid values are: `REDSHIFT`, `QUICKSIGHT`, `ATHENA`. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be `OVERWRITE_REPORT`.
func (o ReportDefinitionOutput) AdditionalArtifacts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringArrayOutput { return v.AdditionalArtifacts }).(pulumi.StringArrayOutput)
}

// A list of schema elements. Valid values are: `RESOURCES`, `SPLIT_COST_ALLOCATION_DATA`.
func (o ReportDefinitionOutput) AdditionalSchemaElements() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringArrayOutput { return v.AdditionalSchemaElements }).(pulumi.StringArrayOutput)
}

// The Amazon Resource Name (ARN) specifying the cur report.
func (o ReportDefinitionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Compression format for report. Valid values are: `GZIP`, `ZIP`, `Parquet`. If `Parquet` is used, then format must also be `Parquet`.
func (o ReportDefinitionOutput) Compression() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.Compression }).(pulumi.StringOutput)
}

// Format for report. Valid values are: `textORcsv`, `Parquet`. If `Parquet` is used, then Compression must also be `Parquet`.
func (o ReportDefinitionOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.Format }).(pulumi.StringOutput)
}

// Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
func (o ReportDefinitionOutput) RefreshClosedReports() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.BoolPtrOutput { return v.RefreshClosedReports }).(pulumi.BoolPtrOutput)
}

// Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
func (o ReportDefinitionOutput) ReportName() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.ReportName }).(pulumi.StringOutput)
}

// Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: `CREATE_NEW_REPORT` and `OVERWRITE_REPORT`.
func (o ReportDefinitionOutput) ReportVersioning() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringPtrOutput { return v.ReportVersioning }).(pulumi.StringPtrOutput)
}

// Name of the existing S3 bucket to hold generated reports.
func (o ReportDefinitionOutput) S3Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.S3Bucket }).(pulumi.StringOutput)
}

// Report path prefix. Limited to 256 characters.
func (o ReportDefinitionOutput) S3Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringPtrOutput { return v.S3Prefix }).(pulumi.StringPtrOutput)
}

// Region of the existing S3 bucket to hold generated reports.
func (o ReportDefinitionOutput) S3Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.S3Region }).(pulumi.StringOutput)
}

// The frequency on which report data are measured and displayed.  Valid values are: `DAILY`, `HOURLY`, `MONTHLY`.
func (o ReportDefinitionOutput) TimeUnit() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportDefinition) pulumi.StringOutput { return v.TimeUnit }).(pulumi.StringOutput)
}

type ReportDefinitionArrayOutput struct{ *pulumi.OutputState }

func (ReportDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReportDefinition)(nil)).Elem()
}

func (o ReportDefinitionArrayOutput) ToReportDefinitionArrayOutput() ReportDefinitionArrayOutput {
	return o
}

func (o ReportDefinitionArrayOutput) ToReportDefinitionArrayOutputWithContext(ctx context.Context) ReportDefinitionArrayOutput {
	return o
}

func (o ReportDefinitionArrayOutput) Index(i pulumi.IntInput) ReportDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReportDefinition {
		return vs[0].([]*ReportDefinition)[vs[1].(int)]
	}).(ReportDefinitionOutput)
}

type ReportDefinitionMapOutput struct{ *pulumi.OutputState }

func (ReportDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReportDefinition)(nil)).Elem()
}

func (o ReportDefinitionMapOutput) ToReportDefinitionMapOutput() ReportDefinitionMapOutput {
	return o
}

func (o ReportDefinitionMapOutput) ToReportDefinitionMapOutputWithContext(ctx context.Context) ReportDefinitionMapOutput {
	return o
}

func (o ReportDefinitionMapOutput) MapIndex(k pulumi.StringInput) ReportDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReportDefinition {
		return vs[0].(map[string]*ReportDefinition)[vs[1].(string)]
	}).(ReportDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReportDefinitionInput)(nil)).Elem(), &ReportDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReportDefinitionArrayInput)(nil)).Elem(), ReportDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReportDefinitionMapInput)(nil)).Elem(), ReportDefinitionMap{})
	pulumi.RegisterOutputType(ReportDefinitionOutput{})
	pulumi.RegisterOutputType(ReportDefinitionArrayOutput{})
	pulumi.RegisterOutputType(ReportDefinitionMapOutput{})
}
