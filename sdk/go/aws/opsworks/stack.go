// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsworks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an OpsWorks stack resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opsworks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := opsworks.NewStack(ctx, "main", &opsworks.StackArgs{
//				Region:                    pulumi.String("us-west-1"),
//				ServiceRoleArn:            pulumi.Any(aws_iam_role.Opsworks.Arn),
//				DefaultInstanceProfileArn: pulumi.Any(aws_iam_instance_profile.Opsworks.Arn),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("foobar-stack"),
//				},
//				CustomJson: pulumi.String("{\n \"foobar\": {\n    \"version\": \"1.0.0\"\n  }\n}\n"),
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
// Using `pulumi import`, import OpsWorks stacks using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:opsworks/stack:Stack bar 00000000-0000-0000-0000-000000000000
//
// ```
type Stack struct {
	pulumi.CustomResourceState

	// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
	AgentVersion pulumi.StringOutput `pulumi:"agentVersion"`
	Arn          pulumi.StringOutput `pulumi:"arn"`
	// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
	BerkshelfVersion pulumi.StringPtrOutput `pulumi:"berkshelfVersion"`
	// Color to paint next to the stack's resources in the OpsWorks console.
	Color pulumi.StringPtrOutput `pulumi:"color"`
	// Name of the configuration manager to use. Defaults to "Chef".
	ConfigurationManagerName pulumi.StringPtrOutput `pulumi:"configurationManagerName"`
	// Version of the configuration manager to use. Defaults to "11.4".
	ConfigurationManagerVersion pulumi.StringPtrOutput `pulumi:"configurationManagerVersion"`
	// When `useCustomCookbooks` is set, provide this sub-object as described below.
	CustomCookbooksSources StackCustomCookbooksSourceArrayOutput `pulumi:"customCookbooksSources"`
	// Custom JSON attributes to apply to the entire stack.
	CustomJson pulumi.StringPtrOutput `pulumi:"customJson"`
	// Name of the availability zone where instances will be created by default.
	// Cannot be set when `vpcId` is set.
	DefaultAvailabilityZone pulumi.StringOutput `pulumi:"defaultAvailabilityZone"`
	// The ARN of an IAM Instance Profile that created instances will have by default.
	DefaultInstanceProfileArn pulumi.StringOutput `pulumi:"defaultInstanceProfileArn"`
	// Name of OS that will be installed on instances by default.
	DefaultOs pulumi.StringPtrOutput `pulumi:"defaultOs"`
	// Name of the type of root device instances will have by default.
	DefaultRootDeviceType pulumi.StringPtrOutput `pulumi:"defaultRootDeviceType"`
	// Name of the SSH keypair that instances will have by default.
	DefaultSshKeyName pulumi.StringPtrOutput `pulumi:"defaultSshKeyName"`
	// ID of the subnet in which instances will be created by default.
	// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
	DefaultSubnetId pulumi.StringOutput `pulumi:"defaultSubnetId"`
	// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
	HostnameTheme pulumi.StringPtrOutput `pulumi:"hostnameTheme"`
	// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
	ManageBerkshelf pulumi.BoolPtrOutput `pulumi:"manageBerkshelf"`
	// The name of the stack.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the region where the stack will exist.
	Region pulumi.StringOutput `pulumi:"region"`
	// The ARN of an IAM role that the OpsWorks service will act as.
	ServiceRoleArn pulumi.StringOutput `pulumi:"serviceRoleArn"`
	StackEndpoint  pulumi.StringOutput `pulumi:"stackEndpoint"`
	// A map of tags to assign to the resource.
	// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Boolean value controlling whether the custom cookbook settings are enabled.
	UseCustomCookbooks pulumi.BoolPtrOutput `pulumi:"useCustomCookbooks"`
	// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
	UseOpsworksSecurityGroups pulumi.BoolPtrOutput `pulumi:"useOpsworksSecurityGroups"`
	// ID of the VPC that this stack belongs to.
	// Defaults to the region's default VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewStack registers a new resource with the given unique name, arguments, and options.
func NewStack(ctx *pulumi.Context,
	name string, args *StackArgs, opts ...pulumi.ResourceOption) (*Stack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultInstanceProfileArn == nil {
		return nil, errors.New("invalid value for required argument 'DefaultInstanceProfileArn'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.ServiceRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ServiceRoleArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Stack
	err := ctx.RegisterResource("aws:opsworks/stack:Stack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStack gets an existing Stack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackState, opts ...pulumi.ResourceOption) (*Stack, error) {
	var resource Stack
	err := ctx.ReadResource("aws:opsworks/stack:Stack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stack resources.
type stackState struct {
	// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
	AgentVersion *string `pulumi:"agentVersion"`
	Arn          *string `pulumi:"arn"`
	// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
	BerkshelfVersion *string `pulumi:"berkshelfVersion"`
	// Color to paint next to the stack's resources in the OpsWorks console.
	Color *string `pulumi:"color"`
	// Name of the configuration manager to use. Defaults to "Chef".
	ConfigurationManagerName *string `pulumi:"configurationManagerName"`
	// Version of the configuration manager to use. Defaults to "11.4".
	ConfigurationManagerVersion *string `pulumi:"configurationManagerVersion"`
	// When `useCustomCookbooks` is set, provide this sub-object as described below.
	CustomCookbooksSources []StackCustomCookbooksSource `pulumi:"customCookbooksSources"`
	// Custom JSON attributes to apply to the entire stack.
	CustomJson *string `pulumi:"customJson"`
	// Name of the availability zone where instances will be created by default.
	// Cannot be set when `vpcId` is set.
	DefaultAvailabilityZone *string `pulumi:"defaultAvailabilityZone"`
	// The ARN of an IAM Instance Profile that created instances will have by default.
	DefaultInstanceProfileArn *string `pulumi:"defaultInstanceProfileArn"`
	// Name of OS that will be installed on instances by default.
	DefaultOs *string `pulumi:"defaultOs"`
	// Name of the type of root device instances will have by default.
	DefaultRootDeviceType *string `pulumi:"defaultRootDeviceType"`
	// Name of the SSH keypair that instances will have by default.
	DefaultSshKeyName *string `pulumi:"defaultSshKeyName"`
	// ID of the subnet in which instances will be created by default.
	// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
	DefaultSubnetId *string `pulumi:"defaultSubnetId"`
	// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
	HostnameTheme *string `pulumi:"hostnameTheme"`
	// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
	ManageBerkshelf *bool `pulumi:"manageBerkshelf"`
	// The name of the stack.
	Name *string `pulumi:"name"`
	// The name of the region where the stack will exist.
	Region *string `pulumi:"region"`
	// The ARN of an IAM role that the OpsWorks service will act as.
	ServiceRoleArn *string `pulumi:"serviceRoleArn"`
	StackEndpoint  *string `pulumi:"stackEndpoint"`
	// A map of tags to assign to the resource.
	// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Boolean value controlling whether the custom cookbook settings are enabled.
	UseCustomCookbooks *bool `pulumi:"useCustomCookbooks"`
	// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
	UseOpsworksSecurityGroups *bool `pulumi:"useOpsworksSecurityGroups"`
	// ID of the VPC that this stack belongs to.
	// Defaults to the region's default VPC.
	VpcId *string `pulumi:"vpcId"`
}

type StackState struct {
	// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
	AgentVersion pulumi.StringPtrInput
	Arn          pulumi.StringPtrInput
	// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
	BerkshelfVersion pulumi.StringPtrInput
	// Color to paint next to the stack's resources in the OpsWorks console.
	Color pulumi.StringPtrInput
	// Name of the configuration manager to use. Defaults to "Chef".
	ConfigurationManagerName pulumi.StringPtrInput
	// Version of the configuration manager to use. Defaults to "11.4".
	ConfigurationManagerVersion pulumi.StringPtrInput
	// When `useCustomCookbooks` is set, provide this sub-object as described below.
	CustomCookbooksSources StackCustomCookbooksSourceArrayInput
	// Custom JSON attributes to apply to the entire stack.
	CustomJson pulumi.StringPtrInput
	// Name of the availability zone where instances will be created by default.
	// Cannot be set when `vpcId` is set.
	DefaultAvailabilityZone pulumi.StringPtrInput
	// The ARN of an IAM Instance Profile that created instances will have by default.
	DefaultInstanceProfileArn pulumi.StringPtrInput
	// Name of OS that will be installed on instances by default.
	DefaultOs pulumi.StringPtrInput
	// Name of the type of root device instances will have by default.
	DefaultRootDeviceType pulumi.StringPtrInput
	// Name of the SSH keypair that instances will have by default.
	DefaultSshKeyName pulumi.StringPtrInput
	// ID of the subnet in which instances will be created by default.
	// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
	DefaultSubnetId pulumi.StringPtrInput
	// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
	HostnameTheme pulumi.StringPtrInput
	// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
	ManageBerkshelf pulumi.BoolPtrInput
	// The name of the stack.
	Name pulumi.StringPtrInput
	// The name of the region where the stack will exist.
	Region pulumi.StringPtrInput
	// The ARN of an IAM role that the OpsWorks service will act as.
	ServiceRoleArn pulumi.StringPtrInput
	StackEndpoint  pulumi.StringPtrInput
	// A map of tags to assign to the resource.
	// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Boolean value controlling whether the custom cookbook settings are enabled.
	UseCustomCookbooks pulumi.BoolPtrInput
	// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
	UseOpsworksSecurityGroups pulumi.BoolPtrInput
	// ID of the VPC that this stack belongs to.
	// Defaults to the region's default VPC.
	VpcId pulumi.StringPtrInput
}

func (StackState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackState)(nil)).Elem()
}

type stackArgs struct {
	// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
	AgentVersion *string `pulumi:"agentVersion"`
	// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
	BerkshelfVersion *string `pulumi:"berkshelfVersion"`
	// Color to paint next to the stack's resources in the OpsWorks console.
	Color *string `pulumi:"color"`
	// Name of the configuration manager to use. Defaults to "Chef".
	ConfigurationManagerName *string `pulumi:"configurationManagerName"`
	// Version of the configuration manager to use. Defaults to "11.4".
	ConfigurationManagerVersion *string `pulumi:"configurationManagerVersion"`
	// When `useCustomCookbooks` is set, provide this sub-object as described below.
	CustomCookbooksSources []StackCustomCookbooksSource `pulumi:"customCookbooksSources"`
	// Custom JSON attributes to apply to the entire stack.
	CustomJson *string `pulumi:"customJson"`
	// Name of the availability zone where instances will be created by default.
	// Cannot be set when `vpcId` is set.
	DefaultAvailabilityZone *string `pulumi:"defaultAvailabilityZone"`
	// The ARN of an IAM Instance Profile that created instances will have by default.
	DefaultInstanceProfileArn string `pulumi:"defaultInstanceProfileArn"`
	// Name of OS that will be installed on instances by default.
	DefaultOs *string `pulumi:"defaultOs"`
	// Name of the type of root device instances will have by default.
	DefaultRootDeviceType *string `pulumi:"defaultRootDeviceType"`
	// Name of the SSH keypair that instances will have by default.
	DefaultSshKeyName *string `pulumi:"defaultSshKeyName"`
	// ID of the subnet in which instances will be created by default.
	// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
	DefaultSubnetId *string `pulumi:"defaultSubnetId"`
	// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
	HostnameTheme *string `pulumi:"hostnameTheme"`
	// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
	ManageBerkshelf *bool `pulumi:"manageBerkshelf"`
	// The name of the stack.
	Name *string `pulumi:"name"`
	// The name of the region where the stack will exist.
	Region string `pulumi:"region"`
	// The ARN of an IAM role that the OpsWorks service will act as.
	ServiceRoleArn string `pulumi:"serviceRoleArn"`
	// A map of tags to assign to the resource.
	// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Boolean value controlling whether the custom cookbook settings are enabled.
	UseCustomCookbooks *bool `pulumi:"useCustomCookbooks"`
	// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
	UseOpsworksSecurityGroups *bool `pulumi:"useOpsworksSecurityGroups"`
	// ID of the VPC that this stack belongs to.
	// Defaults to the region's default VPC.
	VpcId *string `pulumi:"vpcId"`
}

// The set of arguments for constructing a Stack resource.
type StackArgs struct {
	// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
	AgentVersion pulumi.StringPtrInput
	// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
	BerkshelfVersion pulumi.StringPtrInput
	// Color to paint next to the stack's resources in the OpsWorks console.
	Color pulumi.StringPtrInput
	// Name of the configuration manager to use. Defaults to "Chef".
	ConfigurationManagerName pulumi.StringPtrInput
	// Version of the configuration manager to use. Defaults to "11.4".
	ConfigurationManagerVersion pulumi.StringPtrInput
	// When `useCustomCookbooks` is set, provide this sub-object as described below.
	CustomCookbooksSources StackCustomCookbooksSourceArrayInput
	// Custom JSON attributes to apply to the entire stack.
	CustomJson pulumi.StringPtrInput
	// Name of the availability zone where instances will be created by default.
	// Cannot be set when `vpcId` is set.
	DefaultAvailabilityZone pulumi.StringPtrInput
	// The ARN of an IAM Instance Profile that created instances will have by default.
	DefaultInstanceProfileArn pulumi.StringInput
	// Name of OS that will be installed on instances by default.
	DefaultOs pulumi.StringPtrInput
	// Name of the type of root device instances will have by default.
	DefaultRootDeviceType pulumi.StringPtrInput
	// Name of the SSH keypair that instances will have by default.
	DefaultSshKeyName pulumi.StringPtrInput
	// ID of the subnet in which instances will be created by default.
	// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
	DefaultSubnetId pulumi.StringPtrInput
	// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
	HostnameTheme pulumi.StringPtrInput
	// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
	ManageBerkshelf pulumi.BoolPtrInput
	// The name of the stack.
	Name pulumi.StringPtrInput
	// The name of the region where the stack will exist.
	Region pulumi.StringInput
	// The ARN of an IAM role that the OpsWorks service will act as.
	ServiceRoleArn pulumi.StringInput
	// A map of tags to assign to the resource.
	// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Boolean value controlling whether the custom cookbook settings are enabled.
	UseCustomCookbooks pulumi.BoolPtrInput
	// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
	UseOpsworksSecurityGroups pulumi.BoolPtrInput
	// ID of the VPC that this stack belongs to.
	// Defaults to the region's default VPC.
	VpcId pulumi.StringPtrInput
}

func (StackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackArgs)(nil)).Elem()
}

type StackInput interface {
	pulumi.Input

	ToStackOutput() StackOutput
	ToStackOutputWithContext(ctx context.Context) StackOutput
}

func (*Stack) ElementType() reflect.Type {
	return reflect.TypeOf((**Stack)(nil)).Elem()
}

func (i *Stack) ToStackOutput() StackOutput {
	return i.ToStackOutputWithContext(context.Background())
}

func (i *Stack) ToStackOutputWithContext(ctx context.Context) StackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackOutput)
}

