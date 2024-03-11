// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package inspector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Amazon Inspector Classic Rules Packages data source allows access to the list of AWS
// Inspector Rules Packages which can be used by Amazon Inspector Classic within the region
// configured in the provider.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/inspector"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Declare the data source
//			rules, err := inspector.GetRulesPackages(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			// e.g., Use in aws_inspector_assessment_template
//			group, err := inspector.NewResourceGroup(ctx, "group", &inspector.ResourceGroupArgs{
//				Tags: pulumi.StringMap{
//					"test": pulumi.String("test"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			assessment, err := inspector.NewAssessmentTarget(ctx, "assessment", &inspector.AssessmentTargetArgs{
//				Name:             pulumi.String("test"),
//				ResourceGroupArn: group.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = inspector.NewAssessmentTemplate(ctx, "assessment", &inspector.AssessmentTemplateArgs{
//				Name:             pulumi.String("Test"),
//				TargetArn:        assessment.Arn,
//				Duration:         pulumi.Int(60),
//				RulesPackageArns: interface{}(rules.Arns),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetRulesPackages(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRulesPackagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRulesPackagesResult
	err := ctx.Invoke("aws:inspector/getRulesPackages:getRulesPackages", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRulesPackages.
type GetRulesPackagesResult struct {
	// List of the Amazon Inspector Classic Rules Packages arns available in the AWS region.
	Arns []string `pulumi:"arns"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetRulesPackagesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetRulesPackagesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetRulesPackagesResult, error) {
		r, err := GetRulesPackages(ctx, opts...)
		var s GetRulesPackagesResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetRulesPackagesResultOutput)
}

// A collection of values returned by getRulesPackages.
type GetRulesPackagesResultOutput struct{ *pulumi.OutputState }

func (GetRulesPackagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRulesPackagesResult)(nil)).Elem()
}

func (o GetRulesPackagesResultOutput) ToGetRulesPackagesResultOutput() GetRulesPackagesResultOutput {
	return o
}

func (o GetRulesPackagesResultOutput) ToGetRulesPackagesResultOutputWithContext(ctx context.Context) GetRulesPackagesResultOutput {
	return o
}

// List of the Amazon Inspector Classic Rules Packages arns available in the AWS region.
func (o GetRulesPackagesResultOutput) Arns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRulesPackagesResult) []string { return v.Arns }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRulesPackagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRulesPackagesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRulesPackagesResultOutput{})
}
