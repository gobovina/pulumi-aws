// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dlm

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.
//
// ## Example Usage
//
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dlm"
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
//									"dlm.amazonaws.com",
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
//			dlmLifecycleRole, err := iam.NewRole(ctx, "dlm_lifecycle_role", &iam.RoleArgs{
//				Name:             pulumi.String("dlm-lifecycle-role"),
//				AssumeRolePolicy: pulumi.String(assumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			dlmLifecycle, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"ec2:CreateSnapshot",
//							"ec2:CreateSnapshots",
//							"ec2:DeleteSnapshot",
//							"ec2:DescribeInstances",
//							"ec2:DescribeVolumes",
//							"ec2:DescribeSnapshots",
//						},
//						Resources: []string{
//							"*",
//						},
//					},
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"ec2:CreateTags",
//						},
//						Resources: []string{
//							"arn:aws:ec2:*::snapshot/*",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicy(ctx, "dlm_lifecycle", &iam.RolePolicyArgs{
//				Name:   pulumi.String("dlm-lifecycle-policy"),
//				Role:   dlmLifecycleRole.ID(),
//				Policy: pulumi.String(dlmLifecycle.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dlm.NewLifecyclePolicy(ctx, "example", &dlm.LifecyclePolicyArgs{
//				Description:      pulumi.String("example DLM lifecycle policy"),
//				ExecutionRoleArn: dlmLifecycleRole.Arn,
//				State:            pulumi.String("ENABLED"),
//				PolicyDetails: &dlm.LifecyclePolicyPolicyDetailsArgs{
//					ResourceTypes: pulumi.StringArray("VOLUME"),
//					Schedules: dlm.LifecyclePolicyPolicyDetailsScheduleArray{
//						&dlm.LifecyclePolicyPolicyDetailsScheduleArgs{
//							Name: pulumi.String("2 weeks of daily snapshots"),
//							CreateRule: &dlm.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs{
//								Interval:     pulumi.Int(24),
//								IntervalUnit: pulumi.String("HOURS"),
//								Times:        pulumi.String("23:45"),
//							},
//							RetainRule: &dlm.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs{
//								Count: pulumi.Int(14),
//							},
//							TagsToAdd: pulumi.StringMap{
//								"SnapshotCreator": pulumi.String("DLM"),
//							},
//							CopyTags: pulumi.Bool(false),
//						},
//					},
//					TargetTags: pulumi.StringMap{
//						"Snapshot": pulumi.String("true"),
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
//
// ### Example Cross-Region Snapshot Copy Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dlm"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// ...other configuration...
//			current, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			key, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid:    pulumi.StringRef("Enable IAM User Permissions"),
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "AWS",
//								Identifiers: []string{
//									fmt.Sprintf("arn:aws:iam::%v:root", current.AccountId),
//								},
//							},
//						},
//						Actions: []string{
//							"kms:*",
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
//			dlmCrossRegionCopyCmk, err := kms.NewKey(ctx, "dlm_cross_region_copy_cmk", &kms.KeyArgs{
//				Description: pulumi.String("Example Alternate Region KMS Key"),
//				Policy:      pulumi.String(key.Json),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dlm.NewLifecyclePolicy(ctx, "example", &dlm.LifecyclePolicyArgs{
//				Description:      pulumi.String("example DLM lifecycle policy"),
//				ExecutionRoleArn: pulumi.Any(dlmLifecycleRole.Arn),
//				State:            pulumi.String("ENABLED"),
//				PolicyDetails: &dlm.LifecyclePolicyPolicyDetailsArgs{
//					ResourceTypes: pulumi.StringArray("VOLUME"),
//					Schedules: dlm.LifecyclePolicyPolicyDetailsScheduleArray{
//						&dlm.LifecyclePolicyPolicyDetailsScheduleArgs{
//							Name: pulumi.String("2 weeks of daily snapshots"),
//							CreateRule: &dlm.LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs{
//								Interval:     pulumi.Int(24),
//								IntervalUnit: pulumi.String("HOURS"),
//								Times:        pulumi.String("23:45"),
//							},
//							RetainRule: &dlm.LifecyclePolicyPolicyDetailsScheduleRetainRuleArgs{
//								Count: pulumi.Int(14),
//							},
//							TagsToAdd: pulumi.StringMap{
//								"SnapshotCreator": pulumi.String("DLM"),
//							},
//							CopyTags: pulumi.Bool(false),
//							CrossRegionCopyRules: dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArray{
//								&dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleArgs{
//									Target:    pulumi.String("us-west-2"),
//									Encrypted: pulumi.Bool(true),
//									CmkArn:    dlmCrossRegionCopyCmk.Arn,
//									CopyTags:  pulumi.Bool(true),
//									RetainRule: &dlm.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs{
//										Interval:     pulumi.Int(30),
//										IntervalUnit: pulumi.String("DAYS"),
//									},
//								},
//							},
//						},
//					},
//					TargetTags: pulumi.StringMap{
//						"Snapshot": pulumi.String("true"),
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
//
// ### Example Event Based Policy Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/dlm"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := aws.GetCallerIdentity(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dlm.NewLifecyclePolicy(ctx, "example", &dlm.LifecyclePolicyArgs{
//				Description:      pulumi.String("tf-acc-basic"),
//				ExecutionRoleArn: pulumi.Any(exampleAwsIamRole.Arn),
//				PolicyDetails: &dlm.LifecyclePolicyPolicyDetailsArgs{
//					PolicyType: pulumi.String("EVENT_BASED_POLICY"),
//					Action: &dlm.LifecyclePolicyPolicyDetailsActionArgs{
//						Name: pulumi.String("tf-acc-basic"),
//						CrossRegionCopies: dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArray{
//							&dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs{
//								EncryptionConfiguration: nil,
//								RetainRule: &dlm.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRuleArgs{
//									Interval:     pulumi.Int(15),
//									IntervalUnit: pulumi.String("MONTHS"),
//								},
//								Target: pulumi.String("us-east-1"),
//							},
//						},
//					},
//					EventSource: &dlm.LifecyclePolicyPolicyDetailsEventSourceArgs{
//						Type: pulumi.String("MANAGED_CWE"),
//						Parameters: &dlm.LifecyclePolicyPolicyDetailsEventSourceParametersArgs{
//							DescriptionRegex: pulumi.String("^.*Created for policy: policy-1234567890abcdef0.*$"),
//							EventType:        pulumi.String("shareSnapshot"),
//							SnapshotOwners: pulumi.StringArray{
//								pulumi.String(current.AccountId),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			example, err := iam.LookupPolicy(ctx, &iam.LookupPolicyArgs{
//				Name: pulumi.StringRef("AWSDataLifecycleManagerServiceRole"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicyAttachment(ctx, "example", &iam.RolePolicyAttachmentArgs{
//				Role:      pulumi.Any(exampleAwsIamRole.Id),
//				PolicyArn: pulumi.String(example.Arn),
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
// Using `pulumi import`, import DLM lifecycle policies using their policy ID. For example:
//
// ```sh
// $ pulumi import aws:dlm/lifecyclePolicy:LifecyclePolicy example policy-abcdef12345678901
// ```
type LifecyclePolicy struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A description for the DLM lifecycle policy.
	Description pulumi.StringOutput `pulumi:"description"`
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn pulumi.StringOutput `pulumi:"executionRoleArn"`
	// See the `policyDetails` configuration block. Max of 1.
	PolicyDetails LifecyclePolicyPolicyDetailsOutput `pulumi:"policyDetails"`
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State pulumi.StringPtrOutput `pulumi:"state"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewLifecyclePolicy registers a new resource with the given unique name, arguments, and options.
func NewLifecyclePolicy(ctx *pulumi.Context,
	name string, args *LifecyclePolicyArgs, opts ...pulumi.ResourceOption) (*LifecyclePolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.ExecutionRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ExecutionRoleArn'")
	}
	if args.PolicyDetails == nil {
		return nil, errors.New("invalid value for required argument 'PolicyDetails'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LifecyclePolicy
	err := ctx.RegisterResource("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLifecyclePolicy gets an existing LifecyclePolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLifecyclePolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LifecyclePolicyState, opts ...pulumi.ResourceOption) (*LifecyclePolicy, error) {
	var resource LifecyclePolicy
	err := ctx.ReadResource("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LifecyclePolicy resources.
type lifecyclePolicyState struct {
	// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
	Arn *string `pulumi:"arn"`
	// A description for the DLM lifecycle policy.
	Description *string `pulumi:"description"`
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn *string `pulumi:"executionRoleArn"`
	// See the `policyDetails` configuration block. Max of 1.
	PolicyDetails *LifecyclePolicyPolicyDetails `pulumi:"policyDetails"`
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State *string `pulumi:"state"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type LifecyclePolicyState struct {
	// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
	Arn pulumi.StringPtrInput
	// A description for the DLM lifecycle policy.
	Description pulumi.StringPtrInput
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn pulumi.StringPtrInput
	// See the `policyDetails` configuration block. Max of 1.
	PolicyDetails LifecyclePolicyPolicyDetailsPtrInput
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (LifecyclePolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*lifecyclePolicyState)(nil)).Elem()
}

