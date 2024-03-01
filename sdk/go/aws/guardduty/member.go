// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package guardduty

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a GuardDuty member. To accept invitations in member accounts, see the `guardduty.InviteAccepter` resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/guardduty"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			primary, err := guardduty.NewDetector(ctx, "primary", &guardduty.DetectorArgs{
//				Enable: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			member, err := guardduty.NewDetector(ctx, "member", &guardduty.DetectorArgs{
//				Enable: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = guardduty.NewMember(ctx, "member", &guardduty.MemberArgs{
//				AccountId:         member.AccountId,
//				DetectorId:        primary.ID(),
//				Email:             pulumi.String("required@example.com"),
//				Invite:            pulumi.Bool(true),
//				InvitationMessage: pulumi.String("please accept guardduty invitation"),
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
// Using `pulumi import`, import GuardDuty members using the primary GuardDuty detector ID and member AWS account ID. For example:
//
// ```sh
//
//	$ pulumi import aws:guardduty/member:Member MyMember 00b00fd5aecc0ab60a708659477e9617:123456789012
//
// ```
type Member struct {
	pulumi.CustomResourceState

	// AWS account ID for member account.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The detector ID of the GuardDuty account where you want to create member accounts.
	DetectorId pulumi.StringOutput `pulumi:"detectorId"`
	// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
	DisableEmailNotification pulumi.BoolPtrOutput `pulumi:"disableEmailNotification"`
	// Email address for member account.
	Email pulumi.StringOutput `pulumi:"email"`
	// Message for invitation.
	InvitationMessage pulumi.StringPtrOutput `pulumi:"invitationMessage"`
	// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
	Invite pulumi.BoolPtrOutput `pulumi:"invite"`
	// The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
	RelationshipStatus pulumi.StringOutput `pulumi:"relationshipStatus"`
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
	if args.DetectorId == nil {
		return nil, errors.New("invalid value for required argument 'DetectorId'")
	}
	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Member
	err := ctx.RegisterResource("aws:guardduty/member:Member", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:guardduty/member:Member", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Member resources.
type memberState struct {
	// AWS account ID for member account.
	AccountId *string `pulumi:"accountId"`
	// The detector ID of the GuardDuty account where you want to create member accounts.
	DetectorId *string `pulumi:"detectorId"`
	// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
	DisableEmailNotification *bool `pulumi:"disableEmailNotification"`
	// Email address for member account.
	Email *string `pulumi:"email"`
	// Message for invitation.
	InvitationMessage *string `pulumi:"invitationMessage"`
	// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
	Invite *bool `pulumi:"invite"`
	// The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
	RelationshipStatus *string `pulumi:"relationshipStatus"`
}

type MemberState struct {
	// AWS account ID for member account.
	AccountId pulumi.StringPtrInput
	// The detector ID of the GuardDuty account where you want to create member accounts.
	DetectorId pulumi.StringPtrInput
	// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
	DisableEmailNotification pulumi.BoolPtrInput
	// Email address for member account.
	Email pulumi.StringPtrInput
	// Message for invitation.
	InvitationMessage pulumi.StringPtrInput
	// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
	Invite pulumi.BoolPtrInput
	// The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
	RelationshipStatus pulumi.StringPtrInput
}

func (MemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*memberState)(nil)).Elem()
}

type memberArgs struct {
	// AWS account ID for member account.
	AccountId string `pulumi:"accountId"`
	// The detector ID of the GuardDuty account where you want to create member accounts.
	DetectorId string `pulumi:"detectorId"`
	// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
	DisableEmailNotification *bool `pulumi:"disableEmailNotification"`
	// Email address for member account.
	Email string `pulumi:"email"`
	// Message for invitation.
	InvitationMessage *string `pulumi:"invitationMessage"`
	// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
	Invite *bool `pulumi:"invite"`
}

// The set of arguments for constructing a Member resource.
type MemberArgs struct {
	// AWS account ID for member account.
	AccountId pulumi.StringInput
	// The detector ID of the GuardDuty account where you want to create member accounts.
	DetectorId pulumi.StringInput
	// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
	DisableEmailNotification pulumi.BoolPtrInput
	// Email address for member account.
	Email pulumi.StringInput
	// Message for invitation.
	InvitationMessage pulumi.StringPtrInput
	// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
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

// AWS account ID for member account.
func (o MemberOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The detector ID of the GuardDuty account where you want to create member accounts.
func (o MemberOutput) DetectorId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.DetectorId }).(pulumi.StringOutput)
}

// Boolean whether an email notification is sent to the accounts. Defaults to `false`.
func (o MemberOutput) DisableEmailNotification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.BoolPtrOutput { return v.DisableEmailNotification }).(pulumi.BoolPtrOutput)
}

// Email address for member account.
func (o MemberOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// Message for invitation.
func (o MemberOutput) InvitationMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.StringPtrOutput { return v.InvitationMessage }).(pulumi.StringPtrOutput)
}

// Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
func (o MemberOutput) Invite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.BoolPtrOutput { return v.Invite }).(pulumi.BoolPtrOutput)
}

// The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
func (o MemberOutput) RelationshipStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.RelationshipStatus }).(pulumi.StringOutput)
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
