// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securityhub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages the Security Hub Organization Configuration.
//
// > **NOTE:** This resource requires an `securityhub.OrganizationAdminAccount` to be configured (not necessarily with Pulumi). More information about managing Security Hub in an organization can be found in the [Managing administrator and member accounts](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-accounts.html) documentation
//
// > **NOTE:** This is an advanced AWS resource. Pulumi will automatically assume management of the Security Hub Organization Configuration without import and perform no actions on removal from the Pulumi program.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/securityhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewOrganization(ctx, "example", &organizations.OrganizationArgs{
//				AwsServiceAccessPrincipals: pulumi.StringArray{
//					pulumi.String("securityhub.amazonaws.com"),
//				},
//				FeatureSet: pulumi.String("ALL"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = securityhub.NewOrganizationAdminAccount(ctx, "example", &securityhub.OrganizationAdminAccountArgs{
//				AdminAccountId: pulumi.String("123456789012"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = securityhub.NewOrganizationConfiguration(ctx, "example", &securityhub.OrganizationConfigurationArgs{
//				AutoEnable: pulumi.Bool(true),
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
// Using `pulumi import`, import an existing Security Hub enabled account using the AWS account ID. For example:
//
// ```sh
//
//	$ pulumi import aws:securityhub/organizationConfiguration:OrganizationConfiguration example 123456789012
//
// ```
type OrganizationConfiguration struct {
	pulumi.CustomResourceState

	// Whether to automatically enable Security Hub for new accounts in the organization.
	AutoEnable pulumi.BoolOutput `pulumi:"autoEnable"`
	// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
	AutoEnableStandards pulumi.StringOutput `pulumi:"autoEnableStandards"`
}

// NewOrganizationConfiguration registers a new resource with the given unique name, arguments, and options.
func NewOrganizationConfiguration(ctx *pulumi.Context,
	name string, args *OrganizationConfigurationArgs, opts ...pulumi.ResourceOption) (*OrganizationConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoEnable == nil {
		return nil, errors.New("invalid value for required argument 'AutoEnable'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationConfiguration
	err := ctx.RegisterResource("aws:securityhub/organizationConfiguration:OrganizationConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationConfiguration gets an existing OrganizationConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationConfigurationState, opts ...pulumi.ResourceOption) (*OrganizationConfiguration, error) {
	var resource OrganizationConfiguration
	err := ctx.ReadResource("aws:securityhub/organizationConfiguration:OrganizationConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationConfiguration resources.
type organizationConfigurationState struct {
	// Whether to automatically enable Security Hub for new accounts in the organization.
	AutoEnable *bool `pulumi:"autoEnable"`
	// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
	AutoEnableStandards *string `pulumi:"autoEnableStandards"`
}

type OrganizationConfigurationState struct {
	// Whether to automatically enable Security Hub for new accounts in the organization.
	AutoEnable pulumi.BoolPtrInput
	// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
	AutoEnableStandards pulumi.StringPtrInput
}

func (OrganizationConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationConfigurationState)(nil)).Elem()
}

type organizationConfigurationArgs struct {
	// Whether to automatically enable Security Hub for new accounts in the organization.
	AutoEnable bool `pulumi:"autoEnable"`
	// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
	AutoEnableStandards *string `pulumi:"autoEnableStandards"`
}

// The set of arguments for constructing a OrganizationConfiguration resource.
type OrganizationConfigurationArgs struct {
	// Whether to automatically enable Security Hub for new accounts in the organization.
	AutoEnable pulumi.BoolInput
	// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
	AutoEnableStandards pulumi.StringPtrInput
}

func (OrganizationConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationConfigurationArgs)(nil)).Elem()
}

type OrganizationConfigurationInput interface {
	pulumi.Input

	ToOrganizationConfigurationOutput() OrganizationConfigurationOutput
	ToOrganizationConfigurationOutputWithContext(ctx context.Context) OrganizationConfigurationOutput
}

func (*OrganizationConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationConfiguration)(nil)).Elem()
}

func (i *OrganizationConfiguration) ToOrganizationConfigurationOutput() OrganizationConfigurationOutput {
	return i.ToOrganizationConfigurationOutputWithContext(context.Background())
}

func (i *OrganizationConfiguration) ToOrganizationConfigurationOutputWithContext(ctx context.Context) OrganizationConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConfigurationOutput)
}

// OrganizationConfigurationArrayInput is an input type that accepts OrganizationConfigurationArray and OrganizationConfigurationArrayOutput values.
// You can construct a concrete instance of `OrganizationConfigurationArrayInput` via:
//
//	OrganizationConfigurationArray{ OrganizationConfigurationArgs{...} }
type OrganizationConfigurationArrayInput interface {
	pulumi.Input

	ToOrganizationConfigurationArrayOutput() OrganizationConfigurationArrayOutput
	ToOrganizationConfigurationArrayOutputWithContext(context.Context) OrganizationConfigurationArrayOutput
}