// StackArrayInput is an input type that accepts StackArray and StackArrayOutput values.
// You can construct a concrete instance of `StackArrayInput` via:
//
//	StackArray{ StackArgs{...} }
type StackArrayInput interface {
	pulumi.Input

	ToStackArrayOutput() StackArrayOutput
	ToStackArrayOutputWithContext(context.Context) StackArrayOutput
}

type StackArray []StackInput

func (StackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stack)(nil)).Elem()
}

func (i StackArray) ToStackArrayOutput() StackArrayOutput {
	return i.ToStackArrayOutputWithContext(context.Background())
}

func (i StackArray) ToStackArrayOutputWithContext(ctx context.Context) StackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackArrayOutput)
}

// StackMapInput is an input type that accepts StackMap and StackMapOutput values.
// You can construct a concrete instance of `StackMapInput` via:
//
//	StackMap{ "key": StackArgs{...} }
type StackMapInput interface {
	pulumi.Input

	ToStackMapOutput() StackMapOutput
	ToStackMapOutputWithContext(context.Context) StackMapOutput
}

type StackMap map[string]StackInput

func (StackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stack)(nil)).Elem()
}

func (i StackMap) ToStackMapOutput() StackMapOutput {
	return i.ToStackMapOutputWithContext(context.Background())
}

