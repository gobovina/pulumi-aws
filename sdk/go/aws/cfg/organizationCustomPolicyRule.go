// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Config Organization Custom Policy Rule. More information about these rules can be found in the [Enabling AWS Config Rules Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/config-rule-multi-account-deployment.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. For working with Organization Managed Rules (those invoking an AWS managed rule), see the `aws_config_organization_managed__rule` resource.
//
// > **NOTE:** This resource must be created in the Organization master account and rules will include the master account unless its ID is added to the `excludedAccounts` argument.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cfg"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cfg.NewOrganizationCustomPolicyRule(ctx, "example", &cfg.OrganizationCustomPolicyRuleArgs{
//				Name:          pulumi.String("example_rule_name"),
//				PolicyRuntime: pulumi.String("guard-2.x.x"),
//				PolicyText: pulumi.String(`let status = ['ACTIVE']
//
// rule tableisactive when
//
//	    resourceType == "AWS::DynamoDB::Table" {
//	    configuration.tableStatus == %status
//	}
//
// rule checkcompliance when
//
//	resourceType == "AWS::DynamoDB::Table"
//	tableisactive {
//	    let pitr = supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus
//	    %pitr == "ENABLED"
//	}
//
// `),
//
//				ResourceTypesScopes: pulumi.StringArray{
//					pulumi.String("AWS::DynamoDB::Table"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import a Config Organization Custom Policy Rule using the `name` argument. For example:
//
// ```sh
// $ pulumi import aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule example example_rule_name
// ```
type OrganizationCustomPolicyRule struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the rule
	Arn pulumi.StringOutput `pulumi:"arn"`
	// List of AWS account identifiers to exclude from the rule
	DebugLogDeliveryAccounts pulumi.StringArrayOutput `pulumi:"debugLogDeliveryAccounts"`
	// Description of the rule
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of AWS account identifiers to exclude from the rule
	ExcludedAccounts pulumi.StringArrayOutput `pulumi:"excludedAccounts"`
	// A string in JSON format that is passed to the AWS Config Rule Lambda Function
	InputParameters pulumi.StringPtrOutput `pulumi:"inputParameters"`
	// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
	MaximumExecutionFrequency pulumi.StringPtrOutput `pulumi:"maximumExecutionFrequency"`
	// name of the rule
	Name pulumi.StringOutput `pulumi:"name"`
	// runtime system for your organization AWS Config Custom Policy rules
	PolicyRuntime pulumi.StringOutput `pulumi:"policyRuntime"`
	// policy definition containing the logic for your organization AWS Config Custom Policy rule
	PolicyText pulumi.StringOutput `pulumi:"policyText"`
	// Identifier of the AWS resource to evaluate
	ResourceIdScope pulumi.StringPtrOutput `pulumi:"resourceIdScope"`
	// List of types of AWS resources to evaluate
	ResourceTypesScopes pulumi.StringArrayOutput `pulumi:"resourceTypesScopes"`
	// Tag key of AWS resources to evaluate
	TagKeyScope pulumi.StringPtrOutput `pulumi:"tagKeyScope"`
	// Tag value of AWS resources to evaluate
	TagValueScope pulumi.StringPtrOutput `pulumi:"tagValueScope"`
	// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
	//
	// The following arguments are optional:
	TriggerTypes pulumi.StringArrayOutput `pulumi:"triggerTypes"`
}

