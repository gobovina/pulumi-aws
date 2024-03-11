// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic Container Registry Repository Policy.
//
// Note that currently only one policy may be applied to a repository.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecr"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foo, err := ecr.NewRepository(ctx, "foo", &ecr.RepositoryArgs{
//				Name: pulumi.String("bar"),
//			})
//			if err != nil {
//				return err
//			}
//			foopolicy, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid:    pulumi.StringRef("new policy"),
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "AWS",
//								Identifiers: []string{
//									"123456789012",
//								},
//							},
//						},
//						Actions: []string{
//							"ecr:GetDownloadUrlForLayer",
//							"ecr:BatchGetImage",
//							"ecr:BatchCheckLayerAvailability",
//							"ecr:PutImage",
//							"ecr:InitiateLayerUpload",
//							"ecr:UploadLayerPart",
//							"ecr:CompleteLayerUpload",
//							"ecr:DescribeRepositories",
//							"ecr:GetRepositoryPolicy",
//							"ecr:ListImages",
//							"ecr:DeleteRepository",
//							"ecr:BatchDeleteImage",
//							"ecr:SetRepositoryPolicy",
//							"ecr:DeleteRepositoryPolicy",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ecr.NewRepositoryPolicy(ctx, "foopolicy", &ecr.RepositoryPolicyArgs{
//				Repository: foo.Name,
//				Policy:     *pulumi.String(foopolicy.Json),
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
//
// ## Import
//
// Using `pulumi import`, import ECR Repository Policy using the repository name. For example:
//
// ```sh
// $ pulumi import aws:ecr/repositoryPolicy:RepositoryPolicy example example
// ```
type RepositoryPolicy struct {
	pulumi.CustomResourceState

	// The policy document. This is a JSON formatted string.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// The registry ID where the repository was created.
	RegistryId pulumi.StringOutput `pulumi:"registryId"`
	// Name of the repository to apply the policy.
	Repository pulumi.StringOutput `pulumi:"repository"`
}

// NewRepositoryPolicy registers a new resource with the given unique name, arguments, and options.
func NewRepositoryPolicy(ctx *pulumi.Context,
	name string, args *RepositoryPolicyArgs, opts ...pulumi.ResourceOption) (*RepositoryPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RepositoryPolicy
	err := ctx.RegisterResource("aws:ecr/repositoryPolicy:RepositoryPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepositoryPolicy gets an existing RepositoryPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepositoryPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryPolicyState, opts ...pulumi.ResourceOption) (*RepositoryPolicy, error) {
	var resource RepositoryPolicy
	err := ctx.ReadResource("aws:ecr/repositoryPolicy:RepositoryPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepositoryPolicy resources.
type repositoryPolicyState struct {
	// The policy document. This is a JSON formatted string.
	Policy interface{} `pulumi:"policy"`
	// The registry ID where the repository was created.
	RegistryId *string `pulumi:"registryId"`
	// Name of the repository to apply the policy.
	Repository *string `pulumi:"repository"`
}

type RepositoryPolicyState struct {
	// The policy document. This is a JSON formatted string.
	Policy pulumi.Input
	// The registry ID where the repository was created.
	RegistryId pulumi.StringPtrInput
	// Name of the repository to apply the policy.
	Repository pulumi.StringPtrInput
}

func (RepositoryPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryPolicyState)(nil)).Elem()
}

type repositoryPolicyArgs struct {
	// The policy document. This is a JSON formatted string.
	Policy interface{} `pulumi:"policy"`
	// Name of the repository to apply the policy.
	Repository string `pulumi:"repository"`
}

// The set of arguments for constructing a RepositoryPolicy resource.
type RepositoryPolicyArgs struct {
	// The policy document. This is a JSON formatted string.
	Policy pulumi.Input
	// Name of the repository to apply the policy.
	Repository pulumi.StringInput
}

func (RepositoryPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryPolicyArgs)(nil)).Elem()
}

type RepositoryPolicyInput interface {
	pulumi.Input

	ToRepositoryPolicyOutput() RepositoryPolicyOutput
	ToRepositoryPolicyOutputWithContext(ctx context.Context) RepositoryPolicyOutput
}

func (*RepositoryPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryPolicy)(nil)).Elem()
}

func (i *RepositoryPolicy) ToRepositoryPolicyOutput() RepositoryPolicyOutput {
	return i.ToRepositoryPolicyOutputWithContext(context.Background())
}

func (i *RepositoryPolicy) ToRepositoryPolicyOutputWithContext(ctx context.Context) RepositoryPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryPolicyOutput)
}

