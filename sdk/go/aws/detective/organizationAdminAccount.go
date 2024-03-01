// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package detective

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Detective Organization Admin Account. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in Detective can be found in the [Detective User Guide](https://docs.aws.amazon.com/detective/latest/adminguide/accounts-orgs-transition.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/detective"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organizations.NewOrganization(ctx, "example", &organizations.OrganizationArgs{
//				AwsServiceAccessPrincipals: pulumi.StringArray{
//					pulumi.String("detective.amazonaws.com"),
//				},
//				FeatureSet: pulumi.String("ALL"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = detective.NewOrganizationAdminAccount(ctx, "example", &detective.OrganizationAdminAccountArgs{
//				AccountId: pulumi.String("123456789012"),
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
// Using `pulumi import`, import `aws_detective_organization_admin_account` using `account_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:detective/organizationAdminAccount:OrganizationAdminAccount example 123456789012
//
// ```
type OrganizationAdminAccount struct {
	pulumi.CustomResourceState

	// AWS account identifier to designate as a delegated administrator for Detective.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
}

// NewOrganizationAdminAccount registers a new resource with the given unique name, arguments, and options.
func NewOrganizationAdminAccount(ctx *pulumi.Context,
	name string, args *OrganizationAdminAccountArgs, opts ...pulumi.ResourceOption) (*OrganizationAdminAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationAdminAccount
	err := ctx.RegisterResource("aws:detective/organizationAdminAccount:OrganizationAdminAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationAdminAccount gets an existing OrganizationAdminAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationAdminAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationAdminAccountState, opts ...pulumi.ResourceOption) (*OrganizationAdminAccount, error) {
	var resource OrganizationAdminAccount
	err := ctx.ReadResource("aws:detective/organizationAdminAccount:OrganizationAdminAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationAdminAccount resources.
type organizationAdminAccountState struct {
	// AWS account identifier to designate as a delegated administrator for Detective.
	AccountId *string `pulumi:"accountId"`
}

type OrganizationAdminAccountState struct {
	// AWS account identifier to designate as a delegated administrator for Detective.
	AccountId pulumi.StringPtrInput
}

func (OrganizationAdminAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationAdminAccountState)(nil)).Elem()
}

type organizationAdminAccountArgs struct {
	// AWS account identifier to designate as a delegated administrator for Detective.
	AccountId string `pulumi:"accountId"`
}

// The set of arguments for constructing a OrganizationAdminAccount resource.
type OrganizationAdminAccountArgs struct {
	// AWS account identifier to designate as a delegated administrator for Detective.
	AccountId pulumi.StringInput
}

func (OrganizationAdminAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationAdminAccountArgs)(nil)).Elem()
}

type OrganizationAdminAccountInput interface {
	pulumi.Input

	ToOrganizationAdminAccountOutput() OrganizationAdminAccountOutput
	ToOrganizationAdminAccountOutputWithContext(ctx context.Context) OrganizationAdminAccountOutput
}

func (*OrganizationAdminAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationAdminAccount)(nil)).Elem()
}

func (i *OrganizationAdminAccount) ToOrganizationAdminAccountOutput() OrganizationAdminAccountOutput {
	return i.ToOrganizationAdminAccountOutputWithContext(context.Background())
}

func (i *OrganizationAdminAccount) ToOrganizationAdminAccountOutputWithContext(ctx context.Context) OrganizationAdminAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationAdminAccountOutput)
}

// OrganizationAdminAccountArrayInput is an input type that accepts OrganizationAdminAccountArray and OrganizationAdminAccountArrayOutput values.
// You can construct a concrete instance of `OrganizationAdminAccountArrayInput` via:
//
//	OrganizationAdminAccountArray{ OrganizationAdminAccountArgs{...} }
type OrganizationAdminAccountArrayInput interface {
	pulumi.Input

	ToOrganizationAdminAccountArrayOutput() OrganizationAdminAccountArrayOutput
	ToOrganizationAdminAccountArrayOutputWithContext(context.Context) OrganizationAdminAccountArrayOutput
}

type OrganizationAdminAccountArray []OrganizationAdminAccountInput

func (OrganizationAdminAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationAdminAccount)(nil)).Elem()
}

