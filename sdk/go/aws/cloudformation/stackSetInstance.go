// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudformation

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a CloudFormation StackSet Instance. Instances are managed in the account and region of the StackSet after the target account permissions have been configured. Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
//
// > **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the StackSet (the `executionRoleName` argument in the `cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for StackSets to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
//
// > **NOTE:** To retain the Stack during resource destroy, ensure `retainStack` has been set to `true` in the state first. This must be completed _before_ a deployment that would destroy the resource.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudformation"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudformation.NewStackSetInstance(ctx, "example", &cloudformation.StackSetInstanceArgs{
//				AccountId:    pulumi.String("123456789012"),
//				Region:       pulumi.String("us-east-1"),
//				StackSetName: pulumi.Any(exampleAwsCloudformationStackSet.Name),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Example IAM Setup in Target Account
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
// aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "sts:AssumeRole",
// },
// Effect: pulumi.StringRef("Allow"),
// Principals: []iam.GetPolicyDocumentStatementPrincipal{
// {
// Identifiers: interface{}{
// aWSCloudFormationStackSetAdministrationRole.Arn,
// },
// Type: "AWS",
// },
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// aWSCloudFormationStackSetExecutionRole, err := iam.NewRole(ctx, "AWSCloudFormationStackSetExecutionRole", &iam.RoleArgs{
// AssumeRolePolicy: *pulumi.String(aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy.Json),
// Name: pulumi.String("AWSCloudFormationStackSetExecutionRole"),
// })
// if err != nil {
// return err
// }
// // Documentation: https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html
// // Additional IAM permissions necessary depend on the resources defined in the StackSet template
// aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicy, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
// Statements: []iam.GetPolicyDocumentStatement{
// {
// Actions: []string{
// "cloudformation:*",
// "s3:*",
// "sns:*",
// },
// Effect: pulumi.StringRef("Allow"),
// Resources: []string{
// "*",
// },
// },
// },
// }, nil);
// if err != nil {
// return err
// }
// _, err = iam.NewRolePolicy(ctx, "AWSCloudFormationStackSetExecutionRole_MinimumExecutionPolicy", &iam.RolePolicyArgs{
// Name: pulumi.String("MinimumExecutionPolicy"),
// Policy: *pulumi.String(aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicy.Json),
// Role: aWSCloudFormationStackSetExecutionRole.Name,
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
// ### Example Deployment across Organizations account
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudformation"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudformation.NewStackSetInstance(ctx, "example", &cloudformation.StackSetInstanceArgs{
//				DeploymentTargets: &cloudformation.StackSetInstanceDeploymentTargetsArgs{
//					OrganizationalUnitIds: pulumi.StringArray{
//						exampleAwsOrganizationsOrganization.Roots[0].Id,
//					},
//				},
//				Region:       pulumi.String("us-east-1"),
//				StackSetName: pulumi.Any(exampleAwsCloudformationStackSet.Name),
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
// Import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS Region separated by commas (`,`). For example:
//
// Import CloudFormation StackSet Instances when acting a delegated administrator in a member account using the StackSet name, target AWS account ID or slash (`/`) separated list of organizational unit IDs, target AWS Region and `call_as` value separated by commas (`,`). For example:
//
// Using `pulumi import`, import CloudFormation StackSet Instances that target an AWS Account ID using the StackSet name, target AWS account ID, and target AWS Region separated by commas (`,`). For example:
//
// ```sh
//
//	$ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,123456789012,us-east-1
//
// ```
//
//	Using `pulumi import`, import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS Region separated by commas (`,`). For example:
//
// ```sh
//
//	$ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,ou-sdas-123123123/ou-sdas-789789789,us-east-1
//
// ```
//
//	Using `pulumi import`, import CloudFormation StackSet Instances when acting a delegated administrator in a member account using the StackSet name, target AWS account ID or slash (`/`) separated list of organizational unit IDs, target AWS Region and `call_as` value separated by commas (`,`). For example:
//
// ```sh
//
//	$ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,ou-sdas-123123123/ou-sdas-789789789,us-east-1,DELEGATED_ADMIN
//
// ```
type StackSetInstance struct {
	pulumi.CustomResourceState

	// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
	CallAs pulumi.StringPtrOutput `pulumi:"callAs"`
	// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
	DeploymentTargets StackSetInstanceDeploymentTargetsPtrOutput `pulumi:"deploymentTargets"`
	// Preferences for how AWS CloudFormation performs a stack set operation.
	OperationPreferences StackSetInstanceOperationPreferencesPtrOutput `pulumi:"operationPreferences"`
	// Organizational unit ID in which the stack is deployed.
	OrganizationalUnitId pulumi.StringOutput `pulumi:"organizationalUnitId"`
	// Key-value map of input parameters to override from the StackSet for this Instance.
	ParameterOverrides pulumi.StringMapOutput `pulumi:"parameterOverrides"`
	// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
	Region pulumi.StringOutput `pulumi:"region"`
	// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
	RetainStack pulumi.BoolPtrOutput `pulumi:"retainStack"`
	// Stack identifier.
	StackId pulumi.StringOutput `pulumi:"stackId"`
	// List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
	StackInstanceSummaries StackSetInstanceStackInstanceSummaryArrayOutput `pulumi:"stackInstanceSummaries"`
	// Name of the StackSet.
	StackSetName pulumi.StringOutput `pulumi:"stackSetName"`
}

