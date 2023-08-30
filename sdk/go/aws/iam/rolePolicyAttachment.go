// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Attaches a Managed IAM Policy to an IAM role
//
// > **NOTE:** The usage of this resource conflicts with the `iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
//
// > **NOTE:** For a given role, this resource is incompatible with using the `iam.Role` resource `managedPolicyArns` argument. When using that argument and this resource, both will attempt to manage the role's managed policy attachments and the provider will show a permanent difference.
//
// ## Example Usage
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
//			assumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"ec2.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			role, err := iam.NewRole(ctx, "role", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(assumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			policyPolicyDocument, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"ec2:Describe*",
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
//			policyPolicy, err := iam.NewPolicy(ctx, "policyPolicy", &iam.PolicyArgs{
//				Description: pulumi.String("A test policy"),
//				Policy:      *pulumi.String(policyPolicyDocument.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicyAttachment(ctx, "test-attach", &iam.RolePolicyAttachmentArgs{
//				Role:      role.Name,
//				PolicyArn: policyPolicy.Arn,
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
// Using `pulumi import`, import IAM role policy attachments using the role name and policy arn separated by `/`. For example:
//
// ```sh
//
//	$ pulumi import aws:iam/rolePolicyAttachment:RolePolicyAttachment test-attach test-role/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
//
// ```
type RolePolicyAttachment struct {
	pulumi.CustomResourceState

	// The ARN of the policy you want to apply
	PolicyArn pulumi.StringOutput `pulumi:"policyArn"`
	// The name of the IAM role to which the policy should be applied
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewRolePolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewRolePolicyAttachment(ctx *pulumi.Context,
	name string, args *RolePolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*RolePolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyArn == nil {
		return nil, errors.New("invalid value for required argument 'PolicyArn'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RolePolicyAttachment
	err := ctx.RegisterResource("aws:iam/rolePolicyAttachment:RolePolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRolePolicyAttachment gets an existing RolePolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRolePolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RolePolicyAttachmentState, opts ...pulumi.ResourceOption) (*RolePolicyAttachment, error) {
	var resource RolePolicyAttachment
	err := ctx.ReadResource("aws:iam/rolePolicyAttachment:RolePolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RolePolicyAttachment resources.
type rolePolicyAttachmentState struct {
	// The ARN of the policy you want to apply
	PolicyArn *string `pulumi:"policyArn"`
	// The name of the IAM role to which the policy should be applied
	Role interface{} `pulumi:"role"`
}

type RolePolicyAttachmentState struct {
	// The ARN of the policy you want to apply
	PolicyArn pulumi.StringPtrInput
	// The name of the IAM role to which the policy should be applied
	Role pulumi.Input
}

func (RolePolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePolicyAttachmentState)(nil)).Elem()
}

type rolePolicyAttachmentArgs struct {
	// The ARN of the policy you want to apply
	PolicyArn string `pulumi:"policyArn"`
	// The name of the IAM role to which the policy should be applied
	Role interface{} `pulumi:"role"`
}

// The set of arguments for constructing a RolePolicyAttachment resource.
type RolePolicyAttachmentArgs struct {
	// The ARN of the policy you want to apply
	PolicyArn pulumi.StringInput
	// The name of the IAM role to which the policy should be applied
	Role pulumi.Input
}

func (RolePolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePolicyAttachmentArgs)(nil)).Elem()
}

type RolePolicyAttachmentInput interface {
	pulumi.Input

	ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput
	ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput
}

func (*RolePolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePolicyAttachment)(nil)).Elem()
}

func (i *RolePolicyAttachment) ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput {
	return i.ToRolePolicyAttachmentOutputWithContext(context.Background())
}

func (i *RolePolicyAttachment) ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentOutput)
}