func (i StackMap) ToStackMapOutputWithContext(ctx context.Context) StackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackMapOutput)
}

type StackOutput struct{ *pulumi.OutputState }

func (StackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stack)(nil)).Elem()
}

func (o StackOutput) ToStackOutput() StackOutput {
	return o
}

func (o StackOutput) ToStackOutputWithContext(ctx context.Context) StackOutput {
	return o
}

// If set to `"LATEST"`, OpsWorks will automatically install the latest version.
func (o StackOutput) AgentVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.AgentVersion }).(pulumi.StringOutput)
}

func (o StackOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// If `manageBerkshelf` is enabled, the version of Berkshelf to use.
func (o StackOutput) BerkshelfVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.BerkshelfVersion }).(pulumi.StringPtrOutput)
}

// Color to paint next to the stack's resources in the OpsWorks console.
func (o StackOutput) Color() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.Color }).(pulumi.StringPtrOutput)
}

// Name of the configuration manager to use. Defaults to "Chef".
func (o StackOutput) ConfigurationManagerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.ConfigurationManagerName }).(pulumi.StringPtrOutput)
}

// Version of the configuration manager to use. Defaults to "11.4".
func (o StackOutput) ConfigurationManagerVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.ConfigurationManagerVersion }).(pulumi.StringPtrOutput)
}