type lifecyclePolicyArgs struct {
	// A description for the DLM lifecycle policy.
	Description string `pulumi:"description"`
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn string `pulumi:"executionRoleArn"`
	// See the `policyDetails` configuration block. Max of 1.
	PolicyDetails LifecyclePolicyPolicyDetails `pulumi:"policyDetails"`
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State *string `pulumi:"state"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a LifecyclePolicy resource.
type LifecyclePolicyArgs struct {
	// A description for the DLM lifecycle policy.
	Description pulumi.StringInput
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn pulumi.StringInput
	// See the `policyDetails` configuration block. Max of 1.
	PolicyDetails LifecyclePolicyPolicyDetailsInput
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (LifecyclePolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lifecyclePolicyArgs)(nil)).Elem()
}

type LifecyclePolicyInput interface {
	pulumi.Input

	ToLifecyclePolicyOutput() LifecyclePolicyOutput
	ToLifecyclePolicyOutputWithContext(ctx context.Context) LifecyclePolicyOutput
}

func (*LifecyclePolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**LifecyclePolicy)(nil)).Elem()
}

func (i *LifecyclePolicy) ToLifecyclePolicyOutput() LifecyclePolicyOutput {
	return i.ToLifecyclePolicyOutputWithContext(context.Background())
}

func (i *LifecyclePolicy) ToLifecyclePolicyOutputWithContext(ctx context.Context) LifecyclePolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LifecyclePolicyOutput)
}

// LifecyclePolicyArrayInput is an input type that accepts LifecyclePolicyArray and LifecyclePolicyArrayOutput values.
// You can construct a concrete instance of `LifecyclePolicyArrayInput` via:
//
//	LifecyclePolicyArray{ LifecyclePolicyArgs{...} }
type LifecyclePolicyArrayInput interface {
	pulumi.Input

	ToLifecyclePolicyArrayOutput() LifecyclePolicyArrayOutput
	ToLifecyclePolicyArrayOutputWithContext(context.Context) LifecyclePolicyArrayOutput
}

type LifecyclePolicyArray []LifecyclePolicyInput

func (LifecyclePolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LifecyclePolicy)(nil)).Elem()
}

func (i LifecyclePolicyArray) ToLifecyclePolicyArrayOutput() LifecyclePolicyArrayOutput {
	return i.ToLifecyclePolicyArrayOutputWithContext(context.Background())
}

func (i LifecyclePolicyArray) ToLifecyclePolicyArrayOutputWithContext(ctx context.Context) LifecyclePolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LifecyclePolicyArrayOutput)
}

// LifecyclePolicyMapInput is an input type that accepts LifecyclePolicyMap and LifecyclePolicyMapOutput values.
// You can construct a concrete instance of `LifecyclePolicyMapInput` via:
//
//	LifecyclePolicyMap{ "key": LifecyclePolicyArgs{...} }
type LifecyclePolicyMapInput interface {
	pulumi.Input

	ToLifecyclePolicyMapOutput() LifecyclePolicyMapOutput
	ToLifecyclePolicyMapOutputWithContext(context.Context) LifecyclePolicyMapOutput
}

type LifecyclePolicyMap map[string]LifecyclePolicyInput

func (LifecyclePolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LifecyclePolicy)(nil)).Elem()
}

func (i LifecyclePolicyMap) ToLifecyclePolicyMapOutput() LifecyclePolicyMapOutput {
	return i.ToLifecyclePolicyMapOutputWithContext(context.Background())
}

func (i LifecyclePolicyMap) ToLifecyclePolicyMapOutputWithContext(ctx context.Context) LifecyclePolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LifecyclePolicyMapOutput)
}

type LifecyclePolicyOutput struct{ *pulumi.OutputState }

func (LifecyclePolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LifecyclePolicy)(nil)).Elem()
}

func (o LifecyclePolicyOutput) ToLifecyclePolicyOutput() LifecyclePolicyOutput {
	return o
}

func (o LifecyclePolicyOutput) ToLifecyclePolicyOutputWithContext(ctx context.Context) LifecyclePolicyOutput {
	return o
}

// Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
func (o LifecyclePolicyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A description for the DLM lifecycle policy.
func (o LifecyclePolicyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The ARN of an IAM role that is able to be assumed by the DLM service.
func (o LifecyclePolicyOutput) ExecutionRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringOutput { return v.ExecutionRoleArn }).(pulumi.StringOutput)
}

// See the `policyDetails` configuration block. Max of 1.
func (o LifecyclePolicyOutput) PolicyDetails() LifecyclePolicyPolicyDetailsOutput {
	return o.ApplyT(func(v *LifecyclePolicy) LifecyclePolicyPolicyDetailsOutput { return v.PolicyDetails }).(LifecyclePolicyPolicyDetailsOutput)
}

// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
func (o LifecyclePolicyOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o LifecyclePolicyOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o LifecyclePolicyOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LifecyclePolicy) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type LifecyclePolicyArrayOutput struct{ *pulumi.OutputState }

func (LifecyclePolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LifecyclePolicy)(nil)).Elem()
}

func (o LifecyclePolicyArrayOutput) ToLifecyclePolicyArrayOutput() LifecyclePolicyArrayOutput {
	return o
}

func (o LifecyclePolicyArrayOutput) ToLifecyclePolicyArrayOutputWithContext(ctx context.Context) LifecyclePolicyArrayOutput {
	return o
}

func (o LifecyclePolicyArrayOutput) Index(i pulumi.IntInput) LifecyclePolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LifecyclePolicy {
		return vs[0].([]*LifecyclePolicy)[vs[1].(int)]
	}).(LifecyclePolicyOutput)
}

type LifecyclePolicyMapOutput struct{ *pulumi.OutputState }

func (LifecyclePolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LifecyclePolicy)(nil)).Elem()
}

func (o LifecyclePolicyMapOutput) ToLifecyclePolicyMapOutput() LifecyclePolicyMapOutput {
	return o
}

func (o LifecyclePolicyMapOutput) ToLifecyclePolicyMapOutputWithContext(ctx context.Context) LifecyclePolicyMapOutput {
	return o
}

func (o LifecyclePolicyMapOutput) MapIndex(k pulumi.StringInput) LifecyclePolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LifecyclePolicy {
		return vs[0].(map[string]*LifecyclePolicy)[vs[1].(string)]
	}).(LifecyclePolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LifecyclePolicyInput)(nil)).Elem(), &LifecyclePolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*LifecyclePolicyArrayInput)(nil)).Elem(), LifecyclePolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LifecyclePolicyMapInput)(nil)).Elem(), LifecyclePolicyMap{})
	pulumi.RegisterOutputType(LifecyclePolicyOutput{})
	pulumi.RegisterOutputType(LifecyclePolicyArrayOutput{})
	pulumi.RegisterOutputType(LifecyclePolicyMapOutput{})
}