// NewOrganizationCustomPolicyRule registers a new resource with the given unique name, arguments, and options.
func NewOrganizationCustomPolicyRule(ctx *pulumi.Context,
	name string, args *OrganizationCustomPolicyRuleArgs, opts ...pulumi.ResourceOption) (*OrganizationCustomPolicyRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyRuntime == nil {
		return nil, errors.New("invalid value for required argument 'PolicyRuntime'")
	}
	if args.PolicyText == nil {
		return nil, errors.New("invalid value for required argument 'PolicyText'")
	}
	if args.TriggerTypes == nil {
		return nil, errors.New("invalid value for required argument 'TriggerTypes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationCustomPolicyRule
	err := ctx.RegisterResource("aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationCustomPolicyRule gets an existing OrganizationCustomPolicyRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationCustomPolicyRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationCustomPolicyRuleState, opts ...pulumi.ResourceOption) (*OrganizationCustomPolicyRule, error) {
	var resource OrganizationCustomPolicyRule
	err := ctx.ReadResource("aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationCustomPolicyRule resources.
type organizationCustomPolicyRuleState struct {
	// Amazon Resource Name (ARN) of the rule
	Arn *string `pulumi:"arn"`
	// List of AWS account identifiers to exclude from the rule
	DebugLogDeliveryAccounts []string `pulumi:"debugLogDeliveryAccounts"`
	// Description of the rule
	Description *string `pulumi:"description"`
	// List of AWS account identifiers to exclude from the rule
	ExcludedAccounts []string `pulumi:"excludedAccounts"`
	// A string in JSON format that is passed to the AWS Config Rule Lambda Function
	InputParameters *string `pulumi:"inputParameters"`
	// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
	MaximumExecutionFrequency *string `pulumi:"maximumExecutionFrequency"`
	// name of the rule
	Name *string `pulumi:"name"`
	// runtime system for your organization AWS Config Custom Policy rules
	PolicyRuntime *string `pulumi:"policyRuntime"`
	// policy definition containing the logic for your organization AWS Config Custom Policy rule
	PolicyText *string `pulumi:"policyText"`
	// Identifier of the AWS resource to evaluate
	ResourceIdScope *string `pulumi:"resourceIdScope"`
	// List of types of AWS resources to evaluate
	ResourceTypesScopes []string `pulumi:"resourceTypesScopes"`
	// Tag key of AWS resources to evaluate
	TagKeyScope *string `pulumi:"tagKeyScope"`
	// Tag value of AWS resources to evaluate
	TagValueScope *string `pulumi:"tagValueScope"`
	// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
	//
	// The following arguments are optional:
	TriggerTypes []string `pulumi:"triggerTypes"`
}

type OrganizationCustomPolicyRuleState struct {
	// Amazon Resource Name (ARN) of the rule
	Arn pulumi.StringPtrInput
	// List of AWS account identifiers to exclude from the rule
	DebugLogDeliveryAccounts pulumi.StringArrayInput
	// Description of the rule
	Description pulumi.StringPtrInput
	// List of AWS account identifiers to exclude from the rule
	ExcludedAccounts pulumi.StringArrayInput
	// A string in JSON format that is passed to the AWS Config Rule Lambda Function
	InputParameters pulumi.StringPtrInput
	// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
	MaximumExecutionFrequency pulumi.StringPtrInput
	// name of the rule
	Name pulumi.StringPtrInput
	// runtime system for your organization AWS Config Custom Policy rules
	PolicyRuntime pulumi.StringPtrInput
	// policy definition containing the logic for your organization AWS Config Custom Policy rule
	PolicyText pulumi.StringPtrInput
	// Identifier of the AWS resource to evaluate
	ResourceIdScope pulumi.StringPtrInput
	// List of types of AWS resources to evaluate
	ResourceTypesScopes pulumi.StringArrayInput
	// Tag key of AWS resources to evaluate
	TagKeyScope pulumi.StringPtrInput
	// Tag value of AWS resources to evaluate
	TagValueScope pulumi.StringPtrInput
	// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
	//
	// The following arguments are optional:
	TriggerTypes pulumi.StringArrayInput
}

func (OrganizationCustomPolicyRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationCustomPolicyRuleState)(nil)).Elem()
}

type organizationCustomPolicyRuleArgs struct {
	// List of AWS account identifiers to exclude from the rule
	DebugLogDeliveryAccounts []string `pulumi:"debugLogDeliveryAccounts"`
	// Description of the rule
	Description *string `pulumi:"description"`
	// List of AWS account identifiers to exclude from the rule
	ExcludedAccounts []string `pulumi:"excludedAccounts"`
	// A string in JSON format that is passed to the AWS Config Rule Lambda Function
	InputParameters *string `pulumi:"inputParameters"`
	// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
	MaximumExecutionFrequency *string `pulumi:"maximumExecutionFrequency"`
	// name of the rule
	Name *string `pulumi:"name"`
	// runtime system for your organization AWS Config Custom Policy rules
	PolicyRuntime string `pulumi:"policyRuntime"`
	// policy definition containing the logic for your organization AWS Config Custom Policy rule
	PolicyText string `pulumi:"policyText"`
	// Identifier of the AWS resource to evaluate
	ResourceIdScope *string `pulumi:"resourceIdScope"`
	// List of types of AWS resources to evaluate
	ResourceTypesScopes []string `pulumi:"resourceTypesScopes"`
	// Tag key of AWS resources to evaluate
	TagKeyScope *string `pulumi:"tagKeyScope"`
	// Tag value of AWS resources to evaluate
	TagValueScope *string `pulumi:"tagValueScope"`
	// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
	//
	// The following arguments are optional:
	TriggerTypes []string `pulumi:"triggerTypes"`
}

// The set of arguments for constructing a OrganizationCustomPolicyRule resource.
type OrganizationCustomPolicyRuleArgs struct {
	// List of AWS account identifiers to exclude from the rule
	DebugLogDeliveryAccounts pulumi.StringArrayInput
	// Description of the rule
	Description pulumi.StringPtrInput
	// List of AWS account identifiers to exclude from the rule
	ExcludedAccounts pulumi.StringArrayInput
	// A string in JSON format that is passed to the AWS Config Rule Lambda Function
	InputParameters pulumi.StringPtrInput
	// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
	MaximumExecutionFrequency pulumi.StringPtrInput
	// name of the rule
	Name pulumi.StringPtrInput
	// runtime system for your organization AWS Config Custom Policy rules
	PolicyRuntime pulumi.StringInput
	// policy definition containing the logic for your organization AWS Config Custom Policy rule
	PolicyText pulumi.StringInput
	// Identifier of the AWS resource to evaluate
	ResourceIdScope pulumi.StringPtrInput
	// List of types of AWS resources to evaluate
	ResourceTypesScopes pulumi.StringArrayInput
	// Tag key of AWS resources to evaluate
	TagKeyScope pulumi.StringPtrInput
	// Tag value of AWS resources to evaluate
	TagValueScope pulumi.StringPtrInput
	// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
	//
	// The following arguments are optional:
	TriggerTypes pulumi.StringArrayInput
}

func (OrganizationCustomPolicyRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationCustomPolicyRuleArgs)(nil)).Elem()
}

type OrganizationCustomPolicyRuleInput interface {
	pulumi.Input

	ToOrganizationCustomPolicyRuleOutput() OrganizationCustomPolicyRuleOutput
	ToOrganizationCustomPolicyRuleOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleOutput
}

func (*OrganizationCustomPolicyRule) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationCustomPolicyRule)(nil)).Elem()
}

