// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codebuild

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CodeBuild Report Groups Resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codebuild"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			example, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid:    pulumi.StringRef("Enable IAM User Permissions"),
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "AWS",
//								Identifiers: []string{
//									fmt.Sprintf("arn:aws:iam::%v:root", current.AccountId),
//								},
//							},
//						},
//						Actions: []string{
//							"kms:*",
//						},
//						Resources: []string{
//							"*",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleKey, err := kms.NewKey(ctx, "example", &kms.KeyArgs{
//				Description:          pulumi.String("my test kms key"),
//				DeletionWindowInDays: pulumi.Int(7),
//				Policy:               *pulumi.String(example.Json),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBucketV2, err := s3.NewBucketV2(ctx, "example", &s3.BucketV2Args{
//				Bucket: pulumi.String("my-test"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = codebuild.NewReportGroup(ctx, "example", &codebuild.ReportGroupArgs{
//				Name: pulumi.String("my test report group"),
//				Type: pulumi.String("TEST"),
//				ExportConfig: &codebuild.ReportGroupExportConfigArgs{
//					Type: pulumi.String("S3"),
//					S3Destination: &codebuild.ReportGroupExportConfigS3DestinationArgs{
//						Bucket:             exampleBucketV2.ID(),
//						EncryptionDisabled: pulumi.Bool(false),
//						EncryptionKey:      exampleKey.Arn,
//						Packaging:          pulumi.String("NONE"),
//						Path:               pulumi.String("/some"),
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
// Using `pulumi import`, import CodeBuild Report Group using the CodeBuild Report Group arn. For example:
//
// ```sh
//
//	$ pulumi import aws:codebuild/reportGroup:ReportGroup example arn:aws:codebuild:us-west-2:123456789:report-group/report-group-name
//
// ```
type ReportGroup struct {
	pulumi.CustomResourceState

	// The ARN of Report Group.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The date and time this Report Group was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
	DeleteReports pulumi.BoolPtrOutput `pulumi:"deleteReports"`
	// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
	ExportConfig ReportGroupExportConfigOutput `pulumi:"exportConfig"`
	// The name of a Report Group.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewReportGroup registers a new resource with the given unique name, arguments, and options.
func NewReportGroup(ctx *pulumi.Context,
	name string, args *ReportGroupArgs, opts ...pulumi.ResourceOption) (*ReportGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExportConfig == nil {
		return nil, errors.New("invalid value for required argument 'ExportConfig'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReportGroup
	err := ctx.RegisterResource("aws:codebuild/reportGroup:ReportGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReportGroup gets an existing ReportGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReportGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReportGroupState, opts ...pulumi.ResourceOption) (*ReportGroup, error) {
	var resource ReportGroup
	err := ctx.ReadResource("aws:codebuild/reportGroup:ReportGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReportGroup resources.
type reportGroupState struct {
	// The ARN of Report Group.
	Arn *string `pulumi:"arn"`
	// The date and time this Report Group was created.
	Created *string `pulumi:"created"`
	// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
	DeleteReports *bool `pulumi:"deleteReports"`
	// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
	ExportConfig *ReportGroupExportConfig `pulumi:"exportConfig"`
	// The name of a Report Group.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
	Type *string `pulumi:"type"`
}

type ReportGroupState struct {
	// The ARN of Report Group.
	Arn pulumi.StringPtrInput
	// The date and time this Report Group was created.
	Created pulumi.StringPtrInput
	// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
	DeleteReports pulumi.BoolPtrInput
	// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
	ExportConfig ReportGroupExportConfigPtrInput
	// The name of a Report Group.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
	Type pulumi.StringPtrInput
}

func (ReportGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*reportGroupState)(nil)).Elem()
}

type reportGroupArgs struct {
	// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
	DeleteReports *bool `pulumi:"deleteReports"`
	// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
	ExportConfig ReportGroupExportConfig `pulumi:"exportConfig"`
	// The name of a Report Group.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ReportGroup resource.
type ReportGroupArgs struct {
	// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
	DeleteReports pulumi.BoolPtrInput
	// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
	ExportConfig ReportGroupExportConfigInput
	// The name of a Report Group.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
	Type pulumi.StringInput
}

func (ReportGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*reportGroupArgs)(nil)).Elem()
}

type ReportGroupInput interface {
	pulumi.Input

	ToReportGroupOutput() ReportGroupOutput
	ToReportGroupOutputWithContext(ctx context.Context) ReportGroupOutput
}

func (*ReportGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ReportGroup)(nil)).Elem()
}

func (i *ReportGroup) ToReportGroupOutput() ReportGroupOutput {
	return i.ToReportGroupOutputWithContext(context.Background())
}

func (i *ReportGroup) ToReportGroupOutputWithContext(ctx context.Context) ReportGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportGroupOutput)
}

