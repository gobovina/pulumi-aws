// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AWS Transfer AS2 Agreement resource.
//
// ## Example Usage
//
// ### Basic
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewAgreement(ctx, "example", &transfer.AgreementArgs{
//				AccessRole:       pulumi.Any(test.Arn),
//				BaseDirectory:    pulumi.String("/DOC-EXAMPLE-BUCKET/home/mydirectory"),
//				Description:      pulumi.String("example"),
//				LocalProfileId:   pulumi.Any(local.ProfileId),
//				PartnerProfileId: pulumi.Any(partner.ProfileId),
//				ServerId:         pulumi.Any(testAwsTransferServer.Id),
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
// Using `pulumi import`, import Transfer AS2 Agreement using the `server_id/agreement_id`. For example:
//
// ```sh
// $ pulumi import aws:transfer/agreement:Agreement example s-4221a88afd5f4362a/a-4221a88afd5f4362a
// ```
type Agreement struct {
	pulumi.CustomResourceState

	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringOutput `pulumi:"accessRole"`
	// The unique identifier for the AS2 agreement.
	AgreementId pulumi.StringOutput `pulumi:"agreementId"`
	// The ARN of the agreement.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The landing directory for the files transferred by using the AS2 protocol.
	BaseDirectory pulumi.StringOutput `pulumi:"baseDirectory"`
	// The Optional description of the transdfer.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The unique identifier for the AS2 local profile.
	LocalProfileId pulumi.StringOutput `pulumi:"localProfileId"`
	// The unique identifier for the AS2 partner profile.
	PartnerProfileId pulumi.StringOutput `pulumi:"partnerProfileId"`
	// The unique server identifier for the server instance. This is the specific server the agreement uses.
	ServerId pulumi.StringOutput `pulumi:"serverId"`
	Status   pulumi.StringOutput `pulumi:"status"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewAgreement registers a new resource with the given unique name, arguments, and options.
func NewAgreement(ctx *pulumi.Context,
	name string, args *AgreementArgs, opts ...pulumi.ResourceOption) (*Agreement, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessRole == nil {
		return nil, errors.New("invalid value for required argument 'AccessRole'")
	}
	if args.BaseDirectory == nil {
		return nil, errors.New("invalid value for required argument 'BaseDirectory'")
	}
	if args.LocalProfileId == nil {
		return nil, errors.New("invalid value for required argument 'LocalProfileId'")
	}
	if args.PartnerProfileId == nil {
		return nil, errors.New("invalid value for required argument 'PartnerProfileId'")
	}
	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Agreement
	err := ctx.RegisterResource("aws:transfer/agreement:Agreement", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAgreement gets an existing Agreement resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAgreement(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AgreementState, opts ...pulumi.ResourceOption) (*Agreement, error) {
	var resource Agreement
	err := ctx.ReadResource("aws:transfer/agreement:Agreement", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Agreement resources.
type agreementState struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole *string `pulumi:"accessRole"`
	// The unique identifier for the AS2 agreement.
	AgreementId *string `pulumi:"agreementId"`
	// The ARN of the agreement.
	Arn *string `pulumi:"arn"`
	// The landing directory for the files transferred by using the AS2 protocol.
	BaseDirectory *string `pulumi:"baseDirectory"`
	// The Optional description of the transdfer.
	Description *string `pulumi:"description"`
	// The unique identifier for the AS2 local profile.
	LocalProfileId *string `pulumi:"localProfileId"`
	// The unique identifier for the AS2 partner profile.
	PartnerProfileId *string `pulumi:"partnerProfileId"`
	// The unique server identifier for the server instance. This is the specific server the agreement uses.
	ServerId *string `pulumi:"serverId"`
	Status   *string `pulumi:"status"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AgreementState struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringPtrInput
	// The unique identifier for the AS2 agreement.
	AgreementId pulumi.StringPtrInput
	// The ARN of the agreement.
	Arn pulumi.StringPtrInput
	// The landing directory for the files transferred by using the AS2 protocol.
	BaseDirectory pulumi.StringPtrInput
	// The Optional description of the transdfer.
	Description pulumi.StringPtrInput
	// The unique identifier for the AS2 local profile.
	LocalProfileId pulumi.StringPtrInput
	// The unique identifier for the AS2 partner profile.
	PartnerProfileId pulumi.StringPtrInput
	// The unique server identifier for the server instance. This is the specific server the agreement uses.
	ServerId pulumi.StringPtrInput
	Status   pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (AgreementState) ElementType() reflect.Type {
	return reflect.TypeOf((*agreementState)(nil)).Elem()
}

type agreementArgs struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole string `pulumi:"accessRole"`
	// The landing directory for the files transferred by using the AS2 protocol.
	BaseDirectory string `pulumi:"baseDirectory"`
	// The Optional description of the transdfer.
	Description *string `pulumi:"description"`
	// The unique identifier for the AS2 local profile.
	LocalProfileId string `pulumi:"localProfileId"`
	// The unique identifier for the AS2 partner profile.
	PartnerProfileId string `pulumi:"partnerProfileId"`
	// The unique server identifier for the server instance. This is the specific server the agreement uses.
	ServerId string `pulumi:"serverId"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Agreement resource.
type AgreementArgs struct {
	// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
	AccessRole pulumi.StringInput
	// The landing directory for the files transferred by using the AS2 protocol.
	BaseDirectory pulumi.StringInput
	// The Optional description of the transdfer.
	Description pulumi.StringPtrInput
	// The unique identifier for the AS2 local profile.
	LocalProfileId pulumi.StringInput
	// The unique identifier for the AS2 partner profile.
	PartnerProfileId pulumi.StringInput
	// The unique server identifier for the server instance. This is the specific server the agreement uses.
	ServerId pulumi.StringInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AgreementArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*agreementArgs)(nil)).Elem()
}

type AgreementInput interface {
	pulumi.Input

	ToAgreementOutput() AgreementOutput
	ToAgreementOutputWithContext(ctx context.Context) AgreementOutput
}

func (*Agreement) ElementType() reflect.Type {
	return reflect.TypeOf((**Agreement)(nil)).Elem()
}

func (i *Agreement) ToAgreementOutput() AgreementOutput {
	return i.ToAgreementOutputWithContext(context.Background())
}

func (i *Agreement) ToAgreementOutputWithContext(ctx context.Context) AgreementOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgreementOutput)
}

// AgreementArrayInput is an input type that accepts AgreementArray and AgreementArrayOutput values.
// You can construct a concrete instance of `AgreementArrayInput` via:
//
//	AgreementArray{ AgreementArgs{...} }
type AgreementArrayInput interface {
	pulumi.Input

	ToAgreementArrayOutput() AgreementArrayOutput
	ToAgreementArrayOutputWithContext(context.Context) AgreementArrayOutput
}

type AgreementArray []AgreementInput

func (AgreementArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Agreement)(nil)).Elem()
}

func (i AgreementArray) ToAgreementArrayOutput() AgreementArrayOutput {
	return i.ToAgreementArrayOutputWithContext(context.Background())
}

func (i AgreementArray) ToAgreementArrayOutputWithContext(ctx context.Context) AgreementArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgreementArrayOutput)
}

// AgreementMapInput is an input type that accepts AgreementMap and AgreementMapOutput values.
// You can construct a concrete instance of `AgreementMapInput` via:
//
//	AgreementMap{ "key": AgreementArgs{...} }
type AgreementMapInput interface {
	pulumi.Input

	ToAgreementMapOutput() AgreementMapOutput
	ToAgreementMapOutputWithContext(context.Context) AgreementMapOutput
}

type AgreementMap map[string]AgreementInput

func (AgreementMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Agreement)(nil)).Elem()
}

func (i AgreementMap) ToAgreementMapOutput() AgreementMapOutput {
	return i.ToAgreementMapOutputWithContext(context.Background())
}

func (i AgreementMap) ToAgreementMapOutputWithContext(ctx context.Context) AgreementMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AgreementMapOutput)
}

type AgreementOutput struct{ *pulumi.OutputState }

func (AgreementOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Agreement)(nil)).Elem()
}

func (o AgreementOutput) ToAgreementOutput() AgreementOutput {
	return o
}

func (o AgreementOutput) ToAgreementOutputWithContext(ctx context.Context) AgreementOutput {
	return o
}

// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
func (o AgreementOutput) AccessRole() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.AccessRole }).(pulumi.StringOutput)
}

// The unique identifier for the AS2 agreement.
func (o AgreementOutput) AgreementId() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.AgreementId }).(pulumi.StringOutput)
}

// The ARN of the agreement.
func (o AgreementOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The landing directory for the files transferred by using the AS2 protocol.
func (o AgreementOutput) BaseDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.BaseDirectory }).(pulumi.StringOutput)
}

// The Optional description of the transdfer.
func (o AgreementOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The unique identifier for the AS2 local profile.
func (o AgreementOutput) LocalProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.LocalProfileId }).(pulumi.StringOutput)
}

// The unique identifier for the AS2 partner profile.
func (o AgreementOutput) PartnerProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.PartnerProfileId }).(pulumi.StringOutput)
}

// The unique server identifier for the server instance. This is the specific server the agreement uses.
func (o AgreementOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

func (o AgreementOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AgreementOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o AgreementOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Agreement) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type AgreementArrayOutput struct{ *pulumi.OutputState }

func (AgreementArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Agreement)(nil)).Elem()
}

func (o AgreementArrayOutput) ToAgreementArrayOutput() AgreementArrayOutput {
	return o
}

func (o AgreementArrayOutput) ToAgreementArrayOutputWithContext(ctx context.Context) AgreementArrayOutput {
	return o
}

func (o AgreementArrayOutput) Index(i pulumi.IntInput) AgreementOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Agreement {
		return vs[0].([]*Agreement)[vs[1].(int)]
	}).(AgreementOutput)
}

type AgreementMapOutput struct{ *pulumi.OutputState }

func (AgreementMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Agreement)(nil)).Elem()
}

func (o AgreementMapOutput) ToAgreementMapOutput() AgreementMapOutput {
	return o
}

func (o AgreementMapOutput) ToAgreementMapOutputWithContext(ctx context.Context) AgreementMapOutput {
	return o
}

func (o AgreementMapOutput) MapIndex(k pulumi.StringInput) AgreementOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Agreement {
		return vs[0].(map[string]*Agreement)[vs[1].(string)]
	}).(AgreementOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AgreementInput)(nil)).Elem(), &Agreement{})
	pulumi.RegisterInputType(reflect.TypeOf((*AgreementArrayInput)(nil)).Elem(), AgreementArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AgreementMapInput)(nil)).Elem(), AgreementMap{})
	pulumi.RegisterOutputType(AgreementOutput{})
	pulumi.RegisterOutputType(AgreementArrayOutput{})
	pulumi.RegisterOutputType(AgreementMapOutput{})
}
