// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpclattice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS VPC Lattice Auth Policy.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/vpclattice"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := vpclattice.NewService(ctx, "example", &vpclattice.ServiceArgs{
//				Name:             pulumi.String("example-vpclattice-service"),
//				AuthType:         pulumi.String("AWS_IAM"),
//				CustomDomainName: pulumi.String("example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action":    "*",
//						"effect":    "Allow",
//						"principal": "*",
//						"resource":  "*",
//						"condition": map[string]interface{}{
//							"stringNotEqualsIgnoreCase": map[string]interface{}{
//								"aws:PrincipalType": "anonymous",
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = vpclattice.NewAuthPolicy(ctx, "example", &vpclattice.AuthPolicyArgs{
//				ResourceIdentifier: example.Arn,
//				Policy:             pulumi.String(json0),
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
// Using `pulumi import`, import VPC Lattice Auth Policy using the `id`. For example:
//
// ```sh
// $ pulumi import aws:vpclattice/authPolicy:AuthPolicy example abcd-12345678
// ```
type AuthPolicy struct {
	pulumi.CustomResourceState

	// The auth policy. The policy string in JSON must not contain newlines or blank lines.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
	ResourceIdentifier pulumi.StringOutput `pulumi:"resourceIdentifier"`
	// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
	State pulumi.StringPtrOutput `pulumi:"state"`
}

// NewAuthPolicy registers a new resource with the given unique name, arguments, and options.
func NewAuthPolicy(ctx *pulumi.Context,
	name string, args *AuthPolicyArgs, opts ...pulumi.ResourceOption) (*AuthPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.ResourceIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ResourceIdentifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthPolicy
	err := ctx.RegisterResource("aws:vpclattice/authPolicy:AuthPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthPolicy gets an existing AuthPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthPolicyState, opts ...pulumi.ResourceOption) (*AuthPolicy, error) {
	var resource AuthPolicy
	err := ctx.ReadResource("aws:vpclattice/authPolicy:AuthPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthPolicy resources.
type authPolicyState struct {
	// The auth policy. The policy string in JSON must not contain newlines or blank lines.
	Policy *string `pulumi:"policy"`
	// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
	ResourceIdentifier *string `pulumi:"resourceIdentifier"`
	// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
	State *string `pulumi:"state"`
}

type AuthPolicyState struct {
	// The auth policy. The policy string in JSON must not contain newlines or blank lines.
	Policy pulumi.StringPtrInput
	// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
	ResourceIdentifier pulumi.StringPtrInput
	// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
	State pulumi.StringPtrInput
}

func (AuthPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*authPolicyState)(nil)).Elem()
}

type authPolicyArgs struct {
	// The auth policy. The policy string in JSON must not contain newlines or blank lines.
	Policy string `pulumi:"policy"`
	// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
	ResourceIdentifier string `pulumi:"resourceIdentifier"`
	// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
	State *string `pulumi:"state"`
}

// The set of arguments for constructing a AuthPolicy resource.
type AuthPolicyArgs struct {
	// The auth policy. The policy string in JSON must not contain newlines or blank lines.
	Policy pulumi.StringInput
	// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
	ResourceIdentifier pulumi.StringInput
	// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
	State pulumi.StringPtrInput
}

func (AuthPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authPolicyArgs)(nil)).Elem()
}

type AuthPolicyInput interface {
	pulumi.Input

	ToAuthPolicyOutput() AuthPolicyOutput
	ToAuthPolicyOutputWithContext(ctx context.Context) AuthPolicyOutput
}

func (*AuthPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthPolicy)(nil)).Elem()
}

func (i *AuthPolicy) ToAuthPolicyOutput() AuthPolicyOutput {
	return i.ToAuthPolicyOutputWithContext(context.Background())
}

func (i *AuthPolicy) ToAuthPolicyOutputWithContext(ctx context.Context) AuthPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthPolicyOutput)
}

