// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker Model Package Group Policy resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func notImplemented(message string) pulumi.AnyOutput {
//	  panic(message)
//	}
//
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// current, err := aws.GetCallerIdentity(ctx, nil, nil);
// if err != nil {
// return err
// }
// exampleModelPackageGroup, err := sagemaker.NewModelPackageGroup(ctx, "example", &sagemaker.ModelPackageGroupArgs{
// ModelPackageGroupName: pulumi.String("example"),
// })
// if err != nil {
// return err
// }
// _ = exampleModelPackageGroup.Arn.ApplyT(func(arn string) (iam.GetPolicyDocumentResult, error) {
// return iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Sid: "AddPermModelPackageGroup",
// Actions: []string{
// "sagemaker:DescribeModelPackage",
// "sagemaker:ListModelPackages",
// },
// Resources: []string{
// arn,
// },
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Identifiers: interface{}{
// current.AccountId,
// },
// Type: "AWS",
// },
// },
// },
// },
// }, nil), nil
// }).(iam.GetPolicyDocumentResultOutput)
// tmpJSON0, err := json.Marshal(notImplemented("jsondecode(data.aws_iam_policy_document.example.json)"))
// if err != nil {
// return err
// }
// json0 := string(tmpJSON0)
// _, err = sagemaker.NewModelPackageGroupPolicy(ctx, "example", &sagemaker.ModelPackageGroupPolicyArgs{
// ModelPackageGroupName: exampleModelPackageGroup.ModelPackageGroupName,
// ResourcePolicy: pulumi.String(json0),
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
//
// ## Import
//
// Using `pulumi import`, import SageMaker Model Package Groups using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy example example
//
// ```
type ModelPackageGroupPolicy struct {
	pulumi.CustomResourceState

	// The name of the model package group.
	ModelPackageGroupName pulumi.StringOutput `pulumi:"modelPackageGroupName"`
	ResourcePolicy        pulumi.StringOutput `pulumi:"resourcePolicy"`
}

// NewModelPackageGroupPolicy registers a new resource with the given unique name, arguments, and options.
func NewModelPackageGroupPolicy(ctx *pulumi.Context,
	name string, args *ModelPackageGroupPolicyArgs, opts ...pulumi.ResourceOption) (*ModelPackageGroupPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ModelPackageGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ModelPackageGroupName'")
	}
	if args.ResourcePolicy == nil {
		return nil, errors.New("invalid value for required argument 'ResourcePolicy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ModelPackageGroupPolicy
	err := ctx.RegisterResource("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetModelPackageGroupPolicy gets an existing ModelPackageGroupPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetModelPackageGroupPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ModelPackageGroupPolicyState, opts ...pulumi.ResourceOption) (*ModelPackageGroupPolicy, error) {
	var resource ModelPackageGroupPolicy
	err := ctx.ReadResource("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ModelPackageGroupPolicy resources.
type modelPackageGroupPolicyState struct {
	// The name of the model package group.
	ModelPackageGroupName *string `pulumi:"modelPackageGroupName"`
	ResourcePolicy        *string `pulumi:"resourcePolicy"`
}

type ModelPackageGroupPolicyState struct {
	// The name of the model package group.
	ModelPackageGroupName pulumi.StringPtrInput
	ResourcePolicy        pulumi.StringPtrInput
}

func (ModelPackageGroupPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*modelPackageGroupPolicyState)(nil)).Elem()
}

type modelPackageGroupPolicyArgs struct {
	// The name of the model package group.
	ModelPackageGroupName string `pulumi:"modelPackageGroupName"`
	ResourcePolicy        string `pulumi:"resourcePolicy"`
}

// The set of arguments for constructing a ModelPackageGroupPolicy resource.
type ModelPackageGroupPolicyArgs struct {
	// The name of the model package group.
	ModelPackageGroupName pulumi.StringInput
	ResourcePolicy        pulumi.StringInput
}

func (ModelPackageGroupPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*modelPackageGroupPolicyArgs)(nil)).Elem()
}

type ModelPackageGroupPolicyInput interface {
	pulumi.Input

	ToModelPackageGroupPolicyOutput() ModelPackageGroupPolicyOutput
	ToModelPackageGroupPolicyOutputWithContext(ctx context.Context) ModelPackageGroupPolicyOutput
}

func (*ModelPackageGroupPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ModelPackageGroupPolicy)(nil)).Elem()
}

func (i *ModelPackageGroupPolicy) ToModelPackageGroupPolicyOutput() ModelPackageGroupPolicyOutput {
	return i.ToModelPackageGroupPolicyOutputWithContext(context.Background())
}

func (i *ModelPackageGroupPolicy) ToModelPackageGroupPolicyOutputWithContext(ctx context.Context) ModelPackageGroupPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupPolicyOutput)
}

// ModelPackageGroupPolicyArrayInput is an input type that accepts ModelPackageGroupPolicyArray and ModelPackageGroupPolicyArrayOutput values.
// You can construct a concrete instance of `ModelPackageGroupPolicyArrayInput` via:
//
//	ModelPackageGroupPolicyArray{ ModelPackageGroupPolicyArgs{...} }
type ModelPackageGroupPolicyArrayInput interface {
	pulumi.Input

	ToModelPackageGroupPolicyArrayOutput() ModelPackageGroupPolicyArrayOutput
	ToModelPackageGroupPolicyArrayOutputWithContext(context.Context) ModelPackageGroupPolicyArrayOutput
}