// RepositoryPolicyArrayInput is an input type that accepts RepositoryPolicyArray and RepositoryPolicyArrayOutput values.
// You can construct a concrete instance of `RepositoryPolicyArrayInput` via:
//
//	RepositoryPolicyArray{ RepositoryPolicyArgs{...} }
type RepositoryPolicyArrayInput interface {
	pulumi.Input

	ToRepositoryPolicyArrayOutput() RepositoryPolicyArrayOutput
	ToRepositoryPolicyArrayOutputWithContext(context.Context) RepositoryPolicyArrayOutput
}

type RepositoryPolicyArray []RepositoryPolicyInput

func (RepositoryPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryPolicy)(nil)).Elem()
}

func (i RepositoryPolicyArray) ToRepositoryPolicyArrayOutput() RepositoryPolicyArrayOutput {
	return i.ToRepositoryPolicyArrayOutputWithContext(context.Background())
}

func (i RepositoryPolicyArray) ToRepositoryPolicyArrayOutputWithContext(ctx context.Context) RepositoryPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryPolicyArrayOutput)
}

// RepositoryPolicyMapInput is an input type that accepts RepositoryPolicyMap and RepositoryPolicyMapOutput values.
// You can construct a concrete instance of `RepositoryPolicyMapInput` via:
//
//	RepositoryPolicyMap{ "key": RepositoryPolicyArgs{...} }
type RepositoryPolicyMapInput interface {
	pulumi.Input

	ToRepositoryPolicyMapOutput() RepositoryPolicyMapOutput
	ToRepositoryPolicyMapOutputWithContext(context.Context) RepositoryPolicyMapOutput
}

type RepositoryPolicyMap map[string]RepositoryPolicyInput

func (RepositoryPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryPolicy)(nil)).Elem()
}

func (i RepositoryPolicyMap) ToRepositoryPolicyMapOutput() RepositoryPolicyMapOutput {
	return i.ToRepositoryPolicyMapOutputWithContext(context.Background())
}

func (i RepositoryPolicyMap) ToRepositoryPolicyMapOutputWithContext(ctx context.Context) RepositoryPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryPolicyMapOutput)
}

type RepositoryPolicyOutput struct{ *pulumi.OutputState }

func (RepositoryPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryPolicy)(nil)).Elem()
}

func (o RepositoryPolicyOutput) ToRepositoryPolicyOutput() RepositoryPolicyOutput {
	return o
}

func (o RepositoryPolicyOutput) ToRepositoryPolicyOutputWithContext(ctx context.Context) RepositoryPolicyOutput {
	return o
}

// The policy document. This is a JSON formatted string.
func (o RepositoryPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// The registry ID where the repository was created.
func (o RepositoryPolicyOutput) RegistryId() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryPolicy) pulumi.StringOutput { return v.RegistryId }).(pulumi.StringOutput)
}

// Name of the repository to apply the policy.
func (o RepositoryPolicyOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryPolicy) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

type RepositoryPolicyArrayOutput struct{ *pulumi.OutputState }

func (RepositoryPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryPolicy)(nil)).Elem()
}

func (o RepositoryPolicyArrayOutput) ToRepositoryPolicyArrayOutput() RepositoryPolicyArrayOutput {
	return o
}

func (o RepositoryPolicyArrayOutput) ToRepositoryPolicyArrayOutputWithContext(ctx context.Context) RepositoryPolicyArrayOutput {
	return o
}

func (o RepositoryPolicyArrayOutput) Index(i pulumi.IntInput) RepositoryPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepositoryPolicy {
		return vs[0].([]*RepositoryPolicy)[vs[1].(int)]
	}).(RepositoryPolicyOutput)
}

type RepositoryPolicyMapOutput struct{ *pulumi.OutputState }

func (RepositoryPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryPolicy)(nil)).Elem()
}

func (o RepositoryPolicyMapOutput) ToRepositoryPolicyMapOutput() RepositoryPolicyMapOutput {
	return o
}

func (o RepositoryPolicyMapOutput) ToRepositoryPolicyMapOutputWithContext(ctx context.Context) RepositoryPolicyMapOutput {
	return o
}

func (o RepositoryPolicyMapOutput) MapIndex(k pulumi.StringInput) RepositoryPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepositoryPolicy {
		return vs[0].(map[string]*RepositoryPolicy)[vs[1].(string)]
	}).(RepositoryPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryPolicyInput)(nil)).Elem(), &RepositoryPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryPolicyArrayInput)(nil)).Elem(), RepositoryPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryPolicyMapInput)(nil)).Elem(), RepositoryPolicyMap{})
	pulumi.RegisterOutputType(RepositoryPolicyOutput{})
	pulumi.RegisterOutputType(RepositoryPolicyArrayOutput{})
	pulumi.RegisterOutputType(RepositoryPolicyMapOutput{})
}