type OrganizationConfigurationArray []OrganizationConfigurationInput

func (OrganizationConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationConfiguration)(nil)).Elem()
}

func (i OrganizationConfigurationArray) ToOrganizationConfigurationArrayOutput() OrganizationConfigurationArrayOutput {
	return i.ToOrganizationConfigurationArrayOutputWithContext(context.Background())
}

func (i OrganizationConfigurationArray) ToOrganizationConfigurationArrayOutputWithContext(ctx context.Context) OrganizationConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConfigurationArrayOutput)
}

// OrganizationConfigurationMapInput is an input type that accepts OrganizationConfigurationMap and OrganizationConfigurationMapOutput values.
// You can construct a concrete instance of `OrganizationConfigurationMapInput` via:
//
//	OrganizationConfigurationMap{ "key": OrganizationConfigurationArgs{...} }
type OrganizationConfigurationMapInput interface {
	pulumi.Input

	ToOrganizationConfigurationMapOutput() OrganizationConfigurationMapOutput
	ToOrganizationConfigurationMapOutputWithContext(context.Context) OrganizationConfigurationMapOutput
}

type OrganizationConfigurationMap map[string]OrganizationConfigurationInput

func (OrganizationConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationConfiguration)(nil)).Elem()
}

func (i OrganizationConfigurationMap) ToOrganizationConfigurationMapOutput() OrganizationConfigurationMapOutput {
	return i.ToOrganizationConfigurationMapOutputWithContext(context.Background())
}

func (i OrganizationConfigurationMap) ToOrganizationConfigurationMapOutputWithContext(ctx context.Context) OrganizationConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConfigurationMapOutput)
}

type OrganizationConfigurationOutput struct{ *pulumi.OutputState }

func (OrganizationConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationConfiguration)(nil)).Elem()
}

func (o OrganizationConfigurationOutput) ToOrganizationConfigurationOutput() OrganizationConfigurationOutput {
	return o
}

func (o OrganizationConfigurationOutput) ToOrganizationConfigurationOutputWithContext(ctx context.Context) OrganizationConfigurationOutput {
	return o
}

// Whether to automatically enable Security Hub for new accounts in the organization.
func (o OrganizationConfigurationOutput) AutoEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v *OrganizationConfiguration) pulumi.BoolOutput { return v.AutoEnable }).(pulumi.BoolOutput)
}

// Whether to automatically enable Security Hub default standards for new member accounts in the organization. By default, this parameter is equal to `DEFAULT`, and new member accounts are automatically enabled with default Security Hub standards. To opt out of enabling default standards for new member accounts, set this parameter equal to `NONE`.
func (o OrganizationConfigurationOutput) AutoEnableStandards() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationConfiguration) pulumi.StringOutput { return v.AutoEnableStandards }).(pulumi.StringOutput)
}

type OrganizationConfigurationArrayOutput struct{ *pulumi.OutputState }

func (OrganizationConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationConfiguration)(nil)).Elem()
}

func (o OrganizationConfigurationArrayOutput) ToOrganizationConfigurationArrayOutput() OrganizationConfigurationArrayOutput {
	return o
}

func (o OrganizationConfigurationArrayOutput) ToOrganizationConfigurationArrayOutputWithContext(ctx context.Context) OrganizationConfigurationArrayOutput {
	return o
}

func (o OrganizationConfigurationArrayOutput) Index(i pulumi.IntInput) OrganizationConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationConfiguration {
		return vs[0].([]*OrganizationConfiguration)[vs[1].(int)]
	}).(OrganizationConfigurationOutput)
}

type OrganizationConfigurationMapOutput struct{ *pulumi.OutputState }

func (OrganizationConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationConfiguration)(nil)).Elem()
}

func (o OrganizationConfigurationMapOutput) ToOrganizationConfigurationMapOutput() OrganizationConfigurationMapOutput {
	return o
}

func (o OrganizationConfigurationMapOutput) ToOrganizationConfigurationMapOutputWithContext(ctx context.Context) OrganizationConfigurationMapOutput {
	return o
}

func (o OrganizationConfigurationMapOutput) MapIndex(k pulumi.StringInput) OrganizationConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationConfiguration {
		return vs[0].(map[string]*OrganizationConfiguration)[vs[1].(string)]
	}).(OrganizationConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConfigurationInput)(nil)).Elem(), &OrganizationConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConfigurationArrayInput)(nil)).Elem(), OrganizationConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConfigurationMapInput)(nil)).Elem(), OrganizationConfigurationMap{})
	pulumi.RegisterOutputType(OrganizationConfigurationOutput{})
	pulumi.RegisterOutputType(OrganizationConfigurationArrayOutput{})
	pulumi.RegisterOutputType(OrganizationConfigurationMapOutput{})
}
