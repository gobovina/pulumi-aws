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

// Provides a Security Hub member resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/securityhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securityhub.NewAccount(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = securityhub.NewMember(ctx, "example", &securityhub.MemberArgs{
//				AccountId: pulumi.String("123456789012"),
//				Email:     pulumi.String("example@example.com"),
//				Invite:    pulumi.Bool(true),
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
// Using `pulumi import`, import Security Hub members using their account ID. For example:
//
// ```sh
// $ pulumi import aws:securityhub/member:Member example 123456789012
// ```
type Member struct {
	pulumi.CustomResourceState

	// The ID of the member AWS account.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The email of the member AWS account.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
	Invite pulumi.BoolPtrOutput `pulumi:"invite"`
	// The ID of the master Security Hub AWS account.
	MasterId pulumi.StringOutput `pulumi:"masterId"`
	// The status of the member account relationship.
	MemberStatus pulumi.StringOutput `pulumi:"memberStatus"`
}

// NewMember registers a new resource with the given unique name, arguments, and options.
func NewMember(ctx *pulumi.Context,
	name string, args *MemberArgs, opts ...pulumi.ResourceOption) (*Member, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Member
	err := ctx.RegisterResource("aws:securityhub/member:Member", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMember gets an existing Member resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MemberState, opts ...pulumi.ResourceOption) (*Member, error) {
	var resource Member
	err := ctx.ReadResource("aws:securityhub/member:Member", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Member resources.
type memberState struct {
	// The ID of the member AWS account.
	AccountId *string `pulumi:"accountId"`
	// The email of the member AWS account.
	Email *string `pulumi:"email"`
	// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
	Invite *bool `pulumi:"invite"`
	// The ID of the master Security Hub AWS account.
	MasterId *string `pulumi:"masterId"`
	// The status of the member account relationship.
	MemberStatus *string `pulumi:"memberStatus"`
}

type MemberState struct {
	// The ID of the member AWS account.
	AccountId pulumi.StringPtrInput
	// The email of the member AWS account.
	Email pulumi.StringPtrInput
	// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
	Invite pulumi.BoolPtrInput
	// The ID of the master Security Hub AWS account.
	MasterId pulumi.StringPtrInput
	// The status of the member account relationship.
	MemberStatus pulumi.StringPtrInput
}

func (MemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*memberState)(nil)).Elem()
}

type memberArgs struct {
	// The ID of the member AWS account.
	AccountId string `pulumi:"accountId"`
	// The email of the member AWS account.
	Email *string `pulumi:"email"`
	// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
	Invite *bool `pulumi:"invite"`
}

// The set of arguments for constructing a Member resource.
type MemberArgs struct {
	// The ID of the member AWS account.
	AccountId pulumi.StringInput
	// The email of the member AWS account.
	Email pulumi.StringPtrInput
	// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
	Invite pulumi.BoolPtrInput
}

func (MemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*memberArgs)(nil)).Elem()
}

type MemberInput interface {
	pulumi.Input

	ToMemberOutput() MemberOutput
	ToMemberOutputWithContext(ctx context.Context) MemberOutput
}

func (*Member) ElementType() reflect.Type {
	return reflect.TypeOf((**Member)(nil)).Elem()
}

func (i *Member) ToMemberOutput() MemberOutput {
	return i.ToMemberOutputWithContext(context.Background())
}

func (i *Member) ToMemberOutputWithContext(ctx context.Context) MemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemberOutput)
}

// MemberArrayInput is an input type that accepts MemberArray and MemberArrayOutput values.
// You can construct a concrete instance of `MemberArrayInput` via:
//
//	MemberArray{ MemberArgs{...} }
type MemberArrayInput interface {
	pulumi.Input

	ToMemberArrayOutput() MemberArrayOutput
	ToMemberArrayOutputWithContext(context.Context) MemberArrayOutput
}

type MemberArray []MemberInput

func (MemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Member)(nil)).Elem()
}

func (i MemberArray) ToMemberArrayOutput() MemberArrayOutput {
	return i.ToMemberArrayOutputWithContext(context.Background())
}

func (i MemberArray) ToMemberArrayOutputWithContext(ctx context.Context) MemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemberArrayOutput)
}

// MemberMapInput is an input type that accepts MemberMap and MemberMapOutput values.
// You can construct a concrete instance of `MemberMapInput` via:
//
//	MemberMap{ "key": MemberArgs{...} }
type MemberMapInput interface {
	pulumi.Input

	ToMemberMapOutput() MemberMapOutput
	ToMemberMapOutputWithContext(context.Context) MemberMapOutput
}

type MemberMap map[string]MemberInput

func (MemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Member)(nil)).Elem()
}

func (i MemberMap) ToMemberMapOutput() MemberMapOutput {
	return i.ToMemberMapOutputWithContext(context.Background())
}

func (i MemberMap) ToMemberMapOutputWithContext(ctx context.Context) MemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MemberMapOutput)
}

type MemberOutput struct{ *pulumi.OutputState }

func (MemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Member)(nil)).Elem()
}

func (o MemberOutput) ToMemberOutput() MemberOutput {
	return o
}

func (o MemberOutput) ToMemberOutputWithContext(ctx context.Context) MemberOutput {
	return o
}

// The ID of the member AWS account.
func (o MemberOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The email of the member AWS account.
func (o MemberOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
func (o MemberOutput) Invite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.BoolPtrOutput { return v.Invite }).(pulumi.BoolPtrOutput)
}

// The ID of the master Security Hub AWS account.
func (o MemberOutput) MasterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.MasterId }).(pulumi.StringOutput)
}

// The status of the member account relationship.
func (o MemberOutput) MemberStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.MemberStatus }).(pulumi.StringOutput)
}

type MemberArrayOutput struct{ *pulumi.OutputState }

func (MemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Member)(nil)).Elem()
}

func (o MemberArrayOutput) ToMemberArrayOutput() MemberArrayOutput {
	return o
}

func (o MemberArrayOutput) ToMemberArrayOutputWithContext(ctx context.Context) MemberArrayOutput {
	return o
}

func (o MemberArrayOutput) Index(i pulumi.IntInput) MemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Member {
		return vs[0].([]*Member)[vs[1].(int)]
	}).(MemberOutput)
}

type MemberMapOutput struct{ *pulumi.OutputState }

func (MemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Member)(nil)).Elem()
}

func (o MemberMapOutput) ToMemberMapOutput() MemberMapOutput {
	return o
}

func (o MemberMapOutput) ToMemberMapOutputWithContext(ctx context.Context) MemberMapOutput {
	return o
}

func (o MemberMapOutput) MapIndex(k pulumi.StringInput) MemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Member {
		return vs[0].(map[string]*Member)[vs[1].(string)]
	}).(MemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MemberInput)(nil)).Elem(), &Member{})
	pulumi.RegisterInputType(reflect.TypeOf((*MemberArrayInput)(nil)).Elem(), MemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MemberMapInput)(nil)).Elem(), MemberMap{})
	pulumi.RegisterOutputType(MemberOutput{})
	pulumi.RegisterOutputType(MemberArrayOutput{})
	pulumi.RegisterOutputType(MemberMapOutput{})
}
