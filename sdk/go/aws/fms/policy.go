// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create an AWS Firewall Manager policy. You need to be using AWS organizations and have enabled the Firewall Manager administrator account.
//
// > **NOTE:** Due to limitations with testing, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/fms"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/wafregional"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleRuleGroup, err := wafregional.NewRuleGroup(ctx, "exampleRuleGroup", &wafregional.RuleGroupArgs{
//				MetricName: pulumi.String("WAFRuleGroupExample"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = fms.NewPolicy(ctx, "examplePolicy", &fms.PolicyArgs{
//				ExcludeResourceTags: pulumi.Bool(false),
//				RemediationEnabled:  pulumi.Bool(false),
//				ResourceType:        pulumi.String("AWS::ElasticLoadBalancingV2::LoadBalancer"),
//				SecurityServicePolicyData: &fms.PolicySecurityServicePolicyDataArgs{
//					Type: pulumi.String("WAF"),
//					ManagedServiceData: exampleRuleGroup.ID().ApplyT(func(id string) (pulumi.String, error) {
//						var _zero pulumi.String
//						tmpJSON0, err := json.Marshal(map[string]interface{}{
//							"type": "WAF",
//							"ruleGroups": []map[string]interface{}{
//								map[string]interface{}{
//									"id": id,
//									"overrideAction": map[string]interface{}{
//										"type": "COUNT",
//									},
//								},
//							},
//							"defaultAction": map[string]interface{}{
//								"type": "BLOCK",
//							},
//							"overrideCustomerWebACLAssociation": false,
//						})
//						if err != nil {
//							return _zero, err
//						}
//						json0 := string(tmpJSON0)
//						return pulumi.String(json0), nil
//					}).(pulumi.StringOutput),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example-fms-policy"),
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
// ## Import
//
// Using `pulumi import`, import Firewall Manager policies using the policy ID. For example:
//
// ```sh
//
//	$ pulumi import aws:fms/policy:Policy example 5be49585-a7e3-4c49-dde1-a179fe4a619a
//
// ```
type Policy struct {
	pulumi.CustomResourceState

	Arn pulumi.StringOutput `pulumi:"arn"`
	// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
	DeleteAllPolicyResources pulumi.BoolPtrOutput `pulumi:"deleteAllPolicyResources"`
	// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
	DeleteUnusedFmManagedResources pulumi.BoolPtrOutput `pulumi:"deleteUnusedFmManagedResources"`
	// The description of the AWS Network Firewall firewall policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A map of lists of accounts and OU's to exclude from the policy.
	ExcludeMap PolicyExcludeMapPtrOutput `pulumi:"excludeMap"`
	// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
	ExcludeResourceTags pulumi.BoolOutput `pulumi:"excludeResourceTags"`
	// A map of lists of accounts and OU's to include in the policy.
	IncludeMap PolicyIncludeMapPtrOutput `pulumi:"includeMap"`
	// The friendly name of the AWS Firewall Manager Policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// A unique identifier for each update to the policy.
	PolicyUpdateToken pulumi.StringOutput `pulumi:"policyUpdateToken"`
	// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
	RemediationEnabled pulumi.BoolPtrOutput `pulumi:"remediationEnabled"`
	// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
	ResourceTags pulumi.StringMapOutput `pulumi:"resourceTags"`
	// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
	ResourceType pulumi.StringOutput `pulumi:"resourceType"`
	// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
	ResourceTypeLists pulumi.StringArrayOutput `pulumi:"resourceTypeLists"`
	// The objects to include in Security Service Policy Data. Documented below.
	SecurityServicePolicyData PolicySecurityServicePolicyDataOutput `pulumi:"securityServicePolicyData"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExcludeResourceTags == nil {
		return nil, errors.New("invalid value for required argument 'ExcludeResourceTags'")
	}
	if args.SecurityServicePolicyData == nil {
		return nil, errors.New("invalid value for required argument 'SecurityServicePolicyData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Policy
	err := ctx.RegisterResource("aws:fms/policy:Policy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicy gets an existing Policy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyState, opts ...pulumi.ResourceOption) (*Policy, error) {
	var resource Policy
	err := ctx.ReadResource("aws:fms/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	Arn *string `pulumi:"arn"`
	// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
	DeleteAllPolicyResources *bool `pulumi:"deleteAllPolicyResources"`
	// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
	DeleteUnusedFmManagedResources *bool `pulumi:"deleteUnusedFmManagedResources"`
	// The description of the AWS Network Firewall firewall policy.
	Description *string `pulumi:"description"`
	// A map of lists of accounts and OU's to exclude from the policy.
	ExcludeMap *PolicyExcludeMap `pulumi:"excludeMap"`
	// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
	ExcludeResourceTags *bool `pulumi:"excludeResourceTags"`
	// A map of lists of accounts and OU's to include in the policy.
	IncludeMap *PolicyIncludeMap `pulumi:"includeMap"`
	// The friendly name of the AWS Firewall Manager Policy.
	Name *string `pulumi:"name"`
	// A unique identifier for each update to the policy.
	PolicyUpdateToken *string `pulumi:"policyUpdateToken"`
	// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
	RemediationEnabled *bool `pulumi:"remediationEnabled"`
	// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
	ResourceTags map[string]string `pulumi:"resourceTags"`
	// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
	ResourceType *string `pulumi:"resourceType"`
	// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
	ResourceTypeLists []string `pulumi:"resourceTypeLists"`
	// The objects to include in Security Service Policy Data. Documented below.
	SecurityServicePolicyData *PolicySecurityServicePolicyData `pulumi:"securityServicePolicyData"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type PolicyState struct {
	Arn pulumi.StringPtrInput
	// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
	DeleteAllPolicyResources pulumi.BoolPtrInput
	// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
	DeleteUnusedFmManagedResources pulumi.BoolPtrInput
	// The description of the AWS Network Firewall firewall policy.
	Description pulumi.StringPtrInput
	// A map of lists of accounts and OU's to exclude from the policy.
	ExcludeMap PolicyExcludeMapPtrInput
	// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
	ExcludeResourceTags pulumi.BoolPtrInput
	// A map of lists of accounts and OU's to include in the policy.
	IncludeMap PolicyIncludeMapPtrInput
	// The friendly name of the AWS Firewall Manager Policy.
	Name pulumi.StringPtrInput
	// A unique identifier for each update to the policy.
	PolicyUpdateToken pulumi.StringPtrInput
	// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
	RemediationEnabled pulumi.BoolPtrInput
	// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
	ResourceTags pulumi.StringMapInput
	// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
	ResourceType pulumi.StringPtrInput
	// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
	ResourceTypeLists pulumi.StringArrayInput
	// The objects to include in Security Service Policy Data. Documented below.
	SecurityServicePolicyData PolicySecurityServicePolicyDataPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
	DeleteAllPolicyResources *bool `pulumi:"deleteAllPolicyResources"`
	// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
	DeleteUnusedFmManagedResources *bool `pulumi:"deleteUnusedFmManagedResources"`
	// The description of the AWS Network Firewall firewall policy.
	Description *string `pulumi:"description"`
	// A map of lists of accounts and OU's to exclude from the policy.
	ExcludeMap *PolicyExcludeMap `pulumi:"excludeMap"`
	// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
	ExcludeResourceTags bool `pulumi:"excludeResourceTags"`
	// A map of lists of accounts and OU's to include in the policy.
	IncludeMap *PolicyIncludeMap `pulumi:"includeMap"`
	// The friendly name of the AWS Firewall Manager Policy.
	Name *string `pulumi:"name"`
	// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
	RemediationEnabled *bool `pulumi:"remediationEnabled"`
	// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
	ResourceTags map[string]string `pulumi:"resourceTags"`
	// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
	ResourceType *string `pulumi:"resourceType"`
	// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
	ResourceTypeLists []string `pulumi:"resourceTypeLists"`
	// The objects to include in Security Service Policy Data. Documented below.
	SecurityServicePolicyData PolicySecurityServicePolicyData `pulumi:"securityServicePolicyData"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
	DeleteAllPolicyResources pulumi.BoolPtrInput
	// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
	DeleteUnusedFmManagedResources pulumi.BoolPtrInput
	// The description of the AWS Network Firewall firewall policy.
	Description pulumi.StringPtrInput
	// A map of lists of accounts and OU's to exclude from the policy.
	ExcludeMap PolicyExcludeMapPtrInput
	// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
	ExcludeResourceTags pulumi.BoolInput
	// A map of lists of accounts and OU's to include in the policy.
	IncludeMap PolicyIncludeMapPtrInput
	// The friendly name of the AWS Firewall Manager Policy.
	Name pulumi.StringPtrInput
	// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
	RemediationEnabled pulumi.BoolPtrInput
	// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
	ResourceTags pulumi.StringMapInput
	// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
	ResourceType pulumi.StringPtrInput
	// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
	ResourceTypeLists pulumi.StringArrayInput
	// The objects to include in Security Service Policy Data. Documented below.
	SecurityServicePolicyData PolicySecurityServicePolicyDataInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapInput
}

func (PolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyArgs)(nil)).Elem()
}

type PolicyInput interface {
	pulumi.Input

	ToPolicyOutput() PolicyOutput
	ToPolicyOutputWithContext(ctx context.Context) PolicyOutput
}

func (*Policy) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//	PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (i PolicyArray) ToPolicyArrayOutput() PolicyArrayOutput {
	return i.ToPolicyArrayOutputWithContext(context.Background())
}

func (i PolicyArray) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyArrayOutput)
}

// PolicyMapInput is an input type that accepts PolicyMap and PolicyMapOutput values.
// You can construct a concrete instance of `PolicyMapInput` via:
//
//	PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct{ *pulumi.OutputState }

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

func (o PolicyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
func (o PolicyOutput) DeleteAllPolicyResources() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.BoolPtrOutput { return v.DeleteAllPolicyResources }).(pulumi.BoolPtrOutput)
}

// If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
func (o PolicyOutput) DeleteUnusedFmManagedResources() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.BoolPtrOutput { return v.DeleteUnusedFmManagedResources }).(pulumi.BoolPtrOutput)
}

// The description of the AWS Network Firewall firewall policy.
func (o PolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A map of lists of accounts and OU's to exclude from the policy.
func (o PolicyOutput) ExcludeMap() PolicyExcludeMapPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyExcludeMapPtrOutput { return v.ExcludeMap }).(PolicyExcludeMapPtrOutput)
}

// A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
func (o PolicyOutput) ExcludeResourceTags() pulumi.BoolOutput {
	return o.ApplyT(func(v *Policy) pulumi.BoolOutput { return v.ExcludeResourceTags }).(pulumi.BoolOutput)
}

// A map of lists of accounts and OU's to include in the policy.
func (o PolicyOutput) IncludeMap() PolicyIncludeMapPtrOutput {
	return o.ApplyT(func(v *Policy) PolicyIncludeMapPtrOutput { return v.IncludeMap }).(PolicyIncludeMapPtrOutput)
}

// The friendly name of the AWS Firewall Manager Policy.
func (o PolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A unique identifier for each update to the policy.
func (o PolicyOutput) PolicyUpdateToken() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.PolicyUpdateToken }).(pulumi.StringOutput)
}

// A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
func (o PolicyOutput) RemediationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.BoolPtrOutput { return v.RemediationEnabled }).(pulumi.BoolPtrOutput)
}

// A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
func (o PolicyOutput) ResourceTags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringMapOutput { return v.ResourceTags }).(pulumi.StringMapOutput)
}

// A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
func (o PolicyOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.ResourceType }).(pulumi.StringOutput)
}

// A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
func (o PolicyOutput) ResourceTypeLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringArrayOutput { return v.ResourceTypeLists }).(pulumi.StringArrayOutput)
}

// The objects to include in Security Service Policy Data. Documented below.
func (o PolicyOutput) SecurityServicePolicyData() PolicySecurityServicePolicyDataOutput {
	return o.ApplyT(func(v *Policy) PolicySecurityServicePolicyDataOutput { return v.SecurityServicePolicyData }).(PolicySecurityServicePolicyDataOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
func (o PolicyOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o PolicyOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].([]*Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].(map[string]*Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyInput)(nil)).Elem(), &Policy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyArrayInput)(nil)).Elem(), PolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyMapInput)(nil)).Elem(), PolicyMap{})
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
