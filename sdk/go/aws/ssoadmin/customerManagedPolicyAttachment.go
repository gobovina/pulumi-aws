// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssoadmin

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a customer managed policy attachment for a Single Sign-On (SSO) Permission Set resource
//
// > **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
//
// ## Import
//
// Using `pulumi import`, import SSO Managed Policy Attachments using the `name`, `path`, `permission_set_arn`, and `instance_arn` separated by a comma (`,`). For example:
//
// ```sh
// $ pulumi import aws:ssoadmin/customerManagedPolicyAttachment:CustomerManagedPolicyAttachment example TestPolicy,/,arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
// ```
type CustomerManagedPolicyAttachment struct {
	pulumi.CustomResourceState

	// Specifies the name and path of a customer managed policy. See below.
	CustomerManagedPolicyReference CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceOutput `pulumi:"customerManagedPolicyReference"`
	// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
	InstanceArn pulumi.StringOutput `pulumi:"instanceArn"`
	// The Amazon Resource Name (ARN) of the Permission Set.
	PermissionSetArn pulumi.StringOutput `pulumi:"permissionSetArn"`
}

// NewCustomerManagedPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewCustomerManagedPolicyAttachment(ctx *pulumi.Context,
	name string, args *CustomerManagedPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*CustomerManagedPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomerManagedPolicyReference == nil {
		return nil, errors.New("invalid value for required argument 'CustomerManagedPolicyReference'")
	}
	if args.InstanceArn == nil {
		return nil, errors.New("invalid value for required argument 'InstanceArn'")
	}
	if args.PermissionSetArn == nil {
		return nil, errors.New("invalid value for required argument 'PermissionSetArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomerManagedPolicyAttachment
	err := ctx.RegisterResource("aws:ssoadmin/customerManagedPolicyAttachment:CustomerManagedPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomerManagedPolicyAttachment gets an existing CustomerManagedPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomerManagedPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomerManagedPolicyAttachmentState, opts ...pulumi.ResourceOption) (*CustomerManagedPolicyAttachment, error) {
	var resource CustomerManagedPolicyAttachment
	err := ctx.ReadResource("aws:ssoadmin/customerManagedPolicyAttachment:CustomerManagedPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomerManagedPolicyAttachment resources.
type customerManagedPolicyAttachmentState struct {
	// Specifies the name and path of a customer managed policy. See below.
	CustomerManagedPolicyReference *CustomerManagedPolicyAttachmentCustomerManagedPolicyReference `pulumi:"customerManagedPolicyReference"`
	// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
	InstanceArn *string `pulumi:"instanceArn"`
	// The Amazon Resource Name (ARN) of the Permission Set.
	PermissionSetArn *string `pulumi:"permissionSetArn"`
}

type CustomerManagedPolicyAttachmentState struct {
	// Specifies the name and path of a customer managed policy. See below.
	CustomerManagedPolicyReference CustomerManagedPolicyAttachmentCustomerManagedPolicyReferencePtrInput
	// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
	InstanceArn pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the Permission Set.
	PermissionSetArn pulumi.StringPtrInput
}

func (CustomerManagedPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*customerManagedPolicyAttachmentState)(nil)).Elem()
}

type customerManagedPolicyAttachmentArgs struct {
	// Specifies the name and path of a customer managed policy. See below.
	CustomerManagedPolicyReference CustomerManagedPolicyAttachmentCustomerManagedPolicyReference `pulumi:"customerManagedPolicyReference"`
	// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
	InstanceArn string `pulumi:"instanceArn"`
	// The Amazon Resource Name (ARN) of the Permission Set.
	PermissionSetArn string `pulumi:"permissionSetArn"`
}

// The set of arguments for constructing a CustomerManagedPolicyAttachment resource.
type CustomerManagedPolicyAttachmentArgs struct {
	// Specifies the name and path of a customer managed policy. See below.
	CustomerManagedPolicyReference CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceInput
	// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
	InstanceArn pulumi.StringInput
	// The Amazon Resource Name (ARN) of the Permission Set.
	PermissionSetArn pulumi.StringInput
}

func (CustomerManagedPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customerManagedPolicyAttachmentArgs)(nil)).Elem()
}

type CustomerManagedPolicyAttachmentInput interface {
	pulumi.Input

	ToCustomerManagedPolicyAttachmentOutput() CustomerManagedPolicyAttachmentOutput
	ToCustomerManagedPolicyAttachmentOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentOutput
}

func (*CustomerManagedPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (i *CustomerManagedPolicyAttachment) ToCustomerManagedPolicyAttachmentOutput() CustomerManagedPolicyAttachmentOutput {
	return i.ToCustomerManagedPolicyAttachmentOutputWithContext(context.Background())
}

func (i *CustomerManagedPolicyAttachment) ToCustomerManagedPolicyAttachmentOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerManagedPolicyAttachmentOutput)
}

