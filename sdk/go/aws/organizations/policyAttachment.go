// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to attach an AWS Organizations policy to an organization account, root, or unit.
//
// ## Example Usage
// ### Organization Account
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicyAttachment(ctx, "account", &organizations.PolicyAttachmentArgs{
//				PolicyId: pulumi.Any(example.Id),
//				TargetId: pulumi.String("123456789012"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Organization Root
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicyAttachment(ctx, "root", &organizations.PolicyAttachmentArgs{
//				PolicyId: pulumi.Any(example.Id),
//				TargetId: pulumi.Any(exampleAwsOrganizationsOrganization.Roots[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Organization Unit
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewPolicyAttachment(ctx, "unit", &organizations.PolicyAttachmentArgs{
//				PolicyId: pulumi.Any(example.Id),
//				TargetId: pulumi.Any(exampleAwsOrganizationsOrganizationalUnit.Id),
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
// Using `pulumi import`, import `aws_organizations_policy_attachment` using the target ID and policy ID. For example:
//
// With an account target:
//
// ```sh
//
//	$ pulumi import aws:organizations/policyAttachment:PolicyAttachment account 123456789012:p-12345678
//
// ```
type PolicyAttachment struct {
	pulumi.CustomResourceState

	// The unique identifier (ID) of the policy that you want to attach to the target.
	PolicyId pulumi.StringOutput `pulumi:"policyId"`
	// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
	SkipDestroy pulumi.BoolPtrOutput `pulumi:"skipDestroy"`
	// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
	TargetId pulumi.StringOutput `pulumi:"targetId"`
}

// NewPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewPolicyAttachment(ctx *pulumi.Context,
	name string, args *PolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*PolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	if args.TargetId == nil {
		return nil, errors.New("invalid value for required argument 'TargetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PolicyAttachment
	err := ctx.RegisterResource("aws:organizations/policyAttachment:PolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicyAttachment gets an existing PolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyAttachmentState, opts ...pulumi.ResourceOption) (*PolicyAttachment, error) {
	var resource PolicyAttachment
	err := ctx.ReadResource("aws:organizations/policyAttachment:PolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PolicyAttachment resources.
type policyAttachmentState struct {
	// The unique identifier (ID) of the policy that you want to attach to the target.
	PolicyId *string `pulumi:"policyId"`
	// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
	SkipDestroy *bool `pulumi:"skipDestroy"`
	// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
	TargetId *string `pulumi:"targetId"`
}

type PolicyAttachmentState struct {
	// The unique identifier (ID) of the policy that you want to attach to the target.
	PolicyId pulumi.StringPtrInput
	// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
	SkipDestroy pulumi.BoolPtrInput
	// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
	TargetId pulumi.StringPtrInput
}

func (PolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyAttachmentState)(nil)).Elem()
}

type policyAttachmentArgs struct {
	// The unique identifier (ID) of the policy that you want to attach to the target.
	PolicyId string `pulumi:"policyId"`
	// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
	SkipDestroy *bool `pulumi:"skipDestroy"`
	// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
	TargetId string `pulumi:"targetId"`
}

// The set of arguments for constructing a PolicyAttachment resource.
type PolicyAttachmentArgs struct {
	// The unique identifier (ID) of the policy that you want to attach to the target.
	PolicyId pulumi.StringInput
	// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
	SkipDestroy pulumi.BoolPtrInput
	// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
	TargetId pulumi.StringInput
}

func (PolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyAttachmentArgs)(nil)).Elem()
}

type PolicyAttachmentInput interface {
	pulumi.Input

	ToPolicyAttachmentOutput() PolicyAttachmentOutput
	ToPolicyAttachmentOutputWithContext(ctx context.Context) PolicyAttachmentOutput
}

func (*PolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicyAttachment)(nil)).Elem()
}

func (i *PolicyAttachment) ToPolicyAttachmentOutput() PolicyAttachmentOutput {
	return i.ToPolicyAttachmentOutputWithContext(context.Background())
}

func (i *PolicyAttachment) ToPolicyAttachmentOutputWithContext(ctx context.Context) PolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyAttachmentOutput)
}

// PolicyAttachmentArrayInput is an input type that accepts PolicyAttachmentArray and PolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `PolicyAttachmentArrayInput` via:
//
//	PolicyAttachmentArray{ PolicyAttachmentArgs{...} }
type PolicyAttachmentArrayInput interface {
	pulumi.Input

	ToPolicyAttachmentArrayOutput() PolicyAttachmentArrayOutput
	ToPolicyAttachmentArrayOutputWithContext(context.Context) PolicyAttachmentArrayOutput
}

type PolicyAttachmentArray []PolicyAttachmentInput

func (PolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicyAttachment)(nil)).Elem()
}