func (i *OrganizationCustomPolicyRule) ToOrganizationCustomPolicyRuleOutput() OrganizationCustomPolicyRuleOutput {
	return i.ToOrganizationCustomPolicyRuleOutputWithContext(context.Background())
}

func (i *OrganizationCustomPolicyRule) ToOrganizationCustomPolicyRuleOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationCustomPolicyRuleOutput)
}

// OrganizationCustomPolicyRuleArrayInput is an input type that accepts OrganizationCustomPolicyRuleArray and OrganizationCustomPolicyRuleArrayOutput values.
// You can construct a concrete instance of `OrganizationCustomPolicyRuleArrayInput` via:
//
//	OrganizationCustomPolicyRuleArray{ OrganizationCustomPolicyRuleArgs{...} }
type OrganizationCustomPolicyRuleArrayInput interface {
	pulumi.Input

	ToOrganizationCustomPolicyRuleArrayOutput() OrganizationCustomPolicyRuleArrayOutput
	ToOrganizationCustomPolicyRuleArrayOutputWithContext(context.Context) OrganizationCustomPolicyRuleArrayOutput
}

type OrganizationCustomPolicyRuleArray []OrganizationCustomPolicyRuleInput

func (OrganizationCustomPolicyRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationCustomPolicyRule)(nil)).Elem()
}