// CustomerManagedPolicyAttachmentArrayInput is an input type that accepts CustomerManagedPolicyAttachmentArray and CustomerManagedPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `CustomerManagedPolicyAttachmentArrayInput` via:
//
//	CustomerManagedPolicyAttachmentArray{ CustomerManagedPolicyAttachmentArgs{...} }
type CustomerManagedPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToCustomerManagedPolicyAttachmentArrayOutput() CustomerManagedPolicyAttachmentArrayOutput
	ToCustomerManagedPolicyAttachmentArrayOutputWithContext(context.Context) CustomerManagedPolicyAttachmentArrayOutput
}

type CustomerManagedPolicyAttachmentArray []CustomerManagedPolicyAttachmentInput

func (CustomerManagedPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (i CustomerManagedPolicyAttachmentArray) ToCustomerManagedPolicyAttachmentArrayOutput() CustomerManagedPolicyAttachmentArrayOutput {
	return i.ToCustomerManagedPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i CustomerManagedPolicyAttachmentArray) ToCustomerManagedPolicyAttachmentArrayOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerManagedPolicyAttachmentArrayOutput)
}

// CustomerManagedPolicyAttachmentMapInput is an input type that accepts CustomerManagedPolicyAttachmentMap and CustomerManagedPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `CustomerManagedPolicyAttachmentMapInput` via:
//
//	CustomerManagedPolicyAttachmentMap{ "key": CustomerManagedPolicyAttachmentArgs{...} }
type CustomerManagedPolicyAttachmentMapInput interface {
	pulumi.Input

	ToCustomerManagedPolicyAttachmentMapOutput() CustomerManagedPolicyAttachmentMapOutput
	ToCustomerManagedPolicyAttachmentMapOutputWithContext(context.Context) CustomerManagedPolicyAttachmentMapOutput
}

type CustomerManagedPolicyAttachmentMap map[string]CustomerManagedPolicyAttachmentInput

func (CustomerManagedPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (i CustomerManagedPolicyAttachmentMap) ToCustomerManagedPolicyAttachmentMapOutput() CustomerManagedPolicyAttachmentMapOutput {
	return i.ToCustomerManagedPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i CustomerManagedPolicyAttachmentMap) ToCustomerManagedPolicyAttachmentMapOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomerManagedPolicyAttachmentMapOutput)
}

type CustomerManagedPolicyAttachmentOutput struct{ *pulumi.OutputState }

func (CustomerManagedPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (o CustomerManagedPolicyAttachmentOutput) ToCustomerManagedPolicyAttachmentOutput() CustomerManagedPolicyAttachmentOutput {
	return o
}

func (o CustomerManagedPolicyAttachmentOutput) ToCustomerManagedPolicyAttachmentOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentOutput {
	return o
}

// Specifies the name and path of a customer managed policy. See below.
func (o CustomerManagedPolicyAttachmentOutput) CustomerManagedPolicyReference() CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceOutput {
	return o.ApplyT(func(v *CustomerManagedPolicyAttachment) CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceOutput {
		return v.CustomerManagedPolicyReference
	}).(CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceOutput)
}

// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
func (o CustomerManagedPolicyAttachmentOutput) InstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomerManagedPolicyAttachment) pulumi.StringOutput { return v.InstanceArn }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the Permission Set.
func (o CustomerManagedPolicyAttachmentOutput) PermissionSetArn() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomerManagedPolicyAttachment) pulumi.StringOutput { return v.PermissionSetArn }).(pulumi.StringOutput)
}

type CustomerManagedPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (CustomerManagedPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (o CustomerManagedPolicyAttachmentArrayOutput) ToCustomerManagedPolicyAttachmentArrayOutput() CustomerManagedPolicyAttachmentArrayOutput {
	return o
}

func (o CustomerManagedPolicyAttachmentArrayOutput) ToCustomerManagedPolicyAttachmentArrayOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentArrayOutput {
	return o
}

func (o CustomerManagedPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) CustomerManagedPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomerManagedPolicyAttachment {
		return vs[0].([]*CustomerManagedPolicyAttachment)[vs[1].(int)]
	}).(CustomerManagedPolicyAttachmentOutput)
}

type CustomerManagedPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (CustomerManagedPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomerManagedPolicyAttachment)(nil)).Elem()
}

func (o CustomerManagedPolicyAttachmentMapOutput) ToCustomerManagedPolicyAttachmentMapOutput() CustomerManagedPolicyAttachmentMapOutput {
	return o
}

func (o CustomerManagedPolicyAttachmentMapOutput) ToCustomerManagedPolicyAttachmentMapOutputWithContext(ctx context.Context) CustomerManagedPolicyAttachmentMapOutput {
	return o
}

func (o CustomerManagedPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) CustomerManagedPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomerManagedPolicyAttachment {
		return vs[0].(map[string]*CustomerManagedPolicyAttachment)[vs[1].(string)]
	}).(CustomerManagedPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerManagedPolicyAttachmentInput)(nil)).Elem(), &CustomerManagedPolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerManagedPolicyAttachmentArrayInput)(nil)).Elem(), CustomerManagedPolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomerManagedPolicyAttachmentMapInput)(nil)).Elem(), CustomerManagedPolicyAttachmentMap{})
	pulumi.RegisterOutputType(CustomerManagedPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(CustomerManagedPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(CustomerManagedPolicyAttachmentMapOutput{})
}