// ReportGroupArrayInput is an input type that accepts ReportGroupArray and ReportGroupArrayOutput values.
// You can construct a concrete instance of `ReportGroupArrayInput` via:
//
//	ReportGroupArray{ ReportGroupArgs{...} }
type ReportGroupArrayInput interface {
	pulumi.Input

	ToReportGroupArrayOutput() ReportGroupArrayOutput
	ToReportGroupArrayOutputWithContext(context.Context) ReportGroupArrayOutput
}

type ReportGroupArray []ReportGroupInput

func (ReportGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReportGroup)(nil)).Elem()
}

func (i ReportGroupArray) ToReportGroupArrayOutput() ReportGroupArrayOutput {
	return i.ToReportGroupArrayOutputWithContext(context.Background())
}

func (i ReportGroupArray) ToReportGroupArrayOutputWithContext(ctx context.Context) ReportGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportGroupArrayOutput)
}

// ReportGroupMapInput is an input type that accepts ReportGroupMap and ReportGroupMapOutput values.
// You can construct a concrete instance of `ReportGroupMapInput` via:
//
//	ReportGroupMap{ "key": ReportGroupArgs{...} }
type ReportGroupMapInput interface {
	pulumi.Input

	ToReportGroupMapOutput() ReportGroupMapOutput
	ToReportGroupMapOutputWithContext(context.Context) ReportGroupMapOutput
}

type ReportGroupMap map[string]ReportGroupInput

func (ReportGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReportGroup)(nil)).Elem()
}

func (i ReportGroupMap) ToReportGroupMapOutput() ReportGroupMapOutput {
	return i.ToReportGroupMapOutputWithContext(context.Background())
}

func (i ReportGroupMap) ToReportGroupMapOutputWithContext(ctx context.Context) ReportGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReportGroupMapOutput)
}

type ReportGroupOutput struct{ *pulumi.OutputState }

func (ReportGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReportGroup)(nil)).Elem()
}

func (o ReportGroupOutput) ToReportGroupOutput() ReportGroupOutput {
	return o
}

func (o ReportGroupOutput) ToReportGroupOutputWithContext(ctx context.Context) ReportGroupOutput {
	return o
}

// The ARN of Report Group.
func (o ReportGroupOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The date and time this Report Group was created.
func (o ReportGroupOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
func (o ReportGroupOutput) DeleteReports() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.BoolPtrOutput { return v.DeleteReports }).(pulumi.BoolPtrOutput)
}

// Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
func (o ReportGroupOutput) ExportConfig() ReportGroupExportConfigOutput {
	return o.ApplyT(func(v *ReportGroup) ReportGroupExportConfigOutput { return v.ExportConfig }).(ReportGroupExportConfigOutput)
}

// The name of a Report Group.
func (o ReportGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ReportGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ReportGroupOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The type of the Report Group. Valid value are `TEST` and `CODE_COVERAGE`.
func (o ReportGroupOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ReportGroup) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ReportGroupArrayOutput struct{ *pulumi.OutputState }

func (ReportGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReportGroup)(nil)).Elem()
}

func (o ReportGroupArrayOutput) ToReportGroupArrayOutput() ReportGroupArrayOutput {
	return o
}

func (o ReportGroupArrayOutput) ToReportGroupArrayOutputWithContext(ctx context.Context) ReportGroupArrayOutput {
	return o
}

func (o ReportGroupArrayOutput) Index(i pulumi.IntInput) ReportGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReportGroup {
		return vs[0].([]*ReportGroup)[vs[1].(int)]
	}).(ReportGroupOutput)
}

type ReportGroupMapOutput struct{ *pulumi.OutputState }

func (ReportGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReportGroup)(nil)).Elem()
}

func (o ReportGroupMapOutput) ToReportGroupMapOutput() ReportGroupMapOutput {
	return o
}

func (o ReportGroupMapOutput) ToReportGroupMapOutputWithContext(ctx context.Context) ReportGroupMapOutput {
	return o
}

func (o ReportGroupMapOutput) MapIndex(k pulumi.StringInput) ReportGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReportGroup {
		return vs[0].(map[string]*ReportGroup)[vs[1].(string)]
	}).(ReportGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReportGroupInput)(nil)).Elem(), &ReportGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReportGroupArrayInput)(nil)).Elem(), ReportGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReportGroupMapInput)(nil)).Elem(), ReportGroupMap{})
	pulumi.RegisterOutputType(ReportGroupOutput{})
	pulumi.RegisterOutputType(ReportGroupArrayOutput{})
	pulumi.RegisterOutputType(ReportGroupMapOutput{})
}