// RolePolicyAttachmentArrayInput is an input type that accepts RolePolicyAttachmentArray and RolePolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `RolePolicyAttachmentArrayInput` via:
//
//	RolePolicyAttachmentArray{ RolePolicyAttachmentArgs{...} }
type RolePolicyAttachmentArrayInput interface {
	pulumi.Input

	ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput
	ToRolePolicyAttachmentArrayOutputWithContext(context.Context) RolePolicyAttachmentArrayOutput
}

type RolePolicyAttachmentArray []RolePolicyAttachmentInput

func (RolePolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePolicyAttachment)(nil)).Elem()
}

func (i RolePolicyAttachmentArray) ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput {
	return i.ToRolePolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i RolePolicyAttachmentArray) ToRolePolicyAttachmentArrayOutputWithContext(ctx context.Context) RolePolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentArrayOutput)
}

// RolePolicyAttachmentMapInput is an input type that accepts RolePolicyAttachmentMap and RolePolicyAttachmentMapOutput values.
// You can construct a concrete instance of `RolePolicyAttachmentMapInput` via:
//
//	RolePolicyAttachmentMap{ "key": RolePolicyAttachmentArgs{...} }
type RolePolicyAttachmentMapInput interface {
	pulumi.Input

	ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput
	ToRolePolicyAttachmentMapOutputWithContext(context.Context) RolePolicyAttachmentMapOutput
}

type RolePolicyAttachmentMap map[string]RolePolicyAttachmentInput

func (RolePolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePolicyAttachment)(nil)).Elem()
}

func (i RolePolicyAttachmentMap) ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput {
	return i.ToRolePolicyAttachmentMapOutputWithContext(context.Background())
}

func (i RolePolicyAttachmentMap) ToRolePolicyAttachmentMapOutputWithContext(ctx context.Context) RolePolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePolicyAttachmentMapOutput)
}

type RolePolicyAttachmentOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentOutput) ToRolePolicyAttachmentOutput() RolePolicyAttachmentOutput {
	return o
}

func (o RolePolicyAttachmentOutput) ToRolePolicyAttachmentOutputWithContext(ctx context.Context) RolePolicyAttachmentOutput {
	return o
}

// The ARN of the policy you want to apply
func (o RolePolicyAttachmentOutput) PolicyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePolicyAttachment) pulumi.StringOutput { return v.PolicyArn }).(pulumi.StringOutput)
}

// The name of the IAM role to which the policy should be applied
func (o RolePolicyAttachmentOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePolicyAttachment) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

type RolePolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentArrayOutput) ToRolePolicyAttachmentArrayOutput() RolePolicyAttachmentArrayOutput {
	return o
}

func (o RolePolicyAttachmentArrayOutput) ToRolePolicyAttachmentArrayOutputWithContext(ctx context.Context) RolePolicyAttachmentArrayOutput {
	return o
}

func (o RolePolicyAttachmentArrayOutput) Index(i pulumi.IntInput) RolePolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RolePolicyAttachment {
		return vs[0].([]*RolePolicyAttachment)[vs[1].(int)]
	}).(RolePolicyAttachmentOutput)
}

type RolePolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (RolePolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePolicyAttachment)(nil)).Elem()
}

func (o RolePolicyAttachmentMapOutput) ToRolePolicyAttachmentMapOutput() RolePolicyAttachmentMapOutput {
	return o
}

func (o RolePolicyAttachmentMapOutput) ToRolePolicyAttachmentMapOutputWithContext(ctx context.Context) RolePolicyAttachmentMapOutput {
	return o
}

func (o RolePolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) RolePolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RolePolicyAttachment {
		return vs[0].(map[string]*RolePolicyAttachment)[vs[1].(string)]
	}).(RolePolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentInput)(nil)).Elem(), &RolePolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentArrayInput)(nil)).Elem(), RolePolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePolicyAttachmentMapInput)(nil)).Elem(), RolePolicyAttachmentMap{})
	pulumi.RegisterOutputType(RolePolicyAttachmentOutput{})
	pulumi.RegisterOutputType(RolePolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(RolePolicyAttachmentMapOutput{})
}