type ModelPackageGroupPolicyArray []ModelPackageGroupPolicyInput

func (ModelPackageGroupPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ModelPackageGroupPolicy)(nil)).Elem()
}

func (i ModelPackageGroupPolicyArray) ToModelPackageGroupPolicyArrayOutput() ModelPackageGroupPolicyArrayOutput {
	return i.ToModelPackageGroupPolicyArrayOutputWithContext(context.Background())
}

func (i ModelPackageGroupPolicyArray) ToModelPackageGroupPolicyArrayOutputWithContext(ctx context.Context) ModelPackageGroupPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupPolicyArrayOutput)
}

// ModelPackageGroupPolicyMapInput is an input type that accepts ModelPackageGroupPolicyMap and ModelPackageGroupPolicyMapOutput values.
// You can construct a concrete instance of `ModelPackageGroupPolicyMapInput` via:
//
//	ModelPackageGroupPolicyMap{ "key": ModelPackageGroupPolicyArgs{...} }
type ModelPackageGroupPolicyMapInput interface {
	pulumi.Input

	ToModelPackageGroupPolicyMapOutput() ModelPackageGroupPolicyMapOutput
	ToModelPackageGroupPolicyMapOutputWithContext(context.Context) ModelPackageGroupPolicyMapOutput
}

type ModelPackageGroupPolicyMap map[string]ModelPackageGroupPolicyInput

func (ModelPackageGroupPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ModelPackageGroupPolicy)(nil)).Elem()
}

func (i ModelPackageGroupPolicyMap) ToModelPackageGroupPolicyMapOutput() ModelPackageGroupPolicyMapOutput {
	return i.ToModelPackageGroupPolicyMapOutputWithContext(context.Background())
}

func (i ModelPackageGroupPolicyMap) ToModelPackageGroupPolicyMapOutputWithContext(ctx context.Context) ModelPackageGroupPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ModelPackageGroupPolicyMapOutput)
}

type ModelPackageGroupPolicyOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ModelPackageGroupPolicy)(nil)).Elem()
}

func (o ModelPackageGroupPolicyOutput) ToModelPackageGroupPolicyOutput() ModelPackageGroupPolicyOutput {
	return o
}

func (o ModelPackageGroupPolicyOutput) ToModelPackageGroupPolicyOutputWithContext(ctx context.Context) ModelPackageGroupPolicyOutput {
	return o
}

// The name of the model package group.
func (o ModelPackageGroupPolicyOutput) ModelPackageGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ModelPackageGroupPolicy) pulumi.StringOutput { return v.ModelPackageGroupName }).(pulumi.StringOutput)
}

func (o ModelPackageGroupPolicyOutput) ResourcePolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *ModelPackageGroupPolicy) pulumi.StringOutput { return v.ResourcePolicy }).(pulumi.StringOutput)
}

type ModelPackageGroupPolicyArrayOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ModelPackageGroupPolicy)(nil)).Elem()
}

func (o ModelPackageGroupPolicyArrayOutput) ToModelPackageGroupPolicyArrayOutput() ModelPackageGroupPolicyArrayOutput {
	return o
}

func (o ModelPackageGroupPolicyArrayOutput) ToModelPackageGroupPolicyArrayOutputWithContext(ctx context.Context) ModelPackageGroupPolicyArrayOutput {
	return o
}

func (o ModelPackageGroupPolicyArrayOutput) Index(i pulumi.IntInput) ModelPackageGroupPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ModelPackageGroupPolicy {
		return vs[0].([]*ModelPackageGroupPolicy)[vs[1].(int)]
	}).(ModelPackageGroupPolicyOutput)
}

type ModelPackageGroupPolicyMapOutput struct{ *pulumi.OutputState }

func (ModelPackageGroupPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ModelPackageGroupPolicy)(nil)).Elem()
}

func (o ModelPackageGroupPolicyMapOutput) ToModelPackageGroupPolicyMapOutput() ModelPackageGroupPolicyMapOutput {
	return o
}

func (o ModelPackageGroupPolicyMapOutput) ToModelPackageGroupPolicyMapOutputWithContext(ctx context.Context) ModelPackageGroupPolicyMapOutput {
	return o
}

func (o ModelPackageGroupPolicyMapOutput) MapIndex(k pulumi.StringInput) ModelPackageGroupPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ModelPackageGroupPolicy {
		return vs[0].(map[string]*ModelPackageGroupPolicy)[vs[1].(string)]
	}).(ModelPackageGroupPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupPolicyInput)(nil)).Elem(), &ModelPackageGroupPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupPolicyArrayInput)(nil)).Elem(), ModelPackageGroupPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ModelPackageGroupPolicyMapInput)(nil)).Elem(), ModelPackageGroupPolicyMap{})
	pulumi.RegisterOutputType(ModelPackageGroupPolicyOutput{})
	pulumi.RegisterOutputType(ModelPackageGroupPolicyArrayOutput{})
	pulumi.RegisterOutputType(ModelPackageGroupPolicyMapOutput{})
}
