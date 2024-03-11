// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kendra

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Kendra FAQ.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kendra"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kendra.NewFaq(ctx, "example", &kendra.FaqArgs{
//				IndexId: pulumi.Any(exampleAwsKendraIndex.Id),
//				Name:    pulumi.String("Example"),
//				RoleArn: pulumi.Any(exampleAwsIamRole.Arn),
//				S3Path: &kendra.FaqS3PathArgs{
//					Bucket: pulumi.Any(exampleAwsS3Bucket.Id),
//					Key:    pulumi.Any(exampleAwsS3Object.Key),
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Example Kendra Faq"),
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
// <!--End PulumiCodeChooser -->
//
// ### With File Format
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kendra"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kendra.NewFaq(ctx, "example", &kendra.FaqArgs{
//				IndexId:    pulumi.Any(exampleAwsKendraIndex.Id),
//				Name:       pulumi.String("Example"),
//				FileFormat: pulumi.String("CSV"),
//				RoleArn:    pulumi.Any(exampleAwsIamRole.Arn),
//				S3Path: &kendra.FaqS3PathArgs{
//					Bucket: pulumi.Any(exampleAwsS3Bucket.Id),
//					Key:    pulumi.Any(exampleAwsS3Object.Key),
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
// <!--End PulumiCodeChooser -->
//
// ### With Language Code
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kendra"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kendra.NewFaq(ctx, "example", &kendra.FaqArgs{
//				IndexId:      pulumi.Any(exampleAwsKendraIndex.Id),
//				Name:         pulumi.String("Example"),
//				LanguageCode: pulumi.String("en"),
//				RoleArn:      pulumi.Any(exampleAwsIamRole.Arn),
//				S3Path: &kendra.FaqS3PathArgs{
//					Bucket: pulumi.Any(exampleAwsS3Bucket.Id),
//					Key:    pulumi.Any(exampleAwsS3Object.Key),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_kendra_faq` using the unique identifiers of the FAQ and index separated by a slash (`/`). For example:
//
// ```sh
// $ pulumi import aws:kendra/faq:Faq example faq-123456780/idx-8012925589
// ```
type Faq struct {
	pulumi.CustomResourceState

	// ARN of the FAQ.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Unix datetime that the FAQ was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The description for a FAQ.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// When the Status field value is `FAILED`, this contains a message that explains why.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// The identifier of the FAQ.
	FaqId pulumi.StringOutput `pulumi:"faqId"`
	// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
	FileFormat pulumi.StringPtrOutput `pulumi:"fileFormat"`
	// The identifier of the index for a FAQ.
	IndexId pulumi.StringOutput `pulumi:"indexId"`
	// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
	LanguageCode pulumi.StringOutput `pulumi:"languageCode"`
	// The name that should be associated with the FAQ.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
	RoleArn pulumi.StringOutput `pulumi:"roleArn"`
	// The S3 location of the FAQ input data. Detailed below.
	//
	// The `s3Path` configuration block supports the following arguments:
	S3Path FaqS3PathOutput `pulumi:"s3Path"`
	// The status of the FAQ. It is ready to use when the status is ACTIVE.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The date and time that the FAQ was last updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewFaq registers a new resource with the given unique name, arguments, and options.
func NewFaq(ctx *pulumi.Context,
	name string, args *FaqArgs, opts ...pulumi.ResourceOption) (*Faq, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IndexId == nil {
		return nil, errors.New("invalid value for required argument 'IndexId'")
	}
	if args.RoleArn == nil {
		return nil, errors.New("invalid value for required argument 'RoleArn'")
	}
	if args.S3Path == nil {
		return nil, errors.New("invalid value for required argument 'S3Path'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Faq
	err := ctx.RegisterResource("aws:kendra/faq:Faq", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFaq gets an existing Faq resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFaq(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FaqState, opts ...pulumi.ResourceOption) (*Faq, error) {
	var resource Faq
	err := ctx.ReadResource("aws:kendra/faq:Faq", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Faq resources.
type faqState struct {
	// ARN of the FAQ.
	Arn *string `pulumi:"arn"`
	// The Unix datetime that the FAQ was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The description for a FAQ.
	Description *string `pulumi:"description"`
	// When the Status field value is `FAILED`, this contains a message that explains why.
	ErrorMessage *string `pulumi:"errorMessage"`
	// The identifier of the FAQ.
	FaqId *string `pulumi:"faqId"`
	// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
	FileFormat *string `pulumi:"fileFormat"`
	// The identifier of the index for a FAQ.
	IndexId *string `pulumi:"indexId"`
	// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
	LanguageCode *string `pulumi:"languageCode"`
	// The name that should be associated with the FAQ.
	Name *string `pulumi:"name"`
	// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
	RoleArn *string `pulumi:"roleArn"`
	// The S3 location of the FAQ input data. Detailed below.
	//
	// The `s3Path` configuration block supports the following arguments:
	S3Path *FaqS3Path `pulumi:"s3Path"`
	// The status of the FAQ. It is ready to use when the status is ACTIVE.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The date and time that the FAQ was last updated.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type FaqState struct {
	// ARN of the FAQ.
	Arn pulumi.StringPtrInput
	// The Unix datetime that the FAQ was created.
	CreatedAt pulumi.StringPtrInput
	// The description for a FAQ.
	Description pulumi.StringPtrInput
	// When the Status field value is `FAILED`, this contains a message that explains why.
	ErrorMessage pulumi.StringPtrInput
	// The identifier of the FAQ.
	FaqId pulumi.StringPtrInput
	// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
	FileFormat pulumi.StringPtrInput
	// The identifier of the index for a FAQ.
	IndexId pulumi.StringPtrInput
	// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
	LanguageCode pulumi.StringPtrInput
	// The name that should be associated with the FAQ.
	Name pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
	RoleArn pulumi.StringPtrInput
	// The S3 location of the FAQ input data. Detailed below.
	//
	// The `s3Path` configuration block supports the following arguments:
	S3Path FaqS3PathPtrInput
	// The status of the FAQ. It is ready to use when the status is ACTIVE.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The date and time that the FAQ was last updated.
	UpdatedAt pulumi.StringPtrInput
}

func (FaqState) ElementType() reflect.Type {
	return reflect.TypeOf((*faqState)(nil)).Elem()
}

type faqArgs struct {
	// The description for a FAQ.
	Description *string `pulumi:"description"`
	// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
	FileFormat *string `pulumi:"fileFormat"`
	// The identifier of the index for a FAQ.
	IndexId string `pulumi:"indexId"`
	// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
	LanguageCode *string `pulumi:"languageCode"`
	// The name that should be associated with the FAQ.
	Name *string `pulumi:"name"`
	// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
	RoleArn string `pulumi:"roleArn"`
	// The S3 location of the FAQ input data. Detailed below.
	//
	// The `s3Path` configuration block supports the following arguments:
	S3Path FaqS3Path `pulumi:"s3Path"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Faq resource.
type FaqArgs struct {
	// The description for a FAQ.
	Description pulumi.StringPtrInput
	// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
	FileFormat pulumi.StringPtrInput
	// The identifier of the index for a FAQ.
	IndexId pulumi.StringInput
	// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
	LanguageCode pulumi.StringPtrInput
	// The name that should be associated with the FAQ.
	Name pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
	RoleArn pulumi.StringInput
	// The S3 location of the FAQ input data. Detailed below.
	//
	// The `s3Path` configuration block supports the following arguments:
	S3Path FaqS3PathInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (FaqArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*faqArgs)(nil)).Elem()
}

type FaqInput interface {
	pulumi.Input

	ToFaqOutput() FaqOutput
	ToFaqOutputWithContext(ctx context.Context) FaqOutput
}

func (*Faq) ElementType() reflect.Type {
	return reflect.TypeOf((**Faq)(nil)).Elem()
}

func (i *Faq) ToFaqOutput() FaqOutput {
	return i.ToFaqOutputWithContext(context.Background())
}

func (i *Faq) ToFaqOutputWithContext(ctx context.Context) FaqOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FaqOutput)
}

// FaqArrayInput is an input type that accepts FaqArray and FaqArrayOutput values.
// You can construct a concrete instance of `FaqArrayInput` via:
//
//	FaqArray{ FaqArgs{...} }
type FaqArrayInput interface {
	pulumi.Input

	ToFaqArrayOutput() FaqArrayOutput
	ToFaqArrayOutputWithContext(context.Context) FaqArrayOutput
}

type FaqArray []FaqInput

func (FaqArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Faq)(nil)).Elem()
}

func (i FaqArray) ToFaqArrayOutput() FaqArrayOutput {
	return i.ToFaqArrayOutputWithContext(context.Background())
}

func (i FaqArray) ToFaqArrayOutputWithContext(ctx context.Context) FaqArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FaqArrayOutput)
}

// FaqMapInput is an input type that accepts FaqMap and FaqMapOutput values.
// You can construct a concrete instance of `FaqMapInput` via:
//
//	FaqMap{ "key": FaqArgs{...} }
type FaqMapInput interface {
	pulumi.Input

	ToFaqMapOutput() FaqMapOutput
	ToFaqMapOutputWithContext(context.Context) FaqMapOutput
}

type FaqMap map[string]FaqInput

func (FaqMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Faq)(nil)).Elem()
}

func (i FaqMap) ToFaqMapOutput() FaqMapOutput {
	return i.ToFaqMapOutputWithContext(context.Background())
}

func (i FaqMap) ToFaqMapOutputWithContext(ctx context.Context) FaqMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FaqMapOutput)
}

type FaqOutput struct{ *pulumi.OutputState }

func (FaqOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Faq)(nil)).Elem()
}

func (o FaqOutput) ToFaqOutput() FaqOutput {
	return o
}

func (o FaqOutput) ToFaqOutputWithContext(ctx context.Context) FaqOutput {
	return o
}

// ARN of the FAQ.
func (o FaqOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Unix datetime that the FAQ was created.
func (o FaqOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The description for a FAQ.
func (o FaqOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// When the Status field value is `FAILED`, this contains a message that explains why.
func (o FaqOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// The identifier of the FAQ.
func (o FaqOutput) FaqId() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.FaqId }).(pulumi.StringOutput)
}

// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
func (o FaqOutput) FileFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringPtrOutput { return v.FileFormat }).(pulumi.StringPtrOutput)
}

// The identifier of the index for a FAQ.
func (o FaqOutput) IndexId() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.IndexId }).(pulumi.StringOutput)
}

// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
func (o FaqOutput) LanguageCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.LanguageCode }).(pulumi.StringOutput)
}

// The name that should be associated with the FAQ.
func (o FaqOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
func (o FaqOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.RoleArn }).(pulumi.StringOutput)
}

// The S3 location of the FAQ input data. Detailed below.
//
// The `s3Path` configuration block supports the following arguments:
func (o FaqOutput) S3Path() FaqS3PathOutput {
	return o.ApplyT(func(v *Faq) FaqS3PathOutput { return v.S3Path }).(FaqS3PathOutput)
}

// The status of the FAQ. It is ready to use when the status is ACTIVE.
func (o FaqOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o FaqOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o FaqOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The date and time that the FAQ was last updated.
func (o FaqOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Faq) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type FaqArrayOutput struct{ *pulumi.OutputState }

func (FaqArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Faq)(nil)).Elem()
}

func (o FaqArrayOutput) ToFaqArrayOutput() FaqArrayOutput {
	return o
}

func (o FaqArrayOutput) ToFaqArrayOutputWithContext(ctx context.Context) FaqArrayOutput {
	return o
}

func (o FaqArrayOutput) Index(i pulumi.IntInput) FaqOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Faq {
		return vs[0].([]*Faq)[vs[1].(int)]
	}).(FaqOutput)
}

type FaqMapOutput struct{ *pulumi.OutputState }

func (FaqMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Faq)(nil)).Elem()
}

func (o FaqMapOutput) ToFaqMapOutput() FaqMapOutput {
	return o
}

func (o FaqMapOutput) ToFaqMapOutputWithContext(ctx context.Context) FaqMapOutput {
	return o
}

func (o FaqMapOutput) MapIndex(k pulumi.StringInput) FaqOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Faq {
		return vs[0].(map[string]*Faq)[vs[1].(string)]
	}).(FaqOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FaqInput)(nil)).Elem(), &Faq{})
	pulumi.RegisterInputType(reflect.TypeOf((*FaqArrayInput)(nil)).Elem(), FaqArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FaqMapInput)(nil)).Elem(), FaqMap{})
	pulumi.RegisterOutputType(FaqOutput{})
	pulumi.RegisterOutputType(FaqArrayOutput{})
	pulumi.RegisterOutputType(FaqMapOutput{})
}