// NewStackSetInstance registers a new resource with the given unique name, arguments, and options.
func NewStackSetInstance(ctx *pulumi.Context,
	name string, args *StackSetInstanceArgs, opts ...pulumi.ResourceOption) (*StackSetInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StackSetName == nil {
		return nil, errors.New("invalid value for required argument 'StackSetName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StackSetInstance
	err := ctx.RegisterResource("aws:cloudformation/stackSetInstance:StackSetInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStackSetInstance gets an existing StackSetInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStackSetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackSetInstanceState, opts ...pulumi.ResourceOption) (*StackSetInstance, error) {
	var resource StackSetInstance
	err := ctx.ReadResource("aws:cloudformation/stackSetInstance:StackSetInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StackSetInstance resources.
type stackSetInstanceState struct {
	// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
	AccountId *string `pulumi:"accountId"`
	// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
	CallAs *string `pulumi:"callAs"`
	// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
	DeploymentTargets *StackSetInstanceDeploymentTargets `pulumi:"deploymentTargets"`
	// Preferences for how AWS CloudFormation performs a stack set operation.
	OperationPreferences *StackSetInstanceOperationPreferences `pulumi:"operationPreferences"`
	// Organizational unit ID in which the stack is deployed.
	OrganizationalUnitId *string `pulumi:"organizationalUnitId"`
	// Key-value map of input parameters to override from the StackSet for this Instance.
	ParameterOverrides map[string]string `pulumi:"parameterOverrides"`
	// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
	Region *string `pulumi:"region"`
	// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
	RetainStack *bool `pulumi:"retainStack"`
	// Stack identifier.
	StackId *string `pulumi:"stackId"`
	// List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
	StackInstanceSummaries []StackSetInstanceStackInstanceSummary `pulumi:"stackInstanceSummaries"`
	// Name of the StackSet.
	StackSetName *string `pulumi:"stackSetName"`
}

type StackSetInstanceState struct {
	// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
	AccountId pulumi.StringPtrInput
	// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
	CallAs pulumi.StringPtrInput
	// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
	DeploymentTargets StackSetInstanceDeploymentTargetsPtrInput
	// Preferences for how AWS CloudFormation performs a stack set operation.
	OperationPreferences StackSetInstanceOperationPreferencesPtrInput
	// Organizational unit ID in which the stack is deployed.
	OrganizationalUnitId pulumi.StringPtrInput
	// Key-value map of input parameters to override from the StackSet for this Instance.
	ParameterOverrides pulumi.StringMapInput
	// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
	Region pulumi.StringPtrInput
	// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
	RetainStack pulumi.BoolPtrInput
	// Stack identifier.
	StackId pulumi.StringPtrInput
	// List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
	StackInstanceSummaries StackSetInstanceStackInstanceSummaryArrayInput
	// Name of the StackSet.
	StackSetName pulumi.StringPtrInput
}

func (StackSetInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackSetInstanceState)(nil)).Elem()
}

type stackSetInstanceArgs struct {
	// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
	AccountId *string `pulumi:"accountId"`
	// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
	CallAs *string `pulumi:"callAs"`
	// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
	DeploymentTargets *StackSetInstanceDeploymentTargets `pulumi:"deploymentTargets"`
	// Preferences for how AWS CloudFormation performs a stack set operation.
	OperationPreferences *StackSetInstanceOperationPreferences `pulumi:"operationPreferences"`
	// Key-value map of input parameters to override from the StackSet for this Instance.
	ParameterOverrides map[string]string `pulumi:"parameterOverrides"`
	// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
	Region *string `pulumi:"region"`
	// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
	RetainStack *bool `pulumi:"retainStack"`
	// Name of the StackSet.
	StackSetName string `pulumi:"stackSetName"`
}

// The set of arguments for constructing a StackSetInstance resource.
type StackSetInstanceArgs struct {
	// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
	AccountId pulumi.StringPtrInput
	// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
	CallAs pulumi.StringPtrInput
	// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
	DeploymentTargets StackSetInstanceDeploymentTargetsPtrInput
	// Preferences for how AWS CloudFormation performs a stack set operation.
	OperationPreferences StackSetInstanceOperationPreferencesPtrInput
	// Key-value map of input parameters to override from the StackSet for this Instance.
	ParameterOverrides pulumi.StringMapInput
	// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
	Region pulumi.StringPtrInput
	// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
	RetainStack pulumi.BoolPtrInput
	// Name of the StackSet.
	StackSetName pulumi.StringInput
}

func (StackSetInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackSetInstanceArgs)(nil)).Elem()
}

type StackSetInstanceInput interface {
	pulumi.Input

	ToStackSetInstanceOutput() StackSetInstanceOutput
	ToStackSetInstanceOutputWithContext(ctx context.Context) StackSetInstanceOutput
}

func (*StackSetInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**StackSetInstance)(nil)).Elem()
}

