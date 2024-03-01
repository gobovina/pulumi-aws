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

// Provides an IAM role.
//
// > **NOTE:** If policies are attached to the role via the `iam.PolicyAttachment` resource and you are modifying the role `name` or `path`, the `forceDetachPolicies` argument must be set to `true` and applied before attempting the operation otherwise you will encounter a `DeleteConflict` error. The `iam.RolePolicyAttachment` resource (recommended) does not have this requirement.
//
// > **NOTE:** If you use this resource's `managedPolicyArns` argument or `inlinePolicy` configuration blocks, this resource will take over exclusive management of the role's respective policy types (e.g., both policy types if both arguments are used). These arguments are incompatible with other ways of managing a role's policies, such as `iam.PolicyAttachment`, `iam.RolePolicyAttachment`, and `iam.RolePolicy`. If you attempt to manage a role's policies by multiple means, you will get resource cycling and/or errors.
//
// ## Example Usage
// ### Basic Example
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": "sts:AssumeRole",
//						"effect": "Allow",
//						"sid":    "",
//						"principal": map[string]interface{}{
//							"service": "ec2.amazonaws.com",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = iam.NewRole(ctx, "test_role", &iam.RoleArgs{
//				Name:             pulumi.String("test_role"),
//				AssumeRolePolicy: pulumi.String(json0),
//				Tags: pulumi.StringMap{
//					"tag-key": pulumi.String("tag-value"),
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
// ### Example of Using Data Source for Assume Role Policy
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
//			instanceAssumeRolePolicy, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"ec2.amazonaws.com",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRole(ctx, "instance", &iam.RoleArgs{
//				Name:             pulumi.String("instance_role"),
//				Path:             pulumi.String("/system/"),
//				AssumeRolePolicy: *pulumi.String(instanceAssumeRolePolicy.Json),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Example of Exclusive Inline Policies
//
// This example creates an IAM role with two inline IAM policies. If someone adds another inline policy out-of-band, on the next apply, this provider will remove that policy. If someone deletes these policies out-of-band, this provider will recreate them.
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			inlinePolicy, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"ec2:DescribeAccountAttributes",
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
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": []string{
//							"ec2:Describe*",
//						},
//						"effect":   "Allow",
//						"resource": "*",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = iam.NewRole(ctx, "example", &iam.RoleArgs{
//				Name:             pulumi.String("yak_role"),
//				AssumeRolePolicy: pulumi.Any(instanceAssumeRolePolicy.Json),
//				InlinePolicies: iam.RoleInlinePolicyArray{
//					&iam.RoleInlinePolicyArgs{
//						Name:   pulumi.String("my_inline_policy"),
//						Policy: pulumi.String(json0),
//					},
//					&iam.RoleInlinePolicyArgs{
//						Name:   pulumi.String("policy-8675309"),
//						Policy: *pulumi.String(inlinePolicy.Json),
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
// ### Example of Removing Inline Policies
//
// This example creates an IAM role with what appears to be empty IAM `inlinePolicy` argument instead of using `inlinePolicy` as a configuration block. The result is that if someone were to add an inline policy out-of-band, on the next apply, this provider will remove that policy.
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
//			_, err := iam.NewRole(ctx, "example", &iam.RoleArgs{
//				InlinePolicies: iam.RoleInlinePolicyArray{
//					nil,
//				},
//				Name:             pulumi.String("yak_role"),
//				AssumeRolePolicy: pulumi.Any(instanceAssumeRolePolicy.Json),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Example of Exclusive Managed Policies
//
// This example creates an IAM role and attaches two managed IAM policies. If someone attaches another managed policy out-of-band, on the next apply, this provider will detach that policy. If someone detaches these policies out-of-band, this provider will attach them again.
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": []string{
//							"ec2:Describe*",
//						},
//						"effect":   "Allow",
//						"resource": "*",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			policyOne, err := iam.NewPolicy(ctx, "policy_one", &iam.PolicyArgs{
//				Name:   pulumi.String("policy-618033"),
//				Policy: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON1, err := json.Marshal(map[string]interface{}{
//				"version": "2012-10-17",
//				"statement": []map[string]interface{}{
//					map[string]interface{}{
//						"action": []string{
//							"s3:ListAllMyBuckets",
//							"s3:ListBucket",
//							"s3:HeadBucket",
//						},
//						"effect":   "Allow",
//						"resource": "*",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			policyTwo, err := iam.NewPolicy(ctx, "policy_two", &iam.PolicyArgs{
//				Name:   pulumi.String("policy-381966"),
//				Policy: pulumi.String(json1),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRole(ctx, "example", &iam.RoleArgs{
//				Name:             pulumi.String("yak_role"),
//				AssumeRolePolicy: pulumi.Any(instanceAssumeRolePolicy.Json),
//				ManagedPolicyArns: pulumi.StringArray{
//					policyOne.Arn,
//					policyTwo.Arn,
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
// ### Example of Removing Managed Policies
//
// This example creates an IAM role with an empty `managedPolicyArns` argument. If someone attaches a policy out-of-band, on the next apply, this provider will detach that policy.
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
//			_, err := iam.NewRole(ctx, "example", &iam.RoleArgs{
//				Name:              pulumi.String("yak_role"),
//				AssumeRolePolicy:  pulumi.Any(instanceAssumeRolePolicy.Json),
//				ManagedPolicyArns: pulumi.StringArray{},
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
// Using `pulumi import`, import IAM Roles using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:iam/role:Role developer developer_name
//
// ```
type Role struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) specifying the role.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Policy that grants an entity permission to assume the role.
	//
	// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
	//
	// The following arguments are optional:
	AssumeRolePolicy pulumi.StringOutput `pulumi:"assumeRolePolicy"`
	// Creation date of the IAM role.
	CreateDate pulumi.StringOutput `pulumi:"createDate"`
	// Description of the role.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
	ForceDetachPolicies pulumi.BoolPtrOutput `pulumi:"forceDetachPolicies"`
	// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
	InlinePolicies    RoleInlinePolicyArrayOutput `pulumi:"inlinePolicies"`
	ManagedPolicyArns pulumi.StringArrayOutput    `pulumi:"managedPolicyArns"`
	// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
	MaxSessionDuration pulumi.IntPtrOutput `pulumi:"maxSessionDuration"`
	// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// ARN of the policy that is used to set the permissions boundary for the role.
	PermissionsBoundary pulumi.StringPtrOutput `pulumi:"permissionsBoundary"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Stable and unique string identifying the role.
	UniqueId pulumi.StringOutput `pulumi:"uniqueId"`
}

// NewRole registers a new resource with the given unique name, arguments, and options.
func NewRole(ctx *pulumi.Context,
	name string, args *RoleArgs, opts ...pulumi.ResourceOption) (*Role, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AssumeRolePolicy == nil {
		return nil, errors.New("invalid value for required argument 'AssumeRolePolicy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Role
	err := ctx.RegisterResource("aws:iam/role:Role", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRole gets an existing Role resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleState, opts ...pulumi.ResourceOption) (*Role, error) {
	var resource Role
	err := ctx.ReadResource("aws:iam/role:Role", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Role resources.
type roleState struct {
	// Amazon Resource Name (ARN) specifying the role.
	Arn *string `pulumi:"arn"`
	// Policy that grants an entity permission to assume the role.
	//
	// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
	//
	// The following arguments are optional:
	AssumeRolePolicy interface{} `pulumi:"assumeRolePolicy"`
	// Creation date of the IAM role.
	CreateDate *string `pulumi:"createDate"`
	// Description of the role.
	Description *string `pulumi:"description"`
	// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
	ForceDetachPolicies *bool `pulumi:"forceDetachPolicies"`
	// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
	InlinePolicies    []RoleInlinePolicy `pulumi:"inlinePolicies"`
	ManagedPolicyArns []string           `pulumi:"managedPolicyArns"`
	// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
	MaxSessionDuration *int `pulumi:"maxSessionDuration"`
	// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Name *string `pulumi:"name"`
	// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Path *string `pulumi:"path"`
	// ARN of the policy that is used to set the permissions boundary for the role.
	PermissionsBoundary *string `pulumi:"permissionsBoundary"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Stable and unique string identifying the role.
	UniqueId *string `pulumi:"uniqueId"`
}

