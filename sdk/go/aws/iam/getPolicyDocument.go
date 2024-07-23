// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `iam.Policy`.
//
// Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
//
// ## Example Usage
//
// ### Basic Example
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid: pulumi.StringRef("1"),
//						Actions: []string{
//							"s3:ListAllMyBuckets",
//							"s3:GetBucketLocation",
//						},
//						Resources: []string{
//							"arn:aws:s3:::*",
//						},
//					},
//					{
//						Actions: []string{
//							"s3:ListBucket",
//						},
//						Resources: []string{
//							fmt.Sprintf("arn:aws:s3:::%v", s3BucketName),
//						},
//						Conditions: []iam.GetPolicyDocumentStatementCondition{
//							{
//								Test:     "StringLike",
//								Variable: "s3:prefix",
//								Values: []string{
//									"",
//									"home/",
//									"home/&{aws:username}/",
//								},
//							},
//						},
//					},
//					{
//						Actions: []string{
//							"s3:*",
//						},
//						Resources: []string{
//							fmt.Sprintf("arn:aws:s3:::%v/home/&{aws:username}", s3BucketName),
//							fmt.Sprintf("arn:aws:s3:::%v/home/&{aws:username}/*", s3BucketName),
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewPolicy(ctx, "example", &iam.PolicyArgs{
//				Name:   pulumi.String("example_policy"),
//				Path:   pulumi.String("/"),
//				Policy: pulumi.String(example.Json),
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
// ### Example Multiple Condition Keys and Values
//
// You can specify a [condition with multiple keys and values](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_multi-value-conditions.html) by supplying multiple `condition` blocks with the same `test` value, but differing `variable` and `values` values.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"kms:Decrypt",
//							"kms:GenerateDataKey",
//						},
//						Resources: []string{
//							"*",
//						},
//						Conditions: []iam.GetPolicyDocumentStatementCondition{
//							{
//								Test:     "ForAnyValue:StringEquals",
//								Variable: "kms:EncryptionContext:service",
//								Values: []string{
//									"pi",
//								},
//							},
//							{
//								Test:     "ForAnyValue:StringEquals",
//								Variable: "kms:EncryptionContext:aws:pi:service",
//								Values: []string{
//									"rds",
//								},
//							},
//							{
//								Test:     "ForAnyValue:StringEquals",
//								Variable: "kms:EncryptionContext:aws:rds:db-id",
//								Values: []string{
//									"db-AAAAABBBBBCCCCCDDDDDEEEEE",
//									"db-EEEEEDDDDDCCCCCBBBBBAAAAA",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// `data.aws_iam_policy_document.example_multiple_condition_keys_and_values.json` will evaluate to:
//
// ### Example Assume-Role Policy with Multiple Principals
//
// You can specify multiple principal blocks with different types. You can also use this data source to generate an assume-role policy.
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// _, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "sts:AssumeRole",
// },
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Type: "Service",
// Identifiers: []string{
// "firehose.amazonaws.com",
// },
// },
// {
// Type: "AWS",
// Identifiers: interface{}{
// trustedRoleArn,
// },
// },
// {
// Type: "Federated",
// Identifiers: []string{
// fmt.Sprintf("arn:aws:iam::%v:saml-provider/%v", accountId, providerName),
// "cognito-identity.amazonaws.com",
// },
// },
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ### Example Using A Source Document
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// source, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "ec2:*",
// },
// Resources: []string{
// "*",
// },
// },
// {
// Sid: pulumi.StringRef("SidToOverride"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// SourcePolicyDocuments: interface{}{
// source.Json,
// },
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("SidToOverride"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "arn:aws:s3:::somebucket",
// "arn:aws:s3:::somebucket/*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// `data.aws_iam_policy_document.source_document_example.json` will evaluate to:
//
// ### Example Using An Override Document
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// override, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("SidToOverride"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// OverridePolicyDocuments: interface{}{
// override.Json,
// },
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "ec2:*",
// },
// Resources: []string{
// "*",
// },
// },
// {
// Sid: pulumi.StringRef("SidToOverride"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "arn:aws:s3:::somebucket",
// "arn:aws:s3:::somebucket/*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// `data.aws_iam_policy_document.override_policy_document_example.json` will evaluate to:
//
// ### Example with Both Source and Override Documents
//
// You can also combine `sourcePolicyDocuments` and `overridePolicyDocuments` in the same document.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// source, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("OverridePlaceholder"),
// Actions: []string{
// "ec2:DescribeAccountAttributes",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// override, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("OverridePlaceholder"),
// Actions: []string{
// "s3:GetObject",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// SourcePolicyDocuments: interface{}{
// source.Json,
// },
// OverridePolicyDocuments: interface{}{
// override.Json,
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// `data.aws_iam_policy_document.politik.json` will evaluate to:
//
// ### Example of Merging Source Documents
//
// Multiple documents can be combined using the `sourcePolicyDocuments` or `overridePolicyDocuments` attributes. `sourcePolicyDocuments` requires that all documents have unique Sids, while `overridePolicyDocuments` will iteratively override matching Sids.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// sourceOne, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "ec2:*",
// },
// Resources: []string{
// "*",
// },
// },
// {
// Sid: pulumi.StringRef("UniqueSidOne"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// sourceTwo, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("UniqueSidTwo"),
// Actions: []string{
// "iam:*",
// },
// Resources: []string{
// "*",
// },
// },
// {
// Actions: []string{
// "lambda:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// SourcePolicyDocuments: interface{}{
// sourceOne.Json,
// sourceTwo.Json,
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// `data.aws_iam_policy_document.combined.json` will evaluate to:
//
// ### Example of Merging Override Documents
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// policyOne, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("OverridePlaceHolderOne"),
// Effect: pulumi.StringRef("Allow"),
// Actions: []string{
// "s3:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// policyTwo, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Effect: pulumi.StringRef("Allow"),
// Actions: []string{
// "ec2:*",
// },
// Resources: []string{
// "*",
// },
// },
// {
// Sid: pulumi.StringRef("OverridePlaceHolderTwo"),
// Effect: pulumi.StringRef("Allow"),
// Actions: []string{
// "iam:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// policyThree, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("OverridePlaceHolderOne"),
// Effect: pulumi.StringRef("Deny"),
// Actions: []string{
// "logs:*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// OverridePolicyDocuments: interface{}{
// policyOne.Json,
// policyTwo.Json,
// policyThree.Json,
// },
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: pulumi.StringRef("OverridePlaceHolderTwo"),
// Effect: pulumi.StringRef("Deny"),
// Actions: []string{
// "*",
// },
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// `data.aws_iam_policy_document.combined.json` will evaluate to:
func GetPolicyDocument(ctx *pulumi.Context, args *GetPolicyDocumentArgs, opts ...pulumi.InvokeOption) (*GetPolicyDocumentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPolicyDocumentResult
	err := ctx.Invoke("aws:iam/getPolicyDocument:getPolicyDocument", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyDocument.
type GetPolicyDocumentArgs struct {
	// Deprecated: Not used
	OverrideJson *string `pulumi:"overrideJson"`
	// List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from `sourcePolicyDocuments`.  Non-overriding statements will be added to the exported document.
	OverridePolicyDocuments []string `pulumi:"overridePolicyDocuments"`
	// ID for the policy document.
	PolicyId *string `pulumi:"policyId"`
	// Deprecated: Not used
	SourceJson *string `pulumi:"sourceJson"`
	// List of IAM policy documents that are merged together into the exported document. Statements defined in `sourcePolicyDocuments` must have unique `sid`s. Statements with the same `sid` from `overridePolicyDocuments` will override source statements.
	SourcePolicyDocuments []string `pulumi:"sourcePolicyDocuments"`
	// Configuration block for a policy statement. Detailed below.
	Statements []GetPolicyDocumentStatement `pulumi:"statements"`
	// IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
	Version *string `pulumi:"version"`
}

// A collection of values returned by getPolicyDocument.
type GetPolicyDocumentResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Standard JSON policy document rendered based on the arguments above.
	Json string `pulumi:"json"`
	// Minified JSON policy document rendered based on the arguments above.
	MinifiedJson string `pulumi:"minifiedJson"`
	// Deprecated: Not used
	OverrideJson            *string  `pulumi:"overrideJson"`
	OverridePolicyDocuments []string `pulumi:"overridePolicyDocuments"`
	PolicyId                *string  `pulumi:"policyId"`
	// Deprecated: Not used
	SourceJson            *string                      `pulumi:"sourceJson"`
	SourcePolicyDocuments []string                     `pulumi:"sourcePolicyDocuments"`
	Statements            []GetPolicyDocumentStatement `pulumi:"statements"`
	Version               *string                      `pulumi:"version"`
}

func GetPolicyDocumentOutput(ctx *pulumi.Context, args GetPolicyDocumentOutputArgs, opts ...pulumi.InvokeOption) GetPolicyDocumentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPolicyDocumentResult, error) {
			args := v.(GetPolicyDocumentArgs)
			r, err := GetPolicyDocument(ctx, &args, opts...)
			var s GetPolicyDocumentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPolicyDocumentResultOutput)
}

// A collection of arguments for invoking getPolicyDocument.
type GetPolicyDocumentOutputArgs struct {
	// Deprecated: Not used
	OverrideJson pulumi.StringPtrInput `pulumi:"overrideJson"`
	// List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from `sourcePolicyDocuments`.  Non-overriding statements will be added to the exported document.
	OverridePolicyDocuments pulumi.StringArrayInput `pulumi:"overridePolicyDocuments"`
	// ID for the policy document.
	PolicyId pulumi.StringPtrInput `pulumi:"policyId"`
	// Deprecated: Not used
	SourceJson pulumi.StringPtrInput `pulumi:"sourceJson"`
	// List of IAM policy documents that are merged together into the exported document. Statements defined in `sourcePolicyDocuments` must have unique `sid`s. Statements with the same `sid` from `overridePolicyDocuments` will override source statements.
	SourcePolicyDocuments pulumi.StringArrayInput `pulumi:"sourcePolicyDocuments"`
	// Configuration block for a policy statement. Detailed below.
	Statements GetPolicyDocumentStatementArrayInput `pulumi:"statements"`
	// IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
	Version pulumi.StringPtrInput `pulumi:"version"`
}

func (GetPolicyDocumentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPolicyDocumentArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyDocument.
type GetPolicyDocumentResultOutput struct{ *pulumi.OutputState }

func (GetPolicyDocumentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPolicyDocumentResult)(nil)).Elem()
}

func (o GetPolicyDocumentResultOutput) ToGetPolicyDocumentResultOutput() GetPolicyDocumentResultOutput {
	return o
}

func (o GetPolicyDocumentResultOutput) ToGetPolicyDocumentResultOutputWithContext(ctx context.Context) GetPolicyDocumentResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPolicyDocumentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Standard JSON policy document rendered based on the arguments above.
func (o GetPolicyDocumentResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) string { return v.Json }).(pulumi.StringOutput)
}