func (i *StackSetInstance) ToStackSetInstanceOutput() StackSetInstanceOutput {
	return i.ToStackSetInstanceOutputWithContext(context.Background())
}

func (i *StackSetInstance) ToStackSetInstanceOutputWithContext(ctx context.Context) StackSetInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackSetInstanceOutput)
}

// StackSetInstanceArrayInput is an input type that accepts StackSetInstanceArray and StackSetInstanceArrayOutput values.
// You can construct a concrete instance of `StackSetInstanceArrayInput` via:
//
//	StackSetInstanceArray{ StackSetInstanceArgs{...} }
type StackSetInstanceArrayInput interface {
	pulumi.Input

	ToStackSetInstanceArrayOutput() StackSetInstanceArrayOutput
	ToStackSetInstanceArrayOutputWithContext(context.Context) StackSetInstanceArrayOutput
}

type StackSetInstanceArray []StackSetInstanceInput

func (StackSetInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StackSetInstance)(nil)).Elem()
}

func (i StackSetInstanceArray) ToStackSetInstanceArrayOutput() StackSetInstanceArrayOutput {
	return i.ToStackSetInstanceArrayOutputWithContext(context.Background())
}

func (i StackSetInstanceArray) ToStackSetInstanceArrayOutputWithContext(ctx context.Context) StackSetInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackSetInstanceArrayOutput)
}

// StackSetInstanceMapInput is an input type that accepts StackSetInstanceMap and StackSetInstanceMapOutput values.
// You can construct a concrete instance of `StackSetInstanceMapInput` via:
//
//	StackSetInstanceMap{ "key": StackSetInstanceArgs{...} }
type StackSetInstanceMapInput interface {
	pulumi.Input

	ToStackSetInstanceMapOutput() StackSetInstanceMapOutput
	ToStackSetInstanceMapOutputWithContext(context.Context) StackSetInstanceMapOutput
}

type StackSetInstanceMap map[string]StackSetInstanceInput

func (StackSetInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StackSetInstance)(nil)).Elem()
}

func (i StackSetInstanceMap) ToStackSetInstanceMapOutput() StackSetInstanceMapOutput {
	return i.ToStackSetInstanceMapOutputWithContext(context.Background())
}

func (i StackSetInstanceMap) ToStackSetInstanceMapOutputWithContext(ctx context.Context) StackSetInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackSetInstanceMapOutput)
}

type StackSetInstanceOutput struct{ *pulumi.OutputState }

func (StackSetInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StackSetInstance)(nil)).Elem()
}

func (o StackSetInstanceOutput) ToStackSetInstanceOutput() StackSetInstanceOutput {
	return o
}

func (o StackSetInstanceOutput) ToStackSetInstanceOutputWithContext(ctx context.Context) StackSetInstanceOutput {
	return o
}

// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
func (o StackSetInstanceOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
func (o StackSetInstanceOutput) CallAs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringPtrOutput { return v.CallAs }).(pulumi.StringPtrOutput)
}

// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
func (o StackSetInstanceOutput) DeploymentTargets() StackSetInstanceDeploymentTargetsPtrOutput {
	return o.ApplyT(func(v *StackSetInstance) StackSetInstanceDeploymentTargetsPtrOutput { return v.DeploymentTargets }).(StackSetInstanceDeploymentTargetsPtrOutput)
}

// Preferences for how AWS CloudFormation performs a stack set operation.
func (o StackSetInstanceOutput) OperationPreferences() StackSetInstanceOperationPreferencesPtrOutput {
	return o.ApplyT(func(v *StackSetInstance) StackSetInstanceOperationPreferencesPtrOutput { return v.OperationPreferences }).(StackSetInstanceOperationPreferencesPtrOutput)
}

// Organizational unit ID in which the stack is deployed.
func (o StackSetInstanceOutput) OrganizationalUnitId() pulumi.StringOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringOutput { return v.OrganizationalUnitId }).(pulumi.StringOutput)
}

// Key-value map of input parameters to override from the StackSet for this Instance.
func (o StackSetInstanceOutput) ParameterOverrides() pulumi.StringMapOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringMapOutput { return v.ParameterOverrides }).(pulumi.StringMapOutput)
}

// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
func (o StackSetInstanceOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
func (o StackSetInstanceOutput) RetainStack() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.BoolPtrOutput { return v.RetainStack }).(pulumi.BoolPtrOutput)
}

// Stack identifier.
func (o StackSetInstanceOutput) StackId() pulumi.StringOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringOutput { return v.StackId }).(pulumi.StringOutput)
}

// List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
func (o StackSetInstanceOutput) StackInstanceSummaries() StackSetInstanceStackInstanceSummaryArrayOutput {
	return o.ApplyT(func(v *StackSetInstance) StackSetInstanceStackInstanceSummaryArrayOutput {
		return v.StackInstanceSummaries
	}).(StackSetInstanceStackInstanceSummaryArrayOutput)
}

// Name of the StackSet.
func (o StackSetInstanceOutput) StackSetName() pulumi.StringOutput {
	return o.ApplyT(func(v *StackSetInstance) pulumi.StringOutput { return v.StackSetName }).(pulumi.StringOutput)
}

type StackSetInstanceArrayOutput struct{ *pulumi.OutputState }

func (StackSetInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StackSetInstance)(nil)).Elem()
}

func (o StackSetInstanceArrayOutput) ToStackSetInstanceArrayOutput() StackSetInstanceArrayOutput {
	return o
}

func (o StackSetInstanceArrayOutput) ToStackSetInstanceArrayOutputWithContext(ctx context.Context) StackSetInstanceArrayOutput {
	return o
}

func (o StackSetInstanceArrayOutput) Index(i pulumi.IntInput) StackSetInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StackSetInstance {
		return vs[0].([]*StackSetInstance)[vs[1].(int)]
	}).(StackSetInstanceOutput)
}

type StackSetInstanceMapOutput struct{ *pulumi.OutputState }

func (StackSetInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StackSetInstance)(nil)).Elem()
}

func (o StackSetInstanceMapOutput) ToStackSetInstanceMapOutput() StackSetInstanceMapOutput {
	return o
}

func (o StackSetInstanceMapOutput) ToStackSetInstanceMapOutputWithContext(ctx context.Context) StackSetInstanceMapOutput {
	return o
}

func (o StackSetInstanceMapOutput) MapIndex(k pulumi.StringInput) StackSetInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StackSetInstance {
		return vs[0].(map[string]*StackSetInstance)[vs[1].(string)]
	}).(StackSetInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StackSetInstanceInput)(nil)).Elem(), &StackSetInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackSetInstanceArrayInput)(nil)).Elem(), StackSetInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackSetInstanceMapInput)(nil)).Elem(), StackSetInstanceMap{})
	pulumi.RegisterOutputType(StackSetInstanceOutput{})
	pulumi.RegisterOutputType(StackSetInstanceArrayOutput{})
	pulumi.RegisterOutputType(StackSetInstanceMapOutput{})
}