func (i OrganizationAdminAccountArray) ToOrganizationAdminAccountArrayOutput() OrganizationAdminAccountArrayOutput {
	return i.ToOrganizationAdminAccountArrayOutputWithContext(context.Background())
}

func (i OrganizationAdminAccountArray) ToOrganizationAdminAccountArrayOutputWithContext(ctx context.Context) OrganizationAdminAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationAdminAccountArrayOutput)
}

// OrganizationAdminAccountMapInput is an input type that accepts OrganizationAdminAccountMap and OrganizationAdminAccountMapOutput values.
// You can construct a concrete instance of `OrganizationAdminAccountMapInput` via:
//
//	OrganizationAdminAccountMap{ "key": OrganizationAdminAccountArgs{...} }
type OrganizationAdminAccountMapInput interface {
	pulumi.Input

	ToOrganizationAdminAccountMapOutput() OrganizationAdminAccountMapOutput
	ToOrganizationAdminAccountMapOutputWithContext(context.Context) OrganizationAdminAccountMapOutput
}

type OrganizationAdminAccountMap map[string]OrganizationAdminAccountInput

func (OrganizationAdminAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationAdminAccount)(nil)).Elem()
}

func (i OrganizationAdminAccountMap) ToOrganizationAdminAccountMapOutput() OrganizationAdminAccountMapOutput {
	return i.ToOrganizationAdminAccountMapOutputWithContext(context.Background())
}

func (i OrganizationAdminAccountMap) ToOrganizationAdminAccountMapOutputWithContext(ctx context.Context) OrganizationAdminAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationAdminAccountMapOutput)
}

type OrganizationAdminAccountOutput struct{ *pulumi.OutputState }

func (OrganizationAdminAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationAdminAccount)(nil)).Elem()
}

func (o OrganizationAdminAccountOutput) ToOrganizationAdminAccountOutput() OrganizationAdminAccountOutput {
	return o
}

func (o OrganizationAdminAccountOutput) ToOrganizationAdminAccountOutputWithContext(ctx context.Context) OrganizationAdminAccountOutput {
	return o
}

// AWS account identifier to designate as a delegated administrator for Detective.
func (o OrganizationAdminAccountOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationAdminAccount) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

type OrganizationAdminAccountArrayOutput struct{ *pulumi.OutputState }

func (OrganizationAdminAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationAdminAccount)(nil)).Elem()
}

func (o OrganizationAdminAccountArrayOutput) ToOrganizationAdminAccountArrayOutput() OrganizationAdminAccountArrayOutput {
	return o
}

func (o OrganizationAdminAccountArrayOutput) ToOrganizationAdminAccountArrayOutputWithContext(ctx context.Context) OrganizationAdminAccountArrayOutput {
	return o
}

func (o OrganizationAdminAccountArrayOutput) Index(i pulumi.IntInput) OrganizationAdminAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationAdminAccount {
		return vs[0].([]*OrganizationAdminAccount)[vs[1].(int)]
	}).(OrganizationAdminAccountOutput)
}

type OrganizationAdminAccountMapOutput struct{ *pulumi.OutputState }

func (OrganizationAdminAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationAdminAccount)(nil)).Elem()
}

func (o OrganizationAdminAccountMapOutput) ToOrganizationAdminAccountMapOutput() OrganizationAdminAccountMapOutput {
	return o
}

func (o OrganizationAdminAccountMapOutput) ToOrganizationAdminAccountMapOutputWithContext(ctx context.Context) OrganizationAdminAccountMapOutput {
	return o
}

func (o OrganizationAdminAccountMapOutput) MapIndex(k pulumi.StringInput) OrganizationAdminAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationAdminAccount {
		return vs[0].(map[string]*OrganizationAdminAccount)[vs[1].(string)]
	}).(OrganizationAdminAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationAdminAccountInput)(nil)).Elem(), &OrganizationAdminAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationAdminAccountArrayInput)(nil)).Elem(), OrganizationAdminAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationAdminAccountMapInput)(nil)).Elem(), OrganizationAdminAccountMap{})
	pulumi.RegisterOutputType(OrganizationAdminAccountOutput{})
	pulumi.RegisterOutputType(OrganizationAdminAccountArrayOutput{})
	pulumi.RegisterOutputType(OrganizationAdminAccountMapOutput{})
}
