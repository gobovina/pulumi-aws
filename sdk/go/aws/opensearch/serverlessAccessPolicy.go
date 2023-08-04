// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opensearch

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS OpenSearch Serverless Access Policy.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opensearch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			currentCallerIdentity, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			currentPartition, err := aws.GetPartition(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal([]map[string]interface{}{
//				map[string]interface{}{
//					"Rules": []map[string]interface{}{
//						map[string]interface{}{
//							"ResourceType": "index",
//							"Resource": []string{
//								"index/books/*",
//							},
//							"Permission": []string{
//								"aoss:CreateIndex",
//								"aoss:ReadDocument",
//								"aoss:UpdateIndex",
//								"aoss:DeleteIndex",
//								"aoss:WriteDocument",
//							},
//						},
//					},
//					"Principal": []string{
//						fmt.Sprintf("arn:%v:iam::%v:user/admin", currentPartition.Partition, currentCallerIdentity.AccountId),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = opensearch.NewServerlessAccessPolicy(ctx, "test", &opensearch.ServerlessAccessPolicyArgs{
//				Type:   pulumi.String("data"),
//				Policy: pulumi.String(json0),
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
// terraform import {
//
//	to = aws_opensearchserverless_access_policy.example
//
//	id = "example/data" } Using `pulumi import`, import OpenSearchServerless Access Policy using the `name` and `type` arguments separated by a slash (`/`). For exampleconsole % pulumi import aws_opensearchserverless_access_policy.example example/data
type ServerlessAccessPolicy struct {
	pulumi.CustomResourceState

	// Description of the policy. Typically used to store information about the permissions defined in the policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// JSON policy document to use as the content for the new policy
	Policy pulumi.StringOutput `pulumi:"policy"`
	// Version of the policy.
	PolicyVersion pulumi.StringOutput `pulumi:"policyVersion"`
	// Type of access policy. Must be `data`.
	//
	// The following arguments are optional:
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewServerlessAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewServerlessAccessPolicy(ctx *pulumi.Context,
	name string, args *ServerlessAccessPolicyArgs, opts ...pulumi.ResourceOption) (*ServerlessAccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerlessAccessPolicy
	err := ctx.RegisterResource("aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerlessAccessPolicy gets an existing ServerlessAccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerlessAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerlessAccessPolicyState, opts ...pulumi.ResourceOption) (*ServerlessAccessPolicy, error) {
	var resource ServerlessAccessPolicy
	err := ctx.ReadResource("aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerlessAccessPolicy resources.
type serverlessAccessPolicyState struct {
	// Description of the policy. Typically used to store information about the permissions defined in the policy.
	Description *string `pulumi:"description"`
	// Name of the policy.
	Name *string `pulumi:"name"`
	// JSON policy document to use as the content for the new policy
	Policy *string `pulumi:"policy"`
	// Version of the policy.
	PolicyVersion *string `pulumi:"policyVersion"`
	// Type of access policy. Must be `data`.
	//
	// The following arguments are optional:
	Type *string `pulumi:"type"`
}

type ServerlessAccessPolicyState struct {
	// Description of the policy. Typically used to store information about the permissions defined in the policy.
	Description pulumi.StringPtrInput
	// Name of the policy.
	Name pulumi.StringPtrInput
	// JSON policy document to use as the content for the new policy
	Policy pulumi.StringPtrInput
	// Version of the policy.
	PolicyVersion pulumi.StringPtrInput
	// Type of access policy. Must be `data`.
	//
	// The following arguments are optional:
	Type pulumi.StringPtrInput
}

func (ServerlessAccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessAccessPolicyState)(nil)).Elem()
}

type serverlessAccessPolicyArgs struct {
	// Description of the policy. Typically used to store information about the permissions defined in the policy.
	Description *string `pulumi:"description"`
	// Name of the policy.
	Name *string `pulumi:"name"`
	// JSON policy document to use as the content for the new policy
	Policy string `pulumi:"policy"`
	// Type of access policy. Must be `data`.
	//
	// The following arguments are optional:
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ServerlessAccessPolicy resource.
type ServerlessAccessPolicyArgs struct {
	// Description of the policy. Typically used to store information about the permissions defined in the policy.
	Description pulumi.StringPtrInput
	// Name of the policy.
	Name pulumi.StringPtrInput
	// JSON policy document to use as the content for the new policy
	Policy pulumi.StringInput
	// Type of access policy. Must be `data`.
	//
	// The following arguments are optional:
	Type pulumi.StringInput
}

func (ServerlessAccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessAccessPolicyArgs)(nil)).Elem()
}

type ServerlessAccessPolicyInput interface {
	pulumi.Input

	ToServerlessAccessPolicyOutput() ServerlessAccessPolicyOutput
	ToServerlessAccessPolicyOutputWithContext(ctx context.Context) ServerlessAccessPolicyOutput
}

func (*ServerlessAccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessAccessPolicy)(nil)).Elem()
}

func (i *ServerlessAccessPolicy) ToServerlessAccessPolicyOutput() ServerlessAccessPolicyOutput {
	return i.ToServerlessAccessPolicyOutputWithContext(context.Background())
}

func (i *ServerlessAccessPolicy) ToServerlessAccessPolicyOutputWithContext(ctx context.Context) ServerlessAccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessAccessPolicyOutput)
}