// AuthPolicyArrayInput is an input type that accepts AuthPolicyArray and AuthPolicyArrayOutput values.
// You can construct a concrete instance of `AuthPolicyArrayInput` via:
//
//	AuthPolicyArray{ AuthPolicyArgs{...} }
type AuthPolicyArrayInput interface {
	pulumi.Input

	ToAuthPolicyArrayOutput() AuthPolicyArrayOutput
	ToAuthPolicyArrayOutputWithContext(context.Context) AuthPolicyArrayOutput
}

type AuthPolicyArray []AuthPolicyInput

func (AuthPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthPolicy)(nil)).Elem()
}

func (i AuthPolicyArray) ToAuthPolicyArrayOutput() AuthPolicyArrayOutput {
	return i.ToAuthPolicyArrayOutputWithContext(context.Background())
}

func (i AuthPolicyArray) ToAuthPolicyArrayOutputWithContext(ctx context.Context) AuthPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthPolicyArrayOutput)
}

// AuthPolicyMapInput is an input type that accepts AuthPolicyMap and AuthPolicyMapOutput values.
// You can construct a concrete instance of `AuthPolicyMapInput` via:
//
//	AuthPolicyMap{ "key": AuthPolicyArgs{...} }
type AuthPolicyMapInput interface {
	pulumi.Input

	ToAuthPolicyMapOutput() AuthPolicyMapOutput
	ToAuthPolicyMapOutputWithContext(context.Context) AuthPolicyMapOutput
}

type AuthPolicyMap map[string]AuthPolicyInput

func (AuthPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthPolicy)(nil)).Elem()
}

func (i AuthPolicyMap) ToAuthPolicyMapOutput() AuthPolicyMapOutput {
	return i.ToAuthPolicyMapOutputWithContext(context.Background())
}

func (i AuthPolicyMap) ToAuthPolicyMapOutputWithContext(ctx context.Context) AuthPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthPolicyMapOutput)
}

type AuthPolicyOutput struct{ *pulumi.OutputState }

func (AuthPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthPolicy)(nil)).Elem()
}

func (o AuthPolicyOutput) ToAuthPolicyOutput() AuthPolicyOutput {
	return o
}

func (o AuthPolicyOutput) ToAuthPolicyOutputWithContext(ctx context.Context) AuthPolicyOutput {
	return o
}

// The auth policy. The policy string in JSON must not contain newlines or blank lines.
func (o AuthPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
func (o AuthPolicyOutput) ResourceIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthPolicy) pulumi.StringOutput { return v.ResourceIdentifier }).(pulumi.StringOutput)
}

// The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
func (o AuthPolicyOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthPolicy) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

type AuthPolicyArrayOutput struct{ *pulumi.OutputState }

func (AuthPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthPolicy)(nil)).Elem()
}

func (o AuthPolicyArrayOutput) ToAuthPolicyArrayOutput() AuthPolicyArrayOutput {
	return o
}

func (o AuthPolicyArrayOutput) ToAuthPolicyArrayOutputWithContext(ctx context.Context) AuthPolicyArrayOutput {
	return o
}

func (o AuthPolicyArrayOutput) Index(i pulumi.IntInput) AuthPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthPolicy {
		return vs[0].([]*AuthPolicy)[vs[1].(int)]
	}).(AuthPolicyOutput)
}

type AuthPolicyMapOutput struct{ *pulumi.OutputState }

func (AuthPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthPolicy)(nil)).Elem()
}

func (o AuthPolicyMapOutput) ToAuthPolicyMapOutput() AuthPolicyMapOutput {
	return o
}

func (o AuthPolicyMapOutput) ToAuthPolicyMapOutputWithContext(ctx context.Context) AuthPolicyMapOutput {
	return o
}

func (o AuthPolicyMapOutput) MapIndex(k pulumi.StringInput) AuthPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthPolicy {
		return vs[0].(map[string]*AuthPolicy)[vs[1].(string)]
	}).(AuthPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthPolicyInput)(nil)).Elem(), &AuthPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthPolicyArrayInput)(nil)).Elem(), AuthPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthPolicyMapInput)(nil)).Elem(), AuthPolicyMap{})
	pulumi.RegisterOutputType(AuthPolicyOutput{})
	pulumi.RegisterOutputType(AuthPolicyArrayOutput{})
	pulumi.RegisterOutputType(AuthPolicyMapOutput{})
}
