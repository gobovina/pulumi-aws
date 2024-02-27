// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transcribe

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Transcribe Vocabulary.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transcribe"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleBucketV2, err := s3.NewBucketV2(ctx, "exampleBucketV2", &s3.BucketV2Args{
//				ForceDestroy: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			object, err := s3.NewBucketObjectv2(ctx, "object", &s3.BucketObjectv2Args{
//				Bucket: exampleBucketV2.ID(),
//				Key:    pulumi.String("transcribe/test1.txt"),
//				Source: pulumi.NewFileAsset("test.txt"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = transcribe.NewVocabulary(ctx, "exampleVocabulary", &transcribe.VocabularyArgs{
//				VocabularyName: pulumi.String("example"),
//				LanguageCode:   pulumi.String("en-US"),
//				VocabularyFileUri: pulumi.All(exampleBucketV2.ID(), object.Key).ApplyT(func(_args []interface{}) (string, error) {
//					id := _args[0].(string)
//					key := _args[1].(string)
//					return fmt.Sprintf("s3://%v/%v", id, key), nil
//				}).(pulumi.StringOutput),
//				Tags: pulumi.StringMap{
//					"tag1": pulumi.String("value1"),
//					"tag2": pulumi.String("value3"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				object,
//			}))
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
// Using `pulumi import`, import Transcribe Vocabulary using the `vocabulary_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:transcribe/vocabulary:Vocabulary example example-name
//
// ```
type Vocabulary struct {
	pulumi.CustomResourceState

	// ARN of the Vocabulary.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Generated download URI.
	DownloadUri pulumi.StringOutput `pulumi:"downloadUri"`
	// The language code you selected for your vocabulary.
	LanguageCode pulumi.StringOutput `pulumi:"languageCode"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
	Phrases pulumi.StringArrayOutput `pulumi:"phrases"`
	// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
	VocabularyFileUri pulumi.StringOutput `pulumi:"vocabularyFileUri"`
	// The name of the Vocabulary.
	//
	// The following arguments are optional:
	VocabularyName pulumi.StringOutput `pulumi:"vocabularyName"`
}

// NewVocabulary registers a new resource with the given unique name, arguments, and options.
func NewVocabulary(ctx *pulumi.Context,
	name string, args *VocabularyArgs, opts ...pulumi.ResourceOption) (*Vocabulary, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LanguageCode == nil {
		return nil, errors.New("invalid value for required argument 'LanguageCode'")
	}
	if args.VocabularyName == nil {
		return nil, errors.New("invalid value for required argument 'VocabularyName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Vocabulary
	err := ctx.RegisterResource("aws:transcribe/vocabulary:Vocabulary", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVocabulary gets an existing Vocabulary resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVocabulary(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VocabularyState, opts ...pulumi.ResourceOption) (*Vocabulary, error) {
	var resource Vocabulary
	err := ctx.ReadResource("aws:transcribe/vocabulary:Vocabulary", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vocabulary resources.
type vocabularyState struct {
	// ARN of the Vocabulary.
	Arn *string `pulumi:"arn"`
	// Generated download URI.
	DownloadUri *string `pulumi:"downloadUri"`
	// The language code you selected for your vocabulary.
	LanguageCode *string `pulumi:"languageCode"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
	Phrases []string `pulumi:"phrases"`
	// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
	VocabularyFileUri *string `pulumi:"vocabularyFileUri"`
	// The name of the Vocabulary.
	//
	// The following arguments are optional:
	VocabularyName *string `pulumi:"vocabularyName"`
}

type VocabularyState struct {
	// ARN of the Vocabulary.
	Arn pulumi.StringPtrInput
	// Generated download URI.
	DownloadUri pulumi.StringPtrInput
	// The language code you selected for your vocabulary.
	LanguageCode pulumi.StringPtrInput
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
	Phrases pulumi.StringArrayInput
	// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
	VocabularyFileUri pulumi.StringPtrInput
	// The name of the Vocabulary.
	//
	// The following arguments are optional:
	VocabularyName pulumi.StringPtrInput
}

func (VocabularyState) ElementType() reflect.Type {
	return reflect.TypeOf((*vocabularyState)(nil)).Elem()
}