func (i PolicyAttachmentArray) ToPolicyAttachmentArrayOutput() PolicyAttachmentArrayOutput {
	return i.ToPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i PolicyAttachmentArray) ToPolicyAttachmentArrayOutputWithContext(ctx context.Context) PolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyAttachmentArrayOutput)
}

// PolicyAttachmentMapInput is an input type that accepts PolicyAttachmentMap and PolicyAttachmentMapOutput values.
// You can construct a concrete instance of `PolicyAttachmentMapInput` via:
//
//	PolicyAttachmentMap{ "key": PolicyAttachmentArgs{...} }
type PolicyAttachmentMapInput interface {
	pulumi.Input

	ToPolicyAttachmentMapOutput() PolicyAttachmentMapOutput
	ToPolicyAttachmentMapOutputWithContext(context.Context) PolicyAttachmentMapOutput
}

type PolicyAttachmentMap map[string]PolicyAttachmentInput

func (PolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicyAttachment)(nil)).Elem()
}

func (i PolicyAttachmentMap) ToPolicyAttachmentMapOutput() PolicyAttachmentMapOutput {
	return i.ToPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i PolicyAttachmentMap) ToPolicyAttachmentMapOutputWithContext(ctx context.Context) PolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyAttachmentMapOutput)
}

type PolicyAttachmentOutput struct{ *pulumi.OutputState }

func (PolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicyAttachment)(nil)).Elem()
}

func (o PolicyAttachmentOutput) ToPolicyAttachmentOutput() PolicyAttachmentOutput {
	return o
}

func (o PolicyAttachmentOutput) ToPolicyAttachmentOutputWithContext(ctx context.Context) PolicyAttachmentOutput {
	return o
}

// The unique identifier (ID) of the policy that you want to attach to the target.
func (o PolicyAttachmentOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicyAttachment) pulumi.StringOutput { return v.PolicyId }).(pulumi.StringOutput)
}

// If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
func (o PolicyAttachmentOutput) SkipDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PolicyAttachment) pulumi.BoolPtrOutput { return v.SkipDestroy }).(pulumi.BoolPtrOutput)
}

// The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
func (o PolicyAttachmentOutput) TargetId() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicyAttachment) pulumi.StringOutput { return v.TargetId }).(pulumi.StringOutput)
}

type PolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (PolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicyAttachment)(nil)).Elem()
}

func (o PolicyAttachmentArrayOutput) ToPolicyAttachmentArrayOutput() PolicyAttachmentArrayOutput {
	return o
}

func (o PolicyAttachmentArrayOutput) ToPolicyAttachmentArrayOutputWithContext(ctx context.Context) PolicyAttachmentArrayOutput {
	return o
}

func (o PolicyAttachmentArrayOutput) Index(i pulumi.IntInput) PolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PolicyAttachment {
		return vs[0].([]*PolicyAttachment)[vs[1].(int)]
	}).(PolicyAttachmentOutput)
}

type PolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (PolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicyAttachment)(nil)).Elem()
}

func (o PolicyAttachmentMapOutput) ToPolicyAttachmentMapOutput() PolicyAttachmentMapOutput {
	return o
}

func (o PolicyAttachmentMapOutput) ToPolicyAttachmentMapOutputWithContext(ctx context.Context) PolicyAttachmentMapOutput {
	return o
}

func (o PolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) PolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PolicyAttachment {
		return vs[0].(map[string]*PolicyAttachment)[vs[1].(string)]
	}).(PolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyAttachmentInput)(nil)).Elem(), &PolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyAttachmentArrayInput)(nil)).Elem(), PolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyAttachmentMapInput)(nil)).Elem(), PolicyAttachmentMap{})
	pulumi.RegisterOutputType(PolicyAttachmentOutput{})
	pulumi.RegisterOutputType(PolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(PolicyAttachmentMapOutput{})
}
