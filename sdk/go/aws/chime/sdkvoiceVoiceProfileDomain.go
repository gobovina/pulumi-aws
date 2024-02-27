// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chime

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Chime SDK Voice Profile Domain.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/chime"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleKey, err := kms.NewKey(ctx, "exampleKey", &kms.KeyArgs{
//				Description:          pulumi.String("KMS Key for Voice Profile Domain"),
//				DeletionWindowInDays: pulumi.Int(7),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = chime.NewSdkvoiceVoiceProfileDomain(ctx, "exampleSdkvoiceVoiceProfileDomain", &chime.SdkvoiceVoiceProfileDomainArgs{
//				ServerSideEncryptionConfiguration: &chime.SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationArgs{
//					KmsKeyArn: exampleKey.Arn,
//				},
//				Description: pulumi.String("My Voice Profile Domain"),
//				Tags: pulumi.StringMap{
//					"key1": pulumi.String("value1"),
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
// Using `pulumi import`, import AWS Chime SDK Voice Profile Domain using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:chime/sdkvoiceVoiceProfileDomain:SdkvoiceVoiceProfileDomain example abcdef123456
//
// ```
type SdkvoiceVoiceProfileDomain struct {
	pulumi.CustomResourceState

	// ARN of the Voice Profile Domain.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Description of Voice Profile Domain.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of Voice Profile Domain.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration for server side encryption.
	ServerSideEncryptionConfiguration SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationOutput `pulumi:"serverSideEncryptionConfiguration"`
	Tags                              pulumi.StringMapOutput                                            `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewSdkvoiceVoiceProfileDomain registers a new resource with the given unique name, arguments, and options.
func NewSdkvoiceVoiceProfileDomain(ctx *pulumi.Context,
	name string, args *SdkvoiceVoiceProfileDomainArgs, opts ...pulumi.ResourceOption) (*SdkvoiceVoiceProfileDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServerSideEncryptionConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'ServerSideEncryptionConfiguration'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SdkvoiceVoiceProfileDomain
	err := ctx.RegisterResource("aws:chime/sdkvoiceVoiceProfileDomain:SdkvoiceVoiceProfileDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSdkvoiceVoiceProfileDomain gets an existing SdkvoiceVoiceProfileDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSdkvoiceVoiceProfileDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SdkvoiceVoiceProfileDomainState, opts ...pulumi.ResourceOption) (*SdkvoiceVoiceProfileDomain, error) {
	var resource SdkvoiceVoiceProfileDomain
	err := ctx.ReadResource("aws:chime/sdkvoiceVoiceProfileDomain:SdkvoiceVoiceProfileDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SdkvoiceVoiceProfileDomain resources.
type sdkvoiceVoiceProfileDomainState struct {
	// ARN of the Voice Profile Domain.
	Arn *string `pulumi:"arn"`
	// Description of Voice Profile Domain.
	Description *string `pulumi:"description"`
	// Name of Voice Profile Domain.
	Name *string `pulumi:"name"`
	// Configuration for server side encryption.
	ServerSideEncryptionConfiguration *SdkvoiceVoiceProfileDomainServerSideEncryptionConfiguration `pulumi:"serverSideEncryptionConfiguration"`
	Tags                              map[string]string                                            `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type SdkvoiceVoiceProfileDomainState struct {
	// ARN of the Voice Profile Domain.
	Arn pulumi.StringPtrInput
	// Description of Voice Profile Domain.
	Description pulumi.StringPtrInput
	// Name of Voice Profile Domain.
	Name pulumi.StringPtrInput
	// Configuration for server side encryption.
	ServerSideEncryptionConfiguration SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationPtrInput
	Tags                              pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (SdkvoiceVoiceProfileDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*sdkvoiceVoiceProfileDomainState)(nil)).Elem()
}

type sdkvoiceVoiceProfileDomainArgs struct {
	// Description of Voice Profile Domain.
	Description *string `pulumi:"description"`
	// Name of Voice Profile Domain.
	Name *string `pulumi:"name"`
	// Configuration for server side encryption.
	ServerSideEncryptionConfiguration SdkvoiceVoiceProfileDomainServerSideEncryptionConfiguration `pulumi:"serverSideEncryptionConfiguration"`
	Tags                              map[string]string                                           `pulumi:"tags"`
}