// When `useCustomCookbooks` is set, provide this sub-object as described below.
func (o StackOutput) CustomCookbooksSources() StackCustomCookbooksSourceArrayOutput {
	return o.ApplyT(func(v *Stack) StackCustomCookbooksSourceArrayOutput { return v.CustomCookbooksSources }).(StackCustomCookbooksSourceArrayOutput)
}

// Custom JSON attributes to apply to the entire stack.
func (o StackOutput) CustomJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.CustomJson }).(pulumi.StringPtrOutput)
}

// Name of the availability zone where instances will be created by default.
// Cannot be set when `vpcId` is set.
func (o StackOutput) DefaultAvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.DefaultAvailabilityZone }).(pulumi.StringOutput)
}

// The ARN of an IAM Instance Profile that created instances will have by default.
func (o StackOutput) DefaultInstanceProfileArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.DefaultInstanceProfileArn }).(pulumi.StringOutput)
}

// Name of OS that will be installed on instances by default.
func (o StackOutput) DefaultOs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.DefaultOs }).(pulumi.StringPtrOutput)
}

// Name of the type of root device instances will have by default.
func (o StackOutput) DefaultRootDeviceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.DefaultRootDeviceType }).(pulumi.StringPtrOutput)
}

// Name of the SSH keypair that instances will have by default.
func (o StackOutput) DefaultSshKeyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.DefaultSshKeyName }).(pulumi.StringPtrOutput)
}