// ServerlessAccessPolicyArrayInput is an input type that accepts ServerlessAccessPolicyArray and ServerlessAccessPolicyArrayOutput values.
// You can construct a concrete instance of `ServerlessAccessPolicyArrayInput` via:
//
//	ServerlessAccessPolicyArray{ ServerlessAccessPolicyArgs{...} }
type ServerlessAccessPolicyArrayInput interface {
	pulumi.Input

	ToServerlessAccessPolicyArrayOutput() ServerlessAccessPolicyArrayOutput
	ToServerlessAccessPolicyArrayOutputWithContext(context.Context) ServerlessAccessPolicyArrayOutput
}

type ServerlessAccessPolicyArray []ServerlessAccessPolicyInput

func (ServerlessAccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessAccessPolicy)(nil)).Elem()
}

func (i ServerlessAccessPolicyArray) ToServerlessAccessPolicyArrayOutput() ServerlessAccessPolicyArrayOutput {
	return i.ToServerlessAccessPolicyArrayOutputWithContext(context.Background())
}

func (i ServerlessAccessPolicyArray) ToServerlessAccessPolicyArrayOutputWithContext(ctx context.Context) ServerlessAccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessAccessPolicyArrayOutput)
}

// ServerlessAccessPolicyMapInput is an input type that accepts ServerlessAccessPolicyMap and ServerlessAccessPolicyMapOutput values.
// You can construct a concrete instance of `ServerlessAccessPolicyMapInput` via:
//
//	ServerlessAccessPolicyMap{ "key": ServerlessAccessPolicyArgs{...} }
type ServerlessAccessPolicyMapInput interface {
	pulumi.Input

	ToServerlessAccessPolicyMapOutput() ServerlessAccessPolicyMapOutput
	ToServerlessAccessPolicyMapOutputWithContext(context.Context) ServerlessAccessPolicyMapOutput
}

type ServerlessAccessPolicyMap map[string]ServerlessAccessPolicyInput

func (ServerlessAccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessAccessPolicy)(nil)).Elem()
}

func (i ServerlessAccessPolicyMap) ToServerlessAccessPolicyMapOutput() ServerlessAccessPolicyMapOutput {
	return i.ToServerlessAccessPolicyMapOutputWithContext(context.Background())
}

func (i ServerlessAccessPolicyMap) ToServerlessAccessPolicyMapOutputWithContext(ctx context.Context) ServerlessAccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessAccessPolicyMapOutput)
}

type ServerlessAccessPolicyOutput struct{ *pulumi.OutputState }

func (ServerlessAccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessAccessPolicy)(nil)).Elem()
}

func (o ServerlessAccessPolicyOutput) ToServerlessAccessPolicyOutput() ServerlessAccessPolicyOutput {
	return o
}

func (o ServerlessAccessPolicyOutput) ToServerlessAccessPolicyOutputWithContext(ctx context.Context) ServerlessAccessPolicyOutput {
	return o
}

// Description of the policy. Typically used to store information about the permissions defined in the policy.
func (o ServerlessAccessPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerlessAccessPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the policy.
func (o ServerlessAccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessAccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// JSON policy document to use as the content for the new policy
func (o ServerlessAccessPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessAccessPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// Version of the policy.
func (o ServerlessAccessPolicyOutput) PolicyVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessAccessPolicy) pulumi.StringOutput { return v.PolicyVersion }).(pulumi.StringOutput)
}

// Type of access policy. Must be `data`.
//
// The following arguments are optional:
func (o ServerlessAccessPolicyOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessAccessPolicy) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ServerlessAccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (ServerlessAccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessAccessPolicy)(nil)).Elem()
}

func (o ServerlessAccessPolicyArrayOutput) ToServerlessAccessPolicyArrayOutput() ServerlessAccessPolicyArrayOutput {
	return o
}

func (o ServerlessAccessPolicyArrayOutput) ToServerlessAccessPolicyArrayOutputWithContext(ctx context.Context) ServerlessAccessPolicyArrayOutput {
	return o
}

func (o ServerlessAccessPolicyArrayOutput) Index(i pulumi.IntInput) ServerlessAccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerlessAccessPolicy {
		return vs[0].([]*ServerlessAccessPolicy)[vs[1].(int)]
	}).(ServerlessAccessPolicyOutput)
}

type ServerlessAccessPolicyMapOutput struct{ *pulumi.OutputState }

func (ServerlessAccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessAccessPolicy)(nil)).Elem()
}

func (o ServerlessAccessPolicyMapOutput) ToServerlessAccessPolicyMapOutput() ServerlessAccessPolicyMapOutput {
	return o
}

func (o ServerlessAccessPolicyMapOutput) ToServerlessAccessPolicyMapOutputWithContext(ctx context.Context) ServerlessAccessPolicyMapOutput {
	return o
}

func (o ServerlessAccessPolicyMapOutput) MapIndex(k pulumi.StringInput) ServerlessAccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerlessAccessPolicy {
		return vs[0].(map[string]*ServerlessAccessPolicy)[vs[1].(string)]
	}).(ServerlessAccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessAccessPolicyInput)(nil)).Elem(), &ServerlessAccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessAccessPolicyArrayInput)(nil)).Elem(), ServerlessAccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessAccessPolicyMapInput)(nil)).Elem(), ServerlessAccessPolicyMap{})
	pulumi.RegisterOutputType(ServerlessAccessPolicyOutput{})
	pulumi.RegisterOutputType(ServerlessAccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(ServerlessAccessPolicyMapOutput{})
}