func (i OrganizationCustomPolicyRuleArray) ToOrganizationCustomPolicyRuleArrayOutput() OrganizationCustomPolicyRuleArrayOutput {
	return i.ToOrganizationCustomPolicyRuleArrayOutputWithContext(context.Background())
}

func (i OrganizationCustomPolicyRuleArray) ToOrganizationCustomPolicyRuleArrayOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationCustomPolicyRuleArrayOutput)
}

// OrganizationCustomPolicyRuleMapInput is an input type that accepts OrganizationCustomPolicyRuleMap and OrganizationCustomPolicyRuleMapOutput values.
// You can construct a concrete instance of `OrganizationCustomPolicyRuleMapInput` via:
//
//	OrganizationCustomPolicyRuleMap{ "key": OrganizationCustomPolicyRuleArgs{...} }
type OrganizationCustomPolicyRuleMapInput interface {
	pulumi.Input

	ToOrganizationCustomPolicyRuleMapOutput() OrganizationCustomPolicyRuleMapOutput
	ToOrganizationCustomPolicyRuleMapOutputWithContext(context.Context) OrganizationCustomPolicyRuleMapOutput
}

type OrganizationCustomPolicyRuleMap map[string]OrganizationCustomPolicyRuleInput

func (OrganizationCustomPolicyRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationCustomPolicyRule)(nil)).Elem()
}

func (i OrganizationCustomPolicyRuleMap) ToOrganizationCustomPolicyRuleMapOutput() OrganizationCustomPolicyRuleMapOutput {
	return i.ToOrganizationCustomPolicyRuleMapOutputWithContext(context.Background())
}

func (i OrganizationCustomPolicyRuleMap) ToOrganizationCustomPolicyRuleMapOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationCustomPolicyRuleMapOutput)
}

type OrganizationCustomPolicyRuleOutput struct{ *pulumi.OutputState }

func (OrganizationCustomPolicyRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationCustomPolicyRule)(nil)).Elem()
}

func (o OrganizationCustomPolicyRuleOutput) ToOrganizationCustomPolicyRuleOutput() OrganizationCustomPolicyRuleOutput {
	return o
}

func (o OrganizationCustomPolicyRuleOutput) ToOrganizationCustomPolicyRuleOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleOutput {
	return o
}

// Amazon Resource Name (ARN) of the rule
func (o OrganizationCustomPolicyRuleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// List of AWS account identifiers to exclude from the rule
func (o OrganizationCustomPolicyRuleOutput) DebugLogDeliveryAccounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringArrayOutput { return v.DebugLogDeliveryAccounts }).(pulumi.StringArrayOutput)
}

// Description of the rule
func (o OrganizationCustomPolicyRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// List of AWS account identifiers to exclude from the rule
func (o OrganizationCustomPolicyRuleOutput) ExcludedAccounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringArrayOutput { return v.ExcludedAccounts }).(pulumi.StringArrayOutput)
}

// A string in JSON format that is passed to the AWS Config Rule Lambda Function
func (o OrganizationCustomPolicyRuleOutput) InputParameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.InputParameters }).(pulumi.StringPtrOutput)
}

// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
func (o OrganizationCustomPolicyRuleOutput) MaximumExecutionFrequency() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.MaximumExecutionFrequency }).(pulumi.StringPtrOutput)
}