// Minified JSON policy document rendered based on the arguments above.
func (o GetPolicyDocumentResultOutput) MinifiedJson() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) string { return v.MinifiedJson }).(pulumi.StringOutput)
}

// Deprecated: Not used
func (o GetPolicyDocumentResultOutput) OverrideJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) *string { return v.OverrideJson }).(pulumi.StringPtrOutput)
}

func (o GetPolicyDocumentResultOutput) OverridePolicyDocuments() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) []string { return v.OverridePolicyDocuments }).(pulumi.StringArrayOutput)
}

func (o GetPolicyDocumentResultOutput) PolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) *string { return v.PolicyId }).(pulumi.StringPtrOutput)
}

// Deprecated: Not used
func (o GetPolicyDocumentResultOutput) SourceJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) *string { return v.SourceJson }).(pulumi.StringPtrOutput)
}

func (o GetPolicyDocumentResultOutput) SourcePolicyDocuments() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) []string { return v.SourcePolicyDocuments }).(pulumi.StringArrayOutput)
}

func (o GetPolicyDocumentResultOutput) Statements() GetPolicyDocumentStatementArrayOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) []GetPolicyDocumentStatement { return v.Statements }).(GetPolicyDocumentStatementArrayOutput)
}

func (o GetPolicyDocumentResultOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPolicyDocumentResult) *string { return v.Version }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPolicyDocumentResultOutput{})
}