type RoleState struct {
	// Amazon Resource Name (ARN) specifying the role.
	Arn pulumi.StringPtrInput
	// Policy that grants an entity permission to assume the role.
	//
	// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
	//
	// The following arguments are optional:
	AssumeRolePolicy pulumi.Input
	// Creation date of the IAM role.
	CreateDate pulumi.StringPtrInput
	// Description of the role.
	Description pulumi.StringPtrInput
	// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
	ForceDetachPolicies pulumi.BoolPtrInput
	// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
	InlinePolicies    RoleInlinePolicyArrayInput
	ManagedPolicyArns pulumi.StringArrayInput
	// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
	MaxSessionDuration pulumi.IntPtrInput
	// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Name pulumi.StringPtrInput
	// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Path pulumi.StringPtrInput
	// ARN of the policy that is used to set the permissions boundary for the role.
	PermissionsBoundary pulumi.StringPtrInput
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Stable and unique string identifying the role.
	UniqueId pulumi.StringPtrInput
}

func (RoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleState)(nil)).Elem()
}

type roleArgs struct {
	// Policy that grants an entity permission to assume the role.
	//
	// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
	//
	// The following arguments are optional:
	AssumeRolePolicy interface{} `pulumi:"assumeRolePolicy"`
	// Description of the role.
	Description *string `pulumi:"description"`
	// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
	ForceDetachPolicies *bool `pulumi:"forceDetachPolicies"`
	// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
	InlinePolicies    []RoleInlinePolicy `pulumi:"inlinePolicies"`
	ManagedPolicyArns []string           `pulumi:"managedPolicyArns"`
	// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
	MaxSessionDuration *int `pulumi:"maxSessionDuration"`
	// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Name *string `pulumi:"name"`
	// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Path *string `pulumi:"path"`
	// ARN of the policy that is used to set the permissions boundary for the role.
	PermissionsBoundary *string `pulumi:"permissionsBoundary"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Role resource.
type RoleArgs struct {
	// Policy that grants an entity permission to assume the role.
	//
	// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
	//
	// The following arguments are optional:
	AssumeRolePolicy pulumi.Input
	// Description of the role.
	Description pulumi.StringPtrInput
	// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
	ForceDetachPolicies pulumi.BoolPtrInput
	// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
	InlinePolicies    RoleInlinePolicyArrayInput
	ManagedPolicyArns pulumi.StringArrayInput
	// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
	MaxSessionDuration pulumi.IntPtrInput
	// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Name pulumi.StringPtrInput
	// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
	Path pulumi.StringPtrInput
	// ARN of the policy that is used to set the permissions boundary for the role.
	PermissionsBoundary pulumi.StringPtrInput
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (RoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleArgs)(nil)).Elem()
}

type RoleInput interface {
	pulumi.Input

	ToRoleOutput() RoleOutput
	ToRoleOutputWithContext(ctx context.Context) RoleOutput
}

func (*Role) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil)).Elem()
}

func (i *Role) ToRoleOutput() RoleOutput {
	return i.ToRoleOutputWithContext(context.Background())
}

func (i *Role) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleOutput)
}

// RoleArrayInput is an input type that accepts RoleArray and RoleArrayOutput values.
// You can construct a concrete instance of `RoleArrayInput` via:
//
//	RoleArray{ RoleArgs{...} }
type RoleArrayInput interface {
	pulumi.Input

	ToRoleArrayOutput() RoleArrayOutput
	ToRoleArrayOutputWithContext(context.Context) RoleArrayOutput
}

type RoleArray []RoleInput

func (RoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Role)(nil)).Elem()
}

func (i RoleArray) ToRoleArrayOutput() RoleArrayOutput {
	return i.ToRoleArrayOutputWithContext(context.Background())
}

func (i RoleArray) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleArrayOutput)
}

// RoleMapInput is an input type that accepts RoleMap and RoleMapOutput values.
// You can construct a concrete instance of `RoleMapInput` via:
//
//	RoleMap{ "key": RoleArgs{...} }
type RoleMapInput interface {
	pulumi.Input

	ToRoleMapOutput() RoleMapOutput
	ToRoleMapOutputWithContext(context.Context) RoleMapOutput
}

type RoleMap map[string]RoleInput

func (RoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Role)(nil)).Elem()
}

func (i RoleMap) ToRoleMapOutput() RoleMapOutput {
	return i.ToRoleMapOutputWithContext(context.Background())
}

func (i RoleMap) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMapOutput)
}

type RoleOutput struct{ *pulumi.OutputState }

func (RoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Role)(nil)).Elem()
}

func (o RoleOutput) ToRoleOutput() RoleOutput {
	return o
}

func (o RoleOutput) ToRoleOutputWithContext(ctx context.Context) RoleOutput {
	return o
}

// Amazon Resource Name (ARN) specifying the role.
func (o RoleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Policy that grants an entity permission to assume the role.
//
// > **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `iam.Policy` resource.  However, it _can_ use an `iam.getPolicyDocument` data source. See the example above of how this works.
//
// The following arguments are optional:
func (o RoleOutput) AssumeRolePolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.AssumeRolePolicy }).(pulumi.StringOutput)
}

// Creation date of the IAM role.
func (o RoleOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.CreateDate }).(pulumi.StringOutput)
}

// Description of the role.
func (o RoleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Role) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
func (o RoleOutput) ForceDetachPolicies() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Role) pulumi.BoolPtrOutput { return v.ForceDetachPolicies }).(pulumi.BoolPtrOutput)
}

// Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, the provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
func (o RoleOutput) InlinePolicies() RoleInlinePolicyArrayOutput {
	return o.ApplyT(func(v *Role) RoleInlinePolicyArrayOutput { return v.InlinePolicies }).(RoleInlinePolicyArrayOutput)
}

func (o RoleOutput) ManagedPolicyArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Role) pulumi.StringArrayOutput { return v.ManagedPolicyArns }).(pulumi.StringArrayOutput)
}

// Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
func (o RoleOutput) MaxSessionDuration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Role) pulumi.IntPtrOutput { return v.MaxSessionDuration }).(pulumi.IntPtrOutput)
}

// Friendly name of the role. If omitted, the provider will assign a random, unique name. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
func (o RoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
func (o RoleOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
func (o RoleOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Role) pulumi.StringPtrOutput { return v.Path }).(pulumi.StringPtrOutput)
}

// ARN of the policy that is used to set the permissions boundary for the role.
func (o RoleOutput) PermissionsBoundary() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Role) pulumi.StringPtrOutput { return v.PermissionsBoundary }).(pulumi.StringPtrOutput)
}

// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o RoleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Role) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o RoleOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Role) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Stable and unique string identifying the role.
func (o RoleOutput) UniqueId() pulumi.StringOutput {
	return o.ApplyT(func(v *Role) pulumi.StringOutput { return v.UniqueId }).(pulumi.StringOutput)
}

type RoleArrayOutput struct{ *pulumi.OutputState }

func (RoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Role)(nil)).Elem()
}

func (o RoleArrayOutput) ToRoleArrayOutput() RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) ToRoleArrayOutputWithContext(ctx context.Context) RoleArrayOutput {
	return o
}

func (o RoleArrayOutput) Index(i pulumi.IntInput) RoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Role {
		return vs[0].([]*Role)[vs[1].(int)]
	}).(RoleOutput)
}

type RoleMapOutput struct{ *pulumi.OutputState }

func (RoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Role)(nil)).Elem()
}

func (o RoleMapOutput) ToRoleMapOutput() RoleMapOutput {
	return o
}

func (o RoleMapOutput) ToRoleMapOutputWithContext(ctx context.Context) RoleMapOutput {
	return o
}

func (o RoleMapOutput) MapIndex(k pulumi.StringInput) RoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Role {
		return vs[0].(map[string]*Role)[vs[1].(string)]
	}).(RoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleInput)(nil)).Elem(), &Role{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleArrayInput)(nil)).Elem(), RoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMapInput)(nil)).Elem(), RoleMap{})
	pulumi.RegisterOutputType(RoleOutput{})
	pulumi.RegisterOutputType(RoleArrayOutput{})
	pulumi.RegisterOutputType(RoleMapOutput{})
}