type vocabularyArgs struct {
	// The language code you selected for your vocabulary.
	LanguageCode string `pulumi:"languageCode"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
	Phrases []string `pulumi:"phrases"`
	// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
	VocabularyFileUri *string `pulumi:"vocabularyFileUri"`
	// The name of the Vocabulary.
	//
	// The following arguments are optional:
	VocabularyName string `pulumi:"vocabularyName"`
}

// The set of arguments for constructing a Vocabulary resource.
type VocabularyArgs struct {
	// The language code you selected for your vocabulary.
	LanguageCode pulumi.StringInput
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
	Phrases pulumi.StringArrayInput
	// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
	VocabularyFileUri pulumi.StringPtrInput
	// The name of the Vocabulary.
	//
	// The following arguments are optional:
	VocabularyName pulumi.StringInput
}

func (VocabularyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vocabularyArgs)(nil)).Elem()
}

type VocabularyInput interface {
	pulumi.Input

	ToVocabularyOutput() VocabularyOutput
	ToVocabularyOutputWithContext(ctx context.Context) VocabularyOutput
}

func (*Vocabulary) ElementType() reflect.Type {
	return reflect.TypeOf((**Vocabulary)(nil)).Elem()
}

func (i *Vocabulary) ToVocabularyOutput() VocabularyOutput {
	return i.ToVocabularyOutputWithContext(context.Background())
}

func (i *Vocabulary) ToVocabularyOutputWithContext(ctx context.Context) VocabularyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyOutput)
}

// VocabularyArrayInput is an input type that accepts VocabularyArray and VocabularyArrayOutput values.
// You can construct a concrete instance of `VocabularyArrayInput` via:
//
//	VocabularyArray{ VocabularyArgs{...} }
type VocabularyArrayInput interface {
	pulumi.Input

	ToVocabularyArrayOutput() VocabularyArrayOutput
	ToVocabularyArrayOutputWithContext(context.Context) VocabularyArrayOutput
}

type VocabularyArray []VocabularyInput

func (VocabularyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vocabulary)(nil)).Elem()
}

func (i VocabularyArray) ToVocabularyArrayOutput() VocabularyArrayOutput {
	return i.ToVocabularyArrayOutputWithContext(context.Background())
}

func (i VocabularyArray) ToVocabularyArrayOutputWithContext(ctx context.Context) VocabularyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyArrayOutput)
}

// VocabularyMapInput is an input type that accepts VocabularyMap and VocabularyMapOutput values.
// You can construct a concrete instance of `VocabularyMapInput` via:
//
//	VocabularyMap{ "key": VocabularyArgs{...} }
type VocabularyMapInput interface {
	pulumi.Input

	ToVocabularyMapOutput() VocabularyMapOutput
	ToVocabularyMapOutputWithContext(context.Context) VocabularyMapOutput
}

type VocabularyMap map[string]VocabularyInput

func (VocabularyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vocabulary)(nil)).Elem()
}

func (i VocabularyMap) ToVocabularyMapOutput() VocabularyMapOutput {
	return i.ToVocabularyMapOutputWithContext(context.Background())
}

func (i VocabularyMap) ToVocabularyMapOutputWithContext(ctx context.Context) VocabularyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyMapOutput)
}

type VocabularyOutput struct{ *pulumi.OutputState }

func (VocabularyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Vocabulary)(nil)).Elem()
}

func (o VocabularyOutput) ToVocabularyOutput() VocabularyOutput {
	return o
}

func (o VocabularyOutput) ToVocabularyOutputWithContext(ctx context.Context) VocabularyOutput {
	return o
}

// ARN of the Vocabulary.
func (o VocabularyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Generated download URI.
func (o VocabularyOutput) DownloadUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringOutput { return v.DownloadUri }).(pulumi.StringOutput)
}

// The language code you selected for your vocabulary.
func (o VocabularyOutput) LanguageCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringOutput { return v.LanguageCode }).(pulumi.StringOutput)
}

// A list of terms to include in the vocabulary. Conflicts with `vocabularyFileUri`
func (o VocabularyOutput) Phrases() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringArrayOutput { return v.Phrases }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the Vocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o VocabularyOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o VocabularyOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The Amazon S3 location (URI) of the text file that contains your custom vocabulary. Conflicts wth `phrases`.
func (o VocabularyOutput) VocabularyFileUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringOutput { return v.VocabularyFileUri }).(pulumi.StringOutput)
}

// The name of the Vocabulary.
//
// The following arguments are optional:
func (o VocabularyOutput) VocabularyName() pulumi.StringOutput {
	return o.ApplyT(func(v *Vocabulary) pulumi.StringOutput { return v.VocabularyName }).(pulumi.StringOutput)
}

type VocabularyArrayOutput struct{ *pulumi.OutputState }

func (VocabularyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vocabulary)(nil)).Elem()
}

func (o VocabularyArrayOutput) ToVocabularyArrayOutput() VocabularyArrayOutput {
	return o
}

func (o VocabularyArrayOutput) ToVocabularyArrayOutputWithContext(ctx context.Context) VocabularyArrayOutput {
	return o
}

func (o VocabularyArrayOutput) Index(i pulumi.IntInput) VocabularyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vocabulary {
		return vs[0].([]*Vocabulary)[vs[1].(int)]
	}).(VocabularyOutput)
}

type VocabularyMapOutput struct{ *pulumi.OutputState }

func (VocabularyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vocabulary)(nil)).Elem()
}

func (o VocabularyMapOutput) ToVocabularyMapOutput() VocabularyMapOutput {
	return o
}

func (o VocabularyMapOutput) ToVocabularyMapOutputWithContext(ctx context.Context) VocabularyMapOutput {
	return o
}

func (o VocabularyMapOutput) MapIndex(k pulumi.StringInput) VocabularyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vocabulary {
		return vs[0].(map[string]*Vocabulary)[vs[1].(string)]
	}).(VocabularyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyInput)(nil)).Elem(), &Vocabulary{})
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyArrayInput)(nil)).Elem(), VocabularyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyMapInput)(nil)).Elem(), VocabularyMap{})
	pulumi.RegisterOutputType(VocabularyOutput{})
	pulumi.RegisterOutputType(VocabularyArrayOutput{})
	pulumi.RegisterOutputType(VocabularyMapOutput{})
}