// The set of arguments for constructing a SdkvoiceVoiceProfileDomain resource.
type SdkvoiceVoiceProfileDomainArgs struct {
	// Description of Voice Profile Domain.
	Description pulumi.StringPtrInput
	// Name of Voice Profile Domain.
	Name pulumi.StringPtrInput
	// Configuration for server side encryption.
	ServerSideEncryptionConfiguration SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationInput
	Tags                              pulumi.StringMapInput
}

func (SdkvoiceVoiceProfileDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sdkvoiceVoiceProfileDomainArgs)(nil)).Elem()
}

type SdkvoiceVoiceProfileDomainInput interface {
	pulumi.Input

	ToSdkvoiceVoiceProfileDomainOutput() SdkvoiceVoiceProfileDomainOutput
	ToSdkvoiceVoiceProfileDomainOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainOutput
}

func (*SdkvoiceVoiceProfileDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (i *SdkvoiceVoiceProfileDomain) ToSdkvoiceVoiceProfileDomainOutput() SdkvoiceVoiceProfileDomainOutput {
	return i.ToSdkvoiceVoiceProfileDomainOutputWithContext(context.Background())
}

func (i *SdkvoiceVoiceProfileDomain) ToSdkvoiceVoiceProfileDomainOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceVoiceProfileDomainOutput)
}

// SdkvoiceVoiceProfileDomainArrayInput is an input type that accepts SdkvoiceVoiceProfileDomainArray and SdkvoiceVoiceProfileDomainArrayOutput values.
// You can construct a concrete instance of `SdkvoiceVoiceProfileDomainArrayInput` via:
//
//	SdkvoiceVoiceProfileDomainArray{ SdkvoiceVoiceProfileDomainArgs{...} }
type SdkvoiceVoiceProfileDomainArrayInput interface {
	pulumi.Input

	ToSdkvoiceVoiceProfileDomainArrayOutput() SdkvoiceVoiceProfileDomainArrayOutput
	ToSdkvoiceVoiceProfileDomainArrayOutputWithContext(context.Context) SdkvoiceVoiceProfileDomainArrayOutput
}

type SdkvoiceVoiceProfileDomainArray []SdkvoiceVoiceProfileDomainInput

func (SdkvoiceVoiceProfileDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (i SdkvoiceVoiceProfileDomainArray) ToSdkvoiceVoiceProfileDomainArrayOutput() SdkvoiceVoiceProfileDomainArrayOutput {
	return i.ToSdkvoiceVoiceProfileDomainArrayOutputWithContext(context.Background())
}

func (i SdkvoiceVoiceProfileDomainArray) ToSdkvoiceVoiceProfileDomainArrayOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceVoiceProfileDomainArrayOutput)
}

// SdkvoiceVoiceProfileDomainMapInput is an input type that accepts SdkvoiceVoiceProfileDomainMap and SdkvoiceVoiceProfileDomainMapOutput values.
// You can construct a concrete instance of `SdkvoiceVoiceProfileDomainMapInput` via:
//
//	SdkvoiceVoiceProfileDomainMap{ "key": SdkvoiceVoiceProfileDomainArgs{...} }
type SdkvoiceVoiceProfileDomainMapInput interface {
	pulumi.Input

	ToSdkvoiceVoiceProfileDomainMapOutput() SdkvoiceVoiceProfileDomainMapOutput
	ToSdkvoiceVoiceProfileDomainMapOutputWithContext(context.Context) SdkvoiceVoiceProfileDomainMapOutput
}

type SdkvoiceVoiceProfileDomainMap map[string]SdkvoiceVoiceProfileDomainInput

func (SdkvoiceVoiceProfileDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (i SdkvoiceVoiceProfileDomainMap) ToSdkvoiceVoiceProfileDomainMapOutput() SdkvoiceVoiceProfileDomainMapOutput {
	return i.ToSdkvoiceVoiceProfileDomainMapOutputWithContext(context.Background())
}

func (i SdkvoiceVoiceProfileDomainMap) ToSdkvoiceVoiceProfileDomainMapOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SdkvoiceVoiceProfileDomainMapOutput)
}

type SdkvoiceVoiceProfileDomainOutput struct{ *pulumi.OutputState }

func (SdkvoiceVoiceProfileDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (o SdkvoiceVoiceProfileDomainOutput) ToSdkvoiceVoiceProfileDomainOutput() SdkvoiceVoiceProfileDomainOutput {
	return o
}

func (o SdkvoiceVoiceProfileDomainOutput) ToSdkvoiceVoiceProfileDomainOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainOutput {
	return o
}

// ARN of the Voice Profile Domain.
func (o SdkvoiceVoiceProfileDomainOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Description of Voice Profile Domain.
func (o SdkvoiceVoiceProfileDomainOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of Voice Profile Domain.
func (o SdkvoiceVoiceProfileDomainOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration for server side encryption.
func (o SdkvoiceVoiceProfileDomainOutput) ServerSideEncryptionConfiguration() SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationOutput {
		return v.ServerSideEncryptionConfiguration
	}).(SdkvoiceVoiceProfileDomainServerSideEncryptionConfigurationOutput)
}

func (o SdkvoiceVoiceProfileDomainOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o SdkvoiceVoiceProfileDomainOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SdkvoiceVoiceProfileDomain) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type SdkvoiceVoiceProfileDomainArrayOutput struct{ *pulumi.OutputState }

func (SdkvoiceVoiceProfileDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (o SdkvoiceVoiceProfileDomainArrayOutput) ToSdkvoiceVoiceProfileDomainArrayOutput() SdkvoiceVoiceProfileDomainArrayOutput {
	return o
}

func (o SdkvoiceVoiceProfileDomainArrayOutput) ToSdkvoiceVoiceProfileDomainArrayOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainArrayOutput {
	return o
}

func (o SdkvoiceVoiceProfileDomainArrayOutput) Index(i pulumi.IntInput) SdkvoiceVoiceProfileDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SdkvoiceVoiceProfileDomain {
		return vs[0].([]*SdkvoiceVoiceProfileDomain)[vs[1].(int)]
	}).(SdkvoiceVoiceProfileDomainOutput)
}

type SdkvoiceVoiceProfileDomainMapOutput struct{ *pulumi.OutputState }

func (SdkvoiceVoiceProfileDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SdkvoiceVoiceProfileDomain)(nil)).Elem()
}

func (o SdkvoiceVoiceProfileDomainMapOutput) ToSdkvoiceVoiceProfileDomainMapOutput() SdkvoiceVoiceProfileDomainMapOutput {
	return o
}

func (o SdkvoiceVoiceProfileDomainMapOutput) ToSdkvoiceVoiceProfileDomainMapOutputWithContext(ctx context.Context) SdkvoiceVoiceProfileDomainMapOutput {
	return o
}

func (o SdkvoiceVoiceProfileDomainMapOutput) MapIndex(k pulumi.StringInput) SdkvoiceVoiceProfileDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SdkvoiceVoiceProfileDomain {
		return vs[0].(map[string]*SdkvoiceVoiceProfileDomain)[vs[1].(string)]
	}).(SdkvoiceVoiceProfileDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceVoiceProfileDomainInput)(nil)).Elem(), &SdkvoiceVoiceProfileDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceVoiceProfileDomainArrayInput)(nil)).Elem(), SdkvoiceVoiceProfileDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SdkvoiceVoiceProfileDomainMapInput)(nil)).Elem(), SdkvoiceVoiceProfileDomainMap{})
	pulumi.RegisterOutputType(SdkvoiceVoiceProfileDomainOutput{})
	pulumi.RegisterOutputType(SdkvoiceVoiceProfileDomainArrayOutput{})
	pulumi.RegisterOutputType(SdkvoiceVoiceProfileDomainMapOutput{})
}