// ID of the subnet in which instances will be created by default.
// Required if `vpcId` is set to a VPC other than the default VPC, and forbidden if it isn't.
func (o StackOutput) DefaultSubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.DefaultSubnetId }).(pulumi.StringOutput)
}

// Keyword representing the naming scheme that will be used for instance hostnames within this stack.
func (o StackOutput) HostnameTheme() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.HostnameTheme }).(pulumi.StringPtrOutput)
}

// Boolean value controlling whether Opsworks will run Berkshelf for this stack.
func (o StackOutput) ManageBerkshelf() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.ManageBerkshelf }).(pulumi.BoolPtrOutput)
}

// The name of the stack.
func (o StackOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the region where the stack will exist.
func (o StackOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The ARN of an IAM role that the OpsWorks service will act as.
func (o StackOutput) ServiceRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.ServiceRoleArn }).(pulumi.StringOutput)
}

func (o StackOutput) StackEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.StackEndpoint }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource.
// If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o StackOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o StackOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Boolean value controlling whether the custom cookbook settings are enabled.
func (o StackOutput) UseCustomCookbooks() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.UseCustomCookbooks }).(pulumi.BoolPtrOutput)
}

// Boolean value controlling whether the standard OpsWorks security groups apply to created instances.
func (o StackOutput) UseOpsworksSecurityGroups() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.UseOpsworksSecurityGroups }).(pulumi.BoolPtrOutput)
}

// ID of the VPC that this stack belongs to.
// Defaults to the region's default VPC.
func (o StackOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type StackArrayOutput struct{ *pulumi.OutputState }

func (StackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stack)(nil)).Elem()
}

func (o StackArrayOutput) ToStackArrayOutput() StackArrayOutput {
	return o
}

func (o StackArrayOutput) ToStackArrayOutputWithContext(ctx context.Context) StackArrayOutput {
	return o
}

func (o StackArrayOutput) Index(i pulumi.IntInput) StackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stack {
		return vs[0].([]*Stack)[vs[1].(int)]
	}).(StackOutput)
}

type StackMapOutput struct{ *pulumi.OutputState }

func (StackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stack)(nil)).Elem()
}

func (o StackMapOutput) ToStackMapOutput() StackMapOutput {
	return o
}

func (o StackMapOutput) ToStackMapOutputWithContext(ctx context.Context) StackMapOutput {
	return o
}

func (o StackMapOutput) MapIndex(k pulumi.StringInput) StackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stack {
		return vs[0].(map[string]*Stack)[vs[1].(string)]
	}).(StackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StackInput)(nil)).Elem(), &Stack{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackArrayInput)(nil)).Elem(), StackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackMapInput)(nil)).Elem(), StackMap{})
	pulumi.RegisterOutputType(StackOutput{})
	pulumi.RegisterOutputType(StackArrayOutput{})
	pulumi.RegisterOutputType(StackMapOutput{})
}