// name of the rule
func (o OrganizationCustomPolicyRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// runtime system for your organization AWS Config Custom Policy rules
func (o OrganizationCustomPolicyRuleOutput) PolicyRuntime() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringOutput { return v.PolicyRuntime }).(pulumi.StringOutput)
}

// policy definition containing the logic for your organization AWS Config Custom Policy rule
func (o OrganizationCustomPolicyRuleOutput) PolicyText() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringOutput { return v.PolicyText }).(pulumi.StringOutput)
}

// Identifier of the AWS resource to evaluate
func (o OrganizationCustomPolicyRuleOutput) ResourceIdScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.ResourceIdScope }).(pulumi.StringPtrOutput)
}

// List of types of AWS resources to evaluate
func (o OrganizationCustomPolicyRuleOutput) ResourceTypesScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringArrayOutput { return v.ResourceTypesScopes }).(pulumi.StringArrayOutput)
}

// Tag key of AWS resources to evaluate
func (o OrganizationCustomPolicyRuleOutput) TagKeyScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.TagKeyScope }).(pulumi.StringPtrOutput)
}

// Tag value of AWS resources to evaluate
func (o OrganizationCustomPolicyRuleOutput) TagValueScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringPtrOutput { return v.TagValueScope }).(pulumi.StringPtrOutput)
}

// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
//
// The following arguments are optional:
func (o OrganizationCustomPolicyRuleOutput) TriggerTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationCustomPolicyRule) pulumi.StringArrayOutput { return v.TriggerTypes }).(pulumi.StringArrayOutput)
}

type OrganizationCustomPolicyRuleArrayOutput struct{ *pulumi.OutputState }

func (OrganizationCustomPolicyRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationCustomPolicyRule)(nil)).Elem()
}

func (o OrganizationCustomPolicyRuleArrayOutput) ToOrganizationCustomPolicyRuleArrayOutput() OrganizationCustomPolicyRuleArrayOutput {
	return o
}

func (o OrganizationCustomPolicyRuleArrayOutput) ToOrganizationCustomPolicyRuleArrayOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleArrayOutput {
	return o
}

func (o OrganizationCustomPolicyRuleArrayOutput) Index(i pulumi.IntInput) OrganizationCustomPolicyRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationCustomPolicyRule {
		return vs[0].([]*OrganizationCustomPolicyRule)[vs[1].(int)]
	}).(OrganizationCustomPolicyRuleOutput)
}

type OrganizationCustomPolicyRuleMapOutput struct{ *pulumi.OutputState }

func (OrganizationCustomPolicyRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationCustomPolicyRule)(nil)).Elem()
}

func (o OrganizationCustomPolicyRuleMapOutput) ToOrganizationCustomPolicyRuleMapOutput() OrganizationCustomPolicyRuleMapOutput {
	return o
}

func (o OrganizationCustomPolicyRuleMapOutput) ToOrganizationCustomPolicyRuleMapOutputWithContext(ctx context.Context) OrganizationCustomPolicyRuleMapOutput {
	return o
}

func (o OrganizationCustomPolicyRuleMapOutput) MapIndex(k pulumi.StringInput) OrganizationCustomPolicyRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationCustomPolicyRule {
		return vs[0].(map[string]*OrganizationCustomPolicyRule)[vs[1].(string)]
	}).(OrganizationCustomPolicyRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationCustomPolicyRuleInput)(nil)).Elem(), &OrganizationCustomPolicyRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationCustomPolicyRuleArrayInput)(nil)).Elem(), OrganizationCustomPolicyRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationCustomPolicyRuleMapInput)(nil)).Elem(), OrganizationCustomPolicyRuleMap{})
	pulumi.RegisterOutputType(OrganizationCustomPolicyRuleOutput{})
	pulumi.RegisterOutputType(OrganizationCustomPolicyRuleArrayOutput{})
	pulumi.RegisterOutputType(OrganizationCustomPolicyRuleMapOutput{})
}
