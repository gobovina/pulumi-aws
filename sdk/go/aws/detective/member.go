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

// Provides a resource to manage an [Amazon Detective Member](https://docs.aws.amazon.com/detective/latest/APIReference/API_CreateMembers.html).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/detective"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := detective.NewGraph(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = detective.NewMember(ctx, "example", &detective.MemberArgs{
//				AccountId:                pulumi.String("AWS ACCOUNT ID"),
//				EmailAddress:             pulumi.String("EMAIL"),
//				GraphArn:                 example.ID(),
//				Message:                  pulumi.String("Message of the invitation"),
//				DisableEmailNotification: pulumi.Bool(true),
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
// Using `pulumi import`, import `aws_detective_member` using the ARN of the graph followed by the account ID of the member account. For example:
//
// ```sh
// $ pulumi import aws:detective/member:Member example arn:aws:detective:us-east-1:123456789101:graph:231684d34gh74g4bae1dbc7bd807d02d/123456789012
// ```
type Member struct {
	pulumi.CustomResourceState

	// AWS account ID for the account.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// AWS account ID for the administrator account.
	AdministratorId pulumi.StringOutput `pulumi:"administratorId"`
	// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
	DisableEmailNotification pulumi.BoolPtrOutput `pulumi:"disableEmailNotification"`
	DisabledReason           pulumi.StringOutput  `pulumi:"disabledReason"`
	// Email address for the account.
	EmailAddress pulumi.StringOutput `pulumi:"emailAddress"`
	// ARN of the behavior graph to invite the member accounts to contribute their data to.
	GraphArn pulumi.StringOutput `pulumi:"graphArn"`
	// Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
	InvitedTime pulumi.StringOutput `pulumi:"invitedTime"`
	// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
	Message pulumi.StringPtrOutput `pulumi:"message"`
	// Current membership status of the member account.
	Status pulumi.StringOutput `pulumi:"status"`
	// Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
	UpdatedTime pulumi.StringOutput `pulumi:"updatedTime"`
	// Data volume in bytes per day for the member account.
	VolumeUsageInBytes pulumi.StringOutput `pulumi:"volumeUsageInBytes"`
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
	if args.EmailAddress == nil {
		return nil, errors.New("invalid value for required argument 'EmailAddress'")
	}
	if args.GraphArn == nil {
		return nil, errors.New("invalid value for required argument 'GraphArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Member
	err := ctx.RegisterResource("aws:detective/member:Member", name, args, &resource, opts...)
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
	err := ctx.ReadResource("aws:detective/member:Member", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Member resources.
type memberState struct {
	// AWS account ID for the account.
	AccountId *string `pulumi:"accountId"`
	// AWS account ID for the administrator account.
	AdministratorId *string `pulumi:"administratorId"`
	// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
	DisableEmailNotification *bool   `pulumi:"disableEmailNotification"`
	DisabledReason           *string `pulumi:"disabledReason"`
	// Email address for the account.
	EmailAddress *string `pulumi:"emailAddress"`
	// ARN of the behavior graph to invite the member accounts to contribute their data to.
	GraphArn *string `pulumi:"graphArn"`
	// Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
	InvitedTime *string `pulumi:"invitedTime"`
	// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
	Message *string `pulumi:"message"`
	// Current membership status of the member account.
	Status *string `pulumi:"status"`
	// Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
	UpdatedTime *string `pulumi:"updatedTime"`
	// Data volume in bytes per day for the member account.
	VolumeUsageInBytes *string `pulumi:"volumeUsageInBytes"`
}

type MemberState struct {
	// AWS account ID for the account.
	AccountId pulumi.StringPtrInput
	// AWS account ID for the administrator account.
	AdministratorId pulumi.StringPtrInput
	// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
	DisableEmailNotification pulumi.BoolPtrInput
	DisabledReason           pulumi.StringPtrInput
	// Email address for the account.
	EmailAddress pulumi.StringPtrInput
	// ARN of the behavior graph to invite the member accounts to contribute their data to.
	GraphArn pulumi.StringPtrInput
	// Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
	InvitedTime pulumi.StringPtrInput
	// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
	Message pulumi.StringPtrInput
	// Current membership status of the member account.
	Status pulumi.StringPtrInput
	// Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
	UpdatedTime pulumi.StringPtrInput
	// Data volume in bytes per day for the member account.
	VolumeUsageInBytes pulumi.StringPtrInput
}

func (MemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*memberState)(nil)).Elem()
}

type memberArgs struct {
	// AWS account ID for the account.
	AccountId string `pulumi:"accountId"`
	// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
	DisableEmailNotification *bool `pulumi:"disableEmailNotification"`
	// Email address for the account.
	EmailAddress string `pulumi:"emailAddress"`
	// ARN of the behavior graph to invite the member accounts to contribute their data to.
	GraphArn string `pulumi:"graphArn"`
	// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
	Message *string `pulumi:"message"`
}

// The set of arguments for constructing a Member resource.
type MemberArgs struct {
	// AWS account ID for the account.
	AccountId pulumi.StringInput
	// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
	DisableEmailNotification pulumi.BoolPtrInput
	// Email address for the account.
	EmailAddress pulumi.StringInput
	// ARN of the behavior graph to invite the member accounts to contribute their data to.
	GraphArn pulumi.StringInput
	// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
	Message pulumi.StringPtrInput
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

// AWS account ID for the account.
func (o MemberOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// AWS account ID for the administrator account.
func (o MemberOutput) AdministratorId() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.AdministratorId }).(pulumi.StringOutput)
}

// If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
func (o MemberOutput) DisableEmailNotification() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.BoolPtrOutput { return v.DisableEmailNotification }).(pulumi.BoolPtrOutput)
}

func (o MemberOutput) DisabledReason() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.DisabledReason }).(pulumi.StringOutput)
}

// Email address for the account.
func (o MemberOutput) EmailAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.EmailAddress }).(pulumi.StringOutput)
}

// ARN of the behavior graph to invite the member accounts to contribute their data to.
func (o MemberOutput) GraphArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.GraphArn }).(pulumi.StringOutput)
}

// Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
func (o MemberOutput) InvitedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.InvitedTime }).(pulumi.StringOutput)
}

// A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
func (o MemberOutput) Message() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Member) pulumi.StringPtrOutput { return v.Message }).(pulumi.StringPtrOutput)
}

// Current membership status of the member account.
func (o MemberOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account's status.
func (o MemberOutput) UpdatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.UpdatedTime }).(pulumi.StringOutput)
}

// Data volume in bytes per day for the member account.
func (o MemberOutput) VolumeUsageInBytes() pulumi.StringOutput {
	return o.ApplyT(func(v *Member) pulumi.StringOutput { return v.VolumeUsageInBytes }).(pulumi.StringOutput)
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
