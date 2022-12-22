// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codecommit

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific CodeCommit Approval Rule Template.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/codecommit"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codecommit.LookupApprovalRuleTemplate(ctx, &codecommit.LookupApprovalRuleTemplateArgs{
//				Name: "MyExampleApprovalRuleTemplate",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupApprovalRuleTemplate(ctx *pulumi.Context, args *LookupApprovalRuleTemplateArgs, opts ...pulumi.InvokeOption) (*LookupApprovalRuleTemplateResult, error) {
	var rv LookupApprovalRuleTemplateResult
	err := ctx.Invoke("aws:codecommit/getApprovalRuleTemplate:getApprovalRuleTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApprovalRuleTemplate.
type LookupApprovalRuleTemplateArgs struct {
	// Name for the approval rule template. This needs to be less than 100 characters.
	Name string `pulumi:"name"`
}

// A collection of values returned by getApprovalRuleTemplate.
type LookupApprovalRuleTemplateResult struct {
	// The ID of the approval rule template.
	ApprovalRuleTemplateId string `pulumi:"approvalRuleTemplateId"`
	// Content of the approval rule template.
	Content string `pulumi:"content"`
	// Date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
	CreationDate string `pulumi:"creationDate"`
	// Description of the approval rule template.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
	LastModifiedDate string `pulumi:"lastModifiedDate"`
	// ARN of the user who made the most recent changes to the approval rule template.
	LastModifiedUser string `pulumi:"lastModifiedUser"`
	Name             string `pulumi:"name"`
	// SHA-256 hash signature for the content of the approval rule template.
	RuleContentSha256 string `pulumi:"ruleContentSha256"`
}

func LookupApprovalRuleTemplateOutput(ctx *pulumi.Context, args LookupApprovalRuleTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupApprovalRuleTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApprovalRuleTemplateResult, error) {
			args := v.(LookupApprovalRuleTemplateArgs)
			r, err := LookupApprovalRuleTemplate(ctx, &args, opts...)
			var s LookupApprovalRuleTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApprovalRuleTemplateResultOutput)
}

// A collection of arguments for invoking getApprovalRuleTemplate.
type LookupApprovalRuleTemplateOutputArgs struct {
	// Name for the approval rule template. This needs to be less than 100 characters.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupApprovalRuleTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApprovalRuleTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getApprovalRuleTemplate.
type LookupApprovalRuleTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupApprovalRuleTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApprovalRuleTemplateResult)(nil)).Elem()
}

func (o LookupApprovalRuleTemplateResultOutput) ToLookupApprovalRuleTemplateResultOutput() LookupApprovalRuleTemplateResultOutput {
	return o
}

func (o LookupApprovalRuleTemplateResultOutput) ToLookupApprovalRuleTemplateResultOutputWithContext(ctx context.Context) LookupApprovalRuleTemplateResultOutput {
	return o
}

// The ID of the approval rule template.
func (o LookupApprovalRuleTemplateResultOutput) ApprovalRuleTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.ApprovalRuleTemplateId }).(pulumi.StringOutput)
}

// Content of the approval rule template.
func (o LookupApprovalRuleTemplateResultOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.Content }).(pulumi.StringOutput)
}

// Date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
func (o LookupApprovalRuleTemplateResultOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.CreationDate }).(pulumi.StringOutput)
}

// Description of the approval rule template.
func (o LookupApprovalRuleTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApprovalRuleTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// Date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
func (o LookupApprovalRuleTemplateResultOutput) LastModifiedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.LastModifiedDate }).(pulumi.StringOutput)
}

// ARN of the user who made the most recent changes to the approval rule template.
func (o LookupApprovalRuleTemplateResultOutput) LastModifiedUser() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.LastModifiedUser }).(pulumi.StringOutput)
}

func (o LookupApprovalRuleTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

// SHA-256 hash signature for the content of the approval rule template.
func (o LookupApprovalRuleTemplateResultOutput) RuleContentSha256() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApprovalRuleTemplateResult) string { return v.RuleContentSha256 }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApprovalRuleTemplateResultOutput{})
}
